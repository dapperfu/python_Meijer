#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: New categories module for browsing Meijer departments and products with TUI interface
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing, numpy-style docstrings, and extensive use of @property decorators
 * - Dependencies: meijer package, rich, typing, dataclasses
 */

Meijer Categories and Department Browsing
========================================

This module provides comprehensive category and department browsing functionality
for the Meijer API, including the categories endpoint and TUI interface for
browsing products by department.
"""

from dataclasses import dataclass, field
from datetime import datetime
from typing import Any, Dict, List, Optional

from .exceptions import MeijerError


@dataclass
class Category:
    """Represents a product category or department."""

    id: str
    """Unique category identifier"""

    name: str
    """Category name"""

    description: Optional[str] = None
    """Category description"""

    parent_id: Optional[str] = None
    """Parent category ID if this is a subcategory"""

    level: int = 1
    """Category hierarchy level (1 = top level)"""

    product_count: int = 0
    """Number of products in this category"""

    image_url: Optional[str] = None
    """Category image URL"""

    is_active: bool = True
    """Whether this category is active"""

    sort_order: int = 0
    """Sort order for display"""

    subcategories: List["Category"] = field(default_factory=list)
    """Subcategories within this category"""

    featured_products: List[Dict[str, Any]] = field(default_factory=list)
    """Featured products in this category"""

    created_at: Optional[datetime] = None
    """When the category was created"""

    updated_at: Optional[datetime] = None
    """When the category was last updated"""

    @property
    def has_subcategories(self) -> bool:
        """Check if this category has subcategories."""
        return len(self.subcategories) > 0

    @property
    def is_top_level(self) -> bool:
        """Check if this is a top-level category."""
        return self.level == 1

    @property
    def is_leaf(self) -> bool:
        """Check if this is a leaf category (no subcategories)."""
        return not self.has_subcategories

    @property
    def total_product_count(self) -> int:
        """Get total product count including subcategories."""
        if self.is_leaf:
            return self.product_count

        total = self.product_count
        for subcategory in self.subcategories:
            total += subcategory.total_product_count
        return total

    @property
    def breadcrumb_path(self) -> List[str]:
        """Get the breadcrumb path to this category."""
        path = [self.name]
        if self.parent_id:
            # This would need to be populated by the parent category
            pass
        return path


@dataclass
class CategoryProduct:
    """Represents a product within a category."""

    product_id: str
    """Product identifier"""

    name: str
    """Product name"""

    price: Optional[float] = None
    """Current price"""

    original_price: Optional[float] = None
    """Original price if on sale"""

    image_url: Optional[str] = None
    """Product image URL"""

    description: Optional[str] = None
    """Product description"""

    brand: Optional[str] = None
    """Product brand"""

    upc: Optional[str] = None
    """Product UPC code"""

    is_on_sale: bool = False
    """Whether the product is on sale"""

    sale_end_date: Optional[datetime] = None
    """When the sale ends"""

    availability: str = "unknown"
    """Product availability status"""

    store_id: Optional[str] = None
    """Store ID for availability"""

    category_id: Optional[str] = None
    """Category ID this product belongs to"""

    @property
    def savings_amount(self) -> Optional[float]:
        """Calculate savings amount if on sale."""
        if self.is_on_sale and self.original_price and self.price:
            return self.original_price - self.price
        return None

    @property
    def savings_percentage(self) -> Optional[float]:
        """Calculate savings percentage if on sale."""
        if self.is_on_sale and self.original_price and self.price:
            return ((self.original_price - self.price) / self.original_price) * 100
        return None


class CategoriesManager:
    """
    Manages product categories and department browsing.

    This class provides comprehensive category management including:
    - Department navigation and hierarchy
    - Product browsing by category
    - Category search and filtering
    - Featured products by category
    """

    def __init__(self, client: Any):
        """
        Initialize the categories manager.

        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.logger = self.client.logger
        self.base_url = "https://api.meijer.com"

        # Categories API endpoints
        self.endpoints = {
            "categories": "/digital/aem/v1/categories",
            "category_products": "/digital/aem/v1/categories/{category_id}/products",
            "featured_products": "/digital/aem/v1/categories/{category_id}/featured",
        }

    def get_categories(self, store_id: Optional[str] = None) -> List[Category]:
        """
        Get all product categories and departments.

        This endpoint provides the main category hierarchy used for
        "Browse Departments" functionality in the mobile app.

        Parameters
        ----------
        store_id : Optional[str], default=None
            Store ID to filter categories by availability

        Returns
        -------
        List[Category]
            List of top-level categories and departments

        Raises
        ------
        MeijerError
            If there's an error retrieving categories
        """
        try:
            endpoint = self.endpoints["categories"]
            params = {}

            if store_id:
                params["store"] = store_id

            self.logger.info(f"Fetching categories for store: {store_id or 'all'}")

            response = self.client._make_request("GET", endpoint, params=params)

            if response.status_code == 200:
                data = response.json()
                return self._parse_categories_response(data)
            else:
                self.logger.error(
                    f"Categories request failed: {response.status_code} - {response.text}"
                )
                raise MeijerError(f"Failed to get categories: {response.status_code}")

        except Exception as e:
            self.logger.error(f"Error getting categories: {e}")
            raise MeijerError(f"Failed to get categories: {str(e)}") from e

    def get_category_products(
        self,
        category_id: str,
        store_id: Optional[str] = None,
        page: int = 1,
        limit: int = 24,
        sort_by: str = "relevance",
        **kwargs,
    ) -> List[CategoryProduct]:
        """
        Get products within a specific category.

        Parameters
        ----------
        category_id : str
            Category identifier
        store_id : Optional[str], default=None
            Store ID to filter products by availability
        page : int, default=1
            Page number for pagination
        limit : int, default=24
            Number of products per page
        sort_by : str, default="relevance"
            Sort method for products
        **kwargs : Any
            Additional query parameters

        Returns
        -------
        List[CategoryProduct]
            List of products in the category

        Raises
        ------
        MeijerError
            If there's an error retrieving category products
        """
        try:
            endpoint = self.endpoints["category_products"].format(
                category_id=category_id
            )
            params = {"page": page, "limit": limit, "sortBy": sort_by, **kwargs}

            if store_id:
                params["store"] = store_id

            self.logger.info(
                f"Fetching products for category {category_id} (page {page})"
            )

            response = self.client._make_request("GET", endpoint, params=params)

            if response.status_code == 200:
                data = response.json()
                return self._parse_category_products_response(data)
            else:
                self.logger.error(
                    f"Category products request failed: {response.status_code} - {response.text}"
                )
                raise MeijerError(
                    f"Failed to get category products: {response.status_code}"
                )

        except Exception as e:
            self.logger.error(f"Error getting category products: {e}")
            raise MeijerError(f"Failed to get category products: {str(e)}") from e

    def get_featured_products(
        self, category_id: str, store_id: Optional[str] = None, limit: int = 10
    ) -> List[CategoryProduct]:
        """
        Get featured products for a category.

        Parameters
        ----------
        category_id : str
            Category identifier
        store_id : Optional[str], default=None
            Store ID to filter products by availability
        limit : int, default=10
            Maximum number of featured products

        Returns
        -------
        List[CategoryProduct]
            List of featured products in the category

        Raises
        ------
        MeijerError
            If there's an error retrieving featured products
        """
        try:
            endpoint = self.endpoints["featured_products"].format(
                category_id=category_id
            )
            params = {"limit": limit}

            if store_id:
                params["store"] = store_id

            self.logger.info(f"Fetching featured products for category {category_id}")

            response = self.client._make_request("GET", endpoint, params=params)

            if response.status_code == 200:
                data = response.json()
                return self._parse_category_products_response(data)
            else:
                self.logger.error(
                    f"Featured products request failed: {response.status_code} - {response.text}"
                )
                raise MeijerError(
                    f"Failed to get featured products: {response.status_code}"
                )

        except Exception as e:
            self.logger.error(f"Error getting featured products: {e}")
            raise MeijerError(f"Failed to get featured products: {str(e)}") from e

    def search_categories(
        self, query: str, store_id: Optional[str] = None, limit: int = 20
    ) -> List[Category]:
        """
        Search for categories by name or description.

        Parameters
        ----------
        query : str
            Search query string
        store_id : Optional[str], default=None
            Store ID to filter results
        limit : int, default=20
            Maximum number of results

        Returns
        -------
        List[Category]
            List of matching categories

        Raises
        ------
        MeijerError
            If there's an error searching categories
        """
        try:
            # Get all categories and filter locally for now
            # In the future, this could use a dedicated search endpoint
            all_categories = self.get_categories(store_id)

            query_lower = query.lower()
            matching_categories = []

            def search_recursive(categories: List[Category]) -> None:
                for category in categories:
                    if query_lower in category.name.lower() or (
                        category.description
                        and query_lower in category.description.lower()
                    ):
                        matching_categories.append(category)

                    # Search subcategories recursively
                    if category.subcategories:
                        search_recursive(category.subcategories)

                    if len(matching_categories) >= limit:
                        return

            search_recursive(all_categories)

            return matching_categories[:limit]

        except Exception as e:
            self.logger.error(f"Error searching categories: {e}")
            raise MeijerError(f"Failed to search categories: {str(e)}") from e

    def get_category_hierarchy(self, store_id: Optional[str] = None) -> List[Category]:
        """
        Get the complete category hierarchy with proper parent-child relationships.

        Parameters
        ----------
        store_id : Optional[str], default=None
            Store ID to filter categories

        Returns
        -------
        List[Category]
            Complete category hierarchy with subcategories properly nested
        """
        try:
            categories = self.get_categories(store_id)
            return self._build_hierarchy(categories)

        except Exception as e:
            self.logger.error(f"Error building category hierarchy: {e}")
            raise MeijerError(f"Failed to build category hierarchy: {str(e)}") from e

    def _parse_categories_response(self, data: Dict[str, Any]) -> List[Category]:
        """Parse the categories API response."""
        categories = []

        if "categories" in data:
            for cat_data in data["categories"]:
                category = Category(
                    id=cat_data.get("id", ""),
                    name=cat_data.get("name", ""),
                    description=cat_data.get("description"),
                    parent_id=cat_data.get("parentId"),
                    level=cat_data.get("level", 1),
                    product_count=cat_data.get("productCount", 0),
                    image_url=cat_data.get("imageUrl"),
                    is_active=cat_data.get("active", True),
                    sort_order=cat_data.get("sortOrder", 0),
                    created_at=self._parse_datetime(cat_data.get("createdAt")),
                    updated_at=self._parse_datetime(cat_data.get("updatedAt")),
                )

                # Handle subcategories if present
                if "subcategories" in cat_data:
                    category.subcategories = self._parse_categories_response(
                        {"categories": cat_data["subcategories"]}
                    )

                # Handle featured products if present
                if "featuredProducts" in cat_data:
                    category.featured_products = cat_data["featuredProducts"]

                categories.append(category)

        return categories

    def _parse_category_products_response(
        self, data: Dict[str, Any]
    ) -> List[CategoryProduct]:
        """Parse the category products API response."""
        products = []

        if "products" in data:
            for prod_data in data["products"]:
                product = CategoryProduct(
                    product_id=prod_data.get("id", ""),
                    name=prod_data.get("name", ""),
                    price=self._parse_price(prod_data.get("price")),
                    original_price=self._parse_price(prod_data.get("originalPrice")),
                    image_url=prod_data.get("imageUrl"),
                    description=prod_data.get("description"),
                    brand=prod_data.get("brand"),
                    upc=prod_data.get("upc"),
                    is_on_sale=prod_data.get("onSale", False),
                    sale_end_date=self._parse_datetime(prod_data.get("saleEndDate")),
                    availability=prod_data.get("availability", "unknown"),
                    store_id=prod_data.get("storeId"),
                    category_id=prod_data.get("categoryId"),
                )
                products.append(product)

        return products

    def _build_hierarchy(self, categories: List[Category]) -> List[Category]:
        """Build proper parent-child hierarchy from flat category list."""
        # Create a map of categories by ID
        category_map = {cat.id: cat for cat in categories}

        # Build hierarchy
        root_categories = []

        for category in categories:
            if category.parent_id and category.parent_id in category_map:
                # Add as subcategory to parent
                parent = category_map[category.parent_id]
                parent.subcategories.append(category)
            else:
                # Top-level category
                root_categories.append(category)

        return root_categories

    def _parse_datetime(self, date_string: Optional[str]) -> Optional[datetime]:
        """Parse datetime string from API response."""
        if not date_string:
            return None

        try:
            # Try common datetime formats
            for fmt in ["%Y-%m-%dT%H:%M:%S.%fZ", "%Y-%m-%dT%H:%M:%SZ", "%Y-%m-%d"]:
                try:
                    return datetime.fromisoformat(date_string.replace("Z", "+00:00"))
                except ValueError:
                    continue

            # If all formats fail, return None
            return None

        except Exception:
            return None

    def _parse_price(self, price_data: Any) -> Optional[float]:
        """Parse price from API response."""
        if price_data is None:
            return None

        try:
            if isinstance(price_data, (int, float)):
                return float(price_data)
            elif isinstance(price_data, str):
                # Remove currency symbols and convert to float
                cleaned = price_data.replace("$", "").replace(",", "").strip()
                return float(cleaned)
            else:
                return None
        except (ValueError, TypeError):
            return None
