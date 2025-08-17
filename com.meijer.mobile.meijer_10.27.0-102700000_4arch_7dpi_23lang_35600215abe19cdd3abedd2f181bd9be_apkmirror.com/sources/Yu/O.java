package Yu;

/* loaded from: classes9.dex */
public final class O<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    private final Pu.g<? super Nu.b> f40914b;

    /* renamed from: c, reason: collision with root package name */
    private final Pu.a f40915c;

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new Tu.l(sVar, this.f40914b, this.f40915c));
    }

    public O(io.reactivex.l<T> lVar, Pu.g<? super Nu.b> gVar, Pu.a aVar) {
        super(lVar);
        this.f40914b = gVar;
        this.f40915c = aVar;
    }
}
