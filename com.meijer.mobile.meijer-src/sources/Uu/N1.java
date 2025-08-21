package Uu;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class N1<T, R> extends io.reactivex.l<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T>[] f38123a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<? extends T>> f38124b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super Object[], ? extends R> f38125c;

    /* renamed from: d, reason: collision with root package name */
    final int f38126d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f38127e;

    static final class a<T, R> extends AtomicInteger implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38128a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super Object[], ? extends R> f38129b;

        /* renamed from: c, reason: collision with root package name */
        final b<T, R>[] f38130c;

        /* renamed from: d, reason: collision with root package name */
        final T[] f38131d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f38132e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f38133f;

        void b() {
            for (b<T, R> bVar : this.f38130c) {
                bVar.a();
            }
        }

        boolean c(boolean z10, boolean z11, io.reactivex.s<? super R> sVar, boolean z12, b<?, ?> bVar) {
            if (this.f38133f) {
                a();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = bVar.f38137d;
                this.f38133f = true;
                a();
                if (th2 != null) {
                    sVar.onError(th2);
                } else {
                    sVar.onComplete();
                }
                return true;
            }
            Throwable th3 = bVar.f38137d;
            if (th3 != null) {
                this.f38133f = true;
                a();
                sVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f38133f = true;
            a();
            sVar.onComplete();
            return true;
        }

        void d() {
            for (b<T, R> bVar : this.f38130c) {
                bVar.f38135b.clear();
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38133f) {
                return;
            }
            this.f38133f = true;
            b();
            if (getAndIncrement() == 0) {
                d();
            }
        }

        public void e() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.f38130c;
            io.reactivex.s<? super R> sVar = this.f38128a;
            T[] tArr = this.f38131d;
            boolean z10 = this.f38132e;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = bVar.f38136c;
                        T tPoll = bVar.f38135b.poll();
                        boolean z12 = tPoll == null;
                        if (c(z11, z12, sVar, z10, bVar)) {
                            return;
                        }
                        if (z12) {
                            i10++;
                        } else {
                            tArr[i11] = tPoll;
                        }
                    } else if (bVar.f38136c && !z10 && (th2 = bVar.f38137d) != null) {
                        this.f38133f = true;
                        a();
                        sVar.onError(th2);
                        return;
                    }
                    i11++;
                }
                if (i10 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        sVar.onNext((Object) Nu.b.e(this.f38129b.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        Ku.a.b(th3);
                        a();
                        sVar.onError(th3);
                        return;
                    }
                }
            }
        }

        public void f(io.reactivex.q<? extends T>[] qVarArr, int i10) {
            b<T, R>[] bVarArr = this.f38130c;
            int length = bVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                bVarArr[i11] = new b<>(this, i10);
            }
            lazySet(0);
            this.f38128a.onSubscribe(this);
            for (int i12 = 0; i12 < length && !this.f38133f; i12++) {
                qVarArr[i12].subscribe(bVarArr[i12]);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38133f;
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
            this.f38128a = sVar;
            this.f38129b = oVar;
            this.f38130c = new b[i10];
            this.f38131d = (T[]) new Object[i10];
            this.f38132e = z10;
        }

        void a() {
            d();
            b();
        }
    }

    static final class b<T, R> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T, R> f38134a;

        /* renamed from: b, reason: collision with root package name */
        final Wu.c<T> f38135b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f38136c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f38137d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Ju.b> f38138e = new AtomicReference<>();

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38136c = true;
            this.f38134a.e();
        }

        public void a() {
            Mu.d.a(this.f38138e);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38137d = th2;
            this.f38136c = true;
            this.f38134a.e();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38135b.offer(t10);
            this.f38134a.e();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f38138e, bVar);
        }

        b(a<T, R> aVar, int i10) {
            this.f38134a = aVar;
            this.f38135b = new Wu.c<>(i10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        int length;
        io.reactivex.q<? extends T>[] qVarArr = this.f38123a;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            length = 0;
            for (io.reactivex.q<? extends T> qVar : this.f38124b) {
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
        if (length == 0) {
            Mu.e.e(sVar);
        } else {
            new a(sVar, this.f38125c, length, this.f38127e).f(qVarArr, this.f38126d);
        }
    }

    public N1(io.reactivex.q<? extends T>[] qVarArr, Iterable<? extends io.reactivex.q<? extends T>> iterable, Lu.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f38123a = qVarArr;
        this.f38124b = iterable;
        this.f38125c = oVar;
        this.f38126d = i10;
        this.f38127e = z10;
    }
}
