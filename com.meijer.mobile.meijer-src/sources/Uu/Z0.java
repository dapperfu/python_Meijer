package Uu;

import A0.c;
import cv.C13558a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class Z0 {

    public static final class a<T> extends AtomicInteger implements Ou.b<T>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38356a;

        /* renamed from: b, reason: collision with root package name */
        final T f38357b;

        @Override // Ou.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // Ou.f
        public void clear() {
            lazySet(3);
        }

        @Override // Ju.b
        public void dispose() {
            set(3);
        }

        @Override // Ou.f
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public a(io.reactivex.s<? super T> sVar, T t10) {
            this.f38356a = sVar;
            this.f38357b = t10;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        @Override // Ou.f
        public boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // Ou.f
        public T poll() throws Exception {
            if (get() == 1) {
                lazySet(3);
                return this.f38357b;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f38356a.onNext(this.f38357b);
                if (get() == 2) {
                    lazySet(3);
                    this.f38356a.onComplete();
                }
            }
        }
    }

    static final class b<T, R> extends io.reactivex.l<R> {

        /* renamed from: a, reason: collision with root package name */
        final T f38358a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38359b;

        @Override // io.reactivex.l
        public void subscribeActual(io.reactivex.s<? super R> sVar) {
            try {
                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38359b.apply(this.f38358a), "The mapper returned a null ObservableSource");
                if (!(qVar instanceof Callable)) {
                    qVar.subscribe(sVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) qVar).call();
                    if (objCall == null) {
                        Mu.e.e(sVar);
                        return;
                    }
                    a aVar = new a(sVar, objCall);
                    sVar.onSubscribe(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    Mu.e.m(th2, sVar);
                }
            } catch (Throwable th3) {
                Mu.e.m(th3, sVar);
            }
        }

        b(T t10, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar) {
            this.f38358a = t10;
            this.f38359b = oVar;
        }
    }

    public static <T, U> io.reactivex.l<U> a(T t10, Lu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar) {
        return C13558a.o(new b(t10, oVar));
    }

    public static <T, R> boolean b(io.reactivex.q<T> qVar, io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar) {
        if (!(qVar instanceof Callable)) {
            return false;
        }
        try {
            c.e eVar = (Object) ((Callable) qVar).call();
            if (eVar == null) {
                Mu.e.e(sVar);
                return true;
            }
            try {
                io.reactivex.q qVar2 = (io.reactivex.q) Nu.b.e(oVar.apply(eVar), "The mapper returned a null ObservableSource");
                if (qVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) qVar2).call();
                        if (objCall == null) {
                            Mu.e.e(sVar);
                            return true;
                        }
                        a aVar = new a(sVar, objCall);
                        sVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th2) {
                        Ku.a.b(th2);
                        Mu.e.m(th2, sVar);
                        return true;
                    }
                } else {
                    qVar2.subscribe(sVar);
                }
                return true;
            } catch (Throwable th3) {
                Ku.a.b(th3);
                Mu.e.m(th3, sVar);
                return true;
            }
        } catch (Throwable th4) {
            Ku.a.b(th4);
            Mu.e.m(th4, sVar);
            return true;
        }
    }
}
