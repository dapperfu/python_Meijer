package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class BVMobileAnalyticsEvent extends BVAnalyticsEvent {
    private boolean allowAdId;
    private BVMobileParams bvMobileParams;

    public BVMobileAnalyticsEvent(BVEventValues.BVEventClass bVEventClass, String str) {
        super(bVEventClass, str);
        this.allowAdId = true;
    }

    private String getAllowedAdId() {
        BVMobileParams bVMobileParams = this.bvMobileParams;
        return (bVMobileParams == null || bVMobileParams.getBvAdvertisingId().getAdvertisingId() == null || this.bvMobileParams.getBvAdvertisingId().getAdvertisingId().isEmpty() || !this.allowAdId) ? "nontracking" : this.bvMobileParams.getBvAdvertisingId().getAdvertisingId();
    }

    protected BVMobileParams getBvMobileParams() {
        return this.bvMobileParams;
    }

    protected void setAllowAdId(boolean z10) {
        this.allowAdId = z10;
    }

    public void setBvMobileParams(BVMobileParams bVMobileParams) {
        BVAnalyticsUtils.warnShouldNotBeEmpty("bvMobileParams", bVMobileParams);
        this.bvMobileParams = bVMobileParams;
        setBvCommonAnalyticsParams(bVMobileParams.getBvCommonAnalyticsParams());
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        BVAnalyticsUtils.warnShouldNotBeEmpty("bvMobileParams", this.bvMobileParams);
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "advertisingId", getAllowedAdId());
        BVAnalyticsUtils.mapPutSafe(raw, "mobileSource", "bv-android-sdk");
        BVAnalyticsUtils.mapPutSafe(raw, "client", this.bvMobileParams.getClientId());
        BVAnalyticsUtils.mapPutSafe(raw, "source", this.bvMobileParams.getSource().toString());
        BVAnalyticsUtils.mapPutSafe(raw, "bvProductVersion", "8.19.0");
        return raw;
    }

    public BVMobileAnalyticsEvent(BVEventValues.BVEventClass bVEventClass, BVEventValues.BVEventType bVEventType) {
        super(bVEventClass, bVEventType);
        this.allowAdId = true;
    }
}
