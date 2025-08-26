#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: CLI commands for price monitoring system
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: click, rich, meijer package
 */

CLI commands for the price monitoring system.

This module provides the command-line interface for:
1. Initializing new price monitors
2. Running existing monitors
3. Managing monitor configurations
4. Viewing price history and deals
"""

import click
import logging
from pathlib import Path
from typing import Optional

from rich.console import Console
from rich.table import Table
from rich.panel import Panel
from rich.progress import Progress, SpinnerColumn, TextColumn
from rich.prompt import Prompt, Confirm

from ..price_monitor import PriceMonitor
from ..client import Meijer


console = Console()
logger = logging.getLogger(__name__)


@click.group()
def pricedrop_group():
    """Price monitoring and drop detection commands."""
    pass


@pricedrop_group.command()
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory to store price monitoring data",
)
def init(data_dir: Optional[str]):
    """
    Initialize a new price monitoring configuration.

    This command will guide you through setting up a new price monitor
    for specific products across multiple stores.
    """
    try:
        # Initialize Meijer client
        meijer = Meijer()

        # Check authentication
        if not meijer.is_authenticated():
            console.print(
                "[red]❌ Not authenticated. Please run 'meijer auth log --mode full' first.[/red]"
            )
            return

        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(meijer, monitor_data_dir)

        console.print(
            Panel(
                "[bold blue]🛒 Meijer Price Monitor Setup[/bold blue]\n\n"
                "Let's set up a new price monitoring configuration!",
                title="Setup Wizard",
            )
        )

        # Get search query
        search_query = Prompt.ask(
            "\n[bold]What would you like to search for?[/bold]", default="LEGO"
        )

        # Get location
        location = Prompt.ask("\n[bold]What city or ZIP code?[/bold]", default="46755")

        # Get radius
        radius = Prompt.ask(
            "\n[bold]What radius (in miles)?[/bold]", default="50", show_default=True
        )

        try:
            radius_int = int(radius)
        except ValueError:
            console.print("[red]Invalid radius. Using default of 50 miles.[/red]")
            radius_int = 50

        # Get monitor name
        monitor_name = Prompt.ask(
            "\n[bold]What should we call this monitor?[/bold]",
            default=search_query.replace(" ", "_"),
        )

        # Confirm setup
        console.print("\n[bold]Configuration Summary:[/bold]")
        console.print(f"  • Search: {search_query}")
        console.print(f"  • Location: {location}")
        console.print(f"  • Radius: {radius_int} miles")
        console.print(f"  • Monitor Name: {monitor_name}")

        if not Confirm.ask("\n[bold]Does this look correct?[/bold]", default=True):
            console.print("[yellow]Setup cancelled.[/yellow]")
            return

        # Create monitor
        with Progress(
            SpinnerColumn(),
            TextColumn("[progress.description]{task.description}"),
            console=console,
        ) as progress:
            task = progress.add_task("Setting up monitor...", total=None)

            monitor_id = price_monitor.create_monitor(
                name=monitor_name,
                search_query=search_query,
                location=location,
                radius=radius_int,
            )

            progress.update(task, description="Monitor created successfully!")

        console.print(
            f"\n[green]✅ Monitor '{monitor_name}' created successfully![/green]"
        )
        console.print(f"Monitor ID: [bold]{monitor_id}[/bold]")
        console.print(f"Data directory: [bold]{price_monitor.data_dir}[/bold]")

        # Offer to run initial scan
        if Confirm.ask(
            "\n[bold]Would you like to run the initial price scan now?[/bold]",
            default=True,
        ):
            run_initial_scan(price_monitor, monitor_id)

    except Exception as e:
        console.print(f"[red]❌ Error during setup: {e}[/red]")
        logger.error(f"Setup error: {e}", exc_info=True)


@pricedrop_group.command()
@click.argument("monitor_name")
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data",
)
def run(monitor_name: str, data_dir: Optional[str]):
    """
    Run a price monitoring scan for an existing monitor.

    MONITOR_NAME: Name or ID of the monitor to run
    """
    try:
        # Initialize Meijer client
        meijer = Meijer()

        # Check authentication
        if not meijer.is_authenticated():
            console.print(
                "[red]❌ Not authenticated. Please run 'meijer auth log --mode full' first.[/red]"
            )
            return

        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(meijer, monitor_data_dir)

        # Find monitor by name or ID
        monitors = price_monitor.list_monitors()
        monitor_id = None

        # First try exact match by ID
        if monitor_name in monitors:
            monitor_id = monitor_name
        else:
            # Try to find by name
            for mid, config in monitors.items():
                if config["name"] == monitor_name:
                    monitor_id = mid
                    break

        if monitor_id is None:
            console.print(f"[red]❌ Monitor '{monitor_name}' not found.[/red]")
            console.print("\n[bold]Available monitors:[/bold]")
            for mid, config in monitors.items():
                console.print(f"  • {config['name']} (ID: {mid})")
            return

        # Run the monitor
        config = monitors[monitor_id]
        console.print(f"[bold]Running monitor: {config['name']}[/bold]")
        console.print(f"Search query: {config['search_query']}")
        console.print(f"Stores: {len(config['stores'])}")

        with Progress(
            SpinnerColumn(),
            TextColumn("[progress.description]{task.description}"),
            console=console,
        ) as progress:
            task = progress.add_task("Scanning stores...", total=None)

            results = price_monitor.run_monitor(monitor_id)

            progress.update(task, description="Scan completed!")

        # Display results
        display_scan_results(results)

    except Exception as e:
        console.print(f"[red]❌ Error running monitor: {e}[/red]")
        logger.error(f"Monitor run error: {e}", exc_info=True)


@pricedrop_group.command()
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data",
)
def list(data_dir: Optional[str]):
    """List all configured price monitors."""
    try:
        # Initialize Meijer client
        meijer = Meijer()

        # Check authentication
        if not meijer.is_authenticated():
            console.print(
                "[red]❌ Not authenticated. Please run 'meijer auth log --mode full' first.[/red]"
            )
            return

        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(meijer, monitor_data_dir)

        monitors = price_monitor.list_monitors()

        if not monitors:
            console.print("[yellow]No price monitors configured.[/yellow]")
            console.print("Run 'meijer pricedrop init' to create your first monitor.")
            return

        # Create table
        table = Table(title="Configured Price Monitors")
        table.add_column("Name", style="cyan", no_wrap=True)
        table.add_column("Search Query", style="green")
        table.add_column("Location", style="yellow")
        table.add_column("Stores", style="blue", justify="right")
        table.add_column("Last Run", style="magenta")
        table.add_column("Status", style="bold")

        for monitor_id, config in monitors.items():
            status = "🟢 Active" if config.get("enabled", True) else "🔴 Disabled"
            last_run = config.get("last_run", "Never")
            if last_run != "Never":
                last_run = last_run.split("T")[0]  # Just show date

            table.add_row(
                config["name"],
                config["search_query"],
                config["location"],
                str(len(config["stores"])),
                last_run,
                status,
            )

        console.print(table)

    except Exception as e:
        console.print(f"[red]❌ Error listing monitors: {e}[/red]")
        logger.error(f"List monitors error: {e}", exc_info=True)


@pricedrop_group.command()
@click.argument("monitor_name")
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data",
)
def delete(monitor_name: str, data_dir: Optional[str]):
    """
    Delete a price monitoring configuration.

    MONITOR_NAME: Name or ID of the monitor to delete
    """
    try:
        # Initialize Meijer client
        meijer = Meijer()

        # Check authentication
        if not meijer.is_authenticated():
            console.print(
                "[red]❌ Not authenticated. Please run 'meijer auth log --mode full' first.[/red]"
            )
            return

        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(meijer, monitor_data_dir)

        # Find monitor by name or ID
        monitors = price_monitor.list_monitors()
        monitor_id = None

        # First try exact match by ID
        if monitor_name in monitors:
            monitor_id = monitor_name
        else:
            # Try to find by name
            for mid, config in monitors.items():
                if config["name"] == monitor_name:
                    monitor_id = mid
                    break

        if monitor_id is None:
            console.print(f"[red]❌ Monitor '{monitor_name}' not found.[/red]")
            return

        config = monitors[monitor_id]

        # Confirm deletion
        console.print(f"[bold]About to delete monitor: {config['name']}[/bold]")
        console.print(f"Search query: {config['search_query']}")
        console.print(f"Location: {config['location']}")
        console.print(f"Stores: {len(config['stores'])}")

        if not Confirm.ask(
            "\n[bold red]Are you sure you want to delete this monitor?[/bold red]",
            default=False,
        ):
            console.print("[yellow]Deletion cancelled.[/yellow]")
            return

        # Delete monitor
        if price_monitor.delete_monitor(monitor_id):
            console.print(
                f"[green]✅ Monitor '{config['name']}' deleted successfully.[/green]"
            )
        else:
            console.print(f"[red]❌ Failed to delete monitor '{config['name']}'.[/red]")

    except Exception as e:
        console.print(f"[red]❌ Error deleting monitor: {e}[/red]")
        logger.error(f"Delete monitor error: {e}", exc_info=True)


@pricedrop_group.command()
@click.option(
    "--min-discount",
    type=float,
    default=20.0,
    help="Minimum discount percentage to consider (default: 20.0)",
)
@click.option("--max-price", type=float, help="Maximum price to consider for deals")
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data",
)
def deals(min_discount: float, max_price: Optional[float], data_dir: Optional[str]):
    """Find products with significant price drops."""
    try:
        # Initialize Meijer client
        meijer = Meijer()

        # Check authentication
        if not meijer.is_authenticated():
            console.print(
                "[red]❌ Not authenticated. Please run 'meijer auth log --mode full' first.[/red]"
            )
            return

        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(meijer, monitor_data_dir)

        console.print(f"[bold]Finding deals with {min_discount}%+ discount...[/bold]")

        with Progress(
            SpinnerColumn(),
            TextColumn("[progress.description]{task.description}"),
            console=console,
        ) as progress:
            task = progress.add_task("Scanning price history...", total=None)

            deals = price_monitor.find_clearance_deals(
                min_discount_percent=min_discount, max_price=max_price
            )

            progress.update(task, description="Scan completed!")

        if not deals:
            console.print(
                f"[yellow]No deals found with {min_discount}%+ discount.[/yellow]"
            )
            return

        # Display deals
        table = Table(title=f"Clearance Deals ({min_discount}%+ Discount)")
        table.add_column("Product ID", style="cyan", no_wrap=True)
        table.add_column("Store ID", style="yellow", no_wrap=True)
        table.add_column("Old Price", style="red", justify="right")
        table.add_column("Current Price", style="green", justify="right")
        table.add_column("Discount", style="bold blue", justify="right")
        table.add_column("Price Drop", style="bold red", justify="right")
        table.add_column("Last Updated", style="magenta")

        for deal in deals:
            table.add_row(
                deal["product_id"],
                deal["store_id"],
                f"${deal['oldest_price']:.2f}",
                f"${deal['current_price']:.2f}",
                f"{deal['discount_percent']:.1f}%",
                f"${deal['price_drop']:.2f}",
                deal["last_updated"].split("T")[0],
            )

        console.print(table)

    except Exception as e:
        console.print(f"[red]❌ Error finding deals: {e}[/red]")
        logger.error(f"Find deals error: {e}", exc_info=True)


def run_initial_scan(price_monitor: PriceMonitor, monitor_id: str) -> None:
    """Run the initial price scan for a newly created monitor."""
    console.print("\n[bold]Running initial price scan...[/bold]")

    try:
        with Progress(
            SpinnerColumn(),
            TextColumn("[progress.description]{task.description}"),
            console=console,
        ) as progress:
            task = progress.add_task("Scanning stores...", total=None)

            results = price_monitor.run_monitor(monitor_id)

            progress.update(task, description="Initial scan completed!")

        display_scan_results(results)

    except Exception as e:
        console.print(f"[red]❌ Error during initial scan: {e}[/red]")
        logger.error(f"Initial scan error: {e}", exc_info=True)


def display_scan_results(results: dict) -> None:
    """Display the results of a price monitoring scan."""
    console.print("\n[bold green]✅ Scan completed successfully![/bold green]")
    console.print(f"Products found: [bold]{results['products_found']}[/bold]")
    console.print(f"Stores scanned: [bold]{results['stores_scanned']}[/bold]")

    if results["errors"]:
        console.print("\n[bold red]Errors encountered:[/bold red]")
        for error in results["errors"]:
            console.print(f"  • {error}")

    if results["price_records"]:
        # Show sample of products found
        console.print("\n[bold]Sample products found:[/bold]")

        table = Table(title="Sample Products")
        table.add_column("Product Name", style="cyan", no_wrap=True)
        table.add_column("Store", style="yellow")
        table.add_column("Price", style="green", justify="right")
        table.add_column("Status", style="bold")

        # Show first 10 products
        for record in results["price_records"][:10]:
            status = ""
            if record["is_clearance"]:
                status = "🟡 Clearance"
            elif record["is_on_sale"]:
                status = "🟢 On Sale"
            else:
                status = "⚪ Regular"

            table.add_row(
                record["product_name"][:50]
                + ("..." if len(record["product_name"]) > 50 else ""),
                record["store_name"],
                f"${record['price']:.2f}",
                status,
            )

        console.print(table)

        if len(results["price_records"]) > 10:
            console.print(
                f"\n[dim]... and {len(results['price_records']) - 10} more products[/dim]"
            )

    console.print(
        f"\n[dim]Results saved to: {results.get('monitor_id', 'unknown')}[/dim]"
    )
