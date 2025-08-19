#!/usr/bin/env python3
"""
Generate focused Jupyter notebooks for Meijer client.py

This module creates multiple focused notebooks, each covering a specific area
of functionality rather than one massive notebook.
"""

import nbformat as nbf

from .client_notebook_gen_sections import (
    create_basic_usage_notebook,
    create_coupons_notebook,
    create_mperks_notebook,
    create_search_notebook,
    create_shopping_list_notebook,
    create_stores_notebook,
)


def create_all_notebooks():
    """Create all focused notebooks."""
    notebooks = [
        ("basic_usage", create_basic_usage_notebook()),
        ("shopping_list", create_shopping_list_notebook()),
        ("search", create_search_notebook()),
        ("stores", create_stores_notebook()),
        ("coupons", create_coupons_notebook()),
        ("mperks", create_mperks_notebook()),
    ]

    for name, nb in notebooks:
        filename = f"{name}.ipynb"
        nbf.write(nb, filename)
        print(f"✅ Created {filename}")

    print(f"\n🎉 All {len(notebooks)} notebooks generated successfully!")


if __name__ == "__main__":
    create_all_notebooks()
