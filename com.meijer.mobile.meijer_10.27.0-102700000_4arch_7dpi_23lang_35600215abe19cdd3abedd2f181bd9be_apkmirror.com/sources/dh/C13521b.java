package dh;

import dh.C13520a;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: dh.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13521b<T> extends AbstractC13523d<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f127393f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    static final a[] f127394g = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<T> f127395a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f127396b;

    /* renamed from: c, reason: collision with root package name */
    final Lock f127397c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f127398d;

    /* renamed from: e, reason: collision with root package name */
    long f127399e;

    /* renamed from: dh.b$a */
    static final class a<T> implements Nu.b, C13520a.InterfaceC2004a<T> {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f127400a;

        /* renamed from: b, reason: collision with root package name */
        final C13521b<T> f127401b;

        /* renamed from: c, reason: collision with root package name */
        boolean f127402c;

        /* renamed from: d, reason: collision with root package name */
        boolean f127403d;

        /* renamed from: e, reason: collision with root package name */
        C13520a<T> f127404e;

        /* renamed from: f, reason: collision with root package name */
        boolean f127405f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f127406g;

        /* renamed from: h, reason: collision with root package name */
        long f127407h;

        void a() {
            if (this.f127406g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f127406g) {
                        return;
                    }
                    if (this.f127402c) {
                        return;
                    }
                    C13521b<T> c13521b = this.f127401b;
                    Lock lock = c13521b.f127397c;
                    lock.lock();
                    this.f127407h = c13521b.f127399e;
                    T t10 = c13521b.f127395a.get();
                    lock.unlock();
                    this.f127403d = t10 != null;
                    this.f127402c = true;
                    if (t10 != null) {
                        test(t10);
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b() {
            C13520a<T> c13520a;
            while (!this.f127406g) {
                synchronized (this) {
                    try {
                        c13520a = this.f127404e;
                        if (c13520a == null) {
                            this.f127403d = false;
                            return;
                        }
                        this.f127404e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c13520a.b(this);
            }
        }

        void c(T t10, long j10) {
            if (this.f127406g) {
                return;
            }
            if (!this.f127405f) {
                synchronized (this) {
                    try {
                        if (this.f127406g) {
                            return;
                        }
                        if (this.f127407h == j10) {
                            return;
                        }
                        if (this.f127403d) {
                            C13520a<T> c13520a = this.f127404e;
                            if (c13520a == null) {
                                c13520a = new C13520a<>(4);
                                this.f127404e = c13520a;
                            }
                            c13520a.a(t10);
                            return;
                        }
                        this.f127402c = true;
                        this.f127405f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(t10);
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f127406g) {
                return;
            }
            this.f127406g = true;
            this.f127401b.f(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f127406g;
        }

        @Override // dh.C13520a.InterfaceC2004a, Pu.q
        public boolean test(T t10) {
            if (this.f127406g) {
                return false;
            }
            this.f127400a.onNext(t10);
            return false;
        }

        a(s<? super T> sVar, C13521b<T> c13521b) {
            this.f127400a = sVar;
            this.f127401b = c13521b;
        }
    }

    C13521b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f127397c = reentrantReadWriteLock.readLock();
        this.f127398d = reentrantReadWriteLock.writeLock();
        this.f127396b = new AtomicReference<>(f127394g);
        this.f127395a = new AtomicReference<>();
    }

    public static <T> C13521b<T> d(T t10) {
        return new C13521b<>(t10);
    }

    @Override // Pu.g
    public void accept(T t10) {
        if (t10 == null) {
            throw new NullPointerException("value == null");
        }
        g(t10);
        for (a<T> aVar : this.f127396b.get()) {
            aVar.c(t10, this.f127399e);
        }
    }

    void c(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f127396b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f127396b, aVarArr, aVarArr2));
    }

    public T e() {
        return this.f127395a.get();
    }

    void f(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f127396b.get();
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
                aVarArr2 = f127394g;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f127396b, aVarArr, aVarArr2));
    }

    void g(T t10) {
        this.f127398d.lock();
        this.f127399e++;
        this.f127395a.lazySet(t10);
        this.f127398d.unlock();
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        c(aVar);
        if (aVar.f127406g) {
            f(aVar);
        } else {
            aVar.a();
        }
    }

    C13521b(T t10) {
        this();
        if (t10 != null) {
            this.f127395a.lazySet(t10);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}
