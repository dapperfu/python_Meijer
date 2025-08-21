package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.AbstractC13274u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class z extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f122632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(J j10) {
        super(1);
        this.f122632a = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeCountView barcodeCountView;
        BarcodeCountInternalModePresenter barcodeCountInternalModePresenter;
        if (((Boolean) obj).booleanValue()) {
            BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener = this.f122632a.f122586t;
            if (barcodeCountViewInternalUiListener != null) {
                barcodeCountViewInternalUiListener.onFloatingShutterButtonTapped();
            }
        } else {
            BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener2 = this.f122632a.f122586t;
            if (barcodeCountViewInternalUiListener2 != null) {
                barcodeCountViewInternalUiListener2.onShutterButtonTapped();
            }
        }
        AbstractC13274u0.b(this.f122632a.f122567a, false);
        this.f122632a.m();
        t tVar = this.f122632a.f122585s;
        if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) != null && (barcodeCountInternalModePresenter = barcodeCountView.f121790h) != null) {
            barcodeCountInternalModePresenter.d();
        }
        return Unit.f143329a;
    }
}
