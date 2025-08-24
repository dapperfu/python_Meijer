#!/usr/bin/env python3
"""
Generate an updated mPerks notebook with history functionality.

This script creates a comprehensive notebook showcasing mPerks features
including the new history tracking capabilities.
"""

import nbformat as nbf


def create_mperks_history_notebook():
    """Create the updated mPerks notebook with history functionality."""

    # Create a new notebook
    nb = nbf.v4.new_notebook()

    # Add title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer Client - mPerks Rewards

This notebook covers mPerks functionality:
- Viewing earned rewards
- Reward categories
- Points and benefits
- mPerks operations
- **NEW: Points History and Transactions**""")

    # Add setup cell
    setup_cell = nbf.v4.new_code_cell("""# Import and setup
from meijer.client import Meijer

# Initialize client
client = Meijer()
print("✅ Client initialized")""")

    # Add rewards section
    rewards_section = nbf.v4.new_markdown_cell("""## View mPerks Rewards

Get information about your mPerks rewards and points.""")

    rewards_code = nbf.v4.new_code_cell("""# Get mPerks information
try:
    rewards = client.mperks.get_earned_rewards()

    if rewards:
        print(f"🎁 Found {len(rewards)} earned rewards:")
        for i, reward in enumerate(rewards[:3], 1):  # Show first 3
            print(f"  {i}. {reward.description}")
            print(f"     💰 Value: {reward.value}")
            print(f"     📅 Expires: {reward.expiration_date}")
            print()
    else:
        print("❌ No rewards found")

except Exception as e:
    print(f"❌ Failed to get mPerks: {e}")""")

    # Add history introduction
    history_intro = nbf.v4.new_markdown_cell("""## NEW: mPerks Points History

Access your complete mPerks points transaction history including earnings, redemptions, and bonus points.""")

    # Add history retrieval code
    history_code = nbf.v4.new_code_cell("""# Get mPerks points history
try:
    history = client.mperks.history
    
    if history and len(history) > 0:
        print(f"📊 Found {len(history)} history events:")
        print(f"   💰 Total Earnings: {history.total_earnings:,} points")
        print(f"   🎁 Total Redemptions: {history.total_redemptions:,} points")
        print(f"   📈 Net Points: {history.net_points:,} points")
        print()
        
        # Show recent events
        print("📅 Recent History Events:")
        for i, event in enumerate(history[:5], 1):  # Show first 5
            print(f"  {i}. {event}")
            if event.description:
                print(f"     📝 {event.description}")
            print()
    else:
        print("ℹ️ No history data available or all endpoints failed")
        print("💡 This might be normal if there are no recent transactions")

except Exception as e:
    print(f"❌ Failed to get mPerks history: {e}")""")

    # Add history filtering section
    filtering_section = nbf.v4.new_markdown_cell("""## History Filtering and Analysis

Filter and analyze your mPerks history by different criteria.""")

    filtering_code = nbf.v4.new_code_cell("""# Filter history by event type
try:
    if 'history' in locals() and len(history) > 0:
        print("🏷️ Events by Type:")
        print("-" * 40)
        
        event_types = set(event.event_type for event in history.events)
        for event_type in sorted(event_types):
            events_of_type = history.get_events_by_type(event_type)
            total_points = sum(event.points_change for event in events_of_type)
            print(f"   {event_type}: {len(events_of_type)} events, {total_points:+,} points")
        
        print()
        
        # Show specific event types
        purchase_events = history.get_events_by_type("Purchase Earnings")
        reward_events = history.get_events_by_type("Reward Claimed")
        
        if purchase_events:
            print(f"🛒 Purchase Earnings: {len(purchase_events)} events")
            total_earned = sum(event.points_change for event in purchase_events)
            print(f"   Total points earned: {total_earned:,}")
        
        if reward_events:
            print(f"🎁 Reward Claimed: {len(reward_events)} events")
            total_spent = sum(abs(event.points_change) for event in reward_events)
            print(f"   Total points spent: {total_spent:,}")
        
        print()

except Exception as e:
    print(f"❌ Failed to filter history: {e}")""")

    # Add history access methods section
    access_section = nbf.v4.new_markdown_cell("""## History Access Methods

Demonstrate different ways to access and iterate through history data.""")

    access_code = nbf.v4.new_code_cell("""# Demonstrate history access methods
try:
    if 'history' in locals() and len(history) > 0:
        print("🔍 History Access Methods:")
        print("-" * 50)
        
        # Indexing
        print(f"   First event: {history[0]}")
        if len(history) > 1:
            print(f"   Second event: {history[1]}")
        if len(history) > 2:
            print(f"   Last event: {history[-1]}")
        
        print()
        
        # Length and iteration
        print(f"   Total events: {len(history)}")
        print("   Iterating through first 3 events:")
        for i, event in enumerate(history[:3]):
            print(f"     {i+1}. {event}")
        
        print()

except Exception as e:
    print(f"❌ Failed to demonstrate access methods: {e}")""")

    # Add points balance section
    balance_section = nbf.v4.new_markdown_cell("""## Points Balance

Get your current mPerks points balance.""")

    balance_code = nbf.v4.new_code_cell("""# Get current points balance
try:
    balance = client.mperks.get_point_balance()
    print(f"💰 Current mPerks Points: {balance:,}")
    
    # Compare with history net points
    if 'history' in locals() and len(history) > 0:
        print(f"📊 History Net Points: {history.net_points:,}")
        print(f"📈 Difference: {balance - history.net_points:+,} points")
        print("💡 The difference may include pending transactions or real-time updates")

except Exception as e:
    print(f"❌ Failed to get points balance: {e}")""")

    # Add summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook demonstrates:
- ✅ Basic mPerks rewards functionality
- ✅ **NEW: Complete points history with transactions**
- ✅ **NEW: History filtering by event type and date**
- ✅ **NEW: History aggregation and analysis**
- ✅ **NEW: Indexed access to history events**
- ✅ Points balance and comparison

The history functionality provides comprehensive tracking of all your mPerks points activity, making it easy to analyze spending patterns, track earnings, and monitor your loyalty program participation.""")

    # Add all cells to the notebook
    nb.cells = [
        title_cell,
        setup_cell,
        rewards_section,
        rewards_code,
        history_intro,
        history_code,
        filtering_section,
        filtering_code,
        access_section,
        access_code,
        balance_section,
        balance_code,
        summary_section
    ]

    # Add metadata
    nb.metadata = {
        "kernelspec": {
            "display_name": "Python 3",
            "language": "python",
            "name": "python3"
        },
        "language_info": {
            "codemirror_mode": {
                "name": "ipython",
                "version": 3
            },
            "file_extension": ".py",
            "mimetype": "text/x-python",
            "name": "python",
            "nbconvert_exporter": "python",
            "pygments_lexer": "ipython3",
            "version": "3.8.0"
        }
    }

    return nb


def main():
    """Generate the mPerks history notebook."""
    print("🔧 Generating updated mPerks notebook with history functionality...")
    
    nb = create_mperks_history_notebook()
    
    # Write the notebook to file
    output_file = "14_mperks.ipynb"
    nbf.write(nb, output_file)
    
    print(f"✅ Successfully generated: {output_file}")
    print("📚 The notebook now includes comprehensive mPerks history functionality!")


if __name__ == "__main__":
    main()
