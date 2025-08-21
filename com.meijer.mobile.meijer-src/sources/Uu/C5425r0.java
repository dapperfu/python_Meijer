package Uu;

import Uu.C5406k0;
import cv.C13558a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.r0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5425r0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC5375a<TLeft, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends TRight> f38814b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f38815c;

    /* renamed from: d, reason: collision with root package name */
    final Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f38816d;

    /* renamed from: e, reason: collision with root package name */
    final Lu.c<? super TLeft, ? super TRight, ? extends R> f38817e;

    /* renamed from: Uu.r0$a */
    static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Ju.b, C5406k0.b {

        /* renamed from: n, reason: collision with root package name */
        static final Integer f38818n = 1;

        /* renamed from: o, reason: collision with root package name */
        static final Integer f38819o = 2;

        /* renamed from: p, reason: collision with root package name */
        static final Integer f38820p = 3;

        /* renamed from: q, reason: collision with root package name */
        static final Integer f38821q = 4;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38822a;

        /* renamed from: g, reason: collision with root package name */
        final Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> f38828g;

        /* renamed from: h, reason: collision with root package name */
        final Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> f38829h;

        /* renamed from: i, reason: collision with root package name */
        final Lu.c<? super TLeft, ? super TRight, ? extends R> f38830i;

        /* renamed from: k, reason: collision with root package name */
        int f38832k;

        /* renamed from: l, reason: collision with root package name */
        int f38833l;

        /* renamed from: m, reason: collision with root package name */
        volatile boolean f38834m;

        /* renamed from: c, reason: collision with root package name */
        final Ju.a f38824c = new Ju.a();

        /* renamed from: b, reason: collision with root package name */
        final Wu.c<Object> f38823b = new Wu.c<>(io.reactivex.l.bufferSize());

        /* renamed from: d, reason: collision with root package name */
        final Map<Integer, TLeft> f38825d = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        final Map<Integer, TRight> f38826e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Throwable> f38827f = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f38831j = new AtomicInteger(2);

        @Override // Uu.C5406k0.b
        public void a(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.f38823b.m(z10 ? f38818n : f38819o, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Uu.C5406k0.b
        public void e(boolean z10, C5406k0.c cVar) {
            synchronized (this) {
                try {
                    this.f38823b.m(z10 ? f38820p : f38821q, cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g();
        }

        @Override // Uu.C5406k0.b
        public void b(Throwable th2) {
            if (!av.j.a(this.f38827f, th2)) {
                C13558a.s(th2);
            } else {
                this.f38831j.decrementAndGet();
                g();
            }
        }

        @Override // Uu.C5406k0.b
        public void c(Throwable th2) {
            if (av.j.a(this.f38827f, th2)) {
                g();
            } else {
                C13558a.s(th2);
            }
        }

        @Override // Uu.C5406k0.b
        public void d(C5406k0.d dVar) {
            this.f38824c.a(dVar);
            this.f38831j.decrementAndGet();
            g();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38834m) {
                return;
            }
            this.f38834m = true;
            f();
            if (getAndIncrement() == 0) {
                this.f38823b.clear();
            }
        }

        void f() {
            this.f38824c.dispose();
        }

        void h(io.reactivex.s<?> sVar) {
            Throwable thB = av.j.b(this.f38827f);
            this.f38825d.clear();
            this.f38826e.clear();
            sVar.onError(thB);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38834m;
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Lu.c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.f38822a = sVar;
            this.f38828g = oVar;
            this.f38829h = oVar2;
            this.f38830i = cVar;
        }

        void g() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() == 0) {
                Wu.c<?> cVar = this.f38823b;
                io.reactivex.s<? super R> sVar = this.f38822a;
                int iAddAndGet = 1;
                while (!this.f38834m) {
                    if (this.f38827f.get() != null) {
                        cVar.clear();
                        f();
                        h(sVar);
                        return;
                    }
                    if (this.f38831j.get() == 0) {
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
                        this.f38825d.clear();
                        this.f38826e.clear();
                        this.f38824c.dispose();
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
                        if (num == f38818n) {
                            int i10 = this.f38832k;
                            this.f38832k = i10 + 1;
                            this.f38825d.put(Integer.valueOf(i10), objPoll);
                            try {
                                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38828g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                                C5406k0.c cVar2 = new C5406k0.c(this, true, i10);
                                this.f38824c.b(cVar2);
                                qVar.subscribe(cVar2);
                                if (this.f38827f.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    Iterator<TRight> it = this.f38826e.values().iterator();
                                    while (it.hasNext()) {
                                        try {
                                            sVar.onNext((Object) Nu.b.e(this.f38830i.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                        } catch (Throwable th2) {
                                            i(th2, sVar, cVar);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                i(th3, sVar, cVar);
                                return;
                            }
                        } else if (num == f38819o) {
                            int i11 = this.f38833l;
                            this.f38833l = i11 + 1;
                            this.f38826e.put(Integer.valueOf(i11), objPoll);
                            try {
                                io.reactivex.q qVar2 = (io.reactivex.q) Nu.b.e(this.f38829h.apply(objPoll), "The rightEnd returned a null ObservableSource");
                                C5406k0.c cVar3 = new C5406k0.c(this, false, i11);
                                this.f38824c.b(cVar3);
                                qVar2.subscribe(cVar3);
                                if (this.f38827f.get() != null) {
                                    cVar.clear();
                                    f();
                                    h(sVar);
                                    return;
                                } else {
                                    Iterator<TLeft> it2 = this.f38825d.values().iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            sVar.onNext((Object) Nu.b.e(this.f38830i.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                        } catch (Throwable th4) {
                                            i(th4, sVar, cVar);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                i(th5, sVar, cVar);
                                return;
                            }
                        } else if (num == f38820p) {
                            C5406k0.c cVar4 = (C5406k0.c) objPoll;
                            this.f38825d.remove(Integer.valueOf(cVar4.f38595c));
                            this.f38824c.c(cVar4);
                        } else {
                            C5406k0.c cVar5 = (C5406k0.c) objPoll;
                            this.f38826e.remove(Integer.valueOf(cVar5.f38595c));
                            this.f38824c.c(cVar5);
                        }
                    }
                }
                cVar.clear();
            }
        }

        void i(Throwable th2, io.reactivex.s<?> sVar, Wu.c<?> cVar) {
            Ku.a.b(th2);
            av.j.a(this.f38827f, th2);
            cVar.clear();
            f();
            h(sVar);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        a aVar = new a(sVar, this.f38815c, this.f38816d, this.f38817e);
        sVar.onSubscribe(aVar);
        C5406k0.d dVar = new C5406k0.d(aVar, true);
        aVar.f38824c.b(dVar);
        C5406k0.d dVar2 = new C5406k0.d(aVar, false);
        aVar.f38824c.b(dVar2);
        this.f38360a.subscribe(dVar);
        this.f38814b.subscribe(dVar2);
    }

    public C5425r0(io.reactivex.q<TLeft> qVar, io.reactivex.q<? extends TRight> qVar2, Lu.o<? super TLeft, ? extends io.reactivex.q<TLeftEnd>> oVar, Lu.o<? super TRight, ? extends io.reactivex.q<TRightEnd>> oVar2, Lu.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(qVar);
        this.f38814b = qVar2;
        this.f38815c = oVar;
        this.f38816d = oVar2;
        this.f38817e = cVar;
    }
}
