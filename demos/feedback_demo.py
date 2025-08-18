#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create demo script for Feedback class usage
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Feedback Demo Script
===================

This script demonstrates how to use the MeijerFeedback class to submit
feedback about various issues including store search problems and
account registration failures.
"""

import asyncio
from meijer.feedback import MeijerFeedback, FeedbackFormData, MobileDeviceData
from meijer.api_client import MeijerAPIClient


async def demo_feedback_submission():
    """Demonstrate feedback submission for various scenarios."""
    
    print("🚀 Meijer Feedback Demo")
    print("=" * 50)
    
    # Note: This demo shows the structure but won't actually submit
    # since we don't have a real authenticated API client
    
    print("\n📱 Creating mobile device data...")
    device_data = MobileDeviceData(
        os_version="10",
        sdk_version="4.7.1",
        app_version="10.12.0",
        os_type="Android",
        device_id="demo-device-123",
        device_model="HTC One",
        app_id="com.meijer.mobile.meijer",
        is_dark_mode=False,
        is_tablet=False,
        device_resolution="1080*1920",
        device_locale="en_US",
        device_vendor="HTC"
    )
    
    print(f"✅ Device: {device_data.device_model} ({device_data.os_type} {device_data.os_version})")
    
    print("\n🔍 Demo 1: Store Search Feedback")
    print("-" * 30)
    
    # Example store search feedback
    store_search_form = FeedbackFormData(
        form_id=9234,  # Based on actual log analysis
        trigger_type="live",
        form_language="en_US",
        form_data={
            "searchQuery": "Muskegon, MI",
            "errorMessage": "Store search returned no results",
            "feature": "store_search",
            "coordinates": {
                "latitude": 43.2705757,
                "longitude": -86.3130861
            },
            "searchRadius": "50 miles",
            "timestamp": "2024-12-19T15:30:00Z"
        },
        user_rating=1,  # Poor experience
        user_comment="Store search is completely broken - can't find any stores in my area",
        category="store_search_error",
        priority="high"
    )
    
    print(f"📝 Form ID: {store_search_form.form_id}")
    print(f"🔍 Search Query: {store_search_form.form_data['searchQuery']}")
    print(f"❌ Error: {store_search_form.form_data['errorMessage']}")
    print(f"⭐ Rating: {store_search_form.user_rating}/5")
    print(f"💬 Comment: {store_search_form.user_comment}")
    
    print("\n📝 Demo 2: Account Registration Feedback")
    print("-" * 30)
    
    # Example registration feedback
    registration_form = FeedbackFormData(
        form_id=9234,
        trigger_type="live",
        form_language="en_US",
        form_data={
            "registrationStep": "store_selection",
            "errorMessage": "Cannot select store during registration",
            "feature": "account_registration",
            "phoneNumber": "231-666-9999",
            "email": "test@example.com",
            "timestamp": "2024-12-19T15:30:00Z"
        },
        user_rating=1,
        user_comment="Registration process is broken - can't complete store selection step",
        category="registration_error",
        priority="high"
    )
    
    print(f"📝 Form ID: {registration_form.form_id}")
    print(f"🔧 Step: {registration_form.form_data['registrationStep']}")
    print(f"❌ Error: {registration_form.form_data['errorMessage']}")
    print(f"📱 Phone: {registration_form.form_data['phoneNumber']}")
    print(f"⭐ Rating: {registration_form.user_rating}/5")
    print(f"💬 Comment: {registration_form.user_comment}")
    
    print("\n🔧 Demo 3: Using Helper Methods")
    print("-" * 30)
    
    print("The Feedback class provides helper methods for common scenarios:")
    print("• submit_store_search_feedback() - For store search issues")
    print("• submit_registration_feedback() - For registration problems")
    print("• create_default_device_data() - For standard device info")
    
    print("\n📊 Demo 4: Feedback Payload Structure")
    print("-" * 30)
    
    # Show what the actual API payload would look like
    sample_payload = {
        "uuid": "demo-uuid-123",
        "mobileDeviceData": {
            "osVersion": device_data.os_version,
            "sdkVersion": device_data.sdk_version,
            "appVersion": device_data.app_version,
            "osType": device_data.os_type,
            "deviceId": device_data.device_id,
            "deviceModel": device_data.device_model,
            "appId": device_data.app_id,
            "isDarkMode": device_data.is_dark_mode,
            "isTablet": device_data.is_tablet,
            "deviceResolution": device_data.device_resolution,
            "deviceLocale": device_data.device_locale,
            "deviceVendor": device_data.device_vendor
        },
        "formId": store_search_form.form_id,
        "triggerType": store_search_form.trigger_type,
        "onPremData": None,
        "formLanguage": store_search_form.form_language,
        "formData": store_search_form.form_data
    }
    
    print("📤 API Endpoint: POST https://147.75.243.16/mobileSDK/v2/feedback")
    print("📋 Payload includes:")
    print(f"   • UUID: {sample_payload['uuid']}")
    print(f"   • Form ID: {sample_payload['formId']}")
    print(f"   • Device: {sample_payload['mobileDeviceData']['deviceModel']}")
    print(f"   • App Version: {sample_payload['mobileDeviceData']['appVersion']}")
    
    print("\n✅ Demo completed!")
    print("\n💡 To actually submit feedback:")
    print("1. Create an authenticated MeijerAPIClient")
    print("2. Initialize MeijerFeedback with the client")
    print("3. Call submit_feedback() or use helper methods")
    print("4. Handle the response and any FeedbackError exceptions")


if __name__ == "__main__":
    asyncio.run(demo_feedback_submission()) 