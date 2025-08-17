package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class VB0 implements PA0 {

    /* renamed from: a, reason: collision with root package name */
    private final HC f70814a;

    /* renamed from: b, reason: collision with root package name */
    private final C7306Wk f70815b;

    /* renamed from: c, reason: collision with root package name */
    private final C9954xl f70816c;

    /* renamed from: d, reason: collision with root package name */
    private final UB0 f70817d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray f70818e;

    /* renamed from: f, reason: collision with root package name */
    private WK f70819f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC7494aj f70820g;

    /* renamed from: h, reason: collision with root package name */
    private QH f70821h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f70822i;

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void F(final C7492ai c7492ai, final C7492ai c7492ai2, final int i10) {
        if (i10 == 1) {
            this.f70822i = false;
            i10 = 1;
        }
        UB0 ub0 = this.f70817d;
        InterfaceC7494aj interfaceC7494aj = this.f70820g;
        interfaceC7494aj.getClass();
        ub0.g(interfaceC7494aj);
        final QA0 qa0U = U();
        Y(qa0U, 11, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.KB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).n(qa0U, c7492ai, c7492ai2, i10);
            }
        });
    }

    private final QA0 Z(C7453aF0 c7453aF0) {
        this.f70820g.getClass();
        AbstractC7307Wl abstractC7307WlA = c7453aF0 == null ? null : this.f70817d.a(c7453aF0);
        if (c7453aF0 != null && abstractC7307WlA != null) {
            return V(abstractC7307WlA, abstractC7307WlA.n(c7453aF0.f72382a, this.f70815b).f71150c, c7453aF0);
        }
        int iZzd = this.f70820g.zzd();
        AbstractC7307Wl abstractC7307WlZzn = this.f70820g.zzn();
        if (iZzd >= abstractC7307WlZzn.c()) {
            abstractC7307WlZzn = AbstractC7307Wl.f71155a;
        }
        return V(abstractC7307WlZzn, iZzd, null);
    }

    private final QA0 a0(int i10, C7453aF0 c7453aF0) {
        InterfaceC7494aj interfaceC7494aj = this.f70820g;
        interfaceC7494aj.getClass();
        if (c7453aF0 != null) {
            return this.f70817d.a(c7453aF0) != null ? Z(c7453aF0) : V(AbstractC7307Wl.f71155a, i10, c7453aF0);
        }
        AbstractC7307Wl abstractC7307WlZzn = interfaceC7494aj.zzn();
        if (i10 >= abstractC7307WlZzn.c()) {
            abstractC7307WlZzn = AbstractC7307Wl.f71155a;
        }
        return V(abstractC7307WlZzn, i10, null);
    }

    private final QA0 b0() {
        return Z(this.f70817d.d());
    }

    private final QA0 c0() {
        return Z(this.f70817d.e());
    }

    private final QA0 d0(zzbd zzbdVar) {
        C7453aF0 c7453aF0;
        return (!(zzbdVar instanceof zzib) || (c7453aF0 = ((zzib) zzbdVar).f80712h) == null) ? U() : Z(c7453aF0);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void I(List list, C7453aF0 c7453aF0) {
        InterfaceC7494aj interfaceC7494aj = this.f70820g;
        interfaceC7494aj.getClass();
        this.f70817d.h(list, c7453aF0, interfaceC7494aj);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void K(SA0 sa0) {
        this.f70819f.f(sa0);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void L(SA0 sa0) {
        this.f70819f.b(sa0);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void M(final InterfaceC7494aj interfaceC7494aj, Looper looper) {
        boolean z10 = true;
        if (this.f70820g != null && !this.f70817d.f70558b.isEmpty()) {
            z10 = false;
        }
        C8086gC.f(z10);
        interfaceC7494aj.getClass();
        this.f70820g = interfaceC7494aj;
        this.f70821h = this.f70814a.a(looper, null);
        this.f70819f = this.f70819f.a(looper, new UJ() { // from class: com.google.android.gms.internal.ads.jB0
            @Override // com.google.android.gms.internal.ads.UJ
            public final void a(Object obj, C9483tG0 c9483tG0) {
                this.f75361a.X(interfaceC7494aj, (SA0) obj, c9483tG0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7777dH0
    public final void O(final int i10, final long j10, final long j11) {
        final QA0 qa0Z = Z(this.f70817d.c());
        Y(qa0Z, 1006, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.eB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).h(qa0Z, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void T(AbstractC7307Wl abstractC7307Wl, final int i10) {
        InterfaceC7494aj interfaceC7494aj = this.f70820g;
        interfaceC7494aj.getClass();
        this.f70817d.i(interfaceC7494aj);
        final QA0 qa0U = U();
        Y(qa0U, 0, new InterfaceC9487tJ(qa0U, i10) { // from class: com.google.android.gms.internal.ads.bB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    protected final QA0 U() {
        return Z(this.f70817d.b());
    }

    protected final QA0 V(AbstractC7307Wl abstractC7307Wl, int i10, C7453aF0 c7453aF0) {
        C7453aF0 c7453aF02 = true == abstractC7307Wl.o() ? null : c7453aF0;
        long jZzb = this.f70814a.zzb();
        boolean z10 = abstractC7307Wl.equals(this.f70820g.zzn()) && i10 == this.f70820g.zzd();
        long jN = 0;
        if (c7453aF02 == null || !c7453aF02.b()) {
            if (z10) {
                jN = this.f70820g.zzj();
            } else if (!abstractC7307Wl.o()) {
                long j10 = abstractC7307Wl.e(i10, this.f70816c, 0L).f79856k;
                jN = OV.N(0L);
            }
        } else if (z10 && this.f70820g.zzb() == c7453aF02.f72383b && this.f70820g.zzc() == c7453aF02.f72384c) {
            jN = this.f70820g.zzk();
        }
        return new QA0(jZzb, abstractC7307Wl, i10, c7453aF02, jN, this.f70820g.zzn(), this.f70820g.zzd(), this.f70817d.b(), this.f70820g.zzk(), this.f70820g.zzm());
    }

    final /* synthetic */ void X(InterfaceC7494aj interfaceC7494aj, SA0 sa0, C9483tG0 c9483tG0) {
        sa0.b(interfaceC7494aj, new RA0(c9483tG0, this.f70818e));
    }

    protected final void Y(QA0 qa0, int i10, InterfaceC9487tJ interfaceC9487tJ) {
        this.f70818e.put(i10, qa0);
        WK wk2 = this.f70819f;
        wk2.d(i10, interfaceC9487tJ);
        wk2.c();
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void d() {
        QH qh2 = this.f70821h;
        C8086gC.b(qh2);
        qh2.b(new Runnable() { // from class: com.google.android.gms.internal.ads.MB0
            @Override // java.lang.Runnable
            public final void run() {
                VB0.W(this.f68566a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void zzu() {
        if (this.f70822i) {
            return;
        }
        final QA0 qa0U = U();
        this.f70822i = true;
        Y(qa0U, -1, new InterfaceC9487tJ(qa0U) { // from class: com.google.android.gms.internal.ads.IB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    public VB0(HC hc2) {
        hc2.getClass();
        this.f70814a = hc2;
        this.f70819f = new WK(OV.R(), hc2, new UJ() { // from class: com.google.android.gms.internal.ads.vB0
            @Override // com.google.android.gms.internal.ads.UJ
            public final void a(Object obj, C9483tG0 c9483tG0) {
            }
        });
        C7306Wk c7306Wk = new C7306Wk();
        this.f70815b = c7306Wk;
        this.f70816c = new C9954xl();
        this.f70817d = new UB0(c7306Wk);
        this.f70818e = new SparseArray();
    }

    public static /* synthetic */ void W(VB0 vb0) {
        final QA0 qa0U = vb0.U();
        vb0.Y(qa0U, 1028, new InterfaceC9487tJ(qa0U) { // from class: com.google.android.gms.internal.ads.UA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
        vb0.f70819f.e();
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void A(final GC0 gc0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1032, new InterfaceC9487tJ(qa0C0, gc0) { // from class: com.google.android.gms.internal.ads.QB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void B(final My0 my0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1015, new InterfaceC9487tJ(qa0C0, my0) { // from class: com.google.android.gms.internal.ads.LB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void C(final C c10, final Ny0 ny0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1009, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.JB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).g(qa0C0, c10, ny0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void D(final zzbd zzbdVar) {
        final QA0 qa0D0 = d0(zzbdVar);
        Y(qa0D0, 10, new InterfaceC9487tJ(qa0D0, zzbdVar) { // from class: com.google.android.gms.internal.ads.sB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void E(final My0 my0) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1020, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.EB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).o(qa0B0, my0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void G(final C9113ps c9113ps) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 25, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.HB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                QA0 qa0 = qa0C0;
                C9113ps c9113ps2 = c9113ps;
                ((SA0) obj).d(qa0, c9113ps2);
                int i10 = c9113ps2.f77645a;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void H(final C c10, final Ny0 ny0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1017, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.FB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).i(qa0C0, c10, ny0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void J(final int i10, final long j10) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1018, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.rB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).k(qa0B0, i10, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void N(final String str) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1012, new InterfaceC9487tJ(qa0C0, str) { // from class: com.google.android.gms.internal.ads.YA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void P(final boolean z10, final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, -1, new InterfaceC9487tJ(qa0U, z10, i10) { // from class: com.google.android.gms.internal.ads.kB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void Q(final zzbd zzbdVar) {
        final QA0 qa0D0 = d0(zzbdVar);
        Y(qa0D0, 10, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.AB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).m(qa0D0, zzbdVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void R(final L9 l92) {
        final QA0 qa0U = U();
        Y(qa0U, 14, new InterfaceC9487tJ(qa0U, l92) { // from class: com.google.android.gms.internal.ads.SB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void S(final int i10, final long j10, final long j11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1011, new InterfaceC9487tJ(qa0C0, i10, j10, j11) { // from class: com.google.android.gms.internal.ads.hB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void a(final long j10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1010, new InterfaceC9487tJ(qa0C0, j10) { // from class: com.google.android.gms.internal.ads.lB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void b(final My0 my0) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1013, new InterfaceC9487tJ(qa0B0, my0) { // from class: com.google.android.gms.internal.ads.BB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void c(final Exception exc) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1030, new InterfaceC9487tJ(qa0C0, exc) { // from class: com.google.android.gms.internal.ads.gB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void e(final String str, final long j10, final long j11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1016, new InterfaceC9487tJ(qa0C0, str, j11, j10) { // from class: com.google.android.gms.internal.ads.PB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void f(final Object obj, final long j10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 26, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.NB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj2) {
                ((SA0) obj2).j(qa0C0, obj, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void g(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7453aF0);
        Y(qa0A0, 1002, new InterfaceC9487tJ(qa0A0, qe0, we0) { // from class: com.google.android.gms.internal.ads.zB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void h(final int i10, final int i11, final boolean z10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1033, new InterfaceC9487tJ(qa0C0, i10, i11, z10) { // from class: com.google.android.gms.internal.ads.uB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void i(final String str) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1019, new InterfaceC9487tJ(qa0C0, str) { // from class: com.google.android.gms.internal.ads.qB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void j(final My0 my0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1007, new InterfaceC9487tJ(qa0C0, my0) { // from class: com.google.android.gms.internal.ads.VA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void k(final long j10, final int i10) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1021, new InterfaceC9487tJ(qa0B0, j10, i10) { // from class: com.google.android.gms.internal.ads.yB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void l(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7453aF0);
        Y(qa0A0, 1000, new InterfaceC9487tJ(qa0A0, qe0, we0) { // from class: com.google.android.gms.internal.ads.ZA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void m(final GC0 gc0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1031, new InterfaceC9487tJ(qa0C0, gc0) { // from class: com.google.android.gms.internal.ads.GB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void n(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7453aF0);
        Y(qa0A0, 1001, new InterfaceC9487tJ(qa0A0, qe0, we0) { // from class: com.google.android.gms.internal.ads.DB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void o(final String str, final long j10, final long j11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1008, new InterfaceC9487tJ(qa0C0, str, j11, j10) { // from class: com.google.android.gms.internal.ads.oB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void p(int i10, C7453aF0 c7453aF0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7453aF0);
        Y(qa0A0, 1004, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.wB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).a(qa0A0, we0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void q(final boolean z10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 23, new InterfaceC9487tJ(qa0C0, z10) { // from class: com.google.android.gms.internal.ads.dB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void r(final C7488ag c7488ag) {
        final QA0 qa0U = U();
        Y(qa0U, 12, new InterfaceC9487tJ(qa0U, c7488ag) { // from class: com.google.android.gms.internal.ads.TA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void s(final float f10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 22, new InterfaceC9487tJ(qa0C0, f10) { // from class: com.google.android.gms.internal.ads.fB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void t(final C7008Np c7008Np) {
        final QA0 qa0U = U();
        Y(qa0U, 2, new InterfaceC9487tJ(qa0U, c7008Np) { // from class: com.google.android.gms.internal.ads.nB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void u(final C7597bh c7597bh) {
        final QA0 qa0U = U();
        Y(qa0U, 13, new InterfaceC9487tJ(qa0U, c7597bh) { // from class: com.google.android.gms.internal.ads.aB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void v(final H7 h72, final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 1, new InterfaceC9487tJ(qa0U, h72, i10) { // from class: com.google.android.gms.internal.ads.cB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void w(final boolean z10, final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 5, new InterfaceC9487tJ(qa0U, z10, i10) { // from class: com.google.android.gms.internal.ads.tB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void x(final Exception exc) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1014, new InterfaceC9487tJ(qa0C0, exc) { // from class: com.google.android.gms.internal.ads.RB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void y(final Exception exc) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1029, new InterfaceC9487tJ(qa0C0, exc) { // from class: com.google.android.gms.internal.ads.OB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void z(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0, final IOException iOException, final boolean z10) {
        final QA0 qa0A0 = a0(i10, c7453aF0);
        Y(qa0A0, 1003, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.iB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).f(qa0A0, qe0, we0, iOException, z10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void zzb(final boolean z10) {
        final QA0 qa0U = U();
        Y(qa0U, 3, new InterfaceC9487tJ(qa0U, z10) { // from class: com.google.android.gms.internal.ads.XA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void zzc(final boolean z10) {
        final QA0 qa0U = U();
        Y(qa0U, 7, new InterfaceC9487tJ(qa0U, z10) { // from class: com.google.android.gms.internal.ads.mB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void zzh(final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 4, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.CB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                ((SA0) obj).e(qa0U, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void zzi(final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 6, new InterfaceC9487tJ(qa0U, i10) { // from class: com.google.android.gms.internal.ads.pB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6558Ah
    public final void zzo(final int i10, final int i11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 24, new InterfaceC9487tJ(qa0C0, i10, i11) { // from class: com.google.android.gms.internal.ads.TB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
            }
        });
    }
}
