package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class p extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static p f89874a;

    public static synchronized p e() {
        try {
            if (f89874a == null) {
                f89874a = new p();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89874a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    protected Long d() {
        return 0L;
    }

    private p() {
    }
}
