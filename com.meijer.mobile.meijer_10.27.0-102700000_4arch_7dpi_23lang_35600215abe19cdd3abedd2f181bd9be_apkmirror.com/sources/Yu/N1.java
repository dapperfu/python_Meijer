package Yu;

import av.C6159c;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class N1<T, R> extends io.reactivex.l<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T>[] f40898a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<? extends T>> f40899b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super Object[], ? extends R> f40900c;

    /* renamed from: d, reason: collision with root package name */
    final int f40901d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f40902e;

    static final class a<T, R> extends AtomicInteger implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f40903a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super Object[], ? extends R> f40904b;

        /* renamed from: c, reason: collision with root package name */
        final b<T, R>[] f40905c;

        /* renamed from: d, reason: collision with root package name */
        final T[] f40906d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f40907e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f40908f;

        void b() {
            for (b<T, R> bVar : this.f40905c) {
                bVar.a();
            }
        }

        boolean c(boolean z10, boolean z11, io.reactivex.s<? super R> sVar, boolean z12, b<?, ?> bVar) {
            if (this.f40908f) {
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
                Throwable th2 = bVar.f40912d;
                this.f40908f = true;
                a();
                if (th2 != null) {
                    sVar.onError(th2);
                } else {
                    sVar.onComplete();
                }
                return true;
            }
            Throwable th3 = bVar.f40912d;
            if (th3 != null) {
                this.f40908f = true;
                a();
                sVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f40908f = true;
            a();
            sVar.onComplete();
            return true;
        }

        void d() {
            for (b<T, R> bVar : this.f40905c) {
                bVar.f40910b.clear();
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f40908f) {
                return;
            }
            this.f40908f = true;
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
            b<T, R>[] bVarArr = this.f40905c;
            io.reactivex.s<? super R> sVar = this.f40903a;
            T[] tArr = this.f40906d;
            boolean z10 = this.f40907e;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = bVar.f40911c;
                        T tPoll = bVar.f40910b.poll();
                        boolean z12 = tPoll == null;
                        if (c(z11, z12, sVar, z10, bVar)) {
                            return;
                        }
                        if (z12) {
                            i10++;
                        } else {
                            tArr[i11] = tPoll;
                        }
                    } else if (bVar.f40911c && !z10 && (th2 = bVar.f40912d) != null) {
                        this.f40908f = true;
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
                        sVar.onNext((Object) Ru.b.e(this.f40904b.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        Ou.a.b(th3);
                        a();
                        sVar.onError(th3);
                        return;
                    }
                }
            }
        }

        public void f(io.reactivex.q<? extends T>[] qVarArr, int i10) {
            b<T, R>[] bVarArr = this.f40905c;
            int length = bVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                bVarArr[i11] = new b<>(this, i10);
            }
            lazySet(0);
            this.f40903a.onSubscribe(this);
            for (int i12 = 0; i12 < length && !this.f40908f; i12++) {
                qVarArr[i12].subscribe(bVarArr[i12]);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40908f;
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
            this.f40903a = sVar;
            this.f40904b = oVar;
            this.f40905c = new b[i10];
            this.f40906d = (T[]) new Object[i10];
            this.f40907e = z10;
        }

        void a() {
            d();
            b();
        }
    }

    static final class b<T, R> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T, R> f40909a;

        /* renamed from: b, reason: collision with root package name */
        final C6159c<T> f40910b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f40911c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f40912d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Nu.b> f40913e = new AtomicReference<>();

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40911c = true;
            this.f40909a.e();
        }

        public void a() {
            Qu.d.a(this.f40913e);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40912d = th2;
            this.f40911c = true;
            this.f40909a.e();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40910b.offer(t10);
            this.f40909a.e();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40913e, bVar);
        }

        b(a<T, R> aVar, int i10) {
            this.f40909a = aVar;
            this.f40910b = new C6159c<>(i10);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        int length;
        io.reactivex.q<? extends T>[] qVarArr = this.f40898a;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            length = 0;
            for (io.reactivex.q<? extends T> qVar : this.f40899b) {
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
            Qu.e.e(sVar);
        } else {
            new a(sVar, this.f40900c, length, this.f40902e).f(qVarArr, this.f40901d);
        }
    }

    public N1(io.reactivex.q<? extends T>[] qVarArr, Iterable<? extends io.reactivex.q<? extends T>> iterable, Pu.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f40898a = qVarArr;
        this.f40899b = iterable;
        this.f40900c = oVar;
        this.f40901d = i10;
        this.f40902e = z10;
    }
}
