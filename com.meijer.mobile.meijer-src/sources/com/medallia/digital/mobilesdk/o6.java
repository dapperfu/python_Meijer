package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.f0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class o6 {

    /* renamed from: d, reason: collision with root package name */
    private static final int f93514d = 10;

    /* renamed from: e, reason: collision with root package name */
    private static final int f93515e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f93516f = 5000;

    /* renamed from: g, reason: collision with root package name */
    private static final long f93517g = 3600000;

    /* renamed from: a, reason: collision with root package name */
    private int f93518a;

    /* renamed from: b, reason: collision with root package name */
    private long f93519b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f93520c = b();

    protected interface a {
        void a(i6 i6Var);

        void a(k6 k6Var);
    }

    protected enum b {
        String,
        BYTES
    }

    protected o6(int i10) {
        this.f93518a = i10;
    }

    long a() {
        return this.f93519b;
    }

    ExecutorService b() {
        return Executors.newFixedThreadPool(Math.min(10, Math.max(2, Runtime.getRuntime().availableProcessors())));
    }

    int c() {
        return this.f93518a;
    }

    String a(String str, HashMap<String, String> map) {
        if (str == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (map != null && !map.isEmpty()) {
            sb2.append("?");
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb2.append(entry.getKey());
                    sb2.append("=");
                    sb2.append(entry.getValue());
                    if (i10 < map.size() - 1) {
                        sb2.append("&");
                    }
                }
                i10++;
            }
        }
        return sb2.toString();
    }

    protected void b(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i10, a aVar) {
        a(b.String, f0.d.POST, str, map2, map, jSONObject, i10, aVar);
    }

    protected void c(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i10, a aVar) {
        a(b.String, f0.d.PUT, str, map2, map, jSONObject, i10, aVar);
    }

    protected void a(int i10, long j10) {
        if (i10 > 1000) {
            this.f93518a = i10;
        }
        this.f93519b = j10;
    }

    private void a(b bVar, f0.d dVar, String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i10, a aVar) {
        new j6(this.f93520c, bVar, dVar, a(str, map2), map, jSONObject, i10, this.f93518a, aVar, this.f93519b);
    }

    private void a(b bVar, f0.d dVar, String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, String str2, int i10, a aVar) {
        new j6(this.f93520c, bVar, dVar, a(str, map2), map, jSONObject, str2, i10, this.f93518a, aVar, this.f93519b);
    }

    void a(String str, String str2, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i10, a aVar) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "delete":
                a(str2, map, map2, jSONObject, i10, aVar);
                break;
            case "get":
                a(str2, map, map2, i10, aVar);
                break;
            case "put":
                c(str2, map, map2, jSONObject, i10, aVar);
                break;
            case "post":
                b(str2, map, map2, jSONObject, i10, aVar);
                break;
            default:
                a4.c("Request type is undefined: " + str);
                break;
        }
    }

    protected void a(String str, HashMap<String, String> map, int i10, a aVar) {
        a(b.BYTES, f0.d.GET, str, map, null, null, i10, aVar);
    }

    protected void a(String str, HashMap<String, String> map, HashMap<String, String> map2, int i10, a aVar) {
        a(b.String, f0.d.GET, str, map2, map, null, i10, aVar);
    }

    protected void a(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i10, a aVar) {
        a(b.String, f0.d.DELETE, str, map2, map, jSONObject, i10, aVar);
    }

    protected void a(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, String str2, int i10, a aVar) {
        a(b.String, f0.d.PUT, str, map2, map, jSONObject, str2, i10, aVar);
    }
}
