package Qu;

import Mu.h;
import io.reactivex.t;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class e extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.d f31464a;

    /* renamed from: b, reason: collision with root package name */
    final t f31465b;

    static final class a extends AtomicReference<Ju.b> implements io.reactivex.c, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f31466a;

        /* renamed from: b, reason: collision with root package name */
        final h f31467b = new h();

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.d f31468c;

        @Override // io.reactivex.c, io.reactivex.i
        public void onComplete() {
            this.f31466a.onComplete();
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f31466a.onError(th2);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31468c.a(this);
        }

        a(io.reactivex.c cVar, io.reactivex.d dVar) {
            this.f31466a = cVar;
            this.f31468c = dVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
            this.f31467b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        a aVar = new a(cVar, this.f31464a);
        cVar.onSubscribe(aVar);
        aVar.f31467b.a(this.f31465b.d(aVar));
    }

    public e(io.reactivex.d dVar, t tVar) {
        this.f31464a = dVar;
        this.f31465b = tVar;
    }
}
