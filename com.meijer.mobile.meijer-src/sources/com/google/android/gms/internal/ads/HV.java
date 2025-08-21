package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class HV implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68279a;

    /* renamed from: b, reason: collision with root package name */
    private final UL f68280b;

    /* renamed from: c, reason: collision with root package name */
    private final DL f68281c;

    /* renamed from: d, reason: collision with root package name */
    private final C9695u60 f68282d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f68283e;

    /* renamed from: f, reason: collision with root package name */
    private final Sc.a f68284f;

    /* renamed from: g, reason: collision with root package name */
    private final C7296Si f68285g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f68286h = ((Boolean) Oc.A.c().a(C8784lf.f76917N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GS f68287i;

    /* renamed from: j, reason: collision with root package name */
    private final C9296qN f68288j;

    /* renamed from: k, reason: collision with root package name */
    private final C9937wN f68289k;

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        C7880d60 c7880d60 = z50.f72897s;
        return (c7880d60 == null || c7880d60.f74203a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        final YL yl2 = new YL();
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.CV
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f66631a.c(z50, c8733l60, yl2, obj);
            }
        }, this.f68283e);
        qVarN.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.DV
            @Override // java.lang.Runnable
            public final void run() {
                yl2.b();
            }
        }, this.f68283e);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(final Z50 z50, C8733l60 c8733l60, YL yl2, Object obj) throws Exception {
        final HV hv2;
        AbstractC7718bf abstractC7718bf = C8784lf.f77260m2;
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f68288j.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_START.a(), Nc.v.c().a());
        }
        final InterfaceC9133ot interfaceC9133otA = this.f68280b.a(this.f68282d.f79579e, z50, c8733l60.f76589b.f76177b);
        interfaceC9133otA.O(z50.f72857W);
        yl2.a(this.f68279a, interfaceC9133otA.zzF());
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f68288j.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_END.a(), Nc.v.c().a());
        }
        C7270Rq c7270Rq = new C7270Rq();
        final AbstractC10256zL abstractC10256zLB = this.f68281c.b(new C7279Rz(c8733l60, z50, null), new AL(new GV(this.f68279a, this.f68280b, this.f68282d, this.f68284f, z50, c7270Rq, interfaceC9133otA, this.f68285g, this.f68286h, this.f68287i, this.f68288j, this.f68289k), interfaceC9133otA));
        c7270Rq.b(abstractC10256zLB);
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            hv2 = this;
            hv2.f68288j.a().putLong(EnumC8014eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Nc.v.c().a());
        } else {
            hv2 = this;
        }
        C8472ij.b(interfaceC9133otA, abstractC10256zLB.i());
        abstractC10256zLB.b().G0(new InterfaceC9706uC() { // from class: com.google.android.gms.internal.ads.AV
            @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
            public final void zzr() {
                InterfaceC9133ot interfaceC9133ot = interfaceC9133otA;
                if (interfaceC9133ot.zzN() != null) {
                    interfaceC9133ot.zzN().zzs();
                }
            }
        }, C7033Kq.f69020g);
        abstractC10256zLB.l().i(interfaceC9133otA, true, hv2.f68286h ? hv2.f68285g : null, hv2.f68288j.a());
        String strB = z50.f72897s.f74203a;
        if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && abstractC10256zLB.m().e(true)) {
            strB = C7539Zt.b(strB, C7539Zt.a(z50));
        }
        abstractC10256zLB.l();
        return Mj0.m(TL.j(interfaceC9133otA, z50.f72897s.f74204b, strB, hv2.f68288j.a()), new InterfaceC9533sf0(hv2) { // from class: com.google.android.gms.internal.ads.BV
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj2) {
                InterfaceC9133ot interfaceC9133ot = interfaceC9133otA;
                if (z50.f72847M) {
                    interfaceC9133ot.w();
                }
                AbstractC10256zL abstractC10256zL = abstractC10256zLB;
                interfaceC9133ot.I();
                interfaceC9133ot.onPause();
                return abstractC10256zL.k();
            }
        }, hv2.f68283e);
    }

    public HV(Context context, Sc.a aVar, C9695u60 c9695u60, Executor executor, DL dl2, UL ul2, C7296Si c7296Si, GS gs2, C9296qN c9296qN, C9937wN c9937wN) {
        this.f68279a = context;
        this.f68282d = c9695u60;
        this.f68281c = dl2;
        this.f68283e = executor;
        this.f68284f = aVar;
        this.f68280b = ul2;
        this.f68285g = c7296Si;
        this.f68287i = gs2;
        this.f68288j = c9296qN;
        this.f68289k = c9937wN;
    }
}
