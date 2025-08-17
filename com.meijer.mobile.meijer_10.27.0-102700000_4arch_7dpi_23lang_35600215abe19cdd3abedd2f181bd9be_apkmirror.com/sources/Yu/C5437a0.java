package Yu;

import A0.c;
import av.C6159c;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.a0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5437a0<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.y<? extends R>> f41136b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f41137c;

    /* renamed from: Yu.a0$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41138a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f41139b;

        /* renamed from: f, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.y<? extends R>> f41143f;

        /* renamed from: h, reason: collision with root package name */
        Nu.b f41145h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f41146i;

        /* renamed from: c, reason: collision with root package name */
        final Nu.a f41140c = new Nu.a();

        /* renamed from: e, reason: collision with root package name */
        final ev.c f41142e = new ev.c();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f41141d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<C6159c<R>> f41144g = new AtomicReference<>();

        /* renamed from: Yu.a0$a$a, reason: collision with other inner class name */
        final class C0883a extends AtomicReference<Nu.b> implements io.reactivex.w<R>, Nu.b {
            C0883a() {
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                a.this.e(this, th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(R r10) {
                a.this.f(this, r10);
            }

            @Override // Nu.b
            public void dispose() {
                Qu.d.a(this);
            }

            @Override // Nu.b
            public boolean isDisposed() {
                return Qu.d.b(get());
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f41146i = true;
            this.f41145h.dispose();
            this.f41140c.dispose();
        }

        void a() {
            C6159c<R> c6159c = this.f41144g.get();
            if (c6159c != null) {
                c6159c.clear();
            }
        }

        void c() {
            io.reactivex.s<? super R> sVar = this.f41138a;
            AtomicInteger atomicInteger = this.f41141d;
            AtomicReference<C6159c<R>> atomicReference = this.f41144g;
            int iAddAndGet = 1;
            while (!this.f41146i) {
                if (!this.f41139b && this.f41142e.get() != null) {
                    Throwable thB = this.f41142e.b();
                    a();
                    sVar.onError(thB);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                C6159c<R> c6159c = atomicReference.get();
                c.f fVarPoll = c6159c != null ? c6159c.poll() : null;
                boolean z11 = fVarPoll == null;
                if (z10 && z11) {
                    Throwable thB2 = this.f41142e.b();
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
                C6159c<R> c6159c2 = this.f41144g.get();
                if (c6159c2 != null) {
                    return c6159c2;
                }
                c6159c = new C6159c<>(io.reactivex.l.bufferSize());
            } while (!U.d.a(this.f41144g, null, c6159c));
            return c6159c;
        }

        void e(a<T, R>.C0883a c0883a, Throwable th2) {
            this.f41140c.c(c0883a);
            if (!this.f41142e.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f41139b) {
                this.f41145h.dispose();
                this.f41140c.dispose();
            }
            this.f41141d.decrementAndGet();
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void f(Yu.C5437a0.a<T, R>.C0883a r3, R r4) {
            /*
                r2 = this;
                Nu.a r0 = r2.f41140c
                r0.c(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                io.reactivex.s<? super R> r1 = r2.f41138a
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f41141d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<av.c<R>> r4 = r2.f41144g
                java.lang.Object r4 = r4.get()
                av.c r4 = (av.C6159c) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                ev.c r3 = r2.f41142e
                java.lang.Throwable r3 = r3.b()
                if (r3 == 0) goto L41
                io.reactivex.s<? super R> r4 = r2.f41138a
                r4.onError(r3)
                return
            L41:
                io.reactivex.s<? super R> r3 = r2.f41138a
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
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f41141d
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
            throw new UnsupportedOperationException("Method not decompiled: Yu.C5437a0.a.f(Yu.a0$a$a, java.lang.Object):void");
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41146i;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41141d.decrementAndGet();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41141d.decrementAndGet();
            if (!this.f41142e.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f41139b) {
                this.f41140c.dispose();
            }
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) Ru.b.e(this.f41143f.apply(t10), "The mapper returned a null SingleSource");
                this.f41141d.getAndIncrement();
                C0883a c0883a = new C0883a();
                if (this.f41146i || !this.f41140c.a(c0883a)) {
                    return;
                }
                yVar.a(c0883a);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41145h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41145h, bVar)) {
                this.f41145h = bVar;
                this.f41138a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10) {
            this.f41138a = sVar;
            this.f41143f = oVar;
            this.f41139b = z10;
        }

        void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41136b, this.f41137c));
    }

    public C5437a0(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, boolean z10) {
        super(qVar);
        this.f41136b = oVar;
        this.f41137c = z10;
    }
}
