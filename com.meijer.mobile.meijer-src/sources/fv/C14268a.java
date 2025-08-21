package fv;

import av.C6298a;
import av.j;
import av.m;
import cv.C13558a;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: fv.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14268a<T> extends AbstractC14272e<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f133665h = new Object[0];

    /* renamed from: i, reason: collision with root package name */
    static final C2110a[] f133666i = new C2110a[0];

    /* renamed from: j, reason: collision with root package name */
    static final C2110a[] f133667j = new C2110a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Object> f133668a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<C2110a<T>[]> f133669b;

    /* renamed from: c, reason: collision with root package name */
    final ReadWriteLock f133670c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f133671d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f133672e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference<Throwable> f133673f;

    /* renamed from: g, reason: collision with root package name */
    long f133674g;

    /* renamed from: fv.a$a, reason: collision with other inner class name */
    static final class C2110a<T> implements Ju.b, C6298a.InterfaceC1178a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f133675a;

        /* renamed from: b, reason: collision with root package name */
        final C14268a<T> f133676b;

        /* renamed from: c, reason: collision with root package name */
        boolean f133677c;

        /* renamed from: d, reason: collision with root package name */
        boolean f133678d;

        /* renamed from: e, reason: collision with root package name */
        C6298a<Object> f133679e;

        /* renamed from: f, reason: collision with root package name */
        boolean f133680f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f133681g;

        /* renamed from: h, reason: collision with root package name */
        long f133682h;

        void a() {
            if (this.f133681g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f133681g) {
                        return;
                    }
                    if (this.f133677c) {
                        return;
                    }
                    C14268a<T> c14268a = this.f133676b;
                    Lock lock = c14268a.f133671d;
                    lock.lock();
                    this.f133682h = c14268a.f133674g;
                    Object obj = c14268a.f133668a.get();
                    lock.unlock();
                    this.f133678d = obj != null;
                    this.f133677c = true;
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
            C6298a<Object> c6298a;
            while (!this.f133681g) {
                synchronized (this) {
                    try {
                        c6298a = this.f133679e;
                        if (c6298a == null) {
                            this.f133678d = false;
                            return;
                        }
                        this.f133679e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c6298a.c(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f133681g) {
                return;
            }
            if (!this.f133680f) {
                synchronized (this) {
                    try {
                        if (this.f133681g) {
                            return;
                        }
                        if (this.f133682h == j10) {
                            return;
                        }
                        if (this.f133678d) {
                            C6298a<Object> c6298a = this.f133679e;
                            if (c6298a == null) {
                                c6298a = new C6298a<>(4);
                                this.f133679e = c6298a;
                            }
                            c6298a.b(obj);
                            return;
                        }
                        this.f133677c = true;
                        this.f133680f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f133681g) {
                return;
            }
            this.f133681g = true;
            this.f133676b.g(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f133681g;
        }

        @Override // av.C6298a.InterfaceC1178a, Lu.q
        public boolean test(Object obj) {
            return this.f133681g || m.a(obj, this.f133675a);
        }

        C2110a(s<? super T> sVar, C14268a<T> c14268a) {
            this.f133675a = sVar;
            this.f133676b = c14268a;
        }
    }

    C14268a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f133670c = reentrantReadWriteLock;
        this.f133671d = reentrantReadWriteLock.readLock();
        this.f133672e = reentrantReadWriteLock.writeLock();
        this.f133669b = new AtomicReference<>(f133666i);
        this.f133668a = new AtomicReference<>();
        this.f133673f = new AtomicReference<>();
    }

    public static <T> C14268a<T> e() {
        return new C14268a<>();
    }

    public static <T> C14268a<T> f(T t10) {
        return new C14268a<>(t10);
    }

    boolean d(C2110a<T> c2110a) {
        C2110a<T>[] c2110aArr;
        C2110a[] c2110aArr2;
        do {
            c2110aArr = this.f133669b.get();
            if (c2110aArr == f133667j) {
                return false;
            }
            int length = c2110aArr.length;
            c2110aArr2 = new C2110a[length + 1];
            System.arraycopy(c2110aArr, 0, c2110aArr2, 0, length);
            c2110aArr2[length] = c2110a;
        } while (!U.d.a(this.f133669b, c2110aArr, c2110aArr2));
        return true;
    }

    void g(C2110a<T> c2110a) {
        C2110a<T>[] c2110aArr;
        C2110a[] c2110aArr2;
        do {
            c2110aArr = this.f133669b.get();
            int length = c2110aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c2110aArr[i10] == c2110a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c2110aArr2 = f133666i;
            } else {
                C2110a[] c2110aArr3 = new C2110a[length - 1];
                System.arraycopy(c2110aArr, 0, c2110aArr3, 0, i10);
                System.arraycopy(c2110aArr, i10 + 1, c2110aArr3, i10, (length - i10) - 1);
                c2110aArr2 = c2110aArr3;
            }
        } while (!U.d.a(this.f133669b, c2110aArr, c2110aArr2));
    }

    void h(Object obj) {
        this.f133672e.lock();
        this.f133674g++;
        this.f133668a.lazySet(obj);
        this.f133672e.unlock();
    }

    C2110a<T>[] i(Object obj) {
        AtomicReference<C2110a<T>[]> atomicReference = this.f133669b;
        C2110a<T>[] c2110aArr = f133667j;
        C2110a<T>[] andSet = atomicReference.getAndSet(c2110aArr);
        if (andSet != c2110aArr) {
            h(obj);
        }
        return andSet;
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (U.d.a(this.f133673f, null, j.f59694a)) {
            Object objE = m.e();
            for (C2110a<T> c2110a : i(objE)) {
                c2110a.c(objE, this.f133674g);
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Nu.b.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!U.d.a(this.f133673f, null, th2)) {
            C13558a.s(th2);
            return;
        }
        Object objM = m.m(th2);
        for (C2110a<T> c2110a : i(objM)) {
            c2110a.c(objM, this.f133674g);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        Nu.b.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f133673f.get() != null) {
            return;
        }
        Object objZ = m.z(t10);
        h(objZ);
        for (C2110a<T> c2110a : this.f133669b.get()) {
            c2110a.c(objZ, this.f133674g);
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        if (this.f133673f.get() != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        C2110a<T> c2110a = new C2110a<>(sVar, this);
        sVar.onSubscribe(c2110a);
        if (d(c2110a)) {
            if (c2110a.f133681g) {
                g(c2110a);
                return;
            } else {
                c2110a.a();
                return;
            }
        }
        Throwable th2 = this.f133673f.get();
        if (th2 == j.f59694a) {
            sVar.onComplete();
        } else {
            sVar.onError(th2);
        }
    }

    C14268a(T t10) {
        this();
        this.f133668a.lazySet(Nu.b.e(t10, "defaultValue is null"));
    }
}
