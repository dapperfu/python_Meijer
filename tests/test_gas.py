#!/usr/bin/env python3
"""
Test Meijer Gas Module
======================

Tests for the gas station functionality in the Meijer API client.
"""

import pytest
from datetime import datetime, time
from meijer.gas import FuelPrice, GasStationHours, MeijerGas


class TestFuelPrice:
    """Test the FuelPrice dataclass."""

    def test_fuel_price_creation(self):
        """Test creating a FuelPrice instance."""
        price = FuelPrice(
            fuel_type="Regular",
            price_per_gallon=3.99,
            last_updated=datetime.now(),
            is_available=True
        )
        
        assert price.fuel_type == "Regular"
        assert price.price_per_gallon == 3.99
        assert price.is_available is True
        assert price.last_updated is not None

    def test_fuel_price_validation_negative_price(self):
        """Test validation of negative price."""
        with pytest.raises(ValueError, match="Price per gallon cannot be negative"):
            FuelPrice(fuel_type="Regular", price_per_gallon=-1.0)

    def test_fuel_price_validation_empty_type(self):
        """Test validation of empty fuel type."""
        with pytest.raises(ValueError, match="Fuel type cannot be empty"):
            FuelPrice(fuel_type="   ", price_per_gallon=3.99)

    def test_fuel_price_defaults(self):
        """Test FuelPrice default values."""
        price = FuelPrice(fuel_type="Premium", price_per_gallon=4.50)
        
        assert price.last_updated is None
        assert price.is_available is True


class TestGasStationHours:
    """Test the GasStationHours dataclass."""

    def test_gas_station_hours_creation(self):
        """Test creating a GasStationHours instance."""
        hours = GasStationHours(
            open_time=time(6, 0),  # 6:00 AM
            close_time=time(22, 0),  # 10:00 PM
            is_24_hours=False,
            days_open=["Monday", "Tuesday", "Wednesday"]
        )
        
        assert hours.open_time == time(6, 0)
        assert hours.close_time == time(22, 0)
        assert hours.is_24_hours is False
        assert "Monday" in hours.days_open

    def test_gas_station_hours_defaults(self):
        """Test GasStationHours default values."""
        hours = GasStationHours(open_time=time(6, 0), close_time=time(22, 0))
        
        assert hours.is_24_hours is False
        assert len(hours.days_open) == 7
        assert "Monday" in hours.days_open
        assert "Sunday" in hours.days_open

    def test_is_open_24_hours(self):
        """Test is_open method for 24-hour stations."""
        hours = GasStationHours(
            open_time=time(6, 0),
            close_time=time(22, 0),
            is_24_hours=True
        )
        
        assert hours.is_open() is True
        assert hours.is_open(time(3, 0)) is True  # 3:00 AM
        assert hours.is_open(time(15, 0)) is True  # 3:00 PM

    def test_is_open_normal_hours(self):
        """Test is_open method for normal operating hours."""
        hours = GasStationHours(
            open_time=time(6, 0),  # 6:00 AM
            close_time=time(22, 0),  # 10:00 PM
            is_24_hours=False
        )
        
        # Test during open hours
        assert hours.is_open(time(12, 0)) is True  # Noon
        assert hours.is_open(time(6, 0)) is True   # Opening time
        assert hours.is_open(time(22, 0)) is True  # Closing time
        
        # Test during closed hours
        assert hours.is_open(time(23, 0)) is False  # 11:00 PM
        assert hours.is_open(time(5, 0)) is False   # 5:00 AM

    def test_is_open_overnight_hours(self):
        """Test is_open method for overnight operating hours."""
        hours = GasStationHours(
            open_time=time(18, 0),  # 6:00 PM
            close_time=time(6, 0),   # 6:00 AM
            is_24_hours=False
        )
        
        # Test during open hours (overnight)
        assert hours.is_open(time(20, 0)) is True   # 8:00 PM
        assert hours.is_open(time(2, 0)) is True    # 2:00 AM
        assert hours.is_open(time(18, 0)) is True   # Opening time
        assert hours.is_open(time(6, 0)) is True    # Closing time
        
        # Test during closed hours
        assert hours.is_open(time(10, 0)) is False  # 10:00 AM
        assert hours.is_open(time(14, 0)) is False  # 2:00 PM

    def test_is_open_specific_day(self):
        """Test is_open method with specific day."""
        hours = GasStationHours(
            open_time=time(6, 0),
            close_time=time(22, 0),
            days_open=["Monday", "Tuesday", "Wednesday"]
        )
        
        # Test on open day
        assert hours.is_open(time(12, 0), "Monday") is True
        assert hours.is_open(time(12, 0), "Tuesday") is True
        
        # Test on closed day
        assert hours.is_open(time(12, 0), "Thursday") is False
        assert hours.is_open(time(12, 0), "Friday") is False


class TestMeijerGas:
    """Test the MeijerGas class."""

    def test_meijer_gas_creation(self):
        """Test creating a MeijerGas instance."""
        gas = MeijerGas(
            station_id="GAS001",
            store_id="STORE001",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104"
        )
        
        assert gas.station_id == "GAS001"
        assert gas.store_id == "STORE001"
        assert gas.address == "123 Main St"
        assert gas.city == "Test City"
        assert gas.state == "MI"
        assert gas.zip_code == "48104"

    def test_meijer_gas_validation_empty_station_id(self):
        """Test validation of empty station ID."""
        with pytest.raises(ValueError, match="Station ID cannot be empty"):
            MeijerGas(
                station_id="   ",
                store_id="STORE001",
                address="123 Main St",
                city="Test City",
                state="MI",
                zip_code="48104"
            )

    def test_meijer_gas_validation_empty_store_id(self):
        """Test validation of empty store ID."""
        with pytest.raises(ValueError, match="Store ID cannot be empty"):
            MeijerGas(
                station_id="GAS001",
                store_id="   ",
                address="123 Main St",
                city="Test City",
                state="MI",
                zip_code="48104"
            )

    def test_meijer_gas_validation_empty_address(self):
        """Test validation of empty address."""
        with pytest.raises(ValueError, match="Address cannot be empty"):
            MeijerGas(
                station_id="GAS001",
                store_id="STORE001",
                address="   ",
                city="Test City",
                state="MI",
                zip_code="48104"
            )

    def test_meijer_gas_defaults(self):
        """Test MeijerGas default values."""
        gas = MeijerGas(
            station_id="GAS001",
            store_id="STORE001",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104"
        )
        
        assert gas.fuel_prices == []
        assert gas.hours is None
        assert gas.has_car_wash is False
        assert gas.has_air_pump is True
        assert gas.has_vacuum is False
        assert gas.has_convenience_store is True
        assert gas.accepts_meijer_rewards is True
        assert gas.accepts_meijer_gift_cards is True
        assert "Credit Card" in gas.payment_methods
        assert "Meijer Gift Card" in gas.payment_methods

    def test_get_fuel_price(self):
        """Test get_fuel_price method."""
        gas = MeijerGas(
            station_id="GAS001",
            store_id="STORE001",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104"
        )
        
        # Add some fuel prices
        gas.fuel_prices = [
            FuelPrice(fuel_type="Regular", price_per_gallon=3.99),
            FuelPrice(fuel_type="Premium", price_per_gallon=4.50)
        ]
        
        # Test finding existing fuel types
        regular_price = gas.get_fuel_price("Regular")
        assert regular_price is not None
        assert regular_price.fuel_type == "Regular"
        assert regular_price.price_per_gallon == 3.99
        
        premium_price = gas.get_fuel_price("premium")  # Case insensitive
        assert premium_price is not None
        assert premium_price.fuel_type == "Premium"
        
        # Test finding non-existent fuel type
        diesel_price = gas.get_fuel_price("Diesel")
        assert diesel_price is None

    def test_get_lowest_price(self):
        """Test get_lowest_price method."""
        gas = MeijerGas(
            station_id="GAS001",
            store_id="STORE001",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104"
        )
        
        # Test with no fuel prices
        assert gas.get_lowest_price() is None
        
        # Add fuel prices
        gas.fuel_prices = [
            FuelPrice(fuel_type="Premium", price_per_gallon=4.50),
            FuelPrice(fuel_type="Regular", price_per_gallon=3.99),
            FuelPrice(fuel_type="Midgrade", price_per_gallon=4.25)
        ]
        
        # Test finding lowest price
        lowest = gas.get_lowest_price()
        assert lowest is not None
        assert lowest.fuel_type == "Regular"
        assert lowest.price_per_gallon == 3.99

    def test_is_currently_open(self):
        """Test is_currently_open method."""
        gas = MeijerGas(
            station_id="GAS001",
            store_id="STORE001",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104"
        )
        
        # Test without hours (assumes open)
        assert gas.is_currently_open() is True
        
        # Test with hours
        hours = GasStationHours(
            open_time=time(6, 0),
            close_time=time(22, 0),
            is_24_hours=True
        )
        gas.hours = hours
        assert gas.is_currently_open() is True

    def test_get_amenities_summary(self):
        """Test get_amenities_summary method."""
        gas = MeijerGas(
            station_id="GAS001",
            store_id="STORE001",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104"
        )
        
        # Test with default amenities
        summary = gas.get_amenities_summary()
        assert "Air Pump" in summary
        assert "Convenience Store" in summary
        assert "Meijer Rewards" in summary
        assert "Meijer Gift Cards" in summary
        
        # Test with custom amenities
        gas.has_car_wash = True
        gas.has_vacuum = True
        gas.has_air_pump = False
        
        summary = gas.get_amenities_summary()
        assert "Car Wash" in summary
        assert "Vacuum" in summary
        assert "Air Pump" not in summary

    def test_to_dict(self):
        """Test to_dict method."""
        gas = MeijerGas(
            station_id="GAS001",
            store_id="STORE001",
            address="123 Main St",
            city="Test City",
            state="MI",
            zip_code="48104",
            phone_number="555-1234"
        )
        
        # Add fuel prices and hours
        gas.fuel_prices = [
            FuelPrice(fuel_type="Regular", price_per_gallon=3.99)
        ]
        
        hours = GasStationHours(
            open_time=time(6, 0),
            close_time=time(22, 0)
        )
        gas.hours = hours
        
        # Convert to dict
        gas_dict = gas.to_dict()
        
        assert gas_dict["station_id"] == "GAS001"
        assert gas_dict["store_id"] == "STORE001"
        assert gas_dict["phone_number"] == "555-1234"
        assert len(gas_dict["fuel_prices"]) == 1
        assert gas_dict["fuel_prices"][0]["fuel_type"] == "Regular"
        assert gas_dict["hours"]["open_time"] == "06:00:00"
        assert gas_dict["hours"]["close_time"] == "22:00:00"


class TestMeijerGasFromAPI:
    """Test MeijerGas.from_api_data method."""

    def test_from_api_data_basic(self):
        """Test creating MeijerGas from basic API data."""
        api_data = {
            "MfcUnitId": "GAS001",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104"
        }
        
        gas = MeijerGas.from_api_data(api_data, "STORE001")
        
        assert gas.station_id == "GAS001"
        assert gas.store_id == "STORE001"
        assert gas.address == "123 Main St"
        assert gas.city == "Test City"
        assert gas.state == "MI"
        assert gas.zip_code == "48104"

    def test_from_api_data_with_amenities(self):
        """Test creating MeijerGas from API data with amenities."""
        api_data = {
            "MfcUnitId": "GAS001",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "GasStationAmenities": [
                {"AmentityType": "Car Wash"},
                {"AmentityType": "Air Pump"},
                {"AmentityType": "Beer"}
            ]
        }
        
        gas = MeijerGas.from_api_data(api_data, "STORE001")
        
        assert gas.has_car_wash is True
        assert gas.has_air_pump is True
        assert gas.has_convenience_store is True  # Beer indicates convenience store
        assert gas.has_vacuum is False

    def test_from_api_data_with_hours(self):
        """Test creating MeijerGas from API data with hours."""
        api_data = {
            "MfcUnitId": "GAS001",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "GasStationHours": [
                {
                    "DayOfTheWeek": "Monday",
                    "OpenTime": "06:00:00",
                    "CloseTime": "22:00:00"
                },
                {
                    "DayOfTheWeek": "Tuesday",
                    "OpenTime": "06:00:00",
                    "CloseTime": "22:00:00"
                }
            ]
        }
        
        gas = MeijerGas.from_api_data(api_data, "STORE001")
        
        assert gas.hours is not None
        assert gas.hours.open_time == time(6, 0)
        assert gas.hours.close_time == time(22, 0)
        assert gas.hours.is_24_hours is False
        assert "Monday" in gas.hours.days_open
        assert "Tuesday" in gas.hours.days_open

    def test_from_api_data_fallback_unit_id(self):
        """Test fallback to UnitId when MfcUnitId is not available."""
        api_data = {
            "UnitId": "GAS002",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104"
        }
        
        gas = MeijerGas.from_api_data(api_data, "STORE001")
        
        assert gas.station_id == "GAS002"

    def test_from_api_data_fallback_store_id(self):
        """Test fallback to store_id when no unit ID is available."""
        api_data = {
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104"
        }
        
        gas = MeijerGas.from_api_data(api_data, "STORE001")
        
        assert gas.station_id == "STORE001"  # Falls back to store_id

    def test_from_api_data_malformed_hours(self):
        """Test creating MeijerGas from API data with malformed hours."""
        api_data = {
            "MfcUnitId": "GAS001",
            "Address": "123 Main St",
            "City": "Test City",
            "State": "MI",
            "Zip": "48104",
            "GasStationHours": [
                {
                    "DayOfTheWeek": "Monday",
                    "OpenTime": "invalid_time",  # Invalid time format
                    "CloseTime": "22:00:00"
                }
            ]
        }
        
        # Should handle malformed hours gracefully
        gas = MeijerGas.from_api_data(api_data, "STORE001")
        
        assert gas.station_id == "GAS001"
        assert gas.hours is None  # Hours should be None due to parsing error


if __name__ == "__main__":
    pytest.main([__file__]) 