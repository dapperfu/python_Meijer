#!/usr/bin/env python3
"""Find 401 errors in complex promotions endpoint."""

from mitmproxy import io
from mitmproxy.http import HTTPFlow

def main():
    flows = []
    with open('../logs/meijer_mitm_20250822_2030.log', 'rb') as f:
        reader = io.FlowReader(f)
        for flow in reader.stream():
            if isinstance(flow, HTTPFlow):
                if 'complexpromos' in flow.request.path:
                    flows.append(flow)
    
    print(f"Found {len(flows)} complex promo flows")
    
    for flow in flows:
        if flow.response:
            print(f"Status: {flow.response.status_code}, URL: {flow.request.pretty_url}")
            if flow.response.status_code == 401:
                print(f"401 Error found!")
                print(f"Headers: {dict(flow.request.headers)}")
                break

if __name__ == "__main__":
    main()
