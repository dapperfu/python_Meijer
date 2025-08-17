package G9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00072\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u000f\"\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0017\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e*\u00020\f¢\u0006\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"LG9/h;", "", "<init>", "()V", "", "", "map", "Lorg/json/JSONObject;", "b", "(Ljava/util/Map;)Lorg/json/JSONObject;", "", "list", "Lorg/json/JSONArray;", "a", "(Ljava/util/List;)Lorg/json/JSONArray;", "", "jsonObjects", "c", "([Lorg/json/JSONObject;)Lorg/json/JSONObject;", "jsonObject", "d", "(Lorg/json/JSONObject;)Ljava/util/Map;", "g", "jsonArray", "f", "(Lorg/json/JSONArray;)Ljava/util/List;", "e", "", "i", "([Lorg/json/JSONObject;)V", "", "h", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11292a = new h();

    private final void i(JSONObject[] jsonObjects) {
        if (jsonObjects.length == 0) {
            throw new IllegalArgumentException("Argument must not be empty array!");
        }
        int i10 = 0;
        for (JSONObject jSONObject : jsonObjects) {
            if (jSONObject == null) {
                i10++;
            }
        }
        if (i10 == jsonObjects.length) {
            throw new IllegalArgumentException("Argument must contain at least one not null element!");
        }
    }

    @JvmStatic
    public static final JSONArray a(List<? extends Object> list) {
        Intrinsics.j(list, "list");
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof List) {
                jSONArray.put(a((List) obj));
            } else if (obj instanceof Map) {
                if (obj == null) {
                    obj = null;
                }
                Map map = (Map) obj;
                if (map != null) {
                    jSONArray.put(b(map));
                }
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    @JvmStatic
    public static final JSONObject b(Map<String, ? extends Object> map) throws JSONException {
        Intrinsics.j(map, "map");
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    jSONObject.put(key, b((Map) value));
                } else if (value instanceof List) {
                    Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                    jSONObject.put(key, a((List) value));
                } else {
                    jSONObject.put(key, value);
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @JvmStatic
    public static final JSONObject c(JSONObject... jsonObjects) throws JSONException {
        Iterator<String> itKeys;
        Sequence<String> sequenceH;
        Intrinsics.j(jsonObjects, "jsonObjects");
        f11292a.i((JSONObject[]) Arrays.copyOf(jsonObjects, jsonObjects.length));
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jsonObjects) {
            if (jSONObject2 != null && (itKeys = jSONObject2.keys()) != null && (sequenceH = SequencesKt.h(itKeys)) != null) {
                for (String str : sequenceH) {
                    try {
                        jSONObject.put(str, jSONObject2.get(str));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    @JvmStatic
    public static final Map<String, String> d(JSONObject jsonObject) throws JSONException {
        Intrinsics.j(jsonObject, "jsonObject");
        Iterator<String> itKeys = jsonObject.keys();
        Intrinsics.i(itKeys, "keys(...)");
        Sequence sequenceH = SequencesKt.h(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = sequenceH.iterator();
        while (true) {
            String strB = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            try {
                String string = jsonObject.getString(str);
                Intrinsics.i(string, "getString(...)");
                strB = i.b(string);
            } catch (JSONException unused) {
            }
            linkedHashMap.put(str, strB);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getValue();
            Pair pairA = str2 != null ? TuplesKt.a(entry.getKey(), str2) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return MapsKt.y(arrayList);
    }

    @JvmStatic
    public static final Map<String, String> e(JSONObject jsonObject) throws JSONException {
        String strB;
        Intrinsics.j(jsonObject, "jsonObject");
        Iterator<String> itKeys = jsonObject.keys();
        Intrinsics.i(itKeys, "keys(...)");
        Sequence<String> sequenceH = SequencesKt.h(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : sequenceH) {
            Intrinsics.g(str);
            try {
                String string = jsonObject.getString(str);
                Intrinsics.i(string, "getString(...)");
                strB = i.b(string);
            } catch (JSONException unused) {
                strB = null;
            }
            linkedHashMap.put(str, strB);
        }
        return linkedHashMap;
    }

    @JvmStatic
    public static final List<Object> f(JSONArray jsonArray) throws JSONException {
        Intrinsics.j(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jsonArray.get(i10);
            if (obj instanceof JSONObject) {
                arrayList.add(g((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(f((JSONArray) obj));
            } else {
                Intrinsics.g(obj);
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @JvmStatic
    public static final Map<String, Object> g(JSONObject jsonObject) throws JSONException {
        Intrinsics.j(jsonObject, "jsonObject");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jsonObject.keys();
        Intrinsics.i(itKeys, "keys(...)");
        for (String str : SequencesKt.h(itKeys)) {
            Object obj = jsonObject.get(str);
            if (obj instanceof JSONObject) {
                linkedHashMap.put(str, g((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                linkedHashMap.put(str, f((JSONArray) obj));
            } else {
                linkedHashMap.put(str, obj);
            }
        }
        return linkedHashMap;
    }

    public final List<JSONObject> h(JSONArray jSONArray) {
        Intrinsics.j(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getJSONObject(i10));
        }
        return arrayList;
    }

    private h() {
    }
}
