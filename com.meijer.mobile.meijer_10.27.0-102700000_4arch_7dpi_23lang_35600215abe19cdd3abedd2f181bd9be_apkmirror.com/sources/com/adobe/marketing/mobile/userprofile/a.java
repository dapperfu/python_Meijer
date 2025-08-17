package com.adobe.marketing.mobile.userprofile;

import Q5.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class a {
    static Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    map.put(next, a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    t.b("UserProfile", "JSONUtils", "Profile Data doesn't support Array value.", new Object[0]);
                } else {
                    map.put(next, obj);
                }
            } catch (Exception e10) {
                t.b("UserProfile", "JSONUtils", "The value of [%s] is not supported: %s", next, e10);
            }
        }
        return map;
    }
}
