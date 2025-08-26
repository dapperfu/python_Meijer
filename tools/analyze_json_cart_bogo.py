#!/usr/bin/env python3
"""
Analyze JSON Cart Data for BOGO Patterns

This script properly parses JSON data and loops through structured fields
instead of using regex, accessing UPC information from the correct data fields.
"""

import sys
import json
from pathlib import Path
from typing import List, Dict, Any, Optional


def extract_upc_from_json_content(json_content: Any) -> Optional[str]:
    """
    Extract UPC from JSON content by looking in the right fields.

    Args:
        json_content: Parsed JSON content

    Returns:
        UPC string if found, None otherwise
    """
    if isinstance(json_content, dict):
        # Look for UPC in common fields
        upc_fields = [
            "upc",
            "UPC",
            "barcode",
            "Barcode",
            "barcodeData",
            "BarcodeData",
            "itemSku",
            "ItemSku",
            "sku",
            "SKU",
            "productId",
            "ProductId",
        ]

        for field in upc_fields:
            if field in json_content:
                value = json_content[field]
                if value and str(value).isdigit() and len(str(value)) >= 10:
                    return str(value)

        # Recursively search nested objects
        for key, value in json_content.items():
            if isinstance(value, (dict, list)):
                result = extract_upc_from_json_content(value)
                if result:
                    return result

    elif isinstance(json_content, list):
        # Search through list items
        for item in json_content:
            result = extract_upc_from_json_content(item)
            if result:
                return result

    return None


def analyze_cart_progression_for_bogo(
    cart_flows: List[Dict[str, Any]],
) -> List[Dict[str, Any]]:
    """
    Analyze cart progression to identify BOGO pricing patterns.

    Args:
        cart_flows: List of cart flows sorted by occurrence

    Returns:
        List of cart progression steps with BOGO analysis
    """
    analyzed_steps = []

    for i, flow in enumerate(cart_flows):
        cart_info = flow.get("cart_info", {})
        cart_now = cart_info.get("cart_now_total", 0)
        cart_was = cart_info.get("cart_was_total", 0)
        savings = cart_info.get("savings_total", 0)

        # Calculate what was added
        if i == 0:
            items_added = cart_now
            price_per_item = cart_now
        else:
            prev_total = analyzed_steps[i - 1]["cart_now_total"]
            items_added = cart_now - prev_total
            if items_added > 0:
                price_per_item = items_added
            else:
                price_per_item = 0

        # Check for BOGO patterns
        bogo_indicator = False
        bogo_type = None
        discount_percent = 0

        if i > 0 and items_added > 0:
            prev_step = analyzed_steps[i - 1]
            if prev_step["price_per_item"] > 0:
                # Calculate discount percentage
                if prev_step["price_per_item"] > price_per_item:
                    discount_amount = prev_step["price_per_item"] - price_per_item
                    discount_percent = (
                        discount_amount / prev_step["price_per_item"]
                    ) * 100

                    if abs(discount_percent - 40) < 5:  # Within 5% of 40%
                        bogo_indicator = True
                        bogo_type = "BOGO40%"
                    elif abs(discount_percent - 50) < 5:  # Within 5% of 50%
                        bogo_indicator = True
                        bogo_type = "BOGO50%"
                    elif discount_percent > 0:
                        bogo_indicator = True
                        bogo_type = f"BOGO{discount_percent:.0f}%"

        analyzed_steps.append(
            {
                "step": i + 1,
                "cart_now_total": cart_now,
                "cart_was_total": cart_was,
                "savings_total": savings,
                "items_added": items_added,
                "price_per_item": price_per_item,
                "total_items": i + 1,
                "bogo_indicator": bogo_indicator,
                "bogo_type": bogo_type,
                "discount_percent": discount_percent,
                "occurrence": flow.get("occurrence", i + 1),
            }
        )

    return analyzed_steps


def analyze_upc_data(upc_data: List[Dict[str, Any]]) -> Dict[str, Any]:
    """
    Analyze data for a specific UPC by properly parsing JSON fields.

    Args:
        upc_data: List of flows for a specific UPC

    Returns:
        Dictionary with comprehensive UPC analysis
    """
    # Extract different flow types
    cart_flows = [flow for flow in upc_data if flow.get("flow_type") == "cart"]
    search_flows = [flow for flow in upc_data if flow.get("flow_type") == "search"]
    shop_scan_flows = [
        flow for flow in upc_data if flow.get("flow_type") == "shop_n_scan"
    ]

    # Sort cart flows by occurrence
    cart_flows.sort(key=lambda x: x.get("occurrence", 0))

    # Analyze cart progression
    cart_progression = (
        analyze_cart_progression_for_bogo(cart_flows) if cart_flows else []
    )

    # Extract UPC from JSON content
    extracted_upcs = set()
    for flow in upc_data:
        json_content = flow.get("json_content")
        if json_content:
            # Handle both string and parsed JSON
            if isinstance(json_content, str):
                try:
                    parsed_json = json.loads(json_content)
                    upc = extract_upc_from_json_content(parsed_json)
                    if upc:
                        extracted_upcs.add(upc)
                except json.JSONDecodeError:
                    continue
            else:
                upc = extract_upc_from_json_content(json_content)
                if upc:
                    extracted_upcs.add(upc)

    # Extract pricing information from search flows
    pricing_info = []
    for flow in search_flows:
        json_content = flow.get("json_content")
        if json_content and isinstance(json_content, dict):
            # Look for pricing fields
            price_fields = ["price", "salePrice", "originalPrice", "discountPercent"]
            pricing_data = {}
            for field in price_fields:
                if field in json_content:
                    pricing_data[field] = json_content[field]

            if pricing_data:
                pricing_info.append(pricing_data)

    return {
        "upc": upc_data[0].get("upc") if upc_data else None,
        "total_flows": len(upc_data),
        "cart_flows": len(cart_flows),
        "search_flows": len(search_flows),
        "shop_scan_flows": len(shop_scan_flows),
        "cart_progression": cart_progression,
        "bogo_steps": [step for step in cart_progression if step["bogo_indicator"]],
        "extracted_upcs": list(extracted_upcs),
        "pricing_info": pricing_info,
    }


def search_for_specific_upc(
    data: Dict[str, List[Dict[str, Any]]], target_upc: str
) -> Optional[Dict[str, Any]]:
    """
    Search for a specific UPC in the data by checking all relevant fields.

    Args:
        data: The complete analysis data
        target_upc: UPC to search for

    Returns:
        UPC analysis if found, None otherwise
    """
    # First, check if UPC exists as a key
    if target_upc in data:
        return analyze_upc_data(data[target_upc])

    # Search through all UPCs for the target UPC in their data
    for upc, upc_data in data.items():
        # Check if target UPC appears in the extracted UPCs
        upc_analysis = analyze_upc_data(upc_data)
        if target_upc in upc_analysis.get("extracted_upcs", []):
            return upc_analysis

        # Also check if target UPC appears in the original UPC field
        if upc_analysis.get("upc") == target_upc:
            return upc_analysis

    return None


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python analyze_json_cart_bogo.py <analysis_file> [upc]")
        sys.exit(1)

    analysis_file = sys.argv[1]
    target_upc = sys.argv[2] if len(sys.argv) > 2 else None

    print("JSON Cart BOGO Analysis")
    print(f"Analysis file: {analysis_file}")

    try:
        # Read the analysis file
        with open(analysis_file, "r") as f:
            data = json.load(f)

        print(f"Loaded analysis data for {len(data)} UPCs")
        print("=" * 80)

        if target_upc:
            # Search for specific UPC
            print(f"\n{'=' * 60}")
            print(f"SEARCHING FOR UPC: {target_upc}")
            print(f"{'=' * 60}")

            upc_analysis = search_for_specific_upc(data, target_upc)

            if upc_analysis:
                print(f"Found UPC {target_upc}!")
                print(f"Total flows: {upc_analysis['total_flows']}")
                print(f"Cart flows: {upc_analysis['cart_flows']}")
                print(f"Search flows: {upc_analysis['search_flows']}")
                print(f"Shop'n'scan flows: {upc_analysis['shop_scan_flows']}")
                print(f"Extracted UPCs: {upc_analysis['extracted_upcs']}")

                if upc_analysis["cart_progression"]:
                    print("\n📊 CART PROGRESSION WITH BOGO INDICATORS:")
                    print(
                        f"{'Step':<4} {'Cart Total':<12} {'Items Added':<12} {'Price/Item':<12} {'BOGO':<15} {'Discount':<10}"
                    )
                    print("-" * 80)

                    for step in upc_analysis["cart_progression"]:
                        bogo_info = (
                            step["bogo_type"] if step["bogo_indicator"] else "No"
                        )
                        discount_info = (
                            f"{step['discount_percent']:.1f}%"
                            if step["discount_percent"] > 0
                            else "0%"
                        )
                        print(
                            f"{step['step']:<4} ${step['cart_now_total']:<11.2f} ${step['items_added']:<11.2f} ${step['price_per_item']:<11.2f} {bogo_info:<15} {discount_info:<10}"
                        )

                    # Show BOGO details
                    bogo_steps = upc_analysis["bogo_steps"]
                    if bogo_steps:
                        print("\n💰 BOGO PRICING DETAILS:")
                        for step in bogo_steps:
                            print(
                                f"  Step {step['step']}: {step['bogo_type']} - Added ${step['items_added']:.2f} worth of items"
                            )
                            print(
                                f"    Previous price per item: ${upc_analysis['cart_progression'][step['step'] - 2]['price_per_item']:.2f}"
                            )
                            print(
                                f"    Current price per item: ${step['price_per_item']:.2f}"
                            )
                            print(f"    Discount: {step['discount_percent']:.1f}%")
                            print(f"    Total items: {step['total_items']}")
                    else:
                        print("\n💰 No BOGO patterns detected in cart progression")

                if upc_analysis["pricing_info"]:
                    print("\n📦 PRICING INFORMATION FROM SEARCH:")
                    for i, pricing in enumerate(upc_analysis["pricing_info"]):
                        print(f"  Search result {i + 1}: {pricing}")
            else:
                print(f"UPC {target_upc} not found in analysis data")
        else:
            # Analyze all UPCs for BOGO patterns
            print(f"\n{'=' * 60}")
            print("ANALYZING ALL UPCS FOR BOGO PATTERNS")
            print(f"{'=' * 60}")

            bogo_upcs = []

            for upc, upc_data in data.items():
                upc_analysis = analyze_upc_data(upc_data)

                if upc_analysis["bogo_steps"]:
                    bogo_upcs.append(
                        {
                            "upc": upc,
                            "bogo_steps": len(upc_analysis["bogo_steps"]),
                            "bogo_types": list(
                                set(
                                    [
                                        step["bogo_type"]
                                        for step in upc_analysis["bogo_steps"]
                                    ]
                                )
                            ),
                        }
                    )

            if bogo_upcs:
                print(f"Found {len(bogo_upcs)} UPCs with BOGO patterns:")
                for bogo_upc in bogo_upcs:
                    print(
                        f"  UPC {bogo_upc['upc']}: {bogo_upc['bogo_steps']} BOGO steps - {', '.join(bogo_upc['bogo_types'])}"
                    )
            else:
                print("No UPCs with BOGO patterns found")

        # Save results to JSON file
        output_file = f"json_cart_bogo_analysis_{Path(analysis_file).stem}.json"

        if target_upc:
            results = {
                "target_upc": target_upc,
                "analysis": upc_analysis if upc_analysis else None,
            }
        else:
            results = {"all_upcs_bogo": bogo_upcs}

        with open(output_file, "w") as f:
            json.dump(results, f, indent=2, default=str)

        print(f"\nDetailed BOGO analysis saved to: {output_file}")

    except Exception as e:
        print(f"Error analyzing file: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
