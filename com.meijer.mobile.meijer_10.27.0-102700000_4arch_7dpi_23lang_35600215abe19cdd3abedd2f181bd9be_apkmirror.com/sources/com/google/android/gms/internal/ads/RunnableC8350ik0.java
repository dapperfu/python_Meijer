package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ik0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8350ik0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    C8670lk0 f75003a;

    RunnableC8350ik0(C8670lk0 c8670lk0) {
        this.f75003a = c8670lk0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.q qVar;
        C8670lk0 c8670lk0 = this.f75003a;
        if (c8670lk0 == null || (qVar = c8670lk0.f76632h) == null) {
            return;
        }
        this.f75003a = null;
        if (qVar.isDone()) {
            c8670lk0.v(qVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c8670lk0.f76633i;
            c8670lk0.f76633i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    c8670lk0.h(new C8456jk0(str, null));
                    throw th2;
                }
            }
            c8670lk0.h(new C8456jk0(str + ": " + qVar.toString(), null));
        } finally {
            qVar.cancel(true);
        }
    }
}
