#!/usr/bin/env python3
"""
Extract UPC flows from mitmproxy logs

This script analyzes mitmproxy log files to extract flows related to specific UPCs
and analyze the search, cart, and shop'n'scan operations.
"""

import sys
import json
from pathlib import Path
from typing import Dict, List, Any, Optional
from mitmproxy import http
from mitmproxy import ctx
from mitmproxy.script import concurrent


class UPCFlowExtractor:
    def __init__(self, target_upcs: List[str]):
        self.target_upcs = target_upcs
        self.flows = []
        self.upc_flows = {upc: [] for upc in target_upcs}
        
    def request(self, flow: http.HTTPFlow) -> None:
        """Process incoming request."""
        # Check if request contains any target UPCs
        if flow.request.content:
            content_str = flow.request.content.decode('utf-8', errors='ignore')
            for upc in self.target_upcs:
                if upc in content_str:
                    self.upc_flows[upc].append({
                        'type': 'request',
                        'method': flow.request.method,
                        'url': flow.request.pretty_url,
                        'headers': dict(flow.request.headers),
                        'content': content_str,
                        'timestamp': flow.request.timestamp_start
                    })
        
        # Check URL for UPCs
        url = flow.request.pretty_url
        for upc in self.target_upcs:
            if upc in url:
                self.upc_flows[upc].append({
                    'type': 'request',
                    'method': flow.request.method,
                    'url': url,
                    'headers': dict(flow.request.headers),
                    'content': flow.request.content.decode('utf-8', errors='ignore') if flow.request.content else '',
                    'timestamp': flow.request.timestamp_start
                })
    
    def response(self, flow: http.HTTPFlow) -> None:
        """Process incoming response."""
        # Check if response contains any target UPCs
        if flow.response and flow.response.content:
            content_str = flow.response.content.decode('utf-8', errors='ignore')
            for upc in self.target_upcs:
                if upc in content_str:
                    self.upc_flows[upc].append({
                        'type': 'response',
                        'status_code': flow.response.status_code,
                        'url': flow.request.pretty_url,
                        'headers': dict(flow.response.headers),
                        'content': content_str,
                        'timestamp': flow.response.timestamp_start
                    })
    
    def get_results(self) -> Dict[str, List[Dict[str, Any]]]:
        """Get the extracted UPC flows."""
        return self.upc_flows


def analyze_log_file(log_file_path: str, target_upcs: List[str]) -> Dict[str, List[Dict[str, Any]]]:
    """
    Analyze a mitmproxy log file for specific UPC flows.
    
    Args:
        log_file_path: Path to the mitmproxy log file
        target_upcs: List of UPCs to search for
        
    Returns:
        Dictionary mapping UPCs to their associated flows
    """
    try:
        # Use mitmdump to process the log file
        import subprocess
        
        # Create a temporary script to extract flows
        temp_script = f"""
import sys
from mitmproxy import http
from mitmproxy.script import concurrent

target_upcs = {target_upcs}

class UPCExtractor:
    def __init__(self):
        self.flows = {{upc: [] for upc in target_upcs}}
    
    def request(self, flow: http.HTTPFlow) -> None:
        if flow.request.content:
            content_str = flow.request.content.decode('utf-8', errors='ignore')
            for upc in target_upcs:
                if upc in content_str:
                    self.flows[upc].append({{
                        'type': 'request',
                        'method': flow.request.method,
                        'url': flow.request.pretty_url,
                        'content_preview': content_str[:200] + '...' if len(content_str) > 200 else content_str,
                        'timestamp': flow.request.timestamp_start
                    }})
        
        url = flow.request.pretty_url
        for upc in target_upcs:
            if upc in url:
                self.flows[upc].append({{
                    'type': 'request',
                    'method': flow.request.method,
                    'url': url,
                    'content_preview': flow.request.content.decode('utf-8', errors='ignore')[:200] if flow.request.content else '',
                    'timestamp': flow.request.timestamp_start
                }})
    
    def response(self, flow: http.HTTPFlow) -> None:
        if flow.response and flow.response.content:
            content_str = flow.response.content.decode('utf-8', errors='ignore')
            for upc in target_upcs:
                if upc in content_str:
                    self.flows[upc].append({{
                        'type': 'response',
                        'status_code': flow.response.status_code,
                        'url': flow.request.pretty_url,
                        'content_preview': content_str[:200] + '...' if len(content_str) > 200 else content_str,
                        'timestamp': flow.response.timestamp_start
                    }})

extractor = UPCExtractor()
"""
        
        # Write temporary script
        temp_script_path = "/tmp/upc_extractor.py"
        with open(temp_script_path, 'w') as f:
            f.write(temp_script)
        
        # Run mitmdump with the temporary script
        cmd = f"venv/bin/mitmdump -q -s {temp_script_path} -- {log_file_path}"
        result = subprocess.run(cmd, shell=True, capture_output=True, text=True)
        
        # Clean up
        Path(temp_script_path).unlink(missing_ok=True)
        
        if result.returncode != 0:
            print(f"Error running mitmdump: {result.stderr}")
            return {}
        
        # Parse the output to extract flows
        # This is a simplified approach - in practice, you'd want to use the proper mitmproxy API
        
        return {}
        
    except Exception as e:
        print(f"Error analyzing log file: {e}")
        return {}


def main():
    """Main function to analyze UPC flows from log files."""
    if len(sys.argv) < 2:
        print("Usage: python extract_upc_flows.py <log_file> [upc1] [upc2] ...")
        sys.exit(1)
    
    log_file = sys.argv[1]
    target_upcs = sys.argv[2:] if len(sys.argv) > 2 else [
        "629307040245", "842595131277", "822279082910", 
        "070896523112", "713733252843", "016000275263", "046100001899"
    ]
    
    print(f"Analyzing log file: {log_file}")
    print(f"Searching for UPCs: {', '.join(target_upcs)}")
    
    # Try to use existing analysis tools first
    try:
        # Use the existing analyze_meijer3_log.py script
        import subprocess
        cmd = f"venv/bin/python tools/analyze_meijer3_log.py {log_file}"
        result = subprocess.run(cmd, shell=True, capture_output=True, text=True)
        
        if result.returncode == 0:
            output = result.stdout
            print("Found flows using existing analysis tool:")
            
            for upc in target_upcs:
                upc_flows = []
                lines = output.split('\n')
                for i, line in enumerate(lines):
                    if upc in line:
                        # Get context around the UPC
                        context_start = max(0, i-2)
                        context_end = min(len(lines), i+3)
                        context = lines[context_start:context_end]
                        upc_flows.append('\n'.join(context))
                
                if upc_flows:
                    print(f"\n=== UPC {upc} ===")
                    for flow in upc_flows[:5]:  # Show first 5 flows
                        print(flow)
                        print("-" * 50)
                else:
                    print(f"\nNo flows found for UPC {upc}")
        else:
            print(f"Error running analysis tool: {result.stderr}")
            
    except Exception as e:
        print(f"Error using existing analysis tool: {e}")
        print("Falling back to basic log analysis...")
        
        # Basic log analysis
        try:
            with open(log_file, 'rb') as f:
                content = f.read()
                content_str = content.decode('utf-8', errors='ignore')
                
                for upc in target_upcs:
                    if upc in content_str:
                        print(f"\nUPC {upc} found in log file")
                        # Find context around UPC
                        upc_index = content_str.find(upc)
                        start = max(0, upc_index - 100)
                        end = min(len(content_str), upc_index + 100)
                        context = content_str[start:end]
                        print(f"Context: {context}")
                    else:
                        print(f"\nUPC {upc} not found in log file")
                        
        except Exception as e:
            print(f"Error reading log file: {e}")


if __name__ == "__main__":
    main()
