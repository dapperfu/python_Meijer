package com.google.firebase.perf.config;

/* loaded from: classes7.dex */
public final class h extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static h f89024a;

    public static synchronized h e() {
        try {
            if (f89024a == null) {
                f89024a = new h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89024a;
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
