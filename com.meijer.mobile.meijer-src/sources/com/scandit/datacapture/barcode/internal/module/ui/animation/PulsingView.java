package com.scandit.datacapture.barcode.internal.module.ui.animation;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class PulsingView extends View implements Animatable, FSDraw {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f124243h = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f124244a;

    /* renamed from: b, reason: collision with root package name */
    private int f124245b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f124246c;

    /* renamed from: d, reason: collision with root package name */
    private AnimatorSet f124247d;

    /* renamed from: e, reason: collision with root package name */
    private Path f124248e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f124249f;

    /* renamed from: g, reason: collision with root package name */
    private float f124250g;

    public final void a(int i10) {
        Path path;
        if (this.f124245b == i10) {
            return;
        }
        this.f124245b = i10;
        int i11 = this.f124244a;
        if (i10 == 0) {
            path = null;
        } else {
            Path path2 = new Path();
            float f10 = i11 / 2;
            path2.addCircle(f10, f10, i10 / 2, Path.Direction.CW);
            path = path2;
        }
        this.f124248e = path;
    }

    public void fsSuperDraw_b316ff8007ab4326e8b3ee9c8c8cd749(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    public final void b(int i10) {
        if (this.f124244a == i10) {
            return;
        }
        this.f124244a = i10;
        getLayoutParams().width = i10;
        getLayoutParams().height = i10;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        canvas.save();
        Path path = this.f124248e;
        if (path != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
        }
        float f10 = this.f124244a / 2.0f;
        float f11 = this.f124250g;
        canvas.scale(f11, f11, f10, f10);
        fsSuperDraw_b316ff8007ab4326e8b3ee9c8c8cd749(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f124249f;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f124249f) {
            return;
        }
        this.f124249f = true;
        if (isAttachedToWindow()) {
            setVisibility(0);
            if (this.f124249f) {
                setVisibility(0);
                setAlpha(1.0f);
                this.f124250g = 0.0f;
                invalidate();
                a(new a(this));
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        AnimatorSet animatorSet = this.f124247d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f124247d = null;
        setVisibility(8);
        this.f124249f = false;
    }

    public PulsingView(Context context, int i10, int i11, int[] iArr) {
        Path path;
        super(context);
        this.f124244a = i10;
        this.f124245b = i11;
        this.f124246c = iArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(1);
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientRadius(i10 / 2.0f);
        setBackground(gradientDrawable);
        setVisibility(8);
        if (i11 == 0) {
            path = null;
        } else {
            path = new Path();
            float f10 = i10 / 2;
            path.addCircle(f10, f10, i11 / 2, Path.Direction.CW);
        }
        this.f124248e = path;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.f124249f;
        if (z10 && z10) {
            setVisibility(0);
            setAlpha(1.0f);
            this.f124250g = 0.0f;
            invalidate();
            a(new a(this));
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f124247d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f124247d = null;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PulsingView this$0, ValueAnimator it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.setAlpha(((Float) animatedValue).floatValue());
    }

    public final void a(int[] value) {
        Intrinsics.j(value, "value");
        if (Arrays.equals(this.f124246c, value)) {
            return;
        }
        this.f124246c = value;
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setColors(value);
    }

    public static final void a(PulsingView pulsingView) {
        if (pulsingView.f124249f) {
            pulsingView.setVisibility(0);
            pulsingView.setAlpha(1.0f);
            pulsingView.f124250g = 0.0f;
            pulsingView.invalidate();
            pulsingView.a(new a(pulsingView));
        }
    }

    private final void a(a aVar) {
        AnimatorSet animatorSet = this.f124247d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scandit.datacapture.barcode.internal.module.ui.animation.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PulsingView.a(this.f124253a, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setStartDelay(600L);
        valueAnimatorOfFloat2.setDuration(400L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scandit.datacapture.barcode.internal.module.ui.animation.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PulsingView.b(this.f124254a, valueAnimator);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet2.addListener(new b(this, aVar));
        animatorSet2.start();
        this.f124247d = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(PulsingView this$0, ValueAnimator it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.f124250g = ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }
}
