package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArHeaderFooterElementDataHolder;
import com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.p;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.icon.ScanditIconUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class p extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f121104c = LazyKt.b(m.f121102a);

    /* renamed from: a, reason: collision with root package name */
    public final TextView f121105a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f121106b;

    public static final void a(BarcodeArHeaderFooterElementDataHolder barcodeArHeaderFooterElementDataHolder, View view) {
        barcodeArHeaderFooterElementDataHolder.getElementTapped().invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        setOrientation(0);
        setGravity(17);
        ImageView imageView = new ImageView(context);
        Lazy lazy = f121104c;
        addView(imageView, new LinearLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue()));
        this.f121106b = imageView;
        TextView textView = new TextView(context);
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
        this.f121105a = textView;
    }

    public final void a(final BarcodeArHeaderFooterElementDataHolder barcodeArHeaderFooterElementDataHolder) {
        int iPxFromDp$default;
        if (barcodeArHeaderFooterElementDataHolder == null) {
            setVisibility(8);
            return;
        }
        TextView textView = this.f121105a;
        textView.setText(barcodeArHeaderFooterElementDataHolder.getText());
        textView.setTypeface(barcodeArHeaderFooterElementDataHolder.getTypeface());
        textView.setTextSize(barcodeArHeaderFooterElementDataHolder.getTextSize());
        textView.setTextColor(barcodeArHeaderFooterElementDataHolder.getTextColor());
        if (!barcodeArHeaderFooterElementDataHolder.isEntireAnnotationTappable()) {
            setContentDescription(getResources().getString(R.string.sc_barcode_ar_annotation_info_header_footer_content_description, barcodeArHeaderFooterElementDataHolder.getText()));
        }
        if (barcodeArHeaderFooterElementDataHolder.getIcon() != null) {
            ImageView imageView = this.f121106b;
            ScanditIcon icon = barcodeArHeaderFooterElementDataHolder.getIcon();
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            imageView.setImageDrawable(ScanditIconUtilsKt.getDrawable(icon, context));
            this.f121106b.setVisibility(0);
        } else {
            this.f121106b.setVisibility(8);
            this.f121106b.setImageDrawable(null);
        }
        String text = barcodeArHeaderFooterElementDataHolder.getText();
        boolean z10 = text == null || text.length() == 0;
        boolean z11 = barcodeArHeaderFooterElementDataHolder.getIcon() != null;
        ViewGroup.LayoutParams layoutParams = this.f121106b.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = 0;
        } else {
            layoutParams2 = null;
        }
        if (!z10 && z11 && layoutParams2 != null) {
            int i10 = o.f121103a[barcodeArHeaderFooterElementDataHolder.getWidth().ordinal()];
            if (i10 == 1 || i10 == 2) {
                iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null);
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null);
            }
            layoutParams2.rightMargin = iPxFromDp$default;
        }
        setOnClickListener(new View.OnClickListener() { // from class: Gt.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.a(barcodeArHeaderFooterElementDataHolder, view);
            }
        });
        setClickable(!barcodeArHeaderFooterElementDataHolder.isEntireAnnotationTappable());
        if (isClickable()) {
            ViewExtensionsKt.addRippleForeground(this);
        } else {
            setForeground(null);
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        int paddingAndCornerRadius$scandit_barcode_capture = (int) barcodeArHeaderFooterElementDataHolder.getWidth().toPaddingAndCornerRadius$scandit_barcode_capture();
        setPadding(paddingAndCornerRadius$scandit_barcode_capture, paddingAndCornerRadius$scandit_barcode_capture, paddingAndCornerRadius$scandit_barcode_capture, paddingAndCornerRadius$scandit_barcode_capture);
        setLayoutParams(layoutParams3);
        setBackgroundColor(barcodeArHeaderFooterElementDataHolder.getBackgroundColor());
        setVisibility(0);
    }
}
