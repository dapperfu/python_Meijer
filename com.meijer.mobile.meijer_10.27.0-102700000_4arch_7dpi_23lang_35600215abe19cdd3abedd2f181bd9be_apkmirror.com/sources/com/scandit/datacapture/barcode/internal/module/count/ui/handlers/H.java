package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f121608a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j10) {
        super(0);
        this.f121608a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        J j10 = this.f121608a;
        j10.f121612C = !j10.f121612C;
        BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener = j10.f121634t;
        if (barcodeCountViewInternalUiListener != null) {
            barcodeCountViewInternalUiListener.onStatusButtonTapped();
        }
        J j11 = this.f121608a;
        t tVar = j11.f121633s;
        if (tVar != null) {
            boolean z10 = j11.f121612C;
            BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get();
            if (barcodeCountView != null) {
                barcodeCountView.a(z10);
            }
        }
        J j12 = this.f121608a;
        j12.f121630p.setStatusModeEnabled$scandit_barcode_capture(j12.f121612C);
        return Unit.f142422a;
    }
}
