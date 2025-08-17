package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class Q<T> extends io.reactivex.h<T> implements Su.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40954a;

    /* renamed from: b, reason: collision with root package name */
    final long f40955b;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f40956a;

        /* renamed from: b, reason: collision with root package name */
        final long f40957b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f40958c;

        /* renamed from: d, reason: collision with root package name */
        long f40959d;

        /* renamed from: e, reason: collision with root package name */
        boolean f40960e;

        @Override // Nu.b
        public void dispose() {
            this.f40958c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40958c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40960e) {
                return;
            }
            this.f40960e = true;
            this.f40956a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40960e) {
                C14313a.s(th2);
            } else {
                this.f40960e = true;
                this.f40956a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40960e) {
                return;
            }
            long j10 = this.f40959d;
            if (j10 != this.f40957b) {
                this.f40959d = j10 + 1;
                return;
            }
            this.f40960e = true;
            this.f40958c.dispose();
            this.f40956a.onSuccess(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40958c, bVar)) {
                this.f40958c = bVar;
                this.f40956a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar, long j10) {
            this.f40956a = iVar;
            this.f40957b = j10;
        }
    }

    @Override // Su.a
    public io.reactivex.l<T> b() {
        return C14313a.o(new P(this.f40954a, this.f40955b, null, false));
    }

    @Override // io.reactivex.h
    public void d(io.reactivex.i<? super T> iVar) {
        this.f40954a.subscribe(new a(iVar, this.f40955b));
    }

    public Q(io.reactivex.q<T> qVar, long j10) {
        this.f40954a = qVar;
        this.f40955b = j10;
    }
}
