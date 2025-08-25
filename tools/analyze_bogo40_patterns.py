#!/usr/bin/env python3
"""
Analyze BOGO40% Pricing Patterns

This script analyzes BOGO40% pricing patterns and searches for specific UPCs
like 719812800516 to see how the 40% off BOGO deal is reflected in cart progression.
"""

import sys
import re
import json
from pathlib import Path
from typing import List, Dict, Any


def search_for_upc(content: str, target_upc: str) -> List[Dict[str, Any]]:
    """
    Search for specific UPC and extract context around it.
    
    Args:
        content: Content string from the log file
        target_upc: UPC to search for
        
    Returns:
        List of matches with context
    """
    matches = []
    
    # Find all occurrences of the UPC
    upc_indices = [m.start() for m in re.finditer(re.escape(target_upc), content)]
    
    for i, start_pos in enumerate(upc_indices):
        # Extract context around the UPC (500 characters before and after)
        context_start = max(0, start_pos - 500)
        context_end = min(len(content), start_pos + 500)
        context = content[context_start:context_end]
        
        # Look for pricing information near this UPC
        pricing_patterns = [
            r'"price":([\d.]+)',
            r'"salePrice":([\d.]+)',
            r'"originalPrice":([\d.]+)',
            r'"discountPercent":([\d.]+)',
            r'"discountAmount":([\d.]+)',
            r'"pricingText":"([^"]+)"',
            r'"quantity":([\d.]+)',
            r'"cartNowTotal":([\d.]+)',
            r'"cartWasTotal":([\d.]+)',
            r'"cartSavingsTotal":([\d.]+)'
        ]
        
        pricing_info = {}
        for pattern in pricing_patterns:
            matches_found = re.findall(pattern, context)
            if matches_found:
                pricing_info[pattern] = matches_found
        
        matches.append({
            'match_id': i + 1,
            'position': start_pos,
            'context': context,
            'pricing_info': pricing_info
        })
    
    return matches


def analyze_bogo40_patterns(content: str) -> Dict[str, Any]:
    """
    Analyze BOGO40% pricing patterns in the content.
    
    Args:
        content: Content string from the log file
        
    Returns:
        Dictionary with BOGO40% analysis
    """
    bogo_patterns = {
        'bogo40': [],
        'bogo50': [],
        'bogo_other': [],
        'quantity_discounts': []
    }
    
    # Search for BOGO40% patterns
    bogo40_patterns = [
        r'bogo.*?40%',
        r'buy.*?one.*?get.*?40%',
        r'40%.*?off.*?second',
        r'second.*?item.*?40%',
        r'40%.*?discount.*?second'
    ]
    
    for pattern in bogo40_patterns:
        matches = re.findall(pattern, content, re.IGNORECASE)
        if matches:
            bogo_patterns['bogo40'].extend(matches)
    
    # Search for other BOGO patterns
    bogo50_patterns = [
        r'bogo.*?50%',
        r'buy.*?one.*?get.*?50%',
        r'50%.*?off.*?second'
    ]
    
    for pattern in bogo50_patterns:
        matches = re.findall(pattern, content, re.IGNORECASE)
        if matches:
            bogo_patterns['bogo50'].extend(matches)
    
    # Search for general BOGO patterns
    general_bogo_patterns = [
        r'bogo',
        r'buy.*?one.*?get.*?one',
        r'buy.*?one.*?get.*?off',
        r'buy.*?one.*?get.*?free'
    ]
    
    for pattern in general_bogo_patterns:
        matches = re.findall(pattern, content, re.IGNORECASE)
        if matches:
            bogo_patterns['bogo_other'].extend(matches)
    
    # Search for quantity-based discounts
    quantity_patterns = [
        r'\$\d+/\d+',
        r'buy\s*\d+\s*for\s*\$\d+',
        r'\d+\s*for\s*\$\d+'
    ]
    
    for pattern in quantity_patterns:
        matches = re.findall(pattern, content)
        if matches:
            bogo_patterns['quantity_discounts'].extend(matches)
    
    return bogo_patterns


def analyze_cart_progression_for_bogo(content: str) -> List[Dict[str, Any]]:
    """
    Analyze cart progression to identify BOGO pricing patterns.
    
    Args:
        content: Content string from the log file
        
    Returns:
        List of cart progression steps with BOGO analysis
    """
    cart_steps = []
    
    # Extract cart totals progression
    cart_matches = re.findall(r'"cartNowTotal":([\d.]+).*?"cartWasTotal":([\d.]+).*?"cartSavingsTotal":([\d.]+)', content)
    
    for i, (cart_now, cart_was, savings) in enumerate(cart_matches):
        cart_now_val = float(cart_now)
        cart_was_val = float(cart_was)
        savings_val = float(savings)
        
        # Calculate what was added
        if i == 0:
            items_added = cart_now_val
            price_per_item = cart_now_val
        else:
            prev_total = cart_steps[i-1]['cart_now']
            items_added = cart_now_val - prev_total
            if items_added > 0:
                price_per_item = items_added
            else:
                price_per_item = 0
        
        # Check for BOGO patterns
        bogo_indicator = False
        bogo_type = None
        
        if i > 0 and items_added > 0:
            prev_step = cart_steps[i-1]
            if prev_step['price_per_item'] > 0:
                # Calculate discount percentage
                if prev_step['price_per_item'] > price_per_item:
                    discount_amount = prev_step['price_per_item'] - price_per_item
                    discount_percent = (discount_amount / prev_step['price_per_item']) * 100
                    
                    if abs(discount_percent - 40) < 5:  # Within 5% of 40%
                        bogo_indicator = True
                        bogo_type = "BOGO40%"
                    elif abs(discount_percent - 50) < 5:  # Within 5% of 50%
                        bogo_indicator = True
                        bogo_type = "BOGO50%"
                    elif discount_percent > 0:
                        bogo_indicator = True
                        bogo_type = f"BOGO{discount_percent:.0f}%"
        
        cart_steps.append({
            'step': i + 1,
            'cart_now': cart_now_val,
            'cart_was': cart_was_val,
            'savings': savings_val,
            'items_added': items_added,
            'price_per_item': price_per_item,
            'total_items': i + 1,
            'bogo_indicator': bogo_indicator,
            'bogo_type': bogo_type
        })
    
    return cart_steps


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python analyze_bogo40_patterns.py <log_file> [upc]")
        sys.exit(1)
    
    log_file = sys.argv[1]
    target_upc = sys.argv[2] if len(sys.argv) > 2 else "719812800516"
    
    print("BOGO40% Pattern Analysis")
    print(f"Log file: {log_file}")
    print(f"Target UPC: {target_upc}")
    
    try:
        # Read the log file
        with open(log_file, 'rb') as f:
            content = f.read()
        
        # Decode content
        try:
            content_str = content.decode('utf-8', errors='ignore')
        except UnicodeDecodeError:
            content_str = content.decode('latin-1', errors='ignore')
        
        print(f"\nFile size: {len(content)} bytes")
        print("=" * 80)
        
        # Search for the specific UPC
        print(f"\n{'='*60}")
        print(f"SEARCHING FOR UPC: {target_upc}")
        print(f"{'='*60}")
        
        upc_matches = search_for_upc(content_str, target_upc)
        
        if upc_matches:
            print(f"Found {len(upc_matches)} occurrences of UPC {target_upc}")
            
            for match in upc_matches:
                print(f"\n--- Match {match['match_id']} ---")
                print(f"Position: {match['position']}")
                print(f"Pricing Info: {match['pricing_info']}")
                print(f"Context: {match['context'][:200]}...")
        else:
            print(f"UPC {target_upc} not found in the log file")
        
        # Analyze BOGO patterns
        print(f"\n{'='*60}")
        print("BOGO PATTERN ANALYSIS")
        print(f"{'='*60}")
        
        bogo_patterns = analyze_bogo40_patterns(content_str)
        
        for pattern_type, matches in bogo_patterns.items():
            if matches:
                print(f"\n{pattern_type.upper()}:")
                for match in matches[:10]:  # Limit to first 10
                    print(f"  - {match}")
        
        # Analyze cart progression for BOGO patterns
        print(f"\n{'='*60}")
        print("CART PROGRESSION BOGO ANALYSIS")
        print(f"{'='*60}")
        
        cart_progression = analyze_cart_progression_for_bogo(content_str)
        
        if cart_progression:
            print(f"Found {len(cart_progression)} cart progression steps")
            print("\n📊 CART PROGRESSION WITH BOGO INDICATORS:")
            print(f"{'Step':<4} {'Cart Total':<12} {'Items Added':<12} {'Price/Item':<12} {'BOGO':<15}")
            print("-" * 70)
            
            for step in cart_progression:
                bogo_info = step['bogo_type'] if step['bogo_indicator'] else "No"
                print(f"{step['step']:<4} ${step['cart_now']:<11.2f} ${step['items_added']:<11.2f} ${step['price_per_item']:<11.2f} {bogo_info:<15}")
            
            # Show BOGO details
            bogo_steps = [step for step in cart_progression if step['bogo_indicator']]
            if bogo_steps:
                print("\n💰 BOGO PRICING DETAILS:")
                for step in bogo_steps:
                    print(f"  Step {step['step']}: {step['bogo_type']} - Added ${step['items_added']:.2f} worth of items")
                    print(f"    Previous price per item: ${cart_progression[step['step']-2]['price_per_item']:.2f}")
                    print(f"    Current price per item: ${step['price_per_item']:.2f}")
                    print(f"    Total items: {step['total_items']}")
        
        # Save results to JSON file
        output_file = f"bogo40_analysis_{Path(log_file).stem}.json"
        results = {
            'target_upc': target_upc,
            'upc_matches': upc_matches,
            'bogo_patterns': bogo_patterns,
            'cart_progression': cart_progression
        }
        
        with open(output_file, 'w') as f:
            json.dump(results, f, indent=2, default=str)
        
        print(f"\nDetailed BOGO40% analysis saved to: {output_file}")
        
    except Exception as e:
        print(f"Error analyzing log file: {e}")
        import traceback
        traceback.print_exc()


if __name__ == "__main__":
    main()
