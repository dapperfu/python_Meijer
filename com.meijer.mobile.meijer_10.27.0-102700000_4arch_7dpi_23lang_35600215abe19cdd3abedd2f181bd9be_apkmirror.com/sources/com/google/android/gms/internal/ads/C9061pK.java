package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9061pK {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f77556a;

    /* renamed from: b, reason: collision with root package name */
    private final C8526kK f77557b;

    public C9061pK(Executor executor, C8526kK c8526kK) {
        this.f77556a = executor;
        this.f77557b = c8526kK;
    }

    public final com.google.common.util.concurrent.q a(JSONObject jSONObject, String str) {
        com.google.common.util.concurrent.q qVarH;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return Mj0.h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                qVarH = Mj0.h(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    qVarH = Mj0.h(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    qVarH = "string".equals(strOptString2) ? Mj0.h(new C8954oK(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? Mj0.m(this.f77557b.e(jSONObjectOptJSONObject, "image_value"), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.mK
                        @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                        public final Object apply(Object obj) {
                            return new C8954oK(strOptString, (BinderC6896Kg) obj);
                        }
                    }, this.f77556a) : Mj0.h(null);
                }
            }
            arrayList.add(qVarH);
        }
        return Mj0.m(Mj0.d(arrayList), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.nK
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (C8954oK c8954oK : (List) obj) {
                    if (c8954oK != null) {
                        arrayList2.add(c8954oK);
                    }
                }
                return arrayList2;
            }
        }, this.f77556a);
    }
}
