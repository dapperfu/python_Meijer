package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class P5 implements InterfaceC8500k6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9567u5 f69252a;

    /* renamed from: b, reason: collision with root package name */
    private final C7999fQ f69253b = new C7999fQ(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    private int f69254c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f69255d;

    /* renamed from: e, reason: collision with root package name */
    private C8857nU f69256e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f69257f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f69258g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f69259h;

    /* renamed from: i, reason: collision with root package name */
    private int f69260i;

    /* renamed from: j, reason: collision with root package name */
    private int f69261j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f69262k;

    public P5(InterfaceC9567u5 interfaceC9567u5) {
        this.f69252a = interfaceC9567u5;
    }

    private final void d(int i10) {
        this.f69254c = i10;
        this.f69255d = 0;
    }

    public final boolean c(boolean z10) {
        return this.f69254c == 3 && this.f69261j == -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8500k6
    public final void zzc() {
        this.f69254c = 0;
        this.f69255d = 0;
        this.f69259h = false;
        this.f69252a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8500k6
    public final void a(GQ gq2, int i10) throws zzbc {
        int i11;
        int i12;
        long jB;
        long j10;
        C8086gC.b(this.f69256e);
        int i13 = -1;
        int i14 = 2;
        if ((i10 & 1) != 0) {
            int i15 = this.f69254c;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.f69261j;
                    if (i16 != -1) {
                        C9917xL.f("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    this.f69252a.zzc(gq2.u() == 0);
                } else {
                    C9917xL.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i17 = i10;
        while (gq2.r() > 0) {
            int i18 = this.f69254c;
            if (i18 == 0) {
                i11 = i14;
                gq2.m(gq2.r());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iR = gq2.r();
                    int i19 = this.f69261j;
                    int i20 = i19 == i13 ? 0 : iR - i19;
                    if (i20 > 0) {
                        iR -= i20;
                        gq2.k(gq2.t() + iR);
                    }
                    this.f69252a.a(gq2);
                    int i21 = this.f69261j;
                    if (i21 != i13) {
                        int i22 = i21 - iR;
                        this.f69261j = i22;
                        if (i22 == 0) {
                            this.f69252a.zzc(false);
                            d(1);
                        }
                    }
                } else {
                    if (e(gq2, this.f69253b.f74100a, Math.min(10, this.f69260i)) && e(gq2, null, this.f69260i)) {
                        this.f69253b.l(0);
                        if (this.f69257f) {
                            this.f69253b.n(4);
                            long jD = this.f69253b.d(3);
                            this.f69253b.n(1);
                            int iD = this.f69253b.d(15) << 15;
                            this.f69253b.n(1);
                            long jD2 = this.f69253b.d(15);
                            this.f69253b.n(1);
                            if (this.f69259h || !this.f69258g) {
                                j10 = jD;
                            } else {
                                this.f69253b.n(4);
                                j10 = jD;
                                this.f69253b.n(1);
                                int iD2 = this.f69253b.d(15) << 15;
                                this.f69253b.n(1);
                                long jD3 = this.f69253b.d(15);
                                this.f69253b.n(1);
                                this.f69256e.b((this.f69253b.d(3) << 30) | iD2 | jD3);
                                this.f69259h = true;
                            }
                            jB = this.f69256e.b((j10 << 30) | iD | jD2);
                        } else {
                            jB = -9223372036854775807L;
                        }
                        i17 |= true != this.f69262k ? 0 : 4;
                        this.f69252a.b(jB, i17);
                        d(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i11 = i14;
            } else if (e(gq2, this.f69253b.f74100a, 9)) {
                this.f69253b.l(0);
                int iD3 = this.f69253b.d(24);
                if (iD3 != 1) {
                    C9917xL.f("PesReader", "Unexpected start code prefix: " + iD3);
                    i13 = -1;
                    this.f69261j = -1;
                    i12 = 0;
                    i11 = 2;
                } else {
                    this.f69253b.n(8);
                    C7999fQ c7999fQ = this.f69253b;
                    int iD4 = c7999fQ.d(16);
                    c7999fQ.n(5);
                    this.f69262k = this.f69253b.p();
                    i11 = 2;
                    this.f69253b.n(2);
                    this.f69257f = this.f69253b.p();
                    this.f69258g = this.f69253b.p();
                    this.f69253b.n(6);
                    int iD5 = this.f69253b.d(8);
                    this.f69260i = iD5;
                    if (iD4 == 0) {
                        this.f69261j = -1;
                        i13 = -1;
                    } else {
                        int i23 = (iD4 - 3) - iD5;
                        this.f69261j = i23;
                        if (i23 < 0) {
                            C9917xL.f("PesReader", "Found negative packet payload size: " + i23);
                            i13 = -1;
                            this.f69261j = -1;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC8500k6
    public final void b(C8857nU c8857nU, InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        this.f69256e = c8857nU;
        this.f69252a.c(interfaceC9450t0, c8393j6);
    }

    private final boolean e(GQ gq2, byte[] bArr, int i10) {
        int iMin = Math.min(gq2.r(), i10 - this.f69255d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            gq2.m(iMin);
        } else {
            gq2.h(bArr, this.f69255d, iMin);
        }
        int i11 = this.f69255d + iMin;
        this.f69255d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}
