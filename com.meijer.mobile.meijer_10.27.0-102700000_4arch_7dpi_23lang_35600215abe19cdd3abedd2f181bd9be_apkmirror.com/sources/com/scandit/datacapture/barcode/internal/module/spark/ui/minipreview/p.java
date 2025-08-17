package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class p implements com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x {

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f123212a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w f123213b;

    public p(RelativeLayout container) {
        Intrinsics.j(container, "container");
        this.f123212a = container;
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w(context);
        this.f123213b = wVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) (container.getWidth() * 0.05f));
        layoutParams.setMarginEnd((int) (container.getWidth() * 0.05f));
        layoutParams.topMargin = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122995y.getValue()).intValue();
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        container.addView(wVar, layoutParams);
        wVar.setElevation(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122981k.getValue()).floatValue());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void a(String text, int i10, int i11) {
        Intrinsics.j(text, "text");
        if (!G.a(this.f123212a, this.f123213b)) {
            RelativeLayout relativeLayout = this.f123212a;
            com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar = this.f123213b;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart((int) (this.f123212a.getWidth() * 0.05f));
            layoutParams.setMarginEnd((int) (this.f123212a.getWidth() * 0.05f));
            layoutParams.topMargin = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122995y.getValue()).intValue();
            layoutParams.addRule(14);
            layoutParams.addRule(10);
            relativeLayout.addView(wVar, layoutParams);
            this.f123213b.setElevation(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122981k.getValue()).floatValue());
        }
        this.f123213b.bringToFront();
        com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar2 = this.f123213b;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart((int) (this.f123212a.getWidth() * 0.05f));
        layoutParams2.setMarginEnd((int) (this.f123212a.getWidth() * 0.05f));
        layoutParams2.topMargin = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122995y.getValue()).intValue();
        layoutParams2.addRule(14);
        layoutParams2.addRule(10);
        wVar2.setLayoutParams(layoutParams2);
        this.f123213b.a(text, i10, i11);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void i() {
        com.scandit.datacapture.barcode.internal.module.spark.ui.toast.w wVar = this.f123213b;
        wVar.getClass();
        wVar.a(0.0f, new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.u(wVar));
    }
}
