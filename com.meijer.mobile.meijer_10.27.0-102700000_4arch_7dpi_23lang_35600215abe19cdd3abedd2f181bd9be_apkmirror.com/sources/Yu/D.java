package Yu;

import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class D<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f40593b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f40594c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f40595d;

    static final class a<T> extends AtomicReference<Nu.b> implements Runnable, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final T f40596a;

        /* renamed from: b, reason: collision with root package name */
        final long f40597b;

        /* renamed from: c, reason: collision with root package name */
        final b<T> f40598c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f40599d = new AtomicBoolean();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40599d.compareAndSet(false, true)) {
                this.f40598c.a(this.f40597b, this.f40596a, this);
            }
        }

        a(T t10, long j10, b<T> bVar) {
            this.f40596a = t10;
            this.f40597b = j10;
            this.f40598c = bVar;
        }

        public void a(Nu.b bVar) {
            Qu.d.e(this, bVar);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() == Qu.d.DISPOSED) {
                return true;
            }
            return false;
        }
    }

    static final class b<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40600a;

        /* renamed from: b, reason: collision with root package name */
        final long f40601b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f40602c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f40603d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f40604e;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f40605f;

        /* renamed from: g, reason: collision with root package name */
        volatile long f40606g;

        /* renamed from: h, reason: collision with root package name */
        boolean f40607h;

        void a(long j10, T t10, a<T> aVar) {
            if (j10 == this.f40606g) {
                this.f40600a.onNext(t10);
                aVar.dispose();
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f40604e.dispose();
            this.f40603d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40603d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40607h) {
                return;
            }
            this.f40607h = true;
            Nu.b bVar = this.f40605f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = (a) bVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f40600a.onComplete();
            this.f40603d.dispose();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40607h) {
                C14313a.s(th2);
                return;
            }
            Nu.b bVar = this.f40605f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f40607h = true;
            this.f40600a.onError(th2);
            this.f40603d.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40607h) {
                return;
            }
            long j10 = this.f40606g + 1;
            this.f40606g = j10;
            Nu.b bVar = this.f40605f;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar = new a(t10, j10, this);
            this.f40605f = aVar;
            aVar.a(this.f40603d.c(aVar, this.f40601b, this.f40602c));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40604e, bVar)) {
                this.f40604e = bVar;
                this.f40600a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar) {
            this.f40600a = sVar;
            this.f40601b = j10;
            this.f40602c = timeUnit;
            this.f40603d = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new b(new io.reactivex.observers.f(sVar), this.f40593b, this.f40594c, this.f40595d.b()));
    }

    public D(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        super(qVar);
        this.f40593b = j10;
        this.f40594c = timeUnit;
        this.f40595d = tVar;
    }
}
