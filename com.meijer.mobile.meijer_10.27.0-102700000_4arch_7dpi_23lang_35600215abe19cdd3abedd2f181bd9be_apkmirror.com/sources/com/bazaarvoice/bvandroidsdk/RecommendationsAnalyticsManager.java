package com.bazaarvoice.bvandroidsdk;

import L6.b;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class RecommendationsAnalyticsManager {
    private static final String KEY_RKB = "RKB";
    private static final String KEY_RKC = "RKC";
    private static final String KEY_RKI = "RKI";
    private static final String KEY_RKP = "RKP";
    private static final String KEY_RKT = "RKT";
    private static final String KEY_RS = "RS";
    private static final String KEY_SPONSORED = "sponsored";
    private static final String TAG = "RecommendationsAnalyticsManager";
    private static BVPixel bvPixel = BVSDK.getInstance().getBvPixel();

    private static String getCategoryId(BVProduct bVProduct) {
        if (bVProduct == null || bVProduct.getCategoryIds() == null || bVProduct.getCategoryIds().size() <= 0) {
            return null;
        }
        return bVProduct.getCategoryIds().get(bVProduct.getCategoryIds().size() - 1);
    }

    private static Map<String, Object> getRecommendationAttributesPartialSchema(BVProduct bVProduct) {
        HashMap map = new HashMap();
        RecommendationStats recommendationStats = bVProduct.getRecommendationStats();
        if (recommendationStats != null) {
            b.h(map, KEY_RKC, Long.valueOf(recommendationStats.getRkc()));
            b.h(map, KEY_RKT, Long.valueOf(recommendationStats.getRkt()));
            b.h(map, KEY_RKP, Long.valueOf(recommendationStats.getRkp()));
            b.h(map, KEY_RKI, Long.valueOf(recommendationStats.getRki()));
            b.h(map, KEY_RKB, Long.valueOf(recommendationStats.getRkb()));
        }
        b.h(map, KEY_RS, bVProduct.getRs());
        b.h(map, KEY_SPONSORED, Boolean.valueOf(bVProduct.isSponsored()));
        return map;
    }

    private static Map<String, Object> getShopperProfileAttributesPartialSchema(ShopperProfile shopperProfile, PageType pageType) {
        HashMap map = new HashMap();
        if (pageType != null) {
            b.h(map, "pageType", pageType.toString());
        }
        if (shopperProfile != null && shopperProfile.getProfile() != null) {
            Profile profile = shopperProfile.getProfile();
            b.h(map, "plan", shopperProfile.getProfile().getPlan());
            b.h(map, "activeUser", Boolean.valueOf(shopperProfile.getProfile().getRecommendationStats().isActiveUser()));
            if (profile.getRecommendedProducts() != null) {
                b.h(map, "numRecommendations", Integer.valueOf(shopperProfile.getProfile().getRecommendedProducts().size()));
            }
            RecommendationStats recommendationStats = profile.getRecommendationStats();
            if (recommendationStats != null) {
                map.putAll(getShopperStatsPartialSchema(recommendationStats));
            }
        }
        return map;
    }

    private static Map<String, Object> getShopperStatsPartialSchema(RecommendationStats recommendationStats) {
        HashMap map = new HashMap();
        if (recommendationStats != null) {
            b.h(map, KEY_RKC, Long.valueOf(recommendationStats.getRkc()));
            b.h(map, KEY_RKT, Long.valueOf(recommendationStats.getRkt()));
            b.h(map, KEY_RKP, Long.valueOf(recommendationStats.getRkp()));
            b.h(map, KEY_RKI, Long.valueOf(recommendationStats.getRki()));
            b.h(map, KEY_RKB, Long.valueOf(recommendationStats.getRkb()));
        }
        return map;
    }

    private static boolean isProductValid(BVProduct bVProduct) {
        return (bVProduct == null || bVProduct.getId() == null) ? false : true;
    }

    public static void sendBvViewGroupAddedToHierarchyEvent(ReportingGroup reportingGroup) {
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent("", BVEventValues.BVProductType.PERSONALIZATION, BVEventValues.BVFeatureUsedEventType.IN_VIEW, null);
        HashMap map = new HashMap();
        map.put("component", reportingGroup.toString());
        bVFeatureUsedEvent.setAdditionalParams(map);
        bvPixel.track(bVFeatureUsedEvent);
    }

    public static void sendBvViewGroupInteractedWithEvent(ReportingGroup reportingGroup, PageType pageType, ShopperProfile shopperProfile) {
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(null, BVEventValues.BVProductType.PERSONALIZATION, BVEventValues.BVFeatureUsedEventType.SCROLLED, null);
        Map<String, Object> shopperProfileAttributesPartialSchema = getShopperProfileAttributesPartialSchema(shopperProfile, pageType);
        shopperProfileAttributesPartialSchema.put("component", reportingGroup.toString());
        bVFeatureUsedEvent.setAdditionalParams(shopperProfileAttributesPartialSchema);
        bvPixel.track(bVFeatureUsedEvent);
    }

    public static void sendEmbeddedPageView(ReportingGroup reportingGroup, String str, String str2, PageType pageType, ShopperProfile shopperProfile) {
        BVPageViewEvent bVPageViewEvent = new BVPageViewEvent(str, BVEventValues.BVProductType.PERSONALIZATION, str2);
        Map<String, Object> shopperProfileAttributesPartialSchema = getShopperProfileAttributesPartialSchema(shopperProfile, pageType);
        b.h(shopperProfileAttributesPartialSchema, "component", reportingGroup.toString());
        bVPageViewEvent.setAdditionalParams(shopperProfileAttributesPartialSchema);
        bvPixel.track(bVPageViewEvent);
    }

    public static void sendFeatureUsedEvent(String str, ShopperProfile shopperProfile, BVProduct bVProduct) {
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(bVProduct.getId(), BVEventValues.BVProductType.PERSONALIZATION, BVEventValues.BVFeatureUsedEventType.IN_VIEW, null);
        Map<String, Object> shopperProfileAttributesPartialSchema = getShopperProfileAttributesPartialSchema(shopperProfile, null);
        b.h(shopperProfileAttributesPartialSchema, "categoryId", getCategoryId(bVProduct));
        b.h(shopperProfileAttributesPartialSchema, "type", "Used");
        b.h(shopperProfileAttributesPartialSchema, "component", str);
        bVFeatureUsedEvent.setAdditionalParams(shopperProfileAttributesPartialSchema);
        bvPixel.track(bVFeatureUsedEvent);
    }

    public static void sendProductConversionEvent(ShopperProfile shopperProfile, BVProduct bVProduct) {
        if (!shouldSendProductEvent(bVProduct)) {
            return;
        }
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(bVProduct.getId(), BVEventValues.BVProductType.PERSONALIZATION, BVEventValues.BVFeatureUsedEventType.ENGAGED, null);
        Map<String, Object> recommendationAttributesPartialSchema = getRecommendationAttributesPartialSchema(bVProduct);
        recommendationAttributesPartialSchema.putAll(getShopperProfileAttributesPartialSchema(shopperProfile, null));
        b.h(recommendationAttributesPartialSchema, "productId", bVProduct.getId());
        b.h(recommendationAttributesPartialSchema, "categoryId", getCategoryId(bVProduct));
        bVFeatureUsedEvent.setAdditionalParams(recommendationAttributesPartialSchema);
        bvPixel.track(bVFeatureUsedEvent);
    }

    private static boolean shouldSendProductEvent(BVProduct bVProduct) {
        String id2;
        BVLogger bvLogger = BVSDK.getInstance().getBvLogger();
        if (bVProduct == null) {
            id2 = "null_product";
        } else {
            id2 = bVProduct.getId();
        }
        if (!isProductValid(bVProduct)) {
            bvLogger.w(TAG, "Product impression not sent for invalid product: " + id2);
            return false;
        }
        return true;
    }
}
