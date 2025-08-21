package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class g extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static g f89865a;

    public static synchronized g e() {
        try {
            if (f89865a == null) {
                f89865a = new g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89865a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_bg";
    }

    protected Long d() {
        return 70L;
    }

    private g() {
    }
}
