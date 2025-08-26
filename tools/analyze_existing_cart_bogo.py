#!/usr/bin/env python3
"""
Analyze Existing Cart Progression for BOGO Patterns

This script analyzes the existing cart progression data to identify BOGO patterns,
including BOGO40% deals, by examining the price changes as items are added.
"""

import sys
import json
from pathlib import Path
from typing import List, Dict, Any


def analyze_cart_progression_for_bogo(
    cart_progression: List[Dict[str, Any]],
) -> List[Dict[str, Any]]:
    """
    Analyze cart progression to identify BOGO pricing patterns.

    Args:
        cart_progression: List of cart progression steps

    Returns:
        List of cart progression steps with BOGO analysis
    """
    analyzed_steps = []

    for i, step in enumerate(cart_progression):
        cart_now = step.get("cart_now_total", 0)
        cart_was = step.get("cart_was_total", 0)
        savings = step.get("savings_total", 0)

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
            }
        )

    return analyzed_steps


def analyze_upc_cart_progression(upc_data: List[Dict[str, Any]]) -> Dict[str, Any]:
    """
    Analyze cart progression for a specific UPC.

    Args:
        upc_data: List of flows for a specific UPC

    Returns:
        Dictionary with cart progression analysis
    """
    # Extract cart flows
    cart_flows = [flow for flow in upc_data if flow.get("flow_type") == "cart"]

    if not cart_flows:
        return {"error": "No cart flows found for this UPC"}

    # Sort by occurrence
    cart_flows.sort(key=lambda x: x.get("occurrence", 0))

    # Analyze cart progression
    cart_progression = analyze_cart_progression_for_bogo(cart_flows)

    return {
        "upc": upc_data[0].get("upc"),
        "total_flows": len(upc_data),
        "cart_flows": len(cart_flows),
        "cart_progression": cart_progression,
        "bogo_steps": [step for step in cart_progression if step["bogo_indicator"]],
    }


def main():
    """Main function."""
    if len(sys.argv) < 2:
        print("Usage: python analyze_existing_cart_bogo.py <analysis_file> [upc]")
        sys.exit(1)

    analysis_file = sys.argv[1]
    target_upc = sys.argv[2] if len(sys.argv) > 2 else None

    print("Existing Cart BOGO Analysis")
    print(f"Analysis file: {analysis_file}")

    try:
        # Read the analysis file
        with open(analysis_file, "r") as f:
            data = json.load(f)

        print(f"Loaded analysis data for {len(data)} UPCs")
        print("=" * 80)

        if target_upc:
            # Analyze specific UPC
            if target_upc in data:
                print(f"\n{'=' * 60}")
                print(f"ANALYZING UPC: {target_upc}")
                print(f"{'=' * 60}")

                upc_analysis = analyze_upc_cart_progression(data[target_upc])

                if "error" not in upc_analysis:
                    print(f"Total flows: {upc_analysis['total_flows']}")
                    print(f"Cart flows: {upc_analysis['cart_flows']}")

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
                else:
                    print(f"Error: {upc_analysis['error']}")
            else:
                print(f"UPC {target_upc} not found in analysis data")
        else:
            # Analyze all UPCs for BOGO patterns
            print(f"\n{'=' * 60}")
            print("ANALYZING ALL UPCS FOR BOGO PATTERNS")
            print(f"{'=' * 60}")

            bogo_upcs = []

            for upc, upc_data in data.items():
                upc_analysis = analyze_upc_cart_progression(upc_data)

                if "error" not in upc_analysis and upc_analysis["bogo_steps"]:
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
        output_file = f"existing_cart_bogo_analysis_{Path(analysis_file).stem}.json"

        if target_upc and target_upc in data:
            results = {
                "target_upc": target_upc,
                "analysis": analyze_upc_cart_progression(data[target_upc]),
            }
        else:
            results = {"all_upcs_bogo": bogo_upcs if not target_upc else []}

        with open(output_file, "w") as f:
            json.dump(results, f, indent=2, default=str)

        print(f"\nDetailed BOGO analysis saved to: {output_file}")

    except Exception as e:
        print(f"Error analyzing file: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
