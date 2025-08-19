#!/usr/bin/env python3
"""
Credit Card Operations Finder for Meijer API

This script searches for specific credit card operations including:
1. Credit card validation
2. Card rejection/error responses
3. Payment method API calls
4. Card number patterns
5. CVV validation
6. Expiration date validation
"""

import re
import sys


def search_credit_card_operations(log_file_path: str) -> None:
    """Search for specific credit card operations in the log file."""
    print(f"🔍 Searching for credit card operations in: {log_file_path}")
    print("=" * 80)

    try:
        with open(log_file_path, "r", encoding="utf-8", errors="ignore") as f:
            content = f.read()

            print("📋 Searching for credit card operations...")
            print()

            # 1. Credit card validation operations
            print("1️⃣ CREDIT CARD VALIDATION OPERATIONS:")
            print("-" * 40)
            validation_patterns = [
                r"credit.*card.*valid|valid.*credit.*card",
                r"card.*validation|validation.*card",
                r"validate.*card|card.*validate",
                r"payment.*validation|validation.*payment",
            ]

            validation_count = 0
            for pattern in validation_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    validation_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {validation_count}. {context.strip()}")
                    if validation_count >= 5:  # Limit to first 5
                        break
                if validation_count >= 5:
                    break
            print(f"   Total validation operations found: {validation_count}")
            print()

            # 2. Card rejection/error operations
            print("2️⃣ CARD REJECTION/ERROR OPERATIONS:")
            print("-" * 40)
            rejection_patterns = [
                r"card.*reject|reject.*card",
                r"card.*error|error.*card",
                r"card.*invalid|invalid.*card",
                r"card.*decline|decline.*card",
                r"card.*failed|failed.*card",
                r"not.*valid|valid.*not",
            ]

            rejection_count = 0
            for pattern in rejection_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    rejection_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {rejection_count}. {context.strip()}")
                    if rejection_count >= 5:  # Limit to first 5
                        break
                if rejection_count >= 5:
                    break
            print(f"   Total rejection operations found: {rejection_count}")
            print()

            # 3. Payment method API operations
            print("3️⃣ PAYMENT METHOD API OPERATIONS:")
            print("-" * 40)
            payment_api_patterns = [
                r"payment.*method|method.*payment",
                r"add.*card|card.*add",
                r"payment.*api|api.*payment",
                r"payment.*endpoint|endpoint.*payment",
                r"POST.*payment|PUT.*payment|PATCH.*payment",
            ]

            payment_api_count = 0
            for pattern in payment_api_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    payment_api_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {payment_api_count}. {context.strip()}")
                    if payment_api_count >= 5:  # Limit to first 5
                        break
                if payment_api_count >= 5:
                    break
            print(f"   Total payment API operations found: {payment_api_count}")
            print()

            # 4. Card number patterns
            print("4️⃣ CARD NUMBER PATTERNS:")
            print("-" * 40)
            card_number_patterns = [
                r"\d{4}[\s-]?\d{4}[\s-]?\d{4}[\s-]?\d{4}",  # 16-digit card numbers
                r"\d{4}[\s-]?\d{6}[\s-]?\d{5}",  # 15-digit card numbers
                r"card.*number|number.*card",
                r"cc.*number|number.*cc",
            ]

            card_number_count = 0
            for pattern in card_number_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    card_number_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {card_number_count}. {context.strip()}")
                    if card_number_count >= 3:  # Limit to first 3
                        break
                if card_number_count >= 3:
                    break
            print(f"   Total card number patterns found: {card_number_count}")
            print()

            # 5. CVV validation operations
            print("5️⃣ CVV VALIDATION OPERATIONS:")
            print("-" * 40)
            cvv_patterns = [
                r"cvv|cvv2|cvc",
                r"security.*code|code.*security",
                r"verification.*code|code.*verification",
                r"card.*verification|verification.*card",
            ]

            cvv_count = 0
            for pattern in cvv_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    cvv_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {cvv_count}. {context.strip()}")
                    if cvv_count >= 3:  # Limit to first 3
                        break
                if cvv_count >= 3:
                    break
            print(f"   Total CVV operations found: {cvv_count}")
            print()

            # 6. Expiration date validation
            print("6️⃣ EXPIRATION DATE VALIDATION:")
            print("-" * 40)
            expiration_patterns = [
                r"expiration.*date|date.*expiration",
                r"exp.*date|date.*exp",
                r"expiry|expires",
                r"mm/yy|mm/yyyy|yy/mm|yyyy/mm",
            ]

            expiration_count = 0
            for pattern in expiration_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    expiration_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {expiration_count}. {context.strip()}")
                    if expiration_count >= 3:  # Limit to first 3
                        break
                if expiration_count >= 3:
                    break
            print(f"   Total expiration operations found: {expiration_count}")
            print()

            # 7. Payment gateway operations
            print("7️⃣ PAYMENT GATEWAY OPERATIONS:")
            print("-" * 40)
            gateway_patterns = [
                r"payment.*gateway|gateway.*payment",
                r"stripe|paypal|square|adyen",
                r"payment.*processor|processor.*payment",
                r"payment.*service|service.*payment",
            ]

            gateway_count = 0
            for pattern in gateway_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    gateway_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {gateway_count}. {context.strip()}")
                    if gateway_count >= 3:  # Limit to first 3
                        break
                if gateway_count >= 3:
                    break
            print(f"   Total gateway operations found: {gateway_count}")
            print()

            # Summary
            print("📊 SUMMARY:")
            print("=" * 40)
            print(f"✅ Credit card validation operations: {validation_count}")
            print(f"✅ Card rejection/error operations: {rejection_count}")
            print(f"✅ Payment method API operations: {payment_api_count}")
            print(f"✅ Card number patterns: {card_number_count}")
            print(f"✅ CVV validation operations: {cvv_count}")
            print(f"✅ Expiration date validation: {expiration_count}")
            print(f"✅ Payment gateway operations: {gateway_count}")

    except FileNotFoundError:
        print(f"❌ Error: File '{log_file_path}' not found")
        sys.exit(1)
    except Exception as e:
        print(f"❌ Error reading file: {e}")
        sys.exit(1)


def main():
    """Main function."""
    if len(sys.argv) != 2:
        print("Usage: python3 credit_card_operations_finder.py <log_file_path>")
        sys.exit(1)

    log_file_path = sys.argv[1]
    search_credit_card_operations(log_file_path)


if __name__ == "__main__":
    main()
