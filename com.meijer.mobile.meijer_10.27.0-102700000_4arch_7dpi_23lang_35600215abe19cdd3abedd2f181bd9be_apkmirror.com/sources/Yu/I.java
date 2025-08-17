package Yu;

/* loaded from: classes9.dex */
public final class I<T> extends AbstractC5436a<T, T> {

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        io.reactivex.s<? super T> f40736a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f40737b;

        @Override // Nu.b
        public void dispose() {
            Nu.b bVar = this.f40737b;
            this.f40737b = ev.g.INSTANCE;
            this.f40736a = ev.g.a();
            bVar.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40737b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            io.reactivex.s<? super T> sVar = this.f40736a;
            this.f40737b = ev.g.INSTANCE;
            this.f40736a = ev.g.a();
            sVar.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            io.reactivex.s<? super T> sVar = this.f40736a;
            this.f40737b = ev.g.INSTANCE;
            this.f40736a = ev.g.a();
            sVar.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40736a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40737b, bVar)) {
                this.f40737b = bVar;
                this.f40736a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f40736a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar));
    }

    public I(io.reactivex.q<T> qVar) {
        super(qVar);
    }
}
