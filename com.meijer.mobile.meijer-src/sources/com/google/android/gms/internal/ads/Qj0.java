package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes6.dex */
final class Qj0 implements com.google.common.util.concurrent.q {

    /* renamed from: b, reason: collision with root package name */
    static final com.google.common.util.concurrent.q f70474b = new Qj0(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Vj0 f70475c = new Vj0(Qj0.class);

    /* renamed from: a, reason: collision with root package name */
    private final Object f70476a;

    Qj0(Object obj) {
        this.f70476a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f70476a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.q
    public final void addListener(Runnable runnable, Executor executor) {
        C6782Df0.c(runnable, "Runnable was null.");
        C6782Df0.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f70475c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f70476a;
    }

    public final String toString() {
        Object obj = this.f70476a;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }
}
