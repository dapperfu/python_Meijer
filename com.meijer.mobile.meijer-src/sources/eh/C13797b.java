package eh;

import eh.C13796a;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: eh.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13797b<T> extends AbstractC13799d<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f130169f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    static final a[] f130170g = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<T> f130171a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f130172b;

    /* renamed from: c, reason: collision with root package name */
    final Lock f130173c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f130174d;

    /* renamed from: e, reason: collision with root package name */
    long f130175e;

    /* renamed from: eh.b$a */
    static final class a<T> implements Ju.b, C13796a.InterfaceC2047a<T> {

        /* renamed from: a, reason: collision with root package name */
        final s<? super T> f130176a;

        /* renamed from: b, reason: collision with root package name */
        final C13797b<T> f130177b;

        /* renamed from: c, reason: collision with root package name */
        boolean f130178c;

        /* renamed from: d, reason: collision with root package name */
        boolean f130179d;

        /* renamed from: e, reason: collision with root package name */
        C13796a<T> f130180e;

        /* renamed from: f, reason: collision with root package name */
        boolean f130181f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f130182g;

        /* renamed from: h, reason: collision with root package name */
        long f130183h;

        void a() {
            if (this.f130182g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f130182g) {
                        return;
                    }
                    if (this.f130178c) {
                        return;
                    }
                    C13797b<T> c13797b = this.f130177b;
                    Lock lock = c13797b.f130173c;
                    lock.lock();
                    this.f130183h = c13797b.f130175e;
                    T t10 = c13797b.f130171a.get();
                    lock.unlock();
                    this.f130179d = t10 != null;
                    this.f130178c = true;
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
            C13796a<T> c13796a;
            while (!this.f130182g) {
                synchronized (this) {
                    try {
                        c13796a = this.f130180e;
                        if (c13796a == null) {
                            this.f130179d = false;
                            return;
                        }
                        this.f130180e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c13796a.b(this);
            }
        }

        void c(T t10, long j10) {
            if (this.f130182g) {
                return;
            }
            if (!this.f130181f) {
                synchronized (this) {
                    try {
                        if (this.f130182g) {
                            return;
                        }
                        if (this.f130183h == j10) {
                            return;
                        }
                        if (this.f130179d) {
                            C13796a<T> c13796a = this.f130180e;
                            if (c13796a == null) {
                                c13796a = new C13796a<>(4);
                                this.f130180e = c13796a;
                            }
                            c13796a.a(t10);
                            return;
                        }
                        this.f130178c = true;
                        this.f130181f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(t10);
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f130182g) {
                return;
            }
            this.f130182g = true;
            this.f130177b.f(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f130182g;
        }

        @Override // eh.C13796a.InterfaceC2047a, Lu.q
        public boolean test(T t10) {
            if (this.f130182g) {
                return false;
            }
            this.f130176a.onNext(t10);
            return false;
        }

        a(s<? super T> sVar, C13797b<T> c13797b) {
            this.f130176a = sVar;
            this.f130177b = c13797b;
        }
    }

    C13797b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f130173c = reentrantReadWriteLock.readLock();
        this.f130174d = reentrantReadWriteLock.writeLock();
        this.f130172b = new AtomicReference<>(f130170g);
        this.f130171a = new AtomicReference<>();
    }

    public static <T> C13797b<T> d(T t10) {
        return new C13797b<>(t10);
    }

    @Override // Lu.g
    public void accept(T t10) {
        if (t10 == null) {
            throw new NullPointerException("value == null");
        }
        g(t10);
        for (a<T> aVar : this.f130172b.get()) {
            aVar.c(t10, this.f130175e);
        }
    }

    void c(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f130172b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!U.d.a(this.f130172b, aVarArr, aVarArr2));
    }

    public T e() {
        return this.f130171a.get();
    }

    void f(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f130172b.get();
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
                aVarArr2 = f130170g;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!U.d.a(this.f130172b, aVarArr, aVarArr2));
    }

    void g(T t10) {
        this.f130174d.lock();
        this.f130175e++;
        this.f130171a.lazySet(t10);
        this.f130174d.unlock();
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        a<T> aVar = new a<>(sVar, this);
        sVar.onSubscribe(aVar);
        c(aVar);
        if (aVar.f130182g) {
            f(aVar);
        } else {
            aVar.a();
        }
    }

    C13797b(T t10) {
        this();
        if (t10 != null) {
            this.f130171a.lazySet(t10);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}
