package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class O5 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private C f69843a;

    /* renamed from: b, reason: collision with root package name */
    private C8982nU f69844b;

    /* renamed from: c, reason: collision with root package name */
    private X0 f69845c;

    @Override // com.google.android.gms.internal.ads.W5
    public final void a(GQ gq2) {
        C8211gC.b(this.f69844b);
        int i10 = OV.f69931a;
        long jE = this.f69844b.e();
        long jF = this.f69844b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        C c10 = this.f69843a;
        if (jF != c10.f66509t) {
            C9717uH0 c9717uH0B = c10.b();
            c9717uH0B.F(jF);
            C cH = c9717uH0B.H();
            this.f69843a = cH;
            this.f69845c.d(cH);
        }
        int iR = gq2.r();
        this.f69845c.c(gq2, iR);
        this.f69845c.a(jE, 1, iR, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(C8982nU c8982nU, InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        this.f69844b = c8982nU;
        c8518j6.c();
        X0 x0A = interfaceC9575t0.a(c8518j6.a(), 5);
        this.f69845c = x0A;
        x0A.d(this.f69843a);
    }

    public O5(String str) {
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.B(str);
        this.f69843a = c9717uH0.H();
    }
}
