package com.scandit.datacapture.barcode.selection.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class E extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeSelection f124755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(BarcodeSelection barcodeSelection) {
        super(0);
        this.f124755a = barcodeSelection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f124755a.getF124696a();
    }
}
