package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.module.count.ui.k;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f122641a;

    /* renamed from: b, reason: collision with root package name */
    public final float f122642b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f122643c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f122644d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f122645e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f122646f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f122647g;

    /* renamed from: h, reason: collision with root package name */
    public float f122648h;

    /* renamed from: i, reason: collision with root package name */
    public final ValueAnimator f122649i;

    public static final void a(k this$0, ValueAnimator animator) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float fIntValue = ((Integer) animatedValue).intValue();
        Path path = this$0.f122645e;
        path.reset();
        path.arcTo(this$0.f122647g, fIntValue - 90.0f, 30.0f);
        this$0.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        this.f122641a = PixelExtensionsKt.pxFromDp$default(3.0f, (Context) null, 1, (Object) null);
        this.f122642b = PixelExtensionsKt.pxFromDp$default(8.0f, (Context) null, 1, (Object) null);
        this.f122643c = new Path();
        int iArgb = Color.argb(77, l3.f93323c, l3.f93323c, l3.f93323c);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(iArgb);
        paint.setAntiAlias(true);
        this.f122644d = paint;
        this.f122645e = new Path();
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        this.f122646f = paint2;
        this.f122647g = new RectF();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 359);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Jt.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                k.b(this.f16228a, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 359);
        valueAnimatorOfInt2.setDuration(1000L);
        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt2.setRepeatMode(1);
        valueAnimatorOfInt2.setRepeatCount(-1);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Jt.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                k.a(this.f16229a, valueAnimator);
            }
        });
        this.f122649i = valueAnimatorOfInt2;
    }

    public static final void b(k this$0, ValueAnimator animator) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(animator, "animator");
        Intrinsics.h(animator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        float f10 = 359;
        this$0.f122648h = ((Integer) r4).intValue() / f10;
        Path path = this$0.f122645e;
        path.reset();
        path.arcTo(this$0.f122647g, -90.0f, this$0.f122648h * f10);
        this$0.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        canvas.drawPath(this.f122643c, this.f122644d);
        canvas.drawPath(this.f122645e, this.f122646f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        RectF rectF = this.f122647g;
        float strokeWidth = this.f122646f.getStrokeWidth() / 2;
        rectF.left = strokeWidth;
        rectF.top = strokeWidth;
        float f10 = i10 - strokeWidth;
        rectF.right = f10;
        rectF.bottom = f10;
        Path path = this.f122643c;
        path.reset();
        path.arcTo(this.f122647g, -90.0f, 359.0f);
    }

    public static void a(k kVar) {
        boolean z10;
        float f10 = kVar.f122642b;
        boolean z11 = true;
        if (kVar.f122646f.getStrokeWidth() == f10) {
            z10 = false;
        } else {
            kVar.f122646f.setStrokeWidth(f10);
            z10 = true;
        }
        if (kVar.f122644d.getStrokeWidth() == f10) {
            z11 = z10;
        } else {
            kVar.f122644d.setStrokeWidth(f10);
        }
        if (z11) {
            int width = kVar.getWidth();
            RectF rectF = kVar.f122647g;
            float strokeWidth = kVar.f122646f.getStrokeWidth() / 2;
            rectF.left = strokeWidth;
            rectF.top = strokeWidth;
            float f11 = width - strokeWidth;
            rectF.right = f11;
            rectF.bottom = f11;
            Path path = kVar.f122643c;
            path.reset();
            path.arcTo(kVar.f122647g, -90.0f, 359.0f);
        }
        kVar.f122649i.start();
    }

    public final void a(float f10) {
        boolean z10;
        this.f122649i.cancel();
        float f11 = this.f122641a;
        boolean z11 = true;
        if (this.f122646f.getStrokeWidth() == f11) {
            z10 = false;
        } else {
            this.f122646f.setStrokeWidth(f11);
            z10 = true;
        }
        if (this.f122644d.getStrokeWidth() == f11) {
            z11 = z10;
        } else {
            this.f122644d.setStrokeWidth(f11);
        }
        if (z11) {
            int width = getWidth();
            RectF rectF = this.f122647g;
            float strokeWidth = this.f122646f.getStrokeWidth() / 2;
            rectF.left = strokeWidth;
            rectF.top = strokeWidth;
            float f12 = width - strokeWidth;
            rectF.right = f12;
            rectF.bottom = f12;
            Path path = this.f122643c;
            path.reset();
            path.arcTo(this.f122647g, -90.0f, 359.0f);
        }
        this.f122648h = f10;
        Path path2 = this.f122645e;
        path2.reset();
        path2.arcTo(this.f122647g, -90.0f, this.f122648h * 359);
        invalidate();
    }
}
