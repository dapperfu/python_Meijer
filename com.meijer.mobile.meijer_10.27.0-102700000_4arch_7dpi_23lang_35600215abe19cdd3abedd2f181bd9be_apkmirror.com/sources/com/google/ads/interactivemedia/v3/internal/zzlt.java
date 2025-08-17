package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class zzlt {
    public static int zza(Context context) {
        return zzc(context, "crash_without_write");
    }

    public static int zzb(Context context) {
        return zzc(context, "init_without_write");
    }

    private static int zzc(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }
}
