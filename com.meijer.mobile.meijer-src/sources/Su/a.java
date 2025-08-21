package Su;

import Ju.b;
import Mu.d;
import Pu.k;
import io.reactivex.i;
import io.reactivex.l;
import io.reactivex.s;

/* loaded from: classes10.dex */
public final class a<T> extends l<T> {

    /* renamed from: Su.a$a, reason: collision with other inner class name */
    static final class C0791a<T> extends k<T> implements i<T> {

        /* renamed from: c, reason: collision with root package name */
        b f35807c;

        @Override // io.reactivex.i
        public void onSubscribe(b bVar) {
            if (d.t(this.f35807c, bVar)) {
                this.f35807c = bVar;
                this.f27237a.onSubscribe(this);
            }
        }

        C0791a(s<? super T> sVar) {
            super(sVar);
        }

        @Override // Pu.k, Ju.b
        public void dispose() {
            super.dispose();
            this.f35807c.dispose();
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
        return new C0791a(sVar);
    }
}
