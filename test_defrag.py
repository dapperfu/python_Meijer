#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Test script for shopping list defrag functionality
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Test Shopping List Defrag Functionality
======================================

This script demonstrates the shopping list defrag feature that organizes items by aisle.
"""

import logging
import sys
from typing import List, Optional

# Set up logging
logging.basicConfig(level=logging.INFO, format='%(levelname)s: %(message)s')
logger = logging.getLogger(__name__)

def test_defrag() -> None:
    """
    Test the shopping list defrag functionality.
    
    This function demonstrates how the defrag feature works by:
    1. Connecting to Meijer API
    2. Getting current shopping list
    3. Running defrag to organize by aisle
    4. Showing results
    """
    try:
        # Import the Meijer client
        from meijer import Meijer
        
        print("🚀 Testing Shopping List Defrag Functionality")
        print("=" * 60)
        
        # Initialize client
        print("🔌 Connecting to Meijer API...")
        client = Meijer()
        
        # Check authentication
        if client.auth_status.name != "AUTHENTICATED":
            print("❌ Authentication failed!")
            print("   Please ensure you have auth.txt or ~/.config/meijer.txt configured")
            return
            
        print("✅ Successfully authenticated!")
        
        # Get current shopping list
        print("\n📋 Getting current shopping list...")
        current_items = client.list.get()
        
        if not current_items:
            print("📝 Shopping list is empty!")
            print("\n🛒 To test defrag, add some items first:")
            print("   • Use the Meijer app")
            print("   • Or use: client.list.add_item_with_details('UPC', description='Item Name')")
            return
            
        print(f"📊 Found {len(current_items)} items in shopping list")
        
        # Show current items
        print("\n📄 Current items (before defrag):")
        for i, item in enumerate(current_items, 1):
            notes_preview = item.notes[:30] + "..." if item.notes and len(item.notes) > 30 else item.notes or "None"
            print(f"  {i:2d}. {item.name:<25} | Qty: {item.quantity} | Notes: {notes_preview}")
        
        # Run defrag
        print(f"\n🔧 Running defrag on {len(current_items)} items...")
        print("⏳ This may take a moment to search for locations...")
        
        defrag_success = client.list.defrag()
        
        if not defrag_success:
            print("❌ Defrag failed!")
            return
            
        print("✅ Defrag completed successfully!")
        
        # Get defragged list
        print("\n📋 Getting defragged shopping list...")
        defragged_items = client.list.get()
        
        if not defragged_items:
            print("❌ No items found after defrag!")
            return
            
        print(f"📊 Found {len(defragged_items)} items in defragged list")
        
        # Show defragged items
        print("\n📄 Defragged items (organized by aisle):")
        
        items_with_aisle = 0
        aisle_summary = {}
        
        for i, item in enumerate(defragged_items, 1):
            # Extract aisle info
            aisle_info = "Unknown"
            if item.notes and "Aisle:" in item.notes:
                try:
                    aisle_part = item.notes.split("Aisle:")[1].split("|")[0].strip()
                    aisle_info = aisle_part
                    items_with_aisle += 1
                    
                    # Track aisle summary
                    if aisle_info not in aisle_summary:
                        aisle_summary[aisle_info] = 0
                    aisle_summary[aisle_info] += 1
                except:
                    pass
            
            notes_preview = item.notes[:40] + "..." if item.notes and len(item.notes) > 40 else item.notes or "None"
            print(f"  {i:2d}. {item.name:<25} | Aisle: {aisle_info:<8} | Qty: {item.quantity}")
            print(f"      Notes: {notes_preview}")
        
        # Show summary
        print(f"\n📊 Defrag Summary:")
        print(f"   Total items: {len(defragged_items)}")
        print(f"   Items with aisle info: {items_with_aisle}")
        print(f"   Location coverage: {(items_with_aisle/len(defragged_items)*100):.1f}%")
        
        if aisle_summary:
            print(f"\n🏪 Items by aisle:")
            # Sort aisles intelligently
            sorted_aisles = sorted(aisle_summary.items(), key=lambda x: (x[0] == 'Unknown', x[0]))
            for aisle, count in sorted_aisles:
                print(f"   📍 Aisle {aisle}: {count} item(s)")
        
        print(f"\n🎉 Defrag test completed successfully!")
        print(f"💡 Your shopping list is now organized for efficient store navigation!")
        
    except ImportError:
        print("❌ Meijer package not found!")
        print("   Please install: pip install -e .")
    except Exception as e:
        logger.error(f"Test failed: {e}")
        print(f"❌ Test failed: {e}")


def demo_defrag_api() -> None:
    """
    Demonstrate the defrag API usage.
    
    Shows the simple API calls for using the defrag functionality.
    """
    print("\n" + "=" * 60)
    print("🔧 Defrag API Usage Examples")
    print("=" * 60)
    
    api_examples = """
# Basic defrag (uses current/default store)
client.list.defrag()

# Defrag for specific store
client.list.defrag(store_id="123")

# Check the result
organized_items = client.list.get()

# Add items with custom details (useful before defrag)
client.list.add_item_with_details(
    upc="123456789",
    description="Organic Bananas", 
    quantity=2,
    notes="Prefer yellow ones"
)
"""
    
    print("📝 Python API Examples:")
    print(api_examples)
    
    print("💡 Usage Tips:")
    print("   • Run defrag after adding multiple items")
    print("   • Use store_id for most accurate locations")
    print("   • Check item notes for aisle/section info")
    print("   • Defrag preserves quantities and completion status")


if __name__ == "__main__":
    # Run the defrag test
    test_defrag()
    
    # Show API examples
    demo_defrag_api()
    
    print("\n✨ Happy organized shopping! ✨") 