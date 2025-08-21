package Uu;

import Uu.Z0;

/* renamed from: Uu.s0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5427s0<T> extends io.reactivex.l<T> implements Ou.d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f38846a;

    @Override // Ou.d, java.util.concurrent.Callable
    public T call() {
        return this.f38846a;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        Z0.a aVar = new Z0.a(sVar, this.f38846a);
        sVar.onSubscribe(aVar);
        aVar.run();
    }

    public C5427s0(T t10) {
        this.f38846a = t10;
    }
}
