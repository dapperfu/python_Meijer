package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class B extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeFilterOverlaySettings f121710a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings) {
        super(0);
        this.f121710a = nativeBarcodeFilterOverlaySettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodeFilterOverlaySettings _0 = this.f121710a;
        Intrinsics.i(_0, "$_0");
        return barcodeNativeTypeFactory.convert(_0);
    }
}
