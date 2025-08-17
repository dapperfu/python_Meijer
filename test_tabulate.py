#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Test script for tabulate table formatting
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: tabulate library
 */

Test Tabulate Table Formatting
=============================

This script demonstrates the improved table formatting using the tabulate library.
"""

from tabulate import tabulate


def demo_table_formatting() -> None:
    """Demonstrate different table formatting options with tabulate."""
    
    # Sample data similar to what the defrag function would show
    sample_data = [
        ["Milk", "Meijer Brand Milk, 2%", "Meijer", "$3.99", "5", "Dairy", "High"],
        ["Bread", "Wonder Bread, Classic White", "Wonder", "$2.49", "2", "Bakery", "High"],
        ["Cereal", "Kellogg's Frosted Flakes", "Kellogg's", "$4.99", "4", "Breakfast", "Medium"],
        ["Oreos", "Nabisco Oreo Cookies, Original", "Nabisco", "$3.49", "4", "Cookies", "High"],
        ["Ground Turkey", "Jennie-O Ground Turkey, 93% Lean", "Jennie-O", "$6.99", "8", "Meat", "Medium"]
    ]
    
    headers = ["Original Item", "Closest Match", "Brand", "Price", "Aisle", "Section", "Confidence"]
    
    print("🎯 Enhanced Table Formatting with Tabulate")
    print("=" * 60)
    
    # Grid format (most readable for CLI)
    print("\n📊 Grid Format (Recommended for CLI):")
    print(tabulate(sample_data, headers=headers, tablefmt="grid"))
    
    # Simple format (clean and minimal)
    print("\n📊 Simple Format:")
    print(tabulate(sample_data, headers=headers, tablefmt="simple"))
    
    # Pipe format (similar to markdown tables)
    print("\n📊 Pipe Format (Markdown-like):")
    print(tabulate(sample_data, headers=headers, tablefmt="pipe"))
    
    # Plain format (basic alignment)
    print("\n📊 Plain Format:")
    print(tabulate(sample_data, headers=headers, tablefmt="plain"))
    
    # Fancy grid (more decorative)
    print("\n📊 Fancy Grid Format:")
    print(tabulate(sample_data, headers=headers, tablefmt="fancy_grid"))


def demo_truncation() -> None:
    """Demonstrate how long text is handled in tables."""
    
    # Data with long text that needs truncation
    long_data = [
        ["Very Long Item Name That Exceeds Normal Limits", "Extremely Long Product Description That Goes On And On", "Brand Name", "$12.99", "15", "Specialty", "Low"],
        ["Short", "Brief", "Brand", "$1.99", "1", "Basic", "High"],
        ["Medium Length Item", "Moderate Product Description", "Medium Brand", "$5.99", "7", "General", "Medium"]
    ]
    
    headers = ["Original Item", "Closest Match", "Brand", "Price", "Aisle", "Section", "Confidence"]
    
    print("\n🔤 Long Text Handling:")
    print("=" * 60)
    
    # Show how the defrag function would truncate this
    truncated_data = []
    for row in long_data:
        truncated_data.append([
            row[0][:30] + "..." if len(row[0]) > 30 else row[0],
            row[1][:35] + "..." if len(row[1]) > 35 else row[1],
            row[2][:20] + "..." if len(row[2]) > 20 else row[2],
            row[3],
            row[4],
            row[5],
            row[6]
        ])
    
    print("📊 Truncated Data (as used in defrag function):")
    print(tabulate(truncated_data, headers=headers, tablefmt="grid"))


def demo_fallback() -> None:
    """Demonstrate fallback formatting when tabulate is not available."""
    
    print("\n⚠️  Fallback Formatting (when tabulate not available):")
    print("=" * 60)
    
    # Simulate the old manual formatting
    sample_data = [
        ["Milk", "Meijer Brand Milk, 2%", "5", "$3.99", "High"],
        ["Bread", "Wonder Bread, Classic White", "2", "$2.49", "High"],
        ["Cereal", "Kellogg's Frosted Flakes", "4", "$4.99", "Medium"]
    ]
    
    # Manual formatting (old way)
    table_header = f"{'Original Item':<25} {'Closest Match':<35} {'Aisle':<8} {'Price':<10} {'Confidence':<12}"
    print(table_header)
    print("-" * 80)
    
    for row in sample_data:
        table_row = f"{row[0]:<25} {row[1]:<35} {row[2]:<8} {row[3]:<10} {row[4]:<12}"
        print(table_row)
    
    print("=" * 80)
    print("💡 Notice: Manual formatting is less aligned and harder to read")


if __name__ == "__main__":
    print("🚀 Testing Enhanced Table Formatting")
    print("=" * 60)
    
    # Test basic table formatting
    demo_table_formatting()
    
    # Test long text handling
    demo_truncation()
    
    # Test fallback formatting
    demo_fallback()
    
    print("\n✨ Tabulate provides much cleaner, more professional table output!")
    print("📦 Install with: pip install tabulate")
    print("🔧 Use in code: from tabulate import tabulate") 