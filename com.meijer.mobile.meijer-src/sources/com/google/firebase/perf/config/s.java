package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class s extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static s f89877a;

    public static synchronized s e() {
        try {
            if (f89877a == null) {
                f89877a = new s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89877a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    protected Long d() {
        return 30L;
    }

    private s() {
    }
}
