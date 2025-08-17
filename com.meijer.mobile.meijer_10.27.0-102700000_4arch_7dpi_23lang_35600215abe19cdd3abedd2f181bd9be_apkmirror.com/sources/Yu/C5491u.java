package Yu;

import A0.c;
import av.C6159c;
import gv.C14313a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5491u<T, U> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.q<? extends U>> f41666b;

    /* renamed from: c, reason: collision with root package name */
    final int f41667c;

    /* renamed from: d, reason: collision with root package name */
    final ev.i f41668d;

    /* renamed from: Yu.u$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41669a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41670b;

        /* renamed from: c, reason: collision with root package name */
        final int f41671c;

        /* renamed from: d, reason: collision with root package name */
        final ev.c f41672d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final C0887a<R> f41673e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f41674f;

        /* renamed from: g, reason: collision with root package name */
        Su.f<T> f41675g;

        /* renamed from: h, reason: collision with root package name */
        Nu.b f41676h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f41677i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f41678j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f41679k;

        /* renamed from: l, reason: collision with root package name */
        int f41680l;

        /* renamed from: Yu.u$a$a, reason: collision with other inner class name */
        static final class C0887a<R> extends AtomicReference<Nu.b> implements io.reactivex.s<R> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.s<? super R> f41681a;

            /* renamed from: b, reason: collision with root package name */
            final a<?, R> f41682b;

            @Override // io.reactivex.s
            public void onComplete() {
                a<?, R> aVar = this.f41682b;
                aVar.f41677i = false;
                aVar.a();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                a<?, R> aVar = this.f41682b;
                if (!aVar.f41672d.a(th2)) {
                    C14313a.s(th2);
                    return;
                }
                if (!aVar.f41674f) {
                    aVar.f41676h.dispose();
                }
                aVar.f41677i = false;
                aVar.a();
            }

            @Override // io.reactivex.s
            public void onNext(R r10) {
                this.f41681a.onNext(r10);
            }

            C0887a(io.reactivex.s<? super R> sVar, a<?, R> aVar) {
                this.f41681a = sVar;
                this.f41682b = aVar;
            }

            void a() {
                Qu.d.a(this);
            }

            @Override // io.reactivex.s
            public void onSubscribe(Nu.b bVar) {
                Qu.d.e(this, bVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f41679k = true;
            this.f41676h.dispose();
            this.f41673e.a();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41678j = true;
            a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41679k;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f41672d.a(th2)) {
                C14313a.s(th2);
            } else {
                this.f41678j = true;
                a();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41680l == 0) {
                this.f41675g.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41676h, bVar)) {
                this.f41676h = bVar;
                if (bVar instanceof Su.b) {
                    Su.b bVar2 = (Su.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f41680l = iA;
                        this.f41675g = bVar2;
                        this.f41678j = true;
                        this.f41669a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.f41680l = iA;
                        this.f41675g = bVar2;
                        this.f41669a.onSubscribe(this);
                        return;
                    }
                }
                this.f41675g = new C6159c(this.f41671c);
                this.f41669a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, boolean z10) {
            this.f41669a = sVar;
            this.f41670b = oVar;
            this.f41671c = i10;
            this.f41674f = z10;
            this.f41673e = new C0887a<>(sVar, this);
        }

        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super R> sVar = this.f41669a;
                Su.f<T> fVar = this.f41675g;
                ev.c cVar = this.f41672d;
                while (true) {
                    if (!this.f41677i) {
                        if (this.f41679k) {
                            fVar.clear();
                            return;
                        }
                        if (!this.f41674f && cVar.get() != null) {
                            fVar.clear();
                            this.f41679k = true;
                            sVar.onError(cVar.b());
                            return;
                        }
                        boolean z11 = this.f41678j;
                        try {
                            T tPoll = fVar.poll();
                            if (tPoll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z11 && z10) {
                                this.f41679k = true;
                                Throwable thB = cVar.b();
                                if (thB != null) {
                                    sVar.onError(thB);
                                    return;
                                } else {
                                    sVar.onComplete();
                                    return;
                                }
                            }
                            if (!z10) {
                                try {
                                    io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41670b.apply(tPoll), "The mapper returned a null ObservableSource");
                                    if (qVar instanceof Callable) {
                                        try {
                                            c.e eVar = (Object) ((Callable) qVar).call();
                                            if (eVar != null && !this.f41679k) {
                                                sVar.onNext(eVar);
                                            }
                                        } catch (Throwable th2) {
                                            Ou.a.b(th2);
                                            cVar.a(th2);
                                        }
                                    } else {
                                        this.f41677i = true;
                                        qVar.subscribe(this.f41673e);
                                    }
                                } catch (Throwable th3) {
                                    Ou.a.b(th3);
                                    this.f41679k = true;
                                    this.f41676h.dispose();
                                    fVar.clear();
                                    cVar.a(th3);
                                    sVar.onError(cVar.b());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Ou.a.b(th4);
                            this.f41679k = true;
                            this.f41676h.dispose();
                            cVar.a(th4);
                            sVar.onError(cVar.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: Yu.u$b */
    static final class b<T, U> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f41683a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<? extends U>> f41684b;

        /* renamed from: c, reason: collision with root package name */
        final a<U> f41685c;

        /* renamed from: d, reason: collision with root package name */
        final int f41686d;

        /* renamed from: e, reason: collision with root package name */
        Su.f<T> f41687e;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f41688f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41689g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f41690h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f41691i;

        /* renamed from: j, reason: collision with root package name */
        int f41692j;

        /* renamed from: Yu.u$b$a */
        static final class a<U> extends AtomicReference<Nu.b> implements io.reactivex.s<U> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.s<? super U> f41693a;

            /* renamed from: b, reason: collision with root package name */
            final b<?, ?> f41694b;

            @Override // io.reactivex.s
            public void onComplete() {
                this.f41694b.b();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                this.f41694b.dispose();
                this.f41693a.onError(th2);
            }

            @Override // io.reactivex.s
            public void onNext(U u10) {
                this.f41693a.onNext(u10);
            }

            a(io.reactivex.s<? super U> sVar, b<?, ?> bVar) {
                this.f41693a = sVar;
                this.f41694b = bVar;
            }

            void a() {
                Qu.d.a(this);
            }

            @Override // io.reactivex.s
            public void onSubscribe(Nu.b bVar) {
                Qu.d.e(this, bVar);
            }
        }

        void b() {
            this.f41689g = false;
            a();
        }

        @Override // Nu.b
        public void dispose() {
            this.f41690h = true;
            this.f41685c.a();
            this.f41688f.dispose();
            if (getAndIncrement() == 0) {
                this.f41687e.clear();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41690h;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41691i) {
                return;
            }
            this.f41691i = true;
            a();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41691i) {
                C14313a.s(th2);
                return;
            }
            this.f41691i = true;
            dispose();
            this.f41683a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41691i) {
                return;
            }
            if (this.f41692j == 0) {
                this.f41687e.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41688f, bVar)) {
                this.f41688f = bVar;
                if (bVar instanceof Su.b) {
                    Su.b bVar2 = (Su.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f41692j = iA;
                        this.f41687e = bVar2;
                        this.f41691i = true;
                        this.f41683a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.f41692j = iA;
                        this.f41687e = bVar2;
                        this.f41683a.onSubscribe(this);
                        return;
                    }
                }
                this.f41687e = new C6159c(this.f41686d);
                this.f41683a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super U> sVar, Pu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, int i10) {
            this.f41683a = sVar;
            this.f41684b = oVar;
            this.f41686d = i10;
            this.f41685c = new a<>(sVar, this);
        }

        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                while (!this.f41690h) {
                    if (!this.f41689g) {
                        boolean z11 = this.f41691i;
                        try {
                            T tPoll = this.f41687e.poll();
                            if (tPoll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z11 && z10) {
                                this.f41690h = true;
                                this.f41683a.onComplete();
                                return;
                            } else if (!z10) {
                                try {
                                    io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41684b.apply(tPoll), "The mapper returned a null ObservableSource");
                                    this.f41689g = true;
                                    qVar.subscribe(this.f41685c);
                                } catch (Throwable th2) {
                                    Ou.a.b(th2);
                                    dispose();
                                    this.f41687e.clear();
                                    this.f41683a.onError(th2);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Ou.a.b(th3);
                            dispose();
                            this.f41687e.clear();
                            this.f41683a.onError(th3);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f41687e.clear();
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        if (Z0.b(this.f41135a, sVar, this.f41666b)) {
            return;
        }
        if (this.f41668d == ev.i.IMMEDIATE) {
            this.f41135a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f41666b, this.f41667c));
        } else {
            this.f41135a.subscribe(new a(sVar, this.f41666b, this.f41667c, this.f41668d == ev.i.END));
        }
    }

    public C5491u(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, int i10, ev.i iVar) {
        super(qVar);
        this.f41666b = oVar;
        this.f41668d = iVar;
        this.f41667c = Math.max(8, i10);
    }
}
