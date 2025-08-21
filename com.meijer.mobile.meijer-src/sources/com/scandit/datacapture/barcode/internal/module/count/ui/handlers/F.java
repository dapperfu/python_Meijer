package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f122558a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j10) {
        super(0);
        this.f122558a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122558a.f122582p.clearHighlights();
        BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener = this.f122558a.f122586t;
        if (barcodeCountViewInternalUiListener != null) {
            barcodeCountViewInternalUiListener.onClearButtonTapped();
        }
        return Unit.f143329a;
    }
}
