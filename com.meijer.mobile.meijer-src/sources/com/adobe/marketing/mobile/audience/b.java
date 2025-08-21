package com.adobe.marketing.mobile.audience;

import R5.C5117d;
import R5.t;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.C6575i;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final C6574h f63192a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63193b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63194c;

    static b a(C5117d c5117d) {
        String strA = c5117d.a();
        if (strA != null && !strA.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(strA);
                return new b(C6575i.a(jSONObject.getJSONObject("event").toString()), jSONObject.has("url") ? jSONObject.getString("url") : null, jSONObject.has("timeoutSec") ? jSONObject.getInt("timeoutSec") : 2);
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

    C6574h b() {
        return this.f63192a;
    }

    int c() {
        return this.f63194c;
    }

    String d() {
        return this.f63193b;
    }

    C5117d e() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", new JSONObject(C6575i.b(this.f63192a)));
            jSONObject.put("url", this.f63193b);
            jSONObject.put("timeoutSec", this.f63194c);
            return new C5117d(this.f63192a.x(), new Date(this.f63192a.u()), jSONObject.toString());
        } catch (JSONException e10) {
            t.a("Audience", "AudienceDataEntity", "Failed to serialize AudienceDataEntity to DataEntity: " + e10.getLocalizedMessage(), new Object[0]);
            return null;
        }
    }

    b(C6574h c6574h, String str, int i10) throws IllegalArgumentException {
        if (c6574h != null) {
            this.f63192a = c6574h;
            this.f63193b = str;
            this.f63194c = i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
