package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class G extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f121607a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j10) {
        super(0);
        this.f121607a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeCountView barcodeCountView;
        BarcodeCountViewUiListener uiListener;
        t tVar = this.f121607a.f121633s;
        if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) != null && (uiListener = barcodeCountView.getUiListener()) != null) {
            uiListener.onSingleScanButtonTapped(barcodeCountView);
        }
        return Unit.f142422a;
    }
}
