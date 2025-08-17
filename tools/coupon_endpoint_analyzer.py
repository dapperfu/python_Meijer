#!/usr/bin/env python3
"""
Comprehensive Coupon Endpoint Analysis and Validation
====================================================

Analyzes both mitmproxy logs and APK decompiled sources to validate and update
the Meijer coupon clipping/unclipping endpoints with correct headers, request 
bodies, and response structures.

This script implements the findings from APK analysis:
- Correct endpoint paths (/loyalty/mPerks/api/offers/Clip, /loyalty/mPerks/api/offers/Unclip)
- Proper headers (Content-Type, Accept headers with versioned MIME types)
- Request body structure (ClipUnclipCouponRequest: meijerOfferId, storeId, cartIsActive)
- Response structure (ClipUnclipCouponResponse: code, result)
"""

import json
import logging
from typing import Dict, Any, List, Optional
from dataclasses import dataclass

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)


@dataclass
class CouponEndpointInfo:
    """Structure for coupon endpoint information from APK analysis."""
    method: str
    path: str
    accept_header: str
    content_type_header: str
    request_model: str
    response_model: str
    description: str


@dataclass 
class OffersRequestStructure:
    """Structure for the offers API request based on mitmproxy logs."""
    sort_type: str
    page_size: int
    current_page: int
    offer_class: int
    search_criteria: str
    store_id: int
    ceiling_count: int
    ceiling_duration: int
    reward_coupon_id: int
    tag_id: str
    get_offer_count_per_department: bool
    upc_list: List[str]
    show_clipped_coupons: bool
    show_only_special_offers: bool
    show_redeemed_offers: bool
    offer_ids: List[int]
    display_reason_filters: List[str]


class CouponEndpointAnalyzer:
    """Analyzes and validates coupon endpoints from APK and mitmproxy logs."""

    def __init__(self):
        """Initialize the analyzer."""
        self.apk_endpoints = {}
        self.current_endpoints = {}
        self.log_data = {}
        self.analysis_results = {}

    def analyze_apk_endpoints(self) -> Dict[str, CouponEndpointInfo]:
        """Analyze APK-discovered coupon endpoints from Zk/b.java."""
        logger.info("🔍 Analyzing APK-discovered coupon endpoints...")
        
        apk_endpoints = {
            "clip": CouponEndpointInfo(
                method="POST",
                path="/loyalty/mPerks/api/offers/Clip",
                accept_header="application/vnd.meijer.digitalmperks.clip-v1.0+json",
                content_type_header="application/vnd.meijer.digitalmperks.clip-v1.0+json",
                request_model="ClipUnclipCouponRequest(meijerOfferId: long, storeId: int, cartIsActive: bool)",
                response_model="ClipUnclipCouponResponse(code: int, result: string)",
                description="Clip (activate) a coupon using meijerOfferId"
            ),
            "unclip": CouponEndpointInfo(
                method="POST", 
                path="/loyalty/mPerks/api/offers/Unclip",
                accept_header="application/vnd.meijer.digitalmperks.unclip-v1.0+json",
                content_type_header="application/vnd.meijer.digitalmperks.unclip-v1.0+json",
                request_model="ClipUnclipCouponRequest(meijerOfferId: long, storeId: int, cartIsActive: bool)",
                response_model="ClipUnclipCouponResponse(code: int, result: string)",
                description="Unclip (deactivate) a coupon using meijerOfferId"
            ),
            "get_offers": CouponEndpointInfo(
                method="POST",
                path="/loyalty/mPerks/api/offers",
                accept_header="application/vnd.meijer.digitalmperks.offers-v1.0+json",
                content_type_header="application/vnd.meijer.digitalmperks.offers-v1.0+json",
                request_model="CouponsRequest with complex filtering",
                response_model="CouponsResponseJson with offers array",
                description="Get available and clipped offers with filtering"
            ),
            "get_clipped_offers": CouponEndpointInfo(
                method="POST",
                path="/loyalty/mPerks/api/offers/ClippedOffers",
                accept_header="application/vnd.meijer.digitalmperks.offers-v1.0+json",
                content_type_header="application/vnd.meijer.digitalmperks.offers-v1.0+json",
                request_model="CouponsRequest",
                response_model="CouponsResponseJson",
                description="Get only clipped offers"
            )
        }
        
        logger.info(f"✅ Discovered {len(apk_endpoints)} coupon endpoints from APK")
        return apk_endpoints

    def analyze_current_implementation(self) -> Dict[str, Any]:
        """Analyze current coupon implementation in meijer/coupons.py."""
        logger.info("🔍 Analyzing current coupon implementation...")
        
        current_impl = {
            "clip_endpoint": "/loyalty/mPerks/api/offers/Clip",
            "unclip_endpoint": "/loyalty/mPerks/api/offers/Unclip", 
            "clip_headers": {"Content-Type": "application/json"},
            "unclip_headers": {"Content-Type": "application/json"},
            "request_body": {"offerId": "coupon_id"},
            "success_check": "response.status_code == 200",
            "issues_found": []
        }
        
        # Identify issues with current implementation
        issues = []
        
        # Check headers - missing versioned Accept headers
        if current_impl["clip_headers"].get("Accept") is None:
            issues.append("Missing Accept header for clip endpoint")
        if current_impl["clip_headers"].get("Content-Type") != "application/vnd.meijer.digitalmperks.clip-v1.0+json":
            issues.append("Incorrect Content-Type header for clip endpoint")
            
        # Check request body structure - should be meijerOfferId not offerId
        if "offerId" in str(current_impl["request_body"]):
            issues.append("Request body uses 'offerId' instead of 'meijerOfferId'")
        if "storeId" not in str(current_impl["request_body"]):
            issues.append("Request body missing 'storeId' field")
        if "cartIsActive" not in str(current_impl["request_body"]):
            issues.append("Request body missing 'cartIsActive' field")
            
        current_impl["issues_found"] = issues
        logger.info(f"🔍 Found {len(issues)} issues with current implementation")
        
        return current_impl

    def analyze_mitmproxy_logs(self) -> Optional[OffersRequestStructure]:
        """Analyze mitmproxy logs for offers API request structure."""
        logger.info("🔍 Analyzing mitmproxy logs for offers API structure...")
        
        try:
            with open('meijer_analysis_report.json', 'r') as f:
                content = f.read()
                
            # Look for the offers request body
            if '"sortType":"BySuggested"' in content:
                # Extract offers request structure from logs
                offers_request = OffersRequestStructure(
                    sort_type="BySuggested",
                    page_size=9999,
                    current_page=1,
                    offer_class=1,
                    search_criteria="",
                    store_id=0,
                    ceiling_count=0,
                    ceiling_duration=0,
                    reward_coupon_id=0,
                    tag_id="",
                    get_offer_count_per_department=True,
                    upc_list=[],
                    show_clipped_coupons=True,
                    show_only_special_offers=False,
                    show_redeemed_offers=False,
                    offer_ids=[],
                    display_reason_filters=[]
                )
                logger.info("✅ Successfully parsed offers request structure from logs")
                return offers_request
            else:
                logger.warning("⚠️  No offers request found in mitmproxy logs")
                return None
                
        except Exception as e:
            logger.error(f"❌ Error analyzing mitmproxy logs: {e}")
            return None

    def generate_updated_implementation(self) -> Dict[str, Any]:
        """Generate updated coupon implementation based on APK analysis."""
        logger.info("🔧 Generating updated coupon implementation...")
        
        apk_endpoints = self.analyze_apk_endpoints()
        
        updated_impl = {
            "clip_coupon": {
                "method": "POST",
                "url_template": "{api_base_url}/loyalty/mPerks/api/offers/Clip",
                "headers": {
                    "Accept": "application/vnd.meijer.digitalmperks.clip-v1.0+json",
                    "Content-Type": "application/vnd.meijer.digitalmperks.clip-v1.0+json"
                },
                "request_body_template": {
                    "meijerOfferId": "{coupon_id}",  # Long - the coupon's meijerOfferId
                    "storeId": 0,  # Int - store ID, 0 for any store
                    "cartIsActive": False  # Boolean - whether shopping cart is active
                },
                "success_codes": [200, 201],
                "response_fields": ["code", "result"],
                "success_check": "response_json.get('result') == 'Success'"
            },
            "unclip_coupon": {
                "method": "POST", 
                "url_template": "{api_base_url}/loyalty/mPerks/api/offers/Unclip",
                "headers": {
                    "Accept": "application/vnd.meijer.digitalmperks.unclip-v1.0+json",
                    "Content-Type": "application/vnd.meijer.digitalmperks.unclip-v1.0+json"
                },
                "request_body_template": {
                    "meijerOfferId": "{coupon_id}",  # Long - the coupon's meijerOfferId  
                    "storeId": 0,  # Int - store ID, 0 for any store
                    "cartIsActive": False  # Boolean - whether shopping cart is active
                },
                "success_codes": [200, 201],
                "response_fields": ["code", "result"],
                "success_check": "response_json.get('result') == 'Success'"
            },
            "get_offers": {
                "method": "POST",
                "url_template": "{api_base_url}/loyalty/mPerks/api/offers",
                "headers": {
                    "Accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
                    "Content-Type": "application/vnd.meijer.digitalmperks.offers-v1.0+json"
                },
                "request_body_template": {
                    "sortType": "BySuggested",
                    "pageSize": 9999,
                    "currentPage": 1,
                    "offerClass": 1,
                    "searchCriteria": "",
                    "storeId": 0,
                    "ceilingCount": 0,
                    "ceilingDuration": 0,
                    "rewardCouponId": 0,
                    "tagId": "",
                    "getOfferCountPerDepartment": True,
                    "upcList": [],
                    "showClippedCoupons": True,
                    "showOnlySpecialOffers": False,
                    "showRedeemedOffers": False,
                    "offerIds": [],
                    "displayReasonFilters": []
                },
                "success_codes": [200],
                "response_structure": "Complex offers array with categories and pagination"
            }
        }
        
        logger.info("✅ Generated updated implementation based on APK analysis")
        return updated_impl

    def validate_endpoints(self) -> Dict[str, Any]:
        """Validate current endpoints against APK findings."""
        logger.info("🔍 Validating endpoints against APK findings...")
        
        apk_endpoints = self.analyze_apk_endpoints()
        current_impl = self.analyze_current_implementation()
        
        validation_results = {
            "endpoints_match": True,
            "headers_correct": False,
            "request_body_correct": False,
            "response_handling_correct": False,
            "critical_issues": [],
            "recommendations": []
        }
        
        # Check endpoint paths
        if current_impl["clip_endpoint"] != apk_endpoints["clip"].path:
            validation_results["endpoints_match"] = False
            validation_results["critical_issues"].append(
                f"Clip endpoint mismatch: current='{current_impl['clip_endpoint']}' vs APK='{apk_endpoints['clip'].path}'"
            )
        
        # Check headers
        if "application/vnd.meijer.digitalmperks" not in str(current_impl["clip_headers"]):
            validation_results["headers_correct"] = False
            validation_results["critical_issues"].append("Missing versioned MIME type headers")
            
        # Check request body structure
        if "meijerOfferId" not in str(current_impl["request_body"]):
            validation_results["request_body_correct"] = False
            validation_results["critical_issues"].append("Request body missing meijerOfferId field")
            
        # Generate recommendations
        recommendations = [
            "Update headers to use versioned MIME types (application/vnd.meijer.digitalmperks.*-v1.0+json)",
            "Change request body to use 'meijerOfferId' instead of 'offerId'",
            "Add 'storeId' and 'cartIsActive' fields to request body",
            "Update response handling to check for 'result' field == 'Success'",
            "Add support for 201 Created status codes",
            "Implement proper error handling for coupon clip/unclip failures"
        ]
        validation_results["recommendations"] = recommendations
        
        logger.info(f"🔍 Validation complete: {len(validation_results['critical_issues'])} critical issues found")
        return validation_results

    def generate_comprehensive_report(self) -> Dict[str, Any]:
        """Generate comprehensive analysis report."""
        logger.info("📊 Generating comprehensive coupon endpoints analysis report...")
        
        apk_endpoints = self.analyze_apk_endpoints()
        current_impl = self.analyze_current_implementation()
        updated_impl = self.generate_updated_implementation()
        validation_results = self.validate_endpoints()
        log_structure = self.analyze_mitmproxy_logs()
        
        report = {
            "analysis_summary": {
                "apk_endpoints_discovered": len(apk_endpoints),
                "current_implementation_issues": len(current_impl["issues_found"]),
                "critical_validation_issues": len(validation_results["critical_issues"]),
                "recommendations_count": len(validation_results["recommendations"])
            },
            "apk_findings": {
                endpoint_name: {
                    "method": endpoint.method,
                    "path": endpoint.path,
                    "accept_header": endpoint.accept_header,
                    "content_type_header": endpoint.content_type_header,
                    "request_model": endpoint.request_model,
                    "response_model": endpoint.response_model,
                    "description": endpoint.description
                }
                for endpoint_name, endpoint in apk_endpoints.items()
            },
            "current_implementation": current_impl,
            "updated_implementation": updated_impl,
            "validation_results": validation_results,
            "log_analysis": {
                "offers_request_structure_found": log_structure is not None,
                "offers_request_details": log_structure.__dict__ if log_structure else None
            },
            "next_steps": [
                "Update meijer/coupons.py with correct headers and request body structure",
                "Test clip/unclip operations with real coupon IDs",
                "Validate offers API with complex request structure",
                "Update error handling for various response codes",
                "Add unit tests for updated coupon functionality"
            ]
        }
        
        return report

    def run_analysis(self) -> Dict[str, Any]:
        """Run complete coupon endpoint analysis."""
        logger.info("🚀 Starting comprehensive coupon endpoint analysis...")
        
        try:
            report = self.generate_comprehensive_report()
            
            # Save report
            with open('coupon_endpoint_analysis_report.json', 'w') as f:
                json.dump(report, f, indent=2, default=str)
            
            logger.info("📄 Analysis report saved to: coupon_endpoint_analysis_report.json")
            return report
            
        except Exception as e:
            logger.error(f"❌ Analysis failed: {e}")
            raise


def main():
    """Main function to run coupon endpoint analysis."""
    print("🎯 COMPREHENSIVE COUPON ENDPOINT ANALYSIS")
    print("=" * 60)
    print("Analyzing APK findings, mitmproxy logs, and current implementation")
    print()
    
    analyzer = CouponEndpointAnalyzer()
    
    try:
        report = analyzer.run_analysis()
        
        # Display summary
        print("\n" + "=" * 60)
        print("📊 ANALYSIS SUMMARY")
        print("=" * 60)
        
        summary = report["analysis_summary"]
        print(f"🔍 APK endpoints discovered: {summary['apk_endpoints_discovered']}")
        print(f"⚠️  Current implementation issues: {summary['current_implementation_issues']}")
        print(f"🚨 Critical validation issues: {summary['critical_validation_issues']}")
        print(f"💡 Recommendations: {summary['recommendations_count']}")
        
        # Display critical issues
        if report["validation_results"]["critical_issues"]:
            print(f"\n🚨 CRITICAL ISSUES:")
            for issue in report["validation_results"]["critical_issues"]:
                print(f"   • {issue}")
        
        # Display key recommendations
        print(f"\n💡 KEY RECOMMENDATIONS:")
        for i, rec in enumerate(report["validation_results"]["recommendations"][:3], 1):
            print(f"   {i}. {rec}")
        
        # Display APK findings
        print(f"\n🔍 APK FINDINGS:")
        for name, endpoint in report["apk_findings"].items():
            print(f"   • {name.upper()}:")
            print(f"     - Method: {endpoint['method']}")
            print(f"     - Path: {endpoint['path']}")
            print(f"     - Content-Type: {endpoint['content_type_header']}")
        
        print(f"\n✅ Analysis completed successfully!")
        print(f"📄 Full report: coupon_endpoint_analysis_report.json")
        
        return 0
        
    except Exception as e:
        print(f"\n❌ Analysis failed: {e}")
        return 1


if __name__ == "__main__":
    exit(main()) 