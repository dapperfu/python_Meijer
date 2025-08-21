package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6661s {

    /* renamed from: b, reason: collision with root package name */
    private static C6661s f65772b;

    /* renamed from: c, reason: collision with root package name */
    private static final C6662t f65773c = new C6662t(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private C6662t f65774a;

    private C6661s() {
    }

    public static synchronized C6661s b() {
        try {
            if (f65772b == null) {
                f65772b = new C6661s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f65772b;
    }

    public C6662t a() {
        return this.f65774a;
    }

    public final synchronized void c(C6662t c6662t) {
        if (c6662t == null) {
            this.f65774a = f65773c;
            return;
        }
        C6662t c6662t2 = this.f65774a;
        if (c6662t2 == null || c6662t2.I0() < c6662t.I0()) {
            this.f65774a = c6662t;
        }
    }
}
