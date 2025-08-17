package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EU implements InterfaceC10033yU {

    /* renamed from: a, reason: collision with root package name */
    private final GH f66465a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f66466b;

    /* renamed from: c, reason: collision with root package name */
    private final VJ f66467c;

    /* renamed from: d, reason: collision with root package name */
    private final T60 f66468d;

    /* renamed from: e, reason: collision with root package name */
    private final C8955oL f66469e;

    /* renamed from: f, reason: collision with root package name */
    private final C9171qN f66470f;

    public EU(GH gh2, Xj0 xj0, VJ vj2, T60 t60, C8955oL c8955oL, C9171qN c9171qN) {
        this.f66465a = gh2;
        this.f66466b = xj0;
        this.f66467c = vj2;
        this.f66468d = t60;
        this.f66469e = c8955oL;
        this.f66470f = c9171qN;
    }

    private final com.google.common.util.concurrent.q g(final C8608l60 c8608l60, final Z50 z50, final JSONObject jSONObject) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76420m2)).booleanValue()) {
            this.f66470f.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_START.a(), Lc.v.c().a());
        }
        T60 t60 = this.f66468d;
        VJ vj2 = this.f66467c;
        final com.google.common.util.concurrent.q qVarA = t60.a();
        final com.google.common.util.concurrent.q qVarA2 = vj2.a(c8608l60, z50, jSONObject);
        return Mj0.c(qVarA, qVarA2).a(new Callable() { // from class: com.google.android.gms.internal.ads.zU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f80428a.c(qVarA2, qVarA, c8608l60, z50, jSONObject);
            }
        }, this.f66466b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        C7755d60 c7755d60 = z50.f72057s;
        return (c7755d60 == null || c7755d60.f73365c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        return Mj0.n(Mj0.n(this.f66468d.a(), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.BU
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f65540a.e(z50, (C8315iL) obj);
            }
        }, this.f66466b), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.CU
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f65788a.f(c8608l60, z50, (JSONArray) obj);
            }
        }, this.f66466b);
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(C8315iL c8315iL, JSONObject jSONObject) throws Exception {
        this.f66468d.b(Mj0.h(c8315iL));
        if (jSONObject.optBoolean("success")) {
            return Mj0.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnv("process json failed");
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(Z50 z50, final C8315iL c8315iL) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) Mc.A.c().a(C8659lf.f75909B8)).booleanValue() && com.google.android.gms.common.util.n.j()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", z50.f72057s.f73365c);
        jSONObject2.put("sdk_params", jSONObject);
        return Mj0.n(c8315iL.g("google.afma.nativeAds.preProcessJson", jSONObject2), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.AU
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f65129a.d(c8315iL, (JSONObject) obj);
            }
        }, this.f66466b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ C9379sI c(com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2, C8608l60 c8608l60, Z50 z50, JSONObject jSONObject) throws Exception {
        C9914xI c9914xI = (C9914xI) qVar.get();
        C8315iL c8315iL = (C8315iL) qVar2.get();
        AbstractC7593bf abstractC7593bf = C8659lf.f76420m2;
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f66470f.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_END.a(), Lc.v.c().a());
        }
        AbstractC10021yI abstractC10021yIC = this.f66465a.c(new C7154Rz(c8608l60, z50, null), new JI(c9914xI), new UH(jSONObject, c8315iL));
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            long jA = Lc.v.c().a();
            this.f66470f.a().putLong(EnumC7889eN.RENDERING_AD_COMPONENT_CREATION_END.a(), jA);
            this.f66470f.a().putLong(EnumC7889eN.RENDERING_CONFIGURE_WEBVIEW_START.a(), jA);
        }
        abstractC10021yIC.j().b();
        abstractC10021yIC.k().a(c8315iL);
        abstractC10021yIC.i().a(c9914xI.f0());
        abstractC10021yIC.l().a(this.f66469e, c9914xI.d0());
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f66470f.a().putLong(EnumC7889eN.RENDERING_CONFIGURE_WEBVIEW_END.a(), Lc.v.c().a());
        }
        return abstractC10021yIC.h();
    }

    final /* synthetic */ com.google.common.util.concurrent.q f(C8608l60 c8608l60, Z50 z50, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return Mj0.g(new zzdvy(3));
        }
        if (c8608l60.f75748a.f74605a.f78745k > 1) {
            int length = jSONArray.length();
            if (((Boolean) Mc.A.c().a(C8659lf.f76434n2)).booleanValue()) {
                this.f66470f.c("nsl", String.valueOf(length));
            }
            this.f66468d.c(Math.min(length, c8608l60.f75748a.f74605a.f78745k));
            ArrayList arrayList = new ArrayList(c8608l60.f75748a.f74605a.f78745k);
            for (int i10 = 0; i10 < c8608l60.f75748a.f74605a.f78745k; i10++) {
                if (i10 < length) {
                    arrayList.add(g(c8608l60, z50, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(Mj0.g(new zzdvy(3)));
                }
            }
            return Mj0.h(arrayList);
        }
        return Mj0.m(g(c8608l60, z50, jSONArray.getJSONObject(0)), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.DU
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return Collections.singletonList(Mj0.h((C9379sI) obj));
            }
        }, this.f66466b);
    }
}
