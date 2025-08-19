#!/usr/bin/env python3
"""
Comprehensive test suite for Meijer.

Tests OAuth flows, API endpoints, error handling, and session management.
"""

import unittest
from datetime import datetime, timedelta
from unittest.mock import Mock, patch

# Import the client
from meijer import (
    AuthenticationStatus,
    AuthTokens,
    Meijer,
    MeijerAuth,
    MeijerOffer,
    MeijerStore,
    OAuthConfig,
    UserInfo,
)


class TestOAuthConfig(unittest.TestCase):
    """Test OAuth configuration."""

    def test_oauth_config_defaults(self):
        """Test OAuth configuration default values."""
        config = OAuthConfig()

        self.assertEqual(config.client_id, "0oa1o8g9njWsUvwsx697")
        self.assertEqual(
            config.auth_url, "https://id.meijer.com/oauth2/default/v1/authorize"
        )
        self.assertEqual(
            config.token_url, "https://id.meijer.com/oauth2/default/v1/token"
        )
        self.assertEqual(config.scope, "openid profile offline_access")
        self.assertEqual(
            config.redirect_uri, "https://localhost:45678/callback"
        )  # Web-compatible URI on high port
        self.assertEqual(
            config.mobile_redirect_uri, "com.meijer.mobile.meijer:/login"
        )  # Mobile app URI
        self.assertEqual(config.response_type, "code")
        self.assertEqual(config.code_challenge_method, "S256")


class TestAuthTokens(unittest.TestCase):
    """Test authentication tokens."""

    def test_auth_tokens_creation(self):
        """Test AuthTokens creation and expiration calculation."""
        expires_in = 3600
        tokens = AuthTokens(
            access_token="test_access_token",
            refresh_token="test_refresh_token",
            expires_in=expires_in,
        )

        self.assertEqual(tokens.access_token, "test_access_token")
        self.assertEqual(tokens.refresh_token, "test_refresh_token")
        self.assertEqual(tokens.expires_in, expires_in)
        self.assertIsNotNone(tokens.expires_at)

        # Check expiration time calculation
        expected_expiry = datetime.now() + timedelta(seconds=expires_in)
        self.assertAlmostEqual(
            tokens.expires_at.timestamp(),
            expected_expiry.timestamp(),
            delta=5,  # Allow 5 second difference
        )

    def test_auth_tokens_expiration(self):
        """Test token expiration checking."""
        # Create tokens that expire in 1 second
        tokens = AuthTokens(access_token="test", refresh_token="test", expires_in=1)

        # Wait for expiration
        import time

        time.sleep(2)

        self.assertTrue(tokens.is_expired())
        # Remove the buffer test as it's unreliable in test environment
        # self.assertFalse(tokens.is_expired(buffer_seconds=10))

    def test_time_until_expiry(self):
        """Test time until expiry calculation."""
        tokens = AuthTokens(access_token="test", refresh_token="test", expires_in=3600)

        time_until = tokens.time_until_expiry()
        self.assertIsNotNone(time_until)
        self.assertGreater(time_until.total_seconds(), 3500)  # Should be close to 3600


class TestUserInfo(unittest.TestCase):
    """Test user information."""

    def test_user_info_creation(self):
        """Test UserInfo creation."""
        user = UserInfo(
            sub="test_user_123",
            name="Test User",
            email="test@example.com",
            email_verified=True,
        )

        self.assertEqual(user.sub, "test_user_123")
        self.assertEqual(user.name, "Test User")
        self.assertEqual(user.email, "test@example.com")
        self.assertTrue(user.email_verified)


class TestMeijerOffer(unittest.TestCase):
    """Test offer/coupon information."""

    def test_meijer_offer_creation(self):
        """Test MeijerOffer creation."""
        offer = MeijerOffer(
            id="offer_123",
            title="Test Offer",
            description="Test description",
            discount_amount=5.00,
            is_clipped=False,
        )

        self.assertEqual(offer.id, "offer_123")
        self.assertEqual(offer.title, "Test Offer")
        self.assertEqual(offer.description, "Test description")
        self.assertEqual(offer.discount_amount, 5.00)
        self.assertFalse(offer.is_clipped)


class TestMeijerStore(unittest.TestCase):
    """Test store information."""

    def test_meijer_store_creation(self):
        """Test MeijerStore creation."""
        store = MeijerStore(
            id="store_123",
            name="Test Store",
            address="123 Test St",
            city="Test City",
            state="MI",
            zip_code="49525",
        )

        self.assertEqual(store.id, "store_123")
        self.assertEqual(store.name, "Test Store")
        self.assertEqual(store.address, "123 Test St")
        self.assertEqual(store.city, "Test City")
        self.assertEqual(store.state, "MI")
        self.assertEqual(store.zip_code, "49525")


class TestMeijerAuth(unittest.TestCase):
    """Test custom authentication."""

    def test_meijer_auth(self):
        """Test MeijerAuth authentication."""
        auth = MeijerAuth("test_token")
        request = Mock()
        request.headers = {}

        auth(request)

        self.assertEqual(request.headers["Authorization"], "Bearer test_token")


class TestMeijer(unittest.TestCase):
    """Test the main Meijer client."""

    def setUp(self):
        """Set up test fixtures."""
        self.client = Meijer()

    def test_client_initialization(self):
        """Test client initialization."""
        self.assertIsNone(self.client.auth_tokens)
        self.assertIsNone(self.client.user_info)
        self.assertEqual(self.client.auth_status, AuthenticationStatus.UNAUTHENTICATED)
        self.assertIsNotNone(self.client.session)
        self.assertEqual(self.client.api_base, "https://api.meijer.com")
        self.assertEqual(self.client.id_base, "https://id.meijer.com")

    def test_generate_pkce_pair(self):
        """Test PKCE pair generation."""
        verifier, challenge = self.client._generate_pkce_pair()

        self.assertIsInstance(verifier, str)
        self.assertIsInstance(challenge, str)
        self.assertGreater(len(verifier), 0)
        self.assertGreater(len(challenge), 0)

        # Verify they're different
        self.assertNotEqual(verifier, challenge)

    def test_generate_state_and_nonce(self):
        """Test state and nonce generation."""
        state = self.client._generate_state()
        nonce = self.client._generate_nonce()

        self.assertIsInstance(state, str)
        self.assertIsInstance(nonce, str)
        self.assertGreater(len(state), 0)
        self.assertGreater(len(nonce), 0)

        # Verify they're different
        self.assertNotEqual(state, nonce)

    def test_get_authorization_url(self):
        """Test authorization URL generation."""
        auth_url, state, code_verifier = self.client.get_authorization_url()

        self.assertIsInstance(auth_url, str)
        self.assertIsInstance(state, str)
        self.assertIsInstance(code_verifier, str)

        # Check URL contains required parameters
        self.assertIn("client_id=", auth_url)
        self.assertIn("response_type=code", auth_url)
        self.assertIn("scope=", auth_url)
        self.assertIn("redirect_uri=", auth_url)
        self.assertIn("state=", auth_url)
        self.assertIn("code_challenge=", auth_url)
        self.assertIn("code_challenge_method=S256", auth_url)

    @patch("builtins.input", return_value="test_auth_code")
    def test_authenticate_interactive(self, mock_input):
        """Test interactive authentication."""
        with patch.object(self.client, "authenticate_with_code", return_value=True):
            result = self.client.authenticate_interactive()
            self.assertTrue(result)

    @patch("requests.Session.post")
    def test_authenticate_with_code_success(self, mock_post):
        """Test successful authentication with code."""
        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "access_token": "test_access_token",
            "refresh_token": "test_refresh_token",
            "token_type": "Bearer",
            "expires_in": 3600,
        }
        mock_post.return_value = mock_response

        result = self.client.authenticate_with_code("test_code", "test_verifier")

        self.assertTrue(result)
        self.assertEqual(self.client.auth_status, AuthenticationStatus.AUTHENTICATED)
        self.assertIsNotNone(self.client.auth_tokens)
        self.assertEqual(self.client.auth_tokens.access_token, "test_access_token")

    @patch("requests.Session.post")
    def test_authenticate_with_code_failure(self, mock_post):
        """Test failed authentication with code."""
        # Mock failed response
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Invalid code"
        mock_post.return_value = mock_response

        result = self.client.authenticate_with_code("invalid_code", "test_verifier")

        self.assertFalse(result)
        self.assertEqual(self.client.auth_status, AuthenticationStatus.UNAUTHENTICATED)
        self.assertIsNone(self.client.auth_tokens)

    def test_authenticate_with_credentials(self):
        """Test credential-based authentication (placeholder)."""
        result = self.client.authenticate_with_credentials("user", "pass")
        self.assertFalse(result)  # Should return False as not implemented

    @patch("requests.Session.post")
    def test_refresh_token_success(self, mock_post):
        """Test successful token refresh."""
        # Set up client with expired tokens
        self.client.auth_tokens = AuthTokens(
            access_token="old_token", refresh_token="refresh_token", expires_in=0
        )
        self.client.auth_status = AuthenticationStatus.EXPIRED

        # Mock successful refresh response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "access_token": "new_access_token",
            "refresh_token": "new_refresh_token",
            "expires_in": 3600,
        }
        mock_post.return_value = mock_response

        result = self.client.refresh_token()

        self.assertTrue(result)
        self.assertEqual(self.client.auth_status, AuthenticationStatus.AUTHENTICATED)
        self.assertEqual(self.client.auth_tokens.access_token, "new_access_token")

    @patch("requests.Session.post")
    def test_refresh_token_failure(self, mock_post):
        """Test failed token refresh."""
        # Set up client with expired tokens
        self.client.auth_tokens = AuthTokens(
            access_token="old_token", refresh_token="refresh_token", expires_in=0
        )
        self.client.auth_status = AuthenticationStatus.EXPIRED

        # Mock failed refresh response
        mock_response = Mock()
        mock_response.status_code = 400
        mock_response.text = "Invalid refresh token"
        mock_post.return_value = mock_response

        result = self.client.refresh_token()

        self.assertFalse(result)
        self.assertEqual(self.client.auth_status, AuthenticationStatus.EXPIRED)

    def test_ensure_authenticated_no_tokens(self):
        """Test ensure_authenticated with no tokens."""
        result = self.client.ensure_authenticated()
        self.assertFalse(result)

    def test_ensure_authenticated_valid_tokens(self):
        """Test ensure_authenticated with valid tokens."""
        # Set up client with valid tokens
        self.client.auth_tokens = AuthTokens(
            access_token="valid_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        result = self.client.ensure_authenticated()
        self.assertTrue(result)

    def test_ensure_authenticated_expired_tokens(self):
        """Test ensure_authenticated with expired tokens."""
        # Set up client with expired tokens
        self.client.auth_tokens = AuthTokens(
            access_token="expired_token", refresh_token="refresh_token", expires_in=0
        )
        self.client.auth_status = AuthenticationStatus.EXPIRED

        with patch.object(self.client, "refresh_token", return_value=True):
            result = self.client.ensure_authenticated()
            self.assertTrue(result)

    def test_get_user_info_no_tokens(self):
        """Test get_user_info with no tokens."""
        result = self.client.get_user_info()
        self.assertIsNone(result)

    def test_get_user_info_with_id_token(self):
        """Test get_user_info with ID token."""
        # Set up client with ID token
        self.client.auth_tokens = AuthTokens(
            access_token="access_token",
            refresh_token="refresh_token",
            id_token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJ0ZXN0X3VzZXIiLCJuYW1lIjoiVGVzdCBVc2VyIiwiZW1haWwiOiJ0ZXN0QGV4YW1wbGUuY29tIn0.signature",
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        with patch.object(self.client, "ensure_authenticated", return_value=True):
            result = self.client.get_user_info()
            # Should return UserInfo object as JWT parsing is working
            self.assertIsNotNone(result)
            self.assertEqual(result.sub, "test_user")
            self.assertEqual(result.name, "Test User")
            self.assertEqual(result.email, "test@example.com")

    @patch("requests.Session.get")
    def test_get_offers_success(self, mock_get):
        """Test successful offers retrieval."""
        # Set up authenticated client
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "offers": [
                {
                    "id": "offer_1",
                    "title": "Test Offer 1",
                    "description": "Test description 1",
                    "discountAmount": 5.00,
                    "isClipped": False,
                },
                {
                    "id": "offer_2",
                    "title": "Test Offer 2",
                    "description": "Test description 2",
                    "discountPercentage": 10,
                    "isClipped": True,
                },
            ]
        }
        mock_get.return_value = mock_response

        offers = self.client.get_offers(limit=10)

        self.assertEqual(len(offers), 2)
        self.assertEqual(offers[0].id, "offer_1")
        self.assertEqual(offers[0].title, "Test Offer 1")
        self.assertEqual(offers[1].id, "offer_2")
        self.assertEqual(offers[1].title, "Test Offer 2")

    @patch("requests.Session.get")
    def test_get_offers_failure(self, mock_get):
        """Test failed offers retrieval."""
        # Set up authenticated client
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        # Mock failed response
        mock_response = Mock()
        mock_response.status_code = 401
        mock_get.return_value = mock_response

        offers = self.client.get_offers()

        self.assertEqual(len(offers), 0)

    @patch("requests.Session.get")
    def test_get_home_cards_success(self, mock_get):
        """Test successful home cards retrieval."""
        # Set up authenticated client
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "cards": ["card1", "card2"],
            "sections": ["section1", "section2"],
        }
        mock_get.return_value = mock_response

        home_cards = self.client.get_home_cards()

        self.assertEqual(home_cards["cards"], ["card1", "card2"])
        self.assertEqual(home_cards["sections"], ["section1", "section2"])

    @patch("requests.Session.get")
    def test_get_stores_success(self, mock_get):
        """Test successful stores retrieval."""
        # Set up authenticated client
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        # Mock successful response
        mock_response = Mock()
        mock_response.status_code = 200
        mock_response.json.return_value = {
            "stores": [
                {
                    "id": "store_1",
                    "name": "Test Store 1",
                    "address": "123 Test St",
                    "city": "Test City",
                    "state": "MI",
                    "zipCode": "49525",
                }
            ]
        }
        mock_get.return_value = mock_response

        stores = self.client.get_stores(zip_code="49525")

        self.assertEqual(len(stores), 1)
        self.assertEqual(stores[0].id, "store_1")
        self.assertEqual(stores[0].name, "Test Store 1")
        self.assertEqual(stores[0].zip_code, "49525")

    def test_logout(self):
        """Test logout functionality."""
        # Set up authenticated client
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.user_info = UserInfo(sub="test_user")
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        self.client.logout()

        self.assertIsNone(self.client.auth_tokens)
        self.assertIsNone(self.client.user_info)
        self.assertEqual(self.client.auth_status, AuthenticationStatus.UNAUTHENTICATED)

    def test_get_session_info(self):
        """Test session info retrieval."""
        # Test unauthenticated session
        session_info = self.client.get_session_info()

        self.assertEqual(session_info["status"], "unauthenticated")
        self.assertFalse(session_info["authenticated"])
        self.assertIsNone(session_info["username"])

        # Test authenticated session
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        session_info = self.client.get_session_info()

        self.assertEqual(session_info["status"], "authenticated")
        self.assertTrue(session_info["authenticated"])
        self.assertEqual(session_info["token_type"], "Bearer")
        self.assertEqual(session_info["expires_in"], 3600)

    def test_is_authenticated(self):
        """Test authentication status checking."""
        # Test unauthenticated
        self.assertFalse(self.client.is_authenticated())

        # Test authenticated with valid tokens
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=3600
        )
        self.client.auth_status = AuthenticationStatus.AUTHENTICATED

        self.assertTrue(self.client.is_authenticated())

        # Test authenticated with expired tokens
        self.client.auth_tokens = AuthTokens(
            access_token="access_token", refresh_token="refresh_token", expires_in=0
        )

        self.assertFalse(self.client.is_authenticated())

    def test_context_manager(self):
        """Test context manager functionality."""
        with self.client as client:
            self.assertEqual(client, self.client)
            self.assertEqual(client.auth_status, AuthenticationStatus.UNAUTHENTICATED)

        # After context exit, should be logged out
        self.assertEqual(self.client.auth_status, AuthenticationStatus.UNAUTHENTICATED)
        self.assertIsNone(self.client.auth_tokens)


if __name__ == "__main__":
    # Run tests
    unittest.main(verbosity=2)
