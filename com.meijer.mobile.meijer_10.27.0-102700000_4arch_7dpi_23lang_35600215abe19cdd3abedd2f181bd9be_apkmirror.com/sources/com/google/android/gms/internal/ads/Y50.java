package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Y50 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f71477a;

    /* renamed from: b, reason: collision with root package name */
    private final C9812wN f71478b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f71479c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile int f71481e = 1;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f71480d = 0;

    public Y50(com.google.android.gms.common.util.f fVar, C9812wN c9812wN) {
        this.f71477a = fVar;
        this.f71478b = c9812wN;
    }

    public final void a() {
        f(2, 3);
    }

    private final void e() {
        long jA = this.f71477a.a();
        synchronized (this.f71479c) {
            try {
                if (this.f71481e == 3) {
                    if (this.f71480d + ((Long) Mc.A.c().a(C8659lf.f76102P5)).longValue() <= jA) {
                        this.f71481e = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(boolean z10) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76165Tc)).booleanValue()) {
            C9705vN c9705vNA = this.f71478b.a();
            c9705vNA.b("action", "mbs_state");
            c9705vNA.b("mbs_state", true != z10 ? "0" : "1");
            c9705vNA.g();
        }
        if (z10) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f71479c) {
            e();
            z10 = this.f71481e == 3;
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.f71479c) {
            e();
            z10 = this.f71481e == 2;
        }
        return z10;
    }

    private final void f(int i10, int i11) {
        e();
        Object obj = this.f71479c;
        long jA = this.f71477a.a();
        synchronized (obj) {
            try {
                if (this.f71481e != i10) {
                    return;
                }
                this.f71481e = i11;
                if (this.f71481e == 3) {
                    this.f71480d = jA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
