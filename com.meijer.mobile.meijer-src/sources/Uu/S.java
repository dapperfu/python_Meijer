package Uu;

import cv.C13558a;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class S<T> extends io.reactivex.u<T> implements Ou.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38194a;

    /* renamed from: b, reason: collision with root package name */
    final long f38195b;

    /* renamed from: c, reason: collision with root package name */
    final T f38196c;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f38197a;

        /* renamed from: b, reason: collision with root package name */
        final long f38198b;

        /* renamed from: c, reason: collision with root package name */
        final T f38199c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38200d;

        /* renamed from: e, reason: collision with root package name */
        long f38201e;

        /* renamed from: f, reason: collision with root package name */
        boolean f38202f;

        @Override // Ju.b
        public void dispose() {
            this.f38200d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38200d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38202f) {
                return;
            }
            this.f38202f = true;
            T t10 = this.f38199c;
            if (t10 != null) {
                this.f38197a.onSuccess(t10);
            } else {
                this.f38197a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38202f) {
                C13558a.s(th2);
            } else {
                this.f38202f = true;
                this.f38197a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38202f) {
                return;
            }
            long j10 = this.f38201e;
            if (j10 != this.f38198b) {
                this.f38201e = j10 + 1;
                return;
            }
            this.f38202f = true;
            this.f38200d.dispose();
            this.f38197a.onSuccess(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38200d, bVar)) {
                this.f38200d = bVar;
                this.f38197a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super T> wVar, long j10, T t10) {
            this.f38197a = wVar;
            this.f38198b = j10;
            this.f38199c = t10;
        }
    }

    @Override // Ou.a
    public io.reactivex.l<T> b() {
        return C13558a.o(new P(this.f38194a, this.f38195b, this.f38196c, true));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super T> wVar) {
        this.f38194a.subscribe(new a(wVar, this.f38195b, this.f38196c));
    }

    public S(io.reactivex.q<T> qVar, long j10, T t10) {
        this.f38194a = qVar;
        this.f38195b = j10;
        this.f38196c = t10;
    }
}
