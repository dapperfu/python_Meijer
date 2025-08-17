package Yu;

import av.C6159c;
import gv.C14313a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5472m<T, U extends Collection<? super T>, Open, Close> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f41407b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.q<? extends Open> f41408c;

    /* renamed from: d, reason: collision with root package name */
    final Pu.o<? super Open, ? extends io.reactivex.q<? extends Close>> f41409d;

    /* renamed from: Yu.m$a */
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super C> f41410a;

        /* renamed from: b, reason: collision with root package name */
        final Callable<C> f41411b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends Open> f41412c;

        /* renamed from: d, reason: collision with root package name */
        final Pu.o<? super Open, ? extends io.reactivex.q<? extends Close>> f41413d;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f41417h;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f41419j;

        /* renamed from: k, reason: collision with root package name */
        long f41420k;

        /* renamed from: i, reason: collision with root package name */
        final C6159c<C> f41418i = new C6159c<>(io.reactivex.l.bufferSize());

        /* renamed from: e, reason: collision with root package name */
        final Nu.a f41414e = new Nu.a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Nu.b> f41415f = new AtomicReference<>();

        /* renamed from: l, reason: collision with root package name */
        Map<Long, C> f41421l = new LinkedHashMap();

        /* renamed from: g, reason: collision with root package name */
        final ev.c f41416g = new ev.c();

        /* renamed from: Yu.m$a$a, reason: collision with other inner class name */
        static final class C0885a<Open> extends AtomicReference<Nu.b> implements io.reactivex.s<Open>, Nu.b {

            /* renamed from: a, reason: collision with root package name */
            final a<?, ?, Open, ?> f41422a;

            @Override // io.reactivex.s
            public void onComplete() {
                lazySet(Qu.d.DISPOSED);
                this.f41422a.e(this);
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                lazySet(Qu.d.DISPOSED);
                this.f41422a.a(this, th2);
            }

            @Override // io.reactivex.s
            public void onNext(Open open) {
                this.f41422a.d(open);
            }

            C0885a(a<?, ?, Open, ?> aVar) {
                this.f41422a = aVar;
            }

            @Override // Nu.b
            public void dispose() {
                Qu.d.a(this);
            }

            @Override // Nu.b
            public boolean isDisposed() {
                if (get() == Qu.d.DISPOSED) {
                    return true;
                }
                return false;
            }

            @Override // io.reactivex.s
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f41421l;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void a(Nu.b bVar, Throwable th2) {
            Qu.d.a(this.f41415f);
            this.f41414e.c(bVar);
            onError(th2);
        }

        void b(b<T, C> bVar, long j10) {
            boolean z10;
            this.f41414e.c(bVar);
            if (this.f41414e.f() == 0) {
                Qu.d.a(this.f41415f);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f41421l;
                    if (map == null) {
                        return;
                    }
                    this.f41418i.offer(map.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.f41417h = true;
                    }
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void d(Open open) {
            try {
                Collection collection = (Collection) Ru.b.e(this.f41411b.call(), "The bufferSupplier returned a null Collection");
                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41413d.apply(open), "The bufferClose returned a null ObservableSource");
                long j10 = this.f41420k;
                this.f41420k = 1 + j10;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f41421l;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j10), collection);
                        b bVar = new b(this, j10);
                        this.f41414e.a(bVar);
                        qVar.subscribe(bVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                Qu.d.a(this.f41415f);
                onError(th3);
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (Qu.d.a(this.f41415f)) {
                this.f41419j = true;
                this.f41414e.dispose();
                synchronized (this) {
                    this.f41421l = null;
                }
                if (getAndIncrement() != 0) {
                    this.f41418i.clear();
                }
            }
        }

        void e(C0885a<Open> c0885a) {
            this.f41414e.c(c0885a);
            if (this.f41414e.f() == 0) {
                Qu.d.a(this.f41415f);
                this.f41417h = true;
                c();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f41415f.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41414e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f41421l;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f41418i.offer(it.next());
                    }
                    this.f41421l = null;
                    this.f41417h = true;
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f41416g.a(th2)) {
                C14313a.s(th2);
                return;
            }
            this.f41414e.dispose();
            synchronized (this) {
                this.f41421l = null;
            }
            this.f41417h = true;
            c();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this.f41415f, bVar)) {
                C0885a c0885a = new C0885a(this);
                this.f41414e.a(c0885a);
                this.f41412c.subscribe(c0885a);
            }
        }

        a(io.reactivex.s<? super C> sVar, io.reactivex.q<? extends Open> qVar, Pu.o<? super Open, ? extends io.reactivex.q<? extends Close>> oVar, Callable<C> callable) {
            this.f41410a = sVar;
            this.f41411b = callable;
            this.f41412c = qVar;
            this.f41413d = oVar;
        }

        void c() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super C> sVar = this.f41410a;
                C6159c<C> c6159c = this.f41418i;
                int iAddAndGet = 1;
                while (!this.f41419j) {
                    boolean z11 = this.f41417h;
                    if (z11 && this.f41416g.get() != null) {
                        c6159c.clear();
                        sVar.onError(this.f41416g.b());
                        return;
                    }
                    C cPoll = c6159c.poll();
                    if (cPoll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11 && z10) {
                        sVar.onComplete();
                        return;
                    } else if (z10) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        sVar.onNext(cPoll);
                    }
                }
                c6159c.clear();
            }
        }
    }

    /* renamed from: Yu.m$b */
    static final class b<T, C extends Collection<? super T>> extends AtomicReference<Nu.b> implements io.reactivex.s<Object>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final a<T, C, ?, ?> f41423a;

        /* renamed from: b, reason: collision with root package name */
        final long f41424b;

        b(a<T, C, ?, ?> aVar, long j10) {
            this.f41423a = aVar;
            this.f41424b = j10;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() == Qu.d.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Nu.b bVar = get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar != dVar) {
                lazySet(dVar);
                this.f41423a.b(this, this.f41424b);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Nu.b bVar = get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar != dVar) {
                lazySet(dVar);
                this.f41423a.a(this, th2);
            } else {
                C14313a.s(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            Nu.b bVar = get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar != dVar) {
                lazySet(dVar);
                bVar.dispose();
                this.f41423a.b(this, this.f41424b);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        a aVar = new a(sVar, this.f41408c, this.f41409d, this.f41407b);
        sVar.onSubscribe(aVar);
        this.f41135a.subscribe(aVar);
    }

    public C5472m(io.reactivex.q<T> qVar, io.reactivex.q<? extends Open> qVar2, Pu.o<? super Open, ? extends io.reactivex.q<? extends Close>> oVar, Callable<U> callable) {
        super(qVar);
        this.f41408c = qVar2;
        this.f41409d = oVar;
        this.f41407b = callable;
    }
}
