package Uu;

import Qu.h;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class e extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.d f36347a;

    /* renamed from: b, reason: collision with root package name */
    final t f36348b;

    static final class a extends AtomicReference<Nu.b> implements io.reactivex.c, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f36349a;

        /* renamed from: b, reason: collision with root package name */
        final h f36350b = new h();

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.d f36351c;

        @Override // io.reactivex.c, io.reactivex.i
        public void onComplete() {
            this.f36349a.onComplete();
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f36349a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36351c.a(this);
        }

        a(io.reactivex.c cVar, io.reactivex.d dVar) {
            this.f36349a = cVar;
            this.f36351c = dVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
            this.f36350b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        a aVar = new a(cVar, this.f36347a);
        cVar.onSubscribe(aVar);
        aVar.f36350b.a(this.f36348b.d(aVar));
    }

    public e(io.reactivex.d dVar, t tVar) {
        this.f36347a = dVar;
        this.f36348b = tVar;
    }
}
