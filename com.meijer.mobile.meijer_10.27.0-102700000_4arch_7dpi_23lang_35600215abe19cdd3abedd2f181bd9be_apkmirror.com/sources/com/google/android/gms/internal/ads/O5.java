package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class O5 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private C f69003a;

    /* renamed from: b, reason: collision with root package name */
    private C8857nU f69004b;

    /* renamed from: c, reason: collision with root package name */
    private X0 f69005c;

    @Override // com.google.android.gms.internal.ads.W5
    public final void a(GQ gq2) {
        C8086gC.b(this.f69004b);
        int i10 = OV.f69091a;
        long jE = this.f69004b.e();
        long jF = this.f69004b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        C c10 = this.f69003a;
        if (jF != c10.f65669t) {
            C9592uH0 c9592uH0B = c10.b();
            c9592uH0B.F(jF);
            C cH = c9592uH0B.H();
            this.f69003a = cH;
            this.f69005c.d(cH);
        }
        int iR = gq2.r();
        this.f69005c.c(gq2, iR);
        this.f69005c.a(jE, 1, iR, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(C8857nU c8857nU, InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        this.f69004b = c8857nU;
        c8393j6.c();
        X0 x0A = interfaceC9450t0.a(c8393j6.a(), 5);
        this.f69005c = x0A;
        x0A.d(this.f69003a);
    }

    public O5(String str) {
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.B(str);
        this.f69003a = c9592uH0.H();
    }
}
