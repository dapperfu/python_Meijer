#!/usr/bin/env python3
"""
Extract the complete login flow sequence and all associated tokens.
"""

from pathlib import Path


def extract_complete_login_flow(log_path: Path) -> None:
    """Extract the complete login flow sequence and tokens."""
    
    print("🔍 EXTRACTING COMPLETE LOGIN FLOW...")
    print("=" * 80)
    
    try:
        with open(log_path, 'rb') as f:
            content = f.read()
        
        # Extract the refresh token from the POST request
        print("🎯 REFRESH TOKEN (from POST request):")
        print("-" * 50)
        
        # Position where refresh_token was found in POST request
        refresh_pos = content.find(b'grant_type=refresh_token')
        if refresh_pos != -1:
            context_start = max(0, refresh_pos - 100)
            context_end = min(len(content), refresh_pos + 200)
            context = content[context_start:context_end]
            
            try:
                context_str = context.decode('utf-8', errors='ignore')
                print(f"Context around refresh token POST request:")
                print(context_str)
                print()
                
                # Extract the actual refresh token
                import re
                refresh_match = re.search(r'refresh_token=([^&\s,]+)', context_str)
                if refresh_match:
                    refresh_token = refresh_match.group(1)
                    print(f"🎯 REFRESH TOKEN: {refresh_token}")
                else:
                    print("❌ Could not extract refresh token")
                    
            except Exception as e:
                print(f"Error decoding context: {e}")
        else:
            print("❌ Could not find refresh token POST request")
        
        print("\n" + "=" * 80)
        
        # Extract the authorization code flow
        print("🎯 AUTHORIZATION CODE FLOW:")
        print("-" * 50)
        
        auth_code_pos = content.find(b'grant_type=authorization_code')
        if auth_code_pos != -1:
            context_start = max(0, auth_code_pos - 100)
            context_end = min(len(content), auth_code_pos + 300)
            context = content[context_start:context_end]
            
            try:
                context_str = context.decode('utf-8', errors='ignore')
                print(f"Context around authorization code request:")
                print(context_str)
                print()
                
                # Extract the authorization code
                code_match = re.search(r'code=([^&\s,]+)', context_str)
                if code_match:
                    auth_code = code_match.group(1)
                    print(f"🎯 AUTHORIZATION CODE: {auth_code}")
                else:
                    print("❌ Could not extract authorization code")
                    
            except Exception as e:
                print(f"Error decoding context: {e}")
        else:
            print("❌ Could not find authorization code request")
        
        print("\n" + "=" * 80)
        
        # Extract the state token from login redirect
        print("🎯 STATE TOKEN (from login redirect):")
        print("-" * 50)
        
        state_token_pos = content.find(b'stateToken=')
        if state_token_pos != -1:
            context_start = max(0, state_token_pos - 100)
            context_end = min(len(content), state_token_pos + 200)
            context = content[context_start:context_end]
            
            try:
                context_str = context.decode('utf-8', errors='ignore')
                print(f"Context around state token:")
                print(context_str)
                print()
                
                # Extract the state token
                state_match = re.search(r'stateToken=([^&\s,]+)', context_str)
                if state_match:
                    state_token = state_match.group(1)
                    print(f"🎯 STATE TOKEN: {state_token}")
                else:
                    print("❌ Could not extract state token")
                    
            except Exception as e:
                print(f"Error decoding context: {e}")
        else:
            print("❌ Could not find state token")
        
        print("\n" + "=" * 80)
        
        # Extract the server side signal from _bm/get_params
        print("🎯 SERVER SIDE SIGNAL (from _bm/get_params):")
        print("-" * 50)
        
        # Look for the _bm/get_params response with serversidesignal
        bm_pos = content.find(b'_bm/get_params')
        if bm_pos != -1:
            # Look for serversidesignal in a larger context around this position
            context_start = max(0, bm_pos - 500)
            context_end = min(len(content), bm_pos + 1000)
            context = content[context_start:context_end]
            
            try:
                context_str = context.decode('utf-8', errors='ignore')
                
                # Look for serversidesignal in the context
                signal_match = re.search(r'serversidesignal["\']?\s*[:=]\s*["\']([^"\']+)["\']', context_str)
                if signal_match:
                    signal = signal_match.group(1)
                    print(f"🎯 SERVER SIDE SIGNAL: {signal}")
                else:
                    print("❌ Could not extract server side signal")
                    print("Context around _bm/get_params:")
                    print(context_str[:500])
                    
            except Exception as e:
                print(f"Error decoding context: {e}")
        else:
            print("❌ Could not find _bm/get_params")
        
        print("\n" + "=" * 80)
        
        # Summary of all tokens found
        print("📊 TOKEN SUMMARY:")
        print("-" * 50)
        
        tokens_found = {}
        
        # Refresh token
        if 'refresh_token' in locals():
            tokens_found['refresh_token'] = refresh_token
            print(f"✅ Refresh Token: {refresh_token[:50]}...")
        
        # Authorization code
        if 'auth_code' in locals():
            tokens_found['authorization_code'] = auth_code
            print(f"✅ Authorization Code: {auth_code[:50]}...")
        
        # State token
        if 'state_token' in locals():
            tokens_found['state_token'] = state_token
            print(f"✅ State Token: {state_token[:50]}...")
        
        # Server side signal
        if 'signal' in locals():
            tokens_found['serversidesignal'] = signal
            print(f"✅ Server Side Signal: {signal[:50]}...")
        
        if not tokens_found:
            print("❌ No tokens found")
        else:
            print(f"\n🎯 Total tokens found: {len(tokens_found)}")
            
    except Exception as e:
        print(f"Error during login flow extraction: {e}")


def main():
    """Main extraction function."""
    
    log_file = Path("logs/meijer_mitm_20250826_114803.log")
    
    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return
    
    # Extract the complete login flow
    extract_complete_login_flow(log_file)


if __name__ == "__main__":
    main()
