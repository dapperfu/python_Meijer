package Zu;

import gv.C14313a;
import io.reactivex.u;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class a<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final x<T> f43277a;

    /* renamed from: Zu.a$a, reason: collision with other inner class name */
    static final class C0932a<T> extends AtomicReference<Nu.b> implements v<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f43278a;

        @Override // io.reactivex.v
        public boolean a(Throwable th2) {
            Nu.b andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Nu.b bVar = get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return false;
            }
            try {
                this.f43278a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.v
        public void b(Pu.f fVar) {
            d(new Qu.b(fVar));
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C0932a.class.getSimpleName(), super.toString());
        }

        C0932a(w<? super T> wVar) {
            this.f43278a = wVar;
        }

        public void c(Throwable th2) {
            if (!a(th2)) {
                C14313a.s(th2);
            }
        }

        public void d(Nu.b bVar) {
            Qu.d.m(this, bVar);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.v
        public void onSuccess(T t10) {
            Nu.b andSet;
            Nu.b bVar = get();
            Qu.d dVar = Qu.d.DISPOSED;
            if (bVar != dVar && (andSet = getAndSet(dVar)) != dVar) {
                try {
                    if (t10 == null) {
                        this.f43278a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } else {
                        this.f43278a.onSuccess(t10);
                    }
                    if (andSet != null) {
                        andSet.dispose();
                    }
                } catch (Throwable th2) {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // io.reactivex.u
    protected void p(w<? super T> wVar) {
        C0932a c0932a = new C0932a(wVar);
        wVar.onSubscribe(c0932a);
        try {
            this.f43277a.a(c0932a);
        } catch (Throwable th2) {
            Ou.a.b(th2);
            c0932a.c(th2);
        }
    }

    public a(x<T> xVar) {
        this.f43277a = xVar;
    }
}
