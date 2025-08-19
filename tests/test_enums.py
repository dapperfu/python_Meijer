#!/usr/bin/env python3
"""
Test Meijer API Enumerations
============================

Tests for the enumeration classes used in the Meijer API client.
"""

import pytest

from meijer.enums import AuthenticationStatus


class TestAuthenticationStatus:
    """Test the AuthenticationStatus enum."""

    def test_enum_values(self):
        """Test AuthenticationStatus enum values."""
        assert AuthenticationStatus.UNAUTHENTICATED.value == "unauthenticated"
        assert AuthenticationStatus.AUTHENTICATED.value == "authenticated"
        assert AuthenticationStatus.EXPIRED.value == "expired"
        assert AuthenticationStatus.FAILED.value == "failed"

    def test_enum_comparison(self):
        """Test AuthenticationStatus enum comparison."""
        assert (
            AuthenticationStatus.UNAUTHENTICATED != AuthenticationStatus.AUTHENTICATED
        )
        assert AuthenticationStatus.AUTHENTICATED == AuthenticationStatus.AUTHENTICATED

    def test_enum_string_representation(self):
        """Test AuthenticationStatus enum string representation."""
        assert (
            str(AuthenticationStatus.AUTHENTICATED)
            == "AuthenticationStatus.AUTHENTICATED"
        )
        assert (
            repr(AuthenticationStatus.EXPIRED)
            == "<AuthenticationStatus.EXPIRED: 'expired'>"
        )

    def test_enum_iteration(self):
        """Test AuthenticationStatus enum iteration."""
        values = [status.value for status in AuthenticationStatus]
        expected_values = ["unauthenticated", "authenticated", "expired", "failed"]
        assert values == expected_values

    def test_enum_membership(self):
        """Test AuthenticationStatus enum membership."""
        assert "unauthenticated" in [status.value for status in AuthenticationStatus]
        assert "authenticated" in [status.value for status in AuthenticationStatus]
        assert "expired" in [status.value for status in AuthenticationStatus]
        assert "failed" in [status.value for status in AuthenticationStatus]


if __name__ == "__main__":
    pytest.main([__file__])
