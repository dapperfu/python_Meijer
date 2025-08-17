package com.bazaarvoice.bvandroidsdk;

import android.os.Build;

/* loaded from: classes4.dex */
public class BVEventValues {
    static final String BVSDK_USER_AGENT = "Mozilla/5.0 (Linux; Android " + Build.VERSION.RELEASE + " " + Build.DEVICE + " " + Build.MODEL + ") bvsdk-android/8.19.0";
    static final String FEATURE_IN_VIEW = "InView";
    static final String HASHED_IP = "default";
    static final String MOBILE_OS = "Android";
    static final String MOBILE_SOURCE = "bv-android-sdk";
    static final String NONTRACKING_TOKEN = "nontracking";

    enum AppState {
        LAUNCHED("launched"),
        PAUSED("background"),
        RESUMED("active");

        private String value;

        public String getValue() {
            return this.value;
        }

        AppState(String str) {
            this.value = str;
        }
    }

    public enum BVEventClass {
        FEATURE("Feature"),
        CONVERSION("Conversion"),
        PERSONALIZATION("Personalization"),
        PAGE_VIEW("PageView"),
        IMPRESSION("Impression"),
        PII_CONVERSION("PIIConversion"),
        LIFECYCLE("Lifecycle"),
        LOCATION("Location"),
        ERROR("Error");

        private String value;

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        BVEventClass(String str) {
            this.value = str;
        }
    }

    enum BVEventSource {
        NATIVE_MOBILE_SDK("native-mobile-sdk"),
        NATIVE_MOBILE_CUSTOM("native-mobile-custom");

        private String value;

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        BVEventSource(String str) {
            this.value = str;
        }
    }

    public enum BVEventType {
        USED("Used"),
        TRANSACTION("Transaction"),
        PRODUCT("Product"),
        PROFILE("ProfileMobile"),
        UGC("UGC"),
        MOBILE_APP("MobileApp"),
        PERSONALIZATION("Personalization"),
        VIEWED_CGC("UsedViewedUGC"),
        VISIT("Visit"),
        EMBEDDED("Embedded"),
        ERORR("Error"),
        RECORD("Record");

        private String value;

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        BVEventType(String str) {
            this.value = str;
        }
    }

    public enum BVFeatureUsedEventType {
        WRITE_REVIEW("Write"),
        ASK_QUESTION("Question"),
        ANSWER_QUESTION("Answer"),
        FEEDBACK("Helpfulness"),
        INAPPROPRIATE("Inappropriate"),
        PHOTO("Photo"),
        SCROLLED("Scrolled"),
        IN_VIEW(BVEventValues.FEATURE_IN_VIEW),
        PROFILE("Profile"),
        CONTENT_CLICK("Click"),
        NOTIFICATION("PushNotification"),
        ENGAGED("Engaged"),
        REVIEWHIGHLIGHTS("ReviewHighlights");

        private String value;

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        BVFeatureUsedEventType(String str) {
            this.value = str;
        }
    }

    public enum BVImpressionContentType {
        REVIEW("Review"),
        QUESTION("Question"),
        ANSWER("Answer"),
        COMMENT("Comment"),
        PRODUCT_RECOMMENDATION("Recommendation"),
        CURATIONS_FEED_ITEM("SocialPost"),
        STORE("Store"),
        STORE_REVIEW("StoreReview");

        private String value;

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        BVImpressionContentType(String str) {
            this.value = str;
        }
    }

    public enum BVProductType {
        AUTHENTICATION("Authentication"),
        CONVERSATIONS_REVIEWS("RatingsAndReviews"),
        CONVERSATIONS_QANDA("AskAndAnswer"),
        CONVERSATIONS_REVIEWHIGHLIGHTS("ReviewHighlights"),
        CONVERSATIONS_PROFILE("Profiles"),
        CURATIONS("Curations"),
        PERSONALIZATION("Personalization"),
        VISIT("Visit"),
        USED("Used"),
        PROGRESSIVE_SUBMISSION("ProgressiveSubmission");

        private String value;

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        BVProductType(String str) {
            this.value = str;
        }
    }
}
