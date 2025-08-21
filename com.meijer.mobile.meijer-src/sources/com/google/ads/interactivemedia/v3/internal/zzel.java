package com.google.ads.interactivemedia.v3.internal;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;

/* loaded from: classes4.dex */
public final class zzel {
    public static boolean zzc(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration == null || !testingConfiguration.forceAndroidTvMode()) {
            return zzd(context, testingConfiguration) && context.getPackageManager().hasSystemFeature("android.software.leanback") && !context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        }
        return true;
    }

    public static boolean zzd(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration != null && testingConfiguration.forceTvMode()) {
            return true;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int zza() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static Application zzb(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }
}
