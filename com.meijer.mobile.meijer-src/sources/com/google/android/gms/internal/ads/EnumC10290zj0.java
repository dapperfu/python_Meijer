package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
enum EnumC10290zj0 implements Executor {
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
