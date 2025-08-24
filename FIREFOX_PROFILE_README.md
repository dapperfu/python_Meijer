# Firefox Profile-Based Authentication

This project now supports Firefox profiles for persistent authentication sessions, allowing you to maintain login state across browser sessions and share authentication between Selenium automation and regular Firefox.

## 🎯 Key Benefits

- **Persistent Login Sessions**: No need to re-authenticate for each automation run
- **Shared Authentication State**: Use the same profile in both Selenium and regular Firefox
- **Easy Demonstration**: Launch regular Firefox to show functionality to others
- **Profile Management**: Backup, restore, and clean profiles as needed
- **Proxy Support**: Built-in mitmproxy configuration for debugging

## 🚀 Quick Start

### 1. Basic Usage

```python
from meijer.enhanced_headless_auth import authenticate_with_profile

# Authenticate using a Firefox profile
result = authenticate_with_profile(
    username="your_email@example.com",
    password="your_password",
    profile_name="meijer_automation",
    headless=False,  # Set to True for headless operation
    proxy_host="127.0.0.1",
    proxy_port=8080
)

if result['success']:
    print(f"✅ Authentication successful!")
    print(f"📁 Profile: {result['profile_path']}")
else:
    print(f"❌ Authentication failed: {result['message']}")
```

### 2. Using the Enhanced Client

```python
from meijer.enhanced_headless_auth import EnhancedHeadlessAuthClient

# Create client with profile support
with EnhancedHeadlessAuthClient(
    username="your_email@example.com",
    password="your_password",
    profile_name="meijer_automation",
    headless=False
) as client:
    
    # Authenticate
    result = client.authenticate()
    
    # Launch regular Firefox with the same profile
    if result['success']:
        client.launch_regular_firefox()
```

## 🔧 Profile Management

### Command Line Utility

Use the included command-line tool to manage profiles:

```bash
# List all profiles
python tools/manage_firefox_profiles.py list

# Create a new profile
python tools/manage_firefox_profiles.py create meijer_profile

# Backup a profile
python tools/manage_firefox_profiles.py backup meijer_profile

# Launch Firefox with a profile
python tools/manage_firefox_profiles.py launch meijer_profile

# Show profile information
python tools/manage_firefox_profiles.py info meijer_profile

# Clean temporary files from profile
python tools/manage_firefox_profiles.py clean meijer_profile
```

### Programmatic Management

```python
from meijer.firefox_profile_manager import FirefoxProfileManager

# Create profile manager
profile_manager = FirefoxProfileManager("my_profile")

# Create profile
profile_manager.create_profile()

# Backup profile
backup_path = profile_manager.backup_profile()

# Clean profile
profile_manager.clean_profile()

# Launch regular Firefox
profile_manager.launch_regular_firefox()
```

## 📁 Profile Locations

By default, profiles are stored in:
- **Linux**: `~/.mozilla/firefox/profiles/`
- **macOS**: `~/Library/Application Support/Firefox/Profiles/`
- **Windows**: `%APPDATA%\Mozilla\Firefox\Profiles\`

You can specify a custom location:

```python
profile_manager = FirefoxProfileManager(
    "custom_profile", 
    base_dir="/path/to/custom/profiles"
)
```

## 🌐 Using Regular Firefox

After successful authentication with Selenium, you can launch regular Firefox with the same profile:

### Method 1: Command Line
```bash
firefox --profile /path/to/profile/directory
```

### Method 2: Python Script
```python
profile_manager.launch_regular_firefox()
```

### Method 3: Manual Launch
1. Open Firefox
2. Go to `about:profiles`
3. Click "Launch profile in new window" for your automation profile

## 🔒 Security Considerations

- **Profile Isolation**: Each profile is completely isolated from others
- **Credential Storage**: Login credentials are stored securely in Firefox's encrypted storage
- **Cookie Management**: Cookies are maintained per profile
- **Session Persistence**: Sessions persist until explicitly logged out or expired

## 🧪 Testing and Development

### Demo Script

Run the comprehensive demo:

```bash
python demo_firefox_profile_auth.py
```

This will:
1. Create and manage Firefox profiles
2. Perform authentication using Selenium
3. Launch regular Firefox with the authenticated profile
4. Demonstrate profile operations

### Development Workflow

1. **Initial Setup**: Create a profile and authenticate once
2. **Development**: Use the profile for repeated testing without re-authentication
3. **Demonstration**: Launch regular Firefox to show functionality
4. **Maintenance**: Backup profiles before major changes, clean when needed

## 📊 Profile Information

Get detailed information about profiles:

```python
profile_info = profile_manager.get_profile_info()
print(f"Size: {profile_info['size_mb']} MB")
print(f"Has Cookies: {profile_info['has_cookies.sqlite']}")
print(f"Has Logins: {profile_info['has_logins.json']}")
```

## 🔄 Profile Lifecycle

### 1. Creation
```python
profile_manager.create_profile()
```

### 2. Configuration
```python
# Configure for Selenium
options = profile_manager.configure_selenium_options(options)

# Configure for regular Firefox
profile = profile_manager.create_firefox_profile_object()
```

### 3. Usage
```python
# Use with Selenium
driver = webdriver.Firefox(options=options)

# Use with regular Firefox
profile_manager.launch_regular_firefox()
```

### 4. Maintenance
```python
# Backup before changes
backup_path = profile_manager.backup_profile()

# Clean temporary files
profile_manager.clean_profile()

# Restore if needed
profile_manager.restore_profile(backup_path)
```

## 🚨 Troubleshooting

### Common Issues

1. **Profile Not Found**
   - Check if profile directory exists
   - Verify profile name spelling
   - Check base directory path

2. **Authentication Fails**
   - Ensure credentials are correct
   - Check if profile has valid session
   - Verify proxy settings

3. **Firefox Won't Launch**
   - Check if Firefox is installed
   - Verify profile directory permissions
   - Check for conflicting Firefox instances

### Debug Mode

Enable detailed logging:

```python
import logging
logging.basicConfig(level=logging.DEBUG)
```

### Profile Reset

If a profile becomes corrupted:

```python
# Remove and recreate
profile_manager.profile_dir.rmtree()
profile_manager.create_profile()
```

## 📚 API Reference

### FirefoxProfileManager

- `__init__(profile_name, base_dir=None)`: Initialize profile manager
- `create_profile(force=False)`: Create new profile
- `configure_selenium_options(options, proxy_host, proxy_port)`: Configure Selenium options
- `create_firefox_profile_object(proxy_host, proxy_port)`: Create FirefoxProfile object
- `backup_profile(backup_name=None)`: Create profile backup
- `restore_profile(backup_path)`: Restore from backup
- `clean_profile()`: Remove temporary files
- `launch_regular_firefox()`: Launch Firefox with profile

### EnhancedHeadlessAuthClient

- `__init__(username, password, profile_name, headless, proxy_host, proxy_port, browser_timeout)`: Initialize client
- `authenticate()`: Perform authentication
- `get_profile_info()`: Get profile information
- `launch_regular_firefox()`: Launch regular Firefox
- `close_browser()`: Close Selenium browser

## 🔗 Integration Examples

### With Existing Code

```python
# Replace existing Selenium setup
from meijer.firefox_profile_manager import create_meijer_profile

profile_manager = create_meijer_profile("my_profile")
options = profile_manager.configure_selenium_options(Options(), "127.0.0.1", 8080)
driver = webdriver.Firefox(options=options)
```

### With CI/CD

```python
# Use profiles in automated testing
def test_with_profile():
    profile_manager = FirefoxProfileManager("ci_profile")
    if not profile_manager.profile_exists():
        profile_manager.create_profile()
    
    # Run tests with persistent profile
    # ...
    
    # Clean up
    profile_manager.clean_profile()
```

## 📝 Best Practices

1. **Profile Naming**: Use descriptive names (e.g., `meijer_dev`, `meijer_prod`)
2. **Regular Backups**: Backup profiles before major changes
3. **Profile Isolation**: Use separate profiles for different environments
4. **Cleanup**: Regularly clean temporary files to prevent bloat
5. **Documentation**: Document profile configurations and usage

## 🆘 Support

For issues or questions:
1. Check the troubleshooting section
2. Review profile information with `info` command
3. Check logs for detailed error messages
4. Verify profile directory permissions and structure

---

**Note**: This functionality requires Firefox to be installed on the system. The profile approach works best when you need persistent authentication across multiple automation runs or want to demonstrate functionality in regular Firefox.
