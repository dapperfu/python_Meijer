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
/* loaded from: classes12.dex */
public final class C13301m extends FrameLayout implements Animatable, FSDraw {

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f123189f = LazyKt.b(C13296h.f123170a);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f123190g = LazyKt.b(C13293e.f123164a);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f123191h = LazyKt.b(C13291d.f123162a);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f123192i = LazyKt.b(C13289c.f123138a);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f123193j = LazyKt.b(C13294f.f123166a);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f123194k = LazyKt.b(C13295g.f123168a);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f123195a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f123196b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f123197c;

    /* renamed from: d, reason: collision with root package name */
    public final PulsingView f123198d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f123199e;

    public void fsSuperDraw_e959bed5e44025d77694ea46bc227bc6(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13301m(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.sc_barcode_find_dot_default, context.getTheme()));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f123195a = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(-1);
        this.f123196b = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(-1);
        this.f123197c = paint3;
        setClickable(true);
        setFocusable(true);
        setElevation(((Number) f123193j.getValue()).floatValue());
        setClipChildren(false);
        int iIntValue = ((Number) f123194k.getValue()).intValue();
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
        this.f123198d = pulsingView;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        fsSuperDraw_e959bed5e44025d77694ea46bc227bc6(canvas);
        if (this.f123199e) {
            canvas.drawCircle(C13297i.b(), C13297i.b(), ((Number) f123191h.getValue()).floatValue(), this.f123197c);
        } else {
            canvas.drawCircle(C13297i.b(), C13297i.b(), C13297i.b(), this.f123196b);
            canvas.drawCircle(C13297i.b(), C13297i.b(), C13297i.b() - ((Number) f123192i.getValue()).floatValue(), this.f123195a);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f123198d.isRunning();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        setOutlineProvider(new C13287b(this, i10, i11));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f123198d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f123198d.stop();
    }

    @Override // android.view.View
    public final int getMinimumHeight() {
        return C13297i.a();
    }

    @Override // android.view.View
    public final int getMinimumWidth() {
        return C13297i.a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C13297i.a(), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
