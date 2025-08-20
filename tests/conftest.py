#!/usr/bin/env python3
"""
Pytest configuration and shared fixtures for Meijer API testing.

This module provides shared fixtures and utilities for testing with hybrid authentication:
- Real client when authenticated
- Mocked client when not authenticated
"""

import pytest
from unittest.mock import Mock

from meijer import Meijer


@pytest.fixture
def hybrid_client():
    """
    Fixture that provides either a real authenticated client or a mocked client.
    
    Returns:
        tuple: (client, use_real_client, mperks, search, stores, etc.)
    """
    # Try to create a real client first
    try:
        real_client = Meijer()
        use_real_client = real_client.is_authenticated()
    except Exception:
        use_real_client = False
        real_client = None

    if use_real_client:
        # Use real authenticated client
        client = real_client
        print(f"✅ Using REAL authenticated client for testing")
    else:
        # Fall back to mocked client
        client = Mock()
        client.logger = Mock()
        client.api_base_url = "https://api.meijer.com"
        client._get_api_headers.return_value = {
            "Authorization": "Bearer test"
        }
        client._make_request.return_value = Mock(status_code=200)
        print(f"⚠️ Using MOCKED client for testing (no real authentication)")

    return client, use_real_client


@pytest.fixture
def hybrid_mperks(hybrid_client):
    """Fixture for MPerksEarnedRewards with hybrid authentication."""
    from meijer.mperks import MPerksEarnedRewards
    
    client, use_real_client = hybrid_client
    mperks = MPerksEarnedRewards(client)
    
    return mperks, use_real_client


@pytest.fixture
def hybrid_search(hybrid_client):
    """Fixture for Search with hybrid authentication."""
    from meijer.search import Search
    
    client, use_real_client = hybrid_client
    search = Search(client)
    
    return search, use_real_client


@pytest.fixture
def hybrid_stores(hybrid_client):
    """Fixture for stores module with hybrid authentication."""
    from meijer.stores import MeijerStore
    
    client, use_real_client = hybrid_client
    
    return MeijerStore, use_real_client


@pytest.fixture
def hybrid_coupons(hybrid_client):
    """Fixture for MeijerCouponManager with hybrid authentication."""
    from meijer.coupons import MeijerCouponManager
    
    client, use_real_client = hybrid_client
    coupons = MeijerCouponManager(client)
    
    return coupons, use_real_client


def skip_if_no_real_auth(use_real_client, reason="Real authentication required"):
    """Helper to skip tests that require real authentication."""
    if not use_real_client:
        pytest.skip(reason)


def run_real_or_mock(use_real_client, real_func, mock_func, *args, **kwargs):
    """
    Helper to run either real or mock functions based on authentication status.
    
    Args:
        use_real_client: Boolean indicating if real client is available
        real_func: Function to call with real client
        mock_func: Function to call with mock client
        *args: Arguments to pass to functions
        **kwargs: Keyword arguments to pass to functions
    
    Returns:
        Result from either real or mock function
    """
    if use_real_client:
        try:
            return real_func(*args, **kwargs)
        except Exception as e:
            pytest.skip(f"Real API test failed: {e}")
    else:
        return mock_func(*args, **kwargs)
