package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import com.bazaarvoice.bvandroidsdk.BVEventValues;

/* loaded from: classes4.dex */
public class BVMobileParams {
    private final BVAdvertisingId bvAdvertisingId;
    private final BVCommonAnalyticsParams bvCommonAnalyticsParams;
    private final BVMobileInfo bvMobileInfo;
    private final String clientId;
    private final BVEventValues.BVEventSource source;

    public BVMobileParams(Context context, String str) {
        this(context, str, BVEventValues.BVEventSource.NATIVE_MOBILE_CUSTOM);
    }

    BVMobileParams(Context context, String str, BVEventValues.BVEventSource bVEventSource) {
        BVAnalyticsUtils.warnShouldNotBeEmpty("Context", context);
        Context applicationContext = context.getApplicationContext();
        this.bvAdvertisingId = new BVAdvertisingId(applicationContext);
        this.bvCommonAnalyticsParams = new BVCommonAnalyticsParams(applicationContext);
        this.bvMobileInfo = new BVMobileInfo(applicationContext);
        BVAnalyticsUtils.warnShouldNotBeEmpty("clientId", str);
        this.clientId = str;
        this.source = bVEventSource;
    }

    BVAdvertisingId getBvAdvertisingId() {
        return this.bvAdvertisingId;
    }

    BVCommonAnalyticsParams getBvCommonAnalyticsParams() {
        return this.bvCommonAnalyticsParams;
    }

    String getClientId() {
        return this.clientId;
    }

    BVMobileInfo getMobileInfo() {
        return this.bvMobileInfo;
    }

    BVEventValues.BVEventSource getSource() {
        return this.source;
    }
}
