package com.scandit.datacapture.barcode.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class J extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCapture f120556a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(BarcodeCapture barcodeCapture) {
        super(0);
        this.f120556a = barcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f120556a;
    }
}
