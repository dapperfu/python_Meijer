package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
class BVPersonalizationEvent extends BVMobileAnalyticsEvent {
    private final String profileId;

    BVPersonalizationEvent(String str) {
        super(BVEventValues.BVEventClass.PERSONALIZATION, BVEventValues.BVEventType.PROFILE);
        this.profileId = str;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.warnShouldNotBeEmpty("profileId", this.profileId);
        BVAnalyticsUtils.mapPutSafe(raw, "profileId", this.profileId);
        BVAnalyticsUtils.mapPutSafe(raw, "bvProduct", "ShopperMarketing");
        BVAnalyticsUtils.mapPutSafe(raw, "source", "ProfileMobile");
        return raw;
    }
}
