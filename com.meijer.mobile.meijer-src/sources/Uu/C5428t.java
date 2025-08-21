package Uu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5428t<T, R> extends io.reactivex.l<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T>[] f38863a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<? extends T>> f38864b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super Object[], ? extends R> f38865c;

    /* renamed from: d, reason: collision with root package name */
    final int f38866d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f38867e;

    /* renamed from: Uu.t$a */
    static final class a<T, R> extends AtomicReference<Ju.b> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, R> f38868a;

        /* renamed from: b, reason: collision with root package name */
        final int f38869b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38868a.d(this.f38869b);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38868a.e(this.f38869b, th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38868a.f(this.f38869b, t10);
        }

        a(b<T, R> bVar, int i10) {
            this.f38868a = bVar;
            this.f38869b = i10;
        }

        public void a() {
            Mu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    /* renamed from: Uu.t$b */
    static final class b<T, R> extends AtomicInteger implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38870a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super Object[], ? extends R> f38871b;

        /* renamed from: c, reason: collision with root package name */
        final a<T, R>[] f38872c;

        /* renamed from: d, reason: collision with root package name */
        Object[] f38873d;

        /* renamed from: e, reason: collision with root package name */
        final Wu.c<Object[]> f38874e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f38875f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38876g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f38877h;

        /* renamed from: i, reason: collision with root package name */
        final av.c f38878i = new av.c();

        /* renamed from: j, reason: collision with root package name */
        int f38879j;

        /* renamed from: k, reason: collision with root package name */
        int f38880k;

        void b(Wu.c<?> cVar) {
            synchronized (this) {
                this.f38873d = null;
            }
            cVar.clear();
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
                java.lang.Object[] r0 = r3.f38873d     // Catch: java.lang.Throwable -> L7
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
                int r2 = r3.f38880k     // Catch: java.lang.Throwable -> L7
                int r2 = r2 + r1
                r3.f38880k = r2     // Catch: java.lang.Throwable -> L7
                int r0 = r0.length     // Catch: java.lang.Throwable -> L7
                if (r2 != r0) goto L1d
            L1b:
                r3.f38877h = r1     // Catch: java.lang.Throwable -> L7
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
            throw new UnsupportedOperationException("Method not decompiled: Uu.C5428t.b.d(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void f(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                try {
                    Object[] objArr = this.f38873d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i10];
                    int i11 = this.f38879j;
                    if (obj == null) {
                        i11++;
                        this.f38879j = i11;
                    }
                    objArr[i10] = t10;
                    if (i11 == objArr.length) {
                        this.f38874e.offer(objArr.clone());
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
            for (a<T, R> aVar : this.f38872c) {
                aVar.a();
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38876g) {
                return;
            }
            this.f38876g = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.f38874e);
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
                av.c r0 = r2.f38878i
                boolean r0 = r0.a(r4)
                if (r0 == 0) goto L37
                boolean r4 = r2.f38875f
                r0 = 1
                if (r4 == 0) goto L2e
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f38873d     // Catch: java.lang.Throwable -> L14
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
                int r1 = r2.f38880k     // Catch: java.lang.Throwable -> L14
                int r1 = r1 + r0
                r2.f38880k = r1     // Catch: java.lang.Throwable -> L14
                int r4 = r4.length     // Catch: java.lang.Throwable -> L14
                if (r1 != r4) goto L29
            L27:
                r2.f38877h = r0     // Catch: java.lang.Throwable -> L14
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
                cv.C13558a.s(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Uu.C5428t.b.e(int, java.lang.Throwable):void");
        }

        public void g(io.reactivex.q<? extends T>[] qVarArr) {
            a<T, R>[] aVarArr = this.f38872c;
            int length = aVarArr.length;
            this.f38870a.onSubscribe(this);
            for (int i10 = 0; i10 < length && !this.f38877h && !this.f38876g; i10++) {
                qVarArr[i10].subscribe(aVarArr[i10]);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38876g;
        }

        b(io.reactivex.s<? super R> sVar, Lu.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f38870a = sVar;
            this.f38871b = oVar;
            this.f38875f = z10;
            this.f38873d = new Object[i10];
            a<T, R>[] aVarArr = new a[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                aVarArr[i12] = new a<>(this, i12);
            }
            this.f38872c = aVarArr;
            this.f38874e = new Wu.c<>(i11);
        }

        void c() {
            boolean z10;
            if (getAndIncrement() == 0) {
                Wu.c<Object[]> cVar = this.f38874e;
                io.reactivex.s<? super R> sVar = this.f38870a;
                boolean z11 = this.f38875f;
                int iAddAndGet = 1;
                while (!this.f38876g) {
                    if (!z11 && this.f38878i.get() != null) {
                        a();
                        b(cVar);
                        sVar.onError(this.f38878i.b());
                        return;
                    }
                    boolean z12 = this.f38877h;
                    Object[] objArrPoll = cVar.poll();
                    if (objArrPoll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z12 && z10) {
                        b(cVar);
                        Throwable thB = this.f38878i.b();
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
                            sVar.onNext((Object) Nu.b.e(this.f38871b.apply(objArrPoll), "The combiner returned a null value"));
                        } catch (Throwable th2) {
                            Ku.a.b(th2);
                            this.f38878i.a(th2);
                            a();
                            b(cVar);
                            sVar.onError(this.f38878i.b());
                            return;
                        }
                    }
                }
                b(cVar);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        int length;
        io.reactivex.q<? extends T>[] qVarArr = this.f38863a;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            length = 0;
            for (io.reactivex.q<? extends T> qVar : this.f38864b) {
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
            Mu.e.e(sVar);
        } else {
            new b(sVar, this.f38865c, i10, this.f38866d, this.f38867e).g(qVarArr);
        }
    }

    public C5428t(io.reactivex.q<? extends T>[] qVarArr, Iterable<? extends io.reactivex.q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f38863a = qVarArr;
        this.f38864b = iterable;
        this.f38865c = oVar;
        this.f38866d = i10;
        this.f38867e = z10;
    }
}
