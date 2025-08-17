package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
class BVEventKeys {
    static final String BATCH = "batch";

    static class CommonAnalyticsParams {
        static final String HASHED_IP = "HashedIP";
        static final String USER_AGENT = "UA";

        CommonAnalyticsParams() {
        }
    }

    static class Event {
        static final String BVPRODUCTVERSION = "bvProductVersion";
        static final String CLASS = "cl";
        static final String SOURCE = "source";
        static final String TYPE = "type";
        static final String UA_MOBILE = "ua_mobile";
        static final String UA_PLATFORM = "ua_platform";
        static final String UA_PLATFORM_VERSION = "ua_platform_version";

        Event() {
        }
    }

    static class FeatureUsedEvent {
        static final String BRAND = "brand";
        static final String BV_CONTENT_TYPE = "contentType";
        static final String BV_FEATURE_NAME = "name";
        static final String BV_PRODUCT_TYPE = "bvProduct";
        static final String CONTAINER_ID = "component";
        static final String CONTENT_ID = "contentId";
        static final String DETAIL_1 = "detail1";
        static final String DETAIL_2 = "detail2";
        static final String HAS_FINGERPRINT = "fingerprinting";
        static final String INTERACTION = "interaction";
        static final String PRODUCT_ID = "productId";
        static final String TYPE = "type";

        FeatureUsedEvent() {
        }
    }

    static class ImpressionEvent {
        static final String BRAND = "brand";
        static final String BV_CONTENT_TYPE = "contentType";
        static final String BV_PRODUCT_TYPE = "bvProduct";
        static final String CATEGORY_ID = "categoryId";
        static final String CONTENT_ID = "contentId";
        static final String PRODUCT_ID = "productId";

        ImpressionEvent() {
        }
    }

    static class Location {
        static final String DURATION = "durationSecs";
        static final String LOCATION_ID = "locationId";
        static final String TRANSITION = "transition";

        Location() {
        }
    }

    static class MobileAppLifecycleEvent {
        static final String APP_STATE = "appState";
        static final String BV_SDK_VERSION = "bvSDKVersion";
        static final String MOBILE_APP_IDENTIFIER = "mobileAppIdentifier";
        static final String MOBILE_APP_VERSION = "mobileAppVersion";
        static final String MOBILE_DEVICE_NAME = "mobileDeviceName";
        static final String MOBILE_OS = "mobileOS";
        static final String MOBILE_OS_VERSION = "mobileOSVersion";

        MobileAppLifecycleEvent() {
        }
    }

    static class MobileEvent {
        static final String ADVERTISING_ID = "advertisingId";
        static final String CLIENT_ID = "client";
        static final String MOBILE_SOURCE = "mobileSource";

        MobileEvent() {
        }
    }

    static class NonCommerceConversionEvent {
        static final String HAD_PII = "hadPII";
        static final String LABEL = "label";
        static final String LOAD_ID = "loadId";
        static final String VALUE = "value";

        NonCommerceConversionEvent() {
        }
    }

    static class PageViewEvent {
        static final String BV_PRODUCT_TYPE = "bvProduct";
        static final String CATEGORY_ID = "categoryId";
        static final String PRODUCT_ID = "productId";
        static final String REPORTING_GROUP = "reportingGroup";

        PageViewEvent() {
        }
    }

    static class PersonalizationEvent {
        static final String PROFILE_ID = "profileId";

        PersonalizationEvent() {
        }
    }

    static class Transaction {
        static final String CITY = "city";
        static final String COUNTRY = "country";
        static final String CURRENCY = "currency";
        static final String ITEMS = "items";
        static final String ORDER_ID = "orderId";
        static final String SHIPPING = "shipping";
        static final String STATE = "state";
        static final String TAX = "tax";
        static final String TOTAL = "total";

        Transaction() {
        }
    }

    static class TransactionItem {
        static final String CATEGORY = "category";
        static final String IMAGE_URL = "imageurl";
        static final String NAME = "name";
        static final String PRICE = "price";
        static final String QUANTITY = "quantity";
        static final String SKU = "sku";

        TransactionItem() {
        }
    }

    static class ViewedCgcEvent {
        static final String BRAND = "brand";
        static final String BV_PRODUCT_TYPE = "bvProduct";
        static final String CATEGORY_ID = "categoryId";
        static final String PRODUCT_ID = "productId";
        static final String ROOT_CATEGORY_ID = "rootCategoryId";

        ViewedCgcEvent() {
        }
    }

    BVEventKeys() {
    }
}
