package Yu;

import av.C6157a;
import gv.C14313a;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5475n<T, U extends Collection<? super T>, B> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<B>> f41432b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<U> f41433c;

    /* renamed from: Yu.n$a */
    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f41434b;

        /* renamed from: c, reason: collision with root package name */
        boolean f41435c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41435c) {
                return;
            }
            this.f41435c = true;
            this.f41434b.g();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41435c) {
                C14313a.s(th2);
            } else {
                this.f41435c = true;
                this.f41434b.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            if (this.f41435c) {
                return;
            }
            this.f41435c = true;
            dispose();
            this.f41434b.g();
        }

        a(b<T, U, B> bVar) {
            this.f41434b = bVar;
        }
    }

    /* renamed from: Yu.n$b */
    static final class b<T, U extends Collection<? super T>, B> extends Tu.r<T, U, U> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f41436g;

        /* renamed from: h, reason: collision with root package name */
        final Callable<? extends io.reactivex.q<B>> f41437h;

        /* renamed from: i, reason: collision with root package name */
        Nu.b f41438i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference<Nu.b> f41439j;

        /* renamed from: k, reason: collision with root package name */
        U f41440k;

        @Override // io.reactivex.s
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f41440k;
                    if (u10 == null) {
                        return;
                    }
                    this.f41440k = null;
                    this.f35488c.offer(u10);
                    this.f35490e = true;
                    if (a()) {
                        ev.q.c(this.f35488c, this.f35487b, false, this, this);
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
                    U u10 = this.f41440k;
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
            super(sVar, new C6157a());
            this.f41439j = new AtomicReference<>();
            this.f41436g = callable;
            this.f41437h = callable2;
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f35489d) {
                return;
            }
            this.f35489d = true;
            this.f41438i.dispose();
            f();
            if (a()) {
                this.f35488c.clear();
            }
        }

        @Override // Tu.r, ev.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void F(io.reactivex.s<? super U> sVar, U u10) {
            this.f35487b.onNext(u10);
        }

        void f() {
            Qu.d.a(this.f41439j);
        }

        void g() {
            try {
                U u10 = (U) Ru.b.e(this.f41436g.call(), "The buffer supplied is null");
                try {
                    io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41437h.call(), "The boundary ObservableSource supplied is null");
                    a aVar = new a(this);
                    if (Qu.d.e(this.f41439j, aVar)) {
                        synchronized (this) {
                            try {
                                U u11 = this.f41440k;
                                if (u11 == null) {
                                    return;
                                }
                                this.f41440k = u10;
                                qVar.subscribe(aVar);
                                c(u11, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    this.f35489d = true;
                    this.f41438i.dispose();
                    this.f35487b.onError(th3);
                }
            } catch (Throwable th4) {
                Ou.a.b(th4);
                dispose();
                this.f35487b.onError(th4);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f35489d;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41438i, bVar)) {
                this.f41438i = bVar;
                io.reactivex.s<? super V> sVar = this.f35487b;
                try {
                    this.f41440k = (U) Ru.b.e(this.f41436g.call(), "The buffer supplied is null");
                    try {
                        io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41437h.call(), "The boundary ObservableSource supplied is null");
                        a aVar = new a(this);
                        this.f41439j.set(aVar);
                        sVar.onSubscribe(this);
                        if (this.f35489d) {
                            return;
                        }
                        qVar.subscribe(aVar);
                    } catch (Throwable th2) {
                        Ou.a.b(th2);
                        this.f35489d = true;
                        bVar.dispose();
                        Qu.e.m(th2, sVar);
                    }
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    this.f35489d = true;
                    bVar.dispose();
                    Qu.e.m(th3, sVar);
                }
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            dispose();
            this.f35487b.onError(th2);
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        this.f41135a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f41433c, this.f41432b));
    }

    public C5475n(io.reactivex.q<T> qVar, Callable<? extends io.reactivex.q<B>> callable, Callable<U> callable2) {
        super(qVar);
        this.f41432b = callable;
        this.f41433c = callable2;
    }
}
