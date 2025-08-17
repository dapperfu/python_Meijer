package re;

/* renamed from: re.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16757e extends C16756d {

    /* renamed from: a, reason: collision with root package name */
    float f158009a = -1.0f;

    @Override // re.C16756d
    public void a(C16767o c16767o, float f10, float f11, float f12) {
        c16767o.o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        c16767o.m((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}
