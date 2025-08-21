package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.internal.module.ar.capture.BarcodeArInternal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInternal f121054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BarcodeArInternal barcodeArInternal) {
        super(0);
        this.f121054a = barcodeArInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121054a.b();
    }
}
