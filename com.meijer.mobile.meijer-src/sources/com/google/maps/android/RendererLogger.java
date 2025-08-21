package com.google.maps.android;

import com.fullstory.FS;

/* loaded from: classes8.dex */
public final class RendererLogger {
    private static boolean enabled;

    public static void d(String str, String str2) {
        if (enabled) {
            FS.log_d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (enabled) {
            FS.log_e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (enabled) {
            FS.log_i(str, str2);
        }
    }

    public static void setEnabled(boolean z10) {
        enabled = z10;
    }

    public static void w(String str, String str2) {
        if (enabled) {
            FS.log_w(str, str2);
        }
    }

    private RendererLogger() {
    }
}
