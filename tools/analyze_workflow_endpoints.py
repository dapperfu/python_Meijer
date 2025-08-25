#!/usr/bin/env python3
"""
Workflow Endpoint Analysis Tool

This tool analyzes the latest mitmproxy log file to extract specific workflow endpoints:
- Complete logout event
- Complete login event  
- Cart emptying operations (pickup/delivery vs shop'n'scan)
- Shop'n'scan workflow creation
- Item operations (PLU 384 doughnuts, eggs scanning, quantity increments)

The tool validates these against existing suspected endpoints and provides insights
for improving header spoofing to appear 100% like the Meijer app.
"""

import json
import logging
import os
import sys
from datetime import datetime
from pathlib import Path
from typing import Dict, Any

# Add the parent directory to the path to import meijer modules
sys.path.append(str(Path(__file__).parent.parent))


class WorkflowEndpointAnalyzer:
    """Analyzes mitmproxy logs for specific workflow endpoints."""
    
    def __init__(self, log_file_path: str):
        self.log_file_path = log_file_path
        self.logger = self._setup_logging()
        
        # Workflow patterns to search for
        self.workflow_patterns = {
            "logout": [
                r"/logout",
                r"/signout", 
                r"/auth/logout",
                r"/idp/.*logout",
                r"/oauth2/.*logout"
            ],
            "login": [
                r"/idp/idx/identify",
                r"/idp/idx/introspect",
                r"/oauth2/.*authorize",
                r"/auth/login",
                r"/signin"
            ],
            "cart_operations": [
                r"/cart/.*clear",
                r"/cart/.*empty",
                r"/cart/.*remove",
                r"/api/cart/.*",
                r"/retail/cart/.*"
            ],
            "shop_scan": [
                r"/retail/shopandscan/.*",
                r"/dgtlmma/shopandscan/.*",
                r"/loyalty/shopandscan/.*",
                r"/shopandscan/.*"
            ],
            "item_operations": [
                r"/retail/.*item.*",
                r"/loyalty/.*item.*",
                r"/api/.*item.*",
                r"/product/.*",
                r"/barcode/.*"
            ]
        }
        
        # Known endpoints from existing analysis
        self.known_endpoints = {
            "shop_scan": {
                "start_transaction": "/retail/shopandscan/api/v1/NextGenPOSBasket",
                "lookup_item": "/loyalty/shopandscan/lookupitem", 
                "add_to_cart": "/loyalty/shopandscan/addtocart",
                "get_cart": "/loyalty/shopandscan/getcart",
                "clear_cart": "/loyalty/shopandscan/clearcart"
            },
            "cart": {
                "get_cart": "/retail/cart/api/v1/Cart",
                "add_item": "/retail/cart/api/v1/Cart/AddItem",
                "remove_item": "/retail/cart/api/v1/Cart/RemoveItem",
                "clear_cart": "/retail/cart/api/v1/Cart/ClearCart"
            },
            "auth": {
                "login": "/idp/idx/identify",
                "introspect": "/idp/idx/introspect",
                "authorize": "/oauth2/default/v1/authorize"
            }
        }
        
        # Results storage
        self.workflow_endpoints = {}
        self.new_endpoints = {}
        self.header_patterns = {}
        self.workflow_sequences = []
        
    def _setup_logging(self) -> logging.Logger:
        """Setup logging configuration."""
        logging.basicConfig(
            level=logging.INFO,
            format='%(asctime)s - %(levelname)s - %(message)s'
        )
        return logging.getLogger(__name__)
        
    def analyze_workflow(self) -> Dict[str, Any]:
        """Main analysis method for the workflow."""
        self.logger.info(f"Starting workflow analysis of: {self.log_file_path}")
        
        if not os.path.exists(self.log_file_path):
            raise FileNotFoundError(f"Log file not found: {self.log_file_path}")
            
        # Use mitmdump to analyze the log file properly
        self._analyze_with_mitmdump()
        
        # Extract workflow sequences
        self._extract_workflow_sequences()
        
        # Validate against known endpoints
        self._validate_endpoints()
        
        # Analyze header patterns
        self._analyze_header_patterns()
        
        # Generate recommendations
        recommendations = self._generate_recommendations()
        
        return {
            "workflow_endpoints": self.workflow_endpoints,
            "new_endpoints": self.new_endpoints,
            "header_patterns": self.header_patterns,
            "workflow_sequences": self.workflow_sequences,
            "recommendations": recommendations,
            "analysis_timestamp": datetime.now().isoformat()
        }
        
    def _analyze_with_mitmdump(self):
        """Use mitmdump to properly analyze the mitmproxy log file."""
        self.logger.info("Using mitmdump to analyze log file...")
        
        # Create a temporary script for mitmdump analysis
        temp_script = self._create_mitmdump_script()
        
        try:
            # Run mitmdump with the analysis script
            import subprocess
            result = subprocess.run([
                "mitmdump", "-s", temp_script, self.log_file_path
            ], capture_output=True, text=True, timeout=300)
            
            if result.returncode == 0:
                self.logger.info("Mitmdump analysis completed successfully")
                # Parse the output
                self._parse_mitmdump_output(result.stdout)
            else:
                self.logger.warning(f"Mitmdump analysis failed: {result.stderr}")
                # Fallback to basic analysis
                self._fallback_analysis()
                
        except Exception as e:
            self.logger.error(f"Mitmdump analysis failed: {e}")
            self._fallback_analysis()
        finally:
            # Clean up temp script
            if os.path.exists(temp_script):
                os.unlink(temp_script)
                
    def _create_mitmdump_script(self) -> str:
        """Create a temporary mitmdump script for analysis."""
        script_content = '''
import json
import sys
from mitmproxy import ctx

def request(flow):
    """Analyze each request for workflow patterns."""
    url = flow.request.pretty_url
    method = flow.request.method
    headers = dict(flow.request.headers)
    
    # Check for workflow patterns
    workflow_info = {
        "url": url,
        "method": method,
        "headers": headers,
        "timestamp": flow.request.timestamp_start,
        "workflow_type": None
    }
    
    # Determine workflow type
    if any(pattern in url.lower() for pattern in ["logout", "signout"]):
        workflow_info["workflow_type"] = "logout"
    elif any(pattern in url.lower() for pattern in ["login", "identify", "authorize"]):
        workflow_info["workflow_type"] = "login"
    elif any(pattern in url.lower() for pattern in ["cart", "basket"]):
        workflow_info["workflow_type"] = "cart_operation"
    elif any(pattern in url.lower() for pattern in ["shopandscan", "shopandscan"]):
        workflow_info["workflow_type"] = "shop_scan"
    elif any(pattern in url.lower() for pattern in ["item", "product", "barcode"]):
        workflow_info["workflow_type"] = "item_operation"
        
    # Output as JSON for parsing
    print(json.dumps(workflow_info))
    
def response(flow):
    """Analyze responses for additional context."""
    if hasattr(flow, 'response') and flow.response:
        response_info = {
            "url": flow.request.pretty_url,
            "status_code": flow.response.status_code,
            "content_type": flow.response.headers.get("content-type", ""),
            "response_size": len(flow.response.content) if flow.response.content else 0
        }
        print(json.dumps(response_info))
'''
        
        script_path = f"/tmp/workflow_analysis_{os.getpid()}.py"
        with open(script_path, 'w') as f:
            f.write(script_content)
        return script_path
        
    def _parse_mitmdump_output(self, output: str):
        """Parse the output from mitmdump analysis."""
        self.logger.info("Parsing mitmdump output...")
        
        for line in output.strip().split('\n'):
            if not line.strip():
                continue
                
            try:
                data = json.loads(line)
                self._process_workflow_data(data)
            except json.JSONDecodeError:
                continue
                
    def _process_workflow_data(self, data: Dict[str, Any]):
        """Process individual workflow data from mitmdump."""
        workflow_type = data.get("workflow_type")
        if not workflow_type:
            return
            
        url = data.get("url", "")
        method = data.get("method", "")
        headers = data.get("headers", {})
        
        if workflow_type not in self.workflow_endpoints:
            self.workflow_endpoints[workflow_type] = []
            
        endpoint_info = {
            "url": url,
            "method": method,
            "headers": headers,
            "timestamp": data.get("timestamp")
        }
        
        self.workflow_endpoints[workflow_type].append(endpoint_info)
        
        # Check if this is a new endpoint
        self._check_new_endpoint(workflow_type, url, method)
        
    def _check_new_endpoint(self, workflow_type: str, url: str, method: str):
        """Check if this endpoint is new compared to known endpoints."""
        if workflow_type not in self.new_endpoints:
            self.new_endpoints[workflow_type] = []
            
        # Extract path from URL
        from urllib.parse import urlparse
        parsed = urlparse(url)
        path = parsed.path
        
        # Check if this path is already known
        known_paths = []
        if workflow_type in self.known_endpoints:
            known_paths = list(self.known_endpoints[workflow_type].values())
            
        if path not in known_paths:
            self.new_endpoints[workflow_type].append({
                "url": url,
                "method": method,
                "path": path,
                "workflow_type": workflow_type
            })
            
    def _fallback_analysis(self):
        """Fallback analysis when mitmdump fails."""
        self.logger.info("Using fallback analysis method...")
        
        # This would be a basic text-based analysis
        # but since we can't use plain text tools on mitmproxy logs,
        # we'll log the limitation
        self.logger.warning("Fallback analysis not implemented for mitmproxy logs")
        
    def _extract_workflow_sequences(self):
        """Extract complete workflow sequences from the analysis."""
        self.logger.info("Extracting workflow sequences...")
        
        # Group endpoints by timestamp to identify sequences
        all_endpoints = []
        for workflow_type, endpoints in self.workflow_endpoints.items():
            for endpoint in endpoints:
                all_endpoints.append({
                    **endpoint,
                    "workflow_type": workflow_type
                })
                
        # Sort by timestamp
        all_endpoints.sort(key=lambda x: x.get("timestamp", 0))
        
        # Identify sequences
        current_sequence = []
        for endpoint in all_endpoints:
            if not current_sequence:
                current_sequence.append(endpoint)
            else:
                # Check if this endpoint is part of the same sequence
                time_diff = endpoint.get("timestamp", 0) - current_sequence[-1].get("timestamp", 0)
                if time_diff < 300:  # 5 minutes threshold
                    current_sequence.append(endpoint)
                else:
                    if current_sequence:
                        self.workflow_sequences.append(current_sequence)
                    current_sequence = [endpoint]
                    
        if current_sequence:
            self.workflow_sequences.append(current_sequence)
            
    def _validate_endpoints(self):
        """Validate discovered endpoints against known endpoints."""
        self.logger.info("Validating endpoints against known patterns...")
        
        validation_results = {}
        
        for workflow_type, endpoints in self.workflow_endpoints.items():
            validation_results[workflow_type] = {
                "total_endpoints": len(endpoints),
                "known_endpoints": 0,
                "new_endpoints": 0,
                "validation_score": 0.0
            }
            
            for endpoint in endpoints:
                path = endpoint.get("url", "")
                if any(known_path in path for known_path in self.known_endpoints.get(workflow_type, {}).values()):
                    validation_results[workflow_type]["known_endpoints"] += 1
                else:
                    validation_results[workflow_type]["new_endpoints"] += 1
                    
            # Calculate validation score
            total = validation_results[workflow_type]["total_endpoints"]
            if total > 0:
                known = validation_results[workflow_type]["known_endpoints"]
                validation_results[workflow_type]["validation_score"] = known / total
                
        self.validation_results = validation_results
        
    def _analyze_header_patterns(self):
        """Analyze header patterns for header spoofing improvements."""
        self.logger.info("Analyzing header patterns...")
        
        header_analysis = {
            "common_headers": {},
            "workflow_specific_headers": {},
            "authentication_headers": {},
            "user_agent_patterns": [],
            "content_type_patterns": []
        }
        
        # Analyze headers across all workflows
        for workflow_type, endpoints in self.workflow_endpoints.items():
            for endpoint in endpoints:
                headers = endpoint.get("headers", {})
                
                # Count common headers
                for header_name, header_value in headers.items():
                    header_name_lower = header_name.lower()
                    
                    if header_name_lower not in header_analysis["common_headers"]:
                        header_analysis["common_headers"][header_name_lower] = {}
                        
                    if header_value not in header_analysis["common_headers"][header_name_lower]:
                        header_analysis["common_headers"][header_name_lower][header_value] = 0
                    header_analysis["common_headers"][header_name_lower][header_value] += 1
                    
                # Analyze User-Agent patterns
                if "user-agent" in headers:
                    ua = headers["user-agent"]
                    if ua not in header_analysis["user_agent_patterns"]:
                        header_analysis["user_agent_patterns"].append(ua)
                        
                # Analyze Content-Type patterns
                if "content-type" in headers:
                    ct = headers["content-type"]
                    if ct not in header_analysis["content_type_patterns"]:
                        header_analysis["content_type_patterns"].append(ct)
                        
        self.header_patterns = header_analysis
        
    def _generate_recommendations(self) -> Dict[str, Any]:
        """Generate recommendations for header spoofing improvements."""
        self.logger.info("Generating recommendations...")
        
        recommendations = {
            "header_spoofing": [],
            "endpoint_validation": [],
            "workflow_improvements": [],
            "security_considerations": []
        }
        
        # Header spoofing recommendations
        if self.header_patterns.get("user_agent_patterns"):
            ua_patterns = self.header_patterns["user_agent_patterns"]
            recommendations["header_spoofing"].append({
                "type": "user_agent",
                "description": "Use consistent User-Agent from successful requests",
                "patterns": ua_patterns,
                "priority": "high"
            })
            
        # Content-Type recommendations
        if self.header_patterns.get("content_type_patterns"):
            ct_patterns = self.header_patterns["content_type_patterns"]
            recommendations["header_spoofing"].append({
                "type": "content_type",
                "description": "Match Content-Type headers exactly",
                "patterns": ct_patterns,
                "priority": "medium"
            })
            
        # Endpoint validation recommendations
        for workflow_type, validation in self.validation_results.items():
            score = validation.get("validation_score", 0.0)
            if score < 0.8:
                recommendations["endpoint_validation"].append({
                    "workflow_type": workflow_type,
                    "issue": f"Low validation score: {score:.2f}",
                    "suggestion": "Investigate new endpoints and update known patterns"
                })
                
        # Workflow improvements
        if self.workflow_sequences:
            recommendations["workflow_improvements"].append({
                "type": "sequence_analysis",
                "description": "Analyze complete workflow sequences for better understanding",
                "count": len(self.workflow_sequences)
            })
            
        # Security considerations
        recommendations["security_considerations"].extend([
            {
                "type": "header_consistency",
                "description": "Maintain consistent headers across all requests in a workflow"
            },
            {
                "type": "timing_patterns",
                "description": "Respect natural timing patterns between requests"
            },
            {
                "type": "session_management",
                "description": "Properly manage session state and cookies"
            }
        ])
        
        return recommendations
        
    def save_analysis(self, output_file: str):
        """Save the analysis results to a file."""
        results = {
            "workflow_endpoints": self.workflow_endpoints,
            "new_endpoints": self.new_endpoints,
            "header_patterns": self.header_patterns,
            "workflow_sequences": self.workflow_sequences,
            "validation_results": getattr(self, 'validation_results', {}),
            "recommendations": self._generate_recommendations(),
            "analysis_timestamp": datetime.now().isoformat(),
            "log_file": self.log_file_path
        }
        
        with open(output_file, 'w') as f:
            json.dump(results, f, indent=2, default=str)
            
        self.logger.info(f"Analysis saved to: {output_file}")
        
    def print_summary(self):
        """Print a summary of the analysis results."""
        print("\n" + "="*80)
        print("WORKFLOW ENDPOINT ANALYSIS SUMMARY")
        print("="*80)
        
        print(f"\n📁 Log File: {self.log_file_path}")
        print(f"⏰ Analysis Time: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        
        # Workflow endpoints summary
        print("\n🔍 Workflow Endpoints Found:")
        for workflow_type, endpoints in self.workflow_endpoints.items():
            print(f"  • {workflow_type}: {len(endpoints)} endpoints")
            
        # New endpoints summary
        print("\n🆕 New Endpoints Discovered:")
        for workflow_type, endpoints in self.new_endpoints.items():
            if endpoints:
                print(f"  • {workflow_type}: {len(endpoints)} new endpoints")
                
        # Validation summary
        if hasattr(self, 'validation_results'):
            print("\n✅ Endpoint Validation:")
            for workflow_type, validation in self.validation_results.items():
                score = validation.get("validation_score", 0.0)
                print(f"  • {workflow_type}: {score:.1%} ({validation['known_endpoints']}/{validation['total_endpoints']})")
                
        # Header patterns summary
        if self.header_patterns.get("user_agent_patterns"):
            print(f"\n📱 User-Agent Patterns: {len(self.header_patterns['user_agent_patterns'])} found")
            
        if self.header_patterns.get("content_type_patterns"):
            print(f"\n📋 Content-Type Patterns: {len(self.header_patterns['content_type_patterns'])} found")
            
        # Recommendations summary
        recommendations = self._generate_recommendations()
        print("\n💡 Key Recommendations:")
        for category, recs in recommendations.items():
            if recs:
                print(f"  • {category}: {len(recs)} recommendations")
                
        print("\n" + "="*80)


def main():
    """Main function for command-line usage."""
    import argparse
    
    parser = argparse.ArgumentParser(
        description="Analyze mitmproxy logs for workflow endpoints"
    )
    parser.add_argument(
        "log_file",
        help="Path to the mitmproxy log file to analyze"
    )
    parser.add_argument(
        "-o", "--output",
        help="Output file for analysis results (JSON)",
        default="workflow_analysis_results.json"
    )
    parser.add_argument(
        "--verbose", "-v",
        action="store_true",
        help="Enable verbose logging"
    )
    
    args = parser.parse_args()
    
    if args.verbose:
        logging.getLogger().setLevel(logging.DEBUG)
        
    try:
        analyzer = WorkflowEndpointAnalyzer(args.log_file)
        results = analyzer.analyze_workflow()
        
        # Save results
        analyzer.save_analysis(args.output)
        
        # Print summary
        analyzer.print_summary()
        
        print(f"\n✅ Analysis complete! Results saved to: {args.output}")
        
    except Exception as e:
        print(f"❌ Analysis failed: {e}")
        sys.exit(1)


if __name__ == "__main__":
    main()
