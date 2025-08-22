#!/usr/bin/env python3
"""
Debug script for SearchQuery issue.
"""

import sys
from pathlib import Path

# Add the current directory to Python path
sys.path.insert(0, str(Path(__file__).parent))

try:
    from price_monitor.search_engine import SearchQuery
    
    print("✅ SearchQuery imported successfully")
    
    # Create a SearchQuery
    query = SearchQuery(query_text="LEGO", max_results=10)
    print(f"✅ SearchQuery created: {query}")
    print(f"✅ query.query_text: {query.query_text}")
    print(f"✅ type(query.query_text): {type(query.query_text)}")
    print(f"✅ query.to_dict(): {query.to_dict()}")
    
    # Check if there's a circular reference
    print(f"✅ query.query_text == query: {query.query_text == query}")
    
    # Try to serialize to JSON
    import json
    try:
        json_str = json.dumps(query.to_dict())
        print(f"✅ JSON serialization successful: {json_str}")
    except Exception as e:
        print(f"❌ JSON serialization failed: {e}")
    
    print("🎉 All tests passed!")
    
except Exception as e:
    print(f"❌ Error: {e}")
    import traceback
    traceback.print_exc()
    sys.exit(1)
