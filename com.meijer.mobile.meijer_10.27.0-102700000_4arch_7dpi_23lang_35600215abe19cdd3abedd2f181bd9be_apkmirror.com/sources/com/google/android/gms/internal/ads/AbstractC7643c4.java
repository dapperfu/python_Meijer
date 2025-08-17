package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7643c4 {

    /* renamed from: b, reason: collision with root package name */
    private X0 f73078b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9450t0 f73079c;

    /* renamed from: d, reason: collision with root package name */
    private X3 f73080d;

    /* renamed from: e, reason: collision with root package name */
    private long f73081e;

    /* renamed from: f, reason: collision with root package name */
    private long f73082f;

    /* renamed from: g, reason: collision with root package name */
    private long f73083g;

    /* renamed from: h, reason: collision with root package name */
    private int f73084h;

    /* renamed from: i, reason: collision with root package name */
    private int f73085i;

    /* renamed from: k, reason: collision with root package name */
    private long f73087k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f73088l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f73089m;

    /* renamed from: a, reason: collision with root package name */
    private final V3 f73077a = new V3();

    /* renamed from: j, reason: collision with root package name */
    private Z3 f73086j = new Z3();

    protected abstract long a(GQ gq2);

    protected void b(boolean z10) {
        int i10;
        if (z10) {
            this.f73086j = new Z3();
            this.f73082f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f73084h = i10;
        this.f73081e = -1L;
        this.f73083g = 0L;
    }

    protected abstract boolean c(GQ gq2, long j10, Z3 z32) throws IOException;

    protected final long f(long j10) {
        return (this.f73085i * j10) / 1000000;
    }

    protected void h(long j10) {
        this.f73083g = j10;
    }

    final int d(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        C8086gC.b(this.f73078b);
        int i10 = OV.f69091a;
        int i11 = this.f73084h;
        if (i11 == 0) {
            while (this.f73077a.e(interfaceC9236r0)) {
                long jZzf = interfaceC9236r0.zzf();
                long j10 = this.f73082f;
                this.f73087k = jZzf - j10;
                if (!c(this.f73077a.a(), j10, this.f73086j)) {
                    C c10 = this.f73086j.f71980a;
                    this.f73085i = c10.f65642E;
                    if (!this.f73089m) {
                        this.f73078b.d(c10);
                        this.f73089m = true;
                    }
                    X3 x32 = this.f73086j.f71981b;
                    if (x32 != null) {
                        this.f73080d = x32;
                    } else if (interfaceC9236r0.zzd() == -1) {
                        this.f73080d = new C7430a4(null);
                    } else {
                        W3 w3B = this.f73077a.b();
                        this.f73080d = new R3(this, this.f73082f, interfaceC9236r0.zzd(), w3B.f70995d + w3B.f70996e, w3B.f70993b, (w3B.f70992a & 4) != 0);
                    }
                    this.f73084h = 2;
                    this.f73077a.d();
                    return 0;
                }
                this.f73082f = interfaceC9236r0.zzf();
            }
            this.f73084h = 3;
            return -1;
        }
        if (i11 == 1) {
            interfaceC9236r0.e((int) this.f73082f);
            this.f73084h = 2;
            return 0;
        }
        if (i11 != 2) {
            return -1;
        }
        long jA = this.f73080d.a(interfaceC9236r0);
        if (jA >= 0) {
            n02.f68790a = jA;
            return 1;
        }
        if (jA < -1) {
            h(-(jA + 2));
        }
        if (!this.f73088l) {
            Q0 q0Zze = this.f73080d.zze();
            C8086gC.b(q0Zze);
            this.f73079c.m(q0Zze);
            this.f73088l = true;
        }
        if (this.f73087k <= 0 && !this.f73077a.e(interfaceC9236r0)) {
            this.f73084h = 3;
            return -1;
        }
        this.f73087k = 0L;
        GQ gqA = this.f73077a.a();
        long jA2 = a(gqA);
        if (jA2 >= 0) {
            long j11 = this.f73083g;
            if (j11 + jA2 >= this.f73081e) {
                long jE = e(j11);
                this.f73078b.c(gqA, gqA.u());
                this.f73078b.a(jE, 1, gqA.u(), 0, null);
                this.f73081e = -1L;
            }
        }
        this.f73083g += jA2;
        return 0;
    }

    protected final long e(long j10) {
        return (j10 * 1000000) / this.f73085i;
    }

    final void g(InterfaceC9450t0 interfaceC9450t0, X0 x02) {
        this.f73079c = interfaceC9450t0;
        this.f73078b = x02;
        b(true);
    }

    final void i(long j10, long j11) {
        this.f73077a.c();
        if (j10 == 0) {
            b(!this.f73088l);
            return;
        }
        if (this.f73084h != 0) {
            long jF = f(j11);
            this.f73081e = jF;
            X3 x32 = this.f73080d;
            int i10 = OV.f69091a;
            x32.zzg(jF);
            this.f73084h = 2;
        }
    }
}
