#!/usr/bin/env python3
"""
Demo Backup Cart Functionality

This script demonstrates how to use the new backup cart functionality
to add items with backup selection (quantity 30) for emergency supplies.
"""

from meijer.cart import MeijerCart
from meijer.client import MeijerClient


def demo_backup_cart():
    """Demonstrate backup cart functionality."""
    print("🛒 Meijer Backup Cart Demo")
    print("=" * 50)
    
    # Initialize client and cart
    try:
        client = MeijerClient()
        cart = MeijerCart(client, store_id="20")  # Example store ID
        
        print(f"Cart initialized for store {cart.store_id}")
        print(f"Current cart status: {'Empty' if cart.empty else 'Has items'}")
        
        # Example UPC for demonstration
        demo_upc = "719812800516"  # The UPC you mentioned
        
        print(f"\n📦 Adding item with UPC {demo_upc}")
        print("-" * 30)
        
        # Method 1: Add normal item
        print("1. Adding item normally (quantity 1):")
        success = cart.add_item_by_upc(demo_upc, quantity=1)
        if success:
            print("   ✅ Item added successfully")
        else:
            print("   ❌ Failed to add item")
        
        # Method 2: Add item with backup selection
        print("\n2. Adding item as BACKUP (quantity 30):")
        success = cart.add_item_by_upc_with_backup(demo_upc, backup=True)
        if success:
            print("   ✅ Backup item added successfully")
        else:
            print("   ❌ Failed to add backup item")
        
        # Check cart status
        print(f"\n📊 Cart Status After Adding Items:")
        print("-" * 30)
        print(f"Total items: {cart.item_count}")
        print(f"Unique products: {cart.unique_item_count}")
        print(f"Total quantity: {cart.total_quantity}")
        print(f"Has backup items: {cart.has_backup_items}")
        print(f"Backup item count: {cart.backup_item_count}")
        print(f"Total backup quantity: {cart.total_backup_quantity}")
        
        # Show backup items
        if cart.has_backup_items:
            print(f"\n🔋 Backup Items in Cart:")
            print("-" * 30)
            for item in cart.backup_items:
                print(f"  • {item.product_name or f'UPC {item.product_code}'}")
                print(f"    Quantity: {item.current_quantity}")
                print(f"    Price: ${item.total_value:.2f}")
                print(f"    Backup: {'Yes' if item.is_backup else 'No'}")
        
        # Show all items
        if cart.has_items:
            print(f"\n🛍️ All Items in Cart:")
            print("-" * 30)
            for item in cart.items:
                backup_indicator = " [BACKUP]" if item.backup_quantity else ""
                print(f"  • {item.product_name or f'UPC {item.product_code}'}{backup_indicator}")
                print(f"    Quantity: {item.current_quantity}")
                print(f"    Price: ${item.total_value:.2f}")
        
        print(f"\n💰 Cart Totals:")
        print("-" * 30)
        print(f"Subtotal: ${cart.subtotal:.2f}")
        print(f"Total Price: ${cart.total_price:.2f}")
        
    except Exception as e:
        print(f"❌ Error during demo: {e}")
        import traceback
        traceback.print_exc()


def demo_backup_workflow():
    """Demonstrate the complete backup workflow you described."""
    print("\n🔄 Complete Backup Workflow Demo")
    print("=" * 50)
    print("This demonstrates the workflow you described:")
    print("1. Search by UPC")
    print("2. Add to cart")
    print("3. Increase quantity to 30")
    print("4. Select 'backup' in the cart")
    
    try:
        client = MeijerClient()
        cart = MeijerCart(client, store_id="20")
        
        demo_upc = "719812800516"
        
        print(f"\n📋 Workflow Steps:")
        print("-" * 30)
        
        # Step 1: Search by UPC
        print("1. 🔍 Searching by UPC...")
        # This would typically involve a search API call
        print("   ✅ UPC found in search results")
        
        # Step 2: Add to cart
        print("2. 🛒 Adding to cart...")
        success = cart.add_item_by_upc(demo_upc, quantity=1)
        if success:
            print("   ✅ Item added to cart")
        else:
            print("   ❌ Failed to add item")
            return
        
        # Step 3: Increase quantity to 30
        print("3. 📈 Increasing quantity to 30...")
        if cart.has_items:
            item = cart.items[0]  # Get the first item
            success = item.quantity(30)
            if success:
                print("   ✅ Quantity increased to 30")
            else:
                print("   ❌ Failed to increase quantity")
                return
        
        # Step 4: Select 'backup' in the cart
        print("4. 🔋 Selecting 'backup' in the cart...")
        if cart.has_items:
            item = cart.items[0]
            success = item.set_as_backup()
            if success:
                print("   ✅ Item marked as backup")
            else:
                print("   ❌ Failed to mark as backup")
                return
        
        # Final status
        print(f"\n🎯 Final Cart Status:")
        print("-" * 30)
        print(f"Total items: {cart.item_count}")
        print(f"Total quantity: {cart.total_quantity}")
        print(f"Has backup items: {cart.has_backup_items}")
        print(f"Backup item count: {cart.backup_item_count}")
        
        if cart.has_backup_items:
            print(f"\n🔋 Backup Item Details:")
            for item in cart.backup_items:
                print(f"  • {item.product_name or f'UPC {item.product_code}'}")
                print(f"    Quantity: {item.current_quantity}")
                print(f"    Backup: {'Yes' if item.is_backup else 'No'}")
        
    except Exception as e:
        print(f"❌ Error during workflow demo: {e}")
        import traceback
        traceback.print_exc()


if __name__ == "__main__":
    print("🚀 Starting Backup Cart Demo...")
    print()
    
    # Run basic demo
    demo_backup_cart()
    
    print("\n" + "="*60)
    
    # Run workflow demo
    demo_backup_workflow()
    
    print("\n✅ Demo completed!")
