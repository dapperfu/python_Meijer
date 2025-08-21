package Vu;

import Lu.o;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes10.dex */
public final class f<T, R> extends u<R> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f40467a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends R> f40468b;

    static final class a<T, R> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f40469a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends R> f40470b;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f40469a.onError(th2);
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            this.f40469a.onSubscribe(bVar);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            try {
                this.f40469a.onSuccess(Nu.b.e(this.f40470b.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                Ku.a.b(th2);
                onError(th2);
            }
        }

        a(w<? super R> wVar, o<? super T, ? extends R> oVar) {
            this.f40469a = wVar;
            this.f40470b = oVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super R> wVar) {
        this.f40467a.a(new a(wVar, this.f40468b));
    }

    public f(y<? extends T> yVar, o<? super T, ? extends R> oVar) {
        this.f40467a = yVar;
        this.f40468b = oVar;
    }
}
