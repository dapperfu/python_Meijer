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
    results: List[MeijerItem]
    current_page: int
    total_pages: int
    query: str
    filters: Dict[str, Any] = field(default_factory=dict)
    sort_by: str = "relevance"
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def has_results(self) -> bool:
        """Check if there are any search results."""
        return len(self.results) > 0

    @property
    def is_last_page(self) -> bool:
        """Check if this is the last page of results."""
        return self.current_page >= self.total_pages

    @property
    def first_page(self) -> bool:
        """Check if this is the first page of results."""
        return self.current_page == 1

    @property
    def has_multiple_pages(self) -> bool:
        """Check if there are multiple pages of results."""
        return self.total_pages > 1

    @property
    def next_page_number(self) -> Optional[int]:
        """Get the next page number, or None if on last page."""
        if self.is_last_page:
            return None
        return self.current_page + 1

    @property
    def previous_page_number(self) -> Optional[int]:
        """Get the previous page number, or None if on first page."""
        if self.first_page:
            return None
        return self.current_page - 1

    @property
    def results_count(self) -> int:
        """Get the number of results on the current page."""
        return len(self.results)

    @property
    def has_filters(self) -> bool:
        """Check if any filters are applied to the search."""
        return len(self.filters) > 0

    @property
    def filter_count(self) -> int:
        """Get the number of active filters."""
        return len(self.filters)

    @property
    def sorted_by_relevance(self) -> bool:
        """Check if results are sorted by relevance."""
        return self.sort_by.lower() == "relevance"

    @property
    def sorted_by_price(self) -> bool:
        """Check if results are sorted by price."""
        return "price" in self.sort_by.lower()

    @property
    def sorted_by_name(self) -> bool:
        """Check if results are sorted by name."""
        return "name" in self.sort_by.lower() or "title" in self.sort_by.lower()

    @property
    def sorted_by_popularity(self) -> bool:
        """Check if results are sorted by popularity."""
        return "popular" in self.sort_by.lower() or "trending" in self.sort_by.lower()

    @property
    def has_price_range(self) -> bool:
        """Check if there's a price range filter applied."""
        return "price" in self.filters or "price_range" in self.filters

    @property
    def has_category_filter(self) -> bool:
        """Check if there's a category filter applied."""
        return "category" in self.filters or "department" in self.filters

    @property
    def has_brand_filter(self) -> bool:
        """Check if there's a brand filter applied."""
        return "brand" in self.filters

    @property
    def has_availability_filter(self) -> bool:
        """Check if there's an availability filter applied."""
        return "availability" in self.filters or "in_stock" in self.filters

    @property
    def results_with_prices(self) -> List["MeijerItem"]:
        """Get results that have price information."""
        return [item for item in self.results if item.price is not None]

    @property
    def results_on_sale(self) -> List["MeijerItem"]:
        """Get results that are currently on sale."""
        return [item for item in self.results if item.on_sale]

    @property
    def results_with_images(self) -> List["MeijerItem"]:
        """Get results that have images available."""
        return [item for item in self.results if item.has_image]

    @property
    def results_in_stock(self) -> List["MeijerItem"]:
        """Get results that are currently in stock."""
        return [item for item in self.results if item.is_available]

    @property
    def price_range(self) -> tuple[Optional[float], Optional[float]]:
        """Get the min and max prices from current results."""
        prices = [item.price for item in self.results if item.price is not None]
        if not prices:
            return (None, None)
        return (min(prices), max(prices))

    @property
    def average_price(self) -> Optional[float]:
        """Get the average price of current results."""
        prices = [item.price for item in self.results if item.price is not None]
        if not prices:
            return None
        return sum(prices) / len(prices)

    @property
    def categories_represented(self) -> List[str]:
        """Get unique categories represented in current results."""
        categories = [item.category for item in self.results if item.category]
        return list(set(categories))

    @property
    def brands_represented(self) -> List[str]:
        """Get unique brands represented in current results."""
        brands = [item.brand for item in self.results if item.brand]
        return list(set(brands))

    @property
    def search_summary(self) -> str:
        """Get a human-readable summary of the search results."""
        if not self.has_results:
            return f"No results found for '{self.query}'"

        if self.has_multiple_pages:
            return f"Found {self.total_results} results for '{self.query}' (page {self.current_page} of {self.total_pages})"
        else:
            return f"Found {self.total_results} results for '{self.query}'"

    @property
    def pagination_info(self) -> str:
        """Get pagination information as a string."""
        if not self.has_multiple_pages:
            return "Single page of results"

        return f"Page {self.current_page} of {self.total_pages} ({self.results_count} results per page)"

    @property
    def sort_description(self) -> str:
        """Get a human-readable description of the current sort order."""
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
        """Get a summary of applied filters."""
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
        """Convert to dictionary for API requests."""
        return {
            "totalResults": self.total_results,
            "results": [item.to_dict() for item in self.results],
            "currentPage": self.current_page,
            "totalPages": self.total_pages,
            "query": self.query,
            "filters": self.filters,
            "sortBy": self.sort_by,
        }


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
