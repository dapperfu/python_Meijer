package Uu;

import bv.AbstractC6411a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class H0<T> extends AbstractC6411a<T> implements Mu.g {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f37937a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f37938b = new AtomicReference<>();

    static final class b<T> extends AtomicReference<a<T>[]> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: e, reason: collision with root package name */
        static final a[] f37940e = new a[0];

        /* renamed from: f, reason: collision with root package name */
        static final a[] f37941f = new a[0];

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<b<T>> f37943b;

        /* renamed from: d, reason: collision with root package name */
        Throwable f37945d;

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f37942a = new AtomicBoolean();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<Ju.b> f37944c = new AtomicReference<>();

        @Override // Ju.b
        public void dispose() {
            getAndSet(f37941f);
            U.d.a(this.f37943b, this, null);
            Mu.d.a(this.f37944c);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37944c.lazySet(Mu.d.DISPOSED);
            for (a<T> aVar : getAndSet(f37941f)) {
                aVar.f37939a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37945d = th2;
            this.f37944c.lazySet(Mu.d.DISPOSED);
            for (a<T> aVar : getAndSet(f37941f)) {
                aVar.f37939a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f37944c, bVar);
        }

        b(AtomicReference<b<T>> atomicReference) {
            this.f37943b = atomicReference;
            lazySet(f37940e);
        }

        public boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f37941f) {
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
                        aVarArr2 = f37940e;
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

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == f37941f) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            for (a<T> aVar : get()) {
                aVar.f37939a.onNext(t10);
            }
        }
    }

    static final class a<T> extends AtomicReference<b<T>> implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37939a;

        @Override // Ju.b
        public void dispose() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.b(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, b<T> bVar) {
            this.f37939a = sVar;
            lazySet(bVar);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }
    }

    @Override // Mu.g
    public void a(Ju.b bVar) {
        U.d.a(this.f37938b, (b) bVar, null);
    }

    @Override // bv.AbstractC6411a
    public void c(Lu.g<? super Ju.b> gVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f37938b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f37938b);
            if (U.d.a(this.f37938b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f37942a.get() && bVar.f37942a.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(bVar);
            if (z10) {
                this.f37937a.subscribe(bVar);
            }
        } catch (Throwable th2) {
            Ku.a.b(th2);
            throw av.j.d(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f37938b.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(this.f37938b);
            if (U.d.a(this.f37938b, bVar, bVar2)) {
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
            Throwable th2 = bVar.f37945d;
            if (th2 != null) {
                sVar.onError(th2);
            } else {
                sVar.onComplete();
            }
        }
    }

    public H0(io.reactivex.q<T> qVar) {
        this.f37937a = qVar;
    }
}
