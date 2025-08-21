package com.google.android.gms.internal.pal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class T3 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f83725a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f83726b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f83725a.newThread(runnable);
        threadNewThread.setName("gads-" + this.f83726b.getAndIncrement());
        return threadNewThread;
    }

    T3() {
    }
}
