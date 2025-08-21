package Vu;

import Lu.o;
import Pu.v;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.u;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class i<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final y<? extends T> f40482a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super Throwable, ? extends y<? extends T>> f40483b;

    static final class a<T> extends AtomicReference<Ju.b> implements w<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f40484a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super Throwable, ? extends y<? extends T>> f40485b;

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable th2) {
            try {
                ((y) Nu.b.e(this.f40485b.apply(th2), "The nextFunction returned a null SingleSource.")).a(new v(this, this.f40484a));
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f40484a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f40484a.onSuccess(t10);
        }

        a(w<? super T> wVar, o<? super Throwable, ? extends y<? extends T>> oVar) {
            this.f40484a = wVar;
            this.f40485b = oVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this, bVar)) {
                this.f40484a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        this.f40482a.a(new a(wVar, this.f40483b));
    }

    public i(y<? extends T> yVar, o<? super Throwable, ? extends y<? extends T>> oVar) {
        this.f40482a = yVar;
        this.f40483b = oVar;
    }
}
