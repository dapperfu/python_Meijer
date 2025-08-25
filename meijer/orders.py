#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Order management system for retrieving order history and status
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, meijer package
 */

Order Management System

This module provides order management capabilities including order history,
order status, and order details using the OCC v3 endpoints discovered in
the API analysis.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional
from datetime import datetime
from enum import Enum

from .exceptions import MeijerError


class OrderStatus(Enum):
    """Order status enumeration."""
    PENDING = "PENDING"
    CONFIRMED = "CONFIRMED"
    PROCESSING = "PROCESSING"
    READY = "READY"
    COMPLETED = "COMPLETED"
    CANCELLED = "CANCELLED"
    FAILED = "FAILED"


class OrderType(Enum):
    """Order type enumeration."""
    PICKUP = "PICKUP"
    DELIVERY = "DELIVERY"
    SHIP_TO_HOME = "SHIP_TO_HOME"


@dataclass
class OrderItem:
    """Order item information."""
    
    product_code: str
    """Product identifier (UPC, SKU, etc.)"""
    
    name: str
    """Product name"""
    
    quantity: int
    """Quantity ordered"""
    
    unit_price: float
    """Price per unit"""
    
    total_price: float
    """Total price for this item"""
    
    category: Optional[str] = None
    """Product category"""
    
    image_url: Optional[str] = None
    """Product image URL"""
    
    is_available: bool = True
    """Whether the item is available"""
    
    substitution_made: bool = False
    """Whether a substitution was made"""
    
    substitution_reason: Optional[str] = None
    """Reason for substitution if applicable"""


@dataclass
class OrderSummary:
    """Order summary information."""
    
    order_id: str
    """Unique order identifier"""
    
    order_number: str
    """Human-readable order number"""
    
    order_date: datetime
    """When the order was placed"""
    
    status: OrderStatus
    """Current order status"""
    
    order_type: OrderType
    """Type of order (pickup, delivery, etc.)"""
    
    store_id: str
    """Store where order was placed"""
    
    store_name: str
    """Store name"""
    
    total_items: int
    """Total number of items in order"""
    
    subtotal: float
    """Subtotal before taxes and fees"""
    
    tax_amount: float
    """Tax amount"""
    
    total_amount: float
    """Total amount including all fees"""
    
    delivery_fee: Optional[float] = None
    """Delivery fee if applicable"""
    
    estimated_pickup_time: Optional[datetime] = None
    """Estimated pickup time for pickup orders"""
    
    estimated_delivery_time: Optional[datetime] = None
    """Estimated delivery time for delivery orders"""
    
    customer_notes: Optional[str] = None
    """Customer notes for the order"""
    
    last_updated: datetime = field(default_factory=datetime.now)
    """When the order was last updated"""


@dataclass
class OrderDetails:
    """Complete order details."""
    
    summary: OrderSummary
    """Order summary information"""
    
    items: List[OrderItem]
    """Order items"""
    
    billing_address: Optional[Dict[str, Any]] = None
    """Billing address information"""
    
    shipping_address: Optional[Dict[str, Any]] = None
    """Shipping address information"""
    
    payment_method: Optional[Dict[str, Any]] = None
    """Payment method information"""
    
    loyalty_info: Optional[Dict[str, Any]] = None
    """Loyalty program information"""
    
    promotions_applied: List[Dict[str, Any]] = field(default_factory=list)
    """Promotions and discounts applied"""
    
    tracking_info: Optional[Dict[str, Any]] = None
    """Tracking information for delivery orders"""


class OrderManager:
    """
    Order management system using OCC v3 endpoints.
    
    This class provides comprehensive order management capabilities including
    order history, order details, and order status tracking.
    """
    
    def __init__(self, client: Any):
        """
        Initialize the order manager.
        
        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.base_url = "https://api.meijer.com"
        
        # OCC v3 order endpoints
        self.endpoints = {
            "get_orders": "/digital/occ/v3/orders",
            "get_order_details": "/digital/occ/v3/orders/{orderId}",
            "get_order_status": "/digital/occ/v3/orders/{orderId}/status",
            "cancel_order": "/digital/occ/v3/orders/{orderId}/cancel",
        }
    
    def get_orders(self, 
                   page: int = 0, 
                   page_size: int = 10,
                   fields: str = "FULL") -> Dict[str, Any]:
        """
        Retrieve order history using OCC v3 endpoint.
        
        This endpoint was hit 58 times and provides comprehensive order history
        with pagination support.
        
        Parameters
        ----------
        page : int, default=0
            Page number (0-based)
        page_size : int, default=10
            Number of orders per page
        fields : str, default="FULL"
            Fields to include in the response
        
        Returns
        -------
        Dict[str, Any]
            Order history with pagination information
        
        Raises
        ------
        MeijerError
            If there's an error retrieving orders
        """
        try:
            endpoint = self.endpoints["get_orders"]
            params = {
                "currentPage": page,
                "pageSize": page_size,
                "fields": fields
            }
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_orders_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get orders: {str(e)}") from e
    
    def get_order_details(self, order_id: str, fields: str = "FULL") -> OrderDetails:
        """
        Get detailed information for a specific order.
        
        Parameters
        ----------
        order_id : str
            Order identifier
        fields : str, default="FULL"
            Fields to include in the response
        
        Returns
        -------
        OrderDetails
            Complete order details
        
        Raises
        ------
        MeijerError
            If there's an error retrieving order details
        """
        try:
            endpoint = self.endpoints["get_order_details"].format(orderId=order_id)
            params = {"fields": fields}
            
            response = self.client._make_request("GET", endpoint, params=params)
            return self._parse_order_details_response(response)
            
        except Exception as e:
            raise MeijerError(f"Failed to get order details: {str(e)}") from e
    
    def get_order_status(self, order_id: str) -> OrderStatus:
        """
        Get current status for a specific order.
        
        Parameters
        ----------
        order_id : str
            Order identifier
        
        Returns
        -------
        OrderStatus
            Current order status
        
        Raises
        ------
        MeijerError
            If there's an error retrieving order status
        """
        try:
            endpoint = self.endpoints["get_order_status"].format(orderId=order_id)
            
            response = self.client._make_request("GET", endpoint)
            status_value = response.get("status", "UNKNOWN")
            
            try:
                return OrderStatus(status_value)
            except ValueError:
                # Handle unknown status values
                return OrderStatus.PENDING
        
        except Exception as e:
            raise MeijerError(f"Failed to get order status: {str(e)}") from e
    
    def cancel_order(self, order_id: str, reason: Optional[str] = None) -> Dict[str, Any]:
        """
        Cancel a specific order.
        
        Parameters
        ----------
        order_id : str
            Order identifier
        reason : Optional[str], default=None
            Reason for cancellation
        
        Returns
        -------
        Dict[str, Any]
            Cancellation confirmation
        
        Raises
        ------
        MeijerError
            If there's an error cancelling the order
        """
        try:
            endpoint = self.endpoints["cancel_order"].format(orderId=order_id)
            data = {}
            
            if reason:
                data["reason"] = reason
            
            response = self.client._make_request("POST", endpoint, json=data)
            return response
            
        except Exception as e:
            raise MeijerError(f"Failed to cancel order: {str(e)}") from e
    
    def _parse_orders_response(self, response: Dict[str, Any]) -> Dict[str, Any]:
        """
        Parse the orders response from the API.
        
        Parameters
        ----------
        response : Dict[str, Any]
            Raw API response
        
        Returns
        -------
        Dict[str, Any]
            Parsed and structured orders data
        """
        try:
            orders = []
            if "orders" in response:
                for order_data in response["orders"]:
                    order = self._parse_order_summary(order_data)
                    orders.append(order)
            
            pagination = {
                "current_page": response.get("pagination", {}).get("currentPage", 0),
                "page_size": response.get("pagination", {}).get("pageSize", 10),
                "total_pages": response.get("pagination", {}).get("totalPages", 0),
                "total_orders": response.get("pagination", {}).get("totalCount", 0)
            }
            
            return {
                "orders": [self._order_summary_to_dict(order) for order in orders],
                "pagination": pagination,
                "raw_response": response
            }
            
        except Exception as e:
            raise MeijerError(f"Failed to parse orders response: {str(e)}") from e
    
    def _parse_order_summary(self, order_data: Dict[str, Any]) -> OrderSummary:
        """Parse order summary from API response."""
        try:
            return OrderSummary(
                order_id=order_data.get("code", ""),
                order_number=order_data.get("orderNumber", ""),
                order_date=datetime.fromisoformat(order_data.get("created", datetime.now().isoformat())),
                status=OrderStatus(order_data.get("status", "PENDING")),
                order_type=OrderType(order_data.get("orderType", "PICKUP")),
                store_id=order_data.get("store", {}).get("uid", ""),
                store_name=order_data.get("store", {}).get("name", ""),
                total_items=order_data.get("totalItems", 0),
                subtotal=order_data.get("subTotal", {}).get("value", 0),
                tax_amount=order_data.get("totalTax", {}).get("value", 0),
                delivery_fee=order_data.get("deliveryCost", {}).get("value"),
                total_amount=order_data.get("totalPrice", {}).get("value", 0),
                estimated_pickup_time=self._parse_datetime(order_data.get("estimatedPickupTime")),
                estimated_delivery_time=self._parse_datetime(order_data.get("estimatedDeliveryTime")),
                customer_notes=order_data.get("customerNotes"),
                last_updated=datetime.fromisoformat(order_data.get("updated", datetime.now().isoformat()))
            )
        except Exception as e:
            raise MeijerError(f"Failed to parse order summary: {str(e)}") from e
    
    def _parse_order_details_response(self, response: Dict[str, Any]) -> OrderDetails:
        """Parse order details from API response."""
        try:
            # Parse order summary
            summary = self._parse_order_summary(response)
            
            # Parse order items
            items = []
            if "entries" in response:
                for entry in response["entries"]:
                    item = OrderItem(
                        product_code=entry.get("product", {}).get("code", ""),
                        name=entry.get("product", {}).get("name", ""),
                        quantity=entry.get("quantity", 0),
                        unit_price=entry.get("basePrice", {}).get("value", 0),
                        total_price=entry.get("totalPrice", {}).get("value", 0),
                        category=entry.get("product", {}).get("categories", [{}])[0].get("name"),
                        image_url=entry.get("product", {}).get("images", [{}])[0].get("url"),
                        is_available=entry.get("available", True),
                        substitution_made=entry.get("substitutionMade", False),
                        substitution_reason=entry.get("substitutionReason")
                    )
                    items.append(item)
            
            # Parse additional details
            billing_address = response.get("billingAddress")
            shipping_address = response.get("shippingAddress")
            payment_method = response.get("paymentMethod")
            loyalty_info = response.get("loyaltyInfo")
            promotions_applied = response.get("promotionsApplied", [])
            tracking_info = response.get("trackingInfo")
            
            return OrderDetails(
                summary=summary,
                items=items,
                billing_address=billing_address,
                shipping_address=shipping_address,
                payment_method=payment_method,
                loyalty_info=loyalty_info,
                promotions_applied=promotions_applied,
                tracking_info=tracking_info
            )
            
        except Exception as e:
            raise MeijerError(f"Failed to parse order details: {str(e)}") from e
    
    def _parse_datetime(self, datetime_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string safely."""
        if not datetime_str:
            return None
        
        try:
            return datetime.fromisoformat(datetime_str)
        except ValueError:
            return None
    
    def _order_summary_to_dict(self, order: OrderSummary) -> Dict[str, Any]:
        """Convert OrderSummary to dictionary."""
        return {
            "order_id": order.order_id,
            "order_number": order.order_number,
            "order_date": order.order_date.isoformat(),
            "status": order.status.value,
            "order_type": order.order_type.value,
            "store_id": order.store_id,
            "store_name": order.store_name,
            "total_items": order.total_items,
            "subtotal": order.subtotal,
            "tax_amount": order.tax_amount,
            "delivery_fee": order.delivery_fee,
            "total_amount": order.total_amount,
            "estimated_pickup_time": order.estimated_pickup_time.isoformat() if order.estimated_pickup_time else None,
            "estimated_delivery_time": order.estimated_delivery_time.isoformat() if order.estimated_delivery_time else None,
            "customer_notes": order.customer_notes,
            "last_updated": order.last_updated.isoformat()
        }
