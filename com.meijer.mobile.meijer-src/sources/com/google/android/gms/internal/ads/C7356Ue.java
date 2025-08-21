package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.Ue, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7356Ue {
    public static int a(Context context) {
        return f(context, "crash_without_write");
    }

    public static int b(Context context) {
        return f(context, "init_without_write");
    }

    public static void c(Context context) {
        g(context, "crash_without_write");
    }

    public static void d(Context context) {
        g(context, "init_without_write");
    }

    public static void e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    private static int f(Context context, String str) {
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

    private static void g(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(str, f(context, str) + 1).commit();
    }
}
