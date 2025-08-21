package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f122739a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f122740b;

    /* renamed from: c, reason: collision with root package name */
    public LinearGradient f122741c;

    /* renamed from: d, reason: collision with root package name */
    public float f122742d;

    /* renamed from: e, reason: collision with root package name */
    public float f122743e;

    /* renamed from: f, reason: collision with root package name */
    public float f122744f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f122745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        Paint paint = new Paint(1);
        paint.setStrokeWidth(0.0f);
        this.f122739a = paint;
        this.f122740b = new Matrix();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Nt.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.scandit.datacapture.barcode.internal.module.count.ui.status.a.a(this.f22731a, valueAnimator);
            }
        });
        this.f122745g = valueAnimatorOfFloat;
    }

    public static final void a(a this$0, ValueAnimator it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.f122742d = ((Float) animatedValue).floatValue();
        this$0.f122740b.reset();
        this$0.f122740b.postTranslate(this$0.f122744f * this$0.f122742d, 0.0f);
        LinearGradient linearGradient = this$0.f122741c;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this$0.f122740b);
        }
        this$0.invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f122745g.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        float f10 = this.f122743e;
        canvas.drawCircle(f10, f10, f10, this.f122739a);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10;
        this.f122743e = f10 / 2.0f;
        this.f122744f = f10 * 2.0f;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f122744f, 0.0f, new int[]{-1, -16777216, -1}, (float[]) null, Shader.TileMode.REPEAT);
        this.f122741c = linearGradient;
        this.f122739a.setShader(linearGradient);
        this.f122745g.start();
    }
}
