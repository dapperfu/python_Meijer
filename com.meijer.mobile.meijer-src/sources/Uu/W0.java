package Uu;

import fv.AbstractC14272e;
import fv.C14269b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class W0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super io.reactivex.l<Throwable>, ? extends io.reactivex.q<?>> f38293b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38294a;

        /* renamed from: d, reason: collision with root package name */
        final AbstractC14272e<Throwable> f38297d;

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.q<T> f38300g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f38301h;

        /* renamed from: b, reason: collision with root package name */
        final AtomicInteger f38295b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final av.c f38296c = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final a<T>.C0836a f38298e = new C0836a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Ju.b> f38299f = new AtomicReference<>();

        /* renamed from: Uu.W0$a$a, reason: collision with other inner class name */
        final class C0836a extends AtomicReference<Ju.b> implements io.reactivex.s<Object> {
            C0836a() {
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
            Mu.d.a(this.f38299f);
            av.k.a(this.f38294a, this, this.f38296c);
        }

        void b(Throwable th2) {
            Mu.d.a(this.f38299f);
            av.k.c(this.f38294a, th2, this, this.f38296c);
        }

        void d() {
            if (this.f38295b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f38301h) {
                        this.f38301h = true;
                        this.f38300g.subscribe(this);
                    }
                    if (this.f38295b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38299f);
            Mu.d.a(this.f38298e);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f38299f.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Mu.d.a(this.f38298e);
            av.k.a(this.f38294a, this, this.f38296c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.e(this.f38299f, null);
            this.f38301h = false;
            this.f38297d.onNext(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            av.k.e(this.f38294a, t10, this, this.f38296c);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.e(this.f38299f, bVar);
        }

        a(io.reactivex.s<? super T> sVar, AbstractC14272e<Throwable> abstractC14272e, io.reactivex.q<T> qVar) {
            this.f38294a = sVar;
            this.f38297d = abstractC14272e;
            this.f38300g = qVar;
        }

        void c() {
            d();
        }
    }

    public W0(io.reactivex.q<T> qVar, Lu.o<? super io.reactivex.l<Throwable>, ? extends io.reactivex.q<?>> oVar) {
        super(qVar);
        this.f38293b = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        AbstractC14272e<T> abstractC14272eC = C14269b.e().c();
        try {
            io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38293b.apply(abstractC14272eC), "The handler returned a null ObservableSource");
            a aVar = new a(sVar, abstractC14272eC, this.f38360a);
            sVar.onSubscribe(aVar);
            qVar.subscribe(aVar.f38298e);
            aVar.d();
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }
}
