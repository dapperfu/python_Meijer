package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7768c4 {

    /* renamed from: b, reason: collision with root package name */
    private X0 f73918b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9575t0 f73919c;

    /* renamed from: d, reason: collision with root package name */
    private X3 f73920d;

    /* renamed from: e, reason: collision with root package name */
    private long f73921e;

    /* renamed from: f, reason: collision with root package name */
    private long f73922f;

    /* renamed from: g, reason: collision with root package name */
    private long f73923g;

    /* renamed from: h, reason: collision with root package name */
    private int f73924h;

    /* renamed from: i, reason: collision with root package name */
    private int f73925i;

    /* renamed from: k, reason: collision with root package name */
    private long f73927k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f73928l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f73929m;

    /* renamed from: a, reason: collision with root package name */
    private final V3 f73917a = new V3();

    /* renamed from: j, reason: collision with root package name */
    private Z3 f73926j = new Z3();

    protected abstract long a(GQ gq2);

    protected void b(boolean z10) {
        int i10;
        if (z10) {
            this.f73926j = new Z3();
            this.f73922f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f73924h = i10;
        this.f73921e = -1L;
        this.f73923g = 0L;
    }

    protected abstract boolean c(GQ gq2, long j10, Z3 z32) throws IOException;

    protected final long f(long j10) {
        return (this.f73925i * j10) / 1000000;
    }

    protected void h(long j10) {
        this.f73923g = j10;
    }

    final int d(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        C8211gC.b(this.f73918b);
        int i10 = OV.f69931a;
        int i11 = this.f73924h;
        if (i11 == 0) {
            while (this.f73917a.e(interfaceC9361r0)) {
                long jZzf = interfaceC9361r0.zzf();
                long j10 = this.f73922f;
                this.f73927k = jZzf - j10;
                if (!c(this.f73917a.a(), j10, this.f73926j)) {
                    C c10 = this.f73926j.f72820a;
                    this.f73925i = c10.f66482E;
                    if (!this.f73929m) {
                        this.f73918b.d(c10);
                        this.f73929m = true;
                    }
                    X3 x32 = this.f73926j.f72821b;
                    if (x32 != null) {
                        this.f73920d = x32;
                    } else if (interfaceC9361r0.zzd() == -1) {
                        this.f73920d = new C7555a4(null);
                    } else {
                        W3 w3B = this.f73917a.b();
                        this.f73920d = new R3(this, this.f73922f, interfaceC9361r0.zzd(), w3B.f71835d + w3B.f71836e, w3B.f71833b, (w3B.f71832a & 4) != 0);
                    }
                    this.f73924h = 2;
                    this.f73917a.d();
                    return 0;
                }
                this.f73922f = interfaceC9361r0.zzf();
            }
            this.f73924h = 3;
            return -1;
        }
        if (i11 == 1) {
            interfaceC9361r0.e((int) this.f73922f);
            this.f73924h = 2;
            return 0;
        }
        if (i11 != 2) {
            return -1;
        }
        long jA = this.f73920d.a(interfaceC9361r0);
        if (jA >= 0) {
            n02.f69630a = jA;
            return 1;
        }
        if (jA < -1) {
            h(-(jA + 2));
        }
        if (!this.f73928l) {
            Q0 q0Zze = this.f73920d.zze();
            C8211gC.b(q0Zze);
            this.f73919c.m(q0Zze);
            this.f73928l = true;
        }
        if (this.f73927k <= 0 && !this.f73917a.e(interfaceC9361r0)) {
            this.f73924h = 3;
            return -1;
        }
        this.f73927k = 0L;
        GQ gqA = this.f73917a.a();
        long jA2 = a(gqA);
        if (jA2 >= 0) {
            long j11 = this.f73923g;
            if (j11 + jA2 >= this.f73921e) {
                long jE = e(j11);
                this.f73918b.c(gqA, gqA.u());
                this.f73918b.a(jE, 1, gqA.u(), 0, null);
                this.f73921e = -1L;
            }
        }
        this.f73923g += jA2;
        return 0;
    }

    protected final long e(long j10) {
        return (j10 * 1000000) / this.f73925i;
    }

    final void g(InterfaceC9575t0 interfaceC9575t0, X0 x02) {
        this.f73919c = interfaceC9575t0;
        this.f73918b = x02;
        b(true);
    }

    final void i(long j10, long j11) {
        this.f73917a.c();
        if (j10 == 0) {
            b(!this.f73928l);
            return;
        }
        if (this.f73924h != 0) {
            long jF = f(j11);
            this.f73921e = jF;
            X3 x32 = this.f73920d;
            int i10 = OV.f69931a;
            x32.zzg(jF);
            this.f73924h = 2;
        }
    }
}
