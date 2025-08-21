package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes6.dex */
public final class F5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f67555a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67556b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f67557c;

    /* renamed from: d, reason: collision with root package name */
    private final C8124fQ f67558d;

    /* renamed from: e, reason: collision with root package name */
    private X0 f67559e;

    /* renamed from: f, reason: collision with root package name */
    private String f67560f;

    /* renamed from: g, reason: collision with root package name */
    private C f67561g;

    /* renamed from: h, reason: collision with root package name */
    private int f67562h;

    /* renamed from: i, reason: collision with root package name */
    private int f67563i;

    /* renamed from: j, reason: collision with root package name */
    private int f67564j;

    /* renamed from: k, reason: collision with root package name */
    private int f67565k;

    /* renamed from: l, reason: collision with root package name */
    private long f67566l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f67567m;

    /* renamed from: n, reason: collision with root package name */
    private int f67568n;

    /* renamed from: o, reason: collision with root package name */
    private int f67569o;

    /* renamed from: p, reason: collision with root package name */
    private int f67570p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f67571q;

    /* renamed from: r, reason: collision with root package name */
    private long f67572r;

    /* renamed from: s, reason: collision with root package name */
    private int f67573s;

    /* renamed from: t, reason: collision with root package name */
    private long f67574t;

    /* renamed from: u, reason: collision with root package name */
    private int f67575u;

    /* renamed from: v, reason: collision with root package name */
    private String f67576v;

    private static long e(C8124fQ c8124fQ) {
        return c8124fQ.d((c8124fQ.d(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f67566l = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f67562h = 0;
        this.f67566l = -9223372036854775807L;
        this.f67567m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void a(GQ gq2) throws zzbc {
        int i10;
        int i11;
        int iD;
        boolean zP;
        C8211gC.b(this.f67559e);
        while (gq2.r() > 0) {
            int i12 = this.f67562h;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iC = gq2.C();
                    if ((iC & 224) == 224) {
                        this.f67565k = iC;
                        this.f67562h = 2;
                    } else if (iC != 86) {
                        this.f67562h = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(gq2.r(), this.f67564j - this.f67563i);
                    gq2.h(this.f67558d.f74940a, this.f67563i, iMin);
                    int i13 = this.f67563i + iMin;
                    this.f67563i = i13;
                    if (i13 == this.f67564j) {
                        this.f67558d.l(0);
                        C8124fQ c8124fQ = this.f67558d;
                        if (c8124fQ.p()) {
                            if (this.f67567m) {
                            }
                            this.f67562h = 0;
                        } else {
                            this.f67567m = true;
                            int iD2 = c8124fQ.d(1);
                            if (iD2 == 1) {
                                iD = c8124fQ.d(1);
                                i11 = 1;
                            } else {
                                i11 = iD2;
                                iD = 0;
                            }
                            this.f67568n = iD;
                            if (iD != 0) {
                                throw zzbc.a(null, null);
                            }
                            if (i11 == 1) {
                                e(c8124fQ);
                                i11 = 1;
                            }
                            if (!c8124fQ.p()) {
                                throw zzbc.a(null, null);
                            }
                            this.f67569o = c8124fQ.d(6);
                            int iD3 = c8124fQ.d(4);
                            int iD4 = c8124fQ.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw zzbc.a(null, null);
                            }
                            if (i11 == 0) {
                                int iC2 = c8124fQ.c();
                                int iD5 = d(c8124fQ);
                                c8124fQ.l(iC2);
                                byte[] bArr = new byte[(iD5 + 7) / 8];
                                c8124fQ.h(bArr, 0, iD5);
                                C9717uH0 c9717uH0 = new C9717uH0();
                                c9717uH0.m(this.f67560f);
                                c9717uH0.B("audio/mp4a-latm");
                                c9717uH0.a(this.f67576v);
                                c9717uH0.r0(this.f67575u);
                                c9717uH0.C(this.f67573s);
                                c9717uH0.n(Collections.singletonList(bArr));
                                c9717uH0.q(this.f67555a);
                                c9717uH0.y(this.f67556b);
                                C cH = c9717uH0.H();
                                if (!cH.equals(this.f67561g)) {
                                    this.f67561g = cH;
                                    this.f67574t = 1024000000 / cH.f66482E;
                                    this.f67559e.d(cH);
                                }
                            } else {
                                c8124fQ.n(((int) e(c8124fQ)) - d(c8124fQ));
                            }
                            int iD6 = c8124fQ.d(3);
                            this.f67570p = iD6;
                            if (iD6 == 0) {
                                c8124fQ.n(8);
                            } else if (iD6 == 1) {
                                c8124fQ.n(9);
                            } else if (iD6 == 3 || iD6 == 4 || iD6 == 5) {
                                c8124fQ.n(6);
                            } else {
                                if (iD6 != 6 && iD6 != 7) {
                                    throw new IllegalStateException();
                                }
                                c8124fQ.n(1);
                            }
                            boolean zP2 = c8124fQ.p();
                            this.f67571q = zP2;
                            this.f67572r = 0L;
                            if (zP2) {
                                if (i11 != 1) {
                                    do {
                                        zP = c8124fQ.p();
                                        this.f67572r = (this.f67572r << 8) + c8124fQ.d(8);
                                    } while (zP);
                                } else {
                                    this.f67572r = e(c8124fQ);
                                }
                            }
                            if (c8124fQ.p()) {
                                c8124fQ.n(8);
                            }
                        }
                        if (this.f67568n != 0) {
                            throw zzbc.a(null, null);
                        }
                        if (this.f67569o != 0) {
                            throw zzbc.a(null, null);
                        }
                        if (this.f67570p != 0) {
                            throw zzbc.a(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iD7 = c8124fQ.d(8);
                            i10 = i14 + iD7;
                            if (iD7 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iC3 = c8124fQ.c();
                        if ((iC3 & 7) == 0) {
                            this.f67557c.l(iC3 >> 3);
                        } else {
                            c8124fQ.h(this.f67557c.n(), 0, i10 * 8);
                            this.f67557c.l(0);
                        }
                        this.f67559e.c(this.f67557c, i10);
                        C8211gC.f(this.f67566l != -9223372036854775807L);
                        this.f67559e.a(this.f67566l, 1, i10, 0, null);
                        this.f67566l += this.f67574t;
                        if (this.f67571q) {
                            c8124fQ.n((int) this.f67572r);
                        }
                        this.f67562h = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iC4 = ((this.f67565k & (-225)) << 8) | gq2.C();
                    this.f67564j = iC4;
                    GQ gq3 = this.f67557c;
                    if (iC4 > gq3.n().length) {
                        gq3.i(iC4);
                        C8124fQ c8124fQ2 = this.f67558d;
                        byte[] bArrN = this.f67557c.n();
                        c8124fQ2.k(bArrN, bArrN.length);
                    }
                    this.f67563i = 0;
                    this.f67562h = 3;
                }
            } else if (gq2.C() == 86) {
                this.f67562h = 1;
            }
        }
    }

    public F5(String str, int i10) {
        this.f67555a = str;
        this.f67556b = i10;
        GQ gq2 = new GQ(1024);
        this.f67557c = gq2;
        byte[] bArrN = gq2.n();
        this.f67558d = new C8124fQ(bArrN, bArrN.length);
        this.f67566l = -9223372036854775807L;
    }

    private final int d(C8124fQ c8124fQ) throws zzbc {
        int iA = c8124fQ.a();
        K kB = M.b(c8124fQ, true);
        this.f67576v = kB.f68841c;
        this.f67573s = kB.f68839a;
        this.f67575u = kB.f68840b;
        return iA - c8124fQ.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f67559e = interfaceC9575t0.a(c8518j6.a(), 1);
        this.f67560f = c8518j6.b();
    }
}
