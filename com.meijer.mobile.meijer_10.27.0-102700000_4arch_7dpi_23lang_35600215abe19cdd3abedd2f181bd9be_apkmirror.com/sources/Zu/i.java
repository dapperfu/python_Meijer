package Zu;

import Pu.o;
import Tu.v;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class i<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f43306a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Throwable, ? extends y<? extends T>> f43307b;

    static final class a<T> extends AtomicReference<Nu.b> implements w<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f43308a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super Throwable, ? extends y<? extends T>> f43309b;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            try {
                ((y) Ru.b.e(this.f43309b.apply(th2), "The nextFunction returned a null SingleSource.")).a(new v(this, this.f43308a));
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f43308a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f43308a.onSuccess(t10);
        }

        a(w<? super T> wVar, o<? super Throwable, ? extends y<? extends T>> oVar) {
            this.f43308a = wVar;
            this.f43309b = oVar;
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar)) {
                this.f43308a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f43306a.a(new a(wVar, this.f43307b));
    }

    public i(y<? extends T> yVar, o<? super Throwable, ? extends y<? extends T>> oVar) {
        this.f43306a = yVar;
        this.f43307b = oVar;
    }
}
