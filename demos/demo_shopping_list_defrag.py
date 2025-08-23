#!/usr/bin/env python3
"""
Comprehensive demo of Meijer shopping list defrag functionality.

This script demonstrates:
1. Clearing the current shopping list
2. Populating it with random grocery items
3. Running the defrag to organize items by aisle
4. Showing the optimized shopping route
"""

import time

from meijer import Meijer


def clear_shopping_list(client):
    """Clear all items from the shopping list."""
    print("🗑️ **CLEARING SHOPPING LIST**")
    print("=" * 50)

    try:
        # Get current items
        current_items = client.shopping_list.get()
        print(f"Found {len(current_items)} items in current shopping list")

        if not current_items:
            print("✅ Shopping list is already empty")
            return True

        # Delete all items
        print("Deleting all items...")
        deleted_count = 0
        for item in current_items:
            if client.shopping_list.delete_item(str(item.list_item_id)):
                deleted_count += 1
                print(f"   ✅ Deleted: {item.name}")
            else:
                print(f"   ❌ Failed to delete: {item.name}")

        print(f"✅ Successfully deleted {deleted_count} items")

        # Verify list is empty
        remaining_items = client.shopping_list.get()
        print(f"Items remaining: {len(remaining_items)}")

        return True

    except Exception as e:
        print(f"❌ Error clearing shopping list: {e}")
        return False


def populate_shopping_list(client):
    """Populate the shopping list with random grocery items."""
    print("\n🛒 **POPULATING SHOPPING LIST**")
    print("=" * 50)

    # Random grocery items with realistic descriptions
    grocery_items = [
        {
            "name": "Milk",
            "description": "Meijer Whole Milk, 1 Gallon",
            "upc": "4125010211",
        },
        {
            "name": "Bread",
            "description": "Meijer Wheat Bread, 20 oz",
            "upc": "4125010212",
        },
        {
            "name": "Eggs",
            "description": "Meijer Large Eggs, Dozen",
            "upc": "4125010213",
        },
        {
            "name": "Ground Turkey",
            "description": "Meijer Ground Turkey, 1 lb",
            "upc": "4125010214",
        },
        {
            "name": "Chips",
            "description": "Lay's Classic Potato Chips, 8 oz",
            "upc": "4125010215",
        },
        {
            "name": "Cookies",
            "description": "Oreo Chocolate Sandwich Cookies, 14.3 oz",
            "upc": "4125010216",
        },
        {"name": "Bananas", "description": "Fresh Bananas, 1 lb", "upc": "4125010217"},
        {"name": "Apples", "description": "Gala Apples, 3 lb bag", "upc": "4125010218"},
        {
            "name": "Yogurt",
            "description": "Meijer Vanilla Yogurt, 6 oz",
            "upc": "4125010219",
        },
        {
            "name": "Cheese",
            "description": "Meijer Cheddar Cheese, 8 oz",
            "upc": "4125010220",
        },
        {
            "name": "Cereal",
            "description": "Cheerios Honey Nut, 12.8 oz",
            "upc": "4125010221",
        },
        {
            "name": "Pasta",
            "description": "Barilla Spaghetti, 16 oz",
            "upc": "4125010222",
        },
        {
            "name": "Tomato Sauce",
            "description": "Hunt's Tomato Sauce, 8 oz",
            "upc": "4125010223",
        },
        {
            "name": "Onions",
            "description": "Yellow Onions, 3 lb bag",
            "upc": "4125010224",
        },
        {
            "name": "Potatoes",
            "description": "Russet Potatoes, 5 lb bag",
            "upc": "4125010225",
        },
    ]

    print(f"Adding {len(grocery_items)} items to shopping list...")

    added_count = 0
    for i, item in enumerate(grocery_items, 1):
        try:
            success = client.shopping_list.add_item_with_details(
                upc=item["upc"],
                quantity=1,
                description=item["description"],
                notes=f"Added by demo script - {item['name']}",
                display_order=i,
            )

            if success:
                added_count += 1
                print(f"   ✅ {i:2d}. {item['name']} - {item['description']}")
            else:
                print(f"   ❌ {i:2d}. Failed to add {item['name']}")

            # Small delay to avoid overwhelming the API
            time.sleep(0.5)

        except Exception as e:
            print(f"   ❌ {i:2d}. Error adding {item['name']}: {e}")

    print(f"\n✅ Successfully added {added_count} items to shopping list")

    # Verify items were added
    current_items = client.shopping_list.get()
    print(f"Total items in shopping list: {len(current_items)}")

    return added_count > 0


def demonstrate_defrag(client):
    """Demonstrate the defrag functionality."""
    print("\n🔧 **DEMONSTRATING DEFRAG FUNCTIONALITY**")
    print("=" * 50)

    try:
        print("Starting shopping list defrag...")
        print("This will:")
        print("1. Search for each item to find store location")
        print("2. Sort items by aisle number")
        print("3. Recreate the list with location information")
        print("4. Add aisle and section details to item notes")
        print()

        # Run the defrag
        start_time = time.time()
        result = client.shopping_list.defrag()
        end_time = time.time()

        print(f"⏱️  Defrag completed in {end_time - start_time:.1f} seconds")
        print(f"🎯 Defrag result: {'Success' if result else 'Failed'}")

        if result:
            print("✅ Shopping list has been optimized for efficient shopping!")
        else:
            print("❌ Defrag encountered some issues")

        return result

    except Exception as e:
        print(f"❌ Error during defrag demonstration: {e}")
        return False


def show_optimized_list(client):
    """Show the optimized shopping list after defrag."""
    print("\n📋 **OPTIMIZED SHOPPING LIST**")
    print("=" * 50)

    try:
        # Get the optimized list
        items = client.shopping_list.get()

        if not items:
            print("❌ No items found in shopping list")
            return

        print(f"Found {len(items)} items in optimized shopping list:")
        print()

        # Group items by aisle if possible
        current_aisle = None
        total_cost = 0.0

        for i, item in enumerate(items, 1):
            # Check if we have aisle information in notes
            notes = item.notes or ""
            aisle_info = "Unknown Location"

            # Extract aisle information from notes
            if "Aisle:" in notes:
                aisle_parts = notes.split("|")
                for part in aisle_parts:
                    if "Aisle:" in part:
                        aisle_info = part.strip()
                        break

            # Check if we're moving to a new aisle
            if aisle_info != current_aisle:
                if current_aisle is not None:
                    print(f"   └── End of {current_aisle}")
                    print()
                current_aisle = aisle_info
                print(f"📍 **{current_aisle}**")

            print(f"   {i:2d}. {item.name}")
            print(f"       {item.item_description}")
            print(f"       Quantity: {item.quantity}")
            if item.notes:
                print(f"       Notes: {item.notes}")
            print()

        if current_aisle:
            print(f"   └── End of {current_aisle}")

        print("✅ **Shopping route optimized for minimal walking!**")

    except Exception as e:
        print(f"❌ Error showing optimized list: {e}")


def main():
    """Main demonstration function."""
    print("🚀 **MEIJER SHOPPING LIST DEFRAG DEMONSTRATION**")
    print("=" * 60)
    print()
    print("This demo will:")
    print("1. Clear your current shopping list")
    print("2. Add 15 random grocery items")
    print("3. Run the defrag to organize by aisle")
    print("4. Show the optimized shopping route")
    print()

    try:
        # Initialize client
        print("🔐 Initializing Meijer client...")
        client = Meijer(auth="~/.config/meijer/auth.json")

        if not client.is_authenticated():
            print("❌ Failed to authenticate. Please check your ~/.config/meijer/auth.json file.")
            return

        print("✅ Successfully authenticated with Meijer!")
        print()

        # Step 1: Clear the shopping list
        if not clear_shopping_list(client):
            print("❌ Failed to clear shopping list. Stopping demo.")
            return

        # Step 2: Populate with random items
        if not populate_shopping_list(client):
            print("❌ Failed to populate shopping list. Stopping demo.")
            return

        # Step 3: Demonstrate defrag
        if not demonstrate_defrag(client):
            print("❌ Defrag demonstration failed.")
            return

        # Step 4: Show optimized list
        show_optimized_list(client)

        print("\n🎉 **DEMONSTRATION COMPLETE!**")
        print()
        print("Your shopping list has been optimized with:")
        print("• Items organized by aisle location")
        print("• Location information in item notes")
        print("• Optimal shopping route for minimal walking")
        print("• Enhanced product matching and confidence levels")

    except Exception as e:
        print(f"❌ Unexpected error during demonstration: {e}")


if __name__ == "__main__":
    main()
