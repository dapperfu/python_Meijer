package Yu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class t1<T, U> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends U> f41660b;

    static final class a<T, U> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41661a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Nu.b> f41662b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final a<T, U>.C0886a f41663c = new C0886a();

        /* renamed from: d, reason: collision with root package name */
        final ev.c f41664d = new ev.c();

        /* renamed from: Yu.t1$a$a, reason: collision with other inner class name */
        final class C0886a extends AtomicReference<Nu.b> implements io.reactivex.s<U> {
            C0886a() {
            }

            @Override // io.reactivex.s
            public void onComplete() {
                a.this.a();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                a.this.b(th2);
            }

            @Override // io.reactivex.s
            public void onNext(U u10) {
                Qu.d.a(this);
                a.this.a();
            }

            @Override // io.reactivex.s
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        void a() {
            Qu.d.a(this.f41662b);
            ev.k.a(this.f41661a, this, this.f41664d);
        }

        void b(Throwable th2) {
            Qu.d.a(this.f41662b);
            ev.k.c(this.f41661a, th2, this, this.f41664d);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41662b);
            Qu.d.a(this.f41663c);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f41662b.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Qu.d.a(this.f41663c);
            ev.k.a(this.f41661a, this, this.f41664d);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.a(this.f41663c);
            ev.k.c(this.f41661a, th2, this, this.f41664d);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            ev.k.e(this.f41661a, t10, this, this.f41664d);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f41662b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f41661a = sVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f41660b.subscribe(aVar.f41663c);
        this.f41135a.subscribe(aVar);
    }

    public t1(io.reactivex.q<T> qVar, io.reactivex.q<? extends U> qVar2) {
        super(qVar);
        this.f41660b = qVar2;
    }
}
