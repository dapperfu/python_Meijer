package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InternalBarcodeCountSession f122248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InternalBarcodeCountSession internalBarcodeCountSession) {
        super(0);
        this.f122248a = internalBarcodeCountSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new m((NativeBarcodeCountSession) this.f122248a.f122230a.invoke());
    }
}
