#!/usr/bin/env python3
"""
Simple test runner to check overall test status.
"""

import subprocess
import sys
import os

def run_tests():
    """Run all tests and report status."""
    print("🧪 Running Meijer API Client Tests")
    print("=" * 50)
    
    # Check if we're in the right directory
    if not os.path.exists("tests/"):
        print("❌ No tests directory found. Please run from the project root.")
        return
    
    # Run tests with minimal output
    try:
        result = subprocess.run([
            "venv/bin/pytest", "tests/", 
            "--tb=no", 
            "-q",
            "--collect-only"
        ], capture_output=True, text=True)
        
        if result.returncode == 0:
            # Parse the collection output to count tests
            lines = result.stdout.split('\n')
            for line in lines:
                if 'collected' in line and 'items' in line:
                    print(f"📊 {line.strip()}")
                    break
        else:
            print("❌ Test collection failed")
            print(result.stderr)
            return
            
    except Exception as e:
        print(f"❌ Error running tests: {e}")
        return
    
    print("\n🔍 Running individual test files...")
    
    test_files = [
        "tests/test_models.py",
        "tests/test_client.py", 
        "tests/test_coupons.py",
        "tests/test_shopping_list.py",
        "tests/test_search.py",
        "tests/test_shop_scan.py",
        "tests/test_mperks.py"
    ]
    
    total_passed = 0
    total_failed = 0
    total_errors = 0
    
    for test_file in test_files:
        if not os.path.exists(test_file):
            continue
            
        print(f"\n📁 {test_file}")
        try:
            result = subprocess.run([
                "venv/bin/pytest", test_file,
                "--tb=no",
                "-q"
            ], capture_output=True, text=True)
            
            if result.returncode == 0:
                # Parse output for test counts
                output = result.stdout
                if "passed" in output:
                    lines = output.split('\n')
                    for line in lines:
                        if "passed" in line and "failed" in line:
                            print(f"   ✅ {line.strip()}")
                            # Extract numbers
                            if "passed" in line:
                                parts = line.split()
                                for i, part in enumerate(parts):
                                    if part == "passed":
                                        if i > 0 and parts[i-1].isdigit():
                                            total_passed += int(parts[i-1])
                                        break
                            if "failed" in line:
                                parts = line.split()
                                for i, part in enumerate(parts):
                                    if part == "failed":
                                        if i > 0 and parts[i-1].isdigit():
                                            total_failed += int(parts[i-1])
                                        break
                            break
                else:
                    print("   ✅ All tests passed")
            else:
                print(f"   ❌ Tests failed")
                total_errors += 1
                
        except Exception as e:
            print(f"   ❌ Error: {e}")
            total_errors += 1
    
    print("\n" + "=" * 50)
    print(f"📊 SUMMARY:")
    print(f"   ✅ Passed: {total_passed}")
    print(f"   ❌ Failed: {total_failed}")
    print(f"   💥 Errors: {total_errors}")
    print(f"   📈 Total: {total_passed + total_failed}")
    
    if total_failed == 0 and total_errors == 0:
        print("\n🎉 All tests are passing!")
    else:
        print(f"\n⚠️  {total_failed + total_errors} issues found")

if __name__ == "__main__":
    run_tests() 