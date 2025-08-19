#!/usr/bin/env python3
"""
Debug Defrag Method
===================

This script tests the defrag method to see exactly what's happening with return values.
"""

import logging

from meijer import Meijer

# Set up logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


def test_defrag():
    """Test the defrag method step by step."""
    try:
        # Initialize client
        client = Meijer()
        logger.info("✅ Client initialized")

        # Check authentication
        logger.info(f"🔐 Auth status: {client.auth_status.name}")
        logger.info(f"👤 User ID: {client.user_id}")
        logger.info(f"🏪 Home Store: {client.home_store_id}")

        # Test getting shopping list
        logger.info("📝 Testing shopping list retrieval...")
        try:
            items = client.list.get()
            logger.info(f"✅ Got {len(items)} items from shopping list")
        except Exception as e:
            logger.error(f"❌ Failed to get shopping list: {e}")
            return

        # Test getting stores
        logger.info("🏪 Testing store retrieval...")
        try:
            stores = client.get_stores()
            logger.info(f"✅ Got {len(stores)} stores")
        except Exception as e:
            logger.error(f"❌ Failed to get stores: {e}")

        # Test defrag method
        logger.info("🔧 Testing defrag method...")
        try:
            result = client.list.defrag()
            logger.info(f"🔍 Defrag returned: {result} (type: {type(result)})")

            if result:
                logger.info("✅ Defrag reported success")
            else:
                logger.info("❌ Defrag reported failure")

        except Exception as e:
            logger.error(f"❌ Defrag method failed: {e}")

    except Exception as e:
        logger.error(f"❌ Test failed: {e}")


if __name__ == "__main__":
    test_defrag()
