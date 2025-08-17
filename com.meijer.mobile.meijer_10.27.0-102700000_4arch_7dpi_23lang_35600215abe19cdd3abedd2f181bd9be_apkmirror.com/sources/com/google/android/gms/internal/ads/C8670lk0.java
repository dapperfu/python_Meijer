package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.lk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8670lk0 extends Bj0 {

    /* renamed from: h, reason: collision with root package name */
    private com.google.common.util.concurrent.q f76632h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f76633i;

    static com.google.common.util.concurrent.q F(com.google.common.util.concurrent.q qVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C8670lk0 c8670lk0 = new C8670lk0(qVar);
        RunnableC8350ik0 runnableC8350ik0 = new RunnableC8350ik0(c8670lk0);
        c8670lk0.f76633i = scheduledExecutorService.schedule(runnableC8350ik0, j10, timeUnit);
        qVar.addListener(runnableC8350ik0, EnumC10165zj0.INSTANCE);
        return c8670lk0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final String e() {
        com.google.common.util.concurrent.q qVar = this.f76632h;
        ScheduledFuture scheduledFuture = this.f76633i;
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

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final void f() {
        u(this.f76632h);
        ScheduledFuture scheduledFuture = this.f76633i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f76632h = null;
        this.f76633i = null;
    }

    private C8670lk0(com.google.common.util.concurrent.q qVar) {
        qVar.getClass();
        this.f76632h = qVar;
    }
}
