package com.adobe.marketing.mobile.audience;

import Q5.C5072d;
import Q5.t;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.C6450i;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final C6449h f62353a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62354b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62355c;

    static b a(C5072d c5072d) {
        String strA = c5072d.a();
        if (strA != null && !strA.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(strA);
                return new b(C6450i.a(jSONObject.getJSONObject("event").toString()), jSONObject.has("url") ? jSONObject.getString("url") : null, jSONObject.has("timeoutSec") ? jSONObject.getInt("timeoutSec") : 2);
            } catch (IllegalArgumentException e10) {
                e = e10;
                t.a("Audience", "AudienceDataEntity", "Failed to deserialize DataEntity to AudienceDataEntity: " + e.getLocalizedMessage(), new Object[0]);
                return null;
            } catch (JSONException e11) {
                e = e11;
                t.a("Audience", "AudienceDataEntity", "Failed to deserialize DataEntity to AudienceDataEntity: " + e.getLocalizedMessage(), new Object[0]);
                return null;
            }
        }
        return null;
    }

    C6449h b() {
        return this.f62353a;
    }

    int c() {
        return this.f62355c;
    }

    String d() {
        return this.f62354b;
    }

    C5072d e() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", new JSONObject(C6450i.b(this.f62353a)));
            jSONObject.put("url", this.f62354b);
            jSONObject.put("timeoutSec", this.f62355c);
            return new C5072d(this.f62353a.x(), new Date(this.f62353a.u()), jSONObject.toString());
        } catch (JSONException e10) {
            t.a("Audience", "AudienceDataEntity", "Failed to serialize AudienceDataEntity to DataEntity: " + e10.getLocalizedMessage(), new Object[0]);
            return null;
        }
    }

    b(C6449h c6449h, String str, int i10) throws IllegalArgumentException {
        if (c6449h != null) {
            this.f62353a = c6449h;
            this.f62354b = str;
            this.f62355c = i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
