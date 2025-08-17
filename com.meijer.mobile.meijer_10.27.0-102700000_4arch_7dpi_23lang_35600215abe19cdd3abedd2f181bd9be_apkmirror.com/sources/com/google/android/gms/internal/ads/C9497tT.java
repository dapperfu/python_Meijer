package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9497tT implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7418Zx f78576a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f78577b;

    /* renamed from: c, reason: collision with root package name */
    private final UL f78578c;

    /* renamed from: d, reason: collision with root package name */
    private final C9570u60 f78579d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f78580e;

    /* renamed from: f, reason: collision with root package name */
    private final Qc.a f78581f;

    /* renamed from: g, reason: collision with root package name */
    private final C7171Si f78582g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f78583h = ((Boolean) Mc.A.c().a(C8659lf.f76077N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GS f78584i;

    /* renamed from: j, reason: collision with root package name */
    private final C9171qN f78585j;

    /* renamed from: k, reason: collision with root package name */
    private final C9812wN f78586k;

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        C7755d60 c7755d60 = z50.f72057s;
        return (c7755d60 == null || c7755d60.f73363a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        final YL yl2 = new YL();
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.pT
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f77588a.c(z50, c8608l60, yl2, obj);
            }
        }, this.f78580e);
        qVarN.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.qT
            @Override // java.lang.Runnable
            public final void run() {
                yl2.b();
            }
        }, this.f78580e);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(final Z50 z50, C8608l60 c8608l60, YL yl2, Object obj) throws Exception {
        AbstractC7593bf abstractC7593bf = C8659lf.f76420m2;
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f78585j.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_START.a(), Lc.v.c().a());
        }
        final InterfaceC9008ot interfaceC9008otA = this.f78578c.a(this.f78579d.f78739e, z50, c8608l60.f75749b.f75337b);
        interfaceC9008otA.O(z50.f72017W);
        yl2.a(this.f78577b, interfaceC9008otA.zzF());
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f78585j.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_END.a(), Lc.v.c().a());
        }
        C7145Rq c7145Rq = new C7145Rq();
        final AbstractC7286Vx abstractC7286VxA = this.f78576a.a(new C7154Rz(c8608l60, z50, null), new JG(new C9711vT(this.f78581f, c7145Rq, z50, interfaceC9008otA, this.f78579d, this.f78583h, this.f78582g, this.f78584i, this.f78586k), interfaceC9008otA), new C7319Wx(z50.f72022a0));
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f78585j.a().putLong(EnumC7889eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Lc.v.c().a());
        }
        abstractC7286VxA.j().i(interfaceC9008otA, false, this.f78583h ? this.f78582g : null, this.f78585j.a());
        c7145Rq.b(abstractC7286VxA);
        abstractC7286VxA.b().H0(new InterfaceC9581uC() { // from class: com.google.android.gms.internal.ads.rT
            @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
            public final void zzr() {
                InterfaceC9008ot interfaceC9008ot = interfaceC9008otA;
                if (interfaceC9008ot.zzN() != null) {
                    interfaceC9008ot.zzN().zzs();
                }
            }
        }, C6908Kq.f68180g);
        String strB = z50.f72057s.f73363a;
        if (((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && abstractC7286VxA.k().e(true)) {
            strB = C7414Zt.b(strB, C7414Zt.a(z50));
        }
        abstractC7286VxA.j();
        return Mj0.m(TL.j(interfaceC9008otA, z50.f72057s.f73364b, strB, this.f78585j.a()), new InterfaceC9408sf0(this) { // from class: com.google.android.gms.internal.ads.sT
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj2) {
                InterfaceC9008ot interfaceC9008ot = interfaceC9008otA;
                if (z50.f72007M) {
                    interfaceC9008ot.w();
                }
                AbstractC7286Vx abstractC7286Vx = abstractC7286VxA;
                interfaceC9008ot.I();
                interfaceC9008ot.onPause();
                return abstractC7286Vx.h();
            }
        }, this.f78580e);
    }

    public C9497tT(AbstractC7418Zx abstractC7418Zx, Context context, Executor executor, UL ul2, C9570u60 c9570u60, Qc.a aVar, C7171Si c7171Si, GS gs2, C9171qN c9171qN, C9812wN c9812wN) {
        this.f78577b = context;
        this.f78576a = abstractC7418Zx;
        this.f78580e = executor;
        this.f78578c = ul2;
        this.f78579d = c9570u60;
        this.f78581f = aVar;
        this.f78582g = c7171Si;
        this.f78584i = gs2;
        this.f78585j = c9171qN;
        this.f78586k = c9812wN;
    }
}
