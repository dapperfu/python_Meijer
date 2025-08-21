package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13387g;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.ui.popover.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13387g extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f124338d = LazyKt.b(C13381a.f124333a);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f124339e = LazyKt.b(C13382b.f124334a);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f124340f = LazyKt.b(C13383c.f124335a);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f124341g = LazyKt.b(C13385e.f124337a);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f124342h = LazyKt.b(C13384d.f124336a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f124343a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f124344b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f124345c;

    public final void a(LinearPopoverButtonViewSettings buttonSettings) {
        Intrinsics.j(buttonSettings, "buttonSettings");
        TextView textView = this.f124345c;
        textView.setTextColor(buttonSettings.f());
        textView.setTypeface(buttonSettings.i());
        textView.setTextSize(2, buttonSettings.g());
        this.f124344b.setImageDrawable(buttonSettings.d());
        String value = buttonSettings.h();
        Intrinsics.j(value, "value");
        this.f124345c.setText(value);
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
                C13387g.a(this.f42667a, view);
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
    public C13387g(Context context, C13391k onClick) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(onClick, "onClick");
        this.f124343a = onClick;
        ImageView imageView = new ImageView(context);
        this.f124344b = imageView;
        TextView textView = new TextView(context);
        this.f124345c = textView;
        setOrientation(1);
        setGravity(16);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        Lazy lazy = f124339e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams.gravity = 1;
        Unit unit = Unit.f143329a;
        addView(imageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ((Number) f124340f.getValue()).intValue();
        Lazy lazy2 = f124342h;
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

    public static final void a(C13387g this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f124343a.invoke();
    }
}
