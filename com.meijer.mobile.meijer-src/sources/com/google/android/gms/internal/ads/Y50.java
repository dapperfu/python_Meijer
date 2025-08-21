package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Y50 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f72317a;

    /* renamed from: b, reason: collision with root package name */
    private final C9937wN f72318b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f72319c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile int f72321e = 1;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f72320d = 0;

    public Y50(com.google.android.gms.common.util.f fVar, C9937wN c9937wN) {
        this.f72317a = fVar;
        this.f72318b = c9937wN;
    }

    public final void a() {
        f(2, 3);
    }

    private final void e() {
        long jA = this.f72317a.a();
        synchronized (this.f72319c) {
            try {
                if (this.f72321e == 3) {
                    if (this.f72320d + ((Long) Oc.A.c().a(C8784lf.f76942P5)).longValue() <= jA) {
                        this.f72321e = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(boolean z10) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77005Tc)).booleanValue()) {
            C9830vN c9830vNA = this.f72318b.a();
            c9830vNA.b("action", "mbs_state");
            c9830vNA.b("mbs_state", true != z10 ? "0" : "1");
            c9830vNA.g();
        }
        if (z10) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f72319c) {
            e();
            z10 = this.f72321e == 3;
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.f72319c) {
            e();
            z10 = this.f72321e == 2;
        }
        return z10;
    }

    private final void f(int i10, int i11) {
        e();
        Object obj = this.f72319c;
        long jA = this.f72317a.a();
        synchronized (obj) {
            try {
                if (this.f72321e != i10) {
                    return;
                }
                this.f72321e = i11;
                if (this.f72321e == 3) {
                    this.f72320d = jA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
