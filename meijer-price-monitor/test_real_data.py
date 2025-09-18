#!/usr/bin/env python3
"""
Test script to verify real Meijer data collection for price monitoring.
"""

import sys
from pathlib import Path

# Add the parent directory to find the core Meijer API
project_root = Path(__file__).parent
parent_dir = project_root.parent
sys.path.insert(0, str(parent_dir))

try:
    from meijer import Meijer
    from meijer.search import Search

    print("✅ Meijer API imported successfully")

    # Initialize client
    client = Meijer()
    print(f"Auth status: {client.auth_status.name}")

    if client.auth_status.name == "AUTHENTICATED":
        print("✅ Authentication successful")

        # Test search functionality
        print("\n🔍 Testing LEGO search...")
        search = Search(client)

        # Search for LEGO products
        results = search.search("LEGO", results_per_page=5)

        if results and results.results:
            print(f"✅ Found {len(results.results)} LEGO products:")
            for i, product in enumerate(results.results[:3], 1):
                print(f"  {i}. {product.title}")
                print(f"     UPC: {product.upc}")
                print(f"     Price: ${product.price}")
                print(f"     Store: {getattr(product, 'store_name', 'Unknown')}")
                print()
        else:
            print("❌ No LEGO products found")

        # Test adding to shopping list to get price
        print("\n🔍 Testing shopping list price lookup...")
        if results and results.results:
            first_product = results.results[0]
            if first_product.upc:
                try:
                    # Try adding to shopping list to get price
                    print(f"Adding {first_product.title} to shopping list...")
                    success = client.shopping_list.add_item_with_details(
                        upc=first_product.upc,
                        quantity=1,
                        description=first_product.title,
                    )

                    if success:
                        print("✅ Item added to shopping list")

                        # Get the shopping list to see the price
                        items = client.shopping_list.get()
                        print(f"Shopping list has {len(items)} items:")
                        for i, item in enumerate(items):
                            price_attr = getattr(
                                item, "unit_price", getattr(item, "price", "N/A")
                            )
                            print(
                                f"  {i + 1}. {item.name} (UPC: {item.item_part_number}, Price: ${price_attr})"
                            )

                        # Look for our item
                        for item in items:
                            if item.item_part_number == first_product.upc:
                                price_attr = getattr(
                                    item, "unit_price", getattr(item, "price", "N/A")
                                )
                                print("✅ Found item in shopping list:")
                                print(f"   Name: {item.name}")
                                print(f"   Price: ${price_attr}")
                                print(f"   UPC: {item.item_part_number}")
                                break
                        else:
                            print("❌ Item not found in shopping list")
                    else:
                        print("❌ Failed to add item to shopping list")

                except Exception as e:
                    print(f"❌ Error adding to shopping list: {e}")

    else:
        print("❌ Authentication failed")

except ImportError as e:
    print(f"❌ Import error: {e}")
except Exception as e:
    print(f"❌ Error: {e}")
