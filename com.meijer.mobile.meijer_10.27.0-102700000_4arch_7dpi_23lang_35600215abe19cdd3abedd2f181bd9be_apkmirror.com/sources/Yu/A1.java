package Yu;

import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class A1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f40537b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f40538c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f40539d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.q<? extends T> f40540e;

    static final class a<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40541a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Nu.b> f40542b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40541a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40541a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40541a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.e(this.f40542b, bVar);
        }

        a(io.reactivex.s<? super T> sVar, AtomicReference<Nu.b> atomicReference) {
            this.f40541a = sVar;
            this.f40542b = atomicReference;
        }
    }

    static final class b<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40543a;

        /* renamed from: b, reason: collision with root package name */
        final long f40544b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f40545c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f40546d;

        /* renamed from: e, reason: collision with root package name */
        final Qu.h f40547e = new Qu.h();

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f40548f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<Nu.b> f40549g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        io.reactivex.q<? extends T> f40550h;

        @Override // Yu.A1.d
        public void b(long j10) {
            if (this.f40548f.compareAndSet(j10, Long.MAX_VALUE)) {
                Qu.d.a(this.f40549g);
                io.reactivex.q<? extends T> qVar = this.f40550h;
                this.f40550h = null;
                qVar.subscribe(new a(this.f40543a, this));
                this.f40546d.dispose();
            }
        }

        void c(long j10) {
            this.f40547e.a(this.f40546d.c(new e(j10, this), this.f40544b, this.f40545c));
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f40549g);
            Qu.d.a(this);
            this.f40546d.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40548f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f40547e.dispose();
                this.f40543a.onComplete();
                this.f40546d.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40548f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C14313a.s(th2);
                return;
            }
            this.f40547e.dispose();
            this.f40543a.onError(th2);
            this.f40546d.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = this.f40548f.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f40548f.compareAndSet(j10, j11)) {
                    this.f40547e.get().dispose();
                    this.f40543a.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40549g, bVar);
        }

        b(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar, io.reactivex.q<? extends T> qVar) {
            this.f40543a = sVar;
            this.f40544b = j10;
            this.f40545c = timeUnit;
            this.f40546d = cVar;
            this.f40550h = qVar;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.s<T>, Nu.b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40551a;

        /* renamed from: b, reason: collision with root package name */
        final long f40552b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f40553c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f40554d;

        /* renamed from: e, reason: collision with root package name */
        final Qu.h f40555e = new Qu.h();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<Nu.b> f40556f = new AtomicReference<>();

        void c(long j10) {
            this.f40555e.a(this.f40554d.c(new e(j10, this), this.f40552b, this.f40553c));
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f40556f);
            this.f40554d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f40556f.get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40556f, bVar);
        }

        c(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar) {
            this.f40551a = sVar;
            this.f40552b = j10;
            this.f40553c = timeUnit;
            this.f40554d = cVar;
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.f40555e.get().dispose();
                    this.f40551a.onNext(t10);
                    c(j11);
                }
            }
        }

        @Override // Yu.A1.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                Qu.d.a(this.f40556f);
                this.f40551a.onError(new TimeoutException(ev.j.c(this.f40552b, this.f40553c)));
                this.f40554d.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f40555e.dispose();
                this.f40551a.onComplete();
                this.f40554d.dispose();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f40555e.dispose();
                this.f40551a.onError(th2);
                this.f40554d.dispose();
                return;
            }
            C14313a.s(th2);
        }
    }

    interface d {
        void b(long j10);
    }

    static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final d f40557a;

        /* renamed from: b, reason: collision with root package name */
        final long f40558b;

        @Override // java.lang.Runnable
        public void run() {
            this.f40557a.b(this.f40558b);
        }

        e(long j10, d dVar) {
            this.f40558b = j10;
            this.f40557a = dVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        if (this.f40540e == null) {
            c cVar = new c(sVar, this.f40537b, this.f40538c, this.f40539d.b());
            sVar.onSubscribe(cVar);
            cVar.c(0L);
            this.f41135a.subscribe(cVar);
            return;
        }
        b bVar = new b(sVar, this.f40537b, this.f40538c, this.f40539d.b(), this.f40540e);
        sVar.onSubscribe(bVar);
        bVar.c(0L);
        this.f41135a.subscribe(bVar);
    }

    public A1(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, io.reactivex.q<? extends T> qVar) {
        super(lVar);
        this.f40537b = j10;
        this.f40538c = timeUnit;
        this.f40539d = tVar;
        this.f40540e = qVar;
    }
}
