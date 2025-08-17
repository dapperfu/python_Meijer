package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;

/* loaded from: classes6.dex */
public final class PG {
    private static boolean d(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void a(boolean z10, String str) throws zzde {
        if (!z10) {
            throw new zzde(str);
        }
    }

    public static boolean b(Context context) {
        int i10 = OV.f69091a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(OV.f69093c) || "XT1650".equals(OV.f69094d))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return d("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean c() {
        return d("EGL_KHR_surfaceless_context");
    }
}
