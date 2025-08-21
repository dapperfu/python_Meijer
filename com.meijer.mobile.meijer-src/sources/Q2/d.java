package Q2;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f27710a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27711b;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f27710a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f27711b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float[] fArr2 = this.f27710a;
        float f13 = fArr2[iMin];
        return f13 + (f12 * (fArr2[iMin + 1] - f13));
    }

    protected d(float[] fArr) {
        this.f27710a = fArr;
        this.f27711b = 1.0f / (fArr.length - 1);
    }
}
