package Yu;

/* renamed from: Yu.e1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5450e1<T> extends AbstractC5436a<T, T> {
    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new io.reactivex.observers.f(sVar));
    }

    public C5450e1(io.reactivex.l<T> lVar) {
        super(lVar);
    }
}
