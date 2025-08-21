package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.g80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8204g80 implements com.google.common.util.concurrent.q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f75087a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75088b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f75089c;

    public C8204g80(Object obj, String str, com.google.common.util.concurrent.q qVar) {
        this.f75087a = obj;
        this.f75088b = str;
        this.f75089c = qVar;
    }

    public final Object a() {
        return this.f75087a;
    }

    public final String b() {
        return this.f75088b;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f75089c.get();
    }

    @Override // com.google.common.util.concurrent.q
    public final void addListener(Runnable runnable, Executor executor) {
        this.f75089c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f75089c.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f75089c.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f75089c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f75089c.isDone();
    }

    public final String toString() {
        return this.f75088b + "@" + System.identityHashCode(this);
    }
}
