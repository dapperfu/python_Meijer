package Yu;

import gv.C14313a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes9.dex */
public final class M1<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<?>[] f40866b;

    /* renamed from: c, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<?>> f40867c;

    /* renamed from: d, reason: collision with root package name */
    final Pu.o<? super Object[], R> f40868d;

    final class a implements Pu.o<T, R> {
        a() {
        }

        @Override // Pu.o
        public R apply(T t10) throws Exception {
            return (R) Ru.b.e(M1.this.f40868d.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f40870a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super Object[], R> f40871b;

        /* renamed from: c, reason: collision with root package name */
        final c[] f40872c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<Object> f40873d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Nu.b> f40874e;

        /* renamed from: f, reason: collision with root package name */
        final ev.c f40875f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f40876g;

        void c(int i10, Throwable th2) {
            this.f40876g = true;
            Qu.d.a(this.f40874e);
            a(i10);
            ev.k.c(this.f40870a, th2, this, this.f40875f);
        }

        void a(int i10) {
            c[] cVarArr = this.f40872c;
            for (int i11 = 0; i11 < cVarArr.length; i11++) {
                if (i11 != i10) {
                    cVarArr[i11].a();
                }
            }
        }

        void b(int i10, boolean z10) {
            if (z10) {
                return;
            }
            this.f40876g = true;
            a(i10);
            ev.k.a(this.f40870a, this, this.f40875f);
        }

        void d(int i10, Object obj) {
            this.f40873d.set(i10, obj);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f40874e);
            for (c cVar : this.f40872c) {
                cVar.a();
            }
        }

        void e(io.reactivex.q<?>[] qVarArr, int i10) {
            c[] cVarArr = this.f40872c;
            AtomicReference<Nu.b> atomicReference = this.f40874e;
            for (int i11 = 0; i11 < i10 && !Qu.d.b(atomicReference.get()) && !this.f40876g; i11++) {
                qVarArr[i11].subscribe(cVarArr[i11]);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f40874e.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40876g) {
                return;
            }
            this.f40876g = true;
            a(-1);
            ev.k.a(this.f40870a, this, this.f40875f);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40876g) {
                C14313a.s(th2);
                return;
            }
            this.f40876g = true;
            a(-1);
            ev.k.c(this.f40870a, th2, this, this.f40875f);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40876g) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f40873d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i10 = 0;
            objArr[0] = t10;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                ev.k.e(this.f40870a, Ru.b.e(this.f40871b.apply(objArr), "combiner returned a null value"), this, this.f40875f);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40874e, bVar);
        }

        b(io.reactivex.s<? super R> sVar, Pu.o<? super Object[], R> oVar, int i10) {
            this.f40870a = sVar;
            this.f40871b = oVar;
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c(this, i11);
            }
            this.f40872c = cVarArr;
            this.f40873d = new AtomicReferenceArray<>(i10);
            this.f40874e = new AtomicReference<>();
            this.f40875f = new ev.c();
        }
    }

    static final class c extends AtomicReference<Nu.b> implements io.reactivex.s<Object> {

        /* renamed from: a, reason: collision with root package name */
        final b<?, ?> f40877a;

        /* renamed from: b, reason: collision with root package name */
        final int f40878b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40879c;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40877a.b(this.f40878b, this.f40879c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40877a.c(this.f40878b, th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            if (!this.f40879c) {
                this.f40879c = true;
            }
            this.f40877a.d(this.f40878b, obj);
        }

        c(b<?, ?> bVar, int i10) {
            this.f40877a = bVar;
            this.f40878b = i10;
        }

        public void a() {
            Qu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    public M1(io.reactivex.q<T> qVar, io.reactivex.q<?>[] qVarArr, Pu.o<? super Object[], R> oVar) {
        super(qVar);
        this.f40866b = qVarArr;
        this.f40867c = null;
        this.f40868d = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        int length;
        io.reactivex.q<?>[] qVarArr = this.f40866b;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            try {
                length = 0;
                for (io.reactivex.q<?> qVar : this.f40867c) {
                    if (length == qVarArr.length) {
                        qVarArr = (io.reactivex.q[]) Arrays.copyOf(qVarArr, (length >> 1) + length);
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
            new C5496w0(this.f41135a, new a()).subscribeActual(sVar);
            return;
        }
        b bVar = new b(sVar, this.f40868d, length);
        sVar.onSubscribe(bVar);
        bVar.e(qVarArr, length);
        this.f41135a.subscribe(bVar);
    }

    public M1(io.reactivex.q<T> qVar, Iterable<? extends io.reactivex.q<?>> iterable, Pu.o<? super Object[], R> oVar) {
        super(qVar);
        this.f40866b = null;
        this.f40867c = iterable;
        this.f40868d = oVar;
    }
}
