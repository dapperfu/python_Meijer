package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class N0<T, R> extends io.reactivex.u<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38116a;

    /* renamed from: b, reason: collision with root package name */
    final R f38117b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.c<R, ? super T, R> f38118c;

    static final class a<T, R> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f38119a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.c<R, ? super T, R> f38120b;

        /* renamed from: c, reason: collision with root package name */
        R f38121c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38122d;

        @Override // Ju.b
        public void dispose() {
            this.f38122d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38122d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            R r10 = this.f38121c;
            if (r10 != null) {
                this.f38121c = null;
                this.f38119a.onSuccess(r10);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38121c == null) {
                C13558a.s(th2);
            } else {
                this.f38121c = null;
                this.f38119a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            R r10 = this.f38121c;
            if (r10 != null) {
                try {
                    this.f38121c = (R) Nu.b.e(this.f38120b.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    this.f38122d.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38122d, bVar)) {
                this.f38122d = bVar;
                this.f38119a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super R> wVar, Lu.c<R, ? super T, R> cVar, R r10) {
            this.f38119a = wVar;
            this.f38121c = r10;
            this.f38120b = cVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super R> wVar) {
        this.f38116a.subscribe(new a(wVar, this.f38118c, this.f38117b));
    }

    public N0(io.reactivex.q<T> qVar, R r10, Lu.c<R, ? super T, R> cVar) {
        this.f38116a = qVar;
        this.f38117b = r10;
        this.f38118c = cVar;
    }
}
