package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f121993a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var) {
        super(1);
        this.f121993a = h1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        h1 h1Var = this.f121993a;
        BarcodeCountToolbarView barcodeCountToolbarView = h1Var.f122018f;
        if (barcodeCountToolbarView != null) {
            barcodeCountToolbarView.a(new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.c(h1Var.f122013a.getBoolean("barcode_count_toolbar_audio_feedback_key", false), h1Var.f122013a.getBoolean("barcode_count_toolbar_haptic_feedback_key", false), h1Var.f122013a.getBoolean("barcode_count_toolbar_strap_mode_key", false), h1Var.f122013a.getBoolean("barcode_count_toolbar_color_scheme_key", false)));
        }
        return Unit.f142422a;
    }
}
