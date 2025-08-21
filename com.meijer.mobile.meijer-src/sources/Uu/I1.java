package Uu;

import cv.C13558a;
import fv.C14273f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class I1<T, B, V> extends AbstractC5375a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<B> f37963b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super B, ? extends io.reactivex.q<V>> f37964c;

    /* renamed from: d, reason: collision with root package name */
    final int f37965d;

    static final class a<T, V> extends io.reactivex.observers.d<V> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, ?, V> f37966b;

        /* renamed from: c, reason: collision with root package name */
        final C14273f<T> f37967c;

        /* renamed from: d, reason: collision with root package name */
        boolean f37968d;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37968d) {
                return;
            }
            this.f37968d = true;
            this.f37966b.e(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37968d) {
                C13558a.s(th2);
            } else {
                this.f37968d = true;
                this.f37966b.h(th2);
            }
        }

        a(c<T, ?, V> cVar, C14273f<T> c14273f) {
            this.f37966b = cVar;
            this.f37967c = c14273f;
        }

        @Override // io.reactivex.s
        public void onNext(V v10) {
            dispose();
            onComplete();
        }
    }

    static final class b<T, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, B, ?> f37969b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37969b.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37969b.h(th2);
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            this.f37969b.i(b10);
        }

        b(c<T, B, ?> cVar) {
            this.f37969b = cVar;
        }
    }

    static final class c<T, B, V> extends Pu.r<T, Object, io.reactivex.l<T>> implements Ju.b {

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.q<B> f37970g;

        /* renamed from: h, reason: collision with root package name */
        final Lu.o<? super B, ? extends io.reactivex.q<V>> f37971h;

        /* renamed from: i, reason: collision with root package name */
        final int f37972i;

        /* renamed from: j, reason: collision with root package name */
        final Ju.a f37973j;

        /* renamed from: k, reason: collision with root package name */
        Ju.b f37974k;

        /* renamed from: l, reason: collision with root package name */
        final AtomicReference<Ju.b> f37975l;

        /* renamed from: m, reason: collision with root package name */
        final List<C14273f<T>> f37976m;

        /* renamed from: n, reason: collision with root package name */
        final AtomicLong f37977n;

        /* renamed from: o, reason: collision with root package name */
        final AtomicBoolean f37978o;

        @Override // Pu.r, av.n
        public void F(io.reactivex.s<? super io.reactivex.l<T>> sVar, Object obj) {
        }

        c(io.reactivex.s<? super io.reactivex.l<T>> sVar, io.reactivex.q<B> qVar, Lu.o<? super B, ? extends io.reactivex.q<V>> oVar, int i10) {
            super(sVar, new Wu.a());
            this.f37975l = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f37977n = atomicLong;
            this.f37978o = new AtomicBoolean();
            this.f37970g = qVar;
            this.f37971h = oVar;
            this.f37972i = i10;
            this.f37973j = new Ju.a();
            this.f37976m = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f37978o.compareAndSet(false, true)) {
                Mu.d.a(this.f37975l);
                if (this.f37977n.decrementAndGet() == 0) {
                    this.f37974k.dispose();
                }
            }
        }

        void e(a<T, V> aVar) {
            this.f37973j.a(aVar);
            this.f27260c.offer(new d(aVar.f37967c, null));
            if (a()) {
                g();
            }
        }

        void f() {
            this.f37973j.dispose();
            Mu.d.a(this.f37975l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            Wu.a aVar = (Wu.a) this.f27260c;
            io.reactivex.s<? super V> sVar = this.f27259b;
            List<C14273f<T>> list = this.f37976m;
            int iG = 1;
            while (true) {
                boolean z10 = this.f27262e;
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    f();
                    Throwable th2 = this.f27263f;
                    if (th2 != null) {
                        Iterator<C14273f<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<C14273f<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z11) {
                    iG = G(-iG);
                    if (iG == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    C14273f<T> c14273f = dVar.f37979a;
                    if (c14273f != null) {
                        if (list.remove(c14273f)) {
                            dVar.f37979a.onComplete();
                            if (this.f37977n.decrementAndGet() == 0) {
                                f();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f37978o.get()) {
                        C14273f<T> c14273fE = C14273f.e(this.f37972i);
                        list.add(c14273fE);
                        sVar.onNext(c14273fE);
                        try {
                            io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f37971h.apply(dVar.f37980b), "The ObservableSource supplied is null");
                            a aVar2 = new a(this, c14273fE);
                            if (this.f37973j.b(aVar2)) {
                                this.f37977n.getAndIncrement();
                                qVar.subscribe(aVar2);
                            }
                        } catch (Throwable th3) {
                            Ku.a.b(th3);
                            this.f37978o.set(true);
                            sVar.onError(th3);
                        }
                    }
                } else {
                    Iterator<C14273f<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(av.m.p(objPoll));
                    }
                }
            }
        }

        void h(Throwable th2) {
            this.f37974k.dispose();
            this.f37973j.dispose();
            onError(th2);
        }

        void i(B b10) {
            this.f27260c.offer(new d(null, b10));
            if (a()) {
                g();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37978o.get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f27262e) {
                return;
            }
            this.f27262e = true;
            if (a()) {
                g();
            }
            if (this.f37977n.decrementAndGet() == 0) {
                this.f37973j.dispose();
            }
            this.f27259b.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f27262e) {
                C13558a.s(th2);
                return;
            }
            this.f27263f = th2;
            this.f27262e = true;
            if (a()) {
                g();
            }
            if (this.f37977n.decrementAndGet() == 0) {
                this.f37973j.dispose();
            }
            this.f27259b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37974k, bVar)) {
                this.f37974k = bVar;
                this.f27259b.onSubscribe(this);
                if (this.f37978o.get()) {
                    return;
                }
                b bVar2 = new b(this);
                if (U.d.a(this.f37975l, null, bVar2)) {
                    this.f37970g.subscribe(bVar2);
                }
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (b()) {
                Iterator<C14273f<T>> it = this.f37976m.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f27260c.offer(av.m.z(t10));
                if (!a()) {
                    return;
                }
            }
            g();
        }
    }

    static final class d<T, B> {

        /* renamed from: a, reason: collision with root package name */
        final C14273f<T> f37979a;

        /* renamed from: b, reason: collision with root package name */
        final B f37980b;

        d(C14273f<T> c14273f, B b10) {
            this.f37979a = c14273f;
            this.f37980b = b10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        this.f38360a.subscribe(new c(new io.reactivex.observers.f(sVar), this.f37963b, this.f37964c, this.f37965d));
    }

    public I1(io.reactivex.q<T> qVar, io.reactivex.q<B> qVar2, Lu.o<? super B, ? extends io.reactivex.q<V>> oVar, int i10) {
        super(qVar);
        this.f37963b = qVar2;
        this.f37964c = oVar;
        this.f37965d = i10;
    }
}
