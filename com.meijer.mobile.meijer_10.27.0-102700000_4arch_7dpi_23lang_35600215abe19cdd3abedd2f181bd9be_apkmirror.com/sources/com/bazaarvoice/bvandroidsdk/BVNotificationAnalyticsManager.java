package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class BVNotificationAnalyticsManager {

    enum NotificationAction {
        Positive("idactionreply"),
        Neutral("idactionremind"),
        Negative("idactiondismiss");

        private final String key;

        public String getKey() {
            return this.key;
        }

        NotificationAction(String str) {
            this.key = str;
        }
    }

    BVNotificationAnalyticsManager() {
    }

    static void sendNotificationEventForNotificationInView(String str, String str2, String str3) {
        BVPixel bvPixel = BVSDK.getInstance().getBvPixel();
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(str, BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVFeatureUsedEventType.NOTIFICATION, null);
        HashMap map = new HashMap();
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "detail1", str2);
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "detail2", str3);
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "name", "InView");
        bVFeatureUsedEvent.setAdditionalParams(map);
        bvPixel.track(bVFeatureUsedEvent);
    }

    static void sendNotificationEventForStoreReviewFeatureUsed(String str, String str2, String str3) {
        BVPixel bvPixel = BVSDK.getInstance().getBvPixel();
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(str2, BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVFeatureUsedEventType.NOTIFICATION, null);
        HashMap map = new HashMap();
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "detail1", str);
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "detail2", str3);
        bVFeatureUsedEvent.setAdditionalParams(map);
        bvPixel.track(bVFeatureUsedEvent);
    }
}
