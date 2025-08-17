package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class E5 implements InterfaceC9567u5 {

    /* renamed from: b, reason: collision with root package name */
    private X0 f66344b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66345c;

    /* renamed from: e, reason: collision with root package name */
    private int f66347e;

    /* renamed from: f, reason: collision with root package name */
    private int f66348f;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f66343a = new GQ(10);

    /* renamed from: d, reason: collision with root package name */
    private long f66346d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f66345c = true;
        this.f66346d = j10;
        this.f66347e = 0;
        this.f66348f = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f66345c = false;
        this.f66346d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void a(GQ gq2) {
        C8086gC.b(this.f66344b);
        if (this.f66345c) {
            int iR = gq2.r();
            int i10 = this.f66348f;
            if (i10 < 10) {
                int iMin = Math.min(iR, 10 - i10);
                System.arraycopy(gq2.n(), gq2.t(), this.f66343a.n(), this.f66348f, iMin);
                if (this.f66348f + iMin == 10) {
                    this.f66343a.l(0);
                    if (this.f66343a.C() != 73 || this.f66343a.C() != 68 || this.f66343a.C() != 51) {
                        C9917xL.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f66345c = false;
                        return;
                    } else {
                        this.f66343a.m(3);
                        this.f66347e = this.f66343a.B() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iR, this.f66347e - this.f66348f);
            this.f66344b.c(gq2, iMin2);
            this.f66348f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
        int i10;
        C8086gC.b(this.f66344b);
        if (this.f66345c && (i10 = this.f66347e) != 0 && this.f66348f == i10) {
            C8086gC.f(this.f66346d != -9223372036854775807L);
            this.f66344b.a(this.f66346d, 1, this.f66347e, 0, null);
            this.f66345c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        X0 x0A = interfaceC9450t0.a(c8393j6.a(), 5);
        this.f66344b = x0A;
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.m(c8393j6.b());
        c9592uH0.B("application/id3");
        x0A.d(c9592uH0.H());
    }
}
