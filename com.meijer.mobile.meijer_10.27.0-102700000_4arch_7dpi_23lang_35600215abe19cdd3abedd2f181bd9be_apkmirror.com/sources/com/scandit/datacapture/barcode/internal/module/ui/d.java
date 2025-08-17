package com.scandit.datacapture.barcode.internal.module.ui;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes11.dex */
public final class d extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f123304g = LazyKt.b(b.f123303a);

    /* renamed from: a, reason: collision with root package name */
    public int f123305a;

    /* renamed from: b, reason: collision with root package name */
    public int f123306b;

    /* renamed from: c, reason: collision with root package name */
    public int f123307c;

    /* renamed from: d, reason: collision with root package name */
    public int f123308d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f123309e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f123310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        this.f123307c = 784453375;
        this.f123308d = -1746868481;
        setOrientation(0);
        setGravity(16);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setIndeterminate(false);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, PixelExtensionsKt.pxFromDp$default(7, (Context) null, 1, (Object) null), 1.0f));
        progressBar.setProgressDrawable(a());
        progressBar.setImportantForAccessibility(2);
        addView(progressBar);
        this.f123309e = progressBar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(36, (Context) null, 1, (Object) null), -2);
        layoutParams.leftMargin = PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(8388613);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        addView(textView);
        this.f123310f = textView;
    }

    public final LayerDrawable a() {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = ((Number) f123304g.getValue()).floatValue();
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(872415231);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.f123307c, this.f123308d});
        gradientDrawable.setCornerRadius(((Number) f123304g.getValue()).floatValue());
        gradientDrawable.setGradientType(0);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, new ScaleDrawable(gradientDrawable, 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public final void b() {
        this.f123309e.setProgressDrawable(a());
        this.f123309e.setMax(this.f123306b);
        this.f123309e.setProgress(this.f123305a, true);
        TextView textView = this.f123310f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String string = getContext().getString(com.scandit.datacapture.barcode.R.string.sc_progressbar_count_format);
        Intrinsics.i(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f123305a), Integer.valueOf(this.f123306b)}, 2));
        Intrinsics.i(str, "format(...)");
        textView.setText(str);
        setContentDescription(getResources().getString(com.scandit.datacapture.barcode.R.string.sc_progress_bar_content_description, Integer.valueOf(this.f123305a), Integer.valueOf(this.f123306b)));
    }
}
