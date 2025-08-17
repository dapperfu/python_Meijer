package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    private static final Date f89219h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f89220a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f89221b;

    /* renamed from: c, reason: collision with root package name */
    private Date f89222c;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f89223d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f89224e;

    /* renamed from: f, reason: collision with root package name */
    private long f89225f;

    /* renamed from: g, reason: collision with root package name */
    private JSONArray f89226g;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f89227a;

        /* renamed from: b, reason: collision with root package name */
        private Date f89228b;

        /* renamed from: c, reason: collision with root package name */
        private JSONArray f89229c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f89230d;

        /* renamed from: e, reason: collision with root package name */
        private long f89231e;

        /* renamed from: f, reason: collision with root package name */
        private JSONArray f89232f;

        private b() {
            this.f89227a = new JSONObject();
            this.f89228b = g.f89219h;
            this.f89229c = new JSONArray();
            this.f89230d = new JSONObject();
            this.f89231e = 0L;
            this.f89232f = new JSONArray();
        }

        public g a() throws JSONException {
            return new g(this.f89227a, this.f89228b, this.f89229c, this.f89230d, this.f89231e, this.f89232f);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f89227a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f89229c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f89228b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f89230d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b f(JSONArray jSONArray) {
            try {
                this.f89232f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j10) {
            this.f89231e = j10;
            return this;
        }
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f89221b = jSONObject;
        this.f89222c = date;
        this.f89223d = jSONArray;
        this.f89224e = jSONObject2;
        this.f89225f = j10;
        this.f89226g = jSONArray2;
        this.f89220a = jSONObject3;
    }

    static g b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map<String, Map<String, String>> c() throws JSONException {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < j().length(); i10++) {
            JSONObject jSONObject = j().getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static g d(JSONObject jSONObject) throws JSONException {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.f89223d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f89220a.toString().equals(((g) obj).toString());
        }
        return false;
    }

    public Set<String> f(g gVar) throws JSONException {
        JSONObject jSONObjectG = d(gVar.f89220a).g();
        Map<String, Map<String, String>> mapC = c();
        Map<String, Map<String, String>> mapC2 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!gVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(gVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !gVar.i().has(next)) || (!i().has(next) && gVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !mapC.get(next).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectG.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f89221b;
    }

    public Date h() {
        return this.f89222c;
    }

    public int hashCode() {
        return this.f89220a.hashCode();
    }

    public JSONObject i() {
        return this.f89224e;
    }

    public JSONArray j() {
        return this.f89226g;
    }

    public long k() {
        return this.f89225f;
    }

    public String toString() {
        return this.f89220a.toString();
    }
}
