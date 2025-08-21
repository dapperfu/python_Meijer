package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class Q<T> extends io.reactivex.h<T> implements Ou.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38179a;

    /* renamed from: b, reason: collision with root package name */
    final long f38180b;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f38181a;

        /* renamed from: b, reason: collision with root package name */
        final long f38182b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38183c;

        /* renamed from: d, reason: collision with root package name */
        long f38184d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38185e;

        @Override // Ju.b
        public void dispose() {
            this.f38183c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38183c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38185e) {
                return;
            }
            this.f38185e = true;
            this.f38181a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38185e) {
                C13558a.s(th2);
            } else {
                this.f38185e = true;
                this.f38181a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38185e) {
                return;
            }
            long j10 = this.f38184d;
            if (j10 != this.f38182b) {
                this.f38184d = j10 + 1;
                return;
            }
            this.f38185e = true;
            this.f38183c.dispose();
            this.f38181a.onSuccess(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38183c, bVar)) {
                this.f38183c = bVar;
                this.f38181a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar, long j10) {
            this.f38181a = iVar;
            this.f38182b = j10;
        }
    }

    @Override // Ou.a
    public io.reactivex.l<T> b() {
        return C13558a.o(new P(this.f38179a, this.f38180b, null, false));
    }

    @Override // io.reactivex.h
    public void d(io.reactivex.i<? super T> iVar) {
        this.f38179a.subscribe(new a(iVar, this.f38180b));
    }

    public Q(io.reactivex.q<T> qVar, long j10) {
        this.f38179a = qVar;
        this.f38180b = j10;
    }
}
