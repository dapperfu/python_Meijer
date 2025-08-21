package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InternalBarcodeCountSession f121585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InternalBarcodeCountSession internalBarcodeCountSession) {
        super(0);
        this.f121585a = internalBarcodeCountSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121585a.m();
        return Unit.f143329a;
    }
}
