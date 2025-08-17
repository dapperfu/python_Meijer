package Yu;

import gv.C14313a;

/* renamed from: Yu.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5451f<T> extends AbstractC5436a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41237b;

    /* renamed from: Yu.f$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Boolean> f41238a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.q<? super T> f41239b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41240c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41241d;

        @Override // Nu.b
        public void dispose() {
            this.f41240c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41240c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41241d) {
                return;
            }
            this.f41241d = true;
            this.f41238a.onNext(Boolean.TRUE);
            this.f41238a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41241d) {
                C14313a.s(th2);
            } else {
                this.f41241d = true;
                this.f41238a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41241d) {
                return;
            }
            try {
                if (this.f41239b.test(t10)) {
                    return;
                }
                this.f41241d = true;
                this.f41240c.dispose();
                this.f41238a.onNext(Boolean.FALSE);
                this.f41238a.onComplete();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41240c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41240c, bVar)) {
                this.f41240c = bVar;
                this.f41238a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super Boolean> sVar, Pu.q<? super T> qVar) {
            this.f41238a = sVar;
            this.f41239b = qVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super Boolean> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41237b));
    }

    public C5451f(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        super(qVar);
        this.f41237b = qVar2;
    }
}
