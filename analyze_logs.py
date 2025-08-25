#!/usr/bin/env python3
"""
Log Analysis Script for Meijer API Comparison

This script analyzes mitmproxy logs to understand what the actual Meijer app
is doing versus our API implementation.
"""

import json
import logging
from pathlib import Path
from typing import Dict, List, Any
from urllib.parse import urlparse, parse_qs

# Set up logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

def analyze_log_file(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze a mitmproxy log file to extract API call information.
    
    Args:
        log_file_path: Path to the log file
        
    Returns:
        Dictionary containing analysis results
    """
    logger.info(f"Analyzing log file: {log_file_path}")
    
    try:
        from mitmproxy import io
        from mitmproxy.http import HTTPFlow
    except ImportError:
        logger.error("mitmproxy not available. Please install: pip install mitmproxy")
        return {}
    
    flows = []
    api_calls = []
    auth_calls = []
    store_calls = []
    other_calls = []
    
    try:
        with open(log_file_path, "rb") as f:
            reader = io.FlowReader(f)
            for flow in reader.stream():
                if hasattr(flow, 'request'):
                    flows.append(flow)
    except Exception as e:
        logger.error(f"Failed to load flows: {e}")
        return {}
    
    logger.info(f"Loaded {len(flows)} flows from log file")
    
    for flow in flows:
        url = flow.request.pretty_url
        method = flow.request.method
        status_code = flow.response.status_code if flow.response else None
        
        # Categorize calls
        if "api.meijer.com" in url:
            api_calls.append({
                "url": url,
                "method": method,
                "status": status_code,
                "timestamp": flow.timestamp_start
            })
        elif "id.meijer.com" in url or "auth" in url.lower():
            auth_calls.append({
                "url": url,
                "method": method,
                "status": status_code,
                "timestamp": flow.timestamp_start
            })
        elif "store" in url.lower() or "location" in url.lower():
            store_calls.append({
                "url": url,
                "method": method,
                "status": status_code,
                "timestamp": flow.timestamp_start
            })
        else:
            other_calls.append({
                "url": url,
                "method": method,
                "status": status_code,
                "timestamp": flow.timestamp_start
            })
    
    # Analyze API calls in detail
    api_analysis = analyze_api_calls(api_calls)
    
    return {
        "total_flows": len(flows),
        "api_calls": len(api_calls),
        "auth_calls": len(auth_calls),
        "store_calls": len(store_calls),
        "other_calls": len(other_calls),
        "api_analysis": api_analysis,
        "sample_api_calls": api_calls[:10],  # First 10 API calls
        "sample_auth_calls": auth_calls[:5],  # First 5 auth calls
        "sample_store_calls": store_calls[:5]  # First 5 store calls
    }

def analyze_api_calls(api_calls: List[Dict]) -> Dict[str, Any]:
    """
    Analyze API calls to understand patterns and endpoints.
    
    Args:
        api_calls: List of API call dictionaries
        
    Returns:
        Analysis results
    """
    endpoints = {}
    methods = {}
    status_codes = {}
    
    for call in api_calls:
        url = call["url"]
        method = call["method"]
        status = call["status"]
        
        # Extract endpoint
        parsed = urlparse(url)
        path = parsed.path
        
        # Count endpoints
        if path not in endpoints:
            endpoints[path] = 0
        endpoints[path] += 1
        
        # Count methods
        if method not in methods:
            methods[method] = 0
        methods[method] += 1
        
        # Count status codes
        if status not in status_codes:
            status_codes[status] = 0
        status_codes[status] += 1
    
    return {
        "endpoints": dict(sorted(endpoints.items(), key=lambda x: x[1], reverse=True)),
        "methods": methods,
        "status_codes": status_codes,
        "total_calls": len(api_calls)
    }

def main():
    """Main analysis function."""
    logs_dir = Path("logs")
    
    if not logs_dir.exists():
        logger.error("Logs directory not found")
        return
    
    # Find the most recent log file
    log_files = list(logs_dir.glob("meijer_mitm_*.log"))
    if not log_files:
        logger.error("No log files found")
        return
    
    # Sort by modification time, newest first
    log_files.sort(key=lambda x: x.stat().st_mtime, reverse=True)
    latest_log = log_files[0]
    
    logger.info(f"Analyzing latest log file: {latest_log}")
    
    # Analyze the log file
    analysis = analyze_log_file(str(latest_log))
    
    if not analysis:
        logger.error("Analysis failed")
        return
    
    # Print summary
    print("\n" + "="*80)
    print("MEIJER API LOG ANALYSIS SUMMARY")
    print("="*80)
    
    print(f"\n📊 OVERVIEW:")
    print(f"   Total flows: {analysis['total_flows']}")
    print(f"   API calls: {analysis['api_calls']}")
    print(f"   Auth calls: {analysis['auth_calls']}")
    print(f"   Store calls: {analysis['store_calls']}")
    print(f"   Other calls: {analysis['other_calls']}")
    
    if analysis['api_analysis']:
        api_analysis = analysis['api_analysis']
        print(f"\n🔍 API CALL ANALYSIS:")
        print(f"   Total API calls: {api_analysis['total_calls']}")
        
        print(f"\n📡 TOP ENDPOINTS:")
        for endpoint, count in list(api_analysis['endpoints'].items())[:10]:
            print(f"   {endpoint}: {count} calls")
        
        print(f"\n🔄 HTTP METHODS:")
        for method, count in api_analysis['methods'].items():
            print(f"   {method}: {count} calls")
        
        print(f"\n📊 STATUS CODES:")
        for status, count in api_analysis['status_codes'].items():
            print(f"   {status}: {count} calls")
    
    print(f"\n📋 SAMPLE API CALLS:")
    for i, call in enumerate(analysis['sample_api_calls'][:5], 1):
        print(f"   {i}. {call['method']} {call['url']} -> {call['status']}")
    
    print(f"\n🔐 SAMPLE AUTH CALLS:")
    for i, call in enumerate(analysis['sample_auth_calls'][:3], 1):
        print(f"   {i}. {call['method']} {call['url']} -> {call['status']}")
    
    print(f"\n🏪 SAMPLE STORE CALLS:")
    for i, call in enumerate(analysis['sample_store_calls'][:3], 1):
        print(f"   {i}. {call['method']} {call['url']} -> {call['status']}")
    
    # Save detailed analysis to file
    output_file = "log_analysis_results.json"
    with open(output_file, 'w') as f:
        json.dump(analysis, f, indent=2, default=str)
    
    print(f"\n💾 Detailed analysis saved to: {output_file}")
    print("="*80)

if __name__ == "__main__":
    main()
