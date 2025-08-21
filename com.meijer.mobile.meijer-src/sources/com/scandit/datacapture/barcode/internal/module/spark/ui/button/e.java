package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.spark.ui.E;
import com.scandit.datacapture.barcode.internal.module.ui.animation.PulsingView;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewStateHelper;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class e extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanViewScanButtonTouchListener f124031a;

    /* renamed from: b, reason: collision with root package name */
    public SparkScanViewState f124032b;

    /* renamed from: c, reason: collision with root package name */
    public final k f124033c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f124034d;

    /* renamed from: e, reason: collision with root package name */
    public final PulsingView f124035e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.g f124036f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f124037g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f124038h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f124039i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f124040j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f124041k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f124042l;

    public final void a(Bitmap bitmap) {
        this.f124038h = bitmap;
        ImageView imageView = this.f124037g;
        if (imageView != null) {
            imageView.setImageDrawable(new BitmapDrawable(getContext().getResources(), this.f124038h));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Bitmap bitmap, Integer num, Integer num2, Integer num3, SparkScanViewScanButtonTouchListener touchListener, SparkScanViewState latestViewState, k kVar) {
        int iIntValue;
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(touchListener, "touchListener");
        Intrinsics.j(latestViewState, "latestViewState");
        this.f124031a = touchListener;
        this.f124032b = latestViewState;
        this.f124033c = kVar;
        int iIntValue2 = ((Number) E.f123937o.getValue()).intValue();
        Lazy lazy = E.f123939q;
        int iIntValue3 = ((Number) lazy.getValue()).intValue();
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            NativeColor nativeColorDefaultTriggerButtonAnimationColor = NativeSparkScanViewDefaults.defaultTriggerButtonAnimationColor();
            Intrinsics.i(nativeColorDefaultTriggerButtonAnimationColor, "defaultTriggerButtonAnimationColor(...)");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultTriggerButtonAnimationColor);
        }
        Intrinsics.j(this, "container");
        int[] gradientColors = {com.scandit.datacapture.barcode.internal.module.extensions.a.a(iIntValue, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(iIntValue, 0), iIntValue};
        Intrinsics.j(this, "container");
        Intrinsics.j(gradientColors, "gradientColors");
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        PulsingView pulsingView = new PulsingView(context2, iIntValue2, iIntValue3, gradientColors);
        addView(pulsingView, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue2, iIntValue2);
        layoutParams.gravity = 17;
        pulsingView.setLayoutParams(layoutParams);
        this.f124035e = pulsingView;
        com.scandit.datacapture.barcode.internal.module.ui.g gVar = new com.scandit.datacapture.barcode.internal.module.ui.g(context);
        Lazy lazy2 = E.f123938p;
        gVar.f124286d = ((Number) lazy2.getValue()).intValue();
        gVar.requestLayout();
        this.f124036f = gVar;
        this.f124038h = bitmap;
        this.f124039i = num;
        this.f124040j = num2;
        this.f124041k = num3;
        setClipChildren(false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setBackgroundResource(R.drawable.sc_spark_scan_expanded_capture_button_background);
        relativeLayout.setClipChildren(false);
        relativeLayout.addView(gVar, 0, new FrameLayout.LayoutParams(-1, -1));
        touchListener.a(this);
        touchListener.a(new d(this));
        relativeLayout.setOnTouchListener(touchListener);
        this.f124034d = relativeLayout;
        setContentDescription(context.getString(R.string.sc_spark_scan_expanded_button));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageDrawable(new BitmapDrawable(context.getResources(), this.f124038h));
        this.f124037g = imageView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(((Number) lazy2.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams2.gravity = 17;
        Unit unit = Unit.f143329a;
        addView(relativeLayout, layoutParams2);
        Lazy lazy3 = E.f123946x;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(((Number) lazy3.getValue()).intValue(), ((Number) lazy3.getValue()).intValue());
        layoutParams3.gravity = 17;
        addView(imageView, layoutParams3);
        a(this.f124032b);
    }

    @Override // android.view.View
    public final float getElevation() {
        return this.f124036f.getElevation();
    }

    @Override // android.view.View
    public final void setElevation(float f10) {
        this.f124036f.setElevation(f10);
    }

    public final void a(SparkScanViewState viewState) {
        int iIntValue;
        int iArgb;
        Intrinsics.j(viewState, "viewState");
        this.f124032b = viewState;
        RelativeLayout relativeLayout = this.f124034d;
        if (relativeLayout != null) {
            Drawable background = relativeLayout.getBackground();
            Integer num = this.f124039i;
            if (num != null) {
                iArgb = num.intValue();
            } else {
                NativeColor nativeColorDefaultTriggerButtonExpandedColor = NativeSparkScanViewDefaults.defaultTriggerButtonExpandedColor();
                Intrinsics.i(nativeColorDefaultTriggerButtonExpandedColor, "defaultTriggerButtonExpandedColor(...)");
                iArgb = NativeColorExtensionsKt.toInt(nativeColorDefaultTriggerButtonExpandedColor);
            }
            int i10 = SparkScanViewScanButtonView.f124011n;
            if (this.f124042l) {
                iArgb = Color.argb(RangesKt.o((int) (Color.alpha(iArgb) * 1.25d), 0, l3.f93323c), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
            }
            Intrinsics.h(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable drawableFindDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(R.id.expanded_button_background);
            Intrinsics.h(drawableFindDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableFindDrawableByLayerId).setColor(ColorStateList.valueOf(iArgb));
        }
        Integer num2 = this.f124040j;
        if (num2 != null) {
            ImageView imageView = this.f124037g;
            if (imageView != null) {
                imageView.setColorFilter(num2.intValue());
            }
        } else {
            ImageView imageView2 = this.f124037g;
            if (imageView2 != null) {
                imageView2.setColorFilter((ColorFilter) null);
            }
        }
        Integer num3 = this.f124041k;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            NativeColor nativeColorDefaultTriggerButtonAnimationColor = NativeSparkScanViewDefaults.defaultTriggerButtonAnimationColor();
            Intrinsics.i(nativeColorDefaultTriggerButtonAnimationColor, "defaultTriggerButtonAnimationColor(...)");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultTriggerButtonAnimationColor);
        }
        PulsingView pulsingView = this.f124035e;
        pulsingView.getClass();
        pulsingView.a(new int[]{com.scandit.datacapture.barcode.internal.module.extensions.a.a(iIntValue, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(iIntValue, 0), iIntValue});
        pulsingView.invalidate();
        if (NativeSparkScanViewStateHelper.isCaptureEnabledState(viewState)) {
            this.f124035e.start();
        } else {
            this.f124035e.stop();
        }
    }
}
