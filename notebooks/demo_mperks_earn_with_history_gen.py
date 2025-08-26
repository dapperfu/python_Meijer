#!/usr/bin/env python3
"""
Generate an updated demo_mperks_earn notebook with history functionality.

This script takes the existing demo_mperks_earn notebook and adds
a new section for mPerks history functionality.
"""

import json
import nbformat as nbf


def add_history_section_to_notebook(notebook_path, output_path):
    """Add history section to existing mPerks earn demo notebook."""

    # Read the existing notebook
    with open(notebook_path, "r") as f:
        notebook = json.load(f)

    # Find the Summary section
    summary_cell_index = None
    for i, cell in enumerate(notebook["cells"]):
        if cell["cell_type"] == "markdown" and "## Summary" in cell["source"][0]:
            summary_cell_index = i
            break

    if summary_cell_index is None:
        print("❌ Could not find Summary section in notebook")
        return False

    # Create the history section cells
    history_markdown = nbf.v4.new_markdown_cell("""## 8. mPerks Points History

Demonstrate the new mPerks history functionality alongside earn features.""")

    history_code = nbf.v4.new_code_cell("""# Get mPerks points history
print("[HISTORY] Retrieving mPerks points history...")
print("Endpoint: GET /loyalty/mPerks/api/points/history")
print()

try:
    history = meijer.mperks.history
    
    if history and len(history) > 0:
        print(f"[OK] Successfully retrieved {len(history)} history events")
        print(f"   [CHART] Total Earnings: {history.total_earnings:,} points")
        print(f"   [GIFT] Total Redemptions: {history.total_redemptions:,} points")
        print(f"   [TREND] Net Points: {history.net_points:,} points")
        print()
        
        # Show recent events
        print("[CALENDAR] Recent History Events:")
        for i, event in enumerate(history[:5], 1):  # Show first 5
            print(f"   {i}. {event}")
            if event.description:
                print(f"      📝 {event.description}")
            print()
        
        # Filter by event type
        print("[FILTER] Events by Type:")
        event_types = set(event.event_type for event in history.events)
        for event_type in sorted(event_types):
            events_of_type = history.get_events_by_type(event_type)
            total_points = sum(event.points_change for event in events_of_type)
            print(f"   {event_type}: {len(events_of_type)} events, {total_points:+,} points")
        
        print()
        
        # Demonstrate history access methods
        print("[ACCESS] History Access Methods:")
        print(f"   First event: {history[0]}")
        if len(history) > 1:
            print(f"   Second event: {history[1]}")
        print(f"   Total events: {len(history)}")
        
    else:
        print("ℹ️ No history data available or all endpoints failed")
        print("💡 This might be normal if there are no recent transactions")

except Exception as e:
    print(f"[X] Failed to get mPerks history: {e}")""")

    # Insert the history cells before the summary
    notebook["cells"].insert(summary_cell_index, history_markdown)
    notebook["cells"].insert(summary_cell_index + 1, history_code)

    # Update the summary to mention history
    summary_cell = notebook["cells"][summary_cell_index + 2]
    if "source" in summary_cell and isinstance(summary_cell["source"], list):
        # Update the first line to include history
        if summary_cell["source"] and "## Summary" in summary_cell["source"][0]:
            summary_cell["source"][0] = "## Summary\n"

        # Find and update the "What We've Covered" section
        for i, line in enumerate(summary_cell["source"]):
            if "**What We've Covered**" in line:
                # Insert history item after the existing items
                history_item = (
                    "8. **Points History** - Complete transaction history and analysis"
                )
                summary_cell["source"].insert(i + 8, f"   {history_item}\n")
                break

        # Find and update the "API Endpoints" section
        for i, line in enumerate(summary_cell["source"]):
            if "**API Endpoints**" in line:
                # Add history endpoint
                history_endpoint = "- `GET /loyalty/mPerks/api/points/history` - Points transaction history"
                summary_cell["source"].insert(i + 5, f"   {history_endpoint}\n")
                break

    # Write the updated notebook
    with open(output_path, "w") as f:
        json.dump(notebook, f, indent=1)

    return True


def main():
    """Main function to update the demo notebook."""
    input_file = "30_demo_mperks_earn.ipynb"
    output_file = "30_demo_mperks_earn.ipynb"

    print("🔧 Adding mPerks history functionality to demo notebook...")

    try:
        success = add_history_section_to_notebook(input_file, output_file)

        if success:
            print(f"✅ Successfully updated: {output_file}")
            print("📚 The demo notebook now includes mPerks history functionality!")
        else:
            print("❌ Failed to update notebook")

    except Exception as e:
        print(f"❌ Error updating notebook: {e}")
        import traceback

        traceback.print_exc()


if __name__ == "__main__":
    main()
