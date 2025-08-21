package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ThreadFactoryC6897Gq implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f68115a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f68116b;

    ThreadFactoryC6897Gq(String str) {
        this.f68116b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f68116b + ") #" + this.f68115a.getAndIncrement());
    }
}
