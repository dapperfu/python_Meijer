package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
final class Dj0 extends Cj0 {

    /* renamed from: h, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f66277h;

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f66277h.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0, com.google.common.util.concurrent.q
    public final void addListener(Runnable runnable, Executor executor) {
        this.f66277h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f66277h.cancel(z10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f66277h.get(j10, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f66277h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f66277h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    public final String toString() {
        return this.f66277h.toString();
    }

    Dj0(com.google.common.util.concurrent.q qVar) {
        qVar.getClass();
        this.f66277h = qVar;
    }
}
