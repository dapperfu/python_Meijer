package Yu;

import Yu.C5467k0;
import av.C6159c;
import gv.C14313a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.r0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5486r0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC5436a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends TRight> f41589b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f41590c;

    /* renamed from: d, reason: collision with root package name */
    final Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f41591d;

    /* renamed from: e, reason: collision with root package name */
    final Pu.c<? super TLeft, ? super TRight, ? extends R> f41592e;

    /* renamed from: Yu.r0$a */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Nu.b, C5467k0.b {

        /* renamed from: n, reason: collision with root package name */
        static final Integer f41593n = 1;

        /* renamed from: o, reason: collision with root package name */
        static final Integer f41594o = 2;

        /* renamed from: p, reason: collision with root package name */
        static final Integer f41595p = 3;

        /* renamed from: q, reason: collision with root package name */
        static final Integer f41596q = 4;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41597a;

        /* renamed from: g, reason: collision with root package name */
        final Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f41603g;

        /* renamed from: h, reason: collision with root package name */
        final Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f41604h;

        /* renamed from: i, reason: collision with root package name */
        final Pu.c<? super TLeft, ? super TRight, ? extends R> f41605i;

        /* renamed from: k, reason: collision with root package name */
        int f41607k;

        /* renamed from: l, reason: collision with root package name */
        int f41608l;

        /* renamed from: m, reason: collision with root package name */
        volatile boolean f41609m;

        /* renamed from: c, reason: collision with root package name */
        final Nu.a f41599c = new Nu.a();

        /* renamed from: b, reason: collision with root package name */
        final C6159c<Object> f41598b = new C6159c<>(io.reactivex.l.bufferSize());

        /* renamed from: d, reason: collision with root package name */
        final Map<Integer, TLeft> f41600d = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        final Map<Integer, TRight> f41601e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f41602f = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f41606j = new AtomicInteger(2);

        @Override // Yu.C5467k0.b
        public void a(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f41598b.m(z10 ? f41593n : f41594o, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Yu.C5467k0.b
        public void e(boolean z10, C5467k0.c cVar) {
            synchronized (this) {
                try {
                    this.f41598b.m(z10 ? f41595p : f41596q, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Yu.C5467k0.b
        public void b(C5467k0.d dVar) {
            this.f41599c.c(dVar);
            this.f41606j.decrementAndGet();
            g();
        }

        @Override // Yu.C5467k0.b
        public void c(Throwable th2) {
            if (!ev.j.a(this.f41602f, th2)) {
                C14313a.s(th2);
            } else {
                this.f41606j.decrementAndGet();
                g();
            }
        }

        @Override // Yu.C5467k0.b
        public void d(Throwable th2) {
            if (ev.j.a(this.f41602f, th2)) {
                g();
            } else {
                C14313a.s(th2);
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41609m) {
                return;
            }
            this.f41609m = true;
            f();
            if (getAndIncrement() == 0) {
                this.f41598b.clear();
            }
        }

        void f() {
            this.f41599c.dispose();
        }

        void h(io.reactivex.s<?> sVar) {
            Throwable thB = ev.j.b(this.f41602f);
            this.f41600d.clear();
            this.f41601e.clear();
            sVar.onError(thB);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41609m;
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Pu.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f41597a = sVar;
            this.f41603g = oVar;
            this.f41604h = oVar2;
            this.f41605i = cVar;
        }

        void g() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() == 0) {
                C6159c<?> c6159c = this.f41598b;
                io.reactivex.s<? super R> sVar = this.f41597a;
                int iAddAndGet = 1;
                while (!this.f41609m) {
                    if (this.f41602f.get() != null) {
                        c6159c.clear();
                        f();
                        h(sVar);
                        return;
                    }
                    if (this.f41606j.get() == 0) {
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
                        this.f41600d.clear();
                        this.f41601e.clear();
                        this.f41599c.dispose();
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
                        if (num == f41593n) {
                            int i10 = this.f41607k;
                            this.f41607k = i10 + 1;
                            this.f41600d.put(Integer.valueOf(i10), objPoll);
                            try {
                                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41603g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                                C5467k0.c cVar = new C5467k0.c(this, true, i10);
                                this.f41599c.a(cVar);
                                qVar.subscribe(cVar);
                                if (this.f41602f.get() != null) {
                                    c6159c.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    Iterator<TRight> it = this.f41601e.values().iterator();
                                    while (it.hasNext()) {
                                        try {
                                            sVar.onNext((Object) Ru.b.e(this.f41605i.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                        } catch (Throwable th2) {
                                            i(th2, sVar, c6159c);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                i(th3, sVar, c6159c);
                                return;
                            }
                        } else if (num == f41594o) {
                            int i11 = this.f41608l;
                            this.f41608l = i11 + 1;
                            this.f41601e.put(Integer.valueOf(i11), objPoll);
                            try {
                                io.reactivex.q qVar2 = (io.reactivex.q) Ru.b.e(this.f41604h.apply(objPoll), "The rightEnd returned a null ObservableSource");
                                C5467k0.c cVar2 = new C5467k0.c(this, false, i11);
                                this.f41599c.a(cVar2);
                                qVar2.subscribe(cVar2);
                                if (this.f41602f.get() != null) {
                                    c6159c.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    Iterator<TLeft> it2 = this.f41600d.values().iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            sVar.onNext((Object) Ru.b.e(this.f41605i.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                        } catch (Throwable th4) {
                                            i(th4, sVar, c6159c);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                i(th5, sVar, c6159c);
                                return;
                            }
                        } else if (num == f41595p) {
                            C5467k0.c cVar3 = (C5467k0.c) objPoll;
                            this.f41600d.remove(Integer.valueOf(cVar3.f41370c));
                            this.f41599c.b(cVar3);
                        } else {
                            C5467k0.c cVar4 = (C5467k0.c) objPoll;
                            this.f41601e.remove(Integer.valueOf(cVar4.f41370c));
                            this.f41599c.b(cVar4);
                        }
                    }
                }
                c6159c.clear();
            }
        }

        void i(Throwable th2, io.reactivex.s<?> sVar, C6159c<?> c6159c) {
            Ou.a.b(th2);
            ev.j.a(this.f41602f, th2);
            c6159c.clear();
            f();
            h(sVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        a aVar = new a(sVar, this.f41590c, this.f41591d, this.f41592e);
        sVar.onSubscribe(aVar);
        C5467k0.d dVar = new C5467k0.d(aVar, true);
        aVar.f41599c.a(dVar);
        C5467k0.d dVar2 = new C5467k0.d(aVar, false);
        aVar.f41599c.a(dVar2);
        this.f41135a.subscribe(dVar);
        this.f41589b.subscribe(dVar2);
    }

    public C5486r0(io.reactivex.q<TLeft> qVar, io.reactivex.q<? extends TRight> qVar2, Pu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Pu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Pu.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(qVar);
        this.f41589b = qVar2;
        this.f41590c = oVar;
        this.f41591d = oVar2;
        this.f41592e = cVar;
    }
}
