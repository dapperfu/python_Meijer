package com.bazaarvoice.bvandroidsdk;

import Ic.a;

/* loaded from: classes4.dex */
class AdIdResult {
    private static final String NONTRACKING_TOKEN = "nontracking";
    private a.C0217a adInfo;
    private String errorMessage;

    a.C0217a getAdInfo() {
        return this.adInfo;
    }

    String getErrorMessage() {
        return this.errorMessage;
    }

    boolean isNonTracking() {
        a.C0217a c0217a = this.adInfo;
        return c0217a == null || c0217a.b();
    }

    AdIdResult(a.C0217a c0217a, String str) {
        this.adInfo = c0217a;
        this.errorMessage = str;
    }

    String getAdId() {
        if (isNonTracking()) {
            return NONTRACKING_TOKEN;
        }
        return this.adInfo.a();
    }
}
