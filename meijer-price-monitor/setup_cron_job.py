#!/usr/bin/env python3
"""
Setup script for LEGO price collection cron job.
This script helps configure automated price collection.
"""

import os
import subprocess
import sys
from pathlib import Path


def check_cron_availability():
    """Check if cron is available on the system."""
    try:
        result = subprocess.run(['which', 'crontab'], capture_output=True, text=True)
        if result.returncode == 0:
            print("✅ Crontab is available")
            return True
        else:
            print("❌ Crontab not found. Please install cron.")
            return False
    except Exception as e:
        print(f"❌ Error checking cron availability: {e}")
        return False


def get_current_crontab():
    """Get current crontab entries."""
    try:
        result = subprocess.run(['crontab', '-l'], capture_output=True, text=True)
        if result.returncode == 0:
            return result.stdout
        else:
            return ""
    except Exception as e:
        print(f"❌ Error getting current crontab: {e}")
        return ""


def add_cron_job(schedule="0 6 * * *"):
    """Add LEGO price collection job to crontab."""
    script_path = "/projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh"
    
    # Check if script exists
    if not os.path.exists(script_path):
        print(f"❌ Cron script not found at {script_path}")
        return False
    
    # Check if script is executable
    if not os.access(script_path, os.X_OK):
        print(f"❌ Cron script is not executable. Run: chmod +x {script_path}")
        return False
    
    # Get current crontab
    current_crontab = get_current_crontab()
    
    # Check if job already exists
    if "lego_price_collector.sh" in current_crontab:
        print("⚠️  LEGO price collection job already exists in crontab")
        return True
    
    # Add new job
    new_job = f"{schedule} {script_path}\n"
    new_crontab = current_crontab + new_job
    
    try:
        # Write new crontab
        process = subprocess.Popen(['crontab', '-'], stdin=subprocess.PIPE, text=True)
        process.communicate(input=new_crontab)
        
        if process.returncode == 0:
            print(f"✅ Successfully added cron job: {schedule}")
            print(f"📅 Schedule: {schedule}")
            print(f"📄 Script: {script_path}")
            return True
        else:
            print("❌ Failed to add cron job")
            return False
            
    except Exception as e:
        print(f"❌ Error adding cron job: {e}")
        return False


def show_cron_status():
    """Show current cron job status."""
    print("\n📋 Current Crontab:")
    print("=" * 50)
    
    current_crontab = get_current_crontab()
    if current_crontab:
        print(current_crontab)
    else:
        print("No crontab entries found")
    
    print("\n🔍 LEGO Price Collection Jobs:")
    print("=" * 50)
    
    if "lego_price_collector.sh" in current_crontab:
        print("✅ LEGO price collection job is configured")
        # Extract the schedule
        lines = current_crontab.split('\n')
        for line in lines:
            if "lego_price_collector.sh" in line:
                print(f"📅 Schedule: {line}")
    else:
        print("❌ No LEGO price collection job found")


def test_cron_script():
    """Test the cron script manually."""
    script_path = "/projects/python_Meijer/meijer-price-monitor/cron_lego_price_collector.sh"
    
    print(f"\n🧪 Testing cron script: {script_path}")
    print("=" * 50)
    
    if not os.path.exists(script_path):
        print(f"❌ Script not found: {script_path}")
        return False
    
    try:
        # Run the script
        result = subprocess.run([script_path], capture_output=True, text=True)
        
        print("📤 Script output:")
        print(result.stdout)
        
        if result.stderr:
            print("\n⚠️  Script errors:")
            print(result.stderr)
        
        if result.returncode == 0:
            print("\n✅ Script executed successfully")
            return True
        else:
            print(f"\n❌ Script failed with exit code: {result.returncode}")
            return False
            
    except Exception as e:
        print(f"❌ Error running script: {e}")
        return False


def main():
    """Main setup function."""
    print("🚀 LEGO Price Collection Cron Job Setup")
    print("=" * 50)
    
    # Check cron availability
    if not check_cron_availability():
        print("\n💡 To install cron on Ubuntu/Debian:")
        print("   sudo apt-get install cron")
        print("\n💡 To install cron on CentOS/RHEL:")
        print("   sudo yum install cronie")
        return
    
    # Show current status
    show_cron_status()
    
    # Ask user what they want to do
    print("\n🎯 What would you like to do?")
    print("1. Add daily cron job (6:00 AM)")
    print("2. Add twice daily cron job (6:00 AM and 6:00 PM)")
    print("3. Add custom schedule")
    print("4. Test cron script")
    print("5. Show current crontab")
    print("6. Exit")
    
    choice = input("\nEnter your choice (1-6): ").strip()
    
    if choice == "1":
        add_cron_job("0 6 * * *")
    elif choice == "2":
        add_cron_job("0 6,18 * * *")
    elif choice == "3":
        print("\n📅 Available schedules:")
        print("• 0 6 * * *     - Daily at 6:00 AM")
        print("• 0 6,18 * * *  - Twice daily (6 AM and 6 PM)")
        print("• */6 * * *     - Every 6 hours")
        print("• 0 8-20 * * *  - Every hour from 8 AM to 8 PM")
        print("• 0 6 * * 1-5   - Weekdays only at 6:00 AM")
        
        schedule = input("\nEnter your custom schedule: ").strip()
        if schedule:
            add_cron_job(schedule)
    elif choice == "4":
        test_cron_script()
    elif choice == "5":
        show_cron_status()
    elif choice == "6":
        print("👋 Goodbye!")
    else:
        print("❌ Invalid choice")
    
    # Show final status
    print("\n📊 Final Status:")
    show_cron_status()


if __name__ == "__main__":
    main()


