package Uu;

import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5420p<T, U extends Collection<? super T>> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final long f38727b;

    /* renamed from: c, reason: collision with root package name */
    final long f38728c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f38729d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f38730e;

    /* renamed from: f, reason: collision with root package name */
    final Callable<U> f38731f;

    /* renamed from: g, reason: collision with root package name */
    final int f38732g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f38733h;

    /* renamed from: Uu.p$a */
    static final class a<T, U extends Collection<? super T>> extends Pu.r<T, U, U> implements Runnable, Ju.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f38734g;

        /* renamed from: h, reason: collision with root package name */
        final long f38735h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f38736i;

        /* renamed from: j, reason: collision with root package name */
        final int f38737j;

        /* renamed from: k, reason: collision with root package name */
        final boolean f38738k;

        /* renamed from: l, reason: collision with root package name */
        final t.c f38739l;

        /* renamed from: m, reason: collision with root package name */
        U f38740m;

        /* renamed from: n, reason: collision with root package name */
        Ju.b f38741n;

        /* renamed from: o, reason: collision with root package name */
        Ju.b f38742o;

        /* renamed from: p, reason: collision with root package name */
        long f38743p;

        /* renamed from: q, reason: collision with root package name */
        long f38744q;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f38740m = null;
            }
            this.f27259b.onError(th2);
            this.f38739l.dispose();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0078
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // io.reactivex.s
        public void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U extends java.util.Collection<? super T> r0 = r7.f38740m     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto Lc
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                r8 = r0
                r1 = r7
                goto L76
            Lc:
                r0.add(r8)     // Catch: java.lang.Throwable -> L73
                int r8 = r0.size()     // Catch: java.lang.Throwable -> L73
                int r1 = r7.f38737j     // Catch: java.lang.Throwable -> L73
                if (r8 >= r1) goto L19
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L19:
                r8 = 0
                r7.f38740m = r8     // Catch: java.lang.Throwable -> L73
                long r1 = r7.f38743p     // Catch: java.lang.Throwable -> L73
                r3 = 1
                long r1 = r1 + r3
                r7.f38743p = r1     // Catch: java.lang.Throwable -> L73
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L73
                boolean r8 = r7.f38738k
                if (r8 == 0) goto L2d
                Ju.b r8 = r7.f38741n
                r8.dispose()
            L2d:
                r8 = 0
                r7.d(r0, r8, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.f38734g     // Catch: java.lang.Throwable -> L64
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L64
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = Nu.b.e(r8, r0)     // Catch: java.lang.Throwable -> L64
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L64
                monitor-enter(r7)
                r7.f38740m = r8     // Catch: java.lang.Throwable -> L5d
                long r0 = r7.f38744q     // Catch: java.lang.Throwable -> L5d
                long r0 = r0 + r3
                r7.f38744q = r0     // Catch: java.lang.Throwable -> L5d
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L5d
                boolean r8 = r7.f38738k
                if (r8 == 0) goto L5b
                io.reactivex.t$c r0 = r7.f38739l
                long r2 = r7.f38735h
                java.util.concurrent.TimeUnit r6 = r7.f38736i
                r4 = r2
                r1 = r7
                Ju.b r8 = r0.d(r1, r2, r4, r6)
                r1.f38741n = r8
                return
            L5b:
                r1 = r7
                return
            L5d:
                r0 = move-exception
                r1 = r7
            L5f:
                r8 = r0
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L62
                throw r8
            L62:
                r0 = move-exception
                goto L5f
            L64:
                r0 = move-exception
                r1 = r7
                r8 = r0
                Ku.a.b(r8)
                io.reactivex.s<? super V> r0 = r1.f27259b
                r0.onError(r8)
                r7.dispose()
                return
            L73:
                r0 = move-exception
                r1 = r7
            L75:
                r8 = r0
            L76:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
                throw r8
            L78:
                r0 = move-exception
                goto L75
            */
            throw new UnsupportedOperationException("Method not decompiled: Uu.C5420p.a.onNext(java.lang.Object):void");
        }

        a(io.reactivex.s<? super U> sVar, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, t.c cVar) {
            super(sVar, new Wu.a());
            this.f38734g = callable;
            this.f38735h = j10;
            this.f38736i = timeUnit;
            this.f38737j = i10;
            this.f38738k = z10;
            this.f38739l = cVar;
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f27261d) {
                return;
            }
            this.f27261d = true;
            this.f38742o.dispose();
            this.f38739l.dispose();
            synchronized (this) {
                this.f38740m = null;
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f27261d;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10;
            this.f38739l.dispose();
            synchronized (this) {
                u10 = this.f38740m;
                this.f38740m = null;
            }
            if (u10 != null) {
                this.f27260c.offer(u10);
                this.f27262e = true;
                if (a()) {
                    av.q.c(this.f27260c, this.f27259b, false, this, this);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38742o, bVar)) {
                this.f38742o = bVar;
                try {
                    this.f38740m = (U) Nu.b.e(this.f38734g.call(), "The buffer supplied is null");
                    this.f27259b.onSubscribe(this);
                    t.c cVar = this.f38739l;
                    long j10 = this.f38735h;
                    this.f38741n = cVar.d(this, j10, j10, this.f38736i);
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    bVar.dispose();
                    Mu.e.m(th2, this.f27259b);
                    this.f38739l.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) Nu.b.e(this.f38734g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u11 = this.f38740m;
                    if (u11 != null && this.f38743p == this.f38744q) {
                        this.f38740m = u10;
                        d(u11, false, this);
                    }
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                dispose();
                this.f27259b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Pu.r, av.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            sVar.onNext(u10);
        }
    }

    /* renamed from: Uu.p$b */
    static final class b<T, U extends Collection<? super T>> extends Pu.r<T, U, U> implements Runnable, Ju.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f38745g;

        /* renamed from: h, reason: collision with root package name */
        final long f38746h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f38747i;

        /* renamed from: j, reason: collision with root package name */
        final io.reactivex.t f38748j;

        /* renamed from: k, reason: collision with root package name */
        Ju.b f38749k;

        /* renamed from: l, reason: collision with root package name */
        U f38750l;

        /* renamed from: m, reason: collision with root package name */
        final AtomicReference<Ju.b> f38751m;

        @Override // io.reactivex.s
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.f38750l;
                this.f38750l = null;
            }
            if (u10 != null) {
                this.f27260c.offer(u10);
                this.f27262e = true;
                if (a()) {
                    av.q.c(this.f27260c, this.f27259b, false, null, this);
                }
            }
            Mu.d.a(this.f38751m);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f38750l = null;
            }
            this.f27259b.onError(th2);
            Mu.d.a(this.f38751m);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.f38750l;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        b(io.reactivex.s<? super U> sVar, Callable<U> callable, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
            super(sVar, new Wu.a());
            this.f38751m = new AtomicReference<>();
            this.f38745g = callable;
            this.f38746h = j10;
            this.f38747i = timeUnit;
            this.f38748j = tVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38751m);
            this.f38749k.dispose();
        }

        @Override // Pu.r, av.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            this.f27259b.onNext(u10);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38751m.get() == Mu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38749k, bVar)) {
                this.f38749k = bVar;
                try {
                    this.f38750l = (U) Nu.b.e(this.f38745g.call(), "The buffer supplied is null");
                    this.f27259b.onSubscribe(this);
                    if (!this.f27261d) {
                        io.reactivex.t tVar = this.f38748j;
                        long j10 = this.f38746h;
                        Ju.b bVarF = tVar.f(this, j10, j10, this.f38747i);
                        if (U.d.a(this.f38751m, null, bVarF)) {
                            return;
                        }
                        bVarF.dispose();
                    }
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    dispose();
                    Mu.e.m(th2, this.f27259b);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u10;
            try {
                U u11 = (U) Nu.b.e(this.f38745g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        u10 = this.f38750l;
                        if (u10 != null) {
                            this.f38750l = u11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u10 == null) {
                    Mu.d.a(this.f38751m);
                } else {
                    c(u10, false, this);
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f27259b.onError(th3);
                dispose();
            }
        }
    }

    /* renamed from: Uu.p$c */
    static final class c<T, U extends Collection<? super T>> extends Pu.r<T, U, U> implements Runnable, Ju.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f38752g;

        /* renamed from: h, reason: collision with root package name */
        final long f38753h;

        /* renamed from: i, reason: collision with root package name */
        final long f38754i;

        /* renamed from: j, reason: collision with root package name */
        final TimeUnit f38755j;

        /* renamed from: k, reason: collision with root package name */
        final t.c f38756k;

        /* renamed from: l, reason: collision with root package name */
        final List<U> f38757l;

        /* renamed from: m, reason: collision with root package name */
        Ju.b f38758m;

        /* renamed from: Uu.p$c$a */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f38759a;

            a(U u10) {
                this.f38759a = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f38757l.remove(this.f38759a);
                }
                c cVar = c.this;
                cVar.d(this.f38759a, false, cVar.f38756k);
            }
        }

        /* renamed from: Uu.p$c$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f38761a;

            b(U u10) {
                this.f38761a = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f38757l.remove(this.f38761a);
                }
                c cVar = c.this;
                cVar.d(this.f38761a, false, cVar.f38756k);
            }
        }

        void h() {
            synchronized (this) {
                this.f38757l.clear();
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f38757l);
                this.f38757l.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f27260c.offer((Collection) it.next());
            }
            this.f27262e = true;
            if (a()) {
                av.q.c(this.f27260c, this.f27259b, false, this.f38756k, this);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f27262e = true;
            h();
            this.f27259b.onError(th2);
            this.f38756k.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.f38757l.iterator();
                    while (it.hasNext()) {
                        it.next().add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        c(io.reactivex.s<? super U> sVar, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, t.c cVar) {
            super(sVar, new Wu.a());
            this.f38752g = callable;
            this.f38753h = j10;
            this.f38754i = j11;
            this.f38755j = timeUnit;
            this.f38756k = cVar;
            this.f38757l = new LinkedList();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f27261d) {
                return;
            }
            this.f27261d = true;
            h();
            this.f38758m.dispose();
            this.f38756k.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f27261d;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38758m, bVar)) {
                this.f38758m = bVar;
                try {
                    Collection collection = (Collection) Nu.b.e(this.f38752g.call(), "The buffer supplied is null");
                    this.f38757l.add(collection);
                    this.f27259b.onSubscribe(this);
                    t.c cVar = this.f38756k;
                    long j10 = this.f38754i;
                    cVar.d(this, j10, j10, this.f38755j);
                    this.f38756k.c(new b(collection), this.f38753h, this.f38755j);
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    bVar.dispose();
                    Mu.e.m(th2, this.f27259b);
                    this.f38756k.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27261d) {
                return;
            }
            try {
                Collection collection = (Collection) Nu.b.e(this.f38752g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.f27261d) {
                            return;
                        }
                        this.f38757l.add(collection);
                        this.f38756k.c(new a(collection), this.f38753h, this.f38755j);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f27259b.onError(th3);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Pu.r, av.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            sVar.onNext(u10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        if (this.f38727b == this.f38728c && this.f38732g == Integer.MAX_VALUE) {
            this.f38360a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f38731f, this.f38727b, this.f38729d, this.f38730e));
            return;
        }
        t.c cVarB = this.f38730e.b();
        if (this.f38727b == this.f38728c) {
            this.f38360a.subscribe(new a(new io.reactivex.observers.f(sVar), this.f38731f, this.f38727b, this.f38729d, this.f38732g, this.f38733h, cVarB));
        } else {
            this.f38360a.subscribe(new c(new io.reactivex.observers.f(sVar), this.f38731f, this.f38727b, this.f38728c, this.f38729d, cVarB));
        }
    }

    public C5420p(io.reactivex.q<T> qVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, Callable<U> callable, int i10, boolean z10) {
        super(qVar);
        this.f38727b = j10;
        this.f38728c = j11;
        this.f38729d = timeUnit;
        this.f38730e = tVar;
        this.f38731f = callable;
        this.f38732g = i10;
        this.f38733h = z10;
    }
}
