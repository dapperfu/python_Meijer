package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ExecutorC6931Hq implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f68351a = new Rc.q0(Looper.getMainLooper());

    ExecutorC6931Hq() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th2) {
                Nc.v.t();
                Rc.D0.n(Nc.v.s().e(), th2);
                throw th2;
            }
        }
        this.f68351a.post(runnable);
    }
}
