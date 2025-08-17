package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes6.dex */
public final class Z5 {

    /* renamed from: a, reason: collision with root package name */
    private final List f71992a;

    /* renamed from: b, reason: collision with root package name */
    private final X0[] f71993b;

    /* renamed from: c, reason: collision with root package name */
    private final C9616uc0 f71994c = new C9616uc0(new InterfaceC9400sb0() { // from class: com.google.android.gms.internal.ads.Y5
        @Override // com.google.android.gms.internal.ads.InterfaceC9400sb0
        public final void a(long j10, GQ gq2) {
            this.f71476a.d(j10, gq2);
        }
    });

    public final void b(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        for (int i10 = 0; i10 < this.f71993b.length; i10++) {
            c8393j6.c();
            X0 x0A = interfaceC9450t0.a(c8393j6.a(), 3);
            C c10 = (C) this.f71992a.get(i10);
            String str = c10.f65664o;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            C8086gC.e(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strB = c10.f65650a;
            if (strB == null) {
                strB = c8393j6.b();
            }
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.m(strB);
            c9592uH0.B(str);
            c9592uH0.D(c10.f65654e);
            c9592uH0.q(c10.f65653d);
            c9592uH0.p0(c10.f65646I);
            c9592uH0.n(c10.f65667r);
            x0A.d(c9592uH0.H());
            this.f71993b[i10] = x0A;
        }
    }

    public final void a(long j10, GQ gq2) {
        this.f71994c.b(j10, gq2);
    }

    public final void c() {
        this.f71994c.c();
    }

    final /* synthetic */ void d(long j10, GQ gq2) {
        C7635c0.a(j10, gq2, this.f71993b);
    }

    public final void e(int i10) {
        this.f71994c.d(i10);
    }

    public Z5(List list) {
        this.f71992a = list;
        this.f71993b = new X0[list.size()];
    }
}
