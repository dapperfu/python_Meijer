package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class t extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static t f89878a;

    public static synchronized t e() {
        try {
            if (f89878a == null) {
                f89878a = new t();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89878a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    protected Long d() {
        return 300L;
    }

    private t() {
    }
}
