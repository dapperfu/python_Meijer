package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ExecutorC6806Hq implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f67511a = new Pc.q0(Looper.getMainLooper());

    ExecutorC6806Hq() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th2) {
                Lc.v.t();
                Pc.D0.n(Lc.v.s().e(), th2);
                throw th2;
            }
        }
        this.f67511a.post(runnable);
    }
}
