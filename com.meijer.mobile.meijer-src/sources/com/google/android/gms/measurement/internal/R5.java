package com.google.android.gms.measurement.internal;

import com.medallia.digital.mobilesdk.l8;

/* loaded from: classes6.dex */
final class R5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f86042a;

    /* renamed from: b, reason: collision with root package name */
    private long f86043b;

    public final void b() {
        this.f86043b = 0L;
    }

    public final void a() {
        this.f86043b = this.f86042a.c();
    }

    public final boolean c(long j10) {
        return this.f86043b == 0 || this.f86042a.c() - this.f86043b >= l8.b.f93365c;
    }

    public R5(com.google.android.gms.common.util.f fVar) {
        com.google.android.gms.common.internal.r.l(fVar);
        this.f86042a = fVar;
    }
}
