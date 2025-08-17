package Yu;

import av.C6159c;
import gv.C14313a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jv.C15083f;

/* renamed from: Yu.k0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5467k0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC5436a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends TRight> f41347b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f41348c;

    /* renamed from: d, reason: collision with root package name */
    final Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f41349d;

    /* renamed from: e, reason: collision with root package name */
    final Pu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> f41350e;

    /* renamed from: Yu.k0$a */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Nu.b, b {

        /* renamed from: n, reason: collision with root package name */
        static final Integer f41351n = 1;

        /* renamed from: o, reason: collision with root package name */
        static final Integer f41352o = 2;

        /* renamed from: p, reason: collision with root package name */
        static final Integer f41353p = 3;

        /* renamed from: q, reason: collision with root package name */
        static final Integer f41354q = 4;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41355a;

        /* renamed from: g, reason: collision with root package name */
        final Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f41361g;

        /* renamed from: h, reason: collision with root package name */
        final Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f41362h;

        /* renamed from: i, reason: collision with root package name */
        final Pu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> f41363i;

        /* renamed from: k, reason: collision with root package name */
        int f41365k;

        /* renamed from: l, reason: collision with root package name */
        int f41366l;

        /* renamed from: m, reason: collision with root package name */
        volatile boolean f41367m;

        /* renamed from: c, reason: collision with root package name */
        final Nu.a f41357c = new Nu.a();

        /* renamed from: b, reason: collision with root package name */
        final C6159c<Object> f41356b = new C6159c<>(io.reactivex.l.bufferSize());

        /* renamed from: d, reason: collision with root package name */
        final Map<Integer, C15083f<TRight>> f41358d = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        final Map<Integer, TRight> f41359e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f41360f = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f41364j = new AtomicInteger(2);

        @Override // Yu.C5467k0.b
        public void a(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f41356b.m(z10 ? f41351n : f41352o, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Yu.C5467k0.b
        public void e(boolean z10, c cVar) {
            synchronized (this) {
                try {
                    this.f41356b.m(z10 ? f41353p : f41354q, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Yu.C5467k0.b
        public void b(d dVar) {
            this.f41357c.c(dVar);
            this.f41364j.decrementAndGet();
            g();
        }

        @Override // Yu.C5467k0.b
        public void c(Throwable th2) {
            if (!ev.j.a(this.f41360f, th2)) {
                C14313a.s(th2);
            } else {
                this.f41364j.decrementAndGet();
                g();
            }
        }

        @Override // Yu.C5467k0.b
        public void d(Throwable th2) {
            if (ev.j.a(this.f41360f, th2)) {
                g();
            } else {
                C14313a.s(th2);
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41367m) {
                return;
            }
            this.f41367m = true;
            f();
            if (getAndIncrement() == 0) {
                this.f41356b.clear();
            }
        }

        void f() {
            this.f41357c.dispose();
        }

        void h(io.reactivex.s<?> sVar) {
            Throwable thB = ev.j.b(this.f41360f);
            Iterator<C15083f<TRight>> it = this.f41358d.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thB);
            }
            this.f41358d.clear();
            this.f41359e.clear();
            sVar.onError(thB);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41367m;
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Pu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> cVar) {
            this.f41355a = sVar;
            this.f41361g = oVar;
            this.f41362h = oVar2;
            this.f41363i = cVar;
        }

        void g() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() == 0) {
                C6159c<?> c6159c = this.f41356b;
                io.reactivex.s<? super R> sVar = this.f41355a;
                int iAddAndGet = 1;
                while (!this.f41367m) {
                    if (this.f41360f.get() != null) {
                        c6159c.clear();
                        f();
                        h(sVar);
                        return;
                    }
                    if (this.f41364j.get() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Integer num = (Integer) c6159c.poll();
                    if (num == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && z11) {
                        Iterator<C15083f<TRight>> it = this.f41358d.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.f41358d.clear();
                        this.f41359e.clear();
                        this.f41357c.dispose();
                        sVar.onComplete();
                        return;
                    }
                    if (z11) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        Object objPoll = c6159c.poll();
                        if (num == f41351n) {
                            C15083f c15083fD = C15083f.d();
                            int i10 = this.f41365k;
                            this.f41365k = i10 + 1;
                            this.f41358d.put(Integer.valueOf(i10), c15083fD);
                            try {
                                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41361g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                                c cVar = new c(this, true, i10);
                                this.f41357c.a(cVar);
                                qVar.subscribe(cVar);
                                if (this.f41360f.get() != null) {
                                    c6159c.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    try {
                                        sVar.onNext((Object) Ru.b.e(this.f41363i.apply(objPoll, c15083fD), "The resultSelector returned a null value"));
                                        Iterator<TRight> it2 = this.f41359e.values().iterator();
                                        while (it2.hasNext()) {
                                            c15083fD.onNext(it2.next());
                                        }
                                    } catch (Throwable th2) {
                                        i(th2, sVar, c6159c);
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                i(th3, sVar, c6159c);
                                return;
                            }
                        } else if (num == f41352o) {
                            int i11 = this.f41366l;
                            this.f41366l = i11 + 1;
                            this.f41359e.put(Integer.valueOf(i11), objPoll);
                            try {
                                io.reactivex.q qVar2 = (io.reactivex.q) Ru.b.e(this.f41362h.apply(objPoll), "The rightEnd returned a null ObservableSource");
                                c cVar2 = new c(this, false, i11);
                                this.f41357c.a(cVar2);
                                qVar2.subscribe(cVar2);
                                if (this.f41360f.get() != null) {
                                    c6159c.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    Iterator<C15083f<TRight>> it3 = this.f41358d.values().iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onNext(objPoll);
                                    }
                                }
                            } catch (Throwable th4) {
                                i(th4, sVar, c6159c);
                                return;
                            }
                        } else if (num == f41353p) {
                            c cVar3 = (c) objPoll;
                            C15083f<TRight> c15083fRemove = this.f41358d.remove(Integer.valueOf(cVar3.f41370c));
                            this.f41357c.b(cVar3);
                            if (c15083fRemove != null) {
                                c15083fRemove.onComplete();
                            }
                        } else if (num == f41354q) {
                            c cVar4 = (c) objPoll;
                            this.f41359e.remove(Integer.valueOf(cVar4.f41370c));
                            this.f41357c.b(cVar4);
                        }
                    }
                }
                c6159c.clear();
            }
        }

        void i(Throwable th2, io.reactivex.s<?> sVar, C6159c<?> c6159c) {
            Ou.a.b(th2);
            ev.j.a(this.f41360f, th2);
            c6159c.clear();
            f();
            h(sVar);
        }
    }

    /* renamed from: Yu.k0$b */
    interface b {
        void a(boolean z10, Object obj);

        void b(d dVar);

        void c(Throwable th2);

        void d(Throwable th2);

        void e(boolean z10, c cVar);
    }

    /* renamed from: Yu.k0$c */
    static final class c extends AtomicReference<Nu.b> implements io.reactivex.s<Object>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final b f41368a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f41369b;

        /* renamed from: c, reason: collision with root package name */
        final int f41370c;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41368a.e(this.f41369b, this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41368a.d(th2);
        }

        c(b bVar, boolean z10, int i10) {
            this.f41368a = bVar;
            this.f41369b = z10;
            this.f41370c = i10;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            if (Qu.d.a(this)) {
                this.f41368a.e(this.f41369b, this);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    /* renamed from: Yu.k0$d */
    static final class d extends AtomicReference<Nu.b> implements io.reactivex.s<Object>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final b f41371a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f41372b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41371a.b(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41371a.c(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f41371a.a(this.f41372b, obj);
        }

        d(b bVar, boolean z10) {
            this.f41371a = bVar;
            this.f41372b = z10;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        a aVar = new a(sVar, this.f41348c, this.f41349d, this.f41350e);
        sVar.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        aVar.f41357c.a(dVar);
        d dVar2 = new d(aVar, false);
        aVar.f41357c.a(dVar2);
        this.f41135a.subscribe(dVar);
        this.f41347b.subscribe(dVar2);
    }

    public C5467k0(io.reactivex.q<TLeft> qVar, io.reactivex.q<? extends TRight> qVar2, Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Pu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> cVar) {
        super(qVar);
        this.f41347b = qVar2;
        this.f41348c = oVar;
        this.f41349d = oVar2;
        this.f41350e = cVar;
    }
}
