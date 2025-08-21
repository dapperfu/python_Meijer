package Uu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.m1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5413m1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f38652b;

    /* renamed from: Uu.m1$a */
    static final class a<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38653a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Ju.b> f38654b = new AtomicReference<>();

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38654b);
            Mu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38653a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38653a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38653a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f38654b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f38653a = sVar;
        }

        void a(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }
    }

    /* renamed from: Uu.m1$b */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final a<T> f38655a;

        b(a<T> aVar) {
            this.f38655a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5413m1.this.f38360a.subscribe(this.f38655a);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        aVar.a(this.f38652b.d(new b(aVar)));
    }

    public C5413m1(io.reactivex.q<T> qVar, io.reactivex.t tVar) {
        super(qVar);
        this.f38652b = tVar;
    }
}
