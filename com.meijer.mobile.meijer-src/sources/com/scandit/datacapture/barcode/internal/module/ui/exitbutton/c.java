package com.scandit.datacapture.barcode.internal.module.ui.exitbutton;

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
    public final View f124269a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f124270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        View view = new View(context, null, 0);
        view.setBackground(view.getResources().getDrawable(R.drawable.sc_button_exit_ripple, context.getTheme()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        view.setLayoutParams(layoutParams);
        this.f124269a = view;
        TextView textView = new TextView(context);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setMaxWidth(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        textView.setMaxLines(1);
        textView.setHyphenationFrequency(0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(BarcodeCountViewDefaults.INSTANCE.getExitButtonText());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(12);
        layoutParams2.addRule(14);
        textView.setLayoutParams(layoutParams2);
        this.f124270b = textView;
        setClickable(true);
        setFocusable(true);
        setContentDescription(context.getString(R.string.sc_button_exit_contentDescription));
        addView(view);
        addView(textView);
    }
}
