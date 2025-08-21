package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class B<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.o<T> f37784a;

    static final class a<T> extends AtomicReference<Ju.b> implements io.reactivex.n<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37785a;

        @Override // io.reactivex.n
        public boolean a(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f37785a.onError(th2);
                dispose();
                return true;
            } catch (Throwable th3) {
                dispose();
                throw th3;
            }
        }

        @Override // io.reactivex.n
        public void b(Lu.f fVar) {
            c(new Mu.b(fVar));
        }

        @Override // io.reactivex.e
        public void onNext(T t10) {
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f37785a.onNext(t10);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f37785a = sVar;
        }

        public void c(Ju.b bVar) {
            Mu.d.m(this, bVar);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // io.reactivex.n, Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.e
        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.f37785a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        @Override // io.reactivex.e
        public void onError(Throwable th2) {
            if (!a(th2)) {
                C13558a.s(th2);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        try {
            this.f37784a.a(aVar);
        } catch (Throwable th2) {
            Ku.a.b(th2);
            aVar.onError(th2);
        }
    }

    public B(io.reactivex.o<T> oVar) {
        this.f37784a = oVar;
    }
}
