package Uu;

import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class c extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.d f36337a;

    /* renamed from: b, reason: collision with root package name */
    final t f36338b;

    static final class a extends AtomicReference<Nu.b> implements io.reactivex.c, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f36339a;

        /* renamed from: b, reason: collision with root package name */
        final t f36340b;

        /* renamed from: c, reason: collision with root package name */
        Throwable f36341c;

        @Override // io.reactivex.c, io.reactivex.i
        public void onComplete() {
            Qu.d.e(this, this.f36340b.d(this));
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f36341c = th2;
            Qu.d.e(this, this.f36340b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f36341c;
            if (th2 == null) {
                this.f36339a.onComplete();
            } else {
                this.f36341c = null;
                this.f36339a.onError(th2);
            }
        }

        a(io.reactivex.c cVar, t tVar) {
            this.f36339a = cVar;
            this.f36340b = tVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar)) {
                this.f36339a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        this.f36337a.a(new a(cVar, this.f36338b));
    }

    public c(io.reactivex.d dVar, t tVar) {
        this.f36337a = dVar;
        this.f36338b = tVar;
    }
}
