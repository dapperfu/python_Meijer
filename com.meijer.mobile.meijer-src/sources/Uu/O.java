package Uu;

/* loaded from: classes10.dex */
public final class O<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    private final Lu.g<? super Ju.b> f38139b;

    /* renamed from: c, reason: collision with root package name */
    private final Lu.a f38140c;

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new Pu.l(sVar, this.f38139b, this.f38140c));
    }

    public O(io.reactivex.l<T> lVar, Lu.g<? super Ju.b> gVar, Lu.a aVar) {
        super(lVar);
        this.f38139b = gVar;
        this.f38140c = aVar;
    }
}
