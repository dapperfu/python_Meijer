package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10005x1 implements InterfaceC9255q0 {

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9575t0 f80475d;

    /* renamed from: e, reason: collision with root package name */
    private X0 f80476e;

    /* renamed from: g, reason: collision with root package name */
    private C8776lb f80478g;

    /* renamed from: h, reason: collision with root package name */
    private B0 f80479h;

    /* renamed from: i, reason: collision with root package name */
    private int f80480i;

    /* renamed from: j, reason: collision with root package name */
    private int f80481j;

    /* renamed from: k, reason: collision with root package name */
    private C9898w1 f80482k;

    /* renamed from: l, reason: collision with root package name */
    private int f80483l;

    /* renamed from: m, reason: collision with root package name */
    private long f80484m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f80472a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final GQ f80473b = new GQ(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    private final C9896w0 f80474c = new C9896w0();

    /* renamed from: f, reason: collision with root package name */
    private int f80477f = 0;

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        C10110y0.a(interfaceC9361r0, false);
        GQ gq2 = new GQ(4);
        ((C8080f0) interfaceC9361r0).c(gq2.n(), 0, 4, false);
        return gq2.K() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    private final long e(GQ gq2, boolean z10) {
        boolean zC;
        this.f80479h.getClass();
        int iT = gq2.t();
        while (iT <= gq2.u() - 16) {
            gq2.l(iT);
            if (C10003x0.c(gq2, this.f80479h, this.f80481j, this.f80474c)) {
                gq2.l(iT);
                return this.f80474c.f80236a;
            }
            iT++;
        }
        if (!z10) {
            gq2.l(iT);
            return -1L;
        }
        while (iT <= gq2.u() - this.f80480i) {
            gq2.l(iT);
            try {
                zC = C10003x0.c(gq2, this.f80479h, this.f80481j, this.f80474c);
            } catch (IndexOutOfBoundsException unused) {
                zC = false;
            }
            if (gq2.t() <= gq2.u() && zC) {
                gq2.l(iT);
                return this.f80474c.f80236a;
            }
            iT++;
        }
        gq2.l(gq2.u());
        return -1L;
    }

    private final void f() {
        long j10 = this.f80484m * 1000000;
        B0 b02 = this.f80479h;
        int i10 = OV.f69931a;
        this.f80476e.a(j10 / b02.f66233e, 1, this.f80483l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f80477f = 0;
        } else {
            C9898w1 c9898w1 = this.f80482k;
            if (c9898w1 != null) {
                c9898w1.d(j11);
            }
        }
        this.f80484m = j11 != 0 ? -1L : 0L;
        this.f80483l = 0;
        this.f80473b.i(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        boolean zP;
        Q0 p02;
        boolean z10;
        int i10 = this.f80477f;
        if (i10 == 0) {
            interfaceC9361r0.zzj();
            long jZze = interfaceC9361r0.zze();
            C8776lb c8776lbA = C10110y0.a(interfaceC9361r0, true);
            interfaceC9361r0.e((int) (interfaceC9361r0.zze() - jZze));
            this.f80478g = c8776lbA;
            this.f80477f = 1;
            return 0;
        }
        if (i10 == 1) {
            interfaceC9361r0.g(this.f80472a, 0, 42);
            interfaceC9361r0.zzj();
            this.f80477f = 2;
            return 0;
        }
        if (i10 == 2) {
            GQ gq2 = new GQ(4);
            interfaceC9361r0.zzi(gq2.n(), 0, 4);
            if (gq2.K() != 1716281667) {
                throw zzbc.a("Failed to read FLAC stream marker.", null);
            }
            this.f80477f = 3;
            return 0;
        }
        if (i10 == 3) {
            B0 b0E = this.f80479h;
            do {
                interfaceC9361r0.zzj();
                C8124fQ c8124fQ = new C8124fQ(new byte[4], 4);
                interfaceC9361r0.g(c8124fQ.f74940a, 0, 4);
                zP = c8124fQ.p();
                int iD = c8124fQ.d(7);
                int iD2 = c8124fQ.d(24) + 4;
                if (iD == 0) {
                    byte[] bArr = new byte[38];
                    interfaceC9361r0.zzi(bArr, 0, 38);
                    b0E = new B0(bArr, 4);
                } else {
                    if (b0E == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iD == 3) {
                        GQ gq3 = new GQ(iD2);
                        interfaceC9361r0.zzi(gq3.n(), 0, iD2);
                        b0E = b0E.f(C10110y0.b(gq3));
                    } else if (iD == 4) {
                        GQ gq4 = new GQ(iD2);
                        interfaceC9361r0.zzi(gq4.n(), 0, iD2);
                        gq4.m(4);
                        b0E = b0E.g(Arrays.asList(C7869d1.c(gq4, false, false).f73171a));
                    } else if (iD == 6) {
                        GQ gq5 = new GQ(iD2);
                        interfaceC9361r0.zzi(gq5.n(), 0, iD2);
                        gq5.m(4);
                        b0E = b0E.e(AbstractC8042eh0.u(S1.a(gq5)));
                    } else {
                        interfaceC9361r0.e(iD2);
                    }
                }
                int i11 = OV.f69931a;
                this.f80479h = b0E;
            } while (!zP);
            b0E.getClass();
            this.f80480i = Math.max(b0E.f66231c, 6);
            this.f80476e.d(this.f80479h.c(this.f80472a, this.f80478g));
            this.f80477f = 4;
            return 0;
        }
        if (i10 == 4) {
            interfaceC9361r0.zzj();
            GQ gq6 = new GQ(2);
            interfaceC9361r0.g(gq6.n(), 0, 2);
            int iG = gq6.G();
            if ((iG >> 2) != 16382) {
                interfaceC9361r0.zzj();
                throw zzbc.a("First frame does not start with sync code.", null);
            }
            interfaceC9361r0.zzj();
            this.f80481j = iG;
            InterfaceC9575t0 interfaceC9575t0 = this.f80475d;
            int i12 = OV.f69931a;
            long jZzf = interfaceC9361r0.zzf();
            long jZzd = interfaceC9361r0.zzd();
            B0 b02 = this.f80479h;
            b02.getClass();
            if (b02.f66239k != null) {
                p02 = new C10217z0(b02, jZzf);
            } else if (jZzd == -1 || b02.f66238j <= 0) {
                p02 = new P0(b02.a(), 0L);
            } else {
                C9898w1 c9898w1 = new C9898w1(b02, this.f80481j, jZzf, jZzd);
                this.f80482k = c9898w1;
                p02 = c9898w1.b();
            }
            interfaceC9575t0.m(p02);
            this.f80477f = 5;
            return 0;
        }
        this.f80476e.getClass();
        B0 b03 = this.f80479h;
        b03.getClass();
        C9898w1 c9898w12 = this.f80482k;
        if (c9898w12 != null && c9898w12.e()) {
            return c9898w12.a(interfaceC9361r0, n02);
        }
        if (this.f80484m == -1) {
            this.f80484m = C10003x0.b(interfaceC9361r0, b03);
            return 0;
        }
        GQ gq7 = this.f80473b;
        int iU = gq7.u();
        if (iU < 32768) {
            int iZza = interfaceC9361r0.zza(gq7.n(), iU, 32768 - iU);
            z10 = iZza == -1;
            if (!z10) {
                this.f80473b.k(iU + iZza);
            } else if (this.f80473b.r() == 0) {
                f();
                return -1;
            }
        } else {
            z10 = false;
        }
        GQ gq8 = this.f80473b;
        int iT = gq8.t();
        int i13 = this.f80483l;
        int i14 = this.f80480i;
        if (i13 < i14) {
            gq8.m(Math.min(i14 - i13, gq8.r()));
        }
        long jE = e(this.f80473b, z10);
        GQ gq9 = this.f80473b;
        int iT2 = gq9.t() - iT;
        gq9.l(iT);
        this.f80476e.c(this.f80473b, iT2);
        this.f80483l += iT2;
        if (jE != -1) {
            f();
            this.f80483l = 0;
            this.f80484m = jE;
        }
        GQ gq10 = this.f80473b;
        if (gq10.r() >= 16) {
            return 0;
        }
        int iR = gq10.r();
        System.arraycopy(gq10.n(), gq10.t(), gq10.n(), 0, iR);
        this.f80473b.l(0);
        this.f80473b.k(iR);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f80475d = interfaceC9575t0;
        this.f80476e = interfaceC9575t0.a(0, 1);
        interfaceC9575t0.e();
    }

    public C10005x1(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
