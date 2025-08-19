# 🖥️ Meijer Settings CLI Reference

## Overview

The `meijer settings` command provides comprehensive access to manage your Meijer account settings, preferences, and vehicle information directly from the command line.

## 🚗 Vehicle Management

### Show Current Vehicle
```bash
meijer settings vehicle --show
```
**Output:**
```
🚗 Current Vehicle Information:
  Vehicle ID: 16749
  Description: VW
  Account ID: 0
```

### Update Vehicle
```bash
meijer settings vehicle --update "Honda"
```
**Output:**
```
🔧 Updating vehicle to: Honda
✅ Vehicle updated to: Honda
  Verified: Honda
```

## ⚙️ Customer Preferences

### Show All Preferences
```bash
meijer settings preferences --show
```
**Output:** Tabulated display of all preferences with:
- Preference Type
- Current Value
- Program (DigitalReceipts, mPerks, DigitalGrocery)
- Data Type
- Discrete Choice status

### Show Available Choices
```bash
meijer settings preferences --choices
```
**Output:** Shows both preferences and available discrete choice options:
```
🎯 Available Preference Choices:
+-------------+------------------+
| Choice ID   | Choice Value     |
+=============+==================+
|           2 | Meijer Brand     |
|           3 | National Brand   |
|           5 | Any Brand        |
|           4 | No Substitutions |
+-------------+------------------+
```

### Update Preference
```bash
meijer settings preferences --update "Substitutions" "Any Brand"
```
**Output:**
```
🔧 Updating preference 'Substitutions' to: Any Brand
✅ Preference 'Substitutions' updated successfully
```

## 👤 Account Management

### Show Account Details
```bash
meijer settings account --show
```
**Output:**
```
👤 Account Details:
  Account ID: 13266596
  Name: John Elam
  Email: meijer.com@eabi.xyz
  Birth Date: 2000-06-26T00:00:00
  ZIP Code: 49445
  Store ID: 71
  mPerks ID: 2737593
  Account Status: 5
```

### Update Account Field
```bash
meijer settings account --update "firstName=John"
```
**Output:**
```
🔧 Updating account field 'firstName' to: John
✅ Account field 'firstName' updated successfully
```

## 📊 Settings Summary

### Show Complete Overview
```bash
meijer settings summary
```
**Output:**
```
🔧 Settings Summary
==================================================

🚗 Vehicle Information:
  Current Vehicle: VW
  Vehicle ID: 16749

⚙️  Preferences Summary:
  Total Preferences: 7
    DigitalReceipts: 3 preferences
    mPerks: 3 preferences
    DigitalGrocery: 1 preferences

👤 Account Summary:
  Name: John Elam
  Store ID: 71
  mPerks ID: 2737593
```

## 🔧 Command Options

### Vehicle Command
- `--show`: Display current vehicle information
- `--update VALUE`: Update vehicle description

### Preferences Command
- `--show`: Display all current preferences
- `--choices`: Show available discrete choice options
- `--update TYPE VALUE`: Update specific preference

### Account Command
- `--show`: Display account details
- `--update FIELD=VALUE`: Update account field

### Summary Command
- No options - shows complete settings overview

## 📱 Usage Examples

### Complete Settings Workflow
```bash
# 1. Check current settings
meijer settings summary

# 2. View current vehicle
meijer settings vehicle --show

# 3. Update vehicle
meijer settings vehicle --update "Honda"

# 4. View preferences
meijer settings preferences --show

# 5. Update substitution preference
meijer settings preferences --update "Substitutions" "Any Brand"

# 6. Verify changes
meijer settings summary
```

### Quick Status Check
```bash
# Quick overview of all settings
meijer settings summary

# Check specific areas
meijer settings vehicle --show
meijer settings preferences --show
meijer settings account --show
```

### Batch Updates
```bash
# Update multiple settings in sequence
meijer settings vehicle --update "VW"
meijer settings preferences --update "Substitutions" "No Substitutions"
```

## 🚨 Error Handling

All commands include comprehensive error handling:
- **Authentication errors** are caught and reported clearly
- **API failures** show specific error messages
- **Invalid input** provides helpful usage guidance
- **Network issues** are handled gracefully

## 🔐 Authentication

The settings commands require:
- Valid Bearer token in `~/.config/meijer.txt`
- Active Meijer account session
- Proper API permissions

## 📋 Requirements

- Python 3.8+
- Meijer package installed (`pip install -e .`)
- Valid authentication configuration
- Network access to Meijer APIs

## 🆘 Help and Support

### Command Help
```bash
meijer settings --help
meijer settings vehicle --help
meijer settings preferences --help
meijer settings account --help
```

### General Help
```bash
meijer --help
```

---

*This CLI provides direct access to the same functionality available in the Meijer mobile app Settings section, discovered through API analysis and implemented with comprehensive error handling and user feedback.*
