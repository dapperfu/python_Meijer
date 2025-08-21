package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7866d implements J, InterfaceC7972e {

    /* renamed from: a, reason: collision with root package name */
    private final int f74133a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f74134b;

    /* renamed from: c, reason: collision with root package name */
    private final C8719l f74135c;

    /* renamed from: d, reason: collision with root package name */
    private C f74136d;

    /* renamed from: e, reason: collision with root package name */
    private long f74137e;

    /* renamed from: f, reason: collision with root package name */
    private long f74138f;

    /* renamed from: g, reason: collision with root package name */
    private long f74139g;

    /* renamed from: h, reason: collision with root package name */
    private long f74140h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f74141i;

    /* renamed from: j, reason: collision with root package name */
    private long f74142j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f74143k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f74144l;

    /* renamed from: m, reason: collision with root package name */
    private long f74145m;

    /* renamed from: n, reason: collision with root package name */
    private H f74146n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f74147o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ C8505j f74148p;

    @Override // com.google.android.gms.internal.ads.J
    public final void c(boolean z10) {
        this.f74143k = false;
        this.f74142j = -9223372036854775807L;
        C8505j.l(this.f74148p, z10);
        this.f74145m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void d(long j10, long j11, long j12, long j13) {
        boolean z10 = this.f74141i;
        boolean z11 = true;
        if (this.f74138f == j11 && this.f74139g == j12) {
            z11 = false;
        }
        this.f74141i = z10 | z11;
        this.f74137e = j10;
        this.f74138f = j11;
        this.f74139g = j12;
        this.f74140h = j13;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean i(long j10, boolean z10, long j11, long j12, I i10) throws zzabg {
        C8211gC.f(false);
        long j13 = j10 - this.f74139g;
        try {
            if (this.f74148p.f76143c.a(j13, j11, j12, this.f74137e, z10, this.f74135c) != 4) {
                if (j13 < this.f74140h && !z10) {
                    GH0 gh0 = (GH0) i10;
                    gh0.f68001d.P0(gh0.f67998a, gh0.f67999b, gh0.f68000c);
                    return true;
                }
                this.f74148p.f76147g.k(j11, j12);
                if (this.f74144l) {
                    long j14 = this.f74145m;
                    if (j14 == -9223372036854775807L || C8505j.t(this.f74148p, j14)) {
                        o();
                        this.f74144l = false;
                        this.f74145m = -9223372036854775807L;
                    }
                }
                C8211gC.b(null);
                throw null;
            }
            return false;
        } catch (zzib e10) {
            C c10 = this.f74136d;
            C8211gC.b(c10);
            throw new zzabg(e10, c10);
        }
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void j(int i10, C c10) {
        C8211gC.f(false);
        this.f74136d = c10;
        if (this.f74143k) {
            C8211gC.f(this.f74142j != -9223372036854775807L);
            this.f74144l = true;
            this.f74145m = this.f74142j;
        } else {
            o();
            this.f74143k = true;
            this.f74144l = false;
            this.f74145m = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void m(H h10, Executor executor) {
        this.f74146n = h10;
        this.f74147o = executor;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final Surface zza() {
        C8211gC.f(false);
        C8211gC.b(null);
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

    public C7866d(C8505j c8505j, Context context) {
        this.f74148p = c8505j;
        this.f74133a = true != OV.k(context) ? 5 : 1;
        this.f74134b = new ArrayList();
        this.f74135c = new C8719l();
        this.f74142j = -9223372036854775807L;
        this.f74146n = H.f68157a;
        this.f74147o = C8505j.f76140o;
    }

    private final void o() {
        if (this.f74136d == null) {
            return;
        }
        new ArrayList(this.f74134b);
        C c10 = this.f74136d;
        c10.getClass();
        C9717uH0 c9717uH0B = c10.b();
        c9717uH0B.b(C8505j.v(c10.f66480C));
        c9717uH0B.H();
        C8211gC.b(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean I(boolean z10) {
        return this.f74148p.f76147g.I(false);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void M(float f10) {
        this.f74148p.f76147g.M(f10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7972e
    public final void a(C8505j c8505j) {
        final H h10 = this.f74146n;
        this.f74147o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                h10.b(this.f73892a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void b(int i10) {
        this.f74148p.f76147g.b(i10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void e(InterfaceC8612k interfaceC8612k) {
        this.f74148p.f76150j = interfaceC8612k;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void f(Surface surface, C8232gR c8232gR) {
        this.f74148p.s(surface, c8232gR);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void g(C c10) throws zzabg {
        C8505j.c(this.f74148p, c10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void h(boolean z10) {
        this.f74148p.f76147g.h(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void j0(List list) {
        if (this.f74134b.equals(list)) {
            return;
        }
        this.f74134b.clear();
        this.f74134b.addAll(list);
        this.f74134b.addAll(this.f74148p.f76146f);
        o();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void k(long j10, long j11) throws zzabg {
        this.f74148p.f76147g.k(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7972e
    public final void l(C8505j c8505j) {
        final H h10 = this.f74146n;
        this.f74147o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.TH0
            @Override // java.lang.Runnable
            public final void run() {
                h10.c(this.f71186a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7972e
    public final void n(C8505j c8505j, final C9238ps c9238ps) {
        final H h10 = this.f74146n;
        this.f74147o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.SH0
            @Override // java.lang.Runnable
            public final void run() {
                h10.a(this.f70934a, c9238ps);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void n0(boolean z10) {
        this.f74148p.f76147g.n0(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzb() {
        this.f74148p.p();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzc() {
        this.f74148p.f76147g.zzc();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzh() {
        this.f74148p.f76147g.zzh();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzj() {
        this.f74148p.f76147g.zzj();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzk() {
        this.f74148p.f76147g.zzk();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzl() {
        this.f74148p.r();
    }
}
