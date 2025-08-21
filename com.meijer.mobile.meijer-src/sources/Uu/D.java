package Uu;

import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class D<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f37818b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f37819c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f37820d;

    static final class a<T> extends AtomicReference<Ju.b> implements Runnable, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final T f37821a;

        /* renamed from: b, reason: collision with root package name */
        final long f37822b;

        /* renamed from: c, reason: collision with root package name */
        final b<T> f37823c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f37824d = new AtomicBoolean();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37824d.compareAndSet(false, true)) {
                this.f37823c.a(this.f37822b, this.f37821a, this);
            }
        }

        a(T t10, long j10, b<T> bVar) {
            this.f37821a = t10;
            this.f37822b = j10;
            this.f37823c = bVar;
        }

        public void a(Ju.b bVar) {
            Mu.d.e(this, bVar);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == Mu.d.DISPOSED) {
                return true;
            }
            return false;
        }
    }

    static final class b<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37825a;

        /* renamed from: b, reason: collision with root package name */
        final long f37826b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f37827c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f37828d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f37829e;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f37830f;

        /* renamed from: g, reason: collision with root package name */
        volatile long f37831g;

        /* renamed from: h, reason: collision with root package name */
        boolean f37832h;

        void a(long j10, T t10, a<T> aVar) {
            if (j10 == this.f37831g) {
                this.f37825a.onNext(t10);
                aVar.dispose();
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f37829e.dispose();
            this.f37828d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37828d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37832h) {
                return;
            }
            this.f37832h = true;
            Ju.b bVar = this.f37830f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = (a) bVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f37825a.onComplete();
            this.f37828d.dispose();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37832h) {
                C13558a.s(th2);
                return;
            }
            Ju.b bVar = this.f37830f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f37832h = true;
            this.f37825a.onError(th2);
            this.f37828d.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f37832h) {
                return;
            }
            long j10 = this.f37831g + 1;
            this.f37831g = j10;
            Ju.b bVar = this.f37830f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = new a(t10, j10, this);
            this.f37830f = aVar;
            aVar.a(this.f37828d.c(aVar, this.f37826b, this.f37827c));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37829e, bVar)) {
                this.f37829e = bVar;
                this.f37825a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar) {
            this.f37825a = sVar;
            this.f37826b = j10;
            this.f37827c = timeUnit;
            this.f37828d = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f37818b, this.f37819c, this.f37820d.b()));
    }

    public D(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        super(qVar);
        this.f37818b = j10;
        this.f37819c = timeUnit;
        this.f37820d = tVar;
    }
}
