#!/usr/bin/env python3
"""
Check for significant price drops in the LEGO price database.
This script is called by the cron job to analyze price trends.
"""

import sys
from pathlib import Path

# Add the current directory to Python path
project_root = Path(__file__).parent
sys.path.insert(0, str(project_root))

from real_price_monitor import RealPriceMonitor


def main():
    """Check for price drops and print results."""
    try:
        # Initialize price monitor
        db_path = project_root / "price_data" / "prices.db"
        monitor = RealPriceMonitor(str(db_path))
        
        # Find products with 20%+ price drops
        drops = monitor.find_price_drops(20.0)
        
        if drops:
            print(f"Found {len(drops)} products with 20%+ price drops:")
            for drop in drops:
                print(f"  - {drop['product_name']}: ${drop['highest_price']} → ${drop['lowest_price']} ({drop['discount_percent']:.1f}% off)")
        else:
            print("No significant price drops found")
            
    except Exception as e:
        print(f"Error checking price drops: {e}")
        sys.exit(1)


if __name__ == "__main__":
    main()


