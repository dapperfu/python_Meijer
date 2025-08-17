package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.g80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8079g80 implements com.google.common.util.concurrent.q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f74247a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74248b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f74249c;

    public C8079g80(Object obj, String str, com.google.common.util.concurrent.q qVar) {
        this.f74247a = obj;
        this.f74248b = str;
        this.f74249c = qVar;
    }

    public final Object a() {
        return this.f74247a;
    }

    public final String b() {
        return this.f74248b;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f74249c.get();
    }

    @Override // com.google.common.util.concurrent.q
    public final void addListener(Runnable runnable, Executor executor) {
        this.f74249c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f74249c.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f74249c.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f74249c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f74249c.isDone();
    }

    public final String toString() {
        return this.f74248b + "@" + System.identityHashCode(this);
    }
}
