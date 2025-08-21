package F;

import F.c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class t0<T> implements c0<T> {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<Object> f8796b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f8795a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private int f8797c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8798d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Map<c0.a<? super T>, b<T>> f8799e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<b<T>> f8800f = new CopyOnWriteArraySet<>();

    static abstract class a {
        public abstract Throwable a();

        static a b(Throwable th2) {
            return new C3270e(th2);
        }

        a() {
        }
    }

    private static final class b<T> implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        private static final Object f8801h = new Object();

        /* renamed from: a, reason: collision with root package name */
        private final Executor f8802a;

        /* renamed from: b, reason: collision with root package name */
        private final c0.a<? super T> f8803b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReference<Object> f8805d;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f8804c = new AtomicBoolean(true);

        /* renamed from: e, reason: collision with root package name */
        private Object f8806e = f8801h;

        /* renamed from: f, reason: collision with root package name */
        private int f8807f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8808g = false;

        void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f8804c.get()) {
                        if (i10 <= this.f8807f) {
                            return;
                        }
                        this.f8807f = i10;
                        if (this.f8808g) {
                            return;
                        }
                        this.f8808g = true;
                        try {
                            this.f8802a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f8808g = false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f8804c.get()) {
                        this.f8808g = false;
                        return;
                    }
                    Object obj = this.f8805d.get();
                    int i10 = this.f8807f;
                    while (true) {
                        if (!Objects.equals(this.f8806e, obj)) {
                            this.f8806e = obj;
                            if (obj instanceof a) {
                                this.f8803b.onError(((a) obj).a());
                            } else {
                                this.f8803b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f8807f || !this.f8804c.get()) {
                                    break;
                                }
                                obj = this.f8805d.get();
                                i10 = this.f8807f;
                            } finally {
                            }
                        }
                    }
                    this.f8808g = false;
                } finally {
                }
            }
        }

        void a() {
            this.f8804c.set(false);
        }

        b(AtomicReference<Object> atomicReference, Executor executor, c0.a<? super T> aVar) {
            this.f8805d = atomicReference;
            this.f8802a = executor;
            this.f8803b = aVar;
        }
    }

    private void d(c0.a<? super T> aVar) {
        b<T> bVarRemove = this.f8799e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.a();
            this.f8800f.remove(bVarRemove);
        }
    }

    private void f(Object obj) {
        Iterator<b<T>> it;
        int i10;
        synchronized (this.f8795a) {
            try {
                if (Objects.equals(this.f8796b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f8797c + 1;
                this.f8797c = i11;
                if (this.f8798d) {
                    return;
                }
                this.f8798d = true;
                Iterator<b<T>> it2 = this.f8800f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i11);
                    } else {
                        synchronized (this.f8795a) {
                            try {
                                if (this.f8797c == i11) {
                                    this.f8798d = false;
                                    return;
                                } else {
                                    it = this.f8800f.iterator();
                                    i10 = this.f8797c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i11 = i10;
                    }
                }
            } finally {
            }
        }
    }

    @Override // F.c0
    public void a(Executor executor, c0.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f8795a) {
            d(aVar);
            bVar = new b<>(this.f8796b, executor, aVar);
            this.f8799e.put(aVar, bVar);
            this.f8800f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // F.c0
    public void b(c0.a<? super T> aVar) {
        synchronized (this.f8795a) {
            d(aVar);
        }
    }

    public com.google.common.util.concurrent.q<T> c() {
        Object obj = this.f8796b.get();
        return obj instanceof a ? I.n.n(((a) obj).a()) : I.n.p(obj);
    }

    t0(Object obj, boolean z10) {
        if (z10) {
            o2.i.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f8796b = new AtomicReference<>(a.b((Throwable) obj));
        } else {
            this.f8796b = new AtomicReference<>(obj);
        }
    }

    void e(T t10) {
        f(t10);
    }
}
