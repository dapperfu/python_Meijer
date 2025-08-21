package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountCaptureListSession f121617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BarcodeCountCaptureListSession barcodeCountCaptureListSession) {
        super(0);
        this.f121617a = barcodeCountCaptureListSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeCountCaptureListSessionProxyAdapter((NativeBarcodeCountCaptureListSession) this.f121617a.f121603a.invoke(), null, 2, null);
    }
}
