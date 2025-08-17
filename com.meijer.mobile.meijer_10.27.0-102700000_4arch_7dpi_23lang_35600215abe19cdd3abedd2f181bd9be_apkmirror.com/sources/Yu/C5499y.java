package Yu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5499y<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f41773b;

    /* renamed from: Yu.y$a */
    static final class a<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, io.reactivex.w<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41774a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.y<? extends T> f41775b;

        /* renamed from: c, reason: collision with root package name */
        boolean f41776c;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41776c = true;
            Qu.d.e(this, null);
            io.reactivex.y<? extends T> yVar = this.f41775b;
            this.f41775b = null;
            yVar.a(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41774a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41774a.onNext(t10);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f41774a.onNext(t10);
            this.f41774a.onComplete();
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.y<? extends T> yVar) {
            this.f41774a = sVar;
            this.f41775b = yVar;
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
            if (Qu.d.o(this, bVar) && !this.f41776c) {
                this.f41774a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41773b));
    }

    public C5499y(io.reactivex.l<T> lVar, io.reactivex.y<? extends T> yVar) {
        super(lVar);
        this.f41773b = yVar;
    }
}
