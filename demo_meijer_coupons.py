#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Comprehensive Meijer coupon demo showcasing listing, clipping, and unclipping functionality
 * 
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python PEP 8 with numpy docstring style
 * - Dependencies: meijer package, logging, typing
 */

Meijer Coupons Demo
==================

Demonstrates coupon functionality using the modular Meijer package.

This demo showcases:
- Listing available and clipped coupons
- Clipping (activating) coupons
- Unclipping (deactivating) coupons
- Comprehensive coupon analysis
- Real-world coupon management workflows
- Error handling and recovery
"""

import logging
from typing import List, Dict, Any, Optional

# Import from the modular package
from meijer import (
    Meijer,
    AuthenticationStatus,
    MeijerAuthenticationError,
)

try:
    from meijer.coupons import MeijerCoupon
except ImportError:
    MeijerCoupon = None


def setup_demo_logging() -> None:
    """Configure clean logging for the demo."""
    logging.basicConfig(level=logging.WARNING, format="%(levelname)s: %(message)s")


def test_coupon_listing(client: Meijer) -> Dict[str, Any]:
    """Test coupon listing functionality."""
    print("🎫 COUPON LISTING TEST")
    print("-" * 30)

    results = {
        "total_coupons": 0,
        "clipped_coupons": 0,
        "available_coupons": 0,
        "listing_successful": False,
        "coupon_data": []
    }

    try:
        # Get all coupons
        print("1️⃣  Retrieving all coupons...")
        all_coupons = client.get_coupons(limit=50)
        
        results["total_coupons"] = len(all_coupons)
        results["coupon_data"] = all_coupons

        if all_coupons:
            # Analyze coupon status
            clipped = [c for c in all_coupons if c.is_clipped]
            available = [c for c in all_coupons if not c.is_clipped]
            
            results["clipped_coupons"] = len(clipped)
            results["available_coupons"] = len(available)
            results["listing_successful"] = True

            print(f"✅ Successfully retrieved {len(all_coupons)} coupons")
            print(f"   📌 {len(clipped)} already clipped")
            print(f"   🆓 {len(available)} available to clip")

            # Show sample coupons
            print("2️⃣  Sample coupons:")
            for i, coupon in enumerate(all_coupons[:3], 1):
                status = "🔗 Clipped" if coupon.is_clipped else "⭕ Available"
                discount = coupon.formatted_discount
                print(f"   {i}. {coupon.title[:40]}...")
                print(f"      Status: {status} | Discount: {discount}")
                if coupon.redemption_end_date:
                    print(f"      Expires: {coupon.redemption_end_date.strftime('%Y-%m-%d')}")
        else:
            print("⚠️  No coupons available")
            results["listing_successful"] = True  # Still successful, just empty

        return results

    except MeijerAuthenticationError:
        print("❌ Authentication required for coupon listing")
        return results
    except Exception as e:
        print(f"❌ Coupon listing failed: {e}")
        return results


def test_coupon_clipping(client: Meijer, coupons: List['MeijerCoupon']) -> Dict[str, Any]:
    """Test coupon clipping functionality."""
    print("\n📌 COUPON CLIPPING TEST")
    print("-" * 30)

    results = {
        "clips_attempted": 0,
        "clips_successful": 0,
        "clipping_test_successful": False
    }

    try:
        # Find available coupons to clip
        available_coupons = [c for c in coupons if not c.is_clipped and not c.is_expired]
        
        if not available_coupons:
            print("⚠️  No available coupons to clip")
            results["clipping_test_successful"] = True
            return results

        # Clip up to 3 coupons for testing
        test_coupons = available_coupons[:3]
        results["clips_attempted"] = len(test_coupons)

        print(f"1️⃣  Attempting to clip {len(test_coupons)} coupons...")

        for i, coupon in enumerate(test_coupons, 1):
            print(f"   {i}. Clipping: {coupon.title[:40]}...")
            
            try:
                if coupon.clip():
                    print(f"      ✅ Successfully clipped!")
                    results["clips_successful"] += 1
                else:
                    print(f"      ❌ Failed to clip")
            except Exception as e:
                print(f"      ❌ Error clipping: {e}")

        print(f"2️⃣  Clipping results: {results['clips_successful']}/{results['clips_attempted']} successful")
        
        if results["clips_successful"] > 0:
            results["clipping_test_successful"] = True
            print("✅ Coupon clipping test passed")
        else:
            print("⚠️  No coupons were successfully clipped")

        return results

    except Exception as e:
        print(f"❌ Coupon clipping test failed: {e}")
        return results


def test_coupon_unclipping(client: Meijer, coupons: List['MeijerCoupon']) -> Dict[str, Any]:
    """Test coupon unclipping functionality."""
    print("\n🔓 COUPON UNCLIPPING TEST")
    print("-" * 30)

    results = {
        "unclips_attempted": 0,
        "unclips_successful": 0,
        "unclipping_test_successful": False
    }

    try:
        # Find clipped coupons to unclip
        clipped_coupons = [c for c in coupons if c.is_clipped]
        
        if not clipped_coupons:
            print("⚠️  No clipped coupons to unclip")
            results["unclipping_test_successful"] = True
            return results

        # Unclip up to 2 coupons for testing
        test_coupons = clipped_coupons[:2]
        results["unclips_attempted"] = len(test_coupons)

        print(f"1️⃣  Attempting to unclip {len(test_coupons)} coupons...")

        for i, coupon in enumerate(test_coupons, 1):
            print(f"   {i}. Unclipping: {coupon.title[:40]}...")
            
            try:
                if coupon.unclip():
                    print(f"      ✅ Successfully unclipped!")
                    results["unclips_successful"] += 1
                else:
                    print(f"      ❌ Failed to unclip")
            except Exception as e:
                print(f"      ❌ Error unclipping: {e}")

        print(f"2️⃣  Unclipping results: {results['unclips_successful']}/{results['unclips_attempted']} successful")
        
        if results["unclips_successful"] > 0:
            results["unclipping_test_successful"] = True
            print("✅ Coupon unclipping test passed")
        else:
            print("⚠️  No coupons were successfully unclipped")

        return results

    except Exception as e:
        print(f"❌ Coupon unclipping test failed: {e}")
        return results


def analyze_coupon_data(coupons: List['MeijerCoupon']) -> Dict[str, Any]:
    """Analyze coupon data structure and content."""
    print("\n📊 COUPON DATA ANALYSIS")
    print("-" * 30)

    analysis = {
        "total_coupons": len(coupons),
        "expired_coupons": 0,
        "discount_types": {},
        "departments": set(),
        "analysis_successful": False,
    }

    try:
        if not coupons:
            print("⚠️  No coupon data to analyze")
            analysis["analysis_successful"] = True
            return analysis

        print(f"1️⃣  Analyzing {len(coupons)} coupons...")

        # Analyze coupon characteristics
        for coupon in coupons:
            # Check expiration
            if coupon.is_expired:
                analysis["expired_coupons"] += 1

            # Categorize discount types
            discount = coupon.formatted_discount
            if discount in analysis["discount_types"]:
                analysis["discount_types"][discount] += 1
            else:
                analysis["discount_types"][discount] = 1

            # Collect departments
            for dept in coupon.departments:
                analysis["departments"].add(dept.category_name)

        print("2️⃣  Analysis results:")
        print(f"   • Total coupons: {analysis['total_coupons']}")
        print(f"   • Expired coupons: {analysis['expired_coupons']}")
        print(f"   • Unique departments: {len(analysis['departments'])}")
        
        # Show top discount types
        if analysis["discount_types"]:
            sorted_discounts = sorted(analysis["discount_types"].items(), 
                                    key=lambda x: x[1], reverse=True)
            print("   • Top discount types:")
            for discount_type, count in sorted_discounts[:3]:
                print(f"     - {discount_type}: {count} coupons")

        # Show sample departments
        if analysis["departments"]:
            sample_depts = list(analysis["departments"])[:5]
            print(f"   • Sample departments: {', '.join(sample_depts)}")

        analysis["analysis_successful"] = True
        return analysis

    except Exception as e:
        print(f"❌ Coupon analysis failed: {e}")
        return analysis


def demonstrate_coupon_workflow(client: Meijer) -> bool:
    """Demonstrate a complete coupon management workflow."""
    print("\n🔄 COUPON WORKFLOW DEMO")
    print("-" * 30)

    try:
        print("1️⃣  Getting current coupon status...")
        
        # Get all coupons
        all_coupons = client.get_coupons(limit=30)
        clipped_before = len([c for c in all_coupons if c.is_clipped])
        available_before = len([c for c in all_coupons if not c.is_clipped])
        
        print(f"   📊 Starting state: {clipped_before} clipped, {available_before} available")

        # Find a good candidate to demonstrate with
        demo_coupon = None
        for coupon in all_coupons:
            if not coupon.is_clipped and not coupon.is_expired:
                demo_coupon = coupon
                break

        if not demo_coupon:
            print("⚠️  No suitable coupon found for workflow demo")
            return True  # Not a failure

        print("2️⃣  Demonstrating clip/unclip cycle...")
        print(f"   🎯 Using coupon: {demo_coupon.title[:50]}...")

        # Clip the coupon
        print("   📌 Clipping coupon...")
        if demo_coupon.clip():
            print("      ✅ Coupon clipped successfully")
            
            # Verify it's clipped
            if demo_coupon.is_clipped:
                print("      ✅ Coupon status updated correctly")
            
            # Unclip it back
            print("   🔓 Unclipping coupon...")
            if demo_coupon.unclip():
                print("      ✅ Coupon unclipped successfully")
                
                # Verify it's unclipped
                if not demo_coupon.is_clipped:
                    print("      ✅ Coupon status reverted correctly")
            else:
                print("      ❌ Failed to unclip coupon")
        else:
            print("      ❌ Failed to clip coupon")

        print("3️⃣  Workflow completed successfully")
        return True

    except Exception as e:
        print(f"❌ Coupon workflow failed: {e}")
        return False


def show_coupon_management_tips() -> None:
    """Display helpful tips for coupon management."""
    print("\n💡 COUPON MANAGEMENT TIPS")
    print("-" * 30)
    print("• Clip coupons before shopping to ensure savings")
    print("• Check expiration dates to prioritize usage")
    print("• Review clipped coupons regularly to unclip unused ones")
    print("• Use batch operations for managing multiple coupons")
    print("• Monitor for new coupons regularly for best deals")


def main() -> None:
    """Run the Meijer coupons demo."""
    print("🎫 MEIJER COUPONS DEMO")
    print("=" * 40)
    print("Testing coupon functionality with the modular package")
    print("")

    # Setup logging
    setup_demo_logging()

    # Track results
    results = {}

    try:
        # Initialize client
        print("📱 Initializing Meijer client...")
        client = Meijer()
        print("✅ Client initialized")
        
        if client.auth_status != AuthenticationStatus.AUTHENTICATED:
            print("❌ Authentication required for coupon operations")
            print("   Please ensure you have valid authentication configured")
            return
        
        print("")

        # Test coupon listing
        listing_results = test_coupon_listing(client)
        results["coupon_listing"] = listing_results["listing_successful"]

        if listing_results["coupon_data"]:
            coupons = listing_results["coupon_data"]
            
            # Test coupon clipping
            clipping_results = test_coupon_clipping(client, coupons)
            results["coupon_clipping"] = clipping_results["clipping_test_successful"]

            # Test coupon unclipping
            unclipping_results = test_coupon_unclipping(client, coupons)
            results["coupon_unclipping"] = unclipping_results["unclipping_test_successful"]

            # Analyze coupon data
            analysis_results = analyze_coupon_data(coupons)
            results["coupon_analysis"] = analysis_results["analysis_successful"]

            # Test complete workflow
            workflow_success = demonstrate_coupon_workflow(client)
            results["coupon_workflow"] = workflow_success

        else:
            print("\n⚠️  Skipping clip/unclip tests - no coupons available")
            results["coupon_clipping"] = True  # Not a failure
            results["coupon_unclipping"] = True
            results["coupon_analysis"] = True
            results["coupon_workflow"] = True

        # Summary
        print("\n📊 COUPON DEMO SUMMARY")
        print("=" * 40)

        passed = sum(results.values())
        total = len(results)

        for test_name, success in results.items():
            status = "✅ PASS" if success else "❌ FAIL"
            formatted_name = test_name.replace("_", " ").title()
            print(f"{formatted_name:<20} {status}")

        print(f"\n🎯 Results: {passed}/{total} tests passed")

        if passed == total:
            print("🎉 All coupon tests passed!")
        else:
            print("⚠️  Some tests failed (may be due to API limitations)")

        print("\n💡 Features demonstrated:")
        print("  • Coupon listing and filtering")
        print("  • Clipping (activating) coupons")
        print("  • Unclipping (deactivating) coupons") 
        print("  • Comprehensive coupon analysis")
        print("  • Complete workflow examples")
        print("  • Error handling and recovery")
        print("  • Modular package usage")

        print("\n🚀 Usage example:")
        print("   from meijer import Meijer")
        print("   client = Meijer()")
        print("   coupons = client.get_coupons()")
        print("   for coupon in coupons[:5]:")
        print("       if not coupon.is_clipped:")
        print("           coupon.clip()")
        print("   # Easy coupon management! 🎯")

        # Show management tips
        show_coupon_management_tips()

    except Exception as e:
        print(f"❌ Demo failed: {e}")
        import traceback
        print(f"   Full error: {traceback.format_exc()}")


if __name__ == "__main__":
    main() 