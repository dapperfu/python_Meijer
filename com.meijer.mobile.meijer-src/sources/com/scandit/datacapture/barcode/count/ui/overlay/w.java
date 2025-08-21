package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeTrackedBarcode f121755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(NativeTrackedBarcode nativeTrackedBarcode) {
        super(0);
        this.f121755a = nativeTrackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BarcodeNativeTypeFactory.INSTANCE.convert(this.f121755a);
    }
}
