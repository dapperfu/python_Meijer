package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f120346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        super(0);
        this.f120346a = barcodeArInfoAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f120346a.setRecreateCommon$scandit_barcode_capture(true);
        return Unit.f142422a;
    }
}
