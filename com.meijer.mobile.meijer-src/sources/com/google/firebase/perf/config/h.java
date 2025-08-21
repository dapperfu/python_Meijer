package com.google.firebase.perf.config;

/* loaded from: classes8.dex */
public final class h extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static h f89866a;

    public static synchronized h e() {
        try {
            if (f89866a == null) {
                f89866a = new h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89866a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_fg";
    }

    protected Long d() {
        return 700L;
    }

    private h() {
    }
}
