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
    private final Xj0 f71677a;

    /* renamed from: b, reason: collision with root package name */
    private final C8651kK f71678b;

    /* renamed from: c, reason: collision with root package name */
    private final C9186pK f71679c;

    public VJ(Xj0 xj0, C8651kK c8651kK, C9186pK c9186pK) {
        this.f71677a = xj0;
        this.f71678b = c8651kK;
        this.f71679c = c9186pK;
    }

    private static final boolean c(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final com.google.common.util.concurrent.q a(final C8733l60 c8733l60, final Z50 z50, final JSONObject jSONObject) {
        com.google.common.util.concurrent.q qVarH;
        JSONObject jSONObjectOptJSONObject;
        com.google.common.util.concurrent.q qVarH2;
        final com.google.common.util.concurrent.q qVarK0 = this.f71677a.k0(new Callable(this) { // from class: com.google.android.gms.internal.ads.PJ
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzegu {
                C10039xI c10039xI = new C10039xI();
                JSONObject jSONObject2 = jSONObject;
                c10039xI.B(jSONObject2.optInt("template_id", -1));
                c10039xI.k(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                C8733l60 c8733l602 = c8733l60;
                c10039xI.v(strOptString);
                C9695u60 c9695u60 = c8733l602.f76588a.f75445a;
                if (!c9695u60.f79581g.contains(Integer.toString(c10039xI.P()))) {
                    throw new zzegu(1, "Invalid template ID: " + c10039xI.P());
                }
                if (c10039xI.P() == 3) {
                    if (c10039xI.a() == null) {
                        throw new zzegu(1, "No custom template id for custom template ad response.");
                    }
                    if (!c9695u60.f79582h.contains(c10039xI.a())) {
                        throw new zzegu(1, "Unexpected custom template id in the response.");
                    }
                }
                Z50 z502 = z50;
                c10039xI.y(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (z502.f72847M) {
                    Nc.v.t();
                    strOptString2 = Rc.D0.e0() + " : " + strOptString2;
                }
                c10039xI.z("headline", strOptString2);
                c10039xI.z("body", jSONObject2.optString("body", null));
                c10039xI.z("call_to_action", jSONObject2.optString("call_to_action", null));
                c10039xI.z(PlaceTypes.STORE, jSONObject2.optString(PlaceTypes.STORE, null));
                c10039xI.z("price", jSONObject2.optString("price", null));
                c10039xI.z("advertiser", jSONObject2.optString("advertiser", null));
                return c10039xI;
            }
        });
        final com.google.common.util.concurrent.q qVarF = this.f71678b.f(jSONObject, "images");
        C7773c60 c7773c60 = c8733l60.f76589b.f76177b;
        C8651kK c8651kK = this.f71678b;
        final com.google.common.util.concurrent.q qVarG = c8651kK.g(jSONObject, "images", z50, c7773c60);
        final com.google.common.util.concurrent.q qVarE = c8651kK.e(jSONObject, "secondary_image");
        final com.google.common.util.concurrent.q qVarE2 = c8651kK.e(jSONObject, "app_icon");
        final com.google.common.util.concurrent.q qVarD = c8651kK.d(jSONObject, "attribution");
        final com.google.common.util.concurrent.q qVarH3 = this.f71678b.h(jSONObject, z50, c8733l60.f76589b.f76177b);
        if (((Boolean) Oc.A.c().a(C8784lf.f76949Pc)).booleanValue() && ((Integer) Optional.ofNullable(jSONObject.optJSONObject("video")).map(new Function() { // from class: com.google.android.gms.internal.ads.QJ
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
            C8651kK c8651kK2 = this.f71678b;
            C7270Rq c7270Rq = new C7270Rq();
            Mj0.r(qVarH3, new C8544jK(c8651kK2, c7270Rq), C7033Kq.f69019f);
            qVarH = c7270Rq;
        } else {
            qVarH = Mj0.h(new Bundle());
        }
        final com.google.common.util.concurrent.q qVar = qVarH;
        final com.google.common.util.concurrent.q qVarA = this.f71679c.a(jSONObject, "custom_assets");
        final C8651kK c8651kK3 = this.f71678b;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            qVarH2 = TextUtils.isEmpty(strOptString) ? Mj0.h(null) : Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.ZJ
                @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return c8651kK3.c(strOptString, obj);
                }
            }, C7033Kq.f69019f);
        } else {
            qVarH2 = Mj0.h(null);
        }
        final com.google.common.util.concurrent.q qVar2 = qVarH2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(qVarK0);
        arrayList.add(qVarF);
        arrayList.add(qVarG);
        arrayList.add(qVarE);
        arrayList.add(qVarE2);
        arrayList.add(qVarD);
        arrayList.add(qVarH3);
        arrayList.add(qVar);
        arrayList.add(qVarA);
        if (!((Boolean) Oc.A.c().a(C8784lf.f77249l5)).booleanValue() || c(jSONObject)) {
            arrayList.add(qVar2);
        }
        return Mj0.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.TJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VJ.b(qVarK0, qVarF, qVarE2, qVarE, qVarD, jSONObject, qVarH3, qVar, qVarG, qVar2, qVarA);
            }
        }, this.f71677a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final /* synthetic */ C10039xI b(com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2, com.google.common.util.concurrent.q qVar3, com.google.common.util.concurrent.q qVar4, com.google.common.util.concurrent.q qVar5, JSONObject jSONObject, com.google.common.util.concurrent.q qVar6, com.google.common.util.concurrent.q qVar7, com.google.common.util.concurrent.q qVar8, com.google.common.util.concurrent.q qVar9, com.google.common.util.concurrent.q qVar10) throws Exception {
        C10039xI c10039xI = (C10039xI) qVar.get();
        c10039xI.p((List) qVar2.get());
        c10039xI.m((InterfaceC7459Xg) qVar3.get());
        c10039xI.q((InterfaceC7459Xg) qVar4.get());
        c10039xI.j((InterfaceC7224Qg) qVar5.get());
        c10039xI.s(C8651kK.j(jSONObject));
        c10039xI.l(C8651kK.i(jSONObject));
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) qVar6.get();
        if (interfaceC9133ot != null) {
            c10039xI.E(interfaceC9133ot);
            c10039xI.D(interfaceC9133ot.zzF());
            c10039xI.C(interfaceC9133ot.zzq());
        }
        c10039xI.Q().putAll((Bundle) qVar7.get());
        InterfaceC9133ot interfaceC9133ot2 = (InterfaceC9133ot) qVar8.get();
        if (interfaceC9133ot2 != null) {
            c10039xI.o(interfaceC9133ot2);
            c10039xI.F(interfaceC9133ot2.zzF());
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77249l5)).booleanValue() && !c(jSONObject)) {
            c10039xI.u(qVar9);
            c10039xI.x(new C7270Rq());
        } else {
            InterfaceC9133ot interfaceC9133ot3 = (InterfaceC9133ot) qVar9.get();
            if (interfaceC9133ot3 != null) {
                c10039xI.t(interfaceC9133ot3);
            }
        }
        for (C9079oK c9079oK : (List) qVar10.get()) {
            if (c9079oK.f78198a != 1) {
                c10039xI.n(c9079oK.f78199b, c9079oK.f78201d);
            } else {
                c10039xI.z(c9079oK.f78199b, c9079oK.f78200c);
            }
        }
        return c10039xI;
    }
}
