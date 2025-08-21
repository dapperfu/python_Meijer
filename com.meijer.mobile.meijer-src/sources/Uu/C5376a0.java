package Uu;

import A0.c;
import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5376a0<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.y<? extends R>> f38361b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f38362c;

    /* renamed from: Uu.a0$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38363a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f38364b;

        /* renamed from: f, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.y<? extends R>> f38368f;

        /* renamed from: h, reason: collision with root package name */
        Ju.b f38370h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f38371i;

        /* renamed from: c, reason: collision with root package name */
        final Ju.a f38365c = new Ju.a();

        /* renamed from: e, reason: collision with root package name */
        final av.c f38367e = new av.c();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f38366d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<Wu.c<R>> f38369g = new AtomicReference<>();

        /* renamed from: Uu.a0$a$a, reason: collision with other inner class name */
        final class C0840a extends AtomicReference<Ju.b> implements io.reactivex.w<R>, Ju.b {
            C0840a() {
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                a.this.e(this, th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(R r10) {
                a.this.f(this, r10);
            }

            @Override // Ju.b
            public void dispose() {
                Mu.d.a(this);
            }

            @Override // Ju.b
            public boolean isDisposed() {
                return Mu.d.b(get());
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38371i = true;
            this.f38370h.dispose();
            this.f38365c.dispose();
        }

        void a() {
            Wu.c<R> cVar = this.f38369g.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        void c() {
            io.reactivex.s<? super R> sVar = this.f38363a;
            AtomicInteger atomicInteger = this.f38366d;
            AtomicReference<Wu.c<R>> atomicReference = this.f38369g;
            int iAddAndGet = 1;
            while (!this.f38371i) {
                if (!this.f38364b && this.f38367e.get() != null) {
                    Throwable thB = this.f38367e.b();
                    a();
                    sVar.onError(thB);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                Wu.c<R> cVar = atomicReference.get();
                c.f fVarPoll = cVar != null ? cVar.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11) {
                    Throwable thB2 = this.f38367e.b();
                    if (thB2 != null) {
                        sVar.onError(thB2);
                        return;
                    } else {
                        sVar.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    sVar.onNext(fVarPoll);
                }
            }
            a();
        }

        Wu.c<R> d() {
            Wu.c<R> cVar;
            do {
                Wu.c<R> cVar2 = this.f38369g.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new Wu.c<>(io.reactivex.l.bufferSize());
            } while (!U.d.a(this.f38369g, null, cVar));
            return cVar;
        }

        void e(a<T, R>.C0840a c0840a, Throwable th2) {
            this.f38365c.a(c0840a);
            if (!this.f38367e.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f38364b) {
                this.f38370h.dispose();
                this.f38365c.dispose();
            }
            this.f38366d.decrementAndGet();
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void f(Uu.C5376a0.a<T, R>.C0840a r3, R r4) {
            /*
                r2 = this;
                Ju.a r0 = r2.f38365c
                r0.a(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                io.reactivex.s<? super R> r1 = r2.f38363a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f38366d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<Wu.c<R>> r4 = r2.f38369g
                java.lang.Object r4 = r4.get()
                Wu.c r4 = (Wu.c) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                av.c r3 = r2.f38367e
                java.lang.Throwable r3 = r3.b()
                if (r3 == 0) goto L41
                io.reactivex.s<? super R> r4 = r2.f38363a
                r4.onError(r3)
                return
            L41:
                io.reactivex.s<? super R> r3 = r2.f38363a
                r3.onComplete()
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                goto L62
            L4e:
                Wu.c r3 = r2.d()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f38366d
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L63
            L62:
                return
            L63:
                r2.c()
                return
            L67:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Uu.C5376a0.a.f(Uu.a0$a$a, java.lang.Object):void");
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38371i;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38366d.decrementAndGet();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38366d.decrementAndGet();
            if (!this.f38367e.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f38364b) {
                this.f38365c.dispose();
            }
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) Nu.b.e(this.f38368f.apply(t10), "The mapper returned a null SingleSource");
                this.f38366d.getAndIncrement();
                C0840a c0840a = new C0840a();
                if (this.f38371i || !this.f38365c.b(c0840a)) {
                    return;
                }
                yVar.a(c0840a);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38370h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38370h, bVar)) {
                this.f38370h = bVar;
                this.f38363a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10) {
            this.f38363a = sVar;
            this.f38368f = oVar;
            this.f38364b = z10;
        }

        void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38361b, this.f38362c));
    }

    public C5376a0(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10) {
        super(qVar);
        this.f38361b = oVar;
        this.f38362c = z10;
    }
}
