package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f122941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var) {
        super(1);
        this.f122941a = h1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        h1 h1Var = this.f122941a;
        h1Var.getClass();
        BarcodeCountToolbarView barcodeCountToolbarView = new BarcodeCountToolbarView(it, new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.c(h1Var.f122965a.getBoolean("barcode_count_toolbar_audio_feedback_key", false), h1Var.f122965a.getBoolean("barcode_count_toolbar_haptic_feedback_key", false), h1Var.f122965a.getBoolean("barcode_count_toolbar_strap_mode_key", false), h1Var.f122965a.getBoolean("barcode_count_toolbar_color_scheme_key", false)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        barcodeCountToolbarView.a(new d1(h1Var));
        barcodeCountToolbarView.setLayoutParams(layoutParams);
        h1Var.f122970f = barcodeCountToolbarView;
        h1 h1Var2 = this.f122941a;
        BarcodeCountToolbarView barcodeCountToolbarView2 = h1Var2.f122970f;
        if (barcodeCountToolbarView2 != null) {
            barcodeCountToolbarView2.a(h1Var2.f122969e);
        }
        return barcodeCountToolbarView;
    }
}
