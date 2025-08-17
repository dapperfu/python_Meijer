package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class l extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final k f121698a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f121699b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f121700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        k kVar = new k(context, null, 0);
        kVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f121698a = kVar;
        addView(kVar);
        TextView textView = new TextView(context, null, 0);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        b.a(textView);
        this.f121699b = textView;
        addView(textView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f121700c) {
            k.a(this.f121698a);
        }
    }
}
