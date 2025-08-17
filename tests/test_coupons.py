#!/usr/bin/env python3
"""
Comprehensive tests for the coupons module.

Tests all coupon functionality including clipping, unclipping, and parsing.
"""

import pytest
from unittest.mock import Mock, patch, MagicMock
from datetime import datetime

from meijer.coupons import (
    MeijerCouponManager, create_meijer_coupons_from_response,
    clip_coupon, unclip_coupon, HatColor, BorderColor
)
from meijer.models import MeijerCoupon
from meijer.exceptions import MeijerAuthenticationError


class TestMeijerCouponManager:
    """Test the MeijerCouponManager class."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.manager = MeijerCouponManager(self.mock_client)
    
    def test_init(self):
        """Test manager initialization."""
        assert self.manager.meijer_client == self.mock_client
        assert self.manager.logger == self.mock_client.logger
    
    def test_create_meijer_coupons_from_response(self):
        """Test coupon creation from response."""
        response_data = {
            "listOfCoupons": [
                {
                    "offer": {
                        "meijerOfferId": 123,
                        "title": "Test Coupon 1",
                        "description": "Description 1"
                    }
                },
                {
                    "offer": {
                        "meijerOfferId": 456,
                        "title": "Test Coupon 2",
                        "description": "Description 2"
                    }
                }
            ]
        }
        
        coupons = self.manager.create_meijer_coupons_from_response(response_data)
        assert len(coupons) == 2
        assert coupons[0].meijer_offer_id == 123
        assert coupons[0].title == "Test Coupon 1"
        assert coupons[1].meijer_offer_id == 456
        assert coupons[1].title == "Test Coupon 2"
    
    def test_create_meijer_coupons_empty_response(self):
        """Test coupon creation from empty response."""
        response_data = {"listOfCoupons": []}
        coupons = self.manager.create_meijer_coupons_from_response(response_data)
        assert coupons == []
    
    def test_create_meijer_coupons_no_offers(self):
        """Test coupon creation from response without offers."""
        response_data = {"otherData": "value"}
        coupons = self.manager.create_meijer_coupons_from_response(response_data)
        assert coupons == []
    
    def test_create_meijer_coupons_malformed(self):
        """Test coupon creation from malformed response."""
        response_data = {
            "listOfCoupons": [
                {"invalid": "data"},
                {
                    "offer": {
                        "meijerOfferId": 123,
                        "title": "Valid Coupon"
                    }
                }
            ]
        }
        
        coupons = self.manager.create_meijer_coupons_from_response(response_data)
        assert len(coupons) == 1
        assert coupons[0].meijer_offer_id == 123


class TestCouponFunctions:
    """Test standalone coupon functions."""
    
    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client.api_base_url = "https://api.meijer.com"
        self.mock_client._get_api_headers.return_value = {"Authorization": "Bearer test"}
    
    def test_clip_coupon_success(self):
        """Test successful coupon clipping."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {"result": "success"}
            mock_request.return_value = mock_response
            
            result = clip_coupon(self.mock_client, 123)
            assert result is True
    
    def test_clip_coupon_success_status_only(self):
        """Test successful coupon clipping with status code only."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_response = Mock()
            mock_response.status_code = 201
            mock_response.json.side_effect = Exception("JSON error")
            mock_request.return_value = mock_response
            
            result = clip_coupon(self.mock_client, 123)
            assert result is True
    
    def test_clip_coupon_failure(self):
        """Test failed coupon clipping."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_response = Mock()
            mock_response.status_code = 400
            mock_request.return_value = mock_response
            
            result = clip_coupon(self.mock_client, 123)
            assert result is False
    
    def test_clip_coupon_exception(self):
        """Test coupon clipping with exception."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_request.side_effect = Exception("Network error")
            
            result = clip_coupon(self.mock_client, 123)
            assert result is False
    
    def test_unclip_coupon_success(self):
        """Test successful coupon unclipping."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {"result": "success"}
            mock_request.return_value = mock_response
            
            result = unclip_coupon(self.mock_client, 123)
            assert result is True
    
    def test_unclip_coupon_success_status_only(self):
        """Test successful coupon unclipping with status code only."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_response = Mock()
            mock_response.status_code = 201
            mock_response.json.side_effect = Exception("JSON error")
            mock_request.return_value = mock_response
            
            result = unclip_coupon(self.mock_client, 123)
            assert result is True
    
    def test_unclip_coupon_failure(self):
        """Test failed coupon unclipping."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_response = Mock()
            mock_response.status_code = 400
            mock_request.return_value = mock_response
            
            result = unclip_coupon(self.mock_client, 123)
            assert result is False
    
    def test_unclip_coupon_exception(self):
        """Test coupon unclipping with exception."""
        with patch.object(self.mock_client, '_make_request') as mock_request:
            mock_request.side_effect = Exception("Network error")
            
            result = unclip_coupon(self.mock_client, 123)
            assert result is False


class TestCouponCreation:
    """Test coupon creation from various response formats."""
    
    def test_create_meijer_coupons_basic(self):
        """Test basic coupon creation."""
        mock_client = Mock()
        
        response_data = {
            "listOfCoupons": [
                {
                    "offer": {
                        "meijerOfferId": 123,
                        "title": "Test Coupon",
                        "description": "Test Description"
                    }
                }
            ]
        }
        
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert len(coupons) == 1
        assert coupons[0].meijer_offer_id == 123
        assert coupons[0].title == "Test Coupon"
        assert coupons[0].description == "Test Description"
    
    def test_create_meijer_coupons_with_metadata(self):
        """Test coupon creation with metadata."""
        mock_client = Mock()
        
        response_data = {
            "listOfCoupons": [
                {
                    "offer": {
                        "meijerOfferId": 123,
                        "title": "Test Coupon",
                        "description": "Test Description",
                        "isClipped": True,
                        "isSuggested": True,
                        "isTargeted": False,
                        "isHidden": False,
                        "imageUrl": "https://example.com/image.jpg",
                        "disclaimer": "Test disclaimer"
                    }
                }
            ]
        }
        
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert len(coupons) == 1
        coupon = coupons[0]
        assert coupon.is_clipped is True
        assert coupon.is_suggested is True
        assert coupon.is_targeted is False
        assert coupon.is_hidden is False
        assert coupon.image_url == "https://example.com/image.jpg"
        assert coupon.disclaimer == "Test disclaimer"
    
    def test_create_meijer_coupons_with_colors(self):
        """Test coupon creation with hat and border colors."""
        mock_client = Mock()
        
        response_data = {
            "listOfCoupons": [
                {
                    "offer": {
                        "meijerOfferId": 123,
                        "title": "Test Coupon",
                        "description": "Test Description",
                        "hatColor": 1,  # BLUE
                        "borderColor": 2  # RED
                    }
                }
            ]
        }
        
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert len(coupons) == 1
        coupon = coupons[0]
        assert coupon.hat_color == HatColor.BLUE
        assert coupon.border_color == BorderColor.RED
    
    def test_create_meijer_coupons_missing_fields(self):
        """Test coupon creation with missing fields."""
        mock_client = Mock()
        
        response_data = {
            "listOfCoupons": [
                {
                    "offer": {
                        "meijerOfferId": 123,
                        "title": "Test Coupon",
                        # Missing description and other fields
                    }
                }
            ]
        }
        
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert len(coupons) == 1
        coupon = coupons[0]
        assert coupon.meijer_offer_id == 123
        assert coupon.title == "Test Coupon"
        assert coupon.description is None
        assert coupon.is_clipped is False
        assert coupon.is_suggested is False
    
        def test_create_meijer_coupons_invalid_offer(self):
        """Test coupon creation with invalid offer data."""
        mock_client = Mock()

        response_data = {
            "listOfCoupons": [
                {
                    "offer": {
                        "meijerOfferId": "invalid_id",  # Should be int
                        "title": 123,  # Should be string
                        "description": None
                    }
                }
            ]
        }

        # Should filter out invalid offers gracefully
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert len(coupons) == 0  # Invalid offers should be filtered out
        # The coupon should still be created with the data as-is
    
    def test_create_meijer_coupons_empty_list(self):
        """Test coupon creation from empty list."""
        mock_client = Mock()
        
        response_data = {"listOfCoupons": []}
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert coupons == []
    
    def test_create_meijer_coupons_no_list(self):
        """Test coupon creation from response without listOfCoupons."""
        mock_client = Mock()
        
        response_data = {"otherData": "value"}
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert coupons == []
    
    def test_create_meijer_coupons_none_response(self):
        """Test coupon creation from None response."""
        mock_client = Mock()
        
        coupons = create_meijer_coupons_from_response(None, mock_client)
        assert coupons == []
    
    def test_create_meijer_coupons_malformed_offer(self):
        """Test coupon creation with malformed offer structure."""
        mock_client = Mock()
        
        response_data = {
            "listOfCoupons": [
                {
                    "offer": None  # Invalid offer
                },
                {
                    "offer": {
                        "meijerOfferId": 123,
                        "title": "Valid Coupon"
                    }
                }
            ]
        }
        
        coupons = create_meijer_coupons_from_response(response_data, mock_client)
        assert len(coupons) == 1  # Only the valid one
        assert coupons[0].meijer_offer_id == 123


class TestCouponEnums:
    """Test the coupon-related enums."""
    
    def test_hat_color_values(self):
        """Test HatColor enum values."""
        assert HatColor.NONE.value == 0
        assert HatColor.BLUE.value == 1
        assert HatColor.RED.value == 2
        
        # Test string representation
        assert str(HatColor.BLUE) == "HatColor.BLUE"
        assert repr(HatColor.RED) == "<HatColor.RED: 2>"
    
    def test_border_color_values(self):
        """Test BorderColor enum values."""
        assert BorderColor.NONE.value == 0
        assert BorderColor.BLUE.value == 1
        assert BorderColor.RED.value == 2
        
        # Test string representation
        assert str(BorderColor.BLUE) == "BorderColor.BLUE"
        assert repr(BorderColor.RED) == "<BorderColor.RED: 2>"


if __name__ == "__main__":
    pytest.main([__file__]) 