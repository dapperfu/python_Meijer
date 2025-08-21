package com.scandit.datacapture.barcode.internal.module.ui.shutterbutton;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.ui.animation.PulsingView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f extends FrameLayout implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f124366b = LazyKt.b(e.f124365a);

    /* renamed from: a, reason: collision with root package name */
    public final PulsingView f124367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        setForeground(FS.Resources_getDrawable(context, R.drawable.sc_button_shutter_play_pause));
        setClipChildren(false);
        int iIntValue = ((Number) f124366b.getValue()).intValue();
        int intrinsicWidth = getForeground().getIntrinsicWidth();
        Intrinsics.j(this, "container");
        int[] gradientColors = {com.scandit.datacapture.barcode.internal.module.extensions.a.a(-1, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(-1, 0), -1};
        Intrinsics.j(this, "container");
        Intrinsics.j(gradientColors, "gradientColors");
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        PulsingView pulsingView = new PulsingView(context2, iIntValue, intrinsicWidth, gradientColors);
        addView(pulsingView, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue, iIntValue);
        layoutParams.gravity = 17;
        pulsingView.setLayoutParams(layoutParams);
        this.f124367a = pulsingView;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f124367a.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f124367a.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f124367a.stop();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getForeground().getIntrinsicWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getForeground().getIntrinsicHeight(), 1073741824));
    }
}
