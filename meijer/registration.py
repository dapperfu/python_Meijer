#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2025-08-26
 * Context: Create comprehensive registration module for Meijer account creation
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: typing, requests, logging, json, re
 */

Meijer Registration Module

This module provides comprehensive account registration capabilities including
phone validation, account creation, and input validation based on log analysis
of the Meijer registration flow.
"""

import logging
import re
from dataclasses import dataclass
from datetime import datetime
from typing import Any, Dict, Optional, Union

import requests

from .exceptions import RegistrationError, ValidationError
from .models.base import BaseModel


@dataclass
class PhoneValidationResult(BaseModel):
    """Result of phone number validation."""

    is_valid: bool
    """Whether the phone number is valid"""

    message: str
    """Validation message or error description"""

    phone_number: str
    """The phone number that was validated"""

    country_code: Optional[str] = None
    """Country code if detected"""

    formatted_number: Optional[str] = None
    """Formatted phone number"""

    is_textable: Optional[bool] = None
    """Whether the phone number can receive text messages"""

    device_type: Optional[str] = None
    """Type of device (wireless, landline, etc.)"""

    error_msg: Optional[str] = None
    """Error message from API if validation failed"""

    validation_timestamp: datetime = None
    """When validation was performed"""

    def __post_init__(self):
        """Set default timestamp if not provided."""
        if self.validation_timestamp is None:
            self.validation_timestamp = datetime.now()


@dataclass
class AccountCreationResult(BaseModel):
    """Result of account creation."""

    success: bool
    """Whether account creation was successful"""

    message: str
    """Success message or error description"""

    account_id: Optional[str] = None
    """Created account ID"""

    mperks_id: Optional[str] = None
    """mPerks loyalty program ID"""

    email: Optional[str] = None
    """Email address used for registration"""

    phone: Optional[str] = None
    """Phone number used for registration"""

    created_timestamp: datetime = None
    """When account was created"""

    requires_verification: bool = True
    """Whether email verification is required"""

    def __post_init__(self):
        """Set default timestamp if not provided."""
        if self.created_timestamp is None:
            self.created_timestamp = datetime.now()


@dataclass
class RegistrationData(BaseModel):
    """Registration data for account creation."""

    first_name: str
    """User's first name"""

    last_name: str
    """User's last name"""

    email: str
    """Primary email address"""

    phone: str
    """Phone number (10 digits)"""

    password: str
    """Account password"""

    zip_code: str
    """ZIP code for location"""

    store_id: Optional[str] = None
    """Preferred store ID (optional)"""

    # Additional fields that may be required
    confirm_password: Optional[str] = None
    """Password confirmation"""

    accept_terms: bool = True
    """Whether user accepts terms and conditions"""

    marketing_opt_in: bool = False
    """Whether user opts into marketing communications"""

    def validate(self) -> None:
        """Validate registration data before submission."""
        errors = []

        # Required field validation
        if not self.first_name.strip():
            errors.append("First name is required")
        if not self.last_name.strip():
            errors.append("Last name is required")
        if not self.email.strip():
            errors.append("Email address is required")
        if not self.phone.strip():
            errors.append("Phone number is required")
        if not self.password:
            errors.append("Password is required")
        if not self.zip_code.strip():
            errors.append("ZIP code is required")

        # Email validation
        email_pattern = r"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$"
        if not re.match(email_pattern, self.email):
            errors.append("Invalid email address format")

        # Phone validation (basic format)
        phone_pattern = r"^\d{10}$"
        if not re.match(phone_pattern, self.phone):
            errors.append("Phone number must be 10 digits")

        # ZIP code validation
        zip_pattern = r"^\d{5}(-\d{4})?$"
        if not re.match(zip_pattern, self.zip_code):
            errors.append("Invalid ZIP code format")

        # Password validation
        if len(self.password) < 8:
            errors.append("Password must be at least 8 characters long")

        if errors:
            raise ValidationError(f"Validation errors: {'; '.join(errors)}")


class MeijerRegistrationClient:
    """
    Client for Meijer account registration operations.

    This class handles phone validation, account creation, and other
    registration-related API calls based on log analysis of the
    Meijer registration flow.
    """

    def __init__(self, base_url: str = "https://api.meijer.com"):
        """
        Initialize the registration client.

        Parameters
        ----------
        base_url : str, optional
            Base URL for Meijer API (default: https://api.meijer.com)
        """
        self.base_url = base_url.rstrip("/")
        self.logger = logging.getLogger(__name__)

        # API endpoints discovered from log analysis
        self.endpoints = {
            "validate_phone": "/Loyalty/AccountLinking/validatephone",
            "create_account": "/Loyalty/AccountLinking/createaccount",
            "validate_email": "/Loyalty/AccountLinking/validateemail",
            "check_availability": "/Loyalty/AccountLinking/checkavailability",
        }

        # Session for making requests
        self.session = requests.Session()
        self.session.headers.update(
            {
                "User-Agent": "Meijer/102900000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
                "Accept": "application/json",
                "Content-Type": "application/json",
                "Accept-Language": "en-US",
                "Accept-Encoding": "gzip",
                "Connection": "keep-alive",
                "ocp-apim-subscription-key": "a10bc58ac484478d9b3958b1742c3a03",
            }
        )

    def validate_phone(self, phone_number: str) -> PhoneValidationResult:
        """
        Validate a phone number for account registration.

        This endpoint validates phone numbers before account creation
        to ensure they are in the correct format and available for use.

        Parameters
        ----------
        phone_number : str
            Phone number to validate (10 digits)

        Returns
        -------
        PhoneValidationResult
            Validation result with success status and message

        Raises
        ------
        RegistrationError
            If validation request fails
        """
        try:
            # Clean phone number
            clean_phone = re.sub(r"[^\d]", "", phone_number)

            if len(clean_phone) != 10:
                return PhoneValidationResult(
                    is_valid=False,
                    message="Phone number must be exactly 10 digits",
                    phone_number=phone_number,
                )

            # Prepare request payload - match actual API format
            payload = {"PhoneNumber": clean_phone}

            # Make validation request
            url = f"{self.base_url}{self.endpoints['validate_phone']}"
            self.logger.info(f"Validating phone number: {clean_phone}")

            # Use direct requests instead of session to avoid potential issues
            response = requests.post(
                url, json=payload, headers=self.session.headers, timeout=10
            )

            if response.status_code == 200:
                data = response.json()

                # Parse response based on actual API format
                is_valid = (
                    data.get("isValid") == "true"
                )  # API returns string "true"/"false"
                is_textable = data.get("isTextable") == "true"
                device_type = data.get("deviceType", "unknown")
                error_msg = data.get("errorMsg", "")

                if is_valid:
                    message = "Phone number validated successfully"
                else:
                    message = error_msg or "Phone number validation failed"

                return PhoneValidationResult(
                    is_valid=is_valid,
                    message=message,
                    phone_number=clean_phone,
                    country_code="US",
                    formatted_number=f"({clean_phone[:3]}) {clean_phone[3:6]}-{clean_phone[6:]}",
                    is_textable=is_textable,
                    device_type=device_type,
                    error_msg=error_msg,
                )
            else:
                self.logger.warning(f"Phone validation failed: {response.status_code}")
                return PhoneValidationResult(
                    is_valid=False,
                    message=f"Validation request failed: {response.status_code}",
                    phone_number=clean_phone,
                )

        except requests.RequestException as e:
            self.logger.error(f"Request error during phone validation: {e}")
            raise RegistrationError(f"Phone validation request failed: {e}")
        except Exception as e:
            self.logger.error(f"Unexpected error during phone validation: {e}")
            raise RegistrationError(f"Phone validation failed: {e}")

    def create_account(
        self, registration_data: Union[RegistrationData, Dict[str, Any]]
    ) -> AccountCreationResult:
        """
        Create a new Meijer account.

        This method creates a new account using the provided registration
        data, including validation and error handling.

        Parameters
        ----------
        registration_data : Union[RegistrationData, Dict[str, Any]]
            Registration data for account creation

        Returns
        -------
        AccountCreationResult
            Result of account creation attempt

        Raises
        ------
        ValidationError
            If registration data is invalid
        RegistrationError
            If account creation fails
        """
        try:
            # Convert dict to RegistrationData if needed
            if isinstance(registration_data, dict):
                reg_data = RegistrationData(**registration_data)
            else:
                reg_data = registration_data

            # Validate registration data
            reg_data.validate()

            # Prepare account creation payload
            payload = {
                "firstName": reg_data.first_name,
                "lastName": reg_data.last_name,
                "email": reg_data.email,
                "phoneNumber": reg_data.phone,
                "password": reg_data.password,
                "zipCode": reg_data.zip_code,
                "storeId": reg_data.store_id,
                "acceptTerms": reg_data.accept_terms,
                "marketingOptIn": reg_data.marketing_opt_in,
                "registrationSource": "CLI",
                "timestamp": datetime.now().isoformat(),
            }

            # Make account creation request
            url = f"{self.base_url}{self.endpoints['create_account']}"
            self.logger.info(f"Creating account for: {reg_data.email}")

            response = self.session.post(url, json=payload, timeout=60)

            if response.status_code == 200:
                data = response.json()

                # Check for success
                if data.get("success", False):
                    return AccountCreationResult(
                        success=True,
                        message="Account created successfully",
                        account_id=data.get("accountId"),
                        mperks_id=data.get("mPerksId"),
                        email=reg_data.email,
                        phone=reg_data.phone,
                        requires_verification=data.get("requiresVerification", True),
                    )
                else:
                    error_message = data.get("message", "Account creation failed")
                    return AccountCreationResult(
                        success=False,
                        message=error_message,
                        email=reg_data.email,
                        phone=reg_data.phone,
                    )
            else:
                self.logger.warning(f"Account creation failed: {response.status_code}")
                return AccountCreationResult(
                    success=False,
                    message=f"Account creation request failed: {response.status_code}",
                    email=reg_data.email,
                    phone=reg_data.phone,
                )

        except ValidationError as e:
            self.logger.error(f"Validation error: {e}")
            raise
        except requests.RequestException as e:
            self.logger.error(f"Request error during account creation: {e}")
            raise RegistrationError(f"Account creation request failed: {e}")
        except Exception as e:
            self.logger.error(f"Unexpected error during account creation: {e}")
            raise RegistrationError(f"Account creation failed: {e}")

    def validate_email(self, email: str) -> bool:
        """
        Validate email address format and availability.

        Parameters
        ----------
        email : str
            Email address to validate

        Returns
        -------
        bool
            True if email is valid and available
        """
        try:
            # Basic email format validation
            email_pattern = r"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$"
            if not re.match(email_pattern, email):
                return False

            # Check email availability if endpoint exists
            if "check_availability" in self.endpoints:
                payload = {"email": email}
                url = f"{self.base_url}{self.endpoints['check_availability']}"

                response = self.session.post(url, json=payload, timeout=30)
                if response.status_code == 200:
                    data = response.json()
                    return data.get("isAvailable", True)

            return True

        except Exception as e:
            self.logger.error(f"Email validation error: {e}")
            return False

    def close(self) -> None:
        """Close the session and clean up resources."""
        if self.session:
            self.session.close()

    def __enter__(self):
        """Context manager entry."""
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        """Context manager exit."""
        self.close()
