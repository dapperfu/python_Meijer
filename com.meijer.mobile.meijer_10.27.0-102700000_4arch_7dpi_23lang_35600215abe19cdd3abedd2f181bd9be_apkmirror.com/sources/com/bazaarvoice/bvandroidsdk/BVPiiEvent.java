package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class BVPiiEvent extends BVMobileAnalyticsEvent {
    private boolean hadPii;
    private boolean hadPiiConversion;
    private final Map<String, Object> piiParams;

    public BVPiiEvent(BVEventValues.BVEventClass bVEventClass, String str) {
        super(bVEventClass, str);
        this.hadPiiConversion = false;
        this.piiParams = new HashMap();
    }

    protected abstract void getPIIEvent(Map<String, Object> map);

    protected abstract Map<String, Object> getPiiUnrelatedParams();

    @Override // com.bazaarvoice.bvandroidsdk.BVMobileAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent, com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
    public Map<String, Object> toRaw() {
        setAllowAdId(false);
        Map<String, Object> commonParams = getCommonParams();
        BVAnalyticsUtils.mapPutAllSafe(commonParams, this.piiParams);
        return commonParams;
    }

    public Map<String, Object> toRawNonPii() {
        setAllowAdId(true);
        return getCommonParams();
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent
    public void setAdditionalParams(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        BVAnalyticsUtils.addPiiOnly(this.piiParams, map);
        this.additionalParams = BVAnalyticsUtils.nonPiiOnly(map);
        this.hadPii = this.piiParams.entrySet().size() > 0;
    }

    protected void setHadPiiConversion(boolean z10) {
        this.hadPiiConversion = z10;
    }

    private Map<String, Object> getCommonParams() {
        Map<String, Object> raw = super.toRaw();
        BVAnalyticsUtils.mapPutAllSafe(raw, getPiiUnrelatedParams());
        BVAnalyticsUtils.mapPutSafe(raw, "hadPII", this.hadPii);
        if (this.hadPii && !this.hadPiiConversion) {
            BVAnalyticsUtils.mapPutSafe(raw, "cl", BVEventValues.BVEventClass.PII_CONVERSION.toString());
            getPIIEvent(this.additionalParams);
            return raw;
        }
        if (this.hadPiiConversion) {
            BVAnalyticsUtils.mapPutSafe(raw, "hadPII", true);
        }
        return raw;
    }

    public BVPiiEvent(BVEventValues.BVEventClass bVEventClass, BVEventValues.BVEventType bVEventType) {
        super(bVEventClass, bVEventType);
        this.hadPiiConversion = false;
        this.piiParams = new HashMap();
    }
}
