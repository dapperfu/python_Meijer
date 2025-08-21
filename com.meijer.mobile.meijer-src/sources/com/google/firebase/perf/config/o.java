package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class o extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static o f89873a;

    public static synchronized o e() {
        try {
            if (f89873a == null) {
                f89873a = new o();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89873a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_max_length_minutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_max_duration_min";
    }

    protected Long d() {
        return 240L;
    }

    private o() {
    }
}
