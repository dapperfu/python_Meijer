#!/usr/bin/env python3
"""
Comprehensive summary of the complete login flow and all tokens found.
"""

from pathlib import Path


def create_login_flow_summary(log_path: Path) -> None:
    """Create a comprehensive summary of the login flow."""
    
    print("🔍 COMPREHENSIVE LOGIN FLOW ANALYSIS")
    print("=" * 80)
    
    try:
        with open(log_path, 'rb') as f:
            content = f.read()
        
        # Extract all the tokens we found
        tokens = {}
        
        # 1. Refresh Token
        print("1️⃣ REFRESH TOKEN EXTRACTION")
        print("-" * 50)
        refresh_pos = content.find(b'grant_type=refresh_token')
        if refresh_pos != -1:
            context_start = max(0, refresh_pos - 100)
            context_end = min(len(content), refresh_pos + 200)
            context = content[context_start:context_end]
            
            try:
                context_str = context.decode('utf-8', errors='ignore')
                import re
                refresh_match = re.search(r'refresh_token=([^&\s,]+)', context_str)
                if refresh_match:
                    refresh_token = refresh_match.group(1)
                    tokens['refresh_token'] = refresh_token
                    print(f"✅ Refresh Token: {refresh_token}")
                    print(f"   Context: POST request to id.meijer.com")
                    print(f"   Usage: OAuth2 refresh token for re-authentication")
                else:
                    print("❌ Could not extract refresh token")
            except Exception as e:
                print(f"Error extracting refresh token: {e}")
        
        print("\n" + "=" * 80)
        
        # 2. Authorization Code
        print("2️⃣ AUTHORIZATION CODE EXTRACTION")
        print("-" * 50)
        auth_code_pos = content.find(b'grant_type=authorization_code')
        if auth_code_pos != -1:
            context_start = max(0, auth_code_pos - 100)
            context_end = min(len(content), auth_code_pos + 300)
            context = content[context_start:context_end]
            
            try:
                context_str = context.decode('utf-8', errors='ignore')
                code_match = re.search(r'code=([^&\s,]+)', context_str)
                if code_match:
                    auth_code = code_match.group(1)
                    tokens['authorization_code'] = auth_code
                    print(f"✅ Authorization Code: {auth_code}")
                    print(f"   Context: OAuth2 authorization code flow")
                    print(f"   Usage: Exchange for access/refresh tokens")
                else:
                    print("❌ Could not extract authorization code")
            except Exception as e:
                print(f"Error extracting authorization code: {e}")
        
        print("\n" + "=" * 80)
        
        # 3. State Token
        print("3️⃣ STATE TOKEN EXTRACTION")
        print("-" * 50)
        state_token_pos = content.find(b'stateToken=')
        if state_token_pos != -1:
            context_start = max(0, state_token_pos - 100)
            context_end = min(len(content), state_token_pos + 200)
            context = content[context_start:context_end]
            
            try:
                context_str = context.decode('utf-8', errors='ignore')
                state_match = re.search(r'stateToken=([^&\s,]+)', context_str)
                if state_match:
                    state_token = state_match.group(1)
                    tokens['state_token'] = state_token
                    print(f"✅ State Token: {state_token}")
                    print(f"   Context: Login redirect URL")
                    print(f"   Usage: CSRF protection and state management")
                else:
                    print("❌ Could not extract state token")
            except Exception as e:
                print(f"Error extracting state token: {e}")
        
        print("\n" + "=" * 80)
        
        # 4. Server Side Signal
        print("4️⃣ SERVER SIDE SIGNAL EXTRACTION")
        print("-" * 50)
        signal_positions = []
        start = 0
        while True:
            pos = content.find(b'serversidesignal', start)
            if pos == -1:
                break
            signal_positions.append(pos)
            start = pos + 1
        
        if signal_positions:
            print(f"Found {len(signal_positions)} serversidesignal occurrences")
            
            for i, pos in enumerate(signal_positions):
                context_start = max(0, pos - 200)
                context_end = min(len(content), pos + 500)
                context = content[context_start:context_end]
                
                try:
                    context_str = context.decode('utf-8', errors='ignore')
                    signal_match = re.search(r'serversidesignal["\']?\s*[:=]\s*["\']([^"\']+)["\']', context_str)
                    if signal_match:
                        signal_value = signal_match.group(1)
                        token_key = f'serversidesignal_{i+1}'
                        tokens[token_key] = signal_value
                        print(f"✅ Server Side Signal {i+1}: {signal_value[:100]}...")
                        print(f"   Context: _bm/get_params response")
                        print(f"   Usage: Bot detection and device fingerprinting")
                    else:
                        print(f"❌ Could not extract server side signal {i+1}")
                except Exception as e:
                    print(f"Error extracting server side signal {i+1}: {e}")
        else:
            print("❌ No serversidesignal found")
        
        print("\n" + "=" * 80)
        
        # 5. Login Flow Sequence
        print("5️⃣ LOGIN FLOW SEQUENCE ANALYSIS")
        print("-" * 50)
        
        flow_sequence = [
            ('Device Fingerprint', b'auth/services/devicefingerprint'),
            ('Login Token Redirect', b'login/token/redirect'),
            ('BM Params', b'_bm/get_params')
        ]
        
        flow_timeline = []
        for step_name, pattern in flow_sequence:
            if pattern in content:
                pos = content.find(pattern)
                flow_timeline.append((step_name, pos))
                print(f"✅ {step_name}: Found at position {pos}")
            else:
                print(f"❌ {step_name}: Not found")
        
        print("\n" + "=" * 80)
        
        # 6. Final Token Summary
        print("6️⃣ COMPLETE TOKEN SUMMARY")
        print("-" * 50)
        
        if tokens:
            print(f"🎯 Total tokens extracted: {len(tokens)}")
            print()
            
            for token_name, token_value in tokens.items():
                print(f"🔑 {token_name.upper().replace('_', ' ')}:")
                print(f"   Value: {token_value}")
                print()
        else:
            print("❌ No tokens found")
        
        print("=" * 80)
        
        # 7. Recommendations
        print("7️⃣ RECOMMENDATIONS FOR AUTHENTICATION")
        print("-" * 50)
        
        if 'refresh_token' in tokens:
            print("✅ REFRESH TOKEN FOUND - This is the key token for re-authentication!")
            print("   - Store this securely for future use")
            print("   - Use it to get new access tokens without re-login")
            print("   - This eliminates the need to capture login data every time")
        else:
            print("❌ REFRESH TOKEN NOT FOUND - You'll need to capture login data each time")
        
        if 'serversidesignal' in tokens or any('serversidesignal' in k for k in tokens.keys()):
            print("✅ SERVER SIDE SIGNAL FOUND - Important for bot detection bypass")
            print("   - Include this in requests to avoid detection")
            print("   - May need to be refreshed periodically")
        
        print("\n📋 NEXT STEPS:")
        print("1. Use the refresh token for automated re-authentication")
        print("2. Implement token refresh logic in your client")
        print("3. Store tokens securely (environment variables, secure storage)")
        print("4. Monitor token expiration and refresh as needed")
        
    except Exception as e:
        print(f"Error during login flow analysis: {e}")


def main():
    """Main analysis function."""
    
    log_file = Path("logs/meijer_mitm_20250826_114803.log")
    
    if not log_file.exists():
        print(f"Log file not found: {log_file}")
        return
    
    # Create comprehensive login flow summary
    create_login_flow_summary(log_file)


if __name__ == "__main__":
    main()
