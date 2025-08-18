"""
Meijer Ad Browser Module

A terminal user interface for browsing Meijer weekly ad items with pagination
and the ability to add/remove items from the shopping list.
"""

import asyncio
import json
import os
import sys
from typing import Any, Dict, List, Optional, Set
from dataclasses import dataclass
from datetime import datetime

try:
    from rich.console import Console
    from rich.table import Table
    from rich.panel import Panel
    from rich.layout import Layout
    from rich.text import Text
    from rich.prompt import Prompt, Confirm
    from rich.align import Align
    from rich import box
except ImportError:
    print("❌ Error: rich library not installed")
    print("Install with: pip install rich")
    sys.exit(1)

from .models import ListItem


@dataclass
class AdItem:
    """Represents an item from the weekly ad."""
    offer_id: str
    name: str
    description: str
    price: str
    original_price: Optional[str]
    savings: Optional[str]
    image_url: Optional[str]
    category: str
    subcategory: str
    is_in_list: bool = False
    list_item_id: Optional[str] = None


class MeijerAdBrowser:
    """Terminal UI for browsing Meijer weekly ad items."""
    
    def __init__(self, meijer_client):
        self.console = Console()
        self.meijer_client = meijer_client
        self.ad_items: List[AdItem] = []
        self.current_page = 0
        self.items_per_page = 10
        self.selected_items: Set[str] = set()
        self.shopping_list_items: Dict[str, ListItem] = {}
        
    def load_weekly_ad_items(self) -> bool:
        """Load weekly ad items from the Meijer API."""
        try:
            self.console.print("🔄 Loading weekly ad items...", style="yellow")
            
            # Get all offers
            offers = self.meijer_client.get_offers(limit=1000)
            
            # Filter for weekly ad items (category "In Ad")
            ad_items = []
            for offer in offers:
                if hasattr(offer, 'categoryID') and offer.categoryID == "20250817inad":
                    ad_item = AdItem(
                        offer_id=str(offer.meijer_offer_id),
                        name=offer.title,
                        description=offer.description,
                        price=getattr(offer, 'price', 'N/A'),
                        original_price=getattr(offer, 'originalPrice', None),
                        savings=getattr(offer, 'savings', None),
                        image_url=offer.image_url,
                        category=getattr(offer, 'categoryName', ''),
                        subcategory=getattr(offer, 'subCategoryName', '')
                    )
                    ad_items.append(ad_item)
            
            self.ad_items = ad_items
            
            if not ad_items:
                self.console.print("⚠️ No weekly ad items found", style="yellow")
                return False
            
            self.console.print(f"✅ Loaded {len(ad_items)} weekly ad items", style="green")
            
            # Load current shopping list to check which items are already added
            self.load_shopping_list_status()
            
            return True
            
        except Exception as e:
            self.console.print(f"❌ Failed to load weekly ad items: {e}", style="red")
            return False
    
    def load_shopping_list_status(self):
        """Load current shopping list to check which ad items are already added."""
        try:
            shopping_list = self.meijer_client.list.get()
            
            # Create a mapping of item names to list items
            self.shopping_list_items = {}
            for item in shopping_list:
                if hasattr(item, 'item_description'):
                    self.shopping_list_items[item.item_description.lower()] = item
            
            # Update ad items with shopping list status
            for ad_item in self.ad_items:
                ad_item.is_in_list = ad_item.name.lower() in self.shopping_list_items
                if ad_item.is_in_list:
                    list_item = self.shopping_list_items[ad_item.name.lower()]
                    ad_item.list_item_id = getattr(list_item, 'list_item_id', None)
                    
        except Exception as e:
            self.console.print(f"⚠️ Could not load shopping list status: {e}", style="yellow")
    
    def get_page_items(self) -> List[AdItem]:
        """Get items for the current page."""
        start_idx = self.current_page * self.items_per_page
        end_idx = start_idx + self.items_per_page
        return self.ad_items[start_idx:end_idx]
    
    def get_total_pages(self) -> int:
        """Get total number of pages."""
        return (len(self.ad_items) + self.items_per_page - 1) // self.items_per_page
    
    def display_header(self):
        """Display the application header."""
        header = Panel(
            Align.center(
                Text("🛒 Meijer Weekly Ad Browser", style="bold blue"),
                vertical="middle"
            ),
            box=box.ROUNDED,
            style="blue"
        )
        self.console.print(header)
        
        # Display summary info
        summary = f"📰 {len(self.ad_items)} items | 📄 Page {self.current_page + 1} of {self.get_total_pages()} | 🛍️ {len([i for i in self.ad_items if i.is_in_list])} in shopping list"
        self.console.print(summary, style="cyan")
        self.console.print()
    
    def display_items_table(self):
        """Display the current page of items in a table."""
        page_items = self.get_page_items()
        
        if not page_items:
            self.console.print("No items to display", style="yellow")
            return
        
        table = Table(
            title=f"Weekly Ad Items - Page {self.current_page + 1}",
            box=box.ROUNDED,
            show_header=True,
            header_style="bold magenta"
        )
        
        # Add columns
        table.add_column("Select", style="cyan", width=8)
        table.add_column("Name", style="white", width=30)
        table.add_column("Price", style="green", width=15)
        table.add_column("Savings", style="red", width=15)
        table.add_column("Category", style="blue", width=15)
        table.add_column("Status", style="yellow", width=12)
        
        # Add rows
        for i, item in enumerate(page_items):
            item_num = self.current_page * self.items_per_page + i + 1
            
            # Selection indicator
            select_indicator = "☑️" if item.offer_id in self.selected_items else "☐"
            
            # Price display
            price_display = item.price
            if item.original_price:
                price_display = f"{item.price} (was {item.original_price})"
            
            # Savings display
            savings_display = item.savings if item.savings else "N/A"
            
            # Status indicator
            status = "✅ In List" if item.is_in_list else "⭕ Add to List"
            
            table.add_row(
                f"{item_num}",
                item.name[:28] + "..." if len(item.name) > 28 else item.name,
                price_display,
                savings_display,
                item.category,
                status
            )
        
        self.console.print(table)
        self.console.print()
    
    def display_navigation(self):
        """Display navigation controls."""
        total_pages = self.get_total_pages()
        
        nav_text = ""
        if total_pages > 1:
            nav_text += f"📄 Page {self.current_page + 1} of {total_pages} | "
        
        nav_text += "Navigation: [n]ext, [p]revious, [g]oto page, [q]uit"
        
        if self.selected_items:
            nav_text += f" | [a]dd {len(self.selected_items)} selected, [c]lear selection"
        
        nav_panel = Panel(
            Align.center(nav_text),
            box=box.ROUNDED,
            style="cyan"
        )
        self.console.print(nav_panel)
        self.console.print()
    
    def display_help(self):
        """Display help information."""
        help_text = """
        [bold]Keyboard Shortcuts:[/bold]
        
        [cyan]Navigation:[/cyan]
        • [n] - Next page
        • [p] - Previous page  
        • [g] - Go to specific page
        • [q] - Quit application
        
        [cyan]Item Selection:[/cyan]
        • [1-{max_items}] - Select/deselect item
        • [a] - Add selected items to shopping list
        • [c] - Clear all selections
        
        [cyan]Other:[/cyan]
        • [h] - Show this help
        • [r] - Refresh data
        • [s] - Show shopping list status
        """.format(max_items=min(self.items_per_page, len(self.get_page_items())))
        
        help_panel = Panel(
            help_text,
            title="Help",
            box=box.ROUNDED,
            style="green"
        )
        self.console.print(help_panel)
    
    def select_item(self, item_number: int):
        """Select or deselect an item."""
        page_items = self.get_page_items()
        
        if 1 <= item_number <= len(page_items):
            item = page_items[item_number - 1]
            
            if item.offer_id in self.selected_items:
                self.selected_items.remove(item.offer_id)
                self.console.print(f"☐ Deselected: {item.name}", style="yellow")
            else:
                self.selected_items.add(item.offer_id)
                self.console.print(f"☑️ Selected: {item.name}", style="green")
        else:
            self.console.print(f"❌ Invalid item number: {item_number}", style="red")
    
    def add_selected_to_shopping_list(self):
        """Add selected items to the shopping list."""
        if not self.selected_items:
            self.console.print("⚠️ No items selected", style="yellow")
            return
        
        selected_items = [item for item in self.ad_items if item.offer_id in self.selected_items]
        
        self.console.print(f"🔄 Adding {len(selected_items)} items to shopping list...", style="yellow")
        
        success_count = 0
        failed_count = 0
        
        for item in selected_items:
            try:
                # Check if item is already in list
                if item.is_in_list:
                    self.console.print(f"⚠️ {item.name} is already in shopping list", style="yellow")
                    continue
                
                # Add item to shopping list
                success = self.meijer_client.list.add_item_with_details(
                    upc=f"AD_{item.offer_id}",
                    description=item.name,
                    quantity=1,
                    notes=f"Weekly Ad: {item.price}"
                )
                
                if success:
                    success_count += 1
                    item.is_in_list = True
                    self.console.print(f"✅ Added: {item.name}", style="green")
                else:
                    failed_count += 1
                    self.console.print(f"❌ Failed to add: {item.name}", style="red")
                    
            except Exception as e:
                failed_count += 1
                self.console.print(f"❌ Error adding {item.name}: {e}", style="red")
        
        # Clear selections after adding
        self.selected_items.clear()
        
        self.console.print(f"\n📊 Results: {success_count} added, {failed_count} failed", style="cyan")
        
        # Refresh shopping list status
        self.load_shopping_list_status()
    
    def remove_from_shopping_list(self, item_name: str):
        """Remove an item from the shopping list."""
        try:
            # Find the item in the shopping list
            list_item = None
            for item in self.meijer_client.list.get():
                if hasattr(item, 'item_description') and item.item_description.lower() == item_name.lower():
                    list_item = item
                    break
            
            if not list_item:
                self.console.print(f"⚠️ {item_name} not found in shopping list", style="yellow")
                return False
            
            # Remove the item
            if self.meijer_client.list.delete_item(str(list_item.list_item_id)):
                self.console.print(f"✅ Removed {item_name} from shopping list", style="green")
                
                # Update local status
                for ad_item in self.ad_items:
                    if ad_item.name.lower() == item_name.lower():
                        ad_item.is_in_list = False
                        ad_item.list_item_id = None
                        break
                
                return True
            else:
                self.console.print(f"❌ Failed to remove {item_name}", style="red")
                return False
                
        except Exception as e:
            self.console.print(f"❌ Error removing {item_name}: {e}", style="red")
            return False
    
    def show_shopping_list_status(self):
        """Show current shopping list status."""
        try:
            shopping_list = self.meijer_client.list.get()
            
            if not shopping_list:
                self.console.print("📝 Shopping list is empty", style="yellow")
                return
            
            table = Table(
                title="Current Shopping List",
                box=box.ROUNDED,
                show_header=True,
                header_style="bold magenta"
            )
            
            table.add_column("Name", style="white", width=40)
            table.add_column("Quantity", style="green", width=10)
            table.add_column("Notes", style="blue", width=30)
            table.add_column("Status", style="yellow", width=10)
            
            for item in shopping_list:
                name = getattr(item, 'item_description', 'Unknown')
                quantity = getattr(item, 'quantity', 1)
                notes = getattr(item, 'notes', '')
                status = "✅" if getattr(item, 'is_complete', False) else "⭕"
                
                table.add_row(
                    name[:38] + "..." if len(name) > 38 else name,
                    str(quantity),
                    notes[:28] + "..." if len(notes) > 28 else notes,
                    status
                )
            
            self.console.print(table)
            
        except Exception as e:
            self.console.print(f"❌ Error loading shopping list: {e}", style="red")
    
    def run(self):
        """Main application loop."""
        self.console.clear()
        
        # Load weekly ad items
        if not self.load_weekly_ad_items():
            return
        
        # Main loop
        while True:
            try:
                self.console.clear()
                
                # Display interface
                self.display_header()
                self.display_items_table()
                self.display_navigation()
                
                # Get user input
                choice = Prompt.ask("Enter choice", choices=["n", "p", "g", "q", "a", "c", "h", "r", "s", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"])
                
                if choice == "q":
                    if Confirm.ask("Are you sure you want to quit?"):
                        break
                        
                elif choice == "n":
                    if self.current_page < self.get_total_pages() - 1:
                        self.current_page += 1
                    else:
                        self.console.print("⚠️ Already on last page", style="yellow")
                        
                elif choice == "p":
                    if self.current_page > 0:
                        self.current_page -= 1
                    else:
                        self.console.print("⚠️ Already on first page", style="yellow")
                        
                elif choice == "g":
                    try:
                        page_num = int(Prompt.ask("Enter page number", default=str(self.current_page + 1)))
                        if 1 <= page_num <= self.get_total_pages():
                            self.current_page = page_num - 1
                        else:
                            self.console.print(f"⚠️ Invalid page number. Must be 1-{self.get_total_pages()}", style="yellow")
                    except ValueError:
                        self.console.print("❌ Invalid page number", style="red")
                        
                elif choice == "a":
                    if self.selected_items:
                        self.add_selected_to_shopping_list()
                        input("Press Enter to continue...")
                    else:
                        self.console.print("⚠️ No items selected", style="yellow")
                        input("Press Enter to continue...")
                        
                elif choice == "c":
                    self.selected_items.clear()
                    self.console.print("🗑️ Cleared all selections", style="yellow")
                    input("Press Enter to continue...")
                    
                elif choice == "h":
                    self.display_help()
                    input("Press Enter to continue...")
                    
                elif choice == "r":
                    self.load_weekly_ad_items()
                    self.console.print("🔄 Data refreshed", style="green")
                    input("Press Enter to continue...")
                    
                elif choice == "s":
                    self.show_shopping_list_status()
                    input("Press Enter to continue...")
                    
                elif choice.isdigit():
                    item_num = int(choice)
                    self.select_item(item_num)
                    input("Press Enter to continue...")
                    
            except KeyboardInterrupt:
                if Confirm.ask("\nAre you sure you want to quit?"):
                    break
            except Exception as e:
                self.console.print(f"❌ Error: {e}", style="red")
                input("Press Enter to continue...")
        
        self.console.print("👋 Goodbye!", style="green")


def browse_weekly_ad(meijer_client):
    """Main function to start the weekly ad browser."""
    try:
        browser = MeijerAdBrowser(meijer_client)
        browser.run()
    except KeyboardInterrupt:
        print("\n👋 Goodbye!")
    except Exception as e:
        print(f"❌ Fatal error: {e}")
        sys.exit(1)
