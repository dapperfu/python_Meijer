"""
Item models for Meijer API responses.

This module contains dataclasses for products and shopping list items.
"""

from dataclasses import dataclass, field
from datetime import date
from typing import Any, Dict, List, Optional, Union

try:
    import io

    import requests
    from PIL import Image
except ImportError:
    # Optional dependencies for image handling
    io = None
    requests = None
    Image = None

from .base import ItemType


@dataclass
class MeijerItem:
    """
    Represents a product/item from Meijer's system.

    Based on the ProductFullDetails class from the decompiled APK.
    Enhanced to support Constructor.io search API responses.
    """

    id: str
    """Unique product identifier"""

    title: str
    """Product title/name"""

    description: Optional[str] = None
    """Product description"""

    brand: Optional[str] = None
    """Product brand name"""

    category: Optional[str] = None
    """Product category"""

    subcategory: Optional[str] = None
    """Product subcategory"""

    upc: Optional[str] = None
    """Universal Product Code"""

    sku: Optional[str] = None
    """Stock Keeping Unit"""

    image_url: Optional[str] = None
    """URL to product image"""

    large_image_url: Optional[str] = None
    """URL to large product image"""

    price: Optional[float] = None
    """Current product price"""

    sale_price: Optional[float] = None
    """Sale price if on sale"""

    unit_price: Optional[str] = None
    """Price per unit (e.g., per ounce)"""

    is_weighted: bool = False
    """Whether product is sold by weight"""

    weight_unit: Optional[str] = None
    """Unit of weight measurement"""

    weight_amount: Optional[float] = None
    """Weight amount"""

    is_available: bool = True
    """Whether product is currently available"""

    store_id: Optional[str] = None
    """Store ID where product is located"""

    department_id: Optional[str] = None
    """Department ID"""

    sub_department_id: Optional[str] = None
    """Sub-department ID"""

    tags: List[str] = field(default_factory=list)
    """List of product tags"""

    raw_data: Optional[Dict[str, Any]] = None
    """Raw API response data"""

    # Constructor.io specific fields
    data_id: Optional[str] = None
    """Constructor.io data ID"""

    data_ean: Optional[int] = None
    """European Article Number"""

    data_isbopas: Optional[bool] = None
    """Buy One, Get One at Same Price flag"""

    data_isbuyable: Optional[bool] = None
    """Whether product can be purchased"""

    data_isalcohol: Optional[bool] = None
    """Whether product contains alcohol"""

    data_hasmperks: Optional[bool] = None
    """Whether product has mPerks offers"""

    data_specialbuy: Optional[bool] = None
    """Whether product is a special buy"""

    data_deactivated: Optional[bool] = None
    """Whether product is deactivated"""

    data_productunit: Optional[str] = None
    """Product unit description"""

    data_qtyincrement: Optional[int] = None
    """Quantity increment for ordering"""

    data_chokinghazard: Optional[bool] = None
    """Whether product is a choking hazard"""

    data_ispurchasable: Optional[bool] = None
    """Whether product can be purchased"""

    data_pricebyweight: Optional[bool] = None
    """Whether product is priced by weight"""

    data_mperksofferid: Optional[List[Any]] = None
    """List of mPerks offer IDs"""

    data_isagerestricted: Optional[bool] = None
    """Whether product has age restrictions"""

    data_ebtfoodstampable: Optional[bool] = None
    """Whether product can be purchased with EBT"""

    data_pickupavailableflag: Optional[bool] = None
    """Whether pickup is available"""

    data_homedeliverynotavailable: Optional[bool] = None
    """Whether home delivery is not available"""

    data_requiresdiscreteinventorytracking: Optional[bool] = None
    """Whether product requires discrete inventory tracking"""

    data_ismap: Optional[bool] = None
    """Whether product has MAP pricing"""

    data_variation_id: Optional[str] = None
    """Product variation ID"""

    data_pricegoodthrough: Optional[str] = None
    """Date until which price is valid"""

    data_stocklevelstatus: Optional[str] = None
    """Current stock level status"""

    data_discountsalepricevalue: Optional[Union[float, int]] = None
    """Discounted sale price value"""

    data_discountvalue: Optional[float] = None
    """Discount amount"""

    data_discountsavingstext: Optional[str] = None
    """Text describing discount savings"""

    data_discountsalepricetype: Optional[str] = None
    """Type of discount sale price"""

    data_depositvalue: Optional[float] = None
    """Deposit amount if applicable"""

    data_maxorderquantity: Optional[int] = None
    """Maximum order quantity"""

    data_discountsalepricetext: Optional[str] = None
    """Text describing discount sale price"""

    data_packagesize: Optional[str] = None
    """Package size description"""

    data_group_ids: Optional[List[Any]] = None
    """List of group IDs"""

    data_ingredients: Optional[str] = None
    """Product ingredients list"""

    matched_terms: Optional[List[Any]] = field(default_factory=list)
    """Search terms that matched this product"""

    # Aisle location fields for defragging
    aisle_primary: Optional[str] = None
    """Primary aisle location"""

    section: Optional[str] = None
    """Section within the aisle"""

    bay: Optional[str] = None
    """Bay within the section"""

    aisle_locations: List[str] = field(default_factory=list)
    """List of all aisle locations"""

    def __post_init__(self):
        """
        Validate and set default values.

        Sets default title if none provided.
        """
        if not self.title:
            self.title = self.description or "Unknown Product"

    @classmethod
    def from_constructor_response(
        cls, item_data: Dict[str, Any], client: Optional[Any] = None
    ) -> "MeijerItem":
        """
        Create a MeijerItem from Constructor.io API response data.

        Parameters
        ----------
        item_data : Dict[str, Any]
            Raw item data from Constructor.io search response
        client : Any, optional
            Meijer client for additional operations

        Returns
        -------
        MeijerItem
            New MeijerItem instance
        """
        # Extract common Constructor.io fields
        value = item_data.get("value", "")
        data = item_data.get("data", {})

        # Create instance with discovered field mappings
        kwargs = {
            "id": data.get("data_id", str(item_data.get("id", ""))),
            "title": value,
            "description": data.get("data_description", ""),
            "brand": data.get("data_brand", ""),
            "category": data.get("data_category", ""),
            "subcategory": data.get("data_subcategory", ""),
            "upc": str(data.get("data_ean", "")) if data.get("data_ean") else None,
            "sku": data.get("data_sku", ""),
            "image_url": data.get("data_image_url", ""),
            "price": float(data.get("data_price", 0))
            if data.get("data_price")
            else None,
            "sale_price": float(data.get("data_discountsalepricevalue", 0))
            if data.get("data_discountsalepricevalue")
            else None,
            "unit_price": data.get("data_priceunit", ""),
            "is_weighted": data.get("data_pricebyweight", False),
            "is_available": data.get("data_ispurchasable", True),
            "raw_data": item_data,
            # Constructor.io specific fields
            "data_id": data.get("data_id", ""),
            "data_ean": data.get("data_ean"),
            "data_isbopas": data.get("data_isbopas", False),
            "data_isbuyable": data.get("data_isbuyable", False),
            "data_isalcohol": data.get("data_isalcohol", False),
            "data_hasmperks": data.get("data_hasmperks", False),
            "data_specialbuy": data.get("data_specialbuy", False),
            "data_deactivated": data.get("data_deactivated", False),
            "data_productunit": data.get("data_productunit", ""),
            "data_qtyincrement": data.get("data_qtyincrement", 1),
            "data_chokinghazard": data.get("data_chokinghazard", False),
            "data_ispurchasable": data.get("data_ispurchasable", True),
            "data_pricebyweight": data.get("data_pricebyweight", False),
            "data_mperksofferid": data.get("data_mperksofferid", []),
            "data_isagerestricted": data.get("data_isagerestricted", False),
            "data_ebtfoodstampable": data.get("data_ebtfoodstampable", False),
            "data_pickupavailableflag": data.get("data_pickupavailableflag", False),
            "data_homedeliverynotavailable": data.get(
                "data_homedeliverynotavailable", False
            ),
            "data_requiresdiscreteinventorytracking": data.get(
                "data_requiresdiscreteinventorytracking", False
            ),
            "data_ismap": data.get("data_ismap", False),
            "data_variation_id": data.get("data_variation_id", ""),
            "data_pricegoodthrough": data.get("data_pricegoodthrough", ""),
            "data_stocklevelstatus": data.get("data_stocklevelstatus", ""),
            "data_discountsalepricevalue": data.get("data_discountsalepricevalue"),
            "data_discountvalue": data.get("data_discountvalue"),
            "data_discountsavingstext": data.get("data_discountsavingstext", ""),
            "data_discountsalepricetype": data.get("data_discountsalepricetype", ""),
            "data_depositvalue": data.get("data_depositvalue"),
            "data_maxorderquantity": data.get("data_maxorderquantity"),
            "data_discountsalepricetext": data.get("data_discountsalepricetext", ""),
            "data_packagesize": data.get("data_packagesize", ""),
            "data_group_ids": data.get("data_group_ids", []),
            "data_ingredients": data.get("data_ingredients", ""),
            "matched_terms": item_data.get("matched_terms", []),
        }

        return cls(**kwargs)

    @property
    def display_name(self) -> str:
        """
        Get the display name for the item.

        Returns
        -------
        str
            Display name (title or description)
        """
        return self.title or self.description or "Unknown Product"

    @property
    def best_price(self) -> Optional[float]:
        """
        Get the best available price (sale price or regular price).

        Returns
        -------
        float, optional
            Best available price or None if no price available
        """
        if self.sale_price is not None and self.sale_price < (
            self.price or float("inf")
        ):
            return self.sale_price
        return self.price

    @property
    def on_sale(self) -> bool:
        """
        Check if the item is currently on sale.

        Returns
        -------
        bool
            True if item is on sale, False otherwise
        """
        return self.sale_price is not None and self.sale_price < (
            self.price or float("inf")
        )

    @property
    def has_image(self) -> bool:
        """
        Check if the item has an image available.

        Returns
        -------
        bool
            True if image is available, False otherwise
        """
        return bool(self.image_url or self.large_image_url)

    @property
    def primary_image_url(self) -> Optional[str]:
        """
        Get the primary image URL for the item.

        Returns
        -------
        str, optional
            Primary image URL or None if no image available
        """
        return self.large_image_url or self.image_url

    @property
    def discount_amount(self) -> Optional[float]:
        """
        Calculate the discount amount if item is on sale.

        Returns
        -------
        float, optional
            Discount amount or None if not on sale
        """
        if self.on_sale and self.price is not None:
            return self.price - self.sale_price
        return None

    @property
    def discount_percentage(self) -> Optional[float]:
        """
        Calculate the discount percentage if item is on sale.

        Returns
        -------
        float, optional
            Discount percentage or None if not on sale
        """
        if self.on_sale and self.price is not None and self.price > 0:
            return ((self.price - self.sale_price) / self.price) * 100
        return None

    @property
    def dairy(self) -> bool:
        """
        Check if the item is in the dairy category.

        Returns
        -------
        bool
            True if item is dairy, False otherwise
        """
        dairy_keywords = ["milk", "cheese", "yogurt", "butter", "cream", "dairy"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in dairy_keywords
        )

    @property
    def produce(self) -> bool:
        """
        Check if the item is in the produce category.

        Returns
        -------
        bool
            True if item is produce, False otherwise
        """
        produce_keywords = ["fruit", "vegetable", "produce", "fresh"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in produce_keywords
        )

    @property
    def meat(self) -> bool:
        """
        Check if the item is in the meat category.

        Returns
        -------
        bool
            True if item is meat, False otherwise
        """
        meat_keywords = ["meat", "chicken", "beef", "pork", "fish", "steak", "ground"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in meat_keywords
        )

    @property
    def frozen(self) -> bool:
        """
        Check if the item is frozen.

        Returns
        -------
        bool
            True if item is frozen, False otherwise
        """
        frozen_keywords = ["frozen", "ice cream", "frozen food"]
        return any(
            keyword in (self.category or "").lower()
            or keyword in (self.title or "").lower()
            for keyword in frozen_keywords
        )

    @property
    def organic(self) -> bool:
        """
        Check if the item is organic.

        Returns
        -------
        bool
            True if item is organic, False otherwise
        """
        organic_keywords = ["organic", "organically grown"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in organic_keywords
        )

    @property
    def gluten_free(self) -> bool:
        """
        Check if the item is gluten-free.

        Returns
        -------
        bool
            True if item is gluten-free, False otherwise
        """
        gluten_free_keywords = ["gluten free", "gluten-free", "no gluten"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in gluten_free_keywords
        )

    @property
    def vegan(self) -> bool:
        """
        Check if the item is vegan.

        Returns
        -------
        bool
            True if item is vegan, False otherwise
        """
        vegan_keywords = ["vegan", "plant-based", "no animal products"]
        return any(
            keyword in (self.title or "").lower()
            or keyword in (self.description or "").lower()
            for keyword in vegan_keywords
        )

    @property
    def alcoholic(self) -> bool:
        """
        Check if the item contains alcohol.

        Returns
        -------
        bool
            True if item contains alcohol, False otherwise
        """
        return self.data_isalcohol or any(
            keyword in (self.title or "").lower()
            for keyword in ["wine", "beer", "liquor", "alcohol"]
        )

    @property
    def requires_age_verification(self) -> bool:
        """
        Check if the item requires age verification.

        Returns
        -------
        bool
            True if age verification required, False otherwise
        """
        return self.data_isagerestricted or self.alcoholic

    @property
    def available_for_pickup(self) -> bool:
        """
        Check if the item is available for pickup.

        Returns
        -------
        bool
            True if pickup is available, False otherwise
        """
        return self.data_pickupavailableflag and self.is_available

    @property
    def available_for_delivery(self) -> bool:
        """
        Check if the item is available for home delivery.

        Returns
        -------
        bool
            True if delivery is available, False otherwise
        """
        return not self.data_homedeliverynotavailable and self.is_available

    @property
    def has_mperks_offer(self) -> bool:
        """
        Check if the item has an mPerks offer.

        Returns
        -------
        bool
            True if mPerks offer exists, False otherwise
        """
        return bool(self.data_hasmperks and self.data_mperksofferid)

    @property
    def special_buy(self) -> bool:
        """
        Check if the item is a special buy.

        Returns
        -------
        bool
            True if item is a special buy, False otherwise
        """
        return self.data_specialbuy

    @property
    def deactivated(self) -> bool:
        """
        Check if the item is deactivated.

        Returns
        -------
        bool
            True if item is deactivated, False otherwise
        """
        return self.data_deactivated

    @property
    def purchasable(self) -> bool:
        """
        Check if the item can be purchased.

        Returns
        -------
        bool
            True if item can be purchased, False otherwise
        """
        return self.data_ispurchasable and self.is_available and not self.deactivated

    @property
    def has_location_data(self) -> bool:
        """Check if the item has aisle location data."""
        return bool(self.aisle_primary or self.aisle_locations)

    @property
    def primary_aisle(self) -> Optional[str]:
        """Get the primary aisle location."""
        return self.aisle_primary

    @property
    def all_aisles(self) -> List[str]:
        """Get all aisle locations for the item."""
        aisles = []
        if self.aisle_primary:
            aisles.append(self.aisle_primary)
        aisles.extend(self.aisle_locations)
        return list(set(aisles))  # Remove duplicates

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "id": self.id,
            "title": self.title,
            "description": self.description,
            "brand": self.brand,
            "category": self.category,
            "subcategory": self.subcategory,
            "upc": self.upc,
            "sku": self.sku,
            "imageUrl": self.image_url,
            "largeImageUrl": self.large_image_url,
            "price": self.price,
            "salePrice": self.sale_price,
            "unitPrice": self.unit_price,
            "isWeighted": self.is_weighted,
            "weightUnit": self.weight_unit,
            "weightAmount": self.weight_amount,
            "isAvailable": self.is_available,
            "storeId": self.store_id,
            "departmentId": self.department_id,
            "subDepartmentId": self.sub_department_id,
            "tags": self.tags,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}

    # ============================================================================
    # Jupyter Notebook Rich Representations
    # ============================================================================

    def __repr__(self) -> str:
        """Clean, informative string representation for the class."""
        # Extract key identifying information
        name_parts = []

        # Add title/brand info
        if self.title:
            # Clean up title for display (remove common prefixes, limit length)
            clean_title = self.title
            if clean_title.startswith("Meijer "):
                clean_title = clean_title[7:]  # Remove "Meijer " prefix
            if len(clean_title) > 30:
                clean_title = clean_title[:27] + "..."
            name_parts.append(clean_title)

        # Add key descriptors
        if self.description and len(self.description) < 20:
            name_parts.append(self.description)

        # Add price info
        price_info = []
        if self.price:
            price_info.append(f"${self.price:.2f}")
        if self.sale_price and self.sale_price != self.price:
            price_info.append(f"sale:${self.sale_price:.2f}")

        # Add location info
        location_info = []
        if self.aisle_primary:
            location_info.append(f"aisle:{self.aisle_primary}")
        if self.store_id:
            location_info.append(f"store:{self.store_id}")

        # Build the representation
        result = f"MeijerItem<{', '.join(name_parts)}"
        if price_info:
            result += f", {', '.join(price_info)}"
        if location_info:
            result += f", {', '.join(location_info)}"
        result += ">"

        return result

    def __str__(self) -> str:
        """String representation that matches __repr__."""
        return self.__repr__()

    def _repr_html_(self) -> str:
        """Rich HTML representation for Jupyter notebooks."""
        html_parts = []

        # Header with product info
        html_parts.append(
            '<div style="border: 2px solid #0066cc; border-radius: 10px; padding: 15px; margin: 10px; background: linear-gradient(135deg, #f8f9fa 0%, #e9ecef 100%);">'
        )

        # Product title and brand
        if self.title:
            html_parts.append(
                f'<h3 style="color: #0066cc; margin: 0 0 10px 0; font-size: 18px;">{self.title}</h3>'
            )

        if self.brand:
            html_parts.append(
                f'<p style="color: #6c757d; margin: 0 0 8px 0; font-style: italic;">Brand: {self.brand}</p>'
            )

        # Price information
        if self.price or self.sale_price:
            html_parts.append('<div style="margin: 10px 0;">')
            if self.price:
                price_style = "color: #28a745; font-weight: bold; font-size: 16px;"
                if self.sale_price and self.sale_price != self.price:
                    price_style += "text-decoration: line-through; color: #6c757d;"
                html_parts.append(
                    f'<span style="{price_style}">${self.price:.2f}</span>'
                )

            if self.sale_price and self.sale_price != self.price:
                html_parts.append(
                    f' <span style="color: #dc3545; font-weight: bold; font-size: 16px;">SALE: ${self.sale_price:.2f}</span>'
                )
            html_parts.append("</div>")

        # Product details in a grid
        html_parts.append(
            '<div style="display: grid; grid-template-columns: 1fr 1fr; gap: 10px; margin: 10px 0;">'
        )

        # Left column
        left_details = []
        if self.upc:
            left_details.append(f"<strong>UPC:</strong> {self.upc}")
        if self.category:
            left_details.append(f"<strong>Category:</strong> {self.category}")
        if self.aisle_primary:
            left_details.append(f"<strong>Aisle:</strong> {self.aisle_primary}")
        if self.store_id:
            left_details.append(f"<strong>Store:</strong> {self.store_id}")

        if left_details:
            html_parts.append(
                f'<div style="grid-column: 1;">{"<br>".join(left_details)}</div>'
            )

        # Right column
        right_details = []
        if self.description and len(self.description) < 100:
            right_details.append(
                f'<strong>Description:</strong> {self.description[:100]}{"..." if len(self.description) > 100 else ""}'
            )
        if self.unit_price:
            right_details.append(f"<strong>Unit Price:</strong> {self.unit_price}")
        if self.is_available is not None:
            status = "✅ Available" if self.is_available else "❌ Unavailable"
            right_details.append(f"<strong>Status:</strong> {status}")

        if right_details:
            html_parts.append(
                f'<div style="grid-column: 2;">{"<br>".join(right_details)}</div>'
            )

        html_parts.append("</div>")

        # Image if available
        if self.image_url:
            html_parts.append('<div style="text-align: center; margin: 10px 0;">')
            html_parts.append(
                f'<img src="{self.image_url}" style="max-width: 200px; max-height: 150px; border-radius: 5px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);" alt="Product Image">'
            )
            html_parts.append("</div>")

        html_parts.append("</div>")

        return "".join(html_parts)

    def _repr_markdown_(self) -> str:
        """Markdown representation for Jupyter notebooks."""
        md_parts = []

        # Header
        if self.title:
            md_parts.append(f"# {self.title}")

        # Basic info
        if self.brand:
            md_parts.append(f"**Brand:** {self.brand}")

        if self.price:
            price_text = f"**Price:** ${self.price:.2f}"
            if self.sale_price and self.sale_price != self.price:
                price_text += f" (SALE: ${self.sale_price:.2f})"
            md_parts.append(price_text)

        # Details table
        details = []
        if self.upc:
            details.append(["UPC", self.upc])
        if self.category:
            details.append(["Category", self.category])
        if self.aisle_primary:
            details.append(["Aisle", self.aisle_primary])
        if self.store_id:
            details.append(["Store", self.store_id])
        if self.description:
            details.append(
                [
                    "Description",
                    self.description[:100] + "..."
                    if len(self.description) > 100
                    else self.description,
                ]
            )

        if details:
            md_parts.append("\n| Field | Value |")
            md_parts.append("|-------|-------|")
            for field, value in details:
                md_parts.append(f"| {field} | {value} |")

        # Image
        if self.image_url:
            md_parts.append(f"\n![Product Image]({self.image_url})")

        return "\n\n".join(md_parts)

    def _repr_latex_(self) -> str:
        """LaTeX representation for mathematical documentation."""
        latex_parts = []

        # Product title
        if self.title:
            latex_parts.append(f"\\textbf{{{self.title}}}")

        # Price equation
        if self.price:
            latex_parts.append(f"\\[\\text{{Price}} = \\${self.price:.2f}\\]")

            if self.sale_price and self.sale_price != self.price:
                discount = ((self.price - self.sale_price) / self.price) * 100
                latex_parts.append(f"\\[\\text{{Discount}} = {discount:.1f}\\%\\]")
                latex_parts.append(
                    f"\\[\\text{{Sale Price}} = \\${self.sale_price:.2f}\\]"
                )

        # Product information
        info_items = []
        if self.upc:
            info_items.append(f"\\text{{UPC}}: {self.upc}")
        if self.category:
            info_items.append(f"\\text{{Category}}: {self.category}")
        if self.aisle_primary:
            info_items.append(f"\\text{{Aisle}}: {self.aisle_primary}")

        if info_items:
            latex_parts.append("\\begin{align*}")
            for i, item in enumerate(info_items):
                if i > 0:
                    latex_parts.append("\\\\")
                latex_parts.append(item)
            latex_parts.append("\\end{align*}")

        return "\n".join(latex_parts)

    def _repr_svg_(self) -> Optional[str]:
        """SVG representation - creates a simple SVG chart of product information."""
        if not self.price:
            return None

        # Create a simple SVG bar chart showing price vs typical price
        typical_price = 5.0  # Example typical price
        price_ratio = min(self.price / typical_price, 2.0)  # Cap at 2x for display

        svg = f"""<svg width="300" height="200" xmlns="http://www.w3.org/2000/svg">
            <rect width="300" height="200" fill="#f8f9fa" stroke="#0066cc" stroke-width="2"/>
            <text x="150" y="25" text-anchor="middle" font-family="Arial" font-size="16" fill="#0066cc">Price Comparison</text>

            <!-- Typical price bar -->
            <rect x="50" y="60" width="80" height="30" fill="#6c757d" opacity="0.7"/>
            <text x="90" y="80" text-anchor="middle" font-family="Arial" font-size="12" fill="white">${typical_price}</text>

            <!-- Current price bar -->
            <rect x="50" y="100" width="{80 * price_ratio}" height="30" fill="#28a745"/>
            <text x="{90 + (40 * price_ratio)}" y="120" text-anchor="middle" font-family="Arial" font-size="12" fill="white">${self.price:.2f}</text>

            <!-- Labels -->
            <text x="50" y="150" font-family="Arial" font-size="10" fill="#6c757d">Typical</text>
            <text x="50" y="170" font-family="Arial" font-size="10" fill="#28a745">Current</text>
        </svg>"""

        return svg

    def _repr_png_(self) -> Optional[bytes]:
        """PNG representation - returns the product image as PNG bytes if available."""
        if not self.image_url or not all([requests, Image, io]):
            return None

        try:
            # Download the image
            response = requests.get(self.image_url, timeout=10)
            response.raise_for_status()

            # Convert to PNG
            img = Image.open(io.BytesIO(response.content))
            img_bytes = io.BytesIO()
            img.save(img_bytes, format="PNG")
            return img_bytes.getvalue()

        except Exception:
            return None

    def _repr_jpeg_(self) -> Optional[bytes]:
        """JPEG representation - returns the product image as JPEG bytes if available."""
        if not self.image_url or not all([requests, Image, io]):
            return None

        try:
            # Download the image
            response = requests.get(self.image_url, timeout=10)
            response.raise_for_status()

            # Convert to JPEG
            img = Image.open(io.BytesIO(response.content))
            img_bytes = io.BytesIO()
            img.save(img_bytes, format="JPEG", quality=85)
            return img_bytes.getvalue()

        except Exception:
            return None

    def display_info(self) -> None:
        """Display comprehensive product information in a formatted way."""
        print("=" * 60)
        print("📦 PRODUCT INFORMATION")
        print("=" * 60)

        if self.title:
            print(f"🏷️  Title: {self.title}")

        if self.brand:
            print(f"🏭 Brand: {self.brand}")

        if self.price:
            price_text = f"💰 Price: ${self.price:.2f}"
            if self.sale_price and self.sale_price != self.price:
                price_text += f" (SALE: ${self.sale_price:.2f})"
            print(price_text)

        if self.upc:
            print(f"📊 UPC: {self.upc}")

        if self.category:
            print(f"📁 Category: {self.category}")

        if self.aisle_primary:
            print(f"📍 Aisle: {self.aisle_primary}")

        if self.store_id:
            print(f"🏪 Store: {self.store_id}")

        if self.description:
            print(f"📝 Description: {self.description}")

        if self.image_url:
            print(f"🖼️  Image: {self.image_url}")

        print("=" * 60)


@dataclass
class ListItem:
    """
    Represents an item in a shopping list or favorites list.

    Based on the ShoppingListItem class from the decompiled APK.
    """

    list_item_id: int
    """Unique identifier for the list item"""

    list_item_type_id: int
    """Type of item (e.g., PRODUCT, COUPON, WEEKLY_AD, MANUAL)"""

    item_display_order: int
    """Order in which the item appears in the list"""

    item_part_number: Optional[str]
    """Part number of the item"""

    item_description: str
    """Description of the item"""

    quantity: int
    """Quantity of the item"""

    store_id: int
    """Store ID where the item is located"""

    notes: Optional[str]
    """Notes for the item"""

    is_complete: bool
    """Whether the item is marked as complete"""

    is_favorite: bool
    """Whether the item is marked as a favorite"""

    listing_id: Optional[str]
    """ID of the listing this item belongs to"""

    promotion_start: Optional[date]
    """Start date of the promotion"""

    promotion_end: Optional[date]
    """End date of the promotion"""

    coupon_id: int
    """ID of the coupon associated with the item"""

    product_details: Optional[MeijerItem] = None
    """Detailed product information for the item"""
    # Internal reference to list API for operations like marking complete/incomplete
    _list_api: Optional[Any] = field(default=None, repr=False, compare=False)

    # Backward compatibility properties
    @property
    def item_id(self) -> int:
        """Backward compatibility: item_id -> list_item_id."""
        return self.list_item_id

    @property
    def name(self) -> str:
        """Backward compatibility: name -> item_description."""
        return self.item_description

    @property
    def checked(self) -> bool:
        """Backward compatibility: checked -> is_complete."""
        return self.is_complete

    @property
    def complete(self) -> bool:
        """Get or set the completion status of the list item.

        Getting returns the same value as `is_complete`.
        Setting will call the appropriate API via the attached list API if available,
        otherwise it will only update the local field.

        Returns
        -------
        bool
            True if the item is marked complete, False otherwise
        """
        return self.is_complete

    @complete.setter
    def complete(self, value: bool) -> None:
        """Set the completion status for the item.

        When a list API reference is attached, this will invoke the remote API to
        mark the item complete/incomplete and update the local state on success.
        If no API is attached, only the local state is updated.

        Parameters
        ----------
        value : bool
            Desired completion status
        """
        # No-op if already desired state
        if bool(self.is_complete) == bool(value):
            return

        if self._list_api is not None:
            try:
                if value:
                    success = self._list_api.complete_item(str(self.list_item_id))
                else:
                    # Uses the MarkAsNotCompleted endpoint
                    success = self._list_api.mark_as_not_completed(
                        str(self.list_item_id)
                    )
                if success:
                    self.is_complete = bool(value)
                else:
                    raise RuntimeError(
                        f"Failed to set completion to {value} for item {self.list_item_id} via API"
                    )
            except Exception:  # pragma: no cover - passthrough for caller
                raise
        else:
            # Fallback: update local state only
            self.is_complete = bool(value)

    @property
    def upc(self) -> Optional[str]:
        """Backward compatibility: upc from product_details."""
        if self.product_details:
            return self.product_details.upc
        return None

    @property
    def is_coupon(self) -> bool:
        """Check if this item represents a coupon."""
        return self.list_item_type_id == ItemType.COUPON.value

    @property
    def is_product(self) -> bool:
        """Check if this item represents a product."""
        return self.list_item_type_id == ItemType.PRODUCT.value

    @property
    def is_weekly_ad(self) -> bool:
        """Check if this item represents a weekly ad item."""
        return self.list_item_type_id == ItemType.WEEKLY_AD.value

    @property
    def is_manual(self) -> bool:
        """Check if this item was manually added."""
        return self.list_item_type_id == ItemType.MANUAL.value

    @property
    def has_notes(self) -> bool:
        """Check if the item has notes."""
        return bool(self.notes and self.notes.strip())

    @property
    def has_promotion(self) -> bool:
        """Check if the item has an active promotion."""
        if not self.promotion_start or not self.promotion_end:
            return False
        from datetime import date

        today = date.today()
        return self.promotion_start <= today <= self.promotion_end

    @property
    def promotion_status(self) -> str:
        """Get the current promotion status."""
        if not self.promotion_start or not self.promotion_end:
            return "No Promotion"

        from datetime import date

        today = date.today()

        if today < self.promotion_start:
            days_until = (self.promotion_start - today).days
            return f"Starts in {days_until} days"
        elif today > self.promotion_end:
            days_since = (today - self.promotion_end).days
            return f"Ended {days_since} days ago"
        else:
            days_left = (self.promotion_end - today).days
            return f"Active ({days_left} days left)"

    @property
    def high_priority(self) -> bool:
        """Check if the item is high priority (low display order)."""
        return self.item_display_order <= 3

    @property
    def low_priority(self) -> bool:
        """Check if the item is low priority (high display order)."""
        return self.item_display_order > 10

    @property
    def quantity_description(self) -> str:
        """Get a human-readable quantity description."""
        if self.quantity == 1:
            return "1 item"
        elif self.quantity == 0:
            return "0 items"
        else:
            return f"{self.quantity} items"

    @property
    def display_summary(self) -> str:
        """Get a summary string for display purposes."""
        status = "✅" if self.is_complete else "⏳"
        return f"{status} {self.quantity_description} of {self.name}"

    @property
    def can_be_completed(self) -> bool:
        """Check if the item can be marked as complete."""
        return not self.is_complete

    @property
    def can_be_uncompleted(self) -> bool:
        """Check if the item can be marked as incomplete."""
        return self.is_complete

    @property
    def favorite_item(self) -> bool:
        """Check if this item is marked as a favorite."""
        return self.is_favorite

    @property
    def has_product_details(self) -> bool:
        """Check if the item has detailed product information."""
        return self.product_details is not None

    @property
    def product_upc(self) -> Optional[str]:
        """Get the UPC from product details if available."""
        if self.product_details:
            return self.product_details.upc
        return self.item_part_number

    @property
    def product_brand(self) -> Optional[str]:
        """Get the brand from product details if available."""
        if self.product_details:
            return self.product_details.brand
        return None

    @property
    def product_category(self) -> Optional[str]:
        """Get the category from product details if available."""
        if self.product_details:
            return self.product_details.category
        return None

    @property
    def product_price(self) -> Optional[float]:
        """Get the price from product details if available."""
        if self.product_details:
            return self.product_details.best_price
        return None

    @property
    def product_image_url(self) -> Optional[str]:
        """Get the image URL from product details if available."""
        if self.product_details:
            return self.product_details.primary_image_url
        return None

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "listItemId": self.list_item_id,
            "listItemTypeId": self.list_item_type_id,
            "itemDisplayOrder": self.item_display_order,
            "itemPartNumber": self.item_part_number,
            "itemDescription": self.item_description,
            "quantity": self.quantity,
            "storeId": self.store_id,
            "notes": self.notes,
            "isComplete": self.is_complete,
            "isFavorite": self.is_favorite,
            "listingId": self.listing_id,
            "promotionStart": self.promotion_start.isoformat()
            if self.promotion_start
            else None,
            "promotionEnd": self.promotion_end.isoformat()
            if self.promotion_end
            else None,
            "couponId": self.coupon_id,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}


# ============================================================================
# Jupyter Notebook Rich Representations
# ============================================================================

# Note: These methods are dynamically added to the MeijerItem class
# to provide rich Jupyter Notebook representations
