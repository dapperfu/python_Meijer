package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
final class BVRemoteConfig {
    private static final String RELATIVE_CONFIG_TEMPLATE_URL = "incubator-mobile-apps/sdk/v1/android/%s/%s/%s";

    BVRemoteConfig() {
    }

    static String getFeatureConfigUrl(String str, String str2) {
        BVSDK bvsdk = BVSDK.getInstance();
        return bvsdk.getBvWorkerData().getRootApiUrls().getNotificationConfigUrl() + String.format(RELATIVE_CONFIG_TEMPLATE_URL, bvsdk.getBvUserProvidedData().getBvConfig().getClientId(), str, str2);
    }
}
