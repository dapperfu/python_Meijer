package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
class x5 {

    /* renamed from: a, reason: collision with root package name */
    private a f94337a;

    /* renamed from: b, reason: collision with root package name */
    private long f94338b;

    enum a {
        ONCE,
        FREQUENCY
    }

    x5() {
        this.f94337a = a.ONCE;
    }

    protected long a() {
        return this.f94338b;
    }

    protected a b() {
        if (this.f94337a == null) {
            this.f94337a = a.ONCE;
        }
        return this.f94337a;
    }

    x5(long j10) {
        this.f94338b = j10;
        this.f94337a = j10 == 0 ? a.ONCE : a.FREQUENCY;
    }

    protected void a(long j10) {
        this.f94338b = j10;
    }
}
