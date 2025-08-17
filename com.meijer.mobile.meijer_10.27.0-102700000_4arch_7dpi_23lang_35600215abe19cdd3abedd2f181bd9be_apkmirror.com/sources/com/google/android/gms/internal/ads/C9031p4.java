package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9031p4 implements InterfaceC9450t0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9450t0 f77478a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8710m4 f77479b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f77480c = new SparseArray();

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final X0 a(int i10, int i11) {
        if (i11 != 3) {
            return this.f77478a.a(i10, i11);
        }
        C9244r4 c9244r4 = (C9244r4) this.f77480c.get(i10);
        if (c9244r4 != null) {
            return c9244r4;
        }
        C9244r4 c9244r42 = new C9244r4(this.f77478a.a(i10, 3), this.f77479b);
        this.f77480c.put(i10, c9244r42);
        return c9244r42;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final void e() {
        this.f77478a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final void m(Q0 q02) {
        this.f77478a.m(q02);
    }

    public C9031p4(InterfaceC9450t0 interfaceC9450t0, InterfaceC8710m4 interfaceC8710m4) {
        this.f77478a = interfaceC9450t0;
        this.f77479b = interfaceC8710m4;
    }
}
