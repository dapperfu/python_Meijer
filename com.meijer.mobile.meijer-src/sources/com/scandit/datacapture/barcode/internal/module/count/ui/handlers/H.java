package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f122560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j10) {
        super(0);
        this.f122560a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        J j10 = this.f122560a;
        j10.f122564C = !j10.f122564C;
        BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener = j10.f122586t;
        if (barcodeCountViewInternalUiListener != null) {
            barcodeCountViewInternalUiListener.onStatusButtonTapped();
        }
        J j11 = this.f122560a;
        t tVar = j11.f122585s;
        if (tVar != null) {
            boolean z10 = j11.f122564C;
            BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get();
            if (barcodeCountView != null) {
                barcodeCountView.a(z10);
            }
        }
        J j12 = this.f122560a;
        j12.f122582p.setStatusModeEnabled$scandit_barcode_capture(j12.f122564C);
        return Unit.f143329a;
    }
}
