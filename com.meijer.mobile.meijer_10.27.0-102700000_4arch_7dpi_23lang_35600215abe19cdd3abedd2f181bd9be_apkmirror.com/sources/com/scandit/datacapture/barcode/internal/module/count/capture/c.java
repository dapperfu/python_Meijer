package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCount f121285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarcodeCount barcodeCount) {
        super(0);
        this.f121285a = barcodeCount;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121285a;
    }
}
