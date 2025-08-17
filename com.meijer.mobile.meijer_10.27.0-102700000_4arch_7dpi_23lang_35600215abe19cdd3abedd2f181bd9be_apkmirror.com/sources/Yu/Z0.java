package Yu;

import A0.c;
import gv.C14313a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class Z0 {

    public static final class a<T> extends AtomicInteger implements Su.b<T>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41131a;

        /* renamed from: b, reason: collision with root package name */
        final T f41132b;

        @Override // Su.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // Su.f
        public void clear() {
            lazySet(3);
        }

        @Override // Nu.b
        public void dispose() {
            set(3);
        }

        @Override // Su.f
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public a(io.reactivex.s<? super T> sVar, T t10) {
            this.f41131a = sVar;
            this.f41132b = t10;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        @Override // Su.f
        public boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // Su.f
        public T poll() throws Exception {
            if (get() == 1) {
                lazySet(3);
                return this.f41132b;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f41131a.onNext(this.f41132b);
                if (get() == 2) {
                    lazySet(3);
                    this.f41131a.onComplete();
                }
            }
        }
    }

    static final class b<T, R> extends io.reactivex.l<R> {

        /* renamed from: a, reason: collision with root package name */
        final T f41133a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41134b;

        @Override // io.reactivex.l
        public void subscribeActual(io.reactivex.s<? super R> sVar) {
            try {
                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41134b.apply(this.f41133a), "The mapper returned a null ObservableSource");
                if (!(qVar instanceof Callable)) {
                    qVar.subscribe(sVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) qVar).call();
                    if (objCall == null) {
                        Qu.e.e(sVar);
                        return;
                    }
                    a aVar = new a(sVar, objCall);
                    sVar.onSubscribe(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    Qu.e.m(th2, sVar);
                }
            } catch (Throwable th3) {
                Qu.e.m(th3, sVar);
            }
        }

        b(T t10, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar) {
            this.f41133a = t10;
            this.f41134b = oVar;
        }
    }

    public static <T, U> io.reactivex.l<U> a(T t10, Pu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar) {
        return C14313a.o(new b(t10, oVar));
    }

    public static <T, R> boolean b(io.reactivex.q<T> qVar, io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar) {
        if (!(qVar instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) qVar).call();
            if (eVar == null) {
                Qu.e.e(sVar);
                return true;
            }
            try {
                io.reactivex.q qVar2 = (io.reactivex.q) Ru.b.e(oVar.apply(eVar), "The mapper returned a null ObservableSource");
                if (qVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) qVar2).call();
                        if (objCall == null) {
                            Qu.e.e(sVar);
                            return true;
                        }
                        a aVar = new a(sVar, objCall);
                        sVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th2) {
                        Ou.a.b(th2);
                        Qu.e.m(th2, sVar);
                        return true;
                    }
                } else {
                    qVar2.subscribe(sVar);
                }
                return true;
            } catch (Throwable th3) {
                Ou.a.b(th3);
                Qu.e.m(th3, sVar);
                return true;
            }
        } catch (Throwable th4) {
            Ou.a.b(th4);
            Qu.e.m(th4, sVar);
            return true;
        }
    }
}
