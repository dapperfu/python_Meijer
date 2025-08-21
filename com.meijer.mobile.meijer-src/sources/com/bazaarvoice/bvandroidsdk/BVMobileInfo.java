package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.os.Build;

/* loaded from: classes4.dex */
class BVMobileInfo {
    private final String mobileAppCode;
    private final String mobileAppIdentifier;
    private final String mobileAppVersion;
    private final String mobileOs = "Android";
    private final String mobileOsVersion = Build.VERSION.RELEASE;
    private final String mobileDeviceName = Build.MODEL;
    private final String bvSdkVersion = "8.19.0";

    public String getBvSdkVersion() {
        return this.bvSdkVersion;
    }

    public String getMobileAppCode() {
        return this.mobileAppCode;
    }

    public String getMobileAppIdentifier() {
        return this.mobileAppIdentifier;
    }

    public String getMobileAppVersion() {
        return this.mobileAppVersion;
    }

    public String getMobileDeviceName() {
        return this.mobileDeviceName;
    }

    public String getMobileOs() {
        return this.mobileOs;
    }

    public String getMobileOsVersion() {
        return this.mobileOsVersion;
    }

    BVMobileInfo(Context context) {
        this.mobileAppIdentifier = BVAnalyticsUtils.getPackageName(context);
        this.mobileAppVersion = BVAnalyticsUtils.getVersionName(context);
        this.mobileAppCode = BVAnalyticsUtils.getVersionCode(context);
    }
}
