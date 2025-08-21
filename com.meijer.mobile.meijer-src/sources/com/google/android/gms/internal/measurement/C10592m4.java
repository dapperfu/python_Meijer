package com.google.android.gms.internal.measurement;

import Z.C5603a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10592m4 implements S3 {

    /* renamed from: f, reason: collision with root package name */
    private static final Map f83109f = new C5603a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f83110a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f83111b;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f83113d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f83112c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final List f83114e = new ArrayList();

    static synchronized void d() {
        try {
            Map map = f83109f;
            for (C10592m4 c10592m4 : map.values()) {
                c10592m4.f83110a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) De.p.q(c10592m4.f83111b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.S3
    public final Object a(String str) {
        Map<String, ?> map = this.f83113d;
        if (map == null) {
            synchronized (this.f83112c) {
                try {
                    map = this.f83113d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f83110a.getAll();
                            this.f83113d = all;
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
        synchronized (this.f83112c) {
            this.f83113d = null;
            AbstractC10574k4.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f83114e.iterator();
                while (it.hasNext()) {
                    ((P3) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C10592m4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f83110a = sharedPreferences;
    }

    static C10592m4 c(Context context, String str, Runnable runnable) {
        final C10592m4 c10592m4;
        SharedPreferences sharedPreferencesA;
        if (J3.a() && !str.startsWith("direct_boot:") && !J3.c(context)) {
            return null;
        }
        synchronized (C10592m4.class) {
            Map map = f83109f;
            c10592m4 = (C10592m4) map.get(str);
            if (c10592m4 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (J3.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = C10570k0.a(context, str.substring(12), 0, C10534g0.f83027a);
                    } else {
                        sharedPreferencesA = C10570k0.a(context, str, 0, C10534g0.f83027a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c10592m4 = new C10592m4(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.l4
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f83102a.e(sharedPreferences, str2);
                        }
                    };
                    c10592m4.f83111b = onSharedPreferenceChangeListener;
                    c10592m4.f83110a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c10592m4);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return c10592m4;
    }
}
