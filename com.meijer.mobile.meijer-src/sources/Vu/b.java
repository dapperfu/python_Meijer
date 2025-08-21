package Vu;

import cv.C13558a;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class b<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<T> f40455a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.a f40456b;

    static final class a<T> extends AtomicInteger implements w<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f40457a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.a f40458b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f40459c;

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f40458b.run();
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    C13558a.s(th2);
                }
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f40459c.dispose();
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f40459c.isDisposed();
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f40457a.onError(th2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f40459c, bVar)) {
                this.f40459c = bVar;
                this.f40457a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f40457a.onSuccess(t10);
            a();
        }

        a(w<? super T> wVar, Lu.a aVar) {
            this.f40457a = wVar;
            this.f40458b = aVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f40455a.a(new a(wVar, this.f40456b));
    }

    public b(y<T> yVar, Lu.a aVar) {
        this.f40455a = yVar;
        this.f40456b = aVar;
    }
}
