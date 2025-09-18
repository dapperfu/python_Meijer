#!/usr/bin/env python3
"""
Real Meijer Price Monitor - Collects actual LEGO prices using Meijer API.

This script:
1. Searches for LEGO products using the Meijer API
2. Adds products to shopping list to get pricing information
3. Stores price data in the database
4. Provides CamelCamelCamel-like functionality for LEGO tracking
"""

import sqlite3
import sys
from datetime import datetime
from pathlib import Path
from typing import Any, Dict, List, Optional

# Add the parent directory to find the core Meijer API
project_root = Path(__file__).parent
parent_dir = project_root.parent
sys.path.insert(0, str(parent_dir))

try:
    from meijer import Meijer
    from meijer.search import Search

    print("✅ Meijer API imported successfully")
except ImportError as e:
    print(f"❌ Import error: {e}")
    sys.exit(1)


class RealPriceMonitor:
    """Real price monitor using Meijer API."""

    def __init__(self, db_path: str = "price_data/prices.db"):
        """Initialize the price monitor."""
        self.db_path = db_path
        self.client = Meijer()
        self.search = Search(self.client)

        # Ensure database exists
        self._ensure_database()

    def _ensure_database(self):
        """Ensure the database and tables exist."""
        Path(self.db_path).parent.mkdir(parents=True, exist_ok=True)

        with sqlite3.connect(self.db_path) as conn:
            cursor = conn.cursor()

            # Create products table
            cursor.execute("""
                CREATE TABLE IF NOT EXISTS products (
                    upc TEXT PRIMARY KEY,
                    name TEXT NOT NULL,
                    brand TEXT,
                    category TEXT,
                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                )
            """)

            # Create stores table
            cursor.execute("""
                CREATE TABLE IF NOT EXISTS stores (
                    store_id TEXT PRIMARY KEY,
                    name TEXT NOT NULL,
                    address TEXT,
                    city TEXT,
                    state TEXT,
                    zip_code TEXT,
                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                )
            """)

            # Create price_records table
            cursor.execute("""
                CREATE TABLE IF NOT EXISTS price_records (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    upc TEXT NOT NULL,
                    store_id TEXT NOT NULL,
                    price REAL,
                    original_price REAL,
                    sale_price REAL,
                    is_clearance BOOLEAN DEFAULT FALSE,
                    is_on_sale BOOLEAN DEFAULT FALSE,
                    availability TEXT DEFAULT 'unknown',
                    aisle TEXT,
                    section TEXT,
                    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    FOREIGN KEY (upc) REFERENCES products (upc),
                    FOREIGN KEY (store_id) REFERENCES stores (store_id),
                    UNIQUE(upc, store_id, timestamp)
                )
            """)

            conn.commit()

    def search_lego_products(
        self, query: str = "LEGO", max_results: int = 20
    ) -> List[Dict[str, Any]]:
        """Search for LEGO products."""
        print(f"🔍 Searching for '{query}' products...")

        try:
            results = self.search.search(query, results_per_page=max_results)

            products = []
            for item in results.results:
                products.append(
                    {
                        "upc": item.upc,
                        "name": item.title,
                        "brand": getattr(item, "brand", None),
                        "category": getattr(item, "category", None),
                    }
                )

            print(f"✅ Found {len(products)} products")
            return products

        except Exception as e:
            print(f"❌ Search failed: {e}")
            return []

    def get_product_price_info(
        self, upc: str, product_name: str
    ) -> Optional[Dict[str, Any]]:
        """Get price information by adding product to shopping list."""
        try:
            # Add to shopping list
            success = self.client.shopping_list.add_item_with_details(
                upc=upc, quantity=1, description=product_name
            )

            if not success:
                return None

            # Get shopping list to find the item
            items = self.client.shopping_list.get()
            for item in items:
                if item.item_part_number == upc:
                    # Get store info
                    stores = self.client.get_stores()
                    store_id = str(stores[0].store_id) if stores else "unknown"
                    store_name = stores[0].name if stores else "Unknown Store"

                    # Get aisle info from product detail
                    aisle = None
                    section = None
                    try:
                        product_detail = self.client.get_product_detail(upc, store_id)
                        if product_detail:
                            aisle = product_detail.aisle_primary
                            section = product_detail.section
                    except Exception:
                        pass

                    return {
                        "upc": upc,
                        "name": item.name,
                        "store_id": store_id,
                        "store_name": store_name,
                        "price": getattr(item, "unit_price", None),
                        "original_price": None,  # Not available from shopping list
                        "sale_price": None,  # Not available from shopping list
                        "is_clearance": False,  # Would need additional logic
                        "is_on_sale": False,  # Would need additional logic
                        "availability": "in_stock",  # Assume in stock if added
                        "aisle": aisle,
                        "section": section,
                        "timestamp": datetime.now(),
                    }

            return None

        except Exception as e:
            print(f"❌ Error getting price for {upc}: {e}")
            return None

    def store_price_record(self, price_info: Dict[str, Any]) -> bool:
        """Store price record in database."""
        try:
            with sqlite3.connect(self.db_path) as conn:
                cursor = conn.cursor()

                # Insert/update product
                cursor.execute(
                    """
                    INSERT OR REPLACE INTO products (upc, name, brand, category, updated_at)
                    VALUES (?, ?, ?, ?, ?)
                """,
                    (
                        price_info["upc"],
                        price_info["name"],
                        price_info.get("brand"),
                        price_info.get("category"),
                        datetime.now(),
                    ),
                )

                # Insert/update store
                cursor.execute(
                    """
                    INSERT OR REPLACE INTO stores (store_id, name, created_at)
                    VALUES (?, ?, ?)
                """,
                    (price_info["store_id"], price_info["store_name"], datetime.now()),
                )

                # Insert price record
                cursor.execute(
                    """
                    INSERT INTO price_records 
                    (upc, store_id, price, original_price, sale_price, is_clearance, 
                     is_on_sale, availability, aisle, section, timestamp)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """,
                    (
                        price_info["upc"],
                        price_info["store_id"],
                        price_info["price"],
                        price_info["original_price"],
                        price_info["sale_price"],
                        price_info["is_clearance"],
                        price_info["is_on_sale"],
                        price_info["availability"],
                        price_info["aisle"],
                        price_info["section"],
                        price_info["timestamp"],
                    ),
                )

                conn.commit()
                return True

        except Exception as e:
            print(f"❌ Error storing price record: {e}")
            return False

    def collect_lego_prices(self, max_products: int = 10) -> Dict[str, Any]:
        """Collect LEGO prices and store in database."""
        print("🚀 Starting LEGO price collection...")

        # Check authentication
        if self.client.auth_status.name != "AUTHENTICATED":
            print(
                "❌ Not authenticated. Please run 'meijer auth log --mode full' first."
            )
            return {"success": False, "error": "Not authenticated"}

        print("✅ Authentication successful")

        # Search for LEGO products
        products = self.search_lego_products("LEGO", max_products)

        if not products:
            return {"success": False, "error": "No products found"}

        # Collect price information
        collected = 0
        failed = 0

        for i, product in enumerate(products, 1):
            print(f"\n📦 Processing {i}/{len(products)}: {product['name']}")

            price_info = self.get_product_price_info(product["upc"], product["name"])

            if price_info:
                if self.store_price_record(price_info):
                    collected += 1
                    print(f"✅ Stored: {price_info['name']} - ${price_info['price']}")
                    if price_info["aisle"]:
                        print(
                            f"   Location: Aisle {price_info['aisle']}, Section {price_info['section']}"
                        )
                else:
                    failed += 1
                    print(f"❌ Failed to store: {product['name']}")
            else:
                failed += 1
                print(f"❌ No price info: {product['name']}")

        return {
            "success": True,
            "collected": collected,
            "failed": failed,
            "total": len(products),
        }

    def get_price_history(self, upc: str) -> List[Dict[str, Any]]:
        """Get price history for a specific product."""
        try:
            with sqlite3.connect(self.db_path) as conn:
                cursor = conn.cursor()
                cursor.execute(
                    """
                    SELECT pr.*, p.name, s.name as store_name
                    FROM price_records pr
                    JOIN products p ON pr.upc = p.upc
                    JOIN stores s ON pr.store_id = s.store_id
                    WHERE pr.upc = ?
                    ORDER BY pr.timestamp DESC
                """,
                    (upc,),
                )

                columns = [desc[0] for desc in cursor.description]
                return [dict(zip(columns, row)) for row in cursor.fetchall()]

        except Exception as e:
            print(f"❌ Error getting price history: {e}")
            return []

    def find_price_drops(
        self, min_discount_percent: float = 20.0
    ) -> List[Dict[str, Any]]:
        """Find products with significant price drops."""
        try:
            with sqlite3.connect(self.db_path) as conn:
                cursor = conn.cursor()
                cursor.execute(
                    """
                    SELECT 
                        pr.upc,
                        p.name,
                        pr.store_id,
                        s.name as store_name,
                        MIN(pr.price) as lowest_price,
                        MAX(pr.price) as highest_price,
                        (MAX(pr.price) - MIN(pr.price)) as price_drop,
                        ((MAX(pr.price) - MIN(pr.price)) / MAX(pr.price) * 100) as discount_percent,
                        COUNT(*) as price_points
                    FROM price_records pr
                    JOIN products p ON pr.upc = p.upc
                    JOIN stores s ON pr.store_id = s.store_id
                    WHERE pr.price IS NOT NULL
                    GROUP BY pr.upc, pr.store_id
                    HAVING discount_percent >= ?
                    ORDER BY discount_percent DESC
                """,
                    (min_discount_percent,),
                )

                columns = [desc[0] for desc in cursor.description]
                return [dict(zip(columns, row)) for row in cursor.fetchall()]

        except Exception as e:
            print(f"❌ Error finding price drops: {e}")
            return []


def main():
    """Main function to demonstrate price monitoring."""
    print("🚀 Real Meijer Price Monitor - LEGO Edition")
    print("=" * 50)

    monitor = RealPriceMonitor()

    # Collect LEGO prices
    result = monitor.collect_lego_prices(max_products=5)

    if result["success"]:
        print("\n✅ Collection complete:")
        print(f"   • Collected: {result['collected']}")
        print(f"   • Failed: {result['failed']}")
        print(f"   • Total: {result['total']}")

        # Show price drops
        print("\n🔍 Looking for price drops (20%+ discount)...")
        drops = monitor.find_price_drops(20.0)

        if drops:
            print(f"✅ Found {len(drops)} products with significant price drops:")
            for drop in drops[:5]:  # Show top 5
                print(f"   • {drop['name']}")
                print(f"     Store: {drop['store_name']}")
                print(
                    f"     Price: ${drop['highest_price']:.2f} → ${drop['lowest_price']:.2f}"
                )
                print(
                    f"     Discount: {drop['discount_percent']:.1f}% (${drop['price_drop']:.2f} savings)"
                )
                print()
        else:
            print(
                "ℹ️  No significant price drops found yet. Run more collections to build history."
            )

    else:
        print(f"❌ Collection failed: {result.get('error', 'Unknown error')}")


if __name__ == "__main__":
    main()
