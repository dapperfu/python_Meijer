package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class u1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38926b;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38927a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.q<? super T> f38928b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38929c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38930d;

        @Override // Ju.b
        public void dispose() {
            this.f38929c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38929c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38930d) {
                return;
            }
            this.f38930d = true;
            this.f38927a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38930d) {
                C13558a.s(th2);
            } else {
                this.f38930d = true;
                this.f38927a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38930d) {
                return;
            }
            this.f38927a.onNext(t10);
            try {
                if (this.f38928b.test(t10)) {
                    this.f38930d = true;
                    this.f38929c.dispose();
                    this.f38927a.onComplete();
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38929c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38929c, bVar)) {
                this.f38929c = bVar;
                this.f38927a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.q<? super T> qVar) {
            this.f38927a = sVar;
            this.f38928b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38926b));
    }

    public u1(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        super(qVar);
        this.f38926b = qVar2;
    }
}
