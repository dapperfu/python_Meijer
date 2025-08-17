package com.scandit.datacapture.barcode.internal.module.ui.exitbutton;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f123328a = LazyKt.b(g.f123326a);

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f123329b = LazyKt.b(h.f123327a);

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        c view2 = (c) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (parent.getHeight() >= parent.getWidth()) {
            view2.setGravity(16);
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.d.f123412a;
            layoutParams.addRule(6, ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(8, ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(1, ((Number) lazy.getValue()).intValue());
            layoutParams.setMargins(((Number) f123329b.getValue()).intValue(), 0, 0, 0);
        } else {
            view2.setGravity(1);
            Lazy lazy2 = com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.d.f123412a;
            layoutParams.addRule(5, ((Number) lazy2.getValue()).intValue());
            layoutParams.addRule(7, ((Number) lazy2.getValue()).intValue());
            layoutParams.addRule(2, ((Number) lazy2.getValue()).intValue());
            layoutParams.setMargins(0, 0, 0, ((Number) f123328a.getValue()).intValue());
        }
        view2.setLayoutParams(layoutParams);
    }
}
