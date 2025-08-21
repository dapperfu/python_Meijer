package de;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: de.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13667g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f128360a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f128361b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f128362c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f128360a);
        matrix2.getValues(this.f128361b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f128361b;
            float f11 = fArr[i10];
            float f12 = this.f128360a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f128362c.setValues(this.f128361b);
        return this.f128362c;
    }
}
