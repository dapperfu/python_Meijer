package Yu;

import fv.AbstractC14143a;
import gv.C14313a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class P0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC14143a<T> f40937a;

    /* renamed from: b, reason: collision with root package name */
    final int f40938b;

    /* renamed from: c, reason: collision with root package name */
    final long f40939c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f40940d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f40941e;

    /* renamed from: f, reason: collision with root package name */
    a f40942f;

    static final class a extends AtomicReference<Nu.b> implements Runnable, Pu.g<Nu.b> {

        /* renamed from: a, reason: collision with root package name */
        final P0<?> f40943a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f40944b;

        /* renamed from: c, reason: collision with root package name */
        long f40945c;

        /* renamed from: d, reason: collision with root package name */
        boolean f40946d;

        /* renamed from: e, reason: collision with root package name */
        boolean f40947e;

        @Override // java.lang.Runnable
        public void run() {
            this.f40943a.g(this);
        }

        a(P0<?> p02) {
            this.f40943a = p02;
        }

        @Override // Pu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Nu.b bVar) throws Exception {
            Qu.d.e(this, bVar);
            synchronized (this.f40943a) {
                try {
                    if (this.f40947e) {
                        ((Qu.g) this.f40943a.f40937a).b(bVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40948a;

        /* renamed from: b, reason: collision with root package name */
        final P0<T> f40949b;

        /* renamed from: c, reason: collision with root package name */
        final a f40950c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f40951d;

        @Override // io.reactivex.s
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f40949b.f(this.f40950c);
                this.f40948a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                C14313a.s(th2);
            } else {
                this.f40949b.f(this.f40950c);
                this.f40948a.onError(th2);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f40951d.dispose();
            if (compareAndSet(false, true)) {
                this.f40949b.c(this.f40950c);
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40951d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40948a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40951d, bVar)) {
                this.f40951d = bVar;
                this.f40948a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super T> sVar, P0<T> p02, a aVar) {
            this.f40948a = sVar;
            this.f40949b = p02;
            this.f40950c = aVar;
        }
    }

    public P0(AbstractC14143a<T> abstractC14143a) {
        this(abstractC14143a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    void c(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f40942f;
                if (aVar2 != null && aVar2 == aVar) {
                    long j10 = aVar.f40945c - 1;
                    aVar.f40945c = j10;
                    if (j10 == 0 && aVar.f40946d) {
                        if (this.f40939c == 0) {
                            g(aVar);
                            return;
                        }
                        Qu.h hVar = new Qu.h();
                        aVar.f40944b = hVar;
                        hVar.a(this.f40941e.e(aVar, this.f40939c, this.f40940d));
                    }
                }
            } finally {
            }
        }
    }

    void f(a aVar) {
        synchronized (this) {
            try {
                if (this.f40937a instanceof I0) {
                    a aVar2 = this.f40942f;
                    if (aVar2 != null && aVar2 == aVar) {
                        this.f40942f = null;
                        d(aVar);
                    }
                    long j10 = aVar.f40945c - 1;
                    aVar.f40945c = j10;
                    if (j10 == 0) {
                        e(aVar);
                    }
                } else {
                    a aVar3 = this.f40942f;
                    if (aVar3 != null && aVar3 == aVar) {
                        d(aVar);
                        long j11 = aVar.f40945c - 1;
                        aVar.f40945c = j11;
                        if (j11 == 0) {
                            this.f40942f = null;
                            e(aVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void g(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f40945c == 0 && aVar == this.f40942f) {
                    this.f40942f = null;
                    Nu.b bVar = aVar.get();
                    Qu.d.a(aVar);
                    AbstractC14143a<T> abstractC14143a = this.f40937a;
                    if (abstractC14143a instanceof Nu.b) {
                        ((Nu.b) abstractC14143a).dispose();
                    } else if (abstractC14143a instanceof Qu.g) {
                        if (bVar == null) {
                            aVar.f40947e = true;
                        } else {
                            ((Qu.g) abstractC14143a).b(bVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar;
        boolean z10;
        Nu.b bVar;
        synchronized (this) {
            try {
                aVar = this.f40942f;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f40942f = aVar;
                }
                long j10 = aVar.f40945c;
                if (j10 == 0 && (bVar = aVar.f40944b) != null) {
                    bVar.dispose();
                }
                long j11 = j10 + 1;
                aVar.f40945c = j11;
                if (aVar.f40946d || j11 != this.f40938b) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f40946d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f40937a.subscribe(new b(sVar, this, aVar));
        if (z10) {
            this.f40937a.c(aVar);
        }
    }

    public P0(AbstractC14143a<T> abstractC14143a, int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f40937a = abstractC14143a;
        this.f40938b = i10;
        this.f40939c = j10;
        this.f40940d = timeUnit;
        this.f40941e = tVar;
    }

    void d(a aVar) {
        Nu.b bVar = aVar.f40944b;
        if (bVar != null) {
            bVar.dispose();
            aVar.f40944b = null;
        }
    }

    void e(a aVar) {
        AbstractC14143a<T> abstractC14143a = this.f40937a;
        if (abstractC14143a instanceof Nu.b) {
            ((Nu.b) abstractC14143a).dispose();
        } else if (abstractC14143a instanceof Qu.g) {
            ((Qu.g) abstractC14143a).b(aVar.get());
        }
    }
}
