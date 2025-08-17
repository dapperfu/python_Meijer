package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class Ly0 implements FA0, IA0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f68461b;

    /* renamed from: d, reason: collision with root package name */
    private JA0 f68463d;

    /* renamed from: e, reason: collision with root package name */
    private int f68464e;

    /* renamed from: f, reason: collision with root package name */
    private C7980fC0 f68465f;

    /* renamed from: g, reason: collision with root package name */
    private HC f68466g;

    /* renamed from: h, reason: collision with root package name */
    private int f68467h;

    /* renamed from: i, reason: collision with root package name */
    private SF0 f68468i;

    /* renamed from: j, reason: collision with root package name */
    private C[] f68469j;

    /* renamed from: k, reason: collision with root package name */
    private long f68470k;

    /* renamed from: l, reason: collision with root package name */
    private long f68471l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f68473n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f68474o;

    /* renamed from: q, reason: collision with root package name */
    private HA0 f68476q;

    /* renamed from: a, reason: collision with root package name */
    private final Object f68460a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Zz0 f68462c = new Zz0();

    /* renamed from: m, reason: collision with root package name */
    private long f68472m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC7307Wl f68475p = AbstractC7307Wl.f71155a;

    private final void E(long j10, boolean z10) throws zzib {
        this.f68473n = false;
        this.f68471l = j10;
        this.f68472m = j10;
        Q(j10, z10);
    }

    protected void A() {
    }

    protected abstract void B(C[] cArr, long j10, long j11, C7453aF0 c7453aF0) throws zzib;

    protected final zzib G(Throwable th2, C c10, boolean z10, int i10) {
        int iF = 4;
        if (c10 != null && !this.f68474o) {
            this.f68474o = true;
            try {
                iF = f(c10) & 7;
            } catch (zzib unused) {
            } finally {
                this.f68474o = false;
            }
        }
        return zzib.b(th2, b(), this.f68464e, c10, iF, z10, i10);
    }

    protected final long I() {
        return this.f68471l;
    }

    protected final AbstractC7307Wl J() {
        return this.f68475p;
    }

    protected final Zz0 L() {
        Zz0 zz0 = this.f68462c;
        zz0.f72319b = null;
        zz0.f72318a = null;
        return zz0;
    }

    protected abstract void O();

    protected void P(boolean z10, boolean z11) throws zzib {
    }

    protected abstract void Q(long j10, boolean z10) throws zzib;

    @Override // com.google.android.gms.internal.ads.FA0
    public final boolean d() {
        return this.f68472m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final boolean h() {
        return this.f68473n;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void i(int i10, C7980fC0 c7980fC0, HC hc2) {
        this.f68464e = i10;
        this.f68465f = c7980fC0;
        this.f68466g = hc2;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final int k() {
        return this.f68467h;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void n() {
        this.f68473n = true;
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
        return this.f68472m;
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
        return this.f68461b;
    }

    @Override // com.google.android.gms.internal.ads.IA0
    public int zze() throws zzib {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public InterfaceC7976fA0 zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final IA0 zzm() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final SF0 zzp() {
        return this.f68468i;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public /* synthetic */ void zzt() {
    }

    protected final C[] D() {
        C[] cArr = this.f68469j;
        cArr.getClass();
        return cArr;
    }

    protected final int F(Zz0 zz0, By0 by0, int i10) {
        SF0 sf0 = this.f68468i;
        sf0.getClass();
        int iB = sf0.b(zz0, by0, i10);
        if (iB == -4) {
            if (by0.f()) {
                this.f68472m = Long.MIN_VALUE;
                return this.f68473n ? -4 : -3;
            }
            long j10 = by0.f65633f + this.f68470k;
            by0.f65633f = j10;
            this.f68472m = Math.max(this.f68472m, j10);
            return iB;
        }
        if (iB == -5) {
            C c10 = zz0.f72318a;
            c10.getClass();
            long j11 = c10.f65669t;
            if (j11 != Long.MAX_VALUE) {
                C9592uH0 c9592uH0B = c10.b();
                c9592uH0B.F(j11 + this.f68470k);
                zz0.f72318a = c9592uH0B.H();
                return -5;
            }
        }
        return iB;
    }

    protected final int H(long j10) {
        SF0 sf0 = this.f68468i;
        sf0.getClass();
        return sf0.a(j10 - this.f68470k);
    }

    protected final HC K() {
        HC hc2 = this.f68466g;
        hc2.getClass();
        return hc2;
    }

    protected final JA0 M() {
        JA0 ja0 = this.f68463d;
        ja0.getClass();
        return ja0;
    }

    protected final C7980fC0 N() {
        C7980fC0 c7980fC0 = this.f68465f;
        c7980fC0.getClass();
        return c7980fC0;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void c() throws zzib {
        C8086gC.f(this.f68467h == 1);
        this.f68467h = 2;
        z();
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void e(C[] cArr, SF0 sf0, long j10, long j11, C7453aF0 c7453aF0) throws zzib {
        C8086gC.f(!this.f68473n);
        this.f68468i = sf0;
        if (this.f68472m == Long.MIN_VALUE) {
            this.f68472m = j10;
        }
        this.f68469j = cArr;
        this.f68470k = j11;
        B(cArr, j10, j11, c7453aF0);
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void g() {
        C8086gC.f(this.f68467h == 0);
        Zz0 zz0 = this.f68462c;
        zz0.f72319b = null;
        zz0.f72318a = null;
        y();
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void j(AbstractC7307Wl abstractC7307Wl) {
        if (Objects.equals(this.f68475p, abstractC7307Wl)) {
            return;
        }
        this.f68475p = abstractC7307Wl;
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void l(JA0 ja0, C[] cArr, SF0 sf0, long j10, boolean z10, boolean z11, long j11, long j12, C7453aF0 c7453aF0) throws zzib {
        C8086gC.f(this.f68467h == 0);
        this.f68463d = ja0;
        this.f68467h = 1;
        P(z10, z11);
        e(cArr, sf0, j11, j12, c7453aF0);
        E(j11, z10);
    }

    @Override // com.google.android.gms.internal.ads.IA0
    public final void q(HA0 ha0) {
        synchronized (this.f68460a) {
            this.f68476q = ha0;
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void t() {
        C8086gC.f(this.f68467h == 2);
        this.f68467h = 1;
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        HA0 ha0;
        synchronized (this.f68460a) {
            ha0 = this.f68476q;
        }
        if (ha0 != null) {
            ha0.a(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void zzG() {
        C8086gC.f(this.f68467h == 0);
        w();
    }

    @Override // com.google.android.gms.internal.ads.IA0
    public final void zzq() {
        synchronized (this.f68460a) {
            this.f68476q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void zzr() {
        C8086gC.f(this.f68467h == 1);
        Zz0 zz0 = this.f68462c;
        zz0.f72319b = null;
        zz0.f72318a = null;
        this.f68467h = 0;
        this.f68468i = null;
        this.f68469j = null;
        this.f68473n = false;
        O();
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public final void zzw() throws IOException {
        SF0 sf0 = this.f68468i;
        sf0.getClass();
        sf0.zzd();
    }

    public Ly0(int i10) {
        this.f68461b = i10;
    }

    protected final boolean C() {
        if (d()) {
            return this.f68473n;
        }
        SF0 sf0 = this.f68468i;
        sf0.getClass();
        return sf0.zze();
    }
}
