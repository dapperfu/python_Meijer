package Yu;

import gv.C14313a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class X<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.d> f41078b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f41079c;

    static final class a<T> extends Tu.b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41080a;

        /* renamed from: c, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.d> f41082c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f41083d;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f41085f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41086g;

        /* renamed from: b, reason: collision with root package name */
        final ev.c f41081b = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final Nu.a f41084e = new Nu.a();

        /* renamed from: Yu.X$a$a, reason: collision with other inner class name */
        final class C0880a extends AtomicReference<Nu.b> implements io.reactivex.c, Nu.b {
            C0880a() {
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                a.this.b(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                a.this.c(this, th2);
            }

            @Override // Nu.b
            public void dispose() {
                Qu.d.a(this);
            }

            @Override // Nu.b
            public boolean isDisposed() {
                return Qu.d.b(get());
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // Su.f
        public void clear() {
        }

        @Override // Nu.b
        public void dispose() {
            this.f41086g = true;
            this.f41085f.dispose();
            this.f41084e.dispose();
        }

        @Override // Su.f
        public boolean isEmpty() {
            return true;
        }

        @Override // Su.f
        public T poll() throws Exception {
            return null;
        }

        @Override // Su.c
        public int a(int i10) {
            return i10 & 2;
        }

        void b(a<T>.C0880a c0880a) {
            this.f41084e.c(c0880a);
            onComplete();
        }

        void c(a<T>.C0880a c0880a, Throwable th2) {
            this.f41084e.c(c0880a);
            onError(th2);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41085f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f41081b.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f41083d) {
                if (decrementAndGet() == 0) {
                    this.f41080a.onError(this.f41081b.b());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f41080a.onError(this.f41081b.b());
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.d dVar = (io.reactivex.d) Ru.b.e(this.f41082c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0880a c0880a = new C0880a();
                if (this.f41086g || !this.f41084e.a(c0880a)) {
                    return;
                }
                dVar.a(c0880a);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41085f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41085f, bVar)) {
                this.f41085f = bVar;
                this.f41080a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
            this.f41080a = sVar;
            this.f41082c = oVar;
            this.f41083d = z10;
            lazySet(1);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thB = this.f41081b.b();
                if (thB != null) {
                    this.f41080a.onError(thB);
                } else {
                    this.f41080a.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41078b, this.f41079c));
    }

    public X(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
        super(qVar);
        this.f41078b = oVar;
        this.f41079c = z10;
    }
}
