package Uu;

import cv.C13558a;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class r<T, U> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f38807b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.b<? super U, ? super T> f38808c;

    static final class a<T, U> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f38809a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.b<? super U, ? super T> f38810b;

        /* renamed from: c, reason: collision with root package name */
        final U f38811c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38812d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38813e;

        @Override // Ju.b
        public void dispose() {
            this.f38812d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38812d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38813e) {
                return;
            }
            this.f38813e = true;
            this.f38809a.onNext(this.f38811c);
            this.f38809a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38813e) {
                C13558a.s(th2);
            } else {
                this.f38813e = true;
                this.f38809a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38813e) {
                return;
            }
            try {
                this.f38810b.accept(this.f38811c, t10);
            } catch (Throwable th2) {
                this.f38812d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38812d, bVar)) {
                this.f38812d = bVar;
                this.f38809a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super U> sVar, U u10, Lu.b<? super U, ? super T> bVar) {
            this.f38809a = sVar;
            this.f38810b = bVar;
            this.f38811c = u10;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        try {
            this.f38360a.subscribe(new a(sVar, Nu.b.e(this.f38807b.call(), "The initialSupplier returned a null value"), this.f38808c));
        } catch (Throwable th2) {
            Mu.e.m(th2, sVar);
        }
    }

    public r(io.reactivex.q<T> qVar, Callable<? extends U> callable, Lu.b<? super U, ? super T> bVar) {
        super(qVar);
        this.f38807b = callable;
        this.f38808c = bVar;
    }
}
