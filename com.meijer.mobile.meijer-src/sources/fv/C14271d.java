package fv;

import cv.C13558a;
import io.reactivex.u;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fv.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14271d<T> extends u<T> implements w<T> {

    /* renamed from: e, reason: collision with root package name */
    static final a[] f133693e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    static final a[] f133694f = new a[0];

    /* renamed from: c, reason: collision with root package name */
    T f133697c;

    /* renamed from: d, reason: collision with root package name */
    Throwable f133698d;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f133696b = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f133695a = new AtomicReference<>(f133693e);

    /* renamed from: fv.d$a */
    static final class a<T> extends AtomicReference<C14271d<T>> implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f133699a;

        @Override // Ju.b
        public void dispose() {
            C14271d<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.y(this);
            }
        }

        a(w<? super T> wVar, C14271d<T> c14271d) {
            this.f133699a = wVar;
            lazySet(c14271d);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }
    }

    public static <T> C14271d<T> x() {
        return new C14271d<>();
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        Nu.b.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f133696b.compareAndSet(false, true)) {
            C13558a.s(th2);
            return;
        }
        this.f133698d = th2;
        for (a<T> aVar : this.f133695a.getAndSet(f133694f)) {
            aVar.f133699a.onError(th2);
        }
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onSubscribe(Ju.b bVar) {
        if (this.f133695a.get() == f133694f) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.w, io.reactivex.i
    public void onSuccess(T t10) {
        Nu.b.e(t10, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f133696b.compareAndSet(false, true)) {
            this.f133697c = t10;
            for (a<T> aVar : this.f133695a.getAndSet(f133694f)) {
                aVar.f133699a.onSuccess(t10);
            }
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        a<T> aVar = new a<>(wVar, this);
        wVar.onSubscribe(aVar);
        if (w(aVar)) {
            if (aVar.isDisposed()) {
                y(aVar);
            }
        } else {
            Throwable th2 = this.f133698d;
            if (th2 != null) {
                wVar.onError(th2);
            } else {
                wVar.onSuccess(this.f133697c);
            }
        }
    }

    boolean w(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f133695a.get();
            if (aVarArr == f133694f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f133695a, aVarArr, aVarArr2));
        return true;
    }

    void y(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f133695a.get();
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
                aVarArr2 = f133693e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f133695a, aVarArr, aVarArr2));
    }

    C14271d() {
    }
}
