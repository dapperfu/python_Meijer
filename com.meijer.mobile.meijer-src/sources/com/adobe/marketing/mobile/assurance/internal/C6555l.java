package com.adobe.marketing.mobile.assurance.internal;

import g6.C14330c;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6555l {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicInteger f63113h = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    final String f63114a;

    /* renamed from: b, reason: collision with root package name */
    final String f63115b;

    /* renamed from: c, reason: collision with root package name */
    final String f63116c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, Object> f63117d;

    /* renamed from: e, reason: collision with root package name */
    final Map<String, Object> f63118e;

    /* renamed from: f, reason: collision with root package name */
    final long f63119f;

    /* renamed from: g, reason: collision with root package name */
    final int f63120g;

    C6555l(String str, Map<String, Object> map) {
        this("com.adobe.griffon.mobile", str, null, map, System.currentTimeMillis());
    }

    HashMap<String, Object> a() {
        Map<String, Object> map;
        if ("control".equals(this.f63116c) && (map = this.f63118e) != null && !map.isEmpty() && this.f63118e.containsKey("detail") && (this.f63118e.get("detail") instanceof HashMap)) {
            return (HashMap) this.f63118e.get("detail");
        }
        return null;
    }

    String b() {
        Map<String, Object> map;
        if ("control".equals(this.f63116c) && (map = this.f63118e) != null && !map.isEmpty() && this.f63118e.containsKey("type") && (this.f63118e.get("type") instanceof String)) {
            return (String) this.f63118e.get("type");
        }
        return null;
    }

    String c() {
        return this.f63116c;
    }

    String d() {
        HashMap map = new HashMap();
        map.put("eventID", this.f63114a);
        map.put("vendor", this.f63115b);
        map.put("type", this.f63116c);
        map.put("timestamp", Long.valueOf(this.f63119f));
        map.put("eventNumber", Integer.valueOf(this.f63120g));
        Map<String, Object> map2 = this.f63117d;
        if (map2 != null) {
            map.put("metadata", map2);
        }
        Map<String, Object> map3 = this.f63118e;
        if (map3 != null) {
            map.put("payload", map3);
        }
        return new JSONObject(map).toString();
    }

    Map<String, Object> e() {
        return this.f63118e;
    }

    String f() {
        return this.f63115b;
    }

    C6555l(String str, String str2, Map<String, Object> map, Map<String, Object> map2, long j10) {
        this(UUID.randomUUID().toString(), str, str2, map, map2, j10, f63113h.addAndGet(1));
    }

    private C6555l(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, long j10, int i10) {
        this.f63114a = str;
        this.f63115b = str2;
        this.f63116c = str3;
        this.f63117d = map;
        this.f63118e = map2;
        this.f63119f = j10;
        this.f63120g = i10;
    }

    C6555l(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f63114a = jSONObject.getString("eventID");
        this.f63115b = jSONObject.getString("vendor");
        this.f63116c = jSONObject.getString("type");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metadata");
        if (jSONObjectOptJSONObject != null) {
            this.f63117d = C14330c.e(jSONObjectOptJSONObject);
        } else {
            this.f63117d = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("payload");
        if (jSONObjectOptJSONObject2 != null) {
            this.f63118e = C14330c.e(jSONObjectOptJSONObject2);
        } else {
            this.f63118e = null;
        }
        this.f63119f = jSONObject.optLong("timestamp", System.currentTimeMillis());
        this.f63120g = jSONObject.optInt("eventNumber", f63113h.addAndGet(1));
    }
}
