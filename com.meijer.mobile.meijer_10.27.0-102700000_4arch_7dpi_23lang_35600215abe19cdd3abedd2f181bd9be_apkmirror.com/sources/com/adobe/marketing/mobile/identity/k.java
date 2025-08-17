package com.adobe.marketing.mobile.identity;

import Q5.C5072d;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.C6450i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f62514a;

    /* renamed from: b, reason: collision with root package name */
    private final C6449h f62515b;

    static k a(C5072d c5072d) {
        if (c5072d == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(c5072d.a());
            return new k(jSONObject.getString("URL"), C6450i.a(jSONObject.getString("EVENT")));
        } catch (JSONException unused) {
            return null;
        }
    }

    C6449h b() {
        return this.f62515b;
    }

    String c() {
        return this.f62514a;
    }

    C5072d d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("URL", this.f62514a);
            jSONObject.put("EVENT", C6450i.b(this.f62515b));
            return new C5072d(jSONObject.toString());
        } catch (JSONException unused) {
            return null;
        }
    }

    k(String str, C6449h c6449h) {
        this.f62514a = str;
        this.f62515b = c6449h;
    }
}
