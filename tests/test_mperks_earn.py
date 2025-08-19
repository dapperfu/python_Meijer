#!/usr/bin/env python3
"""
Tests for mPerks earn functionality.
Tests the new EarnableOffer and EarnTabData classes and related methods.
"""

import pytest
from datetime import datetime, timedelta
from unittest.mock import Mock, patch

from meijer.mperks import EarnableOffer, EarnTabData, MPerksEarnedRewards


class TestEarnableOffer:
    """Test the EarnableOffer dataclass."""

    def test_earnable_offer_creation(self):
        """Test creating an EarnableOffer with all fields."""
        offer = EarnableOffer(
            offer_id="test_123",
            title="Test Offer",
            description="Test description",
            category="Test Category",
            points_required=100,
            points_earned=50,
            status="in_progress",
            progress_current=50,
            progress_target=100,
            start_date=datetime.now(),
            end_date=datetime.now() + timedelta(days=30),
            image_url="http://example.com/image.jpg",
            terms_conditions="Test terms",
            is_active=True
        )

        assert offer.offer_id == "test_123"
        assert offer.title == "Test Offer"
        assert offer.description == "Test description"
        assert offer.category == "Test Category"
        assert offer.points_required == 100
        assert offer.points_earned == 50
        assert offer.status == "in_progress"
        assert offer.progress_current == 50
        assert offer.progress_target == 100
        assert offer.is_active is True

    def test_earnable_offer_progress_percentage(self):
        """Test progress percentage calculation."""
        # With progress
        offer = EarnableOffer(
            offer_id="test_1",
            title="Test",
            description="Test",
            category="Test",
            points_required=100,
            points_earned=50,
            status="in_progress",
            progress_current=75,
            progress_target=100
        )
        assert offer.progress_percentage == 75.0

        # Without progress
        offer_no_progress = EarnableOffer(
            offer_id="test_2",
            title="Test",
            description="Test",
            category="Test",
            points_required=100,
            points_earned=50,
            status="available"
        )
        assert offer_no_progress.progress_percentage is None

    def test_earnable_offer_expiry(self):
        """Test expiry date handling."""
        # Future date - use a fixed date to avoid timing issues
        future_date = datetime(2025, 12, 31)
        offer_future = EarnableOffer(
            offer_id="test_1",
            title="Test",
            description="Test",
            category="Test",
            points_required=100,
            points_earned=50,
            status="available",
            end_date=future_date
        )
        assert not offer_future.is_expired
        # Check that it's a positive number (not exact due to current date)
        assert offer_future.days_until_expiry > 0

        # Past date
        past_date = datetime(2024, 1, 1)
        offer_past = EarnableOffer(
            offer_id="test_2",
            title="Test",
            description="Test",
            category="Test",
            points_required=100,
            points_earned=50,
            status="available",
            end_date=past_date
        )
        assert offer_past.is_expired
        assert offer_past.days_until_expiry < 0

        # No date
        offer_no_date = EarnableOffer(
            offer_id="test_3",
            title="Test",
            description="Test",
            category="Test",
            points_required=100,
            points_earned=50,
            status="available"
        )
        assert not offer_no_date.is_expired
        assert offer_no_date.days_until_expiry is None

    def test_earnable_offer_to_dict(self):
        """Test conversion to dictionary."""
        start_date = datetime(2025, 1, 1)
        end_date = datetime(2025, 12, 31)
        
        offer = EarnableOffer(
            offer_id="test_123",
            title="Test Offer",
            description="Test description",
            category="Test Category",
            points_required=100,
            points_earned=50,
            status="in_progress",
            progress_current=50,
            progress_target=100,
            start_date=start_date,
            end_date=end_date,
            image_url="http://example.com/image.jpg",
            terms_conditions="Test terms",
            is_active=True
        )

        result = offer.to_dict()
        
        assert result["offerId"] == "test_123"
        assert result["title"] == "Test Offer"
        assert result["description"] == "Test description"
        assert result["category"] == "Test Category"
        assert result["pointsRequired"] == 100
        assert result["pointsEarned"] == 50
        assert result["status"] == "in_progress"
        assert result["progressCurrent"] == 50
        assert result["progressTarget"] == 100
        assert result["startDate"] == "2025-01-01T00:00:00"
        assert result["endDate"] == "2025-12-31T00:00:00"
        assert result["imageUrl"] == "http://example.com/image.jpg"
        assert result["termsConditions"] == "Test terms"
        assert result["isActive"] is True


class TestEarnTabData:
    """Test the EarnTabData dataclass."""

    def test_earn_tab_data_creation(self):
        """Test creating EarnTabData with sample offers."""
        offers = [
            EarnableOffer(
                offer_id="1",
                title="Offer 1",
                description="Test",
                category="Category A",
                points_required=100,
                points_earned=50,
                status="in_progress"
            ),
            EarnableOffer(
                offer_id="2",
                title="Offer 2",
                description="Test",
                category="Category B",
                points_required=200,
                points_earned=100,
                status="available"
            )
        ]

        earn_data = EarnTabData(
            in_progress_offers=offers[:1],
            available_offers=offers[1:],
            all_offers=offers,
            total_in_progress=1,
            total_available=1,
            total_all=2,
            last_updated=datetime.now()
        )

        assert earn_data.total_in_progress == 1
        assert earn_data.total_available == 1
        assert earn_data.total_all == 2
        assert len(earn_data.in_progress_offers) == 1
        assert len(earn_data.available_offers) == 1
        assert len(earn_data.all_offers) == 2

    def test_earn_tab_data_filtering(self):
        """Test filtering methods."""
        offers = [
            EarnableOffer(
                offer_id="1",
                title="Offer 1",
                description="Test",
                category="Category A",
                points_required=100,
                points_earned=50,
                status="in_progress"
            ),
            EarnableOffer(
                offer_id="2",
                title="Offer 2",
                description="Test",
                category="Category B",
                points_required=200,
                points_earned=100,
                status="available"
            ),
            EarnableOffer(
                offer_id="3",
                title="Offer 3",
                description="Test",
                category="Category A",
                points_required=150,
                points_earned=75,
                status="completed"
            )
        ]

        earn_data = EarnTabData(
            in_progress_offers=offers[:1],
            available_offers=offers[1:2],
            all_offers=offers,
            total_in_progress=1,
            total_available=1,
            total_all=3
        )

        # Test category filtering
        category_a_offers = earn_data.get_offers_by_category("Category A")
        assert len(category_a_offers) == 2
        assert all(offer.category == "Category A" for offer in category_a_offers)

        # Test status filtering
        in_progress_offers = earn_data.get_offers_by_status("in_progress")
        assert len(in_progress_offers) == 1
        assert all(offer.status == "in_progress" for offer in in_progress_offers)

        # Test active offers
        active_offers = earn_data.get_active_offers()
        assert len(active_offers) == 3  # All offers are active by default

    def test_earn_tab_data_empty(self):
        """Test EarnTabData with empty offers."""
        earn_data = EarnTabData(
            in_progress_offers=[],
            available_offers=[],
            all_offers=[],
            total_in_progress=0,
            total_available=0,
            total_all=0
        )

        assert earn_data.total_in_progress == 0
        assert earn_data.total_available == 0
        assert earn_data.total_all == 0
        
        # Test filtering on empty data
        assert len(earn_data.get_offers_by_category("Test")) == 0
        assert len(earn_data.get_offers_by_status("available")) == 0
        assert len(earn_data.get_active_offers()) == 0


class TestMPerksEarnedRewardsEarn:
    """Test the earn-related methods in MPerksEarnedRewards."""

    def setup_method(self):
        """Set up test fixtures."""
        self.mock_client = Mock()
        self.mock_client.api_base_url = "https://api.meijer.com"
        self.mock_client._get_api_headers.return_value = {"Authorization": "Bearer test"}
        self.mock_client._make_request.return_value = Mock(status_code=200, json=lambda: {})
        
        self.mperks = MPerksEarnedRewards(self.mock_client)

    def test_get_earn_offers_success(self):
        """Test successful earn offers retrieval."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "inProgressOffers": [],
            "availableOffers": [],
            "allOffers": [],
            "lastUpdated": "2025-01-01T00:00:00Z"
        }
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.mperks.get_earn_offers()
        
        assert isinstance(result, EarnTabData)
        assert result.total_in_progress == 0
        assert result.total_available == 0
        assert result.total_all == 0
        
        # Verify the correct endpoint was called
        self.mock_client._make_request.assert_called_once()
        call_args = self.mock_client._make_request.call_args
        assert "earn/offers" in call_args[0][1]  # URL contains endpoint

    def test_get_earn_offers_failure(self):
        """Test earn offers retrieval failure."""
        mock_response = Mock()
        mock_response.status_code = 404
        mock_response.text = "Not Found"
        
        self.mock_client._make_request.return_value = mock_response
        
        with pytest.raises(Exception):  # Should raise an exception
            self.mperks.get_earn_offers()

    def test_get_earn_offers_exception(self):
        """Test earn offers retrieval with exception."""
        self.mock_client._make_request.side_effect = Exception("Network error")
        
        result = self.mperks.get_earn_offers()
        
        # Should return empty EarnTabData on exception
        assert isinstance(result, EarnTabData)
        assert result.total_in_progress == 0
        assert result.total_available == 0
        assert result.total_all == 0

    def test_get_earn_offers_in_progress(self):
        """Test getting in-progress earn offers."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = [
            {
                "offerId": "1",
                "title": "Test Offer",
                "description": "Test",
                "category": "Test",
                "pointsRequired": 100,
                "pointsEarned": 50,
                "status": "in_progress",
                "progressCurrent": 50,
                "progressTarget": 100
            }
        ]
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.mperks.get_earn_offers_in_progress()
        
        assert len(result) == 1
        assert isinstance(result[0], EarnableOffer)
        assert result[0].offer_id == "1"
        assert result[0].status == "in_progress"

    def test_get_earn_offers_available(self):
        """Test getting available earn offers."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = [
            {
                "offerId": "2",
                "title": "Available Offer",
                "description": "Test",
                "category": "Test",
                "pointsRequired": 200,
                "pointsEarned": 100,
                "status": "available"
            }
        ]
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.mperks.get_earn_offers_available()
        
        assert len(result) == 1
        assert isinstance(result[0], EarnableOffer)
        assert result[0].offer_id == "2"
        assert result[0].status == "available"

    def test_get_earn_offers_all(self):
        """Test getting all earn offers."""
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = [
            {
                "offerId": "1",
                "title": "Offer 1",
                "description": "Test",
                "category": "Category A",
                "pointsRequired": 100,
                "pointsEarned": 50,
                "status": "in_progress"
            },
            {
                "offerId": "2",
                "title": "Offer 2",
                "description": "Test",
                "category": "Category B",
                "pointsRequired": 200,
                "pointsEarned": 100,
                "status": "available"
            }
        ]
        
        self.mock_client._make_request.return_value = mock_response
        
        result = self.mperks.get_earn_offers_all()
        
        assert len(result) == 2
        assert all(isinstance(offer, EarnableOffer) for offer in result)
        assert result[0].offer_id == "1"
        assert result[1].offer_id == "2"

    def test_parse_earn_offers_response(self):
        """Test parsing earn offers response."""
        data = {
            "inProgressOffers": [
                {
                    "offerId": "1",
                    "title": "In Progress",
                    "description": "Test",
                    "category": "Test",
                    "pointsRequired": 100,
                    "pointsEarned": 50,
                    "status": "in_progress"
                }
            ],
            "availableOffers": [
                {
                    "offerId": "2",
                    "title": "Available",
                    "description": "Test",
                    "category": "Test",
                    "pointsRequired": 200,
                    "pointsEarned": 100,
                    "status": "available"
                }
            ],
            "allOffers": [
                {
                    "offerId": "1",
                    "title": "In Progress",
                    "description": "Test",
                    "category": "Test",
                    "pointsRequired": 100,
                    "pointsEarned": 50,
                    "status": "in_progress"
                },
                {
                    "offerId": "2",
                    "title": "Available",
                    "description": "Test",
                    "category": "Test",
                    "pointsRequired": 200,
                    "pointsEarned": 100,
                    "status": "available"
                }
            ],
            "lastUpdated": "2025-01-01T00:00:00Z"
        }
        
        result = self.mperks._parse_earn_offers_response(data)
        
        assert isinstance(result, EarnTabData)
        assert result.total_in_progress == 1
        assert result.total_available == 1
        assert result.total_all == 2
        assert len(result.in_progress_offers) == 1
        assert len(result.available_offers) == 1
        assert len(result.all_offers) == 2

    def test_parse_earnable_offers_response(self):
        """Test parsing earnable offers response."""
        data = [
            {
                "offerId": "1",
                "title": "Test Offer",
                "description": "Test description",
                "category": "Test Category",
                "pointsRequired": 100,
                "pointsEarned": 50,
                "status": "in_progress",
                "progressCurrent": 50,
                "progressTarget": 100,
                "startDate": "2025-01-01T00:00:00Z",
                "endDate": "2025-12-31T00:00:00Z",
                "imageUrl": "http://example.com/image.jpg",
                "termsConditions": "Test terms",
                "isActive": True
            }
        ]
        
        result = self.mperks._parse_earnable_offers_response(data)
        
        assert len(result) == 1
        assert isinstance(result[0], EarnableOffer)
        offer = result[0]
        assert offer.offer_id == "1"
        assert offer.title == "Test Offer"
        assert offer.description == "Test description"
        assert offer.category == "Test Category"
        assert offer.points_required == 100
        assert offer.points_earned == 50
        assert offer.status == "in_progress"
        assert offer.progress_current == 50
        assert offer.progress_target == 100
        assert offer.is_active is True

    def test_parse_earnable_offers_response_empty(self):
        """Test parsing empty earnable offers response."""
        result = self.mperks._parse_earnable_offers_response([])
        assert result == []

    def test_parse_earnable_offers_response_invalid(self):
        """Test parsing invalid earnable offers response."""
        data = [
            {
                "offerId": "1",
                "title": "Test Offer",
                # Missing required fields
            }
        ]
        
        result = self.mperks._parse_earnable_offers_response(data)
        
        # Should handle missing fields gracefully
        assert len(result) == 1
        assert result[0].offer_id == "1"
        assert result[0].title == "Test Offer"
        assert result[0].description == ""
        assert result[0].category == ""
        assert result[0].points_required == 0
        assert result[0].points_earned == 0
        assert result[0].status == "available"
        assert result[0].is_active is True
