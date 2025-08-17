package Yu;

import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5457h<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T>[] f41270a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<? extends T>> f41271b;

    /* renamed from: Yu.h$a */
    static final class a<T> implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41272a;

        /* renamed from: b, reason: collision with root package name */
        final b<T>[] f41273b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f41274c = new AtomicInteger();

        public void a(io.reactivex.q<? extends T>[] qVarArr) {
            b<T>[] bVarArr = this.f41273b;
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                bVarArr[i10] = new b<>(this, i11, this.f41272a);
                i10 = i11;
            }
            this.f41274c.lazySet(0);
            this.f41272a.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.f41274c.get() == 0; i12++) {
                qVarArr[i12].subscribe(bVarArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = this.f41274c.get();
            int i12 = 0;
            if (i11 != 0) {
                return i11 == i10;
            }
            if (!this.f41274c.compareAndSet(0, i10)) {
                return false;
            }
            b<T>[] bVarArr = this.f41273b;
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

        @Override // Nu.b
        public void dispose() {
            if (this.f41274c.get() != -1) {
                this.f41274c.lazySet(-1);
                for (b<T> bVar : this.f41273b) {
                    bVar.a();
                }
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41274c.get() == -1;
        }

        a(io.reactivex.s<? super T> sVar, int i10) {
            this.f41272a = sVar;
            this.f41273b = new b[i10];
        }
    }

    /* renamed from: Yu.h$b */
    static final class b<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f41275a;

        /* renamed from: b, reason: collision with root package name */
        final int f41276b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.s<? super T> f41277c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41278d;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41278d) {
                this.f41277c.onComplete();
            } else if (this.f41275a.b(this.f41276b)) {
                this.f41278d = true;
                this.f41277c.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41278d) {
                this.f41277c.onError(th2);
            } else if (!this.f41275a.b(this.f41276b)) {
                C14313a.s(th2);
            } else {
                this.f41278d = true;
                this.f41277c.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41278d) {
                this.f41277c.onNext(t10);
            } else if (!this.f41275a.b(this.f41276b)) {
                get().dispose();
            } else {
                this.f41278d = true;
                this.f41277c.onNext(t10);
            }
        }

        b(a<T> aVar, int i10, io.reactivex.s<? super T> sVar) {
            this.f41275a = aVar;
            this.f41276b = i10;
            this.f41277c = sVar;
        }

        public void a() {
            Qu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        int length;
        io.reactivex.q<? extends T>[] qVarArr = this.f41270a;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            try {
                length = 0;
                for (io.reactivex.q<? extends T> qVar : this.f41271b) {
                    if (qVar == null) {
                        Qu.e.m(new NullPointerException("One of the sources is null"), sVar);
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
                Ou.a.b(th2);
                Qu.e.m(th2, sVar);
                return;
            }
        } else {
            length = qVarArr.length;
        }
        if (length == 0) {
            Qu.e.e(sVar);
        } else if (length == 1) {
            qVarArr[0].subscribe(sVar);
        } else {
            new a(sVar, length).a(qVarArr);
        }
    }

    public C5457h(io.reactivex.q<? extends T>[] qVarArr, Iterable<? extends io.reactivex.q<? extends T>> iterable) {
        this.f41270a = qVarArr;
        this.f41271b = iterable;
    }
}
