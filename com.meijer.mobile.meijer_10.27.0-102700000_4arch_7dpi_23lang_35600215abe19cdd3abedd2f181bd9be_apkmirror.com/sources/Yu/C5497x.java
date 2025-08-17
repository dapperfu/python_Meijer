package Yu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5497x<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.j<? extends T> f41745b;

    /* renamed from: Yu.x$a */
    static final class a<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, io.reactivex.i<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41746a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.j<? extends T> f41747b;

        /* renamed from: c, reason: collision with root package name */
        boolean f41748c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41748c) {
                this.f41746a.onComplete();
                return;
            }
            this.f41748c = true;
            Qu.d.e(this, null);
            io.reactivex.j<? extends T> jVar = this.f41747b;
            this.f41747b = null;
            jVar.a(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41746a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41746a.onNext(t10);
        }

        @Override // io.reactivex.i
        public void onSuccess(T t10) {
            this.f41746a.onNext(t10);
            this.f41746a.onComplete();
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.j<? extends T> jVar) {
            this.f41746a = sVar;
            this.f41747b = jVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar) && !this.f41748c) {
                this.f41746a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41745b));
    }

    public C5497x(io.reactivex.l<T> lVar, io.reactivex.j<? extends T> jVar) {
        super(lVar);
        this.f41745b = jVar;
    }
}
