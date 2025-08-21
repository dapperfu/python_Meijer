package Vu;

import cv.C13558a;
import io.reactivex.u;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class a<T> extends u<T> {

    /* renamed from: a, reason: collision with root package name */
    final x<T> f40453a;

    /* renamed from: Vu.a$a, reason: collision with other inner class name */
    static final class C0870a<T> extends AtomicReference<Ju.b> implements v<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final w<? super T> f40454a;

        @Override // io.reactivex.v
        public boolean a(Throwable th2) {
            Ju.b andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Ju.b bVar = get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar == dVar || (andSet = getAndSet(dVar)) == dVar) {
                return false;
            }
            try {
                this.f40454a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.v
        public void b(Lu.f fVar) {
            d(new Mu.b(fVar));
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C0870a.class.getSimpleName(), super.toString());
        }

        C0870a(w<? super T> wVar) {
            this.f40454a = wVar;
        }

        public void c(Throwable th2) {
            if (!a(th2)) {
                C13558a.s(th2);
            }
        }

        public void d(Ju.b bVar) {
            Mu.d.m(this, bVar);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.v
        public void onSuccess(T t10) {
            Ju.b andSet;
            Ju.b bVar = get();
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar != dVar && (andSet = getAndSet(dVar)) != dVar) {
                try {
                    if (t10 == null) {
                        this.f40454a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } else {
                        this.f40454a.onSuccess(t10);
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
        C0870a c0870a = new C0870a(wVar);
        wVar.onSubscribe(c0870a);
        try {
            this.f40453a.a(c0870a);
        } catch (Throwable th2) {
            Ku.a.b(th2);
            c0870a.c(th2);
        }
    }

    public a(x<T> xVar) {
        this.f40453a = xVar;
    }
}
