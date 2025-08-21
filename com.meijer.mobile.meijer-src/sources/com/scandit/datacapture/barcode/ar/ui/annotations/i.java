package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f121240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        super(0);
        this.f121240a = barcodeArInfoAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121240a.setRecreateBody$scandit_barcode_capture(true);
        return Unit.f143329a;
    }
}
