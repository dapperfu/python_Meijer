package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickInternal f124542a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodePickInternal barcodePickInternal) {
        super(0);
        this.f124542a = barcodePickInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f124542a.b();
    }
}
