package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f121606a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j10) {
        super(0);
        this.f121606a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121606a.f121630p.clearHighlights();
        BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener = this.f121606a.f121634t;
        if (barcodeCountViewInternalUiListener != null) {
            barcodeCountViewInternalUiListener.onClearButtonTapped();
        }
        return Unit.f142422a;
    }
}
