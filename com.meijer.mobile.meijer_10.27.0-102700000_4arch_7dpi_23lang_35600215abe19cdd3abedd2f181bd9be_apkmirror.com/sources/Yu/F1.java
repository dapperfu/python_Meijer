package Yu;

import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class F1<T, D> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends D> f40660a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super D, ? extends io.reactivex.q<? extends T>> f40661b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.g<? super D> f40662c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f40663d;

    static final class a<T, D> extends AtomicBoolean implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40664a;

        /* renamed from: b, reason: collision with root package name */
        final D f40665b;

        /* renamed from: c, reason: collision with root package name */
        final Pu.g<? super D> f40666c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f40667d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f40668e;

        void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f40666c.accept(this.f40665b);
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    C14313a.s(th2);
                }
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (!this.f40667d) {
                this.f40664a.onComplete();
                this.f40668e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f40666c.accept(this.f40665b);
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    this.f40664a.onError(th2);
                    return;
                }
            }
            this.f40668e.dispose();
            this.f40664a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f40667d) {
                this.f40664a.onError(th2);
                this.f40668e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f40666c.accept(this.f40665b);
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f40668e.dispose();
            this.f40664a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40664a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40668e, bVar)) {
                this.f40668e = bVar;
                this.f40664a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, D d10, Pu.g<? super D> gVar, boolean z10) {
            this.f40664a = sVar;
            this.f40665b = d10;
            this.f40666c = gVar;
            this.f40667d = z10;
        }

        @Override // Nu.b
        public void dispose() {
            a();
            this.f40668e.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return get();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            D dCall = this.f40660a.call();
            try {
                ((io.reactivex.q) Ru.b.e(this.f40661b.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new a(sVar, dCall, this.f40662c, this.f40663d));
            } catch (Throwable th2) {
                Ou.a.b(th2);
                try {
                    this.f40662c.accept(dCall);
                    Qu.e.m(th2, sVar);
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    Qu.e.m(new CompositeException(th2, th3), sVar);
                }
            }
        } catch (Throwable th4) {
            Ou.a.b(th4);
            Qu.e.m(th4, sVar);
        }
    }

    public F1(Callable<? extends D> callable, Pu.o<? super D, ? extends io.reactivex.q<? extends T>> oVar, Pu.g<? super D> gVar, boolean z10) {
        this.f40660a = callable;
        this.f40661b = oVar;
        this.f40662c = gVar;
        this.f40663d = z10;
    }
}
