package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class C1 extends B1 {

    /* renamed from: b, reason: collision with root package name */
    private final GQ f66521b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f66522c;

    /* renamed from: d, reason: collision with root package name */
    private int f66523d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f66524e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66525f;

    /* renamed from: g, reason: collision with root package name */
    private int f66526g;

    public C1(X0 x02) {
        super(x02);
        this.f66521b = new GQ(C9310qa0.f78636a);
        this.f66522c = new GQ(4);
    }

    @Override // com.google.android.gms.internal.ads.B1
    protected final boolean a(GQ gq2) throws zzaew {
        int iC = gq2.C();
        int i10 = iC >> 4;
        int i11 = iC & 15;
        if (i11 == 7) {
            this.f66526g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new zzaew("Video format not supported: " + i11);
    }

    @Override // com.google.android.gms.internal.ads.B1
    protected final boolean b(GQ gq2, long j10) throws zzbc {
        int i10;
        int i11;
        int iC = gq2.C();
        long jX = gq2.x();
        if (iC == 0) {
            if (!this.f66524e) {
                GQ gq3 = new GQ(new byte[gq2.r()]);
                gq2.h(gq3.n(), 0, gq2.r());
                U uA = U.a(gq3);
                this.f66523d = uA.f71343b;
                C9717uH0 c9717uH0 = new C9717uH0();
                c9717uH0.B("video/avc");
                c9717uH0.a(uA.f71353l);
                c9717uH0.G(uA.f71344c);
                c9717uH0.k(uA.f71345d);
                c9717uH0.w(uA.f71352k);
                c9717uH0.n(uA.f71342a);
                this.f66242a.d(c9717uH0.H());
                this.f66524e = true;
                return false;
            }
        } else if (iC == 1 && this.f66524e) {
            if (this.f66526g == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f66525f) {
                if (i10 != 0) {
                    i11 = 1;
                }
            } else {
                i11 = i10;
            }
            byte[] bArrN = this.f66522c.n();
            bArrN[0] = 0;
            bArrN[1] = 0;
            bArrN[2] = 0;
            int i12 = 4 - this.f66523d;
            int i13 = 0;
            while (gq2.r() > 0) {
                gq2.h(this.f66522c.n(), i12, this.f66523d);
                this.f66522c.l(0);
                GQ gq4 = this.f66522c;
                GQ gq5 = this.f66521b;
                int iF = gq4.F();
                gq5.l(0);
                this.f66242a.c(this.f66521b, 4);
                this.f66242a.c(gq2, iF);
                i13 = i13 + 4 + iF;
            }
            this.f66242a.a(j10 + (jX * 1000), i11, i13, 0, null);
            this.f66525f = true;
            return true;
        }
        return false;
    }
}
