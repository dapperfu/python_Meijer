package Yu;

import fv.AbstractC14143a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class H0<T> extends AbstractC14143a<T> implements Qu.g {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40712a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f40713b = new AtomicReference<>();

    static final class b<T> extends AtomicReference<a<T>[]> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: e, reason: collision with root package name */
        static final a[] f40715e = new a[0];

        /* renamed from: f, reason: collision with root package name */
        static final a[] f40716f = new a[0];

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<b<T>> f40718b;

        /* renamed from: d, reason: collision with root package name */
        Throwable f40720d;

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f40717a = new AtomicBoolean();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<Nu.b> f40719c = new AtomicReference<>();

        @Override // Nu.b
        public void dispose() {
            getAndSet(f40716f);
            U.d.a(this.f40718b, this, null);
            Qu.d.a(this.f40719c);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40719c.lazySet(Qu.d.DISPOSED);
            for (a<T> aVar : getAndSet(f40716f)) {
                aVar.f40714a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40720d = th2;
            this.f40719c.lazySet(Qu.d.DISPOSED);
            for (a<T> aVar : getAndSet(f40716f)) {
                aVar.f40714a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40719c, bVar);
        }

        b(AtomicReference<b<T>> atomicReference) {
            this.f40718b = atomicReference;
            lazySet(f40715e);
        }

        public boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f40716f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        public void b(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (aVarArr[i10] == aVar) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 >= 0) {
                        aVarArr2 = f40715e;
                        if (length != 1) {
                            aVarArr2 = new a[length - 1];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                            System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() == f40716f) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            for (a<T> aVar : get()) {
                aVar.f40714a.onNext(t10);
            }
        }
    }

    static final class a<T> extends AtomicReference<b<T>> implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40714a;

        @Override // Nu.b
        public void dispose() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.b(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, b<T> bVar) {
            this.f40714a = sVar;
            lazySet(bVar);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }
    }

    @Override // Qu.g
    public void b(Nu.b bVar) {
        U.d.a(this.f40713b, (b) bVar, null);
    }

    @Override // fv.AbstractC14143a
    public void c(Pu.g<? super Nu.b> gVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f40713b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f40713b);
            if (U.d.a(this.f40713b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f40717a.get() && bVar.f40717a.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(bVar);
            if (z10) {
                this.f40712a.subscribe(bVar);
            }
        } catch (Throwable th2) {
            Ou.a.b(th2);
            throw ev.j.d(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f40713b.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(this.f40713b);
            if (U.d.a(this.f40713b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        a<T> aVar = new a<>(sVar, bVar);
        sVar.onSubscribe(aVar);
        if (bVar.a(aVar)) {
            if (aVar.isDisposed()) {
                bVar.b(aVar);
            }
        } else {
            Throwable th2 = bVar.f40720d;
            if (th2 != null) {
                sVar.onError(th2);
            } else {
                sVar.onComplete();
            }
        }
    }

    public H0(io.reactivex.q<T> qVar) {
        this.f40712a = qVar;
    }
}
