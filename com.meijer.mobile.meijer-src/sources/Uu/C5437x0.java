package Uu;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;

/* renamed from: Uu.x0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5437x0<T, R> extends AbstractC5375a<T, io.reactivex.q<? extends R>> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38974b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> f38975c;

    /* renamed from: d, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<? extends R>> f38976d;

    /* renamed from: Uu.x0$a */
    static final class a<T, R> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.q<? extends R>> f38977a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38978b;

        /* renamed from: c, reason: collision with root package name */
        final Lu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> f38979c;

        /* renamed from: d, reason: collision with root package name */
        final Callable<? extends io.reactivex.q<? extends R>> f38980d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f38981e;

        @Override // Ju.b
        public void dispose() {
            this.f38981e.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38981e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            try {
                this.f38977a.onNext((io.reactivex.q) Nu.b.e(this.f38980d.call(), "The onComplete ObservableSource returned is null"));
                this.f38977a.onComplete();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38977a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            try {
                this.f38977a.onNext((io.reactivex.q) Nu.b.e(this.f38979c.apply(th2), "The onError ObservableSource returned is null"));
                this.f38977a.onComplete();
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f38977a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            try {
                this.f38977a.onNext((io.reactivex.q) Nu.b.e(this.f38978b.apply(t10), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38977a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38981e, bVar)) {
                this.f38981e = bVar;
                this.f38977a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super io.reactivex.q<? extends R>> sVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, Lu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> oVar2, Callable<? extends io.reactivex.q<? extends R>> callable) {
            this.f38977a = sVar;
            this.f38978b = oVar;
            this.f38979c = oVar2;
            this.f38980d = callable;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.q<? extends R>> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38974b, this.f38975c, this.f38976d));
    }

    public C5437x0(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, Lu.o<? super Throwable, ? extends io.reactivex.q<? extends R>> oVar2, Callable<? extends io.reactivex.q<? extends R>> callable) {
        super(qVar);
        this.f38974b = oVar;
        this.f38975c = oVar2;
        this.f38976d = callable;
    }
}
