package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class D extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f121604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(J j10) {
        super(0);
        this.f121604a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeCountView barcodeCountView;
        BarcodeCountInternalModePresenter barcodeCountInternalModePresenter;
        t tVar = this.f121604a.f121633s;
        if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) != null && (barcodeCountInternalModePresenter = barcodeCountView.f120838h) != null) {
            barcodeCountInternalModePresenter.c();
        }
        return Unit.f142422a;
    }
}
