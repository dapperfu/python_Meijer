#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: New demo script showcasing the categories functionality and TUI browser
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing, numpy-style docstrings, and extensive use of @property decorators
 * - Dependencies: meijer package, rich, typing, dataclasses
 */

Meijer Categories Demo
======================

This demo showcases the new categories functionality including:
- Browsing product categories and departments
- Interactive TUI for category navigation
- Product browsing within categories
- Adding products to cart
"""

import sys

# Add the parent directory to the path to import meijer
sys.path.insert(0, "..")

try:
    from rich import box
    from rich.console import Console
    from rich.panel import Panel
    from rich.table import Table

    from meijer import Meijer
except ImportError as e:
    print(f"❌ Import error: {e}")
    print("Make sure you're running this from the demos directory")
    sys.exit(1)


def demo_categories_api(meijer_client: Meijer) -> None:
    """
    Demo the categories API functionality.

    Parameters
    ----------
    meijer_client : Meijer
        Authenticated Meijer client instance
    """
    console = Console()

    console.print(
        Panel(
            "[bold blue]🛒 Meijer Categories API Demo[/bold blue]\n"
            "Testing the new categories endpoint and functionality",
            title="Categories Demo",
            border_style="blue",
        )
    )

    try:
        # Test getting categories
        console.print("\n🔄 Testing categories API...", style="yellow")

        categories = meijer_client.get_categories()
        console.print(
            f"✅ Successfully retrieved {len(categories)} categories", style="green"
        )

        # Display categories in a table
        table = Table(
            title="Available Categories",
            show_header=True,
            header_style="bold magenta",
            border_style="blue",
            box=box.ROUNDED,
        )

        table.add_column("Name", style="cyan", no_wrap=True)
        table.add_column("ID", style="yellow")
        table.add_column("Products", justify="right", style="green")
        table.add_column("Subcategories", justify="right", style="red")
        table.add_column("Description", style="white")

        for category in categories[:10]:  # Show first 10
            subcategory_count = (
                len(category.subcategories) if category.subcategories else 0
            )
            description = category.description or "No description"

            table.add_row(
                category.name,
                category.id,
                str(category.product_count),
                str(subcategory_count),
                description[:40] + "..." if len(description) > 40 else description,
            )

        console.print(table)

        if len(categories) > 10:
            console.print(
                f"... and {len(categories) - 10} more categories", style="yellow"
            )

        # Test category search
        console.print("\n🔍 Testing category search...", style="yellow")
        search_results = meijer_client.search_categories("electronics", limit=5)
        console.print(
            f"✅ Found {len(search_results)} categories matching 'electronics'",
            style="green",
        )

        for result in search_results:
            console.print(f"  • {result.name} ({result.product_count} products)")

        # Test getting products from a category
        if categories:
            first_category = categories[0]
            console.print(
                f"\n🔄 Testing product retrieval for '{first_category.name}'...",
                style="yellow",
            )

            products = meijer_client.get_category_products(first_category.id, limit=5)

            console.print(
                f"✅ Retrieved {len(products)} products from {first_category.name}",
                style="green",
            )

            # Display products
            if products:
                product_table = Table(
                    title=f"Products in {first_category.name}",
                    show_header=True,
                    header_style="bold magenta",
                    border_style="green",
                    box=box.ROUNDED,
                )

                product_table.add_column("Name", style="cyan", no_wrap=True)
                product_table.add_column("Price", justify="right", style="green")
                product_table.add_column("Brand", style="yellow")
                product_table.add_column("On Sale", justify="center", style="red")

                for product in products:
                    price_text = f"${product.price:.2f}" if product.price else "N/A"
                    if product.is_on_sale and product.original_price:
                        price_text += f" (was ${product.original_price:.2f})"

                    product_table.add_row(
                        product.name[:40] + "..."
                        if len(product.name) > 40
                        else product.name,
                        price_text,
                        product.brand or "N/A",
                        "🆕" if product.is_on_sale else "✓",
                    )

                console.print(product_table)

        console.print("\n✅ Categories API demo completed successfully!", style="green")

    except Exception as e:
        console.print(f"❌ Categories API demo failed: {e}", style="red")


def demo_category_browser(meijer_client: Meijer) -> None:
    """
    Demo the interactive category browser TUI.

    Parameters
    ----------
    meijer_client : Meijer
        Authenticated Meijer client instance
    """
    console = Console()

    console.print(
        Panel(
            "[bold blue]🖥️ Meijer Category Browser TUI Demo[/bold blue]\n"
            "Launching the interactive terminal interface for browsing categories",
            title="TUI Demo",
            border_style="blue",
        )
    )

    try:
        console.print("\n🚀 Launching category browser...", style="yellow")
        console.print("💡 Use the following commands in the TUI:", style="cyan")
        console.print("  • Type category names or numbers to browse")
        console.print("  • Use 's' to search categories")
        console.print("  • Use 'a' to add products to cart")
        console.print("  • Use 'h' to go back/up one level")
        console.print("  • Use 'q' to quit")
        console.print("  • Use '?' for help")

        console.print("\n⏸️ Press Enter to launch the browser...", style="yellow")
        input()

        # Launch the category browser
        meijer_client.browse_categories()

    except Exception as e:
        console.print(f"❌ Category browser demo failed: {e}", style="red")


def demo_categories_integration(meijer_client: Meijer) -> None:
    """
    Demo the integration between categories and other Meijer functionality.

    Parameters
    ----------
    meijer_client : Meijer
        Authenticated Meijer client instance
    """
    console = Console()

    console.print(
        Panel(
            "[bold blue]🔗 Categories Integration Demo[/bold blue]\n"
            "Testing how categories work with other Meijer features",
            title="Integration Demo",
            border_style="blue",
        )
    )

    try:
        # Test categories with store filtering
        console.print("\n🏪 Testing categories with store filtering...", style="yellow")

        # Try to get categories for a specific store (store 71 from the user's example)
        store_categories = meijer_client.get_categories(store_id="71")
        console.print(
            f"✅ Retrieved {len(store_categories)} categories for store 71",
            style="green",
        )

        # Test categories with search integration
        console.print(
            "\n🔍 Testing categories with search integration...", style="yellow"
        )

        # Get a category and then search for products in it
        if store_categories:
            test_category = store_categories[0]
            console.print(f"Testing with category: {test_category.name}", style="cyan")

            # Get products from this category
            category_products = meijer_client.get_category_products(
                test_category.id, store_id="71", limit=3
            )

            console.print(
                f"✅ Found {len(category_products)} products in {test_category.name}",
                style="green",
            )

            # Show how this integrates with cart functionality
            if category_products and hasattr(meijer_client, "cart"):
                console.print("\n🛒 Testing cart integration...", style="yellow")

                # Check if cart is available
                try:
                    cart = meijer_client.cart.get_cart()
                    if cart:
                        console.print(
                            f"✅ Cart integration working - cart has {len(cart.items)} items",
                            style="green",
                        )
                    else:
                        console.print("⚠️ Cart is empty", style="yellow")
                except Exception as cart_error:
                    console.print(
                        f"⚠️ Cart integration test failed: {cart_error}", style="yellow"
                    )

        console.print(
            "\n✅ Categories integration demo completed successfully!", style="green"
        )

    except Exception as e:
        console.print(f"❌ Categories integration demo failed: {e}", style="red")


def main() -> None:
    """Main demo function."""
    console = Console()

    console.print(
        Panel(
            "[bold blue]🎯 Meijer Categories Demo Suite[/bold blue]\n"
            "Comprehensive demonstration of the new categories functionality",
            title="Welcome",
            border_style="blue",
        )
    )

    try:
        # Initialize Meijer client
        console.print("\n🔄 Initializing Meijer client...", style="yellow")

        # Try to load from auth file
        auth_file = "../auth.json"
        meijer_client = Meijer(auth_file=auth_file)

        console.print("✅ Meijer client initialized successfully", style="green")

        # Run demos
        demo_categories_api(meijer_client)

        console.print("\n" + "=" * 60)

        demo_categories_integration(meijer_client)

        console.print("\n" + "=" * 60)

        # Ask if user wants to try the TUI
        console.print(
            "\n🤔 Would you like to try the interactive category browser?", style="cyan"
        )
        console.print("This will launch a terminal interface for browsing categories.")

        try:
            from rich.prompt import Confirm

            launch_tui = Confirm.ask("Launch category browser TUI?", default=False)

            if launch_tui:
                demo_category_browser(meijer_client)
            else:
                console.print("⏭️ Skipping TUI demo", style="yellow")

        except ImportError:
            console.print(
                "⚠️ Rich prompt not available, skipping TUI demo", style="yellow"
            )

        console.print(
            "\n🎉 All categories demos completed successfully!", style="green"
        )
        console.print("\n💡 You can now use the categories functionality in your code:")
        console.print("  • client.get_categories() - Get all categories")
        console.print("  • client.get_category_products() - Get products in a category")
        console.print("  • client.search_categories() - Search for categories")
        console.print("  • client.browse_categories() - Launch interactive TUI")

    except Exception as e:
        console.print(f"❌ Demo failed: {e}", style="red")
        console.print("\n💡 Make sure you have:")
        console.print("  • A valid auth.json file with Meijer credentials")
        console.print("  • The meijer package installed")
        console.print("  • Internet connection for API calls")


if __name__ == "__main__":
    main()
