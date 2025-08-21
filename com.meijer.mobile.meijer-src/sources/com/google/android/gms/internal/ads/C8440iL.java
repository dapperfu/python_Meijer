package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8440iL {

    /* renamed from: b, reason: collision with root package name */
    private final Nc.a f75786b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f75787c;

    /* renamed from: d, reason: collision with root package name */
    private final C9937wN f75788d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f75789e;

    /* renamed from: f, reason: collision with root package name */
    private final M9 f75790f;

    /* renamed from: g, reason: collision with root package name */
    private final Sc.a f75791g;

    /* renamed from: i, reason: collision with root package name */
    private final C9835vS f75793i;

    /* renamed from: j, reason: collision with root package name */
    private final R90 f75794j;

    /* renamed from: k, reason: collision with root package name */
    private final GS f75795k;

    /* renamed from: l, reason: collision with root package name */
    private final C10123y60 f75796l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.q f75797m;

    /* renamed from: a, reason: collision with root package name */
    private final UK f75785a = new UK();

    /* renamed from: h, reason: collision with root package name */
    private final C8259gj f75792h = new C8259gj();

    public final synchronized com.google.common.util.concurrent.q g(final String str, final JSONObject jSONObject) {
        com.google.common.util.concurrent.q qVar = this.f75797m;
        if (qVar == null) {
            return Mj0.h(null);
        }
        return Mj0.n(qVar, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.VK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f71680a.f(str, jSONObject, (InterfaceC9133ot) obj);
            }
        }, this.f75789e);
    }

    public final synchronized void h(Z50 z50, C7773c60 c7773c60, C8394hx c8394hx) {
        com.google.common.util.concurrent.q qVar = this.f75797m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new C7799cL(this, z50, c7773c60, c8394hx), this.f75789e);
    }

    public final synchronized void i() {
        com.google.common.util.concurrent.q qVar = this.f75797m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new YK(this), this.f75789e);
        this.f75797m = null;
    }

    public final synchronized void j(String str, Map map) {
        com.google.common.util.concurrent.q qVar = this.f75797m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new C7693bL(this, "sendMessageToNativeJs", map), this.f75789e);
    }

    public final synchronized void k() {
        final String str = (String) Oc.A.c().a(C8784lf.f76954Q3);
        final Context context = this.f75787c;
        final M9 m92 = this.f75790f;
        final Sc.a aVar = this.f75791g;
        final Nc.a aVar2 = this.f75786b;
        final GS gs2 = this.f75795k;
        final C10123y60 c10123y60 = this.f75796l;
        com.google.common.util.concurrent.q qVarM = Mj0.m(Mj0.k(new InterfaceC9434rj0() { // from class: com.google.android.gms.internal.ads.Ct
            @Override // com.google.android.gms.internal.ads.InterfaceC9434rj0
            public final com.google.common.util.concurrent.q zza() throws zzcfj {
                Nc.v.a();
                Context context2 = context;
                C8493iu c8493iuA = C8493iu.a();
                M9 m93 = m92;
                GS gs3 = gs2;
                Nc.a aVar3 = aVar2;
                InterfaceC9133ot interfaceC9133otA = C6798Dt.a(context2, c8493iuA, "", false, false, m93, null, aVar, null, null, aVar3, C7517Zc.a(), null, null, gs3, c10123y60);
                final C7236Qq c7236QqD = C7236Qq.d(interfaceC9133otA);
                interfaceC9133otA.zzN().P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.Bt
                    @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
                    public final void a(boolean z10, int i10, String str2, String str3) {
                        c7236QqD.e();
                    }
                });
                interfaceC9133otA.loadUrl(str);
                return c7236QqD;
            }
        }, C7033Kq.f69019f), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.XK
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
                this.f72156a.a(interfaceC9133ot);
                return interfaceC9133ot;
            }
        }, this.f75789e);
        this.f75797m = qVarM;
        C7134Nq.a(qVarM, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void l(String str, InterfaceC7194Pi interfaceC7194Pi) {
        com.google.common.util.concurrent.q qVar = this.f75797m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new ZK(this, str, interfaceC7194Pi), this.f75789e);
    }

    public final synchronized void n(String str, InterfaceC7194Pi interfaceC7194Pi) {
        com.google.common.util.concurrent.q qVar = this.f75797m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new C7586aL(this, str, interfaceC7194Pi), this.f75789e);
    }

    final /* synthetic */ InterfaceC9133ot a(InterfaceC9133ot interfaceC9133ot) {
        interfaceC9133ot.h0("/result", this.f75792h);
        InterfaceC8281gu interfaceC8281guZzN = interfaceC9133ot.zzN();
        Nc.b bVar = new Nc.b(this.f75787c, null, null);
        C9835vS c9835vS = this.f75793i;
        R90 r90 = this.f75794j;
        C9937wN c9937wN = this.f75788d;
        UK uk2 = this.f75785a;
        interfaceC8281guZzN.N0(null, uk2, uk2, uk2, uk2, false, null, bVar, null, null, c9835vS, r90, c9937wN, null, null, null, null, null, null);
        return interfaceC9133ot;
    }

    final /* synthetic */ com.google.common.util.concurrent.q f(String str, JSONObject jSONObject, InterfaceC9133ot interfaceC9133ot) throws Exception {
        return this.f75792h.b(interfaceC9133ot, str, jSONObject);
    }

    public final void m(WeakReference weakReference, String str, InterfaceC7194Pi interfaceC7194Pi) {
        l(str, new C8226gL(this, weakReference, str, interfaceC7194Pi, null));
    }

    C8440iL(CallableC8119fL callableC8119fL) {
        this.f75787c = callableC8119fL.f74921b;
        this.f75789e = callableC8119fL.f74924e;
        this.f75790f = callableC8119fL.f74925f;
        this.f75791g = callableC8119fL.f74926g;
        this.f75786b = callableC8119fL.f74920a;
        this.f75793i = callableC8119fL.f74923d;
        this.f75794j = callableC8119fL.f74927h;
        this.f75788d = callableC8119fL.f74922c;
        this.f75795k = callableC8119fL.f74928i;
        this.f75796l = callableC8119fL.f74929j;
    }
}
