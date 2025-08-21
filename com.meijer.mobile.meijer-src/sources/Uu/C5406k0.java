package Uu;

import cv.C13558a;
import fv.C14273f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.k0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5406k0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC5375a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends TRight> f38572b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f38573c;

    /* renamed from: d, reason: collision with root package name */
    final Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f38574d;

    /* renamed from: e, reason: collision with root package name */
    final Lu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> f38575e;

    /* renamed from: Uu.k0$a */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Ju.b, b {

        /* renamed from: n, reason: collision with root package name */
        static final Integer f38576n = 1;

        /* renamed from: o, reason: collision with root package name */
        static final Integer f38577o = 2;

        /* renamed from: p, reason: collision with root package name */
        static final Integer f38578p = 3;

        /* renamed from: q, reason: collision with root package name */
        static final Integer f38579q = 4;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38580a;

        /* renamed from: g, reason: collision with root package name */
        final Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f38586g;

        /* renamed from: h, reason: collision with root package name */
        final Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f38587h;

        /* renamed from: i, reason: collision with root package name */
        final Lu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> f38588i;

        /* renamed from: k, reason: collision with root package name */
        int f38590k;

        /* renamed from: l, reason: collision with root package name */
        int f38591l;

        /* renamed from: m, reason: collision with root package name */
        volatile boolean f38592m;

        /* renamed from: c, reason: collision with root package name */
        final Ju.a f38582c = new Ju.a();

        /* renamed from: b, reason: collision with root package name */
        final Wu.c<Object> f38581b = new Wu.c<>(io.reactivex.l.bufferSize());

        /* renamed from: d, reason: collision with root package name */
        final Map<Integer, C14273f<TRight>> f38583d = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        final Map<Integer, TRight> f38584e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f38585f = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f38589j = new AtomicInteger(2);

        @Override // Uu.C5406k0.b
        public void a(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f38581b.m(z10 ? f38576n : f38577o, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Uu.C5406k0.b
        public void e(boolean z10, c cVar) {
            synchronized (this) {
                try {
                    this.f38581b.m(z10 ? f38578p : f38579q, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Uu.C5406k0.b
        public void b(Throwable th2) {
            if (!av.j.a(this.f38585f, th2)) {
                C13558a.s(th2);
            } else {
                this.f38589j.decrementAndGet();
                g();
            }
        }

        @Override // Uu.C5406k0.b
        public void c(Throwable th2) {
            if (av.j.a(this.f38585f, th2)) {
                g();
            } else {
                C13558a.s(th2);
            }
        }

        @Override // Uu.C5406k0.b
        public void d(d dVar) {
            this.f38582c.a(dVar);
            this.f38589j.decrementAndGet();
            g();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38592m) {
                return;
            }
            this.f38592m = true;
            f();
            if (getAndIncrement() == 0) {
                this.f38581b.clear();
            }
        }

        void f() {
            this.f38582c.dispose();
        }

        void h(io.reactivex.s<?> sVar) {
            Throwable thB = av.j.b(this.f38585f);
            Iterator<C14273f<TRight>> it = this.f38583d.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thB);
            }
            this.f38583d.clear();
            this.f38584e.clear();
            sVar.onError(thB);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38592m;
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Lu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> cVar) {
            this.f38580a = sVar;
            this.f38586g = oVar;
            this.f38587h = oVar2;
            this.f38588i = cVar;
        }

        void g() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() == 0) {
                Wu.c<?> cVar = this.f38581b;
                io.reactivex.s<? super R> sVar = this.f38580a;
                int iAddAndGet = 1;
                while (!this.f38592m) {
                    if (this.f38585f.get() != null) {
                        cVar.clear();
                        f();
                        h(sVar);
                        return;
                    }
                    if (this.f38589j.get() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Integer num = (Integer) cVar.poll();
                    if (num == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && z11) {
                        Iterator<C14273f<TRight>> it = this.f38583d.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.f38583d.clear();
                        this.f38584e.clear();
                        this.f38582c.dispose();
                        sVar.onComplete();
                        return;
                    }
                    if (z11) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        Object objPoll = cVar.poll();
                        if (num == f38576n) {
                            C14273f c14273fD = C14273f.d();
                            int i10 = this.f38590k;
                            this.f38590k = i10 + 1;
                            this.f38583d.put(Integer.valueOf(i10), c14273fD);
                            try {
                                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38586g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                                c cVar2 = new c(this, true, i10);
                                this.f38582c.b(cVar2);
                                qVar.subscribe(cVar2);
                                if (this.f38585f.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    try {
                                        sVar.onNext((Object) Nu.b.e(this.f38588i.apply(objPoll, c14273fD), "The resultSelector returned a null value"));
                                        Iterator<TRight> it2 = this.f38584e.values().iterator();
                                        while (it2.hasNext()) {
                                            c14273fD.onNext(it2.next());
                                        }
                                    } catch (Throwable th2) {
                                        i(th2, sVar, cVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                i(th3, sVar, cVar);
                                return;
                            }
                        } else if (num == f38577o) {
                            int i11 = this.f38591l;
                            this.f38591l = i11 + 1;
                            this.f38584e.put(Integer.valueOf(i11), objPoll);
                            try {
                                io.reactivex.q qVar2 = (io.reactivex.q) Nu.b.e(this.f38587h.apply(objPoll), "The rightEnd returned a null ObservableSource");
                                c cVar3 = new c(this, false, i11);
                                this.f38582c.b(cVar3);
                                qVar2.subscribe(cVar3);
                                if (this.f38585f.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    Iterator<C14273f<TRight>> it3 = this.f38583d.values().iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onNext(objPoll);
                                    }
                                }
                            } catch (Throwable th4) {
                                i(th4, sVar, cVar);
                                return;
                            }
                        } else if (num == f38578p) {
                            c cVar4 = (c) objPoll;
                            C14273f<TRight> c14273fRemove = this.f38583d.remove(Integer.valueOf(cVar4.f38595c));
                            this.f38582c.c(cVar4);
                            if (c14273fRemove != null) {
                                c14273fRemove.onComplete();
                            }
                        } else if (num == f38579q) {
                            c cVar5 = (c) objPoll;
                            this.f38584e.remove(Integer.valueOf(cVar5.f38595c));
                            this.f38582c.c(cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        void i(Throwable th2, io.reactivex.s<?> sVar, Wu.c<?> cVar) {
            Ku.a.b(th2);
            av.j.a(this.f38585f, th2);
            cVar.clear();
            f();
            h(sVar);
        }
    }

    /* renamed from: Uu.k0$b */
    interface b {
        void a(boolean z10, Object obj);

        void b(Throwable th2);

        void c(Throwable th2);

        void d(d dVar);

        void e(boolean z10, c cVar);
    }

    /* renamed from: Uu.k0$c */
    static final class c extends AtomicReference<Ju.b> implements io.reactivex.s<Object>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final b f38593a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f38594b;

        /* renamed from: c, reason: collision with root package name */
        final int f38595c;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38593a.e(this.f38594b, this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38593a.c(th2);
        }

        c(b bVar, boolean z10, int i10) {
            this.f38593a = bVar;
            this.f38594b = z10;
            this.f38595c = i10;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            if (Mu.d.a(this)) {
                this.f38593a.e(this.f38594b, this);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    /* renamed from: Uu.k0$d */
    static final class d extends AtomicReference<Ju.b> implements io.reactivex.s<Object>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final b f38596a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f38597b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38596a.d(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38596a.b(th2);
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
            this.f38596a.a(this.f38597b, obj);
        }

        d(b bVar, boolean z10) {
            this.f38596a = bVar;
            this.f38597b = z10;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        a aVar = new a(sVar, this.f38573c, this.f38574d, this.f38575e);
        sVar.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        aVar.f38582c.b(dVar);
        d dVar2 = new d(aVar, false);
        aVar.f38582c.b(dVar2);
        this.f38360a.subscribe(dVar);
        this.f38572b.subscribe(dVar2);
    }

    public C5406k0(io.reactivex.q<TLeft> qVar, io.reactivex.q<? extends TRight> qVar2, Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Lu.c<? super TLeft, ? super io.reactivex.l<TRight>, ? extends R> cVar) {
        super(qVar);
        this.f38572b = qVar2;
        this.f38573c = oVar;
        this.f38574d = oVar2;
        this.f38575e = cVar;
    }
}
