package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class f extends v<String> {

    /* renamed from: a, reason: collision with root package name */
    private static f f89863a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Long, String> f89864b = Collections.unmodifiableMap(new a());

    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    public static synchronized f e() {
        try {
            if (f89863a == null) {
                f89863a = new f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89863a;
    }

    protected static String f(long j10) {
        return f89864b.get(Long.valueOf(j10));
    }

    protected static boolean g(long j10) {
        return f89864b.containsKey(Long.valueOf(j10));
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_log_source";
    }

    protected String d() {
        return BuildConfig.TRANSPORT_LOG_SRC;
    }

    private f() {
    }
}
