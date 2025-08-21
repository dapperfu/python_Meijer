package Uu;

import fv.AbstractC14272e;
import fv.C14269b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class S0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super io.reactivex.l<Object>, ? extends io.reactivex.q<?>> f38203b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38204a;

        /* renamed from: d, reason: collision with root package name */
        final AbstractC14272e<Object> f38207d;

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.q<T> f38210g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f38211h;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f38205b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final av.c f38206c = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final a<T>.C0835a f38208e = new C0835a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Ju.b> f38209f = new AtomicReference<>();

        /* renamed from: Uu.S0$a$a, reason: collision with other inner class name */
        final class C0835a extends AtomicReference<Ju.b> implements io.reactivex.s<Object> {
            C0835a() {
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
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        void a() {
            Mu.d.a(this.f38209f);
            av.k.a(this.f38204a, this, this.f38206c);
        }

        void b(Throwable th2) {
            Mu.d.a(this.f38209f);
            av.k.c(this.f38204a, th2, this, this.f38206c);
        }

        void d() {
            if (this.f38205b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f38211h) {
                        this.f38211h = true;
                        this.f38210g.subscribe(this);
                    }
                    if (this.f38205b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38209f);
            Mu.d.a(this.f38208e);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f38209f.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Mu.d.e(this.f38209f, null);
            this.f38211h = false;
            this.f38207d.onNext(0);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.a(this.f38208e);
            av.k.c(this.f38204a, th2, this, this.f38206c);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            av.k.e(this.f38204a, t10, this, this.f38206c);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f38209f, bVar);
        }

        a(io.reactivex.s<? super T> sVar, AbstractC14272e<Object> abstractC14272e, io.reactivex.q<T> qVar) {
            this.f38204a = sVar;
            this.f38207d = abstractC14272e;
            this.f38210g = qVar;
        }

        void c() {
            d();
        }
    }

    public S0(io.reactivex.q<T> qVar, Lu.o<? super io.reactivex.l<Object>, ? extends io.reactivex.q<?>> oVar) {
        super(qVar);
        this.f38203b = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        AbstractC14272e<T> abstractC14272eC = C14269b.e().c();
        try {
            io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38203b.apply(abstractC14272eC), "The handler returned a null ObservableSource");
            a aVar = new a(sVar, abstractC14272eC, this.f38360a);
            sVar.onSubscribe(aVar);
            qVar.subscribe(aVar.f38208e);
            aVar.d();
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }
}
