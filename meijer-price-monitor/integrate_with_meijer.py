#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Integration script for using standalone price monitor with core Meijer API
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: price_monitor package, meijer package
 */

Integration script for using the standalone price monitor with the core Meijer API.

This script demonstrates how to:
1. Initialize the price monitor with an authenticated Meijer client
2. Create and run price monitors
3. Access price history and find deals
"""

import sys
from pathlib import Path
from typing import Optional

# Add the project root to the Python path
project_root = Path(__file__).parent
sys.path.insert(0, str(project_root))

# Try to import the core Meijer API
try:
    # Add the parent directory to find the core Meijer API
    parent_dir = project_root.parent
    sys.path.insert(0, str(parent_dir))
    
    from meijer.client import Meijer
    from meijer.search import Search
    from meijer.stores import MeijerStore
    MEIJER_AVAILABLE = True
    print("✅ Core Meijer API imported successfully")
except ImportError as e:
    MEIJER_AVAILABLE = False
    print(f"⚠️  Core Meijer API not available: {e}")
    print("   The price monitor will use mock data for testing")

from price_monitor.core import PriceMonitor


def create_authenticated_monitor() -> Optional[PriceMonitor]:
    """
    Create a price monitor with an authenticated Meijer client.
    
    Returns
    -------
    Optional[PriceMonitor]
        Initialized price monitor, or None if authentication fails
    """
    if not MEIJER_AVAILABLE:
        print("❌ Cannot create authenticated monitor without core Meijer API")
        return None
    
    try:
        # Initialize Meijer client
        print("🔐 Initializing Meijer client...")
        meijer = Meijer()
        
        # Check authentication
        if not meijer.is_authenticated():
            print("❌ Not authenticated. Please run 'meijer auth log --mode full' first.")
            print("   You can also use the standalone monitor without authentication for testing.")
            return None
        
        print("✅ Meijer client authenticated successfully")
        
        # Create price monitor with authenticated client
        price_monitor = PriceMonitor(meijer_client=meijer)
        print("✅ Price monitor initialized with authenticated Meijer client")
        
        return price_monitor
        
    except Exception as e:
        print(f"❌ Error creating authenticated monitor: {e}")
        return None


def create_standalone_monitor() -> PriceMonitor:
    """
    Create a standalone price monitor for testing.
    
    Returns
    -------
    PriceMonitor
        Initialized price monitor with mock data support
    """
    print("🔧 Creating standalone price monitor for testing...")
    price_monitor = PriceMonitor()
    print("✅ Standalone price monitor created (will use mock data)")
    return price_monitor


def demonstrate_monitor_creation(price_monitor: PriceMonitor) -> None:
    """
    Demonstrate creating and running a price monitor.
    
    Parameters
    ----------
    price_monitor : PriceMonitor
        Initialized price monitor instance
    """
    print("\n" + "="*60)
    print("DEMONSTRATION: Creating and Running a Price Monitor")
    print("="*60)
    
    try:
        # Create a monitor
        print("\n📊 Creating price monitor for 'LEGO Jurassic'...")
        monitor_id = price_monitor.create_monitor(
            name="LEGO_Jurassic_Demo",
            search_query="LEGO Jurassic",
            location="46755",
            radius=50
        )
        print(f"✅ Monitor created with ID: {monitor_id}")
        
        # List monitors
        print("\n📋 Current monitors:")
        monitors = price_monitor.list_monitors()
        for mid, config in monitors.items():
            print(f"  • {config['name']}: {config['search_query']} in {config['location']}")
        
        # Run the monitor
        print(f"\n🔄 Running monitor '{monitor_id}'...")
        results = price_monitor.run_monitor(monitor_id)
        
        print("✅ Monitor completed:")
        print(f"   • Products found: {results['products_found']}")
        print(f"   • Stores scanned: {results['stores_scanned']}")
        print(f"   • Errors: {len(results['errors'])}")
        
        if results['errors']:
            print("\n⚠️  Errors encountered:")
            for error in results['errors']:
                print(f"   • {error}")
        
    except Exception as e:
        print(f"❌ Error during demonstration: {e}")


def demonstrate_deal_finding(price_monitor: PriceMonitor) -> None:
    """
    Demonstrate finding clearance deals.
    
    Parameters
    ----------
    price_monitor : PriceMonitor
        Initialized price monitor instance
    """
    print("\n" + "="*60)
    print("DEMONSTRATION: Finding Clearance Deals")
    print("="*60)
    
    try:
        print("\n🔍 Searching for clearance deals with 20%+ discount...")
        deals = price_monitor.find_clearance_deals(min_discount_percent=20.0)
        
        if deals:
            print(f"✅ Found {len(deals)} clearance deals:")
            for i, deal in enumerate(deals[:5], 1):  # Show first 5
                print(f"   {i}. Product {deal['product_id']} at store {deal['store_id']}")
                print(f"      Price: ${deal['oldest_price']:.2f} → ${deal['current_price']:.2f}")
                print(f"      Discount: {deal['discount_percent']:.1f}% (${deal['price_drop']:.2f} savings)")
                print()
        else:
            print("ℹ️  No clearance deals found yet. Run more monitors to build price history.")
        
    except Exception as e:
        print(f"❌ Error finding deals: {e}")


def main():
    """Main demonstration function."""
    print("🚀 Meijer Price Monitor - Integration Demo")
    print("="*50)
    
    # Try to create authenticated monitor first
    price_monitor = create_authenticated_monitor()
    
    if price_monitor is None:
        print("\n🔄 Falling back to standalone mode...")
        price_monitor = create_standalone_monitor()
    
    # Demonstrate functionality
    demonstrate_monitor_creation(price_monitor)
    demonstrate_deal_finding(price_monitor)
    
    print("\n" + "="*60)
    print("DEMONSTRATION COMPLETE")
    print("="*60)
    print("\nNext steps:")
    print("1. Use 'make init-monitor' to create real monitors")
    print("2. Use 'make cron-setup' for automated monitoring")
    print("3. Check 'make help' for all available commands")
    print("\nHappy price hunting! 🛒💰")


if __name__ == "__main__":
    main()
