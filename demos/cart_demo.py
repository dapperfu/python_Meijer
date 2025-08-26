#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Update demo script for MeijerCart class based on actual API endpoints
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
shopping cart operations including cart retrieval and pickup/delivery
slot management based on actual API endpoints from mitmproxy logs.
"""

import asyncio
import logging
from datetime import datetime, timedelta

from meijer.cart import MeijerCart
from meijer.exceptions import CartError

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


async def demo_cart_retrieval(cart: MeijerCart) -> None:
    """Demonstrate cart retrieval functionality."""
    print("\n🛒 === CART RETRIEVAL DEMO ===")

    try:
        # Get current cart
        print("Retrieving current cart...")
        cart_data = await cart.get_current_cart()

        print("✅ Cart retrieved successfully!")
        print(f"   Cart ID: {cart.cart_id}")
        print(f"   Item Count: {cart.item_count}")
        print(f"   Total Price: ${cart.total_price:.2f}")
        print(f"   Store ID: {cart.store_id}")

        # Show some cart details
        if cart_data:
            print(f"   Raw cart data keys: {list(cart_data.keys())}")

    except CartError as e:
        print(f"❌ Cart retrieval failed: {e}")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")


async def demo_pickup_slots(cart: MeijerCart) -> None:
    """Demonstrate pickup slot retrieval functionality."""
    print("\n📅 === PICKUP SLOTS DEMO ===")

    try:
        # Get pickup slots for today
        print("Retrieving pickup slots for today...")
        pickup_slots = await cart.get_pickup_slots()

        if pickup_slots:
            print(f"✅ Found {len(pickup_slots)} pickup slots:")
            for i, slot in enumerate(pickup_slots[:5]):  # Show first 5
                print(
                    f"   {i + 1}. {slot.start_time.strftime('%H:%M')} - {slot.end_time.strftime('%H:%M')} "
                    f"(ID: {slot.slot_id}, Available: {slot.available})"
                )
        else:
            print("ℹ️  No pickup slots available")

    except CartError as e:
        print(f"❌ Pickup slots retrieval failed: {e}")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")


async def demo_delivery_slots(cart: MeijerCart) -> None:
    """Demonstrate delivery slot retrieval functionality."""
    print("\n🚚 === DELIVERY SLOTS DEMO ===")

    try:
        # Get delivery slots for tomorrow
        tomorrow = datetime.now() + timedelta(days=1)
        print(f"Retrieving delivery slots for {tomorrow.strftime('%Y-%m-%d')}...")

        delivery_slots = await cart.get_delivery_slots(date=tomorrow)

        if delivery_slots:
            print(f"✅ Found {len(delivery_slots)} delivery slots:")
            for i, slot in enumerate(delivery_slots[:5]):  # Show first 5
                fee_info = (
                    f" (Fee: ${slot.delivery_fee:.2f})" if slot.delivery_fee else ""
                )
                print(
                    f"   {i + 1}. {slot.start_time.strftime('%H:%M')} - {slot.end_time.strftime('%H:%M')} "
                    f"(ID: {slot.slot_id}, Available: {slot.available}){fee_info}"
                )
        else:
            print("ℹ️  No delivery slots available")

    except CartError as e:
        print(f"❌ Delivery slots retrieval failed: {e}")
    except Exception as e:
        print(f"❌ Unexpected error: {e}")


async def demo_fulfillment_partners(cart: MeijerCart) -> None:
    """Demonstrate different fulfillment partner options."""
    print("\n🤝 === FULFILLMENT PARTNERS DEMO ===")

    # Test different delivery partners
    partners = [("SHIPT", "MI9"), ("MI9", "MI9"), ("BOPAS", "MI9")]

    for delivery_partner, curbside_partner in partners:
        try:
            print(
                f"\nTesting {delivery_partner} delivery + {curbside_partner} curbside..."
            )

            # Get pickup slots with different partners
            pickup_slots = await cart.get_pickup_slots(
                delivery_partner=delivery_partner, curbside_partner=curbside_partner
            )

            if pickup_slots:
                print(f"   ✅ {delivery_partner}: Found {len(pickup_slots)} slots")
            else:
                print(f"   ℹ️  {delivery_partner}: No slots available")

        except CartError as e:
            print(f"   ❌ {delivery_partner}: Failed - {e}")
        except Exception as e:
            print(f"   ❌ {delivery_partner}: Unexpected error - {e}")


async def demo_cart_properties(cart: MeijerCart) -> None:
    """Demonstrate cart property access."""
    print("\n🔍 === CART PROPERTIES DEMO ===")

    try:
        # Access cart properties
        print(f"Cart ID: {cart.cart_id}")
        print(f"Item Count: {cart.item_count}")
        print(f"Total Price: ${cart.total_price:.2f}")
        print(f"Store ID: {cart.store_id}")

        # Change store and see how it affects the cart
        print(f"\nChanging store from {cart.store_id} to '47'...")
        cart.store_id = "47"
        print(f"New Store ID: {cart.store_id}")
        print(f"Cart data cleared: {cart._cart_data is None}")

        # Change back
        cart.store_id = "217"
        print(f"Restored Store ID: {cart.store_id}")

    except Exception as e:
        print(f"❌ Error accessing cart properties: {e}")


async def main() -> None:
    """Main demo function."""
    print("🚀 Meijer Cart Management Demo")
    print("=" * 50)
    print("This demo shows the actual API endpoints found in mitmproxy logs:")
    print("• GET /digital/occ/v3/carts/current - Cart retrieval")
    print(
        "• POST /digital/hybris/v3/fulfillment/reservationslots - Pickup/delivery slots"
    )
    print("=" * 50)

    # Note: In a real scenario, you would have an authenticated API client
    # For demo purposes, we'll show the structure but note that actual API calls will fail

    print("\n⚠️  NOTE: This is a demonstration of the API structure.")
    print("   Actual API calls require authentication and will fail in this demo.")
    print("   The class structure is based on real API endpoints from mitmproxy logs.")

    # Create a mock cart instance for demonstration
    try:
        # This would normally be a real authenticated client
        mock_client = None  # MeijerAPIClient(...)
        cart = MeijerCart(mock_client, store_id="217")

        # Run demos (they will show the structure but not make actual API calls)
        await demo_cart_properties(cart)

        print("\n📋 === API ENDPOINTS SUMMARY ===")
        print(
            "Based on mitmproxy log analysis, the following endpoints are implemented:"
        )
        print("✅ GET /digital/occ/v3/carts/current - Retrieve current cart")
        print(
            "✅ POST /digital/hybris/v3/fulfillment/reservationslots - Get pickup slots"
        )
        print(
            "✅ POST /digital/hybris/v3/fulfillment/reservationslots - Get delivery slots"
        )
        print(
            "⚠️  Cart modification endpoints (add/remove items) not found in current logs"
        )
        print("⚠️  Slot reservation endpoints not found in current logs")

        print("\n🔍 === NEXT STEPS ===")
        print(
            "To complete the cart functionality, additional API endpoints need to be found:"
        )
        print(
            "• POST /digital/occ/v3/carts/{cartId}/add/{productId}/{quantity} - Add items"
        )
        print(
            "• PATCH /digital/occ/v3/carts/{cartId}/entries/{entryId} - Update quantities"
        )
        print(
            "• DELETE /digital/occ/v3/carts/{cartId}/entries/{entryId} - Remove items"
        )
        print("• POST /digital/hybris/v3/fulfillment/reserve - Reserve slots")

    except Exception as e:
        print(f"❌ Demo setup failed: {e}")


if __name__ == "__main__":
    asyncio.run(main())
