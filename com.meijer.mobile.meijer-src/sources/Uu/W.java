package Uu;

import cv.C13558a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class W<T, U> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.q<? extends U>> f38266b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f38267c;

    /* renamed from: d, reason: collision with root package name */
    final int f38268d;

    /* renamed from: e, reason: collision with root package name */
    final int f38269e;

    static final class a<T, U> extends AtomicReference<Ju.b> implements io.reactivex.s<U> {

        /* renamed from: a, reason: collision with root package name */
        final long f38270a;

        /* renamed from: b, reason: collision with root package name */
        final b<T, U> f38271b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f38272c;

        /* renamed from: d, reason: collision with root package name */
        volatile Ou.f<U> f38273d;

        /* renamed from: e, reason: collision with root package name */
        int f38274e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38272c = true;
            this.f38271b.d();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f38271b.f38284h.a(th2)) {
                C13558a.s(th2);
                return;
            }
            b<T, U> bVar = this.f38271b;
            if (!bVar.f38279c) {
                bVar.c();
            }
            this.f38272c = true;
            this.f38271b.d();
        }

        @Override // io.reactivex.s
        public void onNext(U u10) {
            if (this.f38274e == 0) {
                this.f38271b.i(u10, this);
            } else {
                this.f38271b.d();
            }
        }

        a(b<T, U> bVar, long j10) {
            this.f38270a = j10;
            this.f38271b = bVar;
        }

        public void a() {
            Mu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this, bVar) && (bVar instanceof Ou.b)) {
                Ou.b bVar2 = (Ou.b) bVar;
                int iA = bVar2.a(7);
                if (iA == 1) {
                    this.f38274e = iA;
                    this.f38273d = bVar2;
                    this.f38272c = true;
                    this.f38271b.d();
                    return;
                }
                if (iA == 2) {
                    this.f38274e = iA;
                    this.f38273d = bVar2;
                }
            }
        }
    }

    static final class b<T, U> extends AtomicInteger implements Ju.b, io.reactivex.s<T> {

        /* renamed from: q, reason: collision with root package name */
        static final a<?, ?>[] f38275q = new a[0];

        /* renamed from: r, reason: collision with root package name */
        static final a<?, ?>[] f38276r = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f38277a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<? extends U>> f38278b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f38279c;

        /* renamed from: d, reason: collision with root package name */
        final int f38280d;

        /* renamed from: e, reason: collision with root package name */
        final int f38281e;

        /* renamed from: f, reason: collision with root package name */
        volatile Ou.e<U> f38282f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38283g;

        /* renamed from: h, reason: collision with root package name */
        final av.c f38284h = new av.c();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f38285i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f38286j;

        /* renamed from: k, reason: collision with root package name */
        Ju.b f38287k;

        /* renamed from: l, reason: collision with root package name */
        long f38288l;

        /* renamed from: m, reason: collision with root package name */
        long f38289m;

        /* renamed from: n, reason: collision with root package name */
        int f38290n;

        /* renamed from: o, reason: collision with root package name */
        Queue<io.reactivex.q<? extends U>> f38291o;

        /* renamed from: p, reason: collision with root package name */
        int f38292p;

        boolean j(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f38277a.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    Ou.e<U> cVar = this.f38282f;
                    if (cVar == null) {
                        cVar = this.f38280d == Integer.MAX_VALUE ? new Wu.c<>(this.f38281e) : new Wu.b<>(this.f38280d);
                        this.f38282f = cVar;
                    }
                    if (!cVar.offer(uCall)) {
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
                Ku.a.b(th2);
                this.f38284h.a(th2);
                d();
                return true;
            }
        }

        boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f38286j.get();
                if (aVarArr == f38276r) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!U.d.a(this.f38286j, aVarArr, aVarArr2));
            return true;
        }

        boolean b() {
            if (this.f38285i) {
                return true;
            }
            Throwable th2 = this.f38284h.get();
            if (this.f38279c || th2 == null) {
                return false;
            }
            c();
            Throwable thB = this.f38284h.b();
            if (thB != av.j.f59694a) {
                this.f38277a.onError(thB);
            }
            return true;
        }

        boolean c() {
            a<?, ?>[] andSet;
            this.f38287k.dispose();
            a<?, ?>[] aVarArr = this.f38286j.get();
            a<?, ?>[] aVarArr2 = f38276r;
            if (aVarArr == aVarArr2 || (andSet = this.f38286j.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        @Override // Ju.b
        public void dispose() {
            Throwable thB;
            if (this.f38285i) {
                return;
            }
            this.f38285i = true;
            if (!c() || (thB = this.f38284h.b()) == null || thB == av.j.f59694a) {
                return;
            }
            C13558a.s(thB);
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
            throw new UnsupportedOperationException("Method not decompiled: Uu.W.b.e():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void f(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f38286j.get();
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
                    aVarArr2 = f38275q;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!U.d.a(this.f38286j, aVarArr, aVarArr2));
        }

        void g(io.reactivex.q<? extends U> qVar) {
            boolean z10;
            while (qVar instanceof Callable) {
                if (!j((Callable) qVar) || this.f38280d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        qVar = this.f38291o.poll();
                        if (qVar == null) {
                            z10 = true;
                            this.f38292p--;
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
            long j10 = this.f38288l;
            this.f38288l = 1 + j10;
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
                        io.reactivex.q<? extends U> qVarPoll = this.f38291o.poll();
                        if (qVarPoll == null) {
                            this.f38292p--;
                        } else {
                            g(qVarPoll);
                        }
                    } finally {
                    }
                }
                i10 = i11;
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38285i;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38283g) {
                return;
            }
            this.f38283g = true;
            d();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38283g) {
                C13558a.s(th2);
            } else if (!this.f38284h.a(th2)) {
                C13558a.s(th2);
            } else {
                this.f38283g = true;
                d();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38283g) {
                return;
            }
            try {
                io.reactivex.q<? extends U> qVar = (io.reactivex.q) Nu.b.e(this.f38278b.apply(t10), "The mapper returned a null ObservableSource");
                if (this.f38280d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.f38292p;
                            if (i10 == this.f38280d) {
                                this.f38291o.offer(qVar);
                                return;
                            }
                            this.f38292p = i10 + 1;
                        } finally {
                        }
                    }
                }
                g(qVar);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38287k.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38287k, bVar)) {
                this.f38287k = bVar;
                this.f38277a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super U> sVar, Lu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, boolean z10, int i10, int i11) {
            this.f38277a = sVar;
            this.f38278b = oVar;
            this.f38279c = z10;
            this.f38280d = i10;
            this.f38281e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f38291o = new ArrayDeque(i10);
            }
            this.f38286j = new AtomicReference<>(f38275q);
        }

        void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        void i(U u10, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f38277a.onNext(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Ou.f cVar = aVar.f38273d;
                if (cVar == null) {
                    cVar = new Wu.c(this.f38281e);
                    aVar.f38273d = cVar;
                }
                cVar.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            e();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        if (Z0.b(this.f38360a, sVar, this.f38266b)) {
            return;
        }
        this.f38360a.subscribe(new b(sVar, this.f38266b, this.f38267c, this.f38268d, this.f38269e));
    }

    public W(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(qVar);
        this.f38266b = oVar;
        this.f38267c = z10;
        this.f38268d = i10;
        this.f38269e = i11;
    }
}
