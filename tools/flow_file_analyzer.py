#!/usr/bin/env python3
"""
Flow File Analyzer for Cart Operations

This script analyzes mitmproxy flow files to extract cart-related operations.
"""

import json
import sys
from typing import Dict, List, Any, Optional


def analyze_flow_file(flow_file_path: str) -> None:
    """Analyze a mitmproxy flow file for cart operations."""
    print(f"🔍 Analyzing flow file: {flow_file_path}")
    print("=" * 80)
    
    try:
        # Try to read the flow file as text first
        with open(flow_file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
            
            # Search for cart-related patterns
            cart_patterns = [
                # Cart operations
                (r'POST.*cart.*add', "Add to cart"),
                (r'PUT.*cart', "Update cart"),
                (r'DELETE.*cart', "Delete from cart"),
                (r'GET.*cart', "Get cart"),
                
                # Shop & Scan operations
                (r'POST.*addtocart', "Shop & Scan add to cart"),
                (r'POST.*removefromcart', "Shop & Scan remove from cart"),
                (r'GET.*getcart', "Shop & Scan get cart"),
                (r'POST.*clearcart', "Shop & Scan clear cart"),
                
                # Digital cart operations
                (r'/digital/occ/v3/carts', "Digital cart endpoints"),
                (r'/digital/hybris/v3/carts', "Hybris cart endpoints"),
                
                # Loyalty cart operations
                (r'/loyalty/shopandscan', "Loyalty Shop & Scan"),
                (r'/loyalty/cart', "Loyalty cart"),
                
                # Quantity operations
                (r'quantity.*10|qty.*10', "Quantity 10"),
                (r'quantity.*1|qty.*1', "Quantity 1"),
                
                # Product-specific operations
                (r'milk.*gallon|whole.*milk', "Milk operations"),
                (r'buttermilk.*bread|bread.*remove', "Bread operations"),
                
                # Rewards operations
                (r'GET.*rewards|POST.*rewards', "Rewards operations"),
                (r'GET.*mperks.*offers|POST.*mperks.*offers', "MPerks offers"),
                
                # Cart-related headers
                (r'x-mfc-store|store.*id', "Store ID headers"),
                (r'cart.*id|cartId', "Cart ID references")
            ]
            
            results = {}
            
            for pattern, description in cart_patterns:
                import re
                matches = re.finditer(pattern, content, re.IGNORECASE)
                matches_list = []
                
                for match in matches:
                    # Get context around the match
                    start = max(0, match.start() - 300)
                    end = min(len(content), match.end() + 300)
                    context = content[start:end]
                    
                    # Clean up context
                    context = re.sub(r'\s+', ' ', context).strip()
                    
                    matches_list.append({
                        'match': match.group(),
                        'context': context[:400] + "..." if len(context) > 400 else context,
                        'position': match.start()
                    })
                
                results[description] = matches_list
                
                print(f"\n{description}: {len(matches_list)} matches")
                if matches_list:
                    for i, match_info in enumerate(matches_list[:3], 1):  # Show first 3
                        print(f"  {i}. {match_info['match']}")
                        print(f"     Context: {match_info['context']}")
                        print()
            
            # Summary
            print("\n📋 ANALYSIS SUMMARY")
            print("=" * 50)
            total_matches = sum(len(matches) for matches in results.values())
            print(f"Total cart-related matches found: {total_matches}")
            
            for description, matches in results.items():
                if matches:
                    print(f"✅ {description}: {len(matches)}")
                else:
                    print(f"❌ {description}: 0")
            
            # Save results
            report = {
                'flow_file': flow_file_path,
                'total_matches': total_matches,
                'results': {desc: matches[:5] for desc, matches in results.items()}
            }
            
            report_file = 'flow_analysis_results.json'
            with open(report_file, 'w') as f:
                json.dump(report, f, indent=2, default=str)
            
            print(f"\n💾 Results saved to: {report_file}")
            
    except Exception as e:
        print(f"❌ Error analyzing flow file: {e}")
        
        # Try binary analysis
        print("\n🔄 Trying binary analysis...")
        try:
            with open(flow_file_path, 'rb') as f:
                content = f.read()
                
                # Look for readable strings
                readable_content = ""
                for byte in content:
                    if 32 <= byte <= 126:  # Printable ASCII
                        readable_content += chr(byte)
                    else:
                        readable_content += "."
                
                # Search for cart-related strings
                cart_strings = [
                    "cart", "milk", "bread", "quantity", "rewards", "addtocart", 
                    "removefromcart", "getcart", "clearcart"
                ]
                
                found_strings = []
                for search_term in cart_strings:
                    if search_term.lower() in readable_content.lower():
                        found_strings.append(search_term)
                
                print(f"Found cart-related strings: {found_strings}")
                
                # Show sample of readable content
                print(f"\nSample readable content (first 1000 chars):")
                print(readable_content[:1000])
                
        except Exception as binary_error:
            print(f"❌ Binary analysis also failed: {binary_error}")


def main():
    """Main function."""
    if len(sys.argv) != 2:
        print("Usage: python3 flow_file_analyzer.py <flow_file>")
        print("Example: python3 flow_file_analyzer.py meijer_mitm_20250818_130318.log")
        sys.exit(1)
    
    flow_file = sys.argv[1]
    analyze_flow_file(flow_file)


if __name__ == "__main__":
    main()
