package Uu;

import cv.C13558a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5411m<T, U extends Collection<? super T>, Open, Close> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f38632b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.q<? extends Open> f38633c;

    /* renamed from: d, reason: collision with root package name */
    final Lu.o<? super Open, ? extends io.reactivex.q<? extends Close>> f38634d;

    /* renamed from: Uu.m$a */
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super C> f38635a;

        /* renamed from: b, reason: collision with root package name */
        final Callable<C> f38636b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends Open> f38637c;

        /* renamed from: d, reason: collision with root package name */
        final Lu.o<? super Open, ? extends io.reactivex.q<? extends Close>> f38638d;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f38642h;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f38644j;

        /* renamed from: k, reason: collision with root package name */
        long f38645k;

        /* renamed from: i, reason: collision with root package name */
        final Wu.c<C> f38643i = new Wu.c<>(io.reactivex.l.bufferSize());

        /* renamed from: e, reason: collision with root package name */
        final Ju.a f38639e = new Ju.a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Ju.b> f38640f = new AtomicReference<>();

        /* renamed from: l, reason: collision with root package name */
        Map<Long, C> f38646l = new LinkedHashMap();

        /* renamed from: g, reason: collision with root package name */
        final av.c f38641g = new av.c();

        /* renamed from: Uu.m$a$a, reason: collision with other inner class name */
        static final class C0842a<Open> extends AtomicReference<Ju.b> implements io.reactivex.s<Open>, Ju.b {

            /* renamed from: a, reason: collision with root package name */
            final a<?, ?, Open, ?> f38647a;

            @Override // io.reactivex.s
            public void onComplete() {
                lazySet(Mu.d.DISPOSED);
                this.f38647a.e(this);
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                lazySet(Mu.d.DISPOSED);
                this.f38647a.a(this, th2);
            }

            @Override // io.reactivex.s
            public void onNext(Open open) {
                this.f38647a.d(open);
            }

            C0842a(a<?, ?, Open, ?> aVar) {
                this.f38647a = aVar;
            }

            @Override // Ju.b
            public void dispose() {
                Mu.d.a(this);
            }

            @Override // Ju.b
            public boolean isDisposed() {
                if (get() == Mu.d.DISPOSED) {
                    return true;
                }
                return false;
            }

            @Override // io.reactivex.s
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f38646l;
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

        void a(Ju.b bVar, Throwable th2) {
            Mu.d.a(this.f38640f);
            this.f38639e.a(bVar);
            onError(th2);
        }

        void b(b<T, C> bVar, long j10) {
            boolean z10;
            this.f38639e.a(bVar);
            if (this.f38639e.f() == 0) {
                Mu.d.a(this.f38640f);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f38646l;
                    if (map == null) {
                        return;
                    }
                    this.f38643i.offer(map.remove(Long.valueOf(j10)));
                    if (z10) {
                        this.f38642h = true;
                    }
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void d(Open open) {
            try {
                Collection collection = (Collection) Nu.b.e(this.f38636b.call(), "The bufferSupplier returned a null Collection");
                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38638d.apply(open), "The bufferClose returned a null ObservableSource");
                long j10 = this.f38645k;
                this.f38645k = 1 + j10;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f38646l;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j10), collection);
                        b bVar = new b(this, j10);
                        this.f38639e.b(bVar);
                        qVar.subscribe(bVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                Mu.d.a(this.f38640f);
                onError(th3);
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (Mu.d.a(this.f38640f)) {
                this.f38644j = true;
                this.f38639e.dispose();
                synchronized (this) {
                    this.f38646l = null;
                }
                if (getAndIncrement() != 0) {
                    this.f38643i.clear();
                }
            }
        }

        void e(C0842a<Open> c0842a) {
            this.f38639e.a(c0842a);
            if (this.f38639e.f() == 0) {
                Mu.d.a(this.f38640f);
                this.f38642h = true;
                c();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f38640f.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38639e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f38646l;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f38643i.offer(it.next());
                    }
                    this.f38646l = null;
                    this.f38642h = true;
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f38641g.a(th2)) {
                C13558a.s(th2);
                return;
            }
            this.f38639e.dispose();
            synchronized (this) {
                this.f38646l = null;
            }
            this.f38642h = true;
            c();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this.f38640f, bVar)) {
                C0842a c0842a = new C0842a(this);
                this.f38639e.b(c0842a);
                this.f38637c.subscribe(c0842a);
            }
        }

        a(io.reactivex.s<? super C> sVar, io.reactivex.q<? extends Open> qVar, Lu.o<? super Open, ? extends io.reactivex.q<? extends Close>> oVar, Callable<C> callable) {
            this.f38635a = sVar;
            this.f38636b = callable;
            this.f38637c = qVar;
            this.f38638d = oVar;
        }

        void c() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super C> sVar = this.f38635a;
                Wu.c<C> cVar = this.f38643i;
                int iAddAndGet = 1;
                while (!this.f38644j) {
                    boolean z11 = this.f38642h;
                    if (z11 && this.f38641g.get() != null) {
                        cVar.clear();
                        sVar.onError(this.f38641g.b());
                        return;
                    }
                    C cPoll = cVar.poll();
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
                cVar.clear();
            }
        }
    }

    /* renamed from: Uu.m$b */
    static final class b<T, C extends Collection<? super T>> extends AtomicReference<Ju.b> implements io.reactivex.s<Object>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final a<T, C, ?, ?> f38648a;

        /* renamed from: b, reason: collision with root package name */
        final long f38649b;

        b(a<T, C, ?, ?> aVar, long j10) {
            this.f38648a = aVar;
            this.f38649b = j10;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == Mu.d.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Ju.b bVar = get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar != dVar) {
                lazySet(dVar);
                this.f38648a.b(this, this.f38649b);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Ju.b bVar = get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar != dVar) {
                lazySet(dVar);
                this.f38648a.a(this, th2);
            } else {
                C13558a.s(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            Ju.b bVar = get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar != dVar) {
                lazySet(dVar);
                bVar.dispose();
                this.f38648a.b(this, this.f38649b);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        a aVar = new a(sVar, this.f38633c, this.f38634d, this.f38632b);
        sVar.onSubscribe(aVar);
        this.f38360a.subscribe(aVar);
    }

    public C5411m(io.reactivex.q<T> qVar, io.reactivex.q<? extends Open> qVar2, Lu.o<? super Open, ? extends io.reactivex.q<? extends Close>> oVar, Callable<U> callable) {
        super(qVar);
        this.f38633c = qVar2;
        this.f38634d = oVar;
        this.f38632b = callable;
    }
}
