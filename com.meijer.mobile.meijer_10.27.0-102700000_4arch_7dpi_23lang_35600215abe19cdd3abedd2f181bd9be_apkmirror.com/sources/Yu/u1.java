package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class u1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41701b;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41702a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.q<? super T> f41703b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41704c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41705d;

        @Override // Nu.b
        public void dispose() {
            this.f41704c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41704c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41705d) {
                return;
            }
            this.f41705d = true;
            this.f41702a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41705d) {
                C14313a.s(th2);
            } else {
                this.f41705d = true;
                this.f41702a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41705d) {
                return;
            }
            this.f41702a.onNext(t10);
            try {
                if (this.f41703b.test(t10)) {
                    this.f41705d = true;
                    this.f41704c.dispose();
                    this.f41702a.onComplete();
                }
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41704c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41704c, bVar)) {
                this.f41704c = bVar;
                this.f41702a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.q<? super T> qVar) {
            this.f41702a = sVar;
            this.f41703b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41701b));
    }

    public u1(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        super(qVar);
        this.f41701b = qVar2;
    }
}
