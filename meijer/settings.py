#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Settings module for Meijer API client based on log analysis
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: typing, dataclasses, meijer.client
 */

Settings functionality for Meijer API.

This module provides methods for managing user settings, preferences,
vehicle information, and account details discovered through log analysis.
"""

from dataclasses import dataclass
from typing import TYPE_CHECKING, Any, Dict, List, Optional

if TYPE_CHECKING:
    from .client import Meijer


@dataclass
class VehicleInformation:
    """Represents vehicle information for fuel rewards."""

    vehicle_id: int
    """Unique vehicle identifier"""

    account_id: int
    """Associated account ID"""

    vehicle_description: str
    """Vehicle description (e.g., 'Blue Subaru', 'Honda', 'VW')"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "VehicleInformation":
        """Create VehicleInformation from API response."""
        return cls(
            vehicle_id=data.get("vehicleId", 0),
            account_id=data.get("accountId", 0),
            vehicle_description=data.get("vehicleDescription", ""),
        )


@dataclass
class CustomerPreference:
    """Represents a customer preference setting."""

    preference_type_name: str
    """Name of the preference type (e.g., 'Substitutions')"""

    owning_program_name: str
    """Program that owns this preference (e.g., 'DigitalGrocery')"""

    data_type_name: str
    """Data type of the preference value"""

    is_preference_discrete_choice: bool
    """Whether this preference has discrete choice options"""

    preference_value: str
    """Current preference value"""

    preference_create_timestamp: str
    """When the preference was created"""

    preference_update_timestamp: str
    """When the preference was last updated"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "CustomerPreference":
        """Create CustomerPreference from API response."""
        return cls(
            preference_type_name=data.get("preferenceTypeName", ""),
            owning_program_name=data.get("owningProgramName", ""),
            data_type_name=data.get("dataTypeName", ""),
            is_preference_discrete_choice=data.get("isPreferenceDiscreteChoice", False),
            preference_value=data.get("preferenceValue", ""),
            preference_create_timestamp=data.get("preferenceCreateTimestamp", ""),
            preference_update_timestamp=data.get("preferenceUpdateTimeStamp", ""),
        )


@dataclass
class PreferenceDiscreteChoice:
    """Represents a discrete choice option for preferences."""

    digital_preference_discrete_choice_id: int
    """Unique identifier for the choice option"""

    digital_preference_discrete_choice_value: str
    """Value of the choice option (e.g., 'Meijer Brand', 'National Brand')"""

    @classmethod
    def from_api_response(cls, data: Dict[str, Any]) -> "PreferenceDiscreteChoice":
        """Create PreferenceDiscreteChoice from API response."""
        return cls(
            digital_preference_discrete_choice_id=data.get(
                "digitalPreferenceDiscreteChoiceId", 0
            ),
            digital_preference_discrete_choice_value=data.get(
                "digitalPreferenceDiscreteChoiceValue", ""
            ),
        )


class MeijerSettings:
    """Handles Settings functionality for Meijer API."""

    def __init__(self, meijer_client: "Meijer"):
        self.meijer = meijer_client
        self.logger = self.meijer.logger

        # Settings endpoints discovered from log analysis
        self.endpoints = {
            # Vehicle management
            "get_vehicle_info": "/loyalty/accounts/getVehicleInformation",
            "update_vehicle_info": "/loyalty/accounts/updateVehicleInformation",
            # Customer preferences
            "get_customer_preferences": "/loyalty/accounts/preferences/getCustomerPreferences",
            "get_preference_discrete_choices": "/loyalty/accounts/preferences/getPreferenceDiscreteChoices",
            "update_customer_preference": "/loyalty/accounts/preferences/updateCustomerPreference",
            # Account management
            "get_account": "/loyalty/accounts/accounts/getAccount",
            "update_account": "/loyalty/accounts/updateAccount",
        }

    def get_vehicle_information(self) -> Optional[VehicleInformation]:
        """
        Get current vehicle information for fuel rewards.

        Returns:
            VehicleInformation if found, None otherwise
        """
        try:
            self.logger.info("🔍 Getting vehicle information...")

            response = self.meijer._make_request(
                "GET", f"{self.meijer.api_base_url}{self.endpoints['get_vehicle_info']}"
            )

            if response.status_code == 200:
                data = response.json()
                vehicle_info = VehicleInformation.from_api_response(data)
                self.logger.info(f"✅ Vehicle: {vehicle_info.vehicle_description}")
                return vehicle_info
            else:
                self.logger.warning(
                    f"⚠️  Failed to get vehicle info: {response.status_code}"
                )
                return None

        except Exception as e:
            self.logger.error(f"❌ Error getting vehicle information: {e}")
            return None

    def update_vehicle_information(
        self, vehicle_description: str, vehicle_id: Optional[int] = None
    ) -> bool:
        """
        Update vehicle information for fuel rewards.

        Args:
            vehicle_description: New vehicle description (e.g., 'Honda', 'VW')
            vehicle_id: Vehicle ID (optional, will use current if not provided)

        Returns:
            bool: True if update was successful, False otherwise
        """
        try:
            self.logger.info(f"🔧 Updating vehicle to: {vehicle_description}")

            # Get current vehicle info if ID not provided
            if vehicle_id is None:
                current_vehicle = self.get_vehicle_information()
                if current_vehicle:
                    vehicle_id = current_vehicle.vehicle_id
                else:
                    self.logger.error(
                        "❌ No current vehicle found and no vehicle_id provided"
                    )
                    return False

            # Prepare update payload
            payload = {
                "vehicleId": vehicle_id,
                "accountId": self.meijer._get_account_id(),
                "vehicleDescription": vehicle_description,
            }

            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['update_vehicle_info']}",
                json_data=payload,
            )

            if response.status_code == 200:
                data = response.json()
                if data.get("success"):
                    self.logger.info(f"✅ Vehicle updated to: {vehicle_description}")
                    return True
                else:
                    self.logger.warning("⚠️  Vehicle update returned success=false")
                    return False
            else:
                self.logger.warning(
                    f"⚠️  Failed to update vehicle: {response.status_code}"
                )
                return False

        except Exception as e:
            self.logger.error(f"❌ Error updating vehicle information: {e}")
            return False

    def get_customer_preferences(self) -> List[CustomerPreference]:
        """
        Get all customer preferences.

        Returns:
            List of CustomerPreference objects
        """
        try:
            self.logger.info("🔍 Getting customer preferences...")

            response = self.meijer._make_request(
                "GET",
                f"{self.meijer.api_base_url}{self.endpoints['get_customer_preferences']}",
            )

            if response.status_code == 200:
                data = response.json()
                preferences = [
                    CustomerPreference.from_api_response(pref) for pref in data
                ]
                self.logger.info(f"✅ Found {len(preferences)} preferences")
                return preferences
            else:
                self.logger.warning(
                    f"⚠️  Failed to get preferences: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"❌ Error getting customer preferences: {e}")
            return []

    def get_preference_discrete_choices(self) -> List[PreferenceDiscreteChoice]:
        """
        Get available discrete choice options for preferences.

        Returns:
            List of PreferenceDiscreteChoice objects
        """
        try:
            self.logger.info("🔍 Getting preference discrete choices...")

            response = self.meijer._make_request(
                "GET",
                f"{self.meijer.api_base_url}{self.endpoints['get_preference_discrete_choices']}",
            )

            if response.status_code == 200:
                data = response.json()
                choices = [
                    PreferenceDiscreteChoice.from_api_response(choice)
                    for choice in data
                ]
                self.logger.info(f"✅ Found {len(choices)} discrete choices")
                return choices
            else:
                self.logger.warning(
                    f"⚠️  Failed to get discrete choices: {response.status_code}"
                )
                return []

        except Exception as e:
            self.logger.error(f"❌ Error getting preference discrete choices: {e}")
            return []

    def update_customer_preference(
        self,
        preference_type_name: str,
        preference_value: str,
        owning_program_name: str = "DigitalGrocery",
    ) -> bool:
        """
        Update a customer preference.

        Args:
            preference_type_name: Name of the preference to update (e.g., 'Substitutions')
            preference_value: New value for the preference
            owning_program_name: Program that owns this preference

        Returns:
            bool: True if update was successful, False otherwise
        """
        try:
            self.logger.info(
                f"🔧 Updating preference {preference_type_name} to: {preference_value}"
            )

            payload = {
                "owningProgramName": owning_program_name,
                "preferenceTypeName": preference_type_name,
                "preferenceValue": preference_value,
                "digitalAccountId": self.meijer._get_account_id(),
            }

            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['update_customer_preference']}",
                json_data=payload,
            )

            if response.status_code == 200:
                self.logger.info(
                    f"✅ Preference {preference_type_name} updated successfully"
                )
                return True
            else:
                self.logger.warning(
                    f"⚠️  Failed to update preference: {response.status_code}"
                )
                return False

        except Exception as e:
            self.logger.error(f"❌ Error updating customer preference: {e}")
            return False

    def get_account_details(self) -> Optional[Dict[str, Any]]:
        """
        Get detailed account information.

        Returns:
            Account details dictionary if successful, None otherwise
        """
        try:
            self.logger.info("🔍 Getting account details...")

            response = self.meijer._make_request(
                "GET", f"{self.meijer.api_base_url}{self.endpoints['get_account']}"
            )

            if response.status_code == 200:
                data = response.json()
                self.logger.info("✅ Account details retrieved successfully")
                return data
            else:
                self.logger.warning(
                    f"⚠️  Failed to get account details: {response.status_code}"
                )
                return None

        except Exception as e:
            self.logger.error(f"❌ Error getting account details: {e}")
            return None

    def update_account_details(self, updates: Dict[str, Any]) -> bool:
        """
        Update account details.

        Args:
            updates: Dictionary of fields to update

        Returns:
            bool: True if update was successful, False otherwise
        """
        try:
            self.logger.info("🔧 Updating account details...")

            # Get current account details
            current_account = self.get_account_details()
            if not current_account:
                self.logger.error("❌ Could not get current account details")
                return False

            # Merge current data with updates
            payload = {**current_account, **updates}

            # Ensure required fields are present
            payload["updatedBy"] = str(self.meijer._get_account_id())

            response = self.meijer._make_request(
                "POST",
                f"{self.meijer.api_base_url}{self.endpoints['update_account']}",
                json_data=payload,
            )

            if response.status_code == 200:
                data = response.json()
                if data.get("success"):
                    self.logger.info("✅ Account details updated successfully")
                    return True
                else:
                    self.logger.warning("⚠️  Account update returned success=false")
                    return False
            else:
                self.logger.warning(
                    f"⚠️  Failed to update account: {response.status_code}"
                )
                return False

        except Exception as e:
            self.logger.error(f"❌ Error updating account details: {e}")
            return False

    def _get_account_id(self) -> int:
        """Get the current account ID from the client."""
        # This would need to be implemented in the main client
        # For now, return a placeholder
        return 13266596  # From log analysis
