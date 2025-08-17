package Yu;

import fv.AbstractC14143a;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class G0<T> extends AbstractC14143a<T> implements I0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40676a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f40677b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.q<T> f40678c;

    static final class b<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: e, reason: collision with root package name */
        static final a[] f40680e = new a[0];

        /* renamed from: f, reason: collision with root package name */
        static final a[] f40681f = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<b<T>> f40682a;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Nu.b> f40685d = new AtomicReference<>();

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<a<T>[]> f40683b = new AtomicReference<>(f40680e);

        /* renamed from: c, reason: collision with root package name */
        final AtomicBoolean f40684c = new AtomicBoolean();

        boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f40683b.get();
                if (aVarArr == f40681f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!U.d.a(this.f40683b, aVarArr, aVarArr2));
            return true;
        }

        void b(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f40683b.get();
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
                    aVarArr2 = f40680e;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!U.d.a(this.f40683b, aVarArr, aVarArr2));
        }

        @Override // Nu.b
        public void dispose() {
            AtomicReference<a<T>[]> atomicReference = this.f40683b;
            a<T>[] aVarArr = f40681f;
            if (atomicReference.getAndSet(aVarArr) != aVarArr) {
                U.d.a(this.f40682a, this, null);
                Qu.d.a(this.f40685d);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40683b.get() == f40681f;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U.d.a(this.f40682a, this, null);
            for (a<T> aVar : this.f40683b.getAndSet(f40681f)) {
                aVar.f40679a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            U.d.a(this.f40682a, this, null);
            a<T>[] andSet = this.f40683b.getAndSet(f40681f);
            if (andSet.length == 0) {
                C14313a.s(th2);
                return;
            }
            for (a<T> aVar : andSet) {
                aVar.f40679a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            for (a<T> aVar : this.f40683b.get()) {
                aVar.f40679a.onNext(t10);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40685d, bVar);
        }

        b(AtomicReference<b<T>> atomicReference) {
            this.f40682a = atomicReference;
        }
    }

    static final class c<T> implements io.reactivex.q<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<b<T>> f40686a;

        @Override // io.reactivex.q
        public void subscribe(io.reactivex.s<? super T> sVar) {
            a aVar = new a(sVar);
            sVar.onSubscribe(aVar);
            while (true) {
                b<T> bVar = this.f40686a.get();
                if (bVar == null || bVar.isDisposed()) {
                    b<T> bVar2 = new b<>(this.f40686a);
                    if (U.d.a(this.f40686a, bVar, bVar2)) {
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
            this.f40686a = atomicReference;
        }
    }

    static final class a<T> extends AtomicReference<Object> implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40679a;

        void a(b<T> bVar) {
            if (compareAndSet(null, bVar)) {
                return;
            }
            bVar.b(this);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f40679a = sVar;
        }

        @Override // Nu.b
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((b) andSet).b(this);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }
    }

    public static <T> AbstractC14143a<T> f(io.reactivex.q<T> qVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C14313a.k(new G0(new c(atomicReference), qVar, atomicReference));
    }

    @Override // Yu.I0
    public io.reactivex.q<T> a() {
        return this.f40676a;
    }

    @Override // fv.AbstractC14143a
    public void c(Pu.g<? super Nu.b> gVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f40677b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f40677b);
            if (U.d.a(this.f40677b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f40684c.get() && bVar.f40684c.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(bVar);
            if (z10) {
                this.f40676a.subscribe(bVar);
            }
        } catch (Throwable th2) {
            Ou.a.b(th2);
            throw ev.j.d(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f40678c.subscribe(sVar);
    }

    private G0(io.reactivex.q<T> qVar, io.reactivex.q<T> qVar2, AtomicReference<b<T>> atomicReference) {
        this.f40678c = qVar;
        this.f40676a = qVar2;
        this.f40677b = atomicReference;
    }
}
