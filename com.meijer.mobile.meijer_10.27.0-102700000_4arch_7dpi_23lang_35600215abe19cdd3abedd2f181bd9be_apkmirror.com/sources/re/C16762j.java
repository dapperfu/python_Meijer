package re;

/* renamed from: re.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16762j extends C16758f {

    /* renamed from: a, reason: collision with root package name */
    private final C16758f f158061a;

    /* renamed from: b, reason: collision with root package name */
    private final float f158062b;

    @Override // re.C16758f
    boolean a() {
        return this.f158061a.a();
    }

    @Override // re.C16758f
    public void b(float f10, float f11, float f12, C16767o c16767o) {
        this.f158061a.b(f10, f11 - this.f158062b, f12, c16767o);
    }

    public C16762j(C16758f c16758f, float f10) {
        this.f158061a = c16758f;
        this.f158062b = f10;
    }
}
