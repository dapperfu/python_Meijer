package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    private static final Uf.a f89040c = Uf.a.e();

    /* renamed from: d, reason: collision with root package name */
    private static x f89041d;

    /* renamed from: a, reason: collision with root package name */
    private volatile SharedPreferences f89042a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f89043b;

    public synchronized void h(final Context context) {
        if (this.f89042a == null && context != null) {
            this.f89043b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.a(this.f89038a, context);
                }
            });
        }
    }

    public boolean i(String str, double d10) {
        if (str == null) {
            f89040c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return false;
            }
        }
        this.f89042a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    public boolean j(String str, long j10) {
        if (str == null) {
            f89040c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return false;
            }
        }
        this.f89042a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean k(String str, String str2) {
        if (str == null) {
            f89040c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f89042a.edit().remove(str).apply();
            return true;
        }
        this.f89042a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean l(String str, boolean z10) {
        if (str == null) {
            f89040c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return false;
            }
        }
        this.f89042a.edit().putBoolean(str, z10).apply();
        return true;
    }

    public static /* synthetic */ void a(x xVar, Context context) {
        if (xVar.f89042a != null || context == null) {
            return;
        }
        xVar.f89042a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized x e() {
        try {
            if (f89041d == null) {
                f89041d = new x(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89041d;
    }

    public ag.g<Boolean> b(String str) {
        if (str == null) {
            f89040c.a("Key is null when getting boolean value on device cache.");
            return ag.g.a();
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return ag.g.a();
            }
        }
        if (!this.f89042a.contains(str)) {
            return ag.g.a();
        }
        try {
            return ag.g.e(Boolean.valueOf(this.f89042a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f89040c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return ag.g.a();
        }
    }

    public ag.g<Double> c(String str) {
        if (str == null) {
            f89040c.a("Key is null when getting double value on device cache.");
            return ag.g.a();
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return ag.g.a();
            }
        }
        if (!this.f89042a.contains(str)) {
            return ag.g.a();
        }
        try {
            try {
                return ag.g.e(Double.valueOf(Double.longBitsToDouble(this.f89042a.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return ag.g.e(Double.valueOf(Float.valueOf(this.f89042a.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e10) {
            f89040c.b("Key %s from sharedPreferences has type other than double: %s", str, e10.getMessage());
            return ag.g.a();
        }
    }

    public ag.g<Long> f(String str) {
        if (str == null) {
            f89040c.a("Key is null when getting long value on device cache.");
            return ag.g.a();
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return ag.g.a();
            }
        }
        if (!this.f89042a.contains(str)) {
            return ag.g.a();
        }
        try {
            return ag.g.e(Long.valueOf(this.f89042a.getLong(str, 0L)));
        } catch (ClassCastException e10) {
            f89040c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return ag.g.a();
        }
    }

    public ag.g<String> g(String str) {
        if (str == null) {
            f89040c.a("Key is null when getting String value on device cache.");
            return ag.g.a();
        }
        if (this.f89042a == null) {
            h(d());
            if (this.f89042a == null) {
                return ag.g.a();
            }
        }
        if (!this.f89042a.contains(str)) {
            return ag.g.a();
        }
        try {
            return ag.g.e(this.f89042a.getString(str, ""));
        } catch (ClassCastException e10) {
            f89040c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return ag.g.a();
        }
    }

    public x(ExecutorService executorService) {
        this.f89043b = executorService;
    }

    private Context d() {
        try {
            com.google.firebase.f.l();
            return com.google.firebase.f.l().k();
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
