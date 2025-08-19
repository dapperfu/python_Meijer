#!/usr/bin/env python3
"""
Test Meijer Stores Module
=========================

Tests for the store functionality in the Meijer API client.
"""

from datetime import time
from unittest.mock import Mock, patch

import pytest

from meijer.stores import MeijerStore, StoreHours


class TestStoreHours:
    """Test the StoreHours dataclass."""

    def test_store_hours_creation(self):
        """Test creating a StoreHours instance."""
        hours = StoreHours(
            open_time=time(6, 0),  # 6:00 AM
            close_time=time(22, 0),  # 10:00 PM
            is_24_hours=False,
            days_open=["Monday", "Tuesday", "Wednesday"],
        )

        assert hours.open_time == time(6, 0)
        assert hours.close_time == time(22, 0)
        assert hours.is_24_hours is False
        assert "Monday" in hours.days_open

    def test_store_hours_defaults(self):
        """Test StoreHours default values."""
        hours = StoreHours(open_time=time(6, 0), close_time=time(22, 0))

        assert hours.is_24_hours is False
        assert len(hours.days_open) == 7
        assert "Monday" in hours.days_open
        assert "Sunday" in hours.days_open

    def test_is_open_24_hours(self):
        """Test is_open method for 24-hour stores."""
        hours = StoreHours(
            open_time=time(6, 0), close_time=time(22, 0), is_24_hours=True
        )

        assert hours.is_open() is True
        assert hours.is_open(time(3, 0)) is True  # 3:00 AM
        assert hours.is_open(time(15, 0)) is True  # 3:00 PM

    def test_is_open_normal_hours(self):
        """Test is_open method for normal operating hours."""
        hours = StoreHours(
            open_time=time(6, 0),  # 6:00 AM
            close_time=time(22, 0),  # 10:00 PM
            is_24_hours=False,
        )

        # Test during open hours
        assert hours.is_open(time(12, 0)) is True  # Noon
        assert hours.is_open(time(6, 0)) is True  # Opening time
        assert hours.is_open(time(22, 0)) is True  # Closing time

        # Test during closed hours
        assert hours.is_open(time(23, 0)) is False  # 11:00 PM
        assert hours.is_open(time(5, 0)) is False  # 5:00 AM

    def test_is_open_overnight_hours(self):
        """Test is_open method for overnight operating hours."""
        hours = StoreHours(
            open_time=time(18, 0),  # 6:00 PM
            close_time=time(6, 0),  # 6:00 AM
            is_24_hours=False,
        )

        # Test during open hours (overnight)
        assert hours.is_open(time(20, 0)) is True  # 8:00 PM
        assert hours.is_open(time(2, 0)) is True  # 2:00 AM
        assert hours.is_open(time(18, 0)) is True  # Opening time
        assert hours.is_open(time(6, 0)) is True  # Closing time

        # Test during closed hours
        assert hours.is_open(time(10, 0)) is False  # 10:00 AM
        assert hours.is_open(time(14, 0)) is False  # 2:00 PM

    def test_is_open_specific_day(self):
        """Test is_open method with specific day."""
        hours = StoreHours(
            open_time=time(6, 0),
            close_time=time(22, 0),
            days_open=["Monday", "Tuesday", "Wednesday"],
        )

        # Test on open day
        assert hours.is_open(time(12, 0), "Monday") is True
        assert hours.is_open(time(12, 0), "Tuesday") is True

        # Test on closed day
        assert hours.is_open(time(12, 0), "Thursday") is False
        assert hours.is_open(time(12, 0), "Friday") is False


class TestMeijerStore:
    """Test the MeijerStore class."""

    def test_meijer_store_creation(self):
        """Test creating a MeijerStore instance."""
        store = MeijerStore(
            unit_id="STORE001",
            name="Test Meijer Store",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104",
        )

        assert store.unit_id == "STORE001"
        assert store.name == "Test Meijer Store"
        assert store.address == "123 Main St"
        assert store.city == "Test City"
        assert store.state == "MI"
        assert store.zip_code == "48104"

    def test_meijer_store_validation_empty_unit_id(self):
        """Test validation of empty unit ID."""
        with pytest.raises(ValueError, match="Unit ID cannot be empty"):
            MeijerStore(
                unit_id="   ",
                name="Test Meijer Store",
                address="123 Main St",
                city="Test City",
                state="MI",
                zip_code="48104",
            )

    def test_meijer_store_validation_empty_name(self):
        """Test validation of empty store name."""
        with pytest.raises(ValueError, match="Store name cannot be empty"):
            MeijerStore(
                unit_id="STORE001",
                name="   ",
                address="123 Main St",
                city="Test City",
                state="MI",
                zip_code="48104",
            )

    def test_meijer_store_validation_empty_address(self):
        """Test validation of empty address."""
        with pytest.raises(ValueError, match="Address cannot be empty"):
            MeijerStore(
                unit_id="STORE001",
                name="Test Meijer Store",
                address="   ",
                city="Test City",
                state="MI",
                zip_code="48104",
            )

    def test_meijer_store_validation_empty_city(self):
        """Test validation of empty city."""
        with pytest.raises(ValueError, match="City cannot be empty"):
            MeijerStore(
                unit_id="STORE001",
                name="Test Meijer Store",
                address="123 Main St",
                city="   ",
                state="MI",
                zip_code="48104",
            )

    def test_meijer_store_validation_empty_state(self):
        """Test validation of empty state."""
        with pytest.raises(ValueError, match="State cannot be empty"):
            MeijerStore(
                unit_id="STORE001",
                name="Test Meijer Store",
                address="123 Main St",
                city="Test City",
                state="   ",
                zip_code="48104",
            )

    def test_meijer_store_validation_empty_zip_code(self):
        """Test validation of empty ZIP code."""
        with pytest.raises(ValueError, match="ZIP code cannot be empty"):
            MeijerStore(
                unit_id="STORE001",
                name="Test Meijer Store",
                address="123 Main St",
                city="Test City",
                state="MI",
                zip_code="   ",
            )

    def test_meijer_store_defaults(self):
        """Test MeijerStore default values."""
        store = MeijerStore(
            unit_id="STORE001",
            name="Test Meijer Store",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104",
        )

        assert store.phone_number is None
        assert store.latitude is None
        assert store.longitude is None
        assert store.has_pharmacy is False
        assert store.has_optical is False
        assert store.has_bank is False
        assert store.has_curbside_pickup is False
        assert store.has_delivery is False
        assert store.has_self_checkout is True
        assert store.has_coin_machine is False
        assert store.has_photo_center is False
        assert store.has_garden_center is False
        assert store.has_auto_center is False
        assert store.hours is None
        assert store.gas_station is None
        assert store.store_type == "Supercenter"
        assert store.store_size is None
        assert store._meijer_client is None
        assert store._raw_data is None

    def test_meijer_store_with_optional_fields(self):
        """Test MeijerStore with optional fields."""
        store = MeijerStore(
            unit_id="STORE001",
            name="Test Meijer Store",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104",
            phone_number="555-1234",
            latitude=42.123,
            longitude=-83.456,
            has_pharmacy=True,
            has_curbside_pickup=True,
            has_delivery=True,
            store_type="Express",
        )

        assert store.phone_number == "555-1234"
        assert store.latitude == 42.123
        assert store.longitude == -83.456
        assert store.has_pharmacy is True
        assert store.has_curbside_pickup is True
        assert store.has_delivery is True
        assert store.store_type == "Express"


class TestMeijerStoreFromAPI:
    """Test MeijerStore.from_api_data method."""

    def test_from_api_data_basic(self):
        """Test creating MeijerStore from basic API data."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
        }

        store = MeijerStore.from_api_data(api_data)

        assert store.unit_id == "STORE001"
        assert store.name == "Test Meijer Store"
        assert store.address == "123 Main St"
        assert store.city == "Test City"
        assert store.state == "MI"
        assert store.zip_code == "48104"

    def test_from_api_data_with_hours(self):
        """Test creating MeijerStore from API data with hours."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "CurbsideWeekdayOpen": "1900-01-01T08:00:00",
            "CurbsideWeekdayClose": "1900-01-01T21:00:00",
        }

        store = MeijerStore.from_api_data(api_data)

        assert store.hours is not None
        assert store.hours.open_time == time(8, 0)
        assert store.hours.close_time == time(21, 0)
        assert store.hours.is_24_hours is False
        assert len(store.hours.days_open) == 7

    def test_from_api_data_with_malformed_hours(self):
        """Test creating MeijerStore from API data with malformed hours."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "CurbsideWeekdayOpen": "1900-01-01Tinvalid_time",  # Contains T but invalid time
            "CurbsideWeekdayClose": "1900-01-01T21:00:00",
        }

        # Should handle malformed hours gracefully
        store = MeijerStore.from_api_data(api_data)

        assert store.unit_id == "STORE001"
        assert store.hours is None  # Hours should be None due to parsing error

    def test_from_api_data_with_pharmacy(self):
        """Test creating MeijerStore from API data with pharmacy."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "PharmPhone": "555-5678",
        }

        store = MeijerStore.from_api_data(api_data)

        assert store.has_pharmacy is True

    def test_from_api_data_with_curbside_pickup(self):
        """Test creating MeijerStore from API data with curbside pickup."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "CurbsideAllow": "Y",
        }

        store = MeijerStore.from_api_data(api_data)

        assert store.has_curbside_pickup is True

    def test_from_api_data_with_delivery(self):
        """Test creating MeijerStore from API data with delivery."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "DlvryOrderPhone": "555-9999",
        }

        store = MeijerStore.from_api_data(api_data)

        assert store.has_delivery is True

    def test_from_api_data_with_gas_station(self):
        """Test creating MeijerStore from API data with gas station."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "GasStationAmenities": [{"AmentityType": "Car Wash"}],
        }

        with patch("meijer.gas.MeijerGas") as mock_gas:
            mock_gas.from_api_data.return_value = Mock()
            store = MeijerStore.from_api_data(api_data)

            assert store.gas_station is not None
            mock_gas.from_api_data.assert_called_once()

    def test_from_api_data_with_gas_station_error(self):
        """Test creating MeijerStore from API data with gas station parsing error."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "GasStationAmenities": [{"AmentityType": "Car Wash"}],
        }

        with patch("meijer.gas.MeijerGas") as mock_gas:
            mock_gas.from_api_data.side_effect = Exception("Gas station error")
            store = MeijerStore.from_api_data(api_data)

            assert store.gas_station is None  # Should handle error gracefully

    def test_from_store_info_response(self):
        """Test from_store_info_response method (alias for from_api_data)."""
        api_data = {
            "UnitId": "STORE001",
            "Name": "Test Meijer Store",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
        }

        store = MeijerStore.from_store_info_response(api_data)

        assert store.unit_id == "STORE001"
        assert store.name == "Test Meijer Store"


if __name__ == "__main__":
    pytest.main([__file__])
