package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import fg.i;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class t {

    /* renamed from: f, reason: collision with root package name */
    static final Date f90155f = new Date(-1);

    /* renamed from: g, reason: collision with root package name */
    static final Date f90156g = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f90157a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f90158b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f90159c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f90160d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f90161e = new Object();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f90162a;

        /* renamed from: b, reason: collision with root package name */
        private Date f90163b;

        Date a() {
            return this.f90163b;
        }

        int b() {
            return this.f90162a;
        }

        a(int i10, Date date) {
            this.f90162a = i10;
            this.f90163b = date;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f90164a;

        /* renamed from: b, reason: collision with root package name */
        private Date f90165b;

        Date a() {
            return this.f90165b;
        }

        int b() {
            return this.f90164a;
        }

        public b(int i10, Date date) {
            this.f90164a = i10;
            this.f90165b = date;
        }
    }

    void j() {
        l(0, f90156g);
    }

    void k() {
        p(0, f90156g);
    }

    a a() {
        a aVar;
        synchronized (this.f90159c) {
            aVar = new a(this.f90157a.getInt("num_failed_fetches", 0), new Date(this.f90157a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map<String, String> b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f90157a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long c() {
        return this.f90157a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public fg.h d() {
        v vVarA;
        synchronized (this.f90158b) {
            long j10 = this.f90157a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f90157a.getInt("last_fetch_status", 0);
            vVarA = v.b().c(i10).d(j10).b(new i.b().d(this.f90157a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f90157a.getLong("minimum_fetch_interval_in_seconds", m.f90088j)).c()).a();
        }
        return vVarA;
    }

    String e() {
        return this.f90157a.getString("last_fetch_etag", null);
    }

    Date f() {
        return new Date(this.f90157a.getLong("last_fetch_time_in_millis", -1L));
    }

    long g() {
        return this.f90157a.getLong("last_template_version", 0L);
    }

    public long h() {
        return this.f90157a.getLong("minimum_fetch_interval_in_seconds", m.f90088j);
    }

    public b i() {
        b bVar;
        synchronized (this.f90160d) {
            bVar = new b(this.f90157a.getInt("num_failed_realtime_streams", 0), new Date(this.f90157a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void l(int i10, Date date) {
        synchronized (this.f90159c) {
            this.f90157a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void m(String str) {
        synchronized (this.f90158b) {
            this.f90157a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void n(long j10) {
        synchronized (this.f90158b) {
            this.f90157a.edit().putLong("last_template_version", j10).apply();
        }
    }

    public void o(Date date) {
        synchronized (this.f90160d) {
            this.f90157a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void p(int i10, Date date) {
        synchronized (this.f90160d) {
            this.f90157a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void q() {
        synchronized (this.f90158b) {
            this.f90157a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void r(Date date) {
        synchronized (this.f90158b) {
            this.f90157a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void s() {
        synchronized (this.f90158b) {
            this.f90157a.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f90157a = sharedPreferences;
    }
}
