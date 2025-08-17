package re;

/* renamed from: re.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16759g extends C16758f {

    /* renamed from: a, reason: collision with root package name */
    private final float f158010a;

    @Override // re.C16758f
    boolean a() {
        return true;
    }

    @Override // re.C16758f
    public void b(float f10, float f11, float f12, C16767o c16767o) {
        float fSqrt = (float) ((this.f158010a * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f158010a, 2.0d) - Math.pow(fSqrt, 2.0d));
        c16767o.n(f11 - fSqrt, ((float) (-((this.f158010a * Math.sqrt(2.0d)) - this.f158010a))) + fSqrt2);
        c16767o.m(f11, (float) (-((this.f158010a * Math.sqrt(2.0d)) - this.f158010a)));
        c16767o.m(f11 + fSqrt, ((float) (-((this.f158010a * Math.sqrt(2.0d)) - this.f158010a))) + fSqrt2);
    }

    public C16759g(float f10) {
        this.f158010a = f10 - 0.001f;
    }
}
