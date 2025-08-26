#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: New category browser TUI module for interactive department browsing with cart integration
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing, numpy-style docstrings, and extensive use of @property decorators
 * - Dependencies: meijer package, rich, typing, dataclasses
 */

Meijer Category Browser TUI
===========================

This module provides a rich terminal user interface for browsing Meijer
product categories and departments, with the ability to navigate through
the category hierarchy and add products to the shopping cart.
"""

import sys
from dataclasses import dataclass, field
from typing import Any, List, Optional

try:
    from rich import box
    from rich.console import Console
    from rich.panel import Panel
    from rich.prompt import Prompt
    from rich.table import Table
except ImportError:
    print("❌ Error: rich library not installed")
    print("Install with: pip install rich")
    sys.exit(1)

from .categories import CategoriesManager, Category, CategoryProduct


@dataclass
class BrowserState:
    """Represents the current state of the category browser."""

    current_category: Optional[Category] = None
    """Currently selected category"""

    category_stack: List[Category] = field(default_factory=list)
    """Navigation stack for breadcrumb navigation"""

    current_products: List[CategoryProduct] = field(default_factory=list)
    """Products in the current category"""

    selected_product_index: int = 0
    """Index of currently selected product"""

    current_page: int = 1
    """Current page of products"""

    products_per_page: int = 10
    """Number of products per page"""

    search_query: str = ""
    """Current search query"""

    sort_by: str = "relevance"
    """Current sort method"""

    store_id: Optional[str] = None
    """Store ID for filtering"""

    @property
    def breadcrumb_path(self) -> List[str]:
        """Get the breadcrumb navigation path."""
        return [cat.name for cat in self.category_stack] + (
            [self.current_category.name] if self.current_category else []
        )

    @property
    def total_pages(self) -> int:
        """Calculate total number of pages."""
        if not self.current_products:
            return 1
        return (
            len(self.current_products) + self.products_per_page - 1
        ) // self.products_per_page

    @property
    def page_start_index(self) -> int:
        """Get the starting index for the current page."""
        return (self.current_page - 1) * self.products_per_page

    @property
    def page_end_index(self) -> int:
        """Get the ending index for the current page."""
        return min(
            self.page_start_index + self.products_per_page, len(self.current_products)
        )

    @property
    def current_page_products(self) -> List[CategoryProduct]:
        """Get products for the current page."""
        return self.current_products[self.page_start_index : self.page_end_index]

    @property
    def has_previous_page(self) -> bool:
        """Check if there's a previous page."""
        return self.current_page > 1

    @property
    def has_next_page(self) -> bool:
        """Check if there's a next page."""
        return self.current_page < self.total_pages


class MeijerCategoryBrowser:
    """
    Terminal UI for browsing Meijer product categories and departments.

    This class provides an interactive interface for:
    - Browsing department categories
    - Navigating category hierarchy
    - Viewing products by category
    - Adding products to shopping cart
    - Searching categories and products
    """

    def __init__(self, meijer_client: Any, store_id: Optional[str] = None):
        """
        Initialize the category browser.

        Parameters
        ----------
        meijer_client : Any
            Meijer client instance
        store_id : Optional[str], default=None
            Store ID for filtering categories and products
        """
        self.console = Console()
        self.meijer_client = meijer_client
        self.categories_manager = CategoriesManager(meijer_client)
        self.state = BrowserState(store_id=store_id)

        # Keyboard shortcuts and commands
        self.commands = {
            "q": "Quit browser",
            "h": "Go back/up one level",
            "r": "Refresh current view",
            "s": "Search categories",
            "n": "Next page",
            "p": "Previous page",
            "a": "Add selected product to cart",
            "c": "View cart",
            "g": "Go to specific page",
            "?": "Show help",
        }

        # Available sort options
        self.sort_options = {
            "relevance": "Relevance",
            "price_asc": "Price: Low to High",
            "price_desc": "Price: High to Low",
            "name_asc": "Name: A to Z",
            "name_desc": "Name: Z to A",
            "newest": "Newest First",
            "rating": "Highest Rated",
        }

    def run(self) -> None:
        """Run the main browser interface."""
        try:
            self.console.clear()
            self.console.print(
                Panel(
                    "[bold blue]🛒 Meijer Category Browser[/bold blue]\n"
                    "Browse departments and add products to your cart",
                    title="Welcome",
                    border_style="blue",
                )
            )

            # Load initial categories
            if not self._load_categories():
                self.console.print(
                    "❌ Failed to load categories. Exiting.", style="red"
                )
                return

            # Main browser loop
            self._main_loop()

        except KeyboardInterrupt:
            self.console.print("\n👋 Goodbye!", style="yellow")
        except Exception as e:
            self.console.print(f"❌ Unexpected error: {e}", style="red")
            self.console.print("Press Enter to exit...")
            input()

    def _main_loop(self) -> None:
        """Main browser interaction loop."""
        while True:
            try:
                # Display current view
                self._display_current_view()

                # Get user input
                command = self._get_user_command()

                # Process command
                if not self._process_command(command):
                    break

            except KeyboardInterrupt:
                break
            except Exception as e:
                self.console.print(f"❌ Error: {e}", style="red")
                self.console.print("Press Enter to continue...")
                input()

    def _load_categories(self) -> bool:
        """Load the initial category hierarchy."""
        try:
            self.console.print("🔄 Loading categories...", style="yellow")

            categories = self.categories_manager.get_categories(self.state.store_id)
            if not categories:
                self.console.print("⚠️ No categories found", style="yellow")
                return False

            # Set root categories as current view
            self.state.current_category = None
            self.state.current_products = []
            self.state.category_stack = []

            self.console.print(
                f"✅ Loaded {len(categories)} top-level categories", style="green"
            )
            return True

        except Exception as e:
            self.console.print(f"❌ Failed to load categories: {e}", style="red")
            return False

    def _display_current_view(self) -> None:
        """Display the current category view."""
        self.console.clear()

        # Header
        self._display_header()

        # Breadcrumb navigation
        self._display_breadcrumb()

        # Main content area
        if self.state.current_category:
            self._display_category_products()
        else:
            self._display_category_list()

        # Footer with commands
        self._display_footer()

    def _display_header(self) -> None:
        """Display the browser header."""
        title = "[bold blue]🛒 Meijer Category Browser[/bold blue]"
        subtitle = f"Store: {self.state.store_id or 'All Stores'}"

        header = Panel(f"{title}\n{subtitle}", border_style="blue", padding=(0, 1))
        self.console.print(header)

    def _display_breadcrumb(self) -> None:
        """Display breadcrumb navigation."""
        if not self.state.breadcrumb_path:
            return

        breadcrumb_text = " > ".join(self.state.breadcrumb_path)
        breadcrumb_panel = Panel(
            breadcrumb_text, title="Navigation", border_style="cyan", padding=(0, 1)
        )
        self.console.print(breadcrumb_panel)

    def _display_category_list(self) -> None:
        """Display the list of available categories."""
        try:
            categories = self.categories_manager.get_categories(self.state.store_id)

            if not categories:
                self.console.print("⚠️ No categories available", style="yellow")
                return

            # Create category table
            table = Table(
                title="Available Departments",
                show_header=True,
                header_style="bold magenta",
                border_style="blue",
                box=box.ROUNDED,
            )

            table.add_column("Name", style="cyan", no_wrap=True)
            table.add_column("Products", justify="right", style="green")
            table.add_column("Description", style="white")
            table.add_column("Subcategories", justify="right", style="yellow")

            for category in categories:
                subcategory_count = (
                    len(category.subcategories) if category.subcategories else 0
                )
                description = category.description or "No description available"

                table.add_row(
                    category.name,
                    str(category.product_count),
                    description[:50] + "..." if len(description) > 50 else description,
                    str(subcategory_count),
                )

            self.console.print(table)

            # Instructions
            instructions = (
                "[bold]Instructions:[/bold]\n"
                "• Type a category name or number to browse\n"
                "• Use 's' to search categories\n"
                "• Use 'q' to quit\n"
                "• Use '?' for help"
            )

            instruction_panel = Panel(
                instructions, title="How to Use", border_style="green", padding=(0, 1)
            )
            self.console.print(instruction_panel)

        except Exception as e:
            self.console.print(f"❌ Error displaying categories: {e}", style="red")

    def _display_category_products(self) -> None:
        """Display products in the current category."""
        if not self.state.current_category:
            return

        category = self.state.current_category

        # Category header
        category_header = Panel(
            f"[bold]{category.name}[/bold]\n"
            f"Products: {category.product_count} | "
            f"Sort: {self.sort_options.get(self.state.sort_by, self.state.sort_by)}",
            title="Category",
            border_style="green",
            padding=(0, 1),
        )
        self.console.print(category_header)

        # Products table
        if self.state.current_products:
            self._display_products_table()
        else:
            self.console.print("🔄 Loading products...", style="yellow")
            self._load_category_products()

    def _display_products_table(self) -> None:
        """Display the products table."""
        if not self.state.current_page_products:
            self.console.print("⚠️ No products on this page", style="yellow")
            return

        # Create products table
        table = Table(
            title=f"Products (Page {self.state.current_page} of {self.state.total_pages})",
            show_header=True,
            header_style="bold magenta",
            border_style="blue",
            box=box.ROUNDED,
        )

        table.add_column("#", justify="right", style="cyan", no_wrap=True)
        table.add_column("Name", style="white", no_wrap=True)
        table.add_column("Price", justify="right", style="green")
        table.add_column("Brand", style="yellow")
        table.add_column("Status", justify="center", style="red")

        for i, product in enumerate(self.state.current_page_products):
            global_index = self.state.page_start_index + i
            is_selected = global_index == self.state.selected_product_index

            # Format price
            price_text = f"${product.price:.2f}" if product.price else "N/A"
            if product.is_on_sale and product.original_price:
                price_text += f" (was ${product.original_price:.2f})"

            # Format status
            status = "🆕" if product.is_on_sale else "✓"

            # Row style
            row_style = "bold cyan" if is_selected else ""

            table.add_row(
                str(global_index + 1),
                product.name[:40] + "..." if len(product.name) > 40 else product.name,
                price_text,
                product.brand or "N/A",
                status,
                style=row_style,
            )

        self.console.print(table)

        # Pagination info
        if self.state.total_pages > 1:
            pagination_text = (
                f"Page {self.state.current_page} of {self.state.total_pages} | "
                f"Products {self.state.page_start_index + 1}-{self.state.page_end_index} "
                f"of {len(self.state.current_products)}"
            )

            if self.state.has_previous_page:
                pagination_text += " | [p] Previous"
            if self.state.has_next_page:
                pagination_text += " | [n] Next"

            pagination_panel = Panel(
                pagination_text,
                title="Pagination",
                border_style="yellow",
                padding=(0, 1),
            )
            self.console.print(pagination_panel)

    def _display_footer(self) -> None:
        """Display the footer with available commands."""
        commands_text = " | ".join(
            [f"[{key}] {desc}" for key, desc in self.commands.items()]
        )

        footer = Panel(
            commands_text, title="Commands", border_style="magenta", padding=(0, 1)
        )
        self.console.print(footer)

    def _get_user_command(self) -> str:
        """Get user input command."""
        return Prompt.ask("\n[bold cyan]Command[/bold cyan]").lower().strip()

    def _process_command(self, command: str) -> bool:
        """Process user command. Returns False to quit."""
        if command == "q":
            return False
        elif command == "h":
            self._go_back()
        elif command == "r":
            self._refresh_view()
        elif command == "s":
            self._search_categories()
        elif command == "n":
            self._next_page()
        elif command == "p":
            self._previous_page()
        elif command == "a":
            self._add_to_cart()
        elif command == "c":
            self._view_cart()
        elif command == "g":
            self._go_to_page()
        elif command == "?":
            self._show_help()
        elif command.isdigit():
            self._select_by_number(int(command))
        else:
            self._try_category_navigation(command)

        return True

    def _go_back(self) -> None:
        """Go back one level in navigation."""
        if self.state.category_stack:
            # Pop the current category and go back
            self.state.current_category = self.state.category_stack.pop()
            self.state.current_products = []
            self.state.current_page = 1
            self.state.selected_product_index = 0
        elif self.state.current_category:
            # Go back to category list
            self.state.current_category = None
            self.state.current_products = []
            self.state.current_page = 1
            self.state.selected_product_index = 0

    def _refresh_view(self) -> None:
        """Refresh the current view."""
        if self.state.current_category:
            self._load_category_products()
        else:
            self._load_categories()

    def _search_categories(self) -> None:
        """Search for categories."""
        query = Prompt.ask("[bold yellow]Search categories[/bold yellow]")
        if not query:
            return

        try:
            results = self.categories_manager.search_categories(
                query, self.state.store_id
            )

            if not results:
                self.console.print(
                    "🔍 No categories found matching your search", style="yellow"
                )
                return

            # Display search results
            self._display_search_results(results)

        except Exception as e:
            self.console.print(f"❌ Search failed: {e}", style="red")

    def _display_search_results(self, results: List[Category]) -> None:
        """Display search results."""
        self.console.print(
            f"\n🔍 Found {len(results)} matching categories:", style="green"
        )

        for i, category in enumerate(results, 1):
            self.console.print(
                f"{i}. [cyan]{category.name}[/cyan] - {category.product_count} products"
            )

        # Let user select a result
        selection = Prompt.ask(
            "\n[bold yellow]Select category number[/bold yellow] (or Enter to cancel)"
        )

        if selection.isdigit():
            index = int(selection) - 1
            if 0 <= index < len(results):
                self._navigate_to_category(results[index])

    def _next_page(self) -> None:
        """Go to next page of products."""
        if self.state.has_next_page:
            self.state.current_page += 1
            self.state.selected_product_index = self.state.page_start_index

    def _previous_page(self) -> None:
        """Go to previous page of products."""
        if self.state.has_previous_page:
            self.state.current_page -= 1
            self.state.selected_product_index = self.state.page_start_index

    def _go_to_page(self) -> None:
        """Go to a specific page."""
        if self.state.total_pages <= 1:
            return

        page_input = Prompt.ask(
            f"[bold yellow]Go to page[/bold yellow] (1-{self.state.total_pages})"
        )

        if page_input.isdigit():
            page_num = int(page_input)
            if 1 <= page_num <= self.state.total_pages:
                self.state.current_page = page_num
                self.state.selected_product_index = self.state.page_start_index

    def _add_to_cart(self) -> None:
        """Add selected product to cart."""
        if not self.state.current_products:
            return

        if self.state.selected_product_index >= len(self.state.current_products):
            return

        product = self.state.current_products[self.state.selected_product_index]

        try:
            # Check if cart functionality is available
            if hasattr(self.meijer_client, "cart") and hasattr(
                self.meijer_client.cart, "add_item"
            ):
                # Add to cart using UPC if available
                if product.upc:
                    result = self.meijer_client.cart.add_item(product.upc)
                    if result:
                        self.console.print(
                            f"✅ Added [cyan]{product.name}[/cyan] to cart",
                            style="green",
                        )
                    else:
                        self.console.print(
                            f"❌ Failed to add [cyan]{product.name}[/cyan] to cart",
                            style="red",
                        )
                else:
                    self.console.print(
                        "⚠️ Product has no UPC code - cannot add to cart", style="yellow"
                    )
            else:
                self.console.print("⚠️ Cart functionality not available", style="yellow")

        except Exception as e:
            self.console.print(f"❌ Error adding to cart: {e}", style="red")

    def _view_cart(self) -> None:
        """View current cart contents."""
        try:
            if hasattr(self.meijer_client, "cart") and hasattr(
                self.meijer_client.cart, "get_cart"
            ):
                cart = self.meijer_client.cart.get_cart()
                if cart and hasattr(cart, "items"):
                    self.console.print(
                        f"\n🛒 Cart contains {len(cart.items)} items:", style="green"
                    )
                    for item in cart.items[:5]:  # Show first 5 items
                        self.console.print(f"  • {item.name}")
                    if len(cart.items) > 5:
                        self.console.print(f"  ... and {len(cart.items) - 5} more")
                else:
                    self.console.print("🛒 Cart is empty", style="yellow")
            else:
                self.console.print("⚠️ Cart functionality not available", style="yellow")

        except Exception as e:
            self.console.print(f"❌ Error viewing cart: {e}", style="red")

        self.console.print("\nPress Enter to continue...")
        input()

    def _show_help(self) -> None:
        """Show help information."""
        help_text = """
[bold]Meijer Category Browser Help[/bold]

[bold]Navigation:[/bold]
• Type a category name or number to browse
• Use 'h' to go back/up one level
• Use 'r' to refresh the current view

[bold]Product Browsing:[/bold]
• Use arrow keys or type numbers to select products
• Use 'n' and 'p' for next/previous page
• Use 'g' to go to a specific page

[bold]Cart Operations:[/bold]
• Use 'a' to add selected product to cart
• Use 'c' to view current cart

[bold]Search:[/bold]
• Use 's' to search for categories

[bold]Other:[/bold]
• Use '?' to show this help
• Use 'q' to quit
        """

        help_panel = Panel(
            help_text, title="Help", border_style="green", padding=(0, 1)
        )
        self.console.print(help_panel)

        self.console.print("\nPress Enter to continue...")
        input()

    def _select_by_number(self, number: int) -> None:
        """Select a category or product by number."""
        if self.state.current_category:
            # Selecting a product
            if 1 <= number <= len(self.state.current_products):
                self.state.selected_product_index = number - 1
        else:
            # Selecting a category
            categories = self.categories_manager.get_categories(self.state.store_id)
            if 1 <= number <= len(categories):
                self._navigate_to_category(categories[number - 1])

    def _try_category_navigation(self, query: str) -> None:
        """Try to navigate to a category by name."""
        if not query:
            return

        try:
            categories = self.categories_manager.get_categories(self.state.store_id)

            # Try exact match first
            for category in categories:
                if category.name.lower() == query.lower():
                    self._navigate_to_category(category)
                    return

            # Try partial match
            for category in categories:
                if query.lower() in category.name.lower():
                    self._navigate_to_category(category)
                    return

            # Try subcategory search
            for category in categories:
                if category.subcategories:
                    for subcategory in category.subcategories:
                        if (
                            query.lower() in subcategory.name.lower()
                            or subcategory.name.lower() == query.lower()
                        ):
                            # Navigate to parent first, then subcategory
                            self._navigate_to_category(category)
                            self._navigate_to_category(subcategory)
                            return

            self.console.print(
                f"🔍 No category found matching '{query}'", style="yellow"
            )

        except Exception as e:
            self.console.print(f"❌ Navigation error: {e}", style="red")

    def _navigate_to_category(self, category: Category) -> None:
        """Navigate to a specific category."""
        # Add current category to stack if we have one
        if self.state.current_category:
            self.state.category_stack.append(self.state.current_category)

        # Set new category
        self.state.current_category = category
        self.state.current_page = 1
        self.state.selected_product_index = 0

        # Load products for this category
        self._load_category_products()

    def _load_category_products(self) -> None:
        """Load products for the current category."""
        if not self.state.current_category:
            return

        try:
            self.console.print("🔄 Loading products...", style="yellow")

            products = self.categories_manager.get_category_products(
                self.state.current_category.id,
                self.state.store_id,
                page=self.state.current_page,
                limit=self.state.products_per_page,
                sort_by=self.state.sort_by,
            )

            self.state.current_products = products

            if not products:
                self.console.print(
                    "⚠️ No products found in this category", style="yellow"
                )

        except Exception as e:
            self.console.print(f"❌ Failed to load products: {e}", style="red")
            self.state.current_products = []
