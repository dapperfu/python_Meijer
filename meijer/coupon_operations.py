"""
Coupon Operations for Meijer API Client
=======================================

This module contains the coupon-related operations that were moved from the main client
to reduce file size and improve organization.
"""

from typing import List, Optional

from .models import Coupon


class CouponOperations:
    """Handles coupon operations for the Meijer client."""

    def __init__(self, client):
        """Initialize with a reference to the main client."""
        self.client = client
        self.logger = client.logger

    def get_offers(
        self, store_id: Optional[str] = None, limit: int = 100
    ) -> List[Coupon]:
        """
        Get available offers/coupons.

        Args:
            store_id: Optional store ID for store-specific offers
            limit: Maximum number of offers to return

        Returns:
            List of Coupon objects
        """
        try:
            # Actual endpoint from APK analysis
            url = f"{self.client.api_base_url}/loyalty/mPerks/api/offers"

            # Request body based on APK analysis
            data = {
                "sortType": "BySuggested",
                "pageSize": min(limit, 9999),  # API limit from APK analysis
                "currentPage": 1,
                "offerClass": 1,
                "searchCriteria": "",
                "storeId": int(store_id) if store_id else 0,
                "ceilingCount": 0,
                "ceilingDuration": 0,
                "rewardCouponId": 0,
                "tagId": "",
                "getOfferCountPerDepartment": True,
                "upcList": [],
                "showClippedCoupons": True,
                "showOnlySpecialOffers": False,
                "showRedeemedOffers": False,
                "offerIds": [],
                "displayReasonFilters": [],
            }

            headers = self.client._get_api_headers()
            headers.update(
                {
                    "accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                    "content-type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                }
            )

            self.logger.info(
                f"Fetching offers with limit={limit}, store_id={store_id or 'any'}"
            )
            response = self.client._make_request(
                "POST", url, headers=headers, json_data=data
            )

            if response.status_code == 200:
                response_data = response.json()

                # Log response structure for debugging
                response_keys = (
                    list(response_data.keys())
                    if isinstance(response_data, dict)
                    else []
                )
                self.logger.debug(f"Offers API response keys: {response_keys}")

                # Check for total count information
                total_count = response_data.get("couponCount", 0)
                if total_count > 0:
                    self.logger.info(
                        f"API reports {total_count} total coupons available"
                    )

                coupons = self.client.coupons.create_meijer_coupons_from_response(
                    response_data
                )
                self.logger.info(
                    f"Successfully parsed {len(coupons)} coupons from response"
                )

                return coupons
            else:
                self.logger.warning(
                    f"Failed to get offers: {response.status_code} - {response.text[:200]}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting offers: {e}")
            return []

    def get_coupons(
        self, limit: int = 1000, use_pagination: bool = True
    ) -> List[Coupon]:
        """
        Get available coupons with improved pagination support.

        Args:
            limit: Maximum number of coupons to return (default: 1000 for all available)
            use_pagination: Whether to use pagination for large requests

        Returns:
            List of Coupon objects representing all available coupons
        """
        try:
            # Actual endpoint from APK analysis
            url = f"{self.client.api_base_url}/loyalty/mPerks/api/offers"

            if use_pagination and limit > 50:
                # Use pagination for large requests to get all available coupons
                all_coupons = []
                current_page = 1
                page_size = 50  # Optimal page size for the API
                total_coupons = None
                consecutive_empty_pages = 0
                max_empty_pages = 3  # Stop after 3 consecutive empty pages

                self.logger.info(f"Starting paginated coupon fetch (target: {limit})")

                while len(all_coupons) < limit:
                    data = {
                        "sortType": "BySuggested",
                        "pageSize": page_size,
                        "currentPage": current_page,
                        "offerClass": 1,
                        "searchCriteria": "",
                        "storeId": 0,
                        "ceilingCount": 0,
                        "ceilingDuration": 0,
                        "rewardCouponId": 0,
                        "tagId": "",
                        "getOfferCountPerDepartment": True,
                        "upcList": [],
                        "showClippedCoupons": True,
                        "showOnlySpecialOffers": False,
                        "showRedeemedOffers": False,
                        "offerIds": [],
                        "displayReasonFilters": [],
                    }

                    headers = self.client._get_api_headers()
                    headers.update(
                        {
                            "accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                            "content-type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                        }
                    )

                    response = self.client._make_request(
                        "POST", url, headers=headers, json_data=data
                    )

                    if response.status_code == 200:
                        page_data = response.json()

                        # Get total coupon count from first page
                        if total_coupons is None:
                            total_coupons = page_data.get("couponCount", 0)
                            self.logger.info(
                                f"Total coupons available: {total_coupons}"
                            )

                        page_coupons = (
                            self.client.coupons.create_meijer_coupons_from_response(
                                page_data
                            )
                        )

                        if not page_coupons:
                            consecutive_empty_pages += 1
                            self.logger.debug(
                                f"Page {current_page} returned no coupons (empty page {consecutive_empty_pages})"
                            )

                            if consecutive_empty_pages >= max_empty_pages:
                                self.logger.info(
                                    f"Stopping after {max_empty_pages} consecutive empty pages"
                                )
                                break
                        else:
                            consecutive_empty_pages = 0  # Reset counter
                            self.logger.debug(
                                f"Page {current_page}: {len(page_coupons)} coupons"
                            )

                        all_coupons.extend(page_coupons)

                        # Check if we've reached the limit
                        if len(all_coupons) >= limit:
                            all_coupons = all_coupons[:limit]
                            self.logger.info(f"Reached requested limit: {limit}")
                            break

                        # Check if we've reached the total available
                        if total_coupons and len(all_coupons) >= total_coupons:
                            self.logger.info(
                                f"Retrieved all available coupons: {total_coupons}"
                            )
                            break

                        current_page += 1

                        # Safety check to prevent infinite loops
                        if current_page > 100:  # Maximum reasonable page number
                            self.logger.warning(
                                "Reached maximum page limit, stopping pagination"
                            )
                            break

                    else:
                        self.logger.warning(
                            f"Failed to get coupons page {current_page}: {response.status_code}"
                        )
                        break

                self.logger.info(
                    f"Retrieved {len(all_coupons)} coupons using pagination (requested: {limit})"
                )
                return all_coupons
            else:
                # Single request for smaller limits or when pagination is disabled
                return self.get_offers(limit=limit)

        except Exception as e:
            self.logger.error(f"Error getting coupons: {e}")
            return []

    def get_all_coupons(self) -> List[Coupon]:
        """
        Get all available coupons using the most effective method.

        This method automatically determines the best approach to fetch all coupons:
        1. First tries a single high-limit request
        2. Falls back to pagination if needed
        3. Returns the maximum number of coupons available

        Returns:
            List of all available Coupon objects
        """
        try:
            self.logger.info("Fetching all available coupons...")

            # First try to get all coupons in a single request
            all_coupons = self.get_coupons(limit=1000, use_pagination=False)

            if len(all_coupons) >= 400:
                self.logger.info(
                    f"Single request successful: {len(all_coupons)} coupons"
                )
                return all_coupons

            # If single request didn't get enough, try pagination
            self.logger.info(
                "Single request didn't get enough coupons, trying pagination..."
            )
            paginated_coupons = self.get_coupons(limit=1000, use_pagination=True)

            if len(paginated_coupons) > len(all_coupons):
                self.logger.info(
                    f"Pagination successful: {len(paginated_coupons)} coupons"
                )
                return paginated_coupons
            else:
                self.logger.info(
                    f"Using single request result: {len(all_coupons)} coupons"
                )
                return all_coupons

        except Exception as e:
            self.logger.error(f"Error getting all coupons: {e}")
            return []
