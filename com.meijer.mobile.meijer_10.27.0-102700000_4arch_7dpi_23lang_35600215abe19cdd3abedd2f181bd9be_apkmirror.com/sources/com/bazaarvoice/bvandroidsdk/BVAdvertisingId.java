package com.bazaarvoice.bvandroidsdk;

import Ic.a;
import android.content.Context;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class BVAdvertisingId {
    private final String advertisingId;

    static class BvAdIdDecider {
        private final BvAdInfoFetcher bvAdInfoFetcher;

        public String getAdId() {
            a.C0217a adInfo = this.bvAdInfoFetcher.getAdInfo();
            return (adInfo == null || adInfo.b()) ? "nontracking" : adInfo.a();
        }

        public BvAdIdDecider(BvAdInfoFetcher bvAdInfoFetcher) {
            this.bvAdInfoFetcher = bvAdInfoFetcher;
        }
    }

    static final class Mapper implements BVAnalyticsMapper {
        private BVAdvertisingId bvAdvertisingId;

        @Override // com.bazaarvoice.bvandroidsdk.BVAnalyticsMapper
        public Map<String, Object> toRaw() {
            BVAnalyticsUtils.mapPutSafe((Map<String, Object>) new HashMap(), "advertisingId", this.bvAdvertisingId.getAdvertisingId());
            return null;
        }

        public Mapper(BVAdvertisingId bVAdvertisingId) {
            this.bvAdvertisingId = bVAdvertisingId;
        }
    }

    static class BvAdInfoFetcher {
        private final Context appContext;

        public a.C0217a getAdInfo() {
            a.C0217a c0217aA;
            Throwable th2 = null;
            try {
                c0217aA = Ic.a.a(this.appContext);
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException e10) {
                c0217aA = null;
                th2 = e10;
            }
            if (th2 != null) {
                FS.log_e("BvAnalytics", "error finding advertising id", th2);
            }
            return c0217aA;
        }

        public BvAdInfoFetcher(Context context) {
            this.appContext = context.getApplicationContext();
        }
    }

    String getAdvertisingId() {
        return this.advertisingId;
    }

    BVAdvertisingId(Context context) {
        this.advertisingId = new BvAdIdDecider(new BvAdInfoFetcher(context)).getAdId();
    }
}
