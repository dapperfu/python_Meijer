package Uu;

/* renamed from: Uu.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5397h0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38504a;

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38504a.subscribe(sVar);
    }

    public C5397h0(io.reactivex.q<T> qVar) {
        this.f38504a = qVar;
    }
}
