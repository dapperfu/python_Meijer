#!/usr/bin/env python3
"""
Simple Shopping List Demo

This demo shows basic shopping list functionality:
- Get current list
- Add items (string and UPC)
- Complete items
- Remove items
- Favorites management

Assumes ~/.config/meijer.txt exists with valid authentication.
"""

from meijer import Meijer


def main():
    print("Shopping List Demo")
    print("=" * 40)

    # Initialize client (auto-loads from ~/.config/meijer.txt)
    print("Initializing Meijer client...")
    m = Meijer()

    if not m.is_authenticated():
        print("❌ Not authenticated. Please check ~/.config/meijer.txt")
        return

    print("✅ Authenticated successfully!")
    print()

    # Get current shopping list
    print("🛒 Current Shopping List:")
    try:
        items = m.get_shopping_list()
        print(f"   Found {len(items)} items")
        if items:
            for item in items[:5]:
                status = "✅" if item.isComplete else "⏳"
                print(f"   {status} {item.itemDescription}")
        else:
            print("   No items in list")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Add a string item
    print("➕ Adding 'Milk' to shopping list:")
    try:
        success = m.add_to_shopping_list("Milk")
        print(f"   {'✅ Added successfully' if success else '❌ Failed to add'}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Add a UPC item
    print("➕ Adding Coca-Cola (UPC: 049000050103) to shopping list:")
    try:
        success = m.add_to_shopping_list("049000050103")
        print(f"   {'✅ Added successfully' if success else '❌ Failed to add'}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Get updated list
    print("🔄 Updated Shopping List:")
    try:
        items = m.get_shopping_list()
        print(f"   Found {len(items)} items")
        if items:
            for item in items[:5]:
                status = "✅" if item.isComplete else "⏳"
                print(f"   {status} {item.itemDescription}")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()

    # Test favorites
    print("⭐ Favorites:")
    try:
        favorites = m.list.get_favorites()
        print(f"   Found {len(favorites)} favorites")
        if favorites:
            for item in favorites[:3]:
                print(f"   • {item.itemDescription}")
        else:
            print("   No favorites yet")
    except Exception as e:
        print(f"   ❌ Error: {e}")

    print()
    print("✅ Shopping list demo completed!")


if __name__ == "__main__":
    main()
