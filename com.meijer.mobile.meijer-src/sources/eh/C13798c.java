package eh;

import io.reactivex.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13798c<T> extends AbstractC13799d<T> {

    /* renamed from: b, reason: collision with root package name */
    static final a[] f130184b = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f130185a = new AtomicReference<>(f130184b);

    /* renamed from: eh.c$a */
    static final class a<T> extends AtomicBoolean implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f130186a;

        /* renamed from: b, reason: collision with root package name */
        final C13798c<T> f130187b;

        @Override // Ju.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f130187b.e(this);
            }
        }

        a(s<? super T> sVar, C13798c<T> c13798c) {
            this.f130186a = sVar;
            this.f130187b = c13798c;
        }

        public void a(T t10) {
            if (!get()) {
                this.f130186a.onNext(t10);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return get();
        }
    }

    public static <T> C13798c<T> d() {
        return new C13798c<>();
    }

    @Override // Lu.g
    public void accept(T t10) {
        if (t10 == null) {
            throw new NullPointerException("value == null");
        }
        for (a<T> aVar : this.f130185a.get()) {
            aVar.a(t10);
        }
    }

    void c(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f130185a.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f130185a, aVarArr, aVarArr2));
    }

    void e(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f130185a.get();
            if (aVarArr == f130184b) {
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
                aVarArr2 = f130184b;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f130185a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        c(aVar);
        if (aVar.isDisposed()) {
            e(aVar);
        }
    }

    C13798c() {
    }
}
