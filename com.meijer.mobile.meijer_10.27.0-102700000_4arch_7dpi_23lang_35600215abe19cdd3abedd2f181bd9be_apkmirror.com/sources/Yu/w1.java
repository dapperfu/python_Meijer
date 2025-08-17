package Yu;

import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class w1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f41735b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f41736c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f41737d;

    static final class a<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41738a;

        /* renamed from: b, reason: collision with root package name */
        final long f41739b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f41740c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f41741d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f41742e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f41743f;

        /* renamed from: g, reason: collision with root package name */
        boolean f41744g;

        @Override // java.lang.Runnable
        public void run() {
            this.f41743f = false;
        }

        @Override // Nu.b
        public void dispose() {
            this.f41742e.dispose();
            this.f41741d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41741d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41744g) {
                return;
            }
            this.f41744g = true;
            this.f41738a.onComplete();
            this.f41741d.dispose();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41744g) {
                C14313a.s(th2);
                return;
            }
            this.f41744g = true;
            this.f41738a.onError(th2);
            this.f41741d.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41743f || this.f41744g) {
                return;
            }
            this.f41743f = true;
            this.f41738a.onNext(t10);
            Nu.b bVar = get();
            if (bVar != null) {
                bVar.dispose();
            }
            Qu.d.e(this, this.f41741d.c(this, this.f41739b, this.f41740c));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41742e, bVar)) {
                this.f41742e = bVar;
                this.f41738a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar) {
            this.f41738a = sVar;
            this.f41739b = j10;
            this.f41740c = timeUnit;
            this.f41741d = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(new io.reactivex.observers.f(sVar), this.f41735b, this.f41736c, this.f41737d.b()));
    }

    public w1(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        super(qVar);
        this.f41735b = j10;
        this.f41736c = timeUnit;
        this.f41737d = tVar;
    }
}
