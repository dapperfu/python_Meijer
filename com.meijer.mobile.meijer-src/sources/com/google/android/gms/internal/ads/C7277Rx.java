package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Rx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7277Rx implements InterfaceC7214Qb {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f70806a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f70807b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f70808c;

    /* renamed from: d, reason: collision with root package name */
    private long f70809d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f70810e = -1;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f70811f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f70812g = false;

    final synchronized void b() {
        try {
            if (this.f70812g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f70808c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f70810e = -1L;
            } else {
                this.f70808c.cancel(true);
                this.f70810e = this.f70809d - this.f70807b.c();
            }
            this.f70812g = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void c() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f70812g) {
                if (this.f70810e > 0 && (scheduledFuture = this.f70808c) != null && scheduledFuture.isCancelled()) {
                    this.f70808c = this.f70806a.schedule(this.f70811f, this.f70810e, TimeUnit.MILLISECONDS);
                }
                this.f70812g = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(int i10, Runnable runnable) {
        this.f70811f = runnable;
        long j10 = i10;
        this.f70809d = this.f70807b.c() + j10;
        this.f70808c = this.f70806a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7214Qb
    public final void a(boolean z10) {
        if (z10) {
            c();
        } else {
            b();
        }
    }

    public C7277Rx(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        this.f70806a = scheduledExecutorService;
        this.f70807b = fVar;
        Nc.v.e().c(this);
    }
}
