package com.adobe.marketing.mobile.identity;

import R5.C5117d;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.C6575i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f63353a;

    /* renamed from: b, reason: collision with root package name */
    private final C6574h f63354b;

    static k a(C5117d c5117d) {
        if (c5117d == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(c5117d.a());
            return new k(jSONObject.getString("URL"), C6575i.a(jSONObject.getString("EVENT")));
        } catch (JSONException unused) {
            return null;
        }
    }

    C6574h b() {
        return this.f63354b;
    }

    String c() {
        return this.f63353a;
    }

    C5117d d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("URL", this.f63353a);
            jSONObject.put("EVENT", C6575i.b(this.f63354b));
            return new C5117d(jSONObject.toString());
        } catch (JSONException unused) {
            return null;
        }
    }

    k(String str, C6574h c6574h) {
        this.f63353a = str;
        this.f63354b = c6574h;
    }
}
