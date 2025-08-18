#!/usr/bin/env python3
"""
Checkout Operations Finder for Meijer API

This script searches for specific checkout operations mentioned by the user:
1. Store change for pickup
2. Out of stock notification
3. Backup item selection for milk
4. Pickup time selection (8am-9am Saturday Aug 23)
5. Pickup person editing (John Doe)
6. Add card page
"""

import re
import sys
from typing import List, Dict, Any


def search_checkout_operations(log_file_path: str) -> None:
    """Search for specific checkout operations in the log file."""
    print(f"🔍 Searching for checkout operations in: {log_file_path}")
    print("=" * 80)
    
    try:
        with open(log_file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
            
            print("📋 Searching for specific checkout operations...")
            print()
            
            # 1. Store change operations
            print("1️⃣ STORE CHANGE OPERATIONS:")
            print("-" * 40)
            store_change_patterns = [
                r'store.*change|change.*store',
                r'pickup.*store|store.*pickup',
                r'fulfillment.*store|store.*fulfillment',
                r'store.*71|store.*72|store.*73',
            ]
            
            store_change_count = 0
            for pattern in store_change_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    store_change_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {store_change_count}. {context.strip()}")
                    if store_change_count >= 5:  # Limit to first 5
                        break
                if store_change_count >= 5:
                    break
            print(f"   Total store change operations found: {store_change_count}")
            print()
            
            # 2. Out of stock operations
            print("2️⃣ OUT OF STOCK OPERATIONS:")
            print("-" * 40)
            out_of_stock_patterns = [
                r'out.*stock|stock.*out',
                r'not.*stock|stock.*not',
                r'unavailable|unavailable.*item',
                r'continue.*out.*stock',
            ]
            
            out_of_stock_count = 0
            for pattern in out_of_stock_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    out_of_stock_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {out_of_stock_count}. {context.strip()}")
                    if out_of_stock_count >= 3:  # Limit to first 3
                        break
                if out_of_stock_count >= 3:
                    break
            print(f"   Total out of stock operations found: {out_of_stock_count}")
            print()
            
            # 3. Backup item operations
            print("3️⃣ BACKUP ITEM OPERATIONS:")
            print("-" * 40)
            backup_patterns = [
                r'backup.*item|item.*backup',
                r'add.*backup|backup.*add',
                r'backup.*milk|milk.*backup',
                r'substitution|substitute',
            ]
            
            backup_count = 0
            for pattern in backup_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    backup_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {backup_count}. {context.strip()}")
                    if backup_count >= 3:  # Limit to first 3
                        break
                if backup_count >= 3:
                    break
            print(f"   Total backup item operations found: {backup_count}")
            print()
            
            # 4. Pickup time operations
            print("4️⃣ PICKUP TIME OPERATIONS:")
            print("-" * 40)
            pickup_time_patterns = [
                r'pickup.*time|time.*pickup',
                r'8am.*9am|8.*9.*am',
                r'saturday.*august|august.*saturday',
                r'fulfillment.*time|time.*slot',
                r'8:00.*9:00|8-9|8am-9am',
            ]
            
            pickup_time_count = 0
            for pattern in pickup_time_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    pickup_time_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {pickup_time_count}. {context.strip()}")
                    if pickup_time_count >= 3:  # Limit to first 3
                        break
                if pickup_time_count >= 3:
                    break
            print(f"   Total pickup time operations found: {pickup_time_count}")
            print()
            
            # 5. Pickup person operations
            print("5️⃣ PICKUP PERSON OPERATIONS:")
            print("-" * 40)
            pickup_person_patterns = [
                r'pickup.*person|person.*pickup',
                r'john.*doe|doe.*john',
                r'pickup.*name|name.*pickup',
                r'contact.*pickup|pickup.*contact',
            ]
            
            pickup_person_count = 0
            for pattern in pickup_person_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    pickup_person_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {pickup_person_count}. {context.strip()}")
                    if pickup_person_count >= 3:  # Limit to first 3
                        break
                if pickup_person_count >= 3:
                    break
            print(f"   Total pickup person operations found: {pickup_person_count}")
            print()
            
            # 6. Add card operations
            print("6️⃣ ADD CARD OPERATIONS:")
            print("-" * 40)
            add_card_patterns = [
                r'add.*card|card.*add',
                r'payment.*method|method.*payment',
                r'credit.*card|debit.*card',
                r'checkout.*payment|payment.*checkout',
            ]
            
            add_card_count = 0
            for pattern in add_card_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    add_card_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {add_card_count}. {context.strip()}")
                    if add_card_count >= 3:  # Limit to first 3
                        break
                if add_card_count >= 3:
                    break
            print(f"   Total add card operations found: {add_card_count}")
            print()
            
            # 7. Fulfillment operations
            print("7️⃣ FULFILLMENT OPERATIONS:")
            print("-" * 40)
            fulfillment_patterns = [
                r'fulfillment.*pickup|pickup.*fulfillment',
                r'hybris.*fulfillment|fulfillment.*hybris',
                r'timeslot|time.*slot',
                r'reservation.*slot|slot.*reservation',
            ]
            
            fulfillment_count = 0
            for pattern in fulfillment_patterns:
                matches = re.finditer(pattern, content, re.IGNORECASE)
                for match in matches:
                    fulfillment_count += 1
                    start = max(0, match.start() - 100)
                    end = min(len(content), match.end() + 100)
                    context = content[start:end]
                    print(f"   {fulfillment_count}. {context.strip()}")
                    if fulfillment_count >= 3:  # Limit to first 3
                        break
                if fulfillment_count >= 3:
                    break
            print(f"   Total fulfillment operations found: {fulfillment_count}")
            print()
            
            # Summary
            print("📊 SUMMARY:")
            print("=" * 40)
            print(f"✅ Store change operations: {store_change_count}")
            print(f"✅ Out of stock operations: {out_of_stock_count}")
            print(f"✅ Backup item operations: {backup_count}")
            print(f"✅ Pickup time operations: {pickup_time_count}")
            print(f"✅ Pickup person operations: {pickup_person_count}")
            print(f"✅ Add card operations: {add_card_count}")
            print(f"✅ Fulfillment operations: {fulfillment_count}")
            
    except FileNotFoundError:
        print(f"❌ Error: File '{log_file_path}' not found")
        sys.exit(1)
    except Exception as e:
        print(f"❌ Error reading file: {e}")
        sys.exit(1)


def main():
    """Main function."""
    if len(sys.argv) != 2:
        print("Usage: python3 checkout_operations_finder.py <log_file_path>")
        sys.exit(1)
    
    log_file_path = sys.argv[1]
    search_checkout_operations(log_file_path)


if __name__ == "__main__":
    main()
