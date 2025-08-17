package dh;

import io.reactivex.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dh.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13522c<T> extends AbstractC13523d<T> {

    /* renamed from: b, reason: collision with root package name */
    static final a[] f127408b = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f127409a = new AtomicReference<>(f127408b);

    /* renamed from: dh.c$a */
    static final class a<T> extends AtomicBoolean implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f127410a;

        /* renamed from: b, reason: collision with root package name */
        final C13522c<T> f127411b;

        @Override // Nu.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f127411b.e(this);
            }
        }

        a(s<? super T> sVar, C13522c<T> c13522c) {
            this.f127410a = sVar;
            this.f127411b = c13522c;
        }

        public void a(T t10) {
            if (!get()) {
                this.f127410a.onNext(t10);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return get();
        }
    }

    public static <T> C13522c<T> d() {
        return new C13522c<>();
    }

    @Override // Pu.g
    public void accept(T t10) {
        if (t10 == null) {
            throw new NullPointerException("value == null");
        }
        for (a<T> aVar : this.f127409a.get()) {
            aVar.a(t10);
        }
    }

    void c(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f127409a.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f127409a, aVarArr, aVarArr2));
    }

    void e(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f127409a.get();
            if (aVarArr == f127408b) {
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
                aVarArr2 = f127408b;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f127409a, aVarArr, aVarArr2));
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

    C13522c() {
    }
}
