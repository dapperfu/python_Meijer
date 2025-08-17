package Yu;

/* renamed from: Yu.h0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5458h0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41279a;

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41279a.subscribe(sVar);
    }

    public C5458h0(io.reactivex.q<T> qVar) {
        this.f41279a = qVar;
    }
}
