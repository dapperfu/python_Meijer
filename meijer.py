"""
Meijer API Client - Backward Compatibility Module
=================================================

This module provides backward compatibility by importing the main
Meijer client from the new modular package structure.

The actual implementation is now in the meijer/ package with the following structure:
- meijer/client.py - Main Meijer client class
- meijer/auth.py - Authentication utilities
- meijer/models.py - Data models
- meijer/exceptions.py - Exception classes
- meijer/enums.py - Enumerations
- meijer/shopping_list.py - Shopping list functionality

For new code, prefer importing directly from the package:
    from meijer import Meijer

For legacy compatibility, this module re-exports everything:
    from meijer import Meijer  # Still works
"""

# Import everything from the modular package for backward compatibility
from meijer import *

# Make sure the main Meijer class is available
from meijer import Meijer

__all__ = [
    "Meijer",
    # All other exports are handled by the * import above
]
