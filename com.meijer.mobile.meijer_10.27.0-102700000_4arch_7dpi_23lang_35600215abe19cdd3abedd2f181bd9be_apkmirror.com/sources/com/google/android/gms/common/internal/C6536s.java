package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6536s {

    /* renamed from: b, reason: collision with root package name */
    private static C6536s f64932b;

    /* renamed from: c, reason: collision with root package name */
    private static final C6537t f64933c = new C6537t(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private C6537t f64934a;

    private C6536s() {
    }

    public static synchronized C6536s b() {
        try {
            if (f64932b == null) {
                f64932b = new C6536s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f64932b;
    }

    public C6537t a() {
        return this.f64934a;
    }

    public final synchronized void c(C6537t c6537t) {
        if (c6537t == null) {
            this.f64934a = f64933c;
            return;
        }
        C6537t c6537t2 = this.f64934a;
        if (c6537t2 == null || c6537t2.K0() < c6537t.K0()) {
            this.f64934a = c6537t;
        }
    }
}
