#!/usr/bin/env python3
"""
Streamlined Selenium Authentication for Meijer API

This script performs a fast, minimal-delay authentication flow:
1. Load page and wait for render
2. Enter email and click Next
3. Analyze for errors
4. If password page, enter password and click Next
5. If 2FA email offered, select and continue
6. Check IMAP email for code
7. Insert code
8. Capture all headers and cookies for CLI app

No 50-second delays - just wait for page rendering.
"""

import sys
import os
import time
import json
import imaplib
import email
from typing import Dict, Any, Optional
from urllib.parse import urlparse

# Add the current directory to Python path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

def read_credentials() -> tuple[str, str]:
    """Read credentials from login.txt file."""
    login_file = "/keg/cursor/.config/meijer/login.txt"
    
    try:
        with open(login_file, 'r') as f:
            lines = f.readlines()
            if len(lines) >= 2:
                username = lines[0].strip()
                password = lines[1].strip()
                return username, password
            else:
                raise ValueError("login.txt must contain username and password on separate lines")
    except Exception as e:
        print(f"❌ Error reading {login_file}: {e}")
        sys.exit(1)

def read_email_config() -> Dict[str, Any]:
    """Read email configuration for IMAP access."""
    email_config_file = "/keg/cursor/.config/meijer/email_config.json"
    
    try:
        with open(email_config_file, 'r') as f:
            return json.load(f)
    except Exception as e:
        print(f"❌ Error reading email config: {e}")
        sys.exit(1)

def get_verification_code(timeout: int = 300) -> Optional[str]:
    """Poll email for verification code."""
    try:
        print("📧 Polling email for verification code...")
        
        email_config = read_email_config()
        print(f"📧 Connecting to IMAP server: {email_config['server']}:{email_config['port']}")
        
        # Connect to IMAP server
        if email_config['use_ssl']:
            mail = imaplib.IMAP4_SSL(email_config['server'], email_config['port'])
        else:
            mail = imaplib.IMAP4(email_config['server'], email_config['port'])
        
        # Login
        mail.login(email_config['username'], email_config['password'])
        print("✅ IMAP login successful")
        
        # Select inbox
        mail.select('INBOX')
        
        # Search for recent emails with verification codes
        start_time = time.time()
        while time.time() - start_time < timeout:
            try:
                # Search for recent emails
                _, message_numbers = mail.search(None, 'UNSEEN')
                
                if message_numbers[0]:
                    for num in message_numbers[0].split():
                        try:
                            _, msg_data = mail.fetch(num, '(RFC822)')
                            email_body = msg_data[0][1]
                            email_message = email.message_from_bytes(email_body)
                            
                            # Check if this is a verification email
                            subject = email_message.get('Subject', '')
                            if any(keyword in subject.lower() for keyword in ['verification', 'code', 'meijer', 'login']):
                                print(f"📧 Found verification email: {subject}")
                                
                                # Extract verification code from email body
                                if email_message.is_multipart():
                                    for part in email_message.walk():
                                        if part.get_content_type() == "text/plain":
                                            body = part.get_payload(decode=True).decode()
                                            break
                                else:
                                    body = email_message.get_payload(decode=True).decode()
                                
                                # Look for 6-digit code
                                import re
                                code_match = re.search(r'\b\d{6}\b', body)
                                if code_match:
                                    code = code_match.group()
                                    print(f"✅ Verification code found: {code}")
                                    return code
                                
                        except Exception as e:
                            print(f"⚠️ Error processing email: {e}")
                            continue
                
                print("⏳ No verification code yet, waiting 5 seconds...")
                time.sleep(5)
                
            except Exception as e:
                print(f"⚠️ Error searching emails: {e}")
                time.sleep(5)
        
        print("❌ No verification code found within timeout")
        return None
        
    except Exception as e:
        print(f"❌ Error polling email: {e}")
        return None

def capture_auth_data(driver) -> Dict[str, Any]:
    """Capture all authentication data including headers, cookies, and session info."""
    try:
        print("📊 Capturing authentication data...")
        
        # Get all cookies
        cookies = driver.get_cookies()
        cookie_dict = {cookie['name']: cookie['value'] for cookie in cookies}
        
        # Get current URL and page info
        current_url = driver.current_url
        page_title = driver.title
        
        # Get page source for analysis
        page_source = driver.page_source
        
        # Create authentication data structure
        auth_data = {
            'timestamp': time.time(),
            'url': current_url,
            'title': page_title,
            'cookies': cookie_dict,
            'raw_cookies': cookies,
            'page_source_length': len(page_source),
            'user_agent': driver.execute_script("return navigator.userAgent"),
            'session_storage': driver.execute_script("return Object.keys(sessionStorage)"),
            'local_storage': driver.execute_script("return Object.keys(localStorage)")
        }
        
        # Try to extract any tokens from the page
        try:
            # Look for authorization codes in URL
            if 'code=' in current_url:
                code_start = current_url.find('code=') + 5
                code_end = current_url.find('&', code_start)
                if code_end == -1:
                    code_end = len(current_url)
                auth_code = current_url[code_start:code_end]
                auth_data['authorization_code'] = auth_code
                print(f"✅ Authorization code captured: {auth_code[:30]}...")
            
            # Look for state parameters
            if 'state=' in current_url:
                state_start = current_url.find('state=') + 6
                state_end = current_url.find('&', state_start)
                if state_end == -1:
                    state_end = len(current_url)
                state_param = current_url[state_start:state_end]
                auth_data['state'] = state_param
                print(f"✅ State parameter captured: {state_param[:30]}...")
                
        except Exception as e:
            print(f"⚠️ Error extracting tokens: {e}")
        
        print(f"✅ Authentication data captured:")
        print(f"   Cookies: {len(cookie_dict)}")
        print(f"   URL: {current_url}")
        print(f"   Title: {page_title}")
        
        return auth_data
        
    except Exception as e:
        print(f"❌ Error capturing authentication data: {e}")
        return {}

def save_auth_data(auth_data: Dict[str, Any], filename: str = "meijer_auth_data.json"):
    """Save authentication data to file."""
    try:
        with open(filename, 'w') as f:
            json.dump(auth_data, f, indent=2)
        print(f"✅ Authentication data saved to {filename}")
    except Exception as e:
        print(f"❌ Error saving authentication data: {e}")

def main():
    """Main authentication flow."""
    try:
        from selenium import webdriver
        from selenium.webdriver.chrome.options import Options as ChromeOptions
        from selenium.webdriver.common.by import By
        from selenium.webdriver.support.ui import WebDriverWait
        from selenium.webdriver.support import expected_conditions as EC
        from webdriver_manager.chrome import ChromeDriverManager
        from selenium.webdriver.chrome.service import Service
        from selenium.common.exceptions import TimeoutException # Added for modal timeout
        print("✅ Selenium and webdriver-manager imported successfully")
        
    except ImportError as e:
        print(f"❌ Required packages not available: {e}")
        print("Install with: pip install selenium webdriver-manager")
        sys.exit(1)
    
    # Read credentials
    username, password = read_credentials()
    print(f"🔐 Using credentials:")
    print(f"   Username: {username}")
    print(f"   Password: {'*' * len(password)}")
    print()
    
    # Initialize browser using webdriver-manager (automatically handles driver compatibility)
    print("🌐 Initializing browser with webdriver-manager...")
    options = ChromeOptions()
    options.add_argument("--no-sandbox")
    options.add_argument("--disable-dev-shm-usage")
    options.add_argument("--disable-blink-features=AutomationControlled")
    options.add_experimental_option("excludeSwitches", ["enable-automation"])
    options.add_experimental_option("useAutomationExtension", False)
    # options.add_argument("--headless")  # Run headless for automation - REMOVED for development
    
    # Add window sizing for development visibility
    options.add_argument("--window-size=1200,800")
    options.add_argument("--start-maximized")
    
    # Use webdriver-manager to automatically download and manage the right ChromeDriver
    try:
        service = Service(ChromeDriverManager().install())
        driver = webdriver.Chrome(service=service, options=options)
        print("✅ Chrome browser initialized with webdriver-manager")
    except Exception as e:
        print(f"❌ Failed to initialize Chrome: {e}")
        print("🔄 Trying Firefox as fallback...")
        
        try:
            from webdriver_manager.firefox import GeckoDriverManager
            from selenium.webdriver.firefox.options import Options as FirefoxOptions
            from selenium.webdriver.firefox.service import Service as FirefoxService
            
            firefox_options = FirefoxOptions()
            # firefox_options.add_argument("--headless")  # REMOVED for development
            firefox_options.add_argument("--width=1200")
            firefox_options.add_argument("--height=800")
            firefox_service = FirefoxService(GeckoDriverManager().install())
            driver = webdriver.Firefox(service=firefox_service, options=firefox_options)
            print("✅ Firefox browser initialized with webdriver-manager")
        except Exception as firefox_error:
            print(f"❌ Failed to initialize Firefox: {firefox_error}")
            print("❌ No compatible browser available")
            sys.exit(1)
    
    # Remove automation indicators
    driver.execute_script("Object.defineProperty(navigator, 'webdriver', {get: () => undefined})")
    
    try:
        # Step 1: Load Meijer homepage and wait for render
        print("📡 Step 1: Loading Meijer homepage...")
        
        # Start from the main Meijer homepage (this is the working flow)
        homepage_url = "https://www.meijer.com/index.html"
        
        print(f"🔐 Starting from Meijer homepage:")
        print(f"   URL: {homepage_url}")
        print(f"   Note: Following the exact working login flow")
        
        driver.get(homepage_url)
        
        # Wait for page to be fully rendered
        wait = WebDriverWait(driver, 15)
        wait.until(lambda driver: driver.execute_script("return document.readyState") == "complete")
        print("✅ Meijer homepage loaded and rendered")
        
        # Take screenshot
        driver.save_screenshot("debug_homepage_loaded.png")
        print("📸 Screenshot saved: debug_homepage_loaded.png")
        
        # Step 2: Find and click the Account Sign In button
        print("📡 Step 2: Looking for Account Sign In button...")
        
        # Look for the specific button with the SVG icon and "Sign In" text
        signin_button_selectors = [
            "button.meijer-header__account-signin-button",
            "button[class*='meijer-header__account-signin-button']",
            "button:has(.signin)",
            "button:has(.ads-icon)"
        ]
        
        signin_button = None
        for selector in signin_button_selectors:
            try:
                signin_button = driver.find_element(By.CSS_SELECTOR, selector)
                print(f"✅ Sign In button found with selector: {selector}")
                break
            except:
                continue
        
        if not signin_button:
            # Fallback: look for any button with "Sign In" text
            try:
                signin_button = driver.find_element(By.XPATH, "//button[contains(text(), 'Sign In')]")
                print("✅ Sign In button found with text search")
            except:
                print("❌ Sign In button not found")
                return False
        
        print("🔍 Sign In button details:")
        print(f"   Text: '{signin_button.text}'")
        print(f"   Class: '{signin_button.get_attribute('class')}'")
        print(f"   Type: '{signin_button.get_attribute('type')}'")
        
        # Click the Sign In button to open the modal
        print("🔄 Clicking Sign In button to open modal...")
        signin_button.click()
        
        # Wait for modal to appear
        print("⏳ Waiting for signin modal to appear...")
        try:
            # Look for the modal with the Sign In button
            modal_signin_button = wait.until(EC.element_to_be_clickable((
                By.CSS_SELECTOR, 
                "button[data-testid='ads-button'][type='submit']"
            )))
            print("✅ Modal Sign In button found and ready")
        except TimeoutException:
            print("⚠️ Modal Sign In button not found, checking for alternatives...")
            # Try other selectors for the modal button
            try:
                modal_signin_button = driver.find_element(By.XPATH, "//button[contains(text(), 'Sign In') and @type='submit']")
                print("✅ Modal Sign In button found with alternative search")
            except:
                print("❌ Modal Sign In button not found")
                return False
        
        # Click the modal Sign In button to start authentication
        print("🔄 Clicking modal Sign In button to start authentication...")
        modal_signin_button.click()
        
        # Wait for redirect to id.meijer.com
        print("⏳ Waiting for redirect to id.meijer.com...")
        try:
            wait.until(lambda driver: "id.meijer.com" in driver.current_url)
            print("✅ Successfully redirected to id.meijer.com")
        except TimeoutException:
            print("⚠️ Redirect timeout, checking current URL...")
            current_url = driver.current_url
            if "id.meijer.com" in current_url:
                print("✅ Already on id.meijer.com")
            else:
                print(f"❌ Not redirected to id.meijer.com, current URL: {current_url}")
                return False
        
        print(f"📄 Current URL: {driver.current_url}")
        print(f"📄 Page title: {driver.title}")
        
        # Take screenshot of the authentication page
        driver.save_screenshot("debug_auth_page_loaded.png")
        print("📸 Screenshot saved: debug_auth_page_loaded.png")
        
        # Step 3: Now we're on the authentication page, enter email
        print("📡 Step 3: Entering email on authentication page...")
        
        # Debug: show what elements are available
        print("🔍 Debugging page elements...")
        print(f"📄 Current URL: {driver.current_url}")
        print(f"📄 Page title: {driver.title}")
        print(f"📄 Page source length: {len(driver.page_source)}")
        
        # Check if we're in an iframe
        try:
            iframes = driver.find_elements(By.TAG_NAME, "iframe")
            print(f"🔍 Found {len(iframes)} iframes:")
            for i, iframe in enumerate(iframes):
                iframe_src = iframe.get_attribute('src') or 'no-src'
                iframe_id = iframe.get_attribute('id') or 'no-id'
                print(f"   Iframe {i+1}: src='{iframe_src}', id='{iframe_id}'")
        except Exception as e:
            print(f"⚠️ Error listing iframes: {e}")
        
        # Wait a bit more for dynamic content
        print("⏳ Waiting for dynamic content to load...")
        time.sleep(5)
        
        try:
            all_inputs = driver.find_elements(By.TAG_NAME, "input")
            print(f"📝 Found {len(all_inputs)} input elements:")
            for i, inp in enumerate(all_inputs):
                inp_type = inp.get_attribute('type') or 'unknown'
                inp_name = inp.get_attribute('name') or 'no-name'
                inp_id = inp.get_attribute('id') or 'no-id'
                inp_placeholder = inp.get_attribute('placeholder') or 'no-placeholder'
                print(f"   Input {i+1}: type='{inp_type}', name='{inp_name}', id='{inp_id}', placeholder='{inp_placeholder}'")
        except Exception as e:
            print(f"⚠️ Error listing inputs: {e}")
        
        # Also check for other form elements
        try:
            all_forms = driver.find_elements(By.TAG_NAME, "form")
            print(f"📝 Found {len(all_forms)} form elements:")
            for i, form in enumerate(all_forms):
                form_action = form.get_attribute('action') or 'no-action'
                form_method = form.get_attribute('method') or 'no-method'
                print(f"   Form {i+1}: action='{form_action}', method='{form_method}'")
        except Exception as e:
            print(f"⚠️ Error listing forms: {e}")
        
        # Check for any buttons
        try:
            all_buttons = driver.find_elements(By.TAG_NAME, "button")
            print(f"📝 Found {len(all_buttons)} button elements:")
            for i, btn in enumerate(all_buttons):
                btn_text = btn.text or 'no-text'
                btn_type = btn.get_attribute('type') or 'no-type'
                print(f"   Button {i+1}: text='{btn_text}', type='{btn_type}'")
        except Exception as e:
            print(f"⚠️ Error listing buttons: {e}")
        
        # Try multiple selectors for username field
        username_field = None
        username_selectors = [
            "input[name='identifier']",
            "input[type='email']",
            "input[type='text']",
            "input[placeholder*='email']",
            "input[placeholder*='Email']",
            "input[placeholder*='username']",
            "input[placeholder*='Username']",
            "input[id*='email']",
            "input[id*='username']",
            "input[id*='identifier']"
        ]
        
        for selector in username_selectors:
            try:
                username_field = driver.find_element(By.CSS_SELECTOR, selector)
                print(f"✅ Username field found with selector: {selector}")
                break
            except:
                continue
        
        if not username_field:
            print("❌ Username field not found with any selector")
            print("🔍 Available form elements:")
            try:
                forms = driver.find_elements(By.TAG_NAME, "form")
                for i, form in enumerate(forms):
                    print(f"   Form {i+1}: action='{form.get_attribute('action')}', method='{form.get_attribute('method')}'")
                    form_inputs = form.find_elements(By.TAG_NAME, "input")
                    for j, inp in enumerate(form_inputs):
                        print(f"     Input {j+1}: type='{inp.get_attribute('type')}', name='{inp.get_attribute('name')}', id='{inp.get_attribute('id')}'")
            except Exception as e:
                print(f"   Error listing forms: {e}")
            return False
        
        username_field.clear()
        username_field.send_keys(username)
        print("✅ Email entered")
        
        # Step 3: Click Next
        print("📡 Step 3: Clicking Next...")
        next_button = wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "button[data-se='save']")))
        next_button.click()
        print("✅ Next button clicked")
        
        # Step 4: Analyze page for errors
        print("📡 Step 4: Analyzing page for errors...")
        time.sleep(3)  # Brief wait for page transition
        
        current_url = driver.current_url
        page_title = driver.title
        print(f"📄 Current URL: {current_url}")
        print(f"📄 Page title: {page_title}")
        
        # Check for error indicators
        page_source = driver.page_source.lower()
        if any(error in page_source for error in ['error', 'invalid', 'failed', 'rate limit']):
            print("❌ Error detected on page")
            driver.save_screenshot("debug_error_page.png")
            print("📸 Error screenshot saved: debug_error_page.png")
            return False
        
        # Step 5: If password page, enter password
        if "password" in page_title.lower() or "passcode" in page_title.lower():
            print("📡 Step 5: Password page detected, entering password...")
            
            # Wait for password field
            password_field = wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, "input[name='credentials.passcode']")))
            password_field.clear()
            password_field.send_keys(password)
            print("✅ Password entered")
            
            # Click next/submit
            submit_button = wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "button[type='submit'], input[type='submit']")))
            submit_button.click()
            print("✅ Password submitted")
            
            # Wait for next page
            time.sleep(3)
            driver.save_screenshot("debug_password_page_loaded.png")
            print("📸 Password page screenshot saved: debug_password_page_loaded.png")
        
        # Step 6: Check if 2FA email is offered
        current_url = driver.current_url
        page_title = driver.title
        print(f"📄 After password - URL: {current_url}")
        print(f"📄 Page title: {page_title}")
        
        if any(keyword in page_title.lower() for keyword in ['verification', 'verify', 'email', 'code']):
            print("📡 Step 6: 2FA email verification detected...")
            
            # Look for "Send Me an Email" button
            try:
                email_button = wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "button[data-se='save']")))
                if "email" in email_button.text.lower():
                    print("✅ Email verification button found, clicking...")
                    email_button.click()
                    time.sleep(3)
                    driver.save_screenshot("debug_email_confirmation_page.png")
                    print("📸 Email confirmation screenshot saved: debug_email_confirmation_page.png")
                else:
                    print("⚠️ Email button found but text doesn't match expectations")
            except:
                print("⚠️ Email verification button not found, continuing...")
        
        # Step 7: Check IMAP email for verification code
        print("📡 Step 7: Checking IMAP email for verification code...")
        verification_code = get_verification_code(timeout=300)
        
        if verification_code:
            print("📡 Step 8: Entering verification code...")
            
            # Look for verification code input field
            try:
                code_field = wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, "input[type='text'], input[placeholder*='code'], input[name*='code']")))
                code_field.clear()
                code_field.send_keys(verification_code)
                print("✅ Verification code entered")
                
                # Click verify/submit button
                verify_button = wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "button[type='submit'], button:contains('Verify'), button:contains('Submit')")))
                verify_button.click()
                print("✅ Verification code submitted")
                
                # Wait for completion
                time.sleep(5)
                driver.save_screenshot("debug_verification_code_page.png")
                print("📸 Verification completion screenshot saved: debug_verification_code_page.png")
                
            except Exception as e:
                print(f"❌ Error entering verification code: {e}")
                return False
        else:
            print("⚠️ No verification code found, continuing without 2FA...")
        
        # Step 9: Capture all authentication data
        print("📡 Step 9: Capturing authentication data...")
        auth_data = capture_auth_data(driver)
        
        # Save authentication data
        save_auth_data(auth_data)
        
        # Final status
        final_url = driver.current_url
        final_title = driver.title
        print(f"🎉 Authentication flow completed!")
        print(f"📄 Final URL: {final_url}")
        print(f"📄 Final title: {final_title}")
        
        if "error" not in final_title.lower() and "error" not in final_url.lower():
            print("✅ Authentication appears successful!")
            print("🔑 All headers and cookies captured for CLI app usage")
            return True
        else:
            print("❌ Authentication may have failed - check final page")
            return False
            
    except Exception as e:
        print(f"❌ Error during authentication: {e}")
        driver.save_screenshot("debug_error_occurred.png")
        print("📸 Error screenshot saved: debug_error_occurred.png")
        return False
        
    finally:
        # Clean up browser
        print("🔍 Browser will remain open for 10 seconds for inspection...")
        time.sleep(10)  # Give time to see the final result
        
        try:
            driver.quit()
            print("🔒 Browser closed")
        except:
            pass

if __name__ == "__main__":
    main()
