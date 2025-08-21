package Vu;

import Lu.o;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes10.dex */
public final class h<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f40477a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Throwable, ? extends T> f40478b;

    /* renamed from: c, reason: collision with root package name */
    final T f40479c;

    final class a implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        private final w<? super T> f40480a;

        a(w<? super T> wVar) {
            this.f40480a = wVar;
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            T tApply;
            h hVar = h.this;
            o<? super Throwable, ? extends T> oVar = hVar.f40478b;
            if (oVar != null) {
                try {
                    tApply = oVar.apply(th2);
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    this.f40480a.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = hVar.f40479c;
            }
            if (tApply != null) {
                this.f40480a.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.f40480a.onError(nullPointerException);
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            this.f40480a.onSubscribe(bVar);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f40480a.onSuccess(t10);
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f40477a.a(new a(wVar));
    }

    public h(y<? extends T> yVar, o<? super Throwable, ? extends T> oVar, T t10) {
        this.f40477a = yVar;
        this.f40478b = oVar;
        this.f40479c = t10;
    }
}
