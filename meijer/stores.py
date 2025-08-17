#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: MeijerStore class for store functionality within meijer module
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: typing, dataclasses, datetime, meijer.gas
 */

MeijerStore class for store information and functionality.

Represents Meijer store locations with comprehensive details including
services, hours, gas station information, and location data.
"""

from typing import Optional, Union, List, Dict, Any, TYPE_CHECKING
from dataclasses import dataclass, field
from datetime import datetime, time
import json
import logging
import math

if TYPE_CHECKING:
    from .client import Meijer
    from .gas import MeijerGas

logger = logging.getLogger(__name__)


@dataclass
class StoreHours:
    """Represents store operating hours."""
    
    open_time: time
    """Store opening time"""
    
    close_time: time
    """Store closing time"""
    
    is_24_hours: bool = False
    """Whether store is open 24 hours"""
    
    days_open: List[str] = field(default_factory=lambda: [
        "Monday", "Tuesday", "Wednesday", "Thursday", 
        "Friday", "Saturday", "Sunday"
    ])
    """Days of the week the store is open"""
    
    def is_open(self, check_time: Optional[time] = None, 
                check_day: Optional[str] = None) -> bool:
        """
        Check if store is currently open.
        
        Parameters
        ----------
        check_time : time, optional
            Time to check (defaults to current time)
        check_day : str, optional
            Day to check (defaults to current day)
            
        Returns
        -------
        bool
            True if store is open, False otherwise
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
class MeijerStore:
    """
    Represents a Meijer store location with comprehensive information.
    
    This class provides store details including location, services, hours,
    gas station information, and various amenities available at each store.
    """
    
    # Basic identification
    unit_id: str
    """Unique store unit identifier"""
    
    name: str
    """Store name/location"""
    
    # Address information
    address: str
    """Street address"""
    
    city: str
    """City where store is located"""
    
    state: str
    """State where store is located"""
    
    zip_code: str
    """ZIP code of store location"""
    
    phone_number: Optional[str] = None
    """Store contact phone number"""
    
    # Location coordinates
    latitude: Optional[float] = None
    """Store latitude coordinate"""
    
    longitude: Optional[float] = None
    """Store longitude coordinate"""
    
    # Store services and features
    has_pharmacy: bool = False
    """Whether store has a pharmacy"""
    
    has_optical: bool = False
    """Whether store has optical services"""
    
    has_bank: bool = False
    """Whether store has banking services"""
    
    has_curbside_pickup: bool = False
    """Whether store offers curbside pickup"""
    
    has_delivery: bool = False
    """Whether store offers delivery services"""
    
    has_self_checkout: bool = True
    """Whether store has self-checkout lanes"""
    
    has_coin_machine: bool = False
    """Whether store has coin counting machines"""
    
    has_photo_center: bool = False
    """Whether store has photo center services"""
    
    has_garden_center: bool = False
    """Whether store has garden center"""
    
    has_auto_center: bool = False
    """Whether store has auto center services"""
    
    # Store hours
    hours: Optional[StoreHours] = None
    """Store operating hours"""
    
    # Gas station information
    gas_station: Optional["MeijerGas"] = None
    """Gas station details if store has one"""
    
    # Store characteristics
    store_type: str = "Supercenter"
    """Type of store (Supercenter, Express, etc.)"""
    
    store_size: Optional[str] = None
    """Store size classification"""
    
    # Internal fields
    _meijer_client: Optional["Meijer"] = field(default=None, repr=False)
    """Reference to Meijer client instance"""
    
    _raw_data: Optional[Dict[str, Any]] = field(default=None, repr=False)
    """Raw API response data"""
    
    def __post_init__(self) -> None:
        """Validate store data."""
        if not self.unit_id.strip():
            raise ValueError("Unit ID cannot be empty")
        if not self.name.strip():
            raise ValueError("Store name cannot be empty")
        if not self.address.strip():
            raise ValueError("Address cannot be empty")
        if not self.city.strip():
            raise ValueError("City cannot be empty")
        if not self.state.strip():
            raise ValueError("State cannot be empty")
        if not self.zip_code.strip():
            raise ValueError("ZIP code cannot be empty")
    
    @classmethod
    def from_api_data(cls, data: Dict[str, Any], meijer_client: Optional["Meijer"] = None) -> "MeijerStore":
        """
        Create MeijerStore instance from API response data.
        
        Parameters
        ----------
        data : Dict[str, Any]
            Raw API response data for store
        meijer_client : Meijer, optional
            Reference to Meijer client instance
            
        Returns
        -------
        MeijerStore
            New MeijerStore instance
        """
        # Extract store hours if available (using the actual field names from API)
        hours = None
        if "CurbsideWeekdayOpen" in data and data.get("CurbsideWeekdayOpen"):
            try:
                # Parse the time format from API (e.g., "1900-01-01T08:00:00")
                open_time_str = data.get("CurbsideWeekdayOpen", "1900-01-01T08:00:00")
                close_time_str = data.get("CurbsideWeekdayClose", "1900-01-01T21:00:00")
                
                # Extract time portion (HH:MM:SS)
                open_time = time.fromisoformat(open_time_str.split("T")[1])
                close_time = time.fromisoformat(close_time_str.split("T")[1])
                
                hours = StoreHours(
                    open_time=open_time,
                    close_time=close_time,
                    is_24_hours=False,  # Meijer stores are typically not 24 hours
                    days_open=[
                        "Monday", "Tuesday", "Wednesday", "Thursday", 
                        "Friday", "Saturday", "Sunday"
                    ]
                )
            except (ValueError, TypeError) as e:
                logger.warning(f"Failed to parse store hours: {e}")
        
        # Extract gas station information if available
        gas_station = None
        # Create gas station if gas station amenities or hours are present
        if (data.get("GasStationAmenities") is not None and data.get("GasStationAmenities")) or \
           (data.get("GasStationHours") is not None and data.get("GasStationHours")):
            try:
                from .gas import MeijerGas
                gas_station = MeijerGas.from_api_data(
                    data, 
                    data.get("UnitId", "")
                )
            except Exception as e:
                logger.warning(f"Failed to parse gas station data: {e}")
        
        return cls(
            unit_id=str(data.get("UnitId", "")),
            name=data.get("Name", ""),
            address=data.get("Address", ""),
            city=data.get("City", ""),
            state=data.get("State", ""),
            zip_code=data.get("Zip", ""),
            phone_number=data.get("PhoneNumber"),
            latitude=data.get("Latitude"),
            longitude=data.get("Longitude"),
            has_pharmacy=bool(data.get("PharmPhone")),
            has_optical=False,  # Not directly available in API
            has_bank=False,     # Not directly available in API
            has_curbside_pickup=data.get("CurbsideAllow", "N") == "Y",
            has_delivery=data.get("DlvryOrderPhone") is not None,
            has_self_checkout=True,  # Assume available
            has_coin_machine=False,  # Not directly available in API
            has_photo_center=False,  # Not directly available in API
            has_garden_center=False, # Not directly available in API
            has_auto_center=False,   # Not directly available in API
            hours=hours,
            gas_station=gas_station,
            store_type="Supercenter",  # Default assumption
            store_size=None,
            _meijer_client=meijer_client,
            _raw_data=data
        )
    
    def get_distance_from(self, lat: float, lon: float) -> Optional[float]:
        """
        Calculate distance from given coordinates using Haversine formula.
        
        Parameters
        ----------
        lat : float
            Latitude coordinate
        lon : float
            Longitude coordinate
            
        Returns
        -------
        float, optional
            Distance in miles if coordinates available, None otherwise
        """
        if self.latitude is None or self.longitude is None:
            return None
        
        # Haversine formula for calculating distance between two points on Earth
        R = 3959  # Earth's radius in miles
        
        lat1, lon1 = math.radians(self.latitude), math.radians(self.longitude)
        lat2, lon2 = math.radians(lat), math.radians(lon)
        
        dlat = lat2 - lat1
        dlon = lon2 - lon1
        
        a = (math.sin(dlat/2)**2 + 
             math.cos(lat1) * math.cos(lat2) * math.sin(dlon/2)**2)
        c = 2 * math.asin(math.sqrt(a))
        
        return R * c
    
    def is_currently_open(self) -> bool:
        """
        Check if store is currently open.
        
        Returns
        -------
        bool
            True if currently open, False otherwise
        """
        if not self.hours:
            return True  # Assume open if no hours specified
        
        return self.hours.is_open()
    
    def get_services_summary(self) -> str:
        """
        Get a summary of available services.
        
        Returns
        -------
        str
            Comma-separated list of available services
        """
        services = []
        
        if self.has_pharmacy:
            services.append("Pharmacy")
        if self.has_optical:
            services.append("Optical")
        if self.has_bank:
            services.append("Banking")
        if self.has_gas_station():
            services.append("Gas Station")
        if self.has_curbside_pickup:
            services.append("Curbside Pickup")
        if self.has_delivery:
            services.append("Delivery")
        if self.has_photo_center:
            services.append("Photo Center")
        if self.has_garden_center:
            services.append("Garden Center")
        if self.has_auto_center:
            services.append("Auto Center")
        
        return ", ".join(services) if services else "Basic Grocery"
    
    def get_gas_station(self) -> Optional["MeijerGas"]:
        """
        Get gas station information if available.
        
        Returns
        -------
        MeijerGas, optional
            Gas station details if store has one, None otherwise
        """
        return self.gas_station
    
    def has_gas_station(self) -> bool:
        """Check if store has a gas station."""
        # Check for gas station amenities and hours, which are more reliable indicators
        has_gas_amenities = bool(self._raw_data and self._raw_data.get("GasStationAmenities"))
        has_gas_hours = bool(self._raw_data and self._raw_data.get("GasStationHours"))
        
        # A store has a gas station if it has gas station amenities or hours
        return has_gas_amenities or has_gas_hours
    
    def to_dict(self) -> Dict[str, Any]:
        """
        Convert store data to dictionary format.
        
        Returns
        -------
        Dict[str, Any]
            Dictionary representation of store data
        """
        return {
            "unit_id": self.unit_id,
            "name": self.name,
            "address": self.address,
            "city": self.city,
            "state": self.state,
            "zip_code": self.zip_code,
            "phone_number": self.phone_number,
            "latitude": self.latitude,
            "longitude": self.longitude,
            "services": {
                "has_pharmacy": self.has_pharmacy,
                "has_optical": self.has_optical,
                "has_bank": self.has_bank,
                "has_gas_station": self.has_gas_station(),
                "has_curbside_pickup": self.has_curbside_pickup,
                "has_delivery": self.has_delivery,
                "has_self_checkout": self.has_self_checkout,
                "has_coin_machine": self.has_coin_machine,
                "has_photo_center": self.has_photo_center,
                "has_garden_center": self.has_garden_center,
                "has_auto_center": self.has_auto_center
            },
            "hours": {
                "open_time": self.hours.open_time.isoformat() if self.hours else None,
                "close_time": self.hours.close_time.isoformat() if self.hours else None,
                "is_24_hours": self.hours.is_24_hours if self.hours else False,
                "days_open": self.hours.days_open if self.hours else []
            } if self.hours else None,
            "gas_station": self.gas_station.to_dict() if self.gas_station else None,
            "store_type": self.store_type,
            "store_size": self.store_size
        } 