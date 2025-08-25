#!/usr/bin/env python3
"""
Extract Workflow Endpoints from Latest Log (Version 2)

This tool uses the mitmproxy Python API directly to extract specific workflow endpoints:
- Complete logout events
- Complete login events  
- Cart emptying operations (pickup/delivery vs shop'n'scan)
- Shop'n'scan workflow creation
- Item operations (PLU 384 doughnuts, eggs scanning, quantity increments)

The tool analyzes the log file using DumpMaster and replay.client to properly
process the binary mitmproxy log format.
"""

import asyncio
import json
import sys
from collections import defaultdict
from datetime import datetime
from typing import Dict, Any, Optional

from mitmproxy import http, options
from mitmproxy.tools.dump import DumpMaster


class WorkflowEndpointExtractor:
    """Extracts workflow endpoints using mitmproxy Python API."""
    
    def __init__(self, log_file_path: str):
        self.log_file_path = log_file_path
        self.flows = []
        
        # Results storage
        self.results = {
            "logout_events": [],
            "login_events": [],
            "cart_operations": [],
            "shop_scan_workflows": [],
            "item_operations": [],
            "fulfillment_operations": [],
            "workflow_sequences": [],
            "header_patterns": {},
            "endpoint_patterns": defaultdict(lambda: defaultdict(int)),
            "analysis_timestamp": datetime.now().isoformat()
        }
        
        # Workflow detection patterns
        self.workflow_patterns = {
            "logout": [
                "logout", "signout", "end-session", "sign-out", "log-out"
            ],
            "login": [
                "login", "identify", "authorize", "introspect", "signin", "authenticate"
            ],
            "cart_operation": [
                "cart", "basket", "shopping", "clear", "empty", "remove"
            ],
            "shop_scan": [
                "shopandscan", "shopandscan", "shopnscan", "shop_scan", "shop-scan"
            ],
            "item_operation": [
                "item", "product", "barcode", "plu", "upc", "scan"
            ],
            "fulfillment": [
                "pickup", "delivery", "fulfillment", "order", "reservation"
            ]
        }
        
    def request(self, flow: http.HTTPFlow) -> None:
        """Process each request flow."""
        self.flows.append(flow)
        self._analyze_workflow(flow)
        
    def response(self, flow: http.HTTPFlow) -> None:
        """Process each response flow."""
        # Update the flow with response data
        self._analyze_response(flow)
        
    def _analyze_workflow(self, flow: http.HTTPFlow):
        """Analyze a request flow for workflow patterns."""
        url = flow.request.pretty_url.lower()
        method = flow.request.method
        headers = dict(flow.request.headers)
        path = flow.request.path
        
        # Determine workflow type
        workflow_type = self._determine_workflow_type(url, path, headers)
        
        if workflow_type:
            # Extract workflow information
            workflow_info = {
                "url": flow.request.pretty_url,
                "method": method,
                "path": path,
                "headers": headers,
                "query_params": dict(flow.request.query) if flow.request.query else {},
                "host": flow.request.pretty_host,
                "timestamp": flow.request.timestamp_start,
                "workflow_type": workflow_type,
                "request_content": self._safe_decode_content(flow.request.content),
                "response_status": None,
                "response_headers": {},
                "response_content": ""
            }
            
            # Store in appropriate category
            if workflow_type == "logout":
                self.results["logout_events"].append(workflow_info)
            elif workflow_type == "login":
                self.results["login_events"].append(workflow_info)
            elif workflow_type == "cart_operation":
                self.results["cart_operations"].append(workflow_info)
            elif workflow_type == "shop_scan":
                self.results["shop_scan_workflows"].append(workflow_info)
            elif workflow_type == "item_operation":
                self.results["item_operations"].append(workflow_info)
            elif workflow_type == "fulfillment":
                self.results["fulfillment_operations"].append(workflow_info)
                
            # Extract header patterns
            self._extract_header_patterns(workflow_info)
            
            # Extract endpoint patterns
            self._extract_endpoint_patterns(workflow_info)
            
    def _analyze_response(self, flow: http.HTTPFlow):
        """Analyze response data for existing workflow entries."""
        # Find matching request in our results
        for category in self.results.values():
            if isinstance(category, list):
                for item in category:
                    if (item.get("url") == flow.request.pretty_url and 
                        item.get("method") == flow.request.method):
                        # Update with response data
                        item["response_status"] = flow.response.status_code if flow.response else None
                        item["response_headers"] = dict(flow.response.headers) if flow.response else {}
                        item["response_content"] = self._safe_decode_content(flow.response.content) if flow.response else ""
                        break
                        
    def _determine_workflow_type(self, url: str, path: str, headers: Dict[str, str]) -> Optional[str]:
        """Determine the workflow type based on URL, path, and headers."""
        # Check URL patterns
        for workflow_type, patterns in self.workflow_patterns.items():
            if any(pattern in url for pattern in patterns):
                return workflow_type
                
        # Check path patterns
        for workflow_type, patterns in self.workflow_patterns.items():
            if any(pattern in path.lower() for pattern in patterns):
                return workflow_type
                
        # Check for specific Meijer patterns
        if "meijer.com" in url or "meijer" in url.lower():
            # Look for specific endpoint patterns
            if any(pattern in path.lower() for pattern in ["/api/", "/retail/", "/loyalty/"]):
                if "shopandscan" in path.lower():
                    return "shop_scan"
                elif "cart" in path.lower():
                    return "cart_operation"
                elif "item" in path.lower() or "product" in path.lower():
                    return "item_operation"
                    
        return None
        
    def _safe_decode_content(self, content: bytes) -> str:
        """Safely decode content bytes to string."""
        if not content:
            return ""
        try:
            return content.decode("utf-8", errors="ignore")
        except:
            try:
                return content.decode("latin-1", errors="ignore")
            except:
                return str(content)[:1000]  # Truncate if can't decode
                
    def _extract_header_patterns(self, workflow_info: Dict[str, Any]):
        """Extract header patterns for analysis."""
        headers = workflow_info.get("headers", {})
        
        if "common_headers" not in self.results["header_patterns"]:
            self.results["header_patterns"]["common_headers"] = defaultdict(lambda: defaultdict(int))
            
        if "user_agent_patterns" not in self.results["header_patterns"]:
            self.results["header_patterns"]["user_agent_patterns"] = []
            
        if "content_type_patterns" not in self.results["header_patterns"]:
            self.results["header_patterns"]["content_type_patterns"] = []
            
        # Track common headers
        for header_name, header_value in headers.items():
            header_name_lower = header_name.lower()
            self.results["header_patterns"]["common_headers"][header_name_lower][header_value] += 1
            
        # Track User-Agent patterns
        if "user-agent" in headers:
            ua = headers["user-agent"]
            if ua not in self.results["header_patterns"]["user_agent_patterns"]:
                self.results["header_patterns"]["user_agent_patterns"].append(ua)
                
        # Track Content-Type patterns
        if "content-type" in headers:
            ct = headers["content-type"]
            if ct not in self.results["header_patterns"]["content_type_patterns"]:
                self.results["header_patterns"]["content_type_patterns"].append(ct)
                
    def _extract_endpoint_patterns(self, workflow_info: Dict[str, Any]):
        """Extract endpoint patterns for analysis."""
        path = workflow_info.get("path", "")
        workflow_type = workflow_info.get("workflow_type", "")
        
        if "endpoint_patterns" not in self.results:
            self.results["endpoint_patterns"] = defaultdict(lambda: defaultdict(int))
            
        if path and workflow_type:
            self.results["endpoint_patterns"][workflow_type][path] += 1
            
    def done(self):
        """Called when all flows have been processed."""
        self._process_results()
        self._generate_insights()
        self._print_summary()
        
    def _process_results(self):
        """Process and organize the extracted results."""
        print("🔧 Processing results...")
        
        # Identify workflow sequences
        self._identify_workflow_sequences()
        
        # Convert defaultdict to regular dict for JSON serialization
        self._convert_defaultdicts()
        
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
        
    def _convert_defaultdicts(self):
        """Convert defaultdict objects to regular dicts for JSON serialization."""
        # Convert header patterns
        if "header_patterns" in self.results:
            header_patterns = self.results["header_patterns"]
            if "common_headers" in header_patterns:
                header_patterns["common_headers"] = dict(header_patterns["common_headers"])
                
        # Convert endpoint patterns
        if "endpoint_patterns" in self.results:
            endpoint_patterns = self.results["endpoint_patterns"]
            self.results["endpoint_patterns"] = dict(endpoint_patterns)
            
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
                    "sample_endpoints": [e.get("path", "") for e in events[:3] if isinstance(e, dict)]
                })
                
        # Workflow insights
        if self.results["workflow_sequences"]:
            insights["workflow_insights"].append({
                "type": "sequence_analysis",
                "description": f"Found {len(self.results['workflow_sequences'])} workflow sequences",
                "recommendation": "Analyze sequences for timing and order patterns"
            })
            
        self.results["insights"] = insights
        
    def _print_summary(self):
        """Print a summary of the analysis results."""
        print("\n" + "="*80)
        print("WORKFLOW ENDPOINT EXTRACTION SUMMARY")
        print("="*80)
        
        print(f"\n📁 Log File: {self.log_file_path}")
        print(f"⏰ Analysis Time: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        print(f"📊 Total Flows Processed: {len(self.flows)}")
        
        # Endpoint counts
        print("\n🔍 Endpoints Found:")
        for key, value in self.results.items():
            if isinstance(value, list):
                print(f"  • {key}: {len(value)} endpoints")
                
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
        
    def save_results(self, output_file: str):
        """Save the analysis results to a file."""
        with open(output_file, 'w') as f:
            json.dump(self.results, f, indent=2, default=str)
            
        print(f"💾 Results saved to: {output_file}")


async def main():
    """Main function to run the workflow endpoint extractor."""
    import argparse
    
    parser = argparse.ArgumentParser(
        description="Extract workflow endpoints from mitmproxy logs using Python API"
    )
    parser.add_argument(
        "log_file",
        help="Path to the mitmproxy log file to analyze"
    )
    parser.add_argument(
        "-o", "--output",
        help="Output file for analysis results (JSON)",
        default="workflow_endpoints_v2.json"
    )
    
    args = parser.parse_args()
    
    try:
        # Create options
        opts = options.Options()
        opts.add_option("body_size_limit", int, 0, "")
        
        # Create the master
        master = DumpMaster(opts)
        
        # Add our addon
        extractor = WorkflowEndpointExtractor(args.log_file)
        master.addons.add(extractor)
        
        print(f"🔍 Extracting workflow endpoints from: {args.log_file}")
        
        # Load flows from file using the correct approach
        try:
            # Try the replay.client approach
            master.commands.call("replay.client", [args.log_file])
        except Exception as e:
            print(f"Warning: replay.client failed: {e}")
            # Try alternative approach using load_flows
            try:
                from mitmproxy import io
                flows = io.read_flows_from_paths([args.log_file])
                for flow in flows:
                    # Manually call our addon methods
                    extractor.request(flow)
                    if flow.response:
                        extractor.response(flow)
            except Exception as e2:
                print(f"Alternative approach also failed: {e2}")
                raise Exception(f"Could not load flows from {args.log_file}")
        
        # Process all flows
        extractor.done()
        
        # Save results
        extractor.save_results(args.output)
        
        print(f"\n✅ Extraction complete! Results saved to: {args.output}")
        
    except Exception as e:
        print(f"❌ Extraction failed: {e}")
        import traceback
        traceback.print_exc()
        sys.exit(1)


if __name__ == "__main__":
    asyncio.run(main())
