#!/usr/bin/env python3
"""
Simple shop'n'scan flow analyzer for mitmproxy logs.
"""

import json
import re
from typing import Dict, Any


def extract_shop_scan_flows(log_file_path: str) -> Dict[str, Any]:
    """
    Extract shop'n'scan related flows from the log file.
    """
    flows = {
        "is_shop_scan_enabled": [],
        "next_gen_pos_basket": [],
        "device_ids": [],
        "upc_scans": [],
        "session_starts": [],
    }

    with open(log_file_path, "r", encoding="utf-8", errors="ignore") as f:
        content = f.read()

    # Split into flows (each flow starts with >>)
    flow_sections = re.split(r"(?=^>>)", content, flags=re.MULTILINE)

    for section in flow_sections:
        if not section.strip():
            continue

        # Check if this is a shop'n'scan related flow
        if "isShopAndScanEnabled" in section:
            flows["is_shop_scan_enabled"].append(section)

        if "NextGenPOSBasket" in section:
            flows["next_gen_pos_basket"].append(section)

        # Look for device IDs
        device_id_match = re.search(r'"deviceId":"([^"]+)"', section)
        if device_id_match:
            flows["device_ids"].append(
                {
                    "device_id": device_id_match.group(1),
                    "section": section[:500] + "..." if len(section) > 500 else section,
                }
            )

        # Look for UPC scans (barcodes starting with 629, 0461, etc.)
        upc_match = re.search(r'"barcode":"([0-9]+)"', section)
        if upc_match:
            barcode = upc_match.group(1)
            if barcode.startswith(("629", "0461", "99999")):
                flows["upc_scans"].append(
                    {
                        "barcode": barcode,
                        "section": section[:500] + "..."
                        if len(section) > 500
                        else section,
                    }
                )

        # Look for session start patterns
        if "START_TRANSACTION" in section:
            flows["session_starts"].append(section)

    return flows


def analyze_device_id_patterns(flows: Dict[str, Any]) -> Dict[str, Any]:
    """
    Analyze device ID patterns and generate templates.
    """
    device_info = {
        "unique_device_ids": [],
        "device_os_info": [],
        "app_versions": [],
        "store_ids": [],
    }

    # Extract unique device IDs
    for device_data in flows["device_ids"]:
        device_id = device_data["device_id"]
        if device_id not in device_info["unique_device_ids"]:
            device_info["unique_device_ids"].append(device_id)

    # Extract other device information from sections
    for section in flows["next_gen_pos_basket"]:
        # Extract device OS info
        os_match = re.search(r'"deviceOS":"([^"]+)"', section)
        if os_match:
            device_info["device_os_info"].append(os_match.group(1))

        # Extract app version
        app_match = re.search(r'"deviceAppVersion":"([^"]+)"', section)
        if app_match:
            device_info["app_versions"].append(app_match.group(1))

        # Extract store ID
        store_match = re.search(r'"storeId":(\d+)', section)
        if store_match:
            store_id = int(store_match.group(1))
            if store_id not in device_info["store_ids"]:
                device_info["store_ids"].append(store_id)

    return device_info


def generate_session_start_template(device_info: Dict[str, Any]) -> Dict[str, Any]:
    """
    Generate a session start template based on extracted device info.
    """
    # Use the first available values or defaults
    device_id = (
        device_info["unique_device_ids"][0]
        if device_info["unique_device_ids"]
        else "50dbc7dc-e839-46d9-9bfd-292c0d4f831e"
    )
    device_os = (
        device_info["device_os_info"][0] if device_info["device_os_info"] else "Android"
    )
    app_version = (
        device_info["app_versions"][0] if device_info["app_versions"] else "10.28.0"
    )
    store_id = device_info["store_ids"][0] if device_info["store_ids"] else 20

    return {
        "type": "START_TRANSACTION",
        "header": {
            "transactionDateTime": "2025-08-22T21:47:52",
            "transactionDateTimeUTC": "2025-08-22T21:47:52-04:00",
            "storeId": store_id,
            "eventTimeStamp": "2025-08-22T21:47:52",
            "eventTimeStampUTC": "2025-08-22T21:47:52-04:00",
            "deviceId": device_id,
            "deviceOS": device_os,
            "deviceAppVersion": app_version,
            "deviceOSVersion": "10",
        },
        "eventData": {
            "barcodeType": "PDF_417",
            "mPerksBarcode": "99999604317088389844",
            "selectedHighValueOnly": True,
            "rollDepositsInPrimary": True,
        },
    }


def main():
    """Main analysis function."""
    log_file = "logs/meijer_mitm_20250822_2130.log"

    print(f"Analyzing shop'n'scan flows from: {log_file}")

    # Extract flows
    flows = extract_shop_scan_flows(log_file)

    # Analyze device info
    device_info = analyze_device_id_patterns(flows)

    # Generate session start template
    session_template = generate_session_start_template(device_info)

    # Print results
    print("\n=== SHOP'N'SCAN FLOW ANALYSIS ===")
    print(f"isShopAndScanEnabled calls: {len(flows['is_shop_scan_enabled'])}")
    print(f"NextGenPOSBasket calls: {len(flows['next_gen_pos_basket'])}")
    print(f"Device IDs found: {len(flows['device_ids'])}")
    print(f"UPC scans found: {len(flows['upc_scans'])}")
    print(f"Session starts found: {len(flows['session_starts'])}")

    print("\n=== DEVICE INFORMATION ===")
    print(f"Unique Device IDs: {device_info['unique_device_ids']}")
    print(f"Device OS: {device_info['device_os_info']}")
    print(f"App Versions: {device_info['app_versions']}")
    print(f"Store IDs: {device_info['store_ids']}")

    print("\n=== UPC SCAN DETAILS ===")
    for scan in flows["upc_scans"]:
        print(f"Barcode: {scan['barcode']}")

    print("\n=== SESSION START TEMPLATE ===")
    print(json.dumps(session_template, indent=2))

    # Save results
    results = {
        "flows": flows,
        "device_info": device_info,
        "session_template": session_template,
    }

    with open("logs/shop_scan_analysis_simple.json", "w") as f:
        json.dump(results, f, indent=2)

    print("\nResults saved to: logs/shop_scan_analysis_simple.json")


if __name__ == "__main__":
    main()
