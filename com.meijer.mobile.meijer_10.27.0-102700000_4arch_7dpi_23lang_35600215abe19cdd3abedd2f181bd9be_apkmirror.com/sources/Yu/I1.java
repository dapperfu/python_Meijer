package Yu;

import av.C6157a;
import gv.C14313a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jv.C15083f;

/* loaded from: classes9.dex */
public final class I1<T, B, V> extends AbstractC5436a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<B> f40738b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super B, ? extends io.reactivex.q<V>> f40739c;

    /* renamed from: d, reason: collision with root package name */
    final int f40740d;

    static final class a<T, V> extends io.reactivex.observers.d<V> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, ?, V> f40741b;

        /* renamed from: c, reason: collision with root package name */
        final C15083f<T> f40742c;

        /* renamed from: d, reason: collision with root package name */
        boolean f40743d;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40743d) {
                return;
            }
            this.f40743d = true;
            this.f40741b.e(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40743d) {
                C14313a.s(th2);
            } else {
                this.f40743d = true;
                this.f40741b.h(th2);
            }
        }

        a(c<T, ?, V> cVar, C15083f<T> c15083f) {
            this.f40741b = cVar;
            this.f40742c = c15083f;
        }

        @Override // io.reactivex.s
        public void onNext(V v10) {
            dispose();
            onComplete();
        }
    }

    static final class b<T, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, B, ?> f40744b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40744b.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40744b.h(th2);
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            this.f40744b.i(b10);
        }

        b(c<T, B, ?> cVar) {
            this.f40744b = cVar;
        }
    }

    static final class c<T, B, V> extends Tu.r<T, Object, io.reactivex.l<T>> implements Nu.b {

        /* renamed from: g, reason: collision with root package name */
        final io.reactivex.q<B> f40745g;

        /* renamed from: h, reason: collision with root package name */
        final Pu.o<? super B, ? extends io.reactivex.q<V>> f40746h;

        /* renamed from: i, reason: collision with root package name */
        final int f40747i;

        /* renamed from: j, reason: collision with root package name */
        final Nu.a f40748j;

        /* renamed from: k, reason: collision with root package name */
        Nu.b f40749k;

        /* renamed from: l, reason: collision with root package name */
        final AtomicReference<Nu.b> f40750l;

        /* renamed from: m, reason: collision with root package name */
        final List<C15083f<T>> f40751m;

        /* renamed from: n, reason: collision with root package name */
        final AtomicLong f40752n;

        /* renamed from: o, reason: collision with root package name */
        final AtomicBoolean f40753o;

        @Override // Tu.r, ev.n
        public void F(io.reactivex.s<? super io.reactivex.l<T>> sVar, Object obj) {
        }

        c(io.reactivex.s<? super io.reactivex.l<T>> sVar, io.reactivex.q<B> qVar, Pu.o<? super B, ? extends io.reactivex.q<V>> oVar, int i10) {
            super(sVar, new C6157a());
            this.f40750l = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f40752n = atomicLong;
            this.f40753o = new AtomicBoolean();
            this.f40745g = qVar;
            this.f40746h = oVar;
            this.f40747i = i10;
            this.f40748j = new Nu.a();
            this.f40751m = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f40753o.compareAndSet(false, true)) {
                Qu.d.a(this.f40750l);
                if (this.f40752n.decrementAndGet() == 0) {
                    this.f40749k.dispose();
                }
            }
        }

        void e(a<T, V> aVar) {
            this.f40748j.c(aVar);
            this.f35488c.offer(new d(aVar.f40742c, null));
            if (a()) {
                g();
            }
        }

        void f() {
            this.f40748j.dispose();
            Qu.d.a(this.f40750l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            C6157a c6157a = (C6157a) this.f35488c;
            io.reactivex.s<? super V> sVar = this.f35487b;
            List<C15083f<T>> list = this.f40751m;
            int iG = 1;
            while (true) {
                boolean z10 = this.f35490e;
                Object objPoll = c6157a.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    f();
                    Throwable th2 = this.f35491f;
                    if (th2 != null) {
                        Iterator<C15083f<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<C15083f<T>> it2 = list.iterator();
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
                    C15083f<T> c15083f = dVar.f40754a;
                    if (c15083f != null) {
                        if (list.remove(c15083f)) {
                            dVar.f40754a.onComplete();
                            if (this.f40752n.decrementAndGet() == 0) {
                                f();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f40753o.get()) {
                        C15083f<T> c15083fE = C15083f.e(this.f40747i);
                        list.add(c15083fE);
                        sVar.onNext(c15083fE);
                        try {
                            io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f40746h.apply(dVar.f40755b), "The ObservableSource supplied is null");
                            a aVar = new a(this, c15083fE);
                            if (this.f40748j.a(aVar)) {
                                this.f40752n.getAndIncrement();
                                qVar.subscribe(aVar);
                            }
                        } catch (Throwable th3) {
                            Ou.a.b(th3);
                            this.f40753o.set(true);
                            sVar.onError(th3);
                        }
                    }
                } else {
                    Iterator<C15083f<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(ev.m.p(objPoll));
                    }
                }
            }
        }

        void h(Throwable th2) {
            this.f40749k.dispose();
            this.f40748j.dispose();
            onError(th2);
        }

        void i(B b10) {
            this.f35488c.offer(new d(null, b10));
            if (a()) {
                g();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40753o.get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f35490e) {
                return;
            }
            this.f35490e = true;
            if (a()) {
                g();
            }
            if (this.f40752n.decrementAndGet() == 0) {
                this.f40748j.dispose();
            }
            this.f35487b.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f35490e) {
                C14313a.s(th2);
                return;
            }
            this.f35491f = th2;
            this.f35490e = true;
            if (a()) {
                g();
            }
            if (this.f40752n.decrementAndGet() == 0) {
                this.f40748j.dispose();
            }
            this.f35487b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40749k, bVar)) {
                this.f40749k = bVar;
                this.f35487b.onSubscribe(this);
                if (this.f40753o.get()) {
                    return;
                }
                b bVar2 = new b(this);
                if (U.d.a(this.f40750l, null, bVar2)) {
                    this.f40745g.subscribe(bVar2);
                }
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (b()) {
                Iterator<C15083f<T>> it = this.f40751m.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (G(-1) == 0) {
                    return;
                }
            } else {
                this.f35488c.offer(ev.m.z(t10));
                if (!a()) {
                    return;
                }
            }
            g();
        }
    }

    static final class d<T, B> {

        /* renamed from: a, reason: collision with root package name */
        final C15083f<T> f40754a;

        /* renamed from: b, reason: collision with root package name */
        final B f40755b;

        d(C15083f<T> c15083f, B b10) {
            this.f40754a = c15083f;
            this.f40755b = b10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        this.f41135a.subscribe(new c(new io.reactivex.observers.f(sVar), this.f40738b, this.f40739c, this.f40740d));
    }

    public I1(io.reactivex.q<T> qVar, io.reactivex.q<B> qVar2, Pu.o<? super B, ? extends io.reactivex.q<V>> oVar, int i10) {
        super(qVar);
        this.f40738b = qVar2;
        this.f40739c = oVar;
        this.f40740d = i10;
    }
}
