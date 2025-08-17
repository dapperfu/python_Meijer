package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Mj0 extends Oj0 {
    public static Kj0 a(Iterable iterable) {
        return new Kj0(false, AbstractC7917eh0.q(iterable), null);
    }

    public static Kj0 b(Iterable iterable) {
        return new Kj0(true, AbstractC7917eh0.q(iterable), null);
    }

    @SafeVarargs
    public static Kj0 c(com.google.common.util.concurrent.q... qVarArr) {
        return new Kj0(true, AbstractC7917eh0.s(qVarArr), null);
    }

    public static com.google.common.util.concurrent.q d(Iterable iterable) {
        return new C9523tj0(AbstractC7917eh0.q(iterable), true);
    }

    public static com.google.common.util.concurrent.q e(com.google.common.util.concurrent.q qVar, Class cls, InterfaceC9408sf0 interfaceC9408sf0, Executor executor) {
        Ni0 ni0 = new Ni0(qVar, cls, interfaceC9408sf0);
        qVar.addListener(ni0, C7923ek0.d(executor, ni0));
        return ni0;
    }

    public static com.google.common.util.concurrent.q f(com.google.common.util.concurrent.q qVar, Class cls, InterfaceC9416sj0 interfaceC9416sj0, Executor executor) {
        Mi0 mi0 = new Mi0(qVar, cls, interfaceC9416sj0);
        qVar.addListener(mi0, C7923ek0.d(executor, mi0));
        return mi0;
    }

    public static com.google.common.util.concurrent.q h(Object obj) {
        return obj == null ? Qj0.f69634b : new Qj0(obj);
    }

    public static com.google.common.util.concurrent.q i() {
        return Qj0.f69634b;
    }

    public static com.google.common.util.concurrent.q j(Callable callable, Executor executor) {
        RunnableFutureC8991ok0 runnableFutureC8991ok0 = new RunnableFutureC8991ok0(callable);
        executor.execute(runnableFutureC8991ok0);
        return runnableFutureC8991ok0;
    }

    public static com.google.common.util.concurrent.q k(InterfaceC9309rj0 interfaceC9309rj0, Executor executor) {
        RunnableFutureC8991ok0 runnableFutureC8991ok0 = new RunnableFutureC8991ok0(interfaceC9309rj0);
        executor.execute(runnableFutureC8991ok0);
        return runnableFutureC8991ok0;
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.q l(com.google.common.util.concurrent.q... qVarArr) {
        return new C9523tj0(AbstractC7917eh0.s(qVarArr), false);
    }

    public static com.google.common.util.concurrent.q m(com.google.common.util.concurrent.q qVar, InterfaceC9408sf0 interfaceC9408sf0, Executor executor) {
        C8242hj0 c8242hj0 = new C8242hj0(qVar, interfaceC9408sf0);
        qVar.addListener(c8242hj0, C7923ek0.d(executor, c8242hj0));
        return c8242hj0;
    }

    public static com.google.common.util.concurrent.q n(com.google.common.util.concurrent.q qVar, InterfaceC9416sj0 interfaceC9416sj0, Executor executor) {
        int i10 = AbstractRunnableC8348ij0.f75000j;
        executor.getClass();
        C8135gj0 c8135gj0 = new C8135gj0(qVar, interfaceC9416sj0);
        qVar.addListener(c8135gj0, C7923ek0.d(executor, c8135gj0));
        return c8135gj0;
    }

    public static com.google.common.util.concurrent.q g(Throwable th2) {
        th2.getClass();
        return new Pj0(th2);
    }

    public static com.google.common.util.concurrent.q o(com.google.common.util.concurrent.q qVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (qVar.isDone()) {
            return qVar;
        }
        return C8670lk0.F(qVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) throws ExecutionException {
        if (future.isDone()) {
            return C9098pk0.a(future);
        }
        throw new IllegalStateException(C7267Vf0.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return C9098pk0.a(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new Aj0((Error) e10.getCause());
            }
            throw new zzgdj(e10.getCause());
        }
    }

    public static void r(com.google.common.util.concurrent.q qVar, Ij0 ij0, Executor executor) {
        ij0.getClass();
        qVar.addListener(new Jj0(qVar, ij0), executor);
    }
}
