package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9880x1 implements InterfaceC9130q0 {

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9450t0 f79635d;

    /* renamed from: e, reason: collision with root package name */
    private X0 f79636e;

    /* renamed from: g, reason: collision with root package name */
    private C8651lb f79638g;

    /* renamed from: h, reason: collision with root package name */
    private B0 f79639h;

    /* renamed from: i, reason: collision with root package name */
    private int f79640i;

    /* renamed from: j, reason: collision with root package name */
    private int f79641j;

    /* renamed from: k, reason: collision with root package name */
    private C9773w1 f79642k;

    /* renamed from: l, reason: collision with root package name */
    private int f79643l;

    /* renamed from: m, reason: collision with root package name */
    private long f79644m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f79632a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final GQ f79633b = new GQ(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    private final C9771w0 f79634c = new C9771w0();

    /* renamed from: f, reason: collision with root package name */
    private int f79637f = 0;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        C9985y0.a(interfaceC9236r0, false);
        GQ gq2 = new GQ(4);
        ((C7955f0) interfaceC9236r0).c(gq2.n(), 0, 4, false);
        return gq2.K() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    private final long e(GQ gq2, boolean z10) {
        boolean zC;
        this.f79639h.getClass();
        int iT = gq2.t();
        while (iT <= gq2.u() - 16) {
            gq2.l(iT);
            if (C9878x0.c(gq2, this.f79639h, this.f79641j, this.f79634c)) {
                gq2.l(iT);
                return this.f79634c.f79396a;
            }
            iT++;
        }
        if (!z10) {
            gq2.l(iT);
            return -1L;
        }
        while (iT <= gq2.u() - this.f79640i) {
            gq2.l(iT);
            try {
                zC = C9878x0.c(gq2, this.f79639h, this.f79641j, this.f79634c);
            } catch (IndexOutOfBoundsException unused) {
                zC = false;
            }
            if (gq2.t() <= gq2.u() && zC) {
                gq2.l(iT);
                return this.f79634c.f79396a;
            }
            iT++;
        }
        gq2.l(gq2.u());
        return -1L;
    }

    private final void f() {
        long j10 = this.f79644m * 1000000;
        B0 b02 = this.f79639h;
        int i10 = OV.f69091a;
        this.f79636e.a(j10 / b02.f65393e, 1, this.f79643l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f79637f = 0;
        } else {
            C9773w1 c9773w1 = this.f79642k;
            if (c9773w1 != null) {
                c9773w1.d(j11);
            }
        }
        this.f79644m = j11 != 0 ? -1L : 0L;
        this.f79643l = 0;
        this.f79633b.i(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        boolean zP;
        Q0 p02;
        boolean z10;
        int i10 = this.f79637f;
        if (i10 == 0) {
            interfaceC9236r0.zzj();
            long jZze = interfaceC9236r0.zze();
            C8651lb c8651lbA = C9985y0.a(interfaceC9236r0, true);
            interfaceC9236r0.e((int) (interfaceC9236r0.zze() - jZze));
            this.f79638g = c8651lbA;
            this.f79637f = 1;
            return 0;
        }
        if (i10 == 1) {
            interfaceC9236r0.g(this.f79632a, 0, 42);
            interfaceC9236r0.zzj();
            this.f79637f = 2;
            return 0;
        }
        if (i10 == 2) {
            GQ gq2 = new GQ(4);
            interfaceC9236r0.zzi(gq2.n(), 0, 4);
            if (gq2.K() != 1716281667) {
                throw zzbc.a("Failed to read FLAC stream marker.", null);
            }
            this.f79637f = 3;
            return 0;
        }
        if (i10 == 3) {
            B0 b0E = this.f79639h;
            do {
                interfaceC9236r0.zzj();
                C7999fQ c7999fQ = new C7999fQ(new byte[4], 4);
                interfaceC9236r0.g(c7999fQ.f74100a, 0, 4);
                zP = c7999fQ.p();
                int iD = c7999fQ.d(7);
                int iD2 = c7999fQ.d(24) + 4;
                if (iD == 0) {
                    byte[] bArr = new byte[38];
                    interfaceC9236r0.zzi(bArr, 0, 38);
                    b0E = new B0(bArr, 4);
                } else {
                    if (b0E == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iD == 3) {
                        GQ gq3 = new GQ(iD2);
                        interfaceC9236r0.zzi(gq3.n(), 0, iD2);
                        b0E = b0E.f(C9985y0.b(gq3));
                    } else if (iD == 4) {
                        GQ gq4 = new GQ(iD2);
                        interfaceC9236r0.zzi(gq4.n(), 0, iD2);
                        gq4.m(4);
                        b0E = b0E.g(Arrays.asList(C7744d1.c(gq4, false, false).f72331a));
                    } else if (iD == 6) {
                        GQ gq5 = new GQ(iD2);
                        interfaceC9236r0.zzi(gq5.n(), 0, iD2);
                        gq5.m(4);
                        b0E = b0E.e(AbstractC7917eh0.u(S1.a(gq5)));
                    } else {
                        interfaceC9236r0.e(iD2);
                    }
                }
                int i11 = OV.f69091a;
                this.f79639h = b0E;
            } while (!zP);
            b0E.getClass();
            this.f79640i = Math.max(b0E.f65391c, 6);
            this.f79636e.d(this.f79639h.c(this.f79632a, this.f79638g));
            this.f79637f = 4;
            return 0;
        }
        if (i10 == 4) {
            interfaceC9236r0.zzj();
            GQ gq6 = new GQ(2);
            interfaceC9236r0.g(gq6.n(), 0, 2);
            int iG = gq6.G();
            if ((iG >> 2) != 16382) {
                interfaceC9236r0.zzj();
                throw zzbc.a("First frame does not start with sync code.", null);
            }
            interfaceC9236r0.zzj();
            this.f79641j = iG;
            InterfaceC9450t0 interfaceC9450t0 = this.f79635d;
            int i12 = OV.f69091a;
            long jZzf = interfaceC9236r0.zzf();
            long jZzd = interfaceC9236r0.zzd();
            B0 b02 = this.f79639h;
            b02.getClass();
            if (b02.f65399k != null) {
                p02 = new C10092z0(b02, jZzf);
            } else if (jZzd == -1 || b02.f65398j <= 0) {
                p02 = new P0(b02.a(), 0L);
            } else {
                C9773w1 c9773w1 = new C9773w1(b02, this.f79641j, jZzf, jZzd);
                this.f79642k = c9773w1;
                p02 = c9773w1.b();
            }
            interfaceC9450t0.m(p02);
            this.f79637f = 5;
            return 0;
        }
        this.f79636e.getClass();
        B0 b03 = this.f79639h;
        b03.getClass();
        C9773w1 c9773w12 = this.f79642k;
        if (c9773w12 != null && c9773w12.e()) {
            return c9773w12.a(interfaceC9236r0, n02);
        }
        if (this.f79644m == -1) {
            this.f79644m = C9878x0.b(interfaceC9236r0, b03);
            return 0;
        }
        GQ gq7 = this.f79633b;
        int iU = gq7.u();
        if (iU < 32768) {
            int iZza = interfaceC9236r0.zza(gq7.n(), iU, 32768 - iU);
            z10 = iZza == -1;
            if (!z10) {
                this.f79633b.k(iU + iZza);
            } else if (this.f79633b.r() == 0) {
                f();
                return -1;
            }
        } else {
            z10 = false;
        }
        GQ gq8 = this.f79633b;
        int iT = gq8.t();
        int i13 = this.f79643l;
        int i14 = this.f79640i;
        if (i13 < i14) {
            gq8.m(Math.min(i14 - i13, gq8.r()));
        }
        long jE = e(this.f79633b, z10);
        GQ gq9 = this.f79633b;
        int iT2 = gq9.t() - iT;
        gq9.l(iT);
        this.f79636e.c(this.f79633b, iT2);
        this.f79643l += iT2;
        if (jE != -1) {
            f();
            this.f79643l = 0;
            this.f79644m = jE;
        }
        GQ gq10 = this.f79633b;
        if (gq10.r() >= 16) {
            return 0;
        }
        int iR = gq10.r();
        System.arraycopy(gq10.n(), gq10.t(), gq10.n(), 0, iR);
        this.f79633b.l(0);
        this.f79633b.k(iR);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f79635d = interfaceC9450t0;
        this.f79636e = interfaceC9450t0.a(0, 1);
        interfaceC9450t0.e();
    }

    public C9880x1(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
