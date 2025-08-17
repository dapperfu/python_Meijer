#!/usr/bin/env python3
"""
Mitmproxy Flow Analyzer for Meijer API

This script demonstrates how to use mitmproxy's flow inspection capabilities
to analyze network traffic instead of parsing log files as plain text.

Usage:
    mitmdump -s mitmproxy_analyzer.py --set flow_detail=0
"""

import json
import logging
from typing import Any, Dict, List, Optional
from mitmproxy import ctx
from mitmproxy import http
from mitmproxy import flow


class MeijerFlowAnalyzer:
    """
    Analyzes Meijer API flows using mitmproxy's flow inspection capabilities.
    
    This approach is much more powerful than parsing log files as plain text
    because it gives us direct access to structured flow objects with all
    the HTTP details, headers, content, and metadata.
    """
    
    def __init__(self):
        """Initialize the analyzer."""
        self.meijer_flows: List[Dict[str, Any]] = []
        self.auth_flows: List[Dict[str, Any]] = []
        self.api_endpoints: Dict[str, List[str]] = {}
        
        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)
        
    def request(self, flow: http.HTTPFlow) -> None:
        """
        Called when a request is made.
        
        Args:
            flow: The HTTP flow object containing request details
        """
        # Check if this is a Meijer-related request
        if self._is_meijer_request(flow):
            self._analyze_meijer_request(flow)
    
    def response(self, flow: http.HTTPFlow) -> None:
        """
        Called when a response is received.
        
        Args:
            flow: The HTTP flow object containing response details
        """
        # Check if this is a Meijer-related response
        if self._is_meijer_request(flow):
            self._analyze_meijer_response(flow)
    
    def _is_meijer_request(self, flow: http.HTTPFlow) -> bool:
        """
        Check if a flow is related to Meijer services.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            True if it's a Meijer-related request
        """
        # Check various Meijer domains and patterns
        meijer_patterns = [
            "meijer.com",
            "api.meijer.com",
            "sstats.meijer.com",
            "com.meijer.mobile.meijer"
        ]
        
        host = flow.request.pretty_host
        return any(pattern in host for pattern in meijer_patterns)
    
    def _analyze_meijer_request(self, flow: http.HTTPFlow) -> None:
        """
        Analyze a Meijer request flow.
        
        Args:
            flow: The HTTP flow object
        """
        request_info = {
            "timestamp": flow.request.timestamp_start,
            "method": flow.request.method,
            "url": flow.request.pretty_url,
            "host": flow.request.pretty_host,
            "path": flow.request.path,
            "headers": dict(flow.request.headers),
            "content": flow.request.content.decode('utf-8', errors='ignore') if flow.request.content else None,
            "query_params": dict(flow.request.query),
            "flow_id": flow.id
        }
        
        # Categorize by endpoint type
        endpoint_type = self._categorize_endpoint(flow.request.path)
        if endpoint_type not in self.api_endpoints:
            self.api_endpoints[endpoint_type] = []
        self.api_endpoints[endpoint_type].append(flow.request.path)
        
        # Check for authentication-related requests
        if self._is_auth_request(flow):
            self.auth_flows.append(request_info)
            self.logger.info(f"Auth request detected: {flow.request.pretty_url}")
        
        # Store Meijer flow
        self.meijer_flows.append(request_info)
        
        self.logger.info(f"Meijer request: {flow.request.method} {flow.request.pretty_url}")
    
    def _analyze_meijer_response(self, flow: http.HTTPFlow) -> None:
        """
        Analyze a Meijer response flow.
        
        Args:
            flow: The HTTP flow object
        """
        response_info = {
            "timestamp": flow.response.timestamp_start,
            "status_code": flow.response.status_code,
            "headers": dict(flow.response.headers),
            "content": flow.response.content.decode('utf-8', errors='ignore') if flow.response.content else None,
            "flow_id": flow.id
        }
        
        # Update the corresponding request flow with response info
        for flow_info in self.meijer_flows:
            if flow_info["flow_id"] == flow.id:
                flow_info["response"] = response_info
                break
        
        self.logger.info(f"Meijer response: {flow.response.status_code} for {flow.request.pretty_url}")
    
    def _categorize_endpoint(self, path: str) -> str:
        """
        Categorize an API endpoint based on its path.
        
        Args:
            path: The request path
            
        Returns:
            Category string for the endpoint
        """
        if "/loyalty/mPerks/api/offers" in path:
            return "offers"
        elif "/digital/homecards" in path:
            return "homecards"
        elif "/loyalty/mPerks/api/cms" in path:
            return "cms"
        elif "sstats.meijer.com" in path:
            return "analytics"
        elif "dpm.demdex.net" in path:
            return "advertising"
        else:
            return "other"
    
    def _is_auth_request(self, flow: http.HTTPFlow) -> bool:
        """
        Check if a request is authentication-related.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            True if it's an authentication request
        """
        # Look for authentication-related patterns
        auth_patterns = [
            "login",
            "auth",
            "signin",
            "authenticate",
            "token",
            "session"
        ]
        
        url = flow.request.pretty_url.lower()
        path = flow.request.path.lower()
        
        return any(pattern in url or pattern in path for pattern in auth_patterns)
    
    def _extract_auth_flow(self) -> Optional[Dict[str, Any]]:
        """
        Extract the authentication flow pattern from captured flows.
        
        Returns:
            Dictionary containing authentication flow information
        """
        if not self.auth_flows:
            return None
        
        # Analyze auth flows to understand the pattern
        auth_pattern = {
            "endpoints": [],
            "headers": {},
            "payload_structure": {},
            "response_patterns": {}
        }
        
        for auth_flow in self.auth_flows:
            auth_pattern["endpoints"].append(auth_flow["url"])
            
            # Extract common headers
            for header, value in auth_flow["headers"].items():
                if header not in auth_pattern["headers"]:
                    auth_pattern["headers"][header] = []
                if value not in auth_pattern["headers"][header]:
                    auth_pattern["headers"][header].append(value)
        
        return auth_pattern
    
    def done(self) -> None:
        """
        Called when all flows are complete.
        """
        self.logger.info("Analysis complete!")
        self._generate_report()
    
    def _generate_report(self) -> None:
        """Generate a comprehensive analysis report."""
        report = {
            "total_meijer_flows": len(self.meijer_flows),
            "auth_flows": len(self.auth_flows),
            "api_endpoints": self.api_endpoints,
            "auth_pattern": self._extract_auth_flow(),
            "sample_flows": self.meijer_flows[:5]  # First 5 flows as examples
        }
        
        # Save report to file
        with open("meijer_flow_analysis.json", "w") as f:
            json.dump(report, f, indent=2, default=str)
        
        self.logger.info(f"Analysis report saved to meijer_flow_analysis.json")
        self.logger.info(f"Total Meijer flows analyzed: {len(self.meijer_flows)}")
        self.logger.info(f"Authentication flows found: {len(self.auth_flows)}")
        
        # Print summary
        print("\n=== Meijer Flow Analysis Summary ===")
        print(f"Total Meijer flows: {len(self.meijer_flows)}")
        print(f"Authentication flows: {len(self.auth_flows)}")
        print(f"API endpoint categories: {list(self.api_endpoints.keys())}")
        
        if self.auth_flows:
            print("\nAuthentication endpoints found:")
            for auth_flow in self.auth_flows:
                print(f"  - {auth_flow['method']} {auth_flow['url']}")


# Create analyzer instance
analyzer = MeijerFlowAnalyzer()

# Mitmproxy event handlers
def request(flow: http.HTTPFlow) -> None:
    """Handle request events."""
    analyzer.request(flow)

def response(flow: http.HTTPFlow) -> None:
    """Handle response events."""
    analyzer.response(flow)

def done() -> None:
    """Handle completion."""
    analyzer.done()


# Alternative approach: Direct flow file analysis
def analyze_flow_file(flow_file: str) -> Dict[str, Any]:
    """
    Analyze a mitmproxy flow file directly.
    
    This function can be used to analyze saved flow files without
    running the proxy in real-time.
    
    Args:
        flow_file: Path to the mitmproxy flow file
        
    Returns:
        Analysis results
    """
    try:
        # This would require mitmproxy's flow file reading capabilities
        # For now, this is a placeholder showing the concept
        
        print(f"Would analyze flow file: {flow_file}")
        print("This would give us direct access to structured flow objects")
        print("instead of parsing plain text logs.")
        
        return {"status": "placeholder", "file": flow_file}
        
    except Exception as e:
        print(f"Error analyzing flow file: {e}")
        return {"error": str(e)}


if __name__ == "__main__":
    # Example of how to use the analyzer
    print("Meijer Flow Analyzer")
    print("====================")
    print()
    print("To use this analyzer:")
    print("1. Save this script as mitmproxy_analyzer.py")
    print("2. Run: mitmdump -s mitmproxy_analyzer.py --set flow_detail=0")
    print("3. Configure your device to use the proxy")
    print("4. Use the Meijer app to generate traffic")
    print("5. The analyzer will automatically process all flows")
    print()
    print("Alternatively, you can analyze saved flow files:")
    print("analyze_flow_file('your_flows.mitm')") 