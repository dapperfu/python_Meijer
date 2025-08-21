package com.google.android.libraries.places.internal;

import com.fullstory.FS;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class zzqa {
    private static final Method zza;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            zza = method;
        }
    }

    public static String zza(String str, String str2) {
        try {
            return (String) zza.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e10) {
            FS.log_e("SystemProperties", "get error", e10);
            return "false";
        }
    }
}
