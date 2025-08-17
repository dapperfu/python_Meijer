package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8821n6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f76997a;

    /* renamed from: b, reason: collision with root package name */
    private final X0[] f76998b;

    public final void b(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        for (int i10 = 0; i10 < this.f76998b.length; i10++) {
            c8393j6.c();
            X0 x0A = interfaceC9450t0.a(c8393j6.a(), 3);
            C c10 = (C) this.f76997a.get(i10);
            String str = c10.f65664o;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            C8086gC.e(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.m(c8393j6.b());
            c9592uH0.B(str);
            c9592uH0.D(c10.f65654e);
            c9592uH0.q(c10.f65653d);
            c9592uH0.p0(c10.f65646I);
            c9592uH0.n(c10.f65667r);
            x0A.d(c9592uH0.H());
            this.f76998b[i10] = x0A;
        }
    }

    public C8821n6(List list) {
        this.f76997a = list;
        this.f76998b = new X0[list.size()];
    }

    public final void a(long j10, GQ gq2) {
        if (gq2.r() >= 9) {
            int iW = gq2.w();
            int iW2 = gq2.w();
            int iC = gq2.C();
            if (iW == 434 && iW2 == 1195456820 && iC == 3) {
                C7635c0.b(j10, gq2, this.f76998b);
            }
        }
    }
}
