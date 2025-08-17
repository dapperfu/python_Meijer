package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f120347a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        super(0);
        this.f120347a = barcodeArInfoAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f120347a.setRecreateFooter$scandit_barcode_capture(true);
        return Unit.f142422a;
    }
}
