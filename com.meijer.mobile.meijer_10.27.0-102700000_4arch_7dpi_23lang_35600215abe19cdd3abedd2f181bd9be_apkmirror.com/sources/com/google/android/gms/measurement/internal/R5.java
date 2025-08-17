package com.google.android.gms.measurement.internal;

import com.medallia.digital.mobilesdk.l8;

/* loaded from: classes6.dex */
final class R5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f85202a;

    /* renamed from: b, reason: collision with root package name */
    private long f85203b;

    public final void b() {
        this.f85203b = 0L;
    }

    public final void a() {
        this.f85203b = this.f85202a.c();
    }

    public final boolean c(long j10) {
        return this.f85203b == 0 || this.f85202a.c() - this.f85203b >= l8.b.f92526c;
    }

    public R5(com.google.android.gms.common.util.f fVar) {
        com.google.android.gms.common.internal.r.l(fVar);
        this.f85202a = fVar;
    }
}
