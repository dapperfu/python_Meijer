#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: CLI interface for standalone price monitoring project
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: click, rich, price_monitor package
 */

Command-line interface for the price monitoring system.

This module provides the CLI commands for:
1. Initializing new price monitors
2. Running existing monitors
3. Managing monitor configurations
4. Viewing price history and deals
"""

import click
import logging
import sys
from pathlib import Path
from typing import Optional

from rich.console import Console
from rich.table import Table
from rich.panel import Panel
from rich.progress import Progress, SpinnerColumn, TextColumn
from rich.prompt import Prompt, Confirm
from rich.text import Text

from .core import PriceMonitor

console = Console()
logger = logging.getLogger(__name__)


def setup_logging(verbosity: int) -> None:
    """
    Set up logging configuration based on verbosity level.

    Args:
        verbosity: Number of -v flags (0, 1, 2, 3+)
    """
    if verbosity == 0:
        # Default: Only show warnings and errors
        logging.basicConfig(level=logging.WARNING, format="%(levelname)s: %(message)s")
    elif verbosity == 1:
        # -v: Show info, warnings, and errors
        logging.basicConfig(level=logging.INFO, format="%(levelname)s: %(message)s")
    elif verbosity == 2:
        # -vv: Show debug, info, warnings, and errors
        logging.basicConfig(level=logging.DEBUG, format="%(levelname)s: %(message)s")
    else:
        # -vvv+: Show all levels with more detailed format
        logging.basicConfig(
            level=logging.DEBUG,
            format="%(asctime)s - %(name)s - %(levelname)s - %(funcName)s:%(lineno)d - %(message)s",
        )


@click.group()
@click.option(
    "--verbose",
    "-v",
    count=True,
    help="Increase verbosity. Use -v for info, -vv for debug, -vvv for detailed debug",
)
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory to store price monitoring data",
)
@click.version_option(version="1.0.0", prog_name="meijer-pricedrop")
def cli(verbose: int, data_dir: Optional[str]):
    """
    🛒 Meijer Price Monitor CLI

    Monitor product prices across Meijer stores and track price changes over time.
    
    This tool helps you find clearance deals and track price drops for products
    you're interested in, such as LEGO sets, toys, electronics, and more.
    """
    # Set up logging based on verbosity
    setup_logging(verbose)
    
    # Store data directory in context for subcommands
    ctx = click.get_current_context()
    ctx.ensure_object(dict)
    ctx.obj['data_dir'] = data_dir
    
    # Log CLI invocation for debugging
    logger.debug(f"CLI invoked with verbosity level: {verbose}")
    logger.debug(f"Data directory: {data_dir or 'default'}")


@cli.command()
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory to store price monitoring data"
)
def init(data_dir: Optional[str]):
    """
    Initialize a new price monitoring configuration.
    
    This command will guide you through setting up a new price monitor
    for specific products across multiple stores.
    """
    try:
        # Get data directory from context or parameter
        ctx = click.get_current_context()
        data_dir = data_dir or ctx.obj.get('data_dir')
        
        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(monitor_data_dir)
        
        console.print(
            Panel(
                "[bold blue]🛒 Meijer Price Monitor Setup[/bold blue]\n\n"
                "Let's set up a new price monitoring configuration!",
                title="Setup Wizard"
            )
        )
        
        # Get search query
        search_query = Prompt.ask(
            "\n[bold]What would you like to search for?[/bold]",
            default="LEGO"
        )
        
        # Get location
        location = Prompt.ask(
            "\n[bold]What city or ZIP code?[/bold]",
            default="46755"
        )
        
        # Get radius
        radius = Prompt.ask(
            "\n[bold]What radius (in miles)?[/bold]",
            default="50",
            show_default=True
        )
        
        try:
            radius_int = int(radius)
        except ValueError:
            console.print("[red]Invalid radius. Using default of 50 miles.[/red]")
            radius_int = 50
        
        # Get monitor name
        monitor_name = Prompt.ask(
            "\n[bold]What should we call this monitor?[/bold]",
            default=search_query.replace(" ", "_")
        )
        
        # Confirm setup
        console.print(f"\n[bold]Configuration Summary:[/bold]")
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
            console=console
        ) as progress:
            task = progress.add_task("Setting up monitor...", total=None)
            
            monitor_id = price_monitor.create_monitor(
                name=monitor_name,
                search_query=search_query,
                location=location,
                radius=radius_int
            )
            
            progress.update(task, description="Monitor created successfully!")
        
        console.print(f"\n[green]✅ Monitor '{monitor_name}' created successfully![/green]")
        console.print(f"Monitor ID: [bold]{monitor_id}[/bold]")
        console.print(f"Data directory: [bold]{price_monitor.data_dir}[/bold]")
        
        # Offer to run initial scan
        if Confirm.ask("\n[bold]Would you like to run the initial price scan now?[/bold]", default=True):
            run_initial_scan(price_monitor, monitor_id)
        
    except Exception as e:
        console.print(f"[red]❌ Error during setup: {e}[/red]")
        logger.error(f"Setup error: {e}", exc_info=True)


@cli.command()
@click.argument("monitor_name")
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data"
)
def run(monitor_name: str, data_dir: Optional[str]):
    """
    Run a price monitoring scan for an existing monitor.
    
    MONITOR_NAME: Name or ID of the monitor to run
    """
    try:
        # Get data directory from context or parameter
        ctx = click.get_current_context()
        data_dir = data_dir or ctx.obj.get('data_dir')
        
        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(monitor_data_dir)
        
        # Find monitor by name or ID
        monitors = price_monitor.list_monitors()
        monitor_id = None
        
        # First try exact match by ID
        if monitor_name in monitors:
            monitor_id = monitor_name
        else:
            # Try to find by name
            for mid, config in monitors.items():
                if config['name'] == monitor_name:
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
            console=console
        ) as progress:
            task = progress.add_task("Scanning stores...", total=None)
            
            results = price_monitor.run_monitor(monitor_id)
            
            progress.update(task, description="Scan completed!")
        
        # Display results
        display_scan_results(results)
        
    except Exception as e:
        console.print(f"[red]❌ Error running monitor: {e}[/red]")
        logger.error(f"Monitor run error: {e}", exc_info=True)


@cli.command()
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data"
)
def list(data_dir: Optional[str]):
    """List all configured price monitors."""
    try:
        # Get data directory from context or parameter
        ctx = click.get_current_context()
        data_dir = data_dir or ctx.obj.get('data_dir')
        
        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(monitor_data_dir)
        
        monitors = price_monitor.list_monitors()
        
        if not monitors:
            console.print("[yellow]No price monitors configured.[/yellow]")
            console.print("Run 'meijer-pricedrop init' to create your first monitor.")
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
            status = "🟢 Active" if config.get('enabled', True) else "🔴 Disabled"
            last_run = config.get('last_run', 'Never')
            if last_run != 'Never':
                last_run = last_run.split('T')[0]  # Just show date
            
            table.add_row(
                config['name'],
                config['search_query'],
                config['location'],
                str(len(config['stores'])),
                last_run,
                status
            )
        
        console.print(table)
        
    except Exception as e:
        console.print(f"[red]❌ Error listing monitors: {e}[/red]")
        logger.error(f"List monitors error: {e}", exc_info=True)


@cli.command()
@click.argument("monitor_name")
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data"
)
def delete(monitor_name: str, data_dir: Optional[str]):
    """
    Delete a price monitoring configuration.
    
    MONITOR_NAME: Name or ID of the monitor to delete
    """
    try:
        # Get data directory from context or parameter
        ctx = click.get_current_context()
        data_dir = data_dir or ctx.obj.get('data_dir')
        
        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(monitor_data_dir)
        
        # Find monitor by name or ID
        monitors = price_monitor.list_monitors()
        monitor_id = None
        
        # First try exact match by ID
        if monitor_name in monitors:
            monitor_id = monitor_name
        else:
            # Try to find by name
            for mid, config in monitors.items():
                if config['name'] == monitor_name:
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
        
        if not Confirm.ask("\n[bold red]Are you sure you want to delete this monitor?[/bold red]", default=False):
            console.print("[yellow]Deletion cancelled.[/yellow]")
            return
        
        # Delete monitor
        if price_monitor.delete_monitor(monitor_id):
            console.print(f"[green]✅ Monitor '{config['name']}' deleted successfully.[/green]")
        else:
            console.print(f"[red]❌ Failed to delete monitor '{config['name']}'.[/red]")
        
    except Exception as e:
        console.print(f"[red]❌ Error deleting monitor: {e}[/red]")
        logger.error(f"Delete monitor error: {e}", exc_info=True)


@cli.command()
@click.option(
    "--min-discount",
    type=float,
    default=20.0,
    help="Minimum discount percentage to consider (default: 20.0)"
)
@click.option(
    "--max-price",
    type=float,
    help="Maximum price to consider for deals"
)
@click.option(
    "--data-dir",
    type=click.Path(file_okay=False, dir_okay=True),
    help="Directory containing price monitoring data"
)
def deals(min_discount: float, max_price: Optional[float], data_dir: Optional[str]):
    """Find products with significant price drops."""
    try:
        # Get data directory from context or parameter
        ctx = click.get_current_context()
        data_dir = data_dir or ctx.obj.get('data_dir')
        
        # Initialize price monitor
        monitor_data_dir = Path(data_dir) if data_dir else None
        price_monitor = PriceMonitor(monitor_data_dir)
        
        console.print(f"[bold]Finding deals with {min_discount}%+ discount...[/bold]")
        
        with Progress(
            SpinnerColumn(),
            TextColumn("[progress.description]{task.description}"),
            console=console
        ) as progress:
            task = progress.add_task("Scanning price history...", total=None)
            
            deals = price_monitor.find_clearance_deals(
                min_discount_percent=min_discount,
                max_price=max_price
            )
            
            progress.update(task, description="Scan completed!")
        
        if not deals:
            console.print(f"[yellow]No deals found with {min_discount}%+ discount.[/yellow]")
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
                deal['product_id'],
                deal['store_id'],
                f"${deal['oldest_price']:.2f}",
                f"${deal['current_price']:.2f}",
                f"{deal['discount_percent']:.1f}%",
                f"${deal['price_drop']:.2f}",
                deal['last_updated'].split('T')[0]
            )
        
        console.print(table)
        
    except Exception as e:
        console.print(f"[red]❌ Error finding deals: {e}[/red]")
        logger.error(f"Find deals error: {e}", exc_info=True)


@cli.command()
@click.option('--min-drop', default=5.0, help='Minimum price drop percentage to show')
@click.option('--sort-by', default='percent', type=click.Choice(['percent', 'amount', 'store', 'product']), help='Sort order for results')
def analyze(min_drop: float, sort_by: str):
    """Analyze price drops between monitoring runs."""
    try:
        from price_monitor.core import PriceMonitor
        
        pm = PriceMonitor()
        price_drops = pm.analyze_price_drops(min_drop_percent=min_drop)
        
        if not price_drops:
            console.print(f"\n[bold yellow]No price drops found with minimum {min_drop}% drop.[/bold yellow]")
            return
        
        # Sort results based on user preference
        if sort_by == 'amount':
            price_drops.sort(key=lambda x: x.price_drop, reverse=True)
        elif sort_by == 'store':
            price_drops.sort(key=lambda x: x.store_name)
        elif sort_by == 'product':
            price_drops.sort(key=lambda x: x.product_name)
        # 'percent' is already sorted by default
        
        console.print(f"\n[bold green]Found {len(price_drops)} products with price drops ≥{min_drop}%[/bold green]")
        
        table = Table(title="Price Drop Analysis")
        table.add_column("Product", style="cyan", no_wrap=True)
        table.add_column("Store", style="yellow")
        table.add_column("Previous", style="red", justify="right")
        table.add_column("Current", style="green", justify="right")
        table.add_column("Drop", style="bold red", justify="right")
        table.add_column("Drop %", style="bold red", justify="right")
        table.add_column("Days Ago", style="dim", justify="right")
        table.add_column("Status", style="bold")
        
        for drop in price_drops:
            status = ""
            if drop.is_clearance:
                status = "🟡 Clearance"
            elif drop.is_on_sale:
                status = "🟢 On Sale"
            else:
                status = "⚪ Regular"
            
            table.add_row(
                drop.product_name[:40] + ("..." if len(drop.product_name) > 40 else ""),
                drop.store_name,
                f"${drop.previous_price:.2f}",
                f"${drop.current_price:.2f}",
                f"-${drop.price_drop:.2f}",
                f"-{drop.price_drop_percent:.1f}%",
                str(drop.days_since_last_check),
                status
            )
        
        console.print(table)
        
        # Summary statistics
        total_savings = sum(drop.price_drop for drop in price_drops)
        avg_drop_percent = sum(drop.price_drop_percent for drop in price_drops) / len(price_drops)
        
        console.print(f"\n[bold]Summary:[/bold]")
        console.print(f"  • Total potential savings: [bold green]${total_savings:.2f}[/bold green]")
        console.print(f"  • Average price drop: [bold red]{avg_drop_percent:.1f}%[/bold red]")
        console.print(f"  • Products on clearance: [bold yellow]{sum(1 for d in price_drops if d.is_clearance)}[/bold yellow]")
        
    except Exception as e:
        console.print(f"\n[bold red]Error during analysis: {e}[/bold red]")
        logging.error(f"Analysis error: {e}")


@cli.command()
@click.argument('upc')
@click.argument('store_id')
@click.option('--expected-price', type=float, help='Expected price to compare against')
def verify(upc: str, store_id: str, expected_price: Optional[float]):
    """Verify a product's price using Shop'n'Scan."""
    try:
        from price_monitor.core import PriceMonitor
        
        pm = PriceMonitor()
        verification = pm.verify_price_with_shopnscan(upc, store_id, expected_price)
        
        if not verification:
            console.print(f"\n[bold red]Failed to verify price for UPC {upc} at store {store_id}[/bold red]")
            return
        
        console.print(f"\n[bold green]✅ Price Verification Complete[/bold green]")
        console.print(f"UPC: [bold]{upc}[/bold]")
        console.print(f"Store: [bold]{store_id}[/bold]")
        
        table = Table(title="Shop'n'Scan Price Verification")
        table.add_column("Field", style="cyan")
        table.add_column("Value", style="yellow")
        
        table.add_row("Product Name", verification.product_name)
        table.add_row("Current Price", f"${verification.current_price:.2f}")
        
        if verification.sale_price:
            table.add_row("Sale Price", f"${verification.sale_price:.2f}")
        
        if verification.original_price:
            table.add_row("Original Price", f"${verification.original_price:.2f}")
        
        table.add_row("Clearance", "Yes" if verification.is_clearance else "No")
        table.add_row("On Sale", "Yes" if verification.is_on_sale else "No")
        table.add_row("Status", verification.verification_status)
        table.add_row("Verified At", verification.timestamp.strftime("%Y-%m-%d %H:%M:%S"))
        
        console.print(table)
        
        # Price comparison if expected price provided
        if expected_price is not None:
            price_diff = verification.current_price - expected_price
            price_diff_percent = (price_diff / expected_price) * 100
            
            console.print(f"\n[bold]Price Comparison:[/bold]")
            console.print(f"Expected: [bold]${expected_price:.2f}[/bold]")
            console.print(f"Actual: [bold]${verification.current_price:.2f}[/bold]")
            
            if price_diff == 0:
                console.print(f"Difference: [bold green]No change[/bold green]")
            elif price_diff < 0:
                console.print(f"Difference: [bold green]${abs(price_diff):.2f} lower ({abs(price_diff_percent):.1f}% savings)[/bold green]")
            else:
                console.print(f"Difference: [bold red]${price_diff:.2f} higher ({price_diff_percent:.1f}% increase)[/bold red]")
        
    except Exception as e:
        console.print(f"\n[bold red]Error during verification: {e}[/bold red]")
        logging.error(f"Verification error: {e}")


@cli.command()
@click.argument('monitor_name')
def history(monitor_name: str):
    """Show price history for a specific monitor."""
    try:
        from price_monitor.core import PriceMonitor
        
        pm = PriceMonitor()
        
        # Find the monitor
        monitor_id = None
        for mid, config in pm.configs.items():
            if config['name'] == monitor_name:
                monitor_id = mid
                break
        
        if not monitor_id:
            console.print(f"\n[bold red]Monitor '{monitor_name}' not found.[/bold red]")
            return
        
        # Get latest price records
        price_records = pm.get_latest_price_records(monitor_id)
        
        if not price_records:
            console.print(f"\n[bold yellow]No price records found for monitor '{monitor_name}'.[/bold yellow]")
            return
        
        console.print(f"\n[bold green]Price History for '{monitor_name}'[/bold green]")
        console.print(f"Products found: [bold]{len(price_records)}[/bold]")
        
        table = Table(title="Latest Price Records")
        table.add_column("Product", style="cyan", no_wrap=True)
        table.add_column("Store", style="yellow")
        table.add_column("Price", style="green", justify="right")
        table.add_column("Original", style="dim", justify="right")
        table.add_column("Status", style="bold")
        table.add_column("Last Updated", style="dim")
        
        for record in price_records:
            status = ""
            if record.is_clearance:
                status = "🟡 Clearance"
            elif record.is_on_sale:
                status = "🟢 On Sale"
            else:
                status = "⚪ Regular"
            
            original_price_str = f"${record.original_price:.2f}" if record.original_price else "N/A"
            
            table.add_row(
                record.product_name[:40] + ("..." if len(record.product_name) > 40 else ""),
                record.store_name,
                f"${record.price:.2f}",
                original_price_str,
                status,
                record.timestamp.strftime("%m/%d %H:%M")
            )
        
        console.print(table)
        
    except Exception as e:
        console.print(f"\n[bold red]Error showing history: {e}[/bold red]")
        logging.error(f"History error: {e}")


def run_initial_scan(price_monitor: PriceMonitor, monitor_id: str) -> None:
    """Run the initial price scan for a newly created monitor."""
    console.print("\n[bold]Running initial price scan...[/bold]")
    
    try:
        with Progress(
            SpinnerColumn(),
            TextColumn("[progress.description]{task.description}"),
            console=console
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
    console.print(f"\n[bold green]✅ Scan completed successfully![/bold green]")
    console.print(f"Products found: [bold]{results['products_found']}[/bold]")
    console.print(f"Stores scanned: [bold]{results['stores_scanned']}[/bold]")
    
    if results['errors']:
        console.print(f"\n[bold red]Errors encountered:[/bold red]")
        for error in results['errors']:
            console.print(f"  • {error}")
    
    if results['price_records']:
        # Show sample of products found
        console.print(f"\n[bold]Sample products found:[/bold]")
        
        table = Table(title="Sample Products")
        table.add_column("Product Name", style="cyan", no_wrap=True)
        table.add_column("Store", style="yellow")
        table.add_column("Price", style="green", justify="right")
        table.add_column("Status", style="bold")
        
        # Show first 10 products
        for record in results['price_records'][:10]:
            # Handle both PriceRecord objects and dictionaries
            if hasattr(record, 'is_clearance'):
                # It's a PriceRecord object
                is_clearance = record.is_clearance
                is_on_sale = record.is_on_sale
                product_name = record.product_name
                store_name = record.store_name
                price = record.price
            else:
                # It's a dictionary
                is_clearance = record.get('is_clearance', False)
                is_on_sale = record.get('is_on_sale', False)
                product_name = record.get('product_name', 'Unknown')
                store_name = record.get('store_name', 'Unknown')
                price = record.get('price', 0.0)
            
            status = ""
            if is_clearance:
                status = "🟡 Clearance"
            elif is_on_sale:
                status = "🟢 On Sale"
            else:
                status = "⚪ Regular"
            
            table.add_row(
                product_name[:50] + ("..." if len(product_name) > 50 else ""),
                store_name,
                f"${price:.2f}",
                status
            )
        
        console.print(table)
        
        if len(results['price_records']) > 10:
            console.print(f"\n[dim]... and {len(results['price_records']) - 10} more products[/dim]")
    
    console.print(f"\n[dim]Results saved to: {results.get('monitor_id', 'unknown')}[/dim]")


def main():
    """Main entry point for the CLI."""
    cli()


if __name__ == "__main__":
    main()
