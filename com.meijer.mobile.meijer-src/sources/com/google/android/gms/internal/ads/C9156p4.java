package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9156p4 implements InterfaceC9575t0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9575t0 f78318a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8835m4 f78319b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f78320c = new SparseArray();

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final X0 a(int i10, int i11) {
        if (i11 != 3) {
            return this.f78318a.a(i10, i11);
        }
        C9369r4 c9369r4 = (C9369r4) this.f78320c.get(i10);
        if (c9369r4 != null) {
            return c9369r4;
        }
        C9369r4 c9369r42 = new C9369r4(this.f78318a.a(i10, 3), this.f78319b);
        this.f78320c.put(i10, c9369r42);
        return c9369r42;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final void e() {
        this.f78318a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final void m(Q0 q02) {
        this.f78318a.m(q02);
    }

    public C9156p4(InterfaceC9575t0 interfaceC9575t0, InterfaceC8835m4 interfaceC8835m4) {
        this.f78318a = interfaceC9575t0;
        this.f78319b = interfaceC8835m4;
    }
}
