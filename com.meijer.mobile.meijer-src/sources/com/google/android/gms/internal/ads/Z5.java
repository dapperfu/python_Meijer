package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes6.dex */
public final class Z5 {

    /* renamed from: a, reason: collision with root package name */
    private final List f72832a;

    /* renamed from: b, reason: collision with root package name */
    private final X0[] f72833b;

    /* renamed from: c, reason: collision with root package name */
    private final C9741uc0 f72834c = new C9741uc0(new InterfaceC9525sb0() { // from class: com.google.android.gms.internal.ads.Y5
        @Override // com.google.android.gms.internal.ads.InterfaceC9525sb0
        public final void a(long j10, GQ gq2) {
            this.f72316a.d(j10, gq2);
        }
    });

    public final void b(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        for (int i10 = 0; i10 < this.f72833b.length; i10++) {
            c8518j6.c();
            X0 x0A = interfaceC9575t0.a(c8518j6.a(), 3);
            C c10 = (C) this.f72832a.get(i10);
            String str = c10.f66504o;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            C8211gC.e(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strB = c10.f66490a;
            if (strB == null) {
                strB = c8518j6.b();
            }
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.m(strB);
            c9717uH0.B(str);
            c9717uH0.D(c10.f66494e);
            c9717uH0.q(c10.f66493d);
            c9717uH0.p0(c10.f66486I);
            c9717uH0.n(c10.f66507r);
            x0A.d(c9717uH0.H());
            this.f72833b[i10] = x0A;
        }
    }

    public final void a(long j10, GQ gq2) {
        this.f72834c.b(j10, gq2);
    }

    public final void c() {
        this.f72834c.c();
    }

    final /* synthetic */ void d(long j10, GQ gq2) {
        C7760c0.a(j10, gq2, this.f72833b);
    }

    public final void e(int i10) {
        this.f72834c.d(i10);
    }

    public Z5(List list) {
        this.f72832a = list;
        this.f72833b = new X0[list.size()];
    }
}
