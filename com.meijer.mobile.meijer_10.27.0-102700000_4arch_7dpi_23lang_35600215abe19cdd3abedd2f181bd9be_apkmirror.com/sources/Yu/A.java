package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class A<T> extends io.reactivex.u<Long> implements Su.a<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40522a;

    static final class a implements io.reactivex.s<Object>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Long> f40523a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f40524b;

        /* renamed from: c, reason: collision with root package name */
        long f40525c;

        @Override // Nu.b
        public void dispose() {
            this.f40524b.dispose();
            this.f40524b = Qu.d.DISPOSED;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40524b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40524b = Qu.d.DISPOSED;
            this.f40523a.onSuccess(Long.valueOf(this.f40525c));
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40524b = Qu.d.DISPOSED;
            this.f40523a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f40525c++;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40524b, bVar)) {
                this.f40524b = bVar;
                this.f40523a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super Long> wVar) {
            this.f40523a = wVar;
        }
    }

    @Override // Su.a
    public io.reactivex.l<Long> b() {
        return C14313a.o(new C5501z(this.f40522a));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super Long> wVar) {
        this.f40522a.subscribe(new a(wVar));
    }

    public A(io.reactivex.q<T> qVar) {
        this.f40522a = qVar;
    }
}
