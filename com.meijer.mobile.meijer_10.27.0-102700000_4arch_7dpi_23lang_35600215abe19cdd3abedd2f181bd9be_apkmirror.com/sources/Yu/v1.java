package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class v1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41724b;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41725a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.q<? super T> f41726b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41727c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41728d;

        @Override // Nu.b
        public void dispose() {
            this.f41727c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41727c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41728d) {
                return;
            }
            this.f41728d = true;
            this.f41725a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41728d) {
                C14313a.s(th2);
            } else {
                this.f41728d = true;
                this.f41725a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41728d) {
                return;
            }
            try {
                if (this.f41726b.test(t10)) {
                    this.f41725a.onNext(t10);
                    return;
                }
                this.f41728d = true;
                this.f41727c.dispose();
                this.f41725a.onComplete();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41727c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41727c, bVar)) {
                this.f41727c = bVar;
                this.f41725a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.q<? super T> qVar) {
            this.f41725a = sVar;
            this.f41726b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41724b));
    }

    public v1(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        super(qVar);
        this.f41724b = qVar2;
    }
}
