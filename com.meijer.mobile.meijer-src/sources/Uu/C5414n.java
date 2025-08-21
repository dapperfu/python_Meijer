package Uu;

import cv.C13558a;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5414n<T, U extends Collection<? super T>, B> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<B>> f38657b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<U> f38658c;

    /* renamed from: Uu.n$a */
    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f38659b;

        /* renamed from: c, reason: collision with root package name */
        boolean f38660c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38660c) {
                return;
            }
            this.f38660c = true;
            this.f38659b.g();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38660c) {
                C13558a.s(th2);
            } else {
                this.f38660c = true;
                this.f38659b.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            if (this.f38660c) {
                return;
            }
            this.f38660c = true;
            dispose();
            this.f38659b.g();
        }

        a(b<T, U, B> bVar) {
            this.f38659b = bVar;
        }
    }

    /* renamed from: Uu.n$b */
    static final class b<T, U extends Collection<? super T>, B> extends Pu.r<T, U, U> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f38661g;

        /* renamed from: h, reason: collision with root package name */
        final Callable<? extends io.reactivex.q<B>> f38662h;

        /* renamed from: i, reason: collision with root package name */
        Ju.b f38663i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference<Ju.b> f38664j;

        /* renamed from: k, reason: collision with root package name */
        U f38665k;

        @Override // io.reactivex.s
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f38665k;
                    if (u10 == null) {
                        return;
                    }
                    this.f38665k = null;
                    this.f27260c.offer(u10);
                    this.f27262e = true;
                    if (a()) {
                        av.q.c(this.f27260c, this.f27259b, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.f38665k;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        b(io.reactivex.s<? super U> sVar, Callable<U> callable, Callable<? extends io.reactivex.q<B>> callable2) {
            super(sVar, new Wu.a());
            this.f38664j = new AtomicReference<>();
            this.f38661g = callable;
            this.f38662h = callable2;
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f27261d) {
                return;
            }
            this.f27261d = true;
            this.f38663i.dispose();
            f();
            if (a()) {
                this.f27260c.clear();
            }
        }

        @Override // Pu.r, av.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            this.f27259b.onNext(u10);
        }

        void f() {
            Mu.d.a(this.f38664j);
        }

        void g() {
            try {
                U u10 = (U) Nu.b.e(this.f38661g.call(), "The buffer supplied is null");
                try {
                    io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38662h.call(), "The boundary ObservableSource supplied is null");
                    a aVar = new a(this);
                    if (Mu.d.e(this.f38664j, aVar)) {
                        synchronized (this) {
                            try {
                                U u11 = this.f38665k;
                                if (u11 == null) {
                                    return;
                                }
                                this.f38665k = u10;
                                qVar.subscribe(aVar);
                                c(u11, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    this.f27261d = true;
                    this.f38663i.dispose();
                    this.f27259b.onError(th3);
                }
            } catch (Throwable th4) {
                Ku.a.b(th4);
                dispose();
                this.f27259b.onError(th4);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f27261d;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38663i, bVar)) {
                this.f38663i = bVar;
                io.reactivex.s<? super V> sVar = this.f27259b;
                try {
                    this.f38665k = (U) Nu.b.e(this.f38661g.call(), "The buffer supplied is null");
                    try {
                        io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38662h.call(), "The boundary ObservableSource supplied is null");
                        a aVar = new a(this);
                        this.f38664j.set(aVar);
                        sVar.onSubscribe(this);
                        if (this.f27261d) {
                            return;
                        }
                        qVar.subscribe(aVar);
                    } catch (Throwable th2) {
                        Ku.a.b(th2);
                        this.f27261d = true;
                        bVar.dispose();
                        Mu.e.m(th2, sVar);
                    }
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    this.f27261d = true;
                    bVar.dispose();
                    Mu.e.m(th3, sVar);
                }
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            dispose();
            this.f27259b.onError(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        this.f38360a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f38658c, this.f38657b));
    }

    public C5414n(io.reactivex.q<T> qVar, Callable<? extends io.reactivex.q<B>> callable, Callable<U> callable2) {
        super(qVar);
        this.f38657b = callable;
        this.f38658c = callable2;
    }
}
