#!/usr/bin/env python3
"""
Test script for real Meijer API integration.
"""

import sys
from pathlib import Path

# Add the current directory to Python path
sys.path.insert(0, str(Path(__file__).parent))

try:
    from meijer.auth import load_auth_from_config_file
    from meijer.client import Meijer
    from price_monitor.core import PriceMonitor
    
    print("✅ All imports successful")
    
    # Load authenticated client
    print("🔐 Loading authenticated Meijer client...")
    auth = load_auth_from_config_file()
    client = Meijer(auth)
    
    print("✅ Meijer client created successfully")
    
    # Create PriceMonitor with real client
    print("🛒 Creating PriceMonitor with real Meijer client...")
    monitor = PriceMonitor(meijer_client=client)
    
    print("✅ PriceMonitor created successfully")
    
    # Test getting available stores
    print("🏪 Getting available stores...")
    stores = monitor.search_engine._get_available_stores()
    print(f"✅ Found {len(stores)} stores: {stores[:5]}...")
    
    # Test search functionality
    print("🔍 Testing search functionality...")
    from price_monitor.search_engine import SearchQuery
    query = SearchQuery(query_text="LEGO", max_results=10)
    search_results = monitor.search_products_enhanced(query)
    print(f"✅ Search successful, found {len(search_results)} products")
    
    print("🎉 All tests passed! Real Meijer API integration is working.")
    
except Exception as e:
    print(f"❌ Error: {e}")
    import traceback
    traceback.print_exc()
    sys.exit(1)
