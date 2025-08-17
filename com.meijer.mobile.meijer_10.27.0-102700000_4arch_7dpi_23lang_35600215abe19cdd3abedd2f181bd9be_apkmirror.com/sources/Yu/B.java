package Yu;

import gv.C14313a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class B<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.o<T> f40559a;

    static final class a<T> extends AtomicReference<Nu.b> implements io.reactivex.n<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40560a;

        @Override // io.reactivex.n
        public boolean a(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f40560a.onError(th2);
                dispose();
                return true;
            } catch (Throwable th3) {
                dispose();
                throw th3;
            }
        }

        @Override // io.reactivex.n
        public void b(Pu.f fVar) {
            c(new Qu.b(fVar));
        }

        @Override // io.reactivex.e
        public void onNext(T t10) {
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f40560a.onNext(t10);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f40560a = sVar;
        }

        public void c(Nu.b bVar) {
            Qu.d.m(this, bVar);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // io.reactivex.n, Nu.b
        public boolean isDisposed() {
            return Qu.d.b(get());
        }

        @Override // io.reactivex.e
        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.f40560a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        @Override // io.reactivex.e
        public void onError(Throwable th2) {
            if (!a(th2)) {
                C14313a.s(th2);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        try {
            this.f40559a.a(aVar);
        } catch (Throwable th2) {
            Ou.a.b(th2);
            aVar.onError(th2);
        }
    }

    public B(io.reactivex.o<T> oVar) {
        this.f40559a = oVar;
    }
}
