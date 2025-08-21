package com.fullstory.instrumentation;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class CurrentPlatform {
    public static final int SDK_INT_FIXED;
    public static int TARGET_SDK = -1;
    public static final int UNSET = -1;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.PREVIEW_SDK_INT > 0) {
            i10++;
        }
        SDK_INT_FIXED = i10;
    }

    public static void init(Context context) {
        if (TARGET_SDK != -1) {
            return;
        }
        try {
            TARGET_SDK = context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
