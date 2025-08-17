package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Vp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ThreadFactoryC7278Vp implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f70930a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f70930a.getAndIncrement());
    }

    ThreadFactoryC7278Vp(C7311Wp c7311Wp) {
    }
}
