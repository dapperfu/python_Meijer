package com.google.common.util.concurrent;

import com.google.common.util.concurrent.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes6.dex */
class B<V> extends f.a<V> implements RunnableFuture<V> {

    /* renamed from: a, reason: collision with root package name */
    private volatile o<?> f88895a;

    private final class a extends o<V> {

        /* renamed from: c, reason: collision with root package name */
        private final Callable<V> f88896c;

        a(Callable<V> callable) {
            this.f88896c = (Callable) De.p.q(callable);
        }

        @Override // com.google.common.util.concurrent.o
        void a(Throwable th2) {
            B.this.setException(th2);
        }

        @Override // com.google.common.util.concurrent.o
        void b(V v10) {
            B.this.set(v10);
        }

        @Override // com.google.common.util.concurrent.o
        final boolean f() {
            return B.this.isDone();
        }

        @Override // com.google.common.util.concurrent.o
        V g() throws Exception {
            return this.f88896c.call();
        }

        @Override // com.google.common.util.concurrent.o
        String h() {
            return this.f88896c.toString();
        }
    }

    static <V> B<V> d(Runnable runnable, V v10) {
        return new B<>(Executors.callable(runnable, v10));
    }

    static <V> B<V> e(Callable<V> callable) {
        return new B<>(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a
    protected String pendingToString() {
        o<?> oVar = this.f88895a;
        if (oVar == null) {
            return super.pendingToString();
        }
        return "task=[" + oVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        o<?> oVar = this.f88895a;
        if (oVar != null) {
            oVar.run();
        }
        this.f88895a = null;
    }

    B(Callable<V> callable) {
        this.f88895a = new a(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a
    protected void afterDone() {
        o<?> oVar;
        super.afterDone();
        if (wasInterrupted() && (oVar = this.f88895a) != null) {
            oVar.e();
        }
        this.f88895a = null;
    }
}
