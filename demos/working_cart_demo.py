#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2025-08-22
 * Context: Create a working cart demo that actually demonstrates cart functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Working Meijer Cart Demo
========================

This script demonstrates actual cart functionality including:
- Adding items by UPC
- Updating quantities
- Removing items
- Viewing cart contents
- Setting store

Based on the actual cart API endpoints found in mitmproxy logs.
"""

import sys
import os
import logging
from typing import Optional

# Add the project root to the path
sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer.client import Meijer
from meijer.exceptions import CartError, MeijerError

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


def demo_cart_basic_operations(client: Meijer) -> None:
    """Demonstrate basic cart operations."""
    print("\n🛒 === BASIC CART OPERATIONS DEMO ===")
    
    try:
        # Check if cart is available
        if not hasattr(client, 'cart') or not client.cart:
            print("❌ Cart functionality not available")
            return
        
        print("✅ Cart functionality available")
        print(f"🏪 Current store: {client.cart.store_id}")
        
        # Show current cart
        print("\n📋 Current cart contents:")
        cart_items = client.cart.items
        if cart_items:
            for i, item in enumerate(cart_items, 1):
                name = getattr(item, 'name', f'Item {i}')
                qty = getattr(item, 'current_quantity', getattr(item, 'quantity', 1))
                price = getattr(item, 'price', 0.0)
                print(f"  {i}. {name} - Qty: {qty}, Price: ${price:.2f}")
        else:
            print("  🛒 Cart is empty")
        
    except Exception as e:
        print(f"❌ Error in basic cart operations: {e}")


def demo_add_item_to_cart(client: Meijer, upc: str, quantity: int = 1) -> None:
    """Demonstrate adding an item to cart."""
    print(f"\n➕ === ADD ITEM TO CART DEMO ===")
    print(f"Adding UPC: {upc}, Quantity: {quantity}")
    
    try:
        if not hasattr(client, 'cart') or not client.cart:
            print("❌ Cart functionality not available")
            return
        
        # Add item to cart
        print(f"🔄 Adding {quantity}x item with UPC {upc}...")
        success = client.cart.add_item_by_upc(upc, quantity)
        
        if success:
            print(f"✅ Successfully added {quantity}x item with UPC {upc}")
            
            # Refresh cart to show updated contents
            try:
                client.cart.refresh()
                print("🔄 Cart refreshed")
                
                # Show updated cart
                cart_items = client.cart.items
                print(f"📋 Cart now contains {len(cart_items)} items")
                
            except Exception as e:
                print(f"⚠️ Could not refresh cart: {e}")
        else:
            print(f"❌ Failed to add item with UPC {upc}")
            print("💡 This might be due to:")
            print("   - Invalid UPC code")
            print("   - Item not available at current store")
            print("   - API endpoint not accessible")
            print("   - Authentication issues")
        
    except Exception as e:
        print(f"❌ Error adding item to cart: {e}")


def demo_update_item_quantity(client: Meijer, item_index: int, new_quantity: int) -> None:
    """Demonstrate updating item quantity."""
    print(f"\n🔄 === UPDATE ITEM QUANTITY DEMO ===")
    print(f"Updating item {item_index} to quantity {new_quantity}")
    
    try:
        if not hasattr(client, 'cart') or not client.cart:
            print("❌ Cart functionality not available")
            return
        
        cart_items = client.cart.items
        if not cart_items:
            print("❌ Cart is empty - no items to update")
            return
        
        if item_index < 1 or item_index > len(cart_items):
            print(f"❌ Invalid item index {item_index}. Cart has {len(cart_items)} items.")
            return
        
        item = cart_items[item_index - 1]
        entry_number = getattr(item, 'entry_number', None)
        current_qty = getattr(item, 'current_quantity', getattr(item, 'quantity', 1))
        item_name = getattr(item, 'name', f'Item {item_index}')
        
        if not entry_number:
            print(f"❌ Cannot update {item_name} - no entry number available")
            return
        
        print(f"🔄 Updating {item_name} from quantity {current_qty} to {new_quantity}")
        
        success = client.cart.update_item_quantity(entry_number, new_quantity)
        
        if success:
            print(f"✅ Successfully updated {item_name} quantity to {new_quantity}")
            
            # Refresh cart to show updated contents
            try:
                client.cart.refresh()
                print("🔄 Cart refreshed")
            except Exception as e:
                print(f"⚠️ Could not refresh cart: {e}")
        else:
            print(f"❌ Failed to update {item_name} quantity")
        
    except Exception as e:
        print(f"❌ Error updating item quantity: {e}")


def demo_remove_item_from_cart(client: Meijer, item_index: int) -> None:
    """Demonstrate removing an item from cart."""
    print(f"\n🗑️ === REMOVE ITEM FROM CART DEMO ===")
    print(f"Removing item {item_index}")
    
    try:
        if not hasattr(client, 'cart') or not client.cart:
            print("❌ Cart functionality not available")
            return
        
        cart_items = client.cart.items
        if not cart_items:
            print("❌ Cart is empty - no items to remove")
            return
        
        if item_index < 1 or item_index > len(cart_items):
            print(f"❌ Invalid item index {item_index}. Cart has {len(cart_items)} items.")
            return
        
        item = cart_items[item_index - 1]
        entry_number = getattr(item, 'entry_number', None)
        item_name = getattr(item, 'name', f'Item {item_index}')
        
        if not entry_number:
            print(f"❌ Cannot remove {item_name} - no entry number available")
            return
        
        print(f"🗑️ Removing {item_name} from cart")
        
        success = client.cart.remove_item(entry_number)
        
        if success:
            print(f"✅ Successfully removed {item_name} from cart")
            
            # Refresh cart to show updated contents
            try:
                client.cart.refresh()
                print("🔄 Cart refreshed")
                
                # Show updated cart
                cart_items = client.cart.items
                print(f"📋 Cart now contains {len(cart_items)} items")
                
            except Exception as e:
                print(f"⚠️ Could not refresh cart: {e}")
        else:
            print(f"❌ Failed to remove {item_name} from cart")
        
    except Exception as e:
        print(f"❌ Error removing item from cart: {e}")


def demo_set_store(client: Meijer, store_id: str) -> None:
    """Demonstrate setting the store for cart operations."""
    print(f"\n🏪 === SET STORE DEMO ===")
    print(f"Setting store to {store_id}")
    
    try:
        if not hasattr(client, 'cart') or not client.cart:
            print("❌ Cart functionality not available")
            return
        
        old_store = client.cart.store_id
        print(f"🔄 Changing store from {old_store} to {store_id}")
        
        client.cart.store_id = store_id
        
        print(f"✅ Store changed to {client.cart.store_id}")
        print("💡 Cart data will be refreshed for the new store")
        
        # Clear cart cache for new store
        try:
            client.cart.refresh()
            print("🔄 Cart refreshed for new store")
        except Exception as e:
            print(f"⚠️ Could not refresh cart: {e}")
        
    except Exception as e:
        print(f"❌ Error setting store: {e}")


def demo_cart_workflow(client: Meijer) -> None:
    """Demonstrate a complete cart workflow."""
    print("\n🔄 === COMPLETE CART WORKFLOW DEMO ===")
    
    try:
        # 1. Set store
        print("1️⃣ Setting store to 217 (default)")
        demo_set_store(client, "217")
        
        # 2. Show initial cart
        print("\n2️⃣ Showing initial cart contents")
        demo_cart_basic_operations(client)
        
        # 3. Add a test item (using a common UPC)
        test_upc = "0000000000000"  # Placeholder UPC
        print(f"\n3️⃣ Adding test item with UPC {test_upc}")
        demo_add_item_to_cart(client, test_upc, 2)
        
        # 4. Show updated cart
        print("\n4️⃣ Showing updated cart contents")
        demo_cart_basic_operations(client)
        
        # 5. Update quantity
        print("\n5️⃣ Updating item quantity")
        demo_update_item_quantity(client, 1, 5)
        
        # 6. Show final cart
        print("\n6️⃣ Showing final cart contents")
        demo_cart_basic_operations(client)
        
        # 7. Remove item
        print("\n7️⃣ Removing item from cart")
        demo_remove_item_from_cart(client, 1)
        
        # 8. Show final cart
        print("\n8️⃣ Showing final cart contents")
        demo_cart_basic_operations(client)
        
    except Exception as e:
        print(f"❌ Error in cart workflow demo: {e}")


def main() -> None:
    """Main demo function."""
    print("🚀 Working Meijer Cart Management Demo")
    print("=" * 60)
    print("This demo shows actual cart functionality based on real API endpoints")
    print("found in mitmproxy logs.")
    print("=" * 60)
    
    try:
        # Initialize client
        print("\n🔧 Initializing Meijer client...")
        client = Meijer()
        print("✅ Client initialized")
        
        # Check authentication
        print("\n🔐 Checking authentication status...")
        if hasattr(client, 'auth_status'):
            print(f"   Status: {client.auth_status.name}")
            if client.auth_status.name != "AUTHENTICATED":
                print("⚠️  Client not authenticated - some operations may fail")
                print("💡 Run 'meijer auth log --mode full' first for full functionality")
        else:
            print("⚠️  Authentication status not available")
        
        # Run demos
        demo_cart_basic_operations(client)
        
        # Ask user if they want to run the full workflow
        print("\n❓ Would you like to run the complete cart workflow demo?")
        print("   This will attempt to add, update, and remove items.")
        print("   (Note: This requires valid UPC codes and authentication)")
        
        response = input("   Run full workflow? (y/N): ").strip().lower()
        if response in ['y', 'yes']:
            demo_cart_workflow(client)
        else:
            print("   Skipping full workflow demo")
        
        print("\n✅ Cart demo completed!")
        print("\n💡 To test with real items:")
        print("   1. Run 'meijer auth log --mode full' to authenticate")
        print("   2. Use 'meijer cart add <UPC>' to add items")
        print("   3. Use 'meijer cart show' to view cart")
        print("   4. Use 'meijer cart remove <index>' to remove items")
        
    except Exception as e:
        print(f"❌ Demo failed: {e}")
        logger.error("Demo failed", exc_info=True)


if __name__ == "__main__":
    main()
