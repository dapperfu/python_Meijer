package Yu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5484q<T> extends AbstractC5436a<T, T> implements io.reactivex.s<T> {

    /* renamed from: k, reason: collision with root package name */
    static final a[] f41549k = new a[0];

    /* renamed from: l, reason: collision with root package name */
    static final a[] f41550l = new a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f41551b;

    /* renamed from: c, reason: collision with root package name */
    final int f41552c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<a<T>[]> f41553d;

    /* renamed from: e, reason: collision with root package name */
    volatile long f41554e;

    /* renamed from: f, reason: collision with root package name */
    final b<T> f41555f;

    /* renamed from: g, reason: collision with root package name */
    b<T> f41556g;

    /* renamed from: h, reason: collision with root package name */
    int f41557h;

    /* renamed from: i, reason: collision with root package name */
    Throwable f41558i;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f41559j;

    /* renamed from: Yu.q$a */
    static final class a<T> extends AtomicInteger implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41560a;

        /* renamed from: b, reason: collision with root package name */
        final C5484q<T> f41561b;

        /* renamed from: c, reason: collision with root package name */
        b<T> f41562c;

        /* renamed from: d, reason: collision with root package name */
        int f41563d;

        /* renamed from: e, reason: collision with root package name */
        long f41564e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f41565f;

        @Override // Nu.b
        public void dispose() {
            if (this.f41565f) {
                return;
            }
            this.f41565f = true;
            this.f41561b.d(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41565f;
        }

        a(io.reactivex.s<? super T> sVar, C5484q<T> c5484q) {
            this.f41560a = sVar;
            this.f41561b = c5484q;
            this.f41562c = c5484q.f41555f;
        }
    }

    @Override // io.reactivex.s
    public void onComplete() {
        this.f41559j = true;
        for (a<T> aVar : this.f41553d.getAndSet(f41550l)) {
            e(aVar);
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
    }

    /* renamed from: Yu.q$b */
    static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        final T[] f41566a;

        /* renamed from: b, reason: collision with root package name */
        volatile b<T> f41567b;

        b(int i10) {
            this.f41566a = (T[]) new Object[i10];
        }
    }

    void c(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f41553d.get();
            if (aVarArr == f41550l) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f41553d, aVarArr, aVarArr2));
    }

    void d(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f41553d.get();
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
                aVarArr2 = f41549k;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f41553d, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        this.f41558i = th2;
        this.f41559j = true;
        for (a<T> aVar : this.f41553d.getAndSet(f41550l)) {
            e(aVar);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        int i10 = this.f41557h;
        if (i10 == this.f41552c) {
            b<T> bVar = new b<>(i10);
            bVar.f41566a[0] = t10;
            this.f41557h = 1;
            this.f41556g.f41567b = bVar;
            this.f41556g = bVar;
        } else {
            this.f41556g.f41566a[i10] = t10;
            this.f41557h = i10 + 1;
        }
        this.f41554e++;
        for (a<T> aVar : this.f41553d.get()) {
            e(aVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        c(aVar);
        if (this.f41551b.get() || !this.f41551b.compareAndSet(false, true)) {
            e(aVar);
        } else {
            this.f41135a.subscribe(this);
        }
    }

    public C5484q(io.reactivex.l<T> lVar, int i10) {
        super(lVar);
        this.f41552c = i10;
        this.f41551b = new AtomicBoolean();
        b<T> bVar = new b<>(i10);
        this.f41555f = bVar;
        this.f41556g = bVar;
        this.f41553d = new AtomicReference<>(f41549k);
    }

    void e(a<T> aVar) {
        boolean z10;
        if (aVar.getAndIncrement() == 0) {
            long j10 = aVar.f41564e;
            int i10 = aVar.f41563d;
            b<T> bVar = aVar.f41562c;
            io.reactivex.s<? super T> sVar = aVar.f41560a;
            int i11 = this.f41552c;
            int iAddAndGet = 1;
            while (!aVar.f41565f) {
                boolean z11 = this.f41559j;
                if (this.f41554e == j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 && z10) {
                    aVar.f41562c = null;
                    Throwable th2 = this.f41558i;
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
                        bVar = bVar.f41567b;
                        i10 = 0;
                    }
                    sVar.onNext(bVar.f41566a[i10]);
                    i10++;
                    j10++;
                } else {
                    aVar.f41564e = j10;
                    aVar.f41563d = i10;
                    aVar.f41562c = bVar;
                    iAddAndGet = aVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar.f41562c = null;
        }
    }
}
