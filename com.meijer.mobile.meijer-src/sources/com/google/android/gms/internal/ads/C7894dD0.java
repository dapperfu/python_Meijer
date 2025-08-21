package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.dD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7894dD0 {

    /* renamed from: a, reason: collision with root package name */
    private Exception f74217a;

    /* renamed from: b, reason: collision with root package name */
    private long f74218b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private long f74219c = -9223372036854775807L;

    public final void a() {
        this.f74217a = null;
        this.f74218b = -9223372036854775807L;
        this.f74219c = -9223372036854775807L;
    }

    public final boolean c() {
        if (this.f74217a == null) {
            return false;
        }
        return C8533jD0.y() || SystemClock.elapsedRealtime() < this.f74219c;
    }

    public final void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f74217a == null) {
            this.f74217a = exc;
        }
        if (this.f74218b == -9223372036854775807L && !C8533jD0.y()) {
            this.f74218b = 200 + jElapsedRealtime;
        }
        long j10 = this.f74218b;
        if (j10 != -9223372036854775807L && jElapsedRealtime >= j10) {
            Exception exc2 = this.f74217a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f74217a;
            a();
            throw exc3;
        }
        this.f74219c = jElapsedRealtime + 50;
    }
}
