package Yu;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;

/* renamed from: Yu.x0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5498x0<T, R> extends AbstractC5436a<T, io.reactivex.q<? extends R>> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41749b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> f41750c;

    /* renamed from: d, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<? extends R>> f41751d;

    /* renamed from: Yu.x0$a */
    static final class a<T, R> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.q<? extends R>> f41752a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41753b;

        /* renamed from: c, reason: collision with root package name */
        final Pu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> f41754c;

        /* renamed from: d, reason: collision with root package name */
        final Callable<? extends io.reactivex.q<? extends R>> f41755d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f41756e;

        @Override // Nu.b
        public void dispose() {
            this.f41756e.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41756e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            try {
                this.f41752a.onNext((io.reactivex.q) Ru.b.e(this.f41755d.call(), "The onComplete ObservableSource returned is null"));
                this.f41752a.onComplete();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41752a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            try {
                this.f41752a.onNext((io.reactivex.q) Ru.b.e(this.f41754c.apply(th2), "The onError ObservableSource returned is null"));
                this.f41752a.onComplete();
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f41752a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                this.f41752a.onNext((io.reactivex.q) Ru.b.e(this.f41753b.apply(t10), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41752a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41756e, bVar)) {
                this.f41756e = bVar;
                this.f41752a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super io.reactivex.q<? extends R>> sVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, Pu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> oVar2, Callable<? extends io.reactivex.q<? extends R>> callable) {
            this.f41752a = sVar;
            this.f41753b = oVar;
            this.f41754c = oVar2;
            this.f41755d = callable;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.q<? extends R>> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41749b, this.f41750c, this.f41751d));
    }

    public C5498x0(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, Pu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> oVar2, Callable<? extends io.reactivex.q<? extends R>> callable) {
        super(qVar);
        this.f41749b = oVar;
        this.f41750c = oVar2;
        this.f41751d = callable;
    }
}
