package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class Ly0 implements FA0, IA0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f69301b;

    /* renamed from: d, reason: collision with root package name */
    private JA0 f69303d;

    /* renamed from: e, reason: collision with root package name */
    private int f69304e;

    /* renamed from: f, reason: collision with root package name */
    private C8105fC0 f69305f;

    /* renamed from: g, reason: collision with root package name */
    private HC f69306g;

    /* renamed from: h, reason: collision with root package name */
    private int f69307h;

    /* renamed from: i, reason: collision with root package name */
    private SF0 f69308i;

    /* renamed from: j, reason: collision with root package name */
    private C[] f69309j;

    /* renamed from: k, reason: collision with root package name */
    private long f69310k;

    /* renamed from: l, reason: collision with root package name */
    private long f69311l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f69313n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f69314o;

    /* renamed from: q, reason: collision with root package name */
    private HA0 f69316q;

    /* renamed from: a, reason: collision with root package name */
    private final Object f69300a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Zz0 f69302c = new Zz0();

    /* renamed from: m, reason: collision with root package name */
    private long f69312m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC7432Wl f69315p = AbstractC7432Wl.f71995a;

    private final void E(long j10, boolean z10) throws zzib {
        this.f69313n = false;
        this.f69311l = j10;
        this.f69312m = j10;
        Q(j10, z10);
    }

    protected void A() {
    }

    protected abstract void B(C[] cArr, long j10, long j11, C7578aF0 c7578aF0) throws zzib;

    protected final zzib G(Throwable th2, C c10, boolean z10, int i10) {
        int iG = 4;
        if (c10 != null && !this.f69314o) {
            this.f69314o = true;
            try {
                iG = g(c10) & 7;
            } catch (zzib unused) {
            } finally {
                this.f69314o = false;
            }
        }
        return zzib.b(th2, b(), this.f69304e, c10, iG, z10, i10);
    }

    protected final long I() {
        return this.f69311l;
    }

    protected final AbstractC7432Wl J() {
        return this.f69315p;
    }

    protected final Zz0 L() {
        Zz0 zz0 = this.f69302c;
        zz0.f73159b = null;
        zz0.f73158a = null;
        return zz0;
    }

    protected abstract void O();

    protected void P(boolean z10, boolean z11) throws zzib {
    }

    protected abstract void Q(long j10, boolean z10) throws zzib;

    @Override // com.google.android.gms.internal.ads.FA0
    public final boolean d() {
        return this.f69312m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final boolean f() {
        return this.f69313n;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void i(int i10, C8105fC0 c8105fC0, HC hc2) {
        this.f69304e = i10;
        this.f69305f = c8105fC0;
        this.f69306g = hc2;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final int k() {
        return this.f69307h;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void n() {
        this.f69313n = true;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void p(long j10) throws zzib {
        E(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public /* synthetic */ void s(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final long u() {
        return this.f69312m;
    }

    @Override // com.google.android.gms.internal.ads.AA0
    public void v(int i10, Object obj) throws zzib {
    }

    protected void w() {
    }

    protected void y() {
    }

    protected void z() throws zzib {
    }

    @Override // com.google.android.gms.internal.ads.FA0, com.google.android.gms.internal.ads.IA0
    public final int zzb() {
        return this.f69301b;
    }

    @Override // com.google.android.gms.internal.ads.IA0
    public int zze() throws zzib {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public InterfaceC8101fA0 zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final IA0 zzm() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final SF0 zzp() {
        return this.f69308i;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public /* synthetic */ void zzt() {
    }

    protected final C[] D() {
        C[] cArr = this.f69309j;
        cArr.getClass();
        return cArr;
    }

    protected final int F(Zz0 zz0, By0 by0, int i10) {
        SF0 sf0 = this.f69308i;
        sf0.getClass();
        int iB = sf0.b(zz0, by0, i10);
        if (iB == -4) {
            if (by0.f()) {
                this.f69312m = Long.MIN_VALUE;
                return this.f69313n ? -4 : -3;
            }
            long j10 = by0.f66473f + this.f69310k;
            by0.f66473f = j10;
            this.f69312m = Math.max(this.f69312m, j10);
            return iB;
        }
        if (iB == -5) {
            C c10 = zz0.f73158a;
            c10.getClass();
            long j11 = c10.f66509t;
            if (j11 != Long.MAX_VALUE) {
                C9717uH0 c9717uH0B = c10.b();
                c9717uH0B.F(j11 + this.f69310k);
                zz0.f73158a = c9717uH0B.H();
                return -5;
            }
        }
        return iB;
    }

    protected final int H(long j10) {
        SF0 sf0 = this.f69308i;
        sf0.getClass();
        return sf0.a(j10 - this.f69310k);
    }

    protected final HC K() {
        HC hc2 = this.f69306g;
        hc2.getClass();
        return hc2;
    }

    protected final JA0 M() {
        JA0 ja0 = this.f69303d;
        ja0.getClass();
        return ja0;
    }

    protected final C8105fC0 N() {
        C8105fC0 c8105fC0 = this.f69305f;
        c8105fC0.getClass();
        return c8105fC0;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void c() throws zzib {
        C8211gC.f(this.f69307h == 1);
        this.f69307h = 2;
        z();
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void e(C[] cArr, SF0 sf0, long j10, long j11, C7578aF0 c7578aF0) throws zzib {
        C8211gC.f(!this.f69313n);
        this.f69308i = sf0;
        if (this.f69312m == Long.MIN_VALUE) {
            this.f69312m = j10;
        }
        this.f69309j = cArr;
        this.f69310k = j11;
        B(cArr, j10, j11, c7578aF0);
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void h() {
        C8211gC.f(this.f69307h == 0);
        Zz0 zz0 = this.f69302c;
        zz0.f73159b = null;
        zz0.f73158a = null;
        y();
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void j(AbstractC7432Wl abstractC7432Wl) {
        if (Objects.equals(this.f69315p, abstractC7432Wl)) {
            return;
        }
        this.f69315p = abstractC7432Wl;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void l(JA0 ja0, C[] cArr, SF0 sf0, long j10, boolean z10, boolean z11, long j11, long j12, C7578aF0 c7578aF0) throws zzib {
        C8211gC.f(this.f69307h == 0);
        this.f69303d = ja0;
        this.f69307h = 1;
        P(z10, z11);
        e(cArr, sf0, j11, j12, c7578aF0);
        E(j11, z10);
    }

    @Override // com.google.android.gms.internal.ads.IA0
    public final void q(HA0 ha0) {
        synchronized (this.f69300a) {
            this.f69316q = ha0;
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void t() {
        C8211gC.f(this.f69307h == 2);
        this.f69307h = 1;
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        HA0 ha0;
        synchronized (this.f69300a) {
            ha0 = this.f69316q;
        }
        if (ha0 != null) {
            ha0.a(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void zzG() {
        C8211gC.f(this.f69307h == 0);
        w();
    }

    @Override // com.google.android.gms.internal.ads.IA0
    public final void zzq() {
        synchronized (this.f69300a) {
            this.f69316q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void zzr() {
        C8211gC.f(this.f69307h == 1);
        Zz0 zz0 = this.f69302c;
        zz0.f73159b = null;
        zz0.f73158a = null;
        this.f69307h = 0;
        this.f69308i = null;
        this.f69309j = null;
        this.f69313n = false;
        O();
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void zzw() throws IOException {
        SF0 sf0 = this.f69308i;
        sf0.getClass();
        sf0.zzd();
    }

    public Ly0(int i10) {
        this.f69301b = i10;
    }

    protected final boolean C() {
        if (d()) {
            return this.f69313n;
        }
        SF0 sf0 = this.f69308i;
        sf0.getClass();
        return sf0.zze();
    }
}
