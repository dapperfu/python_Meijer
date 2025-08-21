package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeSelectionSession f124756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(BarcodeSelectionSession barcodeSelectionSession) {
        super(0);
        this.f124756a = barcodeSelectionSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeSelectionSessionProxyAdapter((NativeBarcodeSelectionSession) this.f124756a.f124740a.invoke(), null, 2, null);
    }
}
