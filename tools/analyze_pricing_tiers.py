#!/usr/bin/env python3
"""
Analyze Pricing Tiers and Quantity Discounts

This script analyzes mitmproxy log files to identify pricing tiers, BOGO patterns,
and quantity-based discounts for specific UPCs.
"""

import sys
import re
import json
from pathlib import Path
from typing import List, Dict, Any


def extract_pricing_progression(content: str, upc: str) -> Dict[str, Any]:
    """
    Extract pricing progression information from content containing a UPC.
    
    Args:
        content: Content string containing the UPC
        upc: UPC being analyzed
        
    Returns:
        Dictionary with pricing progression details
    """
    pricing_info = {
        'upc': upc,
        'cart_totals': [],
        'price_per_item': [],
        'quantity_patterns': [],
        'discount_patterns': [],
        'bogo_indicators': [],
        'tiered_pricing': []
    }
    
    # Extract cart totals and progression
    cart_matches = re.findall(r'"cartNowTotal":([\d.]+).*?"cartWasTotal":([\d.]+).*?"cartSavingsTotal":([\d.]+)', content)
    
    for cart_now, cart_was, savings in cart_matches:
        cart_now_val = float(cart_now)
        cart_was_val = float(cart_was)
        savings_val = float(savings)
        
        pricing_info['cart_totals'].append({
            'cart_now': cart_now_val,
            'cart_was': cart_was_val,
            'savings': savings_val,
            'savings_percentage': (savings_val / cart_was_val * 100) if cart_was_val > 0 else 0
        })
    
    # Extract quantity and pricing information
    quantity_matches = re.findall(r'"quantityWeight":([\d.]+).*?"pricingText":"([^"]+)"', content)
    
    for quantity, pricing_text in quantity_matches:
        qty = float(quantity)
        pricing_info['quantity_patterns'].append({
            'quantity': qty,
            'pricing_text': pricing_text
        })
    
    # Look for BOGO indicators
    bogo_patterns = [
        r'bogo',
        r'buy.*?one.*?get.*?one',
        r'buy.*?1.*?get.*?1',
        r'2\s*for\s*\$',
        r'buy\s*2\s*get\s*1',
        r'buy\s*3\s*get\s*1'
    ]
    
    for pattern in bogo_patterns:
        if re.search(pattern, content, re.IGNORECASE):
            pricing_info['bogo_indicators'].append(pattern)
    
    # Look for tiered pricing indicators
    tiered_patterns = [
        r'\$\d+/\d+',
        r'\$\d+\s*each\s*when\s*you\s*buy\s*\d+',
        r'buy\s*\d+\s*for\s*\$\d+',
        r'\d+\s*for\s*\$\d+'
    ]
    
    for pattern in tiered_patterns:
        if re.search(pattern, content, re.IGNORECASE):
            pricing_info['tiered_pricing'].append(pattern)
    
    return pricing_info


def analyze_pricing_tiers(log_file_path: str, target_upcs: List[str]) -> Dict[str, Dict[str, Any]]:
    """
    Analyze pricing tiers and quantity discounts for specific UPCs.
    
    Args:
        log_file_path: Path to the log file
        target_upcs: List of UPCs to analyze
        
    Returns:
        Dictionary with pricing analysis for each UPC
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
        
        print(f"Analyzing pricing tiers in: {log_file_path}")
        print(f"File size: {len(content)} bytes")
        print(f"Decoded content length: {len(content_str)} characters")
        print("=" * 80)
        
        # Analyze each UPC
        for upc in target_upcs:
            print(f"\n{'='*60}")
            print(f"Analyzing Pricing for UPC: {upc}")
            print(f"{'='*60}")
            
            # Find all occurrences
            upc_indices = [m.start() for m in re.finditer(re.escape(upc), content_str)]
            
            if upc_indices:
                print(f"Found {len(upc_indices)} occurrences")
                
                # Extract pricing progression
                pricing_info = extract_pricing_progression(content_str, upc)
                results[upc] = pricing_info
                
                # Analyze cart progression
                if pricing_info['cart_totals']:
                    print("\n📊 CART PRICING PROGRESSION:")
                    print(f"{'Step':<4} {'Cart Now':<10} {'Cart Was':<10} {'Savings':<10} {'Savings %':<10}")
                    print("-" * 60)
                    
                    for i, cart in enumerate(pricing_info['cart_totals']):
                        print(f"{i+1:<4} ${cart['cart_now']:<9.2f} ${cart['cart_was']:<9.2f} ${cart['savings']:<9.2f} {cart['savings_percentage']:<9.1f}%")
                    
                    # Calculate price per item progression
                    print("\n💰 PRICE PER ITEM ANALYSIS:")
                    if len(pricing_info['cart_totals']) > 1:
                        for i in range(1, len(pricing_info['cart_totals'])):
                            prev_cart = pricing_info['cart_totals'][i-1]
                            curr_cart = pricing_info['cart_totals'][i]
                            
                            # Estimate items added (this is approximate)
                            items_added = curr_cart['cart_now'] - prev_cart['cart_now']
                            if items_added > 0:
                                print(f"  Step {i+1}: Added ${items_added:.2f} worth of items")
                
                # Analyze quantity patterns
                if pricing_info['quantity_patterns']:
                    print("\n📦 QUANTITY PATTERNS:")
                    for pattern in pricing_info['quantity_patterns']:
                        print(f"  Quantity: {pattern['quantity']} - {pattern['pricing_text']}")
                
                # Analyze BOGO indicators
                if pricing_info['bogo_indicators']:
                    print("\n🎯 BOGO INDICATORS:")
                    for indicator in pricing_info['bogo_indicators']:
                        print(f"  Found: {indicator}")
                
                # Analyze tiered pricing
                if pricing_info['tiered_pricing']:
                    print("\n🏷️  TIERED PRICING INDICATORS:")
                    for tier in pricing_info['tiered_pricing']:
                        print(f"  Found: {tier}")
                
                # Analyze pricing patterns
                if pricing_info['cart_totals']:
                    print("\n🔍 PRICING PATTERN ANALYSIS:")
                    
                    # Look for BOGO patterns in cart progression
                    cart_totals = [cart['cart_now'] for cart in pricing_info['cart_totals']]
                    if len(cart_totals) >= 2:
                        # Check if adding 2 items shows a discount pattern
                        for i in range(1, len(cart_totals)):
                            if i % 2 == 1:  # Odd steps (1, 3, 5...)
                                if i < len(cart_totals) - 1:
                                    step1_increase = cart_totals[i] - cart_totals[i-1]
                                    step2_increase = cart_totals[i+1] - cart_totals[i]
                                    
                                    if step2_increase < step1_increase:
                                        print(f"  Steps {i}-{i+1}: Potential BOGO - second item cheaper")
                                        print(f"    First item: ${step1_increase:.2f}")
                                        print(f"    Second item: ${step2_increase:.2f}")
                                        print(f"    BOGO savings: ${step1_increase - step2_increase:.2f}")
                    
                    # Look for tiered pricing patterns
                    if len(cart_totals) >= 4:
                        # Check if adding 4 items shows a discount
                        for i in range(3, len(cart_totals)):
                            if i % 4 == 3:  # Every 4th step
                                if i < len(cart_totals) - 1:
                                    step4_increase = cart_totals[i+1] - cart_totals[i]
                                    avg_previous = sum(cart_totals[j] - cart_totals[j-1] for j in range(i-2, i+1)) / 3
                                    
                                    if step4_increase < avg_previous * 0.8:  # 20% or more discount
                                        print(f"  Steps {i}-{i+1}: Potential tiered pricing - 4th item discounted")
                                        print(f"    Average previous: ${avg_previous:.2f}")
                                        print(f"    4th item: ${step4_increase:.2f}")
                                        print(f"    Discount: ${avg_previous - step4_increase:.2f}")
                
            else:
                print("No occurrences found")
        
        return results
        
    except Exception as e:
        print(f"Error analyzing log file: {e}")
        return results


def generate_pricing_summary(results: Dict[str, Dict[str, Any]]) -> None:
    """
    Generate a comprehensive summary of pricing analysis.
    
    Args:
        results: Results from the pricing analysis
    """
    print("\n" + "="*80)
    print("PRICING TIER ANALYSIS SUMMARY")
    print("="*80)
    
    for upc, pricing_info in results.items():
        if pricing_info.get('cart_totals'):
            print(f"\n{'='*60}")
            print(f"UPC {upc} - PRICING SUMMARY")
            print(f"{'='*60}")
            
            cart_totals = pricing_info['cart_totals']
            
            # Overall savings
            total_savings = sum(cart['savings'] for cart in cart_totals)
            total_was = sum(cart['cart_was'] for cart in cart_totals)
            overall_savings_pct = (total_savings / total_was * 100) if total_was > 0 else 0
            
            print(f"Total Cart Value: ${cart_totals[-1]['cart_now']:.2f}")
            print(f"Total Original Value: ${total_was:.2f}")
            print(f"Total Savings: ${total_savings:.2f} ({overall_savings_pct:.1f}%)")
            
            # Pricing pattern classification
            if pricing_info.get('bogo_indicators'):
                print("Pricing Type: BOGO (Buy One Get One)")
            elif pricing_info.get('tiered_pricing'):
                print("Pricing Type: Tiered Pricing")
            else:
                print("Pricing Type: Standard Pricing")
            
            # Quantity discount analysis
            if len(cart_totals) > 1:
                print("\nQuantity Discount Analysis:")
                for i in range(1, len(cart_totals)):
                    prev_total = cart_totals[i-1]['cart_now']
                    curr_total = cart_totals[i]['cart_now']
                    increase = curr_total - prev_total
                    
                    if i == 1:
                        print(f"  First item: ${increase:.2f}")
                    elif i == 2:
                        print(f"  Second item: ${increase:.2f}")
                        if increase < cart_totals[0]['cart_now']:
                            print("    → BOGO discount applied!")
                    elif i == 4:
                        print(f"  Fourth item: ${increase:.2f}")
                        avg_previous = sum(cart_totals[j]['cart_now'] - cart_totals[j-1]['cart_now'] for j in range(1, i)) / (i-1)
                        if increase < avg_previous * 0.8:
                            print("    → Tiered pricing discount applied!")


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python analyze_pricing_tiers.py <log_file> [upc1] [upc2] ...")
        sys.exit(1)
    
    log_file = sys.argv[1]
    target_upcs = sys.argv[2:] if len(sys.argv) > 2 else [
        "629307040245", "842595131277", "822279082910", 
        "070896523112", "713733252843", "016000275263", "046100001899"
    ]
    
    print("Pricing Tier Analysis")
    print(f"Log file: {log_file}")
    print(f"Target UPCs: {', '.join(target_upcs)}")
    
    # Perform pricing analysis
    results = analyze_pricing_tiers(log_file, target_upcs)
    
    # Generate comprehensive summary
    generate_pricing_summary(results)
    
    # Save results to JSON file
    output_file = f"pricing_tiers_analysis_{Path(log_file).stem}.json"
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2, default=str)
    
    print(f"\nDetailed pricing analysis saved to: {output_file}")


if __name__ == "__main__":
    main()
