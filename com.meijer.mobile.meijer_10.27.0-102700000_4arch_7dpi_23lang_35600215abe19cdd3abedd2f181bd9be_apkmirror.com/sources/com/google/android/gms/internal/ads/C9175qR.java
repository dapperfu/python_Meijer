package com.google.android.gms.internal.ads;

import Mc.C4169y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9175qR implements InterfaceC7273Vk {
    C9175qR() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7273Vk
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        C9281rR c9281rR = (C9281rR) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) Mc.A.c().a(C8659lf.f76357h9)).booleanValue()) {
            jSONObject2.put("ad_request_url", c9281rR.f78026c.g());
            jSONObject2.put("ad_request_post_body", c9281rR.f78026c.f());
        }
        jSONObject2.put("base_url", c9281rR.f78026c.d());
        jSONObject2.put("signals", c9281rR.f78025b);
        jSONObject3.put("body", c9281rR.f78024a.f79057c);
        jSONObject3.put("headers", C4169y.b().l(c9281rR.f78024a.f79056b));
        jSONObject3.put("response_code", c9281rR.f78024a.f79055a);
        jSONObject3.put("latency", c9281rR.f78024a.f79058d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c9281rR.f78026c.i());
        return jSONObject;
    }
}
