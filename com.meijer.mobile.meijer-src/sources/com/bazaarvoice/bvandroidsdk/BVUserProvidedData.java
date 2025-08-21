package com.bazaarvoice.bvandroidsdk;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
class BVUserProvidedData {
    private final Application application;
    private final BVConfig bvConfig;
    private final BVMobileInfo bvMobileInfo;

    public Context getAppContext() {
        return this.application.getApplicationContext();
    }

    public Application getApplication() {
        return this.application;
    }

    public BVConfig getBvConfig() {
        return this.bvConfig;
    }

    public BVMobileInfo getBvMobileInfo() {
        return this.bvMobileInfo;
    }

    BVUserProvidedData(Application application, BVConfig bVConfig, BVMobileInfo bVMobileInfo) {
        this.application = application;
        this.bvConfig = bVConfig;
        this.bvMobileInfo = bVMobileInfo;
    }
}
