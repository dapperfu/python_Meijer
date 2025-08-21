package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public class BVLocationEvent extends BVMobileAnalyticsEvent {
    private long duration;
    private String locationId;
    private String transition;

    public BVLocationEvent(String str, String str2, long j10) {
        super(BVEventValues.BVEventClass.LOCATION, BVEventValues.BVEventType.VISIT);
        BVAnalyticsUtils.warnShouldNotBeEmpty("transition", str);
        this.transition = str;
        BVAnalyticsUtils.warnShouldNotBeEmpty("locationId", str);
        this.locationId = str2;
        this.duration = j10;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "locationId", this.locationId);
        BVAnalyticsUtils.mapPutSafe(raw, "transition", this.transition);
        long j10 = this.duration;
        if (j10 > 0) {
            BVAnalyticsUtils.mapPutSafe(raw, "durationSecs", j10);
        }
        return raw;
    }
}
