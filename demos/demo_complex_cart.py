#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Comprehensive demo for the new complex cart module showcasing advanced features
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package, datetime, typing
 */

Comprehensive Complex Cart Demo

This demo showcases the advanced cart operations and edge case handling system,
including cart validation, optimization, splitting, merging, and complex operations.
"""

import asyncio

from meijer import ComplexCartManager
from meijer.complex_cart import CartValidationStatus


class ComplexCartDemo:
    """Demo class for showcasing complex cart functionality."""

    def __init__(self):
        """Initialize the complex cart demo."""
        self.complex_cart_manager = None
        self.demo_customer_id = "demo_customer_123"
        self.demo_store_id = "demo_store_456"
        self.demo_cart_id = "demo_cart_789"

    async def setup_complex_cart_manager(self, client):
        """Setup the complex cart manager with a client."""
        self.complex_cart_manager = ComplexCartManager(client)
        print("✅ Complex cart manager initialized")

    async def demo_cart_validation(self):
        """Demo comprehensive cart validation."""
        print("\n" + "=" * 60)
        print("🔍 CART VALIDATION DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Comprehensive cart validation
            print("\n🔍 Running comprehensive cart validation...")
            validation_issues = self.complex_cart_manager.validate_cart(
                cart_id=self.demo_cart_id,
                store_id=self.demo_store_id,
                include_price_validation=True,
                include_availability_check=True,
                include_restriction_check=True,
            )

            if validation_issues:
                print(f"✅ Found {len(validation_issues)} validation issues:")

                # Group issues by severity
                critical_issues = [
                    issue
                    for issue in validation_issues
                    if issue.severity == CartValidationStatus.CRITICAL
                ]
                error_issues = [
                    issue
                    for issue in validation_issues
                    if issue.severity == CartValidationStatus.ERROR
                ]
                warning_issues = [
                    issue
                    for issue in validation_issues
                    if issue.severity == CartValidationStatus.WARNING
                ]

                if critical_issues:
                    print(f"\n🚨 CRITICAL ISSUES ({len(critical_issues)}):")
                    for issue in critical_issues[:2]:
                        print(f"   • {issue.issue_type}: {issue.message}")
                        print(f"     Affected items: {len(issue.affected_items)}")
                        print(f"     Auto-resolvable: {issue.can_auto_resolve}")

                if error_issues:
                    print(f"\n❌ ERRORS ({len(error_issues)}):")
                    for issue in error_issues[:2]:
                        print(f"   • {issue.issue_type}: {issue.message}")
                        print(f"     Affected items: {len(issue.affected_items)}")

                if warning_issues:
                    print(f"\n⚠️  WARNINGS ({len(warning_issues)}):")
                    for issue in warning_issues[:2]:
                        print(f"   • {issue.issue_type}: {issue.message}")
                        print(f"     Affected items: {len(issue.affected_items)}")

                # Show suggested fixes
                if validation_issues:
                    print("\n💡 SUGGESTED FIXES:")
                    for issue in validation_issues[:3]:
                        if issue.suggested_fixes:
                            print(f"   • {issue.issue_type}:")
                            for fix in issue.suggested_fixes[:2]:
                                print(f"     - {fix}")
            else:
                print("✅ Cart validation passed - no issues found!")

        except Exception as e:
            print(f"❌ Error in cart validation demo: {str(e)}")

    async def demo_cart_optimization(self):
        """Demo cart optimization functionality."""
        print("\n" + "=" * 60)
        print("🎯 CART OPTIMIZATION DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Cart optimization with multiple strategies
            print("\n🔧 Running cart optimization...")
            optimization_strategies = [
                "price",
                "availability",
                "substitutions",
                "bundling",
            ]

            optimization_result = self.complex_cart_manager.optimize_cart(
                cart_id=self.demo_cart_id,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
                optimization_strategies=optimization_strategies,
            )

            if optimization_result:
                print("✅ Cart optimization completed successfully!")
                print(f"   Original total: ${optimization_result.original_total:.2f}")
                print(f"   Optimized total: ${optimization_result.optimized_total:.2f}")
                print(f"   Savings amount: ${optimization_result.savings_amount:.2f}")
                print(
                    f"   Savings percentage: {optimization_result.savings_percentage:.1f}%"
                )
                print(
                    f"   Optimization score: {optimization_result.optimization_score:.2f}"
                )

                if optimization_result.applied_optimizations:
                    print(
                        f"\n🔧 Applied optimizations ({len(optimization_result.applied_optimizations)}):"
                    )
                    for opt in optimization_result.applied_optimizations[:3]:
                        print(
                            f"   • {opt.get('type', 'Unknown')}: {opt.get('description', 'No description')}"
                        )
                        print(f"     Impact: ${opt.get('impact', 0):.2f}")

                if optimization_result.recommendations:
                    print(
                        f"\n💡 Optimization recommendations ({len(optimization_result.recommendations)}):"
                    )
                    for rec in optimization_result.recommendations[:3]:
                        print(f"   • {rec}")
            else:
                print("ℹ️  No optimization opportunities found")

        except Exception as e:
            print(f"❌ Error in cart optimization demo: {str(e)}")

    async def demo_cart_splitting(self):
        """Demo cart splitting functionality."""
        print("\n" + "=" * 60)
        print("✂️  CART SPLITTING DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Cart splitting with different criteria
            print("\n✂️  Splitting cart by category...")
            split_criteria = {
                "type": "category_based",
                "categories": ["groceries", "electronics", "clothing"],
                "delivery_methods": ["pickup", "delivery"],
                "urgency": ["immediate", "planned"],
            }

            split_result = self.complex_cart_manager.split_cart(
                cart_id=self.demo_cart_id,
                split_criteria=split_criteria,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
            )

            if split_result:
                print("✅ Cart splitting completed successfully!")
                print(f"   Original cart: {split_result.original_cart_id}")
                print(f"   Split carts created: {len(split_result.split_carts)}")
                print(f"   Total items across splits: {split_result.total_items}")

                print("\n📋 Split criteria used:")
                for key, value in split_result.split_criteria.items():
                    print(f"   • {key}: {value}")

                if split_result.split_carts:
                    print("\n🛒 Resulting split carts:")
                    for i, split_cart in enumerate(split_result.split_carts[:3]):
                        print(
                            f"   {i + 1}. Cart ID: {split_cart.get('cartId', 'Unknown')}"
                        )
                        print(f"      Items: {split_cart.get('itemCount', 0)}")
                        print(
                            f"      Category: {split_cart.get('category', 'Unknown')}"
                        )
                        print(
                            f"      Delivery: {split_cart.get('deliveryMethod', 'Unknown')}"
                        )
            else:
                print("ℹ️  Cart splitting not available or failed")

        except Exception as e:
            print(f"❌ Error in cart splitting demo: {str(e)}")

    async def demo_cart_merging(self):
        """Demo cart merging functionality."""
        print("\n" + "=" * 60)
        print("🔗 CART MERGING DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Cart merging with different strategies
            print("\n🔗 Merging multiple carts...")
            source_cart_ids = ["cart_001", "cart_002", "cart_003"]
            target_cart_id = "merged_cart_001"

            merge_result = self.complex_cart_manager.merge_carts(
                source_cart_ids=source_cart_ids,
                target_cart_id=target_cart_id,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
                merge_strategy="smart",
            )

            if merge_result:
                print("✅ Cart merging completed successfully!")
                print(f"   Source carts: {len(source_cart_ids)}")
                print(f"   Target cart: {target_cart_id}")
                print("   Merge strategy: smart")

                if "mergedItems" in merge_result:
                    print(f"   Items merged: {merge_result['mergedItems']}")
                if "conflicts" in merge_result:
                    print(f"   Conflicts resolved: {len(merge_result['conflicts'])}")
                if "totalValue" in merge_result:
                    print(f"   Total value: ${merge_result['totalValue']:.2f}")
            else:
                print("ℹ️  Cart merging not available or failed")

        except Exception as e:
            print(f"❌ Error in cart merging demo: {str(e)}")

    async def demo_complex_coupon_operations(self):
        """Demo complex coupon operations."""
        print("\n" + "=" * 60)
        print("🎫 COMPLEX COUPON OPERATIONS DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Apply complex coupon with auto-optimization
            print("\n🎫 Applying complex coupon...")
            coupon_code = "SAVE20NOW"

            coupon_result = self.complex_cart_manager.apply_complex_coupon(
                cart_id=self.demo_cart_id,
                coupon_code=coupon_code,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
                auto_optimize=True,
            )

            if coupon_result:
                print("✅ Complex coupon applied successfully!")
                print(f"   Coupon code: {coupon_code}")
                print("   Auto-optimization: enabled")

                if "discountAmount" in coupon_result:
                    print(f"   Discount amount: ${coupon_result['discountAmount']:.2f}")
                if "appliedRules" in coupon_result:
                    print(f"   Applied rules: {len(coupon_result['appliedRules'])}")
                if "cartTotal" in coupon_result:
                    print(f"   New cart total: ${coupon_result['cartTotal']:.2f}")
            else:
                print("ℹ️  Coupon application not available or failed")

            # Remove complex coupon
            print("\n🗑️  Removing complex coupon...")
            coupon_id = "coupon_123"

            remove_result = self.complex_cart_manager.remove_complex_coupon(
                cart_id=self.demo_cart_id,
                coupon_id=coupon_id,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
            )

            if remove_result:
                print("✅ Complex coupon removed successfully!")
                print(f"   Coupon ID: {coupon_id}")
            else:
                print("ℹ️  Coupon removal not available or failed")

        except Exception as e:
            print(f"❌ Error in complex coupon operations demo: {str(e)}")

    async def demo_item_management_operations(self):
        """Demo advanced item management operations."""
        print("\n" + "=" * 60)
        print("📦 ADVANCED ITEM MANAGEMENT DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Move items to saved
            print("\n💾 Moving items to saved list...")
            item_codes = ["ITEM001", "ITEM002", "ITEM003"]

            move_to_saved_result = self.complex_cart_manager.move_items_to_saved(
                cart_id=self.demo_cart_id,
                item_codes=item_codes,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
                save_for_later=True,
            )

            if move_to_saved_result:
                print("✅ Items moved to saved successfully!")
                print(f"   Items moved: {len(item_codes)}")
                print("   Save for later: enabled")

                if "savedItems" in move_to_saved_result:
                    print(
                        f"   Total saved items: {len(move_to_saved_result['savedItems'])}"
                    )
            else:
                print("ℹ️  Move to saved not available or failed")

            # Move items from saved
            print("\n📥 Moving items from saved back to cart...")
            saved_item_codes = ["SAVED001", "SAVED002"]
            quantities = {"SAVED001": 2, "SAVED002": 1}

            move_from_saved_result = self.complex_cart_manager.move_items_from_saved(
                cart_id=self.demo_cart_id,
                saved_item_codes=saved_item_codes,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
                quantities=quantities,
            )

            if move_from_saved_result:
                print("✅ Items moved from saved successfully!")
                print(f"   Items moved: {len(saved_item_codes)}")
                print("   Custom quantities applied")

                if "movedItems" in move_from_saved_result:
                    print(
                        f"   Items added to cart: {len(move_from_saved_result['movedItems'])}"
                    )
            else:
                print("ℹ️  Move from saved not available or failed")

        except Exception as e:
            print(f"❌ Error in item management operations demo: {str(e)}")

    async def demo_cart_analytics_and_recommendations(self):
        """Demo cart analytics and recommendations."""
        print("\n" + "=" * 60)
        print("📊 CART ANALYTICS & RECOMMENDATIONS DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Get cart analytics
            print("\n📊 Getting comprehensive cart analytics...")
            analytics_result = self.complex_cart_manager.get_cart_analytics(
                cart_id=self.demo_cart_id,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
            )

            if analytics_result:
                print("✅ Cart analytics retrieved successfully!")

                if "totalItems" in analytics_result:
                    print(f"   Total items: {analytics_result['totalItems']}")
                if "totalValue" in analytics_result:
                    print(f"   Total value: ${analytics_result['totalValue']:.2f}")
                if "categoryBreakdown" in analytics_result:
                    print(
                        f"   Categories: {len(analytics_result['categoryBreakdown'])}"
                    )
                if "averageItemPrice" in analytics_result:
                    print(
                        f"   Average item price: ${analytics_result['averageItemPrice']:.2f}"
                    )
                if "estimatedSavings" in analytics_result:
                    print(
                        f"   Estimated savings: ${analytics_result['estimatedSavings']:.2f}"
                    )
            else:
                print("ℹ️  Cart analytics not available or failed")

            # Get cart recommendations
            print("\n💡 Getting cart-based recommendations...")
            recommendations = self.complex_cart_manager.get_cart_recommendations(
                cart_id=self.demo_cart_id,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
                recommendation_type="complementary",
            )

            if recommendations:
                print(f"✅ Found {len(recommendations)} cart-based recommendations:")
                for i, rec in enumerate(recommendations[:3]):
                    print(f"   {i + 1}. {rec.get('productName', 'Unknown')}")
                    print(f"      Reason: {rec.get('reason', 'No reason provided')}")
                    print(f"      Price: ${rec.get('price', 0):.2f}")
                    print(f"      Relevance: {rec.get('relevanceScore', 0):.2f}")
            else:
                print("ℹ️  No cart recommendations available")

        except Exception as e:
            print(f"❌ Error in cart analytics demo: {str(e)}")

    async def demo_edge_case_handling(self):
        """Demo edge case handling functionality."""
        print("\n" + "=" * 60)
        print("🔄 EDGE CASE HANDLING DEMO")
        print("=" * 60)

        if not self.complex_cart_manager:
            print("❌ Complex cart manager not initialized")
            return

        try:
            # Handle cart edge cases automatically
            print("\n🔄 Handling cart edge cases automatically...")
            edge_case_result = self.complex_cart_manager.handle_cart_edge_cases(
                cart_id=self.demo_cart_id,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
            )

            if edge_case_result:
                print("✅ Edge case handling completed!")
                print(f"   Cart ID: {edge_case_result['cartId']}")
                print(f"   Cart status: {edge_case_result['cartStatus']}")

                if "validationIssues" in edge_case_result:
                    print(
                        f"   Validation issues found: {len(edge_case_result['validationIssues'])}"
                    )
                if "autoResolvedIssues" in edge_case_result:
                    print(
                        f"   Auto-resolved issues: {len(edge_case_result['autoResolvedIssues'])}"
                    )
                if "manualResolutionRequired" in edge_case_result:
                    print(
                        f"   Manual resolution required: {len(edge_case_result['manualResolutionRequired'])}"
                    )
                if "optimizationResult" in edge_case_result:
                    print(
                        f"   Optimization result: {edge_case_result['optimizationResult']}"
                    )

                # Provide recommendations based on results
                if edge_case_result["cartStatus"] == "healthy":
                    print("\n✅ Cart is healthy and optimized!")
                elif edge_case_result["cartStatus"] == "requires_attention":
                    print("\n⚠️  Cart requires manual attention:")
                    if edge_case_result.get("manualResolutionRequired"):
                        print("   • Some issues require manual resolution")
                        print("   • Check validation details for specific problems")
                        print(
                            "   • Consider running cart optimization after resolution"
                        )
                else:
                    print(f"\nℹ️  Cart status: {edge_case_result['cartStatus']}")
            else:
                print("ℹ️  Edge case handling not available or failed")

        except Exception as e:
            print(f"❌ Error in edge case handling demo: {str(e)}")

    async def run_comprehensive_demo(self, client):
        """Run the comprehensive complex cart demo."""
        print("🚀 STARTING COMPREHENSIVE COMPLEX CART DEMO")
        print("=" * 60)

        # Setup
        await self.setup_complex_cart_manager(client)

        # Run all demo sections
        await self.demo_cart_validation()
        await self.demo_cart_optimization()
        await self.demo_cart_splitting()
        await self.demo_cart_merging()
        await self.demo_complex_coupon_operations()
        await self.demo_item_management_operations()
        await self.demo_cart_analytics_and_recommendations()
        await self.demo_edge_case_handling()

        print("\n" + "=" * 60)
        print("🎉 COMPLEX CART DEMO COMPLETE!")
        print("=" * 60)
        print("✅ All complex cart features demonstrated successfully")
        print("📚 Check the documentation for more advanced usage")
        print("🔧 Customize the demo parameters for your specific needs")


async def main():
    """Main demo function."""
    print("🛒 Complex Cart Module Demo")
    print(
        "This demo showcases the advanced cart operations and edge case handling system."
    )
    print("Note: This is a demonstration of the module structure and capabilities.")
    print("In a real environment, you would need a valid Meijer client instance.")

    # Create demo instance
    demo = ComplexCartDemo()

    # Note: In a real demo, you would pass a valid client instance
    # For now, we'll show the demo structure
    print("\n📋 Demo sections available:")
    print("   • Comprehensive cart validation")
    print("   • Cart optimization algorithms")
    print("   • Cart splitting operations")
    print("   • Cart merging strategies")
    print("   • Complex coupon operations")
    print("   • Advanced item management")
    print("   • Cart analytics and recommendations")
    print("   • Edge case auto-resolution")

    print("\n🔧 To run with a real client:")
    print("   client = Meijer()")
    print("   await demo.run_comprehensive_demo(client)")


if __name__ == "__main__":
    asyncio.run(main())
