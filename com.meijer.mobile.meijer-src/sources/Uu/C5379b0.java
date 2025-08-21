package Uu;

import cv.C13558a;
import java.util.Iterator;

/* renamed from: Uu.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5379b0<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends Iterable<? extends R>> f38386b;

    /* renamed from: Uu.b0$a */
    static final class a<T, R> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38387a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends Iterable<? extends R>> f38388b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38389c;

        @Override // Ju.b
        public void dispose() {
            this.f38389c.dispose();
            this.f38389c = Mu.d.DISPOSED;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38389c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Ju.b bVar = this.f38389c;
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar == dVar) {
                return;
            }
            this.f38389c = dVar;
            this.f38387a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Ju.b bVar = this.f38389c;
            Mu.d dVar = Mu.d.DISPOSED;
            if (bVar == dVar) {
                C13558a.s(th2);
            } else {
                this.f38389c = dVar;
                this.f38387a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38389c == Mu.d.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f38388b.apply(t10).iterator();
                io.reactivex.s<? super R> sVar = this.f38387a;
                while (it.hasNext()) {
                    try {
                        try {
                            sVar.onNext((Object) Nu.b.e(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            Ku.a.b(th2);
                            this.f38389c.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Ku.a.b(th3);
                        this.f38389c.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Ku.a.b(th4);
                this.f38389c.dispose();
                onError(th4);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38389c, bVar)) {
                this.f38389c = bVar;
                this.f38387a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f38387a = sVar;
            this.f38388b = oVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38386b));
    }

    public C5379b0(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(qVar);
        this.f38386b = oVar;
    }
}
