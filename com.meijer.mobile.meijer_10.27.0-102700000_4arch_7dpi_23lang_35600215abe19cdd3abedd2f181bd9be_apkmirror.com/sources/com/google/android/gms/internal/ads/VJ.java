package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VJ {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f70837a;

    /* renamed from: b, reason: collision with root package name */
    private final C8526kK f70838b;

    /* renamed from: c, reason: collision with root package name */
    private final C9061pK f70839c;

    public VJ(Xj0 xj0, C8526kK c8526kK, C9061pK c9061pK) {
        this.f70837a = xj0;
        this.f70838b = c8526kK;
        this.f70839c = c9061pK;
    }

    private static final boolean c(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final com.google.common.util.concurrent.q a(final C8608l60 c8608l60, final Z50 z50, final JSONObject jSONObject) {
        com.google.common.util.concurrent.q qVarH;
        JSONObject jSONObjectOptJSONObject;
        com.google.common.util.concurrent.q qVarH2;
        final com.google.common.util.concurrent.q qVarI0 = this.f70837a.i0(new Callable(this) { // from class: com.google.android.gms.internal.ads.PJ
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzegu {
                C9914xI c9914xI = new C9914xI();
                JSONObject jSONObject2 = jSONObject;
                c9914xI.B(jSONObject2.optInt("template_id", -1));
                c9914xI.k(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                C8608l60 c8608l602 = c8608l60;
                c9914xI.v(strOptString);
                C9570u60 c9570u60 = c8608l602.f75748a.f74605a;
                if (!c9570u60.f78741g.contains(Integer.toString(c9914xI.P()))) {
                    throw new zzegu(1, "Invalid template ID: " + c9914xI.P());
                }
                if (c9914xI.P() == 3) {
                    if (c9914xI.a() == null) {
                        throw new zzegu(1, "No custom template id for custom template ad response.");
                    }
                    if (!c9570u60.f78742h.contains(c9914xI.a())) {
                        throw new zzegu(1, "Unexpected custom template id in the response.");
                    }
                }
                Z50 z502 = z50;
                c9914xI.y(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (z502.f72007M) {
                    Lc.v.t();
                    strOptString2 = Pc.D0.e0() + " : " + strOptString2;
                }
                c9914xI.z("headline", strOptString2);
                c9914xI.z("body", jSONObject2.optString("body", null));
                c9914xI.z("call_to_action", jSONObject2.optString("call_to_action", null));
                c9914xI.z(PlaceTypes.STORE, jSONObject2.optString(PlaceTypes.STORE, null));
                c9914xI.z("price", jSONObject2.optString("price", null));
                c9914xI.z("advertiser", jSONObject2.optString("advertiser", null));
                return c9914xI;
            }
        });
        final com.google.common.util.concurrent.q qVarF = this.f70838b.f(jSONObject, "images");
        C7648c60 c7648c60 = c8608l60.f75749b.f75337b;
        C8526kK c8526kK = this.f70838b;
        final com.google.common.util.concurrent.q qVarG = c8526kK.g(jSONObject, "images", z50, c7648c60);
        final com.google.common.util.concurrent.q qVarE = c8526kK.e(jSONObject, "secondary_image");
        final com.google.common.util.concurrent.q qVarE2 = c8526kK.e(jSONObject, "app_icon");
        final com.google.common.util.concurrent.q qVarD = c8526kK.d(jSONObject, "attribution");
        final com.google.common.util.concurrent.q qVarH3 = this.f70838b.h(jSONObject, z50, c8608l60.f75749b.f75337b);
        if (((Boolean) Mc.A.c().a(C8659lf.f76109Pc)).booleanValue() && ((Integer) Optional.ofNullable(jSONObject.optJSONObject("video")).map(new Function() { // from class: com.google.android.gms.internal.ads.QJ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((JSONObject) obj).optJSONArray("flags");
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.RJ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        return jSONObjectOptJSONObject2.optString("value");
                    }
                }
                return null;
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.SJ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }).orElse(0)).intValue() == 3) {
            C8526kK c8526kK2 = this.f70838b;
            C7145Rq c7145Rq = new C7145Rq();
            Mj0.r(qVarH3, new C8419jK(c8526kK2, c7145Rq), C6908Kq.f68179f);
            qVarH = c7145Rq;
        } else {
            qVarH = Mj0.h(new Bundle());
        }
        final com.google.common.util.concurrent.q qVar = qVarH;
        final com.google.common.util.concurrent.q qVarA = this.f70839c.a(jSONObject, "custom_assets");
        final C8526kK c8526kK3 = this.f70838b;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            qVarH2 = TextUtils.isEmpty(strOptString) ? Mj0.h(null) : Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.ZJ
                @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return c8526kK3.c(strOptString, obj);
                }
            }, C6908Kq.f68179f);
        } else {
            qVarH2 = Mj0.h(null);
        }
        final com.google.common.util.concurrent.q qVar2 = qVarH2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(qVarI0);
        arrayList.add(qVarF);
        arrayList.add(qVarG);
        arrayList.add(qVarE);
        arrayList.add(qVarE2);
        arrayList.add(qVarD);
        arrayList.add(qVarH3);
        arrayList.add(qVar);
        arrayList.add(qVarA);
        if (!((Boolean) Mc.A.c().a(C8659lf.f76409l5)).booleanValue() || c(jSONObject)) {
            arrayList.add(qVar2);
        }
        return Mj0.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.TJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VJ.b(qVarI0, qVarF, qVarE2, qVarE, qVarD, jSONObject, qVarH3, qVar, qVarG, qVar2, qVarA);
            }
        }, this.f70837a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final /* synthetic */ C9914xI b(com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2, com.google.common.util.concurrent.q qVar3, com.google.common.util.concurrent.q qVar4, com.google.common.util.concurrent.q qVar5, JSONObject jSONObject, com.google.common.util.concurrent.q qVar6, com.google.common.util.concurrent.q qVar7, com.google.common.util.concurrent.q qVar8, com.google.common.util.concurrent.q qVar9, com.google.common.util.concurrent.q qVar10) throws Exception {
        C9914xI c9914xI = (C9914xI) qVar.get();
        c9914xI.p((List) qVar2.get());
        c9914xI.m((InterfaceC7334Xg) qVar3.get());
        c9914xI.q((InterfaceC7334Xg) qVar4.get());
        c9914xI.j((InterfaceC7099Qg) qVar5.get());
        c9914xI.s(C8526kK.j(jSONObject));
        c9914xI.l(C8526kK.i(jSONObject));
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) qVar6.get();
        if (interfaceC9008ot != null) {
            c9914xI.E(interfaceC9008ot);
            c9914xI.D(interfaceC9008ot.zzF());
            c9914xI.C(interfaceC9008ot.zzq());
        }
        c9914xI.Q().putAll((Bundle) qVar7.get());
        InterfaceC9008ot interfaceC9008ot2 = (InterfaceC9008ot) qVar8.get();
        if (interfaceC9008ot2 != null) {
            c9914xI.o(interfaceC9008ot2);
            c9914xI.F(interfaceC9008ot2.zzF());
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76409l5)).booleanValue() && !c(jSONObject)) {
            c9914xI.u(qVar9);
            c9914xI.x(new C7145Rq());
        } else {
            InterfaceC9008ot interfaceC9008ot3 = (InterfaceC9008ot) qVar9.get();
            if (interfaceC9008ot3 != null) {
                c9914xI.t(interfaceC9008ot3);
            }
        }
        for (C8954oK c8954oK : (List) qVar10.get()) {
            if (c8954oK.f77358a != 1) {
                c9914xI.n(c8954oK.f77359b, c8954oK.f77361d);
            } else {
                c9914xI.z(c8954oK.f77359b, c8954oK.f77360c);
            }
        }
        return c9914xI;
    }
}
