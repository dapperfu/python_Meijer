package Yu;

import av.C6159c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5489t<T, R> extends io.reactivex.l<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T>[] f41638a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<? extends T>> f41639b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super Object[], ? extends R> f41640c;

    /* renamed from: d, reason: collision with root package name */
    final int f41641d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f41642e;

    /* renamed from: Yu.t$a */
    static final class a<T, R> extends AtomicReference<Nu.b> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, R> f41643a;

        /* renamed from: b, reason: collision with root package name */
        final int f41644b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41643a.d(this.f41644b);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41643a.e(this.f41644b, th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41643a.f(this.f41644b, t10);
        }

        a(b<T, R> bVar, int i10) {
            this.f41643a = bVar;
            this.f41644b = i10;
        }

        public void a() {
            Qu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    /* renamed from: Yu.t$b */
    static final class b<T, R> extends AtomicInteger implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41645a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super Object[], ? extends R> f41646b;

        /* renamed from: c, reason: collision with root package name */
        final a<T, R>[] f41647c;

        /* renamed from: d, reason: collision with root package name */
        Object[] f41648d;

        /* renamed from: e, reason: collision with root package name */
        final C6159c<Object[]> f41649e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f41650f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41651g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f41652h;

        /* renamed from: i, reason: collision with root package name */
        final ev.c f41653i = new ev.c();

        /* renamed from: j, reason: collision with root package name */
        int f41654j;

        /* renamed from: k, reason: collision with root package name */
        int f41655k;

        void b(C6159c<?> c6159c) {
            synchronized (this) {
                this.f41648d = null;
            }
            c6159c.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001b A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:14:0x0013, B:17:0x001d, B:16:0x001b), top: B:24:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void d(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f41648d     // Catch: java.lang.Throwable -> L7
                if (r0 != 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r4 = move-exception
                goto L27
            L9:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L7
                r1 = 1
                if (r4 != 0) goto L10
                r4 = r1
                goto L11
            L10:
                r4 = 0
            L11:
                if (r4 != 0) goto L1b
                int r2 = r3.f41655k     // Catch: java.lang.Throwable -> L7
                int r2 = r2 + r1
                r3.f41655k = r2     // Catch: java.lang.Throwable -> L7
                int r0 = r0.length     // Catch: java.lang.Throwable -> L7
                if (r2 != r0) goto L1d
            L1b:
                r3.f41652h = r1     // Catch: java.lang.Throwable -> L7
            L1d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                if (r4 == 0) goto L23
                r3.a()
            L23:
                r3.c()
                return
            L27:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Yu.C5489t.b.d(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void f(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                try {
                    Object[] objArr = this.f41648d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i10];
                    int i11 = this.f41654j;
                    if (obj == null) {
                        i11++;
                        this.f41654j = i11;
                    }
                    objArr[i10] = t10;
                    if (i11 == objArr.length) {
                        this.f41649e.offer(objArr.clone());
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void a() {
            for (a<T, R> aVar : this.f41647c) {
                aVar.a();
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41651g) {
                return;
            }
            this.f41651g = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.f41649e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000e, B:9:0x0012, B:13:0x0016, B:18:0x001f, B:21:0x0029, B:20:0x0027), top: B:31:0x000e }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                ev.c r0 = r2.f41653i
                boolean r0 = r0.a(r4)
                if (r0 == 0) goto L37
                boolean r4 = r2.f41650f
                r0 = 1
                if (r4 == 0) goto L2e
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f41648d     // Catch: java.lang.Throwable -> L14
                if (r4 != 0) goto L16
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r3 = move-exception
                goto L2c
            L16:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L14
                if (r3 != 0) goto L1c
                r3 = r0
                goto L1d
            L1c:
                r3 = 0
            L1d:
                if (r3 != 0) goto L27
                int r1 = r2.f41655k     // Catch: java.lang.Throwable -> L14
                int r1 = r1 + r0
                r2.f41655k = r1     // Catch: java.lang.Throwable -> L14
                int r4 = r4.length     // Catch: java.lang.Throwable -> L14
                if (r1 != r4) goto L29
            L27:
                r2.f41652h = r0     // Catch: java.lang.Throwable -> L14
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                r0 = r3
                goto L2e
            L2c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                throw r3
            L2e:
                if (r0 == 0) goto L33
                r2.a()
            L33:
                r2.c()
                return
            L37:
                gv.C14313a.s(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yu.C5489t.b.e(int, java.lang.Throwable):void");
        }

        public void g(io.reactivex.q<? extends T>[] qVarArr) {
            a<T, R>[] aVarArr = this.f41647c;
            int length = aVarArr.length;
            this.f41645a.onSubscribe(this);
            for (int i10 = 0; i10 < length && !this.f41652h && !this.f41651g; i10++) {
                qVarArr[i10].subscribe(aVarArr[i10]);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41651g;
        }

        b(io.reactivex.s<? super R> sVar, Pu.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f41645a = sVar;
            this.f41646b = oVar;
            this.f41650f = z10;
            this.f41648d = new Object[i10];
            a<T, R>[] aVarArr = new a[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                aVarArr[i12] = new a<>(this, i12);
            }
            this.f41647c = aVarArr;
            this.f41649e = new C6159c<>(i11);
        }

        void c() {
            boolean z10;
            if (getAndIncrement() == 0) {
                C6159c<Object[]> c6159c = this.f41649e;
                io.reactivex.s<? super R> sVar = this.f41645a;
                boolean z11 = this.f41650f;
                int iAddAndGet = 1;
                while (!this.f41651g) {
                    if (!z11 && this.f41653i.get() != null) {
                        a();
                        b(c6159c);
                        sVar.onError(this.f41653i.b());
                        return;
                    }
                    boolean z12 = this.f41652h;
                    Object[] objArrPoll = c6159c.poll();
                    if (objArrPoll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z12 && z10) {
                        b(c6159c);
                        Throwable thB = this.f41653i.b();
                        if (thB == null) {
                            sVar.onComplete();
                            return;
                        } else {
                            sVar.onError(thB);
                            return;
                        }
                    }
                    if (z10) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        try {
                            sVar.onNext((Object) Ru.b.e(this.f41646b.apply(objArrPoll), "The combiner returned a null value"));
                        } catch (Throwable th2) {
                            Ou.a.b(th2);
                            this.f41653i.a(th2);
                            a();
                            b(c6159c);
                            sVar.onError(this.f41653i.b());
                            return;
                        }
                    }
                }
                b(c6159c);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        int length;
        io.reactivex.q<? extends T>[] qVarArr = this.f41638a;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            length = 0;
            for (io.reactivex.q<? extends T> qVar : this.f41639b) {
                if (length == qVarArr.length) {
                    io.reactivex.q<? extends T>[] qVarArr2 = new io.reactivex.q[(length >> 2) + length];
                    System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
                    qVarArr = qVarArr2;
                }
                qVarArr[length] = qVar;
                length++;
            }
        } else {
            length = qVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            Qu.e.e(sVar);
        } else {
            new b(sVar, this.f41640c, i10, this.f41641d, this.f41642e).g(qVarArr);
        }
    }

    public C5489t(io.reactivex.q<? extends T>[] qVarArr, Iterable<? extends io.reactivex.q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f41638a = qVarArr;
        this.f41639b = iterable;
        this.f41640c = oVar;
        this.f41641d = i10;
        this.f41642e = z10;
    }
}
