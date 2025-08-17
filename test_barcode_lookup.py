#!/usr/bin/env python3
"""
Test Barcode Price Lookup Functionality
=======================================

Tests the new Shop & Scan based barcode price lookup feature.
This functionality allows looking up any barcode to get real-time pricing
without requiring an active Shop & Scan session.
"""

import logging
from typing import List, Dict, Any, Optional

from meijer import Meijer


class BarcodeLookupTester:
    """Test the barcode price lookup functionality."""

    def __init__(self):
        """Initialize the tester."""
        self.setup_logging()
        self.client = None

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

    def test_single_barcode_lookup(self) -> Dict[str, Any]:
        """Test looking up a single barcode."""
        print("\n1️⃣  TESTING SINGLE BARCODE LOOKUP")
        print("=" * 60)
        
        # Test with a common product barcode (Coca-Cola 12oz can)
        test_barcode = "049000050103"  # Coca-Cola Classic 12oz
        
        try:
            print(f"Looking up barcode: {test_barcode}")
            product = self.client.lookup_barcode_price(test_barcode)
            
            if product:
                print("✅ Barcode lookup successful!")
                print(f"   • Product: {product.get('title', 'Unknown')}")
                print(f"   • ID: {product.get('id', 'N/A')}")
                print(f"   • Price: ${product.get('unitPrice', 0):.2f}")
                print(f"   • Weighted: {'Yes' if product.get('isWeighted') else 'No'}")
                print(f"   • Image: {product.get('imageUrl', 'N/A')}")
                
                return {
                    "success": True,
                    "barcode": test_barcode,
                    "product": product
                }
            else:
                print("⚠️  Barcode not found in system")
                return {
                    "success": False,
                    "barcode": test_barcode,
                    "reason": "Not found"
                }
                
        except Exception as e:
            print(f"❌ Barcode lookup failed: {e}")
            return {
                "success": False,
                "barcode": test_barcode,
                "error": str(e)
            }

    def test_multiple_barcode_lookup(self) -> Dict[str, Any]:
        """Test looking up multiple barcodes."""
        print("\n2️⃣  TESTING MULTIPLE BARCODE LOOKUP")
        print("=" * 60)
        
        # Test with various common product barcodes
        test_barcodes = [
            "049000050103",  # Coca-Cola Classic 12oz
            "012000161155",  # Pepsi Cola 12oz
            "038000845505",  # Tide Laundry Detergent
            "041220576531",  # Kraft Mac & Cheese
            "028400010047",  # Lay's Classic Potato Chips
            "011111111111",  # Invalid/test barcode
        ]
        
        try:
            print(f"Looking up {len(test_barcodes)} barcodes...")
            results = self.client.bulk_lookup_barcodes(test_barcodes)
            
            found_count = 0
            total_count = len(test_barcodes)
            
            print("\n📊 Results:")
            for barcode, product in results.items():
                if product:
                    found_count += 1
                    title = product.get('title', 'Unknown Product')[:40]
                    price = product.get('unitPrice', 0)
                    print(f"   ✅ {barcode}: {title} - ${price:.2f}")
                else:
                    print(f"   ❌ {barcode}: Not found")
            
            print(f"\n📈 Summary: {found_count}/{total_count} products found ({found_count/total_count*100:.1f}%)")
            
            return {
                "success": True,
                "total_count": total_count,
                "found_count": found_count,
                "success_rate": found_count/total_count*100,
                "results": results
            }
            
        except Exception as e:
            print(f"❌ Multiple barcode lookup failed: {e}")
            return {
                "success": False,
                "error": str(e)
            }

    def test_weighted_item_lookup(self) -> Dict[str, Any]:
        """Test looking up weighted items (produce, deli, etc.)."""
        print("\n3️⃣  TESTING WEIGHTED ITEM LOOKUP")
        print("=" * 60)
        
        # Common weighted item barcodes (produce PLU codes)
        weighted_barcodes = [
            "4011",  # Bananas
            "4064",  # Fuji Apples  
            "4065",  # Green Grapes
            "3283",  # Ground Beef 80/20
        ]
        
        try:
            weighted_results = {}
            
            for barcode in weighted_barcodes:
                print(f"Looking up weighted item: {barcode}")
                product = self.client.lookup_barcode_price(barcode)
                
                if product:
                    title = product.get('title', 'Unknown')
                    price = product.get('unitPrice', 0)
                    is_weighted = product.get('isWeighted', False)
                    price_unit = " per lb" if is_weighted else ""
                    
                    print(f"   ✅ {title}: ${price:.2f}{price_unit} {'(Weighted)' if is_weighted else ''}")
                    weighted_results[barcode] = product
                else:
                    print(f"   ❌ {barcode}: Not found")
                    weighted_results[barcode] = None
            
            found_weighted = sum(1 for p in weighted_results.values() if p and p.get('isWeighted'))
            total_weighted = len(weighted_barcodes)
            
            print(f"\n🏋️  Weighted Items: {found_weighted}/{total_weighted} found")
            
            return {
                "success": True,
                "weighted_count": found_weighted,
                "total_count": total_weighted,
                "results": weighted_results
            }
            
        except Exception as e:
            print(f"❌ Weighted item lookup failed: {e}")
            return {
                "success": False,
                "error": str(e)
            }

    def test_store_specific_pricing(self) -> Dict[str, Any]:
        """Test store-specific pricing if available."""
        print("\n4️⃣  TESTING STORE-SPECIFIC PRICING")
        print("=" * 60)
        
        test_barcode = "049000050103"  # Coca-Cola Classic 12oz
        
        try:
            # Test without store ID
            print("Looking up price without store context...")
            product_no_store = self.client.lookup_barcode_price(test_barcode)
            
            # Test with store ID (if we can get one)
            print("Looking up price with store context...")
            product_with_store = self.client.lookup_barcode_price(test_barcode, store_id="771")
            
            results = {
                "no_store": product_no_store,
                "with_store": product_with_store
            }
            
            # Compare prices
            if product_no_store and product_with_store:
                price_no_store = product_no_store.get('unitPrice', 0)
                price_with_store = product_with_store.get('unitPrice', 0)
                
                print(f"   • Price without store: ${price_no_store:.2f}")
                print(f"   • Price with store 771: ${price_with_store:.2f}")
                
                if price_no_store != price_with_store:
                    print("   🔄 Store-specific pricing detected!")
                else:
                    print("   📍 Same price across stores")
            
            return {
                "success": True,
                "results": results
            }
            
        except Exception as e:
            print(f"❌ Store-specific pricing test failed: {e}")
            return {
                "success": False,
                "error": str(e)
            }

    def show_api_response_analysis(self, sample_product: Optional[Dict[str, Any]]):
        """Analyze and show the API response structure."""
        print("\n5️⃣  API RESPONSE ANALYSIS")
        print("=" * 60)
        
        if not sample_product:
            print("⚠️  No sample product available for analysis")
            return
        
        print("📋 Response Structure Analysis:")
        print(f"   • Response type: {type(sample_product)}")
        print(f"   • Field count: {len(sample_product)}")
        
        print("\n🔍 Available Fields:")
        for key, value in sample_product.items():
            if key == "raw_response":
                continue  # Skip the raw response to avoid clutter
            value_type = type(value).__name__
            value_str = str(value)[:50] + "..." if len(str(value)) > 50 else str(value)
            print(f"   • {key}: {value_str} ({value_type})")
        
        # Show raw API response if available
        if "raw_response" in sample_product:
            raw = sample_product["raw_response"]
            print(f"\n🔬 Raw API Response Fields:")
            for key in sorted(raw.keys()):
                print(f"   • {key}")

    def run_comprehensive_test(self):
        """Run comprehensive barcode lookup testing."""
        print("🏪 COMPREHENSIVE BARCODE PRICE LOOKUP TEST")
        print("=" * 70)
        print("Testing Shop & Scan API for barcode price lookups")
        print()
        
        if not self.initialize_client():
            return False
        
        # Test 1: Single barcode lookup
        single_result = self.test_single_barcode_lookup()
        
        # Test 2: Multiple barcode lookup
        multiple_result = self.test_multiple_barcode_lookup()
        
        # Test 3: Weighted items
        weighted_result = self.test_weighted_item_lookup()
        
        # Test 4: Store-specific pricing
        store_result = self.test_store_specific_pricing()
        
        # Test 5: API analysis
        sample_product = None
        if single_result.get("success") and single_result.get("product"):
            sample_product = single_result["product"]
        elif multiple_result.get("success") and multiple_result.get("results"):
            for product in multiple_result["results"].values():
                if product:
                    sample_product = product
                    break
        
        self.show_api_response_analysis(sample_product)
        
        # Final summary
        print(f"\n" + "=" * 70)
        print("📊 COMPREHENSIVE TEST SUMMARY")
        print("=" * 70)
        
        tests_passed = 0
        total_tests = 4
        
        if single_result.get("success"):
            print("   ✅ Single barcode lookup: WORKING")
            tests_passed += 1
        else:
            print("   ❌ Single barcode lookup: FAILED")
        
        if multiple_result.get("success"):
            success_rate = multiple_result.get("success_rate", 0)
            print(f"   ✅ Multiple barcode lookup: {success_rate:.1f}% success rate")
            tests_passed += 1
        else:
            print("   ❌ Multiple barcode lookup: FAILED")
        
        if weighted_result.get("success"):
            weighted_count = weighted_result.get("weighted_count", 0)
            print(f"   ✅ Weighted items: {weighted_count} found")
            tests_passed += 1
        else:
            print("   ❌ Weighted items: FAILED")
        
        if store_result.get("success"):
            print("   ✅ Store-specific pricing: TESTED")
            tests_passed += 1
        else:
            print("   ❌ Store-specific pricing: FAILED")
        
        print(f"\n🏆 Overall Success: {tests_passed}/{total_tests} tests passed")
        
        if sample_product:
            print("\n💡 Usage Example:")
            print(f'   client = Meijer()')
            print(f'   product = client.lookup_barcode_price("049000050103")')
            print(f'   print(f"{{product[\'title\']}}: ${{product[\'unitPrice\']:.2f}}")')
        
        return tests_passed == total_tests


def main():
    """Main function to run the barcode lookup test."""
    tester = BarcodeLookupTester()
    success = tester.run_comprehensive_test()
    return 0 if success else 1


if __name__ == "__main__":
    exit(main()) 