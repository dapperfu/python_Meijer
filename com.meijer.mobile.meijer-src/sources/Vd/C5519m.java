package Vd;

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

/* renamed from: Vd.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5519m {
    @Deprecated
    public static <TResult> AbstractC5516j<TResult> c(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.r.m(executor, "Executor must not be null");
        com.google.android.gms.common.internal.r.m(callable, "Callback must not be null");
        N n10 = new N();
        executor.execute(new Q(n10, callable));
        return n10;
    }

    public static <TResult> AbstractC5516j<TResult> d() {
        N n10 = new N();
        n10.w();
        return n10;
    }

    public static <TResult> AbstractC5516j<TResult> e(Exception exc) {
        N n10 = new N();
        n10.u(exc);
        return n10;
    }

    public static <TResult> AbstractC5516j<TResult> f(TResult tresult) {
        N n10 = new N();
        n10.v(tresult);
        return n10;
    }

    public static AbstractC5516j<Void> g(Collection<? extends AbstractC5516j<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return f(null);
        }
        Iterator<? extends AbstractC5516j<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        N n10 = new N();
        s sVar = new s(collection.size(), n10);
        Iterator<? extends AbstractC5516j<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            n(it2.next(), sVar);
        }
        return n10;
    }

    public static AbstractC5516j<Void> h(AbstractC5516j<?>... abstractC5516jArr) {
        return (abstractC5516jArr == null || abstractC5516jArr.length == 0) ? f(null) : g(Arrays.asList(abstractC5516jArr));
    }

    public static AbstractC5516j<List<AbstractC5516j<?>>> i(Collection<? extends AbstractC5516j<?>> collection) {
        return j(C5518l.f39866a, collection);
    }

    public static AbstractC5516j<List<AbstractC5516j<?>>> j(Executor executor, Collection<? extends AbstractC5516j<?>> collection) {
        return (collection == null || collection.isEmpty()) ? f(Collections.EMPTY_LIST) : g(collection).l(executor, new C5521o(collection));
    }

    public static AbstractC5516j<List<AbstractC5516j<?>>> k(AbstractC5516j<?>... abstractC5516jArr) {
        return (abstractC5516jArr == null || abstractC5516jArr.length == 0) ? f(Collections.EMPTY_LIST) : i(Arrays.asList(abstractC5516jArr));
    }

    public static <T> AbstractC5516j<T> l(AbstractC5516j<T> abstractC5516j, long j10, TimeUnit timeUnit) {
        com.google.android.gms.common.internal.r.m(abstractC5516j, "Task must not be null");
        com.google.android.gms.common.internal.r.b(j10 > 0, "Timeout must be positive");
        com.google.android.gms.common.internal.r.m(timeUnit, "TimeUnit must not be null");
        final t tVar = new t();
        final C5517k c5517k = new C5517k(tVar);
        final Jd.a aVar = new Jd.a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: Vd.O
            @Override // java.lang.Runnable
            public final void run() {
                c5517k.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j10));
        abstractC5516j.c(new InterfaceC5511e() { // from class: Vd.P
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j2) {
                aVar.removeCallbacksAndMessages(null);
                C5517k c5517k2 = c5517k;
                if (abstractC5516j2.r()) {
                    c5517k2.e(abstractC5516j2.n());
                } else {
                    if (abstractC5516j2.p()) {
                        tVar.c();
                        return;
                    }
                    Exception excM = abstractC5516j2.m();
                    excM.getClass();
                    c5517k2.d(excM);
                }
            }
        });
        return c5517k.a();
    }

    private static void n(AbstractC5516j abstractC5516j, r rVar) {
        Executor executor = C5518l.f39867b;
        abstractC5516j.h(executor, rVar);
        abstractC5516j.f(executor, rVar);
        abstractC5516j.b(executor, rVar);
    }

    public static <TResult> TResult a(AbstractC5516j<TResult> abstractC5516j) throws ExecutionException, InterruptedException {
        com.google.android.gms.common.internal.r.j();
        com.google.android.gms.common.internal.r.h();
        com.google.android.gms.common.internal.r.m(abstractC5516j, "Task must not be null");
        if (abstractC5516j.q()) {
            return (TResult) m(abstractC5516j);
        }
        C5523q c5523q = new C5523q(null);
        n(abstractC5516j, c5523q);
        c5523q.a();
        return (TResult) m(abstractC5516j);
    }

    public static <TResult> TResult b(AbstractC5516j<TResult> abstractC5516j, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.r.j();
        com.google.android.gms.common.internal.r.h();
        com.google.android.gms.common.internal.r.m(abstractC5516j, "Task must not be null");
        com.google.android.gms.common.internal.r.m(timeUnit, "TimeUnit must not be null");
        if (abstractC5516j.q()) {
            return (TResult) m(abstractC5516j);
        }
        C5523q c5523q = new C5523q(null);
        n(abstractC5516j, c5523q);
        if (c5523q.b(j10, timeUnit)) {
            return (TResult) m(abstractC5516j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static Object m(AbstractC5516j abstractC5516j) throws ExecutionException {
        if (abstractC5516j.r()) {
            return abstractC5516j.n();
        }
        if (abstractC5516j.p()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC5516j.m());
    }
}
