package Uu;

import cv.C13558a;
import io.reactivex.exceptions.CompositeException;

/* loaded from: classes10.dex */
public final class N<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.g<? super T> f38105b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.g<? super Throwable> f38106c;

    /* renamed from: d, reason: collision with root package name */
    final Lu.a f38107d;

    /* renamed from: e, reason: collision with root package name */
    final Lu.a f38108e;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38109a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.g<? super T> f38110b;

        /* renamed from: c, reason: collision with root package name */
        final Lu.g<? super Throwable> f38111c;

        /* renamed from: d, reason: collision with root package name */
        final Lu.a f38112d;

        /* renamed from: e, reason: collision with root package name */
        final Lu.a f38113e;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f38114f;

        /* renamed from: g, reason: collision with root package name */
        boolean f38115g;

        @Override // Ju.b
        public void dispose() {
            this.f38114f.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38114f.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38115g) {
                return;
            }
            try {
                this.f38112d.run();
                this.f38115g = true;
                this.f38109a.onComplete();
                try {
                    this.f38113e.run();
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    C13558a.s(th2);
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38115g) {
                C13558a.s(th2);
                return;
            }
            this.f38115g = true;
            try {
                this.f38111c.accept(th2);
            } catch (Throwable th3) {
                Ku.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f38109a.onError(th2);
            try {
                this.f38113e.run();
            } catch (Throwable th4) {
                Ku.a.b(th4);
                C13558a.s(th4);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38115g) {
                return;
            }
            try {
                this.f38110b.accept(t10);
                this.f38109a.onNext(t10);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38114f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38114f, bVar)) {
                this.f38114f = bVar;
                this.f38109a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar, Lu.a aVar2) {
            this.f38109a = sVar;
            this.f38110b = gVar;
            this.f38111c = gVar2;
            this.f38112d = aVar;
            this.f38113e = aVar2;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38105b, this.f38106c, this.f38107d, this.f38108e));
    }

    public N(io.reactivex.q<T> qVar, Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar, Lu.a aVar2) {
        super(qVar);
        this.f38105b = gVar;
        this.f38106c = gVar2;
        this.f38107d = aVar;
        this.f38108e = aVar2;
    }
}
