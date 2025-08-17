#!/usr/bin/env python3
"""
Demo script showcasing pagination functionality for Meijer Constructor.io search.

This demonstrates how to use the paginated search results to get 30 results,
then 30 more, and navigate through multiple pages efficiently.

Usage:
    python demo_pagination.py
"""

import sys
from typing import List, Dict, Any

from meijer_search import MeijerSearch, MeijerSearchResults, MeijerWithSearch
from meijer_item import MeijerItem


class MeijerPaginationDemo:
    """
    Demo class showcasing pagination functionality.
    
    Demonstrates various pagination patterns and efficient result navigation
    using the Constructor.io search backend.
    """
    
    def __init__(self):
        self.search = MeijerSearch()
        
        print("🔍 Meijer Pagination Demo - Constructor.io Backend")
        print("=" * 70)
        print(f"🔧 Configuration:")
        print(f"   API: {self.search.base_url}")
        print(f"   Default Page Size: {self.search.default_params['num_results_per_page']} items")
        print()
    
    def demo_basic_pagination(self):
        """Demonstrate basic pagination navigation."""
        print("📋 Demo 1: Basic Pagination Navigation")
        print("-" * 50)
        
        # Search for a popular term that should have many results
        query = "milk"
        print(f"🔍 Searching for '{query}' (first page)...")
        
        # Get first page
        results = self._simulate_paginated_search(query, page=1)
        self._print_results_summary(results)
        
        if results.has_next_page:
            print(f"\n➡️  Getting next page...")
            next_results = results.next_page()
            if next_results:
                self._print_results_summary(next_results)
                
                # Try getting another page
                if next_results.has_next_page:
                    print(f"\n➡️  Getting page 3...")
                    page3_results = next_results.next_page()
                    if page3_results:
                        self._print_results_summary(page3_results)
                        
                        # Navigate back
                        print(f"\n⬅️  Going back to page 2...")
                        back_to_page2 = page3_results.prev_page()
                        if back_to_page2:
                            self._print_results_summary(back_to_page2)
        
        print()
    
    def demo_specific_page_access(self):
        """Demonstrate direct page access."""
        print("📋 Demo 2: Direct Page Access")
        print("-" * 50)
        
        query = "lego"
        print(f"🔍 Searching for '{query}' (first page)...")
        
        results = self._simulate_paginated_search(query, page=1)
        self._print_results_summary(results)
        
        # Jump to specific pages
        if results.total_pages > 1:
            target_page = min(3, results.total_pages)
            print(f"\n🎯 Jumping directly to page {target_page}...")
            page_results = results.get_page(target_page)
            if page_results:
                self._print_results_summary(page_results)
        
        print()
    
    def demo_all_results_collection(self):
        """Demonstrate collecting all results across pages."""
        print("📋 Demo 3: Collecting All Results")
        print("-" * 50)
        
        query = "bread"
        print(f"🔍 Getting ALL results for '{query}'...")
        
        results = self._simulate_paginated_search(query, page=1)
        print(f"📊 Found {results.total_results} total results across {results.total_pages} pages")
        
        # Method 1: Get all items at once (memory intensive)
        print(f"\n📦 Method 1: get_all_items() - Loading all {results.total_results} items...")
        all_items = self._simulate_get_all_items(results)
        print(f"✅ Loaded {len(all_items)} items total")
        
        # Method 2: Iterate through all pages (memory efficient)
        print(f"\n🔄 Method 2: iter_all_pages() - Streaming through all pages...")
        item_count = 0
        for item in self._simulate_iter_all_pages(results):
            item_count += 1
            if item_count <= 5:  # Show first 5 items
                print(f"   {item_count}. {item.title} - ${item.price:.2f}")
            elif item_count == 6:
                print(f"   ... and {results.total_results - 5} more items")
        
        print(f"✅ Processed {item_count} items total")
        print()
    
    def demo_category_pagination(self):
        """Demonstrate category browse pagination."""
        print("📋 Demo 4: Category Browse Pagination")
        print("-" * 50)
        
        category = "dairy-products"
        print(f"📂 Browsing category '{category}' (first page)...")
        
        # Simulate category browse
        results = self._simulate_category_browse(category, page=1)
        self._print_results_summary(results)
        
        if results.has_next_page:
            print(f"\n➡️  Getting next page of {category}...")
            next_results = results.next_page()
            if next_results:
                self._print_results_summary(next_results)
        
        print()
    
    def demo_filtered_pagination(self):
        """Demonstrate pagination with filters."""
        print("📋 Demo 5: Filtered Search Pagination")
        print("-" * 50)
        
        query = "chicken"
        filters = {"availableInStores": "217"}
        store_id = "217"
        
        print(f"🔍 Searching for '{query}' with filters (Store {store_id})...")
        
        results = self._simulate_filtered_search(query, filters, store_id, page=1)
        self._print_results_summary(results)
        print(f"🔗 Applied filters: {results.filters}")
        
        if results.has_next_page:
            print(f"\n➡️  Getting next page with same filters...")
            next_results = results.next_page()
            if next_results:
                self._print_results_summary(next_results)
                print(f"🔗 Filters preserved: {next_results.filters}")
        
        print()
    
    def demo_pagination_info(self):
        """Demonstrate pagination metadata and utilities."""
        print("📋 Demo 6: Pagination Information & Utilities")
        print("-" * 50)
        
        query = "organic"
        results = self._simulate_paginated_search(query, page=2, results_per_page=15)
        
        print(f"📊 Pagination Details for '{query}':")
        print(f"   Current Page: {results.current_page}")
        print(f"   Total Pages: {results.total_pages}")
        print(f"   Results Per Page: {results.results_per_page}")
        print(f"   Total Results: {results.total_results}")
        print(f"   Items on Page: {len(results)}")
        print(f"   Result Range: {results.start_index}-{results.end_index}")
        print(f"   Has Next Page: {results.has_next_page}")
        print(f"   Has Previous Page: {results.has_prev_page}")
        
        print(f"\n🔍 Results Container Features:")
        print(f"   String Representation: {str(results)}")
        print(f"   Iterable: {len(list(results))} items can be iterated")
        print(f"   Indexable: First item = {results[0].title if results else 'N/A'}")
        
        # Convert to dictionary
        results_dict = results.to_dict()
        print(f"   Dictionary Keys: {list(results_dict.keys())}")
        
        print()
    
    def demo_performance_patterns(self):
        """Demonstrate efficient pagination patterns."""
        print("📋 Demo 7: Performance & Best Practices")
        print("-" * 50)
        
        print("💡 Pagination Best Practices:")
        print("1. Use next_page() / prev_page() for sequential navigation")
        print("2. Use get_page() for random access to specific pages")  
        print("3. Use iter_all_pages() for memory-efficient full traversal")
        print("4. Avoid get_all_items() for large result sets")
        print("5. Store search results object to enable pagination")
        
        print("\n⚡ Performance Examples:")
        
        # Sequential pagination (efficient)
        print("\n✅ Efficient: Sequential page navigation")
        results = self._simulate_paginated_search("vitamins", page=1)
        page_count = 1
        current_results = results
        
        while current_results and page_count <= 3:
            print(f"   Page {page_count}: {len(current_results)} items")
            current_results = current_results.next_page()
            page_count += 1
        
        # Memory-efficient iteration
        print(f"\n✅ Efficient: Streaming iteration")
        results = self._simulate_paginated_search("snacks", page=1)
        item_count = 0
        for item in self._simulate_iter_all_pages(results):
            item_count += 1
            if item_count >= 10:  # Stop after 10 for demo
                break
        print(f"   Processed {item_count} items without loading all into memory")
        
        print("\n❌ Less Efficient: Loading all results at once")
        print("   all_items = results.get_all_items()  # Loads everything into memory")
        
        print()
    
    def _simulate_paginated_search(self, query: str, page: int = 1, 
                                 results_per_page: int = 30) -> MeijerSearchResults:
        """Simulate a paginated search with mock data."""
        # Create mock items for demonstration
        items = []
        total_items = 150  # Simulate 150 total results
        
        # Calculate items for this page
        start_idx = (page - 1) * results_per_page
        end_idx = min(start_idx + results_per_page, total_items)
        
        for i in range(start_idx, end_idx):
            item_data = {
                "value": f"{query.title()} Product {i+1}",
                "data": {
                    "id": f"ITEM_{i+1:04d}",
                    "price": round(2.99 + (i * 0.1), 2),
                    "isBuyable": True,
                    "hasMPerks": i % 3 == 0,
                    "brand": "Generic" if i % 2 == 0 else "Brand Name"
                }
            }
            items.append(MeijerItem.from_constructor_response(item_data))
        
        # Create paginated results
        return MeijerSearchResults(
            items=items,
            query=query,
            current_page=page,
            results_per_page=results_per_page,
            total_results=total_items,
            search_client=self.search,
            filters={},
            store_id=None
        )
    
    def _simulate_category_browse(self, category: str, page: int = 1) -> MeijerSearchResults:
        """Simulate category browse pagination."""
        items = []
        total_items = 85  # Simulate 85 items in category
        results_per_page = 30
        
        start_idx = (page - 1) * results_per_page
        end_idx = min(start_idx + results_per_page, total_items)
        
        for i in range(start_idx, end_idx):
            item_data = {
                "value": f"{category.replace('-', ' ').title()} Item {i+1}",
                "data": {
                    "id": f"CAT_{category.upper()}_{i+1:03d}",
                    "price": round(1.99 + (i * 0.15), 2),
                    "isBuyable": True
                }
            }
            items.append(MeijerItem.from_constructor_response(item_data))
        
        results = MeijerSearchResults(
            items=items,
            query=f"category:{category}",
            current_page=page,
            results_per_page=results_per_page,
            total_results=total_items,
            search_client=self.search,
            filters={},
            store_id=None
        )
        
        # Add collection_id for browse pagination
        results.collection_id = category
        return results
    
    def _simulate_filtered_search(self, query: str, filters: Dict[str, str], 
                                store_id: str, page: int = 1) -> MeijerSearchResults:
        """Simulate filtered search with pagination."""
        items = []
        total_items = 95  # Simulate filtered results
        results_per_page = 30
        
        start_idx = (page - 1) * results_per_page
        end_idx = min(start_idx + results_per_page, total_items)
        
        for i in range(start_idx, end_idx):
            item_data = {
                "value": f"{query.title()} Store {store_id} Item {i+1}",
                "data": {
                    "id": f"STORE_{store_id}_{i+1:03d}",
                    "price": round(3.49 + (i * 0.08), 2),
                    "isBuyable": True,
                    "storeId": store_id
                }
            }
            items.append(MeijerItem.from_constructor_response(item_data))
        
        return MeijerSearchResults(
            items=items,
            query=query,
            current_page=page,
            results_per_page=results_per_page,
            total_results=total_items,
            search_client=self.search,
            filters=filters,
            store_id=store_id
        )
    
    def _simulate_get_all_items(self, results: MeijerSearchResults) -> List[MeijerItem]:
        """Simulate getting all items (would make multiple API calls)."""
        # For demo, just return current items plus some mock additional items
        all_items = results.items.copy()
        
        # Simulate additional pages of items
        for page in range(2, results.total_pages + 1):
            page_results = self._simulate_paginated_search(
                results.query, page, results.results_per_page
            )
            all_items.extend(page_results.items)
        
        return all_items
    
    def _simulate_iter_all_pages(self, results: MeijerSearchResults):
        """Simulate iterating through all pages efficiently."""
        # Yield current page items
        for item in results.items:
            yield item
        
        # Simulate yielding from additional pages
        for page in range(2, results.total_pages + 1):
            page_results = self._simulate_paginated_search(
                results.query, page, results.results_per_page
            )
            for item in page_results.items:
                yield item
    
    def _print_results_summary(self, results: MeijerSearchResults):
        """Print a summary of search results."""
        print(f"📄 Page {results.current_page}/{results.total_pages}: "
              f"{len(results)} items (results {results.start_index}-{results.end_index} "
              f"of {results.total_results} total)")
        
        # Show first few items
        for i, item in enumerate(results[:3], 1):
            print(f"   {i}. {item.title} - ${item.price:.2f}")
        
        if len(results) > 3:
            print(f"   ... and {len(results) - 3} more items on this page")


def main():
    """Run the comprehensive pagination demo."""
    demo = MeijerPaginationDemo()
    
    try:
        # Run all pagination demos
        demo.demo_basic_pagination()
        demo.demo_specific_page_access()
        demo.demo_all_results_collection()
        demo.demo_category_pagination()
        demo.demo_filtered_pagination()
        demo.demo_pagination_info()
        demo.demo_performance_patterns()
        
        print("🎯 Pagination Demo Summary")
        print("=" * 70)
        print("✅ Basic Navigation: next_page(), prev_page()")
        print("✅ Direct Access: get_page(page_number)")
        print("✅ Full Collection: get_all_items(), iter_all_pages()")
        print("✅ Category Browse: Paginated category navigation")
        print("✅ Filtered Search: Pagination preserves filters")
        print("✅ Rich Metadata: Page info, totals, navigation flags")
        print("✅ Performance Patterns: Memory-efficient iteration")
        
        print("\n📚 Usage Examples:")
        print("""
# Basic pagination
results = search.search("milk")                 # Get first page
page2 = results.next_page()                     # Get next page
page1 = page2.prev_page()                       # Go back

# Direct page access  
page5 = results.get_page(5)                     # Jump to page 5

# Iterate all results efficiently
for item in results.iter_all_pages():           # Memory efficient
    print(f"{item.title} - ${item.price}")

# Check pagination status
if results.has_next_page:
    next_results = results.next_page()

# Get all results (use with caution for large sets)
all_items = results.get_all_items()             # Loads everything
        """)
        
        print("\n🚀 Constructor.io Pagination Features:")
        print("- 30 results per page (default), configurable")
        print("- Smart total count estimation from API responses")
        print("- Preserves filters and search parameters across pages")
        print("- Efficient navigation without re-searching")
        print("- Memory-efficient streaming for large result sets")
        print("- Works with both search and category browse")
        print("- Rich pagination metadata and navigation helpers")
        
    except Exception as e:
        print(f"❌ Demo error: {e}")
        return 1
    
    return 0


if __name__ == "__main__":
    exit_code = main()
    sys.exit(exit_code) 