package com.scandit.datacapture.barcode.selection.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeSelection f123743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(BarcodeSelection barcodeSelection) {
        super(0);
        this.f123743a = barcodeSelection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f123743a.getF123744a();
    }
}
