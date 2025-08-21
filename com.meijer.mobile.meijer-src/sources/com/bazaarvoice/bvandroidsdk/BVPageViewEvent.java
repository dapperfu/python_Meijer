package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BVPageViewEvent extends BVMobileAnalyticsEvent {
    private final BVEventValues.BVProductType bvProductType;
    private final String categoryId;
    private final String productId;

    public BVPageViewEvent(String str, BVEventValues.BVProductType bVProductType, String str2) {
        super(BVEventValues.BVEventClass.PAGE_VIEW, BVEventValues.BVEventType.EMBEDDED);
        BVAnalyticsUtils.warnShouldNotBeEmpty("productId", str);
        this.productId = str;
        BVAnalyticsUtils.warnShouldNotBeEmpty("bvProductType", bVProductType);
        this.bvProductType = bVProductType;
        this.categoryId = str2;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "productId", this.productId);
        String str = this.categoryId;
        if (str != null) {
            BVAnalyticsUtils.mapPutSafe(raw, "categoryId", str);
        }
        BVAnalyticsUtils.mapPutSafe(raw, "bvProduct", this.bvProductType.toString());
        return raw;
    }
}
