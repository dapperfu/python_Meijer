package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9186pK {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f78396a;

    /* renamed from: b, reason: collision with root package name */
    private final C8651kK f78397b;

    public C9186pK(Executor executor, C8651kK c8651kK) {
        this.f78396a = executor;
        this.f78397b = c8651kK;
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
                    qVarH = "string".equals(strOptString2) ? Mj0.h(new C9079oK(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? Mj0.m(this.f78397b.e(jSONObjectOptJSONObject, "image_value"), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.mK
                        @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                        public final Object apply(Object obj) {
                            return new C9079oK(strOptString, (BinderC7021Kg) obj);
                        }
                    }, this.f78396a) : Mj0.h(null);
                }
            }
            arrayList.add(qVarH);
        }
        return Mj0.m(Mj0.d(arrayList), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.nK
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (C9079oK c9079oK : (List) obj) {
                    if (c9079oK != null) {
                        arrayList2.add(c9079oK);
                    }
                }
                return arrayList2;
            }
        }, this.f78396a);
    }
}
