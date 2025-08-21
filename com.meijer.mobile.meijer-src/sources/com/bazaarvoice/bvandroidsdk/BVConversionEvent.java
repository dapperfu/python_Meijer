package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class BVConversionEvent extends BVPiiEvent {
    private final String label;
    private final String loadId;
    private final String value;

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent
    protected void getPIIEvent(Map<String, Object> map) {
    }

    public BVConversionEvent(String str, String str2, String str3) {
        super(BVEventValues.BVEventClass.PII_CONVERSION, str);
        BVAnalyticsUtils.warnShouldNotBeEmpty("value", str2);
        this.value = str2;
        this.label = str3;
        this.loadId = BVAnalyticsUtils.generateLoadId();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent
    protected Map<String, Object> getPiiUnrelatedParams() {
        HashMap map = new HashMap();
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "value", this.value);
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "loadId", this.loadId);
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "label", this.label);
        return map;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent, com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "cl", BVEventValues.BVEventClass.PII_CONVERSION.toString());
        return raw;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVPiiEvent
    public Map<String, Object> toRawNonPii() {
        Map<String, Object> rawNonPii = super.toRawNonPii();
        BVAnalyticsUtils.mapPutSafe(rawNonPii, "cl", BVEventValues.BVEventClass.CONVERSION.toString());
        return rawNonPii;
    }
}
