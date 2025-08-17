package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f121144a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f121145b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f121146c;

    public final void a() {
        CharSequence text = this.f121144a.getText();
        if (text == null || text.length() == 0) {
            return;
        }
        this.f121144a.measure(0, 0);
        int i10 = this.f121144a.getLayoutParams().width;
        int measuredWidth = this.f121146c ? this.f121144a.getMeasuredWidth() + ((Number) l.f121160d.getValue()).intValue() : 0;
        this.f121146c = !this.f121146c;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, measuredWidth);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ht.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.a.a(this.f13252a, valueAnimator);
            }
        });
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.start();
    }

    public a(Context context, Barcode barcode) {
        TextView textView = new TextView(context);
        ImageView iconView = new ImageView(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(textView, "textView");
        Intrinsics.j(iconView, "iconView");
        super(context);
        this.f121144a = textView;
        this.f121145b = iconView;
        this.f121146c = true;
        setId(R.id.sc_ar_status_icon_text_container);
        setOrientation(0);
        setGravity(17);
        setElevation(((Number) l.f121157a.getValue()).floatValue());
        setContentDescription(getResources().getString(R.string.sc_barcode_ar_annotation_status_icon_content_description, barcode.getData()));
        setBackgroundResource(R.drawable.sc_barcode_ar_status_icon_view_background);
        iconView.setId(R.id.sc_ar_status_icon_image);
        Lazy lazy = l.f121158b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        Lazy lazy2 = l.f121159c;
        layoutParams.topMargin = ((Number) lazy2.getValue()).intValue();
        layoutParams.bottomMargin = ((Number) lazy2.getValue()).intValue();
        layoutParams.setMarginEnd(((Number) lazy2.getValue()).intValue());
        layoutParams.setMarginStart(((Number) lazy2.getValue()).intValue());
        Unit unit = Unit.f142422a;
        addView(iconView, layoutParams);
        textView.setId(R.id.sc_ar_status_icon_text);
        textView.setTextSize(15.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setHorizontallyScrolling(true);
        textView.setMaxLines(1);
        addView(textView, new LinearLayout.LayoutParams(0, -2));
        ViewExtensionsKt.addRippleForeground(this);
    }

    public static final void a(a this$0, ValueAnimator animation) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(animation, "animation");
        ViewGroup.LayoutParams layoutParams = this$0.f121144a.getLayoutParams();
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        this$0.f121144a.requestLayout();
    }
}
