#!/usr/bin/env python3
"""
Generate Jupyter notebook for Meijer coupons.py

This script creates a comprehensive notebook demonstrating all coupon classes
and their usage with practical examples.
"""

import nbformat as nbf


def create_coupons_notebook():
    """Create the coupons notebook."""

    # Create notebook
    nb = nbf.v4.new_notebook()

    # Title and description
    title_cell = nbf.v4.new_markdown_cell("""# Meijer Coupon Management

This notebook demonstrates the comprehensive coupon and offers management system available in the Meijer API client.

## Overview

The `coupons.py` module provides a complete system for managing Meijer coupons and offers, including:

- **Coupon Data Models**: Comprehensive coupon representation with all discovered fields
- **Visual Elements**: Hat colors, border colors, and display formatting
- **Coupon Operations**: Clipping, unclipping, and status management
- **Category Management**: Department and category organization
- **API Integration**: Direct integration with Meijer's coupon endpoints

## Key Components

- **MeijerCoupon**: Main coupon class with clipping functionality
- **CouponDepartment**: Department/category representation
- **CouponCategory**: Category/segment information
- **CouponCondition**: Earning conditions and requirements
- **CouponReward**: Reward details and discount information
- **MeijerCouponManager**: Manager class for coupon operations
- **Utility Functions**: Helper functions for coupon creation and management

## Setup

First, let's import the necessary modules:
""")

    # Import cell
import_cell = nbf.v4.new_code_cell("""# Import the coupon classes
from meijer.coupons import (
    HatColor,
    BorderColor,
    CouponDepartment,
    CouponCategory,
    CouponCondition,
    CouponReward,
    MeijerCoupon,
    MeijerCouponManager,
    create_meijer_coupons_from_response,
    clip_coupon,
    unclip_coupon
)

# Import additional utilities
from datetime import datetime, timedelta
from typing import Dict, List, Any, Optional
import json

print("✅ All coupon classes imported successfully!")
print("Available components:")
print("  - HatColor & BorderColor enums")
print("  - CouponDepartment & CouponCategory")
print("  - CouponCondition & CouponReward")
print("  - MeijerCoupon (main class)")
print("  - MeijerCouponManager")
print("  - Utility functions")

# 🆕 NEW: Test rich Jupyter integration
print("\\n🎨 Testing Rich Jupyter Notebook Integration:")
print("=" * 50)
print("All coupon classes now support beautiful display in notebooks!")
print("Use display() function or just type the variable name to see rich formatting")""")

    # Enums section
    enums_section = nbf.v4.new_markdown_cell("""## Visual Element Enums

The module provides enums for managing the visual appearance of coupons, including hat colors and border colors.

### HatColor and BorderColor
""")

    enums_example = nbf.v4.new_code_cell("""# Visual element enums demonstration
print("🎨 Visual Element Enums Demo")
print("=" * 35)

# Explore HatColor enum
print("🎩 HatColor Enum:")
print("-" * 20)
for hat_color in HatColor:
    print(f"  {hat_color.name}: {hat_color.value}")

# Explore BorderColor enum
print(f"\\n🖼️ BorderColor Enum:")
print("-" * 25)
for border_color in BorderColor:
    print(f"  {border_color.name}: {border_color.value}")

# Test enum usage
print(f"\\n🔍 Enum Usage Examples:")
print("=" * 30)

# Create instances
blue_hat = HatColor.BLUE
red_border = BorderColor.RED
no_hat = HatColor.NONE
no_border = BorderColor.NONE

print(f"Blue Hat: {blue_hat.name} = {blue_hat.value}")
print(f"Red Border: {red_border.name} = {red_border.value}")
print(f"No Hat: {no_hat.name} = {no_hat.value}")
print(f"No Border: {no_border.name} = {no_border.value}")

# Enum comparisons
print(f"\\n🔄 Enum Comparisons:")
print("=" * 25)
print(f"Blue Hat == 1: {blue_hat == 1}")
print(f"Red Border == 2: {red_border == 2}")
print(f"No Hat == 0: {no_hat == 0}")
print(f"No Border == 0: {no_border == 0}")

# String representations
print(f"\\n📝 String Representations:")
print("=" * 30)
print(f"str(blue_hat): {str(blue_hat)}")
print(f"repr(blue_hat): {repr(blue_hat)}")
print(f"blue_hat.name: {blue_hat.name}")
print(f"blue_hat.value: {blue_hat.value}")

# Enum creation from values
print(f"\\n🔧 Enum Creation from Values:")
print("=" * 35)
try:
    hat_from_value = HatColor(1)
    border_from_value = BorderColor(2)
    print(f"HatColor(1): {hat_from_value.name}")
    print(f"BorderColor(2): {border_from_value.name}")
except ValueError as e:
    print(f"Error creating enum from value: {e}")""")

    # Rich Jupyter Integration section
    rich_jupyter_section = nbf.v4.new_markdown_cell("""## 🎨 Rich Jupyter Notebook Integration

The Meijer coupon classes now provide **beautiful, interactive displays** in Jupyter notebooks through rich representation methods.

### Rich Display Features Available

- **`_repr_html_`**: Rich HTML with CSS styling, icons, and visual elements
- **`_repr_markdown_`**: Clean Markdown formatting for documentation
- **`_repr_pretty_`**: Interactive IPython display for development

### Coupon Classes with Rich Display

1. **MeijerCoupon**: Beautiful coupon visualization with status indicators
2. **CouponDepartment**: Rich department display with category information
3. **CouponCategory**: Visual category representation with details
4. **Coupon Collections**: Rich displays for multiple coupons

### How to Use Rich Display

```python
# Display individual coupons
display(coupon)           # Rich HTML display
print(coupon._repr_markdown_())  # Rich Markdown
print(coupon._repr_pretty_(None, False))  # Rich IPython

# Display coupon collections
display(coupon_list)      # Rich collection display
```

Let's see these rich displays in action with coupon data!""")

    # Rich Jupyter demonstration for coupons
    rich_coupon_demo = nbf.v4.new_code_cell("""# Demonstrate rich Jupyter notebook integration for coupons
print("🎨 Rich Jupyter Notebook Integration for Coupons")
print("=" * 60)

# Create sample coupon objects to demonstrate rich display
print("\\n📝 Creating sample coupon objects for rich display demonstration...")

# Sample coupon data
sample_coupon_data = {
    "id": "C001",
    "title": "$2.00 off Organic Produce",
    "description": "Save $2.00 on any organic produce purchase",
    "discount_amount": 2.00,
    "discount_type": "dollar",
    "min_purchase": 0.00,
    "expiration_date": datetime.now() + timedelta(days=30),
    "times_used": 0,
    "max_uses": 5,
    "is_active": True,
    "hat_color": HatColor.GREEN,
    "border_color": BorderColor.BLUE
}

# Create sample MeijerCoupon object
try:
    sample_coupon = MeijerCoupon(**sample_coupon_data)
    print("✅ Sample MeijerCoupon created successfully")

    # 🎨 NEW: Demonstrate rich Jupyter integration
    print("\\n🎨 Rich Jupyter Notebook Display Examples:")
    print("=" * 55)

    # Show the coupon with rich formatting
    print("\\n1️⃣ Sample Coupon - Rich HTML Display:")
    display(sample_coupon)

    print("\\n2️⃣ Sample Coupon - Rich Markdown Display:")
    if hasattr(sample_coupon, '_repr_markdown_'):
        print(sample_coupon._repr_markdown_())
    else:
        print("❌ _repr_markdown_ method not available")

    print("\\n3️⃣ Sample Coupon - Rich IPython Display:")
    if hasattr(sample_coupon, '_repr_pretty_'):
        print(sample_coupon._repr_pretty_(None, False))
    else:
        print("❌ _repr_pretty_ method not available")

    # 🎨 NEW: Rich Display Properties
    print("\\n4️⃣ Rich Display Properties:")
    print("-" * 35)

    # Show the rich display methods available
    print("\\n📊 Rich Display Method Availability:")
    print(f"  Coupon _repr_html_: {'✅' if hasattr(sample_coupon, '_repr_html_') else '❌'}")
    print(f"  Coupon _repr_markdown_: {'✅' if hasattr(sample_coupon, '_repr_markdown_') else '❌'}")
    print(f"  Coupon _repr_pretty_: {'✅' if hasattr(sample_coupon, '_repr_pretty_') else '❌'}")

    if hasattr(sample_coupon, '_repr_html_'):
        html_length = len(sample_coupon._repr_html_())
        print(f"  Coupon HTML length: {html_length} characters")

    if hasattr(sample_coupon, '_repr_markdown_'):
        markdown_length = len(sample_coupon._repr_markdown_())
        print(f"  Coupon Markdown length: {markdown_length} characters")

    # 🎨 NEW: Rich Display Examples
    print("\\n5️⃣ Rich Display Examples:")
    print("-" * 35)

    print("\\n🎫 Example Coupon - Rich Markdown:")
    if hasattr(sample_coupon, '_repr_markdown_'):
        print(sample_coupon._repr_markdown_())
    else:
        print("❌ _repr_markdown_ method not available")

    print("\\n🔧 Example Coupon - Rich IPython:")
    if hasattr(sample_coupon, '_repr_pretty_'):
        print(sample_coupon._repr_pretty_(None, False))
    else:
        print("❌ _repr_pretty_ method not available")

except Exception as e:
    print(f"❌ Error creating sample coupon: {e}")
    print("This might be due to missing required fields or API changes")

    # Create a mock coupon class for demonstration
    print("\\n📝 Creating mock coupon class for demonstration...")

    class MockCoupon:
        def __init__(self, title, description, discount_amount, discount_type="dollar"):
            self.title = title
            self.description = description
            self.discount_amount = discount_amount
            self.discount_type = discount_type
            self.is_active = True
            self.hat_color = "GREEN"
            self.border_color = "BLUE"

        def _repr_html_(self):
            return f'''
            <div style="
                border: 2px solid #e74c3c;
                border-radius: 12px;
                padding: 16px;
                margin: 16px 0;
                background: linear-gradient(135deg, #fff5f5 0%, #fed7d7 100%);
                box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            ">
                <div style="display: flex; align-items: center; gap: 12px;">
                    <span style="font-size: 24px;">🎫</span>
                    <div>
                        <h3 style="margin: 0; color: #c53030;">{self.title}</h3>
                        <p style="margin: 4px 0 0 0; color: #742a2a;">
                            {self.description}
                        </p>
                        <div style="
                            background: #e74c3c;
                            color: white;
                            padding: 4px 8px;
                            border-radius: 6px;
                            font-size: 14px;
                            font-weight: 600;
                            margin-top: 8px;
                            display: inline-block;
                        ">
                            Save ${self.discount_amount:.2f}
                        </div>
                    </div>
                </div>
            </div>
            '''

        def _repr_markdown_(self):
            return f"""## 🎫 {self.title}

**Description:** {self.description}
**Savings:** ${self.discount_amount:.2f} off
**Status:** 🟢 Active
**Hat Color:** {self.hat_color}
**Border Color:** {self.border_color}

---
*Mock coupon for demonstration*"""

        def _repr_pretty_(self, p, cycle):
            if cycle:
                p.text("MockCoupon(...)")
            else:
                p.text(f"🎫 {self.title}")
                p.breakable()
                p.text(f"  Description: {self.description}")
                p.breakable()
                p.text(f"  Savings: ${self.discount_amount:.2f} off")
                p.breakable()
                p.text(f"  Status: 🟢 Active")
                p.breakable()
                p.text(f"  Hat Color: {self.hat_color}")
                p.breakable()
                p.text(f"  Border Color: {self.border_color}")

    # Create sample mock coupons
    mock_coupons = [
        MockCoupon("$2.00 off Organic Produce", "Save $2.00 on any organic produce purchase", 2.00),
        MockCoupon("20% off Dairy Products", "20% discount on all dairy products", 20.0, "percentage"),
        MockCoupon("$1.00 off Bread", "Save $1.00 on any bread product", 1.00)
    ]

    print("\\n🎫 Mock Coupons - Rich HTML Display:")
    for i, coupon in enumerate(mock_coupons, 1):
        print(f"\\n--- Coupon {i} ---")
        display(coupon)

    print("\\n📝 Mock Coupons - Rich Markdown Display:")
    for i, coupon in enumerate(mock_coupons, 1):
        print(f"\\n--- Coupon {i} ---")
        print(coupon._repr_markdown_())

    print("\\n💡 These mock coupons demonstrate the rich Jupyter integration!")
    print("   Real MeijerCoupon objects will show actual coupon data with the same beautiful formatting")""")

    # CouponDepartment section
    department_section = nbf.v4.new_markdown_cell("""## CouponDepartment Class

The `CouponDepartment` class represents a department or category for organizing coupons.

### Department Structure
""")

    department_example = nbf.v4.new_code_cell("""# CouponDepartment demonstration
print("🏪 CouponDepartment Demo")
print("=" * 30)

# Create sample departments
produce_dept = CouponDepartment(
    category_id="PROD001",
    category_name="Produce",
    sub_category_id="PROD001_FRUIT",
    sub_category_name="Fresh Fruits",
    offer_count_sub_category=15,
    offer_count_department=45,
    is_custom_category=False
)

dairy_dept = CouponDepartment(
    category_id="DAIRY001",
    category_name="Dairy",
    sub_category_id="DAIRY001_MILK",
    sub_category_name="Milk & Dairy",
    offer_count_sub_category=8,
    offer_count_department=32,
    is_custom_category=False
)

custom_dept = CouponDepartment(
    category_id="CUSTOM001",
    category_name="Custom Category",
    is_custom_category=True,
    offer_count_department=10
)

print("✅ Sample Departments Created:")
print(f"\\n1. Produce Department:")
print(f"  Category ID: {produce_dept.category_id}")
print(f"  Category Name: {produce_dept.category_name}")
print(f"  Sub-category ID: {produce_dept.sub_category_id}")
print(f"  Sub-category Name: {produce_dept.sub_category_name}")
print(f"  Sub-category Offers: {produce_dept.offer_count_sub_category}")
print(f"  Department Offers: {produce_dept.offer_count_department}")
print(f"  Is Custom: {produce_dept.is_custom_category}")

print(f"\\n2. Dairy Department:")
print(f"  Category ID: {dairy_dept.category_id}")
print(f"  Category Name: {dairy_dept.category_name}")
print(f"  Sub-category ID: {dairy_dept.sub_category_id}")
print(f"  Sub-category Name: {dairy_dept.sub_category_name}")
print(f"  Sub-category Offers: {dairy_dept.offer_count_sub_category}")
print(f"  Department Offers: {dairy_dept.offer_count_department}")
print(f"  Is Custom: {dairy_dept.is_custom_category}")

print(f"\\n3. Custom Department:")
print(f"  Category ID: {custom_dept.category_id}")
print(f"  Category Name: {custom_dept.category_name}")
print(f"  Sub-category ID: {custom_dept.sub_category_id}")
print(f"  Sub-category Name: {custom_dept.sub_category_name}")
print(f"  Sub-category Offers: {custom_dept.offer_count_sub_category}")
print(f"  Department Offers: {custom_dept.offer_count_department}")
print(f"  Is Custom: {custom_dept.is_custom_category}")

# Test department operations
print(f"\\n🔍 Department Operations:")
print("=" * 30)

departments = [produce_dept, dairy_dept, custom_dept]

# Count total offers
total_offers = sum(dept.offer_count_department for dept in departments)
print(f"Total offers across all departments: {total_offers}")

# Find departments with sub-categories
depts_with_subcats = [dept for dept in departments if dept.sub_category_id]
print(f"Departments with sub-categories: {len(depts_with_subcats)}")

# Find custom categories
custom_depts = [dept for dept in departments if dept.is_custom_category]
print(f"Custom departments: {len(custom_depts)}")

# Department statistics
print(f"\\n📊 Department Statistics:")
print("=" * 30)
print(f"Total Departments: {len(departments)}")
print(f"Departments with Sub-categories: {len(depts_with_subcats)}")
print(f"Custom Departments: {len(custom_depts)}")
print(f"Average Offers per Department: {total_offers / len(departments):.1f}")""")

    # CouponCategory section
    category_section = nbf.v4.new_markdown_cell("""## CouponCategory Class

The `CouponCategory` class represents a coupon category or segment for organizing offers.

### Category Structure
""")

    category_example = nbf.v4.new_code_cell("""# CouponCategory demonstration
print("📂 CouponCategory Demo")
print("=" * 30)

# Create sample categories
fruit_category = CouponCategory(
    segment_id="FRUIT_SEG",
    segment_name="Fresh Fruits"
)

dairy_category = CouponCategory(
    segment_id="DAIRY_SEG",
    segment_name="Dairy Products"
)

general_category = CouponCategory(
    segment_id="GEN_SEG",
    segment_name="General Offers"
)

print("✅ Sample Categories Created:")
print(f"\\n1. Fruit Category:")
print(f"  Segment ID: {fruit_category.segment_id}")
print(f"  Segment Name: {fruit_category.segment_name}")

print(f"\\n2. Dairy Category:")
print(f"  Segment ID: {dairy_category.segment_id}")
print(f"  Segment Name: {dairy_category.segment_name}")

print(f"\\n3. General Category:")
print(f"  Segment ID: {general_category.segment_id}")
print(f"  Segment Name: {general_category.segment_name}")

# Test category operations
print(f"\\n🔍 Category Operations:")
print("=" * 30)

categories = [fruit_category, dairy_category, general_category]

# Find categories by name
fruit_cats = [cat for cat in categories if "fruit" in cat.segment_name.lower()]
print(f"Categories with 'fruit' in name: {len(fruit_cats)}")

# Find categories by ID pattern
seg_cats = [cat for cat in categories if cat.segment_id and "_SEG" in cat.segment_id]
print(f"Categories with '_SEG' in ID: {len(seg_cats)}")

# Category information
print(f"\\n📊 Category Information:")
print("=" * 30)
print(f"Total Categories: {len(categories)}")
print(f"Categories with IDs: {len([cat for cat in categories if cat.segment_id])}")
print(f"Categories with Names: {len([cat for cat in categories if cat.segment_name])}")

# Display all categories
print(f"\\n📋 All Categories:")
for i, category in enumerate(categories, 1):
    print(f"{i}. {category.segment_name} (ID: {category.segment_id})")""")

    # CouponCondition section
    condition_section = nbf.v4.new_markdown_cell("""## CouponCondition Class

The `CouponCondition` class represents the earning conditions and requirements for coupons.

### Condition Structure
""")

    condition_example = nbf.v4.new_code_cell("""# CouponCondition demonstration
print("📋 CouponCondition Demo")
print("=" * 30)

# Create sample conditions
spend_condition = CouponCondition(
    condition_type_id=1,
    condition_value=25.0
)

quantity_condition = CouponCondition(
    condition_type_id=2,
    condition_value=3.0
)

no_condition = CouponCondition(
    condition_type_id=0,
    condition_value=0.0
)

print("✅ Sample Conditions Created:")
print(f"\\n1. Spend Condition:")
print(f"  Condition Type ID: {spend_condition.condition_type_id}")
print(f"  Condition Value: ${spend_condition.condition_value}")

print(f"\\n2. Quantity Condition:")
print(f"  Condition Type ID: {quantity_condition.condition_type_id}")
print(f"  Condition Value: {quantity_condition.condition_value}")

print(f"\\n3. No Condition:")
print(f"  Condition Type ID: {no_condition.condition_type_id}")
print(f"  Condition Value: {no_condition.condition_value}")

# Test condition operations
print(f"\\n🔍 Condition Operations:")
print("=" * 30)

conditions = [spend_condition, quantity_condition, no_condition]

# Find conditions by type
spend_conditions = [cond for cond in conditions if cond.condition_type_id == 1]
quantity_conditions = [cond for cond in conditions if cond.condition_type_id == 2]
no_conditions = [cond for cond in conditions if cond.condition_type_id == 0]

print(f"Spend Conditions: {len(spend_conditions)}")
print(f"Quantity Conditions: {len(quantity_conditions)}")
print(f"No Conditions: {len(no_conditions)}")

# Condition analysis
print(f"\\n📊 Condition Analysis:")
print("=" * 30)
print(f"Total Conditions: {len(conditions)}")
print(f"Average Condition Value: {sum(cond.condition_value for cond in conditions) / len(conditions):.2f}")
print(f"Highest Condition Value: {max(cond.condition_value for cond in conditions)}")
print(f"Lowest Condition Value: {min(cond.condition_value for cond in conditions)}")

# Condition type mapping (example)
condition_type_names = {
    0: "No Condition",
    1: "Spend Amount",
    2: "Quantity Required",
    3: "Category Purchase",
    4: "Brand Purchase"
}

print(f"\\n🔍 Condition Type Mapping:")
for condition in conditions:
    type_name = condition_type_names.get(condition.condition_type_id, "Unknown")
    print(f"  Type {condition.condition_type_id} ({type_name}): {condition.condition_value}")""")

    # CouponReward section
    reward_section = nbf.v4.new_markdown_cell("""## CouponReward Class

The `CouponReward` class represents the reward details and discount information for coupons.

### Reward Structure
""")

    reward_example = nbf.v4.new_code_cell("""# CouponReward demonstration
print("🎁 CouponReward Demo")
print("=" * 30)

# Create sample rewards
dollar_off_reward = CouponReward(
    redeem_amount=2.50,
    discount_type_id=1,
    discount_level_id=1,
    reward_program_id=101
)

percentage_reward = CouponReward(
    redeem_amount=None,
    discount_type_id=2,
    discount_level_id=2,
    reward_program_id=102
)

free_item_reward = CouponReward(
    redeem_amount=0.0,
    discount_type_id=3,
    discount_level_id=1,
    reward_program_id=103
)

print("✅ Sample Rewards Created:")
print(f"\\n1. Dollar Off Reward:")
print(f"  Redeem Amount: ${dollar_off_reward.redeem_amount}")
print(f"  Discount Type ID: {dollar_off_reward.discount_type_id}")
print(f"  Discount Level ID: {dollar_off_reward.discount_level_id}")
print(f"  Reward Program ID: {dollar_off_reward.reward_program_id}")

print(f"\\n2. Percentage Reward:")
print(f"  Redeem Amount: {percentage_reward.redeem_amount}")
print(f"  Discount Type ID: {percentage_reward.discount_type_id}")
print(f"  Discount Level ID: {percentage_reward.discount_level_id}")
print(f"  Reward Program ID: {percentage_reward.reward_program_id}")

print(f"\\n3. Free Item Reward:")
print(f"  Redeem Amount: ${free_item_reward.redeem_amount}")
print(f"  Discount Type ID: {free_item_reward.discount_type_id}")
print(f"  Discount Level ID: {free_item_reward.discount_level_id}")
print(f"  Reward Program ID: {free_item_reward.reward_program_id}")

# Test reward operations
print(f"\\n🔍 Reward Operations:")
print("=" * 30)

rewards = [dollar_off_reward, percentage_reward, free_item_reward]

# Find rewards by type
dollar_rewards = [r for r in rewards if r.discount_type_id == 1]
percentage_rewards = [r for r in rewards if r.discount_type_id == 2]
free_rewards = [r for r in rewards if r.discount_type_id == 3]

print(f"Dollar Off Rewards: {len(dollar_rewards)}")
print(f"Percentage Rewards: {len(percentage_rewards)}")
print(f"Free Item Rewards: {len(free_rewards)}")

# Reward analysis
print(f"\\n📊 Reward Analysis:")
print("=" * 25)
print(f"Total Rewards: {len(rewards)}")
print(f"Rewards with Redeem Amount: {len([r for r in rewards if r.redeem_amount is not None])}")
print(f"Average Redeem Amount: {sum(r.redeem_amount or 0 for r in rewards) / len(rewards):.2f}")

# Discount type mapping (example)
discount_type_names = {
    1: "Dollar Off",
    2: "Percentage Off",
    3: "Free Item",
    4: "Buy One Get One",
    5: "Buy Two Get One"
}

print(f"\\n🔍 Discount Type Mapping:")
for reward in rewards:
    type_name = discount_type_names.get(reward.discount_type_id, "Unknown")
    amount_str = f"${reward.redeem_amount}" if reward.redeem_amount is not None else "N/A"
    print(f"  {type_name}: {amount_str} (Type ID: {reward.discount_type_id})")""")

    # MeijerCoupon section
    meijer_coupon_section = nbf.v4.new_markdown_cell("""## MeijerCoupon Class

The `MeijerCoupon` class is the main coupon class that provides comprehensive coupon representation and clipping functionality.

### Coupon Features
""")

    meijer_coupon_example = nbf.v4.new_code_cell("""# MeijerCoupon demonstration
print("🎫 MeijerCoupon Demo")
print("=" * 30)

# Create sample coupons
banana_coupon = MeijerCoupon(
    meijer_offer_id=1001,
    title="$1.00 off Organic Bananas",
    description="Save $1.00 on any organic bananas",
    image_url="https://example.com/banana_coupon.jpg",
    disclaimer="Limit one per transaction",
    hat_color=HatColor.BLUE,
    border_color=BorderColor.RED,
    redemption_start_date=datetime.now(),
    redemption_end_date=datetime.now() + timedelta(days=30),
    redeem_amount=1.00,
    condition_value=5.00,
    discount_type_id=1,
    discount_level_id=1,
    condition_type_id=1,
    is_clipped=False,
    is_suggested=True,
    is_targeted=False,
    is_hidden=False,
    departments=[
        CouponDepartment(
            category_id="PROD001",
            category_name="Produce",
            sub_category_id="PROD001_FRUIT",
            sub_category_name="Fresh Fruits",
            offer_count_sub_category=15,
            offer_count_department=45
        )
    ],
    category=CouponCategory(
        segment_id="FRUIT_SEG",
        segment_name="Fresh Fruits"
    )
)

milk_coupon = MeijerCoupon(
    meijer_offer_id=1002,
    title="20% off Milk",
    description="Save 20% on any milk product",
    image_url="https://example.com/milk_coupon.jpg",
    disclaimer="Valid on all milk varieties",
    hat_color=HatColor.RED,
    border_color=BorderColor.BLUE,
    redemption_start_date=datetime.now(),
    redemption_end_date=datetime.now() + timedelta(days=14),
    redeem_amount=None,
    condition_value=20.0,
    discount_type_id=2,
    discount_level_id=2,
    condition_type_id=1,
    is_clipped=True,
    is_suggested=False,
    is_targeted=True,
    is_hidden=False,
    departments=[
        CouponDepartment(
            category_id="DAIRY001",
            category_name="Dairy",
            sub_category_id="DAIRY001_MILK",
            sub_category_name="Milk & Dairy",
            offer_count_sub_category=8,
            offer_count_department=32
        )
    ],
    category=CouponCategory(
        segment_id="DAIRY_SEG",
        segment_name="Dairy Products"
    )
)

print("✅ Sample Coupons Created:")
print(f"\\n1. Banana Coupon:")
print(f"  Offer ID: {banana_coupon.meijer_offer_id}")
print(f"  Title: {banana_coupon.title}")
print(f"  Description: {banana_coupon.description}")
print(f"  Redeem Amount: {banana_coupon.formatted_discount}")
print(f"  Hat Color: {banana_coupon.hat_color.name}")
print(f"  Border Color: {banana_coupon.border_color.name}")
print(f"  Is Clipped: {banana_coupon.is_clipped}")
print(f"  Is Suggested: {banana_coupon.is_suggested}")
print(f"  Is Expired: {banana_coupon.is_expired}")
print(f"  Departments: {len(banana_coupon.departments)}")

print(f"\\n2. Milk Coupon:")
print(f"  Offer ID: {milk_coupon.meijer_offer_id}")
print(f"  Title: {milk_coupon.title}")
print(f"  Description: {milk_coupon.description}")
print(f"  Redeem Amount: {milk_coupon.formatted_discount}")
print(f"  Hat Color: {milk_coupon.hat_color.name}")
print(f"  Border Color: {milk_coupon.border_color.name}")
print(f"  Is Clipped: {milk_coupon.is_clipped}")
print(f"  Is Suggested: {milk_coupon.is_suggested}")
print(f"  Is Expired: {milk_coupon.is_expired}")
print(f"  Departments: {len(milk_coupon.departments)}")

# Test coupon properties
print(f"\\n🔍 Coupon Properties:")
print("=" * 25)

coupons = [banana_coupon, milk_coupon]

for i, coupon in enumerate(coupons, 1):
    print(f"\\nCoupon {i} Properties:")
    print(f"  Formatted Discount: {coupon.formatted_discount}")
    print(f"  Is Expired: {coupon.is_expired}")
    print(f"  Days Until Expiry: {(coupon.redemption_end_date - datetime.now()).days}")
    print(f"  Has Image: {coupon.image_url is not None}")
    print(f"  Has Disclaimer: {coupon.disclaimer is not None}")
    print(f"  Department Count: {len(coupon.departments)}")

# Test coupon operations (without client)
print(f"\\n⚠️ Coupon Operations (No Client):")
print("=" * 40)

try:
    # This will fail without a client
    banana_coupon.clip()
    print("✅ Coupon clipped successfully")
except ValueError as e:
    print(f"❌ Coupon clip failed (expected): {e}")

try:
    # This will fail without a client
    milk_coupon.unclip()
    print("✅ Coupon unclipped successfully")
except ValueError as e:
    print(f"❌ Coupon unclip failed (expected): {e}")

# Coupon statistics
print(f"\\n📊 Coupon Statistics:")
print("=" * 30)
print(f"Total Coupons: {len(coupons)}")
print(f"Clipped Coupons: {sum(1 for c in coupons if c.is_clipped)}")
print(f"Suggested Coupons: {sum(1 for c in coupons if c.is_suggested)}")
print(f"Targeted Coupons: {sum(1 for c in coupons if c.is_targeted)}")
print(f"Hidden Coupons: {sum(1 for c in coupons if c.is_hidden)}")
print(f"Expired Coupons: {sum(1 for c in coupons if c.is_expired)}")

# Visual analysis
print(f"\\n🎨 Visual Analysis:")
print("=" * 25)
hat_colors = [c.hat_color.name for c in coupons]
border_colors = [c.border_color.name for c in coupons]

print(f"Hat Colors: {', '.join(set(hat_colors))}")
print(f"Border Colors: {', '.join(set(border_colors))}")""")

    # Utility functions section
    utility_section = nbf.v4.new_markdown_cell("""## Utility Functions

The module provides utility functions for creating coupons from API responses and managing coupon operations.

### Coupon Creation and Management
""")

    utility_example = nbf.v4.new_code_cell("""# Utility functions demonstration
print("🛠️ Utility Functions Demo")
print("=" * 30)

# Test coupon creation from response data
print("📋 Creating Coupons from Response Data:")
print("-" * 40)

# Sample API response data
sample_response = {
    "listOfCoupons": [
        {
            "offer": {
                "meijerOfferId": 2001,
                "title": "Sample Coupon 1",
                "description": "A sample coupon for testing",
                "imageUrl": "https://example.com/sample1.jpg",
                "disclaimer": "Sample disclaimer",
                "redemptionStartDate": datetime.now().isoformat(),
                "redemptionEndDate": (datetime.now() + timedelta(days=7)).isoformat(),
                "redeemAmount": 1.50,
                "conditionValue": 10.00,
                "discountTypeId": 1,
                "discountLevelId": 1,
                "conditionTypeId": 1,
                "hatColor": 1,
                "borderColor": 2
            },
            "isClipped": False,
            "isSuggested": True,
            "isTargeted": False,
            "isHidden": False
        },
        {
            "offer": {
                "meijerOfferId": 2002,
                "title": "Sample Coupon 2",
                "description": "Another sample coupon",
                "imageUrl": "https://example.com/sample2.jpg",
                "disclaimer": "Another disclaimer",
                "redemptionStartDate": datetime.now().isoformat(),
                "redemptionEndDate": (datetime.now() + timedelta(days=14)).isoformat(),
                "redeemAmount": None,
                "conditionValue": 15.0,
                "discountTypeId": 2,
                "discountLevelId": 2,
                "conditionTypeId": 1,
                "hatColor": 2,
                "borderColor": 1
            },
            "isClipped": True,
            "isSuggested": False,
            "isTargeted": True,
            "isHidden": False
        }
    ]
}

try:
    # Create coupons from response
    created_coupons = create_meijer_coupons_from_response(sample_response)
    print(f"✅ Successfully created {len(created_coupons)} coupons from response")

    # Display created coupons
    for i, coupon in enumerate(created_coupons, 1):
        print(f"\\nCoupon {i}:")
        print(f"  Offer ID: {coupon.meijer_offer_id}")
        print(f"  Title: {coupon.title}")
        print(f"  Description: {coupon.description}")
        print(f"  Redeem Amount: {coupon.formatted_discount}")
        print(f"  Hat Color: {coupon.hat_color.name}")
        print(f"  Border Color: {coupon.border_color.name}")
        print(f"  Is Clipped: {coupon.is_clipped}")
        print(f"  Is Suggested: {coupon.is_suggested}")
        print(f"  Is Targeted: {coupon.is_targeted}")
        print(f"  Is Hidden: {coupon.is_hidden}")
        print(f"  Is Expired: {coupon.is_expired}")

except Exception as e:
    print(f"❌ Coupon creation failed: {e}")

# Test different response formats
print(f"\\n🔄 Testing Different Response Formats:")
print("=" * 40)

# Format 1: Direct offers
direct_response = {
    "offers": [
        {
            "meijerOfferId": 3001,
            "title": "Direct Offer",
            "description": "Direct offer format",
            "isClipped": False,
            "isSuggested": True,
            "hatColor": 0,
            "borderColor": 0
        }
    ]
}

# Format 2: Data wrapper
data_response = {
    "data": [
        {
            "meijerOfferId": 3002,
            "title": "Data Wrapped Offer",
            "description": "Data wrapper format",
            "isClipped": True,
            "isSuggested": False,
            "hatColor": 1,
            "borderColor": 1
        }
    ]
}

# Format 3: Coupons wrapper
coupons_response = {
    "coupons": [
        {
            "meijerOfferId": 3003,
            "title": "Coupons Wrapped Offer",
            "description": "Coupons wrapper format",
            "isClipped": False,
            "isSuggested": True,
            "hatColor": 2,
            "borderColor": 2
        }
    ]
}

response_formats = [
    ("Direct Offers", direct_response),
    ("Data Wrapper", data_response),
    ("Coupons Wrapper", coupons_response)
]

for format_name, response_data in response_formats:
    try:
        coupons = create_meijer_coupons_from_response(response_data)
        print(f"✅ {format_name}: {len(coupons)} coupons created")
    except Exception as e:
        print(f"❌ {format_name}: Failed - {e}")

# Test empty and invalid responses
print(f"\\n🚫 Testing Edge Cases:")
print("=" * 25)

# Empty response
empty_response = {}
empty_coupons = create_meijer_coupons_from_response(empty_response)
print(f"Empty response: {len(empty_coupons)} coupons created")

# None response
none_coupons = create_meijer_coupons_from_response(None)
print(f"None response: {len(none_coupons)} coupons created")

# Invalid response structure
invalid_response = {"invalid": "data"}
invalid_coupons = create_meijer_coupons_from_response(invalid_response)
print(f"Invalid response: {len(invalid_coupons)} coupons created")""")

    # MeijerCouponManager section
    manager_section = nbf.v4.new_markdown_cell("""## MeijerCouponManager Class

The `MeijerCouponManager` class provides the interface that the main client expects for managing coupons and offers.

### Manager Functionality
""")

    manager_example = nbf.v4.new_code_cell("""# MeijerCouponManager demonstration
print("👨‍💼 MeijerCouponManager Demo")
print("=" * 35)

# Create a mock client for demonstration
class MockMeijerClient:
    def __init__(self):
        self.logger = type('MockLogger', (), {
            'info': lambda msg: print(f"INFO: {msg}"),
            'debug': lambda msg: print(f"DEBUG: {msg}"),
            'error': lambda msg: print(f"ERROR: {msg}")
        })()

    def _ensure_authenticated(self):
        return True

    def _get_api_headers(self):
        return {"Authorization": "Bearer mock_token"}

    def _make_request(self, method, url, headers=None, json_data=None):
        # Mock successful response
        class MockResponse:
            def __init__(self):
                self.status_code = 200

            def json(self):
                return {"result": "success"}

        return MockResponse()

# Create manager with mock client
mock_client = MockMeijerClient()
coupon_manager = MeijerCouponManager(mock_client)

print("✅ Coupon Manager Created:")
print(f"  Manager Type: {type(coupon_manager).__name__}")
print(f"  Client: {type(coupon_manager.meijer_client).__name__}")
print(f"  Logger: {type(coupon_manager.logger).__name__}")

# Test manager methods
print(f"\\n🔧 Manager Methods:")
print("=" * 25)

# Test create_meijer_coupons_from_response
print("📋 Testing create_meijer_coupons_from_response:")
try:
    manager_coupons = coupon_manager.create_meijer_coupons_from_response(sample_response)
    print(f"✅ Manager created {len(manager_coupons)} coupons")
except Exception as e:
    print(f"❌ Manager coupon creation failed: {e}")

# Test clip_coupon
print(f"\\n✂️ Testing clip_coupon:")
try:
    clip_result = coupon_manager.clip_coupon(1001)
    print(f"✅ Coupon clip result: {clip_result}")
except Exception as e:
    print(f"❌ Coupon clip failed: {e}")

# Test unclip_coupon
print(f"\\n🔓 Testing unclip_coupon:")
try:
    unclip_result = coupon_manager.unclip_coupon(1001)
    print(f"✅ Coupon unclip result: {unclip_result}")
except Exception as e:
    print(f"❌ Coupon unclip failed: {e}")

# Test manager with different coupon IDs
print(f"\\n🔄 Testing Multiple Coupon Operations:")
print("=" * 40)

test_coupon_ids = [1001, 1002, 1003, 1004, 1005]

for coupon_id in test_coupon_ids:
    try:
        clip_result = coupon_manager.clip_coupon(coupon_id)
        print(f"Clip {coupon_id}: {'✅ Success' if clip_result else '❌ Failed'}")
    except Exception as e:
        print(f"Clip {coupon_id}: ❌ Error - {e}")

# Manager statistics
print(f"\\n📊 Manager Statistics:")
print("=" * 25)
print(f"Manager Type: {type(coupon_manager).__name__}")
print(f"Client Type: {type(coupon_manager.meijer_client).__name__}")
print(f"Logger Type: {type(coupon_manager.logger).__name__}")

# Test manager integration
print(f"\\n🔗 Manager Integration Test:")
print("=" * 35)

try:
    # Test the complete flow
    print("1. Creating coupons from response...")
    test_coupons = coupon_manager.create_meijer_coupons_from_response(sample_response)
    print(f"   ✅ Created {len(test_coupons)} coupons")

    print("2. Testing coupon operations...")
    for coupon in test_coupons[:2]:  # Test first 2 coupons
        print(f"   Testing coupon {coupon.meijer_offer_id}...")

        # Test clip
        clip_success = coupon_manager.clip_coupon(coupon.meijer_offer_id)
        print(f"     Clip: {'✅ Success' if clip_success else '❌ Failed'}")

        # Test unclip
        unclip_success = coupon_manager.unclip_coupon(coupon.meijer_offer_id)
        print(f"     Unclip: {'✅ Success' if unclip_success else '❌ Failed'}")

    print("3. Integration test completed successfully!")

except Exception as e:
    print(f"❌ Integration test failed: {e}")""")

    # Summary section
    summary_section = nbf.v4.new_markdown_cell("""## Summary

This notebook has demonstrated the comprehensive Meijer coupon management system:

✅ **Visual Elements**: HatColor and BorderColor enums for coupon appearance
✅ **CouponDepartment**: Department and category organization
✅ **CouponCategory**: Category and segment information
✅ **CouponCondition**: Earning conditions and requirements
✅ **CouponReward**: Reward details and discount information
✅ **MeijerCoupon**: Main coupon class with clipping functionality
✅ **MeijerCouponManager**: Manager class for coupon operations
✅ **Utility Functions**: Helper functions for coupon creation and management

### Key Features

- **Comprehensive Representation**: All discovered coupon fields from API analysis
- **Visual Customization**: Hat colors and border colors for coupon appearance
- **Status Management**: Clipping, suggestion, targeting, and visibility flags
- **Category Organization**: Department and category-based organization
- **Condition Handling**: Earning conditions and requirements
- **Reward Details**: Discount types, levels, and amounts
- **API Integration**: Direct integration with Meijer's coupon endpoints
- **Error Handling**: Robust error handling and logging

### Coupon Lifecycle

1. **Creation**: Coupons created from API responses
2. **Display**: Visual elements and status flags set
3. **Management**: Clipping, unclipping, and status updates
4. **Organization**: Department and category classification
5. **Expiration**: Automatic expiration checking and handling

### Next Steps

- Explore the other modules in the Meijer package
- Learn about shopping list and search functionality
- Discover store location and mPerks features
- Understand the complete API workflow

The coupon system provides a powerful and flexible foundation for managing Meijer offers and promotions! 🚀
""")

    # Add all cells to notebook
    nb.cells = [
        title_cell,
        import_cell,
        enums_section,
        enums_example,
        rich_jupyter_section,
        rich_coupon_demo,
        department_section,
        department_example,
        category_section,
        category_example,
        condition_section,
        condition_example,
        reward_section,
        reward_example,
        meijer_coupon_section,
        meijer_coupon_example,
        utility_section,
        utility_example,
        manager_section,
        manager_example,
        summary_section,
    ]

    # Save notebook
    with open("coupons.ipynb", "w") as f:
        nbf.write(nb, f)

    print("✅ coupons.ipynb created successfully!")


if __name__ == "__main__":
    create_coupons_notebook()
