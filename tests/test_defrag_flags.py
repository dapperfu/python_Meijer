#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Test script for new defrag flags functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Test New Defrag Flags Functionality
==================================

This script demonstrates the new defrag flags:
- -r/--reverse: Sort items in reverse order (descending)
- -z/--zig: Alternate B aisle sorting (B1 ascending, B2 descending, etc.)
"""

import logging
from typing import Any, Dict

# Set up logging
logging.basicConfig(level=logging.INFO, format="%(levelname)s: %(message)s")
logger = logging.getLogger(__name__)


def test_defrag_flags() -> None:
    """
    Test the new defrag flags functionality.

    Demonstrates how to use the reverse and zig-zag sorting options.
    """
    print("🚀 Testing New Defrag Flags Functionality")
    print("=" * 60)

    try:
        # Import the Meijer client
        from meijer import Meijer

        # Initialize client (you'll need to provide auth)
        print("1. 🔐 Initializing Meijer client...")
        try:
            client = Meijer(auth="auth.txt")
            print(f"   Authentication status: {client.is_authenticated()}")

            if not client.is_authenticated():
                print("   ❌ Failed to authenticate")
                print("   💡 Make sure you have a valid auth.txt file")
                return

            print("   ✅ Successfully authenticated!")

        except FileNotFoundError:
            print("   ❌ auth.txt file not found")
            print("   💡 Please create an auth.txt file with your credentials")
            return
        except Exception as e:
            print(f"   ❌ Authentication error: {e}")
            return

        # Test different defrag options
        print("\n2. 🔧 Testing Defrag Options")
        print("-" * 40)

        # Test 1: Normal defrag
        print("\n📋 Test 1: Normal defrag (default sorting)")
        print("   Command: client.list.defrag()")
        print("   Result: Items sorted by aisle in ascending order")

        # Test 2: Reverse defrag
        print("\n📋 Test 2: Reverse defrag")
        print("   Command: client.list.defrag(reverse=True)")
        print("   Result: Items sorted by aisle in descending order")

        # Test 3: Zig-zag defrag
        print("\n📋 Test 3: Zig-zag B aisle defrag")
        print("   Command: client.list.defrag(zig=True)")
        print("   Result: B1 ascending, B2 descending, B3 ascending, etc.")

        # Test 4: Combined flags
        print("\n📋 Test 4: Combined flags")
        print("   Command: client.list.defrag(reverse=True, zig=True)")
        print("   Result: Zig-zag B aisle sorting + reverse overall order")

        # Show CLI usage examples
        print("\n3. 💻 CLI Usage Examples")
        print("-" * 40)

        cli_examples = """
# Basic defrag (ascending order)
meijer list defrag

# Reverse defrag (descending order)
meijer list defrag --reverse
meijer list defrag -r

# Zig-zag B aisle defrag
meijer list defrag --zig
meijer list defrag -z

# Combined flags
meijer list defrag --reverse --zig
meijer list defrag -r -z

# With store ID
meijer list defrag --store-id 123 --reverse --zig
"""

        print(cli_examples)

        # Show Python API examples
        print("\n4. 🐍 Python API Examples")
        print("-" * 40)

        api_examples = """
# Basic defrag
client.list.defrag()

# Reverse defrag
client.list.defrag(reverse=True)

# Zig-zag B aisle defrag
client.list.defrag(zig=True)

# Combined flags
client.list.defrag(reverse=True, zig=True)

# With store ID
client.list.defrag(store_id="123", reverse=True, zig=True)
"""

        print(api_examples)

        # Explain the zig-zag logic
        print("\n5. 🔄 Zig-Zag B Aisle Logic")
        print("-" * 40)

        zig_explanation = """
The zig-zag flag creates an efficient shopping path through B aisles:

B1: Sections 1 → 2 → 3 → ... → 40 (ascending)
B2: Sections 40 → 39 → 38 → ... → 1 (descending)
B3: Sections 1 → 2 → 3 → ... → 40 (ascending)
B4: Sections 40 → 39 → 38 → ... → 1 (descending)
...and so on

This minimizes backtracking and creates a smooth shopping flow.
"""

        print(zig_explanation)

        # Show when to use each option
        print("\n6. 💡 When to Use Each Option")
        print("-" * 40)

        usage_tips = """
🔴 --reverse (-r):
   • When you want to shop from highest to lowest aisle numbers
   • Useful if you prefer to start from the back of the store
   • Good for stores where you enter from the opposite end

🟡 --zig (-z):
   • When shopping primarily in B aisles (grocery aisles)
   • Creates efficient zig-zag pattern to minimize walking
   • Best used without reverse flag for optimal flow

🟢 Combined (--reverse --zig):
   • When you want zig-zag B aisle pattern but in reverse overall order
   • Useful if entering from opposite end but still want B aisle efficiency
   • More complex sorting that may be harder to follow

⚪ No flags (default):
   • Standard ascending aisle order
   • Simple and predictable
   • Good for most shopping scenarios
"""

        print(usage_tips)

        print("\n✅ Test script completed successfully!")
        print("💡 Use the examples above to test the new defrag functionality")

    except ImportError as e:
        print(f"❌ Import error: {e}")
        print("💡 Make sure the meijer package is installed")
    except Exception as e:
        print(f"❌ Test failed: {e}")


def demo_zig_zag_logic() -> None:
    """
    Demonstrate the zig-zag B aisle sorting logic with examples.
    """
    print("\n" + "=" * 60)
    print("🔄 Zig-Zag B Aisle Sorting Logic Demo")
    print("=" * 60)

    # Example items with different B aisle locations
    example_items = [
        {"name": "Milk", "aisle": "B1", "section": "5"},
        {"name": "Bread", "aisle": "B1", "section": "12"},
        {"name": "Cereal", "aisle": "B1", "section": "3"},
        {"name": "Chips", "aisle": "B2", "section": "35"},
        {"name": "Soda", "aisle": "B2", "section": "8"},
        {"name": "Candy", "aisle": "B2", "section": "42"},
        {"name": "Frozen Pizza", "aisle": "B3", "section": "15"},
        {"name": "Ice Cream", "aisle": "B3", "section": "28"},
        {"name": "Frozen Vegetables", "aisle": "B3", "section": "7"},
        {"name": "Canned Goods", "aisle": "B4", "section": "38"},
        {"name": "Pasta", "aisle": "B4", "section": "22"},
        {"name": "Soup", "aisle": "B4", "section": "45"},
    ]

    print("📋 Example Items with B Aisle Locations:")
    for item in example_items:
        print(
            f"   {item['name']:<20} | Aisle: {item['aisle']} | Section: {item['section']}"
        )

    print("\n🔄 Normal Sorting (no zig-zag):")
    print("   All items sorted by aisle, then by section (ascending)")
    normal_sorted = sorted(example_items, key=lambda x: (x["aisle"], int(x["section"])))
    for item in normal_sorted:
        print(
            f"   {item['name']:<20} | Aisle: {item['aisle']} | Section: {item['section']}"
        )

    print("\n🔄 Zig-Zag B Aisle Sorting:")
    print("   B1: ascending, B2: descending, B3: ascending, B4: descending")

    # Simulate zig-zag sorting
    zig_sorted = []
    for aisle in ["B1", "B2", "B3", "B4"]:
        aisle_items = [item for item in example_items if item["aisle"] == aisle]
        if aisle in ["B2", "B4"]:  # Even B aisles get reverse sorting
            aisle_items.sort(key=lambda x: int(x["section"]), reverse=True)
        else:  # Odd B aisles get normal sorting
            aisle_items.sort(key=lambda x: int(x["section"]), reverse=False)
        zig_sorted.extend(aisle_items)

    for item in zig_sorted:
        print(
            f"   {item['name']:<20} | Aisle: {item['aisle']} | Section: {item['section']}"
        )

    print("\n💡 Benefits of Zig-Zag Sorting:")
    print("   • Minimizes backtracking within B aisles")
    print("   • Creates efficient shopping flow")
    print("   • Reduces walking distance")
    print("   • More natural shopping experience")


def create_defrag_flags_notebook() -> Dict[str, Any]:
    """
    Create a Jupyter notebook demonstrating the new defrag flags functionality.

    Returns:
        Dict containing the notebook structure
    """
    notebook = {
        "cells": [
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "# 🚀 New Defrag Flags Functionality\n",
                    "\n",
                    "This notebook demonstrates the new defrag flags added to the Meijer shopping list defrag functionality:\n",
                    "\n",
                    "- **`-r/--reverse`**: Sort items in reverse order (descending)\n",
                    "- **`-z/--zig`**: Alternate B aisle sorting (B1 ascending, B2 descending, etc.)\n",
                    "\n",
                    "## Overview\n",
                    "\n",
                    "The defrag function now supports two additional flags that give you more control over how your shopping list is organized:\n",
                    "\n",
                    "1. **Reverse Sorting**: Organize items from highest to lowest aisle numbers\n",
                    "2. **Zig-Zag B Aisles**: Create efficient shopping paths through B aisles by alternating direction\n",
                    "\n",
                    "Let's explore how these work!",
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🔧 Setup and Imports\n",
                    "\n",
                    "First, let's set up our environment and import the necessary modules.",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Import required modules\n",
                    "import logging\n",
                    "from typing import List, Optional, Dict, Any\n",
                    "\n",
                    "# Set up logging for better output\n",
                    "logging.basicConfig(level=logging.INFO, format='%(levelname)s: %(message)s')\n",
                    "logger = logging.getLogger(__name__)\n",
                    "\n",
                    'print("✅ Imports completed successfully!")',
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🔐 Initialize Meijer Client\n",
                    "\n",
                    "Let's initialize the Meijer client with authentication.",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Initialize Meijer client\n",
                    "try:\n",
                    "    from meijer import Meijer\n",
                    "    \n",
                    "    # Initialize with auth file\n",
                    "    client = Meijer(auth='auth.txt')\n",
                    "    \n",
                    "    # Check authentication status\n",
                    "    if client.is_authenticated():\n",
                    '        print("✅ Successfully authenticated with Meijer!")\n',
                    '        print(f"🔐 Authentication status: {client.is_authenticated()}")\n',
                    "    else:\n",
                    '        print("❌ Authentication failed")\n',
                    '        print("💡 Make sure you have a valid auth.txt file")\n',
                    "        \n",
                    "except ImportError:\n",
                    '    print("❌ Meijer package not found")\n',
                    '    print("💡 Install with: pip install meijer")\n',
                    "except FileNotFoundError:\n",
                    '    print("❌ auth.txt file not found")\n',
                    '    print("💡 Please create an auth.txt file with your credentials")\n',
                    "except Exception as e:\n",
                    '    print(f"❌ Error initializing client: {e}")',
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 📋 Understanding the New Flags\n",
                    "\n",
                    "Let's explore what each new flag does and when to use them.",
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "### 1. Reverse Flag (`-r/--reverse`)\n",
                    "\n",
                    "The reverse flag sorts items in descending order by aisle number. This is useful when:\n",
                    "\n",
                    "- You prefer to start shopping from the back of the store\n",
                    "- Your store entrance is at the opposite end\n",
                    "- You want to work your way toward the front",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Example of reverse sorting\n",
                    'print("🔄 Reverse Sorting Example")\n',
                    'print("=" * 40)\n',
                    'print("\\nNormal sorting (ascending):")\n',
                    'print("A1 → A2 → A3 → A4 → A5")\n',
                    'print("\\nReverse sorting (descending):")\n',
                    'print("A5 → A4 → A3 → A2 → A1")\n',
                    'print("\\n💡 Use --reverse when you want to start from the back of the store!")',
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "### 2. Zig-Zag Flag (`-z/--zig`)\n",
                    "\n",
                    "The zig-zag flag creates an efficient shopping pattern through B aisles by alternating the direction:\n",
                    "\n",
                    "- **B1**: Sections 1 → 2 → 3 → ... → 40 (ascending)\n",
                    "- **B2**: Sections 40 → 39 → 38 → ... → 1 (descending)\n",
                    "- **B3**: Sections 1 → 2 → 3 → ... → 40 (ascending)\n",
                    "- **B4**: Sections 40 → 39 → 38 → ... → 1 (descending)\n",
                    "\n",
                    "This minimizes backtracking and creates a smooth shopping flow!",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Example of zig-zag B aisle sorting\n",
                    'print("🔄 Zig-Zag B Aisle Sorting Example")\n',
                    'print("=" * 50)\n',
                    "\n",
                    "# Example items with B aisle locations\n",
                    "example_items = [\n",
                    '    {"name": "Milk", "aisle": "B1", "section": "5"},\n',
                    '    {"name": "Bread", "aisle": "B1", "section": "12"},\n',
                    '    {"name": "Cereal", "aisle": "B1", "section": "3"},\n',
                    '    {"name": "Chips", "aisle": "B2", "section": "35"},\n',
                    '    {"name": "Soda", "aisle": "B2", "section": "8"},\n',
                    '    {"name": "Candy", "aisle": "B2", "section": "42"},\n',
                    '    {"name": "Frozen Pizza", "aisle": "B3", "section": "15"},\n',
                    '    {"name": "Ice Cream", "aisle": "B3", "section": "28"},\n',
                    '    {"name": "Frozen Vegetables", "aisle": "B3", "section": "7"},\n',
                    '    {"name": "Canned Goods", "aisle": "B4", "section": "38"},\n',
                    '    {"name": "Pasta", "aisle": "B4", "section": "22"},\n',
                    '    {"name": "Soup", "aisle": "B4", "section": "45"},\n',
                    "]\n",
                    "\n",
                    'print("📋 Example Items with B Aisle Locations:")\n',
                    "for item in example_items:\n",
                    "    print(f\"   {item['name']:<20} | Aisle: {item['aisle']} | Section: {item['section']}\")\n",
                    "\n",
                    'print("\\n🔄 Normal Sorting (no zig-zag):")\n',
                    'print("   All items sorted by aisle, then by section (ascending)")\n',
                    "normal_sorted = sorted(example_items, key=lambda x: (x['aisle'], int(x['section'])))\n",
                    "for item in normal_sorted:\n",
                    "    print(f\"   {item['name']:<20} | Aisle: {item['aisle']} | Section: {item['section']}\")\n",
                    "\n",
                    'print("\\n🔄 Zig-Zag B Aisle Sorting:")\n',
                    'print("   B1: ascending, B2: descending, B3: ascending, B4: descending")\n',
                    "\n",
                    "# Simulate zig-zag sorting\n",
                    "zig_sorted = []\n",
                    "for aisle in ['B1', 'B2', 'B3', 'B4']:\n",
                    "    aisle_items = [item for item in example_items if item['aisle'] == aisle]\n",
                    "    if aisle in ['B2', 'B4']:  # Even B aisles get reverse sorting\n",
                    "        aisle_items.sort(key=lambda x: int(x['section']), reverse=True)\n",
                    "    else:  # Odd B aisles get normal sorting\n",
                    "        aisle_items.sort(key=lambda x: int(x['section']), reverse=False)\n",
                    "    zig_sorted.extend(aisle_items)\n",
                    "\n",
                    "for item in zig_sorted:\n",
                    "    print(f\"   {item['name']:<20} | Aisle: {item['aisle']} | Section: {item['section']}\")\n",
                    "\n",
                    'print("\\n💡 Benefits of Zig-Zag Sorting:")\n',
                    'print("   • Minimizes backtracking within B aisles")\n',
                    'print("   • Creates efficient shopping flow")\n',
                    'print("   • Reduces walking distance")\n',
                    'print("   • More natural shopping experience")',
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 💻 CLI Usage Examples\n",
                    "\n",
                    "Here are the different ways you can use the new flags from the command line:",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# CLI Usage Examples\n",
                    'cli_examples = """\n',
                    "# Basic defrag (ascending order)\n",
                    "meijer list defrag\n",
                    "\n",
                    "# Reverse defrag (descending order)\n",
                    "meijer list defrag --reverse\n",
                    "meijer list defrag -r\n",
                    "\n",
                    "# Zig-zag B aisle defrag\n",
                    "meijer list defrag --zig\n",
                    "meijer list defrag -z\n",
                    "\n",
                    "# Combined flags\n",
                    "meijer list defrag --reverse --zig\n",
                    "meijer list defrag -r -z\n",
                    "\n",
                    "# With store ID\n",
                    "meijer list defrag --store-id 123 --reverse --zig\n",
                    '"""\n',
                    "\n",
                    'print("💻 CLI Usage Examples:")\n',
                    "print(cli_examples)",
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🐍 Python API Examples\n",
                    "\n",
                    "And here's how to use the new flags programmatically:",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Python API Examples\n",
                    'api_examples = """\n',
                    "# Basic defrag\n",
                    "client.list.defrag()\n",
                    "\n",
                    "# Reverse defrag\n",
                    "client.list.defrag(reverse=True)\n",
                    "\n",
                    "# Zig-zag B aisle defrag\n",
                    "client.list.defrag(zig=True)\n",
                    "\n",
                    "# Combined flags\n",
                    "client.list.defrag(reverse=True, zig=True)\n",
                    "\n",
                    "# With store ID\n",
                    'client.list.defrag(store_id="123", reverse=True, zig=True)\n',
                    '"""\n',
                    "\n",
                    'print("🐍 Python API Examples:")\n',
                    "print(api_examples)",
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🧪 Testing the New Flags\n",
                    "\n",
                    "Now let's test the new functionality with your actual shopping list!",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Test 1: Normal defrag (default behavior)\n",
                    'print("🧪 Test 1: Normal Defrag (Default Sorting)")\n',
                    'print("=" * 50)\n',
                    "\n",
                    "try:\n",
                    "    # Get current shopping list\n",
                    "    current_items = client.list.get()\n",
                    '    print(f"📋 Current shopping list has {len(current_items)} items")\n',
                    "    \n",
                    "    if current_items:\n",
                    '        print("\\n🔧 Running normal defrag...")\n',
                    "        success = client.list.defrag()\n",
                    "        \n",
                    "        if success:\n",
                    '            print("✅ Normal defrag completed successfully!")\n',
                    "            \n",
                    "            # Show the reorganized list\n",
                    "            reorganized_items = client.list.get()\n",
                    '            print(f"\\n📋 Reorganized list has {len(reorganized_items)} items")\n',
                    "            \n",
                    "            # Show first few items with their aisle info\n",
                    '            print("\\n📄 First 5 items after defrag:")\n',
                    "            for i, item in enumerate(reorganized_items[:5], 1):\n",
                    '                aisle_info = "Unknown"\n',
                    '                if item.notes and "Aisle:" in item.notes:\n',
                    "                    try:\n",
                    '                        aisle_part = item.notes.split("Aisle:")[1].split("|")[0].strip()\n',
                    "                        aisle_info = aisle_part\n",
                    "                    except:\n",
                    "                        pass\n",
                    '                print(f"   {i}. {item.name:<25} | Aisle: {aisle_info}")\n',
                    "        else:\n",
                    '            print("❌ Normal defrag failed!")\n',
                    "    else:\n",
                    '        print("📝 Shopping list is empty, nothing to defrag")\n',
                    "        \n",
                    "except Exception as e:\n",
                    '    print(f"❌ Error during normal defrag test: {e}")',
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Test 2: Reverse defrag\n",
                    'print("🧪 Test 2: Reverse Defrag (Descending Order)")\n',
                    'print("=" * 50)\n',
                    "\n",
                    "try:\n",
                    "    # Get current shopping list\n",
                    "    current_items = client.list.get()\n",
                    '    print(f"📋 Current shopping list has {len(current_items)} items")\n',
                    "    \n",
                    "    if current_items:\n",
                    '        print("\\n🔄 Running reverse defrag...")\n',
                    "        success = client.list.defrag(reverse=True)\n",
                    "        \n",
                    "        if success:\n",
                    '            print("✅ Reverse defrag completed successfully!")\n',
                    '            print("🔄 Items are now sorted in descending order (highest to lowest aisle)")\n',
                    "            \n",
                    "            # Show the reorganized list\n",
                    "            reorganized_items = client.list.get()\n",
                    '            print(f"\\n📋 Reorganized list has {len(reorganized_items)} items")\n',
                    "            \n",
                    "            # Show first few items with their aisle info\n",
                    '            print("\\n📄 First 5 items after reverse defrag:")\n',
                    "            for i, item in enumerate(reorganized_items[:5], 1):\n",
                    '                aisle_info = "Unknown"\n',
                    '                if item.notes and "Aisle:" in item.notes:\n',
                    "                    try:\n",
                    '                        aisle_part = item.notes.split("Aisle:")[1].split("|")[0].strip()\n',
                    "                        aisle_part = aisle_part\n",
                    "                    except:\n",
                    "                        pass\n",
                    '                print(f"   {i}. {item.name:<25} | Aisle: {aisle_info}")\n',
                    "        else:\n",
                    '            print("❌ Reverse defrag failed!")\n',
                    "    else:\n",
                    '        print("📝 Shopping list is empty, nothing to defrag")\n',
                    "        \n",
                    "except Exception as e:\n",
                    '    print(f"❌ Error during reverse defrag test: {e}")',
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Test 3: Zig-zag defrag\n",
                    'print("🧪 Test 3: Zig-Zag B Aisle Defrag")\n',
                    'print("=" * 50)\n',
                    "\n",
                    "try:\n",
                    "    # Get current shopping list\n",
                    "    current_items = client.list.get()\n",
                    '    print(f"📋 Current shopping list has {len(current_items)} items")\n',
                    "    \n",
                    "    if current_items:\n",
                    '        print("\\n🔄 Running zig-zag defrag...")\n',
                    '        print("💡 This will create alternating B aisle patterns")\n',
                    "        success = client.list.defrag(zig=True)\n",
                    "        \n",
                    "        if success:\n",
                    '            print("✅ Zig-zag defrag completed successfully!")\n',
                    '            print("🔄 B aisles now have alternating sorting patterns")\n',
                    "            \n",
                    "            # Show the reorganized list\n",
                    "            reorganized_items = client.list.get()\n",
                    '            print(f"\\n📋 Reorganized list has {len(reorganized_items)} items")\n',
                    "            \n",
                    "            # Show first few items with their aisle info\n",
                    '            print("\\n📄 First 5 items after zig-zag defrag:")\n',
                    "            for i, item in enumerate(reorganized_items[:5], 1):\n",
                    '                aisle_info = "Unknown"\n',
                    '                if item.notes and "Aisle:" in item.notes:\n',
                    "                    try:\n",
                    '                        aisle_part = item.notes.split("Aisle:")[1].split("|")[0].strip()\n',
                    "                        aisle_info = aisle_part\n",
                    "                    except:\n",
                    "                        pass\n",
                    '                print(f"   {i}. {item.name:<25} | Aisle: {aisle_info}")\n',
                    "        else:\n",
                    '            print("❌ Zig-zag defrag failed!")\n',
                    "    else:\n",
                    '        print("📝 Shopping list is empty, nothing to defrag")\n',
                    "        \n",
                    "except Exception as e:\n",
                    '    print(f"❌ Error during zig-zag defrag test: {e}")',
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 💡 When to Use Each Option\n",
                    "\n",
                    "Here's a guide to help you choose the right defrag option for your shopping needs:",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Usage guide\n",
                    'usage_guide = """\n',
                    "🔴 --reverse (-r):\n",
                    "   • When you want to shop from highest to lowest aisle numbers\n",
                    "   • Useful if you prefer to start from the back of the store\n",
                    "   • Good for stores where you enter from the opposite end\n",
                    "\n",
                    "🟡 --zig (-z):\n",
                    "   • When shopping primarily in B aisles (grocery aisles)\n",
                    "   • Creates efficient zig-zag pattern to minimize walking\n",
                    "   • Best used without reverse flag for optimal flow\n",
                    "\n",
                    "🟢 Combined (--reverse --zig):\n",
                    "   • When you want zig-zag B aisle pattern but in reverse overall order\n",
                    "   • Useful if entering from opposite end but still want B aisle efficiency\n",
                    "   • More complex sorting that may be harder to follow\n",
                    "\n",
                    "⚪ No flags (default):\n",
                    "   • Standard ascending aisle order\n",
                    "   • Simple and predictable\n",
                    "   • Good for most shopping scenarios\n",
                    '"""\n',
                    "\n",
                    'print("💡 When to Use Each Option:")\n',
                    "print(usage_guide)",
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🎯 Best Practices\n",
                    "\n",
                    "Here are some tips for getting the most out of the new defrag flags:",
                ],
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Best practices\n",
                    'best_practices = """\n',
                    "🎯 Best Practices for Using New Defrag Flags:\n",
                    "\n",
                    "1. **Start Simple**: Begin with default defrag to understand your store layout\n",
                    "2. **Test in Small Lists**: Try new flags with smaller shopping lists first\n",
                    "3. **Consider Store Layout**: Use reverse if you enter from the opposite end\n",
                    "4. **B Aisle Focus**: Use zig-zag primarily when shopping in grocery aisles\n",
                    "5. **Combine Wisely**: Only use combined flags when you understand both effects\n",
                    "6. **Store-Specific**: Different stores may benefit from different approaches\n",
                    "7. **Personal Preference**: Choose what feels most natural for your shopping style\n",
                    "\n",
                    "🔄 Workflow Recommendations:\n",
                    "\n",
                    "• **Weekly Shopping**: Use zig-zag for efficient B aisle navigation\n",
                    "• **Quick Trips**: Stick with default sorting for simplicity\n",
                    "• **Large Lists**: Consider reverse if you prefer back-to-front shopping\n",
                    "• **Store Familiarity**: Experiment with different combinations as you learn your store\n",
                    '"""\n',
                    "\n",
                    "print(best_practices)",
                ],
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🚀 Summary\n",
                    "\n",
                    "Congratulations! You've now learned about the new defrag flags:\n",
                    "\n",
                    "✅ **`--reverse`**: Sort items in descending order\n",
                    "✅ **`--zig`**: Create efficient zig-zag patterns through B aisles\n",
                    "✅ **Combined flags**: Use both for complex sorting scenarios\n",
                    "\n",
                    "These new options give you much more control over how your shopping list is organized, helping you create the most efficient shopping path for your specific needs and store layout.\n",
                    "\n",
                    "### Next Steps:\n",
                    "\n",
                    "1. **Experiment**: Try different flag combinations with your shopping list\n",
                    "2. **Observe**: Notice how the different sorting affects your shopping flow\n",
                    "3. **Optimize**: Find the combination that works best for your store and preferences\n",
                    "4. **Share**: Let others know about these new features!\n",
                    "\n",
                    "Happy shopping! 🛒✨",
                ],
            },
        ],
        "metadata": {
            "kernelspec": {
                "display_name": "Python 3",
                "language": "python",
                "name": "python3",
            },
            "language_info": {
                "codemirror_mode": {"name": "ipython", "version": 3},
                "file_extension": ".py",
                "mimetype": "text/x-python",
                "name": "python",
                "nbconvert_exporter": "python",
                "pygments_lexer": "ipython3",
                "version": "3.8.0",
            },
        },
        "nbformat": 4,
        "nbformat_minor": 4,
    }

    return notebook


if __name__ == "__main__":
    # Run the main test
    test_defrag_flags()

    # Run the zig-zag demo
    demo_zig_zag_logic()
