package Zu;

import gv.C14313a;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;

/* loaded from: classes9.dex */
public final class c<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<T> f43284a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.g<? super Nu.b> f43285b;

    static final class a<T> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f43286a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.g<? super Nu.b> f43287b;

        /* renamed from: c, reason: collision with root package name */
        boolean f43288c;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            if (this.f43288c) {
                C14313a.s(th2);
            } else {
                this.f43286a.onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            try {
                this.f43287b.accept(bVar);
                this.f43286a.onSubscribe(bVar);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f43288c = true;
                bVar.dispose();
                Qu.e.o(th2, this.f43286a);
            }
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            if (this.f43288c) {
                return;
            }
            this.f43286a.onSuccess(t10);
        }

        a(w<? super T> wVar, Pu.g<? super Nu.b> gVar) {
            this.f43286a = wVar;
            this.f43287b = gVar;
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f43284a.a(new a(wVar, this.f43285b));
    }

    public c(y<T> yVar, Pu.g<? super Nu.b> gVar) {
        this.f43284a = yVar;
        this.f43285b = gVar;
    }
}
