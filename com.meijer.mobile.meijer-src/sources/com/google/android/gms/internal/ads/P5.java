package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class P5 implements InterfaceC8625k6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9692u5 f70092a;

    /* renamed from: b, reason: collision with root package name */
    private final C8124fQ f70093b = new C8124fQ(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    private int f70094c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f70095d;

    /* renamed from: e, reason: collision with root package name */
    private C8982nU f70096e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70097f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f70098g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f70099h;

    /* renamed from: i, reason: collision with root package name */
    private int f70100i;

    /* renamed from: j, reason: collision with root package name */
    private int f70101j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f70102k;

    public P5(InterfaceC9692u5 interfaceC9692u5) {
        this.f70092a = interfaceC9692u5;
    }

    private final void d(int i10) {
        this.f70094c = i10;
        this.f70095d = 0;
    }

    public final boolean c(boolean z10) {
        return this.f70094c == 3 && this.f70101j == -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8625k6
    public final void zzc() {
        this.f70094c = 0;
        this.f70095d = 0;
        this.f70099h = false;
        this.f70092a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8625k6
    public final void a(GQ gq2, int i10) throws zzbc {
        int i11;
        int i12;
        long jB;
        long j10;
        C8211gC.b(this.f70096e);
        int i13 = -1;
        int i14 = 2;
        if ((i10 & 1) != 0) {
            int i15 = this.f70094c;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.f70101j;
                    if (i16 != -1) {
                        C10042xL.f("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    this.f70092a.zzc(gq2.u() == 0);
                } else {
                    C10042xL.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i17 = i10;
        while (gq2.r() > 0) {
            int i18 = this.f70094c;
            if (i18 == 0) {
                i11 = i14;
                gq2.m(gq2.r());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iR = gq2.r();
                    int i19 = this.f70101j;
                    int i20 = i19 == i13 ? 0 : iR - i19;
                    if (i20 > 0) {
                        iR -= i20;
                        gq2.k(gq2.t() + iR);
                    }
                    this.f70092a.a(gq2);
                    int i21 = this.f70101j;
                    if (i21 != i13) {
                        int i22 = i21 - iR;
                        this.f70101j = i22;
                        if (i22 == 0) {
                            this.f70092a.zzc(false);
                            d(1);
                        }
                    }
                } else {
                    if (e(gq2, this.f70093b.f74940a, Math.min(10, this.f70100i)) && e(gq2, null, this.f70100i)) {
                        this.f70093b.l(0);
                        if (this.f70097f) {
                            this.f70093b.n(4);
                            long jD = this.f70093b.d(3);
                            this.f70093b.n(1);
                            int iD = this.f70093b.d(15) << 15;
                            this.f70093b.n(1);
                            long jD2 = this.f70093b.d(15);
                            this.f70093b.n(1);
                            if (this.f70099h || !this.f70098g) {
                                j10 = jD;
                            } else {
                                this.f70093b.n(4);
                                j10 = jD;
                                this.f70093b.n(1);
                                int iD2 = this.f70093b.d(15) << 15;
                                this.f70093b.n(1);
                                long jD3 = this.f70093b.d(15);
                                this.f70093b.n(1);
                                this.f70096e.b((this.f70093b.d(3) << 30) | iD2 | jD3);
                                this.f70099h = true;
                            }
                            jB = this.f70096e.b((j10 << 30) | iD | jD2);
                        } else {
                            jB = -9223372036854775807L;
                        }
                        i17 |= true != this.f70102k ? 0 : 4;
                        this.f70092a.b(jB, i17);
                        d(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i11 = i14;
            } else if (e(gq2, this.f70093b.f74940a, 9)) {
                this.f70093b.l(0);
                int iD3 = this.f70093b.d(24);
                if (iD3 != 1) {
                    C10042xL.f("PesReader", "Unexpected start code prefix: " + iD3);
                    i13 = -1;
                    this.f70101j = -1;
                    i12 = 0;
                    i11 = 2;
                } else {
                    this.f70093b.n(8);
                    C8124fQ c8124fQ = this.f70093b;
                    int iD4 = c8124fQ.d(16);
                    c8124fQ.n(5);
                    this.f70102k = this.f70093b.p();
                    i11 = 2;
                    this.f70093b.n(2);
                    this.f70097f = this.f70093b.p();
                    this.f70098g = this.f70093b.p();
                    this.f70093b.n(6);
                    int iD5 = this.f70093b.d(8);
                    this.f70100i = iD5;
                    if (iD4 == 0) {
                        this.f70101j = -1;
                        i13 = -1;
                    } else {
                        int i23 = (iD4 - 3) - iD5;
                        this.f70101j = i23;
                        if (i23 < 0) {
                            C10042xL.f("PesReader", "Found negative packet payload size: " + i23);
                            i13 = -1;
                            this.f70101j = -1;
                        } else {
                            i13 = -1;
                        }
                    }
                    i12 = 2;
                }
                d(i12);
            } else {
                i13 = -1;
                i11 = 2;
            }
            i14 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8625k6
    public final void b(C8982nU c8982nU, InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        this.f70096e = c8982nU;
        this.f70092a.c(interfaceC9575t0, c8518j6);
    }

    private final boolean e(GQ gq2, byte[] bArr, int i10) {
        int iMin = Math.min(gq2.r(), i10 - this.f70095d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            gq2.m(iMin);
        } else {
            gq2.h(bArr, this.f70095d, iMin);
        }
        int i11 = this.f70095d + iMin;
        this.f70095d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}
