#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Advanced notification system for specialized shopping features
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, meijer package
 */

Advanced Notification System

This module provides comprehensive notification management including push notifications,
email alerts, SMS notifications, and in-app alerts for various shopping events.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional, Union
from datetime import datetime, timedelta
from enum import Enum
import json

from .exceptions import MeijerError


class NotificationType(Enum):
    """Notification type enumeration."""
    PUSH = "push"
    EMAIL = "email"
    SMS = "sms"
    IN_APP = "in_app"
    WEBHOOK = "webhook"


class NotificationCategory(Enum):
    """Notification category enumeration."""
    PRICE_DROP = "price_drop"
    BACK_IN_STOCK = "back_in_stock"
    ORDER_UPDATE = "order_update"
    DELIVERY_UPDATE = "delivery_update"
    PROMOTION = "promotion"
    COUPON_EXPIRY = "coupon_expiry"
    MPERKS_UPDATE = "mperks_update"
    CART_ABANDONMENT = "cart_abandonment"
    SHOPPING_REMINDER = "shopping_reminder"
    SYSTEM_ALERT = "system_alert"


class NotificationPriority(Enum):
    """Notification priority levels."""
    LOW = "low"
    NORMAL = "normal"
    HIGH = "high"
    URGENT = "urgent"


class NotificationStatus(Enum):
    """Notification delivery status."""
    PENDING = "pending"
    SENT = "sent"
    DELIVERED = "delivered"
    FAILED = "failed"
    CANCELLED = "cancelled"


@dataclass
class NotificationTemplate:
    """Notification template for consistent messaging."""
    
    template_id: str
    """Unique template identifier"""
    
    name: str
    """Template name"""
    
    title: str
    """Notification title"""
    
    body: str
    """Notification body text"""
    
    category: NotificationCategory
    """Notification category"""
    
    priority: NotificationPriority
    """Notification priority"""
    
    channels: List[NotificationType]
    """Supported notification channels"""
    
    variables: List[str] = field(default_factory=list)
    """Template variables for dynamic content"""
    
    is_active: bool = True
    """Whether template is active"""
    
    created_at: datetime = field(default_factory=datetime.now)
    """Template creation timestamp"""
    
    updated_at: datetime = field(default_factory=datetime.now)
    """Template last update timestamp"""


@dataclass
class NotificationPreference:
    """Customer notification preferences."""
    
    customer_id: str
    """Customer identifier"""
    
    email_enabled: bool = True
    """Whether email notifications are enabled"""
    
    push_enabled: bool = True
    """Whether push notifications are enabled"""
    
    sms_enabled: bool = False
    """Whether SMS notifications are enabled"""
    
    in_app_enabled: bool = True
    """Whether in-app notifications are enabled"""
    
    categories: Dict[NotificationCategory, bool] = field(default_factory=dict)
    """Category-specific preferences"""
    
    quiet_hours_start: Optional[str] = None
    """Quiet hours start time (HH:MM)"""
    
    quiet_hours_end: Optional[str] = None
    """Quiet hours end time (HH:MM)"""
    
    frequency_limit: Optional[int] = None
    """Maximum notifications per day"""
    
    last_updated: datetime = field(default_factory=datetime.now)
    """When preferences were last updated"""


@dataclass
class Notification:
    """Individual notification instance."""
    
    notification_id: str
    """Unique notification identifier"""
    
    customer_id: str
    """Customer identifier"""
    
    template_id: str
    """Template identifier"""
    
    category: NotificationCategory
    """Notification category"""
    
    priority: NotificationPriority
    """Notification priority"""
    
    title: str
    """Notification title"""
    
    body: str
    """Notification body"""
    
    data: Dict[str, Any] = field(default_factory=dict)
    """Additional notification data"""
    
    channels: List[NotificationType] = field(default_factory=list)
    """Target notification channels"""
    
    scheduled_for: Optional[datetime] = None
    """When notification should be sent"""
    
    expires_at: Optional[datetime] = None
    """When notification expires"""
    
    status: NotificationStatus = NotificationStatus.PENDING
    """Current notification status"""
    
    sent_at: Optional[datetime] = None
    """When notification was sent"""
    
    delivered_at: Optional[datetime] = None
    """When notification was delivered"""
    
    failure_reason: Optional[str] = None
    """Reason for delivery failure"""
    
    created_at: datetime = field(default_factory=datetime.now)
    """Notification creation timestamp"""


@dataclass
class NotificationDelivery:
    """Notification delivery attempt record."""
    
    delivery_id: str
    """Unique delivery identifier"""
    
    notification_id: str
    """Notification identifier"""
    
    channel: NotificationType
    """Delivery channel"""
    
    status: NotificationStatus
    """Delivery status"""
    
    attempt_count: int = 0
    """Number of delivery attempts"""
    
    max_attempts: int = 3
    """Maximum delivery attempts"""
    
    next_retry: Optional[datetime] = None
    """Next retry attempt time"""
    
    delivered_at: Optional[datetime] = None
    """When delivery was successful"""
    
    failure_reason: Optional[str] = None
    """Reason for delivery failure"""
    
    metadata: Dict[str, Any] = field(default_factory=dict)
    """Delivery metadata (device info, etc.)"""
    
    created_at: datetime = field(default_factory=datetime.now)
    """Delivery record creation timestamp")


class NotificationManager:
    """
    Advanced notification management system.
    
    This class provides comprehensive notification management including
    template management, delivery scheduling, and multi-channel support.
    """
    
    def __init__(self, client: Any):
        """
        Initialize the notification manager.
        
        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.base_url = "https://api.meijer.com"
        
        # Notification endpoints
        self.endpoints = {
            "send_notification": "/digital/notifications/v1/send",
            "get_notifications": "/digital/notifications/v1/customer/{customerId}/notifications",
            "update_preferences": "/digital/notifications/v1/customer/{customerId}/preferences",
            "get_templates": "/digital/notifications/v1/templates",
            "create_template": "/digital/notifications/v1/templates",
            "update_template": "/digital/notifications/v1/templates/{templateId}",
            "delete_template": "/digital/notifications/v1/templates/{templateId}",
            "schedule_notification": "/digital/notifications/v1/schedule",
            "cancel_notification": "/digital/notifications/v1/notifications/{notificationId}/cancel",
            "get_delivery_status": "/digital/notifications/v1/notifications/{notificationId}/status",
        }
        
        # Default notification templates
        self.default_templates = self._create_default_templates()
    
    def send_notification(self, 
                         customer_id: str,
                         template_id: str,
                         variables: Optional[Dict[str, Any]] = None,
                         channels: Optional[List[NotificationType]] = None,
                         priority: NotificationPriority = NotificationPriority.NORMAL,
                         scheduled_for: Optional[datetime] = None,
                         expires_at: Optional[datetime] = None) -> Notification:
        """
        Send a notification to a customer.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        template_id : str
            Template identifier
        variables : Optional[Dict[str, Any]], default=None
            Template variables for dynamic content
        channels : Optional[List[NotificationType]], default=None
            Target notification channels
        priority : NotificationPriority, default=NotificationPriority.NORMAL
            Notification priority
        scheduled_for : Optional[datetime], default=None
            When to send the notification
        expires_at : Optional[datetime], default=None
            When the notification expires
        
        Returns
        -------
        Notification
            Created notification instance
        
        Raises
        ------
        MeijerError
            If there's an error sending the notification
        """
        try:
            # Get template
            template = self.get_template(template_id)
            if not template:
                raise MeijerError(f"Template {template_id} not found")
            
            # Prepare notification data
            data = {
                "customerId": customer_id,
                "templateId": template_id,
                "variables": variables or {},
                "channels": [channel.value for channel in (channels or template.channels)],
                "priority": priority.value,
                "scheduledFor": scheduled_for.isoformat() if scheduled_for else None,
                "expiresAt": expires_at.isoformat() if expires_at else None
            }
            
            # Send notification
            response = self.client._make_request("POST", self.endpoints["send_notification"], json=data)
            
            if response:
                return self._parse_notification_response(response)
            
            raise MeijerError("Failed to send notification")
            
        except Exception as e:
            raise MeijerError(f"Failed to send notification: {str(e)}") from e
    
    def send_price_drop_alert(self, 
                             customer_id: str,
                             product_code: str,
                             product_name: str,
                             old_price: float,
                             new_price: float,
                             store_id: Optional[str] = None) -> Notification:
        """
        Send price drop alert notification.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        product_code : str
            Product identifier
        product_name : str
            Product name
        old_price : float
            Previous price
        new_price : float
            New lower price
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        Notification
            Price drop notification
        """
        variables = {
            "productCode": product_code,
            "productName": product_name,
            "oldPrice": f"${old_price:.2f}",
            "newPrice": f"${new_price:.2f}",
            "savings": f"${old_price - new_price:.2f}",
            "storeId": store_id or ""
        }
        
        return self.send_notification(
            customer_id=customer_id,
            template_id="price_drop_alert",
            variables=variables,
            priority=NotificationPriority.HIGH,
            channels=[NotificationType.PUSH, NotificationType.EMAIL]
        )
    
    def send_back_in_stock_alert(self, 
                                customer_id: str,
                                product_code: str,
                                product_name: str,
                                store_id: Optional[str] = None) -> Notification:
        """
        Send back in stock alert notification.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        product_code : str
            Product identifier
        product_name : str
            Product name
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        Notification
            Back in stock notification
        """
        variables = {
            "productCode": product_code,
            "productName": product_name,
            "storeId": store_id or ""
        }
        
        return self.send_notification(
            customer_id=customer_id,
            template_id="back_in_stock_alert",
            variables=variables,
            priority=NotificationPriority.NORMAL,
            channels=[NotificationType.PUSH, NotificationType.EMAIL]
        )
    
    def send_order_update_notification(self, 
                                     customer_id: str,
                                     order_id: str,
                                     order_number: str,
                                     status: str,
                                     estimated_delivery: Optional[datetime] = None) -> Notification:
        """
        Send order update notification.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        order_id : str
            Order identifier
        order_number : str
            Order number
        status : str
            Order status
        estimated_delivery : Optional[datetime], default=None
            Estimated delivery time
        
        Returns
        -------
        Notification
            Order update notification
        """
        variables = {
            "orderId": order_id,
            "orderNumber": order_number,
            "status": status,
            "estimatedDelivery": estimated_delivery.isoformat() if estimated_delivery else ""
        }
        
        return self.send_notification(
            customer_id=customer_id,
            template_id="order_update",
            variables=variables,
            priority=NotificationPriority.NORMAL,
            channels=[NotificationType.PUSH, NotificationType.EMAIL, NotificationType.SMS]
        )
    
    def send_coupon_expiry_reminder(self, 
                                   customer_id: str,
                                   coupon_id: str,
                                   coupon_description: str,
                                   expiry_date: datetime) -> Notification:
        """
        Send coupon expiry reminder notification.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        coupon_id : str
            Coupon identifier
        coupon_description : str
            Coupon description
        expiry_date : datetime
            Coupon expiry date
        
        Returns
        -------
        Notification
            Coupon expiry reminder
        """
        variables = {
            "couponId": coupon_id,
            "couponDescription": coupon_description,
            "expiryDate": expiry_date.strftime("%B %d, %Y"),
            "daysUntilExpiry": (expiry_date - datetime.now()).days
        }
        
        return self.send_notification(
            customer_id=customer_id,
            template_id="coupon_expiry_reminder",
            variables=variables,
            priority=NotificationPriority.HIGH,
            channels=[NotificationType.PUSH, NotificationType.EMAIL]
        )
    
    def schedule_shopping_reminder(self, 
                                  customer_id: str,
                                  reminder_time: datetime,
                                  store_id: Optional[str] = None) -> Notification:
        """
        Schedule a shopping reminder notification.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        reminder_time : datetime
            When to send the reminder
        store_id : Optional[str], default=None
            Store identifier
        
        Returns
        -------
        Notification
            Scheduled shopping reminder
        """
        variables = {
            "storeId": store_id or "",
            "reminderTime": reminder_time.strftime("%I:%M %p")
        }
        
        return self.send_notification(
            customer_id=customer_id,
            template_id="shopping_reminder",
            variables=variables,
            priority=NotificationPriority.LOW,
            scheduled_for=reminder_time,
            channels=[NotificationType.PUSH, NotificationType.EMAIL]
        )
    
    def get_customer_notifications(self, 
                                 customer_id: str,
                                 page: int = 1,
                                 page_size: int = 20,
                                 status: Optional[NotificationStatus] = None,
                                 category: Optional[NotificationCategory] = None) -> Dict[str, Any]:
        """
        Get customer notifications.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        page : int, default=1
            Page number
        page_size : int, default=20
            Notifications per page
        status : Optional[NotificationStatus], default=None
            Filter by notification status
        category : Optional[NotificationCategory], default=None
            Filter by notification category
        
        Returns
        -------
        Dict[str, Any]
            Notifications with pagination information
        """
        try:
            endpoint = self.endpoints["get_notifications"].format(customerId=customer_id)
            
            params = {
                "page": page,
                "pageSize": page_size
            }
            
            if status:
                params["status"] = status.value
            if category:
                params["category"] = category.value
            
            response = self.client._make_request("GET", endpoint, params=params)
            return response or {}
            
        except Exception as e:
            raise MeijerError(f"Failed to get customer notifications: {str(e)}") from e
    
    def update_customer_preferences(self, 
                                  customer_id: str,
                                  preferences: NotificationPreference) -> Dict[str, Any]:
        """
        Update customer notification preferences.
        
        Parameters
        ----------
        customer_id : str
            Customer identifier
        preferences : NotificationPreference
            Updated notification preferences
        
        Returns
        -------
        Dict[str, Any]
            Confirmation of preference update
        """
        try:
            endpoint = self.endpoints["update_preferences"].format(customerId=customer_id)
            
            # Convert preferences to API format
            data = {
                "emailEnabled": preferences.email_enabled,
                "pushEnabled": preferences.push_enabled,
                "smsEnabled": preferences.sms_enabled,
                "inAppEnabled": preferences.in_app_enabled,
                "categories": {cat.value: enabled for cat, enabled in preferences.categories.items()},
                "quietHoursStart": preferences.quiet_hours_start,
                "quietHoursEnd": preferences.quiet_hours_end,
                "frequencyLimit": preferences.frequency_limit
            }
            
            response = self.client._make_request("PUT", endpoint, json=data)
            return response
            
        except Exception as e:
            raise MeijerError(f"Failed to update notification preferences: {str(e)}") from e
    
    def get_template(self, template_id: str) -> Optional[NotificationTemplate]:
        """
        Get notification template by ID.
        
        Parameters
        ----------
        template_id : str
            Template identifier
        
        Returns
        -------
        Optional[NotificationTemplate]
            Template instance or None if not found
        """
        try:
            # Check default templates first
            if template_id in self.default_templates:
                return self.default_templates[template_id]
            
            # Try to get from API
            endpoint = self.endpoints["get_templates"]
            response = self.client._make_request("GET", endpoint, params={"templateId": template_id})
            
            if response and "templates" in response:
                for template_data in response["templates"]:
                    if template_data.get("templateId") == template_id:
                        return self._parse_template_response(template_data)
            
            return None
            
        except Exception as e:
            # Fall back to default templates
            return self.default_templates.get(template_id)
    
    def create_template(self, template: NotificationTemplate) -> NotificationTemplate:
        """
        Create a new notification template.
        
        Parameters
        ----------
        template : NotificationTemplate
            Template to create
        
        Returns
        -------
        NotificationTemplate
            Created template with ID
        """
        try:
            endpoint = self.endpoints["create_template"]
            
            data = {
                "name": template.name,
                "title": template.title,
                "body": template.body,
                "category": template.category.value,
                "priority": template.priority.value,
                "channels": [channel.value for channel in template.channels],
                "variables": template.variables,
                "isActive": template.is_active
            }
            
            response = self.client._make_request("POST", endpoint, json=data)
            
            if response:
                return self._parse_template_response(response)
            
            raise MeijerError("Failed to create template")
            
        except Exception as e:
            raise MeijerError(f"Failed to create template: {str(e)}") from e
    
    def cancel_notification(self, notification_id: str) -> bool:
        """
        Cancel a scheduled notification.
        
        Parameters
        ----------
        notification_id : str
            Notification identifier
        
        Returns
        -------
        bool
            True if successfully cancelled
        """
        try:
            endpoint = self.endpoints["cancel_notification"].format(notificationId=notification_id)
            
            response = self.client._make_request("POST", endpoint)
            return response is not None
            
        except Exception as e:
            raise MeijerError(f"Failed to cancel notification: {str(e)}") from e
    
    def get_delivery_status(self, notification_id: str) -> Dict[str, Any]:
        """
        Get notification delivery status.
        
        Parameters
        ----------
        notification_id : str
            Notification identifier
        
        Returns
        -------
        Dict[str, Any]
            Delivery status information
        """
        try:
            endpoint = self.endpoints["get_delivery_status"].format(notificationId=notification_id)
            
            response = self.client._make_request("GET", endpoint)
            return response or {}
            
        except Exception as e:
            raise MeijerError(f"Failed to get delivery status: {str(e)}") from e
    
    def _create_default_templates(self) -> Dict[str, NotificationTemplate]:
        """Create default notification templates."""
        templates = {}
        
        # Price drop alert template
        templates["price_drop_alert"] = NotificationTemplate(
            template_id="price_drop_alert",
            name="Price Drop Alert",
            title="Price Drop Alert! 🎉",
            body="Great news! {productName} is now on sale for {newPrice} (was {oldPrice}). You'll save {savings}!",
            category=NotificationCategory.PRICE_DROP,
            priority=NotificationPriority.HIGH,
            channels=[NotificationType.PUSH, NotificationType.EMAIL],
            variables=["productName", "newPrice", "oldPrice", "savings", "productCode", "storeId"]
        )
        
        # Back in stock alert template
        templates["back_in_stock_alert"] = NotificationTemplate(
            template_id="back_in_stock_alert",
            name="Back in Stock Alert",
            title="Back in Stock! 📦",
            body="{productName} is back in stock and ready for your order!",
            category=NotificationCategory.BACK_IN_STOCK,
            priority=NotificationPriority.NORMAL,
            channels=[NotificationType.PUSH, NotificationType.EMAIL],
            variables=["productName", "productCode", "storeId"]
        )
        
        # Order update template
        templates["order_update"] = NotificationTemplate(
            template_id="order_update",
            name="Order Update",
            title="Order Update - {orderNumber}",
            body="Your order status has been updated to: {status}. {estimatedDelivery}",
            category=NotificationCategory.ORDER_UPDATE,
            priority=NotificationPriority.NORMAL,
            channels=[NotificationType.PUSH, NotificationType.EMAIL, NotificationType.SMS],
            variables=["orderNumber", "status", "estimatedDelivery", "orderId"]
        )
        
        # Coupon expiry reminder template
        templates["coupon_expiry_reminder"] = NotificationTemplate(
            template_id="coupon_expiry_reminder",
            name="Coupon Expiry Reminder",
            title="Coupon Expires Soon! ⏰",
            body="Your coupon for {couponDescription} expires in {daysUntilExpiry} days on {expiryDate}. Use it before it's gone!",
            category=NotificationCategory.COUPON_EXPIRY,
            priority=NotificationPriority.HIGH,
            channels=[NotificationType.PUSH, NotificationType.EMAIL],
            variables=["couponDescription", "daysUntilExpiry", "expiryDate", "couponId"]
        )
        
        # Shopping reminder template
        templates["shopping_reminder"] = NotificationTemplate(
            template_id="shopping_reminder",
            name="Shopping Reminder",
            title="Shopping Reminder 🛒",
            body="Don't forget to check your shopping list! It's {reminderTime} and time to plan your trip.",
            category=NotificationCategory.SHOPPING_REMINDER,
            priority=NotificationPriority.LOW,
            channels=[NotificationType.PUSH, NotificationType.EMAIL],
            variables=["reminderTime", "storeId"]
        )
        
        return templates
    
    def _parse_notification_response(self, response: Dict[str, Any]) -> Notification:
        """Parse notification response."""
        try:
            return Notification(
                notification_id=response.get("notificationId", ""),
                customer_id=response.get("customerId", ""),
                template_id=response.get("templateId", ""),
                category=NotificationCategory(response.get("category", "system_alert")),
                priority=NotificationPriority(response.get("priority", "normal")),
                title=response.get("title", ""),
                body=response.get("body", ""),
                data=response.get("data", {}),
                channels=[NotificationType(ch) for ch in response.get("channels", [])],
                scheduled_for=self._parse_datetime(response.get("scheduledFor")),
                expires_at=self._parse_datetime(response.get("expiresAt")),
                status=NotificationStatus(response.get("status", "pending")),
                sent_at=self._parse_datetime(response.get("sentAt")),
                delivered_at=self._parse_datetime(response.get("deliveredAt")),
                failure_reason=response.get("failureReason"),
                created_at=self._parse_datetime(response.get("createdAt"))
            )
        except Exception as e:
            raise MeijerError(f"Failed to parse notification response: {str(e)}") from e
    
    def _parse_template_response(self, response: Dict[str, Any]) -> NotificationTemplate:
        """Parse template response."""
        try:
            return NotificationTemplate(
                template_id=response.get("templateId", ""),
                name=response.get("name", ""),
                title=response.get("title", ""),
                body=response.get("body", ""),
                category=NotificationCategory(response.get("category", "system_alert")),
                priority=NotificationPriority(response.get("priority", "normal")),
                channels=[NotificationType(ch) for ch in response.get("channels", [])],
                variables=response.get("variables", []),
                is_active=response.get("isActive", True),
                created_at=self._parse_datetime(response.get("createdAt")),
                updated_at=self._parse_datetime(response.get("updatedAt"))
            )
        except Exception as e:
            raise MeijerError(f"Failed to parse template response: {str(e)}") from e
    
    def _parse_datetime(self, datetime_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string safely."""
        if not datetime_str:
            return None
        
        try:
            return datetime.fromisoformat(datetime_str)
        except ValueError:
            return None
