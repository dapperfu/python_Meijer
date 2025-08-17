package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.uD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9583uD extends WE {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f78766b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f78767c;

    /* renamed from: d, reason: collision with root package name */
    private long f78768d;

    /* renamed from: e, reason: collision with root package name */
    private long f78769e;

    /* renamed from: f, reason: collision with root package name */
    private long f78770f;

    /* renamed from: g, reason: collision with root package name */
    private long f78771g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f78772h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f78773i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture f78774j;

    private final synchronized void T0(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f78773i;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f78773i.cancel(false);
            }
            this.f78768d = this.f78767c.c() + j10;
            this.f78773i = this.f78766b.schedule(new RunnableC9262rD(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void U0(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f78774j;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f78774j.cancel(false);
            }
            this.f78769e = this.f78767c.c() + j10;
            this.f78774j = this.f78766b.schedule(new RunnableC9369sD(this, null), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void R0(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f78772h) {
                long j10 = this.f78770f;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f78770f = millis;
                return;
            }
            long jC = this.f78767c.c();
            long j11 = this.f78768d;
            if (jC > j11 || j11 - jC > millis) {
                T0(millis);
            }
        }
    }

    public final synchronized void S0(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f78772h) {
                long j10 = this.f78771g;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f78771g = millis;
                return;
            }
            long jC = this.f78767c.c();
            long j11 = this.f78769e;
            if (jC > j11 || j11 - jC > millis) {
                U0(millis);
            }
        }
    }

    public final synchronized void zza() {
        this.f78772h = false;
        T0(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.f78772h) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f78773i;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f78770f = -1L;
            } else {
                this.f78773i.cancel(false);
                this.f78770f = this.f78768d - this.f78767c.c();
            }
            ScheduledFuture scheduledFuture2 = this.f78774j;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.f78771g = -1L;
            } else {
                this.f78774j.cancel(false);
                this.f78771g = this.f78769e - this.f78767c.c();
            }
            this.f78772h = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.f78772h) {
                if (this.f78770f > 0 && (scheduledFuture2 = this.f78773i) != null && scheduledFuture2.isCancelled()) {
                    T0(this.f78770f);
                }
                if (this.f78771g > 0 && (scheduledFuture = this.f78774j) != null && scheduledFuture.isCancelled()) {
                    U0(this.f78771g);
                }
                this.f78772h = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C9583uD(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        super(Collections.EMPTY_SET);
        this.f78768d = -1L;
        this.f78769e = -1L;
        this.f78770f = -1L;
        this.f78771g = -1L;
        this.f78772h = false;
        this.f78766b = scheduledExecutorService;
        this.f78767c = fVar;
    }
}
