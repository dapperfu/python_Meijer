#!/usr/bin/env python3
"""
Comprehensive tests for the main Meijer client.

Tests all public methods and edge cases.
"""

import json
import os
import tempfile
from pathlib import Path
from unittest.mock import Mock, patch

import pytest

from meijer import Meijer
from meijer.exceptions import MeijerAPIError, MeijerAuthenticationError
from meijer.models import ListItem, MeijerItem


class TestMeijerClient:
    """Test the main Meijer client class."""

    def setup_method(self):
        """Set up test fixtures."""
        self.client = Meijer()
        # Mock the components to avoid actual API calls
        self.client.shopping_list = Mock()
        self.client.coupons = Mock()
        self.client.search = Mock()
        self.client.shop_scan = Mock()
        self.client.mperks = Mock()

    def test_init_default(self):
        """Test client initialization with default parameters."""
        client = Meijer()
        assert client.api_base_url == "https://api.meijer.com"
        assert client.subscription_key == "a10bc58ac484478d9b3958b1742c3a03"
        assert client.shopping_list is not None
        assert client.coupons is not None
        assert client.search is not None
        assert client.shop_scan is not None
        assert client.mperks is not None

    def test_init_with_auth_file(self):
        """Test client initialization with auth file."""
        # Test bearer token
        with tempfile.NamedTemporaryFile(mode="w", suffix=".txt", delete=False) as f:
            f.write("bearer=test_token_123")
            auth_file = f.name

        try:
            client = Meijer(auth_file)
            assert client._access_token == "test_token_123"
            assert client._user_credentials is None
        finally:
            os.unlink(auth_file)

        # Test user credentials
        with tempfile.NamedTemporaryFile(mode="w", suffix=".txt", delete=False) as f:
            f.write("user=test@example.com\npassword=testpass")
            auth_file = f.name

        try:
            client = Meijer(auth_file)
            assert client._access_token is None
            assert client._user_credentials == ("test@example.com", "testpass")
        finally:
            os.unlink(auth_file)

    def test_init_with_config_file(self, monkeypatch):
        """Test client initialization with config file."""
        config_data = {
            "access_token": "config_token_123",
            "refresh_token": "refresh_token_123",
        }

        # Create a temporary directory for the test
        with tempfile.TemporaryDirectory() as temp_dir:
            config_dir = Path(temp_dir) / ".config"
            config_dir.mkdir()
            config_file = config_dir / "meijer.txt"

            with open(config_file, "w") as f:
                json.dump(config_data, f)

            # Mock the home directory to use our test config
            monkeypatch.setattr(Path, "home", lambda: Path(temp_dir))
            client = Meijer()
            assert client._access_token == "config_token_123"
            assert client._refresh_token == "refresh_token_123"

    def test_get_api_headers(self):
        """Test API headers generation."""
        headers = self.client._get_api_headers()
        # When authenticated, should use Bearer token instead of subscription key
        if self.client._access_token:
            assert "Authorization" in headers
            assert headers["Authorization"].startswith("Bearer ")
        else:
            # Fallback to subscription key when no token available
            assert "ocp-apim-subscription-key" in headers
            assert (
                headers["ocp-apim-subscription-key"]
                == "a10bc58ac484478d9b3958b1742c3a03"
            )

    def test_get_api_headers_with_auth(self):
        """Test API headers with authentication."""
        self.client._access_token = "test_token_123"
        headers = self.client._get_api_headers()
        assert "Authorization" in headers
        assert headers["Authorization"] == "Bearer test_token_123"

    def test_make_request_success(self):
        """Test successful request making."""
        with patch("requests.request") as mock_request:
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {"test": "data"}
            mock_request.return_value = mock_response

            response = self.client._make_request("GET", "https://test.com")
            assert response.status_code == 200
            mock_request.assert_called_once()

    def test_make_request_failure(self):
        """Test request failure handling."""
        with patch("requests.request") as mock_request:
            mock_request.side_effect = Exception("Network error")

            with pytest.raises(MeijerAPIError):
                self.client._make_request("GET", "https://test.com")

    def test_get_stores_success(self):
        """Test successful store retrieval."""
        with patch.object(self.client, "_make_request") as mock_request:
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {
                "stores": [
                    {
                        "storeId": "123",
                        "name": "Test Store",
                        "city": "Test City",
                        "state": "MI",
                    }
                ]
            }
            mock_request.return_value = mock_response

            stores = self.client.get_stores(zip_code="48104")
            assert len(stores) == 1
            assert stores[0].name == "Test Store"
            assert stores[0].store_id == "123"

    def test_get_stores_failure(self):
        """Test store retrieval failure."""
        with patch.object(self.client, "_make_request") as mock_request:
            mock_response = Mock()
            mock_response.status_code = 500
            mock_request.return_value = mock_response

            stores = self.client.get_stores(zip_code="48104")
            assert stores == []

    def test_get_offers_success(self):
        """Test successful offers retrieval."""
        with patch.object(self.client, "_make_request") as mock_request:
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {
                "listOfCoupons": [
                    {
                        "offer": {
                            "meijerOfferId": 123,
                            "title": "Test Offer",
                            "description": "Test Description",
                        }
                    }
                ]
            }
            mock_request.return_value = mock_response

            # Mock the coupons manager
            self.client.coupons.create_meijer_coupons_from_response.return_value = [
                Mock(title="Test Offer")
            ]

            offers = self.client.get_offers(limit=10)
            assert len(offers) == 1
            assert offers[0].title == "Test Offer"

    def test_get_coupons_with_pagination(self):
        """Test coupon retrieval with pagination."""
        with patch.object(self.client, "_make_request") as mock_request:
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {
                "listOfCoupons": [
                    {
                        "offer": {
                            "meijerOfferId": i,
                            "title": f"Coupon {i}",
                            "description": f"Description {i}",
                        }
                    }
                    for i in range(1, 4)
                ],
                "couponCount": 3,
            }
            mock_request.return_value = mock_response

            # Mock the coupons manager
            self.client.coupons.create_meijer_coupons_from_response.return_value = [
                Mock(title=f"Coupon {i}") for i in range(1, 4)
            ]

            coupons = self.client.get_coupons(limit=5, use_pagination=True)
            assert len(coupons) == 3

    def test_get_coupons_single_request(self):
        """Test coupon retrieval without pagination."""
        with patch.object(self.client, "get_offers") as mock_get_offers:
            mock_get_offers.return_value = [Mock(title="Test Coupon")]

            coupons = self.client.get_coupons(limit=5, use_pagination=False)
            assert len(coupons) == 1
            mock_get_offers.assert_called_once_with(limit=5)

    def test_lookup_barcode_price(self):
        """Test barcode price lookup."""
        mock_item = Mock(spec=MeijerItem)
        self.client.shop_scan.lookup_barcode_price.return_value = mock_item

        result = self.client.lookup_barcode_price("049000050103")
        assert result == mock_item
        self.client.shop_scan.lookup_barcode_price.assert_called_once_with(
            "049000050103", None
        )

    def test_bulk_lookup_barcodes(self):
        """Test bulk barcode lookup."""
        barcodes = ["049000050103", "049000050104"]
        mock_items = {
            "049000050103": Mock(spec=MeijerItem),
            "049000050104": Mock(spec=MeijerItem),
        }
        self.client.shop_scan.bulk_lookup_barcodes.return_value = mock_items

        result = self.client.bulk_lookup_barcodes(barcodes)
        assert result == mock_items
        self.client.shop_scan.bulk_lookup_barcodes.assert_called_once_with(
            barcodes, None
        )

    def test_shopping_list_methods(self):
        """Test shopping list convenience methods."""
        # Test get_shopping_list
        mock_items = [Mock(spec=ListItem)]
        self.client.shopping_list.get_list.return_value = mock_items

        result = self.client.get_shopping_list()
        assert result == mock_items
        self.client.shopping_list.get_list.assert_called_once()

        # Test add_to_shopping_list
        self.client.shopping_list.add_item.return_value = True

        result = self.client.add_to_shopping_list("Milk")
        assert result is True
        self.client.shopping_list.add_item.assert_called_once()

    def test_favorites_methods(self):
        """Test favorites convenience methods."""
        # Test add_to_favorites
        self.client.shopping_list.add_favorite.return_value = True

        result = self.client.add_to_favorites("Milk")
        assert result is True
        self.client.shopping_list.add_favorite.assert_called_once_with("Milk")

        # Test remove_from_favorites
        self.client.shopping_list.delete_favorite.return_value = True

        result = self.client.remove_from_favorites(123)
        assert result is True
        self.client.shopping_list.delete_favorite.assert_called_once_with(123)

    def test_coupon_methods(self):
        """Test coupon convenience methods."""
        # Test clip_coupon
        self.client.coupons.clip_coupon.return_value = True

        result = self.client.clip_coupon(123)
        assert result is True
        self.client.coupons.clip_coupon.assert_called_once_with(123)

        # Test unclip_coupon
        self.client.coupons.unclip_coupon.return_value = True

        result = self.client.unclip_coupon(123)
        assert result is True
        self.client.coupons.unclip_coupon.assert_called_once_with(123)

    def test_mperks_methods(self):
        """Test mPerks convenience methods."""
        # Test get_earned_rewards
        mock_rewards = [Mock()]
        self.client.mperks.get_earned_rewards.return_value = mock_rewards

        result = self.client.get_earned_rewards()
        assert result == mock_rewards
        self.client.mperks.get_earned_rewards.assert_called_once()

        # Test get_mcard_info
        mock_mcard = Mock()
        self.client.mperks.get_mcard_info.return_value = mock_mcard

        result = self.client.get_mcard_info()
        assert result == mock_mcard
        self.client.mperks.get_mcard_info.assert_called_once()

    def test_save_tokens(self, monkeypatch):
        """Test token saving."""
        self.client._access_token = "test_token"
        self.client._refresh_token = "refresh_token"

        with tempfile.TemporaryDirectory() as temp_dir:
            config_dir = Path(temp_dir) / ".config"
            config_dir.mkdir()
            config_file = config_dir / "meijer.txt"

            monkeypatch.setattr(Path, "home", lambda: Path(temp_dir))

            self.client.save_tokens()

            assert config_file.exists()
            with open(config_file) as f:
                saved_data = json.load(f)
                assert saved_data["access_token"] == "test_token"
                assert saved_data["refresh_token"] == "refresh_token"

    def test_save_tokens_no_token(self):
        """Test token saving when no token exists."""
        self.client._access_token = None

        # Should not raise an exception
        self.client.save_tokens()

    def test_is_authenticated(self):
        """Test authentication status checking."""
        # Not authenticated
        self.client._access_token = None
        assert not self.client.is_authenticated()

        # Authenticated
        self.client._access_token = "test_token"
        assert self.client.is_authenticated()

    def test_ensure_authenticated_no_token(self):
        """Test authentication check when no token."""
        self.client._access_token = None

        with pytest.raises(MeijerAuthenticationError):
            self.client._ensure_authenticated()

    def test_ensure_authenticated_with_token(self):
        """Test authentication check when token exists."""
        self.client._access_token = "test_token"

        # Should not raise an exception
        assert self.client._ensure_authenticated() is True

    def test_find_stores_nearby(self):
        """Test nearby store search."""
        with patch.object(self.client, "_make_request") as mock_request:
            mock_response = Mock()
            mock_response.status_code = 200
            mock_response.json.return_value = {
                "stores": [
                    {
                        "UnitId": "123",
                        "Name": "Nearby Store",
                        "Address": "123 Test St",
                        "City": "Test City",
                        "State": "MI",
                        "Zip": "48104",
                        "Latitude": 42.0,
                        "Longitude": -83.0,
                        "distance": 5.2,
                    }
                ]
            }
            mock_request.return_value = mock_response

            stores = self.client.find_stores_nearby(42.0, -83.0, 10)
            assert len(stores) == 1
            assert stores[0].name == "Nearby Store"
            assert stores[0].unit_id == "123"
            assert stores[0].city == "Test City"


class TestMeijerClientLive:
    """Test the main Meijer client class with live API endpoints.

    These tests require a working authentication token and will make real API calls.
    Use with caution in CI/CD environments.
    """

    def setup_method(self):
        """Set up test fixtures."""
        self.client = Meijer()

    def test_live_authentication(self):
        """Test that the client can authenticate with live endpoints."""
        assert self.client.is_authenticated()
        # Check the actual auth status value (case may vary)
        auth_status = self.client.auth_status.value
        assert auth_status in ["AUTHENTICATED", "authenticated"]

    def test_live_get_stores_default(self):
        """Test getting stores with default parameters using live API."""
        stores = self.client.get_stores()
        assert len(stores) > 0
        assert all(hasattr(store, "unit_id") for store in stores)
        assert all(hasattr(store, "name") for store in stores)
        assert all(hasattr(store, "city") for store in stores)
        assert all(hasattr(store, "state") for store in stores)

    def test_live_get_stores_by_city(self):
        """Test getting stores by city name using live API."""
        # Test with "grandrapids" (no spaces)
        stores = self.client.get_stores(city="grandrapids")
        assert len(stores) > 0
        # All stores should be in Grand Rapids
        for store in stores:
            assert (
                "grand rapids" in store.city.lower()
                or "grandrapids" in store.city.lower().replace(" ", "")
            )

        # Test with "holland"
        stores = self.client.get_stores(city="holland")
        assert len(stores) > 0
        # All stores should be in Holland
        for store in stores:
            assert "holland" in store.city.lower()

        # Test with "ann arbor" (with spaces)
        stores = self.client.get_stores(city="ann arbor")
        assert len(stores) > 0
        # All stores should be in Ann Arbor
        for store in stores:
            assert "ann arbor" in store.city.lower()

    def test_live_find_stores_nearby(self):
        """Test finding stores near coordinates using live API."""
        # Test with coordinates near Ann Arbor, MI
        stores = self.client.find_stores_nearby(
            latitude=42.2808, longitude=-83.7430, radius_miles=50
        )
        assert len(stores) > 0
        assert len(stores) <= 50  # Should respect max_results
        assert all(hasattr(store, "unit_id") for store in stores)

    def test_live_get_store_by_id(self):
        """Test getting a specific store by ID using live API."""
        # Test with store ID 217 (N Holland Twp)
        store = self.client.get_store_by_id("217")
        assert store is not None
        assert store.unit_id == "217"
        assert store.name == "N Holland Twp"
        assert store.city == "Holland"
        assert store.state == "MI"

    def test_live_coupons(self):
        """Test getting coupons using live API."""
        coupons = self.client.get_coupons()
        assert len(coupons) > 0
        assert all(hasattr(coupon, "meijer_offer_id") for coupon in coupons)

    def test_live_shopping_list(self):
        """Test getting shopping list using live API."""
        shopping_list = self.client.get_shopping_list()
        # Shopping list might be empty, but should not raise an error
        assert isinstance(shopping_list, list)

    def test_live_search_functionality(self):
        """Test basic search functionality using live API."""
        # Test with a common product search
        search_results = self.client.search_products("milk")
        # Search returns a SearchResult object with results list
        assert hasattr(search_results, "results")
        assert isinstance(search_results.results, list)
        assert hasattr(search_results, "total_results")
        assert search_results.total_results > 0


if __name__ == "__main__":
    pytest.main([__file__])
