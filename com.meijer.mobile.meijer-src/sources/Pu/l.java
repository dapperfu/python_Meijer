package Pu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class l<T> implements io.reactivex.s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.s<? super T> f27239a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.g<? super Ju.b> f27240b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.a f27241c;

    /* renamed from: d, reason: collision with root package name */
    Ju.b f27242d;

    @Override // Ju.b
    public void dispose() {
        Ju.b bVar = this.f27242d;
        Mu.d dVar = Mu.d.DISPOSED;
        if (bVar != dVar) {
            this.f27242d = dVar;
            try {
                this.f27241c.run();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                C13558a.s(th2);
            }
            bVar.dispose();
        }
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f27242d.isDisposed();
    }

    @Override // io.reactivex.s
    public void onComplete() {
        Ju.b bVar = this.f27242d;
        Mu.d dVar = Mu.d.DISPOSED;
        if (bVar != dVar) {
            this.f27242d = dVar;
            this.f27239a.onComplete();
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Ju.b bVar = this.f27242d;
        Mu.d dVar = Mu.d.DISPOSED;
        if (bVar == dVar) {
            C13558a.s(th2);
        } else {
            this.f27242d = dVar;
            this.f27239a.onError(th2);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        this.f27239a.onNext(t10);
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        try {
            this.f27240b.accept(bVar);
            if (Mu.d.t(this.f27242d, bVar)) {
                this.f27242d = bVar;
                this.f27239a.onSubscribe(this);
            }
        } catch (Throwable th2) {
            Ku.a.b(th2);
            bVar.dispose();
            this.f27242d = Mu.d.DISPOSED;
            Mu.e.m(th2, this.f27239a);
        }
    }

    public l(io.reactivex.s<? super T> sVar, Lu.g<? super Ju.b> gVar, Lu.a aVar) {
        this.f27239a = sVar;
        this.f27240b = gVar;
        this.f27241c = aVar;
    }
}
