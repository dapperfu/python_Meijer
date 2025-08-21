package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class p implements com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x {

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f124164a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w f124165b;

    public p(RelativeLayout container) {
        Intrinsics.j(container, "container");
        this.f124164a = container;
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w(context);
        this.f124165b = wVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) (container.getWidth() * 0.05f));
        layoutParams.setMarginEnd((int) (container.getWidth() * 0.05f));
        layoutParams.topMargin = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123947y.getValue()).intValue();
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        container.addView(wVar, layoutParams);
        wVar.setElevation(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123933k.getValue()).floatValue());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void a(String text, int i10, int i11) {
        Intrinsics.j(text, "text");
        if (!G.a(this.f124164a, this.f124165b)) {
            RelativeLayout relativeLayout = this.f124164a;
            com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar = this.f124165b;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart((int) (this.f124164a.getWidth() * 0.05f));
            layoutParams.setMarginEnd((int) (this.f124164a.getWidth() * 0.05f));
            layoutParams.topMargin = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123947y.getValue()).intValue();
            layoutParams.addRule(14);
            layoutParams.addRule(10);
            relativeLayout.addView(wVar, layoutParams);
            this.f124165b.setElevation(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123933k.getValue()).floatValue());
        }
        this.f124165b.bringToFront();
        com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar2 = this.f124165b;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart((int) (this.f124164a.getWidth() * 0.05f));
        layoutParams2.setMarginEnd((int) (this.f124164a.getWidth() * 0.05f));
        layoutParams2.topMargin = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123947y.getValue()).intValue();
        layoutParams2.addRule(14);
        layoutParams2.addRule(10);
        wVar2.setLayoutParams(layoutParams2);
        this.f124165b.a(text, i10, i11);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void i() {
        com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar = this.f124165b;
        wVar.getClass();
        wVar.a(0.0f, new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.u(wVar));
    }
}
