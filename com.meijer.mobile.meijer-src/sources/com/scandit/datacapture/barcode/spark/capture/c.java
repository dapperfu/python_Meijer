package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeSymbologySettings f124843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NativeSymbologySettings nativeSymbologySettings) {
        super(0);
        this.f124843a = nativeSymbologySettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeSymbologySettings _0 = this.f124843a;
        Intrinsics.i(_0, "$_0");
        return barcodeNativeTypeFactory.convert(_0);
    }
}
