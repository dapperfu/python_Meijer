package Uu;

import cv.C13558a;

/* renamed from: Uu.f1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5392f1<T> extends io.reactivex.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38474a;

    /* renamed from: Uu.f1$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f38475a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f38476b;

        /* renamed from: c, reason: collision with root package name */
        T f38477c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38478d;

        @Override // Ju.b
        public void dispose() {
            this.f38476b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38476b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38478d) {
                return;
            }
            this.f38478d = true;
            T t10 = this.f38477c;
            this.f38477c = null;
            if (t10 == null) {
                this.f38475a.onComplete();
            } else {
                this.f38475a.onSuccess(t10);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38478d) {
                C13558a.s(th2);
            } else {
                this.f38478d = true;
                this.f38475a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38478d) {
                return;
            }
            if (this.f38477c == null) {
                this.f38477c = t10;
                return;
            }
            this.f38478d = true;
            this.f38476b.dispose();
            this.f38475a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38476b, bVar)) {
                this.f38476b = bVar;
                this.f38475a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar) {
            this.f38475a = iVar;
        }
    }

    @Override // io.reactivex.h
    public void d(io.reactivex.i<? super T> iVar) {
        this.f38474a.subscribe(new a(iVar));
    }

    public C5392f1(io.reactivex.q<T> qVar) {
        this.f38474a = qVar;
    }
}
