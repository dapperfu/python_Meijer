package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5396h<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T>[] f38495a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<? extends T>> f38496b;

    /* renamed from: Uu.h$a */
    static final class a<T> implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38497a;

        /* renamed from: b, reason: collision with root package name */
        final b<T>[] f38498b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f38499c = new AtomicInteger();

        public void a(io.reactivex.q<? extends T>[] qVarArr) {
            b<T>[] bVarArr = this.f38498b;
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                bVarArr[i10] = new b<>(this, i11, this.f38497a);
                i10 = i11;
            }
            this.f38499c.lazySet(0);
            this.f38497a.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.f38499c.get() == 0; i12++) {
                qVarArr[i12].subscribe(bVarArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = this.f38499c.get();
            int i12 = 0;
            if (i11 != 0) {
                return i11 == i10;
            }
            if (!this.f38499c.compareAndSet(0, i10)) {
                return false;
            }
            b<T>[] bVarArr = this.f38498b;
            int length = bVarArr.length;
            while (i12 < length) {
                int i13 = i12 + 1;
                if (i13 != i10) {
                    bVarArr[i12].a();
                }
                i12 = i13;
            }
            return true;
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38499c.get() != -1) {
                this.f38499c.lazySet(-1);
                for (b<T> bVar : this.f38498b) {
                    bVar.a();
                }
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38499c.get() == -1;
        }

        a(io.reactivex.s<? super T> sVar, int i10) {
            this.f38497a = sVar;
            this.f38498b = new b[i10];
        }
    }

    /* renamed from: Uu.h$b */
    static final class b<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f38500a;

        /* renamed from: b, reason: collision with root package name */
        final int f38501b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.s<? super T> f38502c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38503d;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38503d) {
                this.f38502c.onComplete();
            } else if (this.f38500a.b(this.f38501b)) {
                this.f38503d = true;
                this.f38502c.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38503d) {
                this.f38502c.onError(th2);
            } else if (!this.f38500a.b(this.f38501b)) {
                C13558a.s(th2);
            } else {
                this.f38503d = true;
                this.f38502c.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38503d) {
                this.f38502c.onNext(t10);
            } else if (!this.f38500a.b(this.f38501b)) {
                get().dispose();
            } else {
                this.f38503d = true;
                this.f38502c.onNext(t10);
            }
        }

        b(a<T> aVar, int i10, io.reactivex.s<? super T> sVar) {
            this.f38500a = aVar;
            this.f38501b = i10;
            this.f38502c = sVar;
        }

        public void a() {
            Mu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        int length;
        io.reactivex.q<? extends T>[] qVarArr = this.f38495a;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            try {
                length = 0;
                for (io.reactivex.q<? extends T> qVar : this.f38496b) {
                    if (qVar == null) {
                        Mu.e.m(new NullPointerException("One of the sources is null"), sVar);
                        return;
                    }
                    if (length == qVarArr.length) {
                        io.reactivex.q<? extends T>[] qVarArr2 = new io.reactivex.q[(length >> 2) + length];
                        System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
                        qVarArr = qVarArr2;
                    }
                    int i10 = length + 1;
                    qVarArr[length] = qVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                Mu.e.m(th2, sVar);
                return;
            }
        } else {
            length = qVarArr.length;
        }
        if (length == 0) {
            Mu.e.e(sVar);
        } else if (length == 1) {
            qVarArr[0].subscribe(sVar);
        } else {
            new a(sVar, length).a(qVarArr);
        }
    }

    public C5396h(io.reactivex.q<? extends T>[] qVarArr, Iterable<? extends io.reactivex.q<? extends T>> iterable) {
        this.f38495a = qVarArr;
        this.f38496b = iterable;
    }
}
