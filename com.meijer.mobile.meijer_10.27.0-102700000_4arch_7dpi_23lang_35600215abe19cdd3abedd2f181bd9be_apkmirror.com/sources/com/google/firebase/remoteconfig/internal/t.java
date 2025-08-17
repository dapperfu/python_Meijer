package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import dg.i;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class t {

    /* renamed from: f, reason: collision with root package name */
    static final Date f89313f = new Date(-1);

    /* renamed from: g, reason: collision with root package name */
    static final Date f89314g = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f89315a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f89316b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f89317c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f89318d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f89319e = new Object();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f89320a;

        /* renamed from: b, reason: collision with root package name */
        private Date f89321b;

        Date a() {
            return this.f89321b;
        }

        int b() {
            return this.f89320a;
        }

        a(int i10, Date date) {
            this.f89320a = i10;
            this.f89321b = date;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f89322a;

        /* renamed from: b, reason: collision with root package name */
        private Date f89323b;

        Date a() {
            return this.f89323b;
        }

        int b() {
            return this.f89322a;
        }

        public b(int i10, Date date) {
            this.f89322a = i10;
            this.f89323b = date;
        }
    }

    void j() {
        l(0, f89314g);
    }

    void k() {
        p(0, f89314g);
    }

    a a() {
        a aVar;
        synchronized (this.f89317c) {
            aVar = new a(this.f89315a.getInt("num_failed_fetches", 0), new Date(this.f89315a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map<String, String> b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f89315a.getString("customSignals", "{}"));
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
        return this.f89315a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public dg.h d() {
        v vVarA;
        synchronized (this.f89316b) {
            long j10 = this.f89315a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f89315a.getInt("last_fetch_status", 0);
            vVarA = v.b().c(i10).d(j10).b(new i.b().d(this.f89315a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f89315a.getLong("minimum_fetch_interval_in_seconds", m.f89246j)).c()).a();
        }
        return vVarA;
    }

    String e() {
        return this.f89315a.getString("last_fetch_etag", null);
    }

    Date f() {
        return new Date(this.f89315a.getLong("last_fetch_time_in_millis", -1L));
    }

    long g() {
        return this.f89315a.getLong("last_template_version", 0L);
    }

    public long h() {
        return this.f89315a.getLong("minimum_fetch_interval_in_seconds", m.f89246j);
    }

    public b i() {
        b bVar;
        synchronized (this.f89318d) {
            bVar = new b(this.f89315a.getInt("num_failed_realtime_streams", 0), new Date(this.f89315a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void l(int i10, Date date) {
        synchronized (this.f89317c) {
            this.f89315a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void m(String str) {
        synchronized (this.f89316b) {
            this.f89315a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void n(long j10) {
        synchronized (this.f89316b) {
            this.f89315a.edit().putLong("last_template_version", j10).apply();
        }
    }

    public void o(Date date) {
        synchronized (this.f89318d) {
            this.f89315a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void p(int i10, Date date) {
        synchronized (this.f89318d) {
            this.f89315a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void q() {
        synchronized (this.f89316b) {
            this.f89315a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void r(Date date) {
        synchronized (this.f89316b) {
            this.f89315a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void s() {
        synchronized (this.f89316b) {
            this.f89315a.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f89315a = sharedPreferences;
    }
}
