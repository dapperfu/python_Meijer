package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f120286a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        super(0);
        this.f120286a = barcodeArInfoAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArInfoAnnotation.access$headerOrFooterTapped(this.f120286a, false);
        return Unit.f142422a;
    }
}
