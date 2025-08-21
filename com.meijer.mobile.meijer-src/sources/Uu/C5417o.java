package Uu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: Uu.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5417o<T, U extends Collection<? super T>, B> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<B> f38674b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<U> f38675c;

    /* renamed from: Uu.o$a */
    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f38676b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38676b.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38676b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            this.f38676b.f();
        }

        a(b<T, U, B> bVar) {
            this.f38676b = bVar;
        }
    }

    /* renamed from: Uu.o$b */
    static final class b<T, U extends Collection<? super T>, B> extends Pu.r<T, U, U> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f38677g;

        /* renamed from: h, reason: collision with root package name */
        final io.reactivex.q<B> f38678h;

        /* renamed from: i, reason: collision with root package name */
        Ju.b f38679i;

        /* renamed from: j, reason: collision with root package name */
        Ju.b f38680j;

        /* renamed from: k, reason: collision with root package name */
        U f38681k;

        @Override // io.reactivex.s
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f38681k;
                    if (u10 == null) {
                        return;
                    }
                    this.f38681k = null;
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
                    U u10 = this.f38681k;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        b(io.reactivex.s<? super U> sVar, Callable<U> callable, io.reactivex.q<B> qVar) {
            super(sVar, new Wu.a());
            this.f38677g = callable;
            this.f38678h = qVar;
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f27261d) {
                return;
            }
            this.f27261d = true;
            this.f38680j.dispose();
            this.f38679i.dispose();
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
            try {
                U u10 = (U) Nu.b.e(this.f38677g.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u11 = this.f38681k;
                        if (u11 == null) {
                            return;
                        }
                        this.f38681k = u10;
                        c(u11, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                dispose();
                this.f27259b.onError(th3);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f27261d;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38679i, bVar)) {
                this.f38679i = bVar;
                try {
                    this.f38681k = (U) Nu.b.e(this.f38677g.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f38680j = aVar;
                    this.f27259b.onSubscribe(this);
                    if (this.f27261d) {
                        return;
                    }
                    this.f38678h.subscribe(aVar);
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    this.f27261d = true;
                    bVar.dispose();
                    Mu.e.m(th2, this.f27259b);
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
        this.f38360a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f38675c, this.f38674b));
    }

    public C5417o(io.reactivex.q<T> qVar, io.reactivex.q<B> qVar2, Callable<U> callable) {
        super(qVar);
        this.f38674b = qVar2;
        this.f38675c = callable;
    }
}
