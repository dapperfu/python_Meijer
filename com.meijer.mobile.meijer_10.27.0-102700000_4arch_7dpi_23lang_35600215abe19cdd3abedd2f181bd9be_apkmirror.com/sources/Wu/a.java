package Wu;

import Nu.b;
import Qu.d;
import Tu.k;
import io.reactivex.i;
import io.reactivex.l;
import io.reactivex.s;

/* loaded from: classes9.dex */
public final class a<T> extends l<T> {

    /* renamed from: Wu.a$a, reason: collision with other inner class name */
    static final class C0837a<T> extends k<T> implements i<T> {

        /* renamed from: c, reason: collision with root package name */
        b f39022c;

        @Override // io.reactivex.i
        public void onSubscribe(b bVar) {
            if (d.t(this.f39022c, bVar)) {
                this.f39022c = bVar;
                this.f35465a.onSubscribe(this);
            }
        }

        C0837a(s<? super T> sVar) {
            super(sVar);
        }

        @Override // Tu.k, Nu.b
        public void dispose() {
            super.dispose();
            this.f39022c.dispose();
        }

        @Override // io.reactivex.i
        public void onComplete() {
            b();
        }

        @Override // io.reactivex.i
        public void onError(Throwable th2) {
            d(th2);
        }

        @Override // io.reactivex.i
        public void onSuccess(T t10) {
            c(t10);
        }
    }

    public static <T> i<T> c(s<? super T> sVar) {
        return new C0837a(sVar);
    }
}
