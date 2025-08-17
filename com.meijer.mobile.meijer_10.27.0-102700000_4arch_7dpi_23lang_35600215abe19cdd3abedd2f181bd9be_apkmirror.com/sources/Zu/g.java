package Zu;

import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class g<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<T> f43295a;

    /* renamed from: b, reason: collision with root package name */
    final t f43296b;

    static final class a<T> extends AtomicReference<Nu.b> implements w<T>, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f43297a;

        /* renamed from: b, reason: collision with root package name */
        final t f43298b;

        /* renamed from: c, reason: collision with root package name */
        T f43299c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f43300d;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f43300d = th2;
            Qu.d.e(this, this.f43298b.d(this));
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f43299c = t10;
            Qu.d.e(this, this.f43298b.d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f43300d;
            if (th2 != null) {
                this.f43297a.onError(th2);
            } else {
                this.f43297a.onSuccess(this.f43299c);
            }
        }

        a(w<? super T> wVar, t tVar) {
            this.f43297a = wVar;
            this.f43298b = tVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar)) {
                this.f43297a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f43295a.a(new a(wVar, this.f43296b));
    }

    public g(y<T> yVar, t tVar) {
        this.f43295a = yVar;
        this.f43296b = tVar;
    }
}
