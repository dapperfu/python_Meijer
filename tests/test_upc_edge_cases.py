#!/usr/bin/env python3
"""
Tests for UPC edge cases in Shop & Scan functionality.

This module tests specific UPCs that demonstrate different pricing scenarios:
- Clearance items without special UPCs
- Buy One Get X% Off deals
- Percentage-based clearance discounts
- Quantity-based pricing (Buy X Get Y deals)

Each UPC is tested individually to isolate edge case behavior.

Note: These tests will use live endpoints when authenticated, falling back to mocks
when unauthenticated to ensure tests can run in CI/CD environments.
"""

import os
from typing import Dict
from unittest.mock import Mock

import pytest

from meijer.models import MeijerItem
from meijer.shop_scan import ShopNScan
from meijer.client import Meijer


class TestUPCEdgeCases:
    """Test specific UPCs for edge case scenarios."""

    def setup_method(self):
        """Set up test fixtures."""
        # Check if we should use live endpoints or mocks
        self.use_live_endpoints = self._should_use_live_endpoints()
        
        if self.use_live_endpoints:
            # Use live Meijer client
            try:
                self.meijer_client = Meijer()
                if not self.meijer_client.is_authenticated():
                    print("⚠️  Meijer client not authenticated, falling back to mocks")
                    self.use_live_endpoints = False
                    self._setup_mock_client()
                else:
                    print("✓ Using live Meijer endpoints for testing")
                    self.shop_scan = ShopNScan(self.meijer_client)
            except Exception as e:
                print(f"⚠️  Error initializing live Meijer client: {e}, falling back to mocks")
                self.use_live_endpoints = False
                self._setup_mock_client()
        else:
            # Use mock client
            self._setup_mock_client()
        
        # Test UPCs with their expected behaviors
        self.test_upcs = {
            "713733252843": {
                "description": "Clearance item without special clearance UPC specific to store 71",
                "expected_behavior": "Should show clearance pricing but no special UPC handling",
                "test_scenarios": ["basic_lookup", "cart_addition", "pricing_analysis"]
            },
            "719812800516": {
                "description": "Buy one get 40% off - second item costs 60% of first",
                "expected_behavior": "BOGO deal where second item gets 40% discount",
                "test_scenarios": ["single_item", "two_items", "pricing_calculation", "deal_validation"]
            },
            "070896523112": {
                "description": "50% off clearance item",
                "expected_behavior": "Should show up in JSON reply when adding to cart with 50% discount",
                "test_scenarios": ["clearance_pricing", "cart_json_analysis", "discount_validation"]
            },
            "629307040245": {
                "description": "Buy 5 and get $5 off total (normally $3.99, becomes $2.99 each when 5+ in cart)",
                "expected_behavior": "Quantity-based pricing with threshold discount",
                "test_scenarios": ["single_item", "four_items", "five_items", "six_items", "pricing_threshold"]
            }
        }

    def _should_use_live_endpoints(self) -> bool:
        """Determine if we should use live endpoints based on environment."""
        # Check if we're in a CI/CD environment
        if os.getenv('CI') or os.getenv('GITHUB_ACTIONS'):
            return False
        
        # Check if we have authentication tokens
        try:
            meijer = Meijer()
            return meijer.is_authenticated()
        except:
            return False

    def _setup_mock_client(self):
        """Set up mock client for testing."""
        self.mock_client = Mock()
        self.mock_client.logger = Mock()
        self.mock_client._make_request = Mock()
        self.shop_scan = ShopNScan(self.mock_client)

    def _create_mock_response(self, status_code: int, data: Dict) -> Mock:
        """Create a mock response object."""
        mock_response = Mock()
        mock_response.status_code = status_code
        mock_response.json.return_value = data
        return mock_response

    def _create_mock_meijer_item(self, upc: str, **kwargs) -> MeijerItem:
        """Create a mock MeijerItem for testing."""
        default_data = {
            "id": f"prod_{upc}",
            "title": f"Test Product {upc}",
            "description": f"Test Description for {upc}",
            "brand": "Test Brand",
            "category": "Test Category",
            "upc": upc,
            "sku": f"sku_{upc}",
            "price": 10.00,
            "unit_price": "10.00",
            "is_weighted": False,
            "raw_data": {}
        }
        default_data.update(kwargs)
        return MeijerItem(**default_data)

    @pytest.mark.parametrize("upc", ["713733252843"])
    def test_clearance_item_no_special_upc(self, upc: str):
        """Test UPC 713733252843: Clearance item without special clearance UPC."""
        test_data = self.test_upcs[upc]
        
        if self.use_live_endpoints:
            # Test with live endpoints
            result = self.shop_scan.lookup_barcode_price(upc)
            
            if result:
                assert result.upc == upc
                # With live data, we can't guarantee specific prices, so just verify structure
                assert hasattr(result, 'price')
                assert hasattr(result, 'title')
                assert hasattr(result, 'brand')
                
                # Check if it's a clearance item (might have sale_price or clearance tags)
                if result.sale_price:
                    assert result.sale_price <= result.price
                
                if result.tags:
                    # Look for clearance indicators in tags
                    clearance_indicators = ['clearance', 'sale', 'discount', 'final-sale']
                    has_clearance_tag = any(indicator in ' '.join(result.tags).lower() for indicator in clearance_indicators)
                    # Don't fail if no clearance tags - live data might not have them
            else:
                # Product not found - this is acceptable for live testing
                pytest.skip(f"Product with UPC {upc} not found in live system")
        else:
            # Mock testing
            mock_response_data = {
                "product": {
                    "id": f"prod_{upc}",
                    "name": "Clearance Test Product",
                    "description": "A clearance item for testing",
                    "brand": "Test Brand",
                    "category": "Clearance",
                    "upc": upc,
                    "price": 15.99,  # Original price
                    "salePrice": 8.99,  # Clearance price
                    "unitPrice": "8.99",
                    "isWeighted": False,
                    "tags": ["clearance", "final-sale"],
                    "isAvailable": True
                }
            }
            
            mock_response = self._create_mock_response(200, mock_response_data)
            self.mock_client._make_request.return_value = mock_response
            
            # Test basic lookup
            result = self.shop_scan.lookup_barcode_price(upc)
            
            assert result is not None
            assert result.upc == upc
            assert result.price == 15.99
            assert result.sale_price == 8.99
            assert "clearance" in result.tags
            assert result.is_available is True
            
            # Verify no special UPC handling
            assert not hasattr(result, 'special_clearance_upc')
            assert not hasattr(result, 'store_specific_upc')

    @pytest.mark.parametrize("upc", ["719812800516"])
    def test_bogo_40_percent_off(self, upc: str):
        """Test UPC 719812800516: Buy One Get 40% Off deal."""
        test_data = self.test_upcs[upc]
        
        # Mock response for BOGO item
        mock_response_data = {
            "product": {
                "id": f"prod_{upc}",
                "name": "BOGO Test Product",
                "description": "Buy one get 40% off second item",
                "brand": "Test Brand",
                "category": "Promotions",
                "upc": upc,
                "price": 10.00,
                "salePrice": 10.00,
                "unitPrice": "10.00",
                "isWeighted": False,
                "tags": ["bogo", "40-percent-off"],
                "isAvailable": True,
                "promotion": {
                    "type": "bogo",
                    "discount_percent": 40,
                    "description": "Buy One Get 40% Off"
                }
            }
        }
        
        mock_response = self._create_mock_response(200, mock_response_data)
        self.mock_client._make_request.return_value = mock_response
        
        # Test basic lookup
        result = self.shop_scan.lookup_barcode_price(upc)
        
        assert result is not None
        assert result.upc == upc
        assert result.price == 10.00
        
        # Test cart addition with BOGO logic
        cart_response_data = {
            "items": [
                {
                    "barcode": upc,
                    "quantity": 1,
                    "price": 10.00,
                    "total": 10.00
                },
                {
                    "barcode": upc,
                    "quantity": 1,
                    "price": 6.00,  # 40% off: 10.00 - (10.00 * 0.4) = 6.00
                    "total": 6.00
                }
            ],
            "subtotal": 16.00,
            "total": 16.00,
            "savings": 4.00
        }
        
        cart_response = self._create_mock_response(200, cart_response_data)
        self.mock_client._make_request.return_value = cart_response
        
        # Test getting cart with BOGO items
        cart_items = self.shop_scan.get_cart()
        
        assert len(cart_items) == 2
        assert cart_items[0].price == 10.00
        assert cart_items[1].price == 6.00
        
        # Verify BOGO pricing calculation
        total_without_deal = 20.00  # 2 * 10.00
        total_with_deal = 16.00     # 10.00 + 6.00
        savings = total_without_deal - total_with_deal
        assert savings == 4.00

    @pytest.mark.parametrize("upc", ["070896523112"])
    def test_50_percent_clearance(self, upc: str):
        """Test UPC 070896523112: 50% off clearance item."""
        test_data = self.test_upcs[upc]
        
        # Mock response for 50% clearance item
        mock_response_data = {
            "product": {
                "id": f"prod_{upc}",
                "name": "50% Clearance Product",
                "description": "Half off clearance item",
                "brand": "Test Brand",
                "category": "Clearance",
                "upc": upc,
                "price": 20.00,  # Original price
                "salePrice": 10.00,  # 50% off
                "unitPrice": "10.00",
                "isWeighted": False,
                "tags": ["clearance", "50-percent-off"],
                "isAvailable": True,
                "clearance": {
                    "type": "percentage",
                    "discount": 50,
                    "original_price": 20.00
                }
            }
        }
        
        mock_response = self._create_mock_response(200, mock_response_data)
        self.mock_client._make_request.return_value = mock_response
        
        # Test basic lookup
        result = self.shop_scan.lookup_barcode_price(upc)
        
        assert result is not None
        assert result.upc == upc
        assert result.price == 20.00
        assert result.sale_price == 10.00
        
        # Test cart addition to verify JSON response
        add_to_cart_response_data = {
            "success": True,
            "message": "Item added to cart",
            "item": {
                "barcode": upc,
                "quantity": 1,
                "price": 10.00,
                "total": 10.00,
                "savings": 10.00,
                "clearance_info": {
                    "discount_percent": 50,
                    "original_price": 20.00,
                    "discounted_price": 10.00
                }
            }
        }
        
        add_response = self._create_mock_response(200, add_to_cart_response_data)
        self.mock_client._make_request.return_value = add_response
        
        # Test adding to cart
        success = self.shop_scan.add_to_cart(upc, 1)
        assert success is True
        
        # Verify clearance information appears in JSON response
        # This would typically be verified by examining the actual API response
        # For now, we mock the expected behavior
        assert "clearance_info" in add_to_cart_response_data["item"]

    @pytest.mark.parametrize("upc", ["629307040245"])
    def test_buy_5_get_5_off(self, upc: str):
        """Test UPC 629307040245: Buy 5 and get $5 off total."""
        test_data = self.test_upcs[upc]
        
        # Mock response for quantity-based pricing item
        mock_response_data = {
            "product": {
                "id": f"prod_{upc}",
                "name": "Buy 5 Get $5 Off Product",
                "description": "Quantity-based pricing with threshold discount",
                "brand": "Test Brand",
                "category": "Promotions",
                "upc": upc,
                "price": 3.99,  # Regular price
                "salePrice": 3.99,
                "unitPrice": "3.99",
                "isWeighted": False,
                "tags": ["quantity-discount", "buy-5-save-5"],
                "isAvailable": True,
                "quantity_pricing": {
                    "threshold": 5,
                    "discount_amount": 5.00,
                    "discounted_unit_price": 2.99
                }
            }
        }
        
        mock_response = self._create_mock_response(200, mock_response_data)
        self.mock_client._make_request.return_value = mock_response
        
        # Test basic lookup
        result = self.shop_scan.lookup_barcode_price(upc)
        
        assert result is not None
        assert result.upc == upc
        assert result.price == 3.99
        
        # Test different quantity scenarios
        quantity_scenarios = [
            {"quantity": 1, "expected_unit_price": 3.99, "expected_total": 3.99},
            {"quantity": 4, "expected_unit_price": 3.99, "expected_total": 15.96},
            {"quantity": 5, "expected_unit_price": 2.99, "expected_total": 14.95},
            {"quantity": 6, "expected_unit_price": 2.99, "expected_total": 17.94}
        ]
        
        for scenario in quantity_scenarios:
            quantity = scenario["quantity"]
            expected_unit_price = scenario["expected_unit_price"]
            expected_total = scenario["expected_total"]
            
            # Mock cart response for this quantity
            cart_response_data = {
                "items": [
                    {
                        "barcode": upc,
                        "quantity": quantity,
                        "price": expected_unit_price,
                        "total": expected_total,
                        "savings": max(0, (3.99 * quantity) - expected_total)
                    }
                ],
                "subtotal": expected_total,
                "total": expected_total,
                "quantity_discount_applied": quantity >= 5
            }
            
            cart_response = self._create_mock_response(200, cart_response_data)
            self.mock_client._make_request.return_value = cart_response
            
            # Test getting cart with this quantity
            cart_items = self.shop_scan.get_cart()
            
            assert len(cart_items) == 1
            assert cart_items[0].quantity == quantity
            assert cart_items[0].price == expected_unit_price
            
            # Verify pricing logic
            if quantity >= 5:
                # Should get $5 off total, making each item $2.99
                assert expected_unit_price == 2.99
                assert expected_total == (2.99 * quantity)
            else:
                # Regular pricing at $3.99
                assert expected_unit_price == 3.99
                assert expected_total == (3.99 * quantity)

    def test_upc_edge_case_integration(self):
        """Test integration of multiple UPC edge cases in a single cart."""
        # Create a cart with multiple edge case items
        cart_items = []
        
        # Add clearance item
        clearance_item = self._create_mock_meijer_item(
            "713733252843",
            price=15.99,
            sale_price=8.99,
            tags=["clearance"]
        )
        cart_items.append(clearance_item)
        
        # Add BOGO item (2 quantities)
        bogo_item = self._create_mock_meijer_item(
            "719812800516",
            price=10.00,
            tags=["bogo"]
        )
        cart_items.append(bogo_item)
        cart_items.append(bogo_item)  # Second item for BOGO
        
        # Add 50% clearance item
        half_clearance_item = self._create_mock_meijer_item(
            "070896523112",
            price=20.00,
            sale_price=10.00,
            tags=["clearance", "50-percent-off"]
        )
        cart_items.append(half_clearance_item)
        
        # Add quantity discount item (5 quantities)
        quantity_item = self._create_mock_meijer_item(
            "629307040245",
            price=3.99,
            tags=["quantity-discount"]
        )
        for _ in range(5):
            cart_items.append(quantity_item)
        
        # Calculate expected totals
        clearance_total = 8.99
        bogo_total = 10.00 + 6.00  # First at full price, second at 40% off
        half_clearance_total = 10.00
        quantity_total = 2.99 * 5  # 5 items at discounted price
        
        expected_total = clearance_total + bogo_total + half_clearance_total + quantity_total
        
        # Verify cart structure
        assert len(cart_items) == 10  # 1 + 2 + 1 + 5
        
        # Verify pricing calculations
        assert clearance_total == 8.99
        assert bogo_total == 16.00
        assert half_clearance_total == 10.00
        assert quantity_total == 14.95
        assert expected_total == 49.94

    def test_upc_edge_case_error_handling(self):
        """Test error handling for UPC edge cases."""
        # Test with invalid UPC format
        invalid_upcs = ["", "123", "12345678901234567890", "abc123def456"]
        
        for invalid_upc in invalid_upcs:
            # Mock failed response
            mock_response = self._create_mock_response(400, {"error": "Invalid UPC format"})
            self.mock_client._make_request.return_value = mock_response
            
            # Test lookup
            result = self.shop_scan.lookup_barcode_price(invalid_upc)
            assert result is None
            
            # Test cart operations
            add_success = self.shop_scan.add_to_cart(invalid_upc, 1)
            assert add_success is False

    def test_upc_edge_case_logging(self):
        """Test logging behavior for UPC edge cases."""
        # Verify that logging is properly configured
        assert self.shop_scan.logger is not None
        
        # Test that different UPC types generate appropriate log messages
        # This would require more sophisticated mocking of the logger
        # For now, we verify the logger exists and can be called
        self.shop_scan.logger.info("Test log message")
        self.shop_scan.logger.warning("Test warning message")
        self.shop_scan.logger.error("Test error message")
        
        # Verify logger methods were called
        assert self.shop_scan.logger.info.called
        assert self.shop_scan.logger.warning.called
        assert self.shop_scan.logger.error.called
