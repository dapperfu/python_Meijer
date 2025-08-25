#!/usr/bin/env python3
"""
Demo script for Meijer coupon import/export functionality.

This script demonstrates how to:
- Export clipped coupons
- Clear all clipped coupons
- Import coupons to restore them
- Share coupons with friends
- Create and restore backups
"""

from meijer import Meijer
import os
from datetime import datetime


def demo_import_export():
    """Demonstrate the coupon import/export functionality."""
    print("="*70)
    print("MEIJER COUPON IMPORT/EXPORT DEMO")
    print("="*70)
    
    try:
        # Initialize the client
        client = Meijer()
        
        # Get coupons
        coupons = client.coupons()
        print(f"\nLoaded {len(coupons)} coupons")
        
        # Show initial state
        stats = client.coupons.get_stats()
        print(f"Initial state: {stats['clipped']} clipped, {stats['available']} available")
        
        # Demo 1: Export clipped coupons
        print(f"\n" + "="*50)
        print("DEMO 1: EXPORT CLIPPED COUPONS")
        print("="*50)
        
        clipped_file = "my_clipped_coupons.json"
        client.coupons.export_clipped_coupons(clipped_file)
        print(f"✓ Exported {stats['clipped']} clipped coupons to {clipped_file}")
        
        # Demo 2: Create a complete backup
        print(f"\n" + "="*50)
        print("DEMO 2: CREATE COMPLETE BACKUP")
        print("="*50)
        
        backup_file = f"coupon_backup_{datetime.now().strftime('%Y%m%d_%H%M%S')}.json"
        client.coupons.create_backup(backup_file)
        print(f"✓ Created complete backup: {backup_file}")
        
        # Demo 3: Share coupons with friends (lightweight format)
        print(f"\n" + "="*50)
        print("DEMO 3: SHARE COUPONS WITH FRIENDS")
        print("="*50)
        
        share_file = "shared_coupons_lightweight.json"
        client.coupons.share_clipped_coupons(share_file, include_metadata=False)
        print(f"✓ Created lightweight share file: {share_file}")
        
        # Also create a full metadata version
        share_file_full = "shared_coupons_full.json"
        client.coupons.share_clipped_coupons(share_file_full, include_metadata=True)
        print(f"✓ Created full metadata share file: {share_file_full}")
        
        # Demo 4: Clear all clipped coupons
        print(f"\n" + "="*50)
        print("DEMO 4: CLEAR ALL CLIPPED COUPONS")
        print("="*50)
        
        print("⚠️  WARNING: This will unclip all your clipped coupons!")
        print("   (But don't worry, we have a backup!)")
        
        # Use the backup_and_clear method
        unclipped_count = client.coupons.backup_and_clear("backup_before_clear.json")
        print(f"✓ Unclipped {unclipped_count} coupons")
        
        # Show new state
        new_stats = client.coupons.get_stats()
        print(f"New state: {new_stats['clipped']} clipped, {new_stats['available']} available")
        
        # Demo 5: Restore from backup
        print(f"\n" + "="*50)
        print("DEMO 5: RESTORE FROM BACKUP")
        print("="*50)
        
        restored_count = client.coupons.restore_from_backup(backup_file)
        print(f"✓ Restored {restored_count} coupons from backup")
        
        # Show restored state
        restored_stats = client.coupons.get_stats()
        print(f"Restored state: {restored_stats['clipped']} clipped, {restored_stats['available']} available")
        
        # Demo 6: Import shared coupons
        print(f"\n" + "="*50)
        print("DEMO 6: IMPORT SHARED COUPONS")
        print("="*50)
        
        # Import from the lightweight share file
        imported_count = client.coupons.import_shared_coupons(share_file, auto_clip=True)
        print(f"✓ Imported {imported_count} shared coupons and auto-clipped them")
        
        # Show final state
        final_stats = client.coupons.get_stats()
        print(f"Final state: {final_stats['clipped']} clipped, {final_stats['available']} available")
        
        # Demo 7: Department-specific exports
        print(f"\n" + "="*50)
        print("DEMO 7: DEPARTMENT-SPECIFIC EXPORTS")
        print("="*50)
        
        # Export Deli coupons
        deli_file = "deli_coupons.json"
        client.coupons.export_by_department("Deli", deli_file)
        deli_coupons = coupons.filter_by_department("Deli")
        print(f"✓ Exported {len(deli_coupons)} Deli coupons to {deli_file}")
        
        # Export Dry Grocery coupons
        dry_grocery_file = "dry_grocery_coupons.json"
        client.coupons.export_by_department("Dry Grocery", dry_grocery_file)
        dry_grocery_coupons = coupons.filter_by_department("Dry Grocery")
        print(f"✓ Exported {len(dry_grocery_coupons)} Dry Grocery coupons to {dry_grocery_file}")
        
        # Export Baby coupons
        baby_file = "baby_coupons.json"
        client.coupons.export_by_department("Baby", baby_file)
        baby_coupons = coupons.filter_by_department("Baby")
        print(f"✓ Exported {len(baby_coupons)} Baby coupons to {baby_file}")
        
        # Demo 8: File management
        print(f"\n" + "="*50)
        print("DEMO 8: FILE MANAGEMENT")
        print("="*50)
        
        # List all created files
        created_files = [
            clipped_file, backup_file, share_file, share_file_full,
            "backup_before_clear.json", deli_file, dry_grocery_file, baby_file
        ]
        
        print("Created files:")
        for file in created_files:
            if os.path.exists(file):
                size = os.path.getsize(file)
                print(f"  ✓ {file} ({size} bytes)")
            else:
                print(f"  ✗ {file} (not found)")
        
        # Summary
        print(f"\n" + "="*70)
        print("IMPORT/EXPORT DEMO COMPLETE!")
        print("="*70)
        
        print(f"\nWhat you can now do:")
        print(f"  1. Share your clipped coupons with friends using the share files")
        print(f"  2. Clear all clipped coupons and start fresh")
        print(f"  3. Restore your previous coupon selections from backups")
        print(f"  4. Import coupons shared by others")
        print(f"  5. Export specific departments for focused shopping")
        
        print(f"\nKey methods available:")
        print(f"  - client.coupons.export_clipped_coupons('file.json')")
        print(f"  - client.coupons.backup_and_clear('backup.json')")
        print(f"  - client.coupons.restore_from_backup('backup.json')")
        print(f"  - client.coupons.share_clipped_coupons('share.json')")
        print(f"  - client.coupons.import_shared_coupons('share.json')")
        
    except Exception as e:
        print(f"Error during demo: {e}")
        print(f"Make sure you're authenticated with the Meijer client")


def cleanup_demo_files():
    """Clean up demo files."""
    demo_files = [
        "my_clipped_coupons.json",
        "shared_coupons_lightweight.json",
        "shared_coupons_full.json",
        "backup_before_clear.json",
        "deli_coupons.json",
        "dry_grocery_coupons.json",
        "baby_coupons.json"
    ]
    
    # Also find backup files
    import glob
    backup_files = glob.glob("coupon_backup_*.json")
    
    all_files = demo_files + backup_files
    
    print(f"\nCleaning up demo files...")
    for file in all_files:
        if os.path.exists(file):
            try:
                os.remove(file)
                print(f"  ✓ Removed {file}")
            except Exception as e:
                print(f"  ✗ Failed to remove {file}: {e}")
        else:
            print(f"  - {file} (not found)")


if __name__ == "__main__":
    demo_import_export()
    
    # Ask if user wants to clean up
    print(f"\n" + "="*50)
    cleanup = input("Clean up demo files? (y/n): ").lower().strip()
    if cleanup in ['y', 'yes']:
        cleanup_demo_files()
    else:
        print("Demo files preserved for inspection.")
