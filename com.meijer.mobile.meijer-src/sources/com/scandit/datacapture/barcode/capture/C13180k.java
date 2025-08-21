package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13180k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeCapture f121532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13180k(NativeBarcodeCapture nativeBarcodeCapture) {
        super(0);
        this.f121532a = nativeBarcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BarcodeNativeTypeFactory.INSTANCE.convert(this.f121532a);
    }
}
