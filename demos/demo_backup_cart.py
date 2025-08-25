#!/usr/bin/env python3
"""
Demo Backup/Fallback Cart Functionality

This script demonstrates how to use the backup/fallback cart functionality
to specify alternative products when items become unavailable.
"""

from meijer.cart import MeijerCart
from meijer.client import MeijerClient


def demo_backup_fallback_cart():
    """Demonstrate backup/fallback cart functionality."""
    print("🛒 Meijer Backup/Fallback Cart Demo")
    print("=" * 50)
    
    # Initialize client and cart
    try:
        client = MeijerClient()
        cart = MeijerCart(client, store_id="20")  # Example store ID
        
        print(f"Cart initialized for store {cart.store_id}")
        print(f"Current cart status: {'Empty' if cart.empty else 'Has items'}")
        
        # Example UPCs for demonstration
        original_upc = "719812800516"  # Original item (e.g., specific peeler)
        backup_upc = "123456789012"    # Backup item (e.g., different peeler brand)
        
        print(f"\n📦 Adding original item with UPC {original_upc}")
        print("-" * 30)
        
        # Add the original item to cart
        success = cart.add_item_by_upc(original_upc, quantity=1)
        if success:
            print("   ✅ Original item added successfully")
        else:
            print("   ❌ Failed to add original item")
            return
        
        # Check cart status
        print("\n📊 Cart Status After Adding Original Item:")
        print("-" * 30)
        print(f"Total items: {cart.item_count}")
        print(f"Unique products: {cart.unique_item_count}")
        print(f"Total quantity: {cart.total_quantity}")
        
        # Get the cart item to add backup
        if cart.has_items:
            original_item = cart.items[0]
            print("\n🔍 Original Item Details:")
            print(f"  Entry Number: {original_item.entry_number}")
            print(f"  Product Code: {original_item.product_code}")
            print(f"  Product Name: {original_item.product_name or 'Unknown'}")
            print(f"  Quantity: {original_item.current_quantity}")
            print(f"  Has backup items: {original_item.has_backup}")
            print(f"  Backup item count: {original_item.backup_item_count}")
        
        # Add backup/fallback item
        print("\n🔄 Adding backup/fallback item:")
        print(f"  Original UPC: {original_upc}")
        print(f"  Backup UPC: {backup_upc}")
        print("  Backup Description: Alternative peeler brand")
        
        if cart.has_items:
            original_item = cart.items[0]
            success = original_item.add_backup_item(
                upc=backup_upc,
                product_name="Alternative Peeler Brand",
                brand="Different Vendor"
            )
            
            if success:
                print("   ✅ Backup item added successfully")
            else:
                print("   ❌ Failed to add backup item")
        
        # Check backup status
        print("\n📊 Backup Status After Adding Backup Item:")
        print("-" * 30)
        print(f"Has items with backups: {cart.has_items_with_backups}")
        print(f"Items with backups: {len(cart.items_with_backups)}")
        print(f"Total backup substitutions: {cart.total_backup_substitutions}")
        
        # Show backup items
        if cart.has_items_with_backups:
            print("\n🔋 Items with Backup/Fallback Options:")
            print("-" * 30)
            for item in cart.items_with_backups:
                print(f"  • {item.product_name or f'UPC {item.product_code}'}")
                print(f"    Entry Number: {item.entry_number}")
                print(f"    Quantity: {item.current_quantity}")
                print(f"    Backup items: {item.backup_item_count}")
                print(f"    Backup UPCs: {', '.join(item.backup_items)}")
        
        # Show all items
        if cart.has_items:
            print("\n🛍️ All Items in Cart:")
            print("-" * 30)
            for item in cart.items:
                backup_indicator = f" [Has {item.backup_item_count} backups]" if item.has_backup else ""
                print(f"  • {item.product_name or f'UPC {item.product_code}'}{backup_indicator}")
                print(f"    Entry Number: {item.entry_number}")
                print(f"    Quantity: {item.current_quantity}")
                print(f"    Price: ${item.total_value:.2f}")
        
        print("\n💰 Cart Totals:")
        print("-" * 30)
        print(f"Subtotal: ${cart.subtotal:.2f}")
        print(f"Total Price: ${cart.total_price:.2f}")
        
    except Exception as e:
        print(f"❌ Error during demo: {e}")
        import traceback
        traceback.print_exc()


def demo_backup_workflow():
    """Demonstrate the complete backup/fallback workflow."""
    print("\n🔄 Complete Backup/Fallback Workflow Demo")
    print("=" * 50)
    print("This demonstrates the workflow you described:")
    print("1. Search by UPC")
    print("2. Add to cart")
    print("3. Select backup/fallback item (e.g., different peeler brand)")
    
    try:
        client = MeijerClient()
        cart = MeijerCart(client, store_id="20")
        
        original_upc = "719812800516"  # Original peeler
        backup_upc = "123456789012"    # Different peeler brand
        
        print("\n📋 Workflow Steps:")
        print("-" * 30)
        
        # Step 1: Search by UPC
        print("1. 🔍 Searching by UPC...")
        print("   ✅ UPC found in search results")
        
        # Step 2: Add to cart
        print("2. 🛒 Adding to cart...")
        success = cart.add_item_by_upc(original_upc, quantity=1)
        if success:
            print("   ✅ Item added to cart")
        else:
            print("   ❌ Failed to add item")
            return
        
        # Step 3: Select backup/fallback item
        print("3. 🔄 Selecting backup/fallback item...")
        if cart.has_items:
            item = cart.items[0]
            success = item.add_backup_item(
                upc=backup_upc,
                product_name="Alternative Peeler Brand",
                brand="Different Vendor"
            )
            if success:
                print("   ✅ Backup item selected")
            else:
                print("   ❌ Failed to select backup item")
                return
        
        # Final status
        print("\n🎯 Final Cart Status:")
        print("-" * 30)
        print(f"Total items: {cart.item_count}")
        print(f"Total quantity: {cart.total_quantity}")
        print(f"Has items with backups: {cart.has_items_with_backups}")
        print(f"Total backup substitutions: {cart.total_backup_substitutions}")
        
        if cart.has_items_with_backups:
            print("\n🔋 Backup/Fallback Details:")
            for item in cart.items_with_backups:
                print(f"  • {item.product_name or f'UPC {item.product_code}'}")
                print(f"    Entry Number: {item.entry_number}")
                print(f"    Backup UPCs: {', '.join(item.backup_items)}")
        
    except Exception as e:
        print(f"❌ Error during workflow demo: {e}")
        import traceback
        traceback.print_exc()


def demo_cart_backup_management():
    """Demonstrate cart-level backup item management."""
    print("\n⚙️ Cart-Level Backup Management Demo")
    print("=" * 50)
    
    try:
        client = MeijerClient()
        cart = MeijerCart(client, store_id="20")
        
        # Add items
        cart.add_item_by_upc("719812800516", quantity=1)  # Original peeler
        cart.add_item_by_upc("987654321098", quantity=1)  # Another item
        
        print("📦 Added items to cart")
        
        # Get entry numbers
        if cart.has_items:
            item1_entry = cart.items[0].entry_number
            item2_entry = cart.items[1].entry_number
            
            print(f"Item 1 Entry: {item1_entry}")
            print(f"Item 2 Entry: {item2_entry}")
            
            # Add backup items using cart methods
            print("\n🔄 Adding backup items using cart methods:")
            
            # Add backup to first item
            success = cart.add_backup_item_to_cart_item(
                entry_number=item1_entry,
                backup_upc="111111111111",
                product_name="Backup Peeler Brand A"
            )
            print(f"  Added backup to item 1: {'✅' if success else '❌'}")
            
            # Add backup to second item
            success = cart.add_backup_item_to_cart_item(
                entry_number=item2_entry,
                backup_upc="222222222222",
                product_name="Backup Item Brand B"
            )
            print(f"  Added backup to item 2: {'✅' if success else '❌'}")
            
            # Show backup status
            print("\n📊 Backup Status:")
            print(f"  Item 1 backups: {cart.get_cart_item_backups(item1_entry)}")
            print(f"  Item 2 backups: {cart.get_cart_item_backups(item2_entry)}")
            print(f"  Total items with backups: {len(cart.items_with_backups)}")
            print(f"  Total backup substitutions: {cart.total_backup_substitutions}")
            
            # Remove a backup item
            print("\n🗑️ Removing backup item from item 1:")
            success = cart.remove_backup_item_from_cart_item(item1_entry, "111111111111")
            print(f"  Removed backup: {'✅' if success else '❌'}")
            print(f"  Item 1 backups after removal: {cart.get_cart_item_backups(item1_entry)}")
        
    except Exception as e:
        print(f"❌ Error during backup management demo: {e}")
        import traceback
        traceback.print_exc()


if __name__ == "__main__":
    print("🚀 Starting Backup/Fallback Cart Demo...")
    print()
    
    # Run basic demo
    demo_backup_fallback_cart()
    
    print("\n" + "="*60)
    
    # Run workflow demo
    demo_backup_workflow()
    
    print("\n" + "="*60)
    
    # Run backup management demo
    demo_cart_backup_management()
    
    print("\n✅ Demo completed!")
