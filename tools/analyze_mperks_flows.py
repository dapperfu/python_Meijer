#!/usr/bin/env python3
"""
Analyze mPerks flows from mitmproxy log files.

This tool specifically analyzes the mPerks-related API calls and flows that occur
after a user clicks on mPerks in the Meijer mobile app.
"""

import json
import sys
from collections import defaultdict
from pathlib import Path
from typing import Any, Dict, List, Optional
from datetime import datetime

try:
    from mitmproxy import io
    from mitmproxy.flow import Flow
    from mitmproxy.http import HTTPFlow
    print("Successfully imported mitmproxy modules")
except ImportError as e:
    print(f"Error importing mitmproxy: {e}")
    print("Please ensure mitmproxy is installed: pip install mitmproxy")
    sys.exit(1)


class MPerksFlowAnalyzer:
    """Analyze mPerks flows from mitmproxy log files."""

    def __init__(self):
        self.flows = []
        self.mperks_flows = []
        self.mperks_endpoints = defaultdict(list)
        self.flow_sequence = []
        self.auth_flows = []
        
        # Known mPerks-related endpoints
        self.mperks_keywords = [
            'mperks',
            'mPerks', 
            'loyalty',
            'rewards',
            'offers',
            'coupons',
            'points',
            'earned',
            'balance'
        ]
        
        # mPerks-specific API endpoints
        self.mperks_endpoints_patterns = [
            '/loyalty/mPerks/',
            '/api/mperks/',
            '/api/loyalty/',
            '/api/rewards/',
            '/api/offers/',
            '/api/coupons/',
            '/api/points/',
            '/api/balance/',
            '/api/earned/'
        ]

    def analyze_log_file(self, log_file_path: str) -> Dict[str, Any]:
        """Analyze a mitmproxy log file for mPerks flows."""
        print(f"🔍 Analyzing mPerks flows from: {log_file_path}")
        print("=" * 80)
        
        if not Path(log_file_path).exists():
            return {"error": f"Log file not found: {log_file_path}"}
        
        try:
            # Load flows from the log file
            self._load_flows(log_file_path)
            
            # Analyze mPerks flows
            self._analyze_mperks_flows()
            
            # Generate comprehensive report
            report = self._generate_report()
            
            return report
            
        except Exception as e:
            print(f"❌ Error analyzing log file: {e}")
            return {"error": str(e)}

    def _load_flows(self, log_file_path: str) -> None:
        """Load flows from the mitmproxy log file."""
        print("📥 Loading flows from mitmproxy log...")
        
        try:
            with open(log_file_path, 'rb') as f:
                flows_reader = io.FlowReader(f)
                
                flow_count = 0
                for flow in flows_reader.stream():
                    if isinstance(flow, HTTPFlow):
                        self.flows.append(flow)
                        flow_count += 1
                        
                        if flow_count % 1000 == 0:
                            print(f"  Loaded {flow_count} flows...")
                
                print(f"✅ Successfully loaded {len(self.flows)} flows")
                
        except Exception as e:
            print(f"❌ Error loading flows: {e}")
            raise

    def _analyze_mperks_flows(self) -> None:
        """Analyze flows for mPerks-related content."""
        print("🔍 Analyzing mPerks flows...")
        
        for i, flow in enumerate(self.flows):
            try:
                if self._is_mperks_flow(flow):
                    self.mperks_flows.append(flow)
                    self._extract_mperks_info(flow, i)
                    
            except Exception as e:
                print(f"⚠️ Error analyzing flow {i}: {e}")
                continue
        
        print(f"✅ Found {len(self.mperks_flows)} mPerks-related flows")
        
        # Sort flows by timestamp to understand the sequence
        self._sort_flows_by_sequence()

    def _is_mperks_flow(self, flow: HTTPFlow) -> bool:
        """Check if a flow is mPerks-related."""
        if not flow.request:
            return False
            
        url = flow.request.pretty_url.lower()
        path = flow.request.path.lower()
        
        # Check URL for mPerks keywords
        if any(keyword in url for keyword in self.mperks_keywords):
            return True
            
        # Check path for mPerks endpoints
        if any(pattern in path for pattern in self.mperks_endpoints_patterns):
            return True
            
        # Check request content for mPerks references
        if flow.request.content:
            try:
                content = flow.request.content.decode('utf-8', errors='ignore').lower()
                if any(keyword in content for keyword in self.mperks_keywords):
                    return True
            except:
                pass
                
        # Check response content for mPerks references
        if flow.response and flow.response.content:
            try:
                content = flow.response.content.decode('utf-8', errors='ignore').lower()
                if any(keyword in content for keyword in self.mperks_keywords):
                    return True
            except:
                pass
                
        return False

    def _extract_mperks_info(self, flow: HTTPFlow, flow_index: int) -> None:
        """Extract detailed information from mPerks flows."""
        try:
            flow_info = {
                'flow_index': flow_index,
                'timestamp': flow.request.timestamp_start if flow.request else None,
                'method': flow.request.method if flow.request else None,
                'url': flow.request.pretty_url if flow.request else None,
                'path': flow.request.path if flow.request else None,
                'host': flow.request.pretty_host if flow.request else None,
                'status_code': flow.response.status_code if flow.response else None,
                'request_headers': dict(flow.request.headers) if flow.request else {},
                'response_headers': dict(flow.response.headers) if flow.response else {},
                'request_content_preview': None,
                'response_content_preview': None,
                'flow_type': self._classify_mperks_flow(flow)
            }
            
            # Extract request content preview
            if flow.request and flow.request.content:
                try:
                    content = flow.request.content.decode('utf-8', errors='ignore')
                    flow_info['request_content_preview'] = content[:500] + '...' if len(content) > 500 else content
                except:
                    flow_info['request_content_preview'] = str(flow.request.content)[:500]
            
            # Extract response content preview
            if flow.response and flow.response.content:
                try:
                    content = flow.response.content.decode('utf-8', errors='ignore')
                    flow_info['response_content_preview'] = content[:500] + '...' if len(content) > 500 else content
                except:
                    flow_info['response_content_preview'] = str(flow.response.content)[:500]
            
            # Group by endpoint
            endpoint = flow_info['path']
            self.mperks_endpoints[endpoint].append(flow_info)
            
            # Add to sequence
            self.flow_sequence.append(flow_info)
            
        except Exception as e:
            print(f"⚠️ Error extracting mPerks info from flow {flow_index}: {e}")

    def _classify_mperks_flow(self, flow: HTTPFlow) -> str:
        """Classify the type of mPerks flow."""
        if not flow.request:
            return 'unknown'
            
        path = flow.request.path.lower()
        method = flow.request.method.upper()
        
        # Authentication flows
        if any(auth in path for auth in ['auth', 'login', 'token', 'oauth']):
            return 'authentication'
            
        # Offers and coupons
        if any(offer in path for offer in ['offers', 'coupons', 'deals']):
            return 'offers_coupons'
            
        # Points and balance
        if any(points in path for points in ['points', 'balance', 'earned']):
            return 'points_balance'
            
        # Profile and settings
        if any(profile in path for profile in ['profile', 'settings', 'preferences']):
            return 'profile_settings'
            
        # General mPerks API
        if 'mperks' in path or 'loyalty' in path:
            return 'general_mperks'
            
        return 'other'

    def _sort_flows_by_sequence(self) -> None:
        """Sort flows by timestamp to understand the sequence."""
        print("🔄 Sorting flows by sequence...")
        
        # Sort by timestamp if available
        self.flow_sequence.sort(key=lambda x: x['timestamp'] or 0)
        
        # Group flows by time proximity (within 5 seconds)
        grouped_sequences = []
        current_group = []
        
        for flow in self.flow_sequence:
            if not current_group:
                current_group = [flow]
            else:
                # Check if this flow is within 5 seconds of the last flow in current group
                last_timestamp = current_group[-1]['timestamp'] or 0
                current_timestamp = flow['timestamp'] or 0
                
                if abs(current_timestamp - last_timestamp) <= 5:
                    current_group.append(flow)
                else:
                    if current_group:
                        grouped_sequences.append(current_group)
                    current_group = [flow]
        
        if current_group:
            grouped_sequences.append(current_group)
        
        self.flow_sequence = grouped_sequences
        print(f"✅ Organized into {len(grouped_sequences)} flow sequences")

    def _generate_report(self) -> Dict[str, Any]:
        """Generate a comprehensive analysis report."""
        print("📊 Generating analysis report...")
        
        report = {
            'analysis_timestamp': datetime.now().isoformat(),
            'total_flows': len(self.flows),
            'mperks_flows': len(self.mperks_flows),
            'flow_sequences': len(self.flow_sequence),
            'endpoints_summary': {},
            'flow_types_summary': defaultdict(int),
            'sequence_analysis': [],
            'key_findings': []
        }
        
        # Analyze endpoints
        for endpoint, flows in self.mperks_endpoints.items():
            report['endpoints_summary'][endpoint] = {
                'count': len(flows),
                'methods': list(set(flow['method'] for flow in flows if flow['method'])),
                'status_codes': list(set(flow['status_code'] for flow in flows if flow['status_code'])),
                'sample_flows': flows[:3]  # First 3 flows as examples
            }
        
        # Analyze flow types
        for flow in self.mperks_flows:
            flow_type = self._classify_mperks_flow(flow)
            report['flow_types_summary'][flow_type] += 1
        
        # Analyze sequences
        for i, sequence in enumerate(self.flow_sequence):
            sequence_info = {
                'sequence_id': i + 1,
                'flow_count': len(sequence),
                'duration_seconds': 0,
                'endpoints': list(set(flow['path'] for flow in sequence)),
                'flow_types': list(set(flow['flow_type'] for flow in sequence)),
                'flows': sequence
            }
            
            # Calculate duration if timestamps are available
            if len(sequence) > 1:
                timestamps = [flow['timestamp'] for flow in sequence if flow['timestamp']]
                if len(timestamps) > 1:
                    sequence_info['duration_seconds'] = max(timestamps) - min(timestamps)
            
            report['sequence_analysis'].append(sequence_info)
        
        # Generate key findings
        report['key_findings'] = self._generate_key_findings(report)
        
        return report

    def _generate_key_findings(self, report: Dict[str, Any]) -> List[str]:
        """Generate key findings from the analysis."""
        findings = []
        
        # Most common endpoints
        if report['endpoints_summary']:
            top_endpoints = sorted(
                report['endpoints_summary'].items(),
                key=lambda x: x[1]['count'],
                reverse=True
            )[:5]
            
            findings.append(f"Top mPerks endpoints: {', '.join(f'{endpoint} ({count} calls)' for endpoint, (count, _, _, _) in top_endpoints)}")
        
        # Flow type distribution
        if report['flow_types_summary']:
            total_flows = sum(report['flow_types_summary'].values())
            type_distribution = [f"{flow_type}: {count} ({count/total_flows*100:.1f}%)" 
                               for flow_type, count in report['flow_types_summary'].items()]
            findings.append(f"Flow type distribution: {', '.join(type_distribution)}")
        
        # Sequence patterns
        if report['sequence_analysis']:
            avg_sequence_length = sum(seq['flow_count'] for seq in report['sequence_analysis']) / len(report['sequence_analysis'])
            findings.append(f"Average mPerks flow sequence length: {avg_sequence_length:.1f} flows")
            
            # Find longest sequence
            longest_sequence = max(report['sequence_analysis'], key=lambda x: x['flow_count'])
            findings.append(f"Longest mPerks flow sequence: {longest_sequence['flow_count']} flows")
        
        # Authentication patterns
        auth_flows = [flow for flow in self.mperks_flows if self._classify_mperks_flow(flow) == 'authentication']
        if auth_flows:
            findings.append(f"Authentication flows: {len(auth_flows)} flows")
        
        return findings

    def print_summary(self, report: Dict[str, Any]) -> None:
        """Print a summary of the analysis."""
        print("\n📊 MPERKS FLOW ANALYSIS SUMMARY")
        print("=" * 60)
        print(f"Total flows analyzed: {report['total_flows']}")
        print(f"mPerks-related flows: {report['mperks_flows']}")
        print(f"Flow sequences identified: {report['flow_sequences']}")
        
        print(f"\n🔑 FLOW TYPES:")
        for flow_type, count in report['flow_types_summary'].items():
            print(f"  {flow_type}: {count}")
        
        print(f"\n🌐 TOP ENDPOINTS:")
        top_endpoints = sorted(
            report['endpoints_summary'].items(),
            key=lambda x: x[1]['count'],
            reverse=True
        )[:5]
        
        for endpoint, data in top_endpoints:
            print(f"  {endpoint}: {data['count']} calls")
        
        print(f"\n💡 KEY FINDINGS:")
        for finding in report['key_findings']:
            print(f"  • {finding}")


def main():
    """Main function to analyze mPerks flows."""
    if len(sys.argv) != 2:
        print("Usage: python analyze_mperks_flows.py <log_file_path>")
        print("Example: python analyze_mperks_flows.py logs/meijer_mitm_20250822_2330.log")
        sys.exit(1)
    
    log_file_path = sys.argv[1]
    
    # Create analyzer
    analyzer = MPerksFlowAnalyzer()
    
    # Analyze the log file
    report = analyzer.analyze_log_file(log_file_path)
    
    if 'error' in report:
        print(f"❌ Analysis failed: {report['error']}")
        sys.exit(1)
    
    # Print summary
    analyzer.print_summary(report)
    
    # Save detailed report
    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    output_file = f"mperks_flow_analysis_{timestamp}.json"
    
    with open(output_file, 'w') as f:
        json.dump(report, f, indent=2, default=str)
    
    print(f"\n💾 Detailed report saved to: {output_file}")


if __name__ == "__main__":
    main()
