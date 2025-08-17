package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class C1 extends B1 {

    /* renamed from: b, reason: collision with root package name */
    private final GQ f65681b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f65682c;

    /* renamed from: d, reason: collision with root package name */
    private int f65683d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f65684e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f65685f;

    /* renamed from: g, reason: collision with root package name */
    private int f65686g;

    public C1(X0 x02) {
        super(x02);
        this.f65681b = new GQ(C9185qa0.f77796a);
        this.f65682c = new GQ(4);
    }

    @Override // com.google.android.gms.internal.ads.B1
    protected final boolean a(GQ gq2) throws zzaew {
        int iC = gq2.C();
        int i10 = iC >> 4;
        int i11 = iC & 15;
        if (i11 == 7) {
            this.f65686g = i10;
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
            if (!this.f65684e) {
                GQ gq3 = new GQ(new byte[gq2.r()]);
                gq2.h(gq3.n(), 0, gq2.r());
                U uA = U.a(gq3);
                this.f65683d = uA.f70503b;
                C9592uH0 c9592uH0 = new C9592uH0();
                c9592uH0.B("video/avc");
                c9592uH0.a(uA.f70513l);
                c9592uH0.G(uA.f70504c);
                c9592uH0.k(uA.f70505d);
                c9592uH0.w(uA.f70512k);
                c9592uH0.n(uA.f70502a);
                this.f65402a.d(c9592uH0.H());
                this.f65684e = true;
                return false;
            }
        } else if (iC == 1 && this.f65684e) {
            if (this.f65686g == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f65685f) {
                if (i10 != 0) {
                    i11 = 1;
                }
            } else {
                i11 = i10;
            }
            byte[] bArrN = this.f65682c.n();
            bArrN[0] = 0;
            bArrN[1] = 0;
            bArrN[2] = 0;
            int i12 = 4 - this.f65683d;
            int i13 = 0;
            while (gq2.r() > 0) {
                gq2.h(this.f65682c.n(), i12, this.f65683d);
                this.f65682c.l(0);
                GQ gq4 = this.f65682c;
                GQ gq5 = this.f65681b;
                int iF = gq4.F();
                gq5.l(0);
                this.f65402a.c(this.f65681b, 4);
                this.f65402a.c(gq2, iF);
                i13 = i13 + 4 + iF;
            }
            this.f65402a.a(j10 + (jX * 1000), i11, i13, 0, null);
            this.f65685f = true;
            return true;
        }
        return false;
    }
}
