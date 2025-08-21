package com.scandit.datacapture.barcode.internal.module.pick.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final int f123465d = Color.parseColor("#66000000");

    /* renamed from: e, reason: collision with root package name */
    public static final int f123466e = Color.parseColor("#CC121619");

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f123467f = LazyKt.b(c.f123434a);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f123468g = LazyKt.b(b.f123433a);

    /* renamed from: a, reason: collision with root package name */
    public final String f123469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123470b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f123471c;

    public static final void a(View view) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String textForPicking, String textForUnpicking) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(textForPicking, "textForPicking");
        Intrinsics.j(textForUnpicking, "textForUnpicking");
        this.f123469a = textForPicking;
        this.f123470b = textForUnpicking;
        setPadding(d.a(), d.a(), d.a(), d.a());
        setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.internal.module.pick.ui.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.a(view);
            }
        });
        setBackgroundColor(f123465d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(d.a(), d.a(), d.a(), d.a());
        linearLayout.setBackgroundColor(f123466e);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(8388627);
        linearLayout.setElevation(((Number) f123468g.getValue()).floatValue());
        linearLayout.addView(new ProgressBar(context), new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(new View(context), new LinearLayout.LayoutParams(d.a(), 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        this.f123471c = textView;
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        addView(linearLayout, new FrameLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.sc_loading_dialog), -2, 17));
    }
}
