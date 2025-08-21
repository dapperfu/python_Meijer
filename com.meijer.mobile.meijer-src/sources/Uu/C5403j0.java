package Uu;

import bv.AbstractC6412b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5403j0<T, K, V> extends AbstractC5375a<T, AbstractC6412b<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends K> f38534b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super T, ? extends V> f38535c;

    /* renamed from: d, reason: collision with root package name */
    final int f38536d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f38537e;

    /* renamed from: Uu.j0$a */
    public static final class a<T, K, V> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: i, reason: collision with root package name */
        static final Object f38538i = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super AbstractC6412b<K, V>> f38539a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends K> f38540b;

        /* renamed from: c, reason: collision with root package name */
        final Lu.o<? super T, ? extends V> f38541c;

        /* renamed from: d, reason: collision with root package name */
        final int f38542d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f38543e;

        /* renamed from: g, reason: collision with root package name */
        Ju.b f38545g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f38546h = new AtomicBoolean();

        /* renamed from: f, reason: collision with root package name */
        final Map<Object, b<K, V>> f38544f = new ConcurrentHashMap();

        public void a(K k10) {
            if (k10 == null) {
                k10 = (K) f38538i;
            }
            this.f38544f.remove(k10);
            if (decrementAndGet() == 0) {
                this.f38545g.dispose();
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38546h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f38545g.dispose();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38546h.get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f38544f.values());
            this.f38544f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onComplete();
            }
            this.f38539a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f38544f.values());
            this.f38544f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onError(th2);
            }
            this.f38539a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.util.Map<java.lang.Object, Uu.j0$b<K, V>>] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v3, types: [Uu.j0$b] */
        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                K kApply = this.f38540b.apply(t10);
                Object obj = kApply != null ? kApply : f38538i;
                b<K, V> bVar = this.f38544f.get(obj);
                ?? r22 = bVar;
                if (bVar == false) {
                    if (this.f38546h.get()) {
                        return;
                    }
                    Object objC = b.c(kApply, this.f38542d, this, this.f38543e);
                    this.f38544f.put(obj, objC);
                    getAndIncrement();
                    this.f38539a.onNext(objC);
                    r22 = objC;
                }
                try {
                    r22.onNext(Nu.b.e(this.f38541c.apply(t10), "The value supplied is null"));
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    this.f38545g.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f38545g.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38545g, bVar)) {
                this.f38545g = bVar;
                this.f38539a.onSubscribe(this);
            }
        }

        public a(io.reactivex.s<? super AbstractC6412b<K, V>> sVar, Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
            this.f38539a = sVar;
            this.f38540b = oVar;
            this.f38541c = oVar2;
            this.f38542d = i10;
            this.f38543e = z10;
            lazySet(1);
        }
    }

    /* renamed from: Uu.j0$b */
    static final class b<K, T> extends AbstractC6412b<K, T> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, K> f38547b;

        public static <T, K> b<K, T> c(K k10, int i10, a<?, K, T> aVar, boolean z10) {
            return new b<>(k10, new c(i10, aVar, k10, z10));
        }

        public void onComplete() {
            this.f38547b.c();
        }

        public void onError(Throwable th2) {
            this.f38547b.d(th2);
        }

        public void onNext(T t10) {
            this.f38547b.e(t10);
        }

        @Override // io.reactivex.l
        protected void subscribeActual(io.reactivex.s<? super T> sVar) {
            this.f38547b.subscribe(sVar);
        }

        protected b(K k10, c<T, K> cVar) {
            super(k10);
            this.f38547b = cVar;
        }
    }

    /* renamed from: Uu.j0$c */
    static final class c<T, K> extends AtomicInteger implements Ju.b, io.reactivex.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final K f38548a;

        /* renamed from: b, reason: collision with root package name */
        final Wu.c<T> f38549b;

        /* renamed from: c, reason: collision with root package name */
        final a<?, K, T> f38550c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f38551d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f38552e;

        /* renamed from: f, reason: collision with root package name */
        Throwable f38553f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicBoolean f38554g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f38555h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<io.reactivex.s<? super T>> f38556i = new AtomicReference<>();

        public void c() {
            this.f38552e = true;
            b();
        }

        boolean a(boolean z10, boolean z11, io.reactivex.s<? super T> sVar, boolean z12) {
            if (this.f38554g.get()) {
                this.f38549b.clear();
                this.f38550c.a(this.f38548a);
                this.f38556i.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f38553f;
                this.f38556i.lazySet(null);
                if (th2 != null) {
                    sVar.onError(th2);
                } else {
                    sVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f38553f;
            if (th3 != null) {
                this.f38549b.clear();
                this.f38556i.lazySet(null);
                sVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f38556i.lazySet(null);
            sVar.onComplete();
            return true;
        }

        public void d(Throwable th2) {
            this.f38553f = th2;
            this.f38552e = true;
            b();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38554g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f38556i.lazySet(null);
                this.f38550c.a(this.f38548a);
            }
        }

        public void e(T t10) {
            this.f38549b.offer(t10);
            b();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38554g.get();
        }

        @Override // io.reactivex.q
        public void subscribe(io.reactivex.s<? super T> sVar) {
            if (!this.f38555h.compareAndSet(false, true)) {
                Mu.e.m(new IllegalStateException("Only one Observer allowed!"), sVar);
                return;
            }
            sVar.onSubscribe(this);
            this.f38556i.lazySet(sVar);
            if (this.f38554g.get()) {
                this.f38556i.lazySet(null);
            } else {
                b();
            }
        }

        c(int i10, a<?, K, T> aVar, K k10, boolean z10) {
            this.f38549b = new Wu.c<>(i10);
            this.f38550c = aVar;
            this.f38548a = k10;
            this.f38551d = z10;
        }

        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                Wu.c<T> cVar = this.f38549b;
                boolean z11 = this.f38551d;
                io.reactivex.s<? super T> sVar = this.f38556i.get();
                int iAddAndGet = 1;
                while (true) {
                    if (sVar != null) {
                        while (true) {
                            boolean z12 = this.f38552e;
                            T tPoll = cVar.poll();
                            if (tPoll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!a(z12, z10, sVar, z11)) {
                                if (z10) {
                                    break;
                                } else {
                                    sVar.onNext(tPoll);
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                    if (sVar == null) {
                        sVar = this.f38556i.get();
                    }
                }
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super AbstractC6412b<K, V>> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38534b, this.f38535c, this.f38536d, this.f38537e));
    }

    public C5403j0(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends K> oVar, Lu.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
        super(qVar);
        this.f38534b = oVar;
        this.f38535c = oVar2;
        this.f38536d = i10;
        this.f38537e = z10;
    }
}
