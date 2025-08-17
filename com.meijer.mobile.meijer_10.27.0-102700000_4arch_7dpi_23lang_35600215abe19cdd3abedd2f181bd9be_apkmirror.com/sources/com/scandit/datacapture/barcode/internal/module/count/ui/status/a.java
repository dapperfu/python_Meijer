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

/* loaded from: classes11.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f121787a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f121788b;

    /* renamed from: c, reason: collision with root package name */
    public LinearGradient f121789c;

    /* renamed from: d, reason: collision with root package name */
    public float f121790d;

    /* renamed from: e, reason: collision with root package name */
    public float f121791e;

    /* renamed from: f, reason: collision with root package name */
    public float f121792f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f121793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        Paint paint = new Paint(1);
        paint.setStrokeWidth(0.0f);
        this.f121787a = paint;
        this.f121788b = new Matrix();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Nt.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.scandit.datacapture.barcode.internal.module.count.ui.status.a.a(this.f22775a, valueAnimator);
            }
        });
        this.f121793g = valueAnimatorOfFloat;
    }

    public static final void a(a this$0, ValueAnimator it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.f121790d = ((Float) animatedValue).floatValue();
        this$0.f121788b.reset();
        this$0.f121788b.postTranslate(this$0.f121792f * this$0.f121790d, 0.0f);
        LinearGradient linearGradient = this$0.f121789c;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this$0.f121788b);
        }
        this$0.invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f121793g.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        float f10 = this.f121791e;
        canvas.drawCircle(f10, f10, f10, this.f121787a);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10;
        this.f121791e = f10 / 2.0f;
        this.f121792f = f10 * 2.0f;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f121792f, 0.0f, new int[]{-1, -16777216, -1}, (float[]) null, Shader.TileMode.REPEAT);
        this.f121789c = linearGradient;
        this.f121787a.setShader(linearGradient);
        this.f121793g.start();
    }
}
