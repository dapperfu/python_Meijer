package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final View f121687a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f121688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        View view = new View(context, null, 0);
        view.setBackground(view.getResources().getDrawable(R.drawable.sc_button_list_ripple, context.getTheme()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        view.setLayoutParams(layoutParams);
        view.setId(View.generateViewId());
        this.f121687a = view;
        TextView textView = new TextView(context);
        textView.setBackground(textView.getResources().getDrawable(R.drawable.sc_button_list_badge, context.getTheme()));
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(1, (Context) null, 1, (Object) null);
        textView.setPadding(iPxFromDp$default, iPxFromDp$default, iPxFromDp$default, iPxFromDp$default);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, view.getId());
        layoutParams2.addRule(6, view.getId());
        textView.setLayoutParams(layoutParams2);
        textView.setVisibility(8);
        this.f121688b = textView;
        setClickable(true);
        setFocusable(true);
        setContentDescription(BarcodeCountViewDefaults.INSTANCE.getListButtonContentDescription());
        addView(view);
        addView(textView);
    }

    public final void a(int i10) {
        if (i10 <= 0) {
            this.f121688b.setText("0");
            this.f121688b.setVisibility(8);
            return;
        }
        this.f121688b.setVisibility(0);
        String strValueOf = String.valueOf(i10);
        if (strValueOf.length() > 3) {
            this.f121688b.setText(getResources().getString(R.string.sc_button_list_badge_max, Integer.valueOf(((int) Math.pow(10.0d, 3)) - 1)));
        } else {
            this.f121688b.setText(strValueOf);
        }
        int length = strValueOf.length();
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(length != 1 ? length != 2 ? length != 3 ? -14 : -12 : -10 : -8, (Context) null, 1, (Object) null);
        int iPxFromDp$default2 = PixelExtensionsKt.pxFromDp$default(length != 1 ? length != 2 ? length != 3 ? 38 : 27 : 20 : 18, (Context) null, 1, (Object) null);
        TextView textView = this.f121688b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iPxFromDp$default2, -2);
        layoutParams.setMarginStart(iPxFromDp$default);
        layoutParams.addRule(17, this.f121687a.getId());
        layoutParams.addRule(6, this.f121687a.getId());
        textView.setLayoutParams(layoutParams);
    }
}
