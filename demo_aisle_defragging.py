#!/usr/bin/env python3
"""
Demo script showing how to use aisle information for defragging shopping lists.

This script demonstrates:
1. Creating MeijerItem objects with aisle information
2. Sorting items by aisle location
3. Grouping items by aisle
4. Creating optimized shopping routes
"""

import sys
import os
from typing import List, Dict, Any

# Add the parent directory to the path so we can import meijer
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from meijer_item import (
    MeijerItem, 
    create_meijer_item_from_product_api,
    sort_items_by_aisle,
    group_items_by_aisle
)


def create_sample_items_with_aisles() -> List[MeijerItem]:
    """Create sample MeijerItem objects with aisle information for demonstration."""
    
    # Sample product API responses with aisle information (using dash format from API)
    sample_products = [
        {
            "code": "4125010211",
            "ean": "4125010211",
            "name": "Meijer 2% Reduced Fat Milk, 1/2 Gallon",
            "price": {"value": 1.89, "formattedValue": "$1.89"},
            "stock": {
                "ilcPrimary": "B-16-31-2",
                "ilcs": ["B-16-31-2", "B-16-37-1", "B-16-37-2"]
            }
        },
        {
            "code": "4125010212",
            "ean": "4125010212", 
            "name": "Meijer Whole Milk, Gallon",
            "price": {"value": 2.49, "formattedValue": "$2.49"},
            "stock": {
                "ilcPrimary": "B-16-31-1",
                "ilcs": ["B-16-31-1", "B-16-37-3"]
            }
        },
        {
            "code": "4125010213",
            "ean": "4125010213",
            "name": "Meijer Chocolate Milk, 1/2 Gallon",
            "price": {"value": 2.19, "formattedValue": "$2.19"},
            "stock": {
                "ilcPrimary": "B-16-32-1",
                "ilcs": ["B-16-32-1"]
            }
        },
        {
            "code": "4125010214",
            "ean": "4125010214",
            "name": "Meijer Bread, White",
            "price": {"value": 1.29, "formattedValue": "$1.29"},
            "stock": {
                "ilcPrimary": "A-12-15-1",
                "ilcs": ["A-12-15-1", "A-12-16-2"]
            }
        },
        {
            "code": "4125010215",
            "ean": "4125010215",
            "name": "Meijer Eggs, Large Dozen",
            "price": {"value": 2.99, "formattedValue": "$2.99"},
            "stock": {
                "ilcPrimary": "B-16-30-1",
                "ilcs": ["B-16-30-1", "B-16-30-2"]
            }
        },
        {
            "code": "4125010216",
            "ean": "4125010216",
            "name": "Meijer Bananas, 1 lb",
            "price": {"value": 0.59, "formattedValue": "$0.59"},
            "stock": {
                "ilcPrimary": "A-10-05-1",
                "ilcs": ["A-10-05-1"]
            }
        },
        {
            "code": "4125010217",
            "ean": "4125010217",
            "name": "Meijer Apples, Gala, 3 lb bag",
            "price": {"value": 4.99, "formattedValue": "$4.99"},
            "stock": {
                "ilcPrimary": "A-10-06-1",
                "ilcs": ["A-10-06-1", "A-10-07-1"]
            }
        },
        {
            "code": "4125010218",
            "ean": "4125010218",
            "name": "Meijer Yogurt, Vanilla, 6 oz",
            "price": {"value": 0.89, "formattedValue": "$0.89"},
            "stock": {
                "ilcPrimary": "B-16-33-1",
                "ilcs": ["B-16-33-1", "B-16-33-2"]
            }
        },
        {
            "code": "4125010219",
            "ean": "4125010219",
            "name": "Meijer Cheese, Cheddar, 8 oz",
            "price": {"value": 2.99, "formattedValue": "$2.99"},
            "stock": {
                "ilcPrimary": "B-16-34-1",
                "ilcs": ["B-16-34-1"]
            }
        }
    ]
    
    # Create MeijerItem objects from the sample data
    items = []
    for product_data in sample_products:
        item = create_meijer_item_from_product_api(product_data)
        if item:
            items.append(item)
    
    return items


def demonstrate_improved_sorting(items: List[MeijerItem]) -> None:
    """Demonstrate the improved sorting with colon format."""
    print("🔧 **IMPROVED SORTING WITH COLON FORMAT**")
    print("=" * 60)
    
    print("The new colon format (B16:31) provides better sorting than dash format:")
    print()
    
    # Show the conversion from API format to display format
    print("API Format → Display Format → Sort Key:")
    print("-" * 50)
    
    for item in sorted(items, key=lambda x: x.aisle_sort_key):
        # Show the raw API format (from _raw_data)
        raw_ilc = item._raw_data.get('stock', {}).get('ilcPrimary', 'Unknown')
        display_format = item.aisle_display
        sort_key = item.aisle_sort_key
        
        print(f"{raw_ilc:<12} → {display_format:<25} → {sort_key}")
    
    print()
    print("✅ **Benefits of colon format:**")
    print("   • B16:023 sorts correctly after B16:022")
    print("   • B16:031 sorts correctly after B16:030")
    print("   • Consistent 3-character section numbers")
    print("   • Clear separation between aisle and section")
    print()


def demonstrate_aisle_sorting(items: List[MeijerItem]) -> None:
    """Demonstrate sorting items by aisle location."""
    print("🛒 **SORTING ITEMS BY AISLE FOR DEFRAGGING**")
    print("=" * 60)
    
    # Sort items by aisle
    sorted_items = sort_items_by_aisle(items)
    
    print("Items sorted by aisle location (optimal shopping order):")
    print()
    
    for i, item in enumerate(sorted_items, 1):
        aisle_display = item.aisle_display
        aisle_sort_key = item.aisle_sort_key
        print(f"{i:2d}. {aisle_display:<25} | {item.title}")
        print(f"     Sort Key: {aisle_sort_key:<12} | Price: ${item.price}")
        print()
    
    print("✅ **DEFRAGGING COMPLETE!** Items are now in optimal shopping order.")
    print()


def demonstrate_aisle_grouping(items: List[MeijerItem]) -> None:
    """Demonstrate grouping items by aisle."""
    print("🏪 **GROUPING ITEMS BY AISLE**")
    print("=" * 60)
    
    # Group items by aisle
    grouped_items = group_items_by_aisle(items)
    
    print("Items grouped by aisle location:")
    print()
    
    # Sort aisle keys for consistent display
    sorted_aisles = sorted(grouped_items.keys(), key=lambda x: (x[0], int(x[1:])))
    
    for aisle_key in sorted_aisles:
        items_in_aisle = grouped_items[aisle_key]
        print(f"📍 **Aisle {aisle_key[0]} | {aisle_key[1:]}** ({len(items_in_aisle)} items)")
        
        for item in items_in_aisle:
            print(f"   • {item.title}")
            print(f"     {item.aisle_display} | ${item.price}")
        
        print()
    
    print("✅ **GROUPING COMPLETE!** Items are organized by store location.")
    print()


def demonstrate_aisle_queries(items: List[MeijerItem]) -> None:
    """Demonstrate querying items by aisle."""
    print("🔍 **AISLE QUERY EXAMPLES**")
    print("=" * 60)
    
    # Example queries
    queries = [
        ("B", None, "All items in B aisle"),
        ("B", 16, "Items specifically in B-16"),
        ("A", None, "All items in A aisle"),
        ("A", 10, "Items specifically in A-10")
    ]
    
    for aisle_letter, aisle_number, description in queries:
        print(f"Query: {description}")
        
        matching_items = [
            item for item in items 
            if item.is_in_aisle(aisle_letter, aisle_number)
        ]
        
        if matching_items:
            for item in matching_items:
                print(f"   • {item.title} - {item.aisle_display}")
        else:
            print("   No items found")
        
        print()
    
    print("✅ **QUERY EXAMPLES COMPLETE!**")
    print()


def demonstrate_shopping_route(items: List[MeijerItem]) -> None:
    """Demonstrate creating an optimized shopping route."""
    print("🗺️ **OPTIMIZED SHOPPING ROUTE**")
    print("=" * 60)
    
    # Sort items by aisle for optimal route
    sorted_items = sort_items_by_aisle(items)
    
    print("Your optimized shopping route:")
    print()
    
    current_aisle = None
    total_cost = 0.0
    
    for i, item in enumerate(sorted_items, 1):
        # Check if we're moving to a new aisle
        if item.aisle_letter != current_aisle:
            if current_aisle is not None:
                print(f"   └── End of Aisle {current_aisle}")
                print()
            current_aisle = item.aisle_letter
            print(f"📍 **Aisle {current_aisle}**")
        
        print(f"   {i:2d}. {item.title}")
        print(f"       {item.aisle_display} | ${item.price}")
        total_cost += item.price
    
    if current_aisle:
        print(f"   └── End of Aisle {current_aisle}")
    
    print()
    print(f"💰 **Total Shopping Cost: ${total_cost:.2f}**")
    print("✅ **Route optimized for minimal walking!**")
    print()


def main():
    """Main demonstration function."""
    print("🚀 **MEIJER AISLE DEFRAGGING DEMONSTRATION**")
    print("=" * 60)
    print()
    print("This demo shows how to use aisle information from the Meijer API")
    print("to optimize shopping lists and create efficient store routes.")
    print()
    
    # Create sample items with aisle information
    print("📦 Creating sample items with aisle information...")
    items = create_sample_items_with_aisles()
    print(f"✅ Created {len(items)} sample items")
    print()
    
    # Demonstrate various aisle-based operations
    demonstrate_improved_sorting(items)
    demonstrate_aisle_sorting(items)
    demonstrate_aisle_grouping(items)
    demonstrate_aisle_queries(items)
    demonstrate_shopping_route(items)
    
    print("🎉 **DEMONSTRATION COMPLETE!**")
    print()
    print("Key benefits of aisle-based defragging:")
    print("• Minimize walking distance in the store")
    print("• Group related items together")
    print("• Create efficient shopping routes")
    print("• Reduce shopping time and frustration")
    print()
    print("The aisle information comes from the stock.ilcs field in the")
    print("product API response, which provides precise location data.")


if __name__ == "__main__":
    main() 