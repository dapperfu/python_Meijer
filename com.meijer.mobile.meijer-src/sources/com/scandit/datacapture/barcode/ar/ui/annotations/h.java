package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f121239a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        super(0);
        this.f121239a = barcodeArInfoAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArInfoAnnotation.access$headerOrFooterTapped(this.f121239a, true);
        return Unit.f143329a;
    }
}
