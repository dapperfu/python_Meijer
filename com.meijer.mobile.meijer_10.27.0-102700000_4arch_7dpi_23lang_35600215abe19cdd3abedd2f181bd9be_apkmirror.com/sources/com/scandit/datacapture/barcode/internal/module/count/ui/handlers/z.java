package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.AbstractC13141u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class z extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f121680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(J j10) {
        super(1);
        this.f121680a = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeCountView barcodeCountView;
        BarcodeCountInternalModePresenter barcodeCountInternalModePresenter;
        if (((Boolean) obj).booleanValue()) {
            BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener = this.f121680a.f121634t;
            if (barcodeCountViewInternalUiListener != null) {
                barcodeCountViewInternalUiListener.onFloatingShutterButtonTapped();
            }
        } else {
            BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener2 = this.f121680a.f121634t;
            if (barcodeCountViewInternalUiListener2 != null) {
                barcodeCountViewInternalUiListener2.onShutterButtonTapped();
            }
        }
        AbstractC13141u0.b(this.f121680a.f121615a, false);
        this.f121680a.m();
        t tVar = this.f121680a.f121633s;
        if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) != null && (barcodeCountInternalModePresenter = barcodeCountView.f120838h) != null) {
            barcodeCountInternalModePresenter.d();
        }
        return Unit.f142422a;
    }
}
