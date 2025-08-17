package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10445k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f82229a = new C10436j0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC10400f0 abstractC10400f0) {
        SharedPreferencesC10427i0 sharedPreferencesC10427i0;
        Z.a();
        if (str.equals("")) {
            sharedPreferencesC10427i0 = new SharedPreferencesC10427i0();
        } else {
            sharedPreferencesC10427i0 = null;
        }
        if (sharedPreferencesC10427i0 != null) {
            return sharedPreferencesC10427i0;
        }
        ThreadLocal threadLocal = f82229a;
        Be.p.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th2) {
            f82229a.set(Boolean.TRUE);
            throw th2;
        }
    }
}
