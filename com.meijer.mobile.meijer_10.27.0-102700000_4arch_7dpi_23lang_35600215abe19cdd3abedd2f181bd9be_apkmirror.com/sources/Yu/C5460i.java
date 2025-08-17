package Yu;

import gv.C14313a;

/* renamed from: Yu.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5460i<T> extends AbstractC5436a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41284b;

    /* renamed from: Yu.i$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Boolean> f41285a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.q<? super T> f41286b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41287c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41288d;

        @Override // Nu.b
        public void dispose() {
            this.f41287c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41287c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41288d) {
                return;
            }
            this.f41288d = true;
            this.f41285a.onNext(Boolean.FALSE);
            this.f41285a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41288d) {
                C14313a.s(th2);
            } else {
                this.f41288d = true;
                this.f41285a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41288d) {
                return;
            }
            try {
                if (this.f41286b.test(t10)) {
                    this.f41288d = true;
                    this.f41287c.dispose();
                    this.f41285a.onNext(Boolean.TRUE);
                    this.f41285a.onComplete();
                }
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41287c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41287c, bVar)) {
                this.f41287c = bVar;
                this.f41285a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super Boolean> sVar, Pu.q<? super T> qVar) {
            this.f41285a = sVar;
            this.f41286b = qVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super Boolean> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41284b));
    }

    public C5460i(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        super(qVar);
        this.f41284b = qVar2;
    }
}
