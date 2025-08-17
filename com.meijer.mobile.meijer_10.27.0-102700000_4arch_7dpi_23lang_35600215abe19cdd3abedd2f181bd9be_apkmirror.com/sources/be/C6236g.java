package be;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: be.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6236g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f60125a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f60126b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f60127c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f60125a);
        matrix2.getValues(this.f60126b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f60126b;
            float f11 = fArr[i10];
            float f12 = this.f60125a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f60127c.setValues(this.f60126b);
        return this.f60127c;
    }
}
