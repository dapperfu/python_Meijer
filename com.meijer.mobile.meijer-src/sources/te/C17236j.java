package te;

/* renamed from: te.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17236j extends C17232f {

    /* renamed from: a, reason: collision with root package name */
    private final C17232f f162551a;

    /* renamed from: b, reason: collision with root package name */
    private final float f162552b;

    @Override // te.C17232f
    boolean a() {
        return this.f162551a.a();
    }

    @Override // te.C17232f
    public void b(float f10, float f11, float f12, C17241o c17241o) {
        this.f162551a.b(f10, f11 - this.f162552b, f12, c17241o);
    }

    public C17236j(C17232f c17232f, float f10) {
        this.f162551a = c17232f;
        this.f162552b = f10;
    }
}
