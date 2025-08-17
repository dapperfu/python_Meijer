package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.android.volley.a$a, reason: collision with other inner class name */
    public static class C1240a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f62879a;

        /* renamed from: b, reason: collision with root package name */
        public String f62880b;

        /* renamed from: c, reason: collision with root package name */
        public long f62881c;

        /* renamed from: d, reason: collision with root package name */
        public long f62882d;

        /* renamed from: e, reason: collision with root package name */
        public long f62883e;

        /* renamed from: f, reason: collision with root package name */
        public long f62884f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f62885g = Collections.EMPTY_MAP;

        /* renamed from: h, reason: collision with root package name */
        public List<e> f62886h;

        boolean b(long j10) {
            return this.f62883e < j10;
        }

        boolean c(long j10) {
            return this.f62884f < j10;
        }

        public boolean a() {
            return b(System.currentTimeMillis());
        }
    }

    C1240a a(String str);

    void b();

    void c(String str, boolean z10);

    void d(String str, C1240a c1240a);
}
