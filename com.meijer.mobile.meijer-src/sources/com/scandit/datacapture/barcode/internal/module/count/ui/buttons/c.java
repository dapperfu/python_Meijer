package com.scandit.datacapture.barcode.internal.module.count.ui.buttons;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final View f122460a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f122461b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        View view = new View(context, null, 0);
        view.setBackground(view.getResources().getDrawable(R.drawable.sc_button_restart, context.getTheme()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        view.setLayoutParams(layoutParams);
        this.f122460a = view;
        TextView textView = new TextView(context);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(textView.getResources().getColorStateList(R.color.sc_round_button_text, context.getTheme()));
        textView.setGravity(17);
        textView.setMaxWidth(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        textView.setMaxLines(2);
        textView.setHyphenationFrequency(0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        textView.setText(barcodeCountViewDefaults.getRestartButtonText());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.addRule(14);
        textView.setLayoutParams(layoutParams2);
        this.f122461b = textView;
        setClickable(true);
        setFocusable(true);
        setContentDescription(barcodeCountViewDefaults.getRestartButtonContentDescription());
        addView(view);
        addView(textView);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f122460a.setEnabled(z10);
        this.f122461b.setEnabled(z10);
    }
}
