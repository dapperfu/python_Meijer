package com.launchdarkly.sdk.android;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
class g0<T> implements Future<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f91208a;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.f91208a;
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
    public T get(long j10, TimeUnit timeUnit) {
        return this.f91208a;
    }

    g0(T t10) {
        this.f91208a = t10;
    }
}
