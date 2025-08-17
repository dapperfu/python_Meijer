package jv;

import gv.C14313a;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jv.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15079b<T> extends AbstractC15082e<T> {

    /* renamed from: c, reason: collision with root package name */
    static final a[] f141079c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    static final a[] f141080d = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f141081a = new AtomicReference<>(f141080d);

    /* renamed from: b, reason: collision with root package name */
    Throwable f141082b;

    /* renamed from: jv.b$a */
    static final class a<T> extends AtomicBoolean implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f141083a;

        /* renamed from: b, reason: collision with root package name */
        final C15079b<T> f141084b;

        @Override // Nu.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f141084b.f(this);
            }
        }

        a(s<? super T> sVar, C15079b<T> c15079b) {
            this.f141083a = sVar;
            this.f141084b = c15079b;
        }

        public void a() {
            if (!get()) {
                this.f141083a.onComplete();
            }
        }

        public void b(Throwable th2) {
            if (get()) {
                C14313a.s(th2);
            } else {
                this.f141083a.onError(th2);
            }
        }

        public void c(T t10) {
            if (!get()) {
                this.f141083a.onNext(t10);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return get();
        }
    }

    public static <T> C15079b<T> e() {
        return new C15079b<>();
    }

    boolean d(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f141081a.get();
            if (aVarArr == f141079c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f141081a, aVarArr, aVarArr2));
        return true;
    }

    void f(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f141081a.get();
            if (aVarArr == f141079c || aVarArr == f141080d) {
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
                aVarArr2 = f141080d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f141081a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.s
    public void onComplete() {
        a<T>[] aVarArr = this.f141081a.get();
        a<T>[] aVarArr2 = f141079c;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.f141081a.getAndSet(aVarArr2)) {
            aVar.a();
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Ru.b.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f141081a.get();
        a<T>[] aVarArr2 = f141079c;
        if (aVarArr == aVarArr2) {
            C14313a.s(th2);
            return;
        }
        this.f141082b = th2;
        for (a<T> aVar : this.f141081a.getAndSet(aVarArr2)) {
            aVar.b(th2);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        Ru.b.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.f141081a.get()) {
            aVar.c(t10);
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        if (this.f141081a.get() == f141079c) {
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
            Throwable th2 = this.f141082b;
            if (th2 != null) {
                sVar.onError(th2);
            } else {
                sVar.onComplete();
            }
        }
    }

    C15079b() {
    }
}
