#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2025-08-22
 * Context: Demo script for comprehensive account functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Account Management Demo

This script demonstrates the comprehensive account management capabilities
including profile management, receipts, orders, savings, and preferences.
"""

import sys
import os
from pathlib import Path

# Add the parent directory to the path to import meijer
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer import Meijer


def demo_account_profile():
    """Demonstrate account profile functionality."""
    print("\n👤 === Account Profile Demo ===")

    try:
        # Get account profile
        print("\n1. Getting account profile...")
        profile = client.account.get_profile()

        if profile:
            print(f"   ✅ Account ID: {profile.account_id}")
            print(f"   ✅ Name: {profile.first_name} {profile.last_name}")
            print(f"   ✅ Email: {profile.email}")
            print(f"   ✅ Store ID: {profile.store_id}")
            print(f"   ✅ mPerks ID: {profile.mperks_id}")
            print(f"   ✅ Account Status: {profile.account_status}")
            print(f"   ✅ mPerks Status: {profile.mperks_status}")
            print(f"   ✅ Vehicle: {profile.vehicle_information}")
            print(f"   ✅ Created: {profile.created_date}")
            print(f"   ✅ Last Updated: {profile.updated_date}")
        else:
            print("   ❌ No account profile found")

    except Exception as e:
        print(f"   ❌ Error in account profile demo: {e}")


def demo_shop_scan():
    """Demonstrate Shop & Scan functionality."""
    print("\n🛒 === Shop & Scan Demo ===")

    try:
        # Check if Shop & Scan is enabled
        print("\n1. Checking Shop & Scan status...")
        is_enabled = client.account.is_shop_scan_enabled()
        print(f"   ✅ Shop & Scan enabled: {is_enabled}")

        # Get mPerks barcode
        print("\n2. Getting mPerks barcode...")
        barcode = client.account.get_mperks_barcode()
        if barcode:
            print(f"   ✅ mPerks barcode: {barcode}")
        else:
            print("   ❌ Could not get mPerks barcode")

    except Exception as e:
        print(f"   ❌ Error in Shop & Scan demo: {e}")


def demo_receipts():
    """Demonstrate receipt functionality."""
    print("\n🧾 === Receipts Demo ===")

    try:
        # Get receipts using cached property
        print("\n1. Getting receipts using cached property...")
        receipts = (
            client.account.receipts
        )  # This calls get_receipts() and caches the result

        if receipts:
            print(f"   ✅ Found {len(receipts)} receipts")
            for i, receipt in enumerate(receipts[:3]):  # Show first 3
                print(f"   📄 Receipt {i + 1}:")
                print(f"      - ID: {receipt.receipt_id}")
                print(f"      - Order: {receipt.order_number}")
                print(f"      - Store: {receipt.store_name}")
                print(f"      - Date: {receipt.transaction_date}")
                print(f"      - Total: ${receipt.total_amount:.2f}")

            # Demonstrate receipt.save() method
            if receipts:
                print("\n2. Using receipt.save() method...")
                receipt = receipts[0]  # Get first receipt from cached property
                download_path = f"receipt_{receipt.receipt_id}.pdf"

                success = receipt.save(download_path)  # Use the convenient save method

                if success:
                    print(f"   ✅ Receipt saved to: {download_path}")
                    # Clean up the downloaded file
                    if os.path.exists(download_path):
                        os.remove(download_path)
                        print("   🧹 Downloaded file cleaned up")
                else:
                    print("   ❌ Failed to save receipt")

            # Demonstrate cache refresh
            print("\n3. Cache functionality:")
            print("   - Subsequent calls to client.account.receipts use cached data")
            print("   - Use client.account.refresh_cache() to clear cache")

        else:
            print("   ❌ No receipts found")

    except Exception as e:
        print(f"   ❌ Error in receipts demo: {e}")


def demo_orders():
    """Demonstrate order functionality."""
    print("\n📦 === Orders Demo ===")

    try:
        # Get orders
        print("\n1. Getting order history...")
        orders_data = client.account.get_orders(page=0, page_size=5)

        if orders_data and "orders" in orders_data:
            orders = orders_data["orders"]
            print(f"   ✅ Found {len(orders)} orders")

            if orders:
                # Show first order details
                first_order = orders[0]
                print("\n2. First order details:")
                print(f"   - Order ID: {first_order.get('orderId', 'N/A')}")
                print(f"   - Order Number: {first_order.get('orderNumber', 'N/A')}")
                print(f"   - Status: {first_order.get('status', 'N/A')}")
                print(f"   - Total: ${first_order.get('totalAmount', 0):.2f}")

                # Get detailed order information
                order_id = first_order.get("orderId")
                if order_id:
                    print("\n3. Getting detailed order information...")
                    order_details = client.account.get_order_details(order_id)
                    if order_details:
                        print("   ✅ Order details retrieved successfully")
                        print(f"   - Items: {len(order_details.get('items', []))}")
                        print(f"   - Store: {order_details.get('storeName', 'N/A')}")
                    else:
                        print("   ❌ Could not get order details")
            else:
                print("   ℹ️  No orders found in history")
        else:
            print("   ❌ Could not retrieve order data")

    except Exception as e:
        print(f"   ❌ Error in orders demo: {e}")


def demo_savings():
    """Demonstrate savings functionality."""
    print("\n💰 === Savings Demo ===")

    try:
        # Get savings using cached property
        print("\n1. Getting savings using cached property...")
        savings_summary = (
            client.account.savings
        )  # This calls get_savings_summary() and caches the result

        if savings_summary:
            print(f"   ✅ Total Savings: ${savings_summary.total_savings:.2f}")
            print(f"   ✅ mPerks Savings: ${savings_summary.mperks_savings:.2f}")
            print(
                f"   ✅ Digital Coupon Savings: ${savings_summary.digital_coupon_savings:.2f}"
            )
            print(f"   ✅ Store Savings: ${savings_summary.store_savings:.2f}")
            print(
                f"   ✅ Period: {savings_summary.period_start} to {savings_summary.period_end}"
            )
        else:
            print("   ❌ Could not get savings summary")

        # Get savings history
        print("\n2. Getting savings history...")
        savings_history = client.account.get_savings_history(page=0, page_size=5)

        if savings_history:
            print(f"   ✅ Found {len(savings_history)} savings entries")
            for i, entry in enumerate(savings_history[:3]):  # Show first 3
                print(
                    f"   💰 Entry {i + 1}: ${entry.total_savings:.2f} ({entry.period_start} - {entry.period_end})"
                )
        else:
            print("   ❌ Could not get savings history")

    except Exception as e:
        print(f"   ❌ Error in savings demo: {e}")


def demo_preferences():
    """Demonstrate preferences functionality."""
    print("\n⚙️ === Preferences Demo ===")

    try:
        # Get preferences
        print("\n1. Getting customer preferences...")
        preferences = client.account.get_preferences()

        if preferences:
            print(f"   ✅ Found {len(preferences)} preferences")
            for i, pref in enumerate(preferences[:3]):  # Show first 3
                print(f"   ⚙️  Preference {i + 1}:")
                print(f"      - Type: {pref.get('preferenceTypeName', 'N/A')}")
                print(f"      - Value: {pref.get('preferenceValue', 'N/A')}")
                print(f"      - Program: {pref.get('owningProgramName', 'N/A')}")
        else:
            print("   ❌ No preferences found")

    except Exception as e:
        print(f"   ❌ Error in preferences demo: {e}")


def demo_vehicle():
    """Demonstrate vehicle information functionality."""
    print("\n🚗 === Vehicle Information Demo ===")

    try:
        # Get vehicle information
        print("\n1. Getting vehicle information...")
        vehicle_info = client.account.get_vehicle_information()

        if vehicle_info:
            print(f"   ✅ Vehicle ID: {vehicle_info.get('vehicleId', 'N/A')}")
            print(f"   ✅ Description: {vehicle_info.get('vehicleDescription', 'N/A')}")
            print(f"   ✅ Account ID: {vehicle_info.get('accountId', 'N/A')}")
        else:
            print("   ❌ No vehicle information found")

    except Exception as e:
        print(f"   ❌ Error in vehicle demo: {e}")


def demo_account_update():
    """Demonstrate account update functionality."""
    print("\n🔧 === Account Update Demo ===")

    try:
        # Note: We won't actually update account details in the demo
        print("\n1. Account update capability:")
        print("   - Can update profile information")
        print("   - Can update preferences")
        print("   - Can update vehicle information")
        print("   - Note: This demo doesn't make actual account changes")

        # Show what fields can be updated
        profile = client.account.get_profile()
        if profile:
            print("\n2. Current profile fields that can be updated:")
            print(f"   - First Name: {profile.first_name}")
            print(f"   - Last Name: {profile.last_name}")
            print(f"   - Email: {profile.email}")
            print(f"   - ZIP Code: {profile.zip_code}")
            print(f"   - Vehicle Information: {profile.vehicle_information}")

    except Exception as e:
        print(f"   ❌ Error in account update demo: {e}")


def main():
    """Run the comprehensive account demo."""
    print("🚀 Meijer Account Management Demo")
    print("=" * 50)

    try:
        # Initialize client
        print("\n🔐 Initializing Meijer client...")
        global client
        client = Meijer()

        if not client.auth.is_authenticated():
            print("❌ Authentication failed. Please check your credentials.")
            return

        print("✅ Client initialized successfully")

        # Run all demos
        demo_account_profile()
        demo_shop_scan()
        demo_receipts()
        demo_orders()
        demo_savings()
        demo_preferences()
        demo_vehicle()
        demo_account_update()

        print("\n🎉 Account management demo completed successfully!")
        print("\n📋 Summary of available features:")
        print(
            "• Profile management: get_profile(), update_profile(), client.account.profile"
        )
        print("• Shop & Scan: is_shop_scan_enabled(), get_mperks_barcode()")
        print("• Receipts: get_receipts(), client.account.receipts, receipt.save()")
        print("• Orders: get_orders(), get_order_details()")
        print("• Savings: get_savings_summary(), client.account.savings")
        print("• Preferences: get_preferences(), update_preference()")
        print("• Vehicle: get_vehicle_information(), update_vehicle_information()")
        print("• Cache management: client.account.refresh_cache()")
        print("\n🚀 Quick examples:")
        print("  receipt = client.account.receipts[0]")
        print("  receipt.save('my_receipt.pdf')")
        print("  total = client.account.savings.total_savings")

    except Exception as e:
        print(f"❌ Demo failed: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
