package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BVImpressionEvent extends BVMobileAnalyticsEvent {
    private final String brand;
    private final BVEventValues.BVImpressionContentType bvImpressionContentType;
    private final BVEventValues.BVProductType bvProductType;
    private final String categoryId;
    private final String contentId;
    private final String productId;

    public BVImpressionEvent(String str, String str2, BVEventValues.BVProductType bVProductType, BVEventValues.BVImpressionContentType bVImpressionContentType, String str3, String str4) {
        super(BVEventValues.BVEventClass.IMPRESSION, BVEventValues.BVEventType.UGC);
        BVAnalyticsUtils.warnShouldNotBeEmpty("productId", str);
        this.productId = str;
        BVAnalyticsUtils.warnShouldNotBeEmpty("contentId", str2);
        this.contentId = str2;
        BVAnalyticsUtils.warnShouldNotBeEmpty("bvProductType", bVProductType);
        this.bvProductType = bVProductType;
        BVAnalyticsUtils.warnShouldNotBeEmpty("bvImpressionContentType", bVImpressionContentType);
        this.bvImpressionContentType = bVImpressionContentType;
        this.categoryId = str3;
        this.brand = str4;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, "productId", this.productId);
        BVAnalyticsUtils.mapPutSafe(raw, "contentId", this.contentId);
        BVAnalyticsUtils.mapPutSafe(raw, "contentType", this.bvImpressionContentType.toString());
        BVAnalyticsUtils.mapPutSafe(raw, "bvProduct", this.bvProductType.toString());
        String str = this.categoryId;
        if (str != null) {
            BVAnalyticsUtils.mapPutSafe(raw, "categoryId", str);
        }
        String str2 = this.brand;
        if (str2 != null) {
            BVAnalyticsUtils.mapPutSafe(raw, "brand", str2);
        }
        return raw;
    }
}
