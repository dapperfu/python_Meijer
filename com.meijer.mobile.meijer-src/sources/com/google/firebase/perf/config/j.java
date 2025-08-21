package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class j extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static j f89868a;

    public static synchronized j e() {
        try {
            if (f89868a == null) {
                f89868a = new j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89868a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_time_limit_sec";
    }

    protected Long d() {
        return 600L;
    }

    private j() {
    }
}
