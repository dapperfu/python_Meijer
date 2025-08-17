package Td;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: Td.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5235m {
    @Deprecated
    public static <TResult> AbstractC5232j<TResult> c(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.r.m(executor, "Executor must not be null");
        com.google.android.gms.common.internal.r.m(callable, "Callback must not be null");
        N n10 = new N();
        executor.execute(new Q(n10, callable));
        return n10;
    }

    public static <TResult> AbstractC5232j<TResult> d() {
        N n10 = new N();
        n10.w();
        return n10;
    }

    public static <TResult> AbstractC5232j<TResult> e(Exception exc) {
        N n10 = new N();
        n10.u(exc);
        return n10;
    }

    public static <TResult> AbstractC5232j<TResult> f(TResult tresult) {
        N n10 = new N();
        n10.v(tresult);
        return n10;
    }

    public static AbstractC5232j<Void> g(Collection<? extends AbstractC5232j<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return f(null);
        }
        Iterator<? extends AbstractC5232j<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        N n10 = new N();
        s sVar = new s(collection.size(), n10);
        Iterator<? extends AbstractC5232j<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            n(it2.next(), sVar);
        }
        return n10;
    }

    public static AbstractC5232j<Void> h(AbstractC5232j<?>... abstractC5232jArr) {
        return (abstractC5232jArr == null || abstractC5232jArr.length == 0) ? f(null) : g(Arrays.asList(abstractC5232jArr));
    }

    public static AbstractC5232j<List<AbstractC5232j<?>>> i(Collection<? extends AbstractC5232j<?>> collection) {
        return j(C5234l.f34933a, collection);
    }

    public static AbstractC5232j<List<AbstractC5232j<?>>> j(Executor executor, Collection<? extends AbstractC5232j<?>> collection) {
        return (collection == null || collection.isEmpty()) ? f(Collections.EMPTY_LIST) : g(collection).l(executor, new C5237o(collection));
    }

    public static AbstractC5232j<List<AbstractC5232j<?>>> k(AbstractC5232j<?>... abstractC5232jArr) {
        return (abstractC5232jArr == null || abstractC5232jArr.length == 0) ? f(Collections.EMPTY_LIST) : i(Arrays.asList(abstractC5232jArr));
    }

    public static <T> AbstractC5232j<T> l(AbstractC5232j<T> abstractC5232j, long j10, TimeUnit timeUnit) {
        com.google.android.gms.common.internal.r.m(abstractC5232j, "Task must not be null");
        com.google.android.gms.common.internal.r.b(j10 > 0, "Timeout must be positive");
        com.google.android.gms.common.internal.r.m(timeUnit, "TimeUnit must not be null");
        final t tVar = new t();
        final C5233k c5233k = new C5233k(tVar);
        final Hd.a aVar = new Hd.a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: Td.O
            @Override // java.lang.Runnable
            public final void run() {
                c5233k.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j10));
        abstractC5232j.c(new InterfaceC5227e() { // from class: Td.P
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j2) {
                aVar.removeCallbacksAndMessages(null);
                C5233k c5233k2 = c5233k;
                if (abstractC5232j2.r()) {
                    c5233k2.e(abstractC5232j2.n());
                } else {
                    if (abstractC5232j2.p()) {
                        tVar.c();
                        return;
                    }
                    Exception excM = abstractC5232j2.m();
                    excM.getClass();
                    c5233k2.d(excM);
                }
            }
        });
        return c5233k.a();
    }

    private static void n(AbstractC5232j abstractC5232j, r rVar) {
        Executor executor = C5234l.f34934b;
        abstractC5232j.h(executor, rVar);
        abstractC5232j.f(executor, rVar);
        abstractC5232j.b(executor, rVar);
    }

    public static <TResult> TResult a(AbstractC5232j<TResult> abstractC5232j) throws ExecutionException, InterruptedException {
        com.google.android.gms.common.internal.r.j();
        com.google.android.gms.common.internal.r.h();
        com.google.android.gms.common.internal.r.m(abstractC5232j, "Task must not be null");
        if (abstractC5232j.q()) {
            return (TResult) m(abstractC5232j);
        }
        C5239q c5239q = new C5239q(null);
        n(abstractC5232j, c5239q);
        c5239q.a();
        return (TResult) m(abstractC5232j);
    }

    public static <TResult> TResult b(AbstractC5232j<TResult> abstractC5232j, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.r.j();
        com.google.android.gms.common.internal.r.h();
        com.google.android.gms.common.internal.r.m(abstractC5232j, "Task must not be null");
        com.google.android.gms.common.internal.r.m(timeUnit, "TimeUnit must not be null");
        if (abstractC5232j.q()) {
            return (TResult) m(abstractC5232j);
        }
        C5239q c5239q = new C5239q(null);
        n(abstractC5232j, c5239q);
        if (c5239q.b(j10, timeUnit)) {
            return (TResult) m(abstractC5232j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static Object m(AbstractC5232j abstractC5232j) throws ExecutionException {
        if (abstractC5232j.r()) {
            return abstractC5232j.n();
        }
        if (abstractC5232j.p()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC5232j.m());
    }
}
