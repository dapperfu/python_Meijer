package com.google.android.gms.internal.measurement;

import Z.C5503a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10467m4 implements S3 {

    /* renamed from: f, reason: collision with root package name */
    private static final Map f82269f = new C5503a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f82270a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f82271b;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f82273d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f82272c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final List f82274e = new ArrayList();

    static synchronized void d() {
        try {
            Map map = f82269f;
            for (C10467m4 c10467m4 : map.values()) {
                c10467m4.f82270a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) Be.p.q(c10467m4.f82271b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final Object a(String str) {
        Map<String, ?> map = this.f82273d;
        if (map == null) {
            synchronized (this.f82272c) {
                try {
                    map = this.f82273d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f82270a.getAll();
                            this.f82273d = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f82272c) {
            this.f82273d = null;
            AbstractC10449k4.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f82274e.iterator();
                while (it.hasNext()) {
                    ((P3) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C10467m4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f82270a = sharedPreferences;
    }

    static C10467m4 c(Context context, String str, Runnable runnable) {
        final C10467m4 c10467m4;
        SharedPreferences sharedPreferencesA;
        if (J3.a() && !str.startsWith("direct_boot:") && !J3.c(context)) {
            return null;
        }
        synchronized (C10467m4.class) {
            Map map = f82269f;
            c10467m4 = (C10467m4) map.get(str);
            if (c10467m4 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (J3.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = C10445k0.a(context, str.substring(12), 0, C10409g0.f82187a);
                    } else {
                        sharedPreferencesA = C10445k0.a(context, str, 0, C10409g0.f82187a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c10467m4 = new C10467m4(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.l4
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f82262a.e(sharedPreferences, str2);
                        }
                    };
                    c10467m4.f82271b = onSharedPreferenceChangeListener;
                    c10467m4.f82270a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c10467m4);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return c10467m4;
    }
}
