"""
Search models for Meijer API responses.

This module contains dataclasses for search results and helper functions.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional

from .items import MeijerItem


@dataclass
class SearchResult:
    """Represents a search result from Meijer's product search."""

    total_results: int
    """Total number of results across all pages"""

    results: List[MeijerItem]
    """List of MeijerItem objects for current page"""

    current_page: int
    """Current page number (1-based)"""

    total_pages: int
    """Total number of pages available"""

    query: str
    """Original search query string"""

    filters: Dict[str, Any] = field(default_factory=dict)
    """Applied search filters and their values"""

    sort_by: str = "relevance"
    """Current sort order for results"""

    raw_data: Optional[Dict[str, Any]] = None
    """Raw API response data"""

    def __len__(self) -> int:
        """
        Get the number of results on the current page.

        Returns
        -------
        int
            Number of results on current page
        """
        return len(self.results)

    def __getitem__(self, key):
        """
        Allow indexing into the results list.

        Parameters
        ----------
        key : int or slice
            Index or slice to access results

        Returns
        -------
        MeijerItem or List[MeijerItem]
            Item(s) at the specified index(es)
        """
        return self.results[key]

    @property
    def has_results(self) -> bool:
        """
        Check if there are any search results.

        Returns
        -------
        bool
            True if there are results, False otherwise
        """
        return len(self.results) > 0

    @property
    def has_next_page(self) -> bool:
        """
        Check if there is a next page available.

        Returns
        -------
        bool
            True if next page exists, False otherwise
        """
        return self.current_page < self.total_pages

    @property
    def results_per_page(self) -> int:
        """
        Get the number of results per page.

        Returns
        -------
        int
            Number of results per page
        """
        return len(self.results)

    def next_page(self) -> Optional["SearchResult"]:
        """
        Get the next page of results.

        Returns
        -------
        SearchResult, optional
            Next page results or None if no next page
        """
        if not self.has_next_page:
            return None

        # This is a placeholder - in a real implementation, you would make
        # another API call to get the next page
        # For now, return None to indicate no more pages
        return None

    def iter_all_pages(self):
        """
        Iterator that yields all items across all pages.

        Yields
        ------
        MeijerItem
            Individual items from all pages
        """
        # Start with current page
        current_page = self

        while current_page:
            # Yield all items from current page
            for item in current_page.results:
                yield item

            # Get next page
            current_page = current_page.next_page()

    def get_page(self, page_number: int) -> Optional["SearchResult"]:
        """
        Get a specific page of results.

        Parameters
        ----------
        page_number : int
            Page number to retrieve (1-based)

        Returns
        -------
        SearchResult, optional
            Results for the specified page or None if page doesn't exist
        """
        if page_number < 1 or page_number > self.total_pages:
            return None

        # This is a placeholder - in a real implementation, you would make
        # another API call to get the specific page
        # For now, return None to indicate this functionality needs implementation
        return None

    @property
    def is_last_page(self) -> bool:
        """
        Check if this is the last page of results.

        Returns
        -------
        bool
            True if on last page, False otherwise
        """
        return self.current_page >= self.total_pages

    @property
    def first_page(self) -> bool:
        """
        Check if this is the first page of results.

        Returns
        -------
        bool
            True if on first page, False otherwise
        """
        return self.current_page == 1

    @property
    def has_multiple_pages(self) -> bool:
        """
        Check if there are multiple pages of results.

        Returns
        -------
        bool
            True if multiple pages exist, False otherwise
        """
        return self.total_pages > 1

    @property
    def next_page_number(self) -> Optional[int]:
        """
        Get the next page number, or None if on last page.

        Returns
        -------
        int, optional
            Next page number or None if on last page
        """
        if self.is_last_page:
            return None
        return self.current_page + 1

    @property
    def previous_page_number(self) -> Optional[int]:
        """
        Get the previous page number, or None if on first page.

        Returns
        -------
        int, optional
            Previous page number or None if on first page
        """
        if self.first_page:
            return None
        return self.current_page - 1

    @property
    def results_count(self) -> int:
        """
        Get the number of results on the current page.

        Returns
        -------
        int
            Number of results on current page
        """
        return len(self.results)

    @property
    def has_filters(self) -> bool:
        """
        Check if any filters are applied to the search.

        Returns
        -------
        bool
            True if filters are applied, False otherwise
        """
        return len(self.filters) > 0

    @property
    def filter_count(self) -> int:
        """
        Get the number of active filters.

        Returns
        -------
        int
            Number of active filters
        """
        return len(self.filters)

    @property
    def sorted_by_relevance(self) -> bool:
        """
        Check if results are sorted by relevance.

        Returns
        -------
        bool
            True if sorted by relevance, False otherwise
        """
        return self.sort_by.lower() == "relevance"

    @property
    def sorted_by_price(self) -> bool:
        """
        Check if results are sorted by price.

        Returns
        -------
        bool
            True if sorted by price, False otherwise
        """
        return "price" in self.sort_by.lower()

    @property
    def sorted_by_name(self) -> bool:
        """
        Check if results are sorted by name.

        Returns
        -------
        bool
            True if sorted by name, False otherwise
        """
        return "name" in self.sort_by.lower() or "title" in self.sort_by.lower()

    @property
    def sorted_by_popularity(self) -> bool:
        """
        Check if results are sorted by popularity.

        Returns
        -------
        bool
            True if sorted by popularity, False otherwise
        """
        return "popular" in self.sort_by.lower() or "trending" in self.sort_by.lower()

    @property
    def has_price_range(self) -> bool:
        """
        Check if there's a price range filter applied.

        Returns
        -------
        bool
            True if price filter is applied, False otherwise
        """
        return "price" in self.filters or "price_range" in self.filters

    @property
    def has_category_filter(self) -> bool:
        """
        Check if there's a category filter applied.

        Returns
        -------
        bool
            True if category filter is applied, False otherwise
        """
        return "category" in self.filters or "department" in self.filters

    @property
    def has_brand_filter(self) -> bool:
        """
        Check if there's a brand filter applied.

        Returns
        -------
        bool
            True if brand filter is applied, False otherwise
        """
        return "brand" in self.filters

    @property
    def has_availability_filter(self) -> bool:
        """
        Check if there's an availability filter applied.

        Returns
        -------
        bool
            True if availability filter is applied, False otherwise
        """
        return "availability" in self.filters or "in_stock" in self.filters

    @property
    def results_with_prices(self) -> List["MeijerItem"]:
        """
        Get results that have price information.

        Returns
        -------
        List[MeijerItem]
            List of items with price information
        """
        return [item for item in self.results if item.price is not None]

    @property
    def results_on_sale(self) -> List["MeijerItem"]:
        """
        Get results that are currently on sale.

        Returns
        -------
        List[MeijerItem]
            List of items currently on sale
        """
        return [item for item in self.results if item.on_sale]

    @property
    def results_with_images(self) -> List["MeijerItem"]:
        """
        Get results that have images available.

        Returns
        -------
        List[MeijerItem]
            List of items with images
        """
        return [item for item in self.results if item.has_image]

    @property
    def results_in_stock(self) -> List["MeijerItem"]:
        """
        Get results that are currently in stock.

        Returns
        -------
        List[MeijerItem]
            List of items currently in stock
        """
        return [item for item in self.results if item.is_available]

    @property
    def price_range(self) -> tuple[Optional[float], Optional[float]]:
        """
        Get the min and max prices from current results.

        Returns
        -------
        tuple[Optional[float], Optional[float]]
            Tuple of (min_price, max_price) or (None, None) if no prices
        """
        prices = [item.price for item in self.results if item.price is not None]
        if not prices:
            return (None, None)
        return (min(prices), max(prices))

    @property
    def average_price(self) -> Optional[float]:
        """
        Get the average price of current results.

        Returns
        -------
        float, optional
            Average price or None if no prices available
        """
        prices = [item.price for item in self.results if item.price is not None]
        if not prices:
            return None
        return sum(prices) / len(prices)

    @property
    def categories_represented(self) -> List[str]:
        """
        Get unique categories represented in current results.

        Returns
        -------
        List[str]
            List of unique category names
        """
        categories = [item.category for item in self.results if item.category]
        return list(set(categories))

    @property
    def brands_represented(self) -> List[str]:
        """
        Get unique brands represented in current results.

        Returns
        -------
        List[str]
            List of unique brand names
        """
        brands = [item.brand for item in self.results if item.brand]
        return list(set(brands))

    @property
    def search_summary(self) -> str:
        """
        Get a human-readable summary of the search results.

        Returns
        -------
        str
            Human-readable summary string
        """
        if not self.has_results:
            return f"No results found for '{self.query}'"

        if self.has_multiple_pages:
            return f"Found {self.total_results} results for '{self.query}' (page {self.current_page} of {self.total_pages})"
        else:
            return f"Found {self.total_results} results for '{self.query}'"

    @property
    def pagination_info(self) -> str:
        """
        Get pagination information as a string.

        Returns
        -------
        str
            Human-readable pagination information
        """
        if not self.has_multiple_pages:
            return "Single page of results"

        return f"Page {self.current_page} of {self.total_pages} ({self.results_count} results per page)"

    @property
    def sort_description(self) -> str:
        """
        Get a human-readable description of the current sort order.

        Returns
        -------
        str
            Human-readable sort description
        """
        sort_descriptions = {
            "relevance": "Most relevant first",
            "price": "Price: low to high",
            "price_desc": "Price: high to low",
            "name": "Name: A to Z",
            "name_desc": "Name: Z to A",
            "popularity": "Most popular first",
            "newest": "Newest first",
            "rating": "Highest rated first",
        }

        return sort_descriptions.get(self.sort_by.lower(), f"Sorted by: {self.sort_by}")

    @property
    def filter_summary(self) -> str:
        """
        Get a summary of applied filters.

        Returns
        -------
        str
            Human-readable filter summary
        """
        if not self.has_filters:
            return "No filters applied"

        filter_names = list(self.filters.keys())
        if len(filter_names) == 1:
            return f"Filtered by: {filter_names[0]}"
        elif len(filter_names) <= 3:
            return f"Filtered by: {', '.join(filter_names)}"
        else:
            return f"Filtered by {len(filter_names)} criteria"

    def to_dict(self) -> Dict[str, Any]:
        """
        Convert to dictionary for API requests.

        Returns
        -------
        Dict[str, Any]
            Dictionary representation of the search result
        """
        return {
            "totalResults": self.total_results,
            "results": [item.to_dict() for item in self.results],
            "currentPage": self.current_page,
            "totalPages": self.total_pages,
            "query": self.query,
            "filters": self.filters,
            "sortBy": self.sort_by,
        }

    def filter_by_price_range(
        self, min_price: Optional[float] = None, max_price: Optional[float] = None
    ) -> "SearchResult":
        """
        Filter results by price range.

        Args:
            min_price: Minimum price (inclusive)
            max_price: Maximum price (inclusive)

        Returns:
            New SearchResult with filtered results
        """
        filtered_results = []

        for item in self.results:
            if item.price is None:
                continue

            if min_price is not None and item.price < min_price:
                continue
            if max_price is not None and item.price > max_price:
                continue

            filtered_results.append(item)

        return SearchResult(
            total_results=len(filtered_results),
            results=filtered_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=self.sort_by,
            raw_data=self.raw_data,
        )

    def filter_by_category(self, category: str) -> "SearchResult":
        """
        Filter results by category.

        Args:
            category: Category to filter by

        Returns:
            New SearchResult with filtered results
        """
        filtered_results = []
        category_lower = category.lower()

        for item in self.results:
            if (item.category and category_lower in item.category.lower()) or (
                item.subcategory and category_lower in item.subcategory.lower()
            ):
                filtered_results.append(item)

        return SearchResult(
            total_results=len(filtered_results),
            results=filtered_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=self.sort_by,
            raw_data=self.raw_data,
        )

    def filter_by_brand(self, brand: str) -> "SearchResult":
        """
        Filter results by brand.

        Args:
            brand: Brand to filter by

        Returns:
            New SearchResult with filtered results
        """
        filtered_results = []
        brand_lower = brand.lower()

        for item in self.results:
            if item.brand and brand_lower in item.brand.lower():
                filtered_results.append(item)

        return SearchResult(
            total_results=len(filtered_results),
            results=filtered_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=self.sort_by,
            raw_data=self.raw_data,
        )

    def filter_on_sale(self) -> "SearchResult":
        """
        Filter results to show only items on sale.

        Returns:
            New SearchResult with only sale items
        """
        filtered_results = [item for item in self.results if item.on_sale]

        return SearchResult(
            total_results=len(filtered_results),
            results=filtered_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=self.sort_by,
            raw_data=self.raw_data,
        )

    def filter_in_stock(self) -> "SearchResult":
        """
        Filter results to show only items in stock.

        Returns:
            New SearchResult with only in-stock items
        """
        filtered_results = [item for item in self.results if item.is_available]

        return SearchResult(
            total_results=len(filtered_results),
            results=filtered_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=self.sort_by,
            raw_data=self.raw_data,
        )

    def sort_by_price(self, ascending: bool = True) -> "SearchResult":
        """
        Sort results by price.

        Args:
            ascending: True for low to high, False for high to low

        Returns:
            New SearchResult with sorted results
        """
        sorted_results = sorted(
            [item for item in self.results if item.price is not None],
            key=lambda x: x.price,
            reverse=not ascending,
        )

        # Add items without prices at the end
        no_price_items = [item for item in self.results if item.price is None]
        sorted_results.extend(no_price_items)

        return SearchResult(
            total_results=len(sorted_results),
            results=sorted_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=f"price_{'asc' if ascending else 'desc'}",
            raw_data=self.raw_data,
        )

    def sort_by_name(self, ascending: bool = True) -> "SearchResult":
        """
        Sort results by name/title.

        Args:
            ascending: True for A to Z, False for Z to A

        Returns:
            New SearchResult with sorted results
        """
        sorted_results = sorted(
            self.results,
            key=lambda x: x.title.lower() if x.title else "",
            reverse=not ascending,
        )

        return SearchResult(
            total_results=len(sorted_results),
            results=sorted_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=f"name_{'asc' if ascending else 'desc'}",
            raw_data=self.raw_data,
        )

    def sort_by_relevance(self) -> "SearchResult":
        """
        Sort results by relevance score.

        Returns:
            New SearchResult with results sorted by relevance
        """
        sorted_results = sorted(
            self.results, key=lambda x: x.search_relevance_score, reverse=True
        )

        return SearchResult(
            total_results=len(sorted_results),
            results=sorted_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by="relevance",
            raw_data=self.raw_data,
        )

    def get_top_results(self, limit: int) -> "SearchResult":
        """
        Get top N results from current page.

        Args:
            limit: Maximum number of results to return

        Returns:
            New SearchResult with limited results
        """
        limited_results = self.results[:limit]

        return SearchResult(
            total_results=len(limited_results),
            results=limited_results,
            current_page=self.current_page,
            total_pages=self.total_pages,
            query=self.query,
            filters=self.filters,
            sort_by=self.sort_by,
            raw_data=self.raw_data,
        )

    def get_statistics(self) -> Dict[str, Any]:
        """
        Get statistical information about the search results.

        Returns:
            Dictionary containing various statistics
        """
        stats = {
            "total_results": self.total_results,
            "current_page_results": len(self.results),
            "total_pages": self.total_pages,
            "current_page": self.current_page,
            "has_filters": self.has_filters,
            "filter_count": self.filter_count,
            "sort_method": self.sort_by,
        }

        if self.results:
            # Price statistics
            prices = [item.price for item in self.results if item.price is not None]
            if prices:
                stats["price_stats"] = {
                    "min_price": min(prices),
                    "max_price": max(prices),
                    "avg_price": sum(prices) / len(prices),
                    "price_range": max(prices) - min(prices),
                }

            # Availability statistics
            stats["availability_stats"] = {
                "in_stock": len([item for item in self.results if item.is_available]),
                "out_of_stock": len(
                    [item for item in self.results if not item.is_available]
                ),
                "on_sale": len([item for item in self.results if item.on_sale]),
            }

            # Content statistics
            stats["content_stats"] = {
                "with_images": len([item for item in self.results if item.has_image]),
                "with_descriptions": len(
                    [item for item in self.results if item.description]
                ),
                "with_brands": len([item for item in self.results if item.brand]),
            }

            # Category distribution
            categories = {}
            for item in self.results:
                if item.category:
                    categories[item.category] = categories.get(item.category, 0) + 1
            stats["category_distribution"] = categories

            # Brand distribution
            brands = {}
            for item in self.results:
                if item.brand:
                    brands[item.brand] = brands.get(item.brand, 0) + 1
            stats["brand_distribution"] = brands

        return stats

    def export_to_csv(self, filename: str) -> None:
        """
        Export search results to CSV file.

        Args:
            filename: Output CSV filename
        """
        import csv

        if not self.results:
            return

        with open(filename, "w", newline="", encoding="utf-8") as csvfile:
            # Get all possible fields from the first item
            fieldnames = set()
            for item in self.results:
                item_dict = item.to_dict()
                fieldnames.update(item_dict.keys())

            # Convert to sorted list for consistent ordering
            fieldnames = sorted(list(fieldnames))

            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            writer.writeheader()

            for item in self.results:
                item_dict = item.to_dict()
                # Ensure all fields are present (fill missing with empty string)
                row = {field: item_dict.get(field, "") for field in fieldnames}
                writer.writerow(row)

    def export_to_json(self, filename: str) -> None:
        """
        Export search results to JSON file.

        Args:
            filename: Output JSON filename
        """
        import json

        export_data = {
            "query": self.query,
            "total_results": self.total_results,
            "current_page": self.current_page,
            "total_pages": self.total_pages,
            "sort_by": self.sort_by,
            "filters": self.filters,
            "results": [item.to_dict() for item in self.results],
            "statistics": self.get_statistics(),
        }

        with open(filename, "w", encoding="utf-8") as jsonfile:
            json.dump(export_data, jsonfile, indent=2, ensure_ascii=False)


def create_meijer_items_from_search(
    search_data: Dict[str, Any], client: Optional[Any] = None
) -> List[MeijerItem]:
    """
    Create a list of MeijerItem objects from Constructor.io search response.

    Parameters
    ----------
    search_data : Dict[str, Any]
        Raw search response data from Constructor.io
    client : Any, optional
        Meijer client for additional operations

    Returns
    -------
    List[MeijerItem]
        List of MeijerItem instances
    """
    items = []

    try:
        # Extract results from different possible response formats
        results = search_data.get("results", [])
        if not results:
            # Try alternative field names
            results = search_data.get("response", {}).get("results", [])

        for item_data in results:
            try:
                item = MeijerItem.from_constructor_response(item_data, client)
                items.append(item)
            except Exception as e:
                # Log error but continue processing other items
                import logging

                logger = logging.getLogger(__name__)
                logger.warning(f"Failed to create MeijerItem from data: {e}")
                continue

    except Exception as e:
        import logging

        logger = logging.getLogger(__name__)
        logger.error(f"Error processing search response: {e}")

    return items
