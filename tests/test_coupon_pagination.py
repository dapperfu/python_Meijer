#!/usr/bin/env python3
"""
Test Coupon Pagination and High-Limit Fetching
==============================================

Tests the updated get_coupons method with:
1. High limit (1000 default) to get all ~473 available coupons
2. Pagination support for fetching all coupons in chunks
3. Performance comparison between pagination and single large request
4. Validation of coupon data consistency across pages
"""

import time
import logging
from typing import List, Dict, Any

from meijer import Meijer


class CouponPaginationTester:
    """Test coupon pagination and high-limit functionality."""

    def __init__(self):
        """Initialize the tester."""
        self.setup_logging()
        self.client = None
        self.results = {}

    def setup_logging(self):
        """Configure logging."""
        logging.basicConfig(
            level=logging.INFO,
            format="%(asctime)s - %(levelname)s - %(message)s"
        )
        self.logger = logging.getLogger(__name__)

    def initialize_client(self):
        """Initialize Meijer client."""
        try:
            print("🔧 INITIALIZING MEIJER CLIENT")
            print("=" * 50)
            
            self.client = Meijer()
            
            if self.client._ensure_authenticated():
                print("✅ Client initialized and authenticated")
                return True
            else:
                print("❌ Authentication failed")
                return False
                
        except Exception as e:
            print(f"❌ Failed to initialize client: {e}")
            return False

    def test_high_limit_single_request(self) -> Dict[str, Any]:
        """Test fetching all coupons with high limit in single request."""
        print("\n1️⃣  TESTING HIGH LIMIT (SINGLE REQUEST)")
        print("=" * 60)
        
        start_time = time.time()
        
        try:
            # Test with high limit, no pagination (single request)
            coupons = self.client.get_coupons(limit=1000, use_pagination=False)
            
            end_time = time.time()
            duration = end_time - start_time
            
            result = {
                "method": "Single Request",
                "limit": 1000,
                "coupons_fetched": len(coupons),
                "duration_seconds": duration,
                "success": True,
                "clipped_count": len([c for c in coupons if c.is_clipped]),
                "available_count": len([c for c in coupons if not c.is_clipped]),
                "unique_ids": len(set(c.meijer_offer_id for c in coupons))
            }
            
            print(f"✅ Single request completed:")
            print(f"   • Coupons fetched: {result['coupons_fetched']}")
            print(f"   • Duration: {duration:.2f} seconds")
            print(f"   • Clipped: {result['clipped_count']}")
            print(f"   • Available: {result['available_count']}")
            print(f"   • Unique IDs: {result['unique_ids']}")
            
            return result
            
        except Exception as e:
            print(f"❌ Single request failed: {e}")
            return {
                "method": "Single Request",
                "success": False,
                "error": str(e)
            }

    def test_pagination_approach(self) -> Dict[str, Any]:
        """Test fetching all coupons with pagination."""
        print("\n2️⃣  TESTING PAGINATION APPROACH")
        print("=" * 60)
        
        start_time = time.time()
        
        try:
            # Test with pagination enabled
            coupons = self.client.get_coupons(limit=1000, use_pagination=True)
            
            end_time = time.time()
            duration = end_time - start_time
            
            result = {
                "method": "Pagination",
                "limit": 1000,
                "coupons_fetched": len(coupons),
                "duration_seconds": duration,
                "success": True,
                "clipped_count": len([c for c in coupons if c.is_clipped]),
                "available_count": len([c for c in coupons if not c.is_clipped]),
                "unique_ids": len(set(c.meijer_offer_id for c in coupons))
            }
            
            print(f"✅ Pagination completed:")
            print(f"   • Coupons fetched: {result['coupons_fetched']}")
            print(f"   • Duration: {duration:.2f} seconds")
            print(f"   • Clipped: {result['clipped_count']}")
            print(f"   • Available: {result['available_count']}")
            print(f"   • Unique IDs: {result['unique_ids']}")
            
            return result
            
        except Exception as e:
            print(f"❌ Pagination failed: {e}")
            return {
                "method": "Pagination",
                "success": False,
                "error": str(e)
            }

    def test_different_limits(self) -> List[Dict[str, Any]]:
        """Test different limit values."""
        print("\n3️⃣  TESTING DIFFERENT LIMITS")
        print("=" * 60)
        
        test_limits = [50, 100, 200, 500, 1000]
        results = []
        
        for limit in test_limits:
            print(f"Testing limit: {limit}")
            
            start_time = time.time()
            
            try:
                coupons = self.client.get_coupons(limit=limit, use_pagination=False)
                
                end_time = time.time()
                duration = end_time - start_time
                
                result = {
                    "limit": limit,
                    "coupons_fetched": len(coupons),
                    "duration_seconds": duration,
                    "success": True
                }
                
                print(f"   ✅ Limit {limit}: {len(coupons)} coupons in {duration:.2f}s")
                results.append(result)
                
            except Exception as e:
                print(f"   ❌ Limit {limit}: Failed - {e}")
                results.append({
                    "limit": limit,
                    "success": False,
                    "error": str(e)
                })
            
            time.sleep(0.5)  # Be gentle with the API
        
        return results

    def test_coupon_quality(self, coupons: List) -> Dict[str, Any]:
        """Test the quality and completeness of fetched coupons."""
        print("\n4️⃣  TESTING COUPON DATA QUALITY")
        print("=" * 60)
        
        if not coupons:
            print("⚠️  No coupons to analyze")
            return {"success": False, "reason": "No coupons"}
        
        # Analyze coupon data quality
        total_coupons = len(coupons)
        valid_ids = len([c for c in coupons if c.meijer_offer_id > 0])
        has_title = len([c for c in coupons if c.title and c.title.strip()])
        has_description = len([c for c in coupons if c.description and c.description.strip()])
        has_amount = len([c for c in coupons if c.redeem_amount and c.redeem_amount > 0])
        has_dates = len([c for c in coupons if c.redemption_start_date or c.redemption_end_date])
        
        # Check for duplicates
        unique_ids = set(c.meijer_offer_id for c in coupons)
        duplicate_count = total_coupons - len(unique_ids)
        
        # Analyze value distribution
        amounts = [c.redeem_amount for c in coupons if c.redeem_amount and c.redeem_amount > 0]
        avg_amount = sum(amounts) / len(amounts) if amounts else 0
        max_amount = max(amounts) if amounts else 0
        min_amount = min(amounts) if amounts else 0
        
        result = {
            "total_coupons": total_coupons,
            "valid_ids": valid_ids,
            "has_title": has_title,
            "has_description": has_description,
            "has_amount": has_amount,
            "has_dates": has_dates,
            "duplicate_count": duplicate_count,
            "unique_ids": len(unique_ids),
            "avg_amount": avg_amount,
            "max_amount": max_amount,
            "min_amount": min_amount,
            "quality_score": (valid_ids + has_title + has_amount) / (total_coupons * 3) * 100 if total_coupons > 0 else 0
        }
        
        print(f"📊 Coupon Quality Analysis:")
        print(f"   • Total coupons: {total_coupons}")
        print(f"   • Valid IDs: {valid_ids}/{total_coupons} ({valid_ids/total_coupons*100:.1f}%)")
        print(f"   • Has title: {has_title}/{total_coupons} ({has_title/total_coupons*100:.1f}%)")
        print(f"   • Has description: {has_description}/{total_coupons} ({has_description/total_coupons*100:.1f}%)")
        print(f"   • Has amount: {has_amount}/{total_coupons} ({has_amount/total_coupons*100:.1f}%)")
        print(f"   • Has dates: {has_dates}/{total_coupons} ({has_dates/total_coupons*100:.1f}%)")
        print(f"   • Duplicates: {duplicate_count}")
        print(f"   • Unique IDs: {len(unique_ids)}")
        print(f"   • Amount range: ${min_amount:.2f} - ${max_amount:.2f} (avg: ${avg_amount:.2f})")
        print(f"   • Quality score: {result['quality_score']:.1f}%")
        
        return result

    def show_sample_coupons(self, coupons: List, count: int = 10):
        """Show sample coupons from the fetched data."""
        print(f"\n5️⃣  SAMPLE COUPONS (showing {min(count, len(coupons))})")
        print("=" * 60)
        
        for i, coupon in enumerate(coupons[:count], 1):
            status = "🟢 CLIPPED" if coupon.is_clipped else "⚪ AVAILABLE"
            title = coupon.title[:40] + "..." if len(coupon.title) > 40 else coupon.title
            amount = f"${coupon.redeem_amount:.2f}" if coupon.redeem_amount else "No amount"
            
            print(f"{i:2d}. {status} - {title}")
            print(f"     ID: {coupon.meijer_offer_id}, Amount: {amount}")
            if coupon.description:
                desc = coupon.description[:60] + "..." if len(coupon.description) > 60 else coupon.description
                print(f"     Desc: {desc}")

    def run_comprehensive_test(self):
        """Run comprehensive pagination and limit testing."""
        print("🚀 COMPREHENSIVE COUPON PAGINATION TEST")
        print("=" * 65)
        print("Testing high limits, pagination, and data quality")
        print()
        
        if not self.initialize_client():
            return False
        
        # Test 1: High limit single request
        single_result = self.test_high_limit_single_request()
        
        # Test 2: Pagination approach
        pagination_result = self.test_pagination_approach()
        
        # Test 3: Different limits
        limit_results = self.test_different_limits()
        
        # Get coupons for quality testing (use best result)
        test_coupons = []
        if single_result.get("success") and single_result.get("coupons_fetched", 0) > 0:
            test_coupons = self.client.get_coupons(limit=1000, use_pagination=False)
        elif pagination_result.get("success") and pagination_result.get("coupons_fetched", 0) > 0:
            test_coupons = self.client.get_coupons(limit=1000, use_pagination=True)
        
        # Test 4: Data quality
        quality_result = self.test_coupon_quality(test_coupons)
        
        # Test 5: Show samples
        if test_coupons:
            self.show_sample_coupons(test_coupons)
        
        # Final summary
        print(f"\n" + "=" * 65)
        print("📊 COMPREHENSIVE TEST SUMMARY")
        print("=" * 65)
        
        print(f"🔍 Method Comparison:")
        if single_result.get("success"):
            print(f"   • Single Request: {single_result['coupons_fetched']} coupons in {single_result['duration_seconds']:.2f}s")
        if pagination_result.get("success"):
            print(f"   • Pagination: {pagination_result['coupons_fetched']} coupons in {pagination_result['duration_seconds']:.2f}s")
        
        successful_limits = [r for r in limit_results if r.get("success")]
        if successful_limits:
            max_fetched = max(r["coupons_fetched"] for r in successful_limits)
            print(f"   • Maximum coupons fetched: {max_fetched}")
        
        if quality_result.get("quality_score"):
            print(f"   • Data quality score: {quality_result['quality_score']:.1f}%")
        
        # Recommendation
        best_count = 0
        if single_result.get("success"):
            best_count = max(best_count, single_result["coupons_fetched"])
        if pagination_result.get("success"):
            best_count = max(best_count, pagination_result["coupons_fetched"])
        
        print(f"\n💡 Recommendation:")
        if best_count >= 400:
            print(f"   ✅ High-limit fetching working! Getting {best_count} coupons successfully.")
            print(f"   ✅ Use get_coupons(limit=1000) to fetch all ~473 available coupons.")
        else:
            print(f"   ⚠️  Only getting {best_count} coupons. May need pagination improvements.")
        
        return True


def main():
    """Main function to run the pagination test."""
    tester = CouponPaginationTester()
    success = tester.run_comprehensive_test()
    return 0 if success else 1


if __name__ == "__main__":
    exit(main()) 