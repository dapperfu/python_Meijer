package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class n extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static n f89872a;

    public static synchronized n f() {
        try {
            if (f89872a == null) {
                f89872a = new n();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89872a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    protected Long d() {
        return 100L;
    }

    private n() {
    }

    protected Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
