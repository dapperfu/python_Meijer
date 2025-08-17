package Yu;

import Yu.Z0;

/* renamed from: Yu.s0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5488s0<T> extends io.reactivex.l<T> implements Su.d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f41621a;

    @Override // Su.d, java.util.concurrent.Callable
    public T call() {
        return this.f41621a;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        Z0.a aVar = new Z0.a(sVar, this.f41621a);
        sVar.onSubscribe(aVar);
        aVar.run();
    }

    public C5488s0(T t10) {
        this.f41621a = t10;
    }
}
