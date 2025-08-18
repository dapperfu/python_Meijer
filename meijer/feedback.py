#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Update Feedback class to use correct endpoint and payload structure from actual API analysis
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Meijer Feedback Submission Module
================================

This module provides functionality for submitting feedback through the Meijer mobile app
feedback system. Based on actual API calls captured in mitmproxy logs.
"""

import uuid
from typing import Dict, Any, Optional, List, Union
from dataclasses import dataclass, asdict

from .exceptions import FeedbackError


@dataclass
class MobileDeviceData:
    """Mobile device information required for feedback submission."""

    os_version: str
    sdk_version: str
    app_version: str
    os_type: str
    device_id: str
    device_model: str
    app_id: str
    is_dark_mode: bool
    is_tablet: bool
    device_resolution: str
    device_locale: str
    device_vendor: str


@dataclass
class FeedbackComponent:
    """Individual feedback form component."""

    id: int
    type: str
    unique_name: str
    value: Optional[Union[str, int, List[str]]] = None
    is_csat: bool = False
    role: Optional[str] = None


@dataclass
class FeedbackPage:
    """Feedback form page containing components."""

    components: List[FeedbackComponent]


@dataclass
class FeedbackCustomParam:
    """Custom parameter for feedback submission."""

    unique_name: str
    value: str


@dataclass
class FeedbackDynamicData:
    """Dynamic data for feedback submission."""

    custom_params: List[FeedbackCustomParam]
    pages: List[FeedbackPage]


@dataclass
class FeedbackFormData:
    """Form-specific data for feedback submission."""

    form_id: int
    trigger_type: str  # "live", "manual", etc.
    form_language: str
    dynamic_data: FeedbackDynamicData
    appearance_mode: str = "light"


class MeijerFeedback:
    """
    Meijer Feedback submission client.

    Based on actual API endpoint: POST https://meijer.md-apis.medallia.com/mobileSDK/v2/feedback

    This class handles the submission of feedback through the Meijer mobile app
    feedback system, including all required device data and form information.
    """

    def __init__(self, meijer_client):
        """
        Initialize the feedback client.

        Parameters
        ----------
        meijer_client
            Main Meijer client instance for making requests
        """
        self.meijer_client = meijer_client
        self.logger = meijer_client.logger
        self.base_url = "https://meijer.md-apis.medallia.com/mobileSDK/v2"

    def submit_feedback(
        self,
        form_data: FeedbackFormData,
        device_data: MobileDeviceData,
        additional_data: Optional[Dict[str, Any]] = None,
    ) -> Dict[str, Any]:
        """
        Submit feedback through the Meijer feedback system.

        Parameters
        ----------
        form_data : FeedbackFormData
            The feedback form data including form ID, trigger type, and form content
        device_data : MobileDeviceData
            Mobile device information required for the submission
        additional_data : Optional[Dict[str, Any]], default None
            Additional custom data to include in the feedback

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API including the feedback UUID

        Raises
        ------
        FeedbackError
            If the feedback submission fails
        """
        try:
            # Generate unique UUID for this feedback submission
            feedback_uuid = str(uuid.uuid4())

            # Build the request payload based on actual API structure
            payload = {
                "uuid": feedback_uuid,
                "mobileDeviceData": asdict(device_data),
                "formId": form_data.form_id,
                "triggerType": form_data.trigger_type,
                "onPremData": None,  # Always null in observed requests
                "formLanguage": form_data.form_language,
                "clientCorrelationId": feedback_uuid,
                "fallbackScreenResolution": "360X640",  # From actual API call
                "dynamicData": asdict(form_data.dynamic_data),
                "appearanceMode": form_data.appearance_mode,
            }

            # Add additional custom data if provided
            if additional_data:
                payload.update(additional_data)

            # Submit the feedback
            url = f"{self.base_url}/feedback"
            headers = {
                "Content-Type": "application/json",
                "Accept": "application/json",
                "User-Agent": "Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)",
            }

            self.logger.info(f"Submitting feedback with UUID: {feedback_uuid}")
            response = self.meijer_client._make_request(
                "POST", url, json_data=payload, headers=headers
            )

            if response.status_code == 200:
                result = response.json()
                self.logger.info(
                    f"Feedback submitted successfully: {result.get('uuid', 'unknown')}"
                )
                return result
            else:
                raise FeedbackError(
                    f"Feedback submission failed: {response.status_code}"
                )

        except Exception as e:
            if isinstance(e, FeedbackError):
                raise
            raise FeedbackError(f"Error submitting feedback: {str(e)}")

    def submit_shop_scan_feedback(
        self,
        device_data: MobileDeviceData,
        feedback_text: str,
        rating: Optional[int] = None,
        store_name: str = "",
        store_comment: str = "",
        contact_name: str = "",
        phone: str = "",
        email: str = "",
        additional_comments: str = "",
    ) -> Dict[str, Any]:
        """
        Submit feedback specifically for Shop & Scan functionality.

        Parameters
        ----------
        device_data : MobileDeviceData
            Mobile device information
        feedback_text : str
            The main feedback text for Shop & Scan (goes in S&S_APP_FEEDBACK)
        rating : Optional[int], default None
            Overall satisfaction rating (1-10) - goes in OSAT_11
        store_name : str, default ""
            Name of the store if feedback is store-related
        store_comment : str, default ""
            Additional store-specific comments
        contact_name : str, default ""
            Contact name if user wants follow-up
        phone : str, default ""
            Phone number for contact
        email : str, default ""
            Email for contact
        additional_comments : str, default ""
            Any additional comments (goes in OPEN_CMT)

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API
        """
        # Create components based on actual API structure for Shop & Scan
        components = [
            FeedbackComponent(
                196946, "radio", "FEEDBACK_TOPICAPP", "C", False
            ),  # Shop & Scan
            FeedbackComponent(
                305822, "grading0to10", "q_bp_digital_osat_scale11", rating, False
            ),
            FeedbackComponent(196950, "select", "NEW_VISIT_REASONAPP", None, False),
            FeedbackComponent(196965, "grading0to10", "EASE_OF_TASK_11", None, False),
            FeedbackComponent(
                255342, "textArea", "OPEN_CMT", additional_comments, False
            ),
            FeedbackComponent(197003, "radio", "STORE_FEED", None, False),
            FeedbackComponent(197004, "textInput", "STORE_NAME", store_name, False),
            FeedbackComponent(197005, "textArea", "STORE_CMT", store_comment, False),
            FeedbackComponent(197006, "radio", "NEW_CONTACT_METHOD", None, False),
            FeedbackComponent(
                197007, "textInput", "Fullname", contact_name, False, "contactName"
            ),
            FeedbackComponent(197008, "textInput", "Phone", phone, False),
            FeedbackComponent(197009, "textInput", "EMAIL", email, False),
            FeedbackComponent(
                361058, "grading0to10", "OSAT_11", rating, False
            ),  # Shop & Scan rating
            FeedbackComponent(361059, "checkbox", "S&S_PROBLEMSS", None, False),
            FeedbackComponent(
                357091, "textArea", "S&S_APP_FEEDBACK", feedback_text, False
            ),  # Main Shop & Scan feedback
            FeedbackComponent(255347, "label", "PRIVACY_POLICY", None, False),
        ]

        # Create custom parameters
        custom_params = [
            FeedbackCustomParam("HOME_STORE_NAME", store_name),
            FeedbackCustomParam("APP_ENVIRONMENT", "playstore"),
        ]

        # Create dynamic data
        dynamic_data = FeedbackDynamicData(
            custom_params=custom_params, pages=[FeedbackPage(components=components)]
        )

        # Create form data
        form_data = FeedbackFormData(
            form_id=9234,  # Based on actual API call
            trigger_type="live",
            form_language="en",
            dynamic_data=dynamic_data,
            appearance_mode="light",
        )

        return self.submit_feedback(form_data, device_data)

    def submit_general_feedback(
        self,
        device_data: MobileDeviceData,
        feedback_text: str,
        rating: Optional[int] = None,
        category: str = "general",
        additional_comments: str = "",
    ) -> Dict[str, Any]:
        """
        Submit general feedback about the app.

        Parameters
        ----------
        device_data : MobileDeviceData
            Mobile device information
        feedback_text : str
            The main feedback text
        rating : Optional[int], default None
            Overall satisfaction rating (1-10)
        category : str, default "general"
            Category of feedback
        additional_comments : str, default ""
            Additional comments

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API
        """
        # Create components for general feedback
        components = [
            FeedbackComponent(196946, "radio", "FEEDBACK_TOPICAPP", "C", False),
            FeedbackComponent(
                305822, "grading0to10", "q_bp_digital_osat_scale11", rating, False
            ),
            FeedbackComponent(
                255342, "textArea", "OPEN_CMT", additional_comments, False
            ),
            FeedbackComponent(361058, "grading0to10", "OSAT_11", rating, False),
            FeedbackComponent(
                357091, "textArea", "S&S_APP_FEEDBACK", feedback_text, False
            ),
            FeedbackComponent(255347, "label", "PRIVACY_POLICY", None, False),
        ]

        # Create custom parameters
        custom_params = [
            FeedbackCustomParam("HOME_STORE_NAME", ""),
            FeedbackCustomParam("APP_ENVIRONMENT", "playstore"),
        ]

        # Create dynamic data
        dynamic_data = FeedbackDynamicData(
            custom_params=custom_params, pages=[FeedbackPage(components=components)]
        )

        # Create form data
        form_data = FeedbackFormData(
            form_id=9234,  # Based on actual API call
            trigger_type="live",
            form_language="en",
            dynamic_data=dynamic_data,
            appearance_mode="light",
        )

        return self.submit_feedback(form_data, device_data)

    def submit_app_feedback(
        self,
        device_data: MobileDeviceData,
        feedback_text: str,
        rating: Optional[int] = None,
        visit_reason: str = "F",
        ease_rating: Optional[int] = None,
        additional_comments: str = "",
        contact_name: str = "",
        phone: str = "",
        email: str = "",
    ) -> Dict[str, Any]:
        """
        Submit feedback specifically for app functionality.

        Parameters
        ----------
        device_data : MobileDeviceData
            Mobile device information
        feedback_text : str
            The main feedback text about the app
        rating : Optional[int], default None
            Overall satisfaction rating (1-10)
        visit_reason : str, default "F"
            Reason for the visit (from NEW_VISIT_REASONAPP)
        ease_rating : Optional[int], default None
            Rating for ease of task completion (1-10)
        additional_comments : str, default ""
            Additional comments in OPEN_CMT field
        contact_name : str, default ""
            Contact name if user wants follow-up
        phone : str, default ""
            Phone number for contact
        email : str, default ""
            Email for contact

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API
        """
        # Create components based on actual API structure for app feedback
        components = [
            FeedbackComponent(
                196946, "radio", "FEEDBACK_TOPICAPP", "A", False
            ),  # App feedback
            FeedbackComponent(
                305822, "grading0to10", "q_bp_digital_osat_scale11", rating, False
            ),
            FeedbackComponent(
                196950, "select", "NEW_VISIT_REASONAPP", visit_reason, False
            ),
            FeedbackComponent(
                196965, "grading0to10", "EASE_OF_TASK_11", ease_rating, False
            ),
            FeedbackComponent(
                255342, "textArea", "OPEN_CMT", additional_comments, False
            ),
            FeedbackComponent(197003, "radio", "STORE_FEED", None, False),
            FeedbackComponent(197004, "textInput", "STORE_NAME", "", False),
            FeedbackComponent(197005, "textArea", "STORE_CMT", "", False),
            FeedbackComponent(197006, "radio", "NEW_CONTACT_METHOD", None, False),
            FeedbackComponent(
                197007, "textInput", "Fullname", contact_name, False, "contactName"
            ),
            FeedbackComponent(197008, "textInput", "Phone", phone, False),
            FeedbackComponent(197009, "textInput", "EMAIL", email, False),
            FeedbackComponent(361058, "grading0to10", "OSAT_11", None, False),
            FeedbackComponent(361059, "checkbox", "S&S_PROBLEMSS", None, False),
            FeedbackComponent(
                357091, "textArea", "S&S_APP_FEEDBACK", "", False
            ),  # Empty for app feedback
            FeedbackComponent(255347, "label", "PRIVACY_POLICY", None, False),
        ]

        # Create custom parameters
        custom_params = [
            FeedbackCustomParam("HOME_STORE_NAME", ""),
            FeedbackCustomParam("APP_ENVIRONMENT", "playstore"),
        ]

        # Create dynamic data
        dynamic_data = FeedbackDynamicData(
            custom_params=custom_params, pages=[FeedbackPage(components=components)]
        )

        # Create form data
        form_data = FeedbackFormData(
            form_id=9234,  # Based on actual API call
            trigger_type="live",
            form_language="en",
            dynamic_data=dynamic_data,
            appearance_mode="light",
        )

        return self.submit_feedback(form_data, device_data)

    def submit_store_feedback(
        self,
        device_data: MobileDeviceData,
        store_name: str,
        store_comment: str,
        rating: Optional[int] = None,
        contact_name: str = "",
        phone: str = "",
        email: str = "",
        additional_comments: str = "",
        contact_method: str = "B",
    ) -> Dict[str, Any]:
        """
        Submit feedback specifically for store-related issues or compliments.

        Parameters
        ----------
        device_data : MobileDeviceData
            Mobile device information
        store_name : str
            Name of the store being reviewed
        store_comment : str
            The main feedback text about the store
        rating : Optional[int], default None
            Overall satisfaction rating (1-10)
        contact_name : str, default ""
            Contact name if user wants follow-up
        phone : str, default ""
            Phone number for contact
        email : str, default ""
            Email for contact
        additional_comments : str, default ""
            Additional comments in OPEN_CMT field
        contact_method : str, default "B"
            Contact method preference

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API
        """
        # Create components based on actual API structure for store feedback
        components = [
            FeedbackComponent(
                196946, "radio", "FEEDBACK_TOPICAPP", "B", False
            ),  # Store feedback
            FeedbackComponent(
                305822, "grading0to10", "q_bp_digital_osat_scale11", rating, False
            ),
            FeedbackComponent(196950, "select", "NEW_VISIT_REASONAPP", None, False),
            FeedbackComponent(196965, "grading0to10", "EASE_OF_TASK_11", None, False),
            FeedbackComponent(
                255342, "textArea", "OPEN_CMT", additional_comments, False
            ),
            FeedbackComponent(
                197003, "radio", "STORE_FEED", "A", False
            ),  # Store feedback enabled
            FeedbackComponent(197004, "textInput", "STORE_NAME", store_name, False),
            FeedbackComponent(
                197005, "textArea", "STORE_CMT", store_comment, False
            ),  # Main store feedback
            FeedbackComponent(
                197006, "radio", "NEW_CONTACT_METHOD", contact_method, False
            ),
            FeedbackComponent(
                197007, "textInput", "Fullname", contact_name, False, "contactName"
            ),
            FeedbackComponent(197008, "textInput", "Phone", phone, False),
            FeedbackComponent(197009, "textInput", "EMAIL", email, False),
            FeedbackComponent(361058, "grading0to10", "OSAT_11", None, False),
            FeedbackComponent(361059, "checkbox", "S&S_PROBLEMSS", None, False),
            FeedbackComponent(
                357091, "textArea", "S&S_APP_FEEDBACK", "", False
            ),  # Empty for store feedback
            FeedbackComponent(255347, "label", "PRIVACY_POLICY", None, False),
        ]

        # Create custom parameters
        custom_params = [
            FeedbackCustomParam("HOME_STORE_NAME", store_name),
            FeedbackCustomParam("APP_ENVIRONMENT", "playstore"),
        ]

        # Create dynamic data
        dynamic_data = FeedbackDynamicData(
            custom_params=custom_params, pages=[FeedbackPage(components=components)]
        )

        # Create form data
        form_data = FeedbackFormData(
            form_id=9234,  # Based on actual API call
            trigger_type="live",
            form_language="en",
            dynamic_data=dynamic_data,
            appearance_mode="light",
        )

        return self.submit_feedback(form_data, device_data)

    def submit_feedback_generic(
        self, feedback_type: str, device_data: MobileDeviceData, **kwargs
    ) -> Dict[str, Any]:
        """
        Generic feedback submission method that abstracts all feedback types.

        Parameters
        ----------
        feedback_type : str
            Type of feedback: "app", "shop_scan", "store", or "general"
        device_data : MobileDeviceData
            Mobile device information
        **kwargs : Dict[str, Any]
            Additional parameters specific to the feedback type:

            For "app":
                - feedback_text: str - Main feedback text
                - rating: Optional[int] - Overall rating (1-10)
                - visit_reason: str - Visit reason (default "F")
                - ease_rating: Optional[int] - Ease rating (1-10)
                - additional_comments: str - Additional comments
                - contact_name: str - Contact name
                - phone: str - Phone number
                - email: str - Email address

            For "shop_scan":
                - feedback_text: str - Shop & Scan feedback
                - rating: Optional[int] - Overall rating (1-10)
                - store_name: str - Store name
                - store_comment: str - Store-specific comments
                - additional_comments: str - Additional comments
                - contact_name: str - Contact name
                - phone: str - Phone number
                - email: str - Email address

            For "store":
                - store_name: str - Store name being reviewed
                - store_comment: str - Store feedback text
                - rating: Optional[int] - Overall rating (1-10)
                - additional_comments: str - Additional comments
                - contact_name: str - Contact name
                - phone: str - Phone number
                - email: str - Email address
                - contact_method: str - Contact method (default "B")

            For "general":
                - feedback_text: str - General feedback text
                - rating: Optional[int] - Overall rating (1-10)
                - additional_comments: str - Additional comments
                - contact_name: str - Contact name
                - phone: str - Phone number
                - email: str - Email address

        Returns
        -------
        Dict[str, Any]
            Response from the feedback API

        Raises
        ------
        ValueError
            If feedback_type is not recognized
        """
        feedback_type = feedback_type.lower()

        if feedback_type == "app":
            return self.submit_app_feedback(
                device_data=device_data,
                feedback_text=kwargs.get("feedback_text", ""),
                rating=kwargs.get("rating"),
                visit_reason=kwargs.get("visit_reason", "F"),
                ease_rating=kwargs.get("ease_rating"),
                additional_comments=kwargs.get("additional_comments", ""),
                contact_name=kwargs.get("contact_name", ""),
                phone=kwargs.get("phone", ""),
                email=kwargs.get("email", ""),
            )
        elif feedback_type == "shop_scan":
            return self.submit_shop_scan_feedback(
                device_data=device_data,
                feedback_text=kwargs.get("feedback_text", ""),
                rating=kwargs.get("rating"),
                store_name=kwargs.get("store_name", ""),
                store_comment=kwargs.get("store_comment", ""),
                additional_comments=kwargs.get("additional_comments", ""),
                contact_name=kwargs.get("contact_name", ""),
                phone=kwargs.get("phone", ""),
                email=kwargs.get("email", ""),
            )
        elif feedback_type == "store":
            return self.submit_store_feedback(
                device_data=device_data,
                store_name=kwargs.get("store_name", ""),
                store_comment=kwargs.get("store_comment", ""),
                rating=kwargs.get("rating"),
                additional_comments=kwargs.get("additional_comments", ""),
                contact_name=kwargs.get("contact_name", ""),
                phone=kwargs.get("phone", ""),
                email=kwargs.get("email", ""),
                contact_method=kwargs.get("contact_method", "B"),
            )
        elif feedback_type == "general":
            return self.submit_general_feedback(
                device_data=device_data,
                feedback_text=kwargs.get("feedback_text", ""),
                rating=kwargs.get("rating"),
                additional_comments=kwargs.get("additional_comments", ""),
                contact_name=kwargs.get("contact_name", ""),
                phone=kwargs.get("phone", ""),
                email=kwargs.get("email", ""),
            )
        else:
            raise ValueError(
                f"Unknown feedback type: {feedback_type}. Must be one of: app, shop_scan, store, general"
            )

    def create_default_device_data(
        self,
        device_id: Optional[str] = None,
        device_model: str = "HTC One",
        os_version: str = "10",
        app_version: str = "10.12.0",
    ) -> MobileDeviceData:
        """
        Create default mobile device data based on observed values.

        Parameters
        ----------
        device_id : Optional[str], default None
            Custom device ID, will generate UUID if not provided
        device_model : str, default "HTC One"
            Device model name
        os_version : str, default "10"
            Android OS version
        app_version : str, default "10.12.0"
            Meijer app version

        Returns
        -------
        MobileDeviceData
            Default device data object
        """
        if device_id is None:
            device_id = str(uuid.uuid4())

        return MobileDeviceData(
            os_version=os_version,
            sdk_version="4.7.1",  # Based on actual log
            app_version=app_version,
            os_type="Android",
            device_id=device_id,
            device_model=device_model,
            app_id="com.meijer.mobile.meijer",
            is_dark_mode=False,
            is_tablet=False,
            device_resolution="1080*1920",
            device_locale="en_US",
            device_vendor="HTC",
        )
