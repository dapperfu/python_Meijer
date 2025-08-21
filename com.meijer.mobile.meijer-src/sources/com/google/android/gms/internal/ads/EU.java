package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EU implements InterfaceC10158yU {

    /* renamed from: a, reason: collision with root package name */
    private final GH f67305a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f67306b;

    /* renamed from: c, reason: collision with root package name */
    private final VJ f67307c;

    /* renamed from: d, reason: collision with root package name */
    private final T60 f67308d;

    /* renamed from: e, reason: collision with root package name */
    private final C9080oL f67309e;

    /* renamed from: f, reason: collision with root package name */
    private final C9296qN f67310f;

    public EU(GH gh2, Xj0 xj0, VJ vj2, T60 t60, C9080oL c9080oL, C9296qN c9296qN) {
        this.f67305a = gh2;
        this.f67306b = xj0;
        this.f67307c = vj2;
        this.f67308d = t60;
        this.f67309e = c9080oL;
        this.f67310f = c9296qN;
    }

    private final com.google.common.util.concurrent.q g(final C8733l60 c8733l60, final Z50 z50, final JSONObject jSONObject) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77260m2)).booleanValue()) {
            this.f67310f.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_START.a(), Nc.v.c().a());
        }
        T60 t60 = this.f67308d;
        VJ vj2 = this.f67307c;
        final com.google.common.util.concurrent.q qVarA = t60.a();
        final com.google.common.util.concurrent.q qVarA2 = vj2.a(c8733l60, z50, jSONObject);
        return Mj0.c(qVarA, qVarA2).a(new Callable() { // from class: com.google.android.gms.internal.ads.zU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f81268a.c(qVarA2, qVarA, c8733l60, z50, jSONObject);
            }
        }, this.f67306b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        C7880d60 c7880d60 = z50.f72897s;
        return (c7880d60 == null || c7880d60.f74205c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        return Mj0.n(Mj0.n(this.f67308d.a(), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.BU
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f66380a.e(z50, (C8440iL) obj);
            }
        }, this.f67306b), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.CU
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f66628a.f(c8733l60, z50, (JSONArray) obj);
            }
        }, this.f67306b);
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(C8440iL c8440iL, JSONObject jSONObject) throws Exception {
        this.f67308d.b(Mj0.h(c8440iL));
        if (jSONObject.optBoolean("success")) {
            return Mj0.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnv("process json failed");
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(Z50 z50, final C8440iL c8440iL) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) Oc.A.c().a(C8784lf.f76749B8)).booleanValue() && com.google.android.gms.common.util.n.j()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", z50.f72897s.f74205c);
        jSONObject2.put("sdk_params", jSONObject);
        return Mj0.n(c8440iL.g("google.afma.nativeAds.preProcessJson", jSONObject2), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.AU
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f65969a.d(c8440iL, (JSONObject) obj);
            }
        }, this.f67306b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ C9504sI c(com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2, C8733l60 c8733l60, Z50 z50, JSONObject jSONObject) throws Exception {
        C10039xI c10039xI = (C10039xI) qVar.get();
        C8440iL c8440iL = (C8440iL) qVar2.get();
        AbstractC7718bf abstractC7718bf = C8784lf.f77260m2;
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f67310f.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_END.a(), Nc.v.c().a());
        }
        AbstractC10146yI abstractC10146yIC = this.f67305a.c(new C7279Rz(c8733l60, z50, null), new JI(c10039xI), new UH(jSONObject, c8440iL));
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            long jA = Nc.v.c().a();
            this.f67310f.a().putLong(EnumC8014eN.RENDERING_AD_COMPONENT_CREATION_END.a(), jA);
            this.f67310f.a().putLong(EnumC8014eN.RENDERING_CONFIGURE_WEBVIEW_START.a(), jA);
        }
        abstractC10146yIC.j().b();
        abstractC10146yIC.k().a(c8440iL);
        abstractC10146yIC.i().a(c10039xI.f0());
        abstractC10146yIC.l().a(this.f67309e, c10039xI.d0());
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f67310f.a().putLong(EnumC8014eN.RENDERING_CONFIGURE_WEBVIEW_END.a(), Nc.v.c().a());
        }
        return abstractC10146yIC.h();
    }

    final /* synthetic */ com.google.common.util.concurrent.q f(C8733l60 c8733l60, Z50 z50, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return Mj0.g(new zzdvy(3));
        }
        if (c8733l60.f76588a.f75445a.f79585k > 1) {
            int length = jSONArray.length();
            if (((Boolean) Oc.A.c().a(C8784lf.f77274n2)).booleanValue()) {
                this.f67310f.c("nsl", String.valueOf(length));
            }
            this.f67308d.c(Math.min(length, c8733l60.f76588a.f75445a.f79585k));
            ArrayList arrayList = new ArrayList(c8733l60.f76588a.f75445a.f79585k);
            for (int i10 = 0; i10 < c8733l60.f76588a.f75445a.f79585k; i10++) {
                if (i10 < length) {
                    arrayList.add(g(c8733l60, z50, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(Mj0.g(new zzdvy(3)));
                }
            }
            return Mj0.h(arrayList);
        }
        return Mj0.m(g(c8733l60, z50, jSONArray.getJSONObject(0)), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.DU
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return Collections.singletonList(Mj0.h((C9504sI) obj));
            }
        }, this.f67306b);
    }
}
