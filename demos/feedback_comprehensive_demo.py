#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create comprehensive demo script showing all feedback types and convenience method
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package
 */

Comprehensive Feedback Demo Script
=================================

This script demonstrates all three feedback types and the new convenience method
based on actual API structure from mitmproxy logs.
"""

from meijer.client import Meijer


def demo_all_feedback_types():
    """Demonstrate all three feedback types with detailed examples."""

    print("🚀 Meijer Comprehensive Feedback Demo")
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
    print(
        f"📱 Device data created: {device_data.device_model} (Android {device_data.os_version})"
    )

    print("\n" + "=" * 70)
    print("🔍 DEMO 1: Shop & Scan Feedback (FEEDBACK_TOPICAPP='C')")
    print("=" * 70)

    try:
        # Example Shop & Scan feedback based on actual API call
        shop_scan_result = feedback_client.submit_shop_scan_feedback(
            device_data=device_data,
            feedback_text="Best featured things ever.",  # Goes in S&S_APP_FEEDBACK
            rating=8,  # Goes in OSAT_11
            store_name="Meijer Grand Rapids",
            store_comment="Great service and clean store",
            additional_comments="Shop & Scan worked perfectly today",  # Goes in OPEN_CMT
        )
        print(
            f"✅ Shop & Scan feedback submitted: {shop_scan_result.get('uuid', 'unknown')}"
        )
        print("📋 Key fields used:")
        print("   • FEEDBACK_TOPICAPP: 'C' (Shop & Scan)")
        print("   • S&S_APP_FEEDBACK: 'Best featured things ever.'")
        print("   • OSAT_11: 8 (rating)")
        print("   • STORE_NAME: 'Meijer Grand Rapids'")
        print("   • STORE_CMT: 'Great service and clean store'")
        print("   • OPEN_CMT: 'Shop & Scan worked perfectly today'")
    except Exception as e:
        print(f"❌ Shop & Scan feedback failed: {e}")

    print("\n" + "=" * 70)
    print("📱 DEMO 2: App Feedback (FEEDBACK_TOPICAPP='A')")
    print("=" * 70)

    try:
        # Example app feedback based on actual API call
        app_result = feedback_client.submit_app_feedback(
            device_data=device_data,
            feedback_text="App is working great!",  # Goes in OPEN_CMT
            rating=5,  # Goes in q_bp_digital_osat_scale11
            visit_reason="F",  # From actual API call
            ease_rating=10,  # Goes in EASE_OF_TASK_11
            additional_comments="Should allow mitm SSL. Very difficult to reverse engineer.",  # Goes in OPEN_CMT
            contact_name="John Doe",
            email="john@example.com",
        )
        print(f"✅ App feedback submitted: {app_result.get('uuid', 'unknown')}")
        print("📋 Key fields used:")
        print("   • FEEDBACK_TOPICAPP: 'A' (App)")
        print(
            "   • OPEN_CMT: 'Should allow mitm SSL. Very difficult to reverse engineer.'"
        )
        print("   • q_bp_digital_osat_scale11: 5 (rating)")
        print("   • NEW_VISIT_REASONAPP: 'F'")
        print("   • EASE_OF_TASK_11: 10 (ease rating)")
        print("   • S&S_APP_FEEDBACK: '' (empty for app feedback)")
    except Exception as e:
        print(f"❌ App feedback failed: {e}")

    print("\n" + "=" * 70)
    print("🏪 DEMO 3: Store Feedback (FEEDBACK_TOPICAPP='B')")
    print("=" * 70)

    try:
        # Example store feedback based on actual API call
        store_result = feedback_client.submit_store_feedback(
            device_data=device_data,
            store_name="North Muskegon",  # From actual API call
            store_comment="Fucking best store ever.\n\nAlthough your clearance prices aren't that steep. If you want it off your shelf drop the prices like Walmart.",  # From actual API call
            rating=None,  # No rating in actual call
            additional_comments="Store feedback submitted via app",
            contact_name="J",  # From actual API call
            email="Meijer.com@eabi.xyz",  # From actual API call
            contact_method="B",  # From actual API call
        )
        print(f"✅ Store feedback submitted: {store_result.get('uuid', 'unknown')}")
        print("📋 Key fields used:")
        print("   • FEEDBACK_TOPICAPP: 'B' (Store)")
        print("   • STORE_FEED: 'A' (Store feedback enabled)")
        print("   • STORE_NAME: 'North Muskegon'")
        print("   • STORE_CMT: 'Fucking best store ever...'")
        print("   • NEW_CONTACT_METHOD: 'B'")
        print("   • S&S_APP_FEEDBACK: '' (empty for store feedback)")
    except Exception as e:
        print(f"❌ Store feedback failed: {e}")

    print("\n" + "=" * 70)
    print("🎯 DEMO 4: Convenience Method (meijer.feedback())")
    print("=" * 70)

    try:
        # Using the new convenience method
        print("🚀 Using meijer.feedback() convenience method:")

        # App feedback via convenience method
        app_result_simple = meijer_client.feedback(
            "app",
            feedback_text="Great app experience!",
            rating=9,
            visit_reason="F",
            ease_rating=9,
        )
        print(
            f"✅ App feedback via convenience method: {app_result_simple.get('uuid', 'unknown')}"
        )

        # Store feedback via convenience method
        store_result_simple = meijer_client.feedback(
            "store",
            store_name="Grand Rapids",
            store_comment="Excellent customer service and clean facilities",
            rating=10,
            contact_name="Jane Smith",
            email="jane@example.com",
        )
        print(
            f"✅ Store feedback via convenience method: {store_result_simple.get('uuid', 'unknown')}"
        )

        # Shop & Scan feedback via convenience method
        scan_result_simple = meijer_client.feedback(
            "shop_scan",
            feedback_text="Shop & Scan worked flawlessly",
            rating=9,
            store_name="Lansing",
            store_comment="Fast checkout process",
        )
        print(
            f"✅ Shop & Scan feedback via convenience method: {scan_result_simple.get('uuid', 'unknown')}"
        )

    except Exception as e:
        print(f"❌ Convenience method failed: {e}")

    print("\n" + "=" * 70)
    print("📊 FEEDBACK TYPE COMPARISON")
    print("=" * 70)

    print("🔑 Key Differences Between Feedback Types:")
    print()
    print("📱 APP FEEDBACK (FEEDBACK_TOPICAPP='A'):")
    print("   • Main feedback goes in OPEN_CMT field")
    print("   • S&S_APP_FEEDBACK is empty")
    print("   • Includes visit reason and ease rating")
    print("   • Focus on app functionality and user experience")
    print()
    print("🛒 SHOP & SCAN FEEDBACK (FEEDBACK_TOPICAPP='C'):")
    print("   • Main feedback goes in S&S_APP_FEEDBACK field")
    print("   • OPEN_CMT for additional comments")
    print("   • Includes store name and store comments")
    print("   • Focus on Shop & Scan functionality")
    print()
    print("🏪 STORE FEEDBACK (FEEDBACK_TOPICAPP='B'):")
    print("   • Main feedback goes in STORE_CMT field")
    print("   • STORE_FEED is set to 'A' (enabled)")
    print("   • S&S_APP_FEEDBACK is empty")
    print("   • Focus on store experience and service")
    print()
    print("📋 COMMON FIELDS ACROSS ALL TYPES:")
    print("   • Form ID: 9234")
    print("   • Trigger Type: 'live'")
    print("   • Form Language: 'en'")
    print("   • Device data and custom parameters")
    print("   • Contact information fields")

    print("\n" + "=" * 70)
    print("💡 USAGE EXAMPLES")
    print("=" * 70)

    print("🚀 Simple feedback submission:")
    print("   meijer.feedback('app', feedback_text='Great app!', rating=9)")
    print(
        "   meijer.feedback('store', store_name='North Muskegon', store_comment='Best store!')"
    )
    print(
        "   meijer.feedback('shop_scan', feedback_text='Worked perfectly', store_name='Grand Rapids')"
    )
    print()
    print("🔧 Advanced feedback with all options:")
    print(
        "   meijer.feedback('app', feedback_text='App feedback', rating=8, visit_reason='F', ease_rating=9, contact_name='John', email='john@example.com')"
    )
    print(
        "   meijer.feedback('store', store_name='Store Name', store_comment='Store feedback', rating=10, contact_name='Jane', email='jane@example.com', contact_method='B')"
    )
    print(
        "   meijer.feedback('shop_scan', feedback_text='Scan feedback', rating=9, store_name='Store Name', store_comment='Store comment', additional_comments='Additional info')"
    )

    print("\n" + "=" * 70)
    print("🔍 LOG ANALYSIS")
    print("=" * 70)

    print("📊 To analyze existing feedback logs and discover patterns:")
    print("   python tools/feedback_endpoint_analyzer.py <log_file_path>")
    print()
    print("📋 This will generate a detailed report showing:")
    print("   • All feedback submissions found")
    print("   • Feedback type categorization")
    print("   • Payload structure analysis")
    print("   • Component usage patterns")
    print("   • Device data statistics")

    print("\n✅ Demo completed successfully!")


if __name__ == "__main__":
    demo_all_feedback_types()
