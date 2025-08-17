#!/usr/bin/env python3
"""
Comprehensive tests for the mperks module.

Tests all mPerks functionality including earned rewards and mCard info.
"""

import pytest
from unittest.mock import Mock, patch, MagicMock
from datetime import datetime, timedelta

from meijer.mperks import MPerksEarnedRewards
from meijer.mperks import EarnedReward, MCardInfo


class TestMPerksEarnedRewards:
    """Test the MPerksEarnedRewards class."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client.api_base_url = "https://api.meijer.com"
        self.mock_client._get_api_headers.return_value = {"Authorization": "Bearer test"}
        self.mock_client._make_request.return_value = Mock(status_code=200)
        
        self.mperks = MPerksEarnedRewards(self.mock_client)
    
    def test_init(self):
        """Test mPerks initialization."""
        assert self.mperks.meijer == self.mock_client
        assert hasattr(self.mperks, 'logger')
        assert self.mperks.logger is not None
        assert "earned_rewards" in self.mperks.endpoints
        assert "mcard_info" in self.mperks.endpoints
        assert "available_rewards" in self.mperks.endpoints
        assert "reward_categories" in self.mperks.endpoints
    
    def test_get_earned_rewards_success(self):
        """Test successful earned rewards retrieval."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "earnedRewards": [
                {
                    "id": "reward123",
                    "title": "Test Reward 1",
                    "description": "Test Description 1",
                    "rewardType": "points",
                    "pointsRequired": 100,
                    "pointsEarned": 50,
                    "isActive": True,
                    "category": "test",
                    "expirationDate": "2025-12-31T23:59:59Z"
                },
                {
                    "id": "reward456",
                    "title": "Test Reward 2",
                    "description": "Test Description 2",
                    "rewardType": "discount",
                    "pointsRequired": 200,
                    "pointsEarned": 100,
                    "isActive": False,
                    "category": "test",
                    "expirationDate": "2025-06-30T23:59:59Z"
                }
            ]
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        rewards = self.mperks.get_earned_rewards()
        
        assert len(rewards) == 2
        assert isinstance(rewards[0], EarnedReward)
        assert isinstance(rewards[1], EarnedReward)
        
        # Verify first reward
        first_reward = rewards[0]
        assert first_reward.id == "reward123"
        assert first_reward.title == "Test Reward 1"
        assert first_reward.description == "Test Description 1"
        assert first_reward.reward_type == "points"
        assert first_reward.points_required == 100
        assert first_reward.points_earned == 50
        assert first_reward.is_active is True
        assert first_reward.category == "test"
        assert first_reward.expiration_date is not None
        
        # Verify second reward
        second_reward = rewards[1]
        assert second_reward.id == "reward456"
        assert second_reward.title == "Test Reward 2"
        assert second_reward.reward_type == "discount"
        assert second_reward.is_active is False
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "POST"  # method
        assert "earned_rewards" in call_args[0][1]  # URL contains endpoint
        
        # Verify headers
        headers = call_args[1]["headers"]
        assert "accept" in headers
        assert "application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json" in headers["accept"]
        assert "content-type" in headers
        assert "application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json" in headers["content-type"]
    
    def test_get_earned_rewards_empty(self):
        """Test earned rewards retrieval with no rewards."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"earnedRewards": []}
        
        self.mock_client._make_request.return_value = mock_response
        
        rewards = self.mperks.get_earned_rewards()
        
        assert rewards == []
    
    def test_get_earned_rewards_failure(self):
        """Test earned rewards retrieval failure."""
        mock_response = Mock()
        mock_response.status_code = 500
        mock_response.text = "Internal Server Error"
        
        self.mock_client._make_request.return_value = mock_response
        
        rewards = self.mperks.get_earned_rewards()
        
        assert rewards == []
    
    def test_get_earned_rewards_exception(self):
        """Test earned rewards retrieval with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        rewards = self.mperks.get_earned_rewards()
        
        assert rewards == []
    
    def test_get_earned_rewards_with_parameters(self):
        """Test earned rewards retrieval with parameters."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"earnedRewards": []}
        
        self.mock_client._make_request.return_value = mock_response
        
        # Test with custom parameters
        rewards = self.mperks.get_earned_rewards(
            category="test",
            reward_type="points",
            is_active=True
        )
        
        # Verify the request was made with correct parameters
        call_args = self.mock_client._make_request.call_args
        data = call_args[1]["json"]
        
        assert data["category"] == "test"
        assert data["rewardType"] == "points"
        assert data["isActive"] is True
    
    def test_get_mcard_info_success(self):
        """Test successful mCard info retrieval."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "mCardInfo": {
                "cardNumber": "1234567890123456",
                "cardType": "mPerks",
                "balance": 25.50,
                "isActive": True,
                "expirationDate": "2025-12-31T23:59:59Z",
                "cardHolderName": "John Doe",
                "rewardsLevel": "Gold",
                "pointsBalance": 1500
            }
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        mcard = self.mperks.get_mcard_info()
        
        assert isinstance(mcard, MCardInfo)
        assert mcard.card_number == "1234567890123456"
        assert mcard.card_type == "mPerks"
        assert mcard.balance == 25.50
        assert mcard.is_active is True
        assert mcard.expiration_date is not None
        assert mcard.card_holder_name == "John Doe"
        assert mcard.rewards_level == "Gold"
        assert mcard.points_balance == 1500
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "GET"  # method
        assert "mcard_info" in call_args[0][1]  # URL contains endpoint
    
    def test_get_mcard_info_failure(self):
        """Test mCard info retrieval failure."""
        mock_response = Mock()
        mock_response.status_code = 500
        mock_response.text = "Internal Server Error"
        
        self.mock_client._make_request.return_value = mock_response
        
        mcard = self.mperks.get_mcard_info()
        
        assert mcard is None
    
    def test_get_mcard_info_exception(self):
        """Test mCard info retrieval with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        mcard = self.mperks.get_mcard_info()
        
        assert mcard is None
    
    def test_get_available_rewards_success(self):
        """Test successful available rewards retrieval."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "availableRewards": [
                {
                    "id": "avail123",
                    "title": "Available Reward 1",
                    "description": "Available Description 1",
                    "rewardType": "points",
                    "pointsRequired": 150,
                    "category": "available",
                    "isEligible": True
                },
                {
                    "id": "avail456",
                    "title": "Available Reward 2",
                    "description": "Available Description 2",
                    "rewardType": "discount",
                    "pointsRequired": 300,
                    "category": "available",
                    "isEligible": False
                }
            ]
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        rewards = self.mperks.get_available_rewards()
        
        assert len(rewards) == 2
        assert isinstance(rewards[0], EarnedReward)
        assert isinstance(rewards[1], EarnedReward)
        
        # Verify first reward
        first_reward = rewards[0]
        assert first_reward.id == "avail123"
        assert first_reward.title == "Available Reward 1"
        assert first_reward.reward_type == "points"
        assert first_reward.points_required == 150
        assert first_reward.category == "available"
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "GET"  # method
        assert "available_rewards" in call_args[0][1]  # URL contains endpoint
    
    def test_get_available_rewards_empty(self):
        """Test available rewards retrieval with no rewards."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"availableRewards": []}
        
        self.mock_client._make_request.return_value = mock_response
        
        rewards = self.mperks.get_available_rewards()
        
        assert rewards == []
    
    def test_get_available_rewards_failure(self):
        """Test available rewards retrieval failure."""
        mock_response = Mock()
        mock_response.status_code = 500
        mock_response.text = "Internal Server Error"
        
        self.mock_client._make_request.return_value = mock_response
        
        rewards = self.mperks.get_available_rewards()
        
        assert rewards == []
    
    def test_get_available_rewards_exception(self):
        """Test available rewards retrieval with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        rewards = self.mperks.get_available_rewards()
        
        assert rewards == []
    
    def test_get_reward_categories_success(self):
        """Test successful reward categories retrieval."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "categories": [
                "Grocery",
                "Pharmacy",
                "Gas",
                "General Merchandise",
                "Home & Garden"
            ]
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        categories = self.mperks.get_reward_categories()
        
        assert len(categories) == 5
        assert "Grocery" in categories
        assert "Pharmacy" in categories
        assert "Gas" in categories
        assert "General Merchandise" in categories
        assert "Home & Garden" in categories
        
        # Verify the request was made correctly
        call_args = self.mock_client._make_request.call_args
        assert call_args[0][0] == "GET"  # method
        assert "reward_categories" in call_args[0][1]  # URL contains endpoint
        
        # Verify query parameters
        params = call_args[1]["params"]
        assert params["clipFilter"] == "unclippedonly"  # Default value
    
    def test_get_reward_categories_with_filter(self):
        """Test reward categories retrieval with custom filter."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"categories": ["Grocery", "Pharmacy"]}
        
        self.mock_client._make_request.return_value = mock_response
        
        categories = self.mperks.get_reward_categories("clippedonly")
        
        assert len(categories) == 2
        
        # Verify the request was made with correct filter
        call_args = self.mock_client._make_request.call_args
        params = call_args[1]["params"]
        assert params["clipFilter"] == "clippedonly"
    
    def test_get_reward_categories_empty(self):
        """Test reward categories retrieval with no categories."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"categories": []}
        
        self.mock_client._make_request.return_value = mock_response
        
        categories = self.mperks.get_reward_categories()
        
        assert categories == []
    
    def test_get_reward_categories_failure(self):
        """Test reward categories retrieval failure."""
        mock_response = Mock()
        mock_response.status_code = 500
        mock_response.text = "Internal Server Error"
        
        self.mock_client._make_request.return_value = mock_response
        
        categories = self.mperks.get_reward_categories()
        
        assert categories == []
    
    def test_get_reward_categories_exception(self):
        """Test reward categories retrieval with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        categories = self.mperks.get_reward_categories()
        
        assert categories == []
    
    def test_parse_earned_rewards_response_success(self):
        """Test successful earned rewards response parsing."""
        response_data = {
            "earnedRewards": [
                {
                    "id": "reward123",
                    "title": "Test Reward",
                    "description": "Test Description",
                    "rewardType": "points",
                    "pointsRequired": 100,
                    "pointsEarned": 50,
                    "isActive": True,
                    "category": "test",
                    "expirationDate": "2025-12-31T23:59:59Z"
                }
            ]
        }
        
        rewards = self.mperks._parse_earned_rewards_response(response_data)
        
        assert len(rewards) == 1
        assert isinstance(rewards[0], EarnedReward)
        
        reward = rewards[0]
        assert reward.id == "reward123"
        assert reward.title == "Test Reward"
        assert reward.description == "Test Description"
        assert reward.reward_type == "points"
        assert reward.points_required == 100
        assert reward.points_earned == 50
        assert reward.is_active is True
        assert reward.category == "test"
        assert reward.expiration_date is not None
    
    def test_parse_earned_rewards_response_empty(self):
        """Test earned rewards response parsing with empty data."""
        response_data = {"earnedRewards": []}
        
        rewards = self.mperks._parse_earned_rewards_response(response_data)
        
        assert rewards == []
    
    def test_parse_earned_rewards_response_no_rewards(self):
        """Test earned rewards response parsing with no rewards field."""
        response_data = {"otherData": "value"}
        
        rewards = self.mperks._parse_earned_rewards_response(response_data)
        
        assert rewards == []
    
    def test_parse_earned_rewards_response_none(self):
        """Test earned rewards response parsing with None data."""
        rewards = self.mperks._parse_earned_rewards_response(None)
        
        assert rewards == []
    
    def test_parse_mcard_info_response_success(self):
        """Test successful mCard info response parsing."""
        response_data = {
            "mCardInfo": {
                "cardNumber": "1234567890123456",
                "cardType": "mPerks",
                "balance": 25.50,
                "isActive": True,
                "expirationDate": "2025-12-31T23:59:59Z",
                "cardHolderName": "John Doe",
                "rewardsLevel": "Gold",
                "pointsBalance": 1500
            }
        }
        
        mcard = self.mperks._parse_mcard_info_response(response_data)
        
        assert isinstance(mcard, MCardInfo)
        assert mcard.card_number == "1234567890123456"
        assert mcard.card_type == "mPerks"
        assert mcard.balance == 25.50
        assert mcard.is_active is True
        assert mcard.expiration_date is not None
        assert mcard.card_holder_name == "John Doe"
        assert mcard.rewards_level == "Gold"
        assert mcard.points_balance == 1500
    
    def test_parse_mcard_info_response_no_info(self):
        """Test mCard info response parsing with no info field."""
        response_data = {"otherData": "value"}
        
        mcard = self.mperks._parse_mcard_info_response(response_data)
        
        assert mcard is None
    
    def test_parse_mcard_info_response_none(self):
        """Test mCard info response parsing with None data."""
        mcard = self.mperks._parse_mcard_info_response(None)
        
        assert mcard is None
    
    def test_parse_available_rewards_response_success(self):
        """Test successful available rewards response parsing."""
        response_data = {
            "availableRewards": [
                {
                    "id": "avail123",
                    "title": "Available Reward",
                    "description": "Available Description",
                    "rewardType": "points",
                    "pointsRequired": 150,
                    "category": "available",
                    "isEligible": True
                }
            ]
        }
        
        rewards = self.mperks._parse_available_rewards_response(response_data)
        
        assert len(rewards) == 1
        assert isinstance(rewards[0], EarnedReward)
        
        reward = rewards[0]
        assert reward.id == "avail123"
        assert reward.title == "Available Reward"
        assert reward.description == "Available Description"
        assert reward.reward_type == "points"
        assert reward.points_required == 150
        assert reward.category == "available"
    
    def test_parse_available_rewards_response_empty(self):
        """Test available rewards response parsing with empty data."""
        response_data = {"availableRewards": []}
        
        rewards = self.mperks._parse_available_rewards_response(response_data)
        
        assert rewards == []
    
    def test_parse_available_rewards_response_no_rewards(self):
        """Test available rewards response parsing with no rewards field."""
        response_data = {"otherData": "value"}
        
        rewards = self.mperks._parse_available_rewards_response(response_data)
        
        assert rewards == []
    
    def test_parse_available_rewards_response_none(self):
        """Test available rewards response parsing with None data."""
        rewards = self.mperks._parse_available_rewards_response(None)
        
        assert rewards == []
    
    def test_parse_categories_response_success(self):
        """Test successful categories response parsing."""
        response_data = {
            "categories": [
                "Grocery",
                "Pharmacy",
                "Gas"
            ]
        }
        
        categories = self.mperks._parse_categories_response(response_data)
        
        assert len(categories) == 3
        assert "Grocery" in categories
        assert "Pharmacy" in categories
        assert "Gas" in categories
    
    def test_parse_categories_response_empty(self):
        """Test categories response parsing with empty data."""
        response_data = {"categories": []}
        
        categories = self.mperks._parse_categories_response(response_data)
        
        assert categories == []
    
    def test_parse_categories_response_no_categories(self):
        """Test categories response parsing with no categories field."""
        response_data = {"otherData": "value"}
        
        categories = self.mperks._parse_categories_response(response_data)
        
        assert categories == []
    
    def test_parse_categories_response_none(self):
        """Test categories response parsing with None data."""
        categories = self.mperks._parse_categories_response(None)
        
        assert categories == []
    
    def test_headers_merge(self):
        """Test that custom headers are properly merged with default headers."""
        # Mock the default headers
        default_headers = {
            "Authorization": "Bearer test",
            "ocp-apim-subscription-key": "test_key"
        }
        self.mock_client._get_api_headers.return_value = default_headers
        
        # Call a method that uses custom headers
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"earnedRewards": []}
        self.mock_client._make_request.return_value = mock_response
        
        self.mperks.get_earned_rewards()
        
        # Verify that headers were merged
        call_args = self.mock_client._make_request.call_args
        headers = call_args[1]["headers"]
        
        # Should have both custom and default headers
        assert "accept" in headers
        assert "content-type" in headers
        assert "Authorization" in headers
        assert "ocp-apim-subscription-key" in headers
        
        # Custom headers should be preserved
        assert headers["accept"] == "application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json"
        assert headers["content-type"] == "application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json"
        
        # Default headers should be preserved
        assert headers["Authorization"] == "Bearer test"
        assert headers["ocp-apim-subscription-key"] == "test_key"


if __name__ == "__main__":
    pytest.main([__file__]) 