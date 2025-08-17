package Yu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.m1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5474m1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f41427b;

    /* renamed from: Yu.m1$a */
    static final class a<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41428a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Nu.b> f41429b = new AtomicReference<>();

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41429b);
            Qu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41428a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41428a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41428a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f41429b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f41428a = sVar;
        }

        void a(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }
    }

    /* renamed from: Yu.m1$b */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final a<T> f41430a;

        b(a<T> aVar) {
            this.f41430a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5474m1.this.f41135a.subscribe(this.f41430a);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        aVar.a(this.f41427b.d(new b(aVar)));
    }

    public C5474m1(io.reactivex.q<T> qVar, io.reactivex.t tVar) {
        super(qVar);
        this.f41427b = tVar;
    }
}
