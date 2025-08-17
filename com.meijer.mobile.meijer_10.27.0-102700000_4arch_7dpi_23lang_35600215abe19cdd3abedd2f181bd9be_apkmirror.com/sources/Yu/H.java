package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class H<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.k<R>> f40707b;

    static final class a<T, R> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f40708a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.k<R>> f40709b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40710c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f40711d;

        @Override // Nu.b
        public void dispose() {
            this.f40711d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40711d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40710c) {
                return;
            }
            this.f40710c = true;
            this.f40708a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40710c) {
                C14313a.s(th2);
            } else {
                this.f40710c = true;
                this.f40708a.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40710c) {
                if (t10 instanceof io.reactivex.k) {
                    io.reactivex.k kVar = (io.reactivex.k) t10;
                    if (kVar.g()) {
                        C14313a.s(kVar.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.k kVar2 = (io.reactivex.k) Ru.b.e(this.f40709b.apply(t10), "The selector returned a null Notification");
                if (kVar2.g()) {
                    this.f40711d.dispose();
                    onError(kVar2.d());
                } else if (!kVar2.f()) {
                    this.f40708a.onNext((Object) kVar2.e());
                } else {
                    this.f40711d.dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f40711d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40711d, bVar)) {
                this.f40711d = bVar;
                this.f40708a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends io.reactivex.k<R>> oVar) {
            this.f40708a = sVar;
            this.f40709b = oVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40707b));
    }

    public H(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.k<R>> oVar) {
        super(qVar);
        this.f40707b = oVar;
    }
}
