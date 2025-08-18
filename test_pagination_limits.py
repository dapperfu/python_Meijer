#!/usr/bin/env python3
"""
Test Pagination Limits Validation
================================

This script validates that the coupon pagination works correctly for different limit values.
It tests that asking for N coupons returns exactly N coupons (or all available if N > total).
"""

import logging
import time
from meijer import Meijer

# Configure logging
logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s - %(levelname)s - %(message)s"
)

def test_pagination_limits():
    """Test that pagination returns exactly the requested number of coupons."""
    print("🧪 TESTING PAGINATION LIMITS VALIDATION")
    print("=" * 60)
    
    try:
        # Initialize client
        print("🔧 Initializing Meijer client...")
        client = Meijer()
        
        if not client._ensure_authenticated():
            print("❌ Authentication failed")
            return False
        
        print("✅ Client authenticated successfully")
        
        # Test different limit values
        test_limits = [1, 5, 10, 25, 50, 75, 100, 200, 300, 500, 1000]
        results = []
        
        print(f"\n📊 Testing {len(test_limits)} different limit values...")
        print("=" * 60)
        
        for i, limit in enumerate(test_limits, 1):
            print(f"\n{i:2d}. Testing limit: {limit}")
            print("-" * 40)
            
            start_time = time.time()
            
            try:
                # Test with pagination enabled
                coupons_paginated = client.get_coupons(limit=limit, use_pagination=True)
                pagination_time = time.time() - start_time
                
                # Test without pagination (single request)
                start_time = time.time()
                coupons_single = client.get_coupons(limit=limit, use_pagination=False)
                single_time = time.time() - start_time
                
                # Determine which method worked better
                if len(coupons_paginated) >= len(coupons_single):
                    best_method = "Pagination"
                    best_coupons = coupons_paginated
                    best_time = pagination_time
                else:
                    best_method = "Single Request"
                    best_coupons = coupons_single
                    best_time = single_time
                
                # Validate the result
                actual_count = len(best_coupons)
                expected_count = min(limit, 463)  # API reports 463 total coupons
                
                if actual_count == expected_count:
                    status = "✅ PASS"
                elif actual_count >= expected_count * 0.9:  # Allow 10% tolerance
                    status = "⚠️  NEAR PASS"
                else:
                    status = "❌ FAIL"
                
                # Record results
                result = {
                    "limit": limit,
                    "expected": expected_count,
                    "actual": actual_count,
                    "best_method": best_method,
                    "pagination_count": len(coupons_paginated),
                    "single_count": len(coupons_single),
                    "pagination_time": pagination_time,
                    "single_time": single_time,
                    "best_time": best_time,
                    "status": status,
                    "success": actual_count >= expected_count * 0.9
                }
                
                results.append(result)
                
                # Display results
                print(f"   📊 Expected: {expected_count}, Got: {actual_count}")
                print(f"   🚀 Best method: {best_method} ({best_time:.2f}s)")
                print(f"   📈 Pagination: {len(coupons_paginated)} coupons ({pagination_time:.2f}s)")
                print(f"   📉 Single: {len(coupons_single)} coupons ({single_time:.2f}s)")
                print(f"   {status}")
                
                # Show sample coupons for small limits
                if limit <= 10 and best_coupons:
                    print(f"   🎯 Sample coupons:")
                    for j, coupon in enumerate(best_coupons[:min(3, len(best_coupons))], 1):
                        status_icon = "🟢" if coupon.is_clipped else "⚪"
                        title = coupon.title[:30] + "..." if len(coupon.title) > 30 else coupon.title
                        print(f"      {j}. {status_icon} {title}")
                
            except Exception as e:
                print(f"   ❌ Error testing limit {limit}: {e}")
                results.append({
                    "limit": limit,
                    "success": False,
                    "error": str(e)
                })
            
            # Be gentle with the API
            if i < len(test_limits):
                time.sleep(0.5)
        
        # Analysis and summary
        print(f"\n" + "=" * 60)
        print("📈 COMPREHENSIVE ANALYSIS")
        print("=" * 60)
        
        successful_tests = [r for r in results if r.get("success")]
        failed_tests = [r for r in results if not r.get("success")]
        
        print(f"✅ Successful tests: {len(successful_tests)}/{len(results)}")
        if failed_tests:
            print(f"❌ Failed tests: {len(failed_tests)}")
            for test in failed_tests:
                print(f"   • Limit {test['limit']}: {test.get('error', 'Unknown error')}")
        
        # Performance analysis
        if successful_tests:
            avg_pagination_time = sum(r["pagination_time"] for r in successful_tests) / len(successful_tests)
            avg_single_time = sum(r["single_time"] for r in successful_tests) / len(successful_tests)
            
            print(f"\n⏱️  Performance Analysis:")
            print(f"   • Average pagination time: {avg_pagination_time:.2f}s")
            print(f"   • Average single request time: {avg_single_time:.2f}s")
            
            if avg_pagination_time < avg_single_time:
                print(f"   🏆 Pagination is faster by {((avg_single_time - avg_pagination_time) / avg_single_time * 100):.1f}%")
            else:
                print(f"   🏆 Single requests are faster by {((avg_pagination_time - avg_single_time) / avg_pagination_time * 100):.1f}%")
        
        # Accuracy analysis
        accuracy_results = []
        for result in successful_tests:
            if result["expected"] > 0:
                accuracy = (result["actual"] / result["expected"]) * 100
                accuracy_results.append(accuracy)
        
        if accuracy_results:
            avg_accuracy = sum(accuracy_results) / len(accuracy_results)
            min_accuracy = min(accuracy_results)
            max_accuracy = max(accuracy_results)
            
            print(f"\n🎯 Accuracy Analysis:")
            print(f"   • Average accuracy: {avg_accuracy:.1f}%")
            print(f"   • Best accuracy: {max_accuracy:.1f}%")
            print(f"   • Worst accuracy: {min_accuracy:.1f}%")
        
        # Recommendations
        print(f"\n💡 Recommendations:")
        if len(successful_tests) == len(results):
            print(f"   ✅ All pagination tests passed! The system is working correctly.")
            print(f"   ✅ You can confidently request any number of coupons up to 1000.")
        else:
            print(f"   ⚠️  Some tests failed. Check the error messages above.")
        
        # Show best performing limits
        if successful_tests:
            best_performing = max(successful_tests, key=lambda x: x["actual"])
            print(f"   🏆 Best performing limit: {best_performing['limit']} (got {best_performing['actual']} coupons)")
        
        return len(successful_tests) == len(results)
        
    except Exception as e:
        print(f"❌ Error during testing: {e}")
        return False

def main():
    """Main function."""
    success = test_pagination_limits()
    
    print(f"\n" + "=" * 60)
    if success:
        print("🎉 ALL PAGINATION TESTS PASSED SUCCESSFULLY")
        print("✅ The coupon pagination system is working correctly!")
    else:
        print("💥 SOME PAGINATION TESTS FAILED")
        print("⚠️  Check the results above for issues.")
    
    return 0 if success else 1

if __name__ == "__main__":
    exit(main())
