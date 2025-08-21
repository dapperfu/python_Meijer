package Vu;

import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class j<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f40486a;

    /* renamed from: b, reason: collision with root package name */
    final t f40487b;

    static final class a<T> extends AtomicReference<Ju.b> implements w<T>, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f40488a;

        /* renamed from: b, reason: collision with root package name */
        final Mu.h f40489b = new Mu.h();

        /* renamed from: c, reason: collision with root package name */
        final y<? extends T> f40490c;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f40488a.onError(th2);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f40488a.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40490c.a(this);
        }

        a(w<? super T> wVar, y<? extends T> yVar) {
            this.f40488a = wVar;
            this.f40490c = yVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
            this.f40489b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        a aVar = new a(wVar, this.f40486a);
        wVar.onSubscribe(aVar);
        aVar.f40489b.a(this.f40487b.d(aVar));
    }

    public j(y<? extends T> yVar, t tVar) {
        this.f40486a = yVar;
        this.f40487b = tVar;
    }
}
