package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class HV implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67439a;

    /* renamed from: b, reason: collision with root package name */
    private final UL f67440b;

    /* renamed from: c, reason: collision with root package name */
    private final DL f67441c;

    /* renamed from: d, reason: collision with root package name */
    private final C9570u60 f67442d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f67443e;

    /* renamed from: f, reason: collision with root package name */
    private final Qc.a f67444f;

    /* renamed from: g, reason: collision with root package name */
    private final C7171Si f67445g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f67446h = ((Boolean) Mc.A.c().a(C8659lf.f76077N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GS f67447i;

    /* renamed from: j, reason: collision with root package name */
    private final C9171qN f67448j;

    /* renamed from: k, reason: collision with root package name */
    private final C9812wN f67449k;

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        C7755d60 c7755d60 = z50.f72057s;
        return (c7755d60 == null || c7755d60.f73363a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        final YL yl2 = new YL();
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.CV
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f65791a.c(z50, c8608l60, yl2, obj);
            }
        }, this.f67443e);
        qVarN.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.DV
            @Override // java.lang.Runnable
            public final void run() {
                yl2.b();
            }
        }, this.f67443e);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(final Z50 z50, C8608l60 c8608l60, YL yl2, Object obj) throws Exception {
        final HV hv2;
        AbstractC7593bf abstractC7593bf = C8659lf.f76420m2;
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f67448j.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_START.a(), Lc.v.c().a());
        }
        final InterfaceC9008ot interfaceC9008otA = this.f67440b.a(this.f67442d.f78739e, z50, c8608l60.f75749b.f75337b);
        interfaceC9008otA.O(z50.f72017W);
        yl2.a(this.f67439a, interfaceC9008otA.zzF());
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f67448j.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_END.a(), Lc.v.c().a());
        }
        C7145Rq c7145Rq = new C7145Rq();
        final AbstractC10131zL abstractC10131zLB = this.f67441c.b(new C7154Rz(c8608l60, z50, null), new AL(new GV(this.f67439a, this.f67440b, this.f67442d, this.f67444f, z50, c7145Rq, interfaceC9008otA, this.f67445g, this.f67446h, this.f67447i, this.f67448j, this.f67449k), interfaceC9008otA));
        c7145Rq.b(abstractC10131zLB);
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            hv2 = this;
            hv2.f67448j.a().putLong(EnumC7889eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Lc.v.c().a());
        } else {
            hv2 = this;
        }
        C8347ij.b(interfaceC9008otA, abstractC10131zLB.i());
        abstractC10131zLB.b().H0(new InterfaceC9581uC() { // from class: com.google.android.gms.internal.ads.AV
            @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
            public final void zzr() {
                InterfaceC9008ot interfaceC9008ot = interfaceC9008otA;
                if (interfaceC9008ot.zzN() != null) {
                    interfaceC9008ot.zzN().zzs();
                }
            }
        }, C6908Kq.f68180g);
        abstractC10131zLB.l().i(interfaceC9008otA, true, hv2.f67446h ? hv2.f67445g : null, hv2.f67448j.a());
        String strB = z50.f72057s.f73363a;
        if (((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && abstractC10131zLB.m().e(true)) {
            strB = C7414Zt.b(strB, C7414Zt.a(z50));
        }
        abstractC10131zLB.l();
        return Mj0.m(TL.j(interfaceC9008otA, z50.f72057s.f73364b, strB, hv2.f67448j.a()), new InterfaceC9408sf0(hv2) { // from class: com.google.android.gms.internal.ads.BV
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj2) {
                InterfaceC9008ot interfaceC9008ot = interfaceC9008otA;
                if (z50.f72007M) {
                    interfaceC9008ot.w();
                }
                AbstractC10131zL abstractC10131zL = abstractC10131zLB;
                interfaceC9008ot.I();
                interfaceC9008ot.onPause();
                return abstractC10131zL.k();
            }
        }, hv2.f67443e);
    }

    public HV(Context context, Qc.a aVar, C9570u60 c9570u60, Executor executor, DL dl2, UL ul2, C7171Si c7171Si, GS gs2, C9171qN c9171qN, C9812wN c9812wN) {
        this.f67439a = context;
        this.f67442d = c9570u60;
        this.f67441c = dl2;
        this.f67443e = executor;
        this.f67444f = aVar;
        this.f67440b = ul2;
        this.f67445g = c7171Si;
        this.f67447i = gs2;
        this.f67448j = c9171qN;
        this.f67449k = c9812wN;
    }
}
