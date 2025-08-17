package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7741d implements J, InterfaceC7847e {

    /* renamed from: a, reason: collision with root package name */
    private final int f73293a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f73294b;

    /* renamed from: c, reason: collision with root package name */
    private final C8594l f73295c;

    /* renamed from: d, reason: collision with root package name */
    private C f73296d;

    /* renamed from: e, reason: collision with root package name */
    private long f73297e;

    /* renamed from: f, reason: collision with root package name */
    private long f73298f;

    /* renamed from: g, reason: collision with root package name */
    private long f73299g;

    /* renamed from: h, reason: collision with root package name */
    private long f73300h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f73301i;

    /* renamed from: j, reason: collision with root package name */
    private long f73302j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f73303k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f73304l;

    /* renamed from: m, reason: collision with root package name */
    private long f73305m;

    /* renamed from: n, reason: collision with root package name */
    private H f73306n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f73307o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ C8380j f73308p;

    @Override // com.google.android.gms.internal.ads.J
    public final void c(boolean z10) {
        this.f73303k = false;
        this.f73302j = -9223372036854775807L;
        C8380j.l(this.f73308p, z10);
        this.f73305m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void d(long j10, long j11, long j12, long j13) {
        boolean z10 = this.f73301i;
        boolean z11 = true;
        if (this.f73298f == j11 && this.f73299g == j12) {
            z11 = false;
        }
        this.f73301i = z10 | z11;
        this.f73297e = j10;
        this.f73298f = j11;
        this.f73299g = j12;
        this.f73300h = j13;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean i(long j10, boolean z10, long j11, long j12, I i10) throws zzabg {
        C8086gC.f(false);
        long j13 = j10 - this.f73299g;
        try {
            if (this.f73308p.f75303c.a(j13, j11, j12, this.f73297e, z10, this.f73295c) != 4) {
                if (j13 < this.f73300h && !z10) {
                    GH0 gh0 = (GH0) i10;
                    gh0.f67161d.P0(gh0.f67158a, gh0.f67159b, gh0.f67160c);
                    return true;
                }
                this.f73308p.f75307g.k(j11, j12);
                if (this.f73304l) {
                    long j14 = this.f73305m;
                    if (j14 == -9223372036854775807L || C8380j.t(this.f73308p, j14)) {
                        o();
                        this.f73304l = false;
                        this.f73305m = -9223372036854775807L;
                    }
                }
                C8086gC.b(null);
                throw null;
            }
            return false;
        } catch (zzib e10) {
            C c10 = this.f73296d;
            C8086gC.b(c10);
            throw new zzabg(e10, c10);
        }
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void j(int i10, C c10) {
        C8086gC.f(false);
        this.f73296d = c10;
        if (this.f73303k) {
            C8086gC.f(this.f73302j != -9223372036854775807L);
            this.f73304l = true;
            this.f73305m = this.f73302j;
        } else {
            o();
            this.f73303k = true;
            this.f73304l = false;
            this.f73305m = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void m(H h10, Executor executor) {
        this.f73306n = h10;
        this.f73307o = executor;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final Surface zza() {
        C8086gC.f(false);
        C8086gC.b(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean zzv() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean zzw() {
        return false;
    }

    public C7741d(C8380j c8380j, Context context) {
        this.f73308p = c8380j;
        this.f73293a = true != OV.k(context) ? 5 : 1;
        this.f73294b = new ArrayList();
        this.f73295c = new C8594l();
        this.f73302j = -9223372036854775807L;
        this.f73306n = H.f67317a;
        this.f73307o = C8380j.f75300o;
    }

    private final void o() {
        if (this.f73296d == null) {
            return;
        }
        new ArrayList(this.f73294b);
        C c10 = this.f73296d;
        c10.getClass();
        C9592uH0 c9592uH0B = c10.b();
        c9592uH0B.b(C8380j.v(c10.f65640C));
        c9592uH0B.H();
        C8086gC.b(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean I(boolean z10) {
        return this.f73308p.f75307g.I(false);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void M(float f10) {
        this.f73308p.f75307g.M(f10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7847e
    public final void a(C8380j c8380j) {
        final H h10 = this.f73306n;
        this.f73307o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                h10.b(this.f73052a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void b(int i10) {
        this.f73308p.f75307g.b(i10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void e(InterfaceC8487k interfaceC8487k) {
        this.f73308p.f75310j = interfaceC8487k;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void f(Surface surface, C8107gR c8107gR) {
        this.f73308p.s(surface, c8107gR);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void g(C c10) throws zzabg {
        C8380j.c(this.f73308p, c10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void h(boolean z10) {
        this.f73308p.f75307g.h(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void h0(List list) {
        if (this.f73294b.equals(list)) {
            return;
        }
        this.f73294b.clear();
        this.f73294b.addAll(list);
        this.f73294b.addAll(this.f73308p.f75306f);
        o();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void k(long j10, long j11) throws zzabg {
        this.f73308p.f75307g.k(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void k0(boolean z10) {
        this.f73308p.f75307g.k0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7847e
    public final void l(C8380j c8380j) {
        final H h10 = this.f73306n;
        this.f73307o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.TH0
            @Override // java.lang.Runnable
            public final void run() {
                h10.c(this.f70346a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7847e
    public final void n(C8380j c8380j, final C9113ps c9113ps) {
        final H h10 = this.f73306n;
        this.f73307o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.SH0
            @Override // java.lang.Runnable
            public final void run() {
                h10.a(this.f70094a, c9113ps);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzb() {
        this.f73308p.p();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzc() {
        this.f73308p.f75307g.zzc();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzh() {
        this.f73308p.f75307g.zzh();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzj() {
        this.f73308p.f75307g.zzj();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzk() {
        this.f73308p.f75307g.zzk();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzl() {
        this.f73308p.r();
    }
}
