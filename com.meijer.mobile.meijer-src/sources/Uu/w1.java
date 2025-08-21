package Uu;

import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class w1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38960b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f38961c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f38962d;

    static final class a<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38963a;

        /* renamed from: b, reason: collision with root package name */
        final long f38964b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f38965c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f38966d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f38967e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f38968f;

        /* renamed from: g, reason: collision with root package name */
        boolean f38969g;

        @Override // java.lang.Runnable
        public void run() {
            this.f38968f = false;
        }

        @Override // Ju.b
        public void dispose() {
            this.f38967e.dispose();
            this.f38966d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38966d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38969g) {
                return;
            }
            this.f38969g = true;
            this.f38963a.onComplete();
            this.f38966d.dispose();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38969g) {
                C13558a.s(th2);
                return;
            }
            this.f38969g = true;
            this.f38963a.onError(th2);
            this.f38966d.dispose();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38968f || this.f38969g) {
                return;
            }
            this.f38968f = true;
            this.f38963a.onNext(t10);
            Ju.b bVar = get();
            if (bVar != null) {
                bVar.dispose();
            }
            Mu.d.e(this, this.f38966d.c(this, this.f38964b, this.f38965c));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38967e, bVar)) {
                this.f38967e = bVar;
                this.f38963a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar) {
            this.f38963a = sVar;
            this.f38964b = j10;
            this.f38965c = timeUnit;
            this.f38966d = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(new io.reactivex.observers.f(sVar), this.f38960b, this.f38961c, this.f38962d.b()));
    }

    public w1(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        super(qVar);
        this.f38960b = j10;
        this.f38961c = timeUnit;
        this.f38962d = tVar;
    }
}
