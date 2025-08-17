#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: MeijerGas class for gas station functionality within meijer module
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: typing, dataclasses, datetime
 */

MeijerGas class for gas station information and functionality.

Represents gas station data for Meijer stores that have fuel services,
including gas prices, hours, amenities, and fuel types.
"""

from typing import Optional, Dict, Any, List
from dataclasses import dataclass, field
from datetime import datetime, time
import logging

logger = logging.getLogger(__name__)


@dataclass
class FuelPrice:
    """Represents fuel price information for a specific fuel type."""
    
    fuel_type: str
    """Type of fuel (e.g., 'Regular', 'Midgrade', 'Premium', 'Diesel')"""
    
    price_per_gallon: float
    """Price per gallon in USD"""
    
    last_updated: Optional[datetime] = None
    """When the price was last updated"""
    
    is_available: bool = True
    """Whether this fuel type is currently available"""
    
    def __post_init__(self) -> None:
        """Validate fuel price data."""
        if self.price_per_gallon < 0:
            raise ValueError("Price per gallon cannot be negative")
        if not self.fuel_type.strip():
            raise ValueError("Fuel type cannot be empty")


@dataclass
class GasStationHours:
    """Represents gas station operating hours."""
    
    open_time: time
    """Opening time for the gas station"""
    
    close_time: time
    """Closing time for the gas station"""
    
    is_24_hours: bool = False
    """Whether the gas station is open 24 hours"""
    
    days_open: List[str] = field(default_factory=lambda: [
        "Monday", "Tuesday", "Wednesday", "Thursday", 
        "Friday", "Saturday", "Sunday"
    ])
    """Days of the week the gas station is open"""
    
    def is_open(self, check_time: Optional[time] = None, 
                check_day: Optional[str] = None) -> bool:
        """
        Check if gas station is currently open.
        
        Parameters
        ----------
        check_time : time, optional
            Time to check (defaults to current time)
        check_day : str, optional
            Day to check (defaults to current day)
            
        Returns
        -------
        bool
            True if gas station is open, False otherwise
        """
        if check_time is None:
            check_time = datetime.now().time()
        
        if self.is_24_hours:
            return True
            
        # Check if current day is in open days
        if check_day and check_day not in self.days_open:
            return False
            
        # Check if current time is within operating hours
        if self.open_time <= self.close_time:
            # Normal case: open time is before close time
            return self.open_time <= check_time <= self.close_time
        else:
            # Overnight case: open time is after close time (e.g., 6 PM to 6 AM)
            return check_time >= self.open_time or check_time <= self.close_time


@dataclass
class MeijerGas:
    """
    Represents gas station information for a Meijer store.
    
    This class provides comprehensive gas station data including fuel prices,
    operating hours, amenities, and services available at Meijer fuel centers.
    """
    
    # Basic identification
    station_id: str
    """Unique identifier for the gas station"""
    
    store_id: str
    """Associated Meijer store ID"""
    
    # Location and contact
    address: str
    """Street address of the gas station"""
    
    city: str
    """City where gas station is located"""
    
    state: str
    """State where gas station is located"""
    
    zip_code: str
    """ZIP code of gas station location"""
    
    phone_number: Optional[str] = None
    """Contact phone number for gas station"""
    
    # Fuel information
    fuel_prices: List[FuelPrice] = field(default_factory=list)
    """List of current fuel prices by type"""
    
    # Operating hours
    hours: Optional[GasStationHours] = None
    """Gas station operating hours"""
    
    # Amenities and services
    has_car_wash: bool = False
    """Whether the gas station has a car wash"""
    
    has_air_pump: bool = True
    """Whether the gas station has free air pump"""
    
    has_vacuum: bool = False
    """Whether the gas station has vacuum services"""
    
    has_convenience_store: bool = True
    """Whether the gas station has a convenience store"""
    
    accepts_meijer_rewards: bool = True
    """Whether gas purchases earn Meijer rewards"""
    
    accepts_meijer_gift_cards: bool = True
    """Whether gas purchases can be paid with Meijer gift cards"""
    
    # Payment methods
    payment_methods: List[str] = field(default_factory=lambda: [
        "Credit Card", "Debit Card", "Cash", "Meijer Gift Card"
    ])
    """Accepted payment methods"""
    
    # Internal fields
    _raw_data: Optional[Dict[str, Any]] = field(default=None, repr=False)
    """Raw API response data"""
    
    def __post_init__(self) -> None:
        """Validate gas station data."""
        if not str(self.station_id).strip():
            raise ValueError("Station ID cannot be empty")
        if not str(self.store_id).strip():
            raise ValueError("Store ID cannot be empty")
        if not str(self.address).strip():
            raise ValueError("Address cannot be empty")
    
    @classmethod
    def from_api_data(cls, data: Dict[str, Any], store_id: str) -> "MeijerGas":
        """
        Create MeijerGas instance from API response data.
        
        Parameters
        ----------
        data : Dict[str, Any]
            Raw API response data for gas station
        store_id : str
            Associated Meijer store ID
            
        Returns
        -------
        MeijerGas
            New MeijerGas instance
        """
        # Extract gas station amenities if available
        amenities = []
        if "GasStationAmenities" in data and data["GasStationAmenities"] is not None:
            for amenity_data in data["GasStationAmenities"]:
                amenities.append(amenity_data.get("AmentityType", "Unknown"))
        
        # Extract gas station hours if available
        hours = None
        if "GasStationHours" in data and data["GasStationHours"] is not None:
            try:
                # Find the first set of hours (assuming consistent hours across days)
                first_hour = data["GasStationHours"][0]
                open_time = time.fromisoformat(first_hour.get("OpenTime", "06:00:00"))
                close_time = time.fromisoformat(first_hour.get("CloseTime", "22:00:00"))
                
                # Get all days that are open
                days_open = [hour.get("DayOfTheWeek", "Unknown") for hour in data["GasStationHours"]]
                
                hours = GasStationHours(
                    open_time=open_time,
                    close_time=close_time,
                    is_24_hours=False,  # Meijer gas stations are typically not 24 hours
                    days_open=days_open
                )
            except (ValueError, TypeError, IndexError) as e:
                logger.warning(f"Failed to parse gas station hours: {e}")
        
        # Determine amenities based on available data
        has_car_wash = "Car Wash" in amenities
        has_air_pump = "Air Pump" in amenities or "Air" in amenities
        has_vacuum = "Vacuum" in amenities
        has_convenience_store = any(x in amenities for x in ["Beer", "Tobacco", "Gift Cards"])
        accepts_meijer_rewards = True  # Assume yes for Meijer gas stations
        accepts_meijer_gift_cards = "Gift Cards" in amenities
        
        # Payment methods (standard for Meijer gas stations)
        payment_methods = [
            "Credit Card", "Debit Card", "Cash", "Meijer Gift Card"
        ]
        
        return cls(
            station_id=str(data.get("MfcUnitId", data.get("UnitId", store_id))),
            store_id=store_id,
            address=data.get("Address", ""),
            city=data.get("City", ""),
            state=data.get("State", ""),
            zip_code=data.get("Zip", ""),
            phone_number=data.get("MfcPhoneNumber"),
            fuel_prices=[],  # Fuel prices not available in store data
            hours=hours,
            has_car_wash=has_car_wash,
            has_air_pump=has_air_pump,
            has_vacuum=has_vacuum,
            has_convenience_store=has_convenience_store,
            accepts_meijer_rewards=accepts_meijer_rewards,
            accepts_meijer_gift_cards=accepts_meijer_gift_cards,
            payment_methods=payment_methods,
            _raw_data=data
        )
    
    def get_fuel_price(self, fuel_type: str) -> Optional[FuelPrice]:
        """
        Get price for a specific fuel type.
        
        Parameters
        ----------
        fuel_type : str
            Type of fuel to get price for
            
        Returns
        -------
        FuelPrice, optional
            Fuel price information if found, None otherwise
        """
        for price in self.fuel_prices:
            if price.fuel_type.lower() == fuel_type.lower():
                return price
        return None
    
    def get_lowest_price(self) -> Optional[FuelPrice]:
        """
        Get the lowest priced fuel available.
        
        Returns
        -------
        FuelPrice, optional
            Lowest priced fuel if available, None otherwise
        """
        if not self.fuel_prices:
            return None
        
        return min(self.fuel_prices, key=lambda p: p.price_per_gallon)
    
    def is_currently_open(self) -> bool:
        """
        Check if gas station is currently open.
        
        Returns
        -------
        bool
            True if currently open, False otherwise
        """
        if not self.hours:
            return True  # Assume open if no hours specified
        
        return self.hours.is_open()
    
    def get_amenities_summary(self) -> str:
        """
        Get a summary of available amenities.
        
        Returns
        -------
        str
            Comma-separated list of available amenities
        """
        amenities = []
        
        if self.has_car_wash:
            amenities.append("Car Wash")
        if self.has_air_pump:
            amenities.append("Air Pump")
        if self.has_vacuum:
            amenities.append("Vacuum")
        if self.has_convenience_store:
            amenities.append("Convenience Store")
        if self.accepts_meijer_rewards:
            amenities.append("Meijer Rewards")
        if self.accepts_meijer_gift_cards:
            amenities.append("Meijer Gift Cards")
        
        return ", ".join(amenities) if amenities else "Basic Services"
    
    def to_dict(self) -> Dict[str, Any]:
        """
        Convert gas station data to dictionary format.
        
        Returns
        -------
        Dict[str, Any]
            Dictionary representation of gas station data
        """
        return {
            "station_id": self.station_id,
            "store_id": self.store_id,
            "address": self.address,
            "city": self.city,
            "state": self.state,
            "zip_code": self.zip_code,
            "phone_number": self.phone_number,
            "fuel_prices": [
                {
                    "fuel_type": price.fuel_type,
                    "price_per_gallon": price.price_per_gallon,
                    "last_updated": price.last_updated.isoformat() if price.last_updated else None,
                    "is_available": price.is_available
                }
                for price in self.fuel_prices
            ],
            "hours": {
                "open_time": self.hours.open_time.isoformat() if self.hours else None,
                "close_time": self.hours.close_time.isoformat() if self.hours else None,
                "is_24_hours": self.hours.is_24_hours if self.hours else False,
                "days_open": self.hours.days_open if self.hours else []
            } if self.hours else None,
            "amenities": {
                "has_car_wash": self.has_car_wash,
                "has_air_pump": self.has_air_pump,
                "has_vacuum": self.has_vacuum,
                "has_convenience_store": self.has_convenience_store,
                "accepts_meijer_rewards": self.accepts_meijer_rewards,
                "accepts_meijer_gift_cards": self.accepts_meijer_gift_cards
            },
            "payment_methods": self.payment_methods
        } 