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
    private final AtomicReference<Object> f10029b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f10028a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private int f10030c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10031d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Map<c0.a<? super T>, b<T>> f10032e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<b<T>> f10033f = new CopyOnWriteArraySet<>();

    static abstract class a {
        public abstract Throwable a();

        static a b(Throwable th2) {
            return new C3608e(th2);
        }

        a() {
        }
    }

    private static final class b<T> implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        private static final Object f10034h = new Object();

        /* renamed from: a, reason: collision with root package name */
        private final Executor f10035a;

        /* renamed from: b, reason: collision with root package name */
        private final c0.a<? super T> f10036b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReference<Object> f10038d;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f10037c = new AtomicBoolean(true);

        /* renamed from: e, reason: collision with root package name */
        private Object f10039e = f10034h;

        /* renamed from: f, reason: collision with root package name */
        private int f10040f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f10041g = false;

        void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f10037c.get()) {
                        if (i10 <= this.f10040f) {
                            return;
                        }
                        this.f10040f = i10;
                        if (this.f10041g) {
                            return;
                        }
                        this.f10041g = true;
                        try {
                            this.f10035a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f10041g = false;
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
                    if (!this.f10037c.get()) {
                        this.f10041g = false;
                        return;
                    }
                    Object obj = this.f10038d.get();
                    int i10 = this.f10040f;
                    while (true) {
                        if (!Objects.equals(this.f10039e, obj)) {
                            this.f10039e = obj;
                            if (obj instanceof a) {
                                this.f10036b.onError(((a) obj).a());
                            } else {
                                this.f10036b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f10040f || !this.f10037c.get()) {
                                    break;
                                }
                                obj = this.f10038d.get();
                                i10 = this.f10040f;
                            } finally {
                            }
                        }
                    }
                    this.f10041g = false;
                } finally {
                }
            }
        }

        void a() {
            this.f10037c.set(false);
        }

        b(AtomicReference<Object> atomicReference, Executor executor, c0.a<? super T> aVar) {
            this.f10038d = atomicReference;
            this.f10035a = executor;
            this.f10036b = aVar;
        }
    }

    private void d(c0.a<? super T> aVar) {
        b<T> bVarRemove = this.f10032e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.a();
            this.f10033f.remove(bVarRemove);
        }
    }

    private void f(Object obj) {
        Iterator<b<T>> it;
        int i10;
        synchronized (this.f10028a) {
            try {
                if (Objects.equals(this.f10029b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f10030c + 1;
                this.f10030c = i11;
                if (this.f10031d) {
                    return;
                }
                this.f10031d = true;
                Iterator<b<T>> it2 = this.f10033f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i11);
                    } else {
                        synchronized (this.f10028a) {
                            try {
                                if (this.f10030c == i11) {
                                    this.f10031d = false;
                                    return;
                                } else {
                                    it = this.f10033f.iterator();
                                    i10 = this.f10030c;
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
        synchronized (this.f10028a) {
            d(aVar);
            bVar = new b<>(this.f10029b, executor, aVar);
            this.f10032e.put(aVar, bVar);
            this.f10033f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // F.c0
    public void b(c0.a<? super T> aVar) {
        synchronized (this.f10028a) {
            d(aVar);
        }
    }

    public com.google.common.util.concurrent.q<T> c() {
        Object obj = this.f10029b.get();
        return obj instanceof a ? I.n.n(((a) obj).a()) : I.n.p(obj);
    }

    t0(Object obj, boolean z10) {
        if (z10) {
            o2.i.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f10029b = new AtomicReference<>(a.b((Throwable) obj));
        } else {
            this.f10029b = new AtomicReference<>(obj);
        }
    }

    void e(T t10) {
        f(t10);
    }
}
