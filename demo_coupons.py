#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Demo script for new coupon CLI functionality
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Demo script for Meijer Coupon CLI functionality.

This script demonstrates the new coupon management commands that have been
added to the Meijer CLI tool.
"""

import subprocess
from typing import List, Optional


def run_cli_command(command: List[str]) -> Optional[str]:
    """
    Run a CLI command and return the output.

    Args:
        command: List of command arguments

    Returns:
        Command output as string, or None if failed
    """
    try:
        result = subprocess.run(
            command, capture_output=True, text=True, cwd=".", timeout=30
        )

        if result.returncode == 0:
            return result.stdout
        else:
            print(f"Command failed with return code {result.returncode}")
            if result.stderr:
                print(f"Error: {result.stderr}")
            return None

    except subprocess.TimeoutExpired:
        print("Command timed out")
        return None
    except Exception as e:
        print(f"Error running command: {e}")
        return None


def demo_coupon_commands():
    """Demonstrate the new coupon CLI commands."""

    print("🎫 Meijer Coupon CLI Demo")
    print("=" * 50)
    print()

    # Show available coupon commands
    print("📋 Available Coupon Commands:")
    print("1. meijer coupons list - List all coupons")
    print("2. meijer coupons list --clipped - Show only clipped coupons")
    print("3. meijer coupons list --unclipped - Show only unclipped coupons")
    print("4. meijer coupons list --expired - Show only expired coupons")
    print("5. meijer coupons list --active - Show only active coupons")
    print("6. meijer coupons clip <id> - Clip a specific coupon")
    print("7. meijer coupons unclip <id> - Unclip a specific coupon")
    print("8. meijer coupons clip-all - Clip all unclipped coupons")
    print("9. meijer coupons unclip-all - Unclip all clipped coupons")
    print("10. meijer coupons info <id> - Show detailed coupon info")
    print("11. meijer coupons search <query> - Search coupons")
    print("12. meijer coupons summary - Show coupon statistics")
    print("13. meijer coupons interactive - Interactive TUI mode")
    print()

    # Demo 1: Show coupon summary
    print("🔍 Demo 1: Coupon Summary")
    print("-" * 30)
    print("Running: meijer coupons summary")

    output = run_cli_command(["python3", "-m", "meijer.cli", "coupons", "summary"])
    if output:
        print("✅ Success! Output:")
        print(output)
    else:
        print("❌ Failed to get coupon summary")
        print("   (This is expected if not authenticated)")

    print()

    # Demo 2: List coupons with limit
    print("🔍 Demo 2: List Coupons (Limited)")
    print("-" * 30)
    print("Running: meijer coupons list --limit 5")

    output = run_cli_command(
        ["python3", "-m", "meijer.cli", "coupons", "list", "--limit", "5"]
    )
    if output:
        print("✅ Success! Output:")
        print(output)
    else:
        print("❌ Failed to list coupons")
        print("   (This is expected if not authenticated)")

    print()

    # Demo 3: Show help for specific command
    print("🔍 Demo 3: Command Help")
    print("-" * 30)
    print("Running: meijer coupons list --help")

    output = run_cli_command(
        ["python3", "-m", "meijer.cli", "coupons", "list", "--help"]
    )
    if output:
        print("✅ Success! Output:")
        print(output)
    else:
        print("❌ Failed to show help")

    print()

    # Demo 4: Show interactive mode help
    print("🔍 Demo 4: Interactive Mode Help")
    print("-" * 30)
    print("Running: meijer coupons interactive --help")

    output = run_cli_command(
        ["python3", "-m", "meijer.cli", "coupons", "interactive", "--help"]
    )
    if output:
        print("✅ Success! Output:")
        print(output)
    else:
        print("❌ Failed to show interactive help")

    print()

    # Demo 5: Show search help
    print("🔍 Demo 5: Search Help")
    print("-" * 30)
    print("Running: meijer coupons search --help")

    output = run_cli_command(
        ["python3", "-m", "meijer.cli", "coupons", "search", "--help"]
    )
    if output:
        print("✅ Success! Output:")
        print(output)
    else:
        print("❌ Failed to show search help")

    print()

    print("🎯 Demo Complete!")
    print()
    print("💡 To use these commands with real data:")
    print("   1. Set up authentication (see meijer auth --help)")
    print("   2. Run: meijer coupons list")
    print("   3. Try: meijer coupons interactive")
    print()
    print("🔧 For bulk operations:")
    print("   meijer coupons clip-all --confirm")
    print("   meijer coupons unclip-all --confirm")
    print()
    print("📊 For analysis:")
    print("   meijer coupons summary")
    print("   meijer coupons list --clipped")
    print("   meijer coupons list --unclipped")


if __name__ == "__main__":
    demo_coupon_commands()
