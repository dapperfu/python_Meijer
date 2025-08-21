package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8946n6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f77837a;

    /* renamed from: b, reason: collision with root package name */
    private final X0[] f77838b;

    public final void b(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        for (int i10 = 0; i10 < this.f77838b.length; i10++) {
            c8518j6.c();
            X0 x0A = interfaceC9575t0.a(c8518j6.a(), 3);
            C c10 = (C) this.f77837a.get(i10);
            String str = c10.f66504o;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            C8211gC.e(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.m(c8518j6.b());
            c9717uH0.B(str);
            c9717uH0.D(c10.f66494e);
            c9717uH0.q(c10.f66493d);
            c9717uH0.p0(c10.f66486I);
            c9717uH0.n(c10.f66507r);
            x0A.d(c9717uH0.H());
            this.f77838b[i10] = x0A;
        }
    }

    public C8946n6(List list) {
        this.f77837a = list;
        this.f77838b = new X0[list.size()];
    }

    public final void a(long j10, GQ gq2) {
        if (gq2.r() >= 9) {
            int iW = gq2.w();
            int iW2 = gq2.w();
            int iC = gq2.C();
            if (iW == 434 && iW2 == 1195456820 && iC == 3) {
                C7760c0.b(j10, gq2, this.f77838b);
            }
        }
    }
}
