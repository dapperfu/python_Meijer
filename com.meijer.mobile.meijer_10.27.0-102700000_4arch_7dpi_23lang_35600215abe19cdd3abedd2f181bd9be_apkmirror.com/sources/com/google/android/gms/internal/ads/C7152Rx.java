package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Rx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7152Rx implements InterfaceC7089Qb {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f69966a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f69967b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f69968c;

    /* renamed from: d, reason: collision with root package name */
    private long f69969d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f69970e = -1;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f69971f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f69972g = false;

    final synchronized void b() {
        try {
            if (this.f69972g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f69968c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f69970e = -1L;
            } else {
                this.f69968c.cancel(true);
                this.f69970e = this.f69969d - this.f69967b.c();
            }
            this.f69972g = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void c() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f69972g) {
                if (this.f69970e > 0 && (scheduledFuture = this.f69968c) != null && scheduledFuture.isCancelled()) {
                    this.f69968c = this.f69966a.schedule(this.f69971f, this.f69970e, TimeUnit.MILLISECONDS);
                }
                this.f69972g = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(int i10, Runnable runnable) {
        this.f69971f = runnable;
        long j10 = i10;
        this.f69969d = this.f69967b.c() + j10;
        this.f69968c = this.f69966a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7089Qb
    public final void a(boolean z10) {
        if (z10) {
            c();
        } else {
            b();
        }
    }

    public C7152Rx(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        this.f69966a = scheduledExecutorService;
        this.f69967b = fVar;
        Lc.v.e().c(this);
    }
}
