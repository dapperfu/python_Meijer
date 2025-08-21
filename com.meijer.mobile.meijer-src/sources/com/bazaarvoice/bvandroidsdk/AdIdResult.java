package com.bazaarvoice.bvandroidsdk;

import Kc.a;

/* loaded from: classes4.dex */
class AdIdResult {
    private static final String NONTRACKING_TOKEN = "nontracking";
    private a.C0277a adInfo;
    private String errorMessage;

    a.C0277a getAdInfo() {
        return this.adInfo;
    }

    String getErrorMessage() {
        return this.errorMessage;
    }

    boolean isNonTracking() {
        a.C0277a c0277a = this.adInfo;
        return c0277a == null || c0277a.b();
    }

    AdIdResult(a.C0277a c0277a, String str) {
        this.adInfo = c0277a;
        this.errorMessage = str;
    }

    String getAdId() {
        if (isNonTracking()) {
            return NONTRACKING_TOKEN;
        }
        return this.adInfo.a();
    }
}
