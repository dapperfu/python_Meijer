package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class G extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeBatchSession f121393a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(BarcodeBatchSession barcodeBatchSession) {
        super(0);
        this.f121393a = barcodeBatchSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeBatchSessionProxyAdapter((NativeBarcodeTrackingSession) this.f121393a.f121381a.invoke(), null, 2, null);
    }
}
