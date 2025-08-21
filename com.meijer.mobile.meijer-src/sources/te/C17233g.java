package te;

/* renamed from: te.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17233g extends C17232f {

    /* renamed from: a, reason: collision with root package name */
    private final float f162500a;

    @Override // te.C17232f
    boolean a() {
        return true;
    }

    @Override // te.C17232f
    public void b(float f10, float f11, float f12, C17241o c17241o) {
        float fSqrt = (float) ((this.f162500a * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f162500a, 2.0d) - Math.pow(fSqrt, 2.0d));
        c17241o.n(f11 - fSqrt, ((float) (-((this.f162500a * Math.sqrt(2.0d)) - this.f162500a))) + fSqrt2);
        c17241o.m(f11, (float) (-((this.f162500a * Math.sqrt(2.0d)) - this.f162500a)));
        c17241o.m(f11 + fSqrt, ((float) (-((this.f162500a * Math.sqrt(2.0d)) - this.f162500a))) + fSqrt2);
    }

    public C17233g(float f10) {
        this.f162500a = f10 - 0.001f;
    }
}
