#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create updated demo script for Feedback class with correct API structure
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Updated Feedback Demo Script
===========================

This script demonstrates how to use the updated MeijerFeedback class to submit
different types of feedback based on the actual API structure from mitmproxy logs.
"""

import asyncio
import json
from meijer.feedback import MeijerFeedback, FeedbackFormData, MobileDeviceData
from meijer.client import Meijer


def demo_feedback_submission():
    """Demonstrate feedback submission for various scenarios."""
    
    print("🚀 Meijer Feedback Demo - Updated with Correct API Structure")
    print("=" * 70)
    
    # Initialize Meijer client (you'll need to provide auth)
    try:
        # Try to load from auth file or config
        meijer_client = Meijer()  # Will auto-detect auth
        print("✅ Meijer client initialized successfully")
    except Exception as e:
        print(f"⚠️  Could not initialize Meijer client: {e}")
        print("   This demo will show the structure without making actual API calls")
        return
    
    # Initialize feedback client
    feedback_client = meijer_client.feedback
    
    # Create default device data
    device_data = feedback_client.create_default_device_data()
    print(f"📱 Device data created: {device_data.device_model} (Android {device_data.os_version})")
    
    print("\n🔍 Demo 1: Shop & Scan Feedback")
    print("-" * 40)
    
    try:
        # Example Shop & Scan feedback
        shop_scan_result = feedback_client.submit_shop_scan_feedback(
            device_data=device_data,
            feedback_text="Best featured things ever.",
            rating=8,
            store_name="Meijer Grand Rapids",
            store_comment="Great service and clean store",
            additional_comments="Shop & Scan worked perfectly today"
        )
        print(f"✅ Shop & Scan feedback submitted: {shop_scan_result.get('uuid', 'unknown')}")
    except Exception as e:
        print(f"❌ Shop & Scan feedback failed: {e}")
    
    print("\n📱 Demo 2: App Feedback")
    print("-" * 40)
    
    try:
        # Example app feedback
        app_result = feedback_client.submit_app_feedback(
            device_data=device_data,
            feedback_text="App is working great!",
            rating=5,
            visit_reason="F",  # From actual API call
            ease_rating=10,
            additional_comments="Should allow mitm SSL. Very difficult to reverse engineer.",
            contact_name="John Doe",
            email="john@example.com"
        )
        print(f"✅ App feedback submitted: {app_result.get('uuid', 'unknown')}")
    except Exception as e:
        print(f"❌ App feedback failed: {e}")
    
    print("\n📝 Demo 3: General Feedback")
    print("-" * 40)
    
    try:
        # Example general feedback
        general_result = feedback_client.submit_general_feedback(
            device_data=device_data,
            feedback_text="Overall great experience with the app",
            rating=7,
            additional_comments="Would like to see more features"
        )
        print(f"✅ General feedback submitted: {general_result.get('uuid', 'unknown')}")
    except Exception as e:
        print(f"❌ General feedback failed: {e}")
    
    print("\n📊 Demo 4: Feedback Payload Structure")
    print("-" * 40)
    
    # Show the structure of what gets sent
    print("📤 API Endpoint: POST https://meijer.md-apis.medallia.com/mobileSDK/v2/feedback")
    print("\n🔑 Key Differences Between Feedback Types:")
    print("• Shop & Scan: FEEDBACK_TOPICAPP='C', S&S_APP_FEEDBACK contains feedback")
    print("• App Feedback: FEEDBACK_TOPICAPP='A', OPEN_CMT contains feedback")
    print("• Both use form ID 9234 and similar component structure")
    
    print("\n📋 Component Structure:")
    print("• FEEDBACK_TOPICAPP: Radio button for feedback type (A=App, C=Shop&Scan)")
    print("• q_bp_digital_osat_scale11: Overall satisfaction rating (1-10)")
    print("• NEW_VISIT_REASONAPP: Select dropdown for visit reason")
    print("• EASE_OF_TASK_11: Rating for ease of task completion (1-10)")
    print("• OPEN_CMT: General comments text area")
    print("• S&S_APP_FEEDBACK: Shop & Scan specific feedback")
    print("• OSAT_11: Overall satisfaction rating (1-10)")
    
    print("\n💡 To actually submit feedback:")
    print("1. Ensure you have valid authentication")
    print("2. Initialize Meijer client with auth")
    print("3. Call the appropriate feedback method")
    print("4. Handle the response and any FeedbackError exceptions")
    
    print("\n🔍 To analyze existing feedback logs:")
    print("python tools/feedback_endpoint_analyzer.py <log_file_path>")


if __name__ == "__main__":
    demo_feedback_submission() 