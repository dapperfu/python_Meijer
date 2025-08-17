package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ThreadFactoryC6772Gq implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f67275a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f67276b;

    ThreadFactoryC6772Gq(String str) {
        this.f67276b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f67276b + ") #" + this.f67275a.getAndIncrement());
    }
}
