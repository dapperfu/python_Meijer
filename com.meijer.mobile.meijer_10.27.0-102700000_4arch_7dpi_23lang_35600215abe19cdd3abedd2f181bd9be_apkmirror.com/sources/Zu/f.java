package Zu;

import Pu.o;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes9.dex */
public final class f<T, R> extends u<R> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f43291a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends R> f43292b;

    static final class a<T, R> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final w<? super R> f43293a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends R> f43294b;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            this.f43293a.onError(th2);
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            this.f43293a.onSubscribe(bVar);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            try {
                this.f43293a.onSuccess(Ru.b.e(this.f43294b.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                Ou.a.b(th2);
                onError(th2);
            }
        }

        a(w<? super R> wVar, o<? super T, ? extends R> oVar) {
            this.f43293a = wVar;
            this.f43294b = oVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super R> wVar) {
        this.f43291a.a(new a(wVar, this.f43292b));
    }

    public f(y<? extends T> yVar, o<? super T, ? extends R> oVar) {
        this.f43291a = yVar;
        this.f43292b = oVar;
    }
}
