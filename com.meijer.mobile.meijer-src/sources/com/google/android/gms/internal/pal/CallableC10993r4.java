package com.google.android.gms.internal.pal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.pal.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC10993r4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final X3 f84672a;

    /* renamed from: b, reason: collision with root package name */
    private final Ya f84673b;

    public CallableC10993r4(X3 x32, Ya ya2) {
        this.f84672a = x32;
        this.f84673b = ya2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f84672a.l() != null) {
            this.f84672a.l().get();
        }
        B1 b1C = this.f84672a.c();
        if (b1C == null) {
            return null;
        }
        try {
            synchronized (this.f84673b) {
                Ya ya2 = this.f84673b;
                byte[] bArrI = b1C.i();
                ya2.g(bArrI, 0, bArrI.length, C10958p0.a());
            }
            return null;
        } catch (zzadi | NullPointerException unused) {
            return null;
        }
    }
}
