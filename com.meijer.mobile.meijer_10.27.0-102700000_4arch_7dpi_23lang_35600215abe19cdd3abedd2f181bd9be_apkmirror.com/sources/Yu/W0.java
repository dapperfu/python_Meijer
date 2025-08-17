package Yu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jv.AbstractC15082e;
import jv.C15079b;

/* loaded from: classes9.dex */
public final class W0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super io.reactivex.l<Throwable>, ? extends io.reactivex.q<?>> f41068b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41069a;

        /* renamed from: d, reason: collision with root package name */
        final AbstractC15082e<Throwable> f41072d;

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.q<T> f41075g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f41076h;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f41070b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final ev.c f41071c = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final a<T>.C0879a f41073e = new C0879a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Nu.b> f41074f = new AtomicReference<>();

        /* renamed from: Yu.W0$a$a, reason: collision with other inner class name */
        final class C0879a extends AtomicReference<Nu.b> implements io.reactivex.s<Object> {
            C0879a() {
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
            Qu.d.a(this.f41074f);
            ev.k.a(this.f41069a, this, this.f41071c);
        }

        void b(Throwable th2) {
            Qu.d.a(this.f41074f);
            ev.k.c(this.f41069a, th2, this, this.f41071c);
        }

        void d() {
            if (this.f41070b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f41076h) {
                        this.f41076h = true;
                        this.f41075g.subscribe(this);
                    }
                    if (this.f41070b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41074f);
            Qu.d.a(this.f41073e);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f41074f.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Qu.d.a(this.f41073e);
            ev.k.a(this.f41069a, this, this.f41071c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.e(this.f41074f, null);
            this.f41076h = false;
            this.f41072d.onNext(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            ev.k.e(this.f41069a, t10, this, this.f41071c);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.e(this.f41074f, bVar);
        }

        a(io.reactivex.s<? super T> sVar, AbstractC15082e<Throwable> abstractC15082e, io.reactivex.q<T> qVar) {
            this.f41069a = sVar;
            this.f41072d = abstractC15082e;
            this.f41075g = qVar;
        }

        void c() {
            d();
        }
    }

    public W0(io.reactivex.q<T> qVar, Pu.o<? super io.reactivex.l<Throwable>, ? extends io.reactivex.q<?>> oVar) {
        super(qVar);
        this.f41068b = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        AbstractC15082e<T> abstractC15082eC = C15079b.e().c();
        try {
            io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41068b.apply(abstractC15082eC), "The handler returned a null ObservableSource");
            a aVar = new a(sVar, abstractC15082eC, this.f41135a);
            sVar.onSubscribe(aVar);
            qVar.subscribe(aVar.f41073e);
            aVar.d();
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }
}
