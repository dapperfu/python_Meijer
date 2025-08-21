package com.google.common.util.concurrent;

import com.google.common.util.concurrent.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractRunnableC11416c<I, O, F, T> extends f.a<O> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    q<? extends I> f88930a;

    /* renamed from: b, reason: collision with root package name */
    F f88931b;

    abstract T f(F f10, I i10) throws Exception;

    abstract void g(T t10);

    /* renamed from: com.google.common.util.concurrent.c$a */
    private static final class a<I, O> extends AbstractRunnableC11416c<I, O, d<? super I, ? extends O>, q<? extends O>> {
        a(q<? extends I> qVar, d<? super I, ? extends O> dVar) {
            super(qVar, dVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC11416c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public q<? extends O> f(d<? super I, ? extends O> dVar, I i10) throws Exception {
            q<? extends O> qVarApply = dVar.apply(i10);
            De.p.s(qVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dVar);
            return qVarApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC11416c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q<? extends O> qVar) {
            setFuture(qVar);
        }
    }

    /* renamed from: com.google.common.util.concurrent.c$b */
    private static final class b<I, O> extends AbstractRunnableC11416c<I, O, De.g<? super I, ? extends O>, O> {
        b(q<? extends I> qVar, De.g<? super I, ? extends O> gVar) {
            super(qVar, gVar);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC11416c
        void g(O o10) {
            set(o10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC11416c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public O f(De.g<? super I, ? extends O> gVar, I i10) {
            return gVar.apply(i10);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a
    protected final void afterDone() {
        maybePropagateCancellationTo(this.f88930a);
        this.f88930a = null;
        this.f88931b = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC11414a
    protected String pendingToString() {
        String str;
        q<? extends I> qVar = this.f88930a;
        F f10 = this.f88931b;
        String strPendingToString = super.pendingToString();
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        } else {
            str = "";
        }
        if (f10 != null) {
            return str + "function=[" + f10 + "]";
        }
        if (strPendingToString == null) {
            return null;
        }
        return str + strPendingToString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        q<? extends I> qVar = this.f88930a;
        F f10 = this.f88931b;
        if ((isCancelled() | (qVar == null)) || (f10 == null)) {
            return;
        }
        this.f88930a = null;
        if (qVar.isCancelled()) {
            setFuture(qVar);
            return;
        }
        try {
            try {
                Object objF = f(f10, k.b(qVar));
                this.f88931b = null;
                g(objF);
            } catch (Throwable th2) {
                try {
                    x.a(th2);
                    setException(th2);
                } finally {
                    this.f88931b = null;
                }
            }
        } catch (Error e10) {
            setException(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            setException(e11.getCause());
        } catch (Exception e12) {
            setException(e12);
        }
    }

    AbstractRunnableC11416c(q<? extends I> qVar, F f10) {
        this.f88930a = (q) De.p.q(qVar);
        this.f88931b = (F) De.p.q(f10);
    }

    static <I, O> q<O> d(q<I> qVar, De.g<? super I, ? extends O> gVar, Executor executor) {
        De.p.q(gVar);
        b bVar = new b(qVar, gVar);
        qVar.addListener(bVar, u.d(executor, bVar));
        return bVar;
    }

    static <I, O> q<O> e(q<I> qVar, d<? super I, ? extends O> dVar, Executor executor) {
        De.p.q(executor);
        a aVar = new a(qVar, dVar);
        qVar.addListener(aVar, u.d(executor, aVar));
        return aVar;
    }
}
