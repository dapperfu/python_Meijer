# Meijer Selenium Authentication Solution

A complete solution for automating Meijer OAuth authentication using Selenium WebDriver, solving the browser protocol issue with the mobile redirect URI.

## 🚨 **Problem Solved**

The original OAuth flow used a mobile app redirect URI (`com.meijer.mobile.meijer:/login`) that browsers can't handle, causing the error:

```
The address wasn't understood
Firefox doesn't know how to open this address, because one of the following protocols (https) isn't associated with any program or is not allowed in this context.
```

## 🤖 **Selenium Solution**

The Selenium-based solution automates the entire OAuth flow:

1. **Opens the authorization URL** in a real browser
2. **Automatically fills in credentials** (username/password)
3. **Handles the login process** completely
4. **Extracts the authorization code** from the page
5. **Completes the OAuth flow** automatically

## 🛠️ **Installation**

### 1. Install Dependencies
```bash
# Activate virtual environment
source venv/bin/activate

# Install Selenium and webdriver-manager
pip install selenium webdriver-manager
```

### 2. Verify Installation
```bash
python -c "from selenium import webdriver; from webdriver_manager.chrome import ChromeDriverManager; print('✅ Selenium ready!')"
```

## 🚀 **Usage**

### Basic Selenium Authentication

```python
from meijer_selenium_simple import MeijerSeleniumClient

# Create client with your credentials
client = MeijerSeleniumClient(
    username="your_email@example.com",
    password="your_password"
)

# Perform automated login
if client.login_with_selenium():
    print("✅ Authentication successful!")
    
    # Now you can use all API methods
    offers = client.get_offers(limit=10)
    stores = client.get_stores(zip_code="49525")
else:
    print("❌ Authentication failed")
```

### Headless Mode (No Browser Window)

```python
# Run authentication in background
success = client.login_with_selenium(headless=True)
```

### Interactive Demo

```bash
# Run the interactive demo
python meijer_selenium_simple.py

# Or run the non-interactive demo
python demo_selenium.py
```

## 🔧 **How It Works**

### 1. **Browser Automation**
- Uses Chrome WebDriver with automatic driver management
- Opens the OAuth authorization URL in a real browser
- Handles all form interactions automatically

### 2. **Smart Element Detection**
- Tries multiple CSS selectors for form fields
- Adapts to different page layouts
- Handles Okta login forms specifically

### 3. **Credential Management**
- Automatically fills username and password
- Clicks login button
- Waits for authentication to complete

### 4. **Authorization Code Extraction**
- Monitors page for authorization codes
- Handles various redirect patterns
- Extracts codes from URLs or page content

### 5. **OAuth Completion**
- Exchanges authorization code for access tokens
- Sets up authenticated session
- Ready for API calls

## 📋 **Supported Login Scenarios**

### ✅ **Standard Login**
- Username/email field
- Password field
- Login/submit button

### ✅ **Okta Forms**
- `#input-1` for username
- `#input-2` for password
- `#input-3` for submit button

### ✅ **Generic Forms**
- `input[name='username']`
- `input[type='password']`
- `input[type='submit']`

### ⚠️ **MFA Handling**
- Detects MFA requirements
- Pauses for manual code entry
- Continues automatically after MFA

## 🔍 **Element Detection Strategy**

The Selenium automation uses a robust strategy to find form elements:

```python
# Username field selectors (tried in order)
username_selectors = [
    "#input-1",                    # Okta standard
    "#username",                   # Generic
    "input[name='username']",      # Name attribute
    "input[type='email']",         # Email type
    "input[placeholder*='email' i]", # Placeholder contains 'email'
    "input[placeholder*='username' i]" # Placeholder contains 'username'
]

# Password field selectors
password_selectors = [
    "#input-2",                    # Okta standard
    "#password",                   # Generic
    "input[name='password']",      # Name attribute
    "input[type='password']"       # Password type
]

# Login button selectors
login_selectors = [
    "#input-3",                    # Okta standard
    "input[type='submit']",        # Submit input
    "button[type='submit']",       # Submit button
    "input[value*='Sign' i]",      # Value contains 'Sign'
    "input[value*='Login' i]"      # Value contains 'Login'
]
```

## 🚨 **Error Handling**

### **Common Issues & Solutions**

#### 1. **Chrome Driver Issues**
```bash
# Automatic driver management handles this
from webdriver_manager.chrome import ChromeDriverManager
service = Service(ChromeDriverManager().install())
```

#### 2. **Element Not Found**
- Multiple selector fallbacks
- Implicit waits for page loading
- Detailed logging for debugging

#### 3. **MFA Required**
- Automatic detection
- Pause for manual entry
- Resume automation

#### 4. **Login Errors**
- Error message detection
- Detailed error reporting
- Graceful failure handling

## 📊 **Debugging & Logging**

### **Enable Debug Logging**
```python
import logging
logging.basicConfig(level=logging.DEBUG)
```

### **Page Information**
```python
# Get current page details
page_info = client.selenium_auth.get_page_info()
print(json.dumps(page_info, indent=2))
```

### **Manual Inspection**
```python
# Run with visible browser for debugging
client.login_with_selenium(headless=False)
```

## 🔒 **Security Features**

- **No credential storage** - credentials only in memory
- **Automatic cleanup** - browser closes after authentication
- **Session isolation** - each authentication creates new session
- **HTTPS enforcement** - all communication over secure connections

## 🚀 **Advanced Usage**

### **Custom Browser Options**
```python
# Modify Chrome options
client.selenium_auth.driver_options.add_argument("--disable-images")
client.selenium_auth.driver_options.add_argument("--disable-javascript")
```

### **Custom Timeouts**
```python
# Adjust wait times
client.selenium_auth.timeout = 60  # 60 second timeout
```

### **Multiple Authentication Attempts**
```python
# Retry authentication
max_attempts = 3
for attempt in range(max_attempts):
    if client.login_with_selenium():
        break
    print(f"Attempt {attempt + 1} failed, retrying...")
```

## 📱 **Mobile App Protocol Handling**

The original issue was with the redirect URI `com.meijer.mobile.meijer:/login`. This is a custom mobile app protocol that browsers can't handle. The Selenium solution:

1. **Intercepts the OAuth flow** before the redirect
2. **Extracts the authorization code** from the page
3. **Completes the token exchange** programmatically
4. **Bypasses the mobile protocol** entirely

## 🧪 **Testing**

### **Run Selenium Tests**
```bash
# Test the Selenium setup
python -c "
from meijer_selenium_simple import MeijerSeleniumAuth
auth = MeijerSeleniumAuth('test', 'test')
print('✅ Selenium auth class created successfully')
"
```

### **Test Browser Automation**
```bash
# Run demo (will open browser)
python demo_selenium.py
```

## 🔄 **Integration with Main Client**

The Selenium authentication integrates seamlessly with the main Meijer client:

```python
from meijer_selenium_simple import MeijerSeleniumClient

# Create enhanced client
client = MeijerSeleniumClient(username, password)

# Use Selenium authentication
if client.login_with_selenium():
    # All standard methods work
    offers = client.get_offers()
    stores = client.get_stores()
    user_info = client.get_user_info()
```

## 📚 **File Structure**

```
python_Meijer/
├── meijer_selenium_simple.py    # Main Selenium authentication
├── demo_selenium.py             # Demo scripts
├── README_Selenium.md           # This documentation
├── requirements.txt             # Updated with Selenium deps
└── meijer_comprehensive.py     # Base client
```

## 🆘 **Troubleshooting**

### **Chrome Not Found**
```bash
# Install Chrome browser
sudo apt update
sudo apt install google-chrome-stable
```

### **Driver Issues**
```bash
# Clear webdriver cache
rm -rf ~/.wdm/
```

### **Permission Issues**
```bash
# Fix Chrome permissions
sudo chmod +x /usr/bin/google-chrome
```

### **Headless Mode Issues**
```bash
# Run with visible browser for debugging
client.login_with_selenium(headless=False)
```

## 🎯 **Success Indicators**

When working correctly, you should see:

1. **Chrome browser opens automatically**
2. **Authorization URL loads**
3. **Credentials fill in automatically**
4. **Login button clicks automatically**
5. **Browser closes after successful authentication**
6. **API calls work immediately**

## 🚀 **Next Steps**

1. **Install Selenium dependencies**
2. **Update your credentials** in the demo scripts
3. **Run the Selenium authentication**
4. **Enjoy automated OAuth flow!**

---

**The Selenium solution completely eliminates the browser protocol issue and provides a robust, automated OAuth authentication experience! 🎉** 