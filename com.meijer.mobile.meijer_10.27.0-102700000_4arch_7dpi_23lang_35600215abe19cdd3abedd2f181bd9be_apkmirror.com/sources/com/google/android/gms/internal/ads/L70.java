package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class L70 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f68262a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(NG) #" + this.f68262a.getAndIncrement());
    }

    L70() {
    }
}
