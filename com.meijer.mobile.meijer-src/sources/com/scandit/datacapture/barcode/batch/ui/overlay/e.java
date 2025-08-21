package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeTrackedBarcode f121459a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NativeTrackedBarcode nativeTrackedBarcode) {
        super(0);
        this.f121459a = nativeTrackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BarcodeNativeTypeFactory.INSTANCE.convert(this.f121459a);
    }
}
