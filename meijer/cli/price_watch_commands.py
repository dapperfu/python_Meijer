"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create CLI commands for Meijer price watch system following existing CLI patterns
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: click, rich, datetime, decimal, typing, pathlib
 */

CLI Commands for Price Watch System

This module provides Click-based CLI commands for the price watch system,
following the existing CLI patterns and style.
"""

import csv
from datetime import datetime
from decimal import Decimal
from pathlib import Path
from typing import Optional, List, Dict, Any

import click
from rich.console import Console
from rich.table import Table
from rich.text import Text

from ..price_watch.database import ensure_database_exists
from ..price_watch.manager import PriceWatchManager
from ..price_watch.email_config import get_email_config
from ..price_watch.email_config import EmailSender


# Rich console for better output formatting
console = Console()


@click.group()
def price_watch_group():
    """Manage price watches and alerts for Meijer products."""
    pass


@price_watch_group.command("add")
@click.argument("identifier", type=str)
@click.option(
    "--type",
    "id_type",
    type=click.Choice(["UPC", "PLU"]),
    help="Override identifier type if not auto-detected"
)
@click.option(
    "--store-id",
    "-s",
    type=str,
    help="Bind the watch to a specific store"
)
@click.option(
    "--desired-price",
    type=click.FLOAT,
    help="Target price for alerts"
)
@click.option(
    "--only-when",
    type=click.Choice([
        "any_drop",
        "sale_or_clearance", 
        "clearance_only",
        "below_desired_price"
    ]),
    default="any_drop",
    help="Condition for triggering alerts"
)
@click.option(
    "--note",
    type=str,
    help="Optional note about the watch"
)
def add_watch(
    identifier: str,
    id_type: Optional[str],
    store_id: Optional[str],
    desired_price: Optional[Decimal],
    only_when: str,
    note: Optional[str]
):
    """
    Add a new product watch.
    
    Examples:
        meijer watch add 012345678905
        meijer watch add 4011 --type PLU
        meijer watch add 012345678905 -s 217 --desired-price 7.99
        meijer watch add 012345678905 --only-when sale_or_clearance --note "Weekly special"
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        # Add the watch
        watch = manager.add_watch(
            identifier=identifier,
            id_type=id_type,
            store_id=store_id,
            desired_price=desired_price,
            only_when=only_when,
            note=note
        )
        
        # Display success message
        console.print("✅ [green]Watch added successfully![/green]")
        console.print(f"   Product: {watch.product}")
        console.print(f"   Store: {watch.store or 'Any Store'}")
        if watch.desired_price:
            console.print(f"   Target Price: ${watch.desired_price}")
        console.print(f"   Alert Condition: {watch.only_when}")
        if watch.note:
            console.print(f"   Note: {watch.note}")
        
    except ValueError as e:
        console.print(f"❌ [red]Invalid input: {e}[/red]")
        raise click.ClickException(str(e))
    except Exception as e:
        console.print(f"❌ [red]Failed to add watch: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("rm")
@click.argument("identifier", type=str)
@click.option(
    "--store-id",
    "-s",
    type=str,
    help="Remove watch from specific store only"
)
def remove_watch(identifier: str, store_id: Optional[str]):
    """
    Remove (deactivate) a product watch.
    
    Examples:
        meijer watch rm 012345678905
        meijer watch rm 4011 --store-id 217
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        # Remove the watch
        removed = manager.remove_watch(identifier, store_id)
        
        if removed:
            store_info = f" from store {store_id}" if store_id else ""
            console.print(f"✅ [green]Watch removed successfully{store_info}![/green]")
        else:
            console.print(f"❌ [red]No active watches found for {identifier}[/red]")
            raise click.ClickException("Watch not found")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to remove watch: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("ls")
@click.option(
    "--active",
    "active_only",
    is_flag=True,
    default=True,
    help="Show only active watches (default)"
)
@click.option(
    "--all",
    "show_all",
    is_flag=True,
    help="Show all watches including inactive"
)
@click.option(
    "--format",
    type=click.Choice(["table", "json", "csv"]),
    default="table",
    help="Output format"
)
@click.option(
    "--store-id",
    "-s",
    type=str,
    help="Filter by store ID"
)
def list_watches(
    active_only: bool,
    show_all: bool,
    format: str,
    store_id: Optional[str]
):
    """
    List all watches with current price information.
    
    Examples:
        meijer watch ls
        meijer watch ls --all
        meijer watch ls --format json
        meijer watch ls -s 217
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        # Get watches
        watches = manager.list_watches(
            active_only=active_only and not show_all,
            store_id=store_id
        )
        
        if not watches:
            console.print("📝 [yellow]No watches found[/yellow]")
            return
        
        # Display in requested format
        if format == "json":
            import json
            console.print(json.dumps(watches, indent=2, default=str))
        elif format == "csv":
            _output_csv(watches)
        else:
            _output_table(watches)
        
        console.print(f"\n📊 [blue]Total watches: {len(watches)}[/blue]")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to list watches: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("refresh")
@click.option(
    "--store-id",
    "-s",
    type=str,
    help="Refresh prices for specific store only"
)
@click.option(
    "--limit",
    "-l",
    type=int,
    help="Maximum number of products to refresh"
)
@click.option(
    "--method",
    "-m",
    type=click.Choice(["cart", "shop_scan", "search", "keywords"]),
    default="search",
    help="Method to use for price fetching"
)
def refresh_prices(
    store_id: Optional[str],
    limit: Optional[int],
    method: str
):
    """
    Fetch current prices for watched items and update price history.
    
    Examples:
        meijer watch refresh
        meijer watch refresh --store-id 217
        meijer watch refresh --limit 10 --method cart
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        console.print(f"🔄 [blue]Refreshing prices using {method} method...[/blue]")
        
        # Refresh prices
        result = manager.refresh_prices(
            store_id=store_id,
            limit=limit,
            method=method
        )
        
        # Display results
        console.print("✅ [green]Price refresh completed![/green]")
        console.print(f"   Refreshed: {result['refreshed']}")
        console.print(f"   Errors: {result['errors']}")
        console.print(f"   Duration: {result['duration']:.2f}s")
        
        if result['warnings']:
            console.print(f"   Warnings: {len(result['warnings'])}")
            for warning in result['warnings'][:5]:  # Show first 5 warnings
                console.print(f"     • {warning}")
            if len(result['warnings']) > 5:
                console.print(f"     ... and {len(result['warnings']) - 5} more")
        
    except Exception as e:
        console.print(f"❌ [red]Price refresh failed: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("report")
@click.option(
    "--since",
    type=click.DateTime(formats=["%Y-%m-%d", "%Y-%m-%d %H:%M:%S"]),
    help="Show changes since this date (YYYY-MM-DD or YYYY-MM-DD HH:MM:SS)"
)
@click.option(
    "--format",
    type=click.Choice(["table", "json", "csv"]),
    default="table",
    help="Output format"
)
def generate_report(since: Optional[datetime], format: str):
    """
    Show price changes and current best prices for all watches.
    
    Examples:
        meijer watch report
        meijer watch report --since 2025-08-01
        meijer watch report --format csv
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        if since:
            console.print(f"📊 [blue]Generating report since {since.strftime('%Y-%m-%d %H:%M:%S')}[/blue]")
        else:
            console.print("📊 [blue]Generating report for recent changes...[/blue]")
        
        # Generate alerts (this will show what would be alerted on)
        alerts = manager.generate_alerts(since=since)
        
        if not alerts:
            console.print("📝 [yellow]No price changes detected in the specified period[/yellow]")
            return
        
        # Display in requested format
        if format == "json":
            import json
            console.print(json.dumps(alerts, indent=2, default=str))
        elif format == "csv":
            _output_alert_csv(alerts)
        else:
            _output_alert_table(alerts)
        
        console.print(f"\n📊 [blue]Total changes detected: {len(alerts)}[/blue]")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to generate report: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("notify")
@click.option(
    "--dry-run",
    is_flag=True,
    help="Show what would be emailed without sending"
)
@click.option(
    "--since",
    type=click.DateTime(formats=["%Y-%m-%d", "%Y-%m-%d %H:%M:%S"]),
    help="Process changes since this date"
)
@click.option(
    "--channel",
    type=click.Choice(["email"]),
    default="email",
    help="Notification channel"
)
def send_notifications(
    dry_run: bool,
    since: Optional[datetime],
    channel: str
):
    """
    Send email notifications for price alerts.
    
    Examples:
        meijer watch notify
        meijer watch notify --dry-run
        meijer watch notify --since 2025-08-01
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        if dry_run:
            console.print("🧪 [yellow]DRY RUN MODE - No emails will be sent[/yellow]")
        
        # Generate alerts
        alerts = manager.generate_alerts(since=since)
        
        if not alerts:
            console.print("📝 [yellow]No new alerts to notify about[/yellow]")
            return
        
        console.print(f"📧 [blue]Processing {len(alerts)} alerts...[/blue]")
        
        if dry_run:
            # Show what would be sent
            _show_dry_run_alerts(alerts)
        else:
            # Send actual notifications
            _send_email_notifications(alerts)
        
    except Exception as e:
        console.print(f"❌ [red]Failed to send notifications: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("import")
@click.argument("file_path", type=click.Path(exists=True, path_type=Path))
def import_watches(file_path: Path):
    """
    Import watches from a CSV file.
    
    Expected CSV columns: identifier,id_type,store_id,desired_price,only_when,note
    
    Examples:
        meijer watch import watches.csv
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        console.print(f"📥 [blue]Importing watches from {file_path}...[/blue]")
        
        imported_count = 0
        error_count = 0
        
        with open(file_path, 'r', newline='', encoding='utf-8') as csvfile:
            reader = csv.DictReader(csvfile)
            
            for row_num, row in enumerate(reader, start=2):  # Start at 2 for header
                try:
                    # Parse row data
                    identifier = row.get('identifier', '').strip()
                    if not identifier:
                        continue
                    
                    id_type = row.get('id_type', '').strip()
                    store_id = row.get('store_id', '').strip() or None
                    desired_price = row.get('desired_price', '').strip()
                    only_when = row.get('only_when', 'any_drop').strip()
                    note = row.get('note', '').strip() or None
                    
                    # Convert desired_price to Decimal if present
                    if desired_price:
                        try:
                            desired_price = Decimal(desired_price)
                        except:
                            desired_price = None
                    
                    # Add watch
                    manager.add_watch(
                        identifier=identifier,
                        id_type=id_type if id_type else None,
                        store_id=store_id,
                        desired_price=desired_price,
                        only_when=only_when,
                        note=note
                    )
                    
                    imported_count += 1
                    
                except Exception as e:
                    error_count += 1
                    console.print(f"❌ [red]Error importing row {row_num}: {e}[/red]")
        
        console.print("✅ [green]Import completed![/green]")
        console.print(f"   Imported: {imported_count}")
        console.print(f"   Errors: {error_count}")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to import watches: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("export")
@click.argument("file_path", type=click.Path(path_type=Path))
@click.option(
    "--active-only",
    is_flag=True,
    default=True,
    help="Export only active watches (default)"
)
def export_watches(file_path: Path, active_only: bool):
    """
    Export watches to a CSV file.
    
    Examples:
        meijer watch export watches.csv
        meijer watch export all_watches.csv --no-active-only
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        # Get watches
        watches = manager.list_watches(active_only=active_only)
        
        if not watches:
            console.print("📝 [yellow]No watches to export[/yellow]")
            return
        
        # Export to CSV
        with open(file_path, 'w', newline='', encoding='utf-8') as csvfile:
            fieldnames = [
                'identifier', 'id_type', 'store_id', 'desired_price',
                'only_when', 'note', 'created_at'
            ]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            
            writer.writeheader()
            for watch in watches:
                writer.writerow({
                    'identifier': watch['identifier'],
                    'id_type': watch['id_type'],
                    'store_id': watch['store_id'] or '',
                    'desired_price': watch['desired_price'] or '',
                    'only_when': watch['only_when'],
                    'note': watch['note'] or '',
                    'created_at': watch['created_at'].strftime('%Y-%m-%d %H:%M:%S')
                })
        
        console.print(f"✅ [green]Exported {len(watches)} watches to {file_path}[/green]")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to export watches: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("setup")
@click.option(
    "--force",
    "-f",
    is_flag=True,
    help="Overwrite existing configuration"
)
def setup_email_config(force: bool):
    """
    Create consolidated configuration for Meijer CLI.
    
    Runs interactive setup to collect all required information and creates
    a single meijer.toml file with all settings.
    
    Examples:
        meijer watch setup              # Interactive setup
        meijer watch setup --force      # Overwrite existing config
    """
    try:
        if force:
            console.print("🔄 [yellow]Running interactive configuration setup (overwriting existing)...[/yellow]")
        else:
            console.print("📧 [blue]Running interactive configuration setup...[/blue]")
        
        # Import and run interactive setup
        from ..price_watch.email_config import EmailConfig
        email_config = EmailConfig()
        email_config.create_interactive_config(force=force)
        
    except Exception as e:
        console.print(f"❌ [red]Failed to create configuration: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("test-email")
@click.option(
    "--identifier",
    "-i",
    type=str,
    help="Use specific product identifier for test (UPC or PLU)"
)
@click.option(
    "--store-id",
    "-s",
    type=str,
    help="Use specific store for test"
)
@click.option(
    "--to",
    "-t",
    type=str,
    help="Send test email to specific address (overrides config)"
)
def test_email(identifier: Optional[str], store_id: Optional[str], to: Optional[str]):
    """
    Send a test email to verify email configuration.
    
    Examples:
        meijer watch test-email
        meijer watch test-email -i 012345678905
        meijer watch test-email -s 217
        meijer watch test-email -t test@example.com
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        # Get email configuration
        email_config = get_email_config()
        
        if not email_config.validate_config():
            console.print("❌ [red]Invalid email configuration![/red]")
            console.print("💡 Run 'meijer watch setup' to create email configuration")
            raise click.ClickException("Email configuration invalid")
        
        # Get product information for test
        product_info = None
        
        if identifier:
            # Use specified product
            console.print(f"🔍 [blue]Looking up product {identifier}...[/blue]")
            
            from ..models.price_watch import Product
            from pony.orm import db_session
            
            with db_session:
                product = Product.get(identifier=identifier)
                if not product:
                    console.print(f"❌ [red]Product not found: {identifier}[/red]")
                    raise click.ClickException("Product not found")
                
                # Get current price
                current_price = manager._get_current_price(product, None)
                if current_price:
                    product_info = {
                        'product_name': product.name or 'Unknown Product',
                        'product_identifier': product.identifier,
                        'store_name': 'Any Store',
                        'current_price': float(current_price['price'])
                    }
                else:
                    # Use product info without price
                    product_info = {
                        'product_name': product.name or 'Unknown Product',
                        'product_identifier': product.identifier,
                        'store_name': 'Any Store',
                        'current_price': 0.00
                    }
        else:
            # Find a product in the database
            console.print("🔍 [blue]Looking for a product in the database...[/blue]")
            
            from ..models.price_watch import Product
            from pony.orm import db_session
            
            with db_session:
                product = Product.select().first()
                if product:
                    # Get current price
                    current_price = manager._get_current_price(product, None)
                    if current_price:
                        product_info = {
                            'product_name': product.name or 'Unknown Product',
                            'product_identifier': product.identifier,
                            'store_name': 'Any Store',
                            'current_price': float(current_price['price'])
                        }
                    else:
                        product_info = {
                            'product_name': product.name or 'Unknown Product',
                            'product_identifier': product.identifier,
                            'store_name': 'Any Store',
                            'current_price': 0.00
                        }
                else:
                    console.print("📝 [yellow]No products found in database, using default test data[/yellow]")
                    product_info = None
        
        if product_info:
            console.print(f"✅ [green]Using product: {product_info['product_name']} ({product_info['product_identifier']})[/green]")
            console.print(f"   Store: {product_info['store_name']}")
            console.print(f"   Price: ${product_info['current_price']:.2f}")
        
        # Send test email
        console.print("📧 [blue]Sending test email...[/blue]")
        
        email_sender = EmailSender(email_config)
        message_id = email_sender.send_test_email(
            to_email=to,
            product_info=product_info
        )
        
        if message_id:
            console.print("✅ [green]Test email sent successfully![/green]")
            console.print(f"   Message ID: {message_id}")
            if to:
                console.print(f"   Sent to: {to}")
            else:
                console.print(f"   Sent to: {email_config.get_smtp_config()['to']}")
            
            console.print("\n📝 [blue]Check your email inbox for the test message.[/blue]")
            console.print("   If you don't receive it, check your spam folder and email configuration.")
        else:
            console.print("❌ [red]Failed to send test email[/red]")
            raise click.ClickException("Email sending failed")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to send test email: {e}[/red]")
        raise click.ClickException(str(e))


@price_watch_group.command("price")
@click.argument("identifier", type=str)
@click.option(
    "--store-id",
    "-s",
    type=str,
    help="Get price for specific store"
)
@click.option(
    "--method",
    "-m",
    type=click.Choice(["cart", "shop_scan", "search", "keywords"]),
    default="search",
    help="Method to use for price fetching"
)
@click.option(
    "--no-store",
    is_flag=True,
    help="Don't store the price in history"
)
def get_price(
    identifier: str,
    store_id: Optional[str],
    method: str,
    no_store: bool
):
    """
    Get current price for a product without affecting watches.
    
    Examples:
        meijer watch price 012345678905
        meijer watch price 4011 --type PLU --method cart
        meijer watch price 012345678905 -s 217 --no-store
    """
    try:
        # Initialize database and manager
        db_manager = ensure_database_exists()
        manager = PriceWatchManager(db_manager)
        
        console.print(f"🔍 [blue]Fetching price for {identifier} using {method}...[/blue]")
        
        # Get or create product
        from ..models.price_watch import Product
        from pony.orm import db_session
        
        with db_session:
            product = Product.get(identifier=identifier)
            if not product:
                console.print(f"❌ [red]Product not found: {identifier}[/red]")
                return
        
        # Fetch current price
        price_info = manager._fetch_current_price(
            identifier=identifier,
            id_type=product.id_type,
            store=None,  # TODO: Get actual store if store_id provided
            method=method
        )
        
        if price_info:
            console.print("✅ [green]Price found![/green]")
            console.print(f"   Price: ${price_info['price']}")
            console.print(f"   Type: {price_info['price_type']}")
            if price_info.get('regular_price'):
                console.print(f"   Regular Price: ${price_info['regular_price']}")
            if price_info.get('unit_price'):
                console.print(f"   Unit Price: ${price_info['unit_price']}")
            console.print(f"   In Stock: {price_info.get('in_stock', 'Unknown')}")
            console.print(f"   Source: {price_info['source']}")
            
            if not no_store:
                console.print("💾 [blue]Price stored in history[/blue]")
        else:
            console.print(f"❌ [red]Could not fetch price for {identifier}[/red]")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to get price: {e}[/red]")
        raise click.ClickException(str(e))


# Helper functions for output formatting

def _output_table(watches: List[Dict[str, Any]]) -> None:
    """Display watches in a rich table format."""
    table = Table(title="Price Watches")
    
    table.add_column("ID", style="cyan")
    table.add_column("Identifier", style="green")
    table.add_column("Type", style="blue")
    table.add_column("Product", style="white")
    table.add_column("Store", style="yellow")
    table.add_column("Current Price", style="magenta")
    table.add_column("Target", style="cyan")
    table.add_column("Condition", style="blue")
    table.add_column("Note", style="dim")
    
    for watch in watches:
        current_price = watch.get('current_price')
        price_str = f"${current_price}" if current_price else "Unknown"
        
        table.add_row(
            str(watch['id']),
            watch['identifier'],
            watch['id_type'],
            watch['product_name'],
            watch['store_name'],
            price_str,
            f"${watch['desired_price']}" if watch['desired_price'] else "-",
            watch['only_when'].replace('_', ' ').title(),
            watch['note'] or "-"
        )
    
    console.print(table)


def _output_csv(watches: List[Dict[str, Any]]) -> None:
    """Output watches in CSV format."""
    import sys
    
    fieldnames = [
        'id', 'identifier', 'id_type', 'product_name', 'store_name',
        'current_price', 'desired_price', 'only_when', 'note'
    ]
    
    writer = csv.DictWriter(sys.stdout, fieldnames=fieldnames)
    writer.writeheader()
    
    for watch in watches:
        writer.writerow({
            'id': watch['id'],
            'identifier': watch['identifier'],
            'id_type': watch['id_type'],
            'product_name': watch['product_name'],
            'store_name': watch['store_name'],
            'current_price': watch.get('current_price'),
            'desired_price': watch.get('desired_price'),
            'only_when': watch['only_when'],
            'note': watch.get('note')
        })


def _output_alert_table(alerts: List[Dict[str, Any]]) -> None:
    """Display alerts in a rich table format."""
    table = Table(title="Price Alerts")
    
    table.add_column("Product", style="white")
    table.add_column("Identifier", style="green")
    table.add_column("Store", style="yellow")
    table.add_column("Reason", style="blue")
    table.add_column("New Price", style="magenta")
    table.add_column("Previous", style="cyan")
    table.add_column("Change", style="red")
    table.add_column("Type", style="blue")
    table.add_column("Observed", style="dim")
    
    for alert in alerts:
        delta = alert['delta_amount']
        delta_str = f"${delta:+.2f}"
        delta_style = "red" if delta < 0 else "green"
        
        table.add_row(
            alert['product_name'],
            alert['product_identifier'],
            alert['store_name'],
            alert['reason'].replace('_', ' ').title(),
            f"${alert['new_price']}",
            f"${alert['previous_price']}" if alert['previous_price'] else "-",
            Text(delta_str, style=delta_style),
            alert['price_type'].title(),
            alert['observed_at'].strftime('%m/%d %H:%M')
        )
    
    console.print(table)


def _output_alert_csv(alerts: List[Dict[str, Any]]) -> None:
    """Output alerts in CSV format."""
    import sys
    
    fieldnames = [
        'product_name', 'product_identifier', 'store_name', 'reason',
        'new_price', 'previous_price', 'delta_amount', 'price_type',
        'observed_at', 'source'
    ]
    
    writer = csv.DictWriter(sys.stdout, fieldnames=fieldnames)
    writer.writeheader()
    
    for alert in alerts:
        writer.writerow({
            'product_name': alert['product_name'],
            'product_identifier': alert['product_identifier'],
            'store_name': alert['store_name'],
            'reason': alert['reason'],
            'new_price': alert['new_price'],
            'previous_price': alert['previous_price'],
            'delta_amount': alert['delta_amount'],
            'price_type': alert['price_type'],
            'observed_at': alert['observed_at'].strftime('%Y-%m-%d %H:%M:%S'),
            'source': alert['source']
        })


def _show_dry_run_alerts(alerts: List[Dict[str, Any]]) -> None:
    """Show what alerts would be sent in dry-run mode."""
    console.print(f"\n📧 [yellow]DRY RUN: Would send {len(alerts)} alert(s)[/yellow]")
    
    for i, alert in enumerate(alerts, 1):
        console.print(f"\n[bold]Alert {i}:[/bold]")
        console.print(f"  Product: {alert['product_name']} ({alert['product_identifier']})")
        console.print(f"  Store: {alert['store_name']}")
        console.print(f"  Reason: {alert['reason'].replace('_', ' ').title()}")
        console.print(f"  New Price: ${alert['new_price']}")
        if alert['previous_price']:
            console.print(f"  Previous Price: ${alert['previous_price']}")
            delta = alert['delta_amount']
            console.print(f"  Change: ${delta:+.2f}")
        console.print(f"  Price Type: {alert['price_type'].title()}")
        console.print(f"  Observed: {alert['observed_at'].strftime('%Y-%m-%d %H:%M:%S')}")


def _send_email_notifications(alerts: List[Dict[str, Any]]) -> None:
    """Send actual email notifications."""
    try:
        # Get email configuration
        email_config = get_email_config()
        
        if not email_config.validate_config():
            console.print("❌ [red]Invalid email configuration![/red]")
            console.print("💡 Run 'meijer watch setup' to create email configuration")
            raise click.ClickException("Email configuration invalid")
        
        # Create email sender
        email_sender = EmailSender(email_config)
        
        # Send consolidated email
        message_id = email_sender.send_consolidated_alerts(alerts)
        
        if message_id:
            console.print("✅ [green]Email notification sent successfully![/green]")
            console.print(f"   Message ID: {message_id}")
            console.print(f"   Recipients: {len(alerts)} alert(s) consolidated")
        else:
            console.print("❌ [red]Failed to send email notification[/red]")
            raise click.ClickException("Email sending failed")
        
    except Exception as e:
        console.print(f"❌ [red]Failed to send notifications: {e}[/red]")
        raise click.ClickException(str(e))
