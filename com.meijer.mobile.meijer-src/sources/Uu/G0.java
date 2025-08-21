package Uu;

import bv.AbstractC6411a;
import cv.C13558a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class G0<T> extends AbstractC6411a<T> implements I0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f37901a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f37902b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.q<T> f37903c;

    static final class b<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: e, reason: collision with root package name */
        static final a[] f37905e = new a[0];

        /* renamed from: f, reason: collision with root package name */
        static final a[] f37906f = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<b<T>> f37907a;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Ju.b> f37910d = new AtomicReference<>();

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<a<T>[]> f37908b = new AtomicReference<>(f37905e);

        /* renamed from: c, reason: collision with root package name */
        final AtomicBoolean f37909c = new AtomicBoolean();

        boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f37908b.get();
                if (aVarArr == f37906f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!U.d.a(this.f37908b, aVarArr, aVarArr2));
            return true;
        }

        void b(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f37908b.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10].equals(aVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f37905e;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!U.d.a(this.f37908b, aVarArr, aVarArr2));
        }

        @Override // Ju.b
        public void dispose() {
            AtomicReference<a<T>[]> atomicReference = this.f37908b;
            a<T>[] aVarArr = f37906f;
            if (atomicReference.getAndSet(aVarArr) != aVarArr) {
                U.d.a(this.f37907a, this, null);
                Mu.d.a(this.f37910d);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37908b.get() == f37906f;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U.d.a(this.f37907a, this, null);
            for (a<T> aVar : this.f37908b.getAndSet(f37906f)) {
                aVar.f37904a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            U.d.a(this.f37907a, this, null);
            a<T>[] andSet = this.f37908b.getAndSet(f37906f);
            if (andSet.length == 0) {
                C13558a.s(th2);
                return;
            }
            for (a<T> aVar : andSet) {
                aVar.f37904a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            for (a<T> aVar : this.f37908b.get()) {
                aVar.f37904a.onNext(t10);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f37910d, bVar);
        }

        b(AtomicReference<b<T>> atomicReference) {
            this.f37907a = atomicReference;
        }
    }

    static final class c<T> implements io.reactivex.q<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<b<T>> f37911a;

        @Override // io.reactivex.q
        public void subscribe(io.reactivex.s<? super T> sVar) {
            a aVar = new a(sVar);
            sVar.onSubscribe(aVar);
            while (true) {
                b<T> bVar = this.f37911a.get();
                if (bVar == null || bVar.isDisposed()) {
                    b<T> bVar2 = new b<>(this.f37911a);
                    if (U.d.a(this.f37911a, bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                if (bVar.a(aVar)) {
                    aVar.a(bVar);
                    return;
                }
            }
        }

        c(AtomicReference<b<T>> atomicReference) {
            this.f37911a = atomicReference;
        }
    }

    static final class a<T> extends AtomicReference<Object> implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37904a;

        void a(b<T> bVar) {
            if (compareAndSet(null, bVar)) {
                return;
            }
            bVar.b(this);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f37904a = sVar;
        }

        @Override // Ju.b
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((b) andSet).b(this);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }
    }

    public static <T> AbstractC6411a<T> f(io.reactivex.q<T> qVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C13558a.k(new G0(new c(atomicReference), qVar, atomicReference));
    }

    @Override // Uu.I0
    public io.reactivex.q<T> b() {
        return this.f37901a;
    }

    @Override // bv.AbstractC6411a
    public void c(Lu.g<? super Ju.b> gVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f37902b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f37902b);
            if (U.d.a(this.f37902b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f37909c.get() && bVar.f37909c.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(bVar);
            if (z10) {
                this.f37901a.subscribe(bVar);
            }
        } catch (Throwable th2) {
            Ku.a.b(th2);
            throw av.j.d(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f37903c.subscribe(sVar);
    }

    private G0(io.reactivex.q<T> qVar, io.reactivex.q<T> qVar2, AtomicReference<b<T>> atomicReference) {
        this.f37903c = qVar;
        this.f37901a = qVar2;
        this.f37902b = atomicReference;
    }
}
