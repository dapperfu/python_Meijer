#!/usr/bin/env python3
"""
Test CLI Structure
==================

This script demonstrates the improved CLI structure with cleaner command names.
"""

import subprocess


def test_cli_help():
    """Test the CLI help command to show the improved structure."""
    try:
        # Test the main help
        result = subprocess.run(
            ["python3", "-m", "meijer.cli.main", "--help"],
            capture_output=True,
            text=True,
            timeout=10,
        )

        if result.returncode == 0:
            print("✅ CLI help command works!")
            print("\n📋 Available Commands:")
            print(result.stdout)
        else:
            print("❌ CLI help command failed")
            print(f"Error: {result.stderr}")

    except subprocess.TimeoutExpired:
        print("❌ CLI command timed out")
    except FileNotFoundError:
        print("❌ CLI module not found")
    except Exception as e:
        print(f"❌ Error testing CLI: {e}")


def show_improved_structure():
    """Show the improved CLI structure."""
    print("🚀 IMPROVED CLI STRUCTURE")
    print("=" * 50)
    print()
    print("Before (Verbose):")
    print("  meijer list-group show")
    print("  meijer ad-command")
    print("  meijer list-group favorites")
    print()
    print("After (Clean & Intuitive):")
    print("  meijer list show")
    print("  meijer ads")
    print("  meijer list favorites")
    print()
    print("📱 Command Examples:")
    print("  meijer list show              # Show shopping list")
    print("  meijer list add 'Milk'        # Add item to list")
    print("  meijer list favorites         # Show favorites")
    print("  meijer coupons                # Manage coupons")
    print("  meijer cart                   # Manage cart")
    print("  meijer ads                    # Browse weekly ads")
    print("  meijer gas                    # Check gas prices")
    print("  meijer auth                   # Authentication")
    print("  meijer status                 # Account status")
    print("  meijer settings               # Account settings")


def main():
    """Main function."""
    print("🧪 TESTING IMPROVED CLI STRUCTURE")
    print("=" * 50)

    show_improved_structure()

    print("\n" + "=" * 50)
    print("🔧 Testing CLI help command...")
    print("=" * 50)

    test_cli_help()

    return 0


if __name__ == "__main__":
    exit(main())
