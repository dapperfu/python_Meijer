package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArPopoverAnnotation f121322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(BarcodeArPopoverAnnotation barcodeArPopoverAnnotation) {
        super(0);
        this.f121322a = barcodeArPopoverAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121322a.f121214h = true;
        return Unit.f143329a;
    }
}
