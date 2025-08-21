package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class M0<T> extends io.reactivex.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38084a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.c<T, T, T> f38085b;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f38086a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.c<T, T, T> f38087b;

        /* renamed from: c, reason: collision with root package name */
        boolean f38088c;

        /* renamed from: d, reason: collision with root package name */
        T f38089d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f38090e;

        @Override // Ju.b
        public void dispose() {
            this.f38090e.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38090e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38088c) {
                return;
            }
            this.f38088c = true;
            T t10 = this.f38089d;
            this.f38089d = null;
            if (t10 != null) {
                this.f38086a.onSuccess(t10);
            } else {
                this.f38086a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38088c) {
                C13558a.s(th2);
                return;
            }
            this.f38088c = true;
            this.f38089d = null;
            this.f38086a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38088c) {
                return;
            }
            T t11 = this.f38089d;
            if (t11 == null) {
                this.f38089d = t10;
                return;
            }
            try {
                this.f38089d = (T) Nu.b.e(this.f38087b.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38090e.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38090e, bVar)) {
                this.f38090e = bVar;
                this.f38086a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar, Lu.c<T, T, T> cVar) {
            this.f38086a = iVar;
            this.f38087b = cVar;
        }
    }

    @Override // io.reactivex.h
    protected void d(io.reactivex.i<? super T> iVar) {
        this.f38084a.subscribe(new a(iVar, this.f38085b));
    }

    public M0(io.reactivex.q<T> qVar, Lu.c<T, T, T> cVar) {
        this.f38084a = qVar;
        this.f38085b = cVar;
    }
}
