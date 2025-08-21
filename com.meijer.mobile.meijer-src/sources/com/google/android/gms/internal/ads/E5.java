package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class E5 implements InterfaceC9692u5 {

    /* renamed from: b, reason: collision with root package name */
    private X0 f67184b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f67185c;

    /* renamed from: e, reason: collision with root package name */
    private int f67187e;

    /* renamed from: f, reason: collision with root package name */
    private int f67188f;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f67183a = new GQ(10);

    /* renamed from: d, reason: collision with root package name */
    private long f67186d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f67185c = true;
        this.f67186d = j10;
        this.f67187e = 0;
        this.f67188f = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f67185c = false;
        this.f67186d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void a(GQ gq2) {
        C8211gC.b(this.f67184b);
        if (this.f67185c) {
            int iR = gq2.r();
            int i10 = this.f67188f;
            if (i10 < 10) {
                int iMin = Math.min(iR, 10 - i10);
                System.arraycopy(gq2.n(), gq2.t(), this.f67183a.n(), this.f67188f, iMin);
                if (this.f67188f + iMin == 10) {
                    this.f67183a.l(0);
                    if (this.f67183a.C() != 73 || this.f67183a.C() != 68 || this.f67183a.C() != 51) {
                        C10042xL.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f67185c = false;
                        return;
                    } else {
                        this.f67183a.m(3);
                        this.f67187e = this.f67183a.B() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iR, this.f67187e - this.f67188f);
            this.f67184b.c(gq2, iMin2);
            this.f67188f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
        int i10;
        C8211gC.b(this.f67184b);
        if (this.f67185c && (i10 = this.f67187e) != 0 && this.f67188f == i10) {
            C8211gC.f(this.f67186d != -9223372036854775807L);
            this.f67184b.a(this.f67186d, 1, this.f67187e, 0, null);
            this.f67185c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        X0 x0A = interfaceC9575t0.a(c8518j6.a(), 5);
        this.f67184b = x0A;
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.m(c8518j6.b());
        c9717uH0.B("application/id3");
        x0A.d(c9717uH0.H());
    }
}
