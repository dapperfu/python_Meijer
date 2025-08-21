package Uu;

import A0.c;
import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class Z<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.j<? extends R>> f38344b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f38345c;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38346a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f38347b;

        /* renamed from: f, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.j<? extends R>> f38351f;

        /* renamed from: h, reason: collision with root package name */
        Ju.b f38353h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f38354i;

        /* renamed from: c, reason: collision with root package name */
        final Ju.a f38348c = new Ju.a();

        /* renamed from: e, reason: collision with root package name */
        final av.c f38350e = new av.c();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f38349d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<Wu.c<R>> f38352g = new AtomicReference<>();

        /* renamed from: Uu.Z$a$a, reason: collision with other inner class name */
        final class C0839a extends AtomicReference<Ju.b> implements io.reactivex.i<R>, Ju.b {
            C0839a() {
            }

            @Override // io.reactivex.i
            public void onComplete() {
                a.this.e(this);
            }

            @Override // io.reactivex.i
            public void onError(Throwable th2) {
                a.this.f(this, th2);
            }

            @Override // io.reactivex.i
            public void onSuccess(R r10) {
                a.this.g(this, r10);
            }

            @Override // Ju.b
            public void dispose() {
                Mu.d.a(this);
            }

            @Override // Ju.b
            public boolean isDisposed() {
                return Mu.d.b(get());
            }

            @Override // io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38354i = true;
            this.f38353h.dispose();
            this.f38348c.dispose();
        }

        void a() {
            Wu.c<R> cVar = this.f38352g.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        void c() {
            io.reactivex.s<? super R> sVar = this.f38346a;
            AtomicInteger atomicInteger = this.f38349d;
            AtomicReference<Wu.c<R>> atomicReference = this.f38352g;
            int iAddAndGet = 1;
            while (!this.f38354i) {
                if (!this.f38347b && this.f38350e.get() != null) {
                    Throwable thB = this.f38350e.b();
                    a();
                    sVar.onError(thB);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                Wu.c<R> cVar = atomicReference.get();
                c.f fVarPoll = cVar != null ? cVar.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11) {
                    Throwable thB2 = this.f38350e.b();
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
                Wu.c<R> cVar2 = this.f38352g.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new Wu.c<>(io.reactivex.l.bufferSize());
            } while (!U.d.a(this.f38352g, null, cVar));
            return cVar;
        }

        void e(a<T, R>.C0839a c0839a) {
            this.f38348c.a(c0839a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f38349d.decrementAndGet() == 0;
                    Wu.c<R> cVar = this.f38352g.get();
                    if (!z10 || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        c();
                        return;
                    } else {
                        Throwable thB = this.f38350e.b();
                        if (thB != null) {
                            this.f38346a.onError(thB);
                            return;
                        } else {
                            this.f38346a.onComplete();
                            return;
                        }
                    }
                }
            }
            this.f38349d.decrementAndGet();
            b();
        }

        void f(a<T, R>.C0839a c0839a, Throwable th2) {
            this.f38348c.a(c0839a);
            if (!this.f38350e.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f38347b) {
                this.f38353h.dispose();
                this.f38348c.dispose();
            }
            this.f38349d.decrementAndGet();
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void g(Uu.Z.a<T, R>.C0839a r3, R r4) {
            /*
                r2 = this;
                Ju.a r0 = r2.f38348c
                r0.a(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                io.reactivex.s<? super R> r1 = r2.f38346a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f38349d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<Wu.c<R>> r4 = r2.f38352g
                java.lang.Object r4 = r4.get()
                Wu.c r4 = (Wu.c) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                av.c r3 = r2.f38350e
                java.lang.Throwable r3 = r3.b()
                if (r3 == 0) goto L41
                io.reactivex.s<? super R> r4 = r2.f38346a
                r4.onError(r3)
                return
            L41:
                io.reactivex.s<? super R> r3 = r2.f38346a
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
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f38349d
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
            throw new UnsupportedOperationException("Method not decompiled: Uu.Z.a.g(Uu.Z$a$a, java.lang.Object):void");
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38354i;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38349d.decrementAndGet();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38349d.decrementAndGet();
            if (!this.f38350e.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f38347b) {
                this.f38348c.dispose();
            }
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.j jVar = (io.reactivex.j) Nu.b.e(this.f38351f.apply(t10), "The mapper returned a null MaybeSource");
                this.f38349d.getAndIncrement();
                C0839a c0839a = new C0839a();
                if (this.f38354i || !this.f38348c.b(c0839a)) {
                    return;
                }
                jVar.a(c0839a);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38353h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38353h, bVar)) {
                this.f38353h = bVar;
                this.f38346a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends io.reactivex.j<? extends R>> oVar, boolean z10) {
            this.f38346a = sVar;
            this.f38351f = oVar;
            this.f38347b = z10;
        }

        void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38344b, this.f38345c));
    }

    public Z(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.j<? extends R>> oVar, boolean z10) {
        super(qVar);
        this.f38344b = oVar;
        this.f38345c = z10;
    }
}
