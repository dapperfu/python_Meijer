package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
enum zzua implements Executor {
    INSTANCE;

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
