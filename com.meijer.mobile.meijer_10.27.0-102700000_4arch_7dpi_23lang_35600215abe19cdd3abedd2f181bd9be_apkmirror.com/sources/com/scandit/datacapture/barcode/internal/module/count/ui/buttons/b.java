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

/* loaded from: classes11.dex */
public final class b extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f121507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        View view = new View(context, null, 0);
        view.setBackground(view.getResources().getDrawable(R.drawable.sc_button_redo_scan_ripple, context.getTheme()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        view.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setMaxWidth(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        textView.setMaxLines(2);
        textView.setHyphenationFrequency(0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        textView.setText(barcodeCountViewDefaults.getRedoScanButtonText());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(12);
        layoutParams2.addRule(14);
        textView.setLayoutParams(layoutParams2);
        this.f121507a = textView;
        setClickable(true);
        setFocusable(true);
        setContentDescription(barcodeCountViewDefaults.getRedoScanButtonContentDescription());
        addView(view);
        addView(textView);
    }
}
