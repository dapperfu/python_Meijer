#!/usr/bin/env python3
from mitmproxy import io

flows = []
with open('logs/meijer_mitm_20250825_175009.log', 'rb') as f:
    reader = io.FlowReader(f)
    for flow in reader.stream():
        if hasattr(flow, 'request') and hasattr(flow.request, 'pretty_url'):
            flows.append(flow)

api_flows = [flow for flow in flows if 'api.meijer.com' in flow.request.pretty_url and flow.request.method != 'CONNECT']
print(f'Non-CONNECT API flows: {len(api_flows)}')

for i, flow in enumerate(api_flows[:5]):
    print(f'\n{i+1}. {flow.request.method} {flow.request.pretty_url}')
    print(f'   Headers: {dict(flow.request.headers)}')
    
    # Check for authorization header specifically
    auth_header = flow.request.headers.get('authorization', 'NOT_FOUND')
    if auth_header != 'NOT_FOUND':
        print(f'   AUTHORIZATION: {auth_header[:50]}...')
    else:
        print(f'   AUTHORIZATION: NOT_FOUND')
