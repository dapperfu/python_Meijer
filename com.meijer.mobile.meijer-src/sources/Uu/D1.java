package Uu;

import cv.C13558a;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class D1<T, U extends Collection<? super T>> extends io.reactivex.u<U> implements Ou.a<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f37847a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f37848b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f37849a;

        /* renamed from: b, reason: collision with root package name */
        U f37850b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f37851c;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37850b = null;
            this.f37849a.onError(th2);
        }

        @Override // Ju.b
        public void dispose() {
            this.f37851c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37851c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10 = this.f37850b;
            this.f37850b = null;
            this.f37849a.onSuccess(u10);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37850b.add(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37851c, bVar)) {
                this.f37851c = bVar;
                this.f37849a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super U> wVar, U u10) {
            this.f37849a = wVar;
            this.f37850b = u10;
        }
    }

    public D1(io.reactivex.q<T> qVar, int i10) {
        this.f37847a = qVar;
        this.f37848b = Nu.a.e(i10);
    }

    @Override // Ou.a
    public io.reactivex.l<U> b() {
        return C13558a.o(new C1(this.f37847a, this.f37848b));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super U> wVar) {
        try {
            this.f37847a.subscribe(new a(wVar, (Collection) Nu.b.e(this.f37848b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.o(th2, wVar);
        }
    }

    public D1(io.reactivex.q<T> qVar, Callable<U> callable) {
        this.f37847a = qVar;
        this.f37848b = callable;
    }
}
