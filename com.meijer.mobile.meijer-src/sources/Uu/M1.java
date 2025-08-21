package Uu;

import cv.C13558a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes10.dex */
public final class M1<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<?>[] f38091b;

    /* renamed from: c, reason: collision with root package name */
    final Iterable<? extends io.reactivex.q<?>> f38092c;

    /* renamed from: d, reason: collision with root package name */
    final Lu.o<? super Object[], R> f38093d;

    final class a implements Lu.o<T, R> {
        a() {
        }

        @Override // Lu.o
        public R apply(T t10) throws Exception {
            return (R) Nu.b.e(M1.this.f38093d.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38095a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super Object[], R> f38096b;

        /* renamed from: c, reason: collision with root package name */
        final c[] f38097c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<Object> f38098d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<Ju.b> f38099e;

        /* renamed from: f, reason: collision with root package name */
        final av.c f38100f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38101g;

        void c(int i10, Throwable th2) {
            this.f38101g = true;
            Mu.d.a(this.f38099e);
            a(i10);
            av.k.c(this.f38095a, th2, this, this.f38100f);
        }

        void a(int i10) {
            c[] cVarArr = this.f38097c;
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
            this.f38101g = true;
            a(i10);
            av.k.a(this.f38095a, this, this.f38100f);
        }

        void d(int i10, Object obj) {
            this.f38098d.set(i10, obj);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f38099e);
            for (c cVar : this.f38097c) {
                cVar.a();
            }
        }

        void e(io.reactivex.q<?>[] qVarArr, int i10) {
            c[] cVarArr = this.f38097c;
            AtomicReference<Ju.b> atomicReference = this.f38099e;
            for (int i11 = 0; i11 < i10 && !Mu.d.b(atomicReference.get()) && !this.f38101g; i11++) {
                qVarArr[i11].subscribe(cVarArr[i11]);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f38099e.get());
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38101g) {
                return;
            }
            this.f38101g = true;
            a(-1);
            av.k.a(this.f38095a, this, this.f38100f);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38101g) {
                C13558a.s(th2);
                return;
            }
            this.f38101g = true;
            a(-1);
            av.k.c(this.f38095a, th2, this, this.f38100f);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38101g) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f38098d;
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
                av.k.e(this.f38095a, Nu.b.e(this.f38096b.apply(objArr), "combiner returned a null value"), this, this.f38100f);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f38099e, bVar);
        }

        b(io.reactivex.s<? super R> sVar, Lu.o<? super Object[], R> oVar, int i10) {
            this.f38095a = sVar;
            this.f38096b = oVar;
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c(this, i11);
            }
            this.f38097c = cVarArr;
            this.f38098d = new AtomicReferenceArray<>(i10);
            this.f38099e = new AtomicReference<>();
            this.f38100f = new av.c();
        }
    }

    static final class c extends AtomicReference<Ju.b> implements io.reactivex.s<Object> {

        /* renamed from: a, reason: collision with root package name */
        final b<?, ?> f38102a;

        /* renamed from: b, reason: collision with root package name */
        final int f38103b;

        /* renamed from: c, reason: collision with root package name */
        boolean f38104c;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38102a.b(this.f38103b, this.f38104c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38102a.c(this.f38103b, th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            if (!this.f38104c) {
                this.f38104c = true;
            }
            this.f38102a.d(this.f38103b, obj);
        }

        c(b<?, ?> bVar, int i10) {
            this.f38102a = bVar;
            this.f38103b = i10;
        }

        public void a() {
            Mu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    public M1(io.reactivex.q<T> qVar, io.reactivex.q<?>[] qVarArr, Lu.o<? super Object[], R> oVar) {
        super(qVar);
        this.f38091b = qVarArr;
        this.f38092c = null;
        this.f38093d = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        int length;
        io.reactivex.q<?>[] qVarArr = this.f38091b;
        if (qVarArr == null) {
            qVarArr = new io.reactivex.q[8];
            try {
                length = 0;
                for (io.reactivex.q<?> qVar : this.f38092c) {
                    if (length == qVarArr.length) {
                        qVarArr = (io.reactivex.q[]) Arrays.copyOf(qVarArr, (length >> 1) + length);
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
            new C5435w0(this.f38360a, new a()).subscribeActual(sVar);
            return;
        }
        b bVar = new b(sVar, this.f38093d, length);
        sVar.onSubscribe(bVar);
        bVar.e(qVarArr, length);
        this.f38360a.subscribe(bVar);
    }

    public M1(io.reactivex.q<T> qVar, Iterable<? extends io.reactivex.q<?>> iterable, Lu.o<? super Object[], R> oVar) {
        super(qVar);
        this.f38091b = null;
        this.f38092c = iterable;
        this.f38093d = oVar;
    }
}
