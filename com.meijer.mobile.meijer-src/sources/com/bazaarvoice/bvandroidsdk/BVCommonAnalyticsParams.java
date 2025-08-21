package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class BVCommonAnalyticsParams {
    private final String userAgent = BVEventValues.BVSDK_USER_AGENT;
    private final String hashedIp = "default";

    static class Mapper implements BVAnalyticsMapper {
        private BVCommonAnalyticsParams commonAnalyticsParams;

        @Override // com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
        public Map<String, Object> toRaw() {
            HashMap map = new HashMap();
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "UA", this.commonAnalyticsParams.getUserAgent());
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) map, "HashedIP", this.commonAnalyticsParams.getHashedIp());
            return map;
        }

        Mapper(BVCommonAnalyticsParams bVCommonAnalyticsParams) {
            this.commonAnalyticsParams = bVCommonAnalyticsParams;
        }
    }

    String getHashedIp() {
        return this.hashedIp;
    }

    String getUserAgent() {
        return this.userAgent;
    }

    BVCommonAnalyticsParams(Context context) {
    }
}
