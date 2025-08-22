#!/usr/bin/env python3
"""
Test script for cart commands.
"""

import sys
import os

# Add the project root to the path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

def test_cart_commands():
    """Test that cart commands can be imported and created."""
    try:
        from meijer.cli.commands import cart_group, cart_show, cart_add, cart_remove, cart_clear, cart_info, cart_slots
        
        print("✅ All cart commands imported successfully")
        
        # Test that the commands are properly decorated (Click commands have these attributes)
        assert hasattr(cart_show, 'callback'), "cart_show should have callback"
        assert hasattr(cart_add, 'callback'), "cart_add should have callback"
        assert hasattr(cart_remove, 'callback'), "cart_remove should have callback"
        assert hasattr(cart_clear, 'callback'), "cart_clear should have callback"
        assert hasattr(cart_info, 'callback'), "cart_info should have callback"
        assert hasattr(cart_slots, 'callback'), "cart_slots should have callback"
        
        print("✅ All cart commands have proper Click decorators")
        
        # Test that the commands are added to the group
        assert cart_show in cart_group.commands.values(), "cart_show should be in cart_group"
        assert cart_add in cart_group.commands.values(), "cart_add should be in cart_group"
        assert cart_remove in cart_group.commands.values(), "cart_remove should be in cart_group"
        assert cart_clear in cart_group.commands.values(), "cart_clear should be in cart_group"
        assert cart_info in cart_group.commands.values(), "cart_info should be in cart_group"
        assert cart_slots in cart_group.commands.values(), "cart_slots should be in cart_group"
        
        print("✅ All cart commands are properly registered in cart_group")
        
        print("\n🎉 All cart command tests passed!")
        return True
        
    except Exception as e:
        print(f"❌ Error testing cart commands: {e}")
        import traceback
        traceback.print_exc()
        return False

if __name__ == "__main__":
    success = test_cart_commands()
    sys.exit(0 if success else 1)
