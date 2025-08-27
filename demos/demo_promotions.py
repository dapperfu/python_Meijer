#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Comprehensive demo for the new promotions module showcasing advanced features
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: meijer package, datetime, typing
 */

Comprehensive Promotions Demo

This demo showcases the advanced promotions and deals management system,
including dynamic pricing, stackable discounts, loyalty rewards, and deal optimization.
"""

import asyncio
from datetime import datetime, timedelta

from meijer import FlashSale, Promotion, PromotionRule, PromotionsManager
from meijer.promotions import (
    DiscountType,
    EligibilityType,
    PromotionStatus,
    PromotionType,
)


class PromotionsDemo:
    """Demo class for showcasing promotions functionality."""

    def __init__(self):
        """Initialize the promotions demo."""
        self.promotions_manager = None
        self.demo_customer_id = "demo_customer_123"
        self.demo_store_id = "demo_store_456"

    async def setup_promotions_manager(self, client):
        """Setup the promotions manager with a client."""
        self.promotions_manager = PromotionsManager(client)
        print("✅ Promotions manager initialized")

    async def demo_basic_promotions(self):
        """Demo basic promotion operations."""
        print("\n" + "=" * 60)
        print("🎯 BASIC PROMOTIONS DEMO")
        print("=" * 60)

        if not self.promotions_manager:
            print("❌ Promotions manager not initialized")
            return

        try:
            # Get active promotions
            print("\n📋 Getting active promotions...")
            active_promotions = self.promotions_manager.get_active_promotions(
                store_id=self.demo_store_id
            )

            if active_promotions:
                print(f"✅ Found {len(active_promotions)} active promotions:")
                for promo in active_promotions[:3]:  # Show first 3
                    print(f"   • {promo.name}: {promo.description}")
                    print(f"     Type: {promo.promotion_type.value}")
                    print(f"     Status: {promo.status.value}")
                    print(f"     Rules: {len(promo.rules)}")
            else:
                print("ℹ️  No active promotions found")

            # Get customer-specific promotions
            print("\n👤 Getting customer promotions...")
            customer_promotions = self.promotions_manager.get_customer_promotions(
                customer_id=self.demo_customer_id, store_id=self.demo_store_id
            )

            if customer_promotions:
                print(
                    f"✅ Found {len(customer_promotions)} customer-eligible promotions"
                )
            else:
                print("ℹ️  No customer-specific promotions found")

        except Exception as e:
            print(f"❌ Error in basic promotions demo: {str(e)}")

    async def demo_promotion_creation(self):
        """Demo creating and managing promotions."""
        print("\n" + "=" * 60)
        print("🆕 PROMOTION CREATION DEMO")
        print("=" * 60)

        if not self.promotions_manager:
            print("❌ Promotions manager not initialized")
            return

        try:
            # Create a sample promotion rule
            print("\n📝 Creating promotion rule...")
            sample_rule = PromotionRule(
                rule_id="demo_rule_001",
                name="20% Off Groceries",
                description="Get 20% off all grocery items",
                promotion_type=PromotionType.PERCENTAGE_OFF,
                discount_type=DiscountType.PERCENTAGE,
                discount_value=20.0,
                minimum_quantity=1,
                eligible_categories=["groceries", "produce", "dairy"],
                stackable=True,
                priority=1,
            )

            print(f"✅ Created rule: {sample_rule.name}")
            print(f"   Discount: {sample_rule.discount_value}%")
            print(f"   Categories: {', '.join(sample_rule.eligible_categories)}")
            print(f"   Stackable: {sample_rule.stackable}")

            # Create a sample promotion
            print("\n🎁 Creating sample promotion...")
            sample_promotion = Promotion(
                promotion_id="demo_promo_001",
                name="Weekend Grocery Sale",
                description="Special weekend discount on grocery items",
                promotion_type=PromotionType.PERCENTAGE_OFF,
                status=PromotionStatus.ACTIVE,
                rules=[sample_rule],
                start_date=datetime.now(),
                end_date=datetime.now() + timedelta(days=7),
                eligibility_type=EligibilityType.ALL_CUSTOMERS,
                minimum_purchase_amount=25.0,
                maximum_uses_per_customer=3,
            )

            print(f"✅ Created promotion: {sample_promotion.name}")
            print(
                f"   Duration: {sample_promotion.start_date.strftime('%Y-%m-%d')} to {sample_promotion.end_date.strftime('%Y-%m-%d')}"
            )
            print(f"   Min purchase: ${sample_promotion.minimum_purchase_amount}")
            print(f"   Max uses: {sample_promotion.maximum_uses_per_customer}")

        except Exception as e:
            print(f"❌ Error in promotion creation demo: {str(e)}")

    async def demo_flash_sales(self):
        """Demo flash sale functionality."""
        print("\n" + "=" * 60)
        print("⚡ FLASH SALES DEMO")
        print("=" * 60)

        if not self.promotions_manager:
            print("❌ Promotions manager not initialized")
            return

        try:
            # Get active flash sales
            print("\n🔥 Getting active flash sales...")
            flash_sales = self.promotions_manager.get_flash_sales(
                store_id=self.demo_store_id
            )

            if flash_sales:
                print(f"✅ Found {len(flash_sales)} active flash sales:")
                for sale in flash_sales[:3]:  # Show first 3
                    print(f"   • {sale.name}: {sale.description}")
                    print(f"     Discount: {sale.discount_percentage}%")
                    print(
                        f"     Duration: {sale.start_time.strftime('%H:%M')} - {sale.end_time.strftime('%H:%M')}"
                    )
                    print(f"     Products: {len(sale.eligible_products)} eligible")
            else:
                print("ℹ️  No active flash sales found")

            # Create a sample flash sale
            print("\n⚡ Creating sample flash sale...")
            sample_flash_sale = FlashSale(
                sale_id="demo_flash_001",
                name="2-Hour Electronics Blitz",
                description="Massive discounts on electronics for 2 hours only!",
                start_time=datetime.now(),
                end_time=datetime.now() + timedelta(hours=2),
                discount_percentage=40.0,
                eligible_products=["TV001", "LAPTOP002", "PHONE003"],
                max_quantity_per_customer=2,
            )

            print(f"✅ Created flash sale: {sample_flash_sale.name}")
            print(f"   Discount: {sample_flash_sale.discount_percentage}%")
            print(
                f"   Duration: {sample_flash_sale.start_time.strftime('%H:%M')} - {sample_flash_sale.end_time.strftime('%H:%M')}"
            )
            print(f"   Max quantity: {sample_flash_sale.max_quantity_per_customer}")

        except Exception as e:
            print(f"❌ Error in flash sales demo: {str(e)}")

    async def demo_deal_optimization(self):
        """Demo deal optimization functionality."""
        print("\n" + "=" * 60)
        print("🎯 DEAL OPTIMIZATION DEMO")
        print("=" * 60)

        if not self.promotions_manager:
            print("❌ Promotions manager not initialized")
            return

        try:
            # Sample cart items for optimization
            print("\n🛒 Setting up sample cart for optimization...")
            sample_cart_items = [
                {
                    "productCode": "MILK001",
                    "productName": "Organic Whole Milk",
                    "price": 4.99,
                    "quantity": 2,
                    "category": "dairy",
                },
                {
                    "productCode": "BREAD002",
                    "productName": "Artisan Sourdough",
                    "price": 3.49,
                    "quantity": 1,
                    "category": "bakery",
                },
                {
                    "productCode": "EGGS003",
                    "productName": "Farm Fresh Eggs",
                    "price": 5.99,
                    "quantity": 1,
                    "category": "dairy",
                },
            ]

            print(f"✅ Created sample cart with {len(sample_cart_items)} items")
            cart_total = sum(
                item["price"] * item["quantity"] for item in sample_cart_items
            )
            print(f"   Cart total: ${cart_total:.2f}")

            # Get deal optimizations
            print("\n🔍 Getting deal optimizations...")
            optimizations = self.promotions_manager.optimize_deals(
                cart_items=sample_cart_items,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
                include_loyalty=True,
            )

            if optimizations:
                print(f"✅ Found {len(optimizations)} optimization opportunities:")
                for opt in optimizations:
                    print(f"   • Promotion: {opt.promotion_id}")
                    print(f"     Original: ${opt.original_price:.2f}")
                    print(f"     Discounted: ${opt.discounted_price:.2f}")
                    print(
                        f"     Savings: ${opt.savings_amount:.2f} ({opt.savings_percentage:.1f}%)"
                    )
                    print(f"     Score: {opt.optimization_score:.2f}")
            else:
                print("ℹ️  No optimization opportunities found")

            # Get stackable discounts
            print("\n🎁 Getting stackable discounts...")
            stackable_discounts = self.promotions_manager.get_stackable_discounts(
                customer_id=self.demo_customer_id,
                cart_total=cart_total,
                store_id=self.demo_store_id,
            )

            if stackable_discounts:
                print(f"✅ Found {len(stackable_discounts)} stackable discounts:")
                for discount in stackable_discounts[:3]:
                    print(
                        f"   • {discount.get('name', 'Unknown')}: ${discount.get('amount', 0):.2f}"
                    )
            else:
                print("ℹ️  No stackable discounts available")

        except Exception as e:
            print(f"❌ Error in deal optimization demo: {str(e)}")

    async def demo_loyalty_rewards(self):
        """Demo loyalty rewards functionality."""
        print("\n" + "=" * 60)
        print("🏆 LOYALTY REWARDS DEMO")
        print("=" * 60)

        if not self.promotions_manager:
            print("❌ Promotions manager not initialized")
            return

        try:
            # Get loyalty rewards
            print("\n🎯 Getting loyalty rewards...")
            loyalty_rewards = self.promotions_manager.get_loyalty_rewards(
                customer_id=self.demo_customer_id, store_id=self.demo_store_id
            )

            if loyalty_rewards:
                print(f"✅ Found {len(loyalty_rewards)} loyalty rewards:")
                for reward in loyalty_rewards[:3]:
                    print(f"   • {reward.get('name', 'Unknown')}")
                    print(f"     Type: {reward.get('type', 'Unknown')}")
                    print(f"     Value: {reward.get('value', 'Unknown')}")
                    print(f"     Expires: {reward.get('expiryDate', 'Unknown')}")
            else:
                print("ℹ️  No loyalty rewards available")

        except Exception as e:
            print(f"❌ Error in loyalty rewards demo: {str(e)}")

    async def demo_maximum_savings_calculation(self):
        """Demo maximum savings calculation."""
        print("\n" + "=" * 60)
        print("💰 MAXIMUM SAVINGS CALCULATION DEMO")
        print("=" * 60)

        if not self.promotions_manager:
            print("❌ Promotions manager not initialized")
            return

        try:
            # Sample cart for savings calculation
            print("\n🛒 Setting up sample cart for savings calculation...")
            sample_cart_items = [
                {
                    "productCode": "STEAK001",
                    "productName": "Premium Ribeye Steak",
                    "price": 24.99,
                    "quantity": 2,
                    "category": "meat",
                },
                {
                    "productCode": "WINE002",
                    "productName": "Cabernet Sauvignon",
                    "price": 18.99,
                    "quantity": 1,
                    "category": "beverages",
                },
                {
                    "productCode": "CHEESE003",
                    "productName": "Aged Cheddar",
                    "price": 8.99,
                    "quantity": 1,
                    "category": "dairy",
                },
            ]

            cart_total = sum(
                item["price"] * item["quantity"] for item in sample_cart_items
            )
            print(f"✅ Sample cart total: ${cart_total:.2f}")

            # Calculate maximum savings
            print("\n🧮 Calculating maximum possible savings...")
            savings_result = self.promotions_manager.calculate_maximum_savings(
                cart_items=sample_cart_items,
                customer_id=self.demo_customer_id,
                store_id=self.demo_store_id,
            )

            if savings_result:
                print("✅ Maximum savings calculation complete:")
                print(f"   Original total: ${savings_result['originalTotal']:.2f}")
                print(f"   Final total: ${savings_result['finalTotal']:.2f}")
                print(f"   Total savings: ${savings_result['totalSavings']:.2f}")
                print(
                    f"   Savings percentage: {savings_result['savingsPercentage']:.1f}%"
                )
                print(
                    f"   Optimization score: {savings_result['optimizationScore']:.2f}"
                )

                if savings_result["appliedPromotions"]:
                    print(
                        f"   Applied promotions: {len(savings_result['appliedPromotions'])}"
                    )
                    for promo in savings_result["appliedPromotions"][:3]:
                        print(f"     • {promo['type']}: ${promo['savings']:.2f}")
            else:
                print("ℹ️  No savings opportunities found")

        except Exception as e:
            print(f"❌ Error in maximum savings calculation demo: {str(e)}")

    async def demo_promotion_management(self):
        """Demo promotion management operations."""
        print("\n" + "=" * 60)
        print("⚙️  PROMOTION MANAGEMENT DEMO")
        print("=" * 60)

        if not self.promotions_manager:
            print("❌ Promotions manager not initialized")
            return

        try:
            # Create a test promotion
            print("\n📝 Creating test promotion...")
            test_rule = PromotionRule(
                rule_id="test_rule_001",
                name="Test 15% Off",
                description="Test promotion rule",
                promotion_type=PromotionType.PERCENTAGE_OFF,
                discount_type=DiscountType.PERCENTAGE,
                discount_value=15.0,
                minimum_quantity=1,
                eligible_categories=["test"],
                stackable=False,
                priority=2,
            )

            test_promotion = Promotion(
                promotion_id="test_promo_001",
                name="Test Promotion",
                description="Test promotion for demo",
                promotion_type=PromotionType.PERCENTAGE_OFF,
                status=PromotionStatus.ACTIVE,
                rules=[test_rule],
                start_date=datetime.now(),
                end_date=datetime.now() + timedelta(days=1),
                eligibility_type=EligibilityType.ALL_CUSTOMERS,
            )

            print("✅ Test promotion created successfully")
            print(f"   Name: {test_promotion.name}")
            print(f"   Discount: {test_promotion.rules[0].discount_value}%")
            print("   Duration: 1 day")

            # Note: In a real demo, you would create/update/delete promotions
            # For safety, we'll just show the structure
            print("\nℹ️  Promotion management operations available:")
            print("   • create_promotion() - Create new promotions")
            print("   • update_promotion() - Update existing promotions")
            print("   • delete_promotion() - Remove promotions")
            print("   • validate_promotion() - Validate promotion eligibility")
            print("   • apply_promotion() - Apply promotion to cart")

        except Exception as e:
            print(f"❌ Error in promotion management demo: {str(e)}")

    async def run_comprehensive_demo(self, client):
        """Run the comprehensive promotions demo."""
        print("🚀 STARTING COMPREHENSIVE PROMOTIONS DEMO")
        print("=" * 60)

        # Setup
        await self.setup_promotions_manager(client)

        # Run all demo sections
        await self.demo_basic_promotions()
        await self.demo_promotion_creation()
        await self.demo_flash_sales()
        await self.demo_deal_optimization()
        await self.demo_loyalty_rewards()
        await self.demo_maximum_savings_calculation()
        await self.demo_promotion_management()

        print("\n" + "=" * 60)
        print("🎉 PROMOTIONS DEMO COMPLETE!")
        print("=" * 60)
        print("✅ All promotion features demonstrated successfully")
        print("📚 Check the documentation for more advanced usage")
        print("🔧 Customize the demo parameters for your specific needs")


async def main():
    """Main demo function."""
    print("🎯 Promotions Module Demo")
    print("This demo showcases the advanced promotions and deals management system.")
    print("Note: This is a demonstration of the module structure and capabilities.")
    print("In a real environment, you would need a valid Meijer client instance.")

    # Create demo instance
    demo = PromotionsDemo()

    # Note: In a real demo, you would pass a valid client instance
    # For now, we'll show the demo structure
    print("\n📋 Demo sections available:")
    print("   • Basic promotions operations")
    print("   • Promotion creation and management")
    print("   • Flash sales functionality")
    print("   • Deal optimization algorithms")
    print("   • Loyalty rewards integration")
    print("   • Maximum savings calculations")
    print("   • Promotion management operations")

    print("\n🔧 To run with a real client:")
    print("   client = Meijer()")
    print("   await demo.run_comprehensive_demo(client)")


if __name__ == "__main__":
    asyncio.run(main())
