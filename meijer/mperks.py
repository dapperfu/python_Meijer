"""
mPerks Client

This module provides a client for interacting with Meijer's mPerks loyalty program,
fetching real rewards from the API and creating reward objects from the actual JSON responses.
"""

import json
import logging
from datetime import datetime
from decimal import Decimal
from typing import Any, Dict, List, Optional, Union
from urllib.parse import urljoin
from dataclasses import dataclass, field

import requests

from .models.rewards import (
    BaseReward,
    FuelReward,
    ProductReward,
    RewardFactory,
    RewardMetadata,
    RewardRequirements,
    RewardStatus,
    RewardType,
    TotalPurchaseDiscountReward,
)
from .exceptions import MeijerAPIError, AuthenticationError


# Compatibility classes for existing code
@dataclass
class EarnableOffer:
    """Represents an earnable offer from mPerks."""
    offer_id: str
    title: str
    description: str
    points_required: int
    current_progress: int = 0
    target_progress: int = 1
    start_date: Optional[datetime] = None
    end_date: Optional[datetime] = None
    is_available: bool = True
    is_in_progress: bool = False
    image_url: Optional[str] = None
    category: Optional[str] = None
    subcategory: Optional[str] = None
    terms_and_conditions: Optional[str] = None
    reward_program: Optional[int] = None
    meijer_offer_id: Optional[int] = None
    
    @property
    def progress_percentage(self) -> float:
        """Calculate progress percentage."""
        if self.target_progress <= 0:
            return 0.0
        return min(100.0, (self.current_progress / self.target_progress) * 100)
    
    @property
    def is_completed(self) -> bool:
        """Check if the offer is completed."""
        return self.current_progress >= self.target_progress
    
    @property
    def is_expired(self) -> bool:
        """Check if the offer has expired."""
        if not self.end_date:
            return False
        return datetime.now() > self.end_date
    
    @property
    def days_remaining(self) -> Optional[int]:
        """Get days remaining until expiration."""
        if not self.end_date:
            return None
        delta = self.end_date - datetime.now()
        return max(0, delta.days)


@dataclass
class EarnedReward:
    """Represents an earned reward from mPerks."""
    reward_id: str
    title: str
    description: str
    earn_date: datetime
    expiration_date: Optional[datetime] = None
    redeem_date: Optional[datetime] = None
    transaction_date: Optional[datetime] = None
    reward_program: Optional[int] = None
    meijer_offer_id: Optional[int] = None
    image_url: Optional[str] = None
    points_earned: int = 0
    is_redeemed: bool = False
    is_expired: bool = False
    
    @property
    def days_until_expiration(self) -> Optional[int]:
        """Get days until expiration."""
        if not self.expiration_date:
            return None
        delta = self.expiration_date - datetime.now()
        return max(0, delta.days)


@dataclass
class EarnTabData:
    """Data for the earn tab in mPerks."""
    total_offers: int = 0
    available_offers: int = 0
    in_progress_offers: int = 0
    completed_offers: int = 0
    total_points_earned: int = 0
    total_points_pending: int = 0
    offers: List[EarnableOffer] = field(default_factory=list)
    
    def add_offer(self, offer: EarnableOffer) -> None:
        """Add an offer to the tab data."""
        self.offers.append(offer)
        self.total_offers += 1
        
        if offer.is_completed:
            self.completed_offers += 1
        elif offer.is_in_progress:
            self.in_progress_offers += 1
        else:
            self.available_offers += 1


@dataclass
class MCardInfo:
    """Information about mCard rewards."""
    card_number: str
    card_type: str
    balance: Decimal
    expiration_date: Optional[datetime] = None
    is_active: bool = True
    rewards_available: int = 0
    total_rewards_earned: int = 0


@dataclass
class MPerksEarnedRewards:
    """Container for earned rewards data."""
    total_rewards: int = 0
    total_points: int = 0
    rewards: List[EarnedReward] = field(default_factory=list)
    _history: Optional['MPerksHistory'] = None
    _mperks_client: Optional['MPerksClient'] = None
    
    def add_reward(self, reward: EarnedReward) -> None:
        """Add a reward to the container."""
        self.rewards.append(reward)
        self.total_rewards += 1
        self.total_points += reward.points_earned
    
    def set_mperks_client(self, client: 'MPerksClient') -> None:
        """Set the mPerks client for accessing history."""
        self._mperks_client = client
    
    @property
    def history(self) -> 'MPerksHistory':
        """
        Get mPerks points history.
        
        Returns:
            MPerksHistory object containing history events
        """
        if self._mperks_client:
            return self._mperks_client.history
        else:
            # Return empty history if no client is set
            return MPerksHistory()


@dataclass
class MPerksHistoryEvent:
    """Represents a single mPerks history event."""
    date: datetime
    points_change: int  # Positive for earnings, negative for redemptions
    event_type: str  # "Purchase Earnings", "Reward Claimed", etc.
    description: Optional[str] = None
    transaction_id: Optional[str] = None
    store_id: Optional[str] = None
    order_id: Optional[str] = None
    
    def __str__(self) -> str:
        """String representation of the history event."""
        points_str = f"+{self.points_change}" if self.points_change >= 0 else str(self.points_change)
        return f"mPerks<{self.date.strftime('%B %d, %Y')}, {points_str}, {self.event_type}>"
    
    def __repr__(self) -> str:
        """Detailed representation of the history event."""
        return f"MPerksHistoryEvent(date={self.date}, points_change={self.points_change}, event_type='{self.event_type}')"


@dataclass
class MPerksHistory:
    """Container for mPerks history data."""
    events: List[MPerksHistoryEvent] = field(default_factory=list)
    total_earnings: int = 0
    total_redemptions: int = 0
    net_points: int = 0
    
    def add_event(self, event: MPerksHistoryEvent) -> None:
        """Add a history event to the container."""
        self.events.append(event)
        
        if event.points_change > 0:
            self.total_earnings += event.points_change
        else:
            self.total_redemptions += abs(event.points_change)
        
        self.net_points = self.total_earnings - self.total_redemptions
    
    def get_events_by_type(self, event_type: str) -> List[MPerksHistoryEvent]:
        """Get all events of a specific type."""
        return [event for event in self.events if event.event_type == event_type]
    
    def get_events_by_date_range(self, start_date: datetime, end_date: datetime) -> List[MPerksHistoryEvent]:
        """Get events within a date range."""
        return [event for event in self.events if start_date <= event.date <= end_date]
    
    def get_recent_events(self, days: int = 30) -> List[MPerksHistoryEvent]:
        """Get events from the last N days."""
        from datetime import timedelta
        cutoff_date = datetime.now() - timedelta(days=days)
        return [event for event in self.events if event.date >= cutoff_date]
    
    def __len__(self) -> int:
        """Return the number of history events."""
        return len(self.events)
    
    def __getitem__(self, index: int) -> MPerksHistoryEvent:
        """Allow indexing into history events."""
        return self.events[index]
    
    def __iter__(self):
        """Allow iteration over history events."""
        return iter(self.events)


class MPerksClient:
    """Client for interacting with Meijer's mPerks loyalty program."""
    
    def __init__(self, session: Optional[requests.Session] = None):
        self.session = session or requests.Session()
        self.base_url = "https://api.meijer.com"
        self.logger = logging.getLogger(__name__)
        
        # API endpoints
        self.endpoints = {
            'available_rewards': '/digital/mperks40/customer/v1/rewardcoupons/available',
            'earned_rewards': '/loyalty/mPerks/api/reward/earned',
            'point_balance': '/digital/mperks40/customer/v1/pointbalance',
            'rewards_in_progress': '/digital/mperks40/customer/v1/rewards/inprogress',
            'rewards_available': '/digital/mperks40/customer/v1/rewards/available',
            'auto_claim': '/digital/mperks40/customer/v1/autoclaim/available',
            'account': '/digital/mperks40/customer/v1/account',
            'history': '/loyalty/mPerks/api/points/history',
            'transactions': '/loyalty/mPerks/api/points/transactions',
            'activity': '/loyalty/mPerks/api/points/activity',
        }
    
    def set_auth_token(self, token: str) -> None:
        """Set the authentication token for API requests."""
        self.session.headers.update({
            'Authorization': f'Bearer {token}',
            'OCP-APIM-Subscription-Key': 'a10bc58ac484478d9b3958b1742c3a03',
            'Content-Type': 'application/vnd.meijer.digitalmperks.getavailablerewardcoupons-v1.0+json'
        })
    
    def _make_request(self, endpoint: str, method: str = 'GET', **kwargs) -> Dict[str, Any]:
        """Make a request to the mPerks API."""
        url = urljoin(self.base_url, endpoint)
        
        try:
            response = self.session.request(method, url, **kwargs)
            response.raise_for_status()
            
            # Handle different content types
            if 'application/vnd.meijer.digitalmperks' in response.headers.get('content-type', ''):
                return response.json()
            else:
                return response.json()
                
        except requests.exceptions.RequestException as e:
            self.logger.error(f"API request failed: {e}")
            raise MeijerAPIError(f"Failed to fetch data from {endpoint}: {e}")
    
    def get_available_rewards(self) -> List[BaseReward]:
        """
        Fetch available rewards from the mPerks API.
        
        Returns:
            List of BaseReward objects created from the API response
        """
        self.logger.info("Fetching available rewards from mPerks API")
        
        try:
            response = self._make_request(self.endpoints['available_rewards'])
            rewards = []
            
            if 'availableRewardCoupons' in response:
                for reward_data in response['availableRewardCoupons']:
                    reward = self._create_reward_from_api_data(reward_data)
                    if reward:
                        rewards.append(reward)
            
            self.logger.info(f"Successfully fetched {len(rewards)} available rewards")
            return rewards
            
        except Exception as e:
            self.logger.error(f"Failed to fetch available rewards: {e}")
            raise
    
    def get_earned_rewards(self) -> List[BaseReward]:
        """
        Fetch earned rewards from the mPerks API.
        
        Returns:
            List of BaseReward objects created from the API response
        """
        self.logger.info("Fetching earned rewards from mPerks API")
        
        try:
            response = self._make_request(self.endpoints['earned_rewards'])
            rewards = []
            
            if 'rewards' in response:
                for reward_data in response['rewards']:
                    reward = self._create_earned_reward_from_api_data(reward_data)
                    if reward:
                        rewards.append(reward)
            
            self.logger.info(f"Successfully fetched {len(rewards)} earned rewards")
            return rewards
            
        except Exception as e:
            self.logger.error(f"Failed to fetch earned rewards: {e}")
            raise
    
    def get_point_balance(self) -> int:
        """Get the current mPerks point balance."""
        try:
            response = self._make_request(self.endpoints['point_balance'])
            if 'payload' in response and 'totalPoints' in response['payload']:
                return response['payload']['totalPoints']
            return 0
        except Exception as e:
            self.logger.error(f"Failed to fetch point balance: {e}")
            return 0
    
    def get_rewards_in_progress(self) -> List[Dict[str, Any]]:
        """Get rewards currently in progress (being earned)."""
        try:
            response = self._make_request(self.endpoints['rewards_in_progress'])
            return response if isinstance(response, list) else []
        except Exception as e:
            self.logger.error(f"Failed to fetch rewards in progress: {e}")
            return []
    
    def get_auto_claim_settings(self) -> Dict[str, Any]:
        """Get auto-claim settings and availability."""
        try:
            response = self._make_request(self.endpoints['auto_claim'])
            return response if isinstance(response, list) else []
        except Exception as e:
            self.logger.error(f"Failed to fetch auto-claim settings: {e}")
            return []
    
    def get_account_info(self) -> Dict[str, Any]:
        """Get mPerks account information."""
        try:
            response = self._make_request(self.endpoints['account'])
            return response
        except Exception as e:
            self.logger.error(f"Failed to fetch account info: {e}")
            return {}
    
    def get_history(self) -> MPerksHistory:
        """
        Fetch mPerks points history from the API.
        
        Returns:
            MPerksHistory object containing history events
        """
        self.logger.info("Fetching mPerks points history from API")
        
        try:
            # Try multiple endpoints to find the one that works
            history_data = None
            
            # Try the history endpoint first
            try:
                response = self._make_request(self.endpoints['history'])
                if response and isinstance(response, dict):
                    history_data = response
                    self.logger.info("Successfully fetched history from history endpoint")
            except Exception as e:
                self.logger.debug(f"History endpoint failed: {e}")
            
            # Try transactions endpoint if history failed
            if not history_data:
                try:
                    response = self._make_request(self.endpoints['transactions'])
                    if response and isinstance(response, dict):
                        history_data = response
                        self.logger.info("Successfully fetched history from transactions endpoint")
                except Exception as e:
                    self.logger.debug(f"Transactions endpoint failed: {e}")
            
            # Try activity endpoint if both failed
            if not history_data:
                try:
                    response = self._make_request(self.endpoints['activity'])
                    if response and isinstance(response, dict):
                        history_data = response
                        self.logger.info("Successfully fetched history from activity endpoint")
                except Exception as e:
                    self.logger.debug(f"Activity endpoint failed: {e}")
            
            if not history_data:
                self.logger.warning("All history endpoints failed, returning empty history")
                return MPerksHistory()
            
            # Parse the history data
            history = self._parse_history_data(history_data)
            self.logger.info(f"Successfully parsed {len(history)} history events")
            return history
            
        except Exception as e:
            self.logger.error(f"Failed to fetch mPerks history: {e}")
            return MPerksHistory()
    
    def _parse_history_data(self, data: Dict[str, Any]) -> MPerksHistory:
        """
        Parse history data from API response.
        
        Args:
            data: Raw history data from the API
            
        Returns:
            MPerksHistory object with parsed events
        """
        history = MPerksHistory()
        
        try:
            # Look for common data structures in the response
            events_data = None
            
            # Check for different possible data structures
            if 'transactions' in data:
                events_data = data['transactions']
            elif 'history' in data:
                events_data = data['history']
            elif 'activity' in data:
                events_data = data['activity']
            elif 'points' in data:
                events_data = data['points']
            elif 'events' in data:
                events_data = data['events']
            elif 'records' in data:
                events_data = data['records']
            elif 'data' in data:
                events_data = data['data']
            
            if not events_data:
                self.logger.warning("No events data found in response")
                return history
            
            # Handle both list and dict formats
            if isinstance(events_data, list):
                for event_data in events_data:
                    event = self._create_history_event_from_data(event_data)
                    if event:
                        history.add_event(event)
            elif isinstance(events_data, dict):
                # If it's a dict, it might have pagination or other structure
                if 'items' in events_data:
                    for event_data in events_data['items']:
                        event = self._create_history_event_from_data(event_data)
                        if event:
                            history.add_event(event)
                elif 'results' in events_data:
                    for event_data in events_data['results']:
                        event = self._create_history_event_from_data(event_data)
                        if event:
                            history.add_event(event)
                else:
                    # Try to treat the dict as a single event
                    event = self._create_history_event_from_data(events_data)
                    if event:
                        history.add_event(event)
            
        except Exception as e:
            self.logger.error(f"Error parsing history data: {e}")
        
        return history
    
    def _create_history_event_from_data(self, event_data: Dict[str, Any]) -> Optional[MPerksHistoryEvent]:
        """
        Create a history event from API response data.
        
        Args:
            event_data: Raw event data from the API
            
        Returns:
            MPerksHistoryEvent object or None if creation fails
        """
        try:
            # Extract common fields
            date_str = event_data.get('date') or event_data.get('transactionDate') or event_data.get('earnDate') or event_data.get('timestamp')
            points_change = event_data.get('points') or event_data.get('pointsChange') or event_data.get('amount') or 0
            event_type = event_data.get('type') or event_data.get('eventType') or event_data.get('description') or 'Unknown'
            description = event_data.get('description') or event_data.get('details') or event_data.get('note')
            transaction_id = event_data.get('transactionId') or event_data.get('id') or event_data.get('reference')
            store_id = event_data.get('storeId') or event_data.get('store')
            order_id = event_data.get('orderId') or event_data.get('order')
            
            # Parse date
            if date_str:
                try:
                    # Try different date formats
                    if 'T' in date_str and 'Z' in date_str:
                        # ISO format: 2025-01-15T10:30:00Z
                        date = datetime.fromisoformat(date_str.replace('Z', '+00:00'))
                    elif 'T' in date_str:
                        # ISO format without Z: 2025-01-15T10:30:00
                        date = datetime.fromisoformat(date_str)
                    else:
                        # Try common date formats
                        for fmt in ['%Y-%m-%d', '%m/%d/%Y', '%Y-%m-%d %H:%M:%S']:
                            try:
                                date = datetime.strptime(date_str, fmt)
                                break
                            except ValueError:
                                continue
                        else:
                            # If all formats fail, use current date
                            date = datetime.now()
                except Exception as e:
                    self.logger.debug(f"Failed to parse date '{date_str}': {e}")
                    date = datetime.now()
            else:
                date = datetime.now()
            
            # Ensure points_change is an integer
            try:
                points_change = int(points_change)
            except (ValueError, TypeError):
                points_change = 0
            
            # Normalize event type
            event_type_lower = event_type.lower()
            if any(word in event_type_lower for word in ['purchase', 'earn', 'earned', 'shopping']):
                event_type = "Purchase Earnings"
            elif any(word in event_type_lower for word in ['reward', 'claim', 'claimed', 'redeem', 'redemption']):
                event_type = "Reward Claimed"
            elif any(word in event_type_lower for word in ['bonus', 'promotion', 'offer']):
                event_type = "Bonus Points"
            elif any(word in event_type_lower for word in ['expire', 'expired', 'forfeit']):
                event_type = "Points Expired"
            else:
                event_type = event_type.title()
            
            return MPerksHistoryEvent(
                date=date,
                points_change=points_change,
                event_type=event_type,
                description=description,
                transaction_id=transaction_id,
                store_id=store_id,
                order_id=order_id
            )
            
        except Exception as e:
            self.logger.error(f"Failed to create history event from data: {e}")
            self.logger.debug(f"Problematic data: {event_data}")
            return None
    
    def _create_reward_from_api_data(self, reward_data: Dict[str, Any]) -> Optional[BaseReward]:
        """
        Create a reward object from API response data.
        
        Args:
            reward_data: Raw reward data from the API
            
        Returns:
            BaseReward object or None if creation fails
        """
        try:
            # Extract basic information
            coupon_id = reward_data.get('couponId')
            name = reward_data.get('name', '')
            description = reward_data.get('description', '')
            image_url = reward_data.get('imageUrl')
            display_price = reward_data.get('displayPrice')
            
            # Try to determine reward type and create appropriate object
            reward = self._determine_reward_type_and_create(reward_data, name, description)
            
            if reward:
                # Set metadata
                reward.metadata.image_url = image_url
                reward.metadata.meijer_offer_id = coupon_id
                
                # Set status based on API data
                if reward_data.get('isAvailable', True):
                    reward.status = RewardStatus.AVAILABLE
                else:
                    reward.status = RewardStatus.CLAIMED
                
                self.logger.debug(f"Created reward: {reward.title} (ID: {coupon_id})")
                return reward
            
        except Exception as e:
            self.logger.error(f"Failed to create reward from API data: {e}")
            self.logger.debug(f"Problematic data: {reward_data}")
        
        return None
    
    def _create_earned_reward_from_api_data(self, reward_data: Dict[str, Any]) -> Optional[BaseReward]:
        """
        Create a reward object from earned rewards API data.
        
        Args:
            reward_data: Raw earned reward data from the API
            
        Returns:
            BaseReward object or None if creation fails
        """
        try:
            # Extract basic information
            meijer_offer_id = reward_data.get('meijerOfferId')
            title = reward_data.get('title', '')
            description = reward_data.get('description', '')
            image_url = reward_data.get('imageUrl')
            earn_date = reward_data.get('earnDate')
            expiration_date = reward_data.get('expirationDate')
            reward_program = reward_data.get('rewardProgram')
            
            # Try to determine reward type and create appropriate object
            reward = self._determine_reward_type_and_create(reward_data, title, description)
            
            if reward:
                # Set metadata
                reward.metadata.image_url = image_url
                reward.metadata.meijer_offer_id = meijer_offer_id
                reward.metadata.reward_program = reward_program
                
                # Set dates
                if earn_date:
                    try:
                        reward.metadata.earn_date = datetime.fromisoformat(earn_date.replace('Z', '+00:00'))
                    except:
                        pass
                
                if expiration_date:
                    try:
                        reward.metadata.expiration_date = datetime.fromisoformat(expiration_date.replace('Z', '+00:00'))
                    except:
                        pass
                
                # Set status
                if reward_data.get('redeemDate'):
                    reward.status = RewardStatus.REDEEMED
                else:
                    reward.status = RewardStatus.CLAIMED
                
                self.logger.debug(f"Created earned reward: {reward.title} (ID: {meijer_offer_id})")
                return reward
            
        except Exception as e:
            self.logger.error(f"Failed to create earned reward from API data: {e}")
            self.logger.debug(f"Problematic data: {reward_data}")
        
        return None
    
    def _determine_reward_type_and_create(
        self, 
        reward_data: Dict[str, Any], 
        title: str, 
        description: str
    ) -> Optional[BaseReward]:
        """
        Determine the reward type and create the appropriate reward object.
        
        Args:
            reward_data: Raw reward data from the API
            title: Reward title
            description: Reward description
            
        Returns:
            BaseReward object or None if type cannot be determined
        """
        title_lower = title.lower()
        desc_lower = description.lower()
        
        # Check for fuel rewards
        if any(word in title_lower or word in desc_lower for word in ['fuel', 'gas', 'gallon']):
            return self._create_fuel_reward(reward_data, title, description)
        
        # Check for total purchase discounts
        if any(word in title_lower or word in desc_lower for word in ['total', 'purchase', 'basket', 'cart', 'off']):
            return self._create_total_purchase_discount(reward_data, title, description)
        
        # Check for product rewards
        if any(word in title_lower or word in desc_lower for word in ['free', '1 free', 'get', 'buy']):
            return self._create_product_reward(reward_data, title, description)
        
        # Default to product reward if we can't determine type
        self.logger.warning(f"Could not determine reward type for: {title}")
        return self._create_product_reward(reward_data, title, description)
    
    def _create_fuel_reward(
        self, 
        reward_data: Dict[str, Any], 
        title: str, 
        description: str
    ) -> FuelReward:
        """Create a fuel reward from API data."""
        # Extract fuel-specific information
        discount_per_gallon = self._extract_fuel_discount(title, description)
        max_gallons = self._extract_max_gallons(title, description)
        
        # Estimate points required based on discount value
        points_required = self._estimate_points_for_fuel_reward(discount_per_gallon, max_gallons)
        
        return RewardFactory.create_fuel_reward(
            title=title,
            description=description,
            points_required=points_required,
            discount_per_gallon=discount_per_gallon,
            max_gallons=max_gallons,
            fuel_types=["regular", "mid-grade", "premium"]
        )
    
    def _create_total_purchase_discount(
        self, 
        reward_data: Dict[str, Any], 
        title: str, 
        description: str
    ) -> TotalPurchaseDiscountReward:
        """Create a total purchase discount reward from API data."""
        # Extract discount information
        discount_amount = self._extract_discount_amount(title, description)
        minimum_purchase = self._extract_minimum_purchase(title, description)
        
        # Estimate points required based on discount value
        points_required = self._estimate_points_for_discount_reward(discount_amount)
        
        return RewardFactory.create_total_purchase_discount(
            title=title,
            description=description,
            points_required=points_required,
            discount_amount=discount_amount,
            minimum_purchase=minimum_purchase
        )
    
    def _create_product_reward(
        self, 
        reward_data: Dict[str, Any], 
        title: str, 
        description: str
    ) -> ProductReward:
        """Create a product reward from API data."""
        # Extract product information
        product_name = self._extract_product_name(title, description)
        product_category = self._extract_product_category(reward_data)
        max_quantity = self._extract_quantity(title, description)
        
        # Estimate points required based on product value
        points_required = self._estimate_points_for_product_reward(title, description)
        
        return RewardFactory.create_product_reward(
            title=title,
            description=description,
            points_required=points_required,
            product_name=product_name,
            product_category=product_category,
            max_quantity=max_quantity
        )
    
    def _extract_fuel_discount(self, title: str, description: str) -> Decimal:
        """Extract fuel discount amount from title/description."""
        import re
        
        # Look for patterns like "$0.10", "10 cents", "10¢"
        patterns = [
            r'\$(\d+\.?\d*)',  # $0.10, $1.00
            r'(\d+)\s*cents?',  # 10 cents
            r'(\d+)¢',  # 10¢
        ]
        
        for pattern in patterns:
            match = re.search(pattern, title + ' ' + description, re.IGNORECASE)
            if match:
                value = float(match.group(1))
                if 'cents' in match.group(0) or '¢' in match.group(0):
                    value = value / 100
                return Decimal(str(value))
        
        # Default to $0.10 if we can't extract
        return Decimal('0.10')
    
    def _extract_max_gallons(self, title: str, description: str) -> Optional[int]:
        """Extract maximum gallons from title/description."""
        import re
        
        # Look for patterns like "up to 20 gallons", "max 20 gal"
        patterns = [
            r'up\s+to\s+(\d+)\s*gallons?',
            r'max\s+(\d+)\s*gallons?',
            r'(\d+)\s*gallons?',
        ]
        
        for pattern in patterns:
            match = re.search(pattern, title + ' ' + description, re.IGNORECASE)
            if match:
                return int(match.group(1))
        
        return None
    
    def _extract_discount_amount(self, title: str, description: str) -> Decimal:
        """Extract discount amount from title/description."""
        import re
        
        # Look for patterns like "$2 off", "save $2", "discount $2"
        patterns = [
            r'\$(\d+\.?\d*)\s+off',
            r'save\s+\$(\d+\.?\d*)',
            r'discount\s+\$(\d+\.?\d*)',
            r'\$(\d+\.?\d*)',
        ]
        
        for pattern in patterns:
            match = re.search(pattern, title + ' ' + description, re.IGNORECASE)
            if match:
                return Decimal(match.group(1))
        
        # Default to $1.00 if we can't extract
        return Decimal('1.00')
    
    def _extract_minimum_purchase(self, title: str, description: str) -> Decimal:
        """Extract minimum purchase amount from title/description."""
        import re
        
        # Look for patterns like "when you spend $10", "minimum $10"
        patterns = [
            r'spend\s+\$(\d+\.?\d*)',
            r'minimum\s+\$(\d+\.?\d*)',
            r'when\s+you\s+spend\s+\$(\d+\.?\d*)',
        ]
        
        for pattern in patterns:
            match = re.search(pattern, title + ' ' + description, re.IGNORECASE)
            if match:
                return Decimal(match.group(1))
        
        # Default to $0.00 if we can't extract
        return Decimal('0.00')
    
    def _extract_product_name(self, title: str, description: str) -> str:
        """Extract product name from title/description."""
        # Remove common prefixes
        prefixes_to_remove = ['free', '1 free', 'get', 'buy']
        
        product_name = title
        for prefix in prefixes_to_remove:
            if product_name.lower().startswith(prefix.lower()):
                product_name = product_name[len(prefix):].strip()
                break
        
        # If still empty, try description
        if not product_name:
            product_name = description
        
        return product_name or "Product"
    
    def _extract_product_category(self, reward_data: Dict[str, Any]) -> Optional[str]:
        """Extract product category from reward data."""
        # This would need to be implemented based on actual API structure
        return None
    
    def _extract_quantity(self, title: str, description: str) -> int:
        """Extract quantity from title/description."""
        import re
        
        # Look for patterns like "1 free", "get 2", "buy 3"
        patterns = [
            r'(\d+)\s+free',
            r'get\s+(\d+)',
            r'buy\s+(\d+)',
        ]
        
        for pattern in patterns:
            match = re.search(pattern, title + ' ' + description, re.IGNORECASE)
            if match:
                return int(match.group(1))
        
        return 1
    
    def _estimate_points_for_fuel_reward(self, discount_per_gallon: Decimal, max_gallons: Optional[int]) -> int:
        """Estimate points required for fuel reward."""
        # Base calculation: $1 savings = 1000 points
        total_savings = discount_per_gallon * (max_gallons or 20)
        estimated_points = int(total_savings * 1000)
        
        # Round to common point values
        common_values = [500, 1000, 1500, 2000, 2500, 3000, 4000, 5000]
        return min(common_values, key=lambda x: abs(x - estimated_points))
    
    def _estimate_points_for_discount_reward(self, discount_amount: Decimal) -> int:
        """Estimate points required for discount reward."""
        # Base calculation: $1 savings = 1000 points
        estimated_points = int(discount_amount * 1000)
        
        # Round to common point values
        common_values = [500, 1000, 1500, 2000, 2500, 3000, 4000, 5000]
        return min(common_values, key=lambda x: abs(x - estimated_points))
    
    def _estimate_points_for_product_reward(self, title: str, description: str) -> int:
        """Estimate points required for product reward."""
        # This is a rough estimation based on common patterns
        text = (title + ' ' + description).lower()
        
        if any(word in text for word in ['drink', 'coffee', 'snack']):
            return 1000
        elif any(word in text for word in ['yogurt', 'bread', 'milk']):
            return 1500
        elif any(word in text for word in ['sunscreen', 'shampoo', 'deodorant']):
            return 2000
        else:
            return 1500  # Default
    
    def get_all_rewards(self) -> Dict[str, List[BaseReward]]:
        """
        Fetch all types of rewards from the mPerks API.
        
        Returns:
            Dictionary containing different types of rewards
        """
        try:
            return {
                'available': self.get_available_rewards(),
                'earned': self.get_earned_rewards(),
                'in_progress': self.get_rewards_in_progress(),
                'auto_claim': self.get_auto_claim_settings(),
                'point_balance': self.get_point_balance(),
                'account_info': self.get_account_info()
            }
        except Exception as e:
            self.logger.error(f"Failed to fetch all rewards: {e}")
            return {}
    
    @property
    def history(self) -> MPerksHistory:
        """
        Get mPerks points history.
        
        Returns:
            MPerksHistory object containing history events
        """
        return self.get_history()
    
    def claim_reward(self, reward: BaseReward, customer_points: int) -> bool:
        """
        Claim a reward using customer points.
        
        Args:
            reward: The reward to claim
            customer_points: Current customer point balance
            
        Returns:
            True if successfully claimed, False otherwise
        """
        if not reward.is_claimable:
            self.logger.warning(f"Reward {reward.title} is not claimable")
            return False
        
        if customer_points < reward.points_required:
            self.logger.warning(f"Insufficient points to claim {reward.title}")
            return False
        
        try:
            # Here you would make the actual API call to claim the reward
            # For now, we'll just update the local state
            success = reward.claim(customer_points)
            if success:
                self.logger.info(f"Successfully claimed reward: {reward.title}")
            return success
        except Exception as e:
            self.logger.error(f"Failed to claim reward {reward.title}: {e}")
            return False
