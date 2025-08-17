#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: MeijerGas class for gas station functionality
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

from typing import Optional, Union, List, Dict, Any, TYPE_CHECKING
from dataclasses import dataclass, field
from datetime import datetime, time
import logging

if TYPE_CHECKING:
    from meijer_store_final import MeijerStore

logger = logging.getLogger(__name__)


@dataclass
class FuelPrice:
    """Represents fuel price information."""
    
    fuel_type: str  # e.g., "Regular", "Mid-Grade", "Premium", "Diesel"
    price: float  # Price per gallon
    last_updated: Optional[datetime] = None
    unit: str = "gallon"
    
    @property
    def formatted_price(self) -> str:
        """Get formatted price string."""
        return f"${self.price:.3f}"
    
    def __str__(self) -> str:
        """String representation of fuel price."""
        updated_str = ""
        if self.last_updated:
            updated_str = f" (updated {self.last_updated.strftime('%m/%d/%Y %I:%M %p')})"
        return f"{self.fuel_type}: {self.formatted_price}{updated_str}"


@dataclass
class GasStationHours:
    """Represents gas station operating hours."""
    
    # Daily hours
    monday_open: Optional[time] = None
    monday_close: Optional[time] = None
    tuesday_open: Optional[time] = None
    tuesday_close: Optional[time] = None
    wednesday_open: Optional[time] = None
    wednesday_close: Optional[time] = None
    thursday_open: Optional[time] = None
    thursday_close: Optional[time] = None
    friday_open: Optional[time] = None
    friday_close: Optional[time] = None
    saturday_open: Optional[time] = None
    saturday_close: Optional[time] = None
    sunday_open: Optional[time] = None
    sunday_close: Optional[time] = None
    
    # Special flags
    is_24_hours: bool = False
    same_as_store: bool = True
    
    def is_open_now(self) -> bool:
        """Check if gas station is currently open."""
        if self.is_24_hours:
            return True
            
        now = datetime.now()
        current_time = now.time()
        current_day = now.weekday()  # 0=Monday, 6=Sunday
        
        # Get open/close times for current day
        day_mapping = {
            0: (self.monday_open, self.monday_close),
            1: (self.tuesday_open, self.tuesday_close),
            2: (self.wednesday_open, self.wednesday_close),
            3: (self.thursday_open, self.thursday_close),
            4: (self.friday_open, self.friday_close),
            5: (self.saturday_open, self.saturday_close),
            6: (self.sunday_open, self.sunday_close),
        }
        
        open_time, close_time = day_mapping.get(current_day, (None, None))
        
        if not open_time or not close_time:
            return False
            
        return open_time <= current_time <= close_time
    
    def get_hours_summary(self) -> Dict[str, str]:
        """Get a summary of gas station hours."""
        if self.is_24_hours:
            return {"status": "24 Hours", "note": "Always open"}
        
        if self.same_as_store:
            return {"status": "Same as Store", "note": "Follows store hours"}
            
        hours = {}
        days = [
            ("Monday", self.monday_open, self.monday_close),
            ("Tuesday", self.tuesday_open, self.tuesday_close),
            ("Wednesday", self.wednesday_open, self.wednesday_close),
            ("Thursday", self.thursday_open, self.thursday_close),
            ("Friday", self.friday_open, self.friday_close),
            ("Saturday", self.saturday_open, self.saturday_close),
            ("Sunday", self.sunday_open, self.sunday_close),
        ]
        
        for day, open_time, close_time in days:
            if open_time and close_time:
                hours[day] = f"{open_time.strftime('%I:%M %p')} - {close_time.strftime('%I:%M %p')}"
            else:
                hours[day] = "Closed"
                
        return hours


@dataclass
class MeijerGas:
    """
    Represents gas station information for a Meijer store.
    
    This class provides comprehensive gas station functionality including
    fuel prices, operating hours, amenities, and location information.
    """
    
    # Basic information
    store_id: int
    station_name: str = ""
    
    # Location
    latitude: Optional[float] = None
    longitude: Optional[float] = None
    address: Optional[str] = None
    
    # Fuel prices
    fuel_prices: List[FuelPrice] = field(default_factory=list)
    
    # Hours
    hours: Optional[GasStationHours] = None
    
    # Amenities and services
    amenities: List[str] = field(default_factory=list)
    payment_methods: List[str] = field(default_factory=list)
    
    # Technical details
    number_of_pumps: Optional[int] = None
    accepts_credit_cards: bool = True
    accepts_debit_cards: bool = True
    accepts_mperks: bool = True
    
    # Fuel types available
    has_regular: bool = True
    has_midgrade: bool = True
    has_premium: bool = True
    has_diesel: bool = False
    has_e85: bool = False
    
    # Special features
    has_air_pump: bool = False
    has_vacuum: bool = False
    has_car_wash: bool = False
    has_convenience_items: bool = False
    
    # Internal reference
    _parent_store: Optional["MeijerStore"] = field(default=None, repr=False)
    _raw_data: Optional[Dict[str, Any]] = field(default=None, repr=False)
    
    @classmethod
    def from_store_data(
        cls, 
        store_data: Dict[str, Any], 
        parent_store: Optional["MeijerStore"] = None
    ) -> Optional["MeijerGas"]:
        """
        Create MeijerGas instance from store API data.
        
        Args:
            store_data: Raw store data from API
            parent_store: Parent MeijerStore instance
            
        Returns:
            MeijerGas instance if store has gas station, None otherwise
        """
        # Check if store has gas station
        if not store_data.get("MfuelFlag", False):
            return None
            
        gas_data = cls(
            store_id=store_data.get("UnitId", 0),
            station_name=f"Meijer Gas Station #{store_data.get('UnitId', 'Unknown')}",
            latitude=store_data.get("Latitude"),
            longitude=store_data.get("Longitude"),
            address=store_data.get("Address"),
            _parent_store=parent_store,
            _raw_data=store_data
        )
        
        # Process gas station amenities
        amenities_data = store_data.get("GasStationAmenities", [])
        if isinstance(amenities_data, list):
            for amenity in amenities_data:
                if isinstance(amenity, dict):
                    amenity_type = amenity.get("amentity_type", "")
                    if amenity_type:
                        gas_data.amenities.append(amenity_type)
        
        # Process fuel prices
        fuel_prices_data = store_data.get("FuelPrices", {})
        if isinstance(fuel_prices_data, dict):
            for fuel_type, price_info in fuel_prices_data.items():
                if isinstance(price_info, (int, float)):
                    gas_data.fuel_prices.append(
                        FuelPrice(fuel_type=fuel_type, price=float(price_info))
                    )
                elif isinstance(price_info, dict):
                    price = price_info.get("price", 0.0)
                    updated = price_info.get("last_updated")
                    updated_dt = None
                    if updated:
                        try:
                            updated_dt = datetime.fromisoformat(updated)
                        except (ValueError, TypeError):
                            pass
                    gas_data.fuel_prices.append(
                        FuelPrice(
                            fuel_type=fuel_type, 
                            price=float(price),
                            last_updated=updated_dt
                        )
                    )
        
        # Process gas station hours
        hours_data = store_data.get("GasStationHours", {})
        if isinstance(hours_data, dict) and hours_data:
            gas_hours = GasStationHours()
            
            # Check for 24 hour flag
            gas_hours.is_24_hours = hours_data.get("is_24_hours", False)
            gas_hours.same_as_store = hours_data.get("same_as_store", True)
            
            # Parse individual day hours if available
            day_mapping = {
                "monday": ("monday_open", "monday_close"),
                "tuesday": ("tuesday_open", "tuesday_close"),
                "wednesday": ("wednesday_open", "wednesday_close"),
                "thursday": ("thursday_open", "thursday_close"),
                "friday": ("friday_open", "friday_close"),
                "saturday": ("saturday_open", "saturday_close"),
                "sunday": ("sunday_open", "sunday_close"),
            }
            
            for day, (open_attr, close_attr) in day_mapping.items():
                open_str = hours_data.get(f"{day}_open") or hours_data.get(f"{day.capitalize()}Open")
                close_str = hours_data.get(f"{day}_close") or hours_data.get(f"{day.capitalize()}Close")
                
                if open_str and close_str:
                    try:
                        open_time = datetime.strptime(open_str, "%H:%M").time()
                        close_time = datetime.strptime(close_str, "%H:%M").time()
                        setattr(gas_hours, open_attr, open_time)
                        setattr(gas_hours, close_attr, close_time)
                    except (ValueError, TypeError):
                        pass
            
            gas_data.hours = gas_hours
        
        # Set default payment methods
        gas_data.payment_methods = [
            "Credit Cards", "Debit Cards", "mPerks", "Cash"
        ]
        
        # Determine available fuel types based on data
        if gas_data.fuel_prices:
            fuel_types = [fp.fuel_type.lower() for fp in gas_data.fuel_prices]
            gas_data.has_regular = any("regular" in ft for ft in fuel_types)
            gas_data.has_midgrade = any("mid" in ft or "plus" in ft for ft in fuel_types)
            gas_data.has_premium = any("premium" in ft or "super" in ft for ft in fuel_types)
            gas_data.has_diesel = any("diesel" in ft for ft in fuel_types)
            gas_data.has_e85 = any("e85" in ft or "ethanol" in ft for ft in fuel_types)
        
        return gas_data
    
    def get_fuel_price(self, fuel_type: str) -> Optional[FuelPrice]:
        """
        Get price for specific fuel type.
        
        Args:
            fuel_type: Type of fuel (e.g., "Regular", "Premium", "Diesel")
            
        Returns:
            FuelPrice object if found, None otherwise
        """
        fuel_type_lower = fuel_type.lower()
        for price in self.fuel_prices:
            if fuel_type_lower in price.fuel_type.lower():
                return price
        return None
    
    def get_cheapest_fuel(self) -> Optional[FuelPrice]:
        """Get the cheapest fuel option."""
        if not self.fuel_prices:
            return None
        return min(self.fuel_prices, key=lambda fp: fp.price)
    
    def get_all_prices_formatted(self) -> List[str]:
        """Get all fuel prices as formatted strings."""
        return [str(price) for price in self.fuel_prices]
    
    def is_open_now(self) -> bool:
        """Check if gas station is currently open."""
        if self.hours:
            return self.hours.is_open_now()
        # If no specific hours, assume same as parent store
        if self._parent_store:
            return self._parent_store.is_24_hours() or True  # Default to open
        return True
    
    def get_services_summary(self) -> List[str]:
        """Get summary of available services."""
        services = []
        
        if self.has_regular:
            services.append("Regular Gas")
        if self.has_premium:
            services.append("Premium Gas")
        if self.has_diesel:
            services.append("Diesel")
        if self.has_e85:
            services.append("E85 Ethanol")
        if self.has_car_wash:
            services.append("Car Wash")
        if self.has_air_pump:
            services.append("Air Pump")
        if self.has_vacuum:
            services.append("Vacuum")
        if self.accepts_mperks:
            services.append("mPerks Rewards")
            
        return services
    
    def get_location_info(self) -> Dict[str, Any]:
        """Get gas station location information."""
        info = {
            "store_id": self.store_id,
            "name": self.station_name,
            "address": self.address,
        }
        
        if self.latitude and self.longitude:
            info["coordinates"] = f"{self.latitude}, {self.longitude}"
            info["latitude"] = self.latitude
            info["longitude"] = self.longitude
            
        return info
    
    def to_dict(self) -> Dict[str, Any]:
        """Convert gas station to dictionary representation."""
        return {
            "store_id": self.store_id,
            "station_name": self.station_name,
            "location": self.get_location_info(),
            "fuel_prices": [
                {
                    "fuel_type": fp.fuel_type,
                    "price": fp.price,
                    "formatted_price": fp.formatted_price,
                    "last_updated": fp.last_updated.isoformat() if fp.last_updated else None
                } for fp in self.fuel_prices
            ],
            "hours": self.hours.get_hours_summary() if self.hours else None,
            "is_open_now": self.is_open_now(),
            "services": self.get_services_summary(),
            "amenities": self.amenities,
            "payment_methods": self.payment_methods,
            "fuel_types": {
                "regular": self.has_regular,
                "midgrade": self.has_midgrade,
                "premium": self.has_premium,
                "diesel": self.has_diesel,
                "e85": self.has_e85,
            }
        }
    
    def __str__(self) -> str:
        """String representation of gas station."""
        status = "🟢 Open" if self.is_open_now() else "🔴 Closed"
        price_info = ""
        if self.fuel_prices:
            cheapest = self.get_cheapest_fuel()
            if cheapest:
                price_info = f" - {cheapest.fuel_type}: {cheapest.formatted_price}"
        
        return f"⛽ {self.station_name} ({status}){price_info}"
    
    def __repr__(self) -> str:
        """Detailed representation of gas station."""
        return f"MeijerGas(store_id={self.store_id}, prices={len(self.fuel_prices)}, open={self.is_open_now()})"


# Factory function for creating MeijerGas from store data
def create_gas_station_from_store(store_data: Dict[str, Any], parent_store: Optional["MeijerStore"] = None) -> Optional[MeijerGas]:
    """
    Create MeijerGas instance from store data if store has gas station.
    
    Args:
        store_data: Raw store data from API
        parent_store: Parent MeijerStore instance
        
    Returns:
        MeijerGas instance if applicable, None otherwise
    """
    return MeijerGas.from_store_data(store_data, parent_store)


if __name__ == "__main__":
    print("MeijerGas class for gas station functionality")
    print("Provides fuel prices, hours, amenities, and services for Meijer gas stations") 