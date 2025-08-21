package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BVFeatureUsedEvent extends BVMobileAnalyticsEvent {
    private final String brand;
    private final BVEventValues.BVFeatureUsedEventType bvFeatureUsedEventType;
    private final BVEventValues.BVProductType bvProductType;
    private final String productId;

    public BVFeatureUsedEvent(String str, BVEventValues.BVProductType bVProductType, BVEventValues.BVFeatureUsedEventType bVFeatureUsedEventType, String str2) {
        super(BVEventValues.BVEventClass.FEATURE, BVEventValues.BVEventType.USED);
        this.productId = str;
        this.bvProductType = bVProductType;
        this.bvFeatureUsedEventType = bVFeatureUsedEventType;
        this.brand = str2;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        boolean z10;
        Map<String, Object> raw = super.toRaw();
        String str = this.brand;
        if (str != null) {
            BVAnalyticsUtils.mapPutSafe(raw, "brand", str);
        }
        if (this.bvFeatureUsedEventType != BVEventValues.BVFeatureUsedEventType.IN_VIEW) {
            z10 = true;
        } else {
            z10 = false;
        }
        BVAnalyticsUtils.mapPutSafe(raw, "interaction", z10);
        BVAnalyticsUtils.mapPutSafe(raw, "productId", this.productId);
        BVAnalyticsUtils.mapPutSafe(raw, "bvProduct", this.bvProductType.toString());
        BVAnalyticsUtils.mapPutSafe(raw, "name", this.bvFeatureUsedEventType.toString());
        return raw;
    }
}
