#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Shopping list defrag functionality demonstration
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package, jupyter notebook
 */

Meijer Shopping List Defrag Demo Generator
=========================================

This script generates a Jupyter notebook demonstrating the shopping list defrag functionality.
The defrag feature organizes shopping list items by aisle number for more efficient shopping.
"""

import json
from typing import Any, Dict


def create_defrag_demo_notebook() -> Dict[str, Any]:
    """
    Create a Jupyter notebook demonstrating shopping list defrag functionality.

    Returns:
        Dict[str, Any]: Complete Jupyter notebook structure
    """

    notebook = {
        "cells": [],
        "metadata": {"language_info": {"name": "python"}},
        "nbformat": 4,
        "nbformat_minor": 2,
    }

    # Title cell
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "# Meijer Shopping List Defrag Demo\n",
                "\n",
                "This notebook demonstrates the shopping list **defrag** functionality, which:\n",
                "\n",
                "1. **Analyzes** your current shopping list items\n",
                "2. **Searches** for each item to find its store location (aisle & section)\n",
                "3. **Reorganizes** items by ascending aisle number\n",
                "4. **Adds location info** to item notes for easy navigation\n",
                "\n",
                "Perfect for optimizing your shopping route through the store!\n",
                "\n",
                "## What is Defrag?\n",
                "\n",
                'Shopping list "defrag" reorganizes your list for maximum efficiency:\n',
                "- Items are sorted by **aisle number** (1, 2, 3, etc.)\n",
                "- **Location information** is added to notes (Aisle: 5 | Section: Dairy)\n",
                "- **No more backtracking** through the store\n",
                "- **Faster shopping** with a logical route\n",
                "\n",
                "## Prerequisites\n",
                "- Valid Meijer authentication (auth.txt or ~/.config/meijer.txt)\n",
                "- Items in your shopping list\n",
                "- Meijer package installed (`pip install -e .`)\n",
            ],
        }
    )

    # Setup cell
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": ["## Setup and Authentication\n"],
        }
    )

    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Import required packages\n",
                "from meijer import Meijer\n",
                "import pandas as pd\n",
                "from datetime import datetime\n",
                "import time\n",
                "\n",
                "# Try to import tabulate for better table formatting\n",
                "try:\n",
                "    from tabulate import tabulate\n",
                "    TABULATE_AVAILABLE = True\n",
                '    print("✅ Tabulate available for enhanced table formatting")\n',
                "except ImportError:\n",
                "    TABULATE_AVAILABLE = False\n",
                '    print("📝 Install tabulate for better tables: pip install tabulate")\n',
                "\n",
                "# Initialize the Meijer client\n",
                'print("🚀 Initializing Meijer client...")\n',
                "client = Meijer()\n",
                "\n",
                "# Check authentication status\n",
                'if client.auth_status.name == "AUTHENTICATED":\n',
                '    print("✅ Successfully authenticated!")\n',
                '    print(f"🔐 Auth method: {client.auth_status}")\n',
                "else:\n",
                '    print("❌ Authentication failed. Please check your credentials.")\n',
                '    print("   Ensure you have auth.txt or ~/.config/meijer.txt configured")\n',
            ],
        }
    )

    # Show current list
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 1: View Current Shopping List\n",
                "\n",
                "Let's see what's currently in your shopping list before defragging.\n",
            ],
        }
    )

    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Get current shopping list\n",
                'print("📋 Getting current shopping list...")\n',
                "current_items = client.list.get()\n",
                "\n",
                'print(f"Found {len(current_items)} items in shopping list")\n',
                "\n",
                "if current_items:\n",
                "    # Display current items in a table\n",
                "    current_data = []\n",
                "    \n",
                "    for i, item in enumerate(current_items, 1):\n",
                "        current_data.append({\n",
                "            'Order': i,\n",
                "            'Item': item.name[:40],  # Truncate long names\n",
                "            'Quantity': item.quantity,\n",
                "            'Notes': item.notes[:30] if item.notes else 'None',\n",
                "            'Status': '✅ Done' if item.checked else '⏳ Pending',\n",
                "            'UPC': item.upc or 'N/A'\n",
                "        })\n",
                "    \n",
                "    df_current = pd.DataFrame(current_data)\n",
                '    print("\\n📊 Current Shopping List (Before Defrag):")\n',
                "    display(df_current)\n",
                "    \n",
                '    print(f"\\n💡 Notice: Items are in the order they were added, not organized by store layout")\n',
                "else:\n",
                '    print("📝 Your shopping list is empty!")\n',
                '    print("\\n🛒 Add some items first:")\n',
                '    print("   • Use the Meijer app to add items")\n',
                "    print(\"   • Or use: client.list.add_item_with_details('UPC', description='Item Name')\")\n",
            ],
        }
    )

    # Add sample items if needed
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 2: Add Sample Items (Optional)\n",
                "\n",
                "If your list is empty, let's add some sample items to demonstrate the defrag functionality.\n",
            ],
        }
    )

    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Add sample items if the list is empty or small\n",
                "if len(current_items) < 3:\n",
                '    print("🛒 Adding sample items for demonstration...")\n',
                "    \n",
                "    sample_items = [\n",
                "        {'description': 'Milk', 'upc': '0001234567890'},\n",
                "        {'description': 'Bread', 'upc': '0001234567891'},\n",
                "        {'description': 'Cereal', 'upc': '0001234567892'},\n",
                "        {'description': 'Oreos', 'upc': '0001234567893'},\n",
                "        {'description': 'Ground Turkey', 'upc': '0001234567894'}\n",
                "    ]\n",
                "    \n",
                "    added_count = 0\n",
                "    for item in sample_items:\n",
                "        success = client.list.add_item_with_details(\n",
                "            upc=item['upc'],\n",
                "            description=item['description'],\n",
                "            quantity=1\n",
                "        )\n",
                "        if success:\n",
                "            added_count += 1\n",
                "            print(f\"  ✅ Added: {item['description']}\")\n",
                "        else:\n",
                "            print(f\"  ❌ Failed to add: {item['description']}\")\n",
                "        \n",
                "        time.sleep(0.5)  # Be nice to the API\n",
                "    \n",
                '    print(f"\\n📊 Added {added_count} sample items")\n',
                "    \n",
                "    # Refresh the list\n",
                "    current_items = client.list.get()\n",
                '    print(f"📋 Updated list now has {len(current_items)} items")\n',
                "else:\n",
                '    print("📋 Using existing items in your shopping list")\n',
            ],
        }
    )

    # The main defrag step
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 3: Run the Defrag Process\n",
                "\n",
                "Now for the magic! The defrag function will:\n",
                "1. Search for each item to find its location in the store\n",
                "2. Sort items by aisle number\n",
                "3. Re-add them with location information in the notes\n",
            ],
        }
    )

    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Run the defrag process\n",
                'print("🔧 Starting shopping list defrag process...")\n',
                'print("⏳ This may take a moment as we search for each item\'s location")\n',
                'print("-" * 60)\n',
                "\n",
                "# Run defrag (you can optionally specify a store_id)\n",
                "defrag_success = client.list.defrag()\n",
                "\n",
                'print("-" * 60)\n',
                "if defrag_success:\n",
                '    print("🎉 Defrag completed successfully!")\n',
                "else:\n",
                '    print("❌ Defrag encountered some issues")\n',
            ],
        }
    )

    # Show results
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 4: View the Defragged List\n",
                "\n",
                "Let's see how the defrag process organized your shopping list!\n",
                "\n",
                "**New Feature**: The defrag function now shows detailed matching information:\n",
                "- **Original Item**: What you had in your list\n",
                "- **Closest Match**: What the search actually found\n",
                "- **Brand & Price**: Details of the matched product\n",
                "- **Aisle & Section**: Store location information\n",
                "- **Match Confidence**: How well the search matched your item\n",
            ],
        }
    )

    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Get the defragged shopping list\n",
                'print("📋 Getting defragged shopping list...")\n',
                "defragged_items = client.list.get()\n",
                "\n",
                'print(f"Found {len(defragged_items)} items in defragged list")\n',
                "\n",
                "if defragged_items:\n",
                "    # Display defragged items in a detailed table\n",
                "    defragged_data = []\n",
                "    \n",
                "    for i, item in enumerate(defragged_items, 1):\n",
                "        # Extract detailed information from enhanced notes\n",
                "        aisle_info = 'Unknown'\n",
                "        matched_product = 'No match'\n",
                "        brand_info = 'N/A'\n",
                "        price_info = 'N/A'\n",
                "        confidence = 'Unknown'\n",
                "        \n",
                "        if item.notes:\n",
                "            # Parse enhanced notes for detailed information\n",
                "            if 'Aisle:' in item.notes:\n",
                "                try:\n",
                "                    aisle_part = item.notes.split('Aisle:')[1].split('|')[0].strip()\n",
                "                    aisle_info = aisle_part\n",
                "                except:\n",
                "                    pass\n",
                "            \n",
                "            if 'Matched:' in item.notes:\n",
                "                try:\n",
                "                    match_part = item.notes.split('Matched:')[1].split('|')[0].strip()\n",
                "                    matched_product = match_part[:40] + '...' if len(match_part) > 40 else match_part\n",
                "                except:\n",
                "                    pass\n",
                "            \n",
                "            if 'Brand:' in item.notes:\n",
                "                try:\n",
                "                    brand_part = item.notes.split('Brand:')[1].split('|')[0].strip()\n",
                "                    brand_info = brand_part\n",
                "                except:\n",
                "                    pass\n",
                "            \n",
                "            if 'Price:' in item.notes:\n",
                "                try:\n",
                "                    price_part = item.notes.split('Price:')[1].split('|')[0].strip()\n",
                "                    price_info = price_part\n",
                "                except:\n",
                "                    pass\n",
                "            \n",
                "            if 'Match Confidence:' in item.notes:\n",
                "                try:\n",
                "                    conf_part = item.notes.split('Match Confidence:')[1].split('|')[0].strip()\n",
                "                    confidence = conf_part\n",
                "                except:\n",
                "                    pass\n",
                "        \n",
                "        defragged_data.append({\n",
                "            'Order': i,\n",
                "            'Original Item': item.name[:25] + '...' if len(item.name) > 25 else item.name,\n",
                "            'Closest Match': matched_product,\n",
                "            'Brand': brand_info,\n",
                "            'Price': price_info,\n",
                "            'Aisle': aisle_info,\n",
                "            'Confidence': confidence,\n",
                "            'Quantity': item.quantity,\n",
                "            'Status': '✅ Done' if item.checked else '⏳ Pending'\n",
                "        })\n",
                "    \n",
                "    df_defragged = pd.DataFrame(defragged_data)\n",
                '    print("\\n📊 Defragged Shopping List (Organized by Aisle with Match Details):")\n',
                "    display(df_defragged)\n",
                "    \n",
                "    # Show aisle distribution\n",
                "    aisle_counts = {}\n",
                "    for item_data in defragged_data:\n",
                "        aisle = item_data['Aisle']\n",
                "        aisle_counts[aisle] = aisle_counts.get(aisle, 0) + 1\n",
                "    \n",
                '    print("\\n🏪 Items by Aisle:")\n',
                "    for aisle, count in sorted(aisle_counts.items(), key=lambda x: (x[0] == 'Unknown', x[0])):\n",
                '        print(f"  📍 Aisle {aisle}: {count} item(s)")\n',
                "    \n",
                "    # Show confidence distribution\n",
                "    confidence_counts = {}\n",
                "    for item_data in defragged_data:\n",
                "        conf = item_data['Confidence']\n",
                "        confidence_counts[conf] = confidence_counts.get(conf, 0) + 1\n",
                "    \n",
                '    print("\\n🎯 Match Confidence Distribution:")\n',
                "    for conf, count in confidence_counts.items():\n",
                '        print(f"  {conf}: {count} item(s)")\n',
                "        \n",
                "else:\n",
                '    print("📝 No items found in the defragged list")\n',
            ],
        }
    )

    # Show enhanced notes example
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 4.5: Enhanced Notes Example\n",
                "\n",
                "The defrag function now creates detailed notes for each item. Here's what you'll see:\n",
            ],
        }
    )

    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Show example of enhanced notes\n",
                "if defragged_items:\n",
                '    print("📝 Example of Enhanced Notes (showing first 3 items):")\n',
                '    print("=" * 80)\n',
                "    \n",
                "    for i, item in enumerate(defragged_items[:3], 1):\n",
                '        print(f"\\n{i}. {item.name}")\n',
                '        print(f"   Quantity: {item.quantity}")\n',
                "        if item.notes:\n",
                '            print(f"   Enhanced Notes:")\n',
                "            # Split notes by | and format nicely\n",
                "            note_parts = item.notes.split(' | ')\n",
                "            for part in note_parts:\n",
                '                print(f"      • {part}")\n',
                "        else:\n",
                '            print(f"   Notes: None")\n',
                "    \n",
                '    print("\\n💡 Benefits of Enhanced Notes:")\n',
                '    print("  ✅ Know exactly what product was matched")\n',
                '    print("  ✅ See brand and price information")\n',
                '    print("  ✅ Understand match confidence level")\n',
                '    print("  ✅ Have complete location details")\n',
                '    print("  ✅ Preserve your original notes")\n',
                "else:\n",
                '    print("📝 No items to show enhanced notes for")\n',
            ],
        }
    )

    # Compare before/after
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 5: Benefits of Defragging\n",
                "\n",
                "Here's what the defrag process accomplished:\n",
                "\n",
                "**🆕 NEW: Enhanced Verbose Output**\n",
                "- **Detailed Matching Table**: See exactly what was found for each item\n",
                '- **Product Verification**: Know if "Milk" matched "Meijer Brand Milk, 2%" or "Milk of Magnesia"\n',
                "- **Brand & Price Info**: Get complete product details\n",
                "- **Match Confidence**: Understand how well each search performed\n",
            ],
        }
    )

    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Analyze the defrag benefits\n",
                'print("🎯 Defrag Analysis & Benefits:")\n',
                'print("=" * 50)\n',
                "\n",
                "if defragged_items:\n",
                "    # Count items with location data\n",
                "    items_with_aisle = 0\n",
                "    items_with_section = 0\n",
                "    items_with_match = 0\n",
                "    items_with_price = 0\n",
                "    items_with_brand = 0\n",
                "    \n",
                "    for item in defragged_items:\n",
                "        if item.notes:\n",
                "            if 'Aisle:' in item.notes:\n",
                "                items_with_aisle += 1\n",
                "            if 'Section:' in item.notes:\n",
                "                items_with_section += 1\n",
                "            if 'Matched:' in item.notes:\n",
                "                items_with_match += 1\n",
                "            if 'Price:' in item.notes:\n",
                "                items_with_price += 1\n",
                "            if 'Brand:' in item.notes:\n",
                "                items_with_brand += 1\n",
                "    \n",
                "    benefits_data = {\n",
                "        'Metric': [\n",
                "            'Total Items',\n",
                "            'Items with Aisle Info',\n",
                "            'Items with Section Info',\n",
                "            'Items with Product Match',\n",
                "            'Items with Price Info',\n",
                "            'Items with Brand Info',\n",
                "            'Location Coverage',\n",
                "            'Organization Status'\n",
                "        ],\n",
                "        'Value': [\n",
                "            len(defragged_items),\n",
                "            items_with_aisle,\n",
                "            items_with_section,\n",
                "            items_with_match,\n",
                "            items_with_price,\n",
                "            items_with_brand,\n",
                '            f"{(items_with_aisle/len(defragged_items)*100):.1f}%",\n',
                '            "✅ Organized by Aisle"\n',
                "        ]\n",
                "    }\n",
                "    \n",
                "    benefits_df = pd.DataFrame(benefits_data)\n",
                "    display(benefits_df)\n",
                "    \n",
                '    print("\\n🛒 Shopping Efficiency Improvements:")\n',
                '    print("  ✅ Items organized by ascending aisle number")\n',
                '    print("  ✅ Location information added to notes")\n',
                '    print("  ✅ Logical shopping route through the store")\n',
                '    print("  ✅ Reduced backtracking and missed items")\n',
                '    print("  ✅ Faster, more efficient shopping experience")\n',
                "    \n",
                '    print("\\n🔍 Enhanced Product Information:")\n',
                '    print("  ✅ Know exactly what product was matched")\n',
                '    print("  ✅ Verify brand and price before shopping")\n',
                '    print("  ✅ Understand match confidence levels")\n',
                '    print("  ✅ Catch incorrect matches (e.g., Milk vs Milk of Magnesia)")\n',
                '    print("  ✅ Complete product details in item notes")\n',
                "    \n",
                "    if items_with_aisle < len(defragged_items):\n",
                "        missing_count = len(defragged_items) - items_with_aisle\n",
                '        print(f"\\n💡 Note: {missing_count} item(s) don\'t have aisle information")\n',
                '        print("   This could be because:")\n',
                '        print("   • Item is not available in-store")\n',
                '        print("   • Search didn\'t find a matching product")\n',
                '        print("   • Item location data is not available")\n',
                "        \n",
                "    if items_with_match < len(defragged_items):\n",
                "        no_match_count = len(defragged_items) - items_with_match\n",
                '        print(f"\\n⚠️  Warning: {no_match_count} item(s) couldn\'t be matched to products")\n',
                '        print("   Consider:")\n',
                '        print("   • Checking spelling of item names")\n',
                '        print("   • Using more specific product names")\n',
                '        print("   • Verifying items are available at Meijer")\n',
                "else:\n",
                '    print("❌ No items to analyze")\n',
            ],
        }
    )

    # Usage guide
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 6: How to Use Defrag in Your Workflow\n",
                "\n",
                "### Quick Reference:\n",
                "```python\n",
                "# Basic defrag (uses current store)\n",
                "client.list.defrag()\n",
                "\n",
                "# Defrag for specific store\n",
                'client.list.defrag(store_id="123")\n',
                "\n",
                "# Get your organized list\n",
                "organized_items = client.list.get()\n",
                "```\n",
                "\n",
                "### Best Practices:\n",
                "\n",
                "1. **Regular Defragging**: Run defrag after adding multiple items\n",
                "2. **Store-Specific**: Use store_id for most accurate aisle information\n",
                "3. **Before Shopping**: Always defrag before heading to the store\n",
                "4. **Check Notes**: Review the location notes for navigation help\n",
                "5. **Batch Adding**: Add all items first, then defrag once\n",
                "\n",
                "### When to Defrag:\n",
                "- ✅ After adding multiple items to your list\n",
                "- ✅ Before going shopping\n",
                "- ✅ When switching to a different store\n",
                "- ✅ When your list feels disorganized\n",
                "\n",
                "### Defrag Features:\n",
                "- 🔍 **Smart Search**: Finds products automatically\n",
                "- 📍 **Location Detection**: Extracts aisle and section info\n",
                "- 📊 **Intelligent Sorting**: Handles numeric and alphabetic aisles\n",
                "- 📝 **Note Enhancement**: Adds location info to item notes\n",
                "- 🔄 **Preserves Data**: Keeps quantities, completion status, etc.\n",
            ],
        }
    )

    # Final summary
    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Final summary\n",
                'print("🎊 Shopping List Defrag Demo Complete!")\n',
                'print("=" * 50)\n',
                "\n",
                "final_items = client.list.get()\n",
                "if final_items:\n",
                '    print(f"📋 Your list now has {len(final_items)} organized items")\n',
                '    print("🏪 Items are sorted by aisle for efficient shopping")\n',
                '    print("📱 Use this organized list in the Meijer app or mobile site")\n',
                "    \n",
                '    print("\\n🚶‍♀️ Shopping Route Preview:")\n',
                "    for i, item in enumerate(final_items[:5], 1):  # Show first 5 items\n",
                "        aisle = 'Unknown'\n",
                "        if item.notes and 'Aisle:' in item.notes:\n",
                "            try:\n",
                "                aisle = item.notes.split('Aisle:')[1].split('|')[0].strip()\n",
                "            except:\n",
                "                pass\n",
                '        print(f"  {i}. {item.name} → Aisle {aisle}")\n',
                "    \n",
                "    if len(final_items) > 5:\n",
                '        print(f"  ... and {len(final_items) - 5} more items")\n',
                "        \n",
                '    print("\\n💡 Pro Tip: Your shopping list is now optimized for a logical")\n',
                '    print("   route through the store, saving you time and steps!")\n',
                "else:\n",
                '    print("📝 No items in final list")\n',
                "\n",
                'print("\\n✨ Happy organized shopping! ✨")\n',
            ],
        }
    )

    return notebook


def main() -> None:
    """Generate the shopping list defrag demo notebook."""

    # Create the notebook
    notebook = create_defrag_demo_notebook()

    # Write to file
    output_file = "shopping_list_defrag_demo.ipynb"

    with open(output_file, "w", encoding="utf-8") as f:
        json.dump(notebook, f, indent=2, ensure_ascii=False)

    print(f"📝 Generated notebook: {output_file}")
    print("🚀 Open with: jupyter notebook Shopping_List_Defrag_Demo.ipynb")
    print("💡 Or use in VS Code with the Jupyter extension")


if __name__ == "__main__":
    main()
