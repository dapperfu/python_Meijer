package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
class BVErrorReport extends BVPiiEvent {
    private final String bvproduct;
    private final String detail1;
    private final String detail2;

    BVErrorReport(BVEventValues.BVProductType bVProductType, String str, Exception exc) {
        super(BVEventValues.BVEventClass.ERROR, BVEventValues.BVEventType.RECORD);
        this.detail1 = exc.getMessage();
        this.detail2 = str;
        this.bvproduct = bVProductType.toString();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent
    protected void getPIIEvent(Map<String, Object> map) {
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent
    protected Map<String, Object> getPiiUnrelatedParams() {
        return null;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent, com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "detail1", this.detail1);
        BVAnalyticsUtils.mapPutSafe(raw, "detail2", this.detail2);
        BVAnalyticsUtils.mapPutSafe(raw, "bvproduct", this.bvproduct);
        BVAnalyticsUtils.mapPutSafe(raw, "name", "Error");
        return raw;
    }

    BVErrorReport(BVEventValues.BVProductType bVProductType, String str, String str2) {
        super(BVEventValues.BVEventClass.ERROR, BVEventValues.BVEventType.RECORD);
        this.detail1 = str2;
        this.detail2 = str;
        this.bvproduct = bVProductType.toString();
    }
}
