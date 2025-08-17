package Yu;

import gv.C14313a;

/* renamed from: Yu.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5454g<T> extends io.reactivex.u<Boolean> implements Su.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41254a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41255b;

    /* renamed from: Yu.g$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f41256a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.q<? super T> f41257b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41258c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41259d;

        @Override // Nu.b
        public void dispose() {
            this.f41258c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41258c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41259d) {
                return;
            }
            this.f41259d = true;
            this.f41256a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41259d) {
                C14313a.s(th2);
            } else {
                this.f41259d = true;
                this.f41256a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41259d) {
                return;
            }
            try {
                if (this.f41257b.test(t10)) {
                    return;
                }
                this.f41259d = true;
                this.f41258c.dispose();
                this.f41256a.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41258c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41258c, bVar)) {
                this.f41258c = bVar;
                this.f41256a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super Boolean> wVar, Pu.q<? super T> qVar) {
            this.f41256a = wVar;
            this.f41257b = qVar;
        }
    }

    @Override // Su.a
    public io.reactivex.l<Boolean> b() {
        return C14313a.o(new C5451f(this.f41254a, this.f41255b));
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super Boolean> wVar) {
        this.f41254a.subscribe(new a(wVar, this.f41255b));
    }

    public C5454g(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        this.f41254a = qVar;
        this.f41255b = qVar2;
    }
}
