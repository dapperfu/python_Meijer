package Ed;

/* renamed from: Ed.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3189d extends a0 {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3191f f7110c;

    @Override // Ed.a0
    protected final Object a(int i10) {
        return this.f7110c.get(i10);
    }

    C3189d(AbstractC3191f abstractC3191f, int i10) {
        super(abstractC3191f.size(), i10);
        this.f7110c = abstractC3191f;
    }
}
