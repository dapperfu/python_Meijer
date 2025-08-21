package Uu;

import bv.AbstractC6411a;
import cv.C13558a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class P0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC6411a<T> f38162a;

    /* renamed from: b, reason: collision with root package name */
    final int f38163b;

    /* renamed from: c, reason: collision with root package name */
    final long f38164c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f38165d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f38166e;

    /* renamed from: f, reason: collision with root package name */
    a f38167f;

    static final class a extends AtomicReference<Ju.b> implements Runnable, Lu.g<Ju.b> {

        /* renamed from: a, reason: collision with root package name */
        final P0<?> f38168a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f38169b;

        /* renamed from: c, reason: collision with root package name */
        long f38170c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38171d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38172e;

        @Override // java.lang.Runnable
        public void run() {
            this.f38168a.g(this);
        }

        a(P0<?> p02) {
            this.f38168a = p02;
        }

        @Override // Lu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Ju.b bVar) throws Exception {
            Mu.d.e(this, bVar);
            synchronized (this.f38168a) {
                try {
                    if (this.f38172e) {
                        ((Mu.g) this.f38168a.f38162a).a(bVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38173a;

        /* renamed from: b, reason: collision with root package name */
        final P0<T> f38174b;

        /* renamed from: c, reason: collision with root package name */
        final a f38175c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38176d;

        @Override // io.reactivex.s
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f38174b.f(this.f38175c);
                this.f38173a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                C13558a.s(th2);
            } else {
                this.f38174b.f(this.f38175c);
                this.f38173a.onError(th2);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f38176d.dispose();
            if (compareAndSet(false, true)) {
                this.f38174b.c(this.f38175c);
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38176d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38173a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38176d, bVar)) {
                this.f38176d = bVar;
                this.f38173a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super T> sVar, P0<T> p02, a aVar) {
            this.f38173a = sVar;
            this.f38174b = p02;
            this.f38175c = aVar;
        }
    }

    public P0(AbstractC6411a<T> abstractC6411a) {
        this(abstractC6411a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    void c(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f38167f;
                if (aVar2 != null && aVar2 == aVar) {
                    long j10 = aVar.f38170c - 1;
                    aVar.f38170c = j10;
                    if (j10 == 0 && aVar.f38171d) {
                        if (this.f38164c == 0) {
                            g(aVar);
                            return;
                        }
                        Mu.h hVar = new Mu.h();
                        aVar.f38169b = hVar;
                        hVar.a(this.f38166e.e(aVar, this.f38164c, this.f38165d));
                    }
                }
            } finally {
            }
        }
    }

    void f(a aVar) {
        synchronized (this) {
            try {
                if (this.f38162a instanceof I0) {
                    a aVar2 = this.f38167f;
                    if (aVar2 != null && aVar2 == aVar) {
                        this.f38167f = null;
                        d(aVar);
                    }
                    long j10 = aVar.f38170c - 1;
                    aVar.f38170c = j10;
                    if (j10 == 0) {
                        e(aVar);
                    }
                } else {
                    a aVar3 = this.f38167f;
                    if (aVar3 != null && aVar3 == aVar) {
                        d(aVar);
                        long j11 = aVar.f38170c - 1;
                        aVar.f38170c = j11;
                        if (j11 == 0) {
                            this.f38167f = null;
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
                if (aVar.f38170c == 0 && aVar == this.f38167f) {
                    this.f38167f = null;
                    Ju.b bVar = aVar.get();
                    Mu.d.a(aVar);
                    AbstractC6411a<T> abstractC6411a = this.f38162a;
                    if (abstractC6411a instanceof Ju.b) {
                        ((Ju.b) abstractC6411a).dispose();
                    } else if (abstractC6411a instanceof Mu.g) {
                        if (bVar == null) {
                            aVar.f38172e = true;
                        } else {
                            ((Mu.g) abstractC6411a).a(bVar);
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
        Ju.b bVar;
        synchronized (this) {
            try {
                aVar = this.f38167f;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f38167f = aVar;
                }
                long j10 = aVar.f38170c;
                if (j10 == 0 && (bVar = aVar.f38169b) != null) {
                    bVar.dispose();
                }
                long j11 = j10 + 1;
                aVar.f38170c = j11;
                if (aVar.f38171d || j11 != this.f38163b) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f38171d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38162a.subscribe(new b(sVar, this, aVar));
        if (z10) {
            this.f38162a.c(aVar);
        }
    }

    public P0(AbstractC6411a<T> abstractC6411a, int i10, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f38162a = abstractC6411a;
        this.f38163b = i10;
        this.f38164c = j10;
        this.f38165d = timeUnit;
        this.f38166e = tVar;
    }

    void d(a aVar) {
        Ju.b bVar = aVar.f38169b;
        if (bVar != null) {
            bVar.dispose();
            aVar.f38169b = null;
        }
    }

    void e(a aVar) {
        AbstractC6411a<T> abstractC6411a = this.f38162a;
        if (abstractC6411a instanceof Ju.b) {
            ((Ju.b) abstractC6411a).dispose();
        } else if (abstractC6411a instanceof Mu.g) {
            ((Mu.g) abstractC6411a).a(aVar.get());
        }
    }
}
