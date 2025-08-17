package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
class BVMobileAppLifecycleEvent extends BVMobileAnalyticsEvent {
    private final BVEventValues.AppState appState;

    BVMobileAppLifecycleEvent(BVEventValues.AppState appState) {
        super(BVEventValues.BVEventClass.LIFECYCLE, BVEventValues.BVEventType.MOBILE_APP);
        BVAnalyticsUtils.warnShouldNotBeEmpty("appState", appState);
        this.appState = appState;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVMobileInfo mobileInfo = getBvMobileParams().getMobileInfo();
        BVAnalyticsUtils.mapPutSafe(raw, "appState", this.appState.getValue());
        BVAnalyticsUtils.mapPutSafe(raw, "mobileOS", mobileInfo.getMobileOs());
        BVAnalyticsUtils.mapPutSafe(raw, "mobileOSVersion", mobileInfo.getMobileOsVersion());
        BVAnalyticsUtils.mapPutSafe(raw, "mobileDeviceName", mobileInfo.getMobileDeviceName());
        BVAnalyticsUtils.mapPutSafe(raw, "mobileAppIdentifier", mobileInfo.getMobileAppIdentifier());
        BVAnalyticsUtils.mapPutSafe(raw, "mobileAppVersion", mobileInfo.getMobileAppVersion());
        BVAnalyticsUtils.mapPutSafe(raw, "bvSDKVersion", mobileInfo.getBvSdkVersion());
        return raw;
    }
}
