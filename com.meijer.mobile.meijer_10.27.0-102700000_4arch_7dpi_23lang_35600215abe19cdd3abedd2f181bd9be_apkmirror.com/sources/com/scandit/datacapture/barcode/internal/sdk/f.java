package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.internal.module.ar.capture.BarcodeArInternal;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeAr f123550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NativeBarcodeAr nativeBarcodeAr) {
        super(0);
        this.f123550a = nativeBarcodeAr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeArInternal(this.f123550a);
    }
}
