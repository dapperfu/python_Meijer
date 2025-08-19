#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create comprehensive tests for Feedback class
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package, pytest, pytest-asyncio
 */

Tests for the MeijerFeedback class.
"""

from unittest.mock import AsyncMock, MagicMock

import pytest

from meijer.exceptions import FeedbackError
from meijer.feedback import (
    FeedbackError,
    FeedbackFormData,
    MeijerFeedback,
    MobileDeviceData,
)


class TestMobileDeviceData:
    """Test the MobileDeviceData dataclass."""

    def test_mobile_device_data_creation(self):
        """Test creating MobileDeviceData with all required fields."""
        device_data = MobileDeviceData(
            os_version="10",
            sdk_version="4.7.1",
            app_version="10.12.0",
            os_type="Android",
            device_id="test-device-123",
            device_model="HTC One",
            app_id="com.meijer.mobile.meijer",
            is_dark_mode=False,
            is_tablet=False,
            device_resolution="1080*1920",
            device_locale="en_US",
            device_vendor="HTC",
        )

        assert device_data.os_version == "10"
        assert device_data.sdk_version == "4.7.1"
        assert device_data.app_version == "10.12.0"
        assert device_data.os_type == "Android"
        assert device_data.device_id == "test-device-123"
        assert device_data.device_model == "HTC One"
        assert device_data.app_id == "com.meijer.mobile.meijer"
        assert device_data.is_dark_mode is False
        assert device_data.is_tablet is False
        assert device_data.device_resolution == "1080*1920"
        assert device_data.device_locale == "en_US"
        assert device_data.device_vendor == "HTC"

    def test_mobile_device_data_asdict(self):
        """Test that MobileDeviceData can be converted to dict."""
        device_data = MobileDeviceData(
            os_version="10",
            sdk_version="4.7.1",
            app_version="10.12.0",
            os_type="Android",
            device_id="test-device-123",
            device_model="HTC One",
            app_id="com.meijer.mobile.meijer",
            is_dark_mode=False,
            is_tablet=False,
            device_resolution="1080*1920",
            device_locale="en_US",
            device_vendor="HTC",
        )

        device_dict = device_data.__dict__
        assert device_dict["os_version"] == "10"
        assert device_dict["device_model"] == "HTC One"
        assert device_dict["app_id"] == "com.meijer.mobile.meijer"


class TestFeedbackFormData:
    """Test the FeedbackFormData dataclass."""

    def test_feedback_form_data_creation(self):
        """Test creating FeedbackFormData with all required fields."""
        form_data = FeedbackFormData(
            form_id=9234,
            trigger_type="live",
            form_language="en_US",
            form_data={"test": "data"},
            user_rating=5,
            user_comment="Great app!",
            category="general",
            priority="low",
        )

        assert form_data.form_id == 9234
        assert form_data.trigger_type == "live"
        assert form_data.form_language == "en_US"
        assert form_data.form_data == {"test": "data"}
        assert form_data.user_rating == 5
        assert form_data.user_comment == "Great app!"
        assert form_data.category == "general"
        assert form_data.priority == "low"

    def test_feedback_form_data_optional_fields(self):
        """Test creating FeedbackFormData with only required fields."""
        form_data = FeedbackFormData(
            form_id=9234,
            trigger_type="live",
            form_language="en_US",
            form_data={"test": "data"},
        )

        assert form_data.form_id == 9234
        assert form_data.trigger_type == "live"
        assert form_data.form_language == "en_US"
        assert form_data.form_data == {"test": "data"}
        assert form_data.user_rating is None
        assert form_data.user_comment is None
        assert form_data.category is None
        assert form_data.priority is None


class TestMeijerFeedback:
    """Test the MeijerFeedback class."""

    @pytest.fixture
    def mock_api_client(self):
        """Create a mock API client."""
        client = MagicMock()
        client.logger = MagicMock()
        return client

    @pytest.fixture
    def feedback_client(self, mock_api_client):
        """Create a MeijerFeedback instance with mock API client."""
        return MeijerFeedback(mock_api_client)

    @pytest.fixture
    def sample_device_data(self):
        """Create sample device data for testing."""
        return MobileDeviceData(
            os_version="10",
            sdk_version="4.7.1",
            app_version="10.12.0",
            os_type="Android",
            device_id="test-device-123",
            device_model="HTC One",
            app_id="com.meijer.mobile.meijer",
            is_dark_mode=False,
            is_tablet=False,
            device_resolution="1080*1920",
            device_locale="en_US",
            device_vendor="HTC",
        )

    @pytest.fixture
    def sample_form_data(self):
        """Create sample form data for testing."""
        return FeedbackFormData(
            form_id=9234,
            trigger_type="live",
            form_language="en_US",
            form_data={"test": "data"},
        )

    def test_feedback_client_initialization(self, mock_api_client):
        """Test MeijerFeedback initialization."""
        feedback = MeijerFeedback(mock_api_client)

        assert feedback.api_client == mock_api_client
        assert feedback.logger == mock_api_client.logger
        assert feedback.base_url == "https://147.75.243.16/mobileSDK/v2"

    @pytest.mark.asyncio
    async def test_submit_feedback_success(
        self, feedback_client, sample_device_data, sample_form_data
    ):
        """Test successful feedback submission."""
        # Mock successful API response
        mock_response = MagicMock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"uuid": "test-uuid-123"}

        feedback_client.api_client.post = AsyncMock(return_value=mock_response)

        # Submit feedback
        result = await feedback_client.submit_feedback(
            sample_form_data, sample_device_data
        )

        # Verify result
        assert result["uuid"] == "test-uuid-123"

        # Verify API call was made correctly
        feedback_client.api_client.post.assert_called_once()
        call_args = feedback_client.api_client.post.call_args

        assert call_args[0][0] == "https://147.75.243.16/mobileSDK/v2/feedback"
        assert call_args[1]["headers"]["Content-Type"] == "application/json"
        assert call_args[1]["headers"]["Accept"] == "application/json"

        # Verify payload structure
        payload = call_args[1]["json"]
        assert "uuid" in payload
        assert payload["formId"] == 9234
        assert payload["triggerType"] == "live"
        assert payload["formLanguage"] == "en_US"
        assert payload["formData"] == {"test": "data"}
        assert "mobileDeviceData" in payload

    @pytest.mark.asyncio
    async def test_submit_feedback_api_error(
        self, feedback_client, sample_device_data, sample_form_data
    ):
        """Test feedback submission with API error."""
        # Mock failed API response
        mock_response = MagicMock()
        mock_response.status_code = 500

        feedback_client.api_client.post = AsyncMock(return_value=mock_response)

        # Submit feedback should raise FeedbackError
        with pytest.raises(FeedbackError, match="Feedback submission failed: 500"):
            await feedback_client.submit_feedback(sample_form_data, sample_device_data)

    @pytest.mark.asyncio
    async def test_submit_feedback_exception(
        self, feedback_client, sample_device_data, sample_form_data
    ):
        """Test feedback submission with general exception."""
        # Mock API call that raises exception
        feedback_client.api_client.post = AsyncMock(
            side_effect=Exception("Network error")
        )

        # Submit feedback should raise FeedbackError
        with pytest.raises(
            FeedbackError, match="Error submitting feedback: Network error"
        ):
            await feedback_client.submit_feedback(sample_form_data, sample_device_data)

    @pytest.mark.asyncio
    async def test_submit_store_search_feedback(
        self, feedback_client, sample_device_data
    ):
        """Test store search feedback submission."""
        # Mock successful API response
        mock_response = MagicMock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"uuid": "store-search-uuid"}

        feedback_client.api_client.post = AsyncMock(return_value=mock_response)

        # Submit store search feedback
        result = await feedback_client.submit_store_search_feedback(
            device_data=sample_device_data,
            search_query="Muskegon, MI",
            error_message="No stores found",
            user_rating=1,
            user_comment="Store search is broken",
        )

        # Verify result
        assert result["uuid"] == "store-search-uuid"

        # Verify the correct form data was created
        call_args = feedback_client.api_client.post.call_args
        payload = call_args[1]["json"]

        assert payload["formId"] == 9234
        assert payload["formData"]["searchQuery"] == "Muskegon, MI"
        assert payload["formData"]["errorMessage"] == "No stores found"
        assert payload["formData"]["feature"] == "store_search"
        # Category and priority are added at the top level, not in formData
        assert payload["category"] == "store_search_error"
        assert payload["priority"] == "high"

    @pytest.mark.asyncio
    async def test_submit_registration_feedback(
        self, feedback_client, sample_device_data
    ):
        """Test registration feedback submission."""
        # Mock successful API response
        mock_response = MagicMock()
        mock_response.status_code = 200
        mock_response.json.return_value = {"uuid": "registration-uuid"}

        feedback_client.api_client.post = AsyncMock(return_value=mock_response)

        # Submit registration feedback
        result = await feedback_client.submit_registration_feedback(
            device_data=sample_device_data,
            registration_step="store_selection",
            error_message="Cannot select store",
            user_rating=1,
            user_comment="Registration broken",
        )

        # Verify result
        assert result["uuid"] == "registration-uuid"

        # Verify the correct form data was created
        call_args = feedback_client.api_client.post.call_args
        payload = call_args[1]["json"]

        assert payload["formId"] == 9234
        assert payload["formData"]["registrationStep"] == "store_selection"
        assert payload["formData"]["errorMessage"] == "Cannot select store"
        assert payload["formData"]["feature"] == "account_registration"
        # Category and priority are added at the top level, not in formData
        assert payload["category"] == "registration_error"
        assert payload["priority"] == "high"

    def test_create_default_device_data(self, feedback_client):
        """Test creating default device data."""
        # Test with custom values
        device_data = feedback_client.create_default_device_data(
            device_id="custom-id-123",
            device_model="Pixel 6",
            os_version="12",
            app_version="11.0.0",
        )

        assert device_data.device_id == "custom-id-123"
        assert device_data.device_model == "Pixel 6"
        assert device_data.os_version == "12"
        assert device_data.app_version == "11.0.0"
        assert device_data.sdk_version == "4.7.1"  # Default value
        assert device_data.os_type == "Android"  # Default value
        assert device_data.app_id == "com.meijer.mobile.meijer"  # Default value

        # Test with no custom values (should generate UUID)
        device_data = feedback_client.create_default_device_data()

        assert device_data.device_id is not None
        assert device_data.device_model == "HTC One"  # Default value
        assert device_data.os_version == "10"  # Default value
        assert device_data.app_version == "10.12.0"  # Default value


class TestFeedbackError:
    """Test the FeedbackError exception."""

    def test_feedback_error_inheritance(self):
        """Test that FeedbackError inherits from MeijerError."""
        error = FeedbackError("Test error")
        assert isinstance(error, FeedbackError)
        assert isinstance(error, Exception)

    def test_feedback_error_message(self):
        """Test FeedbackError message handling."""
        error_message = "Store search failed"
        error = FeedbackError(error_message)
        assert str(error) == error_message
