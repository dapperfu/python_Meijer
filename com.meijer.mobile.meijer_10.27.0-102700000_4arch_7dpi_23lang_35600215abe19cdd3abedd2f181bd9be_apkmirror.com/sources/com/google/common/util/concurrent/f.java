package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC11289a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public abstract class f<V> extends l<V> {

    static abstract class a<V> extends f<V> implements AbstractC11289a.i<V> {
        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }

        a() {
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, com.google.common.util.concurrent.q
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC11289a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    public static <V> f<V> a(q<V> qVar) {
        return qVar instanceof f ? (f) qVar : new g(qVar);
    }

    f() {
    }

    public final <T> f<T> b(Be.g<? super V, T> gVar, Executor executor) {
        return (f) k.d(this, gVar, executor);
    }

    public final <T> f<T> c(d<? super V, T> dVar, Executor executor) {
        return (f) k.e(this, dVar, executor);
    }
}
