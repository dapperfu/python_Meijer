package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10570k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f83069a = new C10561j0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC10525f0 abstractC10525f0) {
        SharedPreferencesC10552i0 sharedPreferencesC10552i0;
        Z.a();
        if (str.equals("")) {
            sharedPreferencesC10552i0 = new SharedPreferencesC10552i0();
        } else {
            sharedPreferencesC10552i0 = null;
        }
        if (sharedPreferencesC10552i0 != null) {
            return sharedPreferencesC10552i0;
        }
        ThreadLocal threadLocal = f83069a;
        De.p.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th2) {
            f83069a.set(Boolean.TRUE);
            throw th2;
        }
    }
}
