package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class N0<T, R> extends io.reactivex.u<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40891a;

    /* renamed from: b, reason: collision with root package name */
    final R f40892b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.c<R, ? super T, R> f40893c;

    static final class a<T, R> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f40894a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.c<R, ? super T, R> f40895b;

        /* renamed from: c, reason: collision with root package name */
        R f40896c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f40897d;

        @Override // Nu.b
        public void dispose() {
            this.f40897d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40897d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            R r10 = this.f40896c;
            if (r10 != null) {
                this.f40896c = null;
                this.f40894a.onSuccess(r10);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40896c == null) {
                C14313a.s(th2);
            } else {
                this.f40896c = null;
                this.f40894a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            R r10 = this.f40896c;
            if (r10 != null) {
                try {
                    this.f40896c = (R) Ru.b.e(this.f40895b.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    this.f40897d.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40897d, bVar)) {
                this.f40897d = bVar;
                this.f40894a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super R> wVar, Pu.c<R, ? super T, R> cVar, R r10) {
            this.f40894a = wVar;
            this.f40896c = r10;
            this.f40895b = cVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super R> wVar) {
        this.f40891a.subscribe(new a(wVar, this.f40893c, this.f40892b));
    }

    public N0(io.reactivex.q<T> qVar, R r10, Pu.c<R, ? super T, R> cVar) {
        this.f40891a = qVar;
        this.f40892b = r10;
        this.f40893c = cVar;
    }
}
