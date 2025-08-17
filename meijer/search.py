"""
Meijer Product Search
====================

Product search functionality using Constructor.io backend.
"""

from dataclasses import dataclass
from typing import Any, Dict, List, Optional, TYPE_CHECKING

from .exceptions import MeijerAPIError

if TYPE_CHECKING:
    from .client import Meijer


@dataclass
class MeijerItem:
    """Represents a product item from search results."""

    # Core item data
    item_id: str
    title: str
    description: Optional[str] = None

    # Pricing
    price: Optional[float] = None
    formatted_price: Optional[str] = None
    sale_price: Optional[float] = None

    # Product details
    brand: Optional[str] = None
    category: Optional[str] = None
    upc: Optional[str] = None
    sku: Optional[str] = None

    # Images and media
    image_url: Optional[str] = None
    thumbnail_url: Optional[str] = None

    # Availability
    in_stock: bool = True
    store_availability: Optional[Dict[str, bool]] = None

    # Ratings and reviews
    rating: Optional[float] = None
    review_count: int = 0

    # Additional metadata
    size: Optional[str] = None
    weight: Optional[str] = None
    department: Optional[str] = None

    # Location information for store navigation
    aisle: Optional[str] = None
    section: Optional[str] = None
    zone: Optional[str] = None
    zone_code: Optional[str] = None

    @classmethod
    def from_constructor_data(cls, data: Dict[str, Any]) -> "MeijerItem":
        """Create MeijerItem from Constructor.io response data."""
        return cls(
            item_id=data.get("data", {}).get("id", str(data.get("id", ""))),
            title=data.get("value", data.get("title", "Unknown Item")),
            description=data.get("data", {}).get("description"),
            price=data.get("data", {}).get("price"),
            formatted_price=data.get("data", {}).get("formatted_price"),
            brand=data.get("data", {}).get("brand"),
            category=data.get("data", {}).get("category"),
            upc=data.get("data", {}).get("upc"),
            image_url=data.get("data", {}).get("image_url"),
            rating=data.get("data", {}).get("rating"),
            review_count=data.get("data", {}).get("review_count", 0),
            in_stock=data.get("data", {}).get("in_stock", True),
            # Extract location data if available
            aisle=data.get("data", {}).get("aisle"),
            section=data.get("data", {}).get("section"),
            zone=data.get("data", {}).get("zone"),
            zone_code=data.get("data", {}).get("zone_code"),
        )


@dataclass
class MeijerSearchResults:
    """Container for paginated search results."""

    items: List[MeijerItem]
    total_results: int
    current_page: int
    total_pages: int
    results_per_page: int
    query: str

    # Reference to search client for pagination
    _search_client: Optional["MeijerSearch"] = None
    _search_params: Optional[Dict[str, Any]] = None

    def __len__(self) -> int:
        """Return number of items in current page."""
        return len(self.items)

    def __iter__(self):
        """Iterate over items."""
        return iter(self.items)

    def __getitem__(self, index):
        """Get item by index."""
        return self.items[index]

    @property
    def has_next_page(self) -> bool:
        """Check if there's a next page."""
        return self.current_page < self.total_pages

    @property
    def has_prev_page(self) -> bool:
        """Check if there's a previous page."""
        return self.current_page > 1

    def next_page(self) -> Optional["MeijerSearchResults"]:
        """Get next page of results."""
        if not self.has_next_page or not self._search_client:
            return None

        params = self._search_params.copy() if self._search_params else {}
        params["page"] = self.current_page + 1

        return self._search_client.search(self.query, **params)

    def prev_page(self) -> Optional["MeijerSearchResults"]:
        """Get previous page of results."""
        if not self.has_prev_page or not self._search_client:
            return None

        params = self._search_params.copy() if self._search_params else {}
        params["page"] = self.current_page - 1

        return self._search_client.search(self.query, **params)


class MeijerSearch:
    """Product search client using Constructor.io."""

    def __init__(self, meijer_client: "Meijer"):
        """Initialize search client."""
        self.meijer = meijer_client
        self.logger = meijer_client.logger

        # Constructor.io configuration (from APK analysis)
        self.constructor_base_url = "https://ac.cnstrc.com"
        # API key needs to be extracted from actual requests or APK
        self.api_key = (
            "key_GdYuTcnduTUtsZd6"  # Valid key from APK analysis
        )

    def search(
        self,
        query: str,
        results_per_page: int = 24,
        page: int = 1,
        sort_by: str = "relevance",
        **kwargs,
    ) -> MeijerSearchResults:
        """
        Search for products.

        Args:
            query: Search query
            results_per_page: Number of results per page
            page: Page number (1-based)
            sort_by: Sort criteria
            **kwargs: Additional search parameters

        Returns:
            MeijerSearchResults object
        """
        try:
            url = f"{self.constructor_base_url}/search/{query}"

            params = {
                "key": self.api_key,
                "num_results_per_page": results_per_page,  # Changed from results_per_page
                "page": page,
                "sort_by": sort_by,
                "fmt_options[groups_max_depth]": 2,
                "fmt_options[groups_start]": "current",
                **kwargs,
            }

            response = self.meijer._make_request("GET", url, params=params)

            if response.status_code == 200:
                data = response.json()
                return self._parse_search_results(
                    data, query, page, results_per_page, kwargs
                )
            else:
                raise MeijerAPIError(f"Search request failed: {response.status_code}")

        except Exception as e:
            self.logger.error(f"Search failed for query '{query}': {e}")
            return MeijerSearchResults(
                items=[],
                total_results=0,
                current_page=page,
                total_pages=0,
                results_per_page=results_per_page,
                query=query,
            )

    def autocomplete(self, query: str, num_results: int = 10) -> List[str]:
        """
        Get autocomplete suggestions.

        Args:
            query: Partial search query
            num_results: Maximum number of suggestions

        Returns:
            List of suggestion strings
        """
        try:
            url = f"{self.constructor_base_url}/autocomplete/{query}"

            params = {"key": self.api_key, "num_results": num_results}

            response = self.meijer._make_request("GET", url, params=params)

            if response.status_code == 200:
                data = response.json()
                suggestions = []

                for section in data.get("sections", []):
                    for suggestion in section.get("options", []):
                        suggestions.append(suggestion.get("value", ""))

                return suggestions[:num_results]
            else:
                self.logger.warning(
                    f"Autocomplete request failed: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Autocomplete failed for query '{query}': {e}")
            return []

    def browse_category(
        self, category: str, results_per_page: int = 24, page: int = 1, **kwargs
    ) -> MeijerSearchResults:
        """
        Browse products by category.

        Args:
            category: Category name
            results_per_page: Number of results per page
            page: Page number
            **kwargs: Additional parameters

        Returns:
            MeijerSearchResults object
        """
        try:
            url = f"{self.constructor_base_url}/browse/{category}"

            params = {
                "key": self.api_key,
                "results_per_page": results_per_page,
                "page": page,
                **kwargs,
            }

            response = self.meijer._make_request("GET", url, params=params)

            if response.status_code == 200:
                data = response.json()
                return self._parse_search_results(
                    data, f"category:{category}", page, results_per_page, kwargs
                )
            else:
                raise MeijerAPIError(f"Browse request failed: {response.status_code}")

        except Exception as e:
            self.logger.error(f"Browse failed for category '{category}': {e}")
            return MeijerSearchResults(
                items=[],
                total_results=0,
                current_page=page,
                total_pages=0,
                results_per_page=results_per_page,
                query=f"category:{category}",
            )

    def _parse_search_results(
        self,
        data: Dict[str, Any],
        query: str,
        page: int,
        results_per_page: int,
        search_params: Dict[str, Any],
    ) -> MeijerSearchResults:
        """Parse Constructor.io response into MeijerSearchResults."""

        items = []

        # Parse results from Constructor.io response
        results = data.get("response", {}).get("results", [])
        for result in results:
            try:
                item = MeijerItem.from_constructor_data(result)
                items.append(item)
            except Exception as e:
                self.logger.warning(f"Failed to parse search result: {e}")
                continue

        # Extract pagination info
        total_results = data.get("response", {}).get("total_num_results", len(items))

        # Calculate total pages
        total_pages = (
            (total_results + results_per_page - 1) // results_per_page
            if total_results > 0
            else 0
        )

        return MeijerSearchResults(
            items=items,
            total_results=total_results,
            current_page=page,
            total_pages=total_pages,
            results_per_page=results_per_page,
            query=query,
            _search_client=self,
            _search_params=search_params,
        )
