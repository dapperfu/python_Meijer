package Zu;

import gv.C14313a;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class b<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<T> f43279a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.a f43280b;

    static final class a<T> extends AtomicInteger implements w<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f43281a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.a f43282b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f43283c;

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f43282b.run();
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    C14313a.s(th2);
                }
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f43283c.dispose();
            a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f43283c.isDisposed();
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f43281a.onError(th2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f43283c, bVar)) {
                this.f43283c = bVar;
                this.f43281a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f43281a.onSuccess(t10);
            a();
        }

        a(w<? super T> wVar, Pu.a aVar) {
            this.f43281a = wVar;
            this.f43282b = aVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f43279a.a(new a(wVar, this.f43280b));
    }

    public b(y<T> yVar, Pu.a aVar) {
        this.f43279a = yVar;
        this.f43280b = aVar;
    }
}
