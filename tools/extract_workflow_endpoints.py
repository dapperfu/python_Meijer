#!/usr/bin/env python3
"""
Extract Workflow Endpoints from Latest Log

This tool directly uses mitmdump to extract specific workflow endpoints:
- Logout events
- Login events
- Cart operations (pickup/delivery vs shop'n'scan)
- Shop'n'scan workflow creation
- Item operations (PLU 384, eggs scanning, quantity increments)

The tool creates a temporary mitmdump script and processes the output
to identify the exact endpoints and headers used in these workflows.
"""

import json
import os
import subprocess
import sys
import tempfile
from datetime import datetime
from typing import Dict, Any


class WorkflowEndpointExtractor:
    """Extracts workflow endpoints using mitmdump."""
    
    def __init__(self, log_file_path: str):
        self.log_file_path = log_file_path
        self.results = {
            "logout_events": [],
            "login_events": [],
            "cart_operations": [],
            "shop_scan_workflows": [],
            "item_operations": [],
            "workflow_sequences": [],
            "header_patterns": {},
            "analysis_timestamp": datetime.now().isoformat()
        }
        
    def extract_endpoints(self) -> Dict[str, Any]:
        """Main extraction method."""
        print(f"🔍 Extracting workflow endpoints from: {self.log_file_path}")
        
        # Create temporary mitmdump script
        script_path = self._create_mitmdump_script()
        
        try:
            # Run mitmdump analysis
            print("📊 Running mitmdump analysis...")
            self._run_mitmdump_analysis(script_path)
            
            # Process results
            self._process_results()
            
            # Generate insights
            self._generate_insights()
            
        finally:
            # Cleanup
            if os.path.exists(script_path):
                os.unlink(script_path)
                
        return self.results
        
    def _create_mitmdump_script(self) -> str:
        """Create a temporary mitmdump script for workflow analysis."""
        script_content = '''
import json
import sys
from mitmproxy import ctx
from mitmproxy import flow
from mitmproxy.net.http import url

def request(flow):
    """Analyze each request for workflow patterns."""
    url_str = flow.request.pretty_url
    method = flow.request.method
    headers = dict(flow.request.headers)
    
    # Extract workflow information
    workflow_info = {
        "url": url_str,
        "method": method,
        "headers": headers,
        "timestamp": flow.request.timestamp_start,
        "workflow_type": None,
        "endpoint_path": flow.request.path,
        "query_params": dict(flow.request.query) if flow.request.query else {},
        "host": flow.request.pretty_host
    }
    
    # Determine workflow type based on URL patterns
    url_lower = url_str.lower()
    
    # Logout patterns
    if any(pattern in url_lower for pattern in ["logout", "signout", "end-session"]):
        workflow_info["workflow_type"] = "logout"
    # Login patterns  
    elif any(pattern in url_lower for pattern in ["login", "identify", "authorize", "introspect"]):
        workflow_info["workflow_type"] = "login"
    # Cart operations
    elif any(pattern in url_lower for pattern in ["cart", "basket", "shopping"]):
        workflow_info["workflow_type"] = "cart_operation"
    # Shop & Scan
    elif any(pattern in url_lower for pattern in ["shopandscan", "shopandscan", "shopnscan"]):
        workflow_info["workflow_type"] = "shop_scan"
    # Item operations
    elif any(pattern in url_lower for pattern in ["item", "product", "barcode", "plu"]):
        workflow_info["workflow_type"] = "item_operation"
    # Pickup/Delivery
    elif any(pattern in url_lower for pattern in ["pickup", "delivery", "fulfillment"]):
        workflow_info["workflow_type"] = "fulfillment_operation"
        
    # Output as JSON for parsing
    print(json.dumps(workflow_info))
    
def response(flow):
    """Analyze responses for additional context."""
    if hasattr(flow, 'response') and flow.response:
        response_info = {
            "url": flow.request.pretty_url,
            "status_code": flow.response.status_code,
            "content_type": flow.response.headers.get("content-type", ""),
            "response_size": len(flow.response.content) if flow.response.content else 0,
            "workflow_type": None
        }
        
        # Determine workflow type from request URL
        url_lower = flow.request.pretty_url.lower()
        if any(pattern in url_lower for pattern in ["logout", "signout"]):
            response_info["workflow_type"] = "logout"
        elif any(pattern in url_lower for pattern in ["login", "identify", "authorize"]):
            response_info["workflow_type"] = "login"
        elif any(pattern in url_lower for pattern in ["cart", "basket"]):
            response_info["workflow_type"] = "cart_operation"
        elif any(pattern in url_lower for pattern in ["shopandscan", "shopandscan"]):
            response_info["workflow_type"] = "shop_scan"
        elif any(pattern in url_lower for pattern in ["item", "product", "barcode"]):
            response_info["workflow_type"] = "item_operation"
            
        print(json.dumps(response_info))
'''
        
        # Create temporary file
        fd, script_path = tempfile.mkstemp(suffix='.py', prefix='workflow_analysis_')
        os.close(fd)
        
        with open(script_path, 'w') as f:
            f.write(script_content)
            
        return script_path
        
    def _run_mitmdump_analysis(self, script_path: str):
        """Run mitmdump with the analysis script."""
        try:
            # Run mitmdump
            cmd = [
                "mitmdump", 
                "-r", self.log_file_path,
                "-s", script_path
            ]
            
            print(f"Running: {' '.join(cmd)}")
            
            result = subprocess.run(
                cmd,
                capture_output=True,
                text=True,
                timeout=600  # 10 minutes timeout
            )
            
            if result.returncode == 0:
                print("✅ Mitmdump analysis completed successfully")
                self._parse_mitmdump_output(result.stdout)
            else:
                print(f"❌ Mitmdump analysis failed with return code: {result.returncode}")
                print(f"Error output: {result.stderr}")
                
                # Try alternative approach
                self._try_alternative_analysis()
                
        except subprocess.TimeoutExpired:
            print("⏰ Mitmdump analysis timed out")
            self._try_alternative_analysis()
        except Exception as e:
            print(f"❌ Mitmdump analysis error: {e}")
            self._try_alternative_analysis()
            
    def _parse_mitmdump_output(self, output: str):
        """Parse the output from mitmdump analysis."""
        print("📝 Parsing mitmdump output...")
        
        lines_processed = 0
        for line in output.strip().split('\n'):
            if not line.strip():
                continue
                
            try:
                data = json.loads(line)
                self._process_workflow_data(data)
                lines_processed += 1
            except json.JSONDecodeError:
                continue
                
        print(f"📊 Processed {lines_processed} lines of output")
        
    def _process_workflow_data(self, data: Dict[str, Any]):
        """Process individual workflow data from mitmdump."""
        workflow_type = data.get("workflow_type")
        if not workflow_type:
            return
            
        # Categorize based on workflow type
        if workflow_type == "logout":
            self.results["logout_events"].append(data)
        elif workflow_type == "login":
            self.results["login_events"].append(data)
        elif workflow_type == "cart_operation":
            self.results["cart_operations"].append(data)
        elif workflow_type == "shop_scan":
            self.results["shop_scan_workflows"].append(data)
        elif workflow_type == "item_operation":
            self.results["item_operations"].append(data)
            
        # Extract header patterns
        self._extract_header_patterns(data)
        
    def _extract_header_patterns(self, data: Dict[str, Any]):
        """Extract header patterns for analysis."""
        headers = data.get("headers", {})
        
        if "user-agent" in headers:
            ua = headers["user-agent"]
            if "user_agent_patterns" not in self.results["header_patterns"]:
                self.results["header_patterns"]["user_agent_patterns"] = []
            if ua not in self.results["header_patterns"]["user_agent_patterns"]:
                self.results["header_patterns"]["user_agent_patterns"].append(ua)
                
        if "content-type" in headers:
            ct = headers["content-type"]
            if "content_type_patterns" not in self.results["header_patterns"]:
                self.results["header_patterns"]["content_type_patterns"] = []
            if ct not in self.results["header_patterns"]["content_type_patterns"]:
                self.results["header_patterns"]["content_type_patterns"].append(ct)
                
        # Track common headers
        if "common_headers" not in self.results["header_patterns"]:
            self.results["header_patterns"]["common_headers"] = {}
            
        for header_name, header_value in headers.items():
            header_name_lower = header_name.lower()
            if header_name_lower not in self.results["header_patterns"]["common_headers"]:
                self.results["header_patterns"]["common_headers"][header_name_lower] = {}
            if header_value not in self.results["header_patterns"]["common_headers"][header_name_lower]:
                self.results["header_patterns"]["common_headers"][header_name_lower][header_value] = 0
            self.results["header_patterns"]["common_headers"][header_name_lower][header_value] += 1
            
    def _try_alternative_analysis(self):
        """Try alternative analysis methods when mitmdump fails."""
        print("🔄 Trying alternative analysis methods...")
        
        # For now, we'll just note that the analysis couldn't complete
        # In a real implementation, we could try other approaches
        self.results["analysis_note"] = "Mitmdump analysis failed, alternative methods not implemented"
        
    def _process_results(self):
        """Process and organize the extracted results."""
        print("🔧 Processing results...")
        
        # Identify workflow sequences
        self._identify_workflow_sequences()
        
        # Analyze patterns
        self._analyze_patterns()
        
    def _identify_workflow_sequences(self):
        """Identify complete workflow sequences."""
        # Combine all events and sort by timestamp
        all_events = []
        
        for event_type, events in self.results.items():
            if isinstance(events, list):
                for event in events:
                    if isinstance(event, dict) and "timestamp" in event:
                        all_events.append({
                            **event,
                            "event_type": event_type
                        })
                        
        # Sort by timestamp
        all_events.sort(key=lambda x: x.get("timestamp", 0))
        
        # Group into sequences (events within 5 minutes of each other)
        sequences = []
        current_sequence = []
        
        for event in all_events:
            if not current_sequence:
                current_sequence.append(event)
            else:
                time_diff = event.get("timestamp", 0) - current_sequence[-1].get("timestamp", 0)
                if time_diff < 300:  # 5 minutes
                    current_sequence.append(event)
                else:
                    if current_sequence:
                        sequences.append(current_sequence)
                    current_sequence = [event]
                    
        if current_sequence:
            sequences.append(current_sequence)
            
        self.results["workflow_sequences"] = sequences
        
    def _analyze_patterns(self):
        """Analyze patterns in the extracted data."""
        # Count endpoints by type
        endpoint_counts = {}
        for key, value in self.results.items():
            if isinstance(value, list):
                endpoint_counts[key] = len(value)
                
        self.results["endpoint_counts"] = endpoint_counts
        
        # Analyze URL patterns
        url_patterns = {}
        for key, events in self.results.items():
            if isinstance(events, list):
                url_patterns[key] = {}
                for event in events:
                    if isinstance(event, dict) and "endpoint_path" in event:
                        path = event["endpoint_path"]
                        if path not in url_patterns[key]:
                            url_patterns[key][path] = 0
                        url_patterns[key][path] += 1
                        
        self.results["url_patterns"] = url_patterns
        
    def _generate_insights(self):
        """Generate insights and recommendations."""
        print("💡 Generating insights...")
        
        insights = {
            "header_spoofing_recommendations": [],
            "endpoint_discoveries": [],
            "workflow_insights": []
        }
        
        # Header spoofing recommendations
        if self.results["header_patterns"].get("user_agent_patterns"):
            ua_patterns = self.results["header_patterns"]["user_agent_patterns"]
            insights["header_spoofing_recommendations"].append({
                "type": "user_agent",
                "description": "Use consistent User-Agent from successful requests",
                "patterns": ua_patterns,
                "priority": "high"
            })
            
        # Endpoint discoveries
        for key, events in self.results.items():
            if isinstance(events, list) and events:
                insights["endpoint_discoveries"].append({
                    "workflow_type": key,
                    "count": len(events),
                    "sample_endpoints": [e.get("endpoint_path", "") for e in events[:3]]
                })
                
        # Workflow insights
        if self.results["workflow_sequences"]:
            insights["workflow_insights"].append({
                "type": "sequence_analysis",
                "description": f"Found {len(self.results['workflow_sequences'])} workflow sequences",
                "recommendation": "Analyze sequences for timing and order patterns"
            })
            
        self.results["insights"] = insights
        
    def save_results(self, output_file: str):
        """Save the analysis results to a file."""
        with open(output_file, 'w') as f:
            json.dump(self.results, f, indent=2, default=str)
            
        print(f"💾 Results saved to: {output_file}")
        
    def print_summary(self):
        """Print a summary of the analysis results."""
        print("\n" + "="*80)
        print("WORKFLOW ENDPOINT EXTRACTION SUMMARY")
        print("="*80)
        
        print(f"\n📁 Log File: {self.log_file_path}")
        print(f"⏰ Analysis Time: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        
        # Endpoint counts
        if "endpoint_counts" in self.results:
            print("\n🔍 Endpoints Found:")
            for workflow_type, count in self.results["endpoint_counts"].items():
                print(f"  • {workflow_type}: {count} endpoints")
                
        # Header patterns
        if self.results["header_patterns"].get("user_agent_patterns"):
            print(f"\n📱 User-Agent Patterns: {len(self.results['header_patterns']['user_agent_patterns'])} found")
            
        if self.results["header_patterns"].get("content_type_patterns"):
            print(f"\n📋 Content-Type Patterns: {len(self.results['header_patterns']['content_type_patterns'])} found")
            
        # Workflow sequences
        if self.results["workflow_sequences"]:
            print(f"\n🔄 Workflow Sequences: {len(self.results['workflow_sequences'])} found")
            
        # Insights
        if "insights" in self.results:
            insights = self.results["insights"]
            print("\n💡 Key Insights:")
            for category, items in insights.items():
                if items:
                    print(f"  • {category}: {len(items)} items")
                    
        print("\n" + "="*80)


def main():
    """Main function for command-line usage."""
    import argparse
    
    parser = argparse.ArgumentParser(
        description="Extract workflow endpoints from mitmproxy logs"
    )
    parser.add_argument(
        "log_file",
        help="Path to the mitmproxy log file to analyze"
    )
    parser.add_argument(
        "-o", "--output",
        help="Output file for analysis results (JSON)",
        default="workflow_endpoints_extracted.json"
    )
    
    args = parser.parse_args()
    
    try:
        extractor = WorkflowEndpointExtractor(args.log_file)
        results = extractor.extract_endpoints()
        
        # Save results
        extractor.save_results(args.output)
        
        # Print summary
        extractor.print_summary()
        
        print(f"\n✅ Extraction complete! Results saved to: {args.output}")
        
    except Exception as e:
        print(f"❌ Extraction failed: {e}")
        import traceback
        traceback.print_exc()
        sys.exit(1)


if __name__ == "__main__":
    main()
