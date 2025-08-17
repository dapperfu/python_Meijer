package com.scandit.datacapture.barcode.internal.module.common;

import com.scandit.datacapture.barcode.data.BarcodeDataTransformer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends NativeBarcodeDataTransformer {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121277a;

    public a(BarcodeDataTransformer transformer) {
        Intrinsics.j(transformer, "transformer");
        this.f121277a = new WeakReference(transformer);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.common.NativeBarcodeDataTransformer
    public final String transformBarcodeData(String transformBarcodeData) {
        Intrinsics.j(transformBarcodeData, "transformBarcodeData");
        BarcodeDataTransformer barcodeDataTransformer = (BarcodeDataTransformer) this.f121277a.get();
        if (barcodeDataTransformer != null) {
            return barcodeDataTransformer.transformBarcodeData(transformBarcodeData);
        }
        return null;
    }
}
