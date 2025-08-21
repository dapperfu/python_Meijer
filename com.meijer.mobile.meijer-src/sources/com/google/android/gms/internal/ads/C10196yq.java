package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10196yq {

    /* renamed from: a, reason: collision with root package name */
    private final Object f81135a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f81137c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f81136b = 0;

    /* synthetic */ C10196yq(C10303zq c10303zq) {
    }

    public final void a() {
        long jA = Nc.v.c().a();
        synchronized (this.f81135a) {
            try {
                if (this.f81137c == 3) {
                    if (this.f81136b + ((Long) Oc.A.c().a(C8784lf.f76942P5)).longValue() <= jA) {
                        this.f81137c = 1;
                    }
                }
            } finally {
            }
        }
        long jA2 = Nc.v.c().a();
        synchronized (this.f81135a) {
            try {
                if (this.f81137c != 2) {
                    return;
                }
                this.f81137c = 3;
                if (this.f81137c == 3) {
                    this.f81136b = jA2;
                }
            } finally {
            }
        }
    }
}
