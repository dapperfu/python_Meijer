package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class q extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static q f89875a;

    public static synchronized q f() {
        try {
            if (f89875a == null) {
                f89875a = new q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89875a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    protected Long d() {
        return 100L;
    }

    private q() {
    }

    protected Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
