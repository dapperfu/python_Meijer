package Uu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class t1<T, U> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends U> f38885b;

    static final class a<T, U> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38886a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Ju.b> f38887b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final a<T, U>.C0843a f38888c = new C0843a();

        /* renamed from: d, reason: collision with root package name */
        final av.c f38889d = new av.c();

        /* renamed from: Uu.t1$a$a, reason: collision with other inner class name */
        final class C0843a extends AtomicReference<Ju.b> implements io.reactivex.s<U> {
            C0843a() {
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
                Mu.d.a(this);
                a.this.a();
            }

            @Override // io.reactivex.s
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        void a() {
            Mu.d.a(this.f38887b);
            av.k.a(this.f38886a, this, this.f38889d);
        }

        void b(Throwable th2) {
            Mu.d.a(this.f38887b);
            av.k.c(this.f38886a, th2, this, this.f38889d);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38887b);
            Mu.d.a(this.f38888c);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f38887b.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Mu.d.a(this.f38888c);
            av.k.a(this.f38886a, this, this.f38889d);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.a(this.f38888c);
            av.k.c(this.f38886a, th2, this, this.f38889d);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            av.k.e(this.f38886a, t10, this, this.f38889d);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f38887b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f38886a = sVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f38885b.subscribe(aVar.f38888c);
        this.f38360a.subscribe(aVar);
    }

    public t1(io.reactivex.q<T> qVar, io.reactivex.q<? extends U> qVar2) {
        super(qVar);
        this.f38885b = qVar2;
    }
}
