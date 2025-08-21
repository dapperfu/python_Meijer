package fsimpl;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.view.animation.LinearInterpolator;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.ColorBorderDrawable;

/* renamed from: fsimpl.aa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14074aa extends PaintDrawable {

    /* renamed from: a, reason: collision with root package name */
    private final LinearGradient f132816a;

    /* renamed from: b, reason: collision with root package name */
    private final float f132817b;

    /* renamed from: c, reason: collision with root package name */
    private final ValueAnimator f132818c;

    /* renamed from: d, reason: collision with root package name */
    private long f132819d;

    public C14074aa() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 300.0f, 50.0f, new int[]{-61167, -54742, -45747}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.MIRROR);
        this.f132816a = linearGradient;
        getPaint().setShader(linearGradient);
        getPaint().setDither(true);
        this.f132817b = a(300.0f, 50.0f);
        this.f132818c = c();
    }

    private float a(float f10, float f11) {
        if (f11 == 0.0f) {
            return f10 * 2.0f;
        }
        if (f10 == 0.0f) {
            return Float.NaN;
        }
        double d10 = f11;
        double dTan = Math.tan(1.5707963267948966d - Math.atan(f10 / f11));
        Double.isNaN(d10);
        return (f10 + ((float) (d10 * dTan))) * 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fWidth = getBounds().width() / 1000.0f;
        Matrix matrix = new Matrix();
        matrix.preTranslate(fFloatValue, 0.0f);
        matrix.postScale(fWidth, fWidth);
        this.f132816a.setLocalMatrix(matrix);
        invalidateSelf();
    }

    private ValueAnimator c() {
        if (Float.isNaN(this.f132817b)) {
            return null;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(ColorBorderDrawable.COLOR_ANIMATION_DURATION);
        valueAnimator.setFloatValues(0.0f, this.f132817b);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fsimpl.aa$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.a(valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public void a() {
        ValueAnimator valueAnimator = this.f132818c;
        if (valueAnimator != null) {
            valueAnimator.setCurrentPlayTime(this.f132819d);
            this.f132818c.start();
        }
    }

    public void b() {
        ValueAnimator valueAnimator = this.f132818c;
        if (valueAnimator != null) {
            this.f132819d = valueAnimator.getCurrentPlayTime();
            this.f132818c.cancel();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(this.f132818c);
    }
}
