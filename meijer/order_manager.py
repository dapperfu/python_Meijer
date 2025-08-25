"""
Order management for Meijer API client.

This module provides centralized management of order operations including
order history retrieval and order details.
"""

import logging
from typing import Any, Dict, List, Optional


class OrderManager:
    """
    Manages order operations for the Meijer API client.

    This class provides:
    - Order history retrieval
    - Order details
    - Order status tracking
    """

    def __init__(self, client):
        """
        Initialize the order manager.

        Args:
            client: Reference to the main Meijer client
        """
        self.client = client
        self.logger = logging.getLogger(__name__)

    def get_order_history(
        self, current_page: int = 0, page_size: int = 10, fields: str = "FULL"
    ) -> List[Dict[str, Any]]:
        """
        Get order history for the authenticated user.

        Args:
            current_page: Page number for pagination (0-based)
            page_size: Number of orders per page
            fields: Fields to include in response (FULL, BASIC, etc.)

        Returns:
            List of order information dictionaries
        """
        try:
            params = {
                "currentPage": current_page,
                "pageSize": page_size,
                "fields": fields,
            }

            response = self.client._make_request(
                "GET", self.client.config.get_api_url("orders"), params=params
            )

            if response and response.status_code == 200:
                data = response.json()
                return data.get("orders", [])
            else:
                self.logger.warning(
                    f"Failed to get order history: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error getting order history: {e}")
            return []

    def get_order_details(self, order_id: str) -> Optional[Dict[str, Any]]:
        """
        Get detailed information for a specific order.

        Args:
            order_id: ID of the order to retrieve

        Returns:
            Order details dictionary or None if not found
        """
        try:
            response = self.client._make_request(
                "GET", f"{self.client.config.get_api_url('orders')}/{order_id}"
            )

            if response and response.status_code == 200:
                return response.json()
            else:
                self.logger.warning(
                    f"Failed to get order details: {response.status_code if response else 'No response'}"
                )
                return None

        except Exception as e:
            self.logger.error(f"Error getting order details for {order_id}: {e}")
            return None

    def get_recent_orders(self, limit: int = 5) -> List[Dict[str, Any]]:
        """
        Get recent orders (first page with limited results).

        Args:
            limit: Maximum number of orders to return

        Returns:
            List of recent orders
        """
        return self.get_order_history(current_page=0, page_size=limit)

    def search_orders(
        self,
        start_date: Optional[str] = None,
        end_date: Optional[str] = None,
        status: Optional[str] = None,
    ) -> List[Dict[str, Any]]:
        """
        Search orders with filters.

        Args:
            start_date: Start date for search (YYYY-MM-DD format)
            end_date: End date for search (YYYY-MM-DD format)
            status: Order status filter

        Returns:
            List of matching orders
        """
        try:
            params = {}

            if start_date:
                params["startDate"] = start_date
            if end_date:
                params["endDate"] = end_date
            if status:
                params["status"] = status

            response = self.client._make_request(
                "GET", self.client.config.get_api_url("orders"), params=params
            )

            if response and response.status_code == 200:
                data = response.json()
                return data.get("orders", [])
            else:
                self.logger.warning(
                    f"Failed to search orders: {response.status_code if response else 'No response'}"
                )
                return []

        except Exception as e:
            self.logger.error(f"Error searching orders: {e}")
            return []

    def get_order_summary(self) -> Dict[str, Any]:
        """
        Get a summary of order statistics.

        Returns:
            Dictionary with order summary information
        """
        try:
            # Get first page to get total count
            orders = self.get_order_history(current_page=0, page_size=1)

            if not orders:
                return {"total_orders": 0, "recent_orders": []}

            # Get recent orders for summary
            recent_orders = self.get_recent_orders(limit=5)

            return {
                "total_orders": len(
                    orders
                ),  # This would need proper pagination to get actual total
                "recent_orders": recent_orders,
            }

        except Exception as e:
            self.logger.error(f"Error getting order summary: {e}")
            return {"total_orders": 0, "recent_orders": []}
