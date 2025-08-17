package jv;

import ev.C13780a;
import ev.j;
import ev.m;
import gv.C14313a;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: jv.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15078a<T> extends AbstractC15082e<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f141061h = new Object[0];

    /* renamed from: i, reason: collision with root package name */
    static final C2234a[] f141062i = new C2234a[0];

    /* renamed from: j, reason: collision with root package name */
    static final C2234a[] f141063j = new C2234a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Object> f141064a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<C2234a<T>[]> f141065b;

    /* renamed from: c, reason: collision with root package name */
    final ReadWriteLock f141066c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f141067d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f141068e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference<Throwable> f141069f;

    /* renamed from: g, reason: collision with root package name */
    long f141070g;

    /* renamed from: jv.a$a, reason: collision with other inner class name */
    static final class C2234a<T> implements Nu.b, C13780a.InterfaceC2062a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f141071a;

        /* renamed from: b, reason: collision with root package name */
        final C15078a<T> f141072b;

        /* renamed from: c, reason: collision with root package name */
        boolean f141073c;

        /* renamed from: d, reason: collision with root package name */
        boolean f141074d;

        /* renamed from: e, reason: collision with root package name */
        C13780a<Object> f141075e;

        /* renamed from: f, reason: collision with root package name */
        boolean f141076f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f141077g;

        /* renamed from: h, reason: collision with root package name */
        long f141078h;

        void a() {
            if (this.f141077g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f141077g) {
                        return;
                    }
                    if (this.f141073c) {
                        return;
                    }
                    C15078a<T> c15078a = this.f141072b;
                    Lock lock = c15078a.f141067d;
                    lock.lock();
                    this.f141078h = c15078a.f141070g;
                    Object obj = c15078a.f141064a.get();
                    lock.unlock();
                    this.f141074d = obj != null;
                    this.f141073c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            C13780a<Object> c13780a;
            while (!this.f141077g) {
                synchronized (this) {
                    try {
                        c13780a = this.f141075e;
                        if (c13780a == null) {
                            this.f141074d = false;
                            return;
                        }
                        this.f141075e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c13780a.c(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f141077g) {
                return;
            }
            if (!this.f141076f) {
                synchronized (this) {
                    try {
                        if (this.f141077g) {
                            return;
                        }
                        if (this.f141078h == j10) {
                            return;
                        }
                        if (this.f141074d) {
                            C13780a<Object> c13780a = this.f141075e;
                            if (c13780a == null) {
                                c13780a = new C13780a<>(4);
                                this.f141075e = c13780a;
                            }
                            c13780a.b(obj);
                            return;
                        }
                        this.f141073c = true;
                        this.f141076f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f141077g) {
                return;
            }
            this.f141077g = true;
            this.f141072b.g(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f141077g;
        }

        @Override // ev.C13780a.InterfaceC2062a, Pu.q
        public boolean test(Object obj) {
            return this.f141077g || m.a(obj, this.f141071a);
        }

        C2234a(s<? super T> sVar, C15078a<T> c15078a) {
            this.f141071a = sVar;
            this.f141072b = c15078a;
        }
    }

    C15078a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f141066c = reentrantReadWriteLock;
        this.f141067d = reentrantReadWriteLock.readLock();
        this.f141068e = reentrantReadWriteLock.writeLock();
        this.f141065b = new AtomicReference<>(f141062i);
        this.f141064a = new AtomicReference<>();
        this.f141069f = new AtomicReference<>();
    }

    public static <T> C15078a<T> e() {
        return new C15078a<>();
    }

    public static <T> C15078a<T> f(T t10) {
        return new C15078a<>(t10);
    }

    boolean d(C2234a<T> c2234a) {
        C2234a<T>[] c2234aArr;
        C2234a[] c2234aArr2;
        do {
            c2234aArr = this.f141065b.get();
            if (c2234aArr == f141063j) {
                return false;
            }
            int length = c2234aArr.length;
            c2234aArr2 = new C2234a[length + 1];
            System.arraycopy(c2234aArr, 0, c2234aArr2, 0, length);
            c2234aArr2[length] = c2234a;
        } while (!U.d.a(this.f141065b, c2234aArr, c2234aArr2));
        return true;
    }

    void g(C2234a<T> c2234a) {
        C2234a<T>[] c2234aArr;
        C2234a[] c2234aArr2;
        do {
            c2234aArr = this.f141065b.get();
            int length = c2234aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c2234aArr[i10] == c2234a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c2234aArr2 = f141062i;
            } else {
                C2234a[] c2234aArr3 = new C2234a[length - 1];
                System.arraycopy(c2234aArr, 0, c2234aArr3, 0, i10);
                System.arraycopy(c2234aArr, i10 + 1, c2234aArr3, i10, (length - i10) - 1);
                c2234aArr2 = c2234aArr3;
            }
        } while (!U.d.a(this.f141065b, c2234aArr, c2234aArr2));
    }

    void h(Object obj) {
        this.f141068e.lock();
        this.f141070g++;
        this.f141064a.lazySet(obj);
        this.f141068e.unlock();
    }

    C2234a<T>[] i(Object obj) {
        AtomicReference<C2234a<T>[]> atomicReference = this.f141065b;
        C2234a<T>[] c2234aArr = f141063j;
        C2234a<T>[] andSet = atomicReference.getAndSet(c2234aArr);
        if (andSet != c2234aArr) {
            h(obj);
        }
        return andSet;
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (U.d.a(this.f141069f, null, j.f130072a)) {
            Object objE = m.e();
            for (C2234a<T> c2234a : i(objE)) {
                c2234a.c(objE, this.f141070g);
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Ru.b.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!U.d.a(this.f141069f, null, th2)) {
            C14313a.s(th2);
            return;
        }
        Object objM = m.m(th2);
        for (C2234a<T> c2234a : i(objM)) {
            c2234a.c(objM, this.f141070g);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        Ru.b.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f141069f.get() != null) {
            return;
        }
        Object objZ = m.z(t10);
        h(objZ);
        for (C2234a<T> c2234a : this.f141065b.get()) {
            c2234a.c(objZ, this.f141070g);
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        if (this.f141069f.get() != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        C2234a<T> c2234a = new C2234a<>(sVar, this);
        sVar.onSubscribe(c2234a);
        if (d(c2234a)) {
            if (c2234a.f141077g) {
                g(c2234a);
                return;
            } else {
                c2234a.a();
                return;
            }
        }
        Throwable th2 = this.f141069f.get();
        if (th2 == j.f130072a) {
            sVar.onComplete();
        } else {
            sVar.onError(th2);
        }
    }

    C15078a(T t10) {
        this();
        this.f141064a.lazySet(Ru.b.e(t10, "defaultValue is null"));
    }
}
