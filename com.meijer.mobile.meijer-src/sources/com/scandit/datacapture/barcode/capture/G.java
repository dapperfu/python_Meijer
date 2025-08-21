package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class G extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeCaptureSettings f121505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings) {
        super(0);
        this.f121505a = nativeBarcodeCaptureSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodeCaptureSettings _1 = this.f121505a;
        Intrinsics.i(_1, "$_1");
        return barcodeNativeTypeFactory.convert(_1);
    }
}
