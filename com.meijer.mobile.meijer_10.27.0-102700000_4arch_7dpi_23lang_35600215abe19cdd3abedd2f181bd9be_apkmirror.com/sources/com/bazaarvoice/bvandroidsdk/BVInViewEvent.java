package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public class BVInViewEvent extends BVMobileAnalyticsEvent {
    private final String brand;
    private final BVEventValues.BVProductType bvProductType;
    private final String containerId;
    private final String productId;

    public BVInViewEvent(String str, String str2, BVEventValues.BVProductType bVProductType, String str3) {
        super(BVEventValues.BVEventClass.FEATURE, BVEventValues.BVEventType.USED);
        this.productId = str;
        BVAnalyticsUtils.warnShouldNotBeEmpty("containerId", str2);
        this.containerId = str2;
        BVAnalyticsUtils.warnShouldNotBeEmpty("bvProductType", bVProductType);
        this.bvProductType = bVProductType;
        this.brand = str3;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "component", this.containerId);
        BVAnalyticsUtils.mapPutSafe(raw, "bvProduct", this.bvProductType.toString());
        BVAnalyticsUtils.mapPutSafe(raw, "name", "InView");
        BVAnalyticsUtils.mapPutSafe(raw, "interaction", false);
        BVAnalyticsUtils.mapPutSafe(raw, "type", "used");
        String str = this.brand;
        if (str != null) {
            BVAnalyticsUtils.mapPutSafe(raw, "brand", str);
        }
        String str2 = this.productId;
        if (str2 != null) {
            BVAnalyticsUtils.mapPutSafe(raw, "productId", str2);
        }
        return raw;
    }
}
