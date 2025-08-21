package Uu;

import cv.C13558a;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class F1<T, D> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends D> f37885a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super D, ? extends io.reactivex.q<? extends T>> f37886b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.g<? super D> f37887c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f37888d;

    static final class a<T, D> extends AtomicBoolean implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37889a;

        /* renamed from: b, reason: collision with root package name */
        final D f37890b;

        /* renamed from: c, reason: collision with root package name */
        final Lu.g<? super D> f37891c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f37892d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f37893e;

        void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f37891c.accept(this.f37890b);
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    C13558a.s(th2);
                }
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (!this.f37892d) {
                this.f37889a.onComplete();
                this.f37893e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f37891c.accept(this.f37890b);
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    this.f37889a.onError(th2);
                    return;
                }
            }
            this.f37893e.dispose();
            this.f37889a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f37892d) {
                this.f37889a.onError(th2);
                this.f37893e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f37891c.accept(this.f37890b);
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.f37893e.dispose();
            this.f37889a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37889a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37893e, bVar)) {
                this.f37893e = bVar;
                this.f37889a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, D d10, Lu.g<? super D> gVar, boolean z10) {
            this.f37889a = sVar;
            this.f37890b = d10;
            this.f37891c = gVar;
            this.f37892d = z10;
        }

        @Override // Ju.b
        public void dispose() {
            a();
            this.f37893e.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return get();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            D dCall = this.f37885a.call();
            try {
                ((io.reactivex.q) Nu.b.e(this.f37886b.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new a(sVar, dCall, this.f37887c, this.f37888d));
            } catch (Throwable th2) {
                Ku.a.b(th2);
                try {
                    this.f37887c.accept(dCall);
                    Mu.e.m(th2, sVar);
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    Mu.e.m(new CompositeException(th2, th3), sVar);
                }
            }
        } catch (Throwable th4) {
            Ku.a.b(th4);
            Mu.e.m(th4, sVar);
        }
    }

    public F1(Callable<? extends D> callable, Lu.o<? super D, ? extends io.reactivex.q<? extends T>> oVar, Lu.g<? super D> gVar, boolean z10) {
        this.f37885a = callable;
        this.f37886b = oVar;
        this.f37887c = gVar;
        this.f37888d = z10;
    }
}
