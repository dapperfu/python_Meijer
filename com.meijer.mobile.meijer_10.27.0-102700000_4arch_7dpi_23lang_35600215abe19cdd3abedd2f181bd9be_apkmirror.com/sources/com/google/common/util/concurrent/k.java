package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public final class k extends m {

    private static final class a<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future<V> f88096a;

        /* renamed from: b, reason: collision with root package name */
        final j<? super V> f88097b;

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f88096a;
            if ((future instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) future)) != null) {
                this.f88097b.onFailure(thA);
                return;
            }
            try {
                this.f88097b.onSuccess(k.b(this.f88096a));
            } catch (ExecutionException e10) {
                this.f88097b.onFailure(e10.getCause());
            } catch (Throwable th2) {
                this.f88097b.onFailure(th2);
            }
        }

        a(Future<V> future, j<? super V> jVar) {
            this.f88096a = future;
            this.f88097b = jVar;
        }

        public String toString() {
            return Be.j.c(this).k(this.f88097b).toString();
        }
    }

    public static <V> q<V> c(V v10) {
        return v10 == null ? (q<V>) n.f88098b : new n(v10);
    }

    public static <V> void a(q<V> qVar, j<? super V> jVar, Executor executor) {
        Be.p.q(jVar);
        qVar.addListener(new a(qVar, jVar), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        Be.p.z(future.isDone(), "Future was expected to be done: %s", future);
        return (V) C.a(future);
    }

    public static <I, O> q<O> d(q<I> qVar, Be.g<? super I, ? extends O> gVar, Executor executor) {
        return AbstractRunnableC11291c.d(qVar, gVar, executor);
    }

    public static <I, O> q<O> e(q<I> qVar, d<? super I, ? extends O> dVar, Executor executor) {
        return AbstractRunnableC11291c.e(qVar, dVar, executor);
    }
}
