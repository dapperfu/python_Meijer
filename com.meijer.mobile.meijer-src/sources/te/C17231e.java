package te;

/* renamed from: te.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17231e extends C17230d {

    /* renamed from: a, reason: collision with root package name */
    float f162499a = -1.0f;

    @Override // te.C17230d
    public void a(C17241o c17241o, float f10, float f11, float f12) {
        c17241o.o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        c17241o.m((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}
