package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13254g;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.ui.popover.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13254g extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f123386d = LazyKt.b(C13248a.f123381a);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f123387e = LazyKt.b(C13249b.f123382a);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f123388f = LazyKt.b(C13250c.f123383a);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f123389g = LazyKt.b(C13252e.f123385a);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f123390h = LazyKt.b(C13251d.f123384a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123391a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f123392b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f123393c;

    public final void a(LinearPopoverButtonViewSettings buttonSettings) {
        Intrinsics.j(buttonSettings, "buttonSettings");
        TextView textView = this.f123393c;
        textView.setTextColor(buttonSettings.f());
        textView.setTypeface(buttonSettings.i());
        textView.setTextSize(2, buttonSettings.g());
        this.f123392b.setImageDrawable(buttonSettings.d());
        String value = buttonSettings.h();
        Intrinsics.j(value, "value");
        this.f123393c.setText(value);
        setContentDescription(buttonSettings.b());
        if (buttonSettings.b() == null) {
            setImportantForAccessibility(2);
        }
        Integer numA = buttonSettings.a();
        if (numA != null) {
            setBackgroundColor(numA.intValue());
        }
        setEnabled(buttonSettings.c());
        setOnClickListener(new View.OnClickListener() { // from class: Xt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13254g.a(this.f39818a, view);
            }
        });
        setClickable(buttonSettings.j());
        if (buttonSettings.j()) {
            ViewExtensionsKt.addRippleForeground(this);
        } else {
            setForeground(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13254g(Context context, C13258k onClick) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(onClick, "onClick");
        this.f123391a = onClick;
        ImageView imageView = new ImageView(context);
        this.f123392b = imageView;
        TextView textView = new TextView(context);
        this.f123393c = textView;
        setOrientation(1);
        setGravity(16);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        Lazy lazy = f123387e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams.gravity = 1;
        Unit unit = Unit.f142422a;
        addView(imageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ((Number) f123388f.getValue()).intValue();
        Lazy lazy2 = f123390h;
        layoutParams2.setMarginStart(((Number) lazy2.getValue()).intValue());
        layoutParams2.setMarginEnd(((Number) lazy2.getValue()).intValue());
        addView(textView, layoutParams2);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.3f;
        }
        setAlpha(f10);
    }

    public static final void a(C13254g this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123391a.invoke();
    }
}
