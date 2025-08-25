#!/usr/bin/env python3
"""
Analyze Price Per Item Changes

This script analyzes the actual price per item changes as quantities increase,
focusing on specific pricing drops like LPC LITTLE REDS going from $3.99 to $2.99 at 5 items.
"""

import sys
import re
import json
from pathlib import Path
from typing import List, Dict, Any


def extract_cart_progression(content: str, upc: str) -> List[Dict[str, Any]]:
    """
    Extract cart progression with price per item calculations.
    
    Args:
        content: Content string containing the UPC
        upc: UPC being analyzed
        
    Returns:
        List of cart progression steps with price per item
    """
    cart_steps = []
    
    # Extract cart totals progression
    cart_matches = re.findall(r'"cartNowTotal":([\d.]+).*?"cartWasTotal":([\d.]+).*?"cartSavingsTotal":([\d.]+)', content)
    
    for i, (cart_now, cart_was, savings) in enumerate(cart_matches):
        cart_now_val = float(cart_now)
        cart_was_val = float(cart_was)
        savings_val = float(savings)
        
        # Calculate price per item (assuming we know the item being added)
        if i == 0:
            # First item
            price_per_item = cart_now_val
            items_added = 1
        else:
            # Calculate what was added
            prev_total = cart_steps[i-1]['cart_now']
            items_added = cart_now_val - prev_total
            if items_added > 0:
                price_per_item = items_added
            else:
                price_per_item = 0
        
        cart_steps.append({
            'step': i + 1,
            'cart_now': cart_now_val,
            'cart_was': cart_was_val,
            'savings': savings_val,
            'items_added': items_added,
            'price_per_item': price_per_item,
            'total_items': i + 1  # Approximate
        })
    
    return cart_steps


def analyze_price_per_item_changes(log_file_path: str, target_upcs: List[str]) -> Dict[str, List[Dict[str, Any]]]:
    """
    Analyze price per item changes for specific UPCs.
    
    Args:
        log_file_path: Path to the log file
        target_upcs: List of UPCs to analyze
        
    Returns:
        Dictionary with price per item analysis for each UPC
    """
    results = {upc: {} for upc in target_upcs}
    
    try:
        # Read the log file
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        # Decode content
        try:
            content_str = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            content_str = content.decode('latin-1', errors='ignore')
        
        print(f"Analyzing price per item changes in: {log_file_path}")
        print(f"File size: {len(content)} bytes")
        print("=" * 80)
        
        # Analyze each UPC
        for upc in target_upcs:
            print(f"\n{'='*60}")
            print(f"Analyzing Price Per Item for UPC: {upc}")
            print(f"{'='*60}")
            
            # Find all occurrences
            upc_indices = [m.start() for m in re.finditer(re.escape(upc), content_str)]
            
            if upc_indices:
                print(f"Found {len(upc_indices)} occurrences")
                
                # Extract cart progression
                cart_steps = extract_cart_progression(content_str, upc)
                results[upc] = {'cart_steps': cart_steps}
                
                if cart_steps:
                    print("\n📊 CART PROGRESSION WITH PRICE PER ITEM:")
                    print(f"{'Step':<4} {'Cart Total':<12} {'Items Added':<12} {'Price/Item':<12} {'Total Items':<12}")
                    print("-" * 70)
                    
                    for step in cart_steps:
                        print(f"{step['step']:<4} ${step['cart_now']:<11.2f} ${step['items_added']:<11.2f} ${step['price_per_item']:<11.2f} {step['total_items']:<12}")
                    
                    # Analyze price per item changes
                    print("\n💰 PRICE PER ITEM ANALYSIS:")
                    
                    if len(cart_steps) > 1:
                        for i in range(1, len(cart_steps)):
                            prev_step = cart_steps[i-1]
                            curr_step = cart_steps[i]
                            
                            if curr_step['items_added'] > 0:
                                price_per_item = curr_step['items_added']
                                total_items = curr_step['total_items']
                                
                                print(f"  Step {i+1}: Added ${curr_step['items_added']:.2f} worth of items")
                                print(f"    Total items: {total_items}")
                                print(f"    Price per item: ${price_per_item:.2f}")
                                
                                # Check for pricing drops
                                if i > 0:
                                    prev_price = prev_step['price_per_item']
                                    if prev_price > 0 and price_per_item < prev_price:
                                        discount = prev_price - price_per_item
                                        print(f"    → PRICE DROP! ${prev_price:.2f} → ${price_per_item:.2f} (Save: ${discount:.2f})")
                                    
                                    # Check for specific pricing thresholds
                                    if total_items == 5 and price_per_item == 2.99:
                                        print("    → BINGO! Hit 5-item threshold - price dropped to $2.99!")
                                    elif total_items == 4 and price_per_item < 3.99:
                                        print("    → Hit 4-item threshold - price dropped!")
                                    elif total_items == 2 and price_per_item < 3.99:
                                        print("    → Hit 2-item threshold - price dropped!")
                
                # Look for quantity patterns in the content
                quantity_matches = re.findall(r'"quantityWeight":([\d.]+).*?"pricingText":"([^"]+)"', content_str)
                
                if quantity_matches:
                    print("\n📦 QUANTITY PATTERNS FOUND:")
                    for qty, pricing in quantity_matches:
                        print(f"  Quantity: {qty} - {pricing}")
                
            else:
                print("No occurrences found")
        
        return results
        
    except Exception as e:
        print(f"Error analyzing log file: {e}")
        return results


def generate_price_summary(results: Dict[str, Dict[str, Any]]) -> None:
    """
    Generate a summary of price per item analysis.
    
    Args:
        results: Results from the price per item analysis
    """
    print("\n" + "="*80)
    print("PRICE PER ITEM ANALYSIS SUMMARY")
    print("="*80)
    
    for upc, data in results.items():
        if data.get('cart_steps'):
            print(f"\n{'='*60}")
            print(f"UPC {upc} - PRICE PER ITEM SUMMARY")
            print(f"{'='*60}")
            
            cart_steps = data['cart_steps']
            
            # Find pricing drops
            pricing_drops = []
            for i in range(1, len(cart_steps)):
                prev_step = cart_steps[i-1]
                curr_step = cart_steps[i]
                
                if curr_step['items_added'] > 0 and prev_step['price_per_item'] > 0:
                    if curr_step['items_added'] < prev_step['price_per_item']:
                        drop = {
                            'step': curr_step['step'],
                            'total_items': curr_step['total_items'],
                            'old_price': prev_step['price_per_item'],
                            'new_price': curr_step['items_added'],
                            'savings': prev_step['price_per_item'] - curr_step['items_added']
                        }
                        pricing_drops.append(drop)
            
            if pricing_drops:
                print(f"Found {len(pricing_drops)} pricing drops:")
                for drop in pricing_drops:
                    print(f"  Step {drop['step']} ({drop['total_items']} items): ${drop['old_price']:.2f} → ${drop['new_price']:.2f} (Save: ${drop['savings']:.2f})")
                    
                    # Classify the drop
                    if drop['total_items'] == 5 and drop['new_price'] == 2.99:
                        print("    → This is the 5-item threshold drop for LPC LITTLE REDS!")
                    elif drop['total_items'] == 4:
                        print("    → 4-item threshold pricing drop")
                    elif drop['total_items'] == 2:
                        print("    → 2-item threshold pricing drop")
            else:
                print("No clear pricing drops found in cart progression")


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python analyze_price_per_item.py <log_file> [upc1] [upc2] ...")
        sys.exit(1)
    
    log_file = sys.argv[1]
    target_upcs = sys.argv[2:] if len(sys.argv) > 2 else [
        "629307040245", "842595131277", "822279082910", 
        "070896523112", "713733252843", "016000275263", "046100001899"
    ]
    
    print("Price Per Item Analysis")
    print(f"Log file: {log_file}")
    print(f"Target UPCs: {', '.join(target_upcs)}")
    
    # Perform price per item analysis
    results = analyze_price_per_item_changes(log_file, target_upcs)
    
    # Generate summary
    generate_price_summary(results)
    
    # Save results to JSON file
    output_file = f"price_per_item_analysis_{Path(log_file).stem}.json"
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2, default=str)
    
    print(f"\nDetailed price per item analysis saved to: {output_file}")


if __name__ == "__main__":
    main()
