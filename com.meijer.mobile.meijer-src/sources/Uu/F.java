package Uu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class F<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f37866b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f37867c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f37868d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f37869e;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37870a;

        /* renamed from: b, reason: collision with root package name */
        final long f37871b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f37872c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f37873d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f37874e;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f37875f;

        /* renamed from: Uu.F$a$a, reason: collision with other inner class name */
        final class RunnableC0832a implements Runnable {
            RunnableC0832a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f37870a.onComplete();
                } finally {
                    a.this.f37873d.dispose();
                }
            }
        }

        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f37877a;

            b(Throwable th2) {
                this.f37877a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f37870a.onError(this.f37877a);
                } finally {
                    a.this.f37873d.dispose();
                }
            }
        }

        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final T f37879a;

            c(T t10) {
                this.f37879a = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37870a.onNext(this.f37879a);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f37875f.dispose();
            this.f37873d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37873d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37873d.c(new RunnableC0832a(), this.f37871b, this.f37872c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37873d.c(new b(th2), this.f37874e ? this.f37871b : 0L, this.f37872c);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37873d.c(new c(t10), this.f37871b, this.f37872c);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37875f, bVar)) {
                this.f37875f = bVar;
                this.f37870a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar, boolean z10) {
            this.f37870a = sVar;
            this.f37871b = j10;
            this.f37872c = timeUnit;
            this.f37873d = cVar;
            this.f37874e = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(this.f37869e ? sVar : new io.reactivex.observers.f(sVar), this.f37866b, this.f37867c, this.f37868d.b(), this.f37869e));
    }

    public F(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, boolean z10) {
        super(qVar);
        this.f37866b = j10;
        this.f37867c = timeUnit;
        this.f37868d = tVar;
        this.f37869e = z10;
    }
}
