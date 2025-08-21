package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class Y<T> extends io.reactivex.b implements Ou.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38324a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.d> f38325b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f38326c;

    static final class a<T> extends AtomicInteger implements Ju.b, io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f38327a;

        /* renamed from: c, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.d> f38329c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f38330d;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f38332f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38333g;

        /* renamed from: b, reason: collision with root package name */
        final av.c f38328b = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final Ju.a f38331e = new Ju.a();

        /* renamed from: Uu.Y$a$a, reason: collision with other inner class name */
        final class C0838a extends AtomicReference<Ju.b> implements io.reactivex.c, Ju.b {
            C0838a() {
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                a.this.a(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                a.this.b(this, th2);
            }

            @Override // Ju.b
            public void dispose() {
                Mu.d.a(this);
            }

            @Override // Ju.b
            public boolean isDisposed() {
                return Mu.d.b(get());
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38333g = true;
            this.f38332f.dispose();
            this.f38331e.dispose();
        }

        void a(a<T>.C0838a c0838a) {
            this.f38331e.a(c0838a);
            onComplete();
        }

        void b(a<T>.C0838a c0838a, Throwable th2) {
            this.f38331e.a(c0838a);
            onError(th2);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38332f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f38328b.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f38330d) {
                if (decrementAndGet() == 0) {
                    this.f38327a.onError(this.f38328b.b());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f38327a.onError(this.f38328b.b());
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.d dVar = (io.reactivex.d) Nu.b.e(this.f38329c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0838a c0838a = new C0838a();
                if (this.f38333g || !this.f38331e.b(c0838a)) {
                    return;
                }
                dVar.a(c0838a);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38332f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38332f, bVar)) {
                this.f38332f = bVar;
                this.f38327a.onSubscribe(this);
            }
        }

        a(io.reactivex.c cVar, Lu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
            this.f38327a = cVar;
            this.f38329c = oVar;
            this.f38330d = z10;
            lazySet(1);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thB = this.f38328b.b();
                if (thB != null) {
                    this.f38327a.onError(thB);
                } else {
                    this.f38327a.onComplete();
                }
            }
        }
    }

    @Override // Ou.a
    public io.reactivex.l<T> b() {
        return C13558a.o(new X(this.f38324a, this.f38325b, this.f38326c));
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        this.f38324a.subscribe(new a(cVar, this.f38325b, this.f38326c));
    }

    public Y(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
        this.f38324a = qVar;
        this.f38325b = oVar;
        this.f38326c = z10;
    }
}
