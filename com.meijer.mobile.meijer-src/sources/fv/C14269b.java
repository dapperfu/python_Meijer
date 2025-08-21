package fv;

import cv.C13558a;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fv.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14269b<T> extends AbstractC14272e<T> {

    /* renamed from: c, reason: collision with root package name */
    static final a[] f133683c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    static final a[] f133684d = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f133685a = new AtomicReference<>(f133684d);

    /* renamed from: b, reason: collision with root package name */
    Throwable f133686b;

    /* renamed from: fv.b$a */
    static final class a<T> extends AtomicBoolean implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f133687a;

        /* renamed from: b, reason: collision with root package name */
        final C14269b<T> f133688b;

        @Override // Ju.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f133688b.f(this);
            }
        }

        a(s<? super T> sVar, C14269b<T> c14269b) {
            this.f133687a = sVar;
            this.f133688b = c14269b;
        }

        public void a() {
            if (!get()) {
                this.f133687a.onComplete();
            }
        }

        public void b(Throwable th2) {
            if (get()) {
                C13558a.s(th2);
            } else {
                this.f133687a.onError(th2);
            }
        }

        public void c(T t10) {
            if (!get()) {
                this.f133687a.onNext(t10);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return get();
        }
    }

    public static <T> C14269b<T> e() {
        return new C14269b<>();
    }

    boolean d(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f133685a.get();
            if (aVarArr == f133683c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f133685a, aVarArr, aVarArr2));
        return true;
    }

    void f(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f133685a.get();
            if (aVarArr == f133683c || aVarArr == f133684d) {
                return;
            }
            int length = aVarArr.length;
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
                aVarArr2 = f133684d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f133685a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.s
    public void onComplete() {
        a<T>[] aVarArr = this.f133685a.get();
        a<T>[] aVarArr2 = f133683c;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.f133685a.getAndSet(aVarArr2)) {
            aVar.a();
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Nu.b.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f133685a.get();
        a<T>[] aVarArr2 = f133683c;
        if (aVarArr == aVarArr2) {
            C13558a.s(th2);
            return;
        }
        this.f133686b = th2;
        for (a<T> aVar : this.f133685a.getAndSet(aVarArr2)) {
            aVar.b(th2);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        Nu.b.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.f133685a.get()) {
            aVar.c(t10);
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        if (this.f133685a.get() == f133683c) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        if (d(aVar)) {
            if (aVar.isDisposed()) {
                f(aVar);
            }
        } else {
            Throwable th2 = this.f133686b;
            if (th2 != null) {
                sVar.onError(th2);
            } else {
                sVar.onComplete();
            }
        }
    }

    C14269b() {
    }
}
