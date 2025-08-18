#!/usr/bin/env python3
"""
Test script for the updated defrag functionality.
"""

from meijer import Meijer

def test_defrag():
    """Test the defrag functionality."""
    try:
        # Initialize client
        client = Meijer()
        
        print("🔍 Testing defrag functionality...")
        
        # Get current shopping list
        current_items = client.list.get()
        print(f"📋 Current items: {len(current_items)}")
        
        if current_items:
            print("\n📝 Current items:")
            for i, item in enumerate(current_items[:5], 1):
                print(f"  {i}. {item.name} (Notes: {item.notes or 'None'})")
        
        # Run defrag
        print("\n🔧 Running defrag...")
        success = client.list.defrag()
        
        if success:
            print("✅ Defrag completed successfully!")
            
            # Get defragged list
            defragged_items = client.list.get()
            print(f"\n📋 Defragged items: {len(defragged_items)}")
            
            if defragged_items:
                print("\n📝 Defragged items:")
                for i, item in enumerate(defragged_items[:5], 1):
                    print(f"  {i}. {item.name}")
                    if item.notes:
                        print(f"     Notes: {item.notes}")
                    else:
                        print("     Notes: None")
        else:
            print("❌ Defrag failed!")
            
    except Exception as e:
        print(f"❌ Error during defrag test: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    test_defrag()
