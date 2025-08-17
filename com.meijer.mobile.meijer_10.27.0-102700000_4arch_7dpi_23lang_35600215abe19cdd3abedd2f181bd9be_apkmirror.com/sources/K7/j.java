package K7;

import M7.JsonAttribute;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lorg/json/JSONArray;", "b", "(Lorg/json/JSONArray;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "c", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "value", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "LM7/c;", "jsonAttribute", "f", "(Lorg/json/JSONObject;LM7/c;)Lorg/json/JSONObject;", "", "key", "", "d", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "namespace", "e", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {
    public static final Object a(Object value) {
        Intrinsics.j(value, "value");
        return value instanceof JSONArray ? b((JSONArray) value) : value instanceof JSONObject ? c((JSONObject) value) : value;
    }

    public static final JSONArray b(JSONArray jSONArray) throws JSONException {
        Intrinsics.j(jSONArray, "<this>");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            Intrinsics.i(obj, "get(...)");
            jSONArray2.put(a(obj));
        }
        return jSONArray2;
    }

    public static final JSONObject c(JSONObject jSONObject) throws JSONException {
        Intrinsics.j(jSONObject, "<this>");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.i(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            Intrinsics.i(obj, "get(...)");
            jSONObject2.put(next, a(obj));
        }
        return jSONObject2;
    }

    public static final boolean d(JSONObject jSONObject, String key) throws JSONException {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(key, "key");
        try {
            if (jSONObject.has(key)) {
                Object obj = jSONObject.get(key);
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public static final boolean e(JSONObject jSONObject, String namespace) {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(namespace, "namespace");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.i(itKeys, "keys(...)");
        for (String str : SequencesKt.h(itKeys)) {
            Intrinsics.g(str);
            if (StringsKt.W(str, namespace, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static final JSONObject f(JSONObject jSONObject, JsonAttribute jsonAttribute) throws JSONException {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        JSONObject jSONObjectPut = jSONObject.put(jsonAttribute.getKey(), jsonAttribute.getValue());
        Intrinsics.i(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }
}
