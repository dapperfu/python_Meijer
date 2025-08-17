package Yu;

import av.C6159c;
import fv.AbstractC14144b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5464j0<T, K, V> extends AbstractC5436a<T, AbstractC14144b<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends K> f41309b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super T, ? extends V> f41310c;

    /* renamed from: d, reason: collision with root package name */
    final int f41311d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f41312e;

    /* renamed from: Yu.j0$a */
    public static final class a<T, K, V> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: i, reason: collision with root package name */
        static final Object f41313i = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super AbstractC14144b<K, V>> f41314a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends K> f41315b;

        /* renamed from: c, reason: collision with root package name */
        final Pu.o<? super T, ? extends V> f41316c;

        /* renamed from: d, reason: collision with root package name */
        final int f41317d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f41318e;

        /* renamed from: g, reason: collision with root package name */
        Nu.b f41320g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f41321h = new AtomicBoolean();

        /* renamed from: f, reason: collision with root package name */
        final Map<Object, b<K, V>> f41319f = new ConcurrentHashMap();

        public void a(K k10) {
            if (k10 == null) {
                k10 = (K) f41313i;
            }
            this.f41319f.remove(k10);
            if (decrementAndGet() == 0) {
                this.f41320g.dispose();
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41321h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f41320g.dispose();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41321h.get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f41319f.values());
            this.f41319f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onComplete();
            }
            this.f41314a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f41319f.values());
            this.f41319f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onError(th2);
            }
            this.f41314a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.util.Map<java.lang.Object, Yu.j0$b<K, V>>] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v3, types: [Yu.j0$b] */
        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                K kApply = this.f41315b.apply(t10);
                Object obj = kApply != null ? kApply : f41313i;
                b<K, V> bVar = this.f41319f.get(obj);
                ?? r22 = bVar;
                if (bVar == false) {
                    if (this.f41321h.get()) {
                        return;
                    }
                    Object objC = b.c(kApply, this.f41317d, this, this.f41318e);
                    this.f41319f.put(obj, objC);
                    getAndIncrement();
                    this.f41314a.onNext(objC);
                    r22 = objC;
                }
                try {
                    r22.onNext(Ru.b.e(this.f41316c.apply(t10), "The value supplied is null"));
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    this.f41320g.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f41320g.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41320g, bVar)) {
                this.f41320g = bVar;
                this.f41314a.onSubscribe(this);
            }
        }

        public a(io.reactivex.s<? super AbstractC14144b<K, V>> sVar, Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
            this.f41314a = sVar;
            this.f41315b = oVar;
            this.f41316c = oVar2;
            this.f41317d = i10;
            this.f41318e = z10;
            lazySet(1);
        }
    }

    /* renamed from: Yu.j0$b */
    static final class b<K, T> extends AbstractC14144b<K, T> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, K> f41322b;

        public static <T, K> b<K, T> c(K k10, int i10, a<?, K, T> aVar, boolean z10) {
            return new b<>(k10, new c(i10, aVar, k10, z10));
        }

        public void onComplete() {
            this.f41322b.c();
        }

        public void onError(Throwable th2) {
            this.f41322b.d(th2);
        }

        public void onNext(T t10) {
            this.f41322b.e(t10);
        }

        @Override // io.reactivex.l
        protected void subscribeActual(io.reactivex.s<? super T> sVar) {
            this.f41322b.subscribe(sVar);
        }

        protected b(K k10, c<T, K> cVar) {
            super(k10);
            this.f41322b = cVar;
        }
    }

    /* renamed from: Yu.j0$c */
    static final class c<T, K> extends AtomicInteger implements Nu.b, io.reactivex.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final K f41323a;

        /* renamed from: b, reason: collision with root package name */
        final C6159c<T> f41324b;

        /* renamed from: c, reason: collision with root package name */
        final a<?, K, T> f41325c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f41326d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f41327e;

        /* renamed from: f, reason: collision with root package name */
        Throwable f41328f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicBoolean f41329g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f41330h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<io.reactivex.s<? super T>> f41331i = new AtomicReference<>();

        public void c() {
            this.f41327e = true;
            b();
        }

        boolean a(boolean z10, boolean z11, io.reactivex.s<? super T> sVar, boolean z12) {
            if (this.f41329g.get()) {
                this.f41324b.clear();
                this.f41325c.a(this.f41323a);
                this.f41331i.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f41328f;
                this.f41331i.lazySet(null);
                if (th2 != null) {
                    sVar.onError(th2);
                } else {
                    sVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f41328f;
            if (th3 != null) {
                this.f41324b.clear();
                this.f41331i.lazySet(null);
                sVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f41331i.lazySet(null);
            sVar.onComplete();
            return true;
        }

        public void d(Throwable th2) {
            this.f41328f = th2;
            this.f41327e = true;
            b();
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41329g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f41331i.lazySet(null);
                this.f41325c.a(this.f41323a);
            }
        }

        public void e(T t10) {
            this.f41324b.offer(t10);
            b();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41329g.get();
        }

        @Override // io.reactivex.q
        public void subscribe(io.reactivex.s<? super T> sVar) {
            if (!this.f41330h.compareAndSet(false, true)) {
                Qu.e.m(new IllegalStateException("Only one Observer allowed!"), sVar);
                return;
            }
            sVar.onSubscribe(this);
            this.f41331i.lazySet(sVar);
            if (this.f41329g.get()) {
                this.f41331i.lazySet(null);
            } else {
                b();
            }
        }

        c(int i10, a<?, K, T> aVar, K k10, boolean z10) {
            this.f41324b = new C6159c<>(i10);
            this.f41325c = aVar;
            this.f41323a = k10;
            this.f41326d = z10;
        }

        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                C6159c<T> c6159c = this.f41324b;
                boolean z11 = this.f41326d;
                io.reactivex.s<? super T> sVar = this.f41331i.get();
                int iAddAndGet = 1;
                while (true) {
                    if (sVar != null) {
                        while (true) {
                            boolean z12 = this.f41327e;
                            T tPoll = c6159c.poll();
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
                        sVar = this.f41331i.get();
                    }
                }
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super AbstractC14144b<K, V>> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41309b, this.f41310c, this.f41311d, this.f41312e));
    }

    public C5464j0(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends K> oVar, Pu.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
        super(qVar);
        this.f41309b = oVar;
        this.f41310c = oVar2;
        this.f41311d = i10;
        this.f41312e = z10;
    }
}
