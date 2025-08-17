package com.scandit.datacapture.barcode.ar.ui;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {
    public d(Object obj) {
        super(0, obj, BarcodeArView.class, "onOverlayTap", "onOverlayTap()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(BarcodeArView.access$onOverlayTap((BarcodeArView) this.receiver));
    }
}
