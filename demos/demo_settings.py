#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Demo script for Meijer Settings functionality
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: meijer package
 */

Demo script for Meijer Settings functionality.

This script demonstrates the new Settings API endpoints discovered through
log analysis, including vehicle management, preferences, and account updates.
"""

from meijer import Meijer, VehicleInformation, CustomerPreference, PreferenceDiscreteChoice


def demo_vehicle_management():
    """Demonstrate vehicle information management."""
    print("🚗 === Vehicle Management Demo ===")
    
    try:
        client = Meijer()
        
        # Get current vehicle information
        print("\n1. Getting current vehicle information...")
        vehicle = client.settings.get_vehicle_information()
        
        if vehicle:
            print(f"   Current vehicle: {vehicle.vehicle_description}")
            print(f"   Vehicle ID: {vehicle.vehicle_id}")
            print(f"   Account ID: {vehicle.account_id}")
        else:
            print("   No vehicle information found")
            return
        
        # Update vehicle (simulate the flow from log analysis)
        print("\n2. Updating vehicle to 'Honda'...")
        success = client.settings.update_vehicle_information("Honda")
        
        if success:
            print("   ✅ Vehicle updated to Honda")
            
            # Verify the update
            updated_vehicle = client.settings.get_vehicle_information()
            if updated_vehicle:
                print(f"   Verified: {updated_vehicle.vehicle_description}")
        else:
            print("   ❌ Failed to update vehicle")
        
        # Update to VW (final state from log analysis)
        print("\n3. Updating vehicle to 'VW'...")
        success = client.settings.update_vehicle_information("VW")
        
        if success:
            print("   ✅ Vehicle updated to VW")
            
            # Verify the update
            final_vehicle = client.settings.get_vehicle_information()
            if final_vehicle:
                print(f"   Final vehicle: {final_vehicle.vehicle_description}")
        else:
            print("   ❌ Failed to update vehicle")
            
    except Exception as e:
        print(f"❌ Error in vehicle management demo: {e}")


def demo_customer_preferences():
    """Demonstrate customer preferences management."""
    print("\n⚙️  === Customer Preferences Demo ===")
    
    try:
        client = Meijer()
        
        # Get current preferences
        print("\n1. Getting current customer preferences...")
        preferences = client.settings.get_customer_preferences()
        
        if preferences:
            print(f"   Found {len(preferences)} preferences:")
            for pref in preferences:
                print(f"     - {pref.preference_type_name}: {pref.preference_value}")
                print(f"       Program: {pref.owning_program_name}")
                print(f"       Type: {pref.data_type_name}")
                print(f"       Discrete choice: {pref.is_preference_discrete_choice}")
        else:
            print("   No preferences found")
        
        # Get available discrete choices
        print("\n2. Getting preference discrete choices...")
        choices = client.settings.get_preference_discrete_choices()
        
        if choices:
            print(f"   Available choices:")
            for choice in choices:
                print(f"     - {choice.digital_preference_discrete_choice_value} (ID: {choice.digital_preference_discrete_choice_id})")
        else:
            print("   No discrete choices found")
        
        # Update substitution preference (from log analysis)
        print("\n3. Updating substitution preference to 'Any Brand'...")
        success = client.settings.update_customer_preference(
            "Substitutions", 
            "Any Brand", 
            "DigitalGrocery"
        )
        
        if success:
            print("   ✅ Substitution preference updated")
        else:
            print("   ❌ Failed to update substitution preference")
            
        # Update to 'No Substitutions' (from log analysis)
        print("\n4. Updating substitution preference to 'No Substitutions'...")
        success = client.settings.update_customer_preference(
            "Substitutions", 
            "No Substitutions", 
            "DigitalGrocery"
        )
        
        if success:
            print("   ✅ Substitution preference updated to 'No Substitutions'")
        else:
            print("   ❌ Failed to update substitution preference")
            
    except Exception as e:
        print(f"❌ Error in customer preferences demo: {e}")


def demo_account_management():
    """Demonstrate account management functionality."""
    print("\n👤 === Account Management Demo ===")
    
    try:
        client = Meijer()
        
        # Get account details
        print("\n1. Getting account details...")
        account = client.settings.get_account_details()
        
        if account:
            print(f"   Account ID: {account.get('accountId')}")
            print(f"   Name: {account.get('firstName')} {account.get('lastName')}")
            print(f"   Email: {account.get('email')}")
            print(f"   Store ID: {account.get('storeId')}")
            print(f"   mPerks ID: {account.get('mPerksId')}")
            print(f"   Account Status: {account.get('accountStatus')}")
        else:
            print("   No account details found")
            return
        
        # Note: We won't actually update account details in the demo
        # to avoid making real changes, but we can show the capability
        print("\n2. Account update capability:")
        print("   - Can update: firstName, lastName, email, birthDate, zip, storeId")
        print("   - Requires: accountId, mPerksId, mPerksPhone, mPerksPin")
        print("   - Note: This demo doesn't make actual account changes")
        
    except Exception as e:
        print(f"❌ Error in account management demo: {e}")


def main():
    """Run all settings demos."""
    print("🔧 Meijer Settings API Demo")
    print("=" * 50)
    print("This demo showcases the Settings functionality discovered through")
    print("log analysis, including the vehicle change flow from Subaru → Honda → VW")
    print("and other settings modifications.")
    print()
    
    try:
        # Run all demos
        demo_vehicle_management()
        demo_customer_preferences()
        demo_account_management()
        
        print("\n" + "=" * 50)
        print("✅ Settings demo completed successfully!")
        print("\nKey discoveries from log analysis:")
        print("• Vehicle management: updateVehicleInformation endpoint")
        print("• Customer preferences: getCustomerPreferences, updateCustomerPreference")
        print("• Preference choices: getPreferenceDiscreteChoices")
        print("• Account management: getAccount, updateAccount endpoints")
        print("• Settings flow: Vehicle changes (Subaru → Honda → VW)")
        print("• Settings flow: Preference updates (Substitutions: Any Brand → No Substitutions)")
        
    except Exception as e:
        print(f"\n❌ Demo failed: {e}")


if __name__ == "__main__":
    main()
