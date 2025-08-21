package com.scandit.datacapture.barcode.count.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCount f121584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BarcodeCount barcodeCount) {
        super(0);
        this.f121584a = barcodeCount;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121584a.getF121563a();
    }
}
