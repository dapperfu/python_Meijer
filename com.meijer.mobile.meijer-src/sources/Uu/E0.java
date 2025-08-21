package Uu;

import cv.C13558a;
import io.reactivex.exceptions.CompositeException;

/* loaded from: classes10.dex */
public final class E0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> f37853b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f37854c;

    static final class a<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37855a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> f37856b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f37857c;

        /* renamed from: d, reason: collision with root package name */
        final Mu.h f37858d = new Mu.h();

        /* renamed from: e, reason: collision with root package name */
        boolean f37859e;

        /* renamed from: f, reason: collision with root package name */
        boolean f37860f;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37860f) {
                return;
            }
            this.f37860f = true;
            this.f37859e = true;
            this.f37855a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37859e) {
                if (this.f37860f) {
                    C13558a.s(th2);
                    return;
                } else {
                    this.f37855a.onError(th2);
                    return;
                }
            }
            this.f37859e = true;
            if (this.f37857c && !(th2 instanceof Exception)) {
                this.f37855a.onError(th2);
                return;
            }
            try {
                io.reactivex.q<? extends T> qVarApply = this.f37856b.apply(th2);
                if (qVarApply != null) {
                    qVarApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                this.f37855a.onError(nullPointerException);
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f37855a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f37860f) {
                return;
            }
            this.f37855a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f37858d.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, Lu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> oVar, boolean z10) {
            this.f37855a = sVar;
            this.f37856b = oVar;
            this.f37857c = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar, this.f37853b, this.f37854c);
        sVar.onSubscribe(aVar.f37858d);
        this.f38360a.subscribe(aVar);
    }

    public E0(io.reactivex.q<T> qVar, Lu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> oVar, boolean z10) {
        super(qVar);
        this.f37853b = oVar;
        this.f37854c = z10;
    }
}
