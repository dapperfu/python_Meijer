package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickSession f124544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BarcodePickSession barcodePickSession) {
        super(0);
        this.f124544a = barcodePickSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodePickSessionProxyAdapter((NativeBarcodePickPublicSession) this.f124544a.f124530a.invoke(), null, 2, null);
    }
}
