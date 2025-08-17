package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import d3.I;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f57211a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f57212b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final I<float[]> f57213c = new I<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f57214d;

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            GlUtil.k(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArrJ = this.f57213c.j(j10);
        if (fArrJ == null) {
            return false;
        }
        b(this.f57212b, fArrJ);
        if (!this.f57214d) {
            a(this.f57211a, this.f57212b);
            this.f57214d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f57211a, 0, this.f57212b, 0);
        return true;
    }

    public void d() {
        this.f57213c.c();
        this.f57214d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f57213c.a(j10, fArr);
    }

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.k(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }
}
