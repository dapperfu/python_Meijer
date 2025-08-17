package Tu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class l<T> implements io.reactivex.s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.s<? super T> f35467a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.g<? super Nu.b> f35468b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.a f35469c;

    /* renamed from: d, reason: collision with root package name */
    Nu.b f35470d;

    @Override // Nu.b
    public void dispose() {
        Nu.b bVar = this.f35470d;
        Qu.d dVar = Qu.d.DISPOSED;
        if (bVar != dVar) {
            this.f35470d = dVar;
            try {
                this.f35469c.run();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                C14313a.s(th2);
            }
            bVar.dispose();
        }
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f35470d.isDisposed();
    }

    @Override // io.reactivex.s
    public void onComplete() {
        Nu.b bVar = this.f35470d;
        Qu.d dVar = Qu.d.DISPOSED;
        if (bVar != dVar) {
            this.f35470d = dVar;
            this.f35467a.onComplete();
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Nu.b bVar = this.f35470d;
        Qu.d dVar = Qu.d.DISPOSED;
        if (bVar == dVar) {
            C14313a.s(th2);
        } else {
            this.f35470d = dVar;
            this.f35467a.onError(th2);
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        this.f35467a.onNext(t10);
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        try {
            this.f35468b.accept(bVar);
            if (Qu.d.t(this.f35470d, bVar)) {
                this.f35470d = bVar;
                this.f35467a.onSubscribe(this);
            }
        } catch (Throwable th2) {
            Ou.a.b(th2);
            bVar.dispose();
            this.f35470d = Qu.d.DISPOSED;
            Qu.e.m(th2, this.f35467a);
        }
    }

    public l(io.reactivex.s<? super T> sVar, Pu.g<? super Nu.b> gVar, Pu.a aVar) {
        this.f35467a = sVar;
        this.f35468b = gVar;
        this.f35469c = aVar;
    }
}
