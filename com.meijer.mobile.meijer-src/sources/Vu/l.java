package Vu;

import Lu.o;
import Vu.f;
import cv.C13558a;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class l<T, R> extends u<R> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T>[] f40493a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Object[], ? extends R> f40494b;

    final class a implements o<T, R> {
        a() {
        }

        @Override // Lu.o
        public R apply(T t10) throws Exception {
            return (R) Nu.b.e(l.this.f40494b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f40496a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super Object[], ? extends R> f40497b;

        /* renamed from: c, reason: collision with root package name */
        final c<T>[] f40498c;

        /* renamed from: d, reason: collision with root package name */
        final Object[] f40499d;

        void b(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                C13558a.s(th2);
            } else {
                a(i10);
                this.f40496a.onError(th2);
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f40498c) {
                    cVar.a();
                }
            }
        }

        void a(int i10) {
            c<T>[] cVarArr = this.f40498c;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11].a();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    cVarArr[i10].a();
                }
            }
        }

        void c(T t10, int i10) {
            this.f40499d[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f40496a.onSuccess(Nu.b.e(this.f40497b.apply(this.f40499d), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    this.f40496a.onError(th2);
                }
            }
        }

        b(w<? super R> wVar, int i10, o<? super Object[], ? extends R> oVar) {
            super(i10);
            this.f40496a = wVar;
            this.f40497b = oVar;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f40498c = cVarArr;
            this.f40499d = new Object[i10];
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }
    }

    static final class c<T> extends AtomicReference<Ju.b> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, ?> f40500a;

        /* renamed from: b, reason: collision with root package name */
        final int f40501b;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f40500a.b(th2, this.f40501b);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f40500a.c(t10, this.f40501b);
        }

        c(b<T, ?> bVar, int i10) {
            this.f40500a = bVar;
            this.f40501b = i10;
        }

        public void a() {
            Mu.d.a(this);
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super R> wVar) {
        y<? extends T>[] yVarArr = this.f40493a;
        int length = yVarArr.length;
        if (length == 1) {
            yVarArr[0].a(new f.a(wVar, new a()));
            return;
        }
        b bVar = new b(wVar, length, this.f40494b);
        wVar.onSubscribe(bVar);
        for (int i10 = 0; i10 < length && !bVar.isDisposed(); i10++) {
            y<? extends T> yVar = yVarArr[i10];
            if (yVar == null) {
                bVar.b(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            yVar.a(bVar.f40498c[i10]);
        }
    }

    public l(y<? extends T>[] yVarArr, o<? super Object[], ? extends R> oVar) {
        this.f40493a = yVarArr;
        this.f40494b = oVar;
    }
}
