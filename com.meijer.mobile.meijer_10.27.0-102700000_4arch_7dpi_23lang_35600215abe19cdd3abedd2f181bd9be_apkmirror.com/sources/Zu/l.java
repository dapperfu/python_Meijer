package Zu;

import Pu.o;
import Zu.f;
import gv.C14313a;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class l<T, R> extends u<R> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T>[] f43317a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Object[], ? extends R> f43318b;

    final class a implements o<T, R> {
        a() {
        }

        @Override // Pu.o
        public R apply(T t10) throws Exception {
            return (R) Ru.b.e(l.this.f43318b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f43320a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super Object[], ? extends R> f43321b;

        /* renamed from: c, reason: collision with root package name */
        final c<T>[] f43322c;

        /* renamed from: d, reason: collision with root package name */
        final Object[] f43323d;

        void b(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                C14313a.s(th2);
            } else {
                a(i10);
                this.f43320a.onError(th2);
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f43322c) {
                    cVar.a();
                }
            }
        }

        void a(int i10) {
            c<T>[] cVarArr = this.f43322c;
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
            this.f43323d[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f43320a.onSuccess(Ru.b.e(this.f43321b.apply(this.f43323d), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    this.f43320a.onError(th2);
                }
            }
        }

        b(w<? super R> wVar, int i10, o<? super Object[], ? extends R> oVar) {
            super(i10);
            this.f43320a = wVar;
            this.f43321b = oVar;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f43322c = cVarArr;
            this.f43323d = new Object[i10];
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }
    }

    static final class c<T> extends AtomicReference<Nu.b> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, ?> f43324a;

        /* renamed from: b, reason: collision with root package name */
        final int f43325b;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f43324a.b(th2, this.f43325b);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f43324a.c(t10, this.f43325b);
        }

        c(b<T, ?> bVar, int i10) {
            this.f43324a = bVar;
            this.f43325b = i10;
        }

        public void a() {
            Qu.d.a(this);
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super R> wVar) {
        y<? extends T>[] yVarArr = this.f43317a;
        int length = yVarArr.length;
        if (length == 1) {
            yVarArr[0].a(new f.a(wVar, new a()));
            return;
        }
        b bVar = new b(wVar, length, this.f43318b);
        wVar.onSubscribe(bVar);
        for (int i10 = 0; i10 < length && !bVar.isDisposed(); i10++) {
            y<? extends T> yVar = yVarArr[i10];
            if (yVar == null) {
                bVar.b(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            yVar.a(bVar.f43322c[i10]);
        }
    }

    public l(y<? extends T>[] yVarArr, o<? super Object[], ? extends R> oVar) {
        this.f43317a = yVarArr;
        this.f43318b = oVar;
    }
}
