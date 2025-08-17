#!/usr/bin/env python3
"""
Meijer Authentication Handler

Silently extracts authentication tokens from mitmproxy log files
and updates the configuration in ~/.config/meijer.txt

Usage: python meijer_auth.py meijer_mitm.log
"""

import json
import sys
import os
from pathlib import Path
from datetime import datetime
from typing import Optional, Dict, Any
import logging

# Suppress all logging output
logging.getLogger().setLevel(logging.ERROR)

try:
    from mitmproxy.io import FlowReader
except ImportError:
    print("Error: mitmproxy not installed. Install with: pip install mitmproxy", file=sys.stderr)
    sys.exit(1)


def extract_tokens_from_log(log_file_path: str) -> Optional[Dict[str, Any]]:
    """
    Extract authentication tokens from mitmproxy log file.
    
    Args:
        log_file_path: Path to the mitmproxy log file
        
    Returns:
        Dictionary containing tokens and metadata, or None if not found
    """
    log_path = Path(log_file_path)
    
    if not log_path.exists():
        return None
    
    try:
        with open(log_path, "rb") as f:
            reader = FlowReader(f)
            
            for flow in reader.stream():
                # Look for token exchange responses
                if (flow.response and 
                    hasattr(flow.request, 'url') and
                    "id.meijer.com/oauth2/default/v1/token" in flow.request.url and
                    flow.response.status_code == 200 and
                    flow.response.content):
                    
                    try:
                        response_data = json.loads(flow.response.content.decode('utf-8'))
                        
                        # Check if this contains the tokens we need
                        if all(key in response_data for key in ['access_token', 'refresh_token', 'id_token']):
                            return {
                                'access_token': response_data['access_token'],
                                'refresh_token': response_data['refresh_token'],
                                'id_token': response_data['id_token'],
                                'expires_in': response_data.get('expires_in', 28800),
                                'token_type': response_data.get('token_type', 'Bearer'),
                                'scope': response_data.get('scope', ''),
                                'extracted_at': datetime.now().isoformat(),
                                'source': f'Extracted from {log_path.name}'
                            }
                    except (json.JSONDecodeError, UnicodeDecodeError):
                        continue
                        
    except Exception:
        return None
    
    return None


def extract_tokens_from_analysis_report(report_file_path: str) -> Optional[Dict[str, Any]]:
    """
    Extract authentication tokens from the analysis report JSON file.
    
    Args:
        report_file_path: Path to the analysis report JSON file
        
    Returns:
        Dictionary containing tokens and metadata, or None if not found
    """
    report_path = Path(report_file_path)
    
    if not report_path.exists():
        return None
    
    try:
        with open(report_path, 'r') as f:
            report_data = json.load(f)
        
        # Look for authentication flows with token responses
        for flow in report_data.get('authentication_flows', []):
            if (flow.get('url') == "https://id.meijer.com/oauth2/default/v1/token" and
                flow.get('status_code') == 200 and
                flow.get('response_body')):
                
                try:
                    response_data = json.loads(flow['response_body'])
                    
                    # Check if this contains the tokens we need
                    if all(key in response_data for key in ['access_token', 'refresh_token', 'id_token']):
                        return {
                            'access_token': response_data['access_token'],
                            'refresh_token': response_data['refresh_token'],
                            'id_token': response_data['id_token'],
                            'expires_in': response_data.get('expires_in', 28800),
                            'token_type': response_data.get('token_type', 'Bearer'),
                            'scope': response_data.get('scope', ''),
                            'extracted_at': datetime.now().isoformat(),
                            'source': f'Extracted from {report_path.name}'
                        }
                except (json.JSONDecodeError, KeyError):
                    continue
                    
    except Exception:
        return None
    
    return None


def update_config(tokens: Dict[str, Any]) -> bool:
    """
    Update the Meijer configuration file.
    
    Args:
        tokens: Dictionary containing authentication tokens
        
    Returns:
        True if successful, False otherwise
    """
    config_dir = Path.home() / '.config'
    config_file = config_dir / 'meijer.txt'
    
    try:
        # Ensure config directory exists
        config_dir.mkdir(exist_ok=True)
        
        # Read existing config if it exists
        existing_config = {}
        if config_file.exists():
            try:
                with open(config_file, 'r') as f:
                    existing_config = json.load(f)
            except (json.JSONDecodeError, FileNotFoundError):
                pass
        
        # Update with new tokens
        config_data = {
            **existing_config,
            **tokens,
            'updated_at': datetime.now().isoformat()
        }
        
        # Write updated config
        with open(config_file, 'w') as f:
            json.dump(config_data, f, indent=2)
        
        return True
        
    except Exception:
        return False


def main():
    """Main function - silently updates authentication config."""
    if len(sys.argv) != 2:
        sys.exit(1)
    
    log_file = sys.argv[1]
    
    # First try to extract from the log file directly
    tokens = extract_tokens_from_log(log_file)
    
    # If that fails, try to extract from the analysis report
    if not tokens:
        report_file = "meijer_analysis_report.json"
        if Path(report_file).exists():
            tokens = extract_tokens_from_analysis_report(report_file)
    
    if not tokens:
        sys.exit(1)
    
    # Update config
    if update_config(tokens):
        sys.exit(0)
    else:
        sys.exit(1)


if __name__ == "__main__":
    main() 