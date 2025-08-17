package com.scandit.datacapture.core.internal.sdk.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "json", "", "objectFromJson", "(Ljava/lang/String;)Ljava/lang/Object;", "obj", "jsonFromObject", "(Ljava/lang/Object;)Ljava/lang/String;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
@JvmName
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class JsonUtils {
    private static final Object a(Object obj) throws JSONException {
        if (obj == null) {
            Object NULL = JSONObject.NULL;
            Intrinsics.i(NULL, "NULL");
            return NULL;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key == null) {
                    throw new JSONException("Maps with null keys cannot be serialized to json");
                }
                if (!(key instanceof String)) {
                    throw new JSONException("Maps with keys of type " + key.getClass().getSimpleName() + " cannot be serialized to json");
                }
                jSONObject.put((String) key, a(value));
            }
            return jSONObject;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(a(it.next()));
            }
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                jSONArray2.put(a(obj2));
            }
            return jSONArray2;
        }
        if (obj instanceof String ? true : obj instanceof Boolean ? true : obj instanceof Integer ? true : obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                throw new JSONException("JSON prohibits infinities or NaNs");
            }
            return Double.valueOf(dDoubleValue);
        }
        if (!(obj instanceof Float)) {
            throw new JSONException(obj.getClass().getSimpleName().concat(" cannot be serialized to json"));
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue)) {
            throw new JSONException("JSON prohibits infinities or NaNs");
        }
        return Double.valueOf(fFloatValue);
    }

    private static final Object b(Object obj) throws JSONException {
        if (Intrinsics.e(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.i(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.g(next);
                Object obj2 = jSONObject.get(next);
                Intrinsics.i(obj2, "get(...)");
                linkedHashMap.put(next, b(obj2));
            }
            return linkedHashMap;
        }
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof String ? true : obj instanceof Boolean ? true : obj instanceof Integer ? true : obj instanceof Double) {
                return obj;
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Number) obj).floatValue());
            }
            throw new JSONException(obj.getClass().getSimpleName().concat(" is not a json type"));
        }
        JSONArray jSONArray = (JSONArray) obj;
        Object[] objArr = new Object[jSONArray.length()];
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj3 = jSONArray.get(i10);
            Intrinsics.i(obj3, "get(...)");
            objArr[i10] = b(obj3);
        }
        return objArr;
    }

    public static final String jsonFromObject(Object obj) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL.toString();
        }
        if (obj instanceof Map) {
            Object objA = a(obj);
            Intrinsics.h(objA, "null cannot be cast to non-null type org.json.JSONObject");
            String string = ((JSONObject) objA).toString(0);
            Intrinsics.i(string, "toString(...)");
            return string;
        }
        if (obj instanceof Collection) {
            Object objA2 = a(obj);
            Intrinsics.h(objA2, "null cannot be cast to non-null type org.json.JSONArray");
            String string2 = ((JSONArray) objA2).toString(0);
            Intrinsics.i(string2, "toString(...)");
            return string2;
        }
        if (obj instanceof Object[]) {
            Object objA3 = a(obj);
            Intrinsics.h(objA3, "null cannot be cast to non-null type org.json.JSONArray");
            String string3 = ((JSONArray) objA3).toString(0);
            Intrinsics.i(string3, "toString(...)");
            return string3;
        }
        if (obj instanceof String ? true : obj instanceof Boolean ? true : obj instanceof Integer) {
            return obj.toString();
        }
        if (obj instanceof Double) {
            Number number = (Number) obj;
            if (Double.isInfinite(number.doubleValue()) || Double.isNaN(number.doubleValue())) {
                throw new JSONException("JSON prohibits infinities or NaNs");
            }
            return String.valueOf(number.doubleValue());
        }
        if (!(obj instanceof Float)) {
            throw new JSONException(obj.getClass().getSimpleName().concat(" cannot be serialized to json"));
        }
        Number number2 = (Number) obj;
        if (Float.isInfinite(number2.floatValue()) || Float.isNaN(number2.floatValue())) {
            throw new JSONException("JSON prohibits infinities or NaNs");
        }
        return String.valueOf(number2.floatValue());
    }

    public static final Object objectFromJson(String json) throws JSONException {
        Intrinsics.j(json, "json");
        try {
            Object objB = b(new JSONArray("[" + json + ']'));
            Intrinsics.h(objB, "null cannot be cast to non-null type kotlin.Array<*>");
            return ((Object[]) objB)[0];
        } catch (Exception unused) {
            throw new JSONException("JSON Parsing failed due to unknown reason");
        }
    }
}
