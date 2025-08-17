package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
class x5 {

    /* renamed from: a, reason: collision with root package name */
    private a f93498a;

    /* renamed from: b, reason: collision with root package name */
    private long f93499b;

    enum a {
        ONCE,
        FREQUENCY
    }

    x5() {
        this.f93498a = a.ONCE;
    }

    protected long a() {
        return this.f93499b;
    }

    protected a b() {
        if (this.f93498a == null) {
            this.f93498a = a.ONCE;
        }
        return this.f93498a;
    }

    x5(long j10) {
        this.f93499b = j10;
        this.f93498a = j10 == 0 ? a.ONCE : a.FREQUENCY;
    }

    protected void a(long j10) {
        this.f93499b = j10;
    }
}
