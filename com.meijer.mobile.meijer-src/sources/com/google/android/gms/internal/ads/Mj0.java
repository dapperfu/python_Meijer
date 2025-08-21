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
        return new Kj0(false, AbstractC8042eh0.q(iterable), null);
    }

    public static Kj0 b(Iterable iterable) {
        return new Kj0(true, AbstractC8042eh0.q(iterable), null);
    }

    @SafeVarargs
    public static Kj0 c(com.google.common.util.concurrent.q... qVarArr) {
        return new Kj0(true, AbstractC8042eh0.s(qVarArr), null);
    }

    public static com.google.common.util.concurrent.q d(Iterable iterable) {
        return new C9648tj0(AbstractC8042eh0.q(iterable), true);
    }

    public static com.google.common.util.concurrent.q e(com.google.common.util.concurrent.q qVar, Class cls, InterfaceC9533sf0 interfaceC9533sf0, Executor executor) {
        Ni0 ni0 = new Ni0(qVar, cls, interfaceC9533sf0);
        qVar.addListener(ni0, C8048ek0.d(executor, ni0));
        return ni0;
    }

    public static com.google.common.util.concurrent.q f(com.google.common.util.concurrent.q qVar, Class cls, InterfaceC9541sj0 interfaceC9541sj0, Executor executor) {
        Mi0 mi0 = new Mi0(qVar, cls, interfaceC9541sj0);
        qVar.addListener(mi0, C8048ek0.d(executor, mi0));
        return mi0;
    }

    public static com.google.common.util.concurrent.q h(Object obj) {
        return obj == null ? Qj0.f70474b : new Qj0(obj);
    }

    public static com.google.common.util.concurrent.q i() {
        return Qj0.f70474b;
    }

    public static com.google.common.util.concurrent.q j(Callable callable, Executor executor) {
        RunnableFutureC9116ok0 runnableFutureC9116ok0 = new RunnableFutureC9116ok0(callable);
        executor.execute(runnableFutureC9116ok0);
        return runnableFutureC9116ok0;
    }

    public static com.google.common.util.concurrent.q k(InterfaceC9434rj0 interfaceC9434rj0, Executor executor) {
        RunnableFutureC9116ok0 runnableFutureC9116ok0 = new RunnableFutureC9116ok0(interfaceC9434rj0);
        executor.execute(runnableFutureC9116ok0);
        return runnableFutureC9116ok0;
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.q l(com.google.common.util.concurrent.q... qVarArr) {
        return new C9648tj0(AbstractC8042eh0.s(qVarArr), false);
    }

    public static com.google.common.util.concurrent.q m(com.google.common.util.concurrent.q qVar, InterfaceC9533sf0 interfaceC9533sf0, Executor executor) {
        C8367hj0 c8367hj0 = new C8367hj0(qVar, interfaceC9533sf0);
        qVar.addListener(c8367hj0, C8048ek0.d(executor, c8367hj0));
        return c8367hj0;
    }

    public static com.google.common.util.concurrent.q n(com.google.common.util.concurrent.q qVar, InterfaceC9541sj0 interfaceC9541sj0, Executor executor) {
        int i10 = AbstractRunnableC8473ij0.f75840j;
        executor.getClass();
        C8260gj0 c8260gj0 = new C8260gj0(qVar, interfaceC9541sj0);
        qVar.addListener(c8260gj0, C8048ek0.d(executor, c8260gj0));
        return c8260gj0;
    }

    public static com.google.common.util.concurrent.q g(Throwable th2) {
        th2.getClass();
        return new Pj0(th2);
    }

    public static com.google.common.util.concurrent.q o(com.google.common.util.concurrent.q qVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (qVar.isDone()) {
            return qVar;
        }
        return C8795lk0.F(qVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) throws ExecutionException {
        if (future.isDone()) {
            return C9223pk0.a(future);
        }
        throw new IllegalStateException(C7392Vf0.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return C9223pk0.a(future);
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
