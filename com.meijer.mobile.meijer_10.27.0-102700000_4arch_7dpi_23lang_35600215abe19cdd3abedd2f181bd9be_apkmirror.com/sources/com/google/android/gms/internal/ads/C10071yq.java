package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10071yq {

    /* renamed from: a, reason: collision with root package name */
    private final Object f80295a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f80297c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f80296b = 0;

    /* synthetic */ C10071yq(C10178zq c10178zq) {
    }

    public final void a() {
        long jA = Lc.v.c().a();
        synchronized (this.f80295a) {
            try {
                if (this.f80297c == 3) {
                    if (this.f80296b + ((Long) Mc.A.c().a(C8659lf.f76102P5)).longValue() <= jA) {
                        this.f80297c = 1;
                    }
                }
            } finally {
            }
        }
        long jA2 = Lc.v.c().a();
        synchronized (this.f80295a) {
            try {
                if (this.f80297c != 2) {
                    return;
                }
                this.f80297c = 3;
                if (this.f80297c == 3) {
                    this.f80296b = jA2;
                }
            } finally {
            }
        }
    }
}
