package Yu;

import av.C6157a;
import io.reactivex.t;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jv.C15083f;

/* loaded from: classes9.dex */
public final class K1<T> extends AbstractC5436a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f40794b;

    /* renamed from: c, reason: collision with root package name */
    final long f40795c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f40796d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f40797e;

    /* renamed from: f, reason: collision with root package name */
    final long f40798f;

    /* renamed from: g, reason: collision with root package name */
    final int f40799g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f40800h;

    static final class a<T> extends Tu.r<T, Object, io.reactivex.l<T>> implements Nu.b {

        /* renamed from: g, reason: collision with root package name */
        final long f40801g;

        /* renamed from: h, reason: collision with root package name */
        final TimeUnit f40802h;

        /* renamed from: i, reason: collision with root package name */
        final io.reactivex.t f40803i;

        /* renamed from: j, reason: collision with root package name */
        final int f40804j;

        /* renamed from: k, reason: collision with root package name */
        final boolean f40805k;

        /* renamed from: l, reason: collision with root package name */
        final long f40806l;

        /* renamed from: m, reason: collision with root package name */
        final t.c f40807m;

        /* renamed from: n, reason: collision with root package name */
        long f40808n;

        /* renamed from: o, reason: collision with root package name */
        long f40809o;

        /* renamed from: p, reason: collision with root package name */
        Nu.b f40810p;

        /* renamed from: q, reason: collision with root package name */
        C15083f<T> f40811q;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f40812r;

        /* renamed from: s, reason: collision with root package name */
        final Qu.h f40813s;

        /* renamed from: Yu.K1$a$a, reason: collision with other inner class name */
        static final class RunnableC0877a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final long f40814a;

            /* renamed from: b, reason: collision with root package name */
            final a<?> f40815b;

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f40815b;
                if (((Tu.r) aVar).f35489d) {
                    aVar.f40812r = true;
                } else {
                    ((Tu.r) aVar).f35488c.offer(this);
                }
                if (aVar.a()) {
                    aVar.h();
                }
            }

            RunnableC0877a(long j10, a<?> aVar) {
                this.f40814a = j10;
                this.f40815b = aVar;
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f35489d = true;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f35490e = true;
            if (a()) {
                h();
            }
            this.f35487b.onComplete();
        }

        a(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10, long j11, boolean z10) {
            super(sVar, new C6157a());
            this.f40813s = new Qu.h();
            this.f40801g = j10;
            this.f40802h = timeUnit;
            this.f40803i = tVar;
            this.f40804j = i10;
            this.f40806l = j11;
            this.f40805k = z10;
            if (z10) {
                this.f40807m = tVar.b();
            } else {
                this.f40807m = null;
            }
        }

        void g() {
            Qu.d.a(this.f40813s);
            t.c cVar = this.f40807m;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [jv.f<T>] */
        void h() {
            C6157a c6157a = (C6157a) this.f35488c;
            io.reactivex.s<? super V> sVar = this.f35487b;
            C15083f<T> c15083f = this.f40811q;
            int iG = 1;
            while (!this.f40812r) {
                boolean z10 = this.f35490e;
                Object objPoll = c6157a.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC0877a;
                if (z10 && (z11 || z12)) {
                    this.f40811q = null;
                    c6157a.clear();
                    Throwable th2 = this.f35491f;
                    if (th2 != null) {
                        c15083f.onError(th2);
                    } else {
                        c15083f.onComplete();
                    }
                    g();
                    return;
                }
                if (z11) {
                    iG = G(-iG);
                    if (iG == 0) {
                        return;
                    }
                } else if (z12) {
                    RunnableC0877a runnableC0877a = (RunnableC0877a) objPoll;
                    if (!this.f40805k || this.f40809o == runnableC0877a.f40814a) {
                        c15083f.onComplete();
                        this.f40808n = 0L;
                        c15083f = (C15083f<T>) C15083f.e(this.f40804j);
                        this.f40811q = c15083f;
                        sVar.onNext(c15083f);
                    }
                } else {
                    c15083f.onNext(ev.m.p(objPoll));
                    long j10 = this.f40808n + 1;
                    if (j10 >= this.f40806l) {
                        this.f40809o++;
                        this.f40808n = 0L;
                        c15083f.onComplete();
                        c15083f = (C15083f<T>) C15083f.e(this.f40804j);
                        this.f40811q = c15083f;
                        this.f35487b.onNext(c15083f);
                        if (this.f40805k) {
                            Nu.b bVar = this.f40813s.get();
                            bVar.dispose();
                            t.c cVar = this.f40807m;
                            RunnableC0877a runnableC0877a2 = new RunnableC0877a(this.f40809o, this);
                            long j11 = this.f40801g;
                            Nu.b bVarD = cVar.d(runnableC0877a2, j11, j11, this.f40802h);
                            if (!this.f40813s.compareAndSet(bVar, bVarD)) {
                                bVarD.dispose();
                            }
                        }
                    } else {
                        this.f40808n = j10;
                    }
                }
            }
            this.f40810p.dispose();
            c6157a.clear();
            g();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f35489d;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f35491f = th2;
            this.f35490e = true;
            if (a()) {
                h();
            }
            this.f35487b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40812r) {
                return;
            }
            if (b()) {
                C15083f<T> c15083f = this.f40811q;
                c15083f.onNext(t10);
                long j10 = this.f40808n + 1;
                if (j10 >= this.f40806l) {
                    this.f40809o++;
                    this.f40808n = 0L;
                    c15083f.onComplete();
                    C15083f<T> c15083fE = C15083f.e(this.f40804j);
                    this.f40811q = c15083fE;
                    this.f35487b.onNext(c15083fE);
                    if (this.f40805k) {
                        this.f40813s.get().dispose();
                        t.c cVar = this.f40807m;
                        RunnableC0877a runnableC0877a = new RunnableC0877a(this.f40809o, this);
                        long j11 = this.f40801g;
                        Qu.d.e(this.f40813s, cVar.d(runnableC0877a, j11, j11, this.f40802h));
                    }
                } else {
                    this.f40808n = j10;
                }
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f35488c.offer(ev.m.z(t10));
                if (!a()) {
                    return;
                }
            }
            h();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Nu.b bVarF;
            if (Qu.d.t(this.f40810p, bVar)) {
                this.f40810p = bVar;
                io.reactivex.s<? super V> sVar = this.f35487b;
                sVar.onSubscribe(this);
                if (this.f35489d) {
                    return;
                }
                C15083f<T> c15083fE = C15083f.e(this.f40804j);
                this.f40811q = c15083fE;
                sVar.onNext(c15083fE);
                RunnableC0877a runnableC0877a = new RunnableC0877a(this.f40809o, this);
                if (this.f40805k) {
                    t.c cVar = this.f40807m;
                    long j10 = this.f40801g;
                    bVarF = cVar.d(runnableC0877a, j10, j10, this.f40802h);
                } else {
                    io.reactivex.t tVar = this.f40803i;
                    long j11 = this.f40801g;
                    bVarF = tVar.f(runnableC0877a, j11, j11, this.f40802h);
                }
                this.f40813s.a(bVarF);
            }
        }
    }

    static final class b<T> extends Tu.r<T, Object, io.reactivex.l<T>> implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: o, reason: collision with root package name */
        static final Object f40816o = new Object();

        /* renamed from: g, reason: collision with root package name */
        final long f40817g;

        /* renamed from: h, reason: collision with root package name */
        final TimeUnit f40818h;

        /* renamed from: i, reason: collision with root package name */
        final io.reactivex.t f40819i;

        /* renamed from: j, reason: collision with root package name */
        final int f40820j;

        /* renamed from: k, reason: collision with root package name */
        Nu.b f40821k;

        /* renamed from: l, reason: collision with root package name */
        C15083f<T> f40822l;

        /* renamed from: m, reason: collision with root package name */
        final Qu.h f40823m;

        /* renamed from: n, reason: collision with root package name */
        volatile boolean f40824n;

        @Override // Nu.b
        public void dispose() {
            this.f35489d = true;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f35490e = true;
            if (a()) {
                e();
            }
            this.f35487b.onComplete();
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10) {
            super(sVar, new C6157a());
            this.f40823m = new Qu.h();
            this.f40817g = j10;
            this.f40818h = timeUnit;
            this.f40819i = tVar;
            this.f40820j = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            r7.f40823m.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.f40822l = null;
            r0.clear();
            r0 = r7.f35491f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [jv.f<T>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e() {
            /*
                r7 = this;
                Su.e<U> r0 = r7.f35488c
                av.a r0 = (av.C6157a) r0
                io.reactivex.s<? super V> r1 = r7.f35487b
                jv.f<T> r2 = r7.f40822l
                r3 = 1
            L9:
                boolean r4 = r7.f40824n
                boolean r5 = r7.f35490e
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L30
                if (r6 == 0) goto L19
                java.lang.Object r5 = Yu.K1.b.f40816o
                if (r6 != r5) goto L30
            L19:
                r1 = 0
                r7.f40822l = r1
                r0.clear()
                java.lang.Throwable r0 = r7.f35491f
                if (r0 == 0) goto L27
                r2.onError(r0)
                goto L2a
            L27:
                r2.onComplete()
            L2a:
                Qu.h r0 = r7.f40823m
                r0.dispose()
                return
            L30:
                if (r6 != 0) goto L3a
                int r3 = -r3
                int r3 = r7.G(r3)
                if (r3 != 0) goto L9
                return
            L3a:
                java.lang.Object r5 = Yu.K1.b.f40816o
                if (r6 != r5) goto L55
                r2.onComplete()
                if (r4 != 0) goto L4f
                int r2 = r7.f40820j
                jv.f r2 = jv.C15083f.e(r2)
                r7.f40822l = r2
                r1.onNext(r2)
                goto L9
            L4f:
                Nu.b r4 = r7.f40821k
                r4.dispose()
                goto L9
            L55:
                java.lang.Object r4 = ev.m.p(r6)
                r2.onNext(r4)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: Yu.K1.b.e():void");
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f35489d;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f35491f = th2;
            this.f35490e = true;
            if (a()) {
                e();
            }
            this.f35487b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40824n) {
                return;
            }
            if (b()) {
                this.f40822l.onNext(t10);
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f35488c.offer(ev.m.z(t10));
                if (!a()) {
                    return;
                }
            }
            e();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40821k, bVar)) {
                this.f40821k = bVar;
                this.f40822l = C15083f.e(this.f40820j);
                io.reactivex.s<? super V> sVar = this.f35487b;
                sVar.onSubscribe(this);
                sVar.onNext(this.f40822l);
                if (!this.f35489d) {
                    io.reactivex.t tVar = this.f40819i;
                    long j10 = this.f40817g;
                    this.f40823m.a(tVar.f(this, j10, j10, this.f40818h));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35489d) {
                this.f40824n = true;
            }
            this.f35488c.offer(f40816o);
            if (a()) {
                e();
            }
        }
    }

    static final class c<T> extends Tu.r<T, Object, io.reactivex.l<T>> implements Nu.b, Runnable {

        /* renamed from: g, reason: collision with root package name */
        final long f40825g;

        /* renamed from: h, reason: collision with root package name */
        final long f40826h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f40827i;

        /* renamed from: j, reason: collision with root package name */
        final t.c f40828j;

        /* renamed from: k, reason: collision with root package name */
        final int f40829k;

        /* renamed from: l, reason: collision with root package name */
        final List<C15083f<T>> f40830l;

        /* renamed from: m, reason: collision with root package name */
        Nu.b f40831m;

        /* renamed from: n, reason: collision with root package name */
        volatile boolean f40832n;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final C15083f<T> f40833a;

            a(C15083f<T> c15083f) {
                this.f40833a = c15083f;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.f40833a);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f35489d = true;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f35490e = true;
            if (a()) {
                f();
            }
            this.f35487b.onComplete();
        }

        static final class b<T> {

            /* renamed from: a, reason: collision with root package name */
            final C15083f<T> f40835a;

            /* renamed from: b, reason: collision with root package name */
            final boolean f40836b;

            b(C15083f<T> c15083f, boolean z10) {
                this.f40835a = c15083f;
                this.f40836b = z10;
            }
        }

        c(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, long j11, TimeUnit timeUnit, t.c cVar, int i10) {
            super(sVar, new C6157a());
            this.f40825g = j10;
            this.f40826h = j11;
            this.f40827i = timeUnit;
            this.f40828j = cVar;
            this.f40829k = i10;
            this.f40830l = new LinkedList();
        }

        void e(C15083f<T> c15083f) {
            this.f35488c.offer(new b(c15083f, false));
            if (a()) {
                f();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void f() {
            C6157a c6157a = (C6157a) this.f35488c;
            io.reactivex.s<? super V> sVar = this.f35487b;
            List<C15083f<T>> list = this.f40830l;
            int iG = 1;
            while (!this.f40832n) {
                boolean z10 = this.f35490e;
                Object objPoll = c6157a.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    c6157a.clear();
                    Throwable th2 = this.f35491f;
                    if (th2 != null) {
                        Iterator<C15083f<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<C15083f<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.f40828j.dispose();
                    return;
                }
                if (z11) {
                    iG = G(-iG);
                    if (iG == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f40836b) {
                        list.remove(bVar.f40835a);
                        bVar.f40835a.onComplete();
                        if (list.isEmpty() && this.f35489d) {
                            this.f40832n = true;
                        }
                    } else if (!this.f35489d) {
                        C15083f<T> c15083fE = C15083f.e(this.f40829k);
                        list.add(c15083fE);
                        sVar.onNext(c15083fE);
                        this.f40828j.c(new a(c15083fE), this.f40825g, this.f40827i);
                    }
                } else {
                    Iterator<C15083f<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f40831m.dispose();
            c6157a.clear();
            list.clear();
            this.f40828j.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f35489d;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f35491f = th2;
            this.f35490e = true;
            if (a()) {
                f();
            }
            this.f35487b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40831m, bVar)) {
                this.f40831m = bVar;
                this.f35487b.onSubscribe(this);
                if (this.f35489d) {
                    return;
                }
                C15083f<T> c15083fE = C15083f.e(this.f40829k);
                this.f40830l.add(c15083fE);
                this.f35487b.onNext(c15083fE);
                this.f40828j.c(new a(c15083fE), this.f40825g, this.f40827i);
                t.c cVar = this.f40828j;
                long j10 = this.f40826h;
                cVar.d(this, j10, j10, this.f40827i);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = new b(C15083f.e(this.f40829k), true);
            if (!this.f35489d) {
                this.f35488c.offer(bVar);
            }
            if (a()) {
                f();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (b()) {
                Iterator<C15083f<T>> it = this.f40830l.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f35488c.offer(t10);
                if (!a()) {
                    return;
                }
            }
            f();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        io.reactivex.observers.f fVar = new io.reactivex.observers.f(sVar);
        long j10 = this.f40794b;
        long j11 = this.f40795c;
        if (j10 != j11) {
            this.f41135a.subscribe(new c(fVar, j10, j11, this.f40796d, this.f40797e.b(), this.f40799g));
            return;
        }
        long j12 = this.f40798f;
        if (j12 == Long.MAX_VALUE) {
            this.f41135a.subscribe(new b(fVar, this.f40794b, this.f40796d, this.f40797e, this.f40799g));
        } else {
            this.f41135a.subscribe(new a(fVar, j10, this.f40796d, this.f40797e, this.f40799g, j12, this.f40800h));
        }
    }

    public K1(io.reactivex.q<T> qVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, long j12, int i10, boolean z10) {
        super(qVar);
        this.f40794b = j10;
        this.f40795c = j11;
        this.f40796d = timeUnit;
        this.f40797e = tVar;
        this.f40798f = j12;
        this.f40799g = i10;
        this.f40800h = z10;
    }
}
