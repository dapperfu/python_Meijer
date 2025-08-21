package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9622tT implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7543Zx f79416a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f79417b;

    /* renamed from: c, reason: collision with root package name */
    private final UL f79418c;

    /* renamed from: d, reason: collision with root package name */
    private final C9695u60 f79419d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f79420e;

    /* renamed from: f, reason: collision with root package name */
    private final Sc.a f79421f;

    /* renamed from: g, reason: collision with root package name */
    private final C7296Si f79422g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f79423h = ((Boolean) Oc.A.c().a(C8784lf.f76917N8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    private final GS f79424i;

    /* renamed from: j, reason: collision with root package name */
    private final C9296qN f79425j;

    /* renamed from: k, reason: collision with root package name */
    private final C9937wN f79426k;

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        C7880d60 c7880d60 = z50.f72897s;
        return (c7880d60 == null || c7880d60.f74203a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        final YL yl2 = new YL();
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.pT
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f78428a.c(z50, c8733l60, yl2, obj);
            }
        }, this.f79420e);
        qVarN.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.qT
            @Override // java.lang.Runnable
            public final void run() {
                yl2.b();
            }
        }, this.f79420e);
        return qVarN;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(final Z50 z50, C8733l60 c8733l60, YL yl2, Object obj) throws Exception {
        AbstractC7718bf abstractC7718bf = C8784lf.f77260m2;
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f79425j.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_START.a(), Nc.v.c().a());
        }
        final InterfaceC9133ot interfaceC9133otA = this.f79418c.a(this.f79419d.f79579e, z50, c8733l60.f76589b.f76177b);
        interfaceC9133otA.O(z50.f72857W);
        yl2.a(this.f79417b, interfaceC9133otA.zzF());
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f79425j.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_END.a(), Nc.v.c().a());
        }
        C7270Rq c7270Rq = new C7270Rq();
        final AbstractC7411Vx abstractC7411VxA = this.f79416a.a(new C7279Rz(c8733l60, z50, null), new JG(new C9836vT(this.f79421f, c7270Rq, z50, interfaceC9133otA, this.f79419d, this.f79423h, this.f79422g, this.f79424i, this.f79426k), interfaceC9133otA), new C7444Wx(z50.f72862a0));
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f79425j.a().putLong(EnumC8014eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Nc.v.c().a());
        }
        abstractC7411VxA.j().i(interfaceC9133otA, false, this.f79423h ? this.f79422g : null, this.f79425j.a());
        c7270Rq.b(abstractC7411VxA);
        abstractC7411VxA.b().G0(new InterfaceC9706uC() { // from class: com.google.android.gms.internal.ads.rT
            @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
            public final void zzr() {
                InterfaceC9133ot interfaceC9133ot = interfaceC9133otA;
                if (interfaceC9133ot.zzN() != null) {
                    interfaceC9133ot.zzN().zzs();
                }
            }
        }, C7033Kq.f69020g);
        String strB = z50.f72897s.f74203a;
        if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && abstractC7411VxA.k().e(true)) {
            strB = C7539Zt.b(strB, C7539Zt.a(z50));
        }
        abstractC7411VxA.j();
        return Mj0.m(TL.j(interfaceC9133otA, z50.f72897s.f74204b, strB, this.f79425j.a()), new InterfaceC9533sf0(this) { // from class: com.google.android.gms.internal.ads.sT
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj2) {
                InterfaceC9133ot interfaceC9133ot = interfaceC9133otA;
                if (z50.f72847M) {
                    interfaceC9133ot.w();
                }
                AbstractC7411Vx abstractC7411Vx = abstractC7411VxA;
                interfaceC9133ot.I();
                interfaceC9133ot.onPause();
                return abstractC7411Vx.h();
            }
        }, this.f79420e);
    }

    public C9622tT(AbstractC7543Zx abstractC7543Zx, Context context, Executor executor, UL ul2, C9695u60 c9695u60, Sc.a aVar, C7296Si c7296Si, GS gs2, C9296qN c9296qN, C9937wN c9937wN) {
        this.f79417b = context;
        this.f79416a = abstractC7543Zx;
        this.f79420e = executor;
        this.f79418c = ul2;
        this.f79419d = c9695u60;
        this.f79421f = aVar;
        this.f79422g = c7296Si;
        this.f79424i = gs2;
        this.f79425j = c9296qN;
        this.f79426k = c9937wN;
    }
}
