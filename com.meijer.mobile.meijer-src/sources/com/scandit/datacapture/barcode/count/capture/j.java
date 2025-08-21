package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeFilterSettings f121592a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(NativeBarcodeFilterSettings nativeBarcodeFilterSettings) {
        super(0);
        this.f121592a = nativeBarcodeFilterSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodeFilterSettings _0 = this.f121592a;
        Intrinsics.i(_0, "$_0");
        return barcodeNativeTypeFactory.convert(_0);
    }
}
