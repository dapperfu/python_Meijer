package Yu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jv.AbstractC15082e;
import jv.C15079b;

/* loaded from: classes9.dex */
public final class S0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super io.reactivex.l<Object>, ? extends io.reactivex.q<?>> f40978b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40979a;

        /* renamed from: d, reason: collision with root package name */
        final AbstractC15082e<Object> f40982d;

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.q<T> f40985g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f40986h;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f40980b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final ev.c f40981c = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final a<T>.C0878a f40983e = new C0878a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Nu.b> f40984f = new AtomicReference<>();

        /* renamed from: Yu.S0$a$a, reason: collision with other inner class name */
        final class C0878a extends AtomicReference<Nu.b> implements io.reactivex.s<Object> {
            C0878a() {
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
            public void onNext(Object obj) {
                a.this.c();
            }

            @Override // io.reactivex.s
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        void a() {
            Qu.d.a(this.f40984f);
            ev.k.a(this.f40979a, this, this.f40981c);
        }

        void b(Throwable th2) {
            Qu.d.a(this.f40984f);
            ev.k.c(this.f40979a, th2, this, this.f40981c);
        }

        void d() {
            if (this.f40980b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f40986h) {
                        this.f40986h = true;
                        this.f40985g.subscribe(this);
                    }
                    if (this.f40980b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f40984f);
            Qu.d.a(this.f40983e);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f40984f.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Qu.d.e(this.f40984f, null);
            this.f40986h = false;
            this.f40982d.onNext(0);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.a(this.f40983e);
            ev.k.c(this.f40979a, th2, this, this.f40981c);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            ev.k.e(this.f40979a, t10, this, this.f40981c);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40984f, bVar);
        }

        a(io.reactivex.s<? super T> sVar, AbstractC15082e<Object> abstractC15082e, io.reactivex.q<T> qVar) {
            this.f40979a = sVar;
            this.f40982d = abstractC15082e;
            this.f40985g = qVar;
        }

        void c() {
            d();
        }
    }

    public S0(io.reactivex.q<T> qVar, Pu.o<? super io.reactivex.l<Object>, ? extends io.reactivex.q<?>> oVar) {
        super(qVar);
        this.f40978b = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        AbstractC15082e<T> abstractC15082eC = C15079b.e().c();
        try {
            io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f40978b.apply(abstractC15082eC), "The handler returned a null ObservableSource");
            a aVar = new a(sVar, abstractC15082eC, this.f41135a);
            sVar.onSubscribe(aVar);
            qVar.subscribe(aVar.f40983e);
            aVar.d();
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }
}
