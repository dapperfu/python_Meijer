#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2025-08-22
 * Context: Comprehensive account management module based on log analysis
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, dataclasses, meijer package
 */

Account Management Module

This module provides comprehensive account management capabilities including
profile management, preferences, receipts, orders, savings tracking, and
other account-related features discovered through log analysis.
"""

from dataclasses import dataclass
from typing import Any, Dict, List, Optional
from datetime import datetime
from enum import Enum

from .models.base import BaseModel


class AccountStatus(Enum):
    """Account status enumeration."""

    ACTIVE = "Active"
    INACTIVE = "Inactive"
    SUSPENDED = "Suspended"
    PENDING = "Pending"


class ReceiptFormat(Enum):
    """Receipt format enumeration."""

    PDF = "pdf"
    HTML = "html"
    TEXT = "text"


@dataclass
class AccountProfile(BaseModel):
    """User account profile information."""

    account_id: int
    """Unique account identifier"""

    first_name: str
    """User's first name"""

    last_name: str
    """User's last name"""

    email: str
    """Primary email address"""

    zip_code: str
    """ZIP code for location"""

    store_id: int
    """Preferred store ID"""

    account_status: str
    """Current account status"""

    mperks_id: int
    """mPerks loyalty program ID"""

    mperks_phone: int
    """Phone number associated with mPerks"""

    mperks_shopper_id: int
    """mPerks shopper identifier"""

    mperks_external_shopper_id: str
    """External shopper ID for mPerks"""

    mperks_pin: str
    """mPerks PIN code"""

    mperks_store_id: int
    """Store ID for mPerks"""

    mperks_status: str
    """mPerks program status"""

    eguest_id: int
    """eGuest program ID"""

    employee_id: int
    """Employee ID if applicable"""

    employee_store_id: int
    """Employee store ID"""

    epanel_id: int
    """ePanel ID"""

    epanel_status: str
    """ePanel status"""

    created_date: datetime
    """Account creation date"""

    created_by: str
    """Who created the account"""

    updated_date: datetime
    """Last update date"""

    updated_by: str
    """Who last updated the account"""

    upgrade_email: Optional[str] = None
    """Upgrade email address if different"""

    birth_date: Optional[datetime] = None
    """User's birth date"""

    eguest_status: Optional[str] = None
    """eGuest program status"""

    employee_status: Optional[str] = None
    """Employee status"""

    vehicle_information: Optional[str] = None
    """Vehicle information for fuel rewards"""

    loyalty_card_number: Optional[str] = None
    """Loyalty card number"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "AccountProfile":
        """Create AccountProfile from API response."""
        return cls(
            account_id=data.get("accountId", 0),
            first_name=data.get("firstName", ""),
            last_name=data.get("lastName", ""),
            email=data.get("email", ""),
            upgrade_email=data.get("upgradeEmail"),
            birth_date=cls._parse_datetime(data.get("birthDate")),
            zip_code=data.get("zip", ""),
            store_id=data.get("storeId", 0),
            account_status=data.get("accountStatus", ""),
            mperks_id=data.get("mPerksId", 0),
            mperks_phone=data.get("mPerksPhone", 0),
            mperks_shopper_id=data.get("mPerksShopperId", 0),
            mperks_external_shopper_id=data.get("mPerksExternalShopperId", ""),
            mperks_pin=data.get("mPerksPin", ""),
            mperks_store_id=data.get("mPerksStoreId", 0),
            mperks_status=data.get("mPerkStatus", ""),
            eguest_id=data.get("eGuestId", 0),
            eguest_status=data.get("eGuestStatus"),
            employee_id=data.get("employeeId", 0),
            employee_store_id=data.get("employeeStoreId", 0),
            employee_status=data.get("employeeStatus"),
            epanel_id=data.get("ePanelId", 0),
            epanel_status=data.get("ePanelStatus", ""),
            created_date=cls._parse_datetime(data.get("createdDate")),
            created_by=data.get("createdBy", ""),
            updated_date=cls._parse_datetime(data.get("updatedDate")),
            updated_by=data.get("updatedBy", ""),
            vehicle_information=data.get("vehicleInformation"),
            loyalty_card_number=data.get("loyaltyCardNumber"),
        )

    @staticmethod
    def _parse_datetime(date_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string from API response."""
        if not date_str:
            return None
        try:
            return datetime.fromisoformat(date_str.replace("Z", "+00:00"))
        except ValueError:
            return None


@dataclass
class Receipt(BaseModel):
    """Receipt information."""

    receipt_id: str
    """Unique receipt identifier"""

    order_id: str
    """Associated order ID"""

    order_number: str
    """Order number"""

    store_id: int
    """Store where purchase was made"""

    store_name: str
    """Store name"""

    transaction_date: datetime
    """Transaction date and time"""

    total_amount: float
    """Total transaction amount"""

    tax_amount: float
    """Tax amount"""

    subtotal: float
    """Subtotal before tax"""

    payment_method: str
    """Payment method used"""

    receipt_url: Optional[str] = None
    """URL to download receipt"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "Receipt":
        """Create Receipt from API response."""
        return cls(
            receipt_id=data.get("receiptId", ""),
            order_id=data.get("orderId", ""),
            order_number=data.get("orderNumber", ""),
            store_id=data.get("storeId", 0),
            store_name=data.get("storeName", ""),
            transaction_date=cls._parse_datetime(data.get("transactionDate")),
            total_amount=data.get("totalAmount", 0.0),
            tax_amount=data.get("taxAmount", 0.0),
            subtotal=data.get("subtotal", 0.0),
            payment_method=data.get("paymentMethod", ""),
            receipt_url=data.get("receiptUrl"),
        )

    @staticmethod
    def _parse_datetime(date_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string from API response."""
        if not date_str:
            return None
        try:
            return datetime.fromisoformat(date_str.replace("Z", "+00:00"))
        except ValueError:
            return None

    def save(self, file_path: str, format: ReceiptFormat = ReceiptFormat.PDF) -> bool:
        """
        Save receipt to file.

        This method provides a convenient way to download and save the receipt.
        Usage: receipt = client.account.receipts[0]; receipt.save("foo.pdf")

        Parameters
        ----------
        file_path : str
            Path where to save the receipt file
        format : ReceiptFormat, optional
            Receipt format, by default ReceiptFormat.PDF

        Returns
        -------
        bool
            True if download was successful, False otherwise
        """
        # We need access to the account manager to download
        # This will be set by the AccountManager when creating Receipt objects
        if hasattr(self, "_account_manager") and self._account_manager:
            return self._account_manager.download_receipt(
                self.receipt_id, file_path, format
            )
        else:
            raise RuntimeError(
                "Receipt object is not associated with an AccountManager. Use account.download_receipt() instead."
            )


@dataclass
class SavingsSummary(BaseModel):
    """Savings summary information."""

    total_savings: float
    """Total savings amount"""

    mperks_savings: float
    """Savings from mPerks program"""

    digital_coupon_savings: float
    """Savings from digital coupons"""

    store_savings: float
    """Store-specific savings"""

    period_start: datetime
    """Start of savings period"""

    period_end: datetime
    """End of savings period"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "SavingsSummary":
        """Create SavingsSummary from API response."""
        return cls(
            total_savings=data.get("totalSavings", 0.0),
            mperks_savings=data.get("mPerksSavings", 0.0),
            digital_coupon_savings=data.get("digitalCouponSavings", 0.0),
            store_savings=data.get("storeSavings", 0.0),
            period_start=cls._parse_datetime(data.get("periodStart")),
            period_end=cls._parse_datetime(data.get("periodEnd")),
        )

    @staticmethod
    def _parse_datetime(date_str: Optional[str]) -> Optional[datetime]:
        """Parse datetime string from API response."""
        if not date_str:
            return None
        try:
            return datetime.fromisoformat(date_str.replace("Z", "+00:00"))
        except ValueError:
            return None


class AccountManager:
    """
    Comprehensive account management system.

    This class provides account management capabilities including profile
    management, preferences, receipts, orders, savings tracking, and
    other account-related features.
    """

    def __init__(self, client: Any):
        """
        Initialize the account manager.

        Parameters
        ----------
        client : Any
            Meijer client instance for making API requests
        """
        self.client = client
        self.logger = getattr(client, "logger", None)

        # Cache for frequently accessed data
        self._receipts_cache: Optional[List[Receipt]] = None
        self._savings_cache: Optional[SavingsSummary] = None
        self._profile_cache: Optional[AccountProfile] = None

        # Account endpoints discovered from log analysis
        self.endpoints = {
            # Profile management
            "get_account": "/loyalty/accounts/accounts/getAccount",
            "update_account": "/loyalty/accounts/updateAccount",
            # Shop & Scan functionality
            "is_shop_scan_enabled": "/dgtlmma/accounts/isShopAndScanEnabled",
            "get_mperks_barcode": "/dgtlmma/accounts/mPerksBarcodeValue",
            # Receipts
            "get_receipts": "/digital/occ/v3/receipts",
            "get_receipt": "/digital/occ/v3/receipts/{receiptId}",
            "download_receipt": "/digital/occ/v3/receipts/{receiptId}/download",
            # Orders
            "get_orders": "/digital/occ/v3/orders",
            "get_order_details": "/digital/occ/v3/orders/{orderId}",
            # Savings
            "get_savings_summary": "/loyalty/accounts/savings/summary",
            "get_savings_history": "/loyalty/accounts/savings/history",
            # Preferences
            "get_preferences": "/loyalty/accounts/preferences/getCustomerPreferences",
            "update_preference": "/loyalty/accounts/preferences/updateCustomerPreference",
            # Vehicle information
            "get_vehicle_info": "/loyalty/accounts/getVehicleInformation",
            "update_vehicle_info": "/loyalty/accounts/updateVehicleInformation",
        }

    @property
    def receipts(self) -> List[Receipt]:
        """
        Get cached receipts list.

        This property provides easy access to receipts with automatic caching.
        Usage: receipt = client.account.receipts[0]

        Returns
        -------
        List[Receipt]
            List of receipt objects
        """
        if self._receipts_cache is None:
            self._receipts_cache = self.get_receipts()
        return self._receipts_cache

    @property
    def savings(self) -> Optional[SavingsSummary]:
        """
        Get cached savings summary.

        This property provides easy access to savings data with automatic caching.
        Usage: total = client.account.savings.total_savings

        Returns
        -------
        SavingsSummary or None
            Savings summary if available
        """
        if self._savings_cache is None:
            self._savings_cache = self.get_savings_summary()
        return self._savings_cache

    @property
    def profile(self) -> Optional[AccountProfile]:
        """
        Get cached account profile.

        This property provides easy access to profile data with automatic caching.
        Usage: name = client.account.profile.first_name

        Returns
        -------
        AccountProfile or None
            Account profile if available
        """
        if self._profile_cache is None:
            self._profile_cache = self.get_profile()
        return self._profile_cache

    def refresh_cache(self) -> None:
        """
        Clear all cached data to force fresh API calls.

        This method clears the internal cache for receipts, savings, and profile
        data, ensuring the next property access will fetch fresh data from the API.
        """
        self._receipts_cache = None
        self._savings_cache = None
        self._profile_cache = None

        if self.logger:
            self.logger.info("🔄 Account cache cleared")

    def get_profile(self) -> Optional[AccountProfile]:
        """
        Get current account profile.

        Returns
        -------
        AccountProfile or None
            Account profile information if successful, None otherwise
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting account profile...")

            response = self.client._make_request(
                "GET", f"{self.client.api_base_url}{self.endpoints['get_account']}"
            )

            if response.status_code == 200:
                data = response.json()
                profile = AccountProfile.from_api_response(data)
                if self.logger:
                    self.logger.info("✅ Account profile retrieved successfully")
                return profile
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get profile: {response.status_code}"
                    )
                return None

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting account profile: {e}")
            return None

    def update_profile(self, updates: Dict[str, Any]) -> bool:
        """
        Update account profile information.

        Parameters
        ----------
        updates : Dict[str, Any]
            Dictionary of fields to update

        Returns
        -------
        bool
            True if update was successful, False otherwise
        """
        try:
            if self.logger:
                self.logger.info("🔧 Updating account profile...")

            # Get current profile
            current_profile = self.get_profile()
            if not current_profile:
                if self.logger:
                    self.logger.error("❌ Could not get current profile")
                return False

            # Merge current data with updates
            payload = current_profile.to_dict()
            payload.update(updates)
            payload["updatedBy"] = str(current_profile.account_id)

            response = self.client._make_request(
                "POST",
                f"{self.client.api_base_url}{self.endpoints['update_account']}",
                json_data=payload,
            )

            if response.status_code == 200:
                data = response.json()
                if data.get("success"):
                    if self.logger:
                        self.logger.info("✅ Profile updated successfully")
                    return True
                else:
                    if self.logger:
                        self.logger.warning("⚠️ Profile update returned success=false")
                    return False
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to update profile: {response.status_code}"
                    )
                return False

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error updating profile: {e}")
            return False

    def is_shop_scan_enabled(self) -> bool:
        """
        Check if Shop & Scan functionality is enabled for the account.

        Returns
        -------
        bool
            True if Shop & Scan is enabled, False otherwise
        """
        try:
            if self.logger:
                self.logger.info("🔍 Checking Shop & Scan status...")

            # Get account ID from profile
            profile = self.get_profile()
            if not profile:
                return False

            payload = {"guid": profile.mperks_external_shopper_id}

            response = self.client._make_request(
                "POST",
                f"{self.client.api_base_url}{self.endpoints['is_shop_scan_enabled']}",
                json_data=payload,
            )

            if response.status_code == 200:
                result = response.json()
                if self.logger:
                    self.logger.info(f"✅ Shop & Scan enabled: {result}")
                return bool(result)
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to check Shop & Scan: {response.status_code}"
                    )
                return False

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error checking Shop & Scan: {e}")
            return False

    def get_mperks_barcode(self) -> Optional[str]:
        """
        Get mPerks barcode value for the account.

        Returns
        -------
        str or None
            mPerks barcode value if successful, None otherwise
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting mPerks barcode...")

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['get_mperks_barcode']}",
            )

            if response.status_code == 200:
                data = response.json()
                barcode = data.get("barcodeValue")
                if self.logger:
                    self.logger.info("✅ mPerks barcode retrieved successfully")
                return barcode
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get barcode: {response.status_code}"
                    )
                return None

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting mPerks barcode: {e}")
            return None

    def get_receipts(self, page: int = 0, page_size: int = 10) -> List[Receipt]:
        """
        Get list of receipts for the account.

        Parameters
        ----------
        page : int, optional
            Page number for pagination, by default 0
        page_size : int, optional
            Number of receipts per page, by default 10

        Returns
        -------
        List[Receipt]
            List of receipt objects
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting receipts...")

            params = {"currentPage": page, "pageSize": page_size, "fields": "FULL"}

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['get_receipts']}",
                params=params,
            )

            if response.status_code == 200:
                data = response.json()
                receipts = [
                    Receipt.from_api_response(receipt)
                    for receipt in data.get("receipts", [])
                ]

                # Associate each receipt with this account manager for the save() method
                for receipt in receipts:
                    receipt._account_manager = self

                if self.logger:
                    self.logger.info(f"✅ Found {len(receipts)} receipts")
                return receipts
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get receipts: {response.status_code}"
                    )
                return []

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting receipts: {e}")
            return []

    def get_receipt(self, receipt_id: str) -> Optional[Receipt]:
        """
        Get specific receipt details.

        Parameters
        ----------
        receipt_id : str
            Receipt identifier

        Returns
        -------
        Receipt or None
            Receipt details if successful, None otherwise
        """
        try:
            if self.logger:
                self.logger.info(f"🔍 Getting receipt {receipt_id}...")

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['get_receipt'].format(receiptId=receipt_id)}",
            )

            if response.status_code == 200:
                data = response.json()
                receipt = Receipt.from_api_response(data)

                # Associate receipt with this account manager for the save() method
                receipt._account_manager = self

                if self.logger:
                    self.logger.info("✅ Receipt details retrieved successfully")
                return receipt
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get receipt: {response.status_code}"
                    )
                return None

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting receipt: {e}")
            return None

    def download_receipt(
        self, receipt_id: str, file_path: str, format: ReceiptFormat = ReceiptFormat.PDF
    ) -> bool:
        """
        Download receipt in specified format.

        Parameters
        ----------
        receipt_id : str
            Receipt identifier
        file_path : str
            Path where to save the receipt file
        format : ReceiptFormat, optional
            Receipt format, by default ReceiptFormat.PDF

        Returns
        -------
        bool
            True if download was successful, False otherwise
        """
        try:
            if self.logger:
                self.logger.info(
                    f"📥 Downloading receipt {receipt_id} as {format.value}..."
                )

            params = {"format": format.value}

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['download_receipt'].format(receiptId=receipt_id)}",
                params=params,
            )

            if response.status_code == 200:
                # Save the file
                with open(file_path, "wb") as f:
                    f.write(response.content)

                if self.logger:
                    self.logger.info(f"✅ Receipt downloaded to {file_path}")
                return True
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to download receipt: {response.status_code}"
                    )
                return False

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error downloading receipt: {e}")
            return False

    def get_orders(self, page: int = 0, page_size: int = 10) -> Dict[str, Any]:
        """
        Get order history for the account.

        Parameters
        ----------
        page : int, optional
            Page number for pagination, by default 0
        page_size : int, optional
            Number of orders per page, by default 10

        Returns
        -------
        Dict[str, Any]
            Order history data with pagination
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting order history...")

            params = {"currentPage": page, "pageSize": page_size, "fields": "FULL"}

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['get_orders']}",
                params=params,
            )

            if response.status_code == 200:
                data = response.json()
                if self.logger:
                    self.logger.info(f"✅ Found {len(data.get('orders', []))} orders")
                return data
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get orders: {response.status_code}"
                    )
                return {}

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting orders: {e}")
            return {}

    def get_order_details(self, order_id: str) -> Optional[Dict[str, Any]]:
        """
        Get detailed information for a specific order.

        Parameters
        ----------
        order_id : str
            Order identifier

        Returns
        -------
        Dict[str, Any] or None
            Order details if successful, None otherwise
        """
        try:
            if self.logger:
                self.logger.info(f"🔍 Getting order details for {order_id}...")

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['get_order_details'].format(orderId=order_id)}",
            )

            if response.status_code == 200:
                data = response.json()
                if self.logger:
                    self.logger.info("✅ Order details retrieved successfully")
                return data
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get order details: {response.status_code}"
                    )
                return None

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting order details: {e}")
            return None

    def get_savings_summary(self) -> Optional[SavingsSummary]:
        """
        Get savings summary for the account.

        Returns
        -------
        SavingsSummary or None
            Savings summary if successful, None otherwise
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting savings summary...")

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['get_savings_summary']}",
            )

            if response.status_code == 200:
                data = response.json()
                summary = SavingsSummary.from_api_response(data)
                if self.logger:
                    self.logger.info("✅ Savings summary retrieved successfully")
                return summary
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get savings: {response.status_code}"
                    )
                return None

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting savings summary: {e}")
            return None

    def get_savings_history(
        self, page: int = 0, page_size: int = 10
    ) -> List[SavingsSummary]:
        """
        Get savings history for the account.

        Parameters
        ----------
        page : int, optional
            Page number for pagination, by default 0
        page_size : int, optional
            Number of entries per page, by default 10

        Returns
        -------
        List[SavingsSummary]
            List of savings summary objects
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting savings history...")

            params = {"currentPage": page, "pageSize": page_size}

            response = self.client._make_request(
                "GET",
                f"{self.client.api_base_url}{self.endpoints['get_savings_history']}",
                params=params,
            )

            if response.status_code == 200:
                data = response.json()
                history = [
                    SavingsSummary.from_api_response(entry)
                    for entry in data.get("savings", [])
                ]
                if self.logger:
                    self.logger.info(f"✅ Found {len(history)} savings entries")
                return history
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get savings history: {response.status_code}"
                    )
                return []

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting savings history: {e}")
            return []

    def get_preferences(self) -> List[Dict[str, Any]]:
        """
        Get customer preferences.

        Returns
        -------
        List[Dict[str, Any]]
            List of preference objects
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting customer preferences...")

            response = self.client._make_request(
                "GET", f"{self.client.api_base_url}{self.endpoints['get_preferences']}"
            )

            if response.status_code == 200:
                data = response.json()
                if self.logger:
                    self.logger.info(f"✅ Found {len(data)} preferences")
                return data
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get preferences: {response.status_code}"
                    )
                return []

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting preferences: {e}")
            return []

    def update_preference(
        self,
        preference_type: str,
        preference_value: str,
        owning_program: str = "DigitalGrocery",
    ) -> bool:
        """
        Update a customer preference.

        Parameters
        ----------
        preference_type : str
            Type of preference to update
        preference_value : str
            New preference value
        owning_program : str, optional
            Program that owns the preference, by default "DigitalGrocery"

        Returns
        -------
        bool
            True if update was successful, False otherwise
        """
        try:
            if self.logger:
                self.logger.info(f"🔧 Updating preference {preference_type}...")

            # Get account ID from profile
            profile = self.get_profile()
            if not profile:
                return False

            payload = {
                "owningProgramName": owning_program,
                "preferenceTypeName": preference_type,
                "preferenceValue": preference_value,
                "digitalAccountId": profile.account_id,
            }

            response = self.client._make_request(
                "POST",
                f"{self.client.api_base_url}{self.endpoints['update_preference']}",
                json_data=payload,
            )

            if response.status_code == 200:
                if self.logger:
                    self.logger.info("✅ Preference updated successfully")
                return True
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to update preference: {response.status_code}"
                    )
                return False

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error updating preference: {e}")
            return False

    def get_vehicle_information(self) -> Optional[Dict[str, Any]]:
        """
        Get vehicle information for fuel rewards.

        Returns
        -------
        Dict[str, Any] or None
            Vehicle information if successful, None otherwise
        """
        try:
            if self.logger:
                self.logger.info("🔍 Getting vehicle information...")

            response = self.client._make_request(
                "GET", f"{self.client.api_base_url}{self.endpoints['get_vehicle_info']}"
            )

            if response.status_code == 200:
                data = response.json()
                if self.logger:
                    self.logger.info("✅ Vehicle information retrieved successfully")
                return data
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to get vehicle info: {response.status_code}"
                    )
                return None

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error getting vehicle information: {e}")
            return None

    def update_vehicle_information(
        self, vehicle_description: str, vehicle_id: Optional[int] = None
    ) -> bool:
        """
        Update vehicle information for fuel rewards.

        Parameters
        ----------
        vehicle_description : str
            New vehicle description
        vehicle_id : int, optional
            Vehicle ID, will use current if not provided

        Returns
        -------
        bool
            True if update was successful, False otherwise
        """
        try:
            if self.logger:
                self.logger.info(f"🔧 Updating vehicle to: {vehicle_description}")

            # Get current vehicle info if ID not provided
            if vehicle_id is None:
                current_vehicle = self.get_vehicle_information()
                if current_vehicle:
                    vehicle_id = current_vehicle.get("vehicleId")
                else:
                    if self.logger:
                        self.logger.error("❌ No current vehicle found")
                    return False

            # Get account ID from profile
            profile = self.get_profile()
            if not profile:
                return False

            payload = {
                "vehicleId": vehicle_id,
                "accountId": profile.account_id,
                "vehicleDescription": vehicle_description,
            }

            response = self.client._make_request(
                "POST",
                f"{self.client.api_base_url}{self.endpoints['update_vehicle_info']}",
                json_data=payload,
            )

            if response.status_code == 200:
                data = response.json()
                if data.get("success"):
                    if self.logger:
                        self.logger.info(
                            f"✅ Vehicle updated to: {vehicle_description}"
                        )
                    return True
                else:
                    if self.logger:
                        self.logger.warning("⚠️ Vehicle update returned success=false")
                    return False
            else:
                if self.logger:
                    self.logger.warning(
                        f"⚠️ Failed to update vehicle: {response.status_code}"
                    )
                return False

        except Exception as e:
            if self.logger:
                self.logger.error(f"❌ Error updating vehicle information: {e}")
            return False
