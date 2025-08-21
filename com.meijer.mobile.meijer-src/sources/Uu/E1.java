package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class E1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f37861b;

    static final class a<T> extends AtomicBoolean implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37862a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.t f37863b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f37864c;

        /* renamed from: Uu.E1$a$a, reason: collision with other inner class name */
        final class RunnableC0831a implements Runnable {
            RunnableC0831a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37864c.dispose();
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f37863b.d(new RunnableC0831a());
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37864c, bVar)) {
                this.f37864c = bVar;
                this.f37862a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.t tVar) {
            this.f37862a = sVar;
            this.f37863b = tVar;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (!get()) {
                this.f37862a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (get()) {
                C13558a.s(th2);
            } else {
                this.f37862a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (!get()) {
                this.f37862a.onNext(t10);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f37861b));
    }

    public E1(io.reactivex.q<T> qVar, io.reactivex.t tVar) {
        super(qVar);
        this.f37861b = tVar;
    }
}
