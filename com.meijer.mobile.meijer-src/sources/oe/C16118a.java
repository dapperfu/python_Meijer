package oe;

/* renamed from: oe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16118a {
    public static float a(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static float c(float f10, float f11, float f12) {
        return ((1.0f - f12) * f10) + (f12 * f11);
    }

    private static float d(float f10, float f11, float f12, float f13) {
        return (f10 <= f11 || f10 <= f12 || f10 <= f13) ? (f11 <= f12 || f11 <= f13) ? f12 > f13 ? f12 : f13 : f11 : f10;
    }

    public static float b(float f10, float f11, float f12, float f13, float f14, float f15) {
        return d(a(f10, f11, f12, f13), a(f10, f11, f14, f13), a(f10, f11, f14, f15), a(f10, f11, f12, f15));
    }
}
