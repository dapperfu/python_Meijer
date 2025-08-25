#!/usr/bin/env python3
"""
Analyze Dual Cart Progression

This script analyzes the cart progression separately for shop'n'scan and pickup cart,
showing step-by-step pricing as items are added to each workflow.
"""

import sys
import re
import json
from pathlib import Path
from typing import List, Dict, Any


def extract_dual_cart_progression(content: str) -> Dict[str, List[Dict[str, Any]]]:
    """
    Extract cart progression for both shop'n'scan and pickup cart separately.
    
    Args:
        content: Content string from the log file
        
    Returns:
        Dictionary with separate cart progressions for each workflow
    """
    shop_scan_flows = []
    pickup_cart_flows = []
    
    # Find shop'n'scan flows (START_TRANSACTION events)
    shop_scan_pattern = r'POST.*?shopandscan.*?START_TRANSACTION.*?cartNowTotal":([\d.]+).*?cartWasTotal":([\d.]+).*?cartSavingsTotal":([\d.]+)'
    shop_scan_matches = re.findall(shop_scan_pattern, content, re.DOTALL)
    
    for i, (cart_now, cart_was, savings) in enumerate(shop_scan_matches):
        shop_scan_flows.append({
            'step': i + 1,
            'workflow': 'shop_n_scan',
            'cart_now': float(cart_now),
            'cart_was': float(cart_was),
            'savings': float(savings),
            'items_added': 0,  # Will calculate below
            'price_per_item': 0,  # Will calculate below
            'total_items': i + 1
        })
    
    # Find pickup cart flows (regular cart operations)
    pickup_pattern = r'"cartNowTotal":([\d.]+).*?"cartWasTotal":([\d.]+).*?"cartSavingsTotal":([\d.]+)'
    pickup_matches = re.findall(pickup_pattern, content)
    
    for i, (cart_now, cart_was, savings) in enumerate(pickup_matches):
        pickup_cart_flows.append({
            'step': i + 1,
            'workflow': 'pickup_cart',
            'cart_now': float(cart_now),
            'cart_was': float(cart_was),
            'savings': float(savings),
            'items_added': 0,  # Will calculate below
            'price_per_item': 0,  # Will calculate below
            'total_items': i + 1
        })
    
    # Calculate items added and price per item for shop'n'scan
    for i in range(1, len(shop_scan_flows)):
        prev_total = shop_scan_flows[i-1]['cart_now']
        curr_total = shop_scan_flows[i]['cart_now']
        items_added = curr_total - prev_total
        
        if items_added > 0:
            shop_scan_flows[i]['items_added'] = items_added
            shop_scan_flows[i]['price_per_item'] = items_added
        else:
            shop_scan_flows[i]['items_added'] = 0
            shop_scan_flows[i]['price_per_item'] = 0
    
    # Calculate items added and price per item for pickup cart
    for i in range(1, len(pickup_cart_flows)):
        prev_total = pickup_cart_flows[i-1]['cart_now']
        curr_total = pickup_cart_flows[i]['cart_now']
        items_added = curr_total - prev_total
        
        if items_added > 0:
            pickup_cart_flows[i]['items_added'] = items_added
            pickup_cart_flows[i]['price_per_item'] = items_added
        else:
            pickup_cart_flows[i]['items_added'] = 0
            pickup_cart_flows[i]['price_per_item'] = 0
    
    return {
        'shop_n_scan': shop_scan_flows,
        'pickup_cart': pickup_cart_flows
    }


def analyze_dual_cart_progression(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze dual cart progression for shop'n'scan and pickup cart.
    
    Args:
        log_file_path: Path to the log file
        
    Returns:
        Dictionary with dual cart analysis
    """
    try:
        # Read the log file
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        # Decode content
        try:
            content_str = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            content_str = content.decode('latin-1', errors='ignore')
        
        print(f"Analyzing dual cart progression in: {log_file_path}")
        print(f"File size: {len(content)} bytes")
        print("=" * 80)
        
        # Extract dual cart progression
        cart_progression = extract_dual_cart_progression(content_str)
        
        # Analyze shop'n'scan progression
        print(f"\n{'='*60}")
        print("SHOP'N'SCAN CART PROGRESSION")
        print(f"{'='*60}")
        
        shop_scan_flows = cart_progression['shop_n_scan']
        if shop_scan_flows:
            print(f"Found {len(shop_scan_flows)} shop'n'scan cart steps")
            print("\n📊 SHOP'N'SCAN CART PROGRESSION:")
            print(f"{'Step':<4} {'Cart Total':<12} {'Items Added':<12} {'Price/Item':<12} {'Total Items':<12}")
            print("-" * 70)
            
            for step in shop_scan_flows:
                print(f"{step['step']:<4} ${step['cart_now']:<11.2f} ${step['items_added']:<11.2f} ${step['price_per_item']:<11.2f} {step['total_items']:<12}")
            
            # Analyze pricing patterns
            print("\n💰 SHOP'N'SCAN PRICING ANALYSIS:")
            for i in range(1, len(shop_scan_flows)):
                prev_step = shop_scan_flows[i-1]
                curr_step = shop_scan_flows[i]
                
                if curr_step['items_added'] > 0:
                    print(f"  Step {i+1}: Added ${curr_step['items_added']:.2f} worth of items")
                    print(f"    Total items: {curr_step['total_items']}")
                    print(f"    Price per item: ${curr_step['price_per_item']:.2f}")
                    
                    # Check for pricing drops
                    if prev_step['price_per_item'] > 0 and curr_step['price_per_item'] < prev_step['price_per_item']:
                        discount = prev_step['price_per_item'] - curr_step['price_per_item']
                        print(f"    → PRICE DROP! ${prev_step['price_per_item']:.2f} → ${curr_step['price_per_item']:.2f} (Save: ${discount:.2f})")
                    
                    # Check for specific pricing thresholds
                    if curr_step['total_items'] == 5 and curr_step['price_per_item'] == 2.99:
                        print("    → BINGO! Hit 5-item threshold - price dropped to $2.99!")
                    elif curr_step['total_items'] == 4 and curr_step['price_per_item'] < 3.99:
                        print("    → Hit 4-item threshold - price dropped!")
                    elif curr_step['total_items'] == 2 and curr_step['price_per_item'] < 3.99:
                        print("    → Hit 2-item threshold - price dropped!")
        else:
            print("No shop'n'scan cart progression found")
        
        # Analyze pickup cart progression
        print(f"\n{'='*60}")
        print("PICKUP CART PROGRESSION")
        print(f"{'='*60}")
        
        pickup_flows = cart_progression['pickup_cart']
        if pickup_flows:
            print(f"Found {len(pickup_flows)} pickup cart steps")
            print("\n📊 PICKUP CART PROGRESSION:")
            print(f"{'Step':<4} {'Cart Total':<12} {'Items Added':<12} {'Price/Item':<12} {'Total Items':<12}")
            print("-" * 70)
            
            for step in pickup_flows:
                print(f"{step['step']:<4} ${step['cart_now']:<11.2f} ${step['items_added']:<11.2f} ${step['price_per_item']:<11.2f} {step['total_items']:<12}")
            
            # Analyze pricing patterns
            print("\n💰 PICKUP CART PRICING ANALYSIS:")
            for i in range(1, len(pickup_flows)):
                prev_step = pickup_flows[i-1]
                curr_step = pickup_flows[i]
                
                if curr_step['items_added'] > 0:
                    print(f"  Step {i+1}: Added ${curr_step['items_added']:.2f} worth of items")
                    print(f"    Total items: {curr_step['total_items']}")
                    print(f"    Price per item: ${curr_step['price_per_item']:.2f}")
                    
                    # Check for pricing drops
                    if prev_step['price_per_item'] > 0 and curr_step['price_per_item'] < prev_step['price_per_item']:
                        discount = prev_step['price_per_item'] - curr_step['price_per_item']
                        print(f"    → PRICE DROP! ${prev_step['price_per_item']:.2f} → ${curr_step['price_per_item']:.2f} (Save: ${discount:.2f})")
                    
                    # Check for specific pricing thresholds
                    if curr_step['total_items'] == 5 and curr_step['price_per_item'] == 2.99:
                        print("    → BINGO! Hit 5-item threshold - price dropped to $2.99!")
                    elif curr_step['total_items'] == 4 and curr_step['price_per_item'] < 3.99:
                        print("    → Hit 4-item threshold - price dropped!")
                    elif curr_step['total_items'] == 2 and curr_step['price_per_item'] < 3.99:
                        print("    → Hit 2-item threshold - price dropped!")
        else:
            print("No pickup cart progression found")
        
        return cart_progression
        
    except Exception as e:
        print(f"Error analyzing log file: {e}")
        return {}


def generate_dual_summary(cart_progression: Dict[str, Any]) -> None:
    """
    Generate a summary of dual cart progression analysis.
    
    Args:
        cart_progression: Results from the dual cart analysis
    """
    print("\n" + "="*80)
    print("DUAL CART PROGRESSION SUMMARY")
    print("="*80)
    
    # Shop'n'scan summary
    shop_scan_flows = cart_progression.get('shop_n_scan', [])
    if shop_scan_flows:
        print(f"\n{'='*60}")
        print("SHOP'N'SCAN SUMMARY")
        print(f"{'='*60}")
        
        # Find pricing drops
        pricing_drops = []
        for i in range(1, len(shop_scan_flows)):
            prev_step = shop_scan_flows[i-1]
            curr_step = shop_scan_flows[i]
            
            if curr_step['items_added'] > 0 and prev_step['price_per_item'] > 0:
                if curr_step['price_per_item'] < prev_step['price_per_item']:
                    drop = {
                        'step': curr_step['step'],
                        'total_items': curr_step['total_items'],
                        'old_price': prev_step['price_per_item'],
                        'new_price': curr_step['price_per_item'],
                        'savings': prev_step['price_per_item'] - curr_step['price_per_item']
                    }
                    pricing_drops.append(drop)
        
        if pricing_drops:
            print(f"Found {len(pricing_drops)} pricing drops in shop'n'scan:")
            for drop in pricing_drops:
                print(f"  Step {drop['step']} ({drop['total_items']} items): ${drop['old_price']:.2f} → ${drop['new_price']:.2f} (Save: ${drop['savings']:.2f})")
        else:
            print("No clear pricing drops found in shop'n'scan")
    
    # Pickup cart summary
    pickup_flows = cart_progression.get('pickup_cart', [])
    if pickup_flows:
        print(f"\n{'='*60}")
        print("PICKUP CART SUMMARY")
        print(f"{'='*60}")
        
        # Find pricing drops
        pricing_drops = []
        for i in range(1, len(pickup_flows)):
            prev_step = pickup_flows[i-1]
            curr_step = pickup_flows[i]
            
            if curr_step['items_added'] > 0 and prev_step['price_per_item'] > 0:
                if curr_step['price_per_item'] < prev_step['price_per_item']:
                    drop = {
                        'step': curr_step['step'],
                        'total_items': curr_step['total_items'],
                        'old_price': prev_step['price_per_item'],
                        'new_price': curr_step['price_per_item'],
                        'savings': prev_step['price_per_item'] - curr_step['price_per_item']
                    }
                    pricing_drops.append(drop)
        
        if pricing_drops:
            print(f"Found {len(pricing_drops)} pricing drops in pickup cart:")
            for drop in pricing_drops:
                print(f"  Step {drop['step']} ({drop['total_items']} items): ${drop['old_price']:.2f} → ${drop['new_price']:.2f} (Save: ${drop['savings']:.2f})")
        else:
            print("No clear pricing drops found in pickup cart")


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python analyze_dual_cart_progression.py <log_file>")
        sys.exit(1)
    
    log_file = sys.argv[1]
    
    print("Dual Cart Progression Analysis")
    print(f"Log file: {log_file}")
    
    # Perform dual cart analysis
    cart_progression = analyze_dual_cart_progression(log_file)
    
    # Generate summary
    generate_dual_summary(cart_progression)
    
    # Save results to JSON file
    output_file = f"dual_cart_progression_{Path(log_file).stem}.json"
    with open(output_file, 'w') as f:
        json.dump(cart_progression, f, indent=2, default=str)
    
    print(f"\nDetailed dual cart progression analysis saved to: {output_file}")


if __name__ == "__main__":
    main()
