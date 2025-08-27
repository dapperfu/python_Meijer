#!/usr/bin/env python3
"""
Demo script for the new async MeijerItem functionality.

This script demonstrates how to create MeijerItem instances that automatically
populate data using fallback methods:
1. Search API (fastest)
2. Shop'n'Scan (medium speed)
3. Cart operations (slowest but most accurate)

The demo shows both the factory function and class method approaches.
"""

import asyncio
import logging

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


async def demo_async_meijer_item():
    """Demonstrate async MeijerItem functionality."""
    print("🚀 ASYNC MEIJER ITEM DEMO")
    print("=" * 50)

    try:
        # Import the client and models
        from meijer import Meijer
        from meijer.models import MeijerItem, create_meijer_item

        print("1. 🔐 Initializing Meijer client...")
        client = Meijer()

        if not client.is_authenticated():
            print("   ❌ Authentication failed - using mock client for demo")
            # For demo purposes, we'll show the structure without real API calls
            await demo_mock_items()
            return

        print("   ✅ Client authenticated successfully!")

        # Test UPCs from the analysis
        test_upcs = [
            "629307040245",
            "842595131277",
            "822279082910",
            "070896523112",
            "713733252843",
            "016000275263",
            "046100001899",
        ]

        print(f"\n2. 🏷️ Creating items for {len(test_upcs)} UPCs...")

        # Method 1: Using factory function
        print("\n   📦 Method 1: Factory Function")
        items_factory = []
        for upc in test_upcs[:3]:  # Test first 3
            item = create_meijer_item(upc, meijer_client=client)
            items_factory.append(item)
            print(f"      Created: {item}")

        # Method 2: Using class method
        print("\n   🏗️ Method 2: Class Method")
        items_class = []
        for upc in test_upcs[3:6]:  # Test next 3
            item = MeijerItem.from_upc(upc, meijer_client=client)
            items_class.append(item)
            print(f"      Created: {item}")

        # Method 3: Direct instantiation
        print("\n   ⚡ Method 3: Direct Instantiation")
        items_direct = []
        for upc in test_upcs[6:]:  # Test last UPC
            item = MeijerItem(
                id=f"demo_{upc}",
                title=f"Demo Product {upc}",
                upc=upc,
                _meijer_client=client,
            )
            items_direct.append(item)
            print(f"      Created: {item}")

        # Combine all items
        all_items = items_factory + items_class + items_direct

        print("\n3. 🔍 Testing async data population...")

        # Test async price population
        for i, item in enumerate(all_items):
            print(f"\n   Item {i + 1}: {item.title}")
            print(f"      Initial price: {item.price}")

            try:
                # This will trigger async data population
                populated_price = await item.populated_price
                print(f"      Populated price: {populated_price}")

                # Get full details
                details = await item.populated_details
                print(f"      Brand: {details.get('brand', 'N/A')}")
                print(f"      Category: {details.get('category', 'N/A')}")

            except Exception as e:
                print(f"      ❌ Population failed: {e}")

        print("\n4. 📊 Summary")
        print(f"   Total items created: {len(all_items)}")
        print(
            f"   Items with prices: {sum(1 for item in all_items if item.price is not None)}"
        )
        print(
            f"   Items with brands: {sum(1 for item in all_items if item.brand is not None)}"
        )

        # Demonstrate the fallback strategy
        print("\n5. 🔄 Fallback Strategy Demo")
        print("   The system automatically tries:")
        print("   1. Search API (fastest)")
        print("   2. Shop'n'Scan (medium speed)")
        print("   3. Cart operations (slowest but most accurate)")
        print("   Cart items are automatically removed after pricing retrieval")

    except ImportError as e:
        print(f"❌ Import error: {e}")
        print("   Make sure you're running this from the project root directory")
    except Exception as e:
        print(f"❌ Demo failed: {e}")
        logger.exception("Demo error")


async def demo_mock_items():
    """Demonstrate the structure with mock items (no API calls)."""
    print("\n📋 MOCK ITEM DEMO (No API calls)")
    print("-" * 30)

    try:
        from meijer.models import MeijerItem

        # Create mock items without client
        mock_items = []
        test_upcs = ["123456789012", "987654321098", "555666777888"]

        for upc in test_upcs:
            item = MeijerItem.from_upc(upc)
            mock_items.append(item)
            print(f"   Created mock item: {item}")

        print(f"\n   Mock items created: {len(mock_items)}")
        print("   Note: These items won't populate data without a client reference")
        print(
            "   Use create_meijer_item() or MeijerItem.from_upc() with a client for real data"
        )

    except Exception as e:
        print(f"   ❌ Mock demo failed: {e}")


async def demo_usage_examples():
    """Show usage examples for the new async MeijerItem."""
    print("\n📚 USAGE EXAMPLES")
    print("=" * 30)

    examples = [
        {
            "title": "Basic Item Creation",
            "code": """
# Create item with UPC only
item = MeijerItem.from_upc("629307040245", meijer_client=client)

# Data will be populated asynchronously when accessed
price = await item.populated_price
details = await item.populated_details
            """,
            "description": "Create an item with minimal info, let it populate data automatically",
        },
        {
            "title": "Factory Function",
            "code": """
# Use factory function for convenience
item = create_meijer_item("842595131277", meijer_client=client)

# Access populated data
price = await item.populated_price
            """,
            "description": "Use the factory function for cleaner syntax",
        },
        {
            "title": "Direct Instantiation",
            "code": """
# Create with full control
item = MeijerItem(
    id="custom_123",
    title="Custom Product",
    upc="123456789012",
    _meijer_client=client
)

# Populate data manually if needed
await item._populate_price_data()
            """,
            "description": "Full control over item creation and data population",
        },
        {
            "title": "Fallback Strategy",
            "code": """
# The system automatically tries multiple methods:
# 1. Search API (fastest)
# 2. Shop'n'Scan (medium speed)  
# 3. Cart operations (slowest but most accurate)

# Cart items are automatically removed after pricing
item = MeijerItem.from_upc("123456789012", meijer_client=client)
price = await item.populated_price  # Triggers fallback strategy
            """,
            "description": "Automatic fallback with cart cleanup",
        },
    ]

    for i, example in enumerate(examples, 1):
        print(f"\n{i}. {example['title']}")
        print(f"   {example['description']}")
        print("   Code:")
        print(f"   {example['code']}")


async def main():
    """Main demo function."""
    print("🎯 MEIJER ITEM ASYNC DEMONSTRATION")
    print("=" * 60)
    print("This demo shows the new async MeijerItem functionality with:")
    print("• Automatic data population using fallback methods")
    print("• Factory functions and class methods")
    print("• Cart cleanup after pricing retrieval")
    print("• Rich Jupyter notebook representations")
    print("=" * 60)

    # Run the main demo
    await demo_async_meijer_item()

    # Show usage examples
    await demo_usage_examples()

    print("\n✅ Demo completed!")
    print("\n💡 Key Benefits:")
    print("   • Items populate data automatically when accessed")
    print("   • Multiple fallback methods ensure data availability")
    print("   • Cart operations are cleaned up automatically")
    print("   • Rich representations for Jupyter notebooks")
    print("   • Pythonic design with decorators and async properties")


if __name__ == "__main__":
    # Run the demo
    asyncio.run(main())
