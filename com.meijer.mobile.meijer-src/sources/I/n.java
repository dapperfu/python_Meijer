package I;

import I.o;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q.InterfaceC16578a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC16578a<?, ?> f14096a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    class a<I, O> implements I.a<I, O> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16578a f14097a;

        a(InterfaceC16578a interfaceC16578a) {
            this.f14097a = interfaceC16578a;
        }

        @Override // I.a
        public q<O> apply(I i10) {
            return n.p(this.f14097a.apply(i10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class c<I> implements I.c<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f14098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16578a f14099b;

        c(c.a aVar, InterfaceC16578a interfaceC16578a) {
            this.f14098a = aVar;
            this.f14099b = interfaceC16578a;
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            this.f14098a.f(th2);
        }

        @Override // I.c
        public void onSuccess(I i10) {
            try {
                this.f14098a.c(this.f14099b.apply(i10));
            } catch (Throwable th2) {
                this.f14098a.f(th2);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f14100a;

        d(q qVar) {
            this.f14100a = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14100a.cancel(true);
        }
    }

    private static final class e<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future<V> f14101a;

        /* renamed from: b, reason: collision with root package name */
        final I.c<? super V> f14102b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14102b.onSuccess(n.l(this.f14101a));
            } catch (Error e10) {
                e = e10;
                this.f14102b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f14102b.onFailure(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.f14102b.onFailure(e12);
                } else {
                    this.f14102b.onFailure(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f14102b;
        }

        e(Future<V> future, I.c<? super V> cVar) {
            this.f14101a = future;
            this.f14102b = cVar;
        }
    }

    public static <V> V m(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static <I, O> void u(q<I> qVar, InterfaceC16578a<? super I, ? extends O> interfaceC16578a, c.a<O> aVar, Executor executor) {
        v(true, qVar, interfaceC16578a, aVar, executor);
    }

    class b implements InterfaceC16578a<Object, Object> {
        @Override // q.InterfaceC16578a
        public Object apply(Object obj) {
            return obj;
        }

        b() {
        }
    }

    public static /* synthetic */ Object c(q qVar, c.a aVar) {
        v(false, qVar, f14096a, aVar, H.a.a());
        return "nonCancellationPropagating[" + qVar + "]";
    }

    public static /* synthetic */ Object f(q qVar, final c.a aVar) {
        qVar.addListener(new Runnable() { // from class: I.j
            @Override // java.lang.Runnable
            public final void run() {
                aVar.c(null);
            }
        }, H.a.a());
        return "transformVoidFuture [" + qVar + "]";
    }

    public static <V> q<List<V>> k(Collection<? extends q<? extends V>> collection) {
        return new p(new ArrayList(collection), true, H.a.a());
    }

    public static <V> q<V> n(Throwable th2) {
        return new o.a(th2);
    }

    public static <V> ScheduledFuture<V> o(Throwable th2) {
        return new o.b(th2);
    }

    public static <V> q<V> p(V v10) {
        return v10 == null ? o.a() : new o.c(v10);
    }

    public static <V> q<V> q(final long j10, final ScheduledExecutorService scheduledExecutorService, final q<V> qVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: I.e
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return n.d(qVar, scheduledExecutorService, j10, aVar);
            }
        });
    }

    public static <V> q<V> r(final long j10, final ScheduledExecutorService scheduledExecutorService, final V v10, final boolean z10, final q<V> qVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: I.i
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return n.a(qVar, scheduledExecutorService, v10, z10, j10, aVar);
            }
        });
    }

    public static <V> void t(q<V> qVar, c.a<V> aVar) {
        u(qVar, f14096a, aVar, H.a.a());
    }

    public static <V> q<List<V>> w(Collection<? extends q<? extends V>> collection) {
        return new p(new ArrayList(collection), false, H.a.a());
    }

    public static <I, O> q<O> y(q<I> qVar, I.a<? super I, ? extends O> aVar, Executor executor) {
        I.b bVar = new I.b(aVar, qVar);
        qVar.addListener(bVar, executor);
        return bVar;
    }

    public static <V> q<Void> z(final q<V> qVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: I.h
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return n.f(qVar, aVar);
            }
        });
    }

    public static /* synthetic */ Object a(final q qVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, long j10, final c.a aVar) {
        t(qVar, aVar);
        if (!qVar.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: I.k
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(aVar, obj, z10, qVar);
                }
            }, j10, TimeUnit.MILLISECONDS);
            qVar.addListener(new Runnable() { // from class: I.l
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, H.a.a());
        }
        return "TimeoutFuture[" + qVar + "]";
    }

    public static /* synthetic */ Object d(final q qVar, ScheduledExecutorService scheduledExecutorService, final long j10, final c.a aVar) {
        t(qVar, aVar);
        if (!qVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: I.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.f(new TimeoutException("Future[" + qVar + "] is not done within " + j10 + " ms.")));
                }
            }, j10, TimeUnit.MILLISECONDS);
            qVar.addListener(new Runnable() { // from class: I.g
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, H.a.a());
        }
        return "TimeoutFuture[" + qVar + "]";
    }

    public static /* synthetic */ void h(c.a aVar, Object obj, boolean z10, q qVar) {
        aVar.c(obj);
        if (z10) {
            qVar.cancel(true);
        }
    }

    public static <V> void j(q<V> qVar, I.c<? super V> cVar, Executor executor) {
        o2.i.g(cVar);
        qVar.addListener(new e(qVar, cVar), executor);
    }

    public static <V> V l(Future<V> future) throws ExecutionException {
        o2.i.j(future.isDone(), "Future was expected to be done, " + future);
        return (V) m(future);
    }

    public static <V> q<V> s(final q<V> qVar) {
        o2.i.g(qVar);
        if (qVar.isDone()) {
            return qVar;
        }
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: I.m
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return n.c(qVar, aVar);
            }
        });
    }

    private static <I, O> void v(boolean z10, q<I> qVar, InterfaceC16578a<? super I, ? extends O> interfaceC16578a, c.a<O> aVar, Executor executor) {
        o2.i.g(qVar);
        o2.i.g(interfaceC16578a);
        o2.i.g(aVar);
        o2.i.g(executor);
        j(qVar, new c(aVar, interfaceC16578a), executor);
        if (z10) {
            aVar.a(new d(qVar), H.a.a());
        }
    }

    public static <I, O> q<O> x(q<I> qVar, InterfaceC16578a<? super I, ? extends O> interfaceC16578a, Executor executor) {
        o2.i.g(interfaceC16578a);
        return y(qVar, new a(interfaceC16578a), executor);
    }
}
