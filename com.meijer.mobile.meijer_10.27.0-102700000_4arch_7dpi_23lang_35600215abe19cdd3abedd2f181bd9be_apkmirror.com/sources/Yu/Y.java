package Yu;

import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class Y<T> extends io.reactivex.b implements Su.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41099a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.d> f41100b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f41101c;

    static final class a<T> extends AtomicInteger implements Nu.b, io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f41102a;

        /* renamed from: c, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.d> f41104c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f41105d;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f41107f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41108g;

        /* renamed from: b, reason: collision with root package name */
        final ev.c f41103b = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final Nu.a f41106e = new Nu.a();

        /* renamed from: Yu.Y$a$a, reason: collision with other inner class name */
        final class C0881a extends AtomicReference<Nu.b> implements io.reactivex.c, Nu.b {
            C0881a() {
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                a.this.a(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                a.this.b(this, th2);
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

        @Override // Nu.b
        public void dispose() {
            this.f41108g = true;
            this.f41107f.dispose();
            this.f41106e.dispose();
        }

        void a(a<T>.C0881a c0881a) {
            this.f41106e.c(c0881a);
            onComplete();
        }

        void b(a<T>.C0881a c0881a, Throwable th2) {
            this.f41106e.c(c0881a);
            onError(th2);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41107f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f41103b.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f41105d) {
                if (decrementAndGet() == 0) {
                    this.f41102a.onError(this.f41103b.b());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f41102a.onError(this.f41103b.b());
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.d dVar = (io.reactivex.d) Ru.b.e(this.f41104c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0881a c0881a = new C0881a();
                if (this.f41108g || !this.f41106e.a(c0881a)) {
                    return;
                }
                dVar.a(c0881a);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41107f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41107f, bVar)) {
                this.f41107f = bVar;
                this.f41102a.onSubscribe(this);
            }
        }

        a(io.reactivex.c cVar, Pu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
            this.f41102a = cVar;
            this.f41104c = oVar;
            this.f41105d = z10;
            lazySet(1);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thB = this.f41103b.b();
                if (thB != null) {
                    this.f41102a.onError(thB);
                } else {
                    this.f41102a.onComplete();
                }
            }
        }
    }

    @Override // Su.a
    public io.reactivex.l<T> b() {
        return C14313a.o(new X(this.f41099a, this.f41100b, this.f41101c));
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        this.f41099a.subscribe(new a(cVar, this.f41100b, this.f41101c));
    }

    public Y(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
        this.f41099a = qVar;
        this.f41100b = oVar;
        this.f41101c = z10;
    }
}
