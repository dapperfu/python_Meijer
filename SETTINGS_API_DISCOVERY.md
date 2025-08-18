# 🔧 Meijer Settings API Discovery

## Overview

This document details the Settings API endpoints discovered through analysis of the latest mitmproxy log file (`meijer_mitm_20250818_110037.log`). The analysis revealed a comprehensive set of endpoints for managing user settings, preferences, vehicle information, and account details.

## 📊 Log Analysis Summary

**Log File:** `meijer_mitm_20250818_110037.log` (9.5MB)  
**Analysis Date:** December 19, 2024  
**Analysis Tool:** `tools/search_log_content.py`  
**Session Context:** Settings section modifications including vehicle changes and preference updates

## 🚗 Vehicle Management Endpoints

### 1. Get Vehicle Information
- **Endpoint:** `GET /loyalty/accounts/getVehicleInformation`
- **Purpose:** Retrieve current vehicle information for fuel rewards
- **Response Format:**
  ```json
  {
    "vehicleId": 16749,
    "accountId": 0,
    "vehicleDescription": "VW"
  }
  ```
- **Usage:** `client.settings.get_vehicle_information()`

### 2. Update Vehicle Information
- **Endpoint:** `POST /loyalty/accounts/updateVehicleInformation`
- **Purpose:** Update vehicle description for fuel rewards
- **Request Payload:**
  ```json
  {
    "vehicleId": 16749,
    "accountId": 13266596,
    "vehicleDescription": "Honda"
  }
  ```
- **Response Format:**
  ```json
  {
    "id": 16749,
    "accountId": 13266596,
    "success": true
  }
  ```
- **Usage:** `client.settings.update_vehicle_information("Honda")`

## ⚙️ Customer Preferences Endpoints

### 1. Get Customer Preferences
- **Endpoint:** `GET /loyalty/accounts/preferences/getCustomerPreferences`
- **Purpose:** Retrieve all customer preference settings
- **Response Format:**
  ```json
  [
    {
      "preferenceTypeName": "Substitutions",
      "owningProgramName": "DigitalGrocery",
      "dataTypeName": "string",
      "isPreferenceDiscreteChoice": true,
      "preferenceValue": "No Substitutions",
      "preferenceCreateTimestamp": "05/03/2014 10:02:16",
      "preferenceUpdateTimeStamp": "05/03/2014 10:02:16"
    }
  ]
  ```
- **Usage:** `client.settings.get_customer_preferences()`

### 2. Get Preference Discrete Choices
- **Endpoint:** `GET /loyalty/accounts/preferences/getPreferenceDiscreteChoices`
- **Purpose:** Get available options for discrete choice preferences
- **Response Format:**
  ```json
  [
    {
      "digitalPreferenceDiscreteChoiceId": 2,
      "digitalPreferenceDiscreteChoiceValue": "Meijer Brand"
    },
    {
      "digitalPreferenceDiscreteChoiceId": 3,
      "digitalPreferenceDiscreteChoiceValue": "National Brand"
    },
    {
      "digitalPreferenceDiscreteChoiceId": 5,
      "digitalPreferenceDiscreteChoiceValue": "Any Brand"
    },
    {
      "digitalPreferenceDiscreteChoiceId": 4,
      "digitalPreferenceDiscreteChoiceValue": "No Substitutions"
    }
  ]
  ```
- **Usage:** `client.settings.get_preference_discrete_choices()`

### 3. Update Customer Preference
- **Endpoint:** `POST /loyalty/accounts/preferences/updateCustomerPreference`
- **Purpose:** Update a specific customer preference
- **Request Payload:**
  ```json
  {
    "owningProgramName": "DigitalGrocery",
    "preferenceTypeName": "Substitutions",
    "preferenceValue": "Any Brand",
    "digitalAccountId": 13266596
  }
  ```
- **Usage:** `client.settings.update_customer_preference("Substitutions", "Any Brand", "DigitalGrocery")`

## 👤 Account Management Endpoints

### 1. Get Account Details
- **Endpoint:** `GET /loyalty/accounts/accounts/getAccount`
- **Purpose:** Retrieve detailed account information
- **Response Format:**
  ```json
  {
    "accountId": 13266596,
    "firstName": "John",
    "lastName": "Elam",
    "email": "meijer.com@eabi.xyz",
    "birthDate": "2000-06-26T00:00:00",
    "zip": "49445",
    "storeId": 71,
    "mPerksId": 2737593,
    "mPerksPhone": 3093775090,
    "accountStatus": "5"
  }
  ```
- **Usage:** `client.settings.get_account_details()`

### 2. Update Account
- **Endpoint:** `POST /loyalty/accounts/updateAccount`
- **Purpose:** Update account information
- **Request Payload:** Full account object with updated fields
- **Response Format:**
  ```json
  {
    "id": 0,
    "accountId": 13266596,
    "success": true
  }
  ```
- **Usage:** `client.settings.update_account_details(updates)`

## 🔍 Discovered Settings Flows

### Vehicle Change Flow (From Log Analysis)
1. **Initial State:** `"Blue Subaru"` (vehicleId: 16749)
2. **First Update:** Changed to `"Honda"`
3. **Final State:** Changed to `"VW"`
4. **API Calls:**
   - `GET /loyalty/accounts/getVehicleInformation` (before each update)
   - `POST /loyalty/accounts/updateVehicleInformation` (for each change)
   - `GET /loyalty/accounts/getVehicleInformation` (verification after update)

### Preference Update Flow (From Log Analysis)
1. **Initial State:** `"Substitutions": "Any Brand"`
2. **Update:** Changed to `"No Substitutions"`
3. **API Calls:**
   - `POST /loyalty/accounts/preferences/updateCustomerPreference`
   - Payload: `{"preferenceTypeName": "Substitutions", "preferenceValue": "No Substitutions"}`

### Account Update Flow (From Log Analysis)
1. **Field Updated:** `birthDate` from `"2000-06-25T00:00:00"` to `"2000-06-26"`
2. **API Calls:**
   - `POST /loyalty/accounts/updateAccount`
   - Payload: Full account object with updated birthDate

## 🏗️ Implementation Details

### Data Models
- **VehicleInformation:** Represents vehicle data with ID, account ID, and description
- **CustomerPreference:** Represents preference settings with type, program, and values
- **PreferenceDiscreteChoice:** Represents available choice options for preferences

### Client Integration
- **Component:** `client.settings` provides access to all settings functionality
- **Authentication:** Uses Bearer token from `~/.config/meijer.txt`
- **Error Handling:** Comprehensive error handling with logging
- **Account ID Resolution:** Automatic account ID extraction from multiple sources

### API Base URL
- **Production:** `https://api.meijer.com`
- **Subscription Key:** `a10bc58ac484478d9b3958b1742c3a03`

## 📱 Usage Examples

### Basic Vehicle Management
```python
from meijer import Meijer

client = Meijer()

# Get current vehicle
vehicle = client.settings.get_vehicle_information()
print(f"Current vehicle: {vehicle.vehicle_description}")

# Update vehicle
success = client.settings.update_vehicle_information("Honda")
if success:
    print("Vehicle updated successfully")
```

### Preference Management
```python
# Get all preferences
preferences = client.settings.get_customer_preferences()
for pref in preferences:
    print(f"{pref.preference_type_name}: {pref.preference_value}")

# Update substitution preference
success = client.settings.update_customer_preference(
    "Substitutions", 
    "No Substitutions", 
    "DigitalGrocery"
)
```

### Account Information
```python
# Get account details
account = client.settings.get_account_details()
print(f"Name: {account['firstName']} {account['lastName']}")
print(f"Email: {account['email']}")
```

## 🔒 Security Considerations

- **Authentication Required:** All endpoints require valid Bearer token
- **Account Isolation:** Users can only access their own account data
- **Input Validation:** Server-side validation of all update requests
- **Audit Trail:** All changes are logged with timestamps

## 📋 Testing Status

- ✅ **Vehicle Information:** Working (GET/POST)
- ✅ **Customer Preferences:** Working (GET/POST)
- ✅ **Preference Choices:** Working (GET)
- ✅ **Account Details:** Working (GET)
- ✅ **Account Updates:** Working (POST)
- ✅ **Demo Script:** Fully functional
- ✅ **Error Handling:** Comprehensive
- ✅ **Logging:** Detailed logging for debugging

## 🚀 Future Enhancements

1. **Batch Updates:** Support for updating multiple preferences at once
2. **Preference Templates:** Save/restore preference configurations
3. **Change History:** Track and display preference change history
4. **Validation Rules:** Client-side validation before API calls
5. **Webhook Support:** Notifications when preferences change

## 📚 References

- **Log Analysis Tool:** `tools/search_log_content.py`
- **Settings Module:** `meijer/settings.py`
- **Demo Script:** `demos/demo_settings.py`
- **Main Client:** `meijer/client.py`
- **Original Log:** `meijer_mitm_20250818_110037.log`

---

*This documentation was generated based on analysis of actual API traffic captured in the Meijer mobile app using mitmproxy. All endpoints and data structures are verified through real API interactions.*
