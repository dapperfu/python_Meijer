#!/usr/bin/env python3
"""
Generate focused Jupyter notebooks for Meijer client.py - Core Module

This module orchestrates the creation of multiple focused notebooks,
each covering a specific area of functionality.
"""

from pathlib import Path

import nbformat as nbf
from client_notebook_gen_sections import (
    create_ad_browser_notebook,
    create_basic_usage_notebook,
    create_cart_notebook,
    create_coupon_operations_notebook,
    create_coupons_notebook,
    create_feedback_notebook,
    create_gas_notebook,
    create_mperks_notebook,
    create_product_operations_notebook,
    create_search_notebook,
    create_settings_notebook,
    create_shop_scan_notebook,
    create_shopping_list_notebook,
    create_stores_notebook,
)


def main():
    """Generate all focused notebooks."""

    print("🚀 GENERATING COMPREHENSIVE MEIJER CLIENT NOTEBOOKS")
    print("=" * 60)

    # Create notebooks directory if it doesn't exist
    notebook_dir = Path(".")
    notebook_dir.mkdir(exist_ok=True)

    # Define all notebook creators
    notebook_creators = [
        (
            "basic_usage",
            create_basic_usage_notebook,
            "Client initialization and authentication",
        ),
        ("shopping_list", create_shopping_list_notebook, "Shopping list management"),
        ("search", create_search_notebook, "Product search functionality"),
        ("stores", create_stores_notebook, "Store operations and information"),
        ("coupons", create_coupons_notebook, "Coupon management"),
        ("mperks", create_mperks_notebook, "mPerks rewards and loyalty"),
        ("gas", create_gas_notebook, "Gas station information and services"),
        ("cart", create_cart_notebook, "Shopping cart management"),
        ("shop_scan", create_shop_scan_notebook, "Shop & Scan functionality"),
        ("feedback", create_feedback_notebook, "Feedback submission system"),
        ("settings", create_settings_notebook, "Account settings and preferences"),
        ("ad_browser", create_ad_browser_notebook, "Ad browsing and promotions"),
        (
            "product_operations",
            create_product_operations_notebook,
            "Product operations and management",
        ),
        (
            "coupon_operations",
            create_coupon_operations_notebook,
            "Advanced coupon operations",
        ),
    ]

    successful_notebooks = []
    failed_notebooks = []

    for notebook_name, creator_func, description in notebook_creators:
        try:
            print(f"📝 Creating {notebook_name}.ipynb...")
            print(f"   Description: {description}")

            # Generate the notebook
            nb = creator_func()

            # Save the notebook
            notebook_path = notebook_dir / f"{notebook_name}.ipynb"
            with open(notebook_path, "w", encoding="utf-8") as f:
                nbf.write(nb, f)

            print(f"   ✅ Created {notebook_path}")
            successful_notebooks.append(notebook_name)

        except Exception as e:
            print(f"   ❌ Failed to create {notebook_name}.ipynb: {e}")
            failed_notebooks.append(notebook_name)

    # Summary
    print("\n" + "=" * 60)
    print("📊 GENERATION SUMMARY")
    print("=" * 60)

    print(f"✅ Successful: {len(successful_notebooks)}")
    print(f"❌ Failed: {len(failed_notebooks)}")
    print(f"📁 Total: {len(notebook_creators)}")

    if successful_notebooks:
        print("\n🎉 Successfully created notebooks:")
        for notebook in successful_notebooks:
            print(f"   📚 {notebook}.ipynb")

    if failed_notebooks:
        print("\n⚠️  Failed to create notebooks:")
        for notebook in failed_notebooks:
            print(f"   ❌ {notebook}.ipynb")

    print("\n💡 These notebooks provide comprehensive coverage of:")
    print("   - Core client functionality")
    print("   - Shopping and list management")
    print("   - Store and location services")
    print("   - Coupons and rewards")
    print("   - Gas station services")
    print("   - Cart management")
    print("   - Shop & Scan features")
    print("   - Feedback and settings")
    print("   - Ad browsing")
    print("   - Product operations")

    return len(failed_notebooks) == 0


if __name__ == "__main__":
    success = main()
    if success:
        print("\n🎉 All notebooks generated successfully!")
    else:
        print("\n⚠️  Some notebooks failed to generate. Check the errors above.")
