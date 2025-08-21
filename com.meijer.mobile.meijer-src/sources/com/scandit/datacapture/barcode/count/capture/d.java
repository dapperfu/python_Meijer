package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InternalBarcodeCountSession f121586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InternalBarcodeCountSession internalBarcodeCountSession) {
        super(0);
        this.f121586a = internalBarcodeCountSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121586a.n();
    }
}
