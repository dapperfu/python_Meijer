package Uu;

import fv.C14273f;
import io.reactivex.t;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class K1<T> extends AbstractC5375a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final long f38019b;

    /* renamed from: c, reason: collision with root package name */
    final long f38020c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f38021d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f38022e;

    /* renamed from: f, reason: collision with root package name */
    final long f38023f;

    /* renamed from: g, reason: collision with root package name */
    final int f38024g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f38025h;

    static final class a<T> extends Pu.r<T, Object, io.reactivex.l<T>> implements Ju.b {

        /* renamed from: g, reason: collision with root package name */
        final long f38026g;

        /* renamed from: h, reason: collision with root package name */
        final TimeUnit f38027h;

        /* renamed from: i, reason: collision with root package name */
        final io.reactivex.t f38028i;

        /* renamed from: j, reason: collision with root package name */
        final int f38029j;

        /* renamed from: k, reason: collision with root package name */
        final boolean f38030k;

        /* renamed from: l, reason: collision with root package name */
        final long f38031l;

        /* renamed from: m, reason: collision with root package name */
        final t.c f38032m;

        /* renamed from: n, reason: collision with root package name */
        long f38033n;

        /* renamed from: o, reason: collision with root package name */
        long f38034o;

        /* renamed from: p, reason: collision with root package name */
        Ju.b f38035p;

        /* renamed from: q, reason: collision with root package name */
        C14273f<T> f38036q;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f38037r;

        /* renamed from: s, reason: collision with root package name */
        final Mu.h f38038s;

        /* renamed from: Uu.K1$a$a, reason: collision with other inner class name */
        static final class RunnableC0834a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final long f38039a;

            /* renamed from: b, reason: collision with root package name */
            final a<?> f38040b;

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f38040b;
                if (((Pu.r) aVar).f27261d) {
                    aVar.f38037r = true;
                } else {
                    ((Pu.r) aVar).f27260c.offer(this);
                }
                if (aVar.a()) {
                    aVar.h();
                }
            }

            RunnableC0834a(long j10, a<?> aVar) {
                this.f38039a = j10;
                this.f38040b = aVar;
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f27261d = true;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f27262e = true;
            if (a()) {
                h();
            }
            this.f27259b.onComplete();
        }

        a(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10, long j11, boolean z10) {
            super(sVar, new Wu.a());
            this.f38038s = new Mu.h();
            this.f38026g = j10;
            this.f38027h = timeUnit;
            this.f38028i = tVar;
            this.f38029j = i10;
            this.f38031l = j11;
            this.f38030k = z10;
            if (z10) {
                this.f38032m = tVar.b();
            } else {
                this.f38032m = null;
            }
        }

        void g() {
            Mu.d.a(this.f38038s);
            t.c cVar = this.f38032m;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [fv.f<T>] */
        void h() {
            Wu.a aVar = (Wu.a) this.f27260c;
            io.reactivex.s<? super V> sVar = this.f27259b;
            C14273f<T> c14273f = this.f38036q;
            int iG = 1;
            while (!this.f38037r) {
                boolean z10 = this.f27262e;
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC0834a;
                if (z10 && (z11 || z12)) {
                    this.f38036q = null;
                    aVar.clear();
                    Throwable th2 = this.f27263f;
                    if (th2 != null) {
                        c14273f.onError(th2);
                    } else {
                        c14273f.onComplete();
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
                    RunnableC0834a runnableC0834a = (RunnableC0834a) objPoll;
                    if (!this.f38030k || this.f38034o == runnableC0834a.f38039a) {
                        c14273f.onComplete();
                        this.f38033n = 0L;
                        c14273f = (C14273f<T>) C14273f.e(this.f38029j);
                        this.f38036q = c14273f;
                        sVar.onNext(c14273f);
                    }
                } else {
                    c14273f.onNext(av.m.p(objPoll));
                    long j10 = this.f38033n + 1;
                    if (j10 >= this.f38031l) {
                        this.f38034o++;
                        this.f38033n = 0L;
                        c14273f.onComplete();
                        c14273f = (C14273f<T>) C14273f.e(this.f38029j);
                        this.f38036q = c14273f;
                        this.f27259b.onNext(c14273f);
                        if (this.f38030k) {
                            Ju.b bVar = this.f38038s.get();
                            bVar.dispose();
                            t.c cVar = this.f38032m;
                            RunnableC0834a runnableC0834a2 = new RunnableC0834a(this.f38034o, this);
                            long j11 = this.f38026g;
                            Ju.b bVarD = cVar.d(runnableC0834a2, j11, j11, this.f38027h);
                            if (!this.f38038s.compareAndSet(bVar, bVarD)) {
                                bVarD.dispose();
                            }
                        }
                    } else {
                        this.f38033n = j10;
                    }
                }
            }
            this.f38035p.dispose();
            aVar.clear();
            g();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f27261d;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f27263f = th2;
            this.f27262e = true;
            if (a()) {
                h();
            }
            this.f27259b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38037r) {
                return;
            }
            if (b()) {
                C14273f<T> c14273f = this.f38036q;
                c14273f.onNext(t10);
                long j10 = this.f38033n + 1;
                if (j10 >= this.f38031l) {
                    this.f38034o++;
                    this.f38033n = 0L;
                    c14273f.onComplete();
                    C14273f<T> c14273fE = C14273f.e(this.f38029j);
                    this.f38036q = c14273fE;
                    this.f27259b.onNext(c14273fE);
                    if (this.f38030k) {
                        this.f38038s.get().dispose();
                        t.c cVar = this.f38032m;
                        RunnableC0834a runnableC0834a = new RunnableC0834a(this.f38034o, this);
                        long j11 = this.f38026g;
                        Mu.d.e(this.f38038s, cVar.d(runnableC0834a, j11, j11, this.f38027h));
                    }
                } else {
                    this.f38033n = j10;
                }
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f27260c.offer(av.m.z(t10));
                if (!a()) {
                    return;
                }
            }
            h();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Ju.b bVarF;
            if (Mu.d.t(this.f38035p, bVar)) {
                this.f38035p = bVar;
                io.reactivex.s<? super V> sVar = this.f27259b;
                sVar.onSubscribe(this);
                if (this.f27261d) {
                    return;
                }
                C14273f<T> c14273fE = C14273f.e(this.f38029j);
                this.f38036q = c14273fE;
                sVar.onNext(c14273fE);
                RunnableC0834a runnableC0834a = new RunnableC0834a(this.f38034o, this);
                if (this.f38030k) {
                    t.c cVar = this.f38032m;
                    long j10 = this.f38026g;
                    bVarF = cVar.d(runnableC0834a, j10, j10, this.f38027h);
                } else {
                    io.reactivex.t tVar = this.f38028i;
                    long j11 = this.f38026g;
                    bVarF = tVar.f(runnableC0834a, j11, j11, this.f38027h);
                }
                this.f38038s.a(bVarF);
            }
        }
    }

    static final class b<T> extends Pu.r<T, Object, io.reactivex.l<T>> implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: o, reason: collision with root package name */
        static final Object f38041o = new Object();

        /* renamed from: g, reason: collision with root package name */
        final long f38042g;

        /* renamed from: h, reason: collision with root package name */
        final TimeUnit f38043h;

        /* renamed from: i, reason: collision with root package name */
        final io.reactivex.t f38044i;

        /* renamed from: j, reason: collision with root package name */
        final int f38045j;

        /* renamed from: k, reason: collision with root package name */
        Ju.b f38046k;

        /* renamed from: l, reason: collision with root package name */
        C14273f<T> f38047l;

        /* renamed from: m, reason: collision with root package name */
        final Mu.h f38048m;

        /* renamed from: n, reason: collision with root package name */
        volatile boolean f38049n;

        @Override // Ju.b
        public void dispose() {
            this.f27261d = true;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f27262e = true;
            if (a()) {
                e();
            }
            this.f27259b.onComplete();
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10) {
            super(sVar, new Wu.a());
            this.f38048m = new Mu.h();
            this.f38042g = j10;
            this.f38043h = timeUnit;
            this.f38044i = tVar;
            this.f38045j = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            r7.f38048m.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.f38047l = null;
            r0.clear();
            r0 = r7.f27263f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [fv.f<T>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e() {
            /*
                r7 = this;
                Ou.e<U> r0 = r7.f27260c
                Wu.a r0 = (Wu.a) r0
                io.reactivex.s<? super V> r1 = r7.f27259b
                fv.f<T> r2 = r7.f38047l
                r3 = 1
            L9:
                boolean r4 = r7.f38049n
                boolean r5 = r7.f27262e
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L30
                if (r6 == 0) goto L19
                java.lang.Object r5 = Uu.K1.b.f38041o
                if (r6 != r5) goto L30
            L19:
                r1 = 0
                r7.f38047l = r1
                r0.clear()
                java.lang.Throwable r0 = r7.f27263f
                if (r0 == 0) goto L27
                r2.onError(r0)
                goto L2a
            L27:
                r2.onComplete()
            L2a:
                Mu.h r0 = r7.f38048m
                r0.dispose()
                return
            L30:
                if (r6 != 0) goto L3a
                int r3 = -r3
                int r3 = r7.G(r3)
                if (r3 != 0) goto L9
                return
            L3a:
                java.lang.Object r5 = Uu.K1.b.f38041o
                if (r6 != r5) goto L55
                r2.onComplete()
                if (r4 != 0) goto L4f
                int r2 = r7.f38045j
                fv.f r2 = fv.C14273f.e(r2)
                r7.f38047l = r2
                r1.onNext(r2)
                goto L9
            L4f:
                Ju.b r4 = r7.f38046k
                r4.dispose()
                goto L9
            L55:
                java.lang.Object r4 = av.m.p(r6)
                r2.onNext(r4)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: Uu.K1.b.e():void");
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f27261d;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f27263f = th2;
            this.f27262e = true;
            if (a()) {
                e();
            }
            this.f27259b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38049n) {
                return;
            }
            if (b()) {
                this.f38047l.onNext(t10);
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f27260c.offer(av.m.z(t10));
                if (!a()) {
                    return;
                }
            }
            e();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38046k, bVar)) {
                this.f38046k = bVar;
                this.f38047l = C14273f.e(this.f38045j);
                io.reactivex.s<? super V> sVar = this.f27259b;
                sVar.onSubscribe(this);
                sVar.onNext(this.f38047l);
                if (!this.f27261d) {
                    io.reactivex.t tVar = this.f38044i;
                    long j10 = this.f38042g;
                    this.f38048m.a(tVar.f(this, j10, j10, this.f38043h));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27261d) {
                this.f38049n = true;
            }
            this.f27260c.offer(f38041o);
            if (a()) {
                e();
            }
        }
    }

    static final class c<T> extends Pu.r<T, Object, io.reactivex.l<T>> implements Ju.b, Runnable {

        /* renamed from: g, reason: collision with root package name */
        final long f38050g;

        /* renamed from: h, reason: collision with root package name */
        final long f38051h;

        /* renamed from: i, reason: collision with root package name */
        final TimeUnit f38052i;

        /* renamed from: j, reason: collision with root package name */
        final t.c f38053j;

        /* renamed from: k, reason: collision with root package name */
        final int f38054k;

        /* renamed from: l, reason: collision with root package name */
        final List<C14273f<T>> f38055l;

        /* renamed from: m, reason: collision with root package name */
        Ju.b f38056m;

        /* renamed from: n, reason: collision with root package name */
        volatile boolean f38057n;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final C14273f<T> f38058a;

            a(C14273f<T> c14273f) {
                this.f38058a = c14273f;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.f38058a);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f27261d = true;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f27262e = true;
            if (a()) {
                f();
            }
            this.f27259b.onComplete();
        }

        static final class b<T> {

            /* renamed from: a, reason: collision with root package name */
            final C14273f<T> f38060a;

            /* renamed from: b, reason: collision with root package name */
            final boolean f38061b;

            b(C14273f<T> c14273f, boolean z10) {
                this.f38060a = c14273f;
                this.f38061b = z10;
            }
        }

        c(io.reactivex.s<? super io.reactivex.l<T>> sVar, long j10, long j11, TimeUnit timeUnit, t.c cVar, int i10) {
            super(sVar, new Wu.a());
            this.f38050g = j10;
            this.f38051h = j11;
            this.f38052i = timeUnit;
            this.f38053j = cVar;
            this.f38054k = i10;
            this.f38055l = new LinkedList();
        }

        void e(C14273f<T> c14273f) {
            this.f27260c.offer(new b(c14273f, false));
            if (a()) {
                f();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void f() {
            Wu.a aVar = (Wu.a) this.f27260c;
            io.reactivex.s<? super V> sVar = this.f27259b;
            List<C14273f<T>> list = this.f38055l;
            int iG = 1;
            while (!this.f38057n) {
                boolean z10 = this.f27262e;
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    aVar.clear();
                    Throwable th2 = this.f27263f;
                    if (th2 != null) {
                        Iterator<C14273f<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<C14273f<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.f38053j.dispose();
                    return;
                }
                if (z11) {
                    iG = G(-iG);
                    if (iG == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f38061b) {
                        list.remove(bVar.f38060a);
                        bVar.f38060a.onComplete();
                        if (list.isEmpty() && this.f27261d) {
                            this.f38057n = true;
                        }
                    } else if (!this.f27261d) {
                        C14273f<T> c14273fE = C14273f.e(this.f38054k);
                        list.add(c14273fE);
                        sVar.onNext(c14273fE);
                        this.f38053j.c(new a(c14273fE), this.f38050g, this.f38052i);
                    }
                } else {
                    Iterator<C14273f<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f38056m.dispose();
            aVar.clear();
            list.clear();
            this.f38053j.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f27261d;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f27263f = th2;
            this.f27262e = true;
            if (a()) {
                f();
            }
            this.f27259b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38056m, bVar)) {
                this.f38056m = bVar;
                this.f27259b.onSubscribe(this);
                if (this.f27261d) {
                    return;
                }
                C14273f<T> c14273fE = C14273f.e(this.f38054k);
                this.f38055l.add(c14273fE);
                this.f27259b.onNext(c14273fE);
                this.f38053j.c(new a(c14273fE), this.f38050g, this.f38052i);
                t.c cVar = this.f38053j;
                long j10 = this.f38051h;
                cVar.d(this, j10, j10, this.f38052i);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = new b(C14273f.e(this.f38054k), true);
            if (!this.f27261d) {
                this.f27260c.offer(bVar);
            }
            if (a()) {
                f();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (b()) {
                Iterator<C14273f<T>> it = this.f38055l.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f27260c.offer(t10);
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
        long j10 = this.f38019b;
        long j11 = this.f38020c;
        if (j10 != j11) {
            this.f38360a.subscribe(new c(fVar, j10, j11, this.f38021d, this.f38022e.b(), this.f38024g));
            return;
        }
        long j12 = this.f38023f;
        if (j12 == Long.MAX_VALUE) {
            this.f38360a.subscribe(new b(fVar, this.f38019b, this.f38021d, this.f38022e, this.f38024g));
        } else {
            this.f38360a.subscribe(new a(fVar, j10, this.f38021d, this.f38022e, this.f38024g, j12, this.f38025h));
        }
    }

    public K1(io.reactivex.q<T> qVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, long j12, int i10, boolean z10) {
        super(qVar);
        this.f38019b = j10;
        this.f38020c = j11;
        this.f38021d = timeUnit;
        this.f38022e = tVar;
        this.f38023f = j12;
        this.f38024g = i10;
        this.f38025h = z10;
    }
}
