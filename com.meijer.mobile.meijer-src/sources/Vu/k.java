package Vu;

import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes10.dex */
public final class k<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f40491a;

    static final class a<T> extends Pu.k<T> implements w<T> {

        /* renamed from: c, reason: collision with root package name */
        Ju.b f40492c;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f40492c, bVar)) {
                this.f40492c = bVar;
                this.f27237a.onSubscribe(this);
            }
        }

        a(s<? super T> sVar) {
            super(sVar);
        }

        @Override // Pu.k, Ju.b
        public void dispose() {
            super.dispose();
            this.f40492c.dispose();
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            d(th2);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            c(t10);
        }
    }

    public static <T> w<T> c(s<? super T> sVar) {
        return new a(sVar);
    }

    @Override // io.reactivex.l
    public void subscribeActual(s<? super T> sVar) {
        this.f40491a.a(c(sVar));
    }

    public k(y<? extends T> yVar) {
        this.f40491a = yVar;
    }
}
