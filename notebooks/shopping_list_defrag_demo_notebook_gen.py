#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Shopping list defrag functionality demonstration with latest methodology
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

This script generates a Jupyter notebook demonstrating the latest shopping list defrag functionality.
The defrag feature now includes advanced sorting options, enhanced product matching, and detailed location information.
"""

import json
from typing import Any, Dict


def create_defrag_demo_notebook() -> Dict[str, Any]:
    """
    Create a Jupyter notebook demonstrating the latest shopping list defrag functionality.

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
                "# Meijer Shopping List Defrag Demo - Latest Features\n",
                "\n",
                "This notebook demonstrates the **enhanced shopping list defrag functionality** with the latest methodology:\n",
                "\n",
                "## 🆕 Latest Defrag Features\n",
                "\n",
                "### Advanced Sorting Options\n",
                "1. **Normal Sorting**: Items organized by ascending aisle number\n",
                "2. **Reverse Sorting**: Items organized by descending aisle number\n",
                "3. **Zig-Zag Sorting**: Smart alternating pattern for B aisles (B1↑, B2↓, B3↑, etc.)\n",
                "\n",
                "### Enhanced Product Matching\n",
                "1. **UPC-Based Lookup**: Direct product detail retrieval for accurate location data\n",
                "2. **Smart Search Fallback**: Intelligent search when UPC lookup fails\n",
                "3. **Category-Based Organization**: Uses L-level categories when aisle data unavailable\n",
                "4. **Broader Search Terms**: Automatic fallback to related product categories\n",
                "\n",
                "### Rich Location Information\n",
                "1. **Real Aisle Data**: B15:35-4 format for precise navigation\n",
                "2. **Category Mapping**: L3-4131 → Sub4131 for logical grouping\n",
                "3. **Product Details**: Brand, price, and description in enhanced notes\n",
                "4. **Match Confidence**: High/Medium/Low confidence indicators\n",
                "\n",
                "## What is Defrag?\n",
                "\n",
                'Shopping list "defrag" reorganizes your list for maximum efficiency:\n',
                "- Items are sorted by **aisle number** (1, 2, 3, etc.)\n",
                "- **Location information** is added to notes (B15:35-4 | Product Description)\n",
                "- **No more backtracking** through the store\n",
                "- **Faster shopping** with a logical route\n",
                "- **Smart zig-zag patterns** for optimal B aisle navigation\n",
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
                "\n",
                "**Note**: The shopping list now has rich Jupyter Notebook integration with `_repr_html_`, `_repr_markdown_`, and `_repr_pretty_` methods!\n",
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
                "# 🆕 NEW: Rich Jupyter Notebook Integration!\n",
                'print("\\n🎨 Rich Jupyter Notebook Representations:")\n',
                'print("=" * 50)\n',
                "\n",
                "# Display the shopping list with rich formatting\n",
                'print("\\n📝 Shopping List Object (rich HTML representation):")\n',
                "display(client.list)\n",
                "\n",
                "# Show individual items with rich formatting\n",
                "if current_items:\n",
                '    print("\\n🛒 Individual Items (rich representations):")\n',
                '    print("-" * 40)\n',
                "    for i, item in enumerate(current_items[:3], 1):  # Show first 3 items\n",
                '        print(f"\\n{i}. Item Object:")\n',
                "        display(item)\n",
                "    \n",
                "    if len(current_items) > 3:\n",
                '        print(f"\\n... and {len(current_items) - 3} more items")\n",
                "    \n",
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

    # The main defrag step with new options
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 3: Run the Defrag Process with Advanced Options\n",
                "\n",
                "Now for the magic! The enhanced defrag function now supports multiple sorting strategies:\n",
                "\n",
                "### 🆕 New Defrag Options:\n",
                "1. **Normal Defrag**: `client.list.defrag()` - Standard aisle-based sorting\n",
                "2. **Reverse Defrag**: `client.list.defrag(reverse=True)` - Descending aisle order\n",
                "3. **Zig-Zag Defrag**: `client.list.defrag(zig=True)` - Smart B aisle pattern\n",
                "4. **Combined Options**: `client.list.defrag(reverse=True, zig=True)` - Both features\n",
                "\n",
                "### Enhanced Methodology:\n",
                "1. **UPC Priority**: First tries direct product lookup for real aisle data\n",
                "2. **Smart Search**: Falls back to intelligent product search\n",
                "3. **Category Mapping**: Uses L-level categories when aisle data unavailable\n",
                "4. **Location Extraction**: Parses complex location formats (B15:35-4)\n",
                "5. **Product Matching**: Finds closest product match with confidence scoring\n",
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
                "# Run the defrag process with different options\n",
                'print("🔧 Shopping List Defrag Options Demo")\n',
                'print("=" * 50)\n',
                "\n",
                "# Option 1: Normal defrag (default)\n",
                'print("\\n📋 Option 1: Normal Defrag (Standard Aisle Sorting)")\n',
                'print("-" * 45)\n',
                'print("Command: client.list.defrag()")\n',
                'print("Result: Items sorted by ascending aisle number")\n',
                "\n",
                "# Run normal defrag\n",
                "defrag_success = client.list.defrag()\n",
                "\n",
                "if defrag_success:\n",
                '    print("✅ Normal defrag completed successfully!")\n',
                "else:\n",
                '    print("❌ Normal defrag encountered issues")\n',
                "\n",
                "# Option 2: Reverse defrag\n",
                'print("\\n📋 Option 2: Reverse Defrag (Descending Aisle Order)")\n',
                'print("-" * 45)\n',
                'print("Command: client.list.defrag(reverse=True)")\n',
                'print("Result: Items sorted by descending aisle number")\n',
                "\n",
                "# Run reverse defrag\n",
                "reverse_defrag_success = client.list.defrag(reverse=True)\n",
                "\n",
                "if reverse_defrag_success:\n",
                '    print("✅ Reverse defrag completed successfully!")\n',
                "else:\n",
                '    print("❌ Reverse defrag encountered issues")\n',
                "\n",
                "# Option 3: Zig-zag defrag\n",
                'print("\\n📋 Option 3: Zig-Zag Defrag (Smart B Aisle Pattern)")\n',
                'print("-" * 45)\n',
                'print("Command: client.list.defrag(zig=True)")\n',
                'print("Result: B1 ascending, B2 descending, B3 ascending, etc.")\n',
                "\n",
                "# Run zig-zag defrag\n",
                "zig_defrag_success = client.list.defrag(zig=True)\n",
                "\n",
                "if zig_defrag_success:\n",
                '    print("✅ Zig-zag defrag completed successfully!")\n',
                "else:\n",
                '    print("❌ Zig-zag defrag encountered issues")\n',
                "\n",
                'print("\\n🎯 All defrag options demonstrated!")\n',
                'print("💡 Choose the option that best fits your shopping style")\n',
            ],
        }
    )

    # Show results with enhanced analysis
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 4: View the Defragged List with Enhanced Analysis\n",
                "\n",
                "Let's see how the enhanced defrag process organized your shopping list!\n",
                "\n",
                "### 🆕 Enhanced Features:\n",
                "- **Rich Jupyter Integration**: Beautiful HTML and Markdown representations\n",
                "- **Detailed Location Data**: Real aisle format (B15:35-4) and category mapping\n",
                "- **Product Matching**: Shows exactly what product was matched\n",
                "- **Confidence Scoring**: High/Medium/Low match confidence indicators\n",
                "- **Enhanced Notes**: Location + Product description in organized format\n",
                "\n",
                "### Location Format Examples:\n",
                "- **Real Aisle**: `B15:35-4` (Aisle B15, Section 35, Bay 4)\n",
                "- **Category**: `Cat:Sub4131` (L3 category 4131)\n",
                "- **Product Info**: `B15:35-4 | Meijer Brand Milk, 2%`\n",
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
                "# 🆕 NEW: Rich Jupyter Notebook Integration!\n",
                'print("\\n🎨 Enhanced Shopping List Display:")\n',
                'print("=" * 40)\n',
                "\n",
                "# Display the shopping list with rich formatting\n",
                "print("\\n📝 Defragged Shopping List (rich HTML representation):")\n",
                "display(client.list)\n",
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
                "        location_format = 'Unknown'\n",
                "        \n",
                "        if item.notes:\n",
                "            # Parse enhanced notes for detailed information\n",
                "            if ':' in item.notes and '|' in item.notes:\n",
                "                # New format: "B15:35-4 | Product Description"\n",
                "                location_part, product_part = item.notes.split('|', 1)\n",
                "                aisle_info = location_part.strip()\n",
                                "matched_product = product_part.strip()[:40] + '...' if len(product_part.strip()) > 40 else product_part.strip()\n",
                                "location_format = 'Real Aisle' if any(c.isalpha() for c in location_part[:2]) else 'Category'\n",
                                "confidence = 'High' if location_format == 'Real Aisle' else 'Medium'\n",
                            elif ':' in item.notes:\n",
                                # Location only format: "B15:35-4" or "Cat:Sub4131"\n",
                                "aisle_info = item.notes\n",
                                "location_format = 'Real Aisle' if any(c.isalpha() for c in item.notes[:2]) else 'Category'\n",
                                "confidence = 'High' if location_format == 'Real Aisle' else 'Medium'\n",
                            else:\n",
                                # Legacy format or unknown\n",
                                "aisle_info = item.notes\n",
                                "location_format = 'Unknown'\n",
                                "confidence = 'Low'\n",
                        \n",
                        "        defragged_data.append({\n",
                        "            'Order': i,\n",
                        "            'Original Item': item.name[:25] + '...' if len(item.name) > 25 else item.name,\n",
                        "            'Location': aisle_info,\n",
                        "            'Format': location_format,\n",
                        "            'Matched Product': matched_product,\n",
                        "            'Confidence': confidence,\n",
                        "            'Quantity': item.quantity,\n",
                        "            'Status': '✅ Done' if item.checked else '⏳ Pending'\n",
                        "        })\n",
                        "    \n",
                        "    df_defragged = pd.DataFrame(defragged_data)\n",
                        '    print("\\n📊 Defragged Shopping List (Enhanced Analysis):")\n',
                        "    display(df_defragged)\n",
                        "    \n",
                        "    # Show location format distribution\n",
                        "    format_counts = {}\n",
                        "    for item_data in defragged_data:\n",
                        "        format_type = item_data['Format']\n",
                        "        format_counts[format_type] = format_counts.get(format_type, 0) + 1\n",
                        "    \n",
                        '    print("\\n🏪 Location Format Distribution:")\n',
                        "    for format_type, count in format_counts.items():\n",
                        '        print(f"  📍 {format_type}: {count} item(s)")\n',
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

    # Show enhanced notes example with new format
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 4.5: Enhanced Notes with New Format\n",
                "\n",
                "The enhanced defrag function now creates detailed notes with the new format:\n",
                "\n",
                "### 🆕 New Note Format:\n",
                "- **Location + Product**: `B15:35-4 | Meijer Brand Milk, 2%`\n",
                "- **Category Mapping**: `Cat:Sub4131 | Product Description`\n",
                "- **Real Aisle Data**: `B15:35-4` (Aisle B15, Section 35, Bay 4)\n",
                "- **Product Details**: Brand, description, and relevant information\n",
                "\n",
                "### Benefits:\n",
                "- **Precise Navigation**: Know exactly where to find each item\n",
                "- **Product Verification**: Confirm you're getting the right product\n",
                "- **Efficient Shopping**: Logical route through the store\n",
                "- **Rich Jupyter Display**: Beautiful HTML and Markdown representations\n",
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
                "# Show example of enhanced notes with new format\n",
                "if defragged_items:\n",
                '    print("📝 Enhanced Notes with New Format (showing first 5 items):")\n',
                '    print("=" * 80)\n',
                "    \n",
                "    for i, item in enumerate(defragged_items[:5], 1):\n",
                '        print(f"\\n{i}. {item.name}")\n',
                '        print(f"   Quantity: {item.quantity}")\n',
                "        if item.notes:\n",
                '            print(f"   Enhanced Notes: {item.notes}")\n',
                "            \n",
                "            # Parse and display the new format\n",
                "            if '|' in item.notes:\n",
                "                location_part, product_part = item.notes.split('|', 1)\n",
                "                print(f"      📍 Location: {location_part.strip()}")\n",
                "                print(f"      🛒 Product: {product_part.strip()}")\n",
                "                \n",
                "                # Determine location type\n",
                "                location = location_part.strip()\n",
                "                if ':' in location and any(c.isalpha() for c in location[:2]):\n",
                '                    print(f"      🏪 Type: Real Aisle (High Confidence)")\n',
                "                elif location.startswith('Cat:'):\n",
                '                    print(f"      🏪 Type: Category Mapping (Medium Confidence)")\n',
                "                else:\n",
                '                    print(f"      🏪 Type: Other (Low Confidence)")\n',
                "            else:\n",
                "                print(f"      📍 Location: {item.notes}")\n",
                "                print(f"      🏪 Type: Location Only")\n",
                "        else:\n",
                '            print(f"   Notes: None")\n',
                "    \n",
                '    print("\\n💡 Benefits of Enhanced Notes:")\n',
                '    print("  ✅ Know exactly where to find each item")\n',
                '    print("  ✅ Verify you\'re getting the right product")\n',
                '    print("  ✅ Navigate efficiently through the store")\n',
                '    print("  ✅ Beautiful Jupyter Notebook display")\n',
                '    print("  ✅ Preserve your original notes")\n',
                "else:\n",
                '    print("📝 No items to show enhanced notes for")\n',
            ],
        }
    )

    # Compare before/after with new methodology
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 5: Enhanced Defrag Methodology Analysis\n",
                "\n",
                "Here's what the enhanced defrag process accomplished with the latest methodology:\n",
                "\n",
                "### 🆕 Latest Methodology Features:\n",
                "- **UPC Priority**: Direct product lookup for real aisle data\n",
                "- **Smart Search**: Intelligent fallback when UPC lookup fails\n",
                "- **Category Mapping**: L-level category organization (L3-4131 → Sub4131)\n",
                "- **Location Parsing**: Complex format support (B15:35-4)\n",
                "- **Product Matching**: Closest match with confidence scoring\n",
                "- **Enhanced Notes**: Location + Product description format\n",
                "- **Rich Jupyter Integration**: Beautiful HTML/Markdown representations\n",
                "\n",
                "### Advanced Sorting Options:\n",
                "- **Normal**: Ascending aisle order\n",
                "- **Reverse**: Descending aisle order\n",
                "- **Zig-Zag**: Smart B aisle pattern (B1↑, B2↓, B3↑, etc.)\n",
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
                "# Analyze the enhanced defrag methodology\n",
                'print("🎯 Enhanced Defrag Methodology Analysis:")\n',
                'print("=" * 55)\n',
                "\n",
                "if defragged_items:\n",
                "    # Count items by location format and confidence\n",
                "    real_aisle_count = 0\n",
                "    category_count = 0\n",
                "    unknown_count = 0\n",
                "    high_confidence = 0\n",
                "    medium_confidence = 0\n",
                "    low_confidence = 0\n",
                "    \n",
                "    for item in defragged_items:\n",
                "        if item.notes:\n",
                "            # Check for real aisle format (e.g., "B15:35-4")\n",
                "            if ':' in item.notes and any(c.isalpha() for c in item.notes.split(':')[0][:2]):\n",
                "                real_aisle_count += 1\n",
                "                high_confidence += 1\n",
                "            # Check for category format (e.g., "Cat:Sub4131")\n",
                "            elif item.notes.startswith('Cat:'):\n",
                "                category_count += 1\n",
                "                medium_confidence += 1\n",
                "            else:\n",
                "                unknown_count += 1\n",
                "                low_confidence += 1\n",
                "        else:\n",
                "            unknown_count += 1\n",
                "            low_confidence += 1\n",
                "    \n",
                "    methodology_data = {\n",
                "        'Metric': [\n",
                "            'Total Items',\n",
                "            'Real Aisle Data',\n",
                "            'Category Mapping',\n",
                "            'Unknown Location',\n",
                "            'High Confidence',\n",
                "            'Medium Confidence',\n",
                "            'Low Confidence',\n",
                "            'Location Coverage',\n",
                "            'Organization Status'\n",
                "        ],\n",
                "        'Value': [\n",
                "            len(defragged_items),\n",
                "            real_aisle_count,\n",
                "            category_count,\n",
                "            unknown_count,\n",
                "            high_confidence,\n",
                "            medium_confidence,\n",
                "            low_confidence,\n",
                '            f"{(real_aisle_count + category_count)/len(defragged_items)*100:.1f}%",\n",
                '            "✅ Enhanced Organization"\n',
                "        ]\n",
                "    }\n",
                "    \n",
                "    methodology_df = pd.DataFrame(methodology_data)\n",
                "    display(methodology_df)\n",
                "    \n",
                '    print("\\n🛒 Enhanced Shopping Efficiency:")\n',
                '    print("  ✅ Items organized by latest methodology")\n',
                '    print("  ✅ Real aisle data for precise navigation")\n',
                '    print("  ✅ Category mapping for logical grouping")\n',
                '    print("  ✅ Product matching with confidence scoring")\n',
                '    print("  ✅ Enhanced notes with location + product info")\n',
                "    \n",
                '    print("\\n🎨 Rich Jupyter Notebook Integration:")\n',
                '    print("  ✅ Beautiful HTML representations")\n',
                '    print("  ✅ Rich Markdown formatting")\n',
                '    print("  ✅ Interactive IPython display")\n',
                '    print("  ✅ Enhanced shopping list visualization")\n',
                "    \n",
                "    if real_aisle_count < len(defragged_items):\n",
                "        missing_count = len(defragged_items) - real_aisle_count\n",
                '        print(f"\\n💡 Note: {missing_count} item(s) don\'t have real aisle data")\n',
                '        print("   This could be because:")\n',
                '        print("   • Item is not available in-store")\n',
                '        print("   • UPC lookup failed")\n',
                '        print("   • Item location data is not available")\n',
                "        \n",
                "    if category_count > 0:\n",
                '        print(f"\\n📊 Category Mapping: {category_count} item(s) organized by category")\n',
                '        print("   This provides logical grouping when aisle data is unavailable")\n',
                "        \n",
                "else:\n",
                '    print("❌ No items to analyze")\n',
            ],
        }
    )

    # Usage guide with new options
    notebook["cells"].append(
        {
            "cell_type": "raw",
            "metadata": {"vscode": {"languageId": "raw"}},
            "source": [
                "## Step 6: How to Use Enhanced Defrag in Your Workflow\n",
                "\n",
                "### 🆕 New Defrag API Options:\n",
                "```python\n",
                "# Basic defrag (uses current store, ascending order)\n",
                "client.list.defrag()\n",
                "\n",
                "# Defrag for specific store\n",
                'client.list.defrag(store_id="123")\n',
                "\n",
                "# Reverse defrag (descending aisle order)\n",
                "client.list.defrag(reverse=True)\n",
                "\n",
                "# Zig-zag defrag (smart B aisle pattern)\n",
                "client.list.defrag(zig=True)\n",
                "\n",
                "# Combined options\n",
                "client.list.defrag(reverse=True, zig=True)\n",
                "\n",
                "# Get your organized list\n",
                "organized_items = client.list.get()\n",
                "```\n",
                "\n",
                "### Enhanced Methodology Benefits:\n",
                "\n",
                "1. **UPC Priority**: Gets real aisle data when available\n",
                "2. **Smart Fallback**: Intelligent search when UPC lookup fails\n",
                "3. **Category Organization**: Logical grouping for items without aisle data\n",
                "4. **Location Parsing**: Handles complex formats (B15:35-4)\n",
                "5. **Product Matching**: Finds closest match with confidence scoring\n",
                "6. **Enhanced Notes**: Location + Product description format\n",
                "7. **Rich Jupyter Display**: Beautiful HTML/Markdown representations\n",
                "\n",
                "### Best Practices:\n",
                "\n",
                "1. **Regular Defragging**: Run defrag after adding multiple items\n",
                "2. **Store-Specific**: Use store_id for most accurate aisle information\n",
                "3. **Before Shopping**: Always defrag before heading to the store\n",
                "4. **Check Notes**: Review the enhanced location notes\n",
                "5. **Batch Adding**: Add all items first, then defrag once\n",
                "6. **Choose Sorting**: Select normal, reverse, or zig-zag based on preference\n",
                "\n",
                "### When to Use Each Option:\n",
                "- ✅ **Normal**: Standard shopping route (aisle 1 → 20)\n",
                "- ✅ **Reverse**: Backward shopping route (aisle 20 → 1)\n",
                "- ✅ **Zig-Zag**: Smart B aisle navigation (B1↑, B2↓, B3↑, etc.)\n",
                "\n",
                "### Rich Jupyter Integration:\n",
                "- 🎨 **HTML Display**: Beautiful shopping list visualization\n",
                "- 📝 **Markdown**: Rich text formatting for documentation\n",
                "- 🔧 **IPython**: Interactive display for development\n",
                "- 📊 **Enhanced Tables**: Detailed item analysis\n",
            ],
        }
    )

    # Final summary with rich display
    notebook["cells"].append(
        {
            "cell_type": "code",
            "execution_count": None,
            "metadata": {},
            "outputs": [],
            "source": [
                "# Final summary with enhanced features\n",
                'print("🎊 Enhanced Shopping List Defrag Demo Complete!")\n',
                'print("=" * 60)\n',
                "\n",
                "final_items = client.list.get()\n",
                "if final_items:\n",
                '    print(f"📋 Your list now has {len(final_items)} organized items")\n',
                '    print("🏪 Items are organized using the latest defrag methodology")\n',
                '    print("📱 Use this organized list in the Meijer app or mobile site")\n',
                "    \n",
                '    print("\\n🚶‍♀️ Enhanced Shopping Route Preview:")\n',
                "    for i, item in enumerate(final_items[:5], 1):  # Show first 5 items\n",
                "        location = 'Unknown'\n",
                "        if item.notes:\n",
                "            if '|' in item.notes:\n",
                "                location = item.notes.split('|')[0].strip()\n",
                "            else:\n",
                "                location = item.notes\n",
                '        print(f"  {i}. {item.name} → {location}")\n',
                "    \n",
                "    if len(final_items) > 5:\n",
                '        print(f"  ... and {len(final_items) - 5} more items")\n",
                "        \n",
                '    print("\\n💡 Pro Tip: Your shopping list is now optimized using the latest methodology!")\n',
                '    print("   Features include UPC priority, smart search, category mapping, and rich Jupyter display")\n',
                "else:\n",
                '    print("📝 No items in final list")\n',
                "\n",
                "# 🆕 NEW: Final Rich Display\n",
                'print("\\n🎨 Final Rich Jupyter Notebook Display:")\n',
                'print("=" * 50)\n',
                "\n",
                "# Display the final organized shopping list\n",
                "print("\\n📝 Final Organized Shopping List:")\n",
                "display(client.list)\n",
                "\n",
                'print("\\n✨ Happy organized shopping with enhanced defrag! ✨")\n',
            ],
        }
    )

    return notebook


def main() -> None:
    """Generate the enhanced shopping list defrag demo notebook."""

    # Create the notebook
    notebook = create_defrag_demo_notebook()

    # Write to file
    output_file = "shopping_list_defrag_demo.ipynb"

    with open(output_file, "w", encoding="utf-8") as f:
        json.dump(notebook, f, indent=2, ensure_ascii=False)

    print(f"📝 Generated enhanced notebook: {output_file}")
    print("🚀 Open with: jupyter notebook shopping_list_defrag_demo.ipynb")
    print("💡 Or use in VS Code with the Jupyter extension")
    print("🎨 Features: Latest defrag methodology, rich Jupyter integration, enhanced options")


if __name__ == "__main__":
    main()
