package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes6.dex */
public final class F5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f66715a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66716b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f66717c;

    /* renamed from: d, reason: collision with root package name */
    private final C7999fQ f66718d;

    /* renamed from: e, reason: collision with root package name */
    private X0 f66719e;

    /* renamed from: f, reason: collision with root package name */
    private String f66720f;

    /* renamed from: g, reason: collision with root package name */
    private C f66721g;

    /* renamed from: h, reason: collision with root package name */
    private int f66722h;

    /* renamed from: i, reason: collision with root package name */
    private int f66723i;

    /* renamed from: j, reason: collision with root package name */
    private int f66724j;

    /* renamed from: k, reason: collision with root package name */
    private int f66725k;

    /* renamed from: l, reason: collision with root package name */
    private long f66726l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f66727m;

    /* renamed from: n, reason: collision with root package name */
    private int f66728n;

    /* renamed from: o, reason: collision with root package name */
    private int f66729o;

    /* renamed from: p, reason: collision with root package name */
    private int f66730p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f66731q;

    /* renamed from: r, reason: collision with root package name */
    private long f66732r;

    /* renamed from: s, reason: collision with root package name */
    private int f66733s;

    /* renamed from: t, reason: collision with root package name */
    private long f66734t;

    /* renamed from: u, reason: collision with root package name */
    private int f66735u;

    /* renamed from: v, reason: collision with root package name */
    private String f66736v;

    private static long e(C7999fQ c7999fQ) {
        return c7999fQ.d((c7999fQ.d(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f66726l = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f66722h = 0;
        this.f66726l = -9223372036854775807L;
        this.f66727m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void a(GQ gq2) throws zzbc {
        int i10;
        int i11;
        int iD;
        boolean zP;
        C8086gC.b(this.f66719e);
        while (gq2.r() > 0) {
            int i12 = this.f66722h;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iC = gq2.C();
                    if ((iC & 224) == 224) {
                        this.f66725k = iC;
                        this.f66722h = 2;
                    } else if (iC != 86) {
                        this.f66722h = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(gq2.r(), this.f66724j - this.f66723i);
                    gq2.h(this.f66718d.f74100a, this.f66723i, iMin);
                    int i13 = this.f66723i + iMin;
                    this.f66723i = i13;
                    if (i13 == this.f66724j) {
                        this.f66718d.l(0);
                        C7999fQ c7999fQ = this.f66718d;
                        if (c7999fQ.p()) {
                            if (this.f66727m) {
                            }
                            this.f66722h = 0;
                        } else {
                            this.f66727m = true;
                            int iD2 = c7999fQ.d(1);
                            if (iD2 == 1) {
                                iD = c7999fQ.d(1);
                                i11 = 1;
                            } else {
                                i11 = iD2;
                                iD = 0;
                            }
                            this.f66728n = iD;
                            if (iD != 0) {
                                throw zzbc.a(null, null);
                            }
                            if (i11 == 1) {
                                e(c7999fQ);
                                i11 = 1;
                            }
                            if (!c7999fQ.p()) {
                                throw zzbc.a(null, null);
                            }
                            this.f66729o = c7999fQ.d(6);
                            int iD3 = c7999fQ.d(4);
                            int iD4 = c7999fQ.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw zzbc.a(null, null);
                            }
                            if (i11 == 0) {
                                int iC2 = c7999fQ.c();
                                int iD5 = d(c7999fQ);
                                c7999fQ.l(iC2);
                                byte[] bArr = new byte[(iD5 + 7) / 8];
                                c7999fQ.h(bArr, 0, iD5);
                                C9592uH0 c9592uH0 = new C9592uH0();
                                c9592uH0.m(this.f66720f);
                                c9592uH0.B("audio/mp4a-latm");
                                c9592uH0.a(this.f66736v);
                                c9592uH0.r0(this.f66735u);
                                c9592uH0.C(this.f66733s);
                                c9592uH0.n(Collections.singletonList(bArr));
                                c9592uH0.q(this.f66715a);
                                c9592uH0.y(this.f66716b);
                                C cH = c9592uH0.H();
                                if (!cH.equals(this.f66721g)) {
                                    this.f66721g = cH;
                                    this.f66734t = 1024000000 / cH.f65642E;
                                    this.f66719e.d(cH);
                                }
                            } else {
                                c7999fQ.n(((int) e(c7999fQ)) - d(c7999fQ));
                            }
                            int iD6 = c7999fQ.d(3);
                            this.f66730p = iD6;
                            if (iD6 == 0) {
                                c7999fQ.n(8);
                            } else if (iD6 == 1) {
                                c7999fQ.n(9);
                            } else if (iD6 == 3 || iD6 == 4 || iD6 == 5) {
                                c7999fQ.n(6);
                            } else {
                                if (iD6 != 6 && iD6 != 7) {
                                    throw new IllegalStateException();
                                }
                                c7999fQ.n(1);
                            }
                            boolean zP2 = c7999fQ.p();
                            this.f66731q = zP2;
                            this.f66732r = 0L;
                            if (zP2) {
                                if (i11 != 1) {
                                    do {
                                        zP = c7999fQ.p();
                                        this.f66732r = (this.f66732r << 8) + c7999fQ.d(8);
                                    } while (zP);
                                } else {
                                    this.f66732r = e(c7999fQ);
                                }
                            }
                            if (c7999fQ.p()) {
                                c7999fQ.n(8);
                            }
                        }
                        if (this.f66728n != 0) {
                            throw zzbc.a(null, null);
                        }
                        if (this.f66729o != 0) {
                            throw zzbc.a(null, null);
                        }
                        if (this.f66730p != 0) {
                            throw zzbc.a(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iD7 = c7999fQ.d(8);
                            i10 = i14 + iD7;
                            if (iD7 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iC3 = c7999fQ.c();
                        if ((iC3 & 7) == 0) {
                            this.f66717c.l(iC3 >> 3);
                        } else {
                            c7999fQ.h(this.f66717c.n(), 0, i10 * 8);
                            this.f66717c.l(0);
                        }
                        this.f66719e.c(this.f66717c, i10);
                        C8086gC.f(this.f66726l != -9223372036854775807L);
                        this.f66719e.a(this.f66726l, 1, i10, 0, null);
                        this.f66726l += this.f66734t;
                        if (this.f66731q) {
                            c7999fQ.n((int) this.f66732r);
                        }
                        this.f66722h = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iC4 = ((this.f66725k & (-225)) << 8) | gq2.C();
                    this.f66724j = iC4;
                    GQ gq3 = this.f66717c;
                    if (iC4 > gq3.n().length) {
                        gq3.i(iC4);
                        C7999fQ c7999fQ2 = this.f66718d;
                        byte[] bArrN = this.f66717c.n();
                        c7999fQ2.k(bArrN, bArrN.length);
                    }
                    this.f66723i = 0;
                    this.f66722h = 3;
                }
            } else if (gq2.C() == 86) {
                this.f66722h = 1;
            }
        }
    }

    public F5(String str, int i10) {
        this.f66715a = str;
        this.f66716b = i10;
        GQ gq2 = new GQ(1024);
        this.f66717c = gq2;
        byte[] bArrN = gq2.n();
        this.f66718d = new C7999fQ(bArrN, bArrN.length);
        this.f66726l = -9223372036854775807L;
    }

    private final int d(C7999fQ c7999fQ) throws zzbc {
        int iA = c7999fQ.a();
        K kB = M.b(c7999fQ, true);
        this.f66736v = kB.f68001c;
        this.f66733s = kB.f67999a;
        this.f66735u = kB.f68000b;
        return iA - c7999fQ.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f66719e = interfaceC9450t0.a(c8393j6.a(), 1);
        this.f66720f = c8393j6.b();
    }
}
