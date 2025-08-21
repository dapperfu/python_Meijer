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

/* loaded from: classes12.dex */
public final class d extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f124256g = LazyKt.b(b.f124255a);

    /* renamed from: a, reason: collision with root package name */
    public int f124257a;

    /* renamed from: b, reason: collision with root package name */
    public int f124258b;

    /* renamed from: c, reason: collision with root package name */
    public int f124259c;

    /* renamed from: d, reason: collision with root package name */
    public int f124260d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f124261e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f124262f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        this.f124259c = 784453375;
        this.f124260d = -1746868481;
        setOrientation(0);
        setGravity(16);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setIndeterminate(false);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, PixelExtensionsKt.pxFromDp$default(7, (Context) null, 1, (Object) null), 1.0f));
        progressBar.setProgressDrawable(a());
        progressBar.setImportantForAccessibility(2);
        addView(progressBar);
        this.f124261e = progressBar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(36, (Context) null, 1, (Object) null), -2);
        layoutParams.leftMargin = PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(8388613);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        addView(textView);
        this.f124262f = textView;
    }

    public final LayerDrawable a() {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = ((Number) f124256g.getValue()).floatValue();
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(872415231);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.f124259c, this.f124260d});
        gradientDrawable.setCornerRadius(((Number) f124256g.getValue()).floatValue());
        gradientDrawable.setGradientType(0);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, new ScaleDrawable(gradientDrawable, 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public final void b() {
        this.f124261e.setProgressDrawable(a());
        this.f124261e.setMax(this.f124258b);
        this.f124261e.setProgress(this.f124257a, true);
        TextView textView = this.f124262f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
        String string = getContext().getString(com.scandit.datacapture.barcode.R.string.sc_progressbar_count_format);
        Intrinsics.i(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f124257a), Integer.valueOf(this.f124258b)}, 2));
        Intrinsics.i(str, "format(...)");
        textView.setText(str);
        setContentDescription(getResources().getString(com.scandit.datacapture.barcode.R.string.sc_progress_bar_content_description, Integer.valueOf(this.f124257a), Integer.valueOf(this.f124258b)));
    }
}
