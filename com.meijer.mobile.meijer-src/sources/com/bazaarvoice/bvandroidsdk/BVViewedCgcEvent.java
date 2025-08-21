package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BVViewedCgcEvent extends BVMobileAnalyticsEvent {
    private final String brand;
    private final BVEventValues.BVProductType bvProductType;
    private final String categoryId;
    private final String productId;
    private final String rootCategoryId;

    public BVViewedCgcEvent(String str, BVEventValues.BVProductType bVProductType, String str2, String str3, String str4) {
        super(BVEventValues.BVEventClass.FEATURE, BVEventValues.BVEventType.VIEWED_CGC);
        this.productId = str;
        this.bvProductType = bVProductType;
        this.rootCategoryId = str2;
        this.categoryId = str3;
        this.brand = str4;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "productId", this.productId);
        BVAnalyticsUtils.mapPutSafe(raw, "bvProduct", this.bvProductType);
        BVAnalyticsUtils.mapPutSafe(raw, "rootCategoryId", this.rootCategoryId);
        BVAnalyticsUtils.mapPutSafe(raw, "categoryId", this.categoryId);
        BVAnalyticsUtils.mapPutSafe(raw, "brand", this.brand);
        return raw;
    }
}
