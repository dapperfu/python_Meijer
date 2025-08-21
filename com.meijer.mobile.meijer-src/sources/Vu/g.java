package Vu;

import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class g<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<T> f40471a;

    /* renamed from: b, reason: collision with root package name */
    final t f40472b;

    static final class a<T> extends AtomicReference<Ju.b> implements w<T>, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f40473a;

        /* renamed from: b, reason: collision with root package name */
        final t f40474b;

        /* renamed from: c, reason: collision with root package name */
        T f40475c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f40476d;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f40476d = th2;
            Mu.d.e(this, this.f40474b.d(this));
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f40475c = t10;
            Mu.d.e(this, this.f40474b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f40476d;
            if (th2 != null) {
                this.f40473a.onError(th2);
            } else {
                this.f40473a.onSuccess(this.f40475c);
            }
        }

        a(w<? super T> wVar, t tVar) {
            this.f40473a = wVar;
            this.f40474b = tVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this, bVar)) {
                this.f40473a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f40471a.a(new a(wVar, this.f40472b));
    }

    public g(y<T> yVar, t tVar) {
        this.f40471a = yVar;
        this.f40472b = tVar;
    }
}
