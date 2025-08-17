package com.google.android.gms.internal.pal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class T3 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f82885a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f82886b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f82885a.newThread(runnable);
        threadNewThread.setName("gads-" + this.f82886b.getAndIncrement());
        return threadNewThread;
    }

    T3() {
    }
}
