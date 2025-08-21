package Uu;

import cv.C13558a;
import java.util.concurrent.Callable;

/* renamed from: Uu.b1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5380b1<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.c<R, ? super T, R> f38390b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<R> f38391c;

    /* renamed from: Uu.b1$a */
    static final class a<T, R> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38392a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.c<R, ? super T, R> f38393b;

        /* renamed from: c, reason: collision with root package name */
        R f38394c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38395d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38396e;

        @Override // Ju.b
        public void dispose() {
            this.f38395d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38395d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38396e) {
                return;
            }
            this.f38396e = true;
            this.f38392a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38396e) {
                C13558a.s(th2);
            } else {
                this.f38396e = true;
                this.f38392a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38396e) {
                return;
            }
            try {
                R r10 = (R) Nu.b.e(this.f38393b.apply(this.f38394c, t10), "The accumulator returned a null value");
                this.f38394c = r10;
                this.f38392a.onNext(r10);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38395d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38395d, bVar)) {
                this.f38395d = bVar;
                this.f38392a.onSubscribe(this);
                this.f38392a.onNext(this.f38394c);
            }
        }

        a(io.reactivex.s<? super R> sVar, Lu.c<R, ? super T, R> cVar, R r10) {
            this.f38392a = sVar;
            this.f38393b = cVar;
            this.f38394c = r10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        try {
            this.f38360a.subscribe(new a(sVar, this.f38390b, Nu.b.e(this.f38391c.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }

    public C5380b1(io.reactivex.q<T> qVar, Callable<R> callable, Lu.c<R, ? super T, R> cVar) {
        super(qVar);
        this.f38390b = cVar;
        this.f38391c = callable;
    }
}
