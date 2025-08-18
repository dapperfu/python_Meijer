#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Restore shop_n_scan_faker.py mitmproxy script for traffic analysis
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python mitmproxy script with full typing
 * - Dependencies: mitmproxy, typing, logging
 */

Shop & Scan Traffic Analyzer for Meijer API

This mitmproxy script analyzes Shop & Scan related traffic and provides
real-time insights into barcode scanning, cart operations, and product lookups.

Usage:
    mitmweb -s shop_n_scan_faker.py
    make log  # Uses this script automatically
"""

import json
import logging
from typing import Any, Dict, List, Optional, Set
from datetime import datetime
from urllib.parse import urlparse, parse_qs

from mitmproxy import ctx
from mitmproxy.http import HTTPFlow


class ShopNScanAnalyzer:
    """
    Analyzes Shop & Scan traffic for Meijer API.
    
    This script provides real-time analysis of:
    - Barcode lookups and product scans
    - Cart operations (add/remove items)
    - Product pricing and availability
    - Shop & Scan API endpoints
    """

    def __init__(self):
        """Initialize the Shop & Scan analyzer."""
        # Shop & Scan specific data
        self.shop_scan_flows: List[Dict[str, Any]] = []
        self.barcode_lookups: Dict[str, Dict[str, Any]] = {}
        self.cart_operations: List[Dict[str, Any]] = []
        self.product_prices: Dict[str, Dict[str, Any]] = {}
        
        # API endpoint tracking
        self.shop_scan_endpoints: Set[str] = set()
        self.cart_endpoints: Set[str] = set()
        self.product_endpoints: Set[str] = set()
        
        # Statistics
        self.total_flows = 0
        self.meijer_flows = 0
        self.shop_scan_flows_count = 0
        
        # Setup logging
        logging.basicConfig(level=logging.INFO)
        self.logger = logging.getLogger(__name__)
        
        ctx.log.info("🚀 Shop & Scan Analyzer initialized")

    def request(self, flow: HTTPFlow) -> None:
        """
        Called when a request is made.
        
        Args:
            flow: The HTTP flow object containing request details
        """
        self.total_flows += 1
        
        # Check if this is a Meijer-related request
        if self._is_meijer_request(flow):
            self.meijer_flows += 1
            self._analyze_meijer_request(flow)
            
            # Check if it's Shop & Scan related
            if self._is_shop_scan_request(flow):
                self.shop_scan_flows_count += 1
                self._analyze_shop_scan_request(flow)

    def response(self, flow: HTTPFlow) -> None:
        """
        Called when a response is received.
        
        Args:
            flow: The HTTP flow object containing response details
        """
        if self._is_meijer_request(flow) and self._is_shop_scan_request(flow):
            self._analyze_shop_scan_response(flow)

    def _is_meijer_request(self, flow: HTTPFlow) -> bool:
        """
        Check if a flow is related to Meijer services.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            True if it's a Meijer-related request
        """
        meijer_patterns = [
            "meijer.com",
            "api.meijer.com",
            "digital.meijer.com",
            "loyalty.meijer.com",
            "sstats.meijer.com",
        ]
        
        host = flow.request.pretty_host
        return any(pattern in host for pattern in meijer_patterns)

    def _is_shop_scan_request(self, flow: HTTPFlow) -> bool:
        """
        Check if a flow is related to Shop & Scan functionality.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            True if it's Shop & Scan related
        """
        shop_scan_patterns = [
            "shopandscan",
            "shop-and-scan",
            "barcode",
            "scan",
            "cart",
            "lookup",
            "item",
        ]
        
        url = flow.request.pretty_url.lower()
        path = flow.request.path.lower()
        
        return any(pattern in url or pattern in path for pattern in shop_scan_patterns)

    def _analyze_meijer_request(self, flow: HTTPFlow) -> None:
        """
        Analyze a Meijer request flow.
        
        Args:
            flow: The HTTP flow object
        """
        request_info = {
            "timestamp": datetime.fromtimestamp(flow.request.timestamp_start).isoformat(),
            "method": flow.request.method,
            "url": flow.request.pretty_url,
            "host": flow.request.pretty_host,
            "path": flow.request.path,
            "headers": dict(flow.request.headers),
            "query_params": dict(flow.request.query),
            "flow_id": flow.id,
        }
        
        # Extract request body if present
        if flow.request.content:
            try:
                request_info["body"] = flow.request.content.decode("utf-8", errors="ignore")
            except Exception:
                request_info["body"] = "<binary content>"
        
        # Track API endpoints
        self._track_endpoints(flow.request.path, flow.request.method)
        
        # Log interesting requests
        if self._is_interesting_request(flow):
            ctx.log.info(f"🔍 Interesting request: {flow.request.method} {flow.request.path}")

    def _analyze_shop_scan_request(self, flow: HTTPFlow) -> None:
        """
        Analyze a Shop & Scan specific request.
        
        Args:
            flow: The HTTP flow object
        """
        flow_info = {
            "timestamp": datetime.fromtimestamp(flow.request.timestamp_start).isoformat(),
            "method": flow.request.method,
            "url": flow.request.pretty_url,
            "path": flow.request.path,
            "flow_id": flow.id,
            "type": self._classify_shop_scan_request(flow),
        }
        
        # Extract barcode if present
        barcode = self._extract_barcode(flow)
        if barcode:
            flow_info["barcode"] = barcode
            self.barcode_lookups[barcode] = {
                "first_seen": flow_info["timestamp"],
                "requests": [],
                "responses": [],
            }
            self.barcode_lookups[barcode]["requests"].append(flow_info)
        
        # Extract cart operation details
        cart_op = self._extract_cart_operation(flow)
        if cart_op:
            flow_info["cart_operation"] = cart_op
            self.cart_operations.append(flow_info)
        
        self.shop_scan_flows.append(flow_info)
        
        ctx.log.info(f"🛒 Shop & Scan: {flow_info['type']} - {flow.request.path}")

    def _analyze_shop_scan_response(self, flow: HTTPFlow) -> None:
        """
        Analyze a Shop & Scan response.
        
        Args:
            flow: The HTTP flow object
        """
        if not flow.response:
            return
            
        response_info = {
            "timestamp": datetime.fromtimestamp(flow.response.timestamp_end).isoformat(),
            "status_code": flow.response.status_code,
            "headers": dict(flow.response.headers),
            "flow_id": flow.id,
        }
        
        # Extract response body
        if flow.response.content:
            try:
                response_text = flow.response.content.decode("utf-8", errors="ignore")
                response_info["body"] = response_text
                
                # Try to parse JSON for structured data
                try:
                    response_info["json"] = json.loads(response_text)
                    self._extract_product_info(response_info["json"], flow)
                except json.JSONDecodeError:
                    pass
                    
            except Exception:
                response_info["body"] = "<binary content>"
        
        # Update barcode lookup with response
        barcode = self._extract_barcode(flow)
        if barcode and barcode in self.barcode_lookups:
            self.barcode_lookups[barcode]["responses"].append(response_info)

    def _classify_shop_scan_request(self, flow: HTTPFlow) -> str:
        """
        Classify the type of Shop & Scan request.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            Classification string
        """
        path = flow.request.path.lower()
        
        if "lookup" in path or "scan" in path:
            return "barcode_lookup"
        elif "cart" in path:
            if "add" in path:
                return "cart_add"
            elif "remove" in path:
                return "cart_remove"
            elif "get" in path or "view" in path:
                return "cart_view"
            else:
                return "cart_operation"
        elif "price" in path:
            return "price_lookup"
        else:
            return "unknown"

    def _extract_barcode(self, flow: HTTPFlow) -> Optional[str]:
        """
        Extract barcode from request.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            Barcode string if found, None otherwise
        """
        # Check URL path
        path = flow.request.path
        if "/" in path:
            parts = path.split("/")
            for part in parts:
                if part.isdigit() and len(part) >= 10:  # Likely a barcode
                    return part
        
        # Check query parameters
        query_params = dict(flow.request.query)
        for key, value in query_params.items():
            if any(term in key.lower() for term in ["barcode", "upc", "sku", "code"]):
                if value.isdigit() and len(value) >= 10:
                    return value
        
        # Check request body
        if flow.request.content:
            try:
                body_text = flow.request.content.decode("utf-8", errors="ignore")
                # Look for barcode patterns in JSON or form data
                if "barcode" in body_text or "upc" in body_text:
                    # Simple extraction - could be enhanced with regex
                    import re
                    barcode_match = re.search(r'"barcode"?\s*:\s*"?(\d{10,})"?', body_text)
                    if barcode_match:
                        return barcode_match.group(1)
            except Exception:
                pass
        
        return None

    def _extract_cart_operation(self, flow: HTTPFlow) -> Optional[Dict[str, Any]]:
        """
        Extract cart operation details from request.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            Cart operation details if found, None otherwise
        """
        cart_op = {
            "operation": self._classify_shop_scan_request(flow),
            "timestamp": datetime.fromtimestamp(flow.request.timestamp_start).isoformat(),
        }
        
        # Extract quantity if present
        if flow.request.content:
            try:
                body_text = flow.request.content.decode("utf-8", errors="ignore")
                if "quantity" in body_text:
                    import re
                    qty_match = re.search(r'"quantity"?\s*:\s*(\d+)', body_text)
                    if qty_match:
                        cart_op["quantity"] = int(qty_match.group(1))
            except Exception:
                pass
        
        return cart_op

    def _extract_product_info(self, response_data: Dict[str, Any], flow: HTTPFlow) -> None:
        """
        Extract product information from response.
        
        Args:
            response_data: Parsed JSON response
            flow: The HTTP flow object
        """
        if isinstance(response_data, dict):
            # Look for product information
            product_info = {}
            
            # Common product fields
            product_fields = ["id", "title", "name", "price", "salePrice", "description"]
            for field in product_fields:
                if field in response_data:
                    product_info[field] = response_data[field]
            
            # Extract price information
            if "price" in response_data or "salePrice" in response_data:
                price_info = {
                    "regular_price": response_data.get("price"),
                    "sale_price": response_data.get("salePrice"),
                    "timestamp": datetime.fromtimestamp(flow.response.timestamp_end).isoformat(),
                    "url": flow.request.pretty_url,
                }
                
                # Use product ID or URL as key
                product_key = response_data.get("id") or flow.request.pretty_url
                if product_key:
                    self.product_prices[product_key] = price_info

    def _track_endpoints(self, path: str, method: str) -> None:
        """
        Track API endpoints by category.
        
        Args:
            path: Request path
            method: HTTP method
        """
        path_lower = path.lower()
        
        if any(term in path_lower for term in ["shopandscan", "shop-and-scan", "scan"]):
            self.shop_scan_endpoints.add(f"{method} {path}")
        elif "cart" in path_lower:
            self.cart_endpoints.add(f"{method} {path}")
        elif any(term in path_lower for term in ["product", "item", "lookup"]):
            self.product_endpoints.add(f"{method} {path}")

    def _is_interesting_request(self, flow: HTTPFlow) -> bool:
        """
        Check if a request is interesting for logging.
        
        Args:
            flow: The HTTP flow object
            
        Returns:
            True if the request should be logged
        """
        interesting_patterns = [
            "auth",
            "login",
            "token",
            "coupon",
            "mperks",
            "loyalty",
        ]
        
        url = flow.request.pretty_url.lower()
        return any(pattern in url for pattern in interesting_patterns)

    def done(self) -> None:
        """
        Called when the script is done (mitmweb shutdown).
        """
        ctx.log.info("📊 Shop & Scan Analysis Summary:")
        ctx.log.info(f"   Total flows analyzed: {self.total_flows}")
        ctx.log.info(f"   Meijer flows: {self.meijer_flows}")
        ctx.log.info(f"   Shop & Scan flows: {self.shop_scan_flows_count}")
        ctx.log.info(f"   Barcode lookups: {len(self.barcode_lookups)}")
        ctx.log.info(f"   Cart operations: {len(self.cart_operations)}")
        ctx.log.info(f"   Product prices tracked: {len(self.product_prices)}")
        
        # Log discovered endpoints
        if self.shop_scan_endpoints:
            ctx.log.info("   Shop & Scan endpoints:")
            for endpoint in sorted(self.shop_scan_endpoints):
                ctx.log.info(f"     {endpoint}")
        
        if self.cart_endpoints:
            ctx.log.info("   Cart endpoints:")
            for endpoint in sorted(self.cart_endpoints):
                ctx.log.info(f"     {endpoint}")


# Create analyzer instance
analyzer = ShopNScanAnalyzer()

# Export mitmproxy event handlers
def request(flow: HTTPFlow) -> None:
    """Handle HTTP request."""
    analyzer.request(flow)

def response(flow: HTTPFlow) -> None:
    """Handle HTTP response."""
    analyzer.response(flow)

def done() -> None:
    """Handle script completion."""
    analyzer.done()
