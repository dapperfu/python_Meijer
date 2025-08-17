package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8750mU implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76795a;

    /* renamed from: b, reason: collision with root package name */
    private final UL f76796b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC8522kH f76797c;

    /* renamed from: d, reason: collision with root package name */
    private final C9570u60 f76798d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f76799e;

    /* renamed from: f, reason: collision with root package name */
    private final Qc.a f76800f;

    /* renamed from: g, reason: collision with root package name */
    private final C7171Si f76801g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f76802h = ((Boolean) Mc.A.c().a(C8659lf.f76077N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GS f76803i;

    /* renamed from: j, reason: collision with root package name */
    private final C9171qN f76804j;

    /* renamed from: k, reason: collision with root package name */
    private final C9812wN f76805k;

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        C7755d60 c7755d60 = z50.f72057s;
        return (c7755d60 == null || c7755d60.f73363a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        final YL yl2 = new YL();
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.hU
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f74730a.c(z50, c8608l60, yl2, obj);
            }
        }, this.f76799e);
        qVarN.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.iU
            @Override // java.lang.Runnable
            public final void run() {
                yl2.b();
            }
        }, this.f76799e);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(final Z50 z50, C8608l60 c8608l60, YL yl2, Object obj) throws Exception {
        AbstractC7593bf abstractC7593bf = C8659lf.f76420m2;
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f76804j.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_START.a(), Lc.v.c().a());
        }
        final InterfaceC9008ot interfaceC9008otA = this.f76796b.a(this.f76798d.f78739e, z50, c8608l60.f75749b.f75337b);
        interfaceC9008otA.O(z50.f72017W);
        yl2.a(this.f76795a, interfaceC9008otA.zzF());
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f76804j.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_END.a(), Lc.v.c().a());
        }
        C7145Rq c7145Rq = new C7145Rq();
        final GG ggC = this.f76797c.c(new C7154Rz(c8608l60, z50, null), new JG(new C8643lU(this.f76795a, this.f76800f, c7145Rq, z50, interfaceC9008otA, this.f76798d, this.f76802h, this.f76801g, this.f76803i, this.f76805k), interfaceC9008otA));
        c7145Rq.b(ggC);
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f76804j.a().putLong(EnumC7889eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Lc.v.c().a());
        }
        ggC.b().H0(new InterfaceC9581uC() { // from class: com.google.android.gms.internal.ads.jU
            @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
            public final void zzr() {
                InterfaceC9008ot interfaceC9008ot = interfaceC9008otA;
                if (interfaceC9008ot.zzN() != null) {
                    interfaceC9008ot.zzN().zzs();
                }
            }
        }, C6908Kq.f68180g);
        String strB = z50.f72057s.f73363a;
        if (((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && ggC.l().e(true)) {
            strB = C7414Zt.b(strB, C7414Zt.a(z50));
        }
        ggC.k().i(interfaceC9008otA, true, this.f76802h ? this.f76801g : null, this.f76804j.a());
        ggC.k();
        return Mj0.m(TL.j(interfaceC9008otA, z50.f72057s.f73364b, strB, this.f76804j.a()), new InterfaceC9408sf0(this) { // from class: com.google.android.gms.internal.ads.kU
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj2) {
                InterfaceC9008ot interfaceC9008ot = interfaceC9008otA;
                if (z50.f72007M) {
                    interfaceC9008ot.w();
                }
                GG gg2 = ggC;
                interfaceC9008ot.I();
                interfaceC9008ot.onPause();
                return gg2.i();
            }
        }, this.f76799e);
    }

    public C8750mU(Context context, Qc.a aVar, C9570u60 c9570u60, Executor executor, AbstractC8522kH abstractC8522kH, UL ul2, C7171Si c7171Si, GS gs2, C9171qN c9171qN, C9812wN c9812wN) {
        this.f76795a = context;
        this.f76798d = c9570u60;
        this.f76797c = abstractC8522kH;
        this.f76799e = executor;
        this.f76800f = aVar;
        this.f76796b = ul2;
        this.f76801g = c7171Si;
        this.f76803i = gs2;
        this.f76804j = c9171qN;
        this.f76805k = c9812wN;
    }
}
