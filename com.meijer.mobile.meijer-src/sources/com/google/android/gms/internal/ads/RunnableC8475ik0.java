package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ik0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8475ik0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    C8795lk0 f75843a;

    RunnableC8475ik0(C8795lk0 c8795lk0) {
        this.f75843a = c8795lk0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.q qVar;
        C8795lk0 c8795lk0 = this.f75843a;
        if (c8795lk0 == null || (qVar = c8795lk0.f77472h) == null) {
            return;
        }
        this.f75843a = null;
        if (qVar.isDone()) {
            c8795lk0.v(qVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c8795lk0.f77473i;
            c8795lk0.f77473i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    c8795lk0.h(new C8581jk0(str, null));
                    throw th2;
                }
            }
            c8795lk0.h(new C8581jk0(str + ": " + qVar.toString(), null));
        } finally {
            qVar.cancel(true);
        }
    }
}
