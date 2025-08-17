package Cd;

/* renamed from: Cd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2986d extends a0 {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2988f f3798c;

    @Override // Cd.a0
    protected final Object a(int i10) {
        return this.f3798c.get(i10);
    }

    C2986d(AbstractC2988f abstractC2988f, int i10) {
        super(abstractC2988f.size(), i10);
        this.f3798c = abstractC2988f;
    }
}
