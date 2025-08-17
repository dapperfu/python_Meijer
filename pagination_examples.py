#!/usr/bin/env python3
"""
Practical examples of using Meijer Constructor.io pagination.

These examples show real-world usage patterns for getting 30 results,
then 30 more, and efficiently handling large result sets.
"""

from typing import List
from meijer_search import MeijerSearch, MeijerSearchResults
from meijer_item import MeijerItem


def example_basic_pagination():
    """
    Example 1: Basic pagination - get 30 results, then 30 more.
    """
    print("📋 Example 1: Basic Pagination (30 + 30 + 30)")
    print("-" * 50)
    
    search = MeijerSearch()
    
    # Get first 30 results
    print("🔍 Getting first 30 results for 'milk'...")
    results = search.search("milk")
    print(f"✅ Page 1: Got {len(results)} items (showing first 3):")
    for i, item in enumerate(results[:3], 1):
        print(f"   {i}. {item.title} - ${item.price:.2f}")
    
    # Get next 30 results  
    if results.has_next_page:
        print(f"\n🔍 Getting next 30 results...")
        page2 = results.next_page()
        print(f"✅ Page 2: Got {len(page2)} items (showing first 3):")
        for i, item in enumerate(page2[:3], 1):
            print(f"   {i}. {item.title} - ${item.price:.2f}")
        
        # Get another 30 results
        if page2.has_next_page:
            print(f"\n🔍 Getting third set of 30 results...")
            page3 = page2.next_page()
            print(f"✅ Page 3: Got {len(page3)} items (showing first 3):")
            for i, item in enumerate(page3[:3], 1):
                print(f"   {i}. {item.title} - ${item.price:.2f}")
    
    print(f"\n📊 Total available: {results.total_results} items across {results.total_pages} pages")
    print()


def example_collect_first_100_items():
    """
    Example 2: Collect first 100 items efficiently.
    """
    print("📋 Example 2: Collect First 100 Items")
    print("-" * 50)
    
    search = MeijerSearch()
    
    # Search for items
    results = search.search("organic", results_per_page=30)
    collected_items = []
    
    print(f"🎯 Goal: Collect first 100 items from '{results.query}' search")
    print(f"📊 Total available: {results.total_results} items")
    
    # Collect items page by page until we have 100
    current_page = results
    page_num = 1
    
    while current_page and len(collected_items) < 100:
        # Add items from current page
        items_to_add = min(len(current_page), 100 - len(collected_items))
        collected_items.extend(current_page[:items_to_add])
        
        print(f"📄 Page {page_num}: Added {items_to_add} items "
              f"(total: {len(collected_items)}/100)")
        
        # Stop if we have enough items
        if len(collected_items) >= 100:
            break
        
        # Get next page
        current_page = current_page.next_page()
        page_num += 1
    
    print(f"✅ Collected {len(collected_items)} items total")
    print(f"📋 Sample items:")
    for i, item in enumerate(collected_items[:5], 1):
        print(f"   {i}. {item.title} - ${item.price:.2f}")
    print()


def example_search_all_pages():
    """
    Example 3: Search through all pages to find specific items.
    """
    print("📋 Example 3: Search All Pages for Items > $10")
    print("-" * 50)
    
    search = MeijerSearch()
    
    # Search for products
    results = search.search("vitamins", results_per_page=25)
    expensive_items = []
    
    print(f"🔍 Searching all pages for items over $10.00...")
    print(f"📊 Total results to check: {results.total_results} items")
    
    # Use memory-efficient iteration
    items_checked = 0
    for item in results.iter_all_pages():
        items_checked += 1
        
        # Check if item meets our criteria
        if item.price and item.price > 10.00:
            expensive_items.append(item)
        
        # Progress update every 50 items
        if items_checked % 50 == 0:
            print(f"   Checked {items_checked} items, found {len(expensive_items)} over $10")
    
    print(f"✅ Found {len(expensive_items)} items over $10.00 from {items_checked} total items")
    print(f"📋 Expensive items found:")
    for i, item in enumerate(expensive_items[:5], 1):
        print(f"   {i}. {item.title} - ${item.price:.2f}")
    print()


def example_paginated_category_browse():
    """
    Example 4: Browse category with pagination.
    """
    print("📋 Example 4: Browse Category with Pagination")
    print("-" * 50)
    
    search = MeijerSearch()
    
    # Browse a category
    category = "back-to-school-feeding-reading"
    print(f"📂 Browsing category: {category}")
    
    results = search.browse_category(category, results_per_page=20)
    
    print(f"📊 Category has {results.total_results} items across {results.total_pages} pages")
    
    # Show first few pages
    current_page = results
    page_count = 0
    max_pages = 3  # Only show first 3 pages for demo
    
    while current_page and page_count < max_pages:
        page_count += 1
        print(f"\n📄 Page {current_page.current_page}: {len(current_page)} items")
        
        for i, item in enumerate(current_page[:3], 1):
            print(f"   {i}. {item.title} - ${item.price:.2f}")
        
        if len(current_page) > 3:
            print(f"   ... and {len(current_page) - 3} more items")
        
        # Get next page
        current_page = current_page.next_page()
    
    print()


def example_filtered_pagination():
    """
    Example 5: Pagination with store filtering.
    """
    print("📋 Example 5: Store-Filtered Pagination")
    print("-" * 50)
    
    search = MeijerSearch()
    
    # Search with store filter
    store_id = "217"
    print(f"🏪 Searching 'chicken' at store {store_id}")
    
    results = search.search("chicken", store_id=store_id, results_per_page=25)
    
    print(f"📊 Store {store_id} has {results.total_results} chicken products")
    print(f"🔗 Applied filters: {results.filters}")
    
    # Show multiple pages maintaining filters
    pages_to_show = min(3, results.total_pages)
    current_page = results
    
    for page_num in range(1, pages_to_show + 1):
        if current_page:
            print(f"\n📄 Page {page_num} (Store {store_id}): {len(current_page)} items")
            
            for i, item in enumerate(current_page[:2], 1):
                print(f"   {i}. {item.title} - ${item.price:.2f}")
            
            # Verify filters are preserved
            if hasattr(current_page, 'filters') and current_page.filters:
                print(f"   🔗 Filters preserved: {current_page.filters}")
            
            current_page = current_page.next_page()
    
    print()


def example_jump_to_specific_page():
    """
    Example 6: Jump directly to specific pages.
    """
    print("📋 Example 6: Jump to Specific Pages")
    print("-" * 50)
    
    search = MeijerSearch()
    
    # Get initial results
    results = search.search("snacks", results_per_page=20)
    
    print(f"📊 '{results.query}' has {results.total_pages} pages total")
    
    # Jump to different pages
    target_pages = [1, 5, 10, results.total_pages]
    
    for page_num in target_pages:
        if page_num <= results.total_pages:
            print(f"\n🎯 Jumping to page {page_num}...")
            
            page_results = results.get_page(page_num)
            if page_results:
                print(f"📄 Page {page_results.current_page}: {len(page_results)} items "
                      f"(results {page_results.start_index}-{page_results.end_index})")
                
                for i, item in enumerate(page_results[:2], 1):
                    print(f"   {i}. {item.title} - ${item.price:.2f}")
            else:
                print(f"❌ Could not load page {page_num}")
    
    print()


def example_performance_comparison():
    """
    Example 7: Performance comparison of different approaches.
    """
    print("📋 Example 7: Performance Comparison")
    print("-" * 50)
    
    search = MeijerSearch()
    results = search.search("health", results_per_page=30)
    
    print(f"📊 Comparing approaches for {results.total_results} items:")
    
    # Approach 1: Load all at once (memory intensive)
    print(f"\n⚠️  Approach 1: get_all_items() - Memory Intensive")
    print(f"   Would load ALL {results.total_results} items into memory at once")
    print(f"   Memory usage: High ({results.total_results} items)")
    print(f"   API calls: {results.total_pages} calls")
    print(f"   Use case: When you need all data for processing")
    
    # Approach 2: Sequential pagination (moderate)
    print(f"\n✅ Approach 2: next_page() - Sequential Processing")
    print(f"   Process one page ({results.results_per_page} items) at a time")
    print(f"   Memory usage: Low ({results.results_per_page} items)")
    print(f"   API calls: 1 per page (as needed)")
    print(f"   Use case: UI pagination, user browsing")
    
    # Approach 3: Streaming iteration (efficient)
    print(f"\n🚀 Approach 3: iter_all_pages() - Streaming")
    print(f"   Stream through all items without loading in memory")
    print(f"   Memory usage: Minimal (1 item at a time)")
    print(f"   API calls: {results.total_pages} calls (lazy loading)")
    print(f"   Use case: Data processing, filtering, analysis")
    
    print(f"\n💡 Recommendation: Use streaming for large datasets, "
          f"pagination for UI, get_all for small sets")
    print()


def main():
    """Run all pagination examples."""
    print("🔍 Meijer Constructor.io Pagination Examples")
    print("=" * 70)
    print("Practical examples of getting 30 results, then 30 more...")
    print()
    
    try:
        # Run all examples
        example_basic_pagination()
        example_collect_first_100_items()
        example_search_all_pages()
        example_paginated_category_browse()
        example_filtered_pagination()
        example_jump_to_specific_page()
        example_performance_comparison()
        
        print("🎯 Summary: Pagination Patterns")
        print("=" * 70)
        print("✅ Basic: results = search.search('query'); page2 = results.next_page()")
        print("✅ Collection: Collect items across multiple pages efficiently")
        print("✅ Search All: Use iter_all_pages() for memory-efficient processing")
        print("✅ Category: Browse categories with full pagination support")
        print("✅ Filtered: Pagination preserves all filters and parameters")
        print("✅ Random Access: Jump to any page with get_page(page_num)")
        print("✅ Performance: Choose right approach based on use case")
        
        print("\n🔧 Key Pagination Features:")
        print("- Get 30 results per page (configurable)")
        print("- Navigate: next_page(), prev_page(), get_page()")
        print("- Efficient: iter_all_pages() for streaming")
        print("- Complete: get_all_items() for full collection")
        print("- Smart: Preserves filters, parameters, store settings")
        print("- Metadata: Total counts, page info, navigation flags")
        
    except Exception as e:
        print(f"❌ Example error: {e}")
        return 1
    
    return 0


if __name__ == "__main__":
    exit_code = main()
    exit(exit_code) 