package G;

import android.opengl.Matrix;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f11203a = new float[16];

    private static void a(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, -f10, -f11, 0.0f);
    }

    private static void b(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, f10, f11, 0.0f);
    }

    public static void d(float[] fArr, float f10) {
        b(fArr, 0.0f, f10);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        a(fArr, 0.0f, f10);
    }

    public static void c(float[] fArr, float f10, float f11, float f12) {
        b(fArr, f11, f12);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        a(fArr, f11, f12);
    }
}
