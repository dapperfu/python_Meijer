package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArBodyElementRowDataHolder;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent;
import com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.i;
import com.scandit.datacapture.core.internal.sdk.ui.icon.ScanditIconUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class i extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final h f122046a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f122047b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f122048c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f122049d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f122043f = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(i.class, "data", "getData()Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArBodyElementRowDataHolder;", 0)};

    /* renamed from: e, reason: collision with root package name */
    public static final f f122042e = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f122044g = LazyKt.b(d.f122038a);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f122045h = LazyKt.b(e.f122039a);

    public final BarcodeArBodyElementRowDataHolder a() {
        return (BarcodeArBodyElementRowDataHolder) this.f122046a.getValue(this, f122043f[0]);
    }

    public final void b() {
        String text;
        int i10;
        BarcodeArInfoAnnotationBodyComponent bodyElement = a().getBodyElement();
        CharSequence styledText = bodyElement.getStyledText();
        if (styledText == null || styledText.length() == 0) {
            this.f122049d.setText(bodyElement.getText());
            this.f122049d.setTextColor(bodyElement.getTextColor());
            this.f122049d.setTypeface(bodyElement.getTypeface());
            this.f122049d.setTextSize(bodyElement.getTextSize());
            this.f122049d.setTextAlignment(bodyElement.getTextAlignment());
        } else {
            this.f122049d.setText(bodyElement.getStyledText());
        }
        a(a().getBodyElement());
        b(a().getBodyElement());
        BarcodeArInfoAnnotationBodyComponent bodyElement2 = a().getBodyElement();
        boolean z10 = bodyElement2.getLeftIcon() != null;
        boolean z11 = bodyElement2.getRightIcon() != null;
        CharSequence styledText2 = bodyElement2.getStyledText();
        boolean z12 = ((styledText2 == null || styledText2.length() == 0) && ((text = bodyElement2.getText()) == null || text.length() == 0)) ? false : true;
        ViewGroup.LayoutParams layoutParams = this.f122047b.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.f122048c.getLayoutParams();
        Intrinsics.h(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        ViewGroup.LayoutParams layoutParams5 = this.f122049d.getLayoutParams();
        Intrinsics.h(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams2.removeRule(0);
        layoutParams2.removeRule(1);
        layoutParams2.removeRule(14);
        layoutParams2.removeRule(9);
        layoutParams2.removeRule(11);
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        layoutParams4.removeRule(0);
        layoutParams4.removeRule(1);
        layoutParams4.removeRule(14);
        layoutParams4.removeRule(9);
        layoutParams4.removeRule(11);
        layoutParams4.leftMargin = 0;
        layoutParams4.rightMargin = 0;
        layoutParams6.removeRule(0);
        layoutParams6.removeRule(1);
        layoutParams6.removeRule(14);
        layoutParams6.removeRule(9);
        layoutParams6.removeRule(11);
        layoutParams6.leftMargin = 0;
        layoutParams6.rightMargin = 0;
        if (z12) {
            layoutParams2.addRule(9, z10 ? -1 : 0);
            layoutParams4.addRule(11, z11 ? -1 : 0);
            int i11 = g.f122040a[a().getWidth().ordinal()];
            if (i11 == 1 || i11 == 2) {
                i10 = 8;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 12;
            }
            int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(i10, (Context) null, 1, (Object) null);
            layoutParams6.leftMargin = !z10 ? 0 : iPxFromDp$default;
            if (!z11) {
                iPxFromDp$default = 0;
            }
            layoutParams6.rightMargin = iPxFromDp$default;
            if (z10) {
                layoutParams6.addRule(1, R.id.sc_ar_info_annotation_body_left_icon);
            }
            if (z11) {
                layoutParams6.addRule(0, R.id.sc_ar_info_annotation_body_right_icon);
            }
        } else if (z10 && z11) {
            layoutParams2.addRule(0, R.id.sc_ar_info_annotation_body_center_guide);
            layoutParams4.addRule(1, R.id.sc_ar_info_annotation_body_center_guide);
            f122042e.getClass();
            Lazy lazy = f122045h;
            layoutParams2.rightMargin = ((Number) lazy.getValue()).intValue() / 2;
            layoutParams4.leftMargin = ((Number) lazy.getValue()).intValue() / 2;
        } else if (z10) {
            layoutParams2.addRule(14);
        } else if (z11) {
            layoutParams4.addRule(14);
        }
        int paddingAndCornerRadius$scandit_barcode_capture = (int) a().getWidth().toPaddingAndCornerRadius$scandit_barcode_capture();
        ViewGroup.LayoutParams layoutParams7 = getLayoutParams();
        LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.setMargins(paddingAndCornerRadius$scandit_barcode_capture, 0, paddingAndCornerRadius$scandit_barcode_capture, 0);
        }
        BarcodeArBodyElementRowDataHolder barcodeArBodyElementRowDataHolderA = a();
        ImageView imageView = this.f122047b;
        if (barcodeArBodyElementRowDataHolderA.isEntireAnnotationTappable()) {
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setImportantForAccessibility(1);
            imageView.setContentDescription(imageView.getResources().getString(R.string.sc_barcode_ar_annotation_info_body_left_icon_content_description));
        }
        ImageView imageView2 = this.f122048c;
        if (barcodeArBodyElementRowDataHolderA.isEntireAnnotationTappable()) {
            imageView2.setImportantForAccessibility(2);
        } else {
            imageView2.setImportantForAccessibility(1);
            imageView2.setContentDescription(imageView2.getResources().getString(R.string.sc_barcode_ar_annotation_info_body_right_icon_content_description));
        }
        TextView textView = this.f122049d;
        if (barcodeArBodyElementRowDataHolderA.isEntireAnnotationTappable()) {
            textView.setImportantForAccessibility(2);
        } else {
            textView.setContentDescription(textView.getResources().getString(R.string.sc_barcode_ar_annotation_info_body_content_description, barcodeArBodyElementRowDataHolderA.getBodyElement().getText()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, BarcodeArBodyElementRowDataHolder initialRowDataHolder) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(initialRowDataHolder, "initialRowDataHolder");
        Delegates delegates = Delegates.f143781a;
        this.f122046a = new h(initialRowDataHolder, this);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.sc_ar_info_annotation_body_left_icon);
        this.f122047b = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.sc_ar_info_annotation_body_right_icon);
        this.f122048c = imageView2;
        TextView textView = new TextView(context);
        textView.setId(R.id.sc_ar_info_annotation_body_text_view);
        this.f122049d = textView;
        View view = new View(context);
        view.setId(R.id.sc_ar_info_annotation_body_center_guide);
        f122042e.getClass();
        Lazy lazy = f122044g;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams.addRule(15);
        Unit unit = Unit.f143329a;
        addView(imageView, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams2.addRule(15);
        addView(imageView2, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(15);
        addView(textView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(1, 1);
        layoutParams4.addRule(14);
        addView(view, layoutParams4);
        b();
    }

    public final void a(BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent) {
        this.f122047b.setVisibility(barcodeArInfoAnnotationBodyComponent.getLeftIcon() == null ? 8 : 0);
        boolean z10 = !a().isEntireAnnotationTappable() && a().getBodyElement().isLeftIconTappable();
        ScanditIcon leftIcon = barcodeArInfoAnnotationBodyComponent.getLeftIcon();
        if (leftIcon != null) {
            ImageView imageView = this.f122047b;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(z10 ? getContext().getColor(com.scandit.datacapture.core.R.color.sc_default_ripple) : 0);
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            imageView.setImageDrawable(new RippleDrawable(colorStateListValueOf, ScanditIconUtilsKt.getDrawable(leftIcon, context), null));
        }
        this.f122047b.setOnClickListener(new View.OnClickListener() { // from class: Gt.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.a(this.f13242a, view);
            }
        });
        this.f122047b.setClickable(z10);
    }

    public static final void a(i this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.a().getIconTapped().invoke(Boolean.TRUE);
    }

    public final void b(BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent) {
        this.f122048c.setVisibility(barcodeArInfoAnnotationBodyComponent.getRightIcon() == null ? 8 : 0);
        boolean z10 = !a().isEntireAnnotationTappable() && a().getBodyElement().isRightIconTappable();
        ScanditIcon rightIcon = barcodeArInfoAnnotationBodyComponent.getRightIcon();
        if (rightIcon != null) {
            ImageView imageView = this.f122048c;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(z10 ? getContext().getColor(com.scandit.datacapture.core.R.color.sc_default_ripple) : 0);
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            imageView.setImageDrawable(new RippleDrawable(colorStateListValueOf, ScanditIconUtilsKt.getDrawable(rightIcon, context), null));
        }
        this.f122048c.setOnClickListener(new View.OnClickListener() { // from class: Gt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.b(this.f13241a, view);
            }
        });
        this.f122048c.setClickable(z10);
    }

    public static final void b(i this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.a().getIconTapped().invoke(Boolean.FALSE);
    }
}
