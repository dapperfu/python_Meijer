#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create comprehensive CLI tool with Click for Meijer shopping list management
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: click, meijer package, tabulate, sys, os
 */

Meijer CLI Tool
===============

A comprehensive command-line interface for managing Meijer shopping lists.
"""

import sys
import os
import json
import re
from typing import List, Optional, TextIO, Dict
from pathlib import Path
from datetime import datetime

import click

try:
    from tabulate import tabulate
    TABULATE_AVAILABLE = True
except ImportError:
    TABULATE_AVAILABLE = False

try:
    from .client import Meijer
    MEIJER_AVAILABLE = True
except ImportError:
    MEIJER_AVAILABLE = False
    click.echo("❌ Meijer package not available. Install with: pip install -e .", err=True)
    sys.exit(1)


def get_meijer_client() -> Meijer:
    """
    Get an authenticated Meijer client instance.
    
    Returns:
        Meijer: Authenticated client instance
        
    Raises:
        click.ClickException: If authentication fails
    """
    try:
        # First try to load from local auth.txt file
        local_auth_path = "auth.txt"
        if os.path.exists(local_auth_path):
            client = Meijer(auth=local_auth_path)
        else:
            # Fall back to default behavior
            client = Meijer()
        
        if client.auth_status.name != "AUTHENTICATED":
            raise click.ClickException(
                "❌ Authentication failed! Please check your credentials.\n"
                "   Ensure you have auth.txt or ~/.config/meijer.txt configured"
            )
        
        return client
    except Exception as e:
        raise click.ClickException(f"❌ Failed to initialize Meijer client: {e}")


def display_items_table(items: List, title: str = "Shopping List Items") -> None:
    """
    Display items in a formatted table.
    
    Args:
        items: List of shopping list items
        title: Title for the table display
    """
    if not items:
        click.echo(f"📝 {title}: No items found")
        return
    
    # Prepare table data
    table_data = []
    for i, item in enumerate(items, 1):
        table_data.append([
            i,
            item.name[:40] + "..." if len(item.name) > 40 else item.name,
            item.quantity,
            "✅ Done" if item.checked else "⏳ Pending",
            item.notes[:30] + "..." if item.notes and len(item.notes) > 30 else item.notes or "None"
        ])
    
    headers = ["#", "Item", "Qty", "Status", "Notes"]
    
    if TABULATE_AVAILABLE:
        click.echo(f"\n📊 {title}:")
        click.echo(tabulate(table_data, headers=headers, tablefmt="grid"))
    else:
        click.echo(f"\n📊 {title}:")
        click.echo("=" * 80)
        click.echo(f"{'#':<3} {'Item':<40} {'Qty':<4} {'Status':<10} {'Notes':<30}")
        click.echo("-" * 80)
        for row in table_data:
            click.echo(f"{row[0]:<3} {row[1]:<40} {row[2]:<4} {row[3]:<10} {row[4]:<30}")


def add_items_from_file(client: Meijer, file_input: TextIO) -> int:
    """
    Add items from a file input (stdin or file).
    
    Args:
        client: Meijer client instance
        file_input: File-like object to read from
        
    Returns:
        int: Number of items successfully added
    """
    added_count = 0
    failed_count = 0
    
    click.echo("📝 Reading items from input...")
    
    for line_num, line in enumerate(file_input, 1):
        line = line.strip()
        if not line or line.startswith('#'):  # Skip empty lines and comments
            continue
            
        try:
            # Try to add the item
            success = client.list.add_item_with_details(
                upc=f"ITEM_{line_num}",  # Generate a unique identifier
                description=line,
                quantity=1
            )
            
            if success:
                added_count += 1
                click.echo(f"  ✅ Added: {line}")
            else:
                failed_count += 1
                click.echo(f"  ❌ Failed: {line}")
                
        except Exception as e:
            failed_count += 1
            click.echo(f"  ❌ Error adding '{line}': {e}")
    
    click.echo(f"\n📊 Summary: {added_count} added, {failed_count} failed")
    return added_count


@click.group()
@click.version_option(version="1.0.0", prog_name="meijer")
def cli():
    """
    🛒 Meijer Shopping List CLI Tool
    
    Manage your Meijer shopping lists from the command line.
    
    Examples:
        meijer list show                    # Show current shopping list
        meijer list add "Milk"              # Add item by description
        meijer list add 0123456789          # Add item by UPC
        meijer list add < items.txt         # Add items from file
        echo "Milk" | meijer list add       # Add item from stdin
        meijer list clear                   # Clear completed items
        meijer list defrag                  # Organize list by aisle
    """
    pass


@cli.group()
def list():
    """Manage shopping list operations."""
    pass


@list.command("show")
@click.option("--completed", is_flag=True, help="Show only completed items")
@click.option("--pending", is_flag=True, help="Show only pending items")
def list_show(completed: bool, pending: bool):
    """Show shopping list items."""
    client = get_meijer_client()
    
    try:
        items = client.list.get()
        
        if not items:
            click.echo("📝 Your shopping list is empty!")
            return
        
        # Filter items based on flags
        if completed:
            items = [item for item in items if item.checked]
            title = "Completed Items"
        elif pending:
            items = [item for item in items if not item.checked]
            title = "Pending Items"
        else:
            title = f"Shopping List ({len(items)} items)"
        
        display_items_table(items, title)
        
        # Show summary
        total = len(items)
        completed_count = len([item for item in items if item.checked])
        pending_count = total - completed_count
        
        click.echo(f"\n📊 Summary: {total} total, {completed_count} completed, {pending_count} pending")
        
    except Exception as e:
        raise click.ClickException(f"❌ Failed to show shopping list: {e}")


@list.command("favorites")
def list_favorites():
    """Show favorite items."""
    client = get_meijer_client()
    
    try:
        favorites = client.list.get_favorites()
        
        if not favorites:
            click.echo("📝 No favorite items found!")
            return
        
        # Prepare table data
        table_data = []
        for i, item in enumerate(favorites, 1):
            table_data.append([
                i,
                item.name[:40] + "..." if len(item.name) > 40 else item.name,
                item.quantity,
                "✅ In List" if item.isItemInActiveList else "⭕ Not in List"
            ])
        
        headers = ["#", "Favorite Item", "Qty", "Status"]
        
        if TABULATE_AVAILABLE:
            click.echo(f"\n📊 Favorites ({len(favorites)} items):")
            click.echo(tabulate(table_data, headers=headers, tablefmt="grid"))
        else:
            click.echo(f"\n📊 Favorites ({len(favorites)} items):")
            click.echo("=" * 60)
            click.echo(f"{'#':<3} {'Favorite Item':<40} {'Qty':<4} {'Status':<15}")
            click.echo("-" * 60)
            for row in table_data:
                click.echo(f"{row[0]:<3} {row[1]:<40} {row[2]:<4} {row[3]:<15}")
        
    except Exception as e:
        raise click.ClickException(f"❌ Failed to show favorites: {e}")


@list.command("add")
@click.argument("item", required=False)
@click.option("--quantity", "-q", default=1, help="Quantity to add")
@click.option("--notes", "-n", help="Additional notes for the item")
@click.option("--file", "-f", type=click.Path(exists=True), help="Read items from file")
def list_add(item: Optional[str], quantity: int, notes: str, file: str):
    """Add item(s) to shopping list."""
    client = get_meijer_client()
    
    try:
        if file:
            # Add items from file
            with open(file, 'r') as f:
                add_items_from_file(client, f)
        elif not item and not sys.stdin.isatty():
            # Add items from stdin (pipe)
            add_items_from_file(client, sys.stdin)
        elif item:
            # Add single item
            if item.isdigit() and len(item) >= 8:
                # Treat as UPC
                success = client.list.add_item(
                    upc=item,
                    quantity=quantity
                )
                if success:
                    click.echo(f"✅ Added UPC {item} to shopping list")
                else:
                    raise click.ClickException(f"❌ Failed to add UPC {item}")
            else:
                # Treat as description
                success = client.list.add_item_with_details(
                    upc=f"ITEM_{hash(item) % 10000}",  # Generate unique identifier
                    description=item,
                    quantity=quantity,
                    notes=notes
                )
                if success:
                    click.echo(f"✅ Added '{item}' to shopping list")
                else:
                    raise click.ClickException(f"❌ Failed to add '{item}'")
        else:
            raise click.ClickException(
                "❌ No item specified and no input provided.\n"
                "   Usage: meijer list add <item> OR meijer list add < file.txt"
            )
            
    except Exception as e:
        raise click.ClickException(f"❌ Failed to add item: {e}")


@list.command("clear")
def list_clear():
    """Clear completed items from shopping list."""
    client = get_meijer_client()
    
    try:
        items = client.list.get()
        if not items:
            click.echo("📝 Shopping list is already empty!")
            return
        
        completed_items = [item for item in items if item.checked]
        if not completed_items:
            click.echo("📝 No completed items to clear!")
            return
        
        click.echo(f"🗑️  Clearing {len(completed_items)} completed items...")
        
        # Delete completed items
        deleted_count = 0
        for item in completed_items:
            if client.list.delete_item(str(item.listItemId)):
                deleted_count += 1
                click.echo(f"  ✅ Deleted: {item.name}")
            else:
                click.echo(f"  ❌ Failed to delete: {item.name}")
        
        click.echo(f"\n📊 Cleared {deleted_count} completed items")
        
    except Exception as e:
        raise click.ClickException(f"❌ Failed to clear completed items: {e}")


@list.command("clearall")
@click.confirmation_option(prompt="⚠️  Are you sure you want to clear ALL items? This cannot be undone!")
def list_clearall():
    """Clear all items from shopping list (completed and pending)."""
    client = get_meijer_client()
    
    try:
        items = client.list.get()
        if not items:
            click.echo("📝 Shopping list is already empty!")
            return
        
        click.echo(f"🗑️  Clearing ALL {len(items)} items...")
        
        # Mark everything as complete first, then clear
        click.echo("📝 Marking all items as complete...")
        completed_count = 0
        for item in items:
            if not item.checked:
                if client.list.complete_item(str(item.listItemId)):
                    completed_count += 1
                    click.echo(f"  ✅ Marked complete: {item.name}")
                else:
                    click.echo(f"  ❌ Failed to mark complete: {item.name}")
        
        click.echo(f"📊 Marked {completed_count} items as complete")
        
        # Now clear all completed items
        click.echo("🗑️  Clearing all completed items...")
        all_items = client.list.get()  # Get updated list
        deleted_count = 0
        for item in all_items:
            if client.list.delete_item(str(item.listItemId)):
                deleted_count += 1
                click.echo(f"  ✅ Deleted: {item.name}")
            else:
                click.echo(f"  ❌ Failed to delete: {item.name}")
        
        click.echo(f"\n📊 Cleared {deleted_count} items total")
        
    except Exception as e:
        raise click.ClickException(f"❌ Failed to clear all items: {e}")


@list.command("defrag")
@click.option("--store-id", help="Store ID for location lookup")
@click.option("-r", "--reverse", is_flag=True, help="Sort items in reverse order (descending)")
@click.option("-z", "--zig", is_flag=True, help="Alternate B aisle sorting (B1 ascending, B2 descending, etc.)")
def list_defrag(store_id: Optional[str], reverse: bool, zig: bool):
    """Defragment shopping list by organizing items by aisle."""
    client = get_meijer_client()
    
    try:
        click.echo("🔧 Starting shopping list defrag...")
        click.echo("⏳ This may take a moment to search for product locations...")
        
        if reverse:
            click.echo("🔄 Using reverse sorting (descending order)")
        if zig:
            click.echo("🔄 Using zig-zag B aisle sorting (B1 ascending, B2 descending, etc.)")
        
        success = client.list.defrag(store_id=store_id, reverse=reverse, zig=zig)
        
        if success:
            click.echo("🎉 Defrag completed successfully!")
            click.echo("📋 Your shopping list is now organized by aisle for efficient shopping!")
        else:
            raise click.ClickException("❌ Defrag failed!")
    except Exception as e:
        raise click.ClickException(f"❌ Defrag failed: {e}")


@list.command("interactive")
def list_interactive():
    """Interactive TUI for shopping list management."""
    try:
        # Try to import rich for interactive TUI
        from rich.console import Console
        from rich.table import Table
        from rich.prompt import Prompt, Confirm
        from rich.panel import Panel
        from rich.text import Text
        RICH_AVAILABLE = True
    except ImportError:
        RICH_AVAILABLE = False
        click.echo("❌ Rich library not available for interactive mode.")
        click.echo("   Install with: pip install rich")
        click.echo("   Falling back to basic interactive mode...")
    
    client = get_meijer_client()
    
    if RICH_AVAILABLE:
        # Rich-based interactive mode
        console = Console()
        
        while True:
            console.clear()
            console.print(Panel.fit("🛒 Meijer Shopping List - Interactive Mode", style="bold blue"))
            
            # Show current list
            items = client.list.get()
            if items:
                table = Table(title="Current Shopping List")
                table.add_column("#", style="cyan", no_wrap=True)
                table.add_column("Item", style="magenta")
                table.add_column("Qty", style="green")
                table.add_column("Status", style="yellow")
                table.add_column("Notes", style="dim")
                
                for i, item in enumerate(items, 1):
                    status = "✅ Done" if item.checked else "⏳ Pending"
                    notes = item.notes[:30] + "..." if item.notes and len(item.notes) > 30 else item.notes or ""
                    table.add_row(str(i), item.name, str(item.quantity), status, notes)
                
                console.print(table)
            else:
                console.print("📝 Shopping list is empty", style="dim")
            
            # Show menu
            console.print("\n[bold]Actions:[/bold]")
            console.print("1. Add item")
            console.print("2. Mark item complete/incomplete")
            console.print("3. Delete item")
            console.print("4. Add from favorites")
            console.print("5. Defrag list")
            console.print("6. Refresh")
            console.print("0. Exit")
            
            choice = Prompt.ask("\n[bold cyan]Choose action[/bold cyan]", choices=["0", "1", "2", "3", "4", "5", "6"])
            
            if choice == "0":
                break
            elif choice == "1":
                item_name = Prompt.ask("Enter item name")
                quantity = int(Prompt.ask("Quantity", default="1"))
                notes = Prompt.ask("Notes (optional)")
                
                success = client.list.add_item_with_details(
                    upc=f"ITEM_{hash(item_name) % 10000}",
                    description=item_name,
                    quantity=quantity,
                    notes=notes
                )
                
                if success:
                    console.print(f"✅ Added '{item_name}'", style="green")
                else:
                    console.print(f"❌ Failed to add '{item_name}'", style="red")
                
                Prompt.ask("Press Enter to continue")
                
            elif choice == "2":
                if not items:
                    console.print("📝 No items to modify", style="dim")
                    Prompt.ask("Press Enter to continue")
                    continue
                
                item_num = int(Prompt.ask("Enter item number", choices=[str(i) for i in range(1, len(items) + 1)]))
                item = items[item_num - 1]
                
                if item.checked:
                    success = client.list.uncomplete_item(str(item.listItemId))
                    action = "uncompleted"
                else:
                    success = client.list.complete_item(str(item.listItemId))
                    action = "completed"
                
                if success:
                    console.print(f"✅ Marked '{item.name}' as {action}", style="green")
                else:
                    console.print(f"❌ Failed to modify '{item.name}'", style="red")
                
                Prompt.ask("Press Enter to continue")
                
            elif choice == "3":
                if not items:
                    console.print("📝 No items to delete", style="dim")
                    Prompt.ask("Press Enter to continue")
                    continue
                
                item_num = int(Prompt.ask("Enter item number", choices=[str(i) for i in range(1, len(items) + 1)]))
                item = items[item_num - 1]
                
                if Confirm.ask(f"Delete '{item.name}'?"):
                    success = client.list.delete_item(str(item.listItemId))
                    if success:
                        console.print(f"✅ Deleted '{item.name}'", style="green")
                    else:
                        console.print(f"❌ Failed to delete '{item.name}'", style="red")
                
                Prompt.ask("Press Enter to continue")
                
            elif choice == "4":
                favorites = client.list.get_favorites()
                if not favorites:
                    console.print("📝 No favorite items found", style="dim")
                    Prompt.ask("Press Enter to continue")
                    continue
                
                # Show favorites table
                fav_table = Table(title="Favorites")
                fav_table.add_column("#", style="cyan", no_wrap=True)
                fav_table.add_column("Favorite Item", style="magenta")
                fav_table.add_column("Status", style="yellow")
                
                for i, fav in enumerate(favorites, 1):
                    status = "✅ In List" if fav.isItemInActiveList else "⭕ Not in List"
                    fav_table.add_row(str(i), fav.name, status)
                
                console.print(fav_table)
                
                item_num = int(Prompt.ask("Enter favorite number to add", choices=[str(i) for i in range(1, len(favorites) + 1)]))
                favorite = favorites[item_num - 1]
                
                success = client.list.add_item_with_details(
                    upc=favorite.itemPartNumber or f"FAV_{favorite.listItemId}",
                    description=favorite.name,
                    quantity=1
                )
                
                if success:
                    console.print(f"✅ Added favorite '{favorite.name}'", style="green")
                else:
                    console.print(f"❌ Failed to add favorite '{favorite.name}'", style="red")
                
                Prompt.ask("Press Enter to continue")
                
            elif choice == "5":
                if Confirm.ask("Defrag shopping list? This will reorganize by aisle."):
                    # Ask for defrag options
                    reverse = Confirm.ask("Use reverse sorting (descending order)?")
                    zig = Confirm.ask("Use zig-zag B aisle sorting (B1 ascending, B2 descending, etc.)?")
                    
                    click.echo("🔧 Starting defrag...")
                    if reverse:
                        click.echo("🔄 Using reverse sorting (descending order)")
                    if zig:
                        click.echo("🔄 Using zig-zag B aisle sorting (B1 ascending, B2 descending, etc.)")
                    
                    success = client.list.defrag(reverse=reverse, zig=zig)
                    if success:
                        console.print("✅ Defrag completed!", style="green")
                    else:
                        console.print("❌ Defrag failed!", style="red")
                
                Prompt.ask("Press Enter to continue")
                
            elif choice == "6":
                # Just refresh the display
                continue
        
        console.print("👋 Goodbye!", style="bold green")
        
    else:
        # Basic interactive mode (fallback)
        click.echo("🛒 Meijer Shopping List - Basic Interactive Mode")
        click.echo("📝 Rich library not available. Install with: pip install rich")
        click.echo("💡 Use individual commands for better functionality:")
        click.echo("   meijer list show")
        click.echo("   meijer list add <item>")
        click.echo("   meijer list defrag")


def extract_tokens_from_mitmproxy_log(log_file: str) -> Optional[dict]:
    """Extract tokens using proper mitmproxy tools."""
    try:
        with open(log_file, "rb") as f:
            reader = FlowReader(f)
            
            for flow in reader.stream():
                if (flow.response and 
                    hasattr(flow.request, 'url') and
                    "id.meijer.com/oauth2/default/v1/token" in flow.request.url and
                    flow.response.status_code == 200 and
                    flow.response.content):
                    
                    try:
                        response_data = json.loads(flow.response.content.decode('utf-8'))
                        
                        if all(key in response_data for key in ['access_token', 'refresh_token', 'id_token']):
                            return {
                                'access_token': response_data['access_token'],
                                'refresh_token': response_data['refresh_token'],
                                'id_token': response_data['id_token'],
                                'expires_in': response_data.get('expires_in', 28800),
                                'token_type': response_data.get('token_type', 'Bearer'),
                                'scope': response_data.get('scope', '')
                            }
                    except (json.JSONDecodeError, UnicodeDecodeError):
                        continue
                        
    except Exception:
        pass
    
    return None


def extract_tokens_with_regex(log_file: str) -> Optional[dict]:
    """Fallback method using regex parsing."""
    try:
        meijer_requests = []
        
        with open(log_file, 'r', encoding='utf-8', errors='ignore') as f:
            for line_num, line in enumerate(f, 1):
                try:
                    if 'meijer.com' not in line.lower() and 'meijer' not in line.lower():
                        continue
                    
                    # Extract timestamp if available
                    timestamp = None
                    timestamp_match = re.search(r'(\d{10,13})', line)
                    if timestamp_match:
                        timestamp_str = timestamp_match.group(1)
                        try:
                            timestamp = int(timestamp_str)
                            if timestamp > 9999999999:
                                timestamp = timestamp / 1000
                        except (ValueError, TypeError):
                            continue
                    
                    # Look for Bearer token
                    bearer_match = re.search(r'Bearer\s+([A-Za-z0-9\-._~+/]+=*)', line)
                    if bearer_match:
                        bearer_token = bearer_match.group(1)
                        
                        meijer_requests.append({
                            'line': line_num,
                            'timestamp': timestamp or 0,
                            'token': bearer_token,
                            'content': line[:200] + '...' if len(line) > 200 else line
                        })
                        
                except Exception:
                    continue
        
        if not meijer_requests:
            return None
        
        # Sort by timestamp and get the most recent
        meijer_requests.sort(key=lambda x: x['timestamp'], reverse=True)
        latest_request = meijer_requests[0]
        
        return {
            'access_token': latest_request['token'],
            'refresh_token': '',  # Not available with regex method
            'id_token': '',       # Not available with regex method
            'expires_in': 28800,  # Default
            'token_type': 'Bearer',
            'scope': ''
        }
        
    except Exception:
        return None


@cli.command()
@click.argument("log_file", type=click.Path(exists=True))
def auth(log_file: str):
    """Extract authentication tokens from mitmproxy log and save to ~/.config/meijer.txt."""
    try:
        click.echo(f"🔍 Analyzing mitmproxy log: {log_file}")
        click.echo("⏳ This may take a moment for large log files...")
        
        # Try to use mitmproxy tools first
        tokens = None
        try:
            from mitmproxy.io import FlowReader
            tokens = extract_tokens_from_mitmproxy_log(log_file)
            if tokens:
                click.echo("✅ Successfully extracted tokens using mitmproxy tools")
        except ImportError:
            click.echo("⚠️  mitmproxy not available, trying regex parsing...")
            tokens = extract_tokens_with_regex(log_file)
        
        # If that fails, try to extract from analysis report
        if not tokens:
            report_file = "meijer_analysis_report.json"
            if Path(report_file).exists():
                click.echo("📋 Trying analysis report...")
                tokens = extract_tokens_from_analysis_report(report_file)
                if tokens:
                    click.echo("✅ Successfully extracted tokens from analysis report")
        
        if not tokens:
            raise click.ClickException("❌ No authentication tokens found in log file")
        
        # Save to ~/.config/meijer.txt
        config_path = os.path.expanduser("~/.config/meijer.txt")
        os.makedirs(os.path.dirname(config_path), exist_ok=True)
        
        config = {
            **tokens,
            "updated_at": datetime.now().isoformat(),
            "source": f"Extracted from {log_file}",
            "extracted_at": datetime.now().isoformat()
        }
        
        with open(config_path, 'w') as f:
            json.dump(config, f, indent=2)
        
        click.echo(f"💾 Tokens saved to {config_path}")
        click.echo("✅ Authentication file updated successfully!")
        click.echo(f"🔑 Access token: {tokens['access_token'][:50]}...")
        click.echo(f"🔄 Refresh token: {tokens['refresh_token']}")
        click.echo(f"⏰ Expires in: {tokens['expires_in']} seconds")
        
    except Exception as e:
        raise click.ClickException(f"❌ Failed to extract authentication: {e}")


@cli.command()
def status():
    """Show authentication and connection status."""
    try:
        client = get_meijer_client()
        
        click.echo("🔐 Authentication Status:")
        click.echo(f"  Status: {client.auth_status.name}")
        click.echo(f"  Method: {client.auth_status}")
        
        # Test API connection
        try:
            items = client.list.get()
            click.echo(f"  API: ✅ Connected ({len(items)} items in list)")
        except Exception as e:
            click.echo(f"  API: ❌ Error: {e}")
            
    except Exception as e:
        click.echo(f"❌ Status check failed: {e}")


@cli.command()
def version():
    """Show version information."""
    click.echo("🛒 Meijer CLI Tool v1.0.0")
    click.echo("📦 Built with Click and Meijer API")
    click.echo("🔧 Enhanced with tabulate for beautiful tables")


def extract_tokens_from_analysis_report(report_file_path: str) -> Optional[dict]:
    """Extract tokens from the analysis report JSON file."""
    try:
        with open(report_file_path, 'r') as f:
            report_data = json.load(f)
        
        # Look for authentication flows with token responses
        for flow in report_data.get('authentication_flows', []):
            if (flow.get('url') == "https://id.meijer.com/oauth2/default/v1/token" and
                flow.get('status_code') == 200 and
                flow.get('response_body')):
                
                try:
                    response_data = json.loads(flow['response_body'])
                    
                    # Check if this contains the tokens we need
                    if all(key in response_data for key in ['access_token', 'refresh_token', 'id_token']):
                        return {
                            'access_token': response_data['access_token'],
                            'refresh_token': response_data['refresh_token'],
                            'id_token': response_data['id_token'],
                            'expires_in': response_data.get('expires_in', 28800),
                            'token_type': response_data.get('token_type', 'Bearer'),
                            'scope': response_data.get('scope', '')
                        }
                except (json.JSONDecodeError, KeyError):
                    continue
                    
    except Exception:
        pass
    
    return None


if __name__ == "__main__":
    cli() 