package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVCommonAnalyticsParams;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class BVAnalyticsEvent implements BVAnalyticsMapper {
    protected Map<String, Object> additionalParams;
    private BVCommonAnalyticsParams bvCommonAnalyticsParams;
    private final String customEventType;
    private final BVEventValues.BVEventClass eventClass;
    private final BVEventValues.BVEventType eventType;

    public BVAnalyticsEvent(BVEventValues.BVEventClass bVEventClass, String str) {
        this.eventClass = bVEventClass;
        BVAnalyticsUtils.warnShouldNotBeEmpty("eventType", str);
        this.customEventType = str;
        this.eventType = null;
        this.additionalParams = new HashMap();
    }

    public void setAdditionalParams(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.additionalParams = map;
    }

    protected void setBvCommonAnalyticsParams(BVCommonAnalyticsParams bVCommonAnalyticsParams) {
        this.bvCommonAnalyticsParams = bVCommonAnalyticsParams;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        HashMap map = new HashMap();
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "cl", this.eventClass.toString());
        BVEventValues.BVEventType bVEventType = this.eventType;
        BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "type", bVEventType == null ? this.customEventType : bVEventType.toString());
        BVAnalyticsUtils.mapPutAllSafe(map, this.additionalParams);
        BVAnalyticsUtils.warnShouldNotBeEmpty("bvCommonAnalyticsParams", this.bvCommonAnalyticsParams);
        BVAnalyticsUtils.mapPutAllSafe(map, new BVCommonAnalyticsParams.Mapper(this.bvCommonAnalyticsParams).toRaw());
        return map;
    }

    public BVAnalyticsEvent(BVEventValues.BVEventClass bVEventClass, BVEventValues.BVEventType bVEventType) {
        this.eventClass = bVEventClass;
        this.eventType = bVEventType;
        this.customEventType = null;
        this.additionalParams = new HashMap();
    }
}
