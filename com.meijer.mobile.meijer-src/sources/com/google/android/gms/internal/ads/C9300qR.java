package com.google.android.gms.internal.ads;

import Oc.C4447y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9300qR implements InterfaceC7398Vk {
    C9300qR() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7398Vk
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        C9406rR c9406rR = (C9406rR) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) Oc.A.c().a(C8784lf.f77197h9)).booleanValue()) {
            jSONObject2.put("ad_request_url", c9406rR.f78866c.g());
            jSONObject2.put("ad_request_post_body", c9406rR.f78866c.f());
        }
        jSONObject2.put("base_url", c9406rR.f78866c.d());
        jSONObject2.put("signals", c9406rR.f78865b);
        jSONObject3.put("body", c9406rR.f78864a.f79897c);
        jSONObject3.put("headers", C4447y.b().l(c9406rR.f78864a.f79896b));
        jSONObject3.put("response_code", c9406rR.f78864a.f79895a);
        jSONObject3.put("latency", c9406rR.f78864a.f79898d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c9406rR.f78866c.i());
        return jSONObject;
    }
}
