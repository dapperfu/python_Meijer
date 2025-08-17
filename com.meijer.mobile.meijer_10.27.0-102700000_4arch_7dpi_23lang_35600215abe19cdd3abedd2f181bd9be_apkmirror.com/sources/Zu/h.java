package Zu;

import Pu.o;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes9.dex */
public final class h<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f43301a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Throwable, ? extends T> f43302b;

    /* renamed from: c, reason: collision with root package name */
    final T f43303c;

    final class a implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        private final w<? super T> f43304a;

        a(w<? super T> wVar) {
            this.f43304a = wVar;
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            T tApply;
            h hVar = h.this;
            o<? super Throwable, ? extends T> oVar = hVar.f43302b;
            if (oVar != null) {
                try {
                    tApply = oVar.apply(th2);
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    this.f43304a.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = hVar.f43303c;
            }
            if (tApply != null) {
                this.f43304a.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.f43304a.onError(nullPointerException);
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            this.f43304a.onSubscribe(bVar);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f43304a.onSuccess(t10);
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f43301a.a(new a(wVar));
    }

    public h(y<? extends T> yVar, o<? super Throwable, ? extends T> oVar, T t10) {
        this.f43301a = yVar;
        this.f43302b = oVar;
        this.f43303c = t10;
    }
}
