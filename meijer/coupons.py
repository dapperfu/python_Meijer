"""
Coupons module for Meijer API client.

This module provides coupon management functionality including:
- Fetching available coupons
- Clipping/unclipping coupons
- Managing coupon collections
"""

import json
from typing import Any, Dict, List, Optional

from .exceptions import CouponError, MeijerAPIError
from .models.coupons import Coupon, CouponCollection, CouponStatus, CouponType


class CouponManager:
    """Manages coupon operations for the Meijer client."""

    def __init__(self, client):
        """Initialize the coupon manager with a client instance."""
        self.client = client
        self._coupons_cache: Optional[CouponCollection] = None

    def __call__(self) -> CouponCollection:
        """Return the current coupons collection."""
        if self._coupons_cache is None:
            self.refresh()
        return self._coupons_cache

    def refresh(self) -> CouponCollection:
        """Refresh the coupons collection from the API."""
        try:
            # Fetch coupons from the API
            response = self.client._make_request(
                "GET", "/api/coupons", params={"includeClipped": True}
            )

            coupons_data = response.get("coupons", [])
            self._coupons_cache = self._parse_coupons(coupons_data)

            return self._coupons_cache

        except Exception as e:
            raise CouponError(f"Failed to fetch coupons: {e}")

    def _parse_coupons(self, coupons_data: List[Dict[str, Any]]) -> CouponCollection:
        """Parse raw coupon data into Coupon objects."""
        collection = CouponCollection()

        for coupon_data in coupons_data:
            try:
                coupon = self._create_coupon_from_data(coupon_data)
                collection.add(coupon)
            except Exception as e:
                # Log error but continue processing other coupons
                print(f"Error parsing coupon {coupon_data.get('id', 'unknown')}: {e}")
                continue

        return collection

    def _create_coupon_from_data(self, data: Dict[str, Any]) -> Coupon:
        """Create a Coupon object from API data."""
        # Map API fields to our Coupon model
        coupon = Coupon(
            id=str(data.get("id", "")),
            name=data.get("name", ""),
            description=data.get("description"),
            coupon_type=self._map_coupon_type(data.get("couponType")),
            status=self._map_coupon_status(data.get("status")),
            clipped=data.get("isClipped", False),
            auto_clipped=data.get("isAutoClipped", False),
            discount_amount=data.get("discountAmount"),
            discount_type=data.get("discountType"),
            minimum_purchase=data.get("minimumPurchase"),
            redeem_amount=data.get("redeemAmount"),
            start_date=data.get("startDate"),
            end_date=data.get("endDate"),
            created_date=data.get("createdDate"),
            modified_date=data.get("modifiedDate"),
            product_ids=data.get("productIds", []),
            category=data.get("category"),
            department=data.get("department"),
            brand=data.get("brand"),
            image_url=data.get("imageUrl"),
            large_image_url=data.get("largeImageUrl"),
            terms_and_conditions=data.get("termsAndConditions"),
            restrictions=data.get("restrictions", []),
            metadata=data,
        )

        return coupon

    def _map_coupon_type(self, api_type: Optional[bool]) -> CouponType:
        """Map API coupon type to our enum."""
        if api_type is None:
            return CouponType.DIGITAL

        # For boolean manufacturerCoupon field, map to appropriate type
        if api_type:
            return CouponType.MANUFACTURER
        else:
            return CouponType.STORE

    def _map_coupon_status(self, api_status: Optional[bool]) -> CouponStatus:
        """Map API coupon status to our enum."""
        if api_status is None:
            return CouponStatus.ACTIVE

        # For boolean isClipped field, map to appropriate status
        if api_status:
            return CouponStatus.ACTIVE  # Clipped coupons are active
        else:
            return CouponStatus.ACTIVE  # Available coupons are also active

    def _map_discount_type(self, discount_type_id: Optional[int]) -> Optional[str]:
        """Map API discount type ID to string representation."""
        if discount_type_id is None:
            return None

        type_mapping = {
            1: "dollar",  # Fixed dollar amount off
            2: "percentage",  # Percentage off
            3: "bogo",  # Buy one get one
            4: "free",  # Free item
        }

        return type_mapping.get(discount_type_id, "unknown")

    def clip(self, coupon_id: str) -> bool:
        """Clip a specific coupon by ID."""
        try:
            response = self.client._make_request(
                "POST", f"/api/coupons/{coupon_id}/clip"
            )

            if response.get("success", False):
                # Update local cache
                if self._coupons_cache:
                    coupon = self._coupons_cache.get_by_id(coupon_id)
                    if coupon:
                        coupon.clip()
                return True

            return False

        except Exception as e:
            raise CouponError(f"Failed to clip coupon {coupon_id}: {e}")

    def unclip(self, coupon_id: str) -> bool:
        """Unclip a specific coupon by ID."""
        try:
            response = self.client._make_request(
                "POST", f"/api/coupons/{coupon_id}/unclip"
            )

            if response.get("success", False):
                # Update local cache
                if self._coupons_cache:
                    coupon = self._coupons_cache.get_by_id(coupon_id)
                    if coupon:
                        coupon.unclip()
                return True

            return False

        except Exception as e:
            raise CouponError(f"Failed to unclip coupon {coupon_id}: {e}")

    def clip_all_available(self) -> int:
        """Clip all available coupons. Returns count of clipped."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.clip_all()

    def unclip_all(self) -> int:
        """Unclip all clipped coupons. Returns count of unclipped."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.unclip_all()

    def get_by_department(self, department: str) -> CouponCollection:
        """Get coupons filtered by department."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.filter_by_department(department)

    def get_by_category(self, category: str) -> CouponCollection:
        """Get coupons filtered by category."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.filter_by_category(category)

    def get_clipped(self) -> CouponCollection:
        """Get all clipped coupons."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.filter_clipped(True)

    def get_available(self) -> CouponCollection:
        """Get all available (unclipped) coupons."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.filter_clipped(False)

    def search(self, query: str) -> CouponCollection:
        """Search coupons by name or description."""
        if not self._coupons_cache:
            self.refresh()

        query_lower = query.lower()
        filtered = [
            c
            for c in self._coupons_cache.coupons
            if (c.name and query_lower in c.name.lower())
            or (c.description and query_lower in c.description.lower())
        ]

        return CouponCollection(filtered)

    def get_stats(self) -> Dict[str, Any]:
        """Get coupon statistics."""
        if not self._coupons_cache:
            self.refresh()

        return {
            "total": len(self._coupons_cache),
            "clipped": self._coupons_cache.get_clipped_count(),
            "available": self._coupons_cache.get_available_count(),
            "active": len(self._coupons_cache.filter_active()),
            "expired": len(self._coupons_cache.filter_expired()),
        }

    def export_to_json(self, filepath: str) -> None:
        """Export coupons to JSON file."""
        if not self._coupons_cache:
            self.refresh()

        with open(filepath, "w") as f:
            json.dump(self._coupons_cache.to_list(), f, indent=2, default=str)

    def export_clipped_coupons(self, filepath: str) -> None:
        """Export only clipped coupons to JSON file."""
        if not self._coupons_cache:
            self.refresh()

        self._coupons_cache.export_clipped_coupons(filepath)

    def export_available_coupons(self, filepath: str) -> None:
        """Export only available (unclipped) coupons to JSON file."""
        if not self._coupons_cache:
            self.refresh()

        self._coupons_cache.export_available_coupons(filepath)

    def export_by_department(self, department: str, filepath: str) -> None:
        """Export coupons filtered by department to JSON file."""
        if not self._coupons_cache:
            self.refresh()

        self._coupons_cache.export_by_department(department, filepath)

    def import_from_json(self, filepath: str, overwrite_existing: bool = False) -> int:
        """Import coupons from JSON file."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.import_from_json(filepath, overwrite_existing)

    def create_backup(self, filepath: str) -> None:
        """Create a complete backup of all coupons with their current states."""
        if not self._coupons_cache:
            self.refresh()

        self._coupons_cache.create_backup(filepath)

    def restore_from_backup(self, filepath: str) -> int:
        """Restore coupons from a backup file."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.restore_from_backup(filepath)

    def share_clipped_coupons(
        self, filepath: str, include_metadata: bool = False
    ) -> None:
        """Export clipped coupons in a shareable format."""
        if not self._coupons_cache:
            self.refresh()

        self._coupons_cache.share_clipped_coupons(filepath, include_metadata)

    def import_shared_coupons(self, filepath: str, auto_clip: bool = True) -> int:
        """Import coupons from a shared file."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.import_shared_coupons(filepath, auto_clip)

    def clear_all_clipped(self) -> int:
        """Clear (unclip) all clipped coupons. Returns count of unclipped."""
        if not self._coupons_cache:
            self.refresh()

        return self._coupons_cache.unclip_all()

    def backup_and_clear(self, backup_filepath: str) -> int:
        """
        Create a backup of all coupons and then clear (unclip) all clipped ones.

        Args:
            backup_filepath: Path to save the backup file

        Returns:
            Number of coupons that were unclipped
        """
        if not self._coupons_cache:
            self.refresh()

        # Create backup first
        self._coupons_cache.create_backup(backup_filepath)

        # Then clear all clipped
        return self._coupons_cache.unclip_all()

    def restore_and_clip(self, backup_filepath: str) -> int:
        """
        Restore coupons from backup and automatically clip the ones that were previously clipped.

        Args:
            backup_filepath: Path to the backup file

        Returns:
            Number of coupons restored and clipped
        """
        if not self._coupons_cache:
            self.refresh()

        # Restore from backup
        self._coupons_cache.restore_from_backup(backup_filepath)

        # Count how many were clipped
        clipped_count = self._coupons_cache.get_clipped_count()

        return clipped_count

    def create_coupons_from_response(
        self, response_data: Dict[str, Any]
    ) -> List[Coupon]:
        """Create Coupon objects from API response data (for backward compatibility)."""
        try:
            # Try to extract coupons from various possible response structures
            coupons_data = []

            if "listOfCoupons" in response_data:
                coupons_data = response_data["listOfCoupons"]
            elif "offers" in response_data:
                coupons_data = response_data["offers"]
            elif "data" in response_data:
                coupons_data = response_data["data"]
            elif "coupons" in response_data:
                coupons_data = response_data["coupons"]
            elif "offerCollection" in response_data:
                coupons_data = response_data["offerCollection"]

            if not coupons_data:
                return []

            # Parse the coupons data with proper field mapping
            coupons = []
            for coupon_data in coupons_data:
                try:
                    # Extract data from the nested offer structure
                    offer_data = coupon_data.get("offer", {})

                    # Map the API fields to our Coupon model
                    coupon = Coupon(
                        id=str(
                            offer_data.get(
                                "meijerOfferId", coupon_data.get("id", "") or ""
                            )
                        ),
                        name=offer_data.get(
                            "title", coupon_data.get("title", "") or ""
                        ),
                        description=offer_data.get(
                            "description", coupon_data.get("description")
                        ),
                        coupon_type=self._map_coupon_type(
                            offer_data.get("manufacturerCoupon")
                        ),
                        status=self._map_coupon_status(coupon_data.get("isClipped")),
                        clipped=coupon_data.get("isClipped", False),
                        auto_clipped=coupon_data.get("isAutoClipped", False),
                        discount_amount=offer_data.get("redeemAmount"),
                        discount_type=self._map_discount_type(
                            offer_data.get("discountTypeId")
                        ),
                        minimum_purchase=offer_data.get("conditionValue"),
                        redeem_amount=offer_data.get("redeemAmount"),
                        start_date=offer_data.get("redemptionStartDate"),
                        end_date=offer_data.get("redemptionEndDate"),
                        created_date=offer_data.get("modifiedTs"),
                        modified_date=offer_data.get("modifiedTs"),
                        product_ids=[],  # Could be extracted from other fields if available
                        category=offer_data.get("category", {}).get("segmentName"),
                        department=offer_data.get("departments", [{}])[0].get(
                            "categoryName"
                        )
                        if offer_data.get("departments")
                        else None,
                        brand=None,  # Not available in this API response
                        image_url=offer_data.get("imageURL"),
                        large_image_url=offer_data.get("largeImageURL"),
                        terms_and_conditions=offer_data.get("termsAndConditions"),
                        restrictions=[],  # Could be extracted from other fields if available
                        metadata=coupon_data,
                    )
                    coupons.append(coupon)
                except Exception as e:
                    # Log error but continue processing other coupons
                    print(
                        f"Error parsing coupon {coupon_data.get('id', 'unknown')}: {e}"
                    )
                    continue

            return coupons

        except Exception as e:
            print(f"Error creating coupons from response: {e}")
            return []

    def __str__(self) -> str:
        """String representation of the coupon manager."""
        if self._coupons_cache:
            return str(self._coupons_cache)
        return "CouponManager(no coupons loaded)"

    def __repr__(self) -> str:
        """Detailed representation of the coupon manager."""
        return f"CouponManager(cache_size={len(self._coupons_cache) if self._coupons_cache else 0})"



