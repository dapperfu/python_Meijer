package com.adobe.marketing.mobile.assurance.internal;

import f6.C13847c;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6430l {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicInteger f62274h = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    final String f62275a;

    /* renamed from: b, reason: collision with root package name */
    final String f62276b;

    /* renamed from: c, reason: collision with root package name */
    final String f62277c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, Object> f62278d;

    /* renamed from: e, reason: collision with root package name */
    final Map<String, Object> f62279e;

    /* renamed from: f, reason: collision with root package name */
    final long f62280f;

    /* renamed from: g, reason: collision with root package name */
    final int f62281g;

    C6430l(String str, Map<String, Object> map) {
        this("com.adobe.griffon.mobile", str, null, map, System.currentTimeMillis());
    }

    HashMap<String, Object> a() {
        Map<String, Object> map;
        if ("control".equals(this.f62277c) && (map = this.f62279e) != null && !map.isEmpty() && this.f62279e.containsKey("detail") && (this.f62279e.get("detail") instanceof HashMap)) {
            return (HashMap) this.f62279e.get("detail");
        }
        return null;
    }

    String b() {
        Map<String, Object> map;
        if ("control".equals(this.f62277c) && (map = this.f62279e) != null && !map.isEmpty() && this.f62279e.containsKey("type") && (this.f62279e.get("type") instanceof String)) {
            return (String) this.f62279e.get("type");
        }
        return null;
    }

    String c() {
        return this.f62277c;
    }

    String d() {
        HashMap map = new HashMap();
        map.put("eventID", this.f62275a);
        map.put("vendor", this.f62276b);
        map.put("type", this.f62277c);
        map.put("timestamp", Long.valueOf(this.f62280f));
        map.put("eventNumber", Integer.valueOf(this.f62281g));
        Map<String, Object> map2 = this.f62278d;
        if (map2 != null) {
            map.put("metadata", map2);
        }
        Map<String, Object> map3 = this.f62279e;
        if (map3 != null) {
            map.put("payload", map3);
        }
        return new JSONObject(map).toString();
    }

    Map<String, Object> e() {
        return this.f62279e;
    }

    String f() {
        return this.f62276b;
    }

    C6430l(String str, String str2, Map<String, Object> map, Map<String, Object> map2, long j10) {
        this(UUID.randomUUID().toString(), str, str2, map, map2, j10, f62274h.addAndGet(1));
    }

    private C6430l(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, long j10, int i10) {
        this.f62275a = str;
        this.f62276b = str2;
        this.f62277c = str3;
        this.f62278d = map;
        this.f62279e = map2;
        this.f62280f = j10;
        this.f62281g = i10;
    }

    C6430l(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f62275a = jSONObject.getString("eventID");
        this.f62276b = jSONObject.getString("vendor");
        this.f62277c = jSONObject.getString("type");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metadata");
        if (jSONObjectOptJSONObject != null) {
            this.f62278d = C13847c.e(jSONObjectOptJSONObject);
        } else {
            this.f62278d = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("payload");
        if (jSONObjectOptJSONObject2 != null) {
            this.f62279e = C13847c.e(jSONObjectOptJSONObject2);
        } else {
            this.f62279e = null;
        }
        this.f62280f = jSONObject.optLong("timestamp", System.currentTimeMillis());
        this.f62281g = jSONObject.optInt("eventNumber", f62274h.addAndGet(1));
    }
}
