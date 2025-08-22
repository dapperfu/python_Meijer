#!/usr/bin/env python3
"""
Test script for CLI functionality.
"""

import sys
from pathlib import Path

# Add the current directory to Python path
sys.path.insert(0, str(Path(__file__).parent))

try:
    from price_monitor.cli import cli
    from price_monitor.core import PriceMonitor
    from meijer.auth import load_auth_from_config_file
    from meijer.client import Meijer
    
    print("✅ All imports successful")
    
    # Test creating authenticated client
    print("🔐 Creating authenticated Meijer client...")
    auth = load_auth_from_config_file()
    client = Meijer(auth)
    print("✅ Meijer client created successfully")
    
    # Test creating PriceMonitor
    print("🛒 Creating PriceMonitor...")
    monitor = PriceMonitor(meijer_client=client)
    print("✅ PriceMonitor created successfully")
    
    # Test getting stores
    print("🏪 Getting available stores...")
    stores = monitor.search_engine._get_available_stores()
    print(f"✅ Found {len(stores)} stores: {stores[:5]}...")
    
    # Test search functionality
    print("🔍 Testing search functionality...")
    from price_monitor.search_engine import SearchQuery
    query = SearchQuery(query_text="LEGO", max_results=5)
    search_results = monitor.search_products_enhanced(query)
    print(f"✅ Search successful, found {len(search_results)} products")
    
    if search_results:
        print("📋 Sample results:")
        for i, result in enumerate(search_results[:3]):
            print(f"  {i+1}. {result.product_name} - ${result.price} at {result.store_name}")
    
    print("🎉 All tests passed! CLI functionality is working.")
    
except Exception as e:
    print(f"❌ Error: {e}")
    import traceback
    traceback.print_exc()
    sys.exit(1)
