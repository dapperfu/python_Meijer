#!/usr/bin/env python3
"""
Analyze August 22 Flows for Shop'n'Scan and Barcode 7199129*

This script analyzes the August 22 log file for:
1. Shop'n'Scan Started flows
2. Barcode 7199129* scanned once with one item in cart
3. Quantity changes to 2 and price analysis
"""

import sys
import re
import json
from pathlib import Path
from typing import Dict, Any


def analyze_aug22_flows(log_file_path: str) -> Dict[str, Any]:
    """
    Analyze August 22 flows for Shop'n'Scan and barcode patterns.

    Args:
        log_file_path: Path to the August 22 log file

    Returns:
        Dictionary with flow analysis
    """
    results = {
        "shop_n_scan_flows": [],
        "barcode_7199129_flows": [],
        "quantity_changes": [],
        "price_analysis": [],
    }

    try:
        # Read the log file
        with open(log_file_path, "rb") as f:
            content = f.read()

        # Decode content
        try:
            content_str = content.decode("utf-8", errors="ignore")
        except UnicodeDecodeError:
            content_str = content.decode("latin-1", errors="ignore")

        print(f"Analyzing August 22 flows in: {log_file_path}")
        print(f"File size: {len(content)} bytes")
        print("=" * 80)

        # 1. Find Shop'n'Scan Started flows
        print("\n🔍 SEARCHING FOR SHOP'N'SCAN STARTED FLOWS")
        print("-" * 50)

        shop_scan_patterns = [
            r"START_TRANSACTION.*?shopandscan",
            r"shopandscan.*?START_TRANSACTION",
            r"Shop.*?Scan.*?Started",
            r"Shop.*?Scan.*?Start",
        ]

        for pattern in shop_scan_patterns:
            matches = re.findall(pattern, content_str, re.IGNORECASE)
            if matches:
                print(f"Pattern '{pattern}' found {len(matches)} matches")
                for match in matches[:3]:  # Show first 3
                    print(f"  - {match[:100]}...")
                results["shop_n_scan_flows"].extend(matches)

        # 2. Find barcode 7199129* patterns
        print("\n📦 SEARCHING FOR BARCODE 7199129* PATTERNS")
        print("-" * 50)

        barcode_patterns = [
            r"7199129[0-9]+",
            r"barcode.*?7199129[0-9]+",
            r"UPC.*?7199129[0-9]+",
            r"productCode.*?7199129[0-9]+",
        ]

        for pattern in barcode_patterns:
            matches = re.findall(pattern, content_str)
            if matches:
                print(f"Pattern '{pattern}' found {len(matches)} matches")
                for match in matches[:3]:  # Show first 3
                    print(f"  - {match}")
                results["barcode_7199129_flows"].extend(matches)

        # 3. Look for quantity changes and price analysis
        print("\n💰 SEARCHING FOR QUANTITY CHANGES AND PRICE ANALYSIS")
        print("-" * 50)

        # Look for cart progression with quantity changes
        cart_progression = re.findall(
            r'"cartNowTotal":([\d.]+).*?"cartWasTotal":([\d.]+).*?"cartSavingsTotal":([\d.]+)',
            content_str,
        )

        if cart_progression:
            print(f"Found {len(cart_progression)} cart progression steps")

            # Analyze price changes
            for i, (cart_now, cart_was, savings) in enumerate(cart_progression):
                cart_now_val = float(cart_now)
                cart_was_val = float(cart_was)
                savings_val = float(savings)

                if i > 0:
                    # Calculate what was added
                    prev_total = float(cart_progression[i - 1][0])
                    items_added = cart_now_val - prev_total

                    if items_added > 0:
                        # This could be a quantity change
                        quantity_change = {
                            "step": i + 1,
                            "cart_now": cart_now_val,
                            "cart_was": cart_was_val,
                            "savings": savings_val,
                            "items_added": items_added,
                            "unit_price": items_added if items_added > 0 else 0,
                        }
                        results["quantity_changes"].append(quantity_change)

                        print(
                            f"  Step {i + 1}: Added ${items_added:.2f} worth of items"
                        )
                        print(f"    Cart total: ${cart_now_val:.2f}")
                        print(f"    Unit price: ${items_added:.2f}")

        # 4. Look for specific barcode context
        print("\n🔍 DETAILED BARCODE 7199129* ANALYSIS")
        print("-" * 50)

        # Search for any context around 7199 patterns
        context_matches = re.findall(r"(.{200}7199[0-9]+.{200})", content_str)

        if context_matches:
            print(f"Found {len(context_matches)} context matches for 7199 patterns")
            for i, context in enumerate(context_matches[:3]):  # Show first 3
                print(f"\n  Context {i + 1}:")
                print(f"    {context}")
        else:
            print("No 7199 barcode patterns found in context")

        # 5. Look for shop'n'scan specific flows
        print("\n🛒 SHOP'N'SCAN FLOW DETAILS")
        print("-" * 50)

        # Look for shop'n'scan related content
        shop_scan_content = re.findall(
            r"(.{300}shopandscan.{300})", content_str, re.IGNORECASE
        )

        if shop_scan_content:
            print(f"Found {len(shop_scan_content)} shop'n'scan content matches")
            for i, content in enumerate(shop_scan_content[:3]):  # Show first 3
                print(f"\n  Shop'n'Scan Content {i + 1}:")
                print(f"    {content[:200]}...")
        else:
            print("No shop'n'scan content found")

        return results

    except Exception as e:
        print(f"Error analyzing log file: {e}")
        import traceback

        traceback.print_exc()
        return results


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python analyze_aug22_flows.py <log_file>")
        print("Example: python analyze_aug22_flows.py meijer_mitm_20250821_233419.log")
        sys.exit(1)

    log_file = sys.argv[1]

    print("August 22 Flow Analysis")
    print(f"Log file: {log_file}")
    print("Target flows:")
    print("  - Shop'n'Scan Started")
    print("  - Barcode 7199129* scanned once with one item in cart")
    print("  - Quantity changes to 2 and price analysis")

    # Perform analysis
    results = analyze_aug22_flows(log_file)

    # Save results to JSON file
    output_file = f"aug22_flows_analysis_{Path(log_file).stem}.json"
    with open(output_file, "w") as f:
        json.dump(results, f, indent=2, default=str)

    print(f"\nDetailed analysis saved to: {output_file}")

    # Summary
    print("\n📊 ANALYSIS SUMMARY:")
    print(f"  Shop'n'Scan flows found: {len(results['shop_n_scan_flows'])}")
    print(f"  Barcode 7199129* flows found: {len(results['barcode_7199129_flows'])}")
    print(f"  Quantity changes found: {len(results['quantity_changes'])}")
    print(f"  Price analysis entries: {len(results['price_analysis'])}")


if __name__ == "__main__":
    main()
