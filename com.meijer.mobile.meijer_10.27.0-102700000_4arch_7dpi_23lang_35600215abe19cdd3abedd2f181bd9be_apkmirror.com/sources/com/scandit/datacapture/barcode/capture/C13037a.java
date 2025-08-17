package com.scandit.datacapture.barcode.capture;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13037a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCapture f120570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13037a(BarcodeCapture barcodeCapture) {
        super(1);
        this.f120570a = barcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        BarcodeCapture barcodeCapture = this.f120570a;
        BarcodeCapture.access$applyBatterySavingMode(barcodeCapture, barcodeCapture.f120514c, zBooleanValue);
        return Unit.f142422a;
    }
}
