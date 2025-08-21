package g6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14330c {
    private static Object a(Object obj) throws JSONException {
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? e((JSONObject) obj) : obj instanceof JSONArray ? d((JSONArray) obj) : obj;
    }

    public static boolean b(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean c(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static List<Object> d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public static Map<String, Object> e(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }
}
