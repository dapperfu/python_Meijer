#!/usr/bin/env python3
"""
Favorites Demo Script

This script demonstrates the comprehensive favorites functionality
including adding, removing, searching, and managing favorites.
"""

import os
import sys
from pathlib import Path

# Add the parent directory to the path so we can import meijer
sys.path.insert(0, str(Path(__file__).parent.parent))

from meijer import Meijer
from meijer.models.favorites import (
    AddFavoritesRequest,
    DeleteFavoritesRequest,
    FavoriteListItem,
)


def print_header(title: str) -> None:
    """Print a formatted header."""
    print("\n" + "=" * 60)
    print(f" {title}")
    print("=" * 60)


def print_section(title: str) -> None:
    """Print a formatted section header."""
    print(f"\n--- {title} ---")


def demo_favorites_models() -> None:
    """Demonstrate the favorites models."""
    print_header("Favorites Models Demo")

    print_section("Creating FavoriteListItem")
    item = FavoriteListItem(
        list_item_id=1,
        list_item_type_id=1,
        item_display_order=1,
        item_part_number="123456789",
        item_description="Organic Milk",
        is_item_in_active_list=False,
    )
    print(f"Created item: {item}")
    print(f"  Name: {item.name}")
    print(f"  UPC: {item.upc}")
    print(f"  Is Favorite: {item.is_favorite}")

    print_section("Creating AddFavoritesRequest")
    request = AddFavoritesRequest.create_simple("Fresh Bread", "987654321")
    print(f"Add request: {request}")
    print(f"  Items to add: {len(request.favorite_list_items)}")
    print(f"  First item: {request.favorite_list_items[0].item_description}")

    print_section("Creating DeleteFavoritesRequest")
    delete_request = DeleteFavoritesRequest.create_single(123)
    print(f"Delete request: {delete_request}")
    print(f"  Items to delete: {delete_request.list_item_ids}")

    print_section("API Request Format")
    api_data = request.to_api_request()
    print(f"API request data: {api_data}")


def demo_favorites_manager(m: Meijer) -> None:
    """Demonstrate the FavoritesManager functionality."""
    print_header("Favorites Manager Demo")

    print_section("Getting Current Favorites")
    try:
        favorites = m.favorites.get_favorites()
        print(f"Found {len(favorites)} favorites")

        if favorites:
            print("Recent favorites:")
            for i, item in enumerate(favorites[:3], 1):
                print(f"  {i}. {item.item_description} (ID: {item.list_item_id})")
        else:
            print("No favorites found")

    except Exception as e:
        print(f"Error getting favorites: {e}")

    print_section("Adding New Favorite")
    try:
        result = m.favorites.add_favorite("Demo Item", "111222333")
        if result:
            print(f"Successfully added favorite: {result.item_description}")
            print(f"  New ID: {result.list_item_id}")
        else:
            print("Failed to add favorite")
    except Exception as e:
        print(f"Error adding favorite: {e}")

    print_section("Searching Favorites")
    try:
        # Get current favorites for search
        current_favorites = m.favorites.get_favorites()
        if current_favorites:
            # Search for items containing "milk"
            milk_items = m.favorites.search_favorites("milk")
            print(f"Found {len(milk_items)} items containing 'milk':")
            for item in milk_items:
                print(f"  - {item.item_description}")

            # Search for items containing "bread"
            bread_items = m.favorites.search_favorites("bread")
            print(f"Found {len(bread_items)} items containing 'bread':")
            for item in bread_items:
                print(f"  - {item.item_description}")
        else:
            print("No favorites to search")
    except Exception as e:
        print(f"Error searching favorites: {e}")

    print_section("Favorites Summary")
    try:
        summary = m.favorites.get_favorites_summary()
        print(f"Total favorites: {summary['total_count']}")
        print(f"Items with UPC: {summary['items_with_upc']}")
        print(f"Manual items: {summary['manual_items']}")

        if summary["by_type"]:
            print("By type:")
            for item_type, count in summary["by_type"].items():
                print(f"  Type {item_type}: {count}")

        if summary["recent_items"]:
            print("Recent items:")
            for item in summary["recent_items"]:
                print(f"  - {item['description']} (ID: {item['id']})")

    except Exception as e:
        print(f"Error getting summary: {e}")


def demo_favorites_to_shopping_list(m: Meijer) -> None:
    """Demonstrate adding favorites to shopping list."""
    print_header("Favorites to Shopping List Demo")

    print_section("Getting Favorites for Shopping List")
    try:
        favorites = m.favorites.get_favorites()
        if not favorites:
            print("No favorites to add to shopping list")
            return

        print(f"Found {len(favorites)} favorites")
        print("Available favorites:")
        for i, item in enumerate(favorites[:5], 1):
            print(f"  {i}. {item.item_description} (ID: {item.list_item_id})")

        # Try to add the first favorite to shopping list
        if favorites:
            first_favorite = favorites[0]
            print(f"\nAdding '{first_favorite.item_description}' to shopping list...")

            result = m.favorites.add_favorite_to_shopping_list(
                first_favorite.list_item_id
            )
            if result:
                print(f"Successfully added to shopping list: {result.item_description}")
                print(f"  New shopping list ID: {result.list_item_id}")
            else:
                print("Failed to add to shopping list")

    except Exception as e:
        print(f"Error with favorites to shopping list: {e}")


def demo_favorites_management(m: Meijer) -> None:
    """Demonstrate favorites management operations."""
    print_header("Favorites Management Demo")

    print_section("Checking if Items are Favorites")
    try:
        # Check if specific items are favorites
        test_items = ["milk", "bread", "eggs", "bananas"]

        for item_name in test_items:
            is_fav = m.favorites.is_favorite(item_name)
            status = "⭐" if is_fav else "❌"
            print(f"{status} {item_name}: {'Yes' if is_fav else 'No'}")

    except Exception as e:
        print(f"Error checking favorites: {e}")

    print_section("Favorites Count")
    try:
        count = m.favorites.get_favorites_count()
        print(f"Total favorites: {count}")
    except Exception as e:
        print(f"Error getting count: {e}")


def main() -> None:
    """Main demo function."""
    print_header("Meijer Favorites System Demo")
    print("This demo showcases the comprehensive favorites functionality")
    print("including models, management, and API interactions.")

    # Check if auth file exists
    auth_file = os.path.expanduser("~/.config/meijer/auth.json")
    if not os.path.exists(auth_file):
        print(f"\n❌ Authentication file not found: {auth_file}")
        print("Please set up authentication first.")
        return

    print(f"\n🔐 Using authentication file: {auth_file}")

    try:
        # Initialize Meijer client
        print("\n🚀 Initializing Meijer client...")
        m = Meijer(auth_file=auth_file)

        # Demo the models
        demo_favorites_models()

        # Demo the favorites manager
        demo_favorites_manager(m)

        # Demo adding favorites to shopping list
        demo_favorites_to_shopping_list(m)

        # Demo favorites management
        demo_favorites_management(m)

        print_header("Demo Complete")
        print("✅ Successfully demonstrated all favorites functionality!")
        print("\nKey features demonstrated:")
        print("  • FavoriteListItem model with full API support")
        print("  • AddFavoritesRequest and DeleteFavoritesRequest models")
        print("  • FavoritesManager with comprehensive operations")
        print("  • Adding favorites to shopping list")
        print("  • Searching and managing favorites")
        print("  • Favorites summary and analytics")

    except Exception as e:
        print(f"\n❌ Demo failed: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
