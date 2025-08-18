"""
Store models for Meijer API responses.

This module contains dataclasses for store locations and services.
"""

from dataclasses import dataclass, field
from typing import Any, Dict, List, Optional


@dataclass
class Store:
    """Represents a Meijer store location."""

    store_id: str
    name: str
    address: str
    city: str
    state: str
    zip_code: str
    phone: Optional[str] = None
    hours: Optional[str] = None
    latitude: Optional[float] = None
    longitude: Optional[float] = None
    distance: Optional[float] = None
    is_open: bool = True
    services: List[str] = field(default_factory=list)
    raw_data: Optional[Dict[str, Any]] = None

    @property
    def full_address(self) -> str:
        """Get the complete address string."""
        return f"{self.address}, {self.city}, {self.state} {self.zip_code}"

    @property
    def has_phone(self) -> bool:
        """Check if the store has a phone number."""
        return bool(self.phone and self.phone.strip())

    @property
    def has_hours(self) -> bool:
        """Check if the store has hours information."""
        return bool(self.hours and self.hours.strip())

    @property
    def has_location_coordinates(self) -> bool:
        """Check if the store has latitude/longitude coordinates."""
        return self.latitude is not None and self.longitude is not None

    @property
    def has_distance_info(self) -> bool:
        """Check if the store has distance information."""
        return self.distance is not None

    @property
    def distance_formatted(self) -> Optional[str]:
        """Get the distance formatted as a string."""
        if self.distance is None:
            return None
        
        if self.distance < 1:
            return f"{self.distance * 5280:.0f} ft"
        elif self.distance < 10:
            return f"{self.distance:.1f} mi"
        else:
            return f"{self.distance:.0f} mi"

    @property
    def is_closed(self) -> bool:
        """Check if the store is currently closed."""
        return not self.is_open

    @property
    def has_services(self) -> bool:
        """Check if the store has any services listed."""
        return len(self.services) > 0

    @property
    def service_count(self) -> int:
        """Get the number of services available at the store."""
        return len(self.services)

    @property
    def has_pharmacy(self) -> bool:
        """Check if the store has a pharmacy."""
        pharmacy_keywords = ["pharmacy", "rx", "prescription"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in pharmacy_keywords)

    @property
    def has_photo_center(self) -> bool:
        """Check if the store has a photo center."""
        photo_keywords = ["photo", "photo center", "photography"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in photo_keywords)

    @property
    def has_gas_station(self) -> bool:
        """Check if the store has a gas station."""
        gas_keywords = ["gas", "fuel", "gas station"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in gas_keywords)

    @property
    def has_curbside_pickup(self) -> bool:
        """Check if the store offers curbside pickup."""
        pickup_keywords = ["curbside", "curbside pickup", "pickup"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in pickup_keywords)

    @property
    def has_delivery(self) -> bool:
        """Check if the store offers delivery."""
        delivery_keywords = ["delivery", "home delivery", "shipt"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in delivery_keywords)

    @property
    def has_self_checkout(self) -> bool:
        """Check if the store has self-checkout."""
        checkout_keywords = ["self checkout", "self-checkout", "express checkout"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in checkout_keywords)

    @property
    def has_restaurant(self) -> bool:
        """Check if the store has a restaurant or food service."""
        restaurant_keywords = ["restaurant", "cafe", "food court", "dining"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in restaurant_keywords)

    @property
    def has_bank(self) -> bool:
        """Check if the store has a bank or financial services."""
        bank_keywords = ["bank", "atm", "financial", "credit union"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in bank_keywords)

    @property
    def has_optical(self) -> bool:
        """Check if the store has optical services."""
        optical_keywords = ["optical", "eyewear", "glasses", "contacts"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in optical_keywords)

    @property
    def has_automotive(self) -> bool:
        """Check if the store has automotive services."""
        auto_keywords = ["automotive", "tire", "oil change", "car care"]
        return any(keyword in service.lower() for service in self.services 
                  for keyword in auto_keywords)

    @property
    def open_24_hours(self) -> bool:
        """Check if the store is open 24 hours."""
        if not self.has_hours:
            return False
        return "24" in self.hours or "24 hour" in self.hours.lower()

    @property
    def open_late(self) -> bool:
        """Check if the store is open late (past 10 PM)."""
        if not self.has_hours:
            return False
        return any(time in self.hours for time in ["11", "12", "1 AM", "2 AM", "3 AM"])

    @property
    def open_early(self) -> bool:
        """Check if the store opens early (before 7 AM)."""
        if not self.has_hours:
            return False
        return any(time in self.hours for time in ["5", "6", "7 AM"])

    @property
    def store_type(self) -> str:
        """Get the type of store based on services."""
        if self.has_gas_station:
            return "Supercenter with Gas"
        elif self.has_pharmacy:
            return "Supercenter"
        elif self.service_count > 5:
            return "Full Service Store"
        elif self.service_count > 2:
            return "Standard Store"
        else:
            return "Basic Store"

    @property
    def convenience_score(self) -> int:
        """Get a convenience score based on available services (0-100)."""
        score = 0
        
        # Core services
        if self.has_pharmacy:
            score += 20
        if self.has_photo_center:
            score += 15
        if self.has_gas_station:
            score += 15
        if self.has_curbside_pickup:
            score += 10
        if self.has_delivery:
            score += 10
        
        # Additional services
        if self.has_restaurant:
            score += 8
        if self.has_bank:
            score += 7
        if self.has_optical:
            score += 5
        if self.has_automotive:
            score += 5
        if self.has_self_checkout:
            score += 5
        
        # Hours convenience
        if self.open_24_hours:
            score += 20
        elif self.open_late:
            score += 10
        elif self.open_early:
            score += 5
        
        return min(score, 100)

    def to_dict(self) -> Dict[str, Any]:
        """Convert to dictionary for API requests."""
        result = {
            "storeId": self.store_id,
            "name": self.name,
            "address": self.address,
            "city": self.city,
            "state": self.state,
            "zipCode": self.zip_code,
            "phone": self.phone,
            "hours": self.hours,
            "latitude": self.latitude,
            "longitude": self.longitude,
            "distance": self.distance,
            "isOpen": self.is_open,
            "services": self.services,
        }
        # Remove None values
        return {k: v for k, v in result.items() if v is not None}
