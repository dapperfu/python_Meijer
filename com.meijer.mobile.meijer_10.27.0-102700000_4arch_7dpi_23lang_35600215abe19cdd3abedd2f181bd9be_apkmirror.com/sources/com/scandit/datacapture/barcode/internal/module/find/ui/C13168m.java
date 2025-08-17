package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.ui.animation.PulsingView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13168m extends FrameLayout implements Animatable, FSDraw {

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f122237f = LazyKt.b(C13163h.f122218a);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f122238g = LazyKt.b(C13160e.f122212a);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f122239h = LazyKt.b(C13158d.f122210a);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f122240i = LazyKt.b(C13156c.f122186a);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f122241j = LazyKt.b(C13161f.f122214a);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f122242k = LazyKt.b(C13162g.f122216a);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f122243a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f122244b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f122245c;

    /* renamed from: d, reason: collision with root package name */
    public final PulsingView f122246d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f122247e;

    public void fsSuperDraw_e959bed5e44025d77694ea46bc227bc6(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13168m(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.sc_barcode_find_dot_default, context.getTheme()));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f122243a = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(-1);
        this.f122244b = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(-1);
        this.f122245c = paint3;
        setClickable(true);
        setFocusable(true);
        setElevation(((Number) f122241j.getValue()).floatValue());
        setClipChildren(false);
        int iIntValue = ((Number) f122242k.getValue()).intValue();
        int color = paint.getColor();
        int[] gradientColors = {com.scandit.datacapture.barcode.internal.module.extensions.a.a(color, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(color, 230)};
        Intrinsics.j(this, "container");
        Intrinsics.j(gradientColors, "gradientColors");
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        PulsingView pulsingView = new PulsingView(context2, iIntValue, 0, gradientColors);
        addView(pulsingView, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue, iIntValue);
        layoutParams.gravity = 17;
        pulsingView.setLayoutParams(layoutParams);
        this.f122246d = pulsingView;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        fsSuperDraw_e959bed5e44025d77694ea46bc227bc6(canvas);
        if (this.f122247e) {
            canvas.drawCircle(C13164i.b(), C13164i.b(), ((Number) f122239h.getValue()).floatValue(), this.f122245c);
        } else {
            canvas.drawCircle(C13164i.b(), C13164i.b(), C13164i.b(), this.f122244b);
            canvas.drawCircle(C13164i.b(), C13164i.b(), C13164i.b() - ((Number) f122240i.getValue()).floatValue(), this.f122243a);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f122246d.isRunning();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        setOutlineProvider(new C13154b(this, i10, i11));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f122246d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f122246d.stop();
    }

    @Override // android.view.View
    public final int getMinimumHeight() {
        return C13164i.a();
    }

    @Override // android.view.View
    public final int getMinimumWidth() {
        return C13164i.a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C13164i.a(), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
