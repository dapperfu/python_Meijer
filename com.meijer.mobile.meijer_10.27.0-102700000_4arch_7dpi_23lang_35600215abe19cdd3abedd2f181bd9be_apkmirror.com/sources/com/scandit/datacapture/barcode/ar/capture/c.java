package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArSession f120104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarcodeArSession barcodeArSession) {
        super(0);
        this.f120104a = barcodeArSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeArSessionProxyAdapter((NativeBarcodeArSession) this.f120104a.f120095a.invoke(), null, 2, null);
    }
}
