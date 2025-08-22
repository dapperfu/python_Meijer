#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Flask caching server for Meijer API to test locally
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask, Flask-CORS, Flask-Limiter, redis, requests
 */

Flask caching server for Meijer API.

This server acts as a local proxy/cache for the Meijer API,
allowing local testing and development without hitting the real API.
"""

import json
import logging
import os
import time
from datetime import datetime, timedelta
from typing import Any, Dict, List, Optional, Union
from urllib.parse import urlparse, parse_qs

import redis
import requests
from flask import Flask, request, jsonify, Response
from flask_cors import CORS
from flask_limiter import Limiter
from flask_limiter.util import get_remote_address
from dotenv import load_dotenv

# Load environment variables
load_dotenv()

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

# Initialize Flask app
app = Flask(__name__)
app.config['JSON_SORT_KEYS'] = False

# Enable CORS
CORS(app)

# Rate limiting
limiter = Limiter(
    app=app,
    key_func=get_remote_address,
    default_limits=["200 per day", "50 per hour"]
)

# Redis connection for caching
redis_client = None
try:
    redis_client = redis.Redis(
        host=os.getenv('REDIS_HOST', 'localhost'),
        port=int(os.getenv('REDIS_PORT', 6379)),
        db=int(os.getenv('REDIS_DB', 0)),
        decode_responses=True
    )
    redis_client.ping()
    logger.info("Connected to Redis")
except Exception as e:
    logger.warning(f"Redis not available: {e}")
    redis_client = None

# Configuration
MEIJER_API_BASE = "https://api.meijer.com"
SUBSCRIPTION_KEY = "a10bc58ac484478d9b3958b1742c3a03"
CACHE_TTL = int(os.getenv('CACHE_TTL', 300))  # 5 minutes default

# Common headers for Meijer API
DEFAULT_HEADERS = {
    'User-Agent': 'Meijer/102800000',
    'Accept': 'application/json',
    'Ocp-Apim-Subscription-Key': SUBSCRIPTION_KEY,
    'Content-Type': 'application/json'
}


def get_cache_key(endpoint: str, params: Dict[str, Any] = None) -> str:
    """
    Generate a cache key for the given endpoint and parameters.
    
    Args:
        endpoint: API endpoint path
        params: Query parameters
        
    Returns:
        Cache key string
    """
    if params:
        # Sort parameters for consistent cache keys
        sorted_params = sorted(params.items())
        param_str = "&".join(f"{k}={v}" for k, v in sorted_params)
        return f"meijer:{endpoint}:{param_str}"
    return f"meijer:{endpoint}"


def get_cached_response(cache_key: str) -> Optional[Dict[str, Any]]:
    """
    Get cached response from Redis.
    
    Args:
        cache_key: Cache key to lookup
        
    Returns:
        Cached response data or None if not found
    """
    if not redis_client:
        return None
    
    try:
        cached = redis_client.get(cache_key)
        if cached:
            return json.loads(cached)
    except Exception as e:
        logger.error(f"Error reading from cache: {e}")
    
    return None


def cache_response(cache_key: str, data: Dict[str, Any], ttl: int = None) -> None:
    """
    Cache response data in Redis.
    
    Args:
        cache_key: Cache key to store under
        data: Response data to cache
        ttl: Time to live in seconds (uses default if None)
    """
    if not redis_client:
        return
    
    try:
        ttl = ttl or CACHE_TTL
        redis_client.setex(cache_key, ttl, json.dumps(data))
        logger.info(f"Cached response for {cache_key}")
    except Exception as e:
        logger.error(f"Error caching response: {e}")


def forward_request_to_meijer(endpoint: str, method: str = 'GET', 
                             params: Dict[str, Any] = None, 
                             headers: Dict[str, str] = None,
                             data: Dict[str, Any] = None) -> Dict[str, Any]:
    """
    Forward request to the real Meijer API.
    
    Args:
        endpoint: API endpoint path
        method: HTTP method
        params: Query parameters
        headers: Request headers
        data: Request body data
        
    Returns:
        Response data from Meijer API
    """
    url = f"{MEIJER_API_BASE}{endpoint}"
    
    # Merge headers
    request_headers = DEFAULT_HEADERS.copy()
    if headers:
        request_headers.update(headers)
    
    # Handle authorization header
    auth_header = request.headers.get('Authorization')
    if auth_header:
        request_headers['Authorization'] = auth_header
    
    try:
        if method.upper() == 'GET':
            response = requests.get(url, params=params, headers=request_headers, timeout=30)
        elif method.upper() == 'POST':
            response = requests.post(url, params=params, headers=request_headers, 
                                  json=data, timeout=30)
        elif method.upper() == 'PUT':
            response = requests.put(url, params=params, headers=request_headers, 
                                 json=data, timeout=30)
        elif method.upper() == 'DELETE':
            response = requests.delete(url, params=params, headers=request_headers, timeout=30)
        else:
            raise ValueError(f"Unsupported method: {method}")
        
        response.raise_for_status()
        
        # Try to parse JSON response
        try:
            return response.json()
        except json.JSONDecodeError:
            return {"text": response.text, "status_code": response.status_code}
            
    except requests.exceptions.RequestException as e:
        logger.error(f"Error forwarding request to Meijer API: {e}")
        return {"error": str(e), "status_code": 500}


@app.route('/health', methods=['GET'])
def health_check():
    """Health check endpoint."""
    return jsonify({
        "status": "healthy",
        "timestamp": datetime.now().isoformat(),
        "redis_connected": redis_client is not None and redis_client.ping(),
        "cache_ttl": CACHE_TTL
    })


@app.route('/api/meijer/<path:endpoint>', methods=['GET', 'POST', 'PUT', 'DELETE'])
@limiter.limit("100 per minute")
def proxy_endpoint(endpoint: str):
    """
    Proxy endpoint for Meijer API calls.
    
    This endpoint accepts all requests and forwards them to the real Meijer API,
    with optional caching based on the request.
    
    Args:
        endpoint: API endpoint path (e.g., 'digital/occ/v3/carts/current')
    """
    method = request.method
    params = dict(request.args)
    headers = dict(request.headers)
    
    # Remove Flask-specific headers
    for header in ['Host', 'Content-Length', 'Content-Type']:
        headers.pop(header, None)
    
    # Get request body for POST/PUT requests
    data = None
    if method in ['POST', 'PUT'] and request.is_json:
        data = request.get_json()
    
    # Generate cache key
    cache_key = get_cache_key(endpoint, params)
    
    # Check cache for GET requests
    if method == 'GET':
        cached = get_cached_response(cache_key)
        if cached:
            logger.info(f"Serving cached response for {endpoint}")
            return jsonify(cached)
    
    # Forward request to Meijer API
    logger.info(f"Forwarding {method} request to {endpoint}")
    response_data = forward_request_to_meijer(endpoint, method, params, headers, data)
    
    # Cache successful GET responses
    if method == 'GET' and 'error' not in response_data:
        cache_response(cache_key, response_data)
    
    return jsonify(response_data)


@app.route('/api/meijer/digital/occ/v3/carts/current', methods=['GET'])
@limiter.limit("50 per minute")
def get_current_cart():
    """
    Get current cart endpoint.
    
    This is a specialized endpoint for cart operations with enhanced caching.
    """
    store = request.args.get('store', '71')
    params = {
        'store': store,
        'calculateForLC': request.args.get('calculateForLC', 'false'),
        'fields': request.args.get('fields', 'FULL'),
        'fetchCartModifications': request.args.get('fetchCartModifications', 'true'),
        'retainOutOfStock': request.args.get('retainOutOfStock', 'true')
    }
    
    cache_key = get_cache_key('digital/occ/v3/carts/current', params)
    
    # Check cache first
    cached = get_cached_response(cache_key)
    if cached:
        logger.info("Serving cached cart response")
        return jsonify(cached)
    
    # Forward to Meijer API
    response_data = forward_request_to_meijer('digital/occ/v3/carts/current', 'GET', params)
    
    # Cache successful responses
    if 'error' not in response_data:
        cache_response(cache_key, response_data, ttl=60)  # Cache cart for 1 minute
    
    return jsonify(response_data)


@app.route('/api/meijer/digital/homecards/v1/cards/<card_type>', methods=['GET'])
@limiter.limit("100 per minute")
def get_homecards(card_type: str):
    """
    Get homecards endpoint.
    
    Args:
        card_type: Type of card to retrieve (e.g., 'rewards', 'seasonalCarousel')
    """
    params = dict(request.args)
    params['card_type'] = card_type
    
    cache_key = get_cache_key(f'digital/homecards/v1/cards/{card_type}', params)
    
    # Check cache first
    cached = get_cached_response(cache_key)
    if cached:
        logger.info(f"Serving cached homecard response for {card_type}")
        return jsonify(cached)
    
    # Forward to Meijer API
    response_data = forward_request_to_meijer(f'digital/homecards/v1/cards/{card_type}', 'GET', params)
    
    # Cache successful responses
    if 'error' not in response_data:
        cache_response(cache_key, response_data, ttl=300)  # Cache homecards for 5 minutes
    
    return jsonify(response_data)


@app.route('/api/meijer/digital/mperks40/customer/v1/pointbalance', methods=['GET'])
@limiter.limit("50 per minute")
def get_mperks_balance():
    """Get MPerks point balance."""
    cache_key = get_cache_key('digital/mperks40/customer/v1/pointbalance')
    
    # Check cache first
    cached = get_cached_response(cache_key)
    if cached:
        logger.info("Serving cached MPerks balance response")
        return jsonify(cached)
    
    # Forward to Meijer API
    response_data = forward_request_to_meijer('digital/mperks40/customer/v1/pointbalance', 'GET')
    
    # Cache successful responses
    if 'error' not in response_data:
        cache_response(cache_key, response_data, ttl=180)  # Cache balance for 3 minutes
    
    return jsonify(response_data)


@app.route('/api/meijer/digital/product-recommendations/v1/customer/<customer_id>/recommendations/<rec_type>/<store_id>/upc', methods=['GET'])
@limiter.limit("100 per minute")
def get_product_recommendations(customer_id: str, rec_type: str, store_id: str):
    """
    Get product recommendations.
    
    Args:
        customer_id: Customer ID
        rec_type: Recommendation type (e.g., 'buy-again')
        store_id: Store ID
    """
    params = dict(request.args)
    params.update({
        'customer_id': customer_id,
        'rec_type': rec_type,
        'store_id': store_id
    })
    
    cache_key = get_cache_key(f'digital/product-recommendations/v1/customer/{customer_id}/recommendations/{rec_type}/{store_id}/upc', params)
    
    # Check cache first
    cached = get_cached_response(cache_key)
    if cached:
        logger.info(f"Serving cached recommendations response for {rec_type}")
        return jsonify(cached)
    
    # Forward to Meijer API
    endpoint = f'digital/product-recommendations/v1/customer/{customer_id}/recommendations/{rec_type}/{store_id}/upc'
    response_data = forward_request_to_meijer(endpoint, 'GET', params)
    
    # Cache successful responses
    if 'error' not in response_data:
        cache_response(cache_key, response_data, ttl=600)  # Cache recommendations for 10 minutes
    
    return jsonify(response_data)


@app.route('/api/meijer/digital/hybris/v3/fulfillment/reservationslots', methods=['GET', 'POST'])
@limiter.limit("50 per minute")
def fulfillment_reservationslots():
    """Handle fulfillment reservation slots."""
    method = request.method
    params = dict(request.args)
    data = request.get_json() if request.is_json else None
    
    cache_key = get_cache_key('digital/hybris/v3/fulfillment/reservationslots', params)
    
    # Check cache for GET requests
    if method == 'GET':
        cached = get_cached_response(cache_key)
        if cached:
            logger.info("Serving cached reservation slots response")
            return jsonify(cached)
    
    # Forward to Meijer API
    response_data = forward_request_to_meijer('digital/hybris/v3/fulfillment/reservationslots', method, params, data=data)
    
    # Cache successful GET responses
    if method == 'GET' and 'error' not in response_data:
        cache_response(cache_key, response_data, ttl=300)  # Cache for 5 minutes
    
    return jsonify(response_data)


@app.route('/api/meijer/digital/multi-upc/v1/upcs', methods=['GET', 'POST'])
@limiter.limit("100 per minute")
def multi_upc_lookup():
    """Handle multi-UPC lookups."""
    method = request.method
    params = dict(request.args)
    data = request.get_json() if request.is_json else None
    
    cache_key = get_cache_key('digital/multi-upc/v1/upcs', params)
    
    # Check cache for GET requests
    if method == 'GET':
        cached = get_cached_response(cache_key)
        if cached:
            logger.info("Serving cached UPC lookup response")
            return jsonify(cached)
    
    # Forward to Meijer API
    response_data = forward_request_to_meijer('digital/multi-upc/v1/upcs', method, params, data=data)
    
    # Cache successful GET responses
    if method == 'GET' and 'error' not in response_data:
        cache_response(cache_key, response_data, ttl=1800)  # Cache UPC lookups for 30 minutes
    
    return jsonify(response_data)


@app.route('/cache/clear', methods=['POST'])
@limiter.limit("10 per minute")
def clear_cache():
    """Clear all cached responses."""
    if not redis_client:
        return jsonify({"error": "Redis not available"}), 500
    
    try:
        # Get all keys with meijer: prefix
        keys = redis_client.keys("meijer:*")
        if keys:
            redis_client.delete(*keys)
            logger.info(f"Cleared {len(keys)} cached items")
            return jsonify({"message": f"Cleared {len(keys)} cached items"})
        else:
            return jsonify({"message": "No cached items to clear"})
    except Exception as e:
        logger.error(f"Error clearing cache: {e}")
        return jsonify({"error": str(e)}), 500


@app.route('/cache/stats', methods=['GET'])
def cache_stats():
    """Get cache statistics."""
    if not redis_client:
        return jsonify({"error": "Redis not available"}), 500
    
    try:
        keys = redis_client.keys("meijer:*")
        key_count = len(keys)
        
        # Get some sample keys
        sample_keys = keys[:10] if keys else []
        
        return jsonify({
            "total_cached_items": key_count,
            "sample_keys": sample_keys,
            "cache_ttl": CACHE_TTL,
            "redis_connected": True
        })
    except Exception as e:
        logger.error(f"Error getting cache stats: {e}")
        return jsonify({"error": str(e)}), 500


@app.errorhandler(404)
def not_found(error):
    """Handle 404 errors."""
    return jsonify({"error": "Endpoint not found"}), 404


@app.errorhandler(500)
def internal_error(error):
    """Handle 500 errors."""
    return jsonify({"error": "Internal server error"}), 500


if __name__ == '__main__':
    port = int(os.getenv('PORT', 5000))
    debug = os.getenv('FLASK_ENV') == 'development'
    
    logger.info(f"Starting Meijer API caching server on port {port}")
    logger.info(f"Debug mode: {debug}")
    logger.info(f"Cache TTL: {CACHE_TTL} seconds")
    
    app.run(host='0.0.0.0', port=port, debug=debug)
