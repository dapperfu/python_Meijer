package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class E extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f122557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(J j10) {
        super(0);
        this.f122557a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeCountView barcodeCountView;
        BarcodeCountInternalModePresenter barcodeCountInternalModePresenter;
        t tVar = this.f122557a.f122585s;
        if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) != null && (barcodeCountInternalModePresenter = barcodeCountView.f121790h) != null) {
            barcodeCountInternalModePresenter.c();
        }
        return Unit.f143329a;
    }
}
