package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.Map;

/* loaded from: classes4.dex */
public class BVRecomendationImpressionEvent extends BVMobileAnalyticsEvent {
    private static final String KEY_BV_PRODUCT = "bvProduct";
    private static final String KEY_PRODUCT_ID = "productId";
    private static final String KEY_VISIBLE = "visible";
    private static final boolean VALUE_VISIBLE = true;
    private static final String bvProduct = "Recommendations";
    private final String productId;

    public BVRecomendationImpressionEvent(String str) {
        super(BVEventValues.BVEventClass.IMPRESSION, BVEventValues.BVEventType.PERSONALIZATION);
        this.productId = str;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutSafe(raw, KEY_VISIBLE, true);
        BVAnalyticsUtils.mapPutSafe(raw, KEY_PRODUCT_ID, this.productId);
        BVAnalyticsUtils.mapPutSafe(raw, KEY_BV_PRODUCT, bvProduct);
        return raw;
    }
}
