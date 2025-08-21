package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class VB0 implements PA0 {

    /* renamed from: a, reason: collision with root package name */
    private final HC f71654a;

    /* renamed from: b, reason: collision with root package name */
    private final C7431Wk f71655b;

    /* renamed from: c, reason: collision with root package name */
    private final C10079xl f71656c;

    /* renamed from: d, reason: collision with root package name */
    private final UB0 f71657d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray f71658e;

    /* renamed from: f, reason: collision with root package name */
    private WK f71659f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC7619aj f71660g;

    /* renamed from: h, reason: collision with root package name */
    private QH f71661h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f71662i;

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void F(final C7617ai c7617ai, final C7617ai c7617ai2, final int i10) {
        if (i10 == 1) {
            this.f71662i = false;
            i10 = 1;
        }
        UB0 ub0 = this.f71657d;
        InterfaceC7619aj interfaceC7619aj = this.f71660g;
        interfaceC7619aj.getClass();
        ub0.g(interfaceC7619aj);
        final QA0 qa0U = U();
        Y(qa0U, 11, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.KB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).n(qa0U, c7617ai, c7617ai2, i10);
            }
        });
    }

    private final QA0 Z(C7578aF0 c7578aF0) {
        this.f71660g.getClass();
        AbstractC7432Wl abstractC7432WlA = c7578aF0 == null ? null : this.f71657d.a(c7578aF0);
        if (c7578aF0 != null && abstractC7432WlA != null) {
            return V(abstractC7432WlA, abstractC7432WlA.n(c7578aF0.f73222a, this.f71655b).f71990c, c7578aF0);
        }
        int iZzd = this.f71660g.zzd();
        AbstractC7432Wl abstractC7432WlZzn = this.f71660g.zzn();
        if (iZzd >= abstractC7432WlZzn.c()) {
            abstractC7432WlZzn = AbstractC7432Wl.f71995a;
        }
        return V(abstractC7432WlZzn, iZzd, null);
    }

    private final QA0 a0(int i10, C7578aF0 c7578aF0) {
        InterfaceC7619aj interfaceC7619aj = this.f71660g;
        interfaceC7619aj.getClass();
        if (c7578aF0 != null) {
            return this.f71657d.a(c7578aF0) != null ? Z(c7578aF0) : V(AbstractC7432Wl.f71995a, i10, c7578aF0);
        }
        AbstractC7432Wl abstractC7432WlZzn = interfaceC7619aj.zzn();
        if (i10 >= abstractC7432WlZzn.c()) {
            abstractC7432WlZzn = AbstractC7432Wl.f71995a;
        }
        return V(abstractC7432WlZzn, i10, null);
    }

    private final QA0 b0() {
        return Z(this.f71657d.d());
    }

    private final QA0 c0() {
        return Z(this.f71657d.e());
    }

    private final QA0 d0(zzbd zzbdVar) {
        C7578aF0 c7578aF0;
        return (!(zzbdVar instanceof zzib) || (c7578aF0 = ((zzib) zzbdVar).f81552h) == null) ? U() : Z(c7578aF0);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void I(List list, C7578aF0 c7578aF0) {
        InterfaceC7619aj interfaceC7619aj = this.f71660g;
        interfaceC7619aj.getClass();
        this.f71657d.h(list, c7578aF0, interfaceC7619aj);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void K(SA0 sa0) {
        this.f71659f.f(sa0);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void L(SA0 sa0) {
        this.f71659f.b(sa0);
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void M(final InterfaceC7619aj interfaceC7619aj, Looper looper) {
        boolean z10 = true;
        if (this.f71660g != null && !this.f71657d.f71398b.isEmpty()) {
            z10 = false;
        }
        C8211gC.f(z10);
        interfaceC7619aj.getClass();
        this.f71660g = interfaceC7619aj;
        this.f71661h = this.f71654a.a(looper, null);
        this.f71659f = this.f71659f.a(looper, new UJ() { // from class: com.google.android.gms.internal.ads.jB0
            @Override // com.google.android.gms.internal.ads.UJ
            public final void a(Object obj, C9608tG0 c9608tG0) {
                this.f76201a.X(interfaceC7619aj, (SA0) obj, c9608tG0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7902dH0
    public final void O(final int i10, final long j10, final long j11) {
        final QA0 qa0Z = Z(this.f71657d.c());
        Y(qa0Z, 1006, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.eB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).h(qa0Z, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void T(AbstractC7432Wl abstractC7432Wl, final int i10) {
        InterfaceC7619aj interfaceC7619aj = this.f71660g;
        interfaceC7619aj.getClass();
        this.f71657d.i(interfaceC7619aj);
        final QA0 qa0U = U();
        Y(qa0U, 0, new InterfaceC9612tJ(qa0U, i10) { // from class: com.google.android.gms.internal.ads.bB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    protected final QA0 U() {
        return Z(this.f71657d.b());
    }

    protected final QA0 V(AbstractC7432Wl abstractC7432Wl, int i10, C7578aF0 c7578aF0) {
        C7578aF0 c7578aF02 = true == abstractC7432Wl.o() ? null : c7578aF0;
        long jZzb = this.f71654a.zzb();
        boolean z10 = abstractC7432Wl.equals(this.f71660g.zzn()) && i10 == this.f71660g.zzd();
        long jN = 0;
        if (c7578aF02 == null || !c7578aF02.b()) {
            if (z10) {
                jN = this.f71660g.zzj();
            } else if (!abstractC7432Wl.o()) {
                long j10 = abstractC7432Wl.e(i10, this.f71656c, 0L).f80696k;
                jN = OV.N(0L);
            }
        } else if (z10 && this.f71660g.zzb() == c7578aF02.f73223b && this.f71660g.zzc() == c7578aF02.f73224c) {
            jN = this.f71660g.zzk();
        }
        return new QA0(jZzb, abstractC7432Wl, i10, c7578aF02, jN, this.f71660g.zzn(), this.f71660g.zzd(), this.f71657d.b(), this.f71660g.zzk(), this.f71660g.zzm());
    }

    final /* synthetic */ void X(InterfaceC7619aj interfaceC7619aj, SA0 sa0, C9608tG0 c9608tG0) {
        sa0.b(interfaceC7619aj, new RA0(c9608tG0, this.f71658e));
    }

    protected final void Y(QA0 qa0, int i10, InterfaceC9612tJ interfaceC9612tJ) {
        this.f71658e.put(i10, qa0);
        WK wk2 = this.f71659f;
        wk2.d(i10, interfaceC9612tJ);
        wk2.c();
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void d() {
        QH qh2 = this.f71661h;
        C8211gC.b(qh2);
        qh2.b(new Runnable() { // from class: com.google.android.gms.internal.ads.MB0
            @Override // java.lang.Runnable
            public final void run() {
                VB0.W(this.f69406a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void zzu() {
        if (this.f71662i) {
            return;
        }
        final QA0 qa0U = U();
        this.f71662i = true;
        Y(qa0U, -1, new InterfaceC9612tJ(qa0U) { // from class: com.google.android.gms.internal.ads.IB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    public VB0(HC hc2) {
        hc2.getClass();
        this.f71654a = hc2;
        this.f71659f = new WK(OV.R(), hc2, new UJ() { // from class: com.google.android.gms.internal.ads.vB0
            @Override // com.google.android.gms.internal.ads.UJ
            public final void a(Object obj, C9608tG0 c9608tG0) {
            }
        });
        C7431Wk c7431Wk = new C7431Wk();
        this.f71655b = c7431Wk;
        this.f71656c = new C10079xl();
        this.f71657d = new UB0(c7431Wk);
        this.f71658e = new SparseArray();
    }

    public static /* synthetic */ void W(VB0 vb0) {
        final QA0 qa0U = vb0.U();
        vb0.Y(qa0U, 1028, new InterfaceC9612tJ(qa0U) { // from class: com.google.android.gms.internal.ads.UA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
        vb0.f71659f.e();
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void A(final GC0 gc0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1032, new InterfaceC9612tJ(qa0C0, gc0) { // from class: com.google.android.gms.internal.ads.QB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void B(final My0 my0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1015, new InterfaceC9612tJ(qa0C0, my0) { // from class: com.google.android.gms.internal.ads.LB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void C(final C c10, final Ny0 ny0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1009, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.JB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).g(qa0C0, c10, ny0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void D(final zzbd zzbdVar) {
        final QA0 qa0D0 = d0(zzbdVar);
        Y(qa0D0, 10, new InterfaceC9612tJ(qa0D0, zzbdVar) { // from class: com.google.android.gms.internal.ads.sB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void E(final My0 my0) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1020, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.EB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).o(qa0B0, my0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void G(final C9238ps c9238ps) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 25, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.HB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                QA0 qa0 = qa0C0;
                C9238ps c9238ps2 = c9238ps;
                ((SA0) obj).d(qa0, c9238ps2);
                int i10 = c9238ps2.f78485a;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void H(final C c10, final Ny0 ny0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1017, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.FB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).i(qa0C0, c10, ny0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void J(final int i10, final long j10) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1018, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.rB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).k(qa0B0, i10, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void N(final String str) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1012, new InterfaceC9612tJ(qa0C0, str) { // from class: com.google.android.gms.internal.ads.YA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void P(final boolean z10, final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, -1, new InterfaceC9612tJ(qa0U, z10, i10) { // from class: com.google.android.gms.internal.ads.kB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void Q(final zzbd zzbdVar) {
        final QA0 qa0D0 = d0(zzbdVar);
        Y(qa0D0, 10, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.AB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).m(qa0D0, zzbdVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void R(final L9 l92) {
        final QA0 qa0U = U();
        Y(qa0U, 14, new InterfaceC9612tJ(qa0U, l92) { // from class: com.google.android.gms.internal.ads.SB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void S(final int i10, final long j10, final long j11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1011, new InterfaceC9612tJ(qa0C0, i10, j10, j11) { // from class: com.google.android.gms.internal.ads.hB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void a(final long j10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1010, new InterfaceC9612tJ(qa0C0, j10) { // from class: com.google.android.gms.internal.ads.lB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void b(final My0 my0) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1013, new InterfaceC9612tJ(qa0B0, my0) { // from class: com.google.android.gms.internal.ads.BB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void c(final Exception exc) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1030, new InterfaceC9612tJ(qa0C0, exc) { // from class: com.google.android.gms.internal.ads.gB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void e(final String str, final long j10, final long j11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1016, new InterfaceC9612tJ(qa0C0, str, j11, j10) { // from class: com.google.android.gms.internal.ads.PB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void f(final Object obj, final long j10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 26, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.NB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj2) {
                ((SA0) obj2).j(qa0C0, obj, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void g(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7578aF0);
        Y(qa0A0, 1002, new InterfaceC9612tJ(qa0A0, qe0, we0) { // from class: com.google.android.gms.internal.ads.zB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void h(final int i10, final int i11, final boolean z10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1033, new InterfaceC9612tJ(qa0C0, i10, i11, z10) { // from class: com.google.android.gms.internal.ads.uB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void i(final String str) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1019, new InterfaceC9612tJ(qa0C0, str) { // from class: com.google.android.gms.internal.ads.qB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void j(final My0 my0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1007, new InterfaceC9612tJ(qa0C0, my0) { // from class: com.google.android.gms.internal.ads.VA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void k(final long j10, final int i10) {
        final QA0 qa0B0 = b0();
        Y(qa0B0, 1021, new InterfaceC9612tJ(qa0B0, j10, i10) { // from class: com.google.android.gms.internal.ads.yB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void l(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7578aF0);
        Y(qa0A0, 1000, new InterfaceC9612tJ(qa0A0, qe0, we0) { // from class: com.google.android.gms.internal.ads.ZA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void m(final GC0 gc0) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1031, new InterfaceC9612tJ(qa0C0, gc0) { // from class: com.google.android.gms.internal.ads.GB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void n(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7578aF0);
        Y(qa0A0, 1001, new InterfaceC9612tJ(qa0A0, qe0, we0) { // from class: com.google.android.gms.internal.ads.DB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void o(final String str, final long j10, final long j11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1008, new InterfaceC9612tJ(qa0C0, str, j11, j10) { // from class: com.google.android.gms.internal.ads.oB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void p(int i10, C7578aF0 c7578aF0, final WE0 we0) {
        final QA0 qa0A0 = a0(i10, c7578aF0);
        Y(qa0A0, 1004, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.wB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).a(qa0A0, we0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void q(final boolean z10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 23, new InterfaceC9612tJ(qa0C0, z10) { // from class: com.google.android.gms.internal.ads.dB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void r(final C7613ag c7613ag) {
        final QA0 qa0U = U();
        Y(qa0U, 12, new InterfaceC9612tJ(qa0U, c7613ag) { // from class: com.google.android.gms.internal.ads.TA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void s(final float f10) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 22, new InterfaceC9612tJ(qa0C0, f10) { // from class: com.google.android.gms.internal.ads.fB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void t(final C7133Np c7133Np) {
        final QA0 qa0U = U();
        Y(qa0U, 2, new InterfaceC9612tJ(qa0U, c7133Np) { // from class: com.google.android.gms.internal.ads.nB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void u(final C7722bh c7722bh) {
        final QA0 qa0U = U();
        Y(qa0U, 13, new InterfaceC9612tJ(qa0U, c7722bh) { // from class: com.google.android.gms.internal.ads.aB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void v(final H7 h72, final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 1, new InterfaceC9612tJ(qa0U, h72, i10) { // from class: com.google.android.gms.internal.ads.cB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void w(final boolean z10, final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 5, new InterfaceC9612tJ(qa0U, z10, i10) { // from class: com.google.android.gms.internal.ads.tB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void x(final Exception exc) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1014, new InterfaceC9612tJ(qa0C0, exc) { // from class: com.google.android.gms.internal.ads.RB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.PA0
    public final void y(final Exception exc) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 1029, new InterfaceC9612tJ(qa0C0, exc) { // from class: com.google.android.gms.internal.ads.OB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void z(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0, final IOException iOException, final boolean z10) {
        final QA0 qa0A0 = a0(i10, c7578aF0);
        Y(qa0A0, 1003, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.iB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).f(qa0A0, qe0, we0, iOException, z10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void zzb(final boolean z10) {
        final QA0 qa0U = U();
        Y(qa0U, 3, new InterfaceC9612tJ(qa0U, z10) { // from class: com.google.android.gms.internal.ads.XA0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void zzc(final boolean z10) {
        final QA0 qa0U = U();
        Y(qa0U, 7, new InterfaceC9612tJ(qa0U, z10) { // from class: com.google.android.gms.internal.ads.mB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void zzh(final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 4, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.CB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((SA0) obj).e(qa0U, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void zzi(final int i10) {
        final QA0 qa0U = U();
        Y(qa0U, 6, new InterfaceC9612tJ(qa0U, i10) { // from class: com.google.android.gms.internal.ads.pB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6683Ah
    public final void zzo(final int i10, final int i11) {
        final QA0 qa0C0 = c0();
        Y(qa0C0, 24, new InterfaceC9612tJ(qa0C0, i10, i11) { // from class: com.google.android.gms.internal.ads.TB0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
            }
        });
    }
}
