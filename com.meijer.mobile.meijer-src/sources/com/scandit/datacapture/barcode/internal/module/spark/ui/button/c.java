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
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.spark.ui.E;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class c extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final k f124025a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f124026b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f124027c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f124028d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f124029e;

    public final void a(Bitmap bitmap) {
        this.f124027c = bitmap;
        ImageView imageView = this.f124026b;
        if (imageView != null) {
            imageView.setImageDrawable(new BitmapDrawable(getContext().getResources(), this.f124027c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Bitmap bitmap, Integer num, Integer num2, SparkScanViewScanButtonTouchListener scanButtonTouchListener, k kVar) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(scanButtonTouchListener, "scanButtonTouchListener");
        this.f124025a = kVar;
        this.f124027c = bitmap;
        this.f124028d = num;
        this.f124029e = num2;
        setElevation(((Number) E.f123933k.getValue()).floatValue());
        setBackgroundResource(R.drawable.sc_spark_scan_collapsed_button_background);
        setContentDescription(context.getString(R.string.sc_spark_scan_collapsed_button));
        scanButtonTouchListener.a((View) null);
        scanButtonTouchListener.a(new b(this));
        setOnTouchListener(scanButtonTouchListener);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageDrawable(new BitmapDrawable(context.getResources(), this.f124027c));
        this.f124026b = imageView;
        Lazy lazy = E.f123945w;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams.gravity = 17;
        Unit unit = Unit.f143329a;
        addView(imageView, layoutParams);
        a();
        b(false);
    }

    public final void b(boolean z10) {
        int iArgb;
        Integer num = this.f124028d;
        if (num != null) {
            iArgb = num.intValue();
        } else {
            NativeColor nativeColorDefaultTriggerButtonCollapsedColor = NativeSparkScanViewDefaults.defaultTriggerButtonCollapsedColor();
            Intrinsics.i(nativeColorDefaultTriggerButtonCollapsedColor, "defaultTriggerButtonCollapsedColor(...)");
            iArgb = NativeColorExtensionsKt.toInt(nativeColorDefaultTriggerButtonCollapsedColor);
        }
        int i10 = SparkScanViewScanButtonView.f124011n;
        if (z10) {
            iArgb = Color.argb(RangesKt.o((int) (Color.alpha(iArgb) * 1.25d), 0, l3.f93323c), Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
        }
        Drawable background = getBackground();
        Intrinsics.h(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(R.id.sc_spark_scan_collapsed_background);
        Intrinsics.h(drawableFindDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawableFindDrawableByLayerId).setColor(ColorStateList.valueOf(iArgb));
    }

    public final void a() {
        Integer num = this.f124029e;
        if (num != null) {
            ImageView imageView = this.f124026b;
            if (imageView != null) {
                imageView.setColorFilter(num.intValue());
                return;
            }
            return;
        }
        ImageView imageView2 = this.f124026b;
        if (imageView2 == null) {
            return;
        }
        imageView2.setColorFilter((ColorFilter) null);
    }

    public final void a(boolean z10) {
        float fFloatValue;
        if (z10) {
            fFloatValue = ((Number) E.f123934l.getValue()).floatValue();
        } else if (!z10) {
            fFloatValue = ((Number) E.f123933k.getValue()).floatValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setElevation(fFloatValue);
        b(z10);
    }
}
