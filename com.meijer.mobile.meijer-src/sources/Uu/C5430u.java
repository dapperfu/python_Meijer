package Uu;

import A0.c;
import cv.C13558a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5430u<T, U> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.q<? extends U>> f38891b;

    /* renamed from: c, reason: collision with root package name */
    final int f38892c;

    /* renamed from: d, reason: collision with root package name */
    final av.i f38893d;

    /* renamed from: Uu.u$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38894a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38895b;

        /* renamed from: c, reason: collision with root package name */
        final int f38896c;

        /* renamed from: d, reason: collision with root package name */
        final av.c f38897d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final C0844a<R> f38898e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f38899f;

        /* renamed from: g, reason: collision with root package name */
        Ou.f<T> f38900g;

        /* renamed from: h, reason: collision with root package name */
        Ju.b f38901h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f38902i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f38903j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f38904k;

        /* renamed from: l, reason: collision with root package name */
        int f38905l;

        /* renamed from: Uu.u$a$a, reason: collision with other inner class name */
        static final class C0844a<R> extends AtomicReference<Ju.b> implements io.reactivex.s<R> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.s<? super R> f38906a;

            /* renamed from: b, reason: collision with root package name */
            final a<?, R> f38907b;

            @Override // io.reactivex.s
            public void onComplete() {
                a<?, R> aVar = this.f38907b;
                aVar.f38902i = false;
                aVar.a();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                a<?, R> aVar = this.f38907b;
                if (!aVar.f38897d.a(th2)) {
                    C13558a.s(th2);
                    return;
                }
                if (!aVar.f38899f) {
                    aVar.f38901h.dispose();
                }
                aVar.f38902i = false;
                aVar.a();
            }

            @Override // io.reactivex.s
            public void onNext(R r10) {
                this.f38906a.onNext(r10);
            }

            C0844a(io.reactivex.s<? super R> sVar, a<?, R> aVar) {
                this.f38906a = sVar;
                this.f38907b = aVar;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.s
            public void onSubscribe(Ju.b bVar) {
                Mu.d.e(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38904k = true;
            this.f38901h.dispose();
            this.f38898e.a();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38903j = true;
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38904k;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f38897d.a(th2)) {
                C13558a.s(th2);
            } else {
                this.f38903j = true;
                a();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38905l == 0) {
                this.f38900g.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38901h, bVar)) {
                this.f38901h = bVar;
                if (bVar instanceof Ou.b) {
                    Ou.b bVar2 = (Ou.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f38905l = iA;
                        this.f38900g = bVar2;
                        this.f38903j = true;
                        this.f38894a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.f38905l = iA;
                        this.f38900g = bVar2;
                        this.f38894a.onSubscribe(this);
                        return;
                    }
                }
                this.f38900g = new Wu.c(this.f38896c);
                this.f38894a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, boolean z10) {
            this.f38894a = sVar;
            this.f38895b = oVar;
            this.f38896c = i10;
            this.f38899f = z10;
            this.f38898e = new C0844a<>(sVar, this);
        }

        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super R> sVar = this.f38894a;
                Ou.f<T> fVar = this.f38900g;
                av.c cVar = this.f38897d;
                while (true) {
                    if (!this.f38902i) {
                        if (this.f38904k) {
                            fVar.clear();
                            return;
                        }
                        if (!this.f38899f && cVar.get() != null) {
                            fVar.clear();
                            this.f38904k = true;
                            sVar.onError(cVar.b());
                            return;
                        }
                        boolean z11 = this.f38903j;
                        try {
                            T tPoll = fVar.poll();
                            if (tPoll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z11 && z10) {
                                this.f38904k = true;
                                Throwable thB = cVar.b();
                                if (thB != null) {
                                    sVar.onError(thB);
                                    return;
                                } else {
                                    sVar.onComplete();
                                    return;
                                }
                            }
                            if (!z10) {
                                try {
                                    io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38895b.apply(tPoll), "The mapper returned a null ObservableSource");
                                    if (qVar instanceof Callable) {
                                        try {
                                            c.e eVar = (Object) ((Callable) qVar).call();
                                            if (eVar != null && !this.f38904k) {
                                                sVar.onNext(eVar);
                                            }
                                        } catch (Throwable th2) {
                                            Ku.a.b(th2);
                                            cVar.a(th2);
                                        }
                                    } else {
                                        this.f38902i = true;
                                        qVar.subscribe(this.f38898e);
                                    }
                                } catch (Throwable th3) {
                                    Ku.a.b(th3);
                                    this.f38904k = true;
                                    this.f38901h.dispose();
                                    fVar.clear();
                                    cVar.a(th3);
                                    sVar.onError(cVar.b());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Ku.a.b(th4);
                            this.f38904k = true;
                            this.f38901h.dispose();
                            cVar.a(th4);
                            sVar.onError(cVar.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: Uu.u$b */
    static final class b<T, U> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f38908a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<? extends U>> f38909b;

        /* renamed from: c, reason: collision with root package name */
        final a<U> f38910c;

        /* renamed from: d, reason: collision with root package name */
        final int f38911d;

        /* renamed from: e, reason: collision with root package name */
        Ou.f<T> f38912e;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f38913f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38914g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f38915h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f38916i;

        /* renamed from: j, reason: collision with root package name */
        int f38917j;

        /* renamed from: Uu.u$b$a */
        static final class a<U> extends AtomicReference<Ju.b> implements io.reactivex.s<U> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.s<? super U> f38918a;

            /* renamed from: b, reason: collision with root package name */
            final b<?, ?> f38919b;

            @Override // io.reactivex.s
            public void onComplete() {
                this.f38919b.b();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                this.f38919b.dispose();
                this.f38918a.onError(th2);
            }

            @Override // io.reactivex.s
            public void onNext(U u10) {
                this.f38918a.onNext(u10);
            }

            a(io.reactivex.s<? super U> sVar, b<?, ?> bVar) {
                this.f38918a = sVar;
                this.f38919b = bVar;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.s
            public void onSubscribe(Ju.b bVar) {
                Mu.d.e(this, bVar);
            }
        }

        void b() {
            this.f38914g = false;
            a();
        }

        @Override // Ju.b
        public void dispose() {
            this.f38915h = true;
            this.f38910c.a();
            this.f38913f.dispose();
            if (getAndIncrement() == 0) {
                this.f38912e.clear();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38915h;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38916i) {
                return;
            }
            this.f38916i = true;
            a();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38916i) {
                C13558a.s(th2);
                return;
            }
            this.f38916i = true;
            dispose();
            this.f38908a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38916i) {
                return;
            }
            if (this.f38917j == 0) {
                this.f38912e.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38913f, bVar)) {
                this.f38913f = bVar;
                if (bVar instanceof Ou.b) {
                    Ou.b bVar2 = (Ou.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f38917j = iA;
                        this.f38912e = bVar2;
                        this.f38916i = true;
                        this.f38908a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.f38917j = iA;
                        this.f38912e = bVar2;
                        this.f38908a.onSubscribe(this);
                        return;
                    }
                }
                this.f38912e = new Wu.c(this.f38911d);
                this.f38908a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super U> sVar, Lu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, int i10) {
            this.f38908a = sVar;
            this.f38909b = oVar;
            this.f38911d = i10;
            this.f38910c = new a<>(sVar, this);
        }

        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                while (!this.f38915h) {
                    if (!this.f38914g) {
                        boolean z11 = this.f38916i;
                        try {
                            T tPoll = this.f38912e.poll();
                            if (tPoll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z11 && z10) {
                                this.f38915h = true;
                                this.f38908a.onComplete();
                                return;
                            } else if (!z10) {
                                try {
                                    io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38909b.apply(tPoll), "The mapper returned a null ObservableSource");
                                    this.f38914g = true;
                                    qVar.subscribe(this.f38910c);
                                } catch (Throwable th2) {
                                    Ku.a.b(th2);
                                    dispose();
                                    this.f38912e.clear();
                                    this.f38908a.onError(th2);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Ku.a.b(th3);
                            dispose();
                            this.f38912e.clear();
                            this.f38908a.onError(th3);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f38912e.clear();
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        if (Z0.b(this.f38360a, sVar, this.f38891b)) {
            return;
        }
        if (this.f38893d == av.i.IMMEDIATE) {
            this.f38360a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f38891b, this.f38892c));
        } else {
            this.f38360a.subscribe(new a(sVar, this.f38891b, this.f38892c, this.f38893d == av.i.END));
        }
    }

    public C5430u(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.q<? extends U>> oVar, int i10, av.i iVar) {
        super(qVar);
        this.f38891b = oVar;
        this.f38893d = iVar;
        this.f38892c = Math.max(8, i10);
    }
}
