package Uu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5423q<T> extends AbstractC5375a<T, T> implements io.reactivex.s<T> {

    /* renamed from: k, reason: collision with root package name */
    static final a[] f38774k = new a[0];

    /* renamed from: l, reason: collision with root package name */
    static final a[] f38775l = new a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f38776b;

    /* renamed from: c, reason: collision with root package name */
    final int f38777c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<a<T>[]> f38778d;

    /* renamed from: e, reason: collision with root package name */
    volatile long f38779e;

    /* renamed from: f, reason: collision with root package name */
    final b<T> f38780f;

    /* renamed from: g, reason: collision with root package name */
    b<T> f38781g;

    /* renamed from: h, reason: collision with root package name */
    int f38782h;

    /* renamed from: i, reason: collision with root package name */
    Throwable f38783i;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f38784j;

    /* renamed from: Uu.q$a */
    static final class a<T> extends AtomicInteger implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38785a;

        /* renamed from: b, reason: collision with root package name */
        final C5423q<T> f38786b;

        /* renamed from: c, reason: collision with root package name */
        b<T> f38787c;

        /* renamed from: d, reason: collision with root package name */
        int f38788d;

        /* renamed from: e, reason: collision with root package name */
        long f38789e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f38790f;

        @Override // Ju.b
        public void dispose() {
            if (this.f38790f) {
                return;
            }
            this.f38790f = true;
            this.f38786b.d(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38790f;
        }

        a(io.reactivex.s<? super T> sVar, C5423q<T> c5423q) {
            this.f38785a = sVar;
            this.f38786b = c5423q;
            this.f38787c = c5423q.f38780f;
        }
    }

    @Override // io.reactivex.s
    public void onComplete() {
        this.f38784j = true;
        for (a<T> aVar : this.f38778d.getAndSet(f38775l)) {
            e(aVar);
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
    }

    /* renamed from: Uu.q$b */
    static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        final T[] f38791a;

        /* renamed from: b, reason: collision with root package name */
        volatile b<T> f38792b;

        b(int i10) {
            this.f38791a = (T[]) new Object[i10];
        }
    }

    void c(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f38778d.get();
            if (aVarArr == f38775l) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f38778d, aVarArr, aVarArr2));
    }

    void d(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f38778d.get();
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
                aVarArr2 = f38774k;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f38778d, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        this.f38783i = th2;
        this.f38784j = true;
        for (a<T> aVar : this.f38778d.getAndSet(f38775l)) {
            e(aVar);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        int i10 = this.f38782h;
        if (i10 == this.f38777c) {
            b<T> bVar = new b<>(i10);
            bVar.f38791a[0] = t10;
            this.f38782h = 1;
            this.f38781g.f38792b = bVar;
            this.f38781g = bVar;
        } else {
            this.f38781g.f38791a[i10] = t10;
            this.f38782h = i10 + 1;
        }
        this.f38779e++;
        for (a<T> aVar : this.f38778d.get()) {
            e(aVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        c(aVar);
        if (this.f38776b.get() || !this.f38776b.compareAndSet(false, true)) {
            e(aVar);
        } else {
            this.f38360a.subscribe(this);
        }
    }

    public C5423q(io.reactivex.l<T> lVar, int i10) {
        super(lVar);
        this.f38777c = i10;
        this.f38776b = new AtomicBoolean();
        b<T> bVar = new b<>(i10);
        this.f38780f = bVar;
        this.f38781g = bVar;
        this.f38778d = new AtomicReference<>(f38774k);
    }

    void e(a<T> aVar) {
        boolean z10;
        if (aVar.getAndIncrement() == 0) {
            long j10 = aVar.f38789e;
            int i10 = aVar.f38788d;
            b<T> bVar = aVar.f38787c;
            io.reactivex.s<? super T> sVar = aVar.f38785a;
            int i11 = this.f38777c;
            int iAddAndGet = 1;
            while (!aVar.f38790f) {
                boolean z11 = this.f38784j;
                if (this.f38779e == j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 && z10) {
                    aVar.f38787c = null;
                    Throwable th2 = this.f38783i;
                    if (th2 != null) {
                        sVar.onError(th2);
                        return;
                    } else {
                        sVar.onComplete();
                        return;
                    }
                }
                if (!z10) {
                    if (i10 == i11) {
                        bVar = bVar.f38792b;
                        i10 = 0;
                    }
                    sVar.onNext(bVar.f38791a[i10]);
                    i10++;
                    j10++;
                } else {
                    aVar.f38789e = j10;
                    aVar.f38788d = i10;
                    aVar.f38787c = bVar;
                    iAddAndGet = aVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar.f38787c = null;
        }
    }
}
