package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeSelectionSession f123804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(BarcodeSelectionSession barcodeSelectionSession) {
        super(0);
        this.f123804a = barcodeSelectionSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeSelectionSessionProxyAdapter((NativeBarcodeSelectionSession) this.f123804a.f123788a.invoke(), null, 2, null);
    }
}
