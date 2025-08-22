#!/usr/bin/env python3
"""
Search for Specific UPC 719812800516 and Analyze Flows

This script searches for the exact UPC 719812800516 in the log file and analyzes:
1. Where it appears
2. Cart progression when this UPC is added
3. Quantity changes and price analysis
4. Shop'n'Scan context
"""

import sys
import re
import json
from pathlib import Path
from typing import List, Dict, Any


def search_specific_upc(log_file_path: str, target_upc: str) -> Dict[str, Any]:
    """
    Search for a specific UPC and analyze flows around it.
    
    Args:
        log_file_path: Path to the log file
        target_upc: The exact UPC to search for
        
    Returns:
        Dictionary with UPC analysis
    """
    results = {
        'upc_found': False,
        'upc_locations': [],
        'cart_progression': [],
        'shop_n_scan_context': [],
        'price_changes': [],
        'quantity_changes': []
    }
    
    try:
        # Read the log file
        with open(log_file_path, 'rb') as f:
            content = f.read()
        
        # Decode content
        try:
            content_str = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            content_str = content.decode('latin-1', errors='ignore')
        
        print(f"Searching for UPC: {target_upc}")
        print(f"Log file: {log_file_path}")
        print(f"File size: {len(content)} bytes")
        print("=" * 80)
        
        # 1. Find exact UPC matches
        print(f"\n🔍 SEARCHING FOR UPC: {target_upc}")
        print("-" * 50)
        
        upc_matches = re.finditer(target_upc, content_str)
        upc_locations = []
        
        for match in upc_matches:
            start_pos = match.start()
            end_pos = match.end()
            
            # Get context around the UPC (500 characters before and after)
            context_start = max(0, start_pos - 500)
            context_end = min(len(content_str), end_pos + 500)
            context = content_str[context_start:context_end]
            
            upc_location = {
                'position': start_pos,
                'context': context,
                'line_number': content_str[:start_pos].count('\n') + 1
            }
            upc_locations.append(upc_location)
            
            print(f"  Found UPC at position {start_pos} (line ~{upc_location['line_number']})")
            print(f"  Context: {context[:100]}...")
        
        results['upc_locations'] = upc_locations
        results['upc_found'] = len(upc_locations) > 0
        
        if not upc_locations:
            print(f"  ❌ UPC {target_upc} NOT FOUND in the log file")
            return results
        
        print(f"  ✅ Found {len(upc_locations)} occurrences of UPC {target_upc}")
        
        # 2. Look for cart progression around these UPCs
        print(f"\n🛒 ANALYZING CART PROGRESSION")
        print("-" * 50)
        
        for i, location in enumerate(upc_locations):
            print(f"\n  UPC Location {i+1}:")
            
            # Look for cart totals in the context
            cart_totals = re.findall(r'"cartNowTotal":([\d.]+).*?"cartWasTotal":([\d.]+).*?"cartSavingsTotal":([\d.]+)', location['context'])
            
            if cart_totals:
                print(f"    Found {len(cart_totals)} cart total entries in context")
                for j, (cart_now, cart_was, savings) in enumerate(cart_totals):
                    cart_now_val = float(cart_now)
                    cart_was_val = float(cart_was)
                    savings_val = float(savings)
                    
                    cart_entry = {
                        'upc_location': i + 1,
                        'entry': j + 1,
                        'cart_now': cart_now_val,
                        'cart_was': cart_was_val,
                        'savings': savings_val
                    }
                    results['cart_progression'].append(cart_entry)
                    
                    print(f"      Entry {j+1}: Cart now: ${cart_now_val:.2f}, Was: ${cart_was_val:.2f}, Savings: ${savings_val:.2f}")
            else:
                print(f"    No cart totals found in context")
            
            # Look for quantity information
            quantity_matches = re.findall(r'"quantity":(\d+)', location['context'])
            if quantity_matches:
                print(f"    Quantities found: {quantity_matches}")
                for qty in quantity_matches:
                    results['quantity_changes'].append({
                        'upc_location': i + 1,
                        'quantity': int(qty)
                    })
        
        # 3. Look for shop'n'scan context
        print(f"\n🛍️ SHOP'N'SCAN CONTEXT ANALYSIS")
        print("-" * 50)
        
        for i, location in enumerate(upc_locations):
            # Check if this UPC context contains shop'n'scan references
            if 'shopandscan' in location['context'].lower():
                print(f"  UPC Location {i+1}: Contains shop'n'scan context")
                results['shop_n_scan_context'].append({
                    'upc_location': i + 1,
                    'context': location['context']
                })
            else:
                print(f"  UPC Location {i+1}: No shop'n'scan context found")
        
        # 4. Look for price changes and BOGO patterns
        print(f"\n💰 PRICE ANALYSIS")
        print("-" * 50)
        
        if len(results['cart_progression']) > 1:
            print(f"  Analyzing {len(results['cart_progression'])} cart progression steps")
            
            for i in range(1, len(results['cart_progression'])):
                prev = results['cart_progression'][i-1]
                curr = results['cart_progression'][i]
                
                if prev['upc_location'] == curr['upc_location']:
                    # Same UPC location, check for price changes
                    price_change = curr['cart_now'] - prev['cart_now']
                    if price_change != 0:
                        print(f"    Price change: ${price_change:.2f}")
                        
                        price_entry = {
                            'from_step': i,
                            'to_step': i + 1,
                            'price_change': price_change,
                            'from_total': prev['cart_now'],
                            'to_total': curr['cart_now']
                        }
                        results['price_changes'].append(price_entry)
        else:
            print(f"  Not enough cart progression data for price analysis")
        
        return results
        
    except Exception as e:
        print(f"Error searching for UPC: {e}")
        import traceback
        traceback.print_exc()
        return results


def main():
    """Main function."""
    if len(sys.argv) < 3:
        print("Usage: python search_specific_upc.py <log_file> <upc>")
        print("Example: python search_specific_upc.py meijer_mitm_20250821_233419.log 719812800516")
        sys.exit(1)
    
    log_file = sys.argv[1]
    target_upc = sys.argv[2]
    
    print(f"Specific UPC Search and Analysis")
    print(f"Log file: {log_file}")
    print(f"Target UPC: {target_upc}")
    
    # Perform search
    results = search_specific_upc(log_file, target_upc)
    
    # Save results to JSON file
    output_file = f"upc_{target_upc}_analysis_{Path(log_file).stem}.json"
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2, default=str)
    
    print(f"\nDetailed analysis saved to: {output_file}")
    
    # Summary
    print(f"\n📊 SEARCH SUMMARY:")
    print(f"  UPC found: {'✅ YES' if results['upc_found'] else '❌ NO'}")
    if results['upc_found']:
        print(f"  UPC locations: {len(results['upc_locations'])}")
        print(f"  Cart progression entries: {len(results['cart_progression'])}")
        print(f"  Shop'n'Scan contexts: {len(results['shop_n_scan_context'])}")
        print(f"  Price changes: {len(results['price_changes'])}")
        print(f"  Quantity changes: {len(results['quantity_changes'])}")


if __name__ == "__main__":
    main()
