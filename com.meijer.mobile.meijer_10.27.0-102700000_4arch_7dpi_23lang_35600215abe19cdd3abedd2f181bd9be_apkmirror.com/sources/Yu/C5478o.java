package Yu;

import av.C6157a;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: Yu.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5478o<T, U extends Collection<? super T>, B> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<B> f41449b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<U> f41450c;

    /* renamed from: Yu.o$a */
    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f41451b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41451b.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41451b.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            this.f41451b.f();
        }

        a(b<T, U, B> bVar) {
            this.f41451b = bVar;
        }
    }

    /* renamed from: Yu.o$b */
    static final class b<T, U extends Collection<? super T>, B> extends Tu.r<T, U, U> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f41452g;

        /* renamed from: h, reason: collision with root package name */
        final io.reactivex.q<B> f41453h;

        /* renamed from: i, reason: collision with root package name */
        Nu.b f41454i;

        /* renamed from: j, reason: collision with root package name */
        Nu.b f41455j;

        /* renamed from: k, reason: collision with root package name */
        U f41456k;

        @Override // io.reactivex.s
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f41456k;
                    if (u10 == null) {
                        return;
                    }
                    this.f41456k = null;
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
                    U u10 = this.f41456k;
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
            super(sVar, new C6157a());
            this.f41452g = callable;
            this.f41453h = qVar;
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f35489d) {
                return;
            }
            this.f35489d = true;
            this.f41455j.dispose();
            this.f41454i.dispose();
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
            try {
                U u10 = (U) Ru.b.e(this.f41452g.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u11 = this.f41456k;
                        if (u11 == null) {
                            return;
                        }
                        this.f41456k = u10;
                        c(u11, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                dispose();
                this.f35487b.onError(th3);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f35489d;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41454i, bVar)) {
                this.f41454i = bVar;
                try {
                    this.f41456k = (U) Ru.b.e(this.f41452g.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f41455j = aVar;
                    this.f35487b.onSubscribe(this);
                    if (this.f35489d) {
                        return;
                    }
                    this.f41453h.subscribe(aVar);
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    this.f35489d = true;
                    bVar.dispose();
                    Qu.e.m(th2, this.f35487b);
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
        this.f41135a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f41450c, this.f41449b));
    }

    public C5478o(io.reactivex.q<T> qVar, io.reactivex.q<B> qVar2, Callable<U> callable) {
        super(qVar);
        this.f41449b = qVar2;
        this.f41450c = callable;
    }
}
