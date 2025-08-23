#!/usr/bin/env python3
"""
Demo script showing how to use the new setter methods for MeijerSearchItem.

This demonstrates the proper way to set item states:
- item.favorite = True/False
- item.list = True/False  
- item.cart = True/False
- item.cart_quantity = <number>
"""

from meijer.client import Meijer
from meijer.models.items import MeijerItem


def demo_item_state_management():
    """Demonstrate item state management using setter methods."""
    
    print("🔍 MeijerSearchItem State Management Demo")
    print("=" * 50)
    
    # Initialize client
    client = Meijer()
    print("✅ Client initialized")
    
    # Create a sample item
    item = MeijerItem(
        id="demo_item_123",
        title="LEGO Jurassic World T. rex River Escape 76975",
        upc="629307040245",
        price=49.99,
        _meijer_client=client
    )
    
    print(f"\n📦 Created item: {item.title}")
    print(f"   ID: {item.id}")
    print(f"   UPC: {item.upc}")
    print(f"   Price: ${item.price}")
    
    # Show initial state
    print(f"\n📊 Initial State:")
    state = item.get_state_summary()
    for key, value in state.items():
        if key not in ['id', 'title', 'price']:
            print(f"   {key}: {value}")
    
    # Demo 1: Mark as favorite
    print(f"\n⭐ Demo 1: Mark as Favorite")
    print("   Setting item.favorite = True")
    item.favorite = True
    print(f"   Favorite status: {item.favorite}")
    
    # Demo 2: Add to shopping list
    print(f"\n📝 Demo 2: Add to Shopping List")
    print("   Setting item.list = True")
    item.list = True
    print(f"   List status: {item.list}")
    
    # Demo 3: Add to cart
    print(f"\n🛒 Demo 3: Add to Cart")
    print("   Setting item.cart = True")
    item.cart = True
    print(f"   Cart status: {item.cart}")
    print(f"   Cart quantity: {item.cart_quantity}")
    
    # Demo 4: Update cart quantity
    print(f"\n🔢 Demo 4: Update Cart Quantity")
    print("   Setting item.cart_quantity = 3")
    item.cart_quantity = 3
    print(f"   Cart quantity: {item.cart_quantity}")
    print(f"   Cart status: {item.cart}")
    
    # Demo 5: Remove from favorites
    print(f"\n❌ Demo 5: Remove from Favorites")
    print("   Setting item.favorite = False")
    item.favorite = False
    print(f"   Favorite status: {item.favorite}")
    
    # Demo 6: Remove from list
    print(f"\n🗑️ Demo 6: Remove from Shopping List")
    print("   Setting item.list = False")
    item.list = False
    print(f"   List status: {item.list}")
    
    # Demo 7: Remove from cart
    print(f"\n🚫 Demo 7: Remove from Cart")
    print("   Setting item.cart = False")
    item.cart = False
    print(f"   Cart status: {item.cart}")
    print(f"   Cart quantity: {item.cart_quantity}")
    
    # Demo 8: Set cart quantity to 0 (removes from cart)
    print(f"\n🔄 Demo 8: Set Cart Quantity to 0")
    print("   Setting item.cart_quantity = 0")
    item.cart_quantity = 0
    print(f"   Cart status: {item.cart}")
    print(f"   Cart quantity: {item.cart_quantity}")
    
    # Demo 9: Use update_state method
    print(f"\n🔄 Demo 9: Use update_state Method")
    print("   Updating multiple states at once")
    item.update_state(
        favorite=True,
        in_list=True,
        in_cart=True,
        cart_quantity=2
    )
    print(f"   Updated state:")
    state = item.get_state_summary()
    for key, value in state.items():
        if key not in ['id', 'title', 'price']:
            print(f"     {key}: {value}")
    
    # Final state summary
    print(f"\n📊 Final State Summary:")
    final_state = item.get_state_summary()
    for key, value in final_state.items():
        print(f"   {key}: {value}")
    
    print(f"\n✨ Demo completed!")
    print(f"\n💡 Key Points:")
    print(f"   • Use item.favorite = True/False to mark/unmark favorites")
    print(f"   • Use item.list = True/False to add/remove from shopping list")
    print(f"   • Use item.cart = True/False to add/remove from cart")
    print(f"   • Use item.cart_quantity = <number> to set cart quantity")
    print(f"   • Use item.update_state() to update multiple states at once")
    print(f"   • Use item.get_state_summary() to see current state")


if __name__ == "__main__":
    demo_item_state_management()
