#!/usr/bin/env python3
"""
Debug Product Detail and Search Results
========================================

This script tests what data we get from product searches to understand
why we're not getting aisle location information.
"""

import logging

from meijer import Meijer

# Set up logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


def test_product_search():
    """Test product search and see what data we get."""
    try:
        # Initialize client
        client = Meijer()
        logger.info("✅ Client initialized")

        # Test different search terms that we know exist
        test_queries = [
            "watermelon toothpaste",
            "Colgate Kids toothpaste",
            "Meijer sensitive toothpaste",
            "76023643360",  # This looks like a real UPC from the debug output
        ]

        for query in test_queries:
            logger.info(f"\n🔍 Testing search for: '{query}'")

            # Test search
            try:
                search_results = client.search_products(query, results_per_page=1)

                if search_results and search_results.results:
                    result = search_results.results[0]
                    logger.info(f"📦 Found product: {result.title}")
                    logger.info(f"   UPC: {result.upc}")
                    logger.info(f"   Price: {result.price}")
                    logger.info(f"   Brand: {result.brand}")
                    logger.info(f"   Category: {result.category}")

                    # Check raw data for location information
                    if hasattr(result, "raw_data"):
                        logger.info(f"   Raw data keys: {list(result.raw_data.keys())}")

                        # Look for any location-related fields
                        location_fields = [
                            "aisle",
                            "section",
                            "bay",
                            "location",
                            "aisleLocation",
                            "storeLocation",
                            "productLocation",
                            "itemLocation",
                            "store",
                        ]
                        found_fields = []
                        for field in location_fields:
                            if field in result.raw_data:
                                found_fields.append(
                                    f"{field}: {result.raw_data[field]}"
                                )

                        if found_fields:
                            logger.info(f"   📍 Location fields found: {found_fields}")
                        else:
                            logger.info("   📍 No location fields found in raw data")

                        # Show first few fields to see what's available
                        logger.info("   📄 Sample raw data:")
                        for key, value in list(result.raw_data.items())[:10]:
                            logger.info(f"      {key}: {value}")

                    # Test get_product_detail with the UPC
                    if result.upc:
                        logger.info(
                            f"\n🔍 Testing get_product_detail for UPC: {result.upc}"
                        )
                        product_detail = client.get_product_detail(result.upc, "217")

                        if product_detail:
                            logger.info(
                                f"   Product detail found: {product_detail.title}"
                            )
                            logger.info(
                                f"   Aisle primary: {getattr(product_detail, 'aisle_primary', 'None')}"
                            )
                            logger.info(
                                f"   Aisle locations: {getattr(product_detail, 'aisle_locations', 'None')}"
                            )
                        else:
                            logger.info("   No product detail found")

                else:
                    logger.info("   No search results found")

            except Exception as e:
                logger.error(f"   Error searching for '{query}': {e}")

    except Exception as e:
        logger.error(f"❌ Test failed: {e}")


if __name__ == "__main__":
    test_product_search()
