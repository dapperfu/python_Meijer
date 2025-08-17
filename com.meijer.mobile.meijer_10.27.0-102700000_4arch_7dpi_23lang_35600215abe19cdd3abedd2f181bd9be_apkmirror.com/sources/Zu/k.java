package Zu;

import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes9.dex */
public final class k<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f43315a;

    static final class a<T> extends Tu.k<T> implements w<T> {

        /* renamed from: c, reason: collision with root package name */
        Nu.b f43316c;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f43316c, bVar)) {
                this.f43316c = bVar;
                this.f35465a.onSubscribe(this);
            }
        }

        a(s<? super T> sVar) {
            super(sVar);
        }

        @Override // Tu.k, Nu.b
        public void dispose() {
            super.dispose();
            this.f43316c.dispose();
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
        this.f43315a.a(c(sVar));
    }

    public k(y<? extends T> yVar) {
        this.f43315a = yVar;
    }
}
