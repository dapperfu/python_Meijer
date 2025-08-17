package Zu;

import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class j<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f43310a;

    /* renamed from: b, reason: collision with root package name */
    final t f43311b;

    static final class a<T> extends AtomicReference<Nu.b> implements w<T>, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f43312a;

        /* renamed from: b, reason: collision with root package name */
        final Qu.h f43313b = new Qu.h();

        /* renamed from: c, reason: collision with root package name */
        final y<? extends T> f43314c;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f43312a.onError(th2);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f43312a.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f43314c.a(this);
        }

        a(w<? super T> wVar, y<? extends T> yVar) {
            this.f43312a = wVar;
            this.f43314c = yVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
            this.f43313b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this, bVar);
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        a aVar = new a(wVar, this.f43310a);
        wVar.onSubscribe(aVar);
        aVar.f43313b.a(this.f43311b.d(aVar));
    }

    public j(y<? extends T> yVar, t tVar) {
        this.f43310a = yVar;
        this.f43311b = tVar;
    }
}
