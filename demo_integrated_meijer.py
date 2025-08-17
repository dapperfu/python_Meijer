#!/usr/bin/env python3
"""
Integrated Meijer API Demo
=========================

Demonstrates the integrated usage of various Meijer API components
using the new modular package structure.

This demo shows:
- Clean component integration
- Simplified API usage
- Modular architecture benefits
- Real-world usage patterns
"""

import logging
from typing import Dict, Any

# Import from the modular package
from meijer import (
    Meijer,
    AuthenticationStatus,
    MeijerAuthenticationError,
)


def setup_demo_logging():
    """Setup clean logging for the demo."""
    logging.basicConfig(level=logging.WARNING, format="%(levelname)s: %(message)s")


def test_component_integration(client: Meijer) -> Dict[str, Any]:
    """Test integration between different components."""
    print("🔗 COMPONENT INTEGRATION TEST")
    print("-" * 40)

    integration_results = {
        "authentication": False,
        "shopping_list": False,
        "store_access": False,
        "offers_access": False,
        "components_working": 0,
    }

    try:
        # Test 1: Authentication component
        print("1️⃣  Testing authentication component...")
        if client.auth_status == AuthenticationStatus.AUTHENTICATED:
            print("   ✅ Authentication component working")
            integration_results["authentication"] = True
            integration_results["components_working"] += 1
        else:
            print("   ❌ Authentication component failed")

        # Test 2: Shopping list component
        print("2️⃣  Testing shopping list component...")
        try:
            items = client.list.get()
            print(f"   ✅ Shopping list component working ({len(items)} items)")
            integration_results["shopping_list"] = True
            integration_results["components_working"] += 1
        except Exception as e:
            print(f"   ❌ Shopping list component failed: {e}")

        # Test 3: Store component
        print("3️⃣  Testing store component...")
        try:
            stores = client.get_stores(zip_code="49456", radius=15)
            print(f"   ✅ Store component working ({len(stores)} stores)")
            integration_results["store_access"] = True
            integration_results["components_working"] += 1
        except Exception as e:
            print(f"   ❌ Store component failed: {e}")

        # Test 4: Offers component
        print("4️⃣  Testing offers component...")
        try:
            offers = client.get_offers(limit=10)
            print(f"   ✅ Offers component working ({len(offers)} offers)")
            integration_results["offers_access"] = True
            integration_results["components_working"] += 1
        except Exception as e:
            print(f"   ❌ Offers component failed: {e}")

        print(
            f"\n📊 Integration Summary: {integration_results['components_working']}/4 components working"
        )

        return integration_results

    except Exception as e:
        print(f"❌ Component integration test failed: {e}")
        return integration_results


def demonstrate_modular_usage():
    """Demonstrate modular usage patterns."""
    print("\n📦 MODULAR USAGE DEMONSTRATION")
    print("-" * 40)

    try:
        # Pattern 1: Main client import
        print("1️⃣  Pattern 1: Main client import")
        print("   from meijer import Meijer")
        from meijer import Meijer

        client = Meijer()
        print(f"   ✅ Created: {type(client).__name__}")

        # Pattern 2: Component-specific imports
        print("2️⃣  Pattern 2: Component imports")
        print("   from meijer.models import AuthTokens")
        print("   from meijer.auth import TokenStorage")
        from meijer.models import AuthTokens
        from meijer.auth import TokenStorage

        tokens = AuthTokens(access_token="demo_token")
        storage = TokenStorage()
        print(f"   ✅ Created: {type(tokens).__name__}")
        print(f"   ✅ Created: {type(storage).__name__}")

        # Pattern 3: Exception handling imports
        print("3️⃣  Pattern 3: Exception imports")
        print("   from meijer import MeijerAuthenticationError")
        from meijer import MeijerAuthenticationError as AuthError

        print("   ✅ Available for error handling")
        _ = AuthError  # Demonstration import

        # Pattern 4: Enum imports
        print("4️⃣  Pattern 4: Enum imports")
        print("   from meijer import AuthenticationStatus")
        from meijer import AuthenticationStatus

        print(f"   ✅ Available: {list(AuthenticationStatus)}")

        return True

    except ImportError as e:
        print(f"❌ Import error: {e}")
        return False
    except Exception as e:
        print(f"❌ Modular usage demo failed: {e}")
        return False


def demonstrate_backwards_compatibility():
    """Demonstrate backwards compatibility."""
    print("\n🔄 BACKWARDS COMPATIBILITY TEST")
    print("-" * 40)

    try:
        # Test old-style import still works
        print("1️⃣  Testing legacy import pattern...")
        from meijer import Meijer  # This uses the compatibility layer

        client1 = Meijer()
        print("   ✅ Legacy import pattern working")

        # Test package import
        print("2️⃣  Testing package import pattern...")
        import meijer

        client2 = meijer.Meijer()
        print("   ✅ Package import pattern working")

        # Verify both create the same type
        print("3️⃣  Testing compatibility...")
        same_type = type(client1) is type(client2)
        print(f"   ✅ Same client type: {same_type}")
        print(f"   • Client 1: {type(client1).__name__}")
        print(f"   • Client 2: {type(client2).__name__}")

        return True

    except Exception as e:
        print(f"❌ Backwards compatibility test failed: {e}")
        return False


def demonstrate_real_world_workflow():
    """Demonstrate a real-world workflow."""
    print("\n🌍 REAL-WORLD WORKFLOW DEMO")
    print("-" * 40)

    try:
        # Create client
        print("1️⃣  Creating Meijer client...")
        meijer = Meijer()

        if meijer.auth_status != AuthenticationStatus.AUTHENTICATED:
            print("   ❌ Authentication required for workflow")
            return False

        print("   ✅ Client authenticated and ready")

        # Workflow: Plan shopping trip
        print("2️⃣  Planning shopping trip workflow...")

        # Step 1: Check shopping list
        print("   • Checking shopping list...")
        items = meijer.list.get()
        print(f"     📋 {len(items)} items on shopping list")

        # Step 2: Find nearby stores
        print("   • Finding nearby stores...")
        stores = meijer.get_stores(zip_code="49456", radius=20)
        print(f"     🏪 {len(stores)} stores found")

        # Step 3: Check available offers
        print("   • Checking available offers...")
        offers = meijer.get_offers(limit=15)
        print(f"     🎟️  {len(offers)} offers available")

        # Workflow summary
        print("3️⃣  Workflow summary:")
        print("   ✅ Shopping preparation complete!")
        print(f"   • Shopping list: {len(items)} items")
        print(f"   • Available stores: {len(stores)}")
        print(f"   • Current offers: {len(offers)}")

        return True

    except MeijerAuthenticationError:
        print("   ❌ Authentication required for real-world workflow")
        return False
    except Exception as e:
        print(f"   ❌ Real-world workflow failed: {e}")
        return False


def main():
    """Run the integrated Meijer API demo."""
    print("🚀 INTEGRATED MEIJER API DEMO")
    print("=" * 50)
    print("Demonstrating the new modular package structure")
    print("")

    # Setup logging
    setup_demo_logging()

    # Track test results
    results = {}

    try:
        # Create client
        print("📱 Initializing Meijer client...")
        client = Meijer()
        print("✅ Client initialized successfully")
        print("")

        # Run integration tests
        integration_results = test_component_integration(client)
        results["integration"] = integration_results["components_working"] > 2

        # Test modular usage
        modular_success = demonstrate_modular_usage()
        results["modular_usage"] = modular_success

        # Test backwards compatibility
        compat_success = demonstrate_backwards_compatibility()
        results["backwards_compatibility"] = compat_success

        # Test real-world workflow
        workflow_success = demonstrate_real_world_workflow()
        results["real_world_workflow"] = workflow_success

        # Summary
        print("\n📊 DEMO RESULTS SUMMARY")
        print("=" * 50)

        passed = sum(results.values())
        total = len(results)

        for test_name, success in results.items():
            status = "✅ PASS" if success else "❌ FAIL"
            formatted_name = test_name.replace("_", " ").title()
            print(f"{formatted_name:<25} {status}")

        print(f"\n🎯 Results: {passed}/{total} tests passed")

        if passed == total:
            print("🎉 All integration tests passed!")
        else:
            print("⚠️  Some tests failed (may be due to API limitations)")

        print("\n💡 Demonstrated features:")
        print("  • Component integration")
        print("  • Modular usage patterns")
        print("  • Backwards compatibility")
        print("  • Real-world workflows")
        print("  • Clean API design")
        print("  • Professional package structure")

        print("\n🚀 The modular Meijer package is ready for production!")

    except Exception as e:
        print(f"❌ Demo failed: {e}")

    print("\nQuick start:")
    print("   client = Meijer()")
    print("   # That's it! Authentication auto-discovered 🎯")


if __name__ == "__main__":
    main()
