package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.dD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7769dD0 {

    /* renamed from: a, reason: collision with root package name */
    private Exception f73377a;

    /* renamed from: b, reason: collision with root package name */
    private long f73378b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private long f73379c = -9223372036854775807L;

    public final void a() {
        this.f73377a = null;
        this.f73378b = -9223372036854775807L;
        this.f73379c = -9223372036854775807L;
    }

    public final boolean c() {
        if (this.f73377a == null) {
            return false;
        }
        return C8408jD0.y() || SystemClock.elapsedRealtime() < this.f73379c;
    }

    public final void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f73377a == null) {
            this.f73377a = exc;
        }
        if (this.f73378b == -9223372036854775807L && !C8408jD0.y()) {
            this.f73378b = 200 + jElapsedRealtime;
        }
        long j10 = this.f73378b;
        if (j10 != -9223372036854775807L && jElapsedRealtime >= j10) {
            Exception exc2 = this.f73377a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f73377a;
            a();
            throw exc3;
        }
        this.f73379c = jElapsedRealtime + 50;
    }
}
