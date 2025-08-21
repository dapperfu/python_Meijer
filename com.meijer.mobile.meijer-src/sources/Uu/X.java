package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class X<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.d> f38303b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f38304c;

    static final class a<T> extends Pu.b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38305a;

        /* renamed from: c, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.d> f38307c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f38308d;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f38310f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38311g;

        /* renamed from: b, reason: collision with root package name */
        final av.c f38306b = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final Ju.a f38309e = new Ju.a();

        /* renamed from: Uu.X$a$a, reason: collision with other inner class name */
        final class C0837a extends AtomicReference<Ju.b> implements io.reactivex.c, Ju.b {
            C0837a() {
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                a.this.b(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                a.this.c(this, th2);
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

        @Override // Ou.f
        public void clear() {
        }

        @Override // Ju.b
        public void dispose() {
            this.f38311g = true;
            this.f38310f.dispose();
            this.f38309e.dispose();
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return true;
        }

        @Override // Ou.f
        public T poll() throws Exception {
            return null;
        }

        @Override // Ou.c
        public int a(int i10) {
            return i10 & 2;
        }

        void b(a<T>.C0837a c0837a) {
            this.f38309e.a(c0837a);
            onComplete();
        }

        void c(a<T>.C0837a c0837a, Throwable th2) {
            this.f38309e.a(c0837a);
            onError(th2);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38310f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f38306b.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f38308d) {
                if (decrementAndGet() == 0) {
                    this.f38305a.onError(this.f38306b.b());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f38305a.onError(this.f38306b.b());
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.d dVar = (io.reactivex.d) Nu.b.e(this.f38307c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0837a c0837a = new C0837a();
                if (this.f38311g || !this.f38309e.b(c0837a)) {
                    return;
                }
                dVar.a(c0837a);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38310f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38310f, bVar)) {
                this.f38310f = bVar;
                this.f38305a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
            this.f38305a = sVar;
            this.f38307c = oVar;
            this.f38308d = z10;
            lazySet(1);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thB = this.f38306b.b();
                if (thB != null) {
                    this.f38305a.onError(thB);
                } else {
                    this.f38305a.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38303b, this.f38304c));
    }

    public X(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
        super(qVar);
        this.f38303b = oVar;
        this.f38304c = z10;
    }
}
