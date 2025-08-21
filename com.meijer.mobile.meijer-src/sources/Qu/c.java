package Qu;

import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class c extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.d f31454a;

    /* renamed from: b, reason: collision with root package name */
    final t f31455b;

    static final class a extends AtomicReference<Ju.b> implements io.reactivex.c, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f31456a;

        /* renamed from: b, reason: collision with root package name */
        final t f31457b;

        /* renamed from: c, reason: collision with root package name */
        Throwable f31458c;

        @Override // io.reactivex.c, io.reactivex.i
        public void onComplete() {
            Mu.d.e(this, this.f31457b.d(this));
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f31458c = th2;
            Mu.d.e(this, this.f31457b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f31458c;
            if (th2 == null) {
                this.f31456a.onComplete();
            } else {
                this.f31458c = null;
                this.f31456a.onError(th2);
            }
        }

        a(io.reactivex.c cVar, t tVar) {
            this.f31456a = cVar;
            this.f31457b = tVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this, bVar)) {
                this.f31456a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        this.f31454a.a(new a(cVar, this.f31455b));
    }

    public c(io.reactivex.d dVar, t tVar) {
        this.f31454a = dVar;
        this.f31455b = tVar;
    }
}
