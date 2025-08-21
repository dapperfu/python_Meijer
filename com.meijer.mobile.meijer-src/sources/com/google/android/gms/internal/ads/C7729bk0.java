package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.bk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7729bk0 extends Gj0 implements Wj0 {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f73700b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f73700b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f73700b.getDelay(timeUnit);
    }

    public C7729bk0(com.google.common.util.concurrent.q qVar, ScheduledFuture scheduledFuture) {
        super(qVar);
        this.f73700b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = b().cancel(z10);
        if (zCancel) {
            this.f73700b.cancel(z10);
        }
        return zCancel;
    }
}
