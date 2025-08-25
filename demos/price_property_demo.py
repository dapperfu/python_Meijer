#!/usr/bin/env python3
"""
Demo script showing the different price property behaviors.

This demonstrates:
1. Automatic background population when accessing item.price
2. Explicit async population with await item.populated_price
3. Force refresh with await item.force_refresh_price
"""

import asyncio
import logging
from meijer.models import create_meijer_item

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


async def demo_price_properties():
    """Demonstrate the different price property behaviors."""
    print("💰 PRICE PROPERTY DEMO")
    print("=" * 50)
    
    try:
        from meijer import Meijer
        
        print("1. 🔐 Initializing Meijer client...")
        client = Meijer()
        
        if not client.is_authenticated():
            print("   ❌ Authentication failed - using mock demo")
            await demo_mock_price_properties()
            return
        
        print("   ✅ Client authenticated successfully!")
        
        # Test UPC from the analysis
        test_upc = "629307040245"
        
        print(f"\n2. 🏷️ Creating item for UPC: {test_upc}")
        item = create_meijer_item(test_upc, meijer_client=client)
        print(f"   Created: {item}")
        
        print("\n3. 🔍 Testing different price access methods...")
        
        # Method 1: Direct price access (triggers background population)
        print("\n   📊 Method 1: item.price (background population)")
        print(f"      Initial price: {item.price}")
        print("      Note: This triggers background population automatically")
        
        # Wait a bit for background population
        print("      Waiting 2 seconds for background population...")
        await asyncio.sleep(2)
        
        print(f"      Price after background population: {item.price}")
        
        # Method 2: Explicit async population
        print("\n   ⚡ Method 2: await item.populated_price (explicit)")
        print("      This ensures data is populated before proceeding")
        populated_price = await item.populated_price
        print(f"      Populated price: {populated_price}")
        
        # Method 3: Force refresh
        print("\n   🔄 Method 3: await item.force_refresh_price (refresh)")
        print("      This ignores cached data and gets fresh information")
        refreshed_price = await item.force_refresh_price
        print(f"      Refreshed price: {refreshed_price}")
        
        print("\n4. 📋 Summary of Price Properties")
        print("   • item.price: Automatic background population")
        print("   • await item.populated_price: Explicit population")
        print("   • await item.force_refresh_price: Force refresh")
        
        print("\n5. 💡 When to Use Each Method")
        print("   • item.price: When you want background population (non-blocking)")
        print("   • await item.populated_price: When you need data before proceeding")
        print("   • await item.force_refresh_price: When you need latest data")
        
    except Exception as e:
        print(f"❌ Demo failed: {e}")
        logger.exception("Demo error")


async def demo_mock_price_properties():
    """Demonstrate price properties with mock items."""
    print("\n📋 MOCK PRICE PROPERTY DEMO")
    print("-" * 30)
    
    try:
        from meijer.models import MeijerItem
        
        # Create mock item without client
        item = MeijerItem.from_upc("123456789012")
        print(f"   Created mock item: {item}")
        
        print("\n   Testing price properties without client:")
        print(f"   • item.price: {item.price}")
        print("   • No background population (no client)")
        print("   • No async methods available")
        
    except Exception as e:
        print(f"   ❌ Mock demo failed: {e}")


async def demo_usage_patterns():
    """Show common usage patterns."""
    print("\n📚 COMMON USAGE PATTERNS")
    print("=" * 30)
    
    patterns = [
        {
            "title": "Lazy Loading (Non-blocking)",
            "code": '''
# Create item and access price immediately
item = create_meijer_item("629307040245", meijer_client=client)
print(f"Price: {item.price}")  # May be None initially

# Do other work while price loads in background
await some_other_operation()

# Check if price is now available
if item.price is not None:
    print(f"Price loaded: {item.price}")
            ''',
            "description": "Use when you don't need the price immediately"
        },
        {
            "title": "Explicit Population (Blocking)",
            "code": '''
# Create item and wait for price
item = create_meijer_item("629307040245", meijer_client=client)
price = await item.populated_price  # Waits for data

# Now you can be sure price is available
print(f"Price: {price}")
            ''',
            "description": "Use when you need the price before proceeding"
        },
        {
            "title": "Force Refresh (Latest Data)",
            "code": '''
# Get latest pricing information
item = create_meijer_item("629307040245", meijer_client=client)
latest_price = await item.force_refresh_price  # Ignores cache

# Use the fresh data
print(f"Latest price: {latest_price}")
            ''',
            "description": "Use when you need the most current data"
        },
        {
            "title": "Batch Processing",
            "code": '''
# Create multiple items
upcs = ["629307040245", "842595131277", "822279082910"]
items = [create_meijer_item(upc, meijer_client=client) for upc in upcs]

# Trigger background population for all
for item in items:
    _ = item.price  # Triggers background population

# Wait for all to complete
await asyncio.gather(*[item.populated_price for item in items])

# Now all items have prices
for item in items:
    print(f"{item.upc}: ${item.price}")
            ''',
            "description": "Efficient batch processing with background population"
        }
    ]
    
    for i, pattern in enumerate(patterns, 1):
        print(f"\n{i}. {pattern['title']}")
        print(f"   {pattern['description']}")
        print("   Code:")
        print(f"   {pattern['code']}")


async def main():
    """Main demo function."""
    print("🎯 PRICE PROPERTY BEHAVIOR DEMONSTRATION")
    print("=" * 60)
    print("This demo shows how the different price properties work:")
    print("• Automatic background population with item.price")
    print("• Explicit async population with await item.populated_price")
    print("• Force refresh with await item.force_refresh_price")
    print("=" * 60)
    
    # Run the main demo
    await demo_price_properties()
    
    # Show usage patterns
    await demo_usage_patterns()
    
    print("\n✅ Demo completed!")
    print("\n💡 Key Points:")
    print("   • item.price automatically triggers background population")
    print("   • Use await item.populated_price when you need data immediately")
    print("   • Use await item.force_refresh_price for latest data")
    print("   • Background population is non-blocking and efficient")


if __name__ == "__main__":
    # Run the demo
    asyncio.run(main())
