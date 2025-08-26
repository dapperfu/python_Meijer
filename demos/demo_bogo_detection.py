#!/usr/bin/env python3
"""
Demo: BOGO Detection in Shop & Scan

This script demonstrates the enhanced BOGO detection functionality
in the Meijer Shop & Scan module.
"""

import sys
import os

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from meijer.cart import CartItem


def demo_bogo_detection():
    """Demonstrate BOGO detection functionality."""
    print("🎯 BOGO Detection Demo")
    print("=" * 50)

    # Note: In a real scenario, you would authenticate here
    # meijer = Meijer(username="your_username", password="your_password")
    # For demo purposes, we'll show the structure

    print("📱 Initializing Shop & Scan Module")
    print("-" * 30)

    # Show the enhanced endpoints
    print("Enhanced Shop & Scan Endpoints:")
    print("  • start_transaction: /retail/shopandscan/api/v1/NextGenPOSBasket")
    print("  • lookup_item: /loyalty/shopandscan/lookupitem")
    print("  • add_to_cart: /loyalty/shopandscan/addtocart")
    print("  • get_cart: /loyalty/shopandscan/getcart")
    print("  • BOGO detection patterns: [2, 4, 6, 8, 10] quantities")
    print("  • BOGO percentages: [25%, 40%, 50%, 75%]")

    print("\n🔍 BOGO Detection Method")
    print("-" * 30)
    print("detect_bogo_opportunity(barcode, store_id, test_quantities=[1, 2, 10])")
    print("  • Tests quantities 1, 2, and 10")
    print("  • Monitors price drops between quantities")
    print("  • Identifies BOGO patterns automatically")
    print("  • Returns optimal quantity and savings percentage")

    print("\n📊 BOGO Analysis Results Structure")
    print("-" * 30)
    bogo_results_structure = {
        "barcode": "719812800516",
        "bogo_detected": True,
        "bogo_type": "BOGO40",
        "price_progression": [
            {
                "quantity": 1,
                "total_price": 10.99,
                "unit_price": 10.99,
                "price_per_item": 10.99,
            },
            {
                "quantity": 2,
                "total_price": 17.58,
                "unit_price": 8.79,
                "price_per_item": 8.79,
            },
            {
                "quantity": 10,
                "total_price": 87.92,
                "unit_price": 8.79,
                "price_per_item": 8.79,
            },
        ],
        "optimal_quantity": 2,
        "savings_percentage": 40.0,
        "recommendation": "BOGO detected! BOGO40 - Best value at 2 items (40.0% savings)",
    }

    for key, value in bogo_results_structure.items():
        if key == "price_progression":
            print(f"  {key}:")
            for i, price_info in enumerate(value):
                print(
                    f"    {i + 1}. Qty {price_info['quantity']}: ${price_info['total_price']:.2f} total, ${price_info['price_per_item']:.2f} each"
                )
        else:
            print(f"  {key}: {value}")

    print("\n🛒 Enhanced Cart Item Properties")
    print("-" * 30)
    print("CartItem now includes BOGO properties:")
    print("  • item.bogo_detected -> bool")
    print("  • item.bogo_type -> str (e.g., 'BOGO40')")
    print("  • item.bogo_savings_percentage -> float")
    print("  • item.optimal_bogo_quantity -> int")
    print("  • item.status_icon -> str (🎯 for BOGO items)")

    print("\n🚀 Comprehensive Scan Analysis")
    print("-" * 30)
    print("scan_item_and_analyze(barcode, store_id, analyze_pricing=True)")
    print("  • Product lookup and information retrieval")
    print("  • Automatic BOGO detection")
    print("  • Cart status analysis")
    print("  • Personalized recommendations")

    print("\n💡 Usage Examples")
    print("-" * 30)
    print("1. Detect BOGO for a specific UPC:")
    print("   bogo_results = shop_scan.detect_bogo_opportunity('719812800516')")
    print("   if bogo_results['bogo_detected']:")
    print("       print(f\"BOGO found: {bogo_results['bogo_type']}\")")
    print("       print(f\"Best quantity: {bogo_results['optimal_quantity']}\")")

    print("\n2. Comprehensive item analysis:")
    print("   scan_results = shop_scan.scan_item_and_analyze('719812800516', '20')")
    print("   print(f\"Product: {scan_results['product_info']['name']}\")")
    print("   print(f\"Recommendations: {scan_results['recommendations']}\")")

    print("\n3. Start Shop & Scan session:")
    print("   session = shop_scan.start_shop_n_scan_session('20')")
    print("   if session['success']:")
    print("       print(f\"Transaction ID: {session['transaction_id']}\")")

    print("\n🎯 BOGO Detection Logic")
    print("-" * 30)
    print("The system automatically detects BOGO patterns by:")
    print("  • Adding items to cart in sequence (1, 2, 10)")
    print("  • Monitoring price per item changes")
    print("  • Identifying significant price drops (>5%)")
    print("  • Categorizing by common BOGO percentages")
    print("  • Providing optimal quantity recommendations")

    print("\n📈 Price Progression Analysis")
    print("-" * 30)
    print("Example: OXO Softworks Swivel Peeler (UPC: 719812800516)")
    print("  • 1 item: $10.99 each")
    print("  • 2 items: $8.79 each (40% savings)")
    print("  • 10 items: $8.79 each (same BOGO rate)")
    print("  • BOGO Type: BOGO40")
    print("  • Optimal Quantity: 2 (best value)")

    print("\n✅ Benefits for End Users")
    print("-" * 30)
    print("  • Automatic BOGO detection without manual calculation")
    print("  • Optimal quantity recommendations for maximum savings")
    print("  • Real-time pricing analysis during shopping")
    print("  • Comprehensive product and deal information")
    print("  • Seamless Shop & Scan workflow integration")
    print("  • Professional-grade API with extensive error handling")

    print("\n🔧 Technical Features")
    print("-" * 30)
    print("  • Full mypy typing support")
    print("  • Comprehensive error handling and logging")
    print("  • Fallback endpoint support")
    print("  • JSON response parsing and validation")
    print("  • Cart state management and cleanup")
    print("  • Device ID generation and session management")

    print("\n" + "=" * 50)
    print("🎯 BOGO Detection Demo Complete!")
    print("The enhanced Shop & Scan module provides professional-grade")
    print("BOGO detection and comprehensive shopping analysis.")


def demo_cart_integration():
    """Demonstrate how BOGO properties integrate with cart items."""
    print("\n🛒 Cart Integration Demo")
    print("=" * 50)

    # Create a sample cart item with BOGO properties
    item = CartItem(
        entry_number="1",
        product_code="719812800516",
        product_name="OXO Softworks Swivel Peeler",
        quantity=2,
        base_price=10.99,
        total_price=17.58,
    )

    # Set BOGO properties (normally done by shop_scan module)
    item.bogo_detected = True
    item.bogo_type = "BOGO40"
    item.bogo_savings_percentage = 40.0
    item.optimal_bogo_quantity = 2

    print(f"Product: {item.display_name}")
    print(f"Quantity: {item.current_quantity}")
    print(f"Base Price: ${item.base_price:.2f}")
    print(f"Total Price: ${item.total_price:.2f}")
    print(f"Unit Price: ${item.unit_price:.2f}")
    print(f"BOGO Detected: {item.bogo_detected}")
    print(f"BOGO Type: {item.bogo_type}")
    print(f"Savings: {item.bogo_savings_percentage:.1f}%")
    print(f"Optimal Quantity: {item.optimal_bogo_quantity}")
    print(f"Status Icon: {item.status_icon}")

    print(f"\nPrice Display: {item.price_display}")
    print(f"Can Increase: {item.can_increase_quantity}")
    print(f"Can Decrease: {item.can_decrease_quantity}")
    print(f"On Sale: {item.on_sale}")
    print(f"Sale Savings: ${item.sale_savings:.2f}")


if __name__ == "__main__":
    demo_bogo_detection()
    demo_cart_integration()
