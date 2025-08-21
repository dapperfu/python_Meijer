package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.android.volley.a$a, reason: collision with other inner class name */
    public static class C1250a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f63718a;

        /* renamed from: b, reason: collision with root package name */
        public String f63719b;

        /* renamed from: c, reason: collision with root package name */
        public long f63720c;

        /* renamed from: d, reason: collision with root package name */
        public long f63721d;

        /* renamed from: e, reason: collision with root package name */
        public long f63722e;

        /* renamed from: f, reason: collision with root package name */
        public long f63723f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f63724g = Collections.EMPTY_MAP;

        /* renamed from: h, reason: collision with root package name */
        public List<e> f63725h;

        boolean b(long j10) {
            return this.f63722e < j10;
        }

        boolean c(long j10) {
            return this.f63723f < j10;
        }

        public boolean a() {
            return b(System.currentTimeMillis());
        }
    }

    C1250a a(String str);

    void b();

    void c(String str, boolean z10);

    void d(String str, C1250a c1250a);
}
