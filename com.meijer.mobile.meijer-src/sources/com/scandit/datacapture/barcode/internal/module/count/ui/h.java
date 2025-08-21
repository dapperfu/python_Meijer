package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f122552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        this.f122552a = textView;
        setOrientation(0);
        setPadding(PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null));
        setBackground(getResources().getDrawable(R.drawable.sc_button_clear_ripple, context.getTheme()));
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        setContentDescription(barcodeCountViewDefaults.getClearHighlightsButtonContentDescription());
        FS.Resources_setImageResource(imageView, R.drawable.sc_ic_clear_screen);
        imageView.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null));
        layoutParams.gravity = 16;
        Unit unit = Unit.f143329a;
        addView(imageView, layoutParams);
        textView.setText(barcodeCountViewDefaults.getClearHighlightsButtonText());
        textView.setTextColor(-1);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(textView, layoutParams2);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        setAlpha(f10);
    }
}
