#!/usr/bin/env python3
"""
Test script for coupon import/export functionality.

This script tests the import/export features without requiring authentication.
"""

from meijer.models.coupons import Coupon, CouponCollection
import os
import tempfile


def test_export_functionality():
    """Test export functionality."""
    print("Testing export functionality...")
    
    # Create test coupons
    collection = CouponCollection()
    
    coupon1 = Coupon(
        id="test1",
        name="Deli Coupon",
        department="Deli",
        clipped=True,
        discount_amount=2.00,
        discount_type="dollar"
    )
    
    coupon2 = Coupon(
        id="test2",
        name="Dry Grocery Coupon",
        department="Dry Grocery",
        clipped=False,
        discount_amount=15.00,
        discount_type="dollar"
    )
    
    coupon3 = Coupon(
        id="test3",
        name="Baby Coupon",
        department="Baby",
        clipped=True,
        discount_amount=5.00,
        discount_type="dollar"
    )
    
    collection.add(coupon1)
    collection.add(coupon2)
    collection.add(coupon3)
    
    print(f"Created collection with {len(collection)} coupons")
    print(f"  Clipped: {collection.get_clipped_count()}")
    print(f"  Available: {collection.get_available_count()}")
    
    # Test export to JSON
    with tempfile.NamedTemporaryFile(mode='w', suffix='.json', delete=False) as f:
        temp_file = f.name
    
    try:
        collection.export_to_json(temp_file)
        print(f"✓ Exported to {temp_file}")
        
        # Check file exists and has content
        if os.path.exists(temp_file):
            size = os.path.getsize(temp_file)
            print(f"✓ File created successfully ({size} bytes)")
        else:
            print("✗ File not created")
            return False
            
    finally:
        # Clean up
        if os.path.exists(temp_file):
            os.unlink(temp_file)
    
    return True


def test_export_clipped_coupons():
    """Test exporting only clipped coupons."""
    print("\nTesting export clipped coupons...")
    
    collection = CouponCollection()
    
    # Add test coupons
    for i in range(5):
        coupon = Coupon(
            id=f"test{i}",
            name=f"Test Coupon {i}",
            department="Test",
            clipped=(i % 2 == 0)  # Alternate clipped state
        )
        collection.add(coupon)
    
    print(f"Created collection: {len(collection)} total, {collection.get_clipped_count()} clipped")
    
    # Test export clipped
    with tempfile.NamedTemporaryFile(mode='w', suffix='.json', delete=False) as f:
        temp_file = f.name
    
    try:
        collection.export_clipped_coupons(temp_file)
        print(f"✓ Exported clipped coupons to {temp_file}")
        
        # Verify content
        import json
        with open(temp_file, 'r') as f:
            data = json.load(f)
        
        exported_count = len(data)
        expected_count = collection.get_clipped_count()
        
        if exported_count == expected_count:
            print(f"✓ Exported {exported_count} clipped coupons (expected {expected_count})")
        else:
            print(f"✗ Exported {exported_count} coupons, expected {expected_count}")
            return False
            
    finally:
        if os.path.exists(temp_file):
            os.unlink(temp_file)
    
    return True


def test_export_by_department():
    """Test exporting coupons by department."""
    print("\nTesting export by department...")
    
    collection = CouponCollection()
    
    # Add coupons from different departments
    departments = ["Deli", "Dry Grocery", "Baby", "Deli", "Dry Grocery"]
    
    for i, dept in enumerate(departments):
        coupon = Coupon(
            id=f"dept{i}",
            name=f"{dept} Coupon {i}",
            department=dept,
            clipped=False
        )
        collection.add(coupon)
    
    print(f"Created collection with coupons from {len(set(departments))} departments")
    
    # Test export by department
    with tempfile.NamedTemporaryFile(mode='w', suffix='.json', delete=False) as f:
        temp_file = f.name
    
    try:
        collection.export_by_department("Deli", temp_file)
        print(f"✓ Exported Deli coupons to {temp_file}")
        
        # Verify content
        import json
        with open(temp_file, 'r') as f:
            data = json.load(f)
        
        exported_count = len(data)
        expected_count = len([d for d in departments if d == "Deli"])
        
        if exported_count == expected_count:
            print(f"✓ Exported {exported_count} Deli coupons (expected {expected_count})")
        else:
            print(f"✗ Exported {exported_count} coupons, expected {expected_count}")
            return False
            
    finally:
        if os.path.exists(temp_file):
            os.unlink(temp_file)
    
    return True


def test_backup_and_restore():
    """Test backup and restore functionality."""
    print("\nTesting backup and restore...")
    
    collection = CouponCollection()
    
    # Add test coupons
    for i in range(3):
        coupon = Coupon(
            id=f"backup{i}",
            name=f"Backup Coupon {i}",
            department="Test",
            clipped=(i == 0)  # First one clipped
        )
        collection.add(coupon)
    
    print(f"Created collection: {len(collection)} total, {collection.get_clipped_count()} clipped")
    
    # Create backup
    with tempfile.NamedTemporaryFile(mode='w', suffix='.json', delete=False) as f:
        temp_file = f.name
    
    try:
        collection.create_backup(temp_file)
        print(f"✓ Created backup: {temp_file}")
        
        # Clear collection
        collection.coupons.clear()
        print(f"✓ Cleared collection (now has {len(collection)} coupons)")
        
        # Restore from backup
        restored_count = collection.restore_from_backup(temp_file)
        print(f"✓ Restored {restored_count} coupons from backup")
        
        # Verify restore
        if len(collection) == 3 and collection.get_clipped_count() == 1:
            print(f"✓ Restore successful: {len(collection)} total, {collection.get_clipped_count()} clipped")
        else:
            print(f"✗ Restore failed: {len(collection)} total, {collection.get_clipped_count()} clipped")
            return False
            
    finally:
        if os.path.exists(temp_file):
            os.unlink(temp_file)
    
    return True


def test_share_and_import():
    """Test sharing and importing coupons."""
    print("\nTesting share and import...")
    
    collection = CouponCollection()
    
    # Add test coupons
    for i in range(2):
        coupon = Coupon(
            id=f"share{i}",
            name=f"Share Coupon {i}",
            department="Test",
            clipped=True
        )
        collection.add(coupon)
    
    print(f"Created collection: {len(collection)} total, {collection.get_clipped_count()} clipped")
    
    # Share coupons
    with tempfile.NamedTemporaryFile(mode='w', suffix='.json', delete=False) as f:
        share_file = f.name
    
    try:
        collection.share_clipped_coupons(share_file, include_metadata=False)
        print(f"✓ Created share file: {share_file}")
        
        # Create new collection for import
        import_collection = CouponCollection()
        
        # Import shared coupons
        imported_count = import_collection.import_shared_coupons(share_file, auto_clip=True)
        print(f"✓ Imported {imported_count} shared coupons")
        
        # Verify import
        if len(import_collection) == 2 and import_collection.get_clipped_count() == 2:
            print(f"✓ Import successful: {len(import_collection)} total, {import_collection.get_clipped_count()} clipped")
        else:
            print(f"✗ Import failed: {len(import_collection)} total, {import_collection.get_clipped_count()} clipped")
            return False
            
    finally:
        if os.path.exists(share_file):
            os.unlink(share_file)
    
    return True


def main():
    """Run all import/export tests."""
    print("="*60)
    print("COUPON IMPORT/EXPORT FUNCTIONALITY TESTS")
    print("="*60)
    
    tests = [
        test_export_functionality,
        test_export_clipped_coupons,
        test_export_by_department,
        test_backup_and_restore,
        test_share_and_import
    ]
    
    passed = 0
    total = len(tests)
    
    for test in tests:
        try:
            if test():
                passed += 1
                print("✓ Test passed")
            else:
                print("✗ Test failed")
        except Exception as e:
            print(f"✗ Test error: {e}")
    
    print("\n" + "="*60)
    print(f"TEST RESULTS: {passed}/{total} tests passed")
    print("="*60)
    
    if passed == total:
        print("🎉 All import/export tests passed!")
    else:
        print(f"⚠️  {total - passed} tests failed")
    
    print("\nImport/export features available:")
    print("  - export_clipped_coupons(filepath)")
    print("  - export_by_department(dept, filepath)")
    print("  - create_backup(filepath)")
    print("  - restore_from_backup(filepath)")
    print("  - share_clipped_coupons(filepath)")
    print("  - import_shared_coupons(filepath)")
    print("  - backup_and_clear(filepath)")
    print("  - restore_and_clip(filepath)")


if __name__ == "__main__":
    main()
