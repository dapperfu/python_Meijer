package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13176g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeCapture f121528a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13176g(NativeBarcodeCapture nativeBarcodeCapture) {
        super(0);
        this.f121528a = nativeBarcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BarcodeNativeTypeFactory.INSTANCE.convert(this.f121528a);
    }
}
