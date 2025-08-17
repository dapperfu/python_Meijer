package Yu;

import av.C6158b;
import av.C6159c;
import gv.C14313a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class W<T, U> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.q<? extends U>> f41041b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f41042c;

    /* renamed from: d, reason: collision with root package name */
    final int f41043d;

    /* renamed from: e, reason: collision with root package name */
    final int f41044e;

    static final class a<T, U> extends AtomicReference<Nu.b> implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        final long f41045a;

        /* renamed from: b, reason: collision with root package name */
        final b<T, U> f41046b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f41047c;

        /* renamed from: d, reason: collision with root package name */
        volatile Su.f<U> f41048d;

        /* renamed from: e, reason: collision with root package name */
        int f41049e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41047c = true;
            this.f41046b.d();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f41046b.f41059h.a(th2)) {
                C14313a.s(th2);
                return;
            }
            b<T, U> bVar = this.f41046b;
            if (!bVar.f41054c) {
                bVar.c();
            }
            this.f41047c = true;
            this.f41046b.d();
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            if (this.f41049e == 0) {
                this.f41046b.i(u10, this);
            } else {
                this.f41046b.d();
            }
        }

        a(b<T, U> bVar, long j10) {
            this.f41045a = j10;
            this.f41046b = bVar;
        }

        public void a() {
            Qu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar) && (bVar instanceof Su.b)) {
                Su.b bVar2 = (Su.b) bVar;
                int iA = bVar2.a(7);
                if (iA == 1) {
                    this.f41049e = iA;
                    this.f41048d = bVar2;
                    this.f41047c = true;
                    this.f41046b.d();
                    return;
                }
                if (iA == 2) {
                    this.f41049e = iA;
                    this.f41048d = bVar2;
                }
            }
        }
    }

    static final class b<T, U> extends AtomicInteger implements Nu.b, io.reactivex.s<T> {

        /* renamed from: q, reason: collision with root package name */
        static final a<?, ?>[] f41050q = new a[0];

        /* renamed from: r, reason: collision with root package name */
        static final a<?, ?>[] f41051r = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f41052a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<? extends U>> f41053b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f41054c;

        /* renamed from: d, reason: collision with root package name */
        final int f41055d;

        /* renamed from: e, reason: collision with root package name */
        final int f41056e;

        /* renamed from: f, reason: collision with root package name */
        volatile Su.e<U> f41057f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41058g;

        /* renamed from: h, reason: collision with root package name */
        final ev.c f41059h = new ev.c();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f41060i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f41061j;

        /* renamed from: k, reason: collision with root package name */
        Nu.b f41062k;

        /* renamed from: l, reason: collision with root package name */
        long f41063l;

        /* renamed from: m, reason: collision with root package name */
        long f41064m;

        /* renamed from: n, reason: collision with root package name */
        int f41065n;

        /* renamed from: o, reason: collision with root package name */
        Queue<io.reactivex.q<? extends U>> f41066o;

        /* renamed from: p, reason: collision with root package name */
        int f41067p;

        boolean j(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f41052a.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    Su.e<U> c6159c = this.f41057f;
                    if (c6159c == null) {
                        c6159c = this.f41055d == Integer.MAX_VALUE ? new C6159c<>(this.f41056e) : new C6158b<>(this.f41055d);
                        this.f41057f = c6159c;
                    }
                    if (!c6159c.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                e();
                return true;
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41059h.a(th2);
                d();
                return true;
            }
        }

        boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f41061j.get();
                if (aVarArr == f41051r) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!U.d.a(this.f41061j, aVarArr, aVarArr2));
            return true;
        }

        boolean b() {
            if (this.f41060i) {
                return true;
            }
            Throwable th2 = this.f41059h.get();
            if (this.f41054c || th2 == null) {
                return false;
            }
            c();
            Throwable thB = this.f41059h.b();
            if (thB != ev.j.f130072a) {
                this.f41052a.onError(thB);
            }
            return true;
        }

        boolean c() {
            a<?, ?>[] andSet;
            this.f41062k.dispose();
            a<?, ?>[] aVarArr = this.f41061j.get();
            a<?, ?>[] aVarArr2 = f41051r;
            if (aVarArr == aVarArr2 || (andSet = this.f41061j.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        @Override // Nu.b
        public void dispose() {
            Throwable thB;
            if (this.f41060i) {
                return;
            }
            this.f41060i = true;
            if (!c() || (thB = this.f41059h.b()) == null || thB == ev.j.f130072a) {
                return;
            }
            C14313a.s(thB);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:112:0x011f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0102 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0101 A[PHI: r4
          0x0101: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:76:0x00e0, B:88:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e() {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Yu.W.b.e():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void f(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f41061j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f41050q;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!U.d.a(this.f41061j, aVarArr, aVarArr2));
        }

        void g(io.reactivex.q<? extends U> qVar) {
            boolean z10;
            while (qVar instanceof Callable) {
                if (!j((Callable) qVar) || this.f41055d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        qVar = this.f41066o.poll();
                        if (qVar == null) {
                            z10 = true;
                            this.f41067p--;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    d();
                    return;
                }
            }
            long j10 = this.f41063l;
            this.f41063l = 1 + j10;
            a<T, U> aVar = new a<>(this, j10);
            if (a(aVar)) {
                qVar.subscribe(aVar);
            }
        }

        void h(int i10) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        io.reactivex.q<? extends U> qVarPoll = this.f41066o.poll();
                        if (qVarPoll == null) {
                            this.f41067p--;
                        } else {
                            g(qVarPoll);
                        }
                    } finally {
                    }
                }
                i10 = i11;
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41060i;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41058g) {
                return;
            }
            this.f41058g = true;
            d();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41058g) {
                C14313a.s(th2);
            } else if (!this.f41059h.a(th2)) {
                C14313a.s(th2);
            } else {
                this.f41058g = true;
                d();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41058g) {
                return;
            }
            try {
                io.reactivex.q<? extends U> qVar = (io.reactivex.q) Ru.b.e(this.f41053b.apply(t10), "The mapper returned a null ObservableSource");
                if (this.f41055d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.f41067p;
                            if (i10 == this.f41055d) {
                                this.f41066o.offer(qVar);
                                return;
                            }
                            this.f41067p = i10 + 1;
                        } finally {
                        }
                    }
                }
                g(qVar);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41062k.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41062k, bVar)) {
                this.f41062k = bVar;
                this.f41052a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super U> sVar, Pu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, boolean z10, int i10, int i11) {
            this.f41052a = sVar;
            this.f41053b = oVar;
            this.f41054c = z10;
            this.f41055d = i10;
            this.f41056e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f41066o = new ArrayDeque(i10);
            }
            this.f41061j = new AtomicReference<>(f41050q);
        }

        void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        void i(U u10, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f41052a.onNext(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Su.f c6159c = aVar.f41048d;
                if (c6159c == null) {
                    c6159c = new C6159c(this.f41056e);
                    aVar.f41048d = c6159c;
                }
                c6159c.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            e();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        if (Z0.b(this.f41135a, sVar, this.f41041b)) {
            return;
        }
        this.f41135a.subscribe(new b(sVar, this.f41041b, this.f41042c, this.f41043d, this.f41044e));
    }

    public W(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(qVar);
        this.f41041b = oVar;
        this.f41042c = z10;
        this.f41043d = i10;
        this.f41044e = i11;
    }
}
