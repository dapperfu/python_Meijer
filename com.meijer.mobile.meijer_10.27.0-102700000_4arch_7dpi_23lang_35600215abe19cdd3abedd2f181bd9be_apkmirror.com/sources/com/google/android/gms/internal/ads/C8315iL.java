package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8315iL {

    /* renamed from: b, reason: collision with root package name */
    private final Lc.a f74946b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f74947c;

    /* renamed from: d, reason: collision with root package name */
    private final C9812wN f74948d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f74949e;

    /* renamed from: f, reason: collision with root package name */
    private final M9 f74950f;

    /* renamed from: g, reason: collision with root package name */
    private final Qc.a f74951g;

    /* renamed from: i, reason: collision with root package name */
    private final C9710vS f74953i;

    /* renamed from: j, reason: collision with root package name */
    private final R90 f74954j;

    /* renamed from: k, reason: collision with root package name */
    private final GS f74955k;

    /* renamed from: l, reason: collision with root package name */
    private final C9998y60 f74956l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.util.concurrent.q f74957m;

    /* renamed from: a, reason: collision with root package name */
    private final UK f74945a = new UK();

    /* renamed from: h, reason: collision with root package name */
    private final C8134gj f74952h = new C8134gj();

    public final synchronized com.google.common.util.concurrent.q g(final String str, final JSONObject jSONObject) {
        com.google.common.util.concurrent.q qVar = this.f74957m;
        if (qVar == null) {
            return Mj0.h(null);
        }
        return Mj0.n(qVar, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.VK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f70840a.f(str, jSONObject, (InterfaceC9008ot) obj);
            }
        }, this.f74949e);
    }

    public final synchronized void h(Z50 z50, C7648c60 c7648c60, C8269hx c8269hx) {
        com.google.common.util.concurrent.q qVar = this.f74957m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new C7674cL(this, z50, c7648c60, c8269hx), this.f74949e);
    }

    public final synchronized void i() {
        com.google.common.util.concurrent.q qVar = this.f74957m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new YK(this), this.f74949e);
        this.f74957m = null;
    }

    public final synchronized void j(String str, Map map) {
        com.google.common.util.concurrent.q qVar = this.f74957m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new C7568bL(this, "sendMessageToNativeJs", map), this.f74949e);
    }

    public final synchronized void k() {
        final String str = (String) Mc.A.c().a(C8659lf.f76114Q3);
        final Context context = this.f74947c;
        final M9 m92 = this.f74950f;
        final Qc.a aVar = this.f74951g;
        final Lc.a aVar2 = this.f74946b;
        final GS gs2 = this.f74955k;
        final C9998y60 c9998y60 = this.f74956l;
        com.google.common.util.concurrent.q qVarM = Mj0.m(Mj0.k(new InterfaceC9309rj0() { // from class: com.google.android.gms.internal.ads.Ct
            @Override // com.google.android.gms.internal.ads.InterfaceC9309rj0
            public final com.google.common.util.concurrent.q zza() throws zzcfj {
                Lc.v.a();
                Context context2 = context;
                C8368iu c8368iuA = C8368iu.a();
                M9 m93 = m92;
                GS gs3 = gs2;
                Lc.a aVar3 = aVar2;
                InterfaceC9008ot interfaceC9008otA = C6673Dt.a(context2, c8368iuA, "", false, false, m93, null, aVar, null, null, aVar3, C7392Zc.a(), null, null, gs3, c9998y60);
                final C7111Qq c7111QqD = C7111Qq.d(interfaceC9008otA);
                interfaceC9008otA.zzN().P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.Bt
                    @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
                    public final void a(boolean z10, int i10, String str2, String str3) {
                        c7111QqD.e();
                    }
                });
                interfaceC9008otA.loadUrl(str);
                return c7111QqD;
            }
        }, C6908Kq.f68179f), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.XK
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
                this.f71316a.a(interfaceC9008ot);
                return interfaceC9008ot;
            }
        }, this.f74949e);
        this.f74957m = qVarM;
        C7009Nq.a(qVarM, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void l(String str, InterfaceC7069Pi interfaceC7069Pi) {
        com.google.common.util.concurrent.q qVar = this.f74957m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new ZK(this, str, interfaceC7069Pi), this.f74949e);
    }

    public final synchronized void n(String str, InterfaceC7069Pi interfaceC7069Pi) {
        com.google.common.util.concurrent.q qVar = this.f74957m;
        if (qVar == null) {
            return;
        }
        Mj0.r(qVar, new C7461aL(this, str, interfaceC7069Pi), this.f74949e);
    }

    final /* synthetic */ InterfaceC9008ot a(InterfaceC9008ot interfaceC9008ot) {
        interfaceC9008ot.h0("/result", this.f74952h);
        InterfaceC8156gu interfaceC8156guZzN = interfaceC9008ot.zzN();
        Lc.b bVar = new Lc.b(this.f74947c, null, null);
        C9710vS c9710vS = this.f74953i;
        R90 r90 = this.f74954j;
        C9812wN c9812wN = this.f74948d;
        UK uk2 = this.f74945a;
        interfaceC8156guZzN.r0(null, uk2, uk2, uk2, uk2, false, null, bVar, null, null, c9710vS, r90, c9812wN, null, null, null, null, null, null);
        return interfaceC9008ot;
    }

    final /* synthetic */ com.google.common.util.concurrent.q f(String str, JSONObject jSONObject, InterfaceC9008ot interfaceC9008ot) throws Exception {
        return this.f74952h.b(interfaceC9008ot, str, jSONObject);
    }

    public final void m(WeakReference weakReference, String str, InterfaceC7069Pi interfaceC7069Pi) {
        l(str, new C8101gL(this, weakReference, str, interfaceC7069Pi, null));
    }

    C8315iL(CallableC7994fL callableC7994fL) {
        this.f74947c = callableC7994fL.f74081b;
        this.f74949e = callableC7994fL.f74084e;
        this.f74950f = callableC7994fL.f74085f;
        this.f74951g = callableC7994fL.f74086g;
        this.f74946b = callableC7994fL.f74080a;
        this.f74953i = callableC7994fL.f74083d;
        this.f74954j = callableC7994fL.f74087h;
        this.f74948d = callableC7994fL.f74082c;
        this.f74955k = callableC7994fL.f74088i;
        this.f74956l = callableC7994fL.f74089j;
    }
}
