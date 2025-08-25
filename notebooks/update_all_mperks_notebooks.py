#!/usr/bin/env python3
"""
Update all mPerks notebooks with history functionality.

This script adds mPerks history sections to all relevant mPerks notebooks.
"""

import json
import os
import shutil
import nbformat as nbf


def add_history_section_to_notebook(notebook_path, output_path):
    """Add history section to existing mPerks notebook."""
    
    # Read the existing notebook
    with open(notebook_path, 'r') as f:
        notebook = json.load(f)
    
    # Find the Summary section or end of notebook
    insert_index = len(notebook['cells'])
    for i, cell in enumerate(notebook['cells']):
        if cell['cell_type'] == 'markdown' and '## Summary' in str(cell['source']):
            insert_index = i
            break
    
    # Create the history section cells
    history_markdown = nbf.v4.new_markdown_cell("""## mPerks Points History

Access your complete mPerks points transaction history including earnings, redemptions, and bonus points.""")

    history_code = nbf.v4.new_code_cell("""# Get mPerks points history
try:
    history = meijer.mperks.history
    
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
        
        # Filter by event type
        print("🏷️ Events by Type:")
        event_types = set(event.event_type for event in history.events)
        for event_type in sorted(event_types):
            events_of_type = history.get_events_by_type(event_type)
            total_points = sum(event.points_change for event in events_of_type)
            print(f"   {event_type}: {len(events_of_type)} events, {total_points:+,} points")
        
        print()
        
        # Demonstrate history access methods
        print("🔍 History Access Methods:")
        print(f"   First event: {history[0]}")
        if len(history) > 1:
            print(f"   Second event: {history[1]}")
        print(f"   Total events: {len(history)}")
        
    else:
        print("ℹ️ No history data available or all endpoints failed")
        print("💡 This might be normal if there are no recent transactions")

except Exception as e:
    print(f"❌ Failed to get mPerks history: {e}")""")

    # Insert the history cells before the summary or at the end
    notebook['cells'].insert(insert_index, history_markdown)
    notebook['cells'].insert(insert_index + 1, history_code)
    
    # Write the updated notebook
    with open(output_path, 'w') as f:
        json.dump(notebook, f, indent=1)
    
    return True


def update_notebook_with_history(notebook_path):
    """Update a single notebook with history functionality."""
    
    # Create backup
    backup_path = f"{notebook_path}.backup"
    shutil.copy2(notebook_path, backup_path)
    
    # Update the notebook
    success = add_history_section_to_notebook(notebook_path, notebook_path)
    
    if success:
        print(f"✅ Updated: {notebook_path}")
        return True
    else:
        print(f"❌ Failed to update: {notebook_path}")
        # Restore backup on failure
        shutil.copy2(backup_path, notebook_path)
        return False


def main():
    """Update all mPerks notebooks with history functionality."""
    
    # List of mPerks notebooks to update
    mperks_notebooks = [
        "14_mperks.ipynb",
        "30_demo_mperks_earn.ipynb", 
        "31_demo_mperks_reward_coupons.ipynb",
        "34_mperks_demo.ipynb",
        "demo_mperks_earn.ipynb",
        "demo_mperks_reward_coupons.ipynb"
    ]
    
    print("🔧 Updating all mPerks notebooks with history functionality...")
    print("=" * 70)
    
    updated_count = 0
    total_count = len(mperks_notebooks)
    
    for notebook_path in mperks_notebooks:
        if os.path.exists(notebook_path):
            print(f"📚 Processing: {notebook_path}")
            if update_notebook_with_history(notebook_path):
                updated_count += 1
        else:
            print(f"⚠️  Not found: {notebook_path}")
    
    print("=" * 70)
    print(f"🎉 Update complete! {updated_count}/{total_count} notebooks updated successfully.")
    print("📚 All mPerks notebooks now include comprehensive history functionality!")
    
    if updated_count < total_count:
        print("⚠️  Some notebooks could not be updated. Check the output above for details.")


if __name__ == "__main__":
    main()
