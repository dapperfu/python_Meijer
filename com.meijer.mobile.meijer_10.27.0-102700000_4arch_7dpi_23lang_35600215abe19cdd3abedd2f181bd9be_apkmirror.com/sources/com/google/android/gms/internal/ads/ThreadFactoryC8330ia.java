package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ThreadFactoryC8330ia implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f74978a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f74979b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f74979b;
        Thread threadNewThread = this.f74978a.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }

    ThreadFactoryC8330ia() {
    }
}
