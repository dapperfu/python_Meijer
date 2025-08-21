package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.uD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9708uD extends WE {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f79606b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f79607c;

    /* renamed from: d, reason: collision with root package name */
    private long f79608d;

    /* renamed from: e, reason: collision with root package name */
    private long f79609e;

    /* renamed from: f, reason: collision with root package name */
    private long f79610f;

    /* renamed from: g, reason: collision with root package name */
    private long f79611g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f79612h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f79613i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture f79614j;

    private final synchronized void T0(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f79613i;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f79613i.cancel(false);
            }
            this.f79608d = this.f79607c.c() + j10;
            this.f79613i = this.f79606b.schedule(new RunnableC9387rD(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void U0(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f79614j;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f79614j.cancel(false);
            }
            this.f79609e = this.f79607c.c() + j10;
            this.f79614j = this.f79606b.schedule(new RunnableC9494sD(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void R0(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f79612h) {
                long j10 = this.f79610f;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f79610f = millis;
                return;
            }
            long jC = this.f79607c.c();
            long j11 = this.f79608d;
            if (jC > j11 || j11 - jC > millis) {
                T0(millis);
            }
        }
    }

    public final synchronized void S0(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f79612h) {
                long j10 = this.f79611g;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f79611g = millis;
                return;
            }
            long jC = this.f79607c.c();
            long j11 = this.f79609e;
            if (jC > j11 || j11 - jC > millis) {
                U0(millis);
            }
        }
    }

    public final synchronized void zza() {
        this.f79612h = false;
        T0(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.f79612h) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f79613i;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f79610f = -1L;
            } else {
                this.f79613i.cancel(false);
                this.f79610f = this.f79608d - this.f79607c.c();
            }
            ScheduledFuture scheduledFuture2 = this.f79614j;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.f79611g = -1L;
            } else {
                this.f79614j.cancel(false);
                this.f79611g = this.f79609e - this.f79607c.c();
            }
            this.f79612h = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.f79612h) {
                if (this.f79610f > 0 && (scheduledFuture2 = this.f79613i) != null && scheduledFuture2.isCancelled()) {
                    T0(this.f79610f);
                }
                if (this.f79611g > 0 && (scheduledFuture = this.f79614j) != null && scheduledFuture.isCancelled()) {
                    U0(this.f79611g);
                }
                this.f79612h = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C9708uD(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        super(Collections.EMPTY_SET);
        this.f79608d = -1L;
        this.f79609e = -1L;
        this.f79610f = -1L;
        this.f79611g = -1L;
        this.f79612h = false;
        this.f79606b = scheduledExecutorService;
        this.f79607c = fVar;
    }
}
