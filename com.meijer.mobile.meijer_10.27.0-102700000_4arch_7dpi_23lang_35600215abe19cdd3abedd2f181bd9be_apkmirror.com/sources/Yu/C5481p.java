package Yu;

import av.C6157a;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5481p<T, U extends Collection<? super T>> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final long f41502b;

    /* renamed from: c, reason: collision with root package name */
    final long f41503c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f41504d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f41505e;

    /* renamed from: f, reason: collision with root package name */
    final Callable<U> f41506f;

    /* renamed from: g, reason: collision with root package name */
    final int f41507g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f41508h;

    /* renamed from: Yu.p$a */
    static final class a<T, U extends Collection<? super T>> extends Tu.r<T, U, U> implements Runnable, Nu.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f41509g;

        /* renamed from: h, reason: collision with root package name */
        final long f41510h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f41511i;

        /* renamed from: j, reason: collision with root package name */
        final int f41512j;

        /* renamed from: k, reason: collision with root package name */
        final boolean f41513k;

        /* renamed from: l, reason: collision with root package name */
        final t.c f41514l;

        /* renamed from: m, reason: collision with root package name */
        U f41515m;

        /* renamed from: n, reason: collision with root package name */
        Nu.b f41516n;

        /* renamed from: o, reason: collision with root package name */
        Nu.b f41517o;

        /* renamed from: p, reason: collision with root package name */
        long f41518p;

        /* renamed from: q, reason: collision with root package name */
        long f41519q;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f41515m = null;
            }
            this.f35487b.onError(th2);
            this.f41514l.dispose();
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
                U extends java.util.Collection<? super T> r0 = r7.f41515m     // Catch: java.lang.Throwable -> L73
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
                int r1 = r7.f41512j     // Catch: java.lang.Throwable -> L73
                if (r8 >= r1) goto L19
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
                return
            L19:
                r8 = 0
                r7.f41515m = r8     // Catch: java.lang.Throwable -> L73
                long r1 = r7.f41518p     // Catch: java.lang.Throwable -> L73
                r3 = 1
                long r1 = r1 + r3
                r7.f41518p = r1     // Catch: java.lang.Throwable -> L73
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L73
                boolean r8 = r7.f41513k
                if (r8 == 0) goto L2d
                Nu.b r8 = r7.f41516n
                r8.dispose()
            L2d:
                r8 = 0
                r7.d(r0, r8, r7)
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r8 = r7.f41509g     // Catch: java.lang.Throwable -> L64
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L64
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = Ru.b.e(r8, r0)     // Catch: java.lang.Throwable -> L64
                java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L64
                monitor-enter(r7)
                r7.f41515m = r8     // Catch: java.lang.Throwable -> L5d
                long r0 = r7.f41519q     // Catch: java.lang.Throwable -> L5d
                long r0 = r0 + r3
                r7.f41519q = r0     // Catch: java.lang.Throwable -> L5d
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L5d
                boolean r8 = r7.f41513k
                if (r8 == 0) goto L5b
                io.reactivex.t$c r0 = r7.f41514l
                long r2 = r7.f41510h
                java.util.concurrent.TimeUnit r6 = r7.f41511i
                r4 = r2
                r1 = r7
                Nu.b r8 = r0.d(r1, r2, r4, r6)
                r1.f41516n = r8
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
                Ou.a.b(r8)
                io.reactivex.s<? super V> r0 = r1.f35487b
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
            throw new UnsupportedOperationException("Method not decompiled: Yu.C5481p.a.onNext(java.lang.Object):void");
        }

        a(io.reactivex.s<? super U> sVar, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, t.c cVar) {
            super(sVar, new C6157a());
            this.f41509g = callable;
            this.f41510h = j10;
            this.f41511i = timeUnit;
            this.f41512j = i10;
            this.f41513k = z10;
            this.f41514l = cVar;
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f35489d) {
                return;
            }
            this.f35489d = true;
            this.f41517o.dispose();
            this.f41514l.dispose();
            synchronized (this) {
                this.f41515m = null;
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f35489d;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10;
            this.f41514l.dispose();
            synchronized (this) {
                u10 = this.f41515m;
                this.f41515m = null;
            }
            if (u10 != null) {
                this.f35488c.offer(u10);
                this.f35490e = true;
                if (a()) {
                    ev.q.c(this.f35488c, this.f35487b, false, this, this);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41517o, bVar)) {
                this.f41517o = bVar;
                try {
                    this.f41515m = (U) Ru.b.e(this.f41509g.call(), "The buffer supplied is null");
                    this.f35487b.onSubscribe(this);
                    t.c cVar = this.f41514l;
                    long j10 = this.f41510h;
                    this.f41516n = cVar.d(this, j10, j10, this.f41511i);
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    bVar.dispose();
                    Qu.e.m(th2, this.f35487b);
                    this.f41514l.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) Ru.b.e(this.f41509g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u11 = this.f41515m;
                    if (u11 != null && this.f41518p == this.f41519q) {
                        this.f41515m = u10;
                        d(u11, false, this);
                    }
                }
            } catch (Throwable th2) {
                Ou.a.b(th2);
                dispose();
                this.f35487b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Tu.r, ev.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            sVar.onNext(u10);
        }
    }

    /* renamed from: Yu.p$b */
    static final class b<T, U extends Collection<? super T>> extends Tu.r<T, U, U> implements Runnable, Nu.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f41520g;

        /* renamed from: h, reason: collision with root package name */
        final long f41521h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f41522i;

        /* renamed from: j, reason: collision with root package name */
        final io.reactivex.t f41523j;

        /* renamed from: k, reason: collision with root package name */
        Nu.b f41524k;

        /* renamed from: l, reason: collision with root package name */
        U f41525l;

        /* renamed from: m, reason: collision with root package name */
        final AtomicReference<Nu.b> f41526m;

        @Override // io.reactivex.s
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.f41525l;
                this.f41525l = null;
            }
            if (u10 != null) {
                this.f35488c.offer(u10);
                this.f35490e = true;
                if (a()) {
                    ev.q.c(this.f35488c, this.f35487b, false, null, this);
                }
            }
            Qu.d.a(this.f41526m);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f41525l = null;
            }
            this.f35487b.onError(th2);
            Qu.d.a(this.f41526m);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.f41525l;
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
            super(sVar, new C6157a());
            this.f41526m = new AtomicReference<>();
            this.f41520g = callable;
            this.f41521h = j10;
            this.f41522i = timeUnit;
            this.f41523j = tVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41526m);
            this.f41524k.dispose();
        }

        @Override // Tu.r, ev.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            this.f35487b.onNext(u10);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41526m.get() == Qu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41524k, bVar)) {
                this.f41524k = bVar;
                try {
                    this.f41525l = (U) Ru.b.e(this.f41520g.call(), "The buffer supplied is null");
                    this.f35487b.onSubscribe(this);
                    if (!this.f35489d) {
                        io.reactivex.t tVar = this.f41523j;
                        long j10 = this.f41521h;
                        Nu.b bVarF = tVar.f(this, j10, j10, this.f41522i);
                        if (U.d.a(this.f41526m, null, bVarF)) {
                            return;
                        }
                        bVarF.dispose();
                    }
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    dispose();
                    Qu.e.m(th2, this.f35487b);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u10;
            try {
                U u11 = (U) Ru.b.e(this.f41520g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        u10 = this.f41525l;
                        if (u10 != null) {
                            this.f41525l = u11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u10 == null) {
                    Qu.d.a(this.f41526m);
                } else {
                    c(u10, false, this);
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f35487b.onError(th3);
                dispose();
            }
        }
    }

    /* renamed from: Yu.p$c */
    static final class c<T, U extends Collection<? super T>> extends Tu.r<T, U, U> implements Runnable, Nu.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f41527g;

        /* renamed from: h, reason: collision with root package name */
        final long f41528h;

        /* renamed from: i, reason: collision with root package name */
        final long f41529i;

        /* renamed from: j, reason: collision with root package name */
        final TimeUnit f41530j;

        /* renamed from: k, reason: collision with root package name */
        final t.c f41531k;

        /* renamed from: l, reason: collision with root package name */
        final List<U> f41532l;

        /* renamed from: m, reason: collision with root package name */
        Nu.b f41533m;

        /* renamed from: Yu.p$c$a */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f41534a;

            a(U u10) {
                this.f41534a = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f41532l.remove(this.f41534a);
                }
                c cVar = c.this;
                cVar.d(this.f41534a, false, cVar.f41531k);
            }
        }

        /* renamed from: Yu.p$c$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final U f41536a;

            b(U u10) {
                this.f41536a = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f41532l.remove(this.f41536a);
                }
                c cVar = c.this;
                cVar.d(this.f41536a, false, cVar.f41531k);
            }
        }

        void h() {
            synchronized (this) {
                this.f41532l.clear();
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f41532l);
                this.f41532l.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f35488c.offer((Collection) it.next());
            }
            this.f35490e = true;
            if (a()) {
                ev.q.c(this.f35488c, this.f35487b, false, this.f41531k, this);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f35490e = true;
            h();
            this.f35487b.onError(th2);
            this.f41531k.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.f41532l.iterator();
                    while (it.hasNext()) {
                        it.next().add(t10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        c(io.reactivex.s<? super U> sVar, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, t.c cVar) {
            super(sVar, new C6157a());
            this.f41527g = callable;
            this.f41528h = j10;
            this.f41529i = j11;
            this.f41530j = timeUnit;
            this.f41531k = cVar;
            this.f41532l = new LinkedList();
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f35489d) {
                return;
            }
            this.f35489d = true;
            h();
            this.f41533m.dispose();
            this.f41531k.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f35489d;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41533m, bVar)) {
                this.f41533m = bVar;
                try {
                    Collection collection = (Collection) Ru.b.e(this.f41527g.call(), "The buffer supplied is null");
                    this.f41532l.add(collection);
                    this.f35487b.onSubscribe(this);
                    t.c cVar = this.f41531k;
                    long j10 = this.f41529i;
                    cVar.d(this, j10, j10, this.f41530j);
                    this.f41531k.c(new b(collection), this.f41528h, this.f41530j);
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    bVar.dispose();
                    Qu.e.m(th2, this.f35487b);
                    this.f41531k.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35489d) {
                return;
            }
            try {
                Collection collection = (Collection) Ru.b.e(this.f41527g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.f35489d) {
                            return;
                        }
                        this.f41532l.add(collection);
                        this.f41531k.c(new a(collection), this.f41528h, this.f41530j);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f35487b.onError(th3);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Tu.r, ev.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            sVar.onNext(u10);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        if (this.f41502b == this.f41503c && this.f41507g == Integer.MAX_VALUE) {
            this.f41135a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f41506f, this.f41502b, this.f41504d, this.f41505e));
            return;
        }
        t.c cVarB = this.f41505e.b();
        if (this.f41502b == this.f41503c) {
            this.f41135a.subscribe(new a(new io.reactivex.observers.f(sVar), this.f41506f, this.f41502b, this.f41504d, this.f41507g, this.f41508h, cVarB));
        } else {
            this.f41135a.subscribe(new c(new io.reactivex.observers.f(sVar), this.f41506f, this.f41502b, this.f41503c, this.f41504d, cVarB));
        }
    }

    public C5481p(io.reactivex.q<T> qVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, Callable<U> callable, int i10, boolean z10) {
        super(qVar);
        this.f41502b = j10;
        this.f41503c = j11;
        this.f41504d = timeUnit;
        this.f41505e = tVar;
        this.f41506f = callable;
        this.f41507g = i10;
        this.f41508h = z10;
    }
}
