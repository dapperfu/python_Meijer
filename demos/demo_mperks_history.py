#!/usr/bin/env python3
"""
Demo script for mPerks history functionality.

This script demonstrates how to use the new mPerks history feature
to fetch and display points history events.
"""

import sys
from datetime import datetime, timedelta
from pathlib import Path

# Add the project root to the path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from meijer import Meijer


def demo_mperks_history():
    """Demonstrate mPerks history functionality."""
    print("🎯 mPerks History Demo")
    print("=" * 50)

    try:
        # Initialize Meijer client
        print("🔧 Initializing Meijer client...")
        m = Meijer()

        # Check if we have authentication
        if not m.token_storage.has_tokens():
            print("❌ No authentication tokens found. Please authenticate first.")
            print("💡 You can use the login flow or load tokens from a log file.")
            return

        print("✅ Client initialized successfully")
        print()

        # Access mPerks history
        print("📊 Fetching mPerks history...")
        history = m.mperks.history

        if not history:
            print("ℹ️ No history data available or all endpoints failed")
            print("💡 This might be normal if there are no recent transactions")
            return

        print(f"✅ Successfully fetched {len(history)} history events")
        print()

        # Display summary
        print("📈 History Summary:")
        print(f"   Total Events: {len(history)}")
        print(f"   Total Earnings: {history.total_earnings:,} points")
        print(f"   Total Redemptions: {history.total_redemptions:,} points")
        print(f"   Net Points: {history.net_points:,} points")
        print()

        # Display recent events (last 10)
        print("📅 Recent History Events:")
        print("-" * 80)

        recent_events = history.get_recent_events(days=90)  # Last 90 days
        if recent_events:
            for i, event in enumerate(recent_events[:10], 1):
                print(f"{i:2d}. {event}")
                if event.description:
                    print(f"     Description: {event.description}")
                if event.transaction_id:
                    print(f"     Transaction ID: {event.transaction_id}")
                if event.store_id:
                    print(f"     Store ID: {event.store_id}")
                print()
        else:
            print("   No recent events found")

        # Display events by type
        print("🏷️ Events by Type:")
        print("-" * 40)

        event_types = set(event.event_type for event in history.events)
        for event_type in sorted(event_types):
            events_of_type = history.get_events_by_type(event_type)
            total_points = sum(event.points_change for event in events_of_type)
            print(
                f"   {event_type}: {len(events_of_type)} events, {total_points:+,} points"
            )

        print()

        # Demonstrate indexing and iteration
        print("🔍 Demonstrating History Access Methods:")
        print("-" * 50)

        if len(history) > 0:
            print(f"   First event: {history[0]}")
            if len(history) > 1:
                print(f"   Second event: {history[1]}")
            if len(history) > 2:
                print(f"   Last event: {history[-1]}")

            print()
            print("   Iterating through first 3 events:")
            for i, event in enumerate(history[:3]):
                print(f"     {i + 1}. {event}")

        print()
        print("✅ mPerks History Demo completed successfully!")

    except Exception as e:
        print(f"❌ Error during demo: {e}")
        import traceback

        traceback.print_exc()


def demo_history_filtering():
    """Demonstrate history filtering capabilities."""
    print("\n🔍 History Filtering Demo")
    print("=" * 50)

    try:
        m = Meijer()

        if not m.token_storage.has_tokens():
            print("❌ No authentication tokens found. Skipping filtering demo.")
            return

        history = m.mperks.history

        if not history:
            print("ℹ️ No history data available for filtering demo.")
            return

        # Filter by date range
        print("📅 Filtering by Date Range:")
        print("-" * 30)

        # Last 30 days
        end_date = datetime.now()
        start_date = end_date - timedelta(days=30)

        recent_events = history.get_events_by_date_range(start_date, end_date)
        print(f"   Events in last 30 days: {len(recent_events)}")

        if recent_events:
            total_points = sum(event.points_change for event in recent_events)
            print(f"   Net points in last 30 days: {total_points:+,}")

        # Last 7 days
        start_date = end_date - timedelta(days=7)
        week_events = history.get_events_by_date_range(start_date, end_date)
        print(f"   Events in last 7 days: {len(week_events)}")

        if week_events:
            total_points = sum(event.points_change for event in week_events)
            print(f"   Net points in last 7 days: {total_points:+,}")

        print()

        # Filter by event type
        print("🏷️ Filtering by Event Type:")
        print("-" * 30)

        purchase_events = history.get_events_by_type("Purchase Earnings")
        reward_events = history.get_events_by_type("Reward Claimed")

        print(f"   Purchase Earnings: {len(purchase_events)} events")
        if purchase_events:
            total_earned = sum(event.points_change for event in purchase_events)
            print(f"     Total points earned: {total_earned:,}")

        print(f"   Reward Claimed: {len(reward_events)} events")
        if reward_events:
            total_spent = sum(abs(event.points_change) for event in reward_events)
            print(f"     Total points spent: {total_spent:,}")

        print()
        print("✅ History Filtering Demo completed successfully!")

    except Exception as e:
        print(f"❌ Error during filtering demo: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    print("🚀 Starting mPerks History Demo")
    print("=" * 60)

    # Run main demo
    demo_mperks_history()

    # Run filtering demo
    demo_history_filtering()

    print("\n🎉 All demos completed!")
    print("\n💡 Usage Examples:")
    print("   m = Meijer()")
    print("   history = m.mperks.history")
    print("   print(history[0])  # First event")
    print("   print(len(history))  # Total events")
    print("   recent = history.get_recent_events(days=30)  # Last 30 days")
    print("   purchases = history.get_events_by_type('Purchase Earnings')")
