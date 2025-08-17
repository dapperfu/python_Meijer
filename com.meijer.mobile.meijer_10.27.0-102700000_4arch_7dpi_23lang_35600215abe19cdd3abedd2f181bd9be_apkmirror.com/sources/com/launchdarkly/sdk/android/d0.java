package com.launchdarkly.sdk.android;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
class d0<T> implements Future<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f91204a;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException {
        throw new ExecutionException(this.f91204a);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.f91204a);
    }

    d0(Throwable th2) {
        this.f91204a = th2;
    }
}
