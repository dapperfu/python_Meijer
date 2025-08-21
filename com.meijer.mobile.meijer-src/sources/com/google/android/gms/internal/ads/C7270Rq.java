package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Rq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7270Rq implements com.google.common.util.concurrent.q {

    /* renamed from: a, reason: collision with root package name */
    private final C8369hk0 f70788a = C8369hk0.D();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f70788a.get();
    }

    private static final boolean a(boolean z10) {
        if (!z10) {
            Nc.v.s().w(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z10;
    }

    @Override // com.google.common.util.concurrent.q
    public final void addListener(Runnable runnable, Executor executor) {
        this.f70788a.addListener(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean zG = this.f70788a.g(obj);
        a(zG);
        return zG;
    }

    public final boolean c(Throwable th2) {
        boolean zH = this.f70788a.h(th2);
        a(zH);
        return zH;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f70788a.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f70788a.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f70788a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f70788a.isDone();
    }
}
