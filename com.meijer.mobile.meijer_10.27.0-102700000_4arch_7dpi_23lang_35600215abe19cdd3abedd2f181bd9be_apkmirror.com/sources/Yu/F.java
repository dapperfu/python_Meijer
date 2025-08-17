package Yu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class F<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f40641b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f40642c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f40643d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f40644e;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40645a;

        /* renamed from: b, reason: collision with root package name */
        final long f40646b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f40647c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f40648d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f40649e;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f40650f;

        /* renamed from: Yu.F$a$a, reason: collision with other inner class name */
        final class RunnableC0875a implements Runnable {
            RunnableC0875a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f40645a.onComplete();
                } finally {
                    a.this.f40648d.dispose();
                }
            }
        }

        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f40652a;

            b(Throwable th2) {
                this.f40652a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f40645a.onError(this.f40652a);
                } finally {
                    a.this.f40648d.dispose();
                }
            }
        }

        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final T f40654a;

            c(T t10) {
                this.f40654a = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f40645a.onNext(this.f40654a);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f40650f.dispose();
            this.f40648d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40648d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40648d.c(new RunnableC0875a(), this.f40646b, this.f40647c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40648d.c(new b(th2), this.f40649e ? this.f40646b : 0L, this.f40647c);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40648d.c(new c(t10), this.f40646b, this.f40647c);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40650f, bVar)) {
                this.f40650f = bVar;
                this.f40645a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar, boolean z10) {
            this.f40645a = sVar;
            this.f40646b = j10;
            this.f40647c = timeUnit;
            this.f40648d = cVar;
            this.f40649e = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(this.f40644e ? sVar : new io.reactivex.observers.f(sVar), this.f40641b, this.f40642c, this.f40643d.b(), this.f40644e));
    }

    public F(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, boolean z10) {
        super(qVar);
        this.f40641b = j10;
        this.f40642c = timeUnit;
        this.f40643d = tVar;
        this.f40644e = z10;
    }
}
