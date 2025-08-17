package Yu;

import A0.c;
import av.C6159c;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class Z<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.j<? extends R>> f41119b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f41120c;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41121a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f41122b;

        /* renamed from: f, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.j<? extends R>> f41126f;

        /* renamed from: h, reason: collision with root package name */
        Nu.b f41128h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f41129i;

        /* renamed from: c, reason: collision with root package name */
        final Nu.a f41123c = new Nu.a();

        /* renamed from: e, reason: collision with root package name */
        final ev.c f41125e = new ev.c();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f41124d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<C6159c<R>> f41127g = new AtomicReference<>();

        /* renamed from: Yu.Z$a$a, reason: collision with other inner class name */
        final class C0882a extends AtomicReference<Nu.b> implements io.reactivex.i<R>, Nu.b {
            C0882a() {
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

            @Override // Nu.b
            public void dispose() {
                Qu.d.a(this);
            }

            @Override // Nu.b
            public boolean isDisposed() {
                return Qu.d.b(get());
            }

            @Override // io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f41129i = true;
            this.f41128h.dispose();
            this.f41123c.dispose();
        }

        void a() {
            C6159c<R> c6159c = this.f41127g.get();
            if (c6159c != null) {
                c6159c.clear();
            }
        }

        void c() {
            io.reactivex.s<? super R> sVar = this.f41121a;
            AtomicInteger atomicInteger = this.f41124d;
            AtomicReference<C6159c<R>> atomicReference = this.f41127g;
            int iAddAndGet = 1;
            while (!this.f41129i) {
                if (!this.f41122b && this.f41125e.get() != null) {
                    Throwable thB = this.f41125e.b();
                    a();
                    sVar.onError(thB);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                C6159c<R> c6159c = atomicReference.get();
                c.f fVarPoll = c6159c != null ? c6159c.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11) {
                    Throwable thB2 = this.f41125e.b();
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

        C6159c<R> d() {
            C6159c<R> c6159c;
            do {
                C6159c<R> c6159c2 = this.f41127g.get();
                if (c6159c2 != null) {
                    return c6159c2;
                }
                c6159c = new C6159c<>(io.reactivex.l.bufferSize());
            } while (!U.d.a(this.f41127g, null, c6159c));
            return c6159c;
        }

        void e(a<T, R>.C0882a c0882a) {
            this.f41123c.c(c0882a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f41124d.decrementAndGet() == 0;
                    C6159c<R> c6159c = this.f41127g.get();
                    if (!z10 || (c6159c != null && !c6159c.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        c();
                        return;
                    } else {
                        Throwable thB = this.f41125e.b();
                        if (thB != null) {
                            this.f41121a.onError(thB);
                            return;
                        } else {
                            this.f41121a.onComplete();
                            return;
                        }
                    }
                }
            }
            this.f41124d.decrementAndGet();
            b();
        }

        void f(a<T, R>.C0882a c0882a, Throwable th2) {
            this.f41123c.c(c0882a);
            if (!this.f41125e.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f41122b) {
                this.f41128h.dispose();
                this.f41123c.dispose();
            }
            this.f41124d.decrementAndGet();
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void g(Yu.Z.a<T, R>.C0882a r3, R r4) {
            /*
                r2 = this;
                Nu.a r0 = r2.f41123c
                r0.c(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                io.reactivex.s<? super R> r1 = r2.f41121a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f41124d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<av.c<R>> r4 = r2.f41127g
                java.lang.Object r4 = r4.get()
                av.c r4 = (av.C6159c) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                ev.c r3 = r2.f41125e
                java.lang.Throwable r3 = r3.b()
                if (r3 == 0) goto L41
                io.reactivex.s<? super R> r4 = r2.f41121a
                r4.onError(r3)
                return
            L41:
                io.reactivex.s<? super R> r3 = r2.f41121a
                r3.onComplete()
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                goto L62
            L4e:
                av.c r3 = r2.d()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f41124d
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
            throw new UnsupportedOperationException("Method not decompiled: Yu.Z.a.g(Yu.Z$a$a, java.lang.Object):void");
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41129i;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41124d.decrementAndGet();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41124d.decrementAndGet();
            if (!this.f41125e.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f41122b) {
                this.f41123c.dispose();
            }
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.j jVar = (io.reactivex.j) Ru.b.e(this.f41126f.apply(t10), "The mapper returned a null MaybeSource");
                this.f41124d.getAndIncrement();
                C0882a c0882a = new C0882a();
                if (this.f41129i || !this.f41123c.a(c0882a)) {
                    return;
                }
                jVar.a(c0882a);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41128h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41128h, bVar)) {
                this.f41128h = bVar;
                this.f41121a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends io.reactivex.j<? extends R>> oVar, boolean z10) {
            this.f41121a = sVar;
            this.f41126f = oVar;
            this.f41122b = z10;
        }

        void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41119b, this.f41120c));
    }

    public Z(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.j<? extends R>> oVar, boolean z10) {
        super(qVar);
        this.f41119b = oVar;
        this.f41120c = z10;
    }
}
