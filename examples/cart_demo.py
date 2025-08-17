#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create demo script for MeijerCart functionality
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Meijer Cart Demo
================

This script demonstrates how to use the MeijerCart class to manage
shopping cart operations including adding items, updating quantities,
and managing pickup orders.
"""

import asyncio
import logging
from typing import Optional

from meijer.cart import MeijerCart, CartItem, CartSummary, PickupSlot
from meijer.api_client import MeijerAPIClient
from meijer.exceptions import CartError, MeijerAPIError


def setup_logging() -> None:
    """Set up logging configuration."""
    logging.basicConfig(
        level=logging.INFO,
        format='%(asctime)s - %(name)s - %(levelname)s - %(message)s'
    )


def demo_cart_operations() -> None:
    """Demonstrate basic cart operations."""
    print("🛒 Meijer Cart Demo")
    print("=" * 50)
    
    # Note: This is a demonstration - you'll need to provide actual credentials
    print("\n📝 Note: This demo shows the API structure.")
    print("To use with real data, you'll need to:")
    print("1. Authenticate with Meijer API")
    print("2. Provide a valid store ID")
    print("3. Use real product IDs")
    
    print("\n🔧 Cart Operations Available:")
    print("- get_current_cart() - Retrieve current cart")
    print("- add_item(product_id, quantity) - Add item to cart")
    print("- update_quantity(entry_id, quantity) - Update item quantity")
    print("- remove_item(entry_id) - Remove item from cart")
    print("- clear_cart() - Clear all items")
    print("- get_pickup_slots() - Get available pickup times")
    print("- reserve_pickup_slot(slot_id, date, time) - Reserve pickup slot")
    
    print("\n📊 Cart Data Structures:")
    print("- CartItem: Individual cart items with product details")
    print("- CartSummary: Overall cart information and totals")
    print("- PickupSlot: Available pickup time slots")


def demo_cart_item_creation() -> None:
    """Demonstrate creating cart item objects."""
    print("\n🛍️ Cart Item Creation Demo")
    print("-" * 30)
    
    # Create sample cart items
    item1 = CartItem(
        product_id="85002770236",
        name="Sample Product 1",
        quantity=2.0,
        unit_price=5.99,
        total_price=11.98,
        entry_id="1",
        image_url="https://example.com/image1.png",
        category="Grocery"
    )
    
    item2 = CartItem(
        product_id="4688",
        name="Sample Product 2",
        quantity=1.0,
        unit_price=3.49,
        total_price=3.49,
        entry_id="2",
        image_url="https://example.com/image2.png",
        category="Dairy"
    )
    
    print(f"Item 1: {item1.name} - Qty: {item1.quantity} - Price: ${item1.total_price:.2f}")
    print(f"Item 2: {item2.name} - Qty: {item2.quantity} - Price: ${item2.total_price:.2f}")
    
    total = item1.total_price + item2.total_price
    print(f"Total: ${total:.2f}")


def demo_cart_summary_creation() -> None:
    """Demonstrate creating cart summary objects."""
    print("\n📋 Cart Summary Creation Demo")
    print("-" * 30)
    
    summary = CartSummary(
        cart_id="1247396715",
        store_id="217",
        item_count=2,
        subtotal=15.47,
        tax=1.24,
        total=16.71,
        savings=2.50,
        mperks_discount=1.00
    )
    
    print(f"Cart ID: {summary.cart_id}")
    print(f"Store: {summary.store_id}")
    print(f"Items: {summary.item_count}")
    print(f"Subtotal: ${summary.subtotal:.2f}")
    print(f"Tax: ${summary.tax:.2f}")
    print(f"Savings: ${summary.savings:.2f}")
    print(f"MPerks Discount: ${summary.mperks_discount:.2f}")
    print(f"Total: ${summary.total:.2f}")


def demo_pickup_slots() -> None:
    """Demonstrate pickup slot functionality."""
    print("\n⏰ Pickup Slots Demo")
    print("-" * 30)
    
    # Create sample pickup slots
    slots = [
        PickupSlot(
            slot_id="slot_001",
            date="2024-12-20",
            start_time="10:00",
            end_time="11:00",
            available=True,
            capacity=10
        ),
        PickupSlot(
            slot_id="slot_002",
            date="2024-12-20",
            start_time="11:00",
            end_time="12:00",
            available=True,
            capacity=8
        ),
        PickupSlot(
            slot_id="slot_003",
            date="2024-12-20",
            start_time="12:00",
            end_time="13:00",
            available=False,
            capacity=0
        )
    ]
    
    print("Available Pickup Slots:")
    for slot in slots:
        status = "✅ Available" if slot.available else "❌ Unavailable"
        print(f"  {slot.date} {slot.start_time}-{slot.end_time} - {status}")
        if slot.available and slot.capacity:
            print(f"    Capacity: {slot.capacity} orders")


def demo_error_handling() -> None:
    """Demonstrate error handling patterns."""
    print("\n⚠️ Error Handling Demo")
    print("-" * 30)
    
    print("Common error scenarios:")
    print("1. CartError - When cart operations fail")
    print("2. MeijerAPIError - When API requests fail")
    print("3. Authentication errors - When credentials are invalid")
    
    print("\nExample error handling:")
    print("""
try:
    cart.add_item("invalid_product_id")
except CartError as e:
    print(f"Cart operation failed: {e}")
except MeijerAPIError as e:
    print(f"API request failed: {e}")
except Exception as e:
    print(f"Unexpected error: {e}")
""")


def demo_api_integration() -> None:
    """Demonstrate how to integrate with the API client."""
    print("\n🔌 API Integration Demo")
    print("-" * 30)
    
    print("To use the cart with real API calls:")
    print("""
# 1. Create authenticated API client
api_client = MeijerAPIClient(
    username="your_username",
    password="your_password"
)

# 2. Authenticate
api_client.authenticate()

# 3. Create cart instance
cart = MeijerCart(api_client, store_id="217")

# 4. Use cart operations
current_cart = cart.get_current_cart()
cart.add_item("85002770236", quantity=2.0)
cart.update_quantity("1", quantity=3.0)
pickup_slots = cart.get_pickup_slots()
""")


def main() -> None:
    """Run the cart demo."""
    setup_logging()
    
    try:
        demo_cart_operations()
        demo_cart_item_creation()
        demo_cart_summary_creation()
        demo_pickup_slots()
        demo_error_handling()
        demo_api_integration()
        
        print("\n🎉 Cart Demo Completed Successfully!")
        print("\nNext steps:")
        print("1. Set up authentication with Meijer API")
        print("2. Test with real store ID and product IDs")
        print("3. Integrate into your shopping application")
        
    except Exception as e:
        print(f"\n❌ Demo failed with error: {e}")
        logging.error(f"Demo error: {e}", exc_info=True)


if __name__ == "__main__":
    main() 