#!/usr/bin/env python3
"""
Specialized analyzer for Meijer mPerks/api/offers endpoints.

This script analyzes meijer2.log specifically for coupon-related API calls
and correlates with APK structures to build a comprehensive MeijerCoupon class.
"""

import json
import logging
from pathlib import Path
from typing import Dict, List, Any, Optional, Union
from collections import defaultdict, Counter
from dataclasses import dataclass, field
from datetime import datetime

# Import mitmproxy modules
try:
    from mitmproxy import flow
    from mitmproxy import http
    from mitmproxy.io import FlowReader
except ImportError as e:
    print(f"Error importing mitmproxy modules: {e}")
    print("Make sure you're in the virtual environment: source venv/bin/activate")
    exit(1)


@dataclass
class CouponAnalysis:
    """Analysis results for coupon-related API calls."""
    offers_endpoint_calls: List[Dict[str, Any]] = field(default_factory=list)
    clip_endpoint_calls: List[Dict[str, Any]] = field(default_factory=list)
    unclip_endpoint_calls: List[Dict[str, Any]] = field(default_factory=list)
    clipped_offers_calls: List[Dict[str, Any]] = field(default_factory=list)
    offer_structures: Dict[str, Any] = field(default_factory=dict)
    request_patterns: Dict[str, Any] = field(default_factory=dict)
    response_patterns: Dict[str, Any] = field(default_factory=dict)
    unique_offer_ids: set = field(default_factory=set)
    common_fields: Dict[str, int] = field(default_factory=lambda: defaultdict(int))
    data_types: Dict[str, str] = field(default_factory=dict)


class MeijerCouponAnalyzer:
    """
    Specialized analyzer for Meijer coupon endpoints and structures.
    
    Analyzes mPerks API calls and correlates with APK structures to understand
    the complete MeijerCoupon class requirements.
    """
    
    def __init__(self, log_file_path: str):
        self.log_file_path = Path(log_file_path)
        self.flows = []
        self.analysis = CouponAnalysis()
        
        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)
        
        # Known coupon-related endpoints
        self.coupon_endpoints = {
            '/loyalty/mPerks/api/offers': 'offers',
            '/loyalty/mPerks/api/offers/Clip': 'clip',
            '/loyalty/mPerks/api/offers/Unclip': 'unclip', 
            '/loyalty/mPerks/api/offers/ClippedOffers': 'clipped_offers',
            '/loyalty/mPerks/api/cms/specialoffers': 'special_offers'
        }
    
    def load_flows(self) -> bool:
        """Load flows from the mitmproxy log file."""
        try:
            if not self.log_file_path.exists():
                self.logger.error(f"Log file not found: {self.log_file_path}")
                return False
            
            self.logger.info(f"Loading flows from: {self.log_file_path}")
            
            with open(self.log_file_path, 'rb') as f:
                reader = FlowReader(f)
                
                flow_count = 0
                for flow_obj in reader.stream():
                    self.flows.append(flow_obj)
                    flow_count += 1
                    
                    if flow_count % 1000 == 0:
                        self.logger.info(f"Loaded {flow_count} flows...")
                
                self.logger.info(f"Successfully loaded {len(self.flows)} flows")
                return True
                
        except Exception as e:
            self.logger.error(f"Error loading flows: {e}")
            return False
    
    def analyze_coupon_flows(self) -> None:
        """Analyze flows specifically for coupon-related endpoints."""
        self.logger.info("Starting coupon flow analysis...")
        
        coupon_flow_count = 0
        
        for i, flow_obj in enumerate(self.flows):
            try:
                if not isinstance(flow_obj, http.HTTPFlow):
                    continue
                
                request = flow_obj.request
                response = flow_obj.response
                
                if not hasattr(request, 'pretty_url') or not request.pretty_url:
                    continue
                
                url_str = request.pretty_url
                
                # Check if this is a coupon-related endpoint
                endpoint_type = self._get_coupon_endpoint_type(url_str)
                if endpoint_type:
                    coupon_flow_count += 1
                    self._analyze_coupon_flow(flow_obj, endpoint_type)
                    
                if (i + 1) % 1000 == 0:
                    self.logger.info(f"Analyzed {i + 1}/{len(self.flows)} flows...")
                    
            except Exception as e:
                self.logger.error(f"Error analyzing flow {i}: {e}")
        
        self.logger.info(f"Found {coupon_flow_count} coupon-related flows")
        self._analyze_patterns()
    
    def _get_coupon_endpoint_type(self, url_str: str) -> Optional[str]:
        """Determine if URL is a coupon endpoint and return its type."""
        for endpoint_path, endpoint_type in self.coupon_endpoints.items():
            if endpoint_path in url_str:
                return endpoint_type
        return None
    
    def _analyze_coupon_flow(self, flow_obj: http.HTTPFlow, endpoint_type: str) -> None:
        """Analyze a single coupon-related flow."""
        request = flow_obj.request
        response = flow_obj.response
        
        flow_data = {
            'url': request.pretty_url,
            'method': request.method,
            'status_code': response.status_code if response else None,
            'timestamp': getattr(flow_obj, 'timestamp_start', None),
            'request_headers': dict(request.headers) if hasattr(request, 'headers') else {},
            'response_headers': dict(response.headers) if response and hasattr(response, 'headers') else {},
            'request_body': self._extract_and_parse_body(request),
            'response_body': self._extract_and_parse_body(response) if response else None,
        }
        
        # Store flow data by endpoint type
        if endpoint_type == 'offers':
            self.analysis.offers_endpoint_calls.append(flow_data)
        elif endpoint_type == 'clip':
            self.analysis.clip_endpoint_calls.append(flow_data)
        elif endpoint_type == 'unclip':
            self.analysis.unclip_endpoint_calls.append(flow_data)
        elif endpoint_type == 'clipped_offers':
            self.analysis.clipped_offers_calls.append(flow_data)
        
        # Extract offer structures from response data
        if response and flow_data['response_body']:
            self._extract_offer_structures(flow_data['response_body'], endpoint_type)
    
    def _extract_and_parse_body(self, http_obj) -> Union[Dict, List, str, None]:
        """Extract and parse HTTP body content, attempting JSON parsing."""
        try:
            if hasattr(http_obj, 'content') and http_obj.content:
                # Try to decode as text
                try:
                    text_content = http_obj.content.decode('utf-8')
                    # Try to parse as JSON
                    try:
                        return json.loads(text_content)
                    except json.JSONDecodeError:
                        # Return as text if not JSON
                        return text_content
                except UnicodeDecodeError:
                    # If it's binary, return hex representation (truncated)
                    hex_content = http_obj.content.hex()
                    return hex_content[:200] + "..." if len(hex_content) > 200 else hex_content
        except Exception:
            pass
        return None
    
    def _extract_offer_structures(self, response_data: Union[Dict, List, str], endpoint_type: str) -> None:
        """Extract and analyze offer structures from response data."""
        if not isinstance(response_data, (dict, list)):
            return
        
        # Handle different response structures
        offers = []
        
        if isinstance(response_data, dict):
            # Common patterns for offers in responses
            if 'listOfCoupons' in response_data:
                offers = response_data['listOfCoupons']
            elif 'offers' in response_data:
                offers = response_data['offers']
            elif 'data' in response_data and isinstance(response_data['data'], list):
                offers = response_data['data']
            elif 'results' in response_data and isinstance(response_data['results'], list):
                offers = response_data['results']
            else:
                # Single offer or different structure
                if 'meijerOfferId' in response_data or 'offerId' in response_data:
                    offers = [response_data]
        elif isinstance(response_data, list):
            offers = response_data
        
        # Analyze each offer
        for offer in offers:
            if isinstance(offer, dict):
                self._analyze_single_offer(offer, endpoint_type)
    
    def _analyze_single_offer(self, offer: Dict[str, Any], endpoint_type: str) -> None:
        """Analyze a single offer structure to understand fields and types."""
        # Track unique offer IDs
        offer_id = offer.get('meijerOfferId') or offer.get('offerId') or offer.get('id')
        if offer_id:
            self.analysis.unique_offer_ids.add(str(offer_id))
        
        # Analyze all fields in the offer
        for field_name, field_value in offer.items():
            # Count field frequency
            self.analysis.common_fields[field_name] += 1
            
            # Determine and store data type
            field_type = type(field_value).__name__
            if field_name not in self.analysis.data_types:
                self.analysis.data_types[field_name] = field_type
            elif self.analysis.data_types[field_name] != field_type:
                # Handle mixed types
                self.analysis.data_types[field_name] = f"Union[{self.analysis.data_types[field_name]}, {field_type}]"
        
        # Store complete offer structure example
        if endpoint_type not in self.analysis.offer_structures:
            self.analysis.offer_structures[endpoint_type] = []
        self.analysis.offer_structures[endpoint_type].append(offer)
    
    def _analyze_patterns(self) -> None:
        """Analyze patterns in requests and responses."""
        # Analyze request patterns
        all_calls = (
            self.analysis.offers_endpoint_calls +
            self.analysis.clip_endpoint_calls +
            self.analysis.unclip_endpoint_calls +
            self.analysis.clipped_offers_calls
        )
        
        request_methods = Counter()
        request_content_types = Counter()
        response_status_codes = Counter()
        response_content_types = Counter()
        
        for call in all_calls:
            request_methods[call['method']] += 1
            
            if call['request_headers']:
                content_type = call['request_headers'].get('content-type', '')
                if content_type:
                    request_content_types[content_type] += 1
            
            if call['status_code']:
                response_status_codes[call['status_code']] += 1
            
            if call['response_headers']:
                content_type = call['response_headers'].get('content-type', '')
                if content_type:
                    response_content_types[content_type] += 1
        
        self.analysis.request_patterns = {
            'methods': dict(request_methods),
            'content_types': dict(request_content_types)
        }
        
        self.analysis.response_patterns = {
            'status_codes': dict(response_status_codes),
            'content_types': dict(response_content_types)
        }
    
    def generate_coupon_class_definition(self) -> str:
        """Generate a comprehensive MeijerCoupon class definition."""
        # Get the most common fields across all offer types
        sorted_fields = sorted(
            self.analysis.common_fields.items(),
            key=lambda x: x[1],
            reverse=True
        )
        
        class_definition = '''#!/usr/bin/env python3
"""
MeijerCoupon class generated from API analysis.

This class was automatically generated by analyzing mPerks API responses
and APK structures to understand the complete coupon data model.
"""

from typing import Optional, Union, List, Dict, Any
from dataclasses import dataclass, field
from datetime import datetime
import requests
import json


@dataclass
class MeijerCoupon:
    """
    Represents a Meijer coupon/offer with all discovered fields.
    
    This class provides methods to clip() and unclip() coupons, as well as
    access to all coupon metadata discovered from API analysis.
    """
    
'''
        
        # Add field definitions based on analysis
        for field_name, frequency in sorted_fields[:30]:  # Top 30 most common fields
            field_type = self.analysis.data_types.get(field_name, 'Any')
            
            # Map common field names to more Pythonic names
            python_field_name = self._to_snake_case(field_name)
            
            # Determine if field should be optional based on frequency
            total_offers = len(self.analysis.unique_offer_ids)
            is_optional = frequency < total_offers * 0.8  # Less than 80% presence
            
            if is_optional and not field_type.startswith('Optional'):
                field_type = f'Optional[{field_type}]'
            
            default_value = ' = None' if is_optional else ''
            
            class_definition += f'    {python_field_name}: {field_type}{default_value}\n'
        
        # Add the _meijer_client field for API operations
        class_definition += '\n    # Internal fields\n'
        class_definition += '    _meijer_client: Optional[Any] = field(default=None, repr=False)\n'
        
        # Add methods
        class_definition += '''
    def clip(self, clipped: bool = True) -> bool:
        """
        Clip or unclip this coupon.
        
        Args:
            clipped: True to clip the coupon, False to unclip
            
        Returns:
            True if successful, False otherwise
        """
        if not self._meijer_client:
            raise RuntimeError("MeijerCoupon must be associated with a Meijer client to clip/unclip")
        
        try:
            if clipped:
                return self._clip()
            else:
                return self._unclip()
        except Exception:
            return False
    
    def unclip(self) -> bool:
        """
        Unclip this coupon.
        
        Returns:
            True if successful, False otherwise
        """
        return self.clip(clipped=False)
    
    def _clip(self) -> bool:
        """Internal method to clip the coupon."""
        offer_id = getattr(self, 'meijer_offer_id', None) or getattr(self, 'offer_id', None)
        if not offer_id:
            return False
        
        endpoint = "/loyalty/mPerks/api/offers/Clip"
        data = {"meijerOfferId": offer_id}
        
        response = self._meijer_client._make_request("POST", endpoint, data=data)
        return response is not None
    
    def _unclip(self) -> bool:
        """Internal method to unclip the coupon."""
        offer_id = getattr(self, 'meijer_offer_id', None) or getattr(self, 'offer_id', None)
        if not offer_id:
            return False
        
        endpoint = "/loyalty/mPerks/api/offers/Unclip"  
        data = {"meijerOfferId": offer_id}
        
        response = self._meijer_client._make_request("POST", endpoint, data=data)
        return response is not None

    @property
    def is_clipped(self) -> bool:
        """Check if this coupon is currently clipped."""
        return getattr(self, 'clipped', False) or getattr(self, 'is_clipped', False)
    
    @property
    def offer_id(self) -> Optional[str]:
        """Get the offer ID for this coupon."""
        return (getattr(self, 'meijer_offer_id', None) or 
                getattr(self, 'offer_id', None) or
                getattr(self, 'id', None))
    
    def __str__(self) -> str:
        """String representation of the coupon."""
        title = getattr(self, 'title', None) or getattr(self, 'name', None) or 'Unknown Coupon'
        status = 'Clipped' if self.is_clipped else 'Available'
        return f"MeijerCoupon({title}) - {status}"
'''
        
        return class_definition
    
    def _to_snake_case(self, camel_str: str) -> str:
        """Convert camelCase to snake_case."""
        import re
        # Insert underscore before uppercase letters (except first)
        s1 = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', camel_str)
        # Insert underscore before uppercase letters preceded by lowercase
        s2 = re.sub('([a-z0-9])([A-Z])', r'\1_\2', s1)
        return s2.lower()
    
    def generate_report(self) -> Dict[str, Any]:
        """Generate a comprehensive analysis report."""
        return {
            'summary': {
                'total_flows_analyzed': len(self.flows),
                'offers_endpoint_calls': len(self.analysis.offers_endpoint_calls),
                'clip_endpoint_calls': len(self.analysis.clip_endpoint_calls),
                'unclip_endpoint_calls': len(self.analysis.unclip_endpoint_calls),
                'clipped_offers_calls': len(self.analysis.clipped_offers_calls),
                'unique_offer_ids': len(self.analysis.unique_offer_ids),
                'unique_fields_discovered': len(self.analysis.common_fields)
            },
            'request_patterns': self.analysis.request_patterns,
            'response_patterns': self.analysis.response_patterns,
            'common_fields': dict(Counter(self.analysis.common_fields).most_common(20)),
            'field_data_types': self.analysis.data_types,
            'sample_offers': {
                endpoint: structures[:3] if len(structures) > 3 else structures  # First 3 examples
                for endpoint, structures in self.analysis.offer_structures.items()
            },
            'endpoint_analysis': {
                'offers_calls': len(self.analysis.offers_endpoint_calls),
                'clip_calls': len(self.analysis.clip_endpoint_calls),
                'unclip_calls': len(self.analysis.unclip_endpoint_calls),
                'clipped_offers_calls': len(self.analysis.clipped_offers_calls)
            }
        }
    
    def save_report(self, output_file: str = "coupon_analysis_report.json") -> None:
        """Save the analysis report to a JSON file."""
        try:
            report = self.generate_report()
            
            with open(output_file, 'w') as f:
                json.dump(report, f, indent=2, default=str)
            
            self.logger.info(f"Coupon analysis report saved to: {output_file}")
            
        except Exception as e:
            self.logger.error(f"Error saving report: {e}")
    
    def save_coupon_class(self, output_file: str = "meijer_coupon.py") -> None:
        """Save the generated MeijerCoupon class to a Python file."""
        try:
            class_definition = self.generate_coupon_class_definition()
            
            with open(output_file, 'w') as f:
                f.write(class_definition)
            
            self.logger.info(f"MeijerCoupon class saved to: {output_file}")
            
        except Exception as e:
            self.logger.error(f"Error saving coupon class: {e}")
    
    def print_summary(self) -> None:
        """Print a summary of the coupon analysis."""
        report = self.generate_report()
        summary = report['summary']
        
        print("\n" + "="*80)
        print("🎟️  MEIJER COUPON ANALYSIS SUMMARY")
        print("="*80)
        
        print(f"📊 Total Flows Analyzed: {summary['total_flows_analyzed']:,}")
        print(f"🎯 Offers Endpoint Calls: {summary['offers_endpoint_calls']:,}")
        print(f"📎 Clip Endpoint Calls: {summary['clip_endpoint_calls']:,}")
        print(f"🔓 Unclip Endpoint Calls: {summary['unclip_endpoint_calls']:,}")
        print(f"📋 Clipped Offers Calls: {summary['clipped_offers_calls']:,}")
        print(f"🆔 Unique Offer IDs: {summary['unique_offer_ids']:,}")
        print(f"🏷️  Unique Fields Discovered: {summary['unique_fields_discovered']:,}")
        
        print("\n📈 Request Patterns:")
        if report['request_patterns']:
            for pattern_type, patterns in report['request_patterns'].items():
                print(f"   {pattern_type.title()}: {patterns}")
        
        print("\n📤 Response Patterns:")
        if report['response_patterns']:
            for pattern_type, patterns in report['response_patterns'].items():
                print(f"   {pattern_type.title()}: {patterns}")
        
        print("\n🏷️  Most Common Fields:")
        for field, count in list(report['common_fields'].items())[:10]:
            field_type = report['field_data_types'].get(field, 'Unknown')
            print(f"   {field} ({field_type}): appears in {count} offers")
        
        print(f"\n📊 Endpoint Usage:")
        endpoint_analysis = report['endpoint_analysis']
        for endpoint, count in endpoint_analysis.items():
            print(f"   {endpoint.replace('_', ' ').title()}: {count}")
        
        print("\n" + "="*80)


def main():
    """Main function to analyze meijer2.log for coupon data."""
    print("🎟️  Meijer Coupon Analyzer using mitmproxy tooling")
    print("=" * 60)
    
    # Initialize analyzer with meijer2.log
    analyzer = MeijerCouponAnalyzer("meijer2.log")
    
    # Load flows
    print("📂 Loading flows from meijer2.log...")
    if not analyzer.load_flows():
        print("❌ Failed to load flows. Exiting.")
        return
    
    # Analyze coupon flows
    print("🔍 Analyzing coupon-related flows...")
    analyzer.analyze_coupon_flows()
    
    # Generate and display report
    print("📊 Generating coupon analysis report...")
    analyzer.print_summary()
    
    # Save detailed report
    print("💾 Saving detailed analysis report...")
    analyzer.save_report()
    
    # Generate and save MeijerCoupon class
    print("🏗️  Generating MeijerCoupon class...")
    analyzer.save_coupon_class()
    
    print("\n✅ Coupon analysis completed successfully!")
    print("📄 Check 'coupon_analysis_report.json' for detailed results")
    print("🐍 Check 'meijer_coupon.py' for the generated MeijerCoupon class")


if __name__ == "__main__":
    main() 