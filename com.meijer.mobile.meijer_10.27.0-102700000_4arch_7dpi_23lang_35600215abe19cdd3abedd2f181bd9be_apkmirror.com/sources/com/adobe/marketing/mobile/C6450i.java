package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.C6449h;
import f6.C13847c;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adobe.marketing.mobile.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6450i {
    public static C6449h a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strC = c(jSONObject, "name", null);
            String strC2 = c(jSONObject, "uuid", null);
            String strC3 = c(jSONObject, "source", null);
            String strC4 = c(jSONObject, "type", null);
            Map<String, Object> mapE = C13847c.e(jSONObject.optJSONObject("data"));
            long jOptLong = jSONObject.optLong("timestamp", 0L);
            String strC5 = c(jSONObject, "responseId", null);
            String strC6 = c(jSONObject, "parentId", null);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mask");
            return new C6449h.b(strC, strC4, strC3, jSONArrayOptJSONArray != null ? (String[]) C13847c.d(jSONArrayOptJSONArray).toArray(new String[0]) : null).h(strC2).g(jOptLong).d(mapE).f(strC5).e(strC6).a();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String b(C6449h c6449h) throws JSONException {
        if (c6449h == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", c6449h.q());
            jSONObject.put("type", c6449h.w());
            jSONObject.put("source", c6449h.t());
            jSONObject.put("uuid", c6449h.x());
            jSONObject.put("timestamp", c6449h.u());
            jSONObject.put("data", JSONObject.wrap(c6449h.o()));
            jSONObject.put("responseId", c6449h.s());
            jSONObject.put("parentId", c6449h.r());
            jSONObject.put("mask", JSONObject.wrap(c6449h.p()));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String c(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        }
    }
}
