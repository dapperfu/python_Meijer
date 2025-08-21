package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8875mU implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f77635a;

    /* renamed from: b, reason: collision with root package name */
    private final UL f77636b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC8647kH f77637c;

    /* renamed from: d, reason: collision with root package name */
    private final C9695u60 f77638d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f77639e;

    /* renamed from: f, reason: collision with root package name */
    private final Sc.a f77640f;

    /* renamed from: g, reason: collision with root package name */
    private final C7296Si f77641g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f77642h = ((Boolean) Oc.A.c().a(C8784lf.f76917N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GS f77643i;

    /* renamed from: j, reason: collision with root package name */
    private final C9296qN f77644j;

    /* renamed from: k, reason: collision with root package name */
    private final C9937wN f77645k;

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        C7880d60 c7880d60 = z50.f72897s;
        return (c7880d60 == null || c7880d60.f74203a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        final YL yl2 = new YL();
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.hU
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f75570a.c(z50, c8733l60, yl2, obj);
            }
        }, this.f77639e);
        qVarN.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.iU
            @Override // java.lang.Runnable
            public final void run() {
                yl2.b();
            }
        }, this.f77639e);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(final Z50 z50, C8733l60 c8733l60, YL yl2, Object obj) throws Exception {
        AbstractC7718bf abstractC7718bf = C8784lf.f77260m2;
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f77644j.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_START.a(), Nc.v.c().a());
        }
        final InterfaceC9133ot interfaceC9133otA = this.f77636b.a(this.f77638d.f79579e, z50, c8733l60.f76589b.f76177b);
        interfaceC9133otA.O(z50.f72857W);
        yl2.a(this.f77635a, interfaceC9133otA.zzF());
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f77644j.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_END.a(), Nc.v.c().a());
        }
        C7270Rq c7270Rq = new C7270Rq();
        final GG ggC = this.f77637c.c(new C7279Rz(c8733l60, z50, null), new JG(new C8768lU(this.f77635a, this.f77640f, c7270Rq, z50, interfaceC9133otA, this.f77638d, this.f77642h, this.f77641g, this.f77643i, this.f77645k), interfaceC9133otA));
        c7270Rq.b(ggC);
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f77644j.a().putLong(EnumC8014eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Nc.v.c().a());
        }
        ggC.b().G0(new InterfaceC9706uC() { // from class: com.google.android.gms.internal.ads.jU
            @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
            public final void zzr() {
                InterfaceC9133ot interfaceC9133ot = interfaceC9133otA;
                if (interfaceC9133ot.zzN() != null) {
                    interfaceC9133ot.zzN().zzs();
                }
            }
        }, C7033Kq.f69020g);
        String strB = z50.f72897s.f74203a;
        if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && ggC.l().e(true)) {
            strB = C7539Zt.b(strB, C7539Zt.a(z50));
        }
        ggC.k().i(interfaceC9133otA, true, this.f77642h ? this.f77641g : null, this.f77644j.a());
        ggC.k();
        return Mj0.m(TL.j(interfaceC9133otA, z50.f72897s.f74204b, strB, this.f77644j.a()), new InterfaceC9533sf0(this) { // from class: com.google.android.gms.internal.ads.kU
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj2) {
                InterfaceC9133ot interfaceC9133ot = interfaceC9133otA;
                if (z50.f72847M) {
                    interfaceC9133ot.w();
                }
                GG gg2 = ggC;
                interfaceC9133ot.I();
                interfaceC9133ot.onPause();
                return gg2.i();
            }
        }, this.f77639e);
    }

    public C8875mU(Context context, Sc.a aVar, C9695u60 c9695u60, Executor executor, AbstractC8647kH abstractC8647kH, UL ul2, C7296Si c7296Si, GS gs2, C9296qN c9296qN, C9937wN c9937wN) {
        this.f77635a = context;
        this.f77638d = c9695u60;
        this.f77637c = abstractC8647kH;
        this.f77639e = executor;
        this.f77640f = aVar;
        this.f77636b = ul2;
        this.f77641g = c7296Si;
        this.f77643i = gs2;
        this.f77644j = c9296qN;
        this.f77645k = c9937wN;
    }
}
