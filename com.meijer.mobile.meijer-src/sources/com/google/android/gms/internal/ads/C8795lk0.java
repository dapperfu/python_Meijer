package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.lk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8795lk0 extends Bj0 {

    /* renamed from: h, reason: collision with root package name */
    private com.google.common.util.concurrent.q f77472h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f77473i;

    static com.google.common.util.concurrent.q F(com.google.common.util.concurrent.q qVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C8795lk0 c8795lk0 = new C8795lk0(qVar);
        RunnableC8475ik0 runnableC8475ik0 = new RunnableC8475ik0(c8795lk0);
        c8795lk0.f77473i = scheduledExecutorService.schedule(runnableC8475ik0, j10, timeUnit);
        qVar.addListener(runnableC8475ik0, EnumC10290zj0.INSTANCE);
        return c8795lk0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final String e() {
        com.google.common.util.concurrent.q qVar = this.f77472h;
        ScheduledFuture scheduledFuture = this.f77473i;
        if (qVar == null) {
            return null;
        }
        String str = "inputFuture=[" + qVar.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final void f() {
        u(this.f77472h);
        ScheduledFuture scheduledFuture = this.f77473i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f77472h = null;
        this.f77473i = null;
    }

    private C8795lk0(com.google.common.util.concurrent.q qVar) {
        qVar.getClass();
        this.f77472h = qVar;
    }
}
