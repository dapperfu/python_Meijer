package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f122554a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(J j10) {
        super(0);
        this.f122554a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t tVar;
        BarcodeCountView barcodeCountView;
        this.f122554a.f122582p.exitButtonPressed();
        if (this.f122554a.f122591y.m() && (tVar = this.f122554a.f122585s) != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) != null) {
            barcodeCountView.disableScanningAndResetBarcodeIndicators$scandit_barcode_capture();
        }
        return Unit.f143329a;
    }
}
