package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ThreadFactoryC8455ia implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f75818a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f75819b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f75819b;
        Thread threadNewThread = this.f75818a.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }

    ThreadFactoryC8455ia() {
    }
}
